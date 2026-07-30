package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4276zK extends Number {

    /* renamed from: n, reason: collision with root package name */
    public final String f35528n;

    public C4276zK(String str) {
        this.f35528n = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f35528n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4276zK) {
            return this.f35528n.equals(((C4276zK) obj).f35528n);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f35528n);
    }

    public final int hashCode() {
        return this.f35528n.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f35528n;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return AbstractC3406jD.c(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f35528n;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return AbstractC3406jD.c(str).longValue();
        }
    }

    public final String toString() {
        return this.f35528n;
    }
}
