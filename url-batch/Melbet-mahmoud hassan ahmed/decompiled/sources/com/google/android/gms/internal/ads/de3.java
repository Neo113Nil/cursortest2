package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class de3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4186a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f4187b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f4188c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4189d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4190e;

    public de3(String str, c0 c0Var, c0 c0Var2, int i7, int i8) {
        boolean z6 = false;
        if (i7 != 0) {
            i8 = i8 == 0 ? 0 : i8;
            wu1.d(z6);
            wu1.c(str);
            this.f4186a = str;
            Objects.requireNonNull(c0Var);
            this.f4187b = c0Var;
            Objects.requireNonNull(c0Var2);
            this.f4188c = c0Var2;
            this.f4189d = i7;
            this.f4190e = i8;
        }
        z6 = true;
        wu1.d(z6);
        wu1.c(str);
        this.f4186a = str;
        Objects.requireNonNull(c0Var);
        this.f4187b = c0Var;
        Objects.requireNonNull(c0Var2);
        this.f4188c = c0Var2;
        this.f4189d = i7;
        this.f4190e = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && de3.class == obj.getClass()) {
            de3 de3Var = (de3) obj;
            if (this.f4189d == de3Var.f4189d && this.f4190e == de3Var.f4190e && this.f4186a.equals(de3Var.f4186a) && this.f4187b.equals(de3Var.f4187b) && this.f4188c.equals(de3Var.f4188c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f4189d + 527) * 31) + this.f4190e) * 31) + this.f4186a.hashCode()) * 31) + this.f4187b.hashCode()) * 31) + this.f4188c.hashCode();
    }
}
