package h0;

import H2.AbstractC0080b;
import b0.AbstractC0259J;
import b0.C0288u;

/* renamed from: h0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425f {

    /* renamed from: k, reason: collision with root package name */
    public static final F0.a f4959k = new F0.a(24);

    /* renamed from: l, reason: collision with root package name */
    public static int f4960l;

    /* renamed from: a, reason: collision with root package name */
    public final String f4961a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4962b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4963c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4964d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4965e;

    /* renamed from: f, reason: collision with root package name */
    public final F f4966f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4967g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4968h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4969i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4970j;

    public C0425f(String str, float f3, float f4, float f5, float f6, F f7, long j3, int i3, boolean z3) {
        int i4;
        synchronized (f4959k) {
            i4 = f4960l;
            f4960l = i4 + 1;
        }
        this.f4961a = str;
        this.f4962b = f3;
        this.f4963c = f4;
        this.f4964d = f5;
        this.f4965e = f6;
        this.f4966f = f7;
        this.f4967g = j3;
        this.f4968h = i3;
        this.f4969i = z3;
        this.f4970j = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0425f)) {
            return false;
        }
        C0425f c0425f = (C0425f) obj;
        return Z1.i.a(this.f4961a, c0425f.f4961a) && M0.e.a(this.f4962b, c0425f.f4962b) && M0.e.a(this.f4963c, c0425f.f4963c) && this.f4964d == c0425f.f4964d && this.f4965e == c0425f.f4965e && this.f4966f.equals(c0425f.f4966f) && C0288u.c(this.f4967g, c0425f.f4967g) && AbstractC0259J.n(this.f4968h, c0425f.f4968h) && this.f4969i == c0425f.f4969i;
    }

    public final int hashCode() {
        int hashCode = (this.f4966f.hashCode() + AbstractC0080b.a(this.f4965e, AbstractC0080b.a(this.f4964d, AbstractC0080b.a(this.f4963c, AbstractC0080b.a(this.f4962b, this.f4961a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i3 = C0288u.f4297g;
        return Boolean.hashCode(this.f4969i) + AbstractC0080b.b(this.f4968h, AbstractC0080b.d(hashCode, 31, this.f4967g), 31);
    }
}
