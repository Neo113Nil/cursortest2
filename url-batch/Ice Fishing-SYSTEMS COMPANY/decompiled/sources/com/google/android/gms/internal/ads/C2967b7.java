package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.b7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2967b7 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29406a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29407b;

    /* renamed from: c, reason: collision with root package name */
    public final C3235g2 f29408c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f29409d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29410e;

    /* renamed from: f, reason: collision with root package name */
    public final long f29411f;

    /* renamed from: g, reason: collision with root package name */
    public final long f29412g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29413h;
    public final int i;

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public C2967b7(Object obj, int i, C3235g2 c3235g2, Object obj2, int i4, long j9, long j10, int i9, int i10) {
        PA.n(i >= 0);
        PA.n(i4 >= 0);
        this.f29406a = obj;
        this.f29407b = i;
        this.f29408c = c3235g2;
        this.f29409d = obj2;
        this.f29410e = i4;
        this.f29411f = j9;
        this.f29412g = j10;
        this.f29413h = i9;
        this.i = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2967b7.class == obj.getClass()) {
            C2967b7 c2967b7 = (C2967b7) obj;
            if (this.f29407b == c2967b7.f29407b && this.f29410e == c2967b7.f29410e && this.f29411f == c2967b7.f29411f && this.f29412g == c2967b7.f29412g && this.f29413h == c2967b7.f29413h && this.i == c2967b7.i && Objects.equals(this.f29408c, c2967b7.f29408c) && Objects.equals(this.f29406a, c2967b7.f29406a) && Objects.equals(this.f29409d, c2967b7.f29409d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f29406a, Integer.valueOf(this.f29407b), this.f29408c, this.f29409d, Integer.valueOf(this.f29410e), Long.valueOf(this.f29411f), Long.valueOf(this.f29412g), Integer.valueOf(this.f29413h), Integer.valueOf(this.i));
    }

    public final String toString() {
        int i = this.f29407b;
        int length = String.valueOf(i).length();
        int i4 = this.f29410e;
        int length2 = String.valueOf(i4).length();
        long j9 = this.f29411f;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j9).length());
        AbstractC5051n.i(sb, "mediaItem=", i, ", period=", i4);
        sb.append(", pos=");
        sb.append(j9);
        String sb2 = sb.toString();
        int i9 = this.f29413h;
        if (i9 == -1) {
            return sb2;
        }
        int length3 = sb2.length();
        long j10 = this.f29412g;
        int length4 = String.valueOf(i9).length() + length3 + 13 + String.valueOf(j10).length() + 10;
        int i10 = this.i;
        StringBuilder sb3 = new StringBuilder(length4 + 5 + String.valueOf(i10).length());
        sb3.append(sb2);
        sb3.append(", contentPos=");
        sb3.append(j10);
        return D.y.n(sb3, ", adGroup=", i9, ", ad=", i10);
    }
}
