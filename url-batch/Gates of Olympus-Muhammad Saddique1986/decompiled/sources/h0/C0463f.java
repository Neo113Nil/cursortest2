package h0;

import b0.C0352v;
import b0.M;
import m.AbstractC0625j;

/* renamed from: h0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463f {

    /* renamed from: k, reason: collision with root package name */
    public static final A1.i f5949k = new A1.i(23, false);

    /* renamed from: l, reason: collision with root package name */
    public static int f5950l;

    /* renamed from: a, reason: collision with root package name */
    public final String f5951a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5952b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5953c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5954d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5955e;

    /* renamed from: f, reason: collision with root package name */
    public final C0453F f5956f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5957g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5958h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5959i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5960j;

    public C0463f(String str, float f3, float f4, float f5, float f6, C0453F c0453f, long j3, int i3, boolean z3) {
        int i4;
        synchronized (f5949k) {
            i4 = f5950l;
            f5950l = i4 + 1;
        }
        this.f5951a = str;
        this.f5952b = f3;
        this.f5953c = f4;
        this.f5954d = f5;
        this.f5955e = f6;
        this.f5956f = c0453f;
        this.f5957g = j3;
        this.f5958h = i3;
        this.f5959i = z3;
        this.f5960j = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0463f)) {
            return false;
        }
        C0463f c0463f = (C0463f) obj;
        return f2.j.a(this.f5951a, c0463f.f5951a) && O0.e.a(this.f5952b, c0463f.f5952b) && O0.e.a(this.f5953c, c0463f.f5953c) && this.f5954d == c0463f.f5954d && this.f5955e == c0463f.f5955e && this.f5956f.equals(c0463f.f5956f) && C0352v.c(this.f5957g, c0463f.f5957g) && M.p(this.f5958h, c0463f.f5958h) && this.f5959i == c0463f.f5959i;
    }

    public final int hashCode() {
        int hashCode = (this.f5956f.hashCode() + A.k.a(this.f5955e, A.k.a(this.f5954d, A.k.a(this.f5953c, A.k.a(this.f5952b, this.f5951a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i3 = C0352v.f5440h;
        return Boolean.hashCode(this.f5959i) + AbstractC0625j.a(this.f5958h, A.k.c(hashCode, 31, this.f5957g), 31);
    }
}
