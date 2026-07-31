package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class i10 {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final i10 f27042g = new i10(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final float f27043a;

    /* renamed from: b, reason: collision with root package name */
    private final float f27044b;

    /* renamed from: c, reason: collision with root package name */
    private final float f27045c;

    /* renamed from: d, reason: collision with root package name */
    private final float f27046d;

    /* renamed from: e, reason: collision with root package name */
    private final float f27047e;

    /* renamed from: f, reason: collision with root package name */
    private final float f27048f;

    public i10(float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f27043a = f4;
        this.f27044b = f5;
        this.f27045c = f6;
        this.f27046d = f7;
        this.f27047e = f8;
        this.f27048f = f9;
    }

    public final float b() {
        return this.f27046d;
    }

    public final float c() {
        return this.f27048f;
    }

    public final float d() {
        return this.f27047e;
    }

    public final float e() {
        return this.f27043a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i10)) {
            return false;
        }
        i10 i10Var = (i10) obj;
        return Float.compare(this.f27043a, i10Var.f27043a) == 0 && Float.compare(this.f27044b, i10Var.f27044b) == 0 && Float.compare(this.f27045c, i10Var.f27045c) == 0 && Float.compare(this.f27046d, i10Var.f27046d) == 0 && Float.compare(this.f27047e, i10Var.f27047e) == 0 && Float.compare(this.f27048f, i10Var.f27048f) == 0;
    }

    public final float f() {
        return this.f27045c;
    }

    public final float g() {
        return this.f27044b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27048f) + ((Float.hashCode(this.f27047e) + ((Float.hashCode(this.f27046d) + ((Float.hashCode(this.f27045c) + ((Float.hashCode(this.f27044b) + (Float.hashCode(this.f27043a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DisplayInsetsF(left=" + this.f27043a + ", top=" + this.f27044b + ", right=" + this.f27045c + ", bottom=" + this.f27046d + ", cutoutTop=" + this.f27047e + ", cutoutBottom=" + this.f27048f + ")";
    }
}
