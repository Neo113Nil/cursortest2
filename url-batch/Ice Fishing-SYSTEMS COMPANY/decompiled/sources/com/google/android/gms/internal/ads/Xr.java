package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Xr {

    /* renamed from: c, reason: collision with root package name */
    public static final Xr f28710c = new Xr(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f28711a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28712b;

    static {
        new Xr(0, 0);
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public Xr(int i, int i4) {
        boolean z8 = false;
        if ((i == -1 || i >= 0) && (i4 == -1 || i4 >= 0)) {
            z8 = true;
        }
        PA.n(z8);
        this.f28711a = i;
        this.f28712b = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Xr) {
            Xr xr = (Xr) obj;
            if (this.f28711a == xr.f28711a && this.f28712b == xr.f28712b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f28711a;
        return ((i >>> 16) | (i << 16)) ^ this.f28712b;
    }

    public final String toString() {
        int i = this.f28711a;
        int length = String.valueOf(i).length();
        int i4 = this.f28712b;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i4).length());
        sb.append(i);
        sb.append("x");
        sb.append(i4);
        return sb.toString();
    }
}
