package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public abstract class f {
    private Object mData;
    private Drawable mIcon;

    /* renamed from: y, reason: collision with root package name */
    private float f14111y;

    public f() {
        this.f14111y = 0.0f;
        this.mData = null;
        this.mIcon = null;
    }

    public Object getData() {
        return this.mData;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public float getY() {
        return this.f14111y;
    }

    public void setData(Object obj) {
        this.mData = obj;
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
    }

    public void setY(float f8) {
        this.f14111y = f8;
    }

    public f(float f8) {
        this.mData = null;
        this.mIcon = null;
        this.f14111y = f8;
    }

    public f(float f8, Object obj) {
        this(f8);
        this.mData = obj;
    }

    public f(float f8, Drawable drawable) {
        this(f8);
        this.mIcon = drawable;
    }

    public f(float f8, Drawable drawable, Object obj) {
        this(f8);
        this.mIcon = drawable;
        this.mData = obj;
    }
}
