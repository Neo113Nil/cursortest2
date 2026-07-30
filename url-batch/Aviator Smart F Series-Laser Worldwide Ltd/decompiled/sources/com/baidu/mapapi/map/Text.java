package com.baidu.mapapi.map;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.map.bmsdk.ui.RichView;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmTextMarker;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;
import com.baidu.platform.comapi.bmsdk.style.BmTextStyle;
import com.baidu.vi.EnvDrawText;

/* loaded from: classes2.dex */
public final class Text extends Overlay {
    int A;
    CollisionBehavior D;
    Point F;
    Animation H;

    /* renamed from: g, reason: collision with root package name */
    BmTextMarker f6271g;

    /* renamed from: h, reason: collision with root package name */
    BmTextStyle f6272h;

    /* renamed from: i, reason: collision with root package name */
    String f6273i;

    /* renamed from: j, reason: collision with root package name */
    LatLng f6274j;

    /* renamed from: k, reason: collision with root package name */
    int f6275k;

    /* renamed from: l, reason: collision with root package name */
    int f6276l;

    /* renamed from: m, reason: collision with root package name */
    int f6277m;

    /* renamed from: o, reason: collision with root package name */
    int f6279o;

    /* renamed from: r, reason: collision with root package name */
    int f6282r;

    /* renamed from: s, reason: collision with root package name */
    int f6283s;

    /* renamed from: t, reason: collision with root package name */
    float f6284t;

    /* renamed from: u, reason: collision with root package name */
    int f6285u;

    /* renamed from: w, reason: collision with root package name */
    int f6287w;

    /* renamed from: x, reason: collision with root package name */
    int f6288x;

    /* renamed from: y, reason: collision with root package name */
    boolean f6289y;

    /* renamed from: z, reason: collision with root package name */
    int f6290z;

    /* renamed from: n, reason: collision with root package name */
    Typeface f6278n = Typeface.DEFAULT;

    /* renamed from: p, reason: collision with root package name */
    float f6280p = 0.5f;

    /* renamed from: q, reason: collision with root package name */
    float f6281q = 0.5f;

    /* renamed from: v, reason: collision with root package name */
    boolean f6286v = true;
    float B = 1.0f;
    float C = 1.0f;
    int E = Integer.MAX_VALUE;
    boolean G = false;

