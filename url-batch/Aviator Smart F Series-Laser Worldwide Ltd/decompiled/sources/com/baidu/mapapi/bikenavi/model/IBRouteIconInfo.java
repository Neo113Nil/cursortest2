package com.baidu.mapapi.bikenavi.model;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class IBRouteIconInfo {

    /* renamed from: a, reason: collision with root package name */
    private Drawable f5403a;

    /* renamed from: b, reason: collision with root package name */
    private String f5404b;

    public IBRouteIconInfo(Drawable drawable, String str) {
        this.f5403a = drawable;
        this.f5404b = str;
    }

    public Drawable getIconDrawable() {
        return this.f5403a;
    }

    public String getIconName() {
        return this.f5404b;
    }

    public void setIconDrawable(Drawable drawable) {
        this.f5403a = drawable;
    }

    public void setIconName(String str) {
        this.f5404b = str;
    }
}
