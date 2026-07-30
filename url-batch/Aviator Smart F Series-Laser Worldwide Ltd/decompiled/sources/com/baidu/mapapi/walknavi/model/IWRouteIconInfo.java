package com.baidu.mapapi.walknavi.model;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class IWRouteIconInfo {

    /* renamed from: a, reason: collision with root package name */
    private Drawable f7630a;

    /* renamed from: b, reason: collision with root package name */
    private String f7631b;

    public IWRouteIconInfo(Drawable drawable, String str) {
        this.f7630a = drawable;
        this.f7631b = str;
    }

    public Drawable getIconDrawable() {
        return this.f7630a;
    }

    public String getIconName() {
        return this.f7631b;
    }

    public void setIconDrawable(Drawable drawable) {
        this.f7630a = drawable;
    }

    public void setIconName(String str) {
        this.f7631b = str;
    }
}