    Text() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.text;
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        if (this.f6274j == null) {
            throw new IllegalStateException("BDMapSDKException: when you add a text overlay, you must provide text and the position info.");
        }
        bundle.putString("text", this.f6273i);
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f6274j);
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        int i8 = this.f6276l;
        bundle.putInt("font_color", Color.argb(i8 >>> 24, i8 & 255, (i8 >> 8) & 255, (i8 >> 16) & 255));
        int i9 = this.f6275k;
        bundle.putInt("bg_color", Color.argb(i9 >>> 24, i9 & 255, (i9 >> 8) & 255, (i9 >> 16) & 255));
        bundle.putInt("font_size", this.f6277m);
        Typeface typeface = this.f6278n;
        if (typeface != null) {
            EnvDrawText.registFontCache(typeface.hashCode(), this.f6278n);
            bundle.putInt("type_face", this.f6278n.hashCode());
        }
        int i10 = this.f6282r;
        bundle.putFloat("align_x", i10 != 1 ? i10 != 2 ? 0.5f : 1.0f : 0.0f);
        int i11 = this.f6283s;
        bundle.putFloat("align_y", i11 != 8 ? i11 != 16 ? 0.5f : 1.0f : 0.0f);
        bundle.putFloat("rotate", this.f6284t);
        bundle.putInt("update", this.f6285u);
        bundle.putInt("isClickable", this.f6286v ? 1 : 0);
        return bundle;
    }

    public void addRichView(RichView richView) {
        if (richView != null && OverlayUtil.isOverlayUpgrade()) {
            this.f6271g.a(richView.getBmRichView());
            this.f6122f.b();
        }
    }

    public void cancelAnimation() {
        if (this.H == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.H.bmAnimation.cancel();
        this.f6122f.b();
    }

    public void clearRichViews() {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6271g.c();
            this.f6122f.b();
        }
    }

    public float getAlignX() {
        return this.f6282r;
    }

    public float getAlignY() {
        return this.f6283s;
    }

    public float getAnchorX() {
        return this.f6280p;
    }

    public float getAnchorY() {
        return this.f6281q;
    }

    public int getBgColor() {
        return this.f6275k;
    }

    public CollisionBehavior getCollisionBehavior() {
        return this.D;
    }

    public int getEndLevel() {
        return this.f6288x;
    }

    public Point getFixedPosition() {
        return this.F;
    }

    public int getFontColor() {
        return this.f6276l;
    }

    public int getFontSize() {
        return this.f6277m;
    }

    public LatLng getPosition() {
        return this.f6274j;
    }

    public int getPriority() {
        return this.E;
    }

    public float getRotate() {
        return this.f6284t;
    }

    public float getScaleX() {
        return this.B;
    }

    public float getScaleY() {
        return this.C;
    }

    public int getStartLevel() {
        return this.f6287w;
    }

    public String getText() {
        return this.f6273i;
    }

    public Typeface getTypeface() {
        return this.f6278n;
    }

    public int getXOffset() {
        return this.A;
    }

    public int getYOffset() {
        return this.f6290z;
    }

    public boolean isClickable() {
        return this.f6286v;
    }

    public boolean isFixed() {
        return this.G;
    }

    public boolean isPerspective() {
        return this.f6289y;
    }

    public void pauseAnimation() {
        if (this.H == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.H.bmAnimation.pause();
        this.f6122f.b();
    }

    public void removeRichView(RichView richView) {
        if (richView != null && OverlayUtil.isOverlayUpgrade()) {
            this.f6271g.b(richView.getBmRichView());
            this.f6122f.b();
        }
    }

    public void resumeAnimation() {
        if (this.H == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.H.bmAnimation.resume();
        this.f6122f.b();
    }

    public void setAlign(int i8, int i9) {
        this.f6282r = i8;
        this.f6283s = i9;
        this.f6285u = 1;
        if (OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.listener.d(this);
    }

    public void setAnchor(float f8, float f9) {
        if (f8 < 0.0f || f9 < 0.0f || f8 > 1.0f || f9 > 1.0f || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.f6280p = f8;
        this.f6281q = f9;
        this.f6271g.b(f8);
        this.f6271g.c(f9);
        this.f6122f.b();
    }

    public void setAnimation(Animation animation) {
        BmAnimation bmAnimation;
        if (animation == null) {
            return;
        }
        this.H = animation;
        if (!OverlayUtil.isOverlayUpgrade() || (bmAnimation = this.H.bmAnimation) == null) {
            return;
        }
        this.f6271g.a(bmAnimation);
        this.f6122f.b();
    }

    public void setBgColor(int i8) {
        this.f6275k = i8;
        this.f6285u = 1;
        if (OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.listener.d(this);
    }

    public void setBorderColor(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6272h.a(i8);
            this.f6122f.b();
        }
    }

    public void setBorderWidth(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6272h.b(i8);
            this.f6122f.b();
        }
    }

    public void setClickable(boolean z7) {
        this.f6286v = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmTextMarker bmTextMarker = this.f6271g;
        if (bmTextMarker == null || this.f6122f == null) {
            return;
        }
        bmTextMarker.a(z7);
        this.f6122f.b();
    }

    public void setCollisionBehavior(CollisionBehavior collisionBehavior) {
        BmTextMarker bmTextMarker;
        if (!OverlayUtil.isOverlayUpgrade() || (bmTextMarker = this.f6271g) == null || this.f6122f == null) {
            return;
        }
        this.D = collisionBehavior;
        bmTextMarker.e(collisionBehavior.getNumber());
        this.f6122f.b();
    }

    public void setEndLevel(int i8) {
        BmTextMarker bmTextMarker;
        this.f6288x = i8;
        if (!OverlayUtil.isOverlayUpgrade() || (bmTextMarker = this.f6271g) == null || this.f6122f == null) {
            return;
        }
        bmTextMarker.a(i8);
        this.f6122f.b();
    }

    public void setFixedScreenPosition(Point point) {
        if (point == null) {
            throw new IllegalArgumentException("BDMapSDKException: the screenPosition can not be null");
        }
        this.F = point;
        this.G = true;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmTextMarker bmTextMarker = this.f6271g;
        if (bmTextMarker == null || this.f6122f == null) {
            return;
        }
        bmTextMarker.j(this.G ? 1 : 0);
        this.f6271g.g(this.F.x);
        this.f6271g.h(this.F.y);
        this.f6122f.b();
    }

    public void setFontColor(int i8) {
        this.f6276l = i8;
        this.f6285u = 1;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            this.f6272h.d(i8);
            this.f6122f.b();
        }
    }

    public void setFontSize(int i8) {
        this.f6277m = i8;
        this.f6285u = 1;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            this.f6272h.e(i8);
            this.f6122f.b();
        }
    }

    public void setPerspective(boolean z7) {
        BmTextMarker bmTextMarker;
        this.f6289y = z7;
        if (!OverlayUtil.isOverlayUpgrade() || (bmTextMarker = this.f6271g) == null || this.f6122f == null) {
            return;
        }
        bmTextMarker.n(this.f6289y ? 1 : 0);
        this.f6122f.b();
    }

    public void setPosition(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: position can not be null");
        }
        this.f6274j = latLng;
        this.f6285u = 1;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            if (this.f6271g == null || this.f6122f == null) {
                return;
            }
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f6274j);
            this.f6271g.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
            this.f6122f.b();
        }
    }

    public void setPriority(int i8) {
        BmTextMarker bmTextMarker;
        this.E = i8;
        if (!OverlayUtil.isOverlayUpgrade() || (bmTextMarker = this.f6271g) == null || this.f6122f == null) {
            return;
        }
        bmTextMarker.f((int) ((short) i8));
        this.f6122f.b();
    }

    public void setRotate(float f8) {
        this.f6284t = f8;
        this.f6285u = 1;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmTextMarker bmTextMarker = this.f6271g;
        if (bmTextMarker == null || this.f6122f == null) {
            return;
        }
        bmTextMarker.d(f8);
        this.f6122f.b();
    }

    public void setScale(float f8) {
        BmTextMarker bmTextMarker;
        if (f8 < 0.0f) {
            f8 = 1.0f;
        }
        this.B = f8;
        this.C = f8;
        if (!OverlayUtil.isOverlayUpgrade() || (bmTextMarker = this.f6271g) == null || this.f6122f == null) {
            return;
        }
        bmTextMarker.e(f8);
        this.f6122f.b();
    }

    public void setScaleX(float f8) {
        BmTextMarker bmTextMarker;
        if (f8 < 0.0f) {
            f8 = 1.0f;
        }
        this.B = f8;
        if (!OverlayUtil.isOverlayUpgrade() || (bmTextMarker = this.f6271g) == null || this.f6122f == null) {
            return;
        }
        bmTextMarker.f(f8);
        this.f6122f.b();
    }

    public void setScaleY(float f8) {
        BmTextMarker bmTextMarker;
        if (f8 < 0.0f) {
            f8 = 1.0f;
        }
        this.C = f8;
        if (!OverlayUtil.isOverlayUpgrade() || (bmTextMarker = this.f6271g) == null || this.f6122f == null) {
            return;
        }
        bmTextMarker.g(f8);
        this.f6122f.b();
    }

    public void setStartLevel(int i8) {
        BmTextMarker bmTextMarker;
        this.f6287w = i8;
        if (!OverlayUtil.isOverlayUpgrade() || (bmTextMarker = this.f6271g) == null || this.f6122f == null) {
            return;
        }
        bmTextMarker.b(i8);
        this.f6122f.b();
    }

    public void setText(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("BDMapSDKException: text can not be null or empty");
        }
        this.f6273i = str;
        this.f6285u = 1;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            this.f6271g.b(str);
            this.f6122f.b();
        }
    }

    public void setTypeface(Typeface typeface) {
        this.f6278n = typeface;
        this.f6285u = 1;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            this.f6272h.c(typeface.getStyle());
            this.f6122f.b();
        }
    }

    public void setXOffset(int i8) {
        BmTextMarker bmTextMarker;
        this.A = i8;
        if (!OverlayUtil.isOverlayUpgrade() || (bmTextMarker = this.f6271g) == null || this.f6122f == null) {
            return;
        }
        bmTextMarker.l(i8);
        this.f6122f.b();
    }

    public void setYOffset(int i8) {
        BmTextMarker bmTextMarker;
        this.f6290z = i8;
        if (!OverlayUtil.isOverlayUpgrade() || (bmTextMarker = this.f6271g) == null || this.f6122f == null) {
            return;
        }
        bmTextMarker.m(i8);
        this.f6122f.b();
    }

    public void startAnimation() {
        if (this.H == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.H.bmAnimation.start();
        this.f6122f.b();
    }

    @Override // com.baidu.mapapi.map.Overlay
    BmDrawItem toDrawItem() {
        this.f6271g = new BmTextMarker();
        this.f6272h = new BmTextStyle();
        this.f6271g.a(this);
        setDrawItem(this.f6271g);
        super.toDrawItem();
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f6274j);
        this.f6271g.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
        this.f6271g.b(this.f6273i);
        this.f6272h.c(this.f6278n.getStyle());
        this.f6272h.e(this.f6277m);
        this.f6272h.d(this.f6276l);
        this.f6272h.c(this.f6279o);
        this.f6271g.a(this.f6272h);
        this.f6271g.d(this.f6284t);
        this.f6271g.b(this.f6280p);
        this.f6271g.c(this.f6281q);
        this.f6271g.n(this.f6289y ? 1 : 0);
        this.f6271g.l(this.A);
        this.f6271g.m(this.f6290z);
        this.f6271g.n(this.f6289y ? 1 : 0);
        this.f6271g.l(this.A);
        this.f6271g.m(this.f6290z);
        this.f6271g.f(this.B);
        this.f6271g.g(this.C);
        CollisionBehavior collisionBehavior = this.D;
        if (collisionBehavior != null) {
            this.f6271g.e(collisionBehavior.ordinal());
        }
        this.f6271g.f(this.E);
        Animation animation = this.H;
        if (animation != null) {
            this.f6271g.a(animation.bmAnimation);
        }
        return this.f6271g;
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a() {
        Typeface typeface = this.f6278n;
        if (typeface != null) {
            EnvDrawText.removeFontCache(typeface.hashCode());
        }
        return super.a();
    }
}
