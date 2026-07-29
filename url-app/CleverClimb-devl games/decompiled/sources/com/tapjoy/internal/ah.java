package com.tapjoy.internal;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/* loaded from: classes2.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    protected int f7818a = 0;

    /* renamed from: b, reason: collision with root package name */
    protected float f7819b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    protected int f7820c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected float f7821d = 0.0f;
    protected int e = 0;
    protected float f = 0.0f;
    protected int g = 0;
    protected float h = 0.0f;

    public final Animation a() {
        return new TranslateAnimation(this.f7818a, this.f7819b, this.f7820c, this.f7821d, this.e, this.f, this.g, this.h);
    }

    public final ah a(float f) {
        this.f7818a = 1;
        this.f7819b = f;
        return this;
    }

    public final ah b(float f) {
        this.e = 1;
        this.f = f;
        return this;
    }
}
