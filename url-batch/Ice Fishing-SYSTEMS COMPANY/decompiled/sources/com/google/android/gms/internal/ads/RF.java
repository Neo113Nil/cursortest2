package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class RF extends Number {

    /* renamed from: n, reason: collision with root package name */
    public final String f27326n;

    public RF(String str) {
        this.f27326n = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f27326n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RF) {
            return this.f27326n.equals(((RF) obj).f27326n);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f27326n);
    }

    public final int hashCode() {
        return this.f27326n.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f27326n;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f27326n;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f27326n;
    }
}
