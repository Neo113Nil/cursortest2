package com.baidu.mapsdkplatform.comapi.map.z;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.baidu.mapapi.map.BM3DModelOptions;
import com.baidu.mapapi.map.track.TraceAnimationListener;
import com.baidu.mapapi.map.track.TraceOptions;
import com.baidu.mapapi.map.track.TraceOverlay;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.platform.comapi.UIMsg;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.map.MapSurfaceView;
import com.baidu.platform.comapi.map.MapTextureView;
import com.baidu.platform.comapi.map.a0;
import com.baidu.platform.comapi.map.b0;
import com.baidu.platform.comapi.map.r;
import com.baidu.platform.comapi.util.i;
import com.baidu.platform.comapi.util.j;
import com.baidu.platform.comjni.engine.MessageProxy;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.map.z.a f8200a;

    /* renamed from: b, reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.map.b f8201b;

    /* renamed from: c, reason: collision with root package name */
    private int f8202c;

    /* renamed from: d, reason: collision with root package name */
    private TraceAnimationListener f8203d;

    /* renamed from: f, reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.map.z.b f8205f;

    /* renamed from: g, reason: collision with root package name */
    private MapSurfaceView f8206g;

    /* renamed from: h, reason: collision with root package name */
    private MapTextureView f8207h;

    /* renamed from: e, reason: collision with root package name */
    private e f8204e = new e();

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f8208i = false;

    class a implements com.baidu.mapsdkplatform.comapi.map.z.b {
        a() {
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.z.b
        public void a(TraceOverlay traceOverlay) {
            c.this.e(traceOverlay);
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.z.b
        public void b(TraceOverlay traceOverlay) {
            c.this.c(traceOverlay);
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.z.b
        public void c(TraceOverlay traceOverlay) {
            c.this.a();
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TraceOverlay f8210a;

        b(TraceOverlay traceOverlay) {
            this.f8210a = traceOverlay;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f8200a == null || c.this.f8201b == null) {
                return;
            }
            c.this.d(this.f8210a);
            c.this.f8200a.a();
        }
    }

    /* renamed from: com.baidu.mapsdkplatform.comapi.map.z.c$c, reason: collision with other inner class name */
    class RunnableC0079c implements Runnable {
        RunnableC0079c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f8200a.a();
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TraceOverlay f8213a;

        d(TraceOverlay traceOverlay) {
            this.f8213a = traceOverlay;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d(this.f8213a);
            c.this.f8200a.a();
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class e extends i {
        e() {
            super(Looper.getMainLooper());
        }

        @Override // com.baidu.platform.comapi.util.i
        public void a(Message message) {
            int i8 = message.what;
            if (i8 != 65302) {
                if (i8 != 65303 || c.this.f8203d == null) {
                    return;
                }
                c.this.f8203d.onTraceUpdatePosition(CoordUtil.mc2ll(new GeoPoint(message.arg2 / 100.0f, message.arg1 / 100.0f)));
                return;
            }
            int i9 = message.arg1;
            if (i9 > 0 && i9 <= 1000 && c.this.f8203d != null) {
                c.this.f8203d.onTraceAnimationUpdate(message.arg1 / 10.0f);
            }
            if (message.arg2 != 1 || c.this.f8203d == null) {
                return;
            }
            c.this.f8203d.onTraceAnimationFinish();
        }
    }

    public c(MapSurfaceView mapSurfaceView) {
        this.f8202c = 1;
        if (mapSurfaceView == null) {
            return;
        }
        this.f8200a = new com.baidu.mapsdkplatform.comapi.map.z.a();
        this.f8206g = mapSurfaceView;
        this.f8201b = mapSurfaceView.getBaseMap();
        mapSurfaceView.addOverlay(this.f8200a);
        this.f8200a.SetOverlayShow(true);
        this.f8202c = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(TraceOverlay traceOverlay) {
        if (traceOverlay == null || this.f8200a == null) {
            return;
        }
        if (!traceOverlay.isStatusChanged()) {
            this.f8200a.clear();
            j.a().execute(new d(traceOverlay));
        } else {
            this.f8200a.a(traceOverlay.isOnPause());
            this.f8200a.c(true);
            j.a().execute(new RunnableC0079c());
        }
    }

    public void a(TraceAnimationListener traceAnimationListener) {
        this.f8203d = traceAnimationListener;
    }

    public com.baidu.mapsdkplatform.comapi.map.z.a b() {
        return this.f8200a;
    }

    public boolean d() {
        return this.f8208i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(TraceOverlay traceOverlay) {
        if (this.f8200a == null || traceOverlay == null) {
            return;
        }
        boolean isAnimate = traceOverlay.isAnimate();
        this.f8200a.a(isAnimate, traceOverlay.getAnimationTime(), traceOverlay.getAnimationDuration(), traceOverlay.getAnimationType());
        this.f8200a.b(traceOverlay.isRotateWhenTrack());
        r rVar = new r(new a0().a(-15794282).b(14));
        rVar.a(b(traceOverlay));
        if (traceOverlay.isUseColorArray()) {
            rVar.a(traceOverlay.isUseColorArray());
            int[] a8 = a(traceOverlay);
            for (int i8 = 0; i8 < a8.length; i8++) {
                int i9 = a8[i8];
                a8[i8] = ((i9 >> 16) & 255) | ((-16777216) & i9) | ((i9 & 255) << 16) | (65280 & i9);
            }
            rVar.a(a8);
        }
        rVar.a(new b0().d(-1).a(traceOverlay.getColor()).b(traceOverlay.getWidth()));
        rVar.f9723c = traceOverlay.isTrackMove();
        rVar.f9724d = traceOverlay.isPointMove();
        rVar.f9725e = !traceOverlay.isDataReduction();
        rVar.f9726f = !traceOverlay.isDataSmooth();
        rVar.f9730j = traceOverlay.isTrackBloom();
        rVar.f9731k = traceOverlay.getBloomSpeed();
        rVar.a(isAnimate, traceOverlay.getAnimationTime(), traceOverlay.getAnimationType());
        if (traceOverlay.getIcon() != null) {
            rVar.f9728h = false;
            this.f8200a.setParam(a(traceOverlay.getIcon().getBitmap()));
        }
        BM3DModelOptions icon3D = traceOverlay.getIcon3D();
        if (icon3D != null) {
            rVar.f9728h = true;
            this.f8200a.setParam(a(icon3D));
        }
        this.f8200a.a(rVar);
    }

    public void c() {
        this.f8205f = new a();
        MessageProxy.registerMessageHandler(UIMsg.MsgDefine.V_WM_TRACK_MOVE_PROGRESS, this.f8204e);
        MessageProxy.registerMessageHandler(UIMsg.MsgDefine.V_WM_TRACK_MOVE_POSITION, this.f8204e);
    }

    private List<GeoPoint> b(TraceOverlay traceOverlay) {
        if (traceOverlay == null || traceOverlay.getPoints() == null) {
            return null;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : traceOverlay.getPoints()) {
            arrayList.add(CoordUtil.ll2mc(latLng));
            builder.include(latLng);
        }
        return arrayList;
    }

    public TraceOverlay a(TraceOptions traceOptions) {
        if (traceOptions == null) {
            return null;
        }
        TraceOverlay overlay = traceOptions.getOverlay();
        overlay.mListener = this.f8205f;
        j.a().execute(new b(overlay));
        return overlay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(TraceOverlay traceOverlay) {
        if (traceOverlay != null && this.f8200a != null) {
            e();
        }
        return false;
    }

    public c(MapTextureView mapTextureView) {
        this.f8202c = 1;
        if (mapTextureView == null) {
            return;
        }
        this.f8200a = new com.baidu.mapsdkplatform.comapi.map.z.a();
        this.f8207h = mapTextureView;
        this.f8201b = mapTextureView.getBaseMap();
        mapTextureView.addOverlay(this.f8200a);
        this.f8200a.SetOverlayShow(true);
        this.f8202c = 2;
    }

    public void a() {
        com.baidu.mapsdkplatform.comapi.map.z.a aVar = this.f8200a;
        if (aVar == null) {
            return;
        }
        aVar.clear();
        this.f8200a.a();
    }

    public void e() {
        MapTextureView mapTextureView;
        MapSurfaceView mapSurfaceView;
        MessageProxy.unRegisterMessageHandler(UIMsg.MsgDefine.V_WM_TRACK_MOVE_PROGRESS, this.f8204e);
        MessageProxy.unRegisterMessageHandler(UIMsg.MsgDefine.V_WM_TRACK_MOVE_POSITION, this.f8204e);
        int i8 = this.f8202c;
        if (i8 == 1 && (mapSurfaceView = this.f8206g) != null) {
            mapSurfaceView.removeOverlay(this.f8200a);
        } else if (i8 == 2 && (mapTextureView = this.f8207h) != null) {
            mapTextureView.removeOverlay(this.f8200a);
        }
        if (this.f8203d != null) {
            this.f8203d = null;
        }
        this.f8208i = true;
    }

    private int[] a(TraceOverlay traceOverlay) {
        if (traceOverlay == null || traceOverlay.getColors() == null) {
            return null;
        }
        return traceOverlay.getColors();
    }

    private Bundle a(Bitmap bitmap) {
        MessageDigest messageDigest = null;
        if (bitmap == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("image_width", bitmap.getWidth());
        bundle.putInt("image_height", bitmap.getHeight());
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        bundle.putByteArray("image_data", array);
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e8) {
            e8.printStackTrace();
        }
        if (messageDigest != null) {
            messageDigest.update(array, 0, array.length);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder("");
            for (byte b8 : digest) {
                sb.append(Integer.toString((b8 & 255) + 256, 16).substring(1));
            }
            bundle.putString("image_hashcode", sb.toString());
        }
        return bundle;
    }

    private Bundle a(BM3DModelOptions bM3DModelOptions) {
        if (bM3DModelOptions == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("icon_3D", 1);
        bundle.putInt("modelType", bM3DModelOptions.getBM3DModelType().ordinal());
        bundle.putString("modelPath", bM3DModelOptions.getModelPath());
        bundle.putString("modelName", bM3DModelOptions.getModelName());
        bundle.putFloat("scale", bM3DModelOptions.getScale());
        bundle.putBoolean("zoomFixed", bM3DModelOptions.isZoomFixed());
        bundle.putInt("yawAxis", bM3DModelOptions.getYawAxis());
        bundle.putFloat("rotateX", bM3DModelOptions.getRotateX());
        bundle.putFloat("rotateY", bM3DModelOptions.getRotateY());
        bundle.putFloat("rotateZ", bM3DModelOptions.getRotateZ());
        bundle.putFloat("offsetX", bM3DModelOptions.getOffsetX());
        bundle.putFloat("offsetY", bM3DModelOptions.getOffsetY());
        bundle.putFloat("offsetZ", bM3DModelOptions.getOffsetZ());
        if (bM3DModelOptions.isSkeletonAnimationEnable()) {
            bundle.putInt("animationIndex", bM3DModelOptions.getAnimationIndex());
            bundle.putBoolean("animationIsEnable", bM3DModelOptions.isSkeletonAnimationEnable());
            bundle.putInt("animationRepeatCount", bM3DModelOptions.getAnimationRepeatCount());
            bundle.putFloat("animationSpeed", bM3DModelOptions.getAnimationSpeed());
        }
        return bundle;
    }
}
