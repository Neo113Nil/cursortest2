package com.baidu.mapapi.map;

import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.location.BDLocation;
import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.map.InfoWindow;
import com.baidu.mapapi.map.bmsdk.ui.RichView;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmIconMarker;
import com.baidu.platform.comapi.bmsdk.BmLayer;
import com.baidu.platform.comapi.bmsdk.BmTextMarker;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.baidu.platform.comapi.bmsdk.style.BmFrameResource;
import com.baidu.platform.comapi.bmsdk.style.BmTextStyle;
import com.baidu.platform.comapi.bmsdk.ui.BmLabelUI;
import com.baidu.platform.comapi.bmsdk.ui.BmRichView;
import com.baidu.platform.comjni.tools.ParcelItem;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Marker extends Overlay {
    int E;
    ArrayList<BitmapDescriptor> G;
    BmFrameResource H;
    int I;
    Animation K;
    Point O;
    InfoWindow P;
    InfoWindow.a Q;
    InfoWindowAdapter X;

    /* renamed from: g, reason: collision with root package name */
    LatLng f6024g;

    /* renamed from: h, reason: collision with root package name */
    BitmapDescriptor f6025h;

    /* renamed from: i, reason: collision with root package name */
    BmBitmapResource f6026i;

    /* renamed from: j, reason: collision with root package name */
    BmIconMarker f6027j;

    /* renamed from: k, reason: collision with root package name */
    int f6028k;

    /* renamed from: l, reason: collision with root package name */
    float f6029l;

    /* renamed from: m, reason: collision with root package name */
    float f6030m;

    /* renamed from: n, reason: collision with root package name */
    boolean f6031n;

    /* renamed from: o, reason: collision with root package name */
    boolean f6032o;

    /* renamed from: p, reason: collision with root package name */
    float f6033p;

    /* renamed from: q, reason: collision with root package name */
    String f6034q;

    /* renamed from: r, reason: collision with root package name */
    TitleOptions f6035r;

    /* renamed from: s, reason: collision with root package name */
    BmTextMarker f6036s;

    /* renamed from: t, reason: collision with root package name */
    int f6037t;

    /* renamed from: u, reason: collision with root package name */
    int f6038u;

    /* renamed from: x, reason: collision with root package name */
    float f6041x;

    /* renamed from: y, reason: collision with root package name */
    int f6042y;

    /* renamed from: v, reason: collision with root package name */
    boolean f6039v = false;

    /* renamed from: w, reason: collision with root package name */
    boolean f6040w = false;

    /* renamed from: z, reason: collision with root package name */
    boolean f6043z = false;
    boolean A = true;
    boolean B = false;
    boolean C = false;
    boolean D = false;
    int F = BDLocation.TypeCoarseLocation;
    int J = 20;
    float L = 1.0f;
    float M = 1.0f;
    float N = 1.0f;
    boolean R = false;
    int S = Integer.MAX_VALUE;
    int T = 0;
    int U = 4;
    int V = 22;
    int W = 0;

    Marker() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.marker;
    }

    private void a(InfoWindow infoWindow, InfoWindow infoWindow2) {
        infoWindow.f5908b = infoWindow2.getBitmapDescriptor();
        infoWindow.f5910d = infoWindow2.getPosition();
        infoWindow.f5907a = infoWindow2.getTag();
        infoWindow.f5909c = infoWindow2.getView();
        infoWindow.f5916j = infoWindow2.getYOffset();
        infoWindow.f5920n = infoWindow2.f5920n;
        infoWindow.f5914h = infoWindow2.f5914h;
    }

    public void addRichView(RichView richView) {
        BmIconMarker bmIconMarker;
        if (richView == null || !OverlayUtil.isOverlayUpgrade() || (bmIconMarker = this.f6027j) == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.a(richView.getBmRichView());
        this.f6122f.b();
    }

    public void cancelAnimation() {
        if (this.K != null) {
            if (!OverlayUtil.isOverlayUpgrade()) {
                this.K.bdAnimation.a();
            } else {
                this.K.bmAnimation.cancel();
                this.f6122f.b();
            }
        }
    }

    public void clearRichViews() {
        BmIconMarker bmIconMarker;
        if (!OverlayUtil.isOverlayUpgrade() || (bmIconMarker = this.f6027j) == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.c();
        this.f6122f.b();
    }

    public float getAlpha() {
        return this.f6041x;
    }

    public float getAnchorX() {
        return this.f6029l;
    }

    public float getAnchorY() {
        return this.f6030m;
    }

    public int getEndLevel() {
        return this.V;
    }

    public Point getFixedPosition() {
        return this.O;
    }

    public Point getFixedScreenPosition() {
        return this.O;
    }

    public BitmapDescriptor getIcon() {
        return this.f6025h;
    }

    public ArrayList<BitmapDescriptor> getIcons() {
        return this.G;
    }

    public String getId() {
        return this.f6117a;
    }

    public InfoWindow getInfoWindow() {
        return this.P;
    }

    @Deprecated
    public int getPeriod() {
        if (OverlayUtil.isOverlayUpgrade()) {
            return 0;
        }
        return this.J;
    }

    public LatLng getPosition() {
        return this.f6024g;
    }

    public int getPriority() {
        return this.S;
    }

    public float getRotate() {
        return this.f6033p;
    }

    public float getScale() {
        return this.N;
    }

    public float getScaleX() {
        return this.L;
    }

    public float getScaleY() {
        return this.M;
    }

    public int getStartLevel() {
        return this.U;
    }

    public String getTitle() {
        return this.f6034q;
    }

    public TitleOptions getTitleOptions() {
        return this.f6035r;
    }

    public int getXOffset() {
        return this.f6038u;
    }

    public int getYOffset() {
        return this.f6037t;
    }

    public void hideInfoWindow() {
        InfoWindow.a aVar = this.Q;
        if (aVar != null) {
            aVar.a(this.P);
            this.R = false;
        }
        this.P = null;
    }

    public boolean isClickable() {
        return this.A;
    }

    public boolean isDraggable() {
        return this.f6032o;
    }

    public boolean isFixed() {
        return this.f6043z;
    }

    public boolean isFlat() {
        return this.f6039v;
    }

    public boolean isForceDisplay() {
        return this.D;
    }

    public boolean isInfoWindowEnabled() {
        return this.R;
    }

    public boolean isJoinCollision() {
        return this.B;
    }

    public boolean isPerspective() {
        return this.f6031n;
    }

    public boolean isPoiCollided() {
        return this.C;
    }

    public void pauseAnimation() {
        if (this.K == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.K.bmAnimation.pause();
        this.f6122f.b();
    }

    public void poiCollided(boolean z7) {
        this.C = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (z7) {
            this.T |= CollisionBehavior.COLLIDE_WITH_BASEPOI.getNumber();
        } else {
            this.T = (~CollisionBehavior.COLLIDE_WITH_BASEPOI.getNumber()) & this.T;
        }
        this.f6027j.e(this.T);
        this.f6122f.b();
    }

    public void removeRichView(RichView richView) {
        BmIconMarker bmIconMarker;
        if (richView == null || !OverlayUtil.isOverlayUpgrade() || (bmIconMarker = this.f6027j) == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.b(richView.getBmRichView());
        this.f6122f.b();
    }

    public void resumeAnimation() {
        if (this.K == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.K.bmAnimation.resume();
        this.f6122f.b();
    }

    public void setAlpha(float f8) {
        if (f8 < 0.0f || f8 > 1.0d) {
            this.f6041x = 1.0f;
            return;
        }
        this.f6041x = f8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.a(this.f6041x);
        this.f6122f.b();
    }

    public void setAnchor(float f8, float f9) {
        if (f8 < 0.0f || f8 > 1.0f || f9 < 0.0f || f9 > 1.0f) {
            return;
        }
        this.f6029l = f8;
        this.f6030m = f9;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.b(f8);
        this.f6027j.c(f9);
        BmTextMarker bmTextMarker = this.f6036s;
        if (bmTextMarker != null) {
            bmTextMarker.b(f8);
            this.f6036s.c(f9);
        }
        this.f6122f.b();
    }

    public void setAnimateType(int i8) {
        this.f6042y = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.o(i8);
        this.f6122f.b();
    }

    public void setAnimation(Animation animation) {
        if (animation == null) {
            return;
        }
        this.K = animation;
        if (!OverlayUtil.isOverlayUpgrade()) {
            com.baidu.mapsdkplatform.comapi.e.b bVar = this.K.bdAnimation;
            if (bVar != null) {
                bVar.a(this, animation);
                return;
            }
            return;
        }
        BmAnimation bmAnimation = this.K.bmAnimation;
        if (bmAnimation != null) {
            this.f6027j.a(bmAnimation);
            this.f6122f.b();
        }
    }

    public void setBmBitmapResource(BmBitmapResource bmBitmapResource) {
        BmIconMarker bmIconMarker;
        if (bmBitmapResource == null) {
            throw new IllegalArgumentException("BDMapSDKException: marker's icon can not be null");
        }
        this.f6026i = bmBitmapResource;
        if (!OverlayUtil.isOverlayUpgrade() || (bmIconMarker = this.f6027j) == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.a(this.f6026i);
        this.f6122f.b();
    }

    public void setClickable(boolean z7) {
        this.A = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.a(z7);
        this.f6122f.b();
    }

    public void setDraggable(boolean z7) {
        this.f6032o = z7;
        if (OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.listener.d(this);
    }

    public void setEndLevel(int i8) {
        this.V = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.a(i8);
        this.f6122f.b();
    }

    public void setFixedScreenPosition(Point point) {
        if (point == null) {
            throw new IllegalArgumentException("BDMapSDKException: the screenPosition can not be null");
        }
        this.O = point;
        this.f6043z = true;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.j(this.f6043z ? 1 : 0);
        this.f6027j.g(this.O.x);
        this.f6027j.h(this.O.y);
        this.f6122f.b();
    }

    public void setFlat(boolean z7) {
        this.f6039v = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        if (z7) {
            bmIconMarker.i(3);
        } else {
            bmIconMarker.i(0);
        }
        this.f6122f.b();
    }

    public void setForceDisplay(boolean z7) {
        this.D = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (z7) {
            this.T |= CollisionBehavior.ALWAYS_SHOW.getNumber();
        } else {
            this.T = (~CollisionBehavior.ALWAYS_SHOW.getNumber()) & this.T;
        }
        this.f6027j.e(this.T);
        this.f6122f.b();
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new IllegalArgumentException("BDMapSDKException: marker's icon can not be null");
        }
        this.f6025h = bitmapDescriptor;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.a(new BmBitmapResource(this.f6025h.getBitmap()));
        this.f6122f.b();
    }

    public void setIcons(ArrayList<BitmapDescriptor> arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException("BDMapSDKException: marker's icons can not be null");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            this.f6025h = arrayList.get(0);
        } else {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                if (arrayList.get(i8) == null || arrayList.get(i8).f5702a == null) {
                    return;
                }
            }
            this.G = (ArrayList) arrayList.clone();
            this.f6025h = null;
        }
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        if (this.G != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<BitmapDescriptor> it = this.G.iterator();
            while (it.hasNext()) {
                arrayList2.add(new BmBitmapResource(it.next().getBitmap()));
            }
            BmFrameResource bmFrameResource = new BmFrameResource(arrayList2, this.F, Integer.MAX_VALUE);
            this.H = bmFrameResource;
            this.f6027j.a(bmFrameResource);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    ((BmBitmapResource) it2.next()).close();
                } catch (Exception unused) {
                    Log.e("BmBitmapResource", "BmBitmapResource close failed");
                }
            }
        } else if (this.f6025h != null) {
            bmIconMarker.a(new BmBitmapResource(this.f6025h.getBitmap()));
        }
        this.f6122f.b();
    }

    public void setInterval(int i8) {
        BmFrameResource bmFrameResource;
        int i9;
        if (i8 > 0 && OverlayUtil.isOverlayUpgrade() && (bmFrameResource = this.H) != null && (i9 = this.I) > 0) {
            bmFrameResource.a(i9, this.F);
            this.F = i8;
            this.f6122f.b();
        }
    }

    public void setJoinCollision(boolean z7) {
        this.B = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (z7) {
            this.T |= CollisionBehavior.COLLIDE_WITH_INNER.getNumber();
        } else {
            this.T = (~CollisionBehavior.COLLIDE_WITH_INNER.getNumber()) & this.T;
        }
        this.f6027j.e(this.T);
        this.f6122f.b();
    }

    @Deprecated
    public void setPeriod(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        if (i8 <= 0) {
            throw new IllegalArgumentException("BDMapSDKException: marker's period must be greater than zero ");
        }
        this.J = i8;
        this.listener.d(this);
    }

    public void setPerspective(boolean z7) {
        this.f6031n = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.n(this.f6031n ? 1 : 0);
        this.f6122f.b();
    }

    public void setPosition(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: marker's position can not be null");
        }
        this.f6024g = latLng;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f6027j == null || this.f6122f == null) {
            return;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f6024g);
        this.f6027j.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
        BmTextMarker bmTextMarker = this.f6036s;
        if (bmTextMarker != null) {
            bmTextMarker.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
        }
        this.f6122f.b();
    }

    public void setPositionWithInfoWindow(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: marker's position can not be null");
        }
        this.f6024g = latLng;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else if (this.f6027j != null && this.f6122f != null) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f6024g);
            this.f6027j.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
            this.f6122f.b();
        }
        InfoWindow infoWindow = this.P;
        if (infoWindow != null) {
            infoWindow.setPosition(latLng);
        }
    }

    public void setPriority(int i8) {
        this.S = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.f(i8);
        this.f6122f.b();
    }

    public void setRotate(float f8) {
        while (f8 < 0.0f) {
            f8 += 360.0f;
        }
        float f9 = f8 % 360.0f;
        this.f6033p = f9;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.d(f9);
        this.f6122f.b();
    }

    public void setScale(float f8) {
        if (f8 < 0.0f) {
            f8 = 1.0f;
        }
        this.L = f8;
        this.M = f8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.e(f8);
        if (this.f6036s != null) {
            int titleYOffset = this.f6035r.getTitleYOffset();
            if (this.f6025h != null) {
                titleYOffset -= (int) (r0.getBitmap().getHeight() * this.M);
            }
            this.f6036s.m((titleYOffset * 310) / SysOSUtil.getDensityDpi());
        }
        this.f6122f.b();
    }

    public void setScaleX(float f8) {
        if (f8 < 0.0f) {
            f8 = 1.0f;
        }
        this.L = f8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.f(f8);
        this.f6122f.b();
    }

    public void setScaleY(float f8) {
        if (f8 < 0.0f) {
            f8 = 1.0f;
        }
        this.M = f8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.g(f8);
        if (this.f6036s != null) {
            int titleYOffset = this.f6035r.getTitleYOffset();
            if (this.f6025h != null) {
                titleYOffset -= (int) (r0.getBitmap().getHeight() * this.M);
            }
            this.f6036s.m((titleYOffset * 310) / SysOSUtil.getDensityDpi());
        }
        this.f6122f.b();
    }

    public void setStartLevel(int i8) {
        this.U = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.b(i8);
        this.f6122f.b();
    }

    public void setTitle(String str) {
        this.f6034q = str;
        if (OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.listener.d(this);
    }

    public void setTitleOptions(TitleOptions titleOptions) {
        if (titleOptions == null) {
            return;
        }
        this.f6035r = titleOptions;
        this.W = 1;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f6027j == null || this.f6122f == null) {
            return;
        }
        BmLabelUI bmLabelUI = new BmLabelUI();
        bmLabelUI.setName("titleOption");
        bmLabelUI.b(this.f6035r.getText());
        bmLabelUI.b(this.f6035r.getTitleXOffset(), this.f6035r.getTitleYOffset(), 0, 0);
        bmLabelUI.b(this.f6035r.getTitleBgColor());
        BmTextStyle bmTextStyle = new BmTextStyle();
        bmTextStyle.d(this.f6035r.getTitleFontColor());
        bmTextStyle.e(this.f6035r.getTitleFontSize());
        bmLabelUI.a(bmTextStyle);
        BmRichView bmRichView = new BmRichView();
        bmRichView.a(bmLabelUI);
        this.f6027j.a(bmRichView);
        this.f6122f.b();
    }

    public void setToTop() {
        BmLayer bmLayer;
        this.f6040w = true;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || (bmLayer = this.f6122f) == null) {
            return;
        }
        BmDrawItem a8 = bmLayer.a(bmIconMarker.getName());
        if (a8 != null) {
            this.f6122f.a(a8);
        }
        this.f6122f.a(this.f6027j.getName(), this.f6027j);
        this.f6122f.b();
    }

    @Override // com.baidu.mapapi.map.Overlay
    public void setVisible(boolean z7) {
        this.f6120d = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.c(z7 ? 1 : 0);
        this.f6122f.b();
    }

    public void setXOffset(int i8) {
        this.f6038u = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.l(i8);
        this.f6122f.b();
    }

    public void setYOffset(int i8) {
        this.f6037t = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        bmIconMarker.m(i8);
        this.f6122f.b();
    }

    @Override // com.baidu.mapapi.map.Overlay
    public void setZIndex(int i8) {
        BmLayer bmLayer;
        this.f6119c = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || (bmLayer = this.f6122f) == null) {
            return;
        }
        if (bmLayer.a(bmIconMarker.getName()) != null) {
            this.f6122f.a(this.f6027j);
        }
        this.f6122f.a(this.f6027j, i8);
        this.f6122f.b();
    }

    public void showInfoWindow(InfoWindow infoWindow) {
        if (infoWindow == null) {
            throw new IllegalArgumentException("BDMapSDKException: the InfoWindow can not be null");
        }
        InfoWindow infoWindow2 = this.P;
        if (infoWindow2 == null) {
            this.P = infoWindow;
        } else {
            InfoWindow.a aVar = this.Q;
            if (aVar != null) {
                aVar.a(infoWindow2);
            }
            a(this.P, infoWindow);
        }
        InfoWindow.a aVar2 = this.Q;
        if (aVar2 != null) {
            aVar2.b(this.P);
            this.R = true;
        }
    }

    public void showSmoothMoveInfoWindow(InfoWindow infoWindow) {
        if (infoWindow == null) {
            return;
        }
        if (!infoWindow.f5920n) {
            throw new IllegalArgumentException("BDMapSDKException: the SmoothMoveInfoWindow must build with View");
        }
        if (infoWindow.f5909c == null) {
            throw new IllegalArgumentException("BDMapSDKException: the SmoothMoveInfoWindow's View can not be null");
        }
        InfoWindow infoWindow2 = this.P;
        if (infoWindow2 == null) {
            this.P = infoWindow;
        } else {
            a(infoWindow2, infoWindow);
        }
        InfoWindow infoWindow3 = this.P;
        infoWindow3.f5919m = true;
        InfoWindow.a aVar = this.Q;
        if (aVar != null) {
            aVar.b(infoWindow3);
            this.R = true;
        }
    }

    public void startAnimation() {
        if (this.K != null) {
            if (!OverlayUtil.isOverlayUpgrade()) {
                this.K.bdAnimation.b();
            } else {
                this.K.bmAnimation.start();
                this.f6122f.b();
            }
        }
    }

    @Override // com.baidu.mapapi.map.Overlay
    BmDrawItem toDrawItem() {
        BmIconMarker bmIconMarker = new BmIconMarker();
        this.f6027j = bmIconMarker;
        bmIconMarker.a(this);
        setDrawItem(this.f6027j);
        super.toDrawItem();
        if (this.G != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<BitmapDescriptor> it = this.G.iterator();
            while (it.hasNext()) {
                arrayList.add(new BmBitmapResource(it.next().getBitmap()));
            }
            this.H = new BmFrameResource(arrayList, this.F, Integer.MAX_VALUE);
            this.I = arrayList.size();
            this.f6027j.a(this.H);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((BmBitmapResource) it2.next()).close();
                } catch (Exception unused) {
                    Log.e("BmBitmapResource", "BmBitmapResource close failed");
                }
            }
        } else {
            BmBitmapResource bmBitmapResource = this.f6026i;
            if (bmBitmapResource != null) {
                this.f6027j.a(bmBitmapResource);
            } else if (this.f6025h != null) {
                this.f6027j.a(new BmBitmapResource(this.f6025h.getBitmap()));
            }
        }
        LatLng latLng = this.f6024g;
        if (latLng != null) {
            GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
            this.f6027j.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
        }
        this.f6027j.k(this.f6028k);
        this.f6027j.a(this.f6041x);
        this.f6027j.a(this.A);
        this.f6027j.a(this.U, this.V);
        this.f6027j.d(this.f6119c);
        this.f6027j.e(this.N);
        this.f6027j.f(this.L);
        this.f6027j.g(this.M);
        this.f6027j.l(this.f6038u);
        this.f6027j.m(this.f6037t);
        this.f6027j.d(this.f6033p);
        this.f6027j.o(this.f6042y);
        Animation animation = this.K;
        if (animation != null) {
            this.f6027j.a(animation.bmAnimation);
        }
        this.f6027j.a(this.f6117a);
        this.f6027j.d(this.f6119c);
        this.f6027j.j(this.f6043z ? 1 : 0);
        this.f6027j.n(this.f6031n ? 1 : 0);
        if (this.B) {
            this.T |= CollisionBehavior.COLLIDE_WITH_INNER.getNumber();
        }
        if (this.D) {
            this.T |= CollisionBehavior.ALWAYS_SHOW.getNumber();
        }
        if (this.C) {
            this.T |= CollisionBehavior.COLLIDE_WITH_BASEPOI.getNumber();
        }
        Point point = this.O;
        if (point != null) {
            this.f6027j.g(point.x);
            this.f6027j.h(this.O.y);
            this.T = CollisionBehavior.NOT_COLLIDE.getNumber();
        }
        this.f6027j.e(this.T);
        this.f6027j.f(this.S);
        if (this.f6039v) {
            this.f6027j.i(3);
        } else {
            this.f6027j.i(0);
        }
        this.f6027j.b(this.f6029l);
        this.f6027j.c(this.f6030m);
        if (this.f6035r != null) {
            BmTextMarker bmTextMarker = this.f6036s;
            if (bmTextMarker != null) {
                this.f6122f.a(bmTextMarker);
                this.f6036s = null;
            }
            BmTextMarker bmTextMarker2 = new BmTextMarker();
            this.f6036s = bmTextMarker2;
            bmTextMarker2.setName("titleOption");
            this.f6036s.b(this.f6035r.getText());
            if (this.B) {
                BmTextMarker bmTextMarker3 = this.f6036s;
                CollisionBehavior collisionBehavior = CollisionBehavior.ALWAYS_SHOW;
                bmTextMarker3.e(collisionBehavior.getNumber());
                this.f6027j.e(collisionBehavior.getNumber());
                if (this.C) {
                    BmTextMarker bmTextMarker4 = this.f6036s;
                    int number = collisionBehavior.getNumber();
                    CollisionBehavior collisionBehavior2 = CollisionBehavior.COLLIDE_WITH_BASEPOI;
                    bmTextMarker4.e(number | collisionBehavior2.getNumber());
                    this.f6027j.e(collisionBehavior.getNumber() | collisionBehavior2.getNumber());
                }
            } else {
                this.f6036s.e(this.T);
                this.f6036s.f(this.S);
            }
            BmTextStyle bmTextStyle = new BmTextStyle();
            bmTextStyle.e((this.f6035r.getTitleFontSize() * 310) / SysOSUtil.getDensityDpi());
            bmTextStyle.d(this.f6035r.getTitleFontColor());
            bmTextStyle.c(0);
            this.f6036s.d(this.f6035r.getTitleRotate());
            GeoPoint ll2mc2 = CoordUtil.ll2mc(this.f6024g);
            this.f6036s.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc2.getLongitudeE6(), ll2mc2.getLatitudeE6()));
            this.f6036s.b(this.f6035r.getTitleAnchorX());
            this.f6036s.c(this.f6035r.getTitleAnchorY());
            this.f6036s.l((this.f6035r.getTitleXOffset() * 310) / SysOSUtil.getDensityDpi());
            int titleYOffset = this.f6035r.getTitleYOffset();
            if (this.f6025h != null) {
                titleYOffset -= (int) (r2.getBitmap().getHeight() * this.M);
            }
            this.f6036s.m((titleYOffset * 310) / SysOSUtil.getDensityDpi());
            this.f6036s.a(bmTextStyle);
            this.f6122f.a(this.f6036s, this.f6027j.b() + 1);
            this.f6122f.b();
        }
        return this.f6027j;
    }

    public void updateInfoWindowBitmapDescriptor(BitmapDescriptor bitmapDescriptor) {
        InfoWindow infoWindow = this.P;
        if (infoWindow == null || infoWindow.f5921o) {
            return;
        }
        infoWindow.setBitmapDescriptor(bitmapDescriptor);
    }

    public void updateInfoWindowPosition(LatLng latLng) {
        InfoWindow infoWindow = this.P;
        if (infoWindow != null) {
            infoWindow.setPosition(latLng);
        }
    }

    public void updateInfoWindowView(View view) {
        InfoWindow infoWindow = this.P;
        if (infoWindow == null || !infoWindow.f5920n) {
            return;
        }
        infoWindow.setView(view);
    }

    public void updateInfoWindowYOffset(int i8) {
        InfoWindow infoWindow = this.P;
        if (infoWindow != null) {
            infoWindow.setYOffset(i8);
        }
    }

    public void updateRichView() {
        BmLayer bmLayer;
        if (!OverlayUtil.isOverlayUpgrade() || (bmLayer = this.f6122f) == null) {
            return;
        }
        bmLayer.b();
    }

    public void showInfoWindow() {
        LatLng latLng;
        InfoWindowAdapter infoWindowAdapter = this.X;
        if (infoWindowAdapter == null) {
            Log.e("BDMapSDKException", "Marker showInfoWindow InfoWindowAdapter listener can not be null");
            return;
        }
        InfoWindow infoWindow = infoWindowAdapter.getInfoWindow(this);
        if (infoWindow == null) {
            View infoWindowView = this.X.getInfoWindowView(this);
            int infoWindowViewYOffset = this.X.getInfoWindowViewYOffset();
            if (infoWindowView != null && (latLng = this.f6024g) != null) {
                infoWindow = new InfoWindow(infoWindowView, latLng, infoWindowViewYOffset);
            }
        }
        if (infoWindow != null) {
            InfoWindow infoWindow2 = this.P;
            if (infoWindow2 == null) {
                this.P = infoWindow;
            } else {
                InfoWindow.a aVar = this.Q;
                if (aVar != null) {
                    aVar.a(infoWindow2);
                }
                a(this.P, infoWindow);
            }
            InfoWindow.a aVar2 = this.Q;
            if (aVar2 != null) {
                aVar2.b(this.P);
                this.R = true;
            }
        }
    }

    public void setAnimation(Animation animation, TypeEvaluator typeEvaluator) {
        if (animation != null) {
            this.K = animation;
            animation.bdAnimation.a(typeEvaluator);
            this.K.bdAnimation.a(this, animation);
        }
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        Bundle bundle2 = new Bundle();
        BitmapDescriptor bitmapDescriptor = this.f6025h;
        if (bitmapDescriptor != null) {
            bundle.putBundle("image_info", bitmapDescriptor.a());
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f6024g);
        bundle.putInt("animatetype", this.f6042y);
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        bundle.putInt("perspective", this.f6031n ? 1 : 0);
        bundle.putFloat("anchor_x", this.f6029l);
        bundle.putFloat("anchor_y", this.f6030m);
        bundle.putFloat("rotate", this.f6033p);
        bundle.putInt("y_offset", this.f6037t);
        bundle.putInt("x_offset", this.f6038u);
        bundle.putInt("isflat", this.f6039v ? 1 : 0);
        bundle.putInt("istop", this.f6040w ? 1 : 0);
        bundle.putInt(TypedValues.CycleType.S_WAVE_PERIOD, this.J);
        bundle.putFloat("alpha", this.f6041x);
        bundle.putInt("m_height", this.E);
        bundle.putFloat("scaleX", this.L);
        bundle.putFloat("scaleY", this.M);
        bundle.putInt("isClickable", this.A ? 1 : 0);
        bundle.putInt("priority", this.S);
        bundle.putInt("isJoinCollision", this.B ? 1 : 0);
        bundle.putInt("isForceDisplay", this.D ? 1 : 0);
        bundle.putInt("startLevel", this.U);
        bundle.putInt("endLevel", this.V);
        Point point = this.O;
        if (point != null) {
            bundle.putInt("fix_x", point.x);
            bundle.putInt("fix_y", this.O.y);
        }
        bundle.putInt("isfixed", this.f6043z ? 1 : 0);
        ArrayList<BitmapDescriptor> arrayList = this.G;
        if (arrayList != null && arrayList.size() > 0) {
            a(this.G, bundle);
        }
        bundle2.putBundle("param", bundle);
        TitleOptions titleOptions = this.f6035r;
        if (titleOptions != null) {
            bundle.putBundle("m_title", titleOptions.a());
            int titleYOffset = this.f6035r.getTitleYOffset();
            if (this.f6025h != null) {
                titleYOffset -= (int) (r2.getBitmap().getHeight() * this.M);
            }
            Bundle bundle3 = bundle.getBundle("m_title");
            if (bundle3 != null) {
                bundle3.putInt("title_y_offset", titleYOffset);
            }
        }
        bundle.putInt("update", this.W);
        bundle.putInt("poi_collied", this.C ? 1 : 0);
        return bundle;
    }

    public void setIcons(ArrayList<BitmapDescriptor> arrayList, int[] iArr, int i8) {
        if (!OverlayUtil.isOverlayUpgrade() || arrayList == null || arrayList.isEmpty() || arrayList.size() > iArr.length || i8 < 0) {
            return;
        }
        if (arrayList.size() == 1) {
            this.f6025h = arrayList.get(0);
        } else {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (arrayList.get(i9) == null || arrayList.get(i9).f5702a == null) {
                    return;
                }
            }
            this.G = (ArrayList) arrayList.clone();
            this.f6025h = null;
        }
        BmIconMarker bmIconMarker = this.f6027j;
        if (bmIconMarker == null || this.f6122f == null) {
            return;
        }
        if (this.G != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<BitmapDescriptor> it = this.G.iterator();
            while (it.hasNext()) {
                arrayList2.add(new BmBitmapResource(it.next().getBitmap()));
            }
            BmFrameResource bmFrameResource = new BmFrameResource(arrayList2, iArr, i8);
            this.H = bmFrameResource;
            this.f6027j.a(bmFrameResource);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    ((BmBitmapResource) it2.next()).close();
                } catch (Exception unused) {
                    Log.e("BmBitmapResource", "BmBitmapResource close failed");
                }
            }
        } else if (this.f6025h != null) {
            bmIconMarker.a(new BmBitmapResource(this.f6025h.getBitmap()));
        }
        this.f6122f.b();
    }

    private void a(ArrayList<BitmapDescriptor> arrayList, Bundle bundle) {
        int i8;
        MessageDigest messageDigest;
        ArrayList arrayList2 = new ArrayList();
        Iterator<BitmapDescriptor> it = arrayList.iterator();
        while (true) {
            i8 = 0;
            if (!it.hasNext()) {
                break;
            }
            BitmapDescriptor next = it.next();
            ParcelItem parcelItem = new ParcelItem();
            Bundle bundle2 = new Bundle();
            Bitmap bitmap = next.f5702a;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            bundle2.putByteArray("image_data", array);
            bundle2.putInt("image_width", bitmap.getWidth());
            bundle2.putInt("image_height", bitmap.getHeight());
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e8) {
                e8.printStackTrace();
                messageDigest = null;
            }
            if (messageDigest != null) {
                messageDigest.update(array, 0, array.length);
                byte[] digest = messageDigest.digest();
                StringBuilder sb = new StringBuilder("");
                while (i8 < digest.length) {
                    sb.append(Integer.toString((digest[i8] & 255) + 256, 16).substring(1));
                    i8++;
                }
                bundle2.putString("image_hashcode", sb.toString());
            }
            parcelItem.setBundle(bundle2);
            arrayList2.add(parcelItem);
        }
        if (arrayList2.size() > 0) {
            ParcelItem[] parcelItemArr = new ParcelItem[arrayList2.size()];
            while (i8 < arrayList2.size()) {
                parcelItemArr[i8] = (ParcelItem) arrayList2.get(i8);
                i8++;
            }
            bundle.putParcelableArray("icons", parcelItemArr);
        }
    }
}
