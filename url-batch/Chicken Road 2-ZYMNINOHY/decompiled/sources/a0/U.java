package a0;

import a.AbstractC0124a;
import java.util.Objects;
import q0.C1353B;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final C1353B f4002a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4003b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4004c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4005d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4006e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4007f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4008g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4009h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4010i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4011j;

    public U(C1353B c1353b, long j4, long j5, long j6, long j7, boolean z, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean z8 = true;
        AbstractC0124a.h(!z7 || z5);
        AbstractC0124a.h(!z6 || z5);
        if (z4 && (z5 || z6 || z7)) {
            z8 = false;
        }
        AbstractC0124a.h(z8);
        this.f4002a = c1353b;
        this.f4003b = j4;
        this.f4004c = j5;
        this.f4005d = j6;
        this.f4006e = j7;
        this.f4007f = z;
        this.f4008g = z4;
        this.f4009h = z5;
        this.f4010i = z6;
        this.f4011j = z7;
    }

    public final U a(long j4) {
        if (j4 == this.f4004c) {
            return this;
        }
        return new U(this.f4002a, this.f4003b, j4, this.f4005d, this.f4006e, this.f4007f, this.f4008g, this.f4009h, this.f4010i, this.f4011j);
    }

    public final U b(long j4) {
        if (j4 == this.f4003b) {
            return this;
        }
        return new U(this.f4002a, j4, this.f4004c, this.f4005d, this.f4006e, this.f4007f, this.f4008g, this.f4009h, this.f4010i, this.f4011j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && U.class == obj.getClass()) {
            U u4 = (U) obj;
            if (this.f4003b == u4.f4003b && this.f4004c == u4.f4004c && this.f4005d == u4.f4005d && this.f4006e == u4.f4006e && this.f4007f == u4.f4007f && this.f4008g == u4.f4008g && this.f4009h == u4.f4009h && this.f4010i == u4.f4010i && this.f4011j == u4.f4011j && Objects.equals(this.f4002a, u4.f4002a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f4002a.hashCode() + 527) * 31) + ((int) this.f4003b)) * 31) + ((int) this.f4004c)) * 31) + ((int) this.f4005d)) * 31) + ((int) this.f4006e)) * 31) + (this.f4007f ? 1 : 0)) * 31) + (this.f4008g ? 1 : 0)) * 31) + (this.f4009h ? 1 : 0)) * 31) + (this.f4010i ? 1 : 0)) * 31) + (this.f4011j ? 1 : 0);
    }
}
