package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class sd4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11790a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11791b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11792c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11793d;

    public sd4(int i7, byte[] bArr, int i8, int i9) {
        this.f11790a = i7;
        this.f11791b = bArr;
        this.f11792c = i8;
        this.f11793d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sd4.class == obj.getClass()) {
            sd4 sd4Var = (sd4) obj;
            if (this.f11790a == sd4Var.f11790a && this.f11792c == sd4Var.f11792c && this.f11793d == sd4Var.f11793d && Arrays.equals(this.f11791b, sd4Var.f11791b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f11790a * 31) + Arrays.hashCode(this.f11791b)) * 31) + this.f11792c) * 31) + this.f11793d;
    }
}
