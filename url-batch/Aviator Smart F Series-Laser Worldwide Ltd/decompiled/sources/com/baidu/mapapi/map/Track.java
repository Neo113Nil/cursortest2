package com.baidu.mapapi.map;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.arthenica.ffmpegkit.x;
import com.baidu.mapapi.map.track.TraceAnimationListener;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.UIMsg;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmGeoElement;
import com.baidu.platform.comapi.bmsdk.BmLayer;
import com.baidu.platform.comapi.bmsdk.BmTrack;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;
import com.baidu.platform.comapi.bmsdk.animation.BmTrackAnimation;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.baidu.platform.comapi.bmsdk.style.BmTrackStyle;
import com.baidu.platform.comapi.util.i;
import com.baidu.platform.comjni.engine.MessageProxy;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class Track extends Overlay {
    TraceAnimationListener C;
    private c D;

    /* renamed from: g, reason: collision with root package name */
    private BmTrack f6405g;

    /* renamed from: h, reason: collision with root package name */
    private BmGeoElement f6406h;

    /* renamed from: i, reason: collision with root package name */
    private BmTrackStyle f6407i;

    /* renamed from: m, reason: collision with root package name */
    List<Integer> f6411m;

    /* renamed from: n, reason: collision with root package name */
    List<LatLng> f6412n;

    /* renamed from: o, reason: collision with root package name */
    int[] f6413o;

    /* renamed from: p, reason: collision with root package name */
    int[] f6414p;

    /* renamed from: q, reason: collision with root package name */
    int f6415q;

    /* renamed from: z, reason: collision with root package name */
    private boolean f6424z;

    /* renamed from: j, reason: collision with root package name */
    private BmTrackAnimation.a f6408j = new a();

    /* renamed from: k, reason: collision with root package name */
    private BmAnimation.a f6409k = new b();

    /* renamed from: l, reason: collision with root package name */
    BmTrackAnimation f6410l = new BmTrackAnimation();

    /* renamed from: r, reason: collision with root package name */
    int f6416r = 300;

    /* renamed from: s, reason: collision with root package name */
    int f6417s = 0;

    /* renamed from: t, reason: collision with root package name */
    float f6418t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    int f6419u = 5;

    /* renamed from: v, reason: collision with root package name */
    int f6420v = -1426128896;

    /* renamed from: w, reason: collision with root package name */
    float f6421w = 0.0f;

    /* renamed from: x, reason: collision with root package name */
    float f6422x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    boolean f6423y = false;
    BitmapDescriptor A = null;
    BitmapDescriptor B = null;

    class a implements BmTrackAnimation.a {
        a() {
        }

        @Override // com.baidu.platform.comapi.bmsdk.animation.BmTrackAnimation.a
        public void a(com.baidu.platform.comapi.bmsdk.b bVar, float f8, float f9) {
            if (Track.this.C != null) {
                Track.this.C.onTraceUpdatePosition(CoordUtil.mc2ll(new GeoPoint(bVar.f8939b, bVar.f8938a)));
                Track.this.C.onTraceAnimationUpdate((float) (Math.round(f9 * 1000.0d) / 10.0d));
            }
        }
    }

    class b implements BmAnimation.a {
        b() {
        }

        @Override // com.baidu.platform.comapi.bmsdk.animation.BmAnimation.a
        public void a(BmAnimation bmAnimation) {
            TraceAnimationListener traceAnimationListener = Track.this.C;
            if (traceAnimationListener != null) {
                traceAnimationListener.onTraceAnimationFinish();
            }
        }

        @Override // com.baidu.platform.comapi.bmsdk.animation.BmAnimation.a
        public void b(BmAnimation bmAnimation) {
        }

        @Override // com.baidu.platform.comapi.bmsdk.animation.BmAnimation.a
        public void c(BmAnimation bmAnimation) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class c extends i {
        c() {
            super(Looper.getMainLooper());
        }

        @Override // com.baidu.platform.comapi.util.i
        public void a(Message message) {
            TraceAnimationListener traceAnimationListener;
            int i8 = message.what;
            if (i8 != 65302) {
                if (i8 != 65303 || Track.this.C == null) {
                    return;
                }
                Track.this.C.onTraceUpdatePosition(CoordUtil.mc2ll(new GeoPoint(message.arg2 / 100.0f, message.arg1 / 100.0f)));
                return;
            }
            int i9 = message.arg1;
            if (i9 >= 0 && i9 <= 1000) {
                Track track = Track.this;
                float f8 = i9;
                track.f6418t = f8 / 1000.0f;
                TraceAnimationListener traceAnimationListener2 = track.C;
                if (traceAnimationListener2 != null) {
                    traceAnimationListener2.onTraceAnimationUpdate(f8 / 10.0f);
                }
            }
            if (message.arg2 != 1 || (traceAnimationListener = Track.this.C) == null) {
                return;
            }
            traceAnimationListener.onTraceAnimationFinish();
        }
    }

    Track() {
        c cVar = new c();
        this.D = cVar;
        this.type = com.baidu.mapsdkplatform.comapi.map.d.track;
        MessageProxy.registerMessageHandler(UIMsg.MsgDefine.V_WM_TRACK_MOVE_PROGRESS, cVar);
        MessageProxy.registerMessageHandler(UIMsg.MsgDefine.V_WM_TRACK_MOVE_POSITION, this.D);
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        int i8;
        super.a(bundle);
        List<LatLng> list = this.f6412n;
        if (list == null || list.size() < 2) {
            throw new IllegalStateException("BDMapSDKException: when you add Track, you must at least supply 2 points");
        }
        Bundle bundle2 = new Bundle();
        BitmapDescriptor bitmapDescriptor = this.A;
        if (bitmapDescriptor != null) {
            bundle2.putBundle(String.format("texture_%d", 0), bitmapDescriptor.a());
            i8 = 1;
        } else {
            i8 = 0;
        }
        BitmapDescriptor bitmapDescriptor2 = this.B;
        if (bitmapDescriptor2 != null) {
            bundle2.putBundle(String.format("texture_%d", 1), bitmapDescriptor2.a());
            i8++;
        }
        bundle2.putInt(FileDownloadModel.TOTAL, i8);
        bundle.putBundle("image_info_list", bundle2);
        bundle.putFloat("opacity", this.f6421w);
        bundle.putFloat("paletteOpacity", this.f6422x);
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f6412n.get(0));
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        bundle.putInt("track_type", this.f6415q);
        bundle.putFloat("animation_start_value", this.f6418t);
        bundle.putBoolean("onPause", this.f6423y);
        bundle.putInt(x.KEY_WIDTH, this.f6419u);
        Overlay.c(this.f6412n, bundle);
        if (this.f6415q == 1) {
            bundle.putIntArray("color_array", this.f6414p);
        }
        bundle.putIntArray("height_array", this.f6413o);
        bundle.putInt("animation_time", this.f6416r);
        bundle.putInt("animation_type", this.f6417s);
        return bundle;
    }

    public void addTraceAnimationListener(TraceAnimationListener traceAnimationListener) {
        this.C = traceAnimationListener;
    }

    public void pause() {
        this.f6423y = true;
        this.listener.d(this);
        this.f6410l.pause();
        BmLayer bmLayer = this.f6122f;
        if (bmLayer != null) {
            bmLayer.b();
        }
    }

    public void resume() {
        if (this.f6423y) {
            this.f6423y = false;
            this.listener.d(this);
            this.f6410l.resume();
            BmLayer bmLayer = this.f6122f;
            if (bmLayer != null) {
                bmLayer.b();
            }
        }
    }

    public void setAnimationListener(BmAnimation.a aVar) {
        this.f6409k = aVar;
    }

    public void setTrackMove(boolean z7) {
        this.f6424z = z7;
    }

    @Override // com.baidu.mapapi.map.Overlay
    BmDrawItem toDrawItem() {
        BmTrack bmTrack = new BmTrack();
        this.f6405g = bmTrack;
        bmTrack.a(this);
        setDrawItem(this.f6405g);
        super.toDrawItem();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < this.f6412n.size(); i8++) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f6412n.get(i8));
            arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6(), this.f6413o[i8]));
        }
        BmGeoElement bmGeoElement = new BmGeoElement(0);
        this.f6406h = bmGeoElement;
        bmGeoElement.b(arrayList);
        BmTrackStyle bmTrackStyle = new BmTrackStyle();
        this.f6407i = bmTrackStyle;
        bmTrackStyle.b(this.f6415q);
        if (this.f6415q == 6) {
            this.f6406h.a(1, this.f6411m);
        }
        this.f6407i.c(this.f6419u);
        this.f6407i.a(this.f6420v);
        if (this.B != null) {
            this.f6407i.a(new BmBitmapResource(this.B.getBitmap()));
        }
        this.f6407i.a(this.f6421w);
        this.f6407i.b(this.f6422x);
        if (this.A != null) {
            this.f6407i.b(new BmBitmapResource(this.A.getBitmap()));
        }
        this.f6406h.a(this.f6407i);
        this.f6405g.a(this.f6406h);
        this.f6410l.setTrackPosRadio(0.0f, 1.0f);
        this.f6410l.setDuration(this.f6416r);
        this.f6410l.setStartDelay(0L);
        this.f6410l.setRepeatCount(0);
        this.f6410l.setRepeatMode(1);
        this.f6410l.setTrackUpdateListener(this.f6408j);
        this.f6410l.setAnimationListener(this.f6409k);
        this.f6410l.start();
        this.f6410l.setSdkTrack(this.f6405g);
        this.f6405g.a(this.f6410l);
        this.f6405g.c(this.f6424z);
        return this.f6405g;
    }

    public void updateTrackZIndex(int i8) {
        BmLayer bmLayer;
        this.f6119c = i8;
        BmTrack bmTrack = this.f6405g;
        if (bmTrack == null || (bmLayer = this.f6122f) == null || bmLayer.a(bmTrack.getName()) == null) {
            return;
        }
        this.f6122f.a((BmDrawItem) this.f6405g, (short) i8);
        this.f6122f.b();
    }
}
