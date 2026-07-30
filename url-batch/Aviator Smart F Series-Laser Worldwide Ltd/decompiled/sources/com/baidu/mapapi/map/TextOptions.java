package com.baidu.mapapi.map;

import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public final class TextOptions extends OverlayOptions {
    public static final int ALIGN_BOTTOM = 16;
    public static final int ALIGN_CENTER_HORIZONTAL = 4;
    public static final int ALIGN_CENTER_VERTICAL = 32;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;
    public static final int ALIGN_TOP = 8;

    /* renamed from: a, reason: collision with root package name */
    private String f6291a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f6292b;

    /* renamed from: c, reason: collision with root package name */
    private int f6293c;

    /* renamed from: k, reason: collision with root package name */
    private float f6301k;

    /* renamed from: m, reason: collision with root package name */
    boolean f6303m;

    /* renamed from: s, reason: collision with root package name */
    Point f6309s;

    /* renamed from: u, reason: collision with root package name */
    int f6311u;

    /* renamed from: w, reason: collision with root package name */
    Bundle f6313w;

    /* renamed from: d, reason: collision with root package name */
    private int f6294d = -16777216;

    /* renamed from: e, reason: collision with root package name */
    private int f6295e = 12;

    /* renamed from: f, reason: collision with root package name */
    private Typeface f6296f = Typeface.DEFAULT;

    /* renamed from: g, reason: collision with root package name */
    private float f6297g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    private float f6298h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    private int f6299i = 4;

    /* renamed from: j, reason: collision with root package name */
    private int f6300j = 32;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6302l = true;

    /* renamed from: n, reason: collision with root package name */
    int f6304n = 0;

    /* renamed from: o, reason: collision with root package name */
    int f6305o = 0;

    /* renamed from: p, reason: collision with root package name */
    float f6306p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    float f6307q = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    int f6308r = Integer.MAX_VALUE;

    /* renamed from: t, reason: collision with root package name */
    boolean f6310t = false;

    /* renamed from: v, reason: collision with root package name */
    boolean f6312v = true;

    public TextOptions align(int i8, int i9) {
        this.f6299i = i8;
        this.f6300j = i9;
        return this;
    }

    public TextOptions anchor(float f8, float f9) {
        if (f8 >= 0.0f && f8 <= 1.0f && f9 >= 0.0f && f9 <= 1.0f) {
            this.f6297g = f8;
            this.f6298h = f9;
        }
        return this;
    }

    public TextOptions bgColor(int i8) {
        this.f6293c = i8;
        return this;
    }

    public TextOptions extraInfo(Bundle bundle) {
        this.f6313w = bundle;
        return this;
    }

    public TextOptions fixedScreenPosition(Point point) {
        this.f6309s = point;
        this.f6310t = true;
        return this;
    }

    public TextOptions fontColor(int i8) {
        this.f6294d = i8;
        return this;
    }

    public TextOptions fontSize(int i8) {
        this.f6295e = i8;
        return this;
    }

    public float getAlignX() {
        return this.f6299i;
    }

    public float getAlignY() {
        return this.f6300j;
    }

    public int getBgColor() {
        return this.f6293c;
    }

    public Bundle getExtraInfo() {
        return this.f6313w;
    }

    public int getFontColor() {
        return this.f6294d;
    }

    public int getFontSize() {
        return this.f6295e;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        Text text = new Text();
        text.f6120d = this.f6312v;
        text.f6119c = this.f6311u;
        text.f6121e = this.f6313w;
        text.f6273i = this.f6291a;
        text.f6274j = this.f6292b;
        text.f6275k = this.f6293c;
        text.f6276l = this.f6294d;
        text.f6277m = this.f6295e;
        text.f6278n = this.f6296f;
        text.f6282r = this.f6299i;
        text.f6283s = this.f6300j;
        text.f6281q = this.f6298h;
        text.f6280p = this.f6297g;
        text.f6284t = this.f6301k;
        text.f6286v = this.f6302l;
        text.f6289y = this.f6303m;
        text.A = this.f6305o;
        text.f6290z = this.f6304n;
        text.B = this.f6306p;
        text.C = this.f6307q;
        text.E = this.f6308r;
        boolean z7 = this.f6310t;
        text.G = z7;
        if (z7) {
            text.F = this.f6309s;
        }
        return text;
    }

    public LatLng getPosition() {
        return this.f6292b;
    }

    public int getPriority() {
        return this.f6308r;
    }

    public float getRotate() {
        return this.f6301k;
    }

    public String getText() {
        return this.f6291a;
    }

    public Typeface getTypeface() {
        return this.f6296f;
    }

    public int getZIndex() {
        return this.f6311u;
    }

    public boolean isPerspective() {
        return this.f6303m;
    }

    public boolean isVisible() {
        return this.f6312v;
    }

    public TextOptions perspective(boolean z7) {
        this.f6303m = z7;
        return this;
    }

    public TextOptions position(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: position can not be null");
        }
        this.f6292b = latLng;
        return this;
    }

    public TextOptions priority(int i8) {
        this.f6308r = i8;
        return this;
    }

    public TextOptions rotate(float f8) {
        this.f6301k = f8;
        return this;
    }

    public TextOptions scaleX(float f8) {
        if (f8 < 0.0f) {
            return this;
        }
        this.f6306p = f8;
        return this;
    }

    public TextOptions scaleY(float f8) {
        if (f8 < 0.0f) {
            return this;
        }
        this.f6307q = f8;
        return this;
    }

    public TextOptions setClickable(boolean z7) {
        this.f6302l = z7;
        return this;
    }

    public TextOptions text(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("BDMapSDKException: text can not be null or empty");
        }
        this.f6291a = str;
        return this;
    }

    public TextOptions typeface(Typeface typeface) {
        this.f6296f = typeface;
        return this;
    }

    public TextOptions visible(boolean z7) {
        this.f6312v = z7;
        return this;
    }

    public TextOptions xOffset(int i8) {
        this.f6305o = i8;
        return this;
    }

    public TextOptions yOffset(int i8) {
        this.f6304n = i8;
        return this;
    }

    public TextOptions zIndex(int i8) {
        this.f6311u = i8;
        return this;
    }
}
