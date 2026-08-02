package m0;

import W.J;
import a.AbstractC0124a;
import java.util.Locale;

/* renamed from: m0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1295h {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f14382g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14383a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f14384b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14385c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14386d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14387e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f14388f;

    public C1295h(C1294g c1294g) {
        this.f14383a = c1294g.f14376a;
        this.f14384b = c1294g.f14377b;
        this.f14385c = c1294g.f14378c;
        this.f14386d = c1294g.f14379d;
        this.f14387e = c1294g.f14380e;
        this.f14388f = c1294g.f14381f;
    }

    public static int a(int i4) {
        return AbstractC0124a.K(i4 + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1295h.class == obj.getClass()) {
            C1295h c1295h = (C1295h) obj;
            if (this.f14384b == c1295h.f14384b && this.f14385c == c1295h.f14385c && this.f14383a == c1295h.f14383a && this.f14386d == c1295h.f14386d && this.f14387e == c1295h.f14387e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = (((((527 + this.f14384b) * 31) + this.f14385c) * 31) + (this.f14383a ? 1 : 0)) * 31;
        long j4 = this.f14386d;
        return ((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f14387e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f14384b), Integer.valueOf(this.f14385c), Long.valueOf(this.f14386d), Integer.valueOf(this.f14387e), Boolean.valueOf(this.f14383a)};
        String str = J.f3263a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
