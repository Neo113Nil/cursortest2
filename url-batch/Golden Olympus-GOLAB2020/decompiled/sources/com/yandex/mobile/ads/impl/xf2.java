package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.t32;
import com.yandex.mobile.ads.impl.yb0;

/* loaded from: classes3.dex */
final class xf2 extends t32 {

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f34546b;

    /* renamed from: c, reason: collision with root package name */
    private final sf1 f34547c;

    /* renamed from: d, reason: collision with root package name */
    private int f34548d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34549e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f34550f;

    /* renamed from: g, reason: collision with root package name */
    private int f34551g;

    public xf2(p52 p52Var) {
        super(p52Var);
        this.f34546b = new sf1(s31.f31556a);
        this.f34547c = new sf1(4);
    }

    protected final boolean a(sf1 sf1Var) {
        int t4 = sf1Var.t();
        int i4 = (t4 >> 4) & 15;
        int i5 = t4 & 15;
        if (i5 != 7) {
            throw new t32.a(C1877de.a("Video format not supported: ", i5));
        }
        this.f34551g = i4;
        return i4 != 5;
    }

    protected final boolean a(long j4, sf1 sf1Var) {
        int t4 = sf1Var.t();
        long i4 = (sf1Var.i() * 1000) + j4;
        if (t4 == 0 && !this.f34549e) {
            sf1 sf1Var2 = new sf1(new byte[sf1Var.a()]);
            sf1Var.a(sf1Var2.c(), 0, sf1Var.a());
            C2278uh a4 = C2278uh.a(sf1Var2);
            this.f34548d = a4.f33125b;
            this.f32145a.a(new yb0.a().e("video/avc").a(a4.f33129f).o(a4.f33126c).f(a4.f33127d).b(a4.f33128e).a(a4.f33124a).a());
            this.f34549e = true;
            return false;
        }
        if (t4 != 1 || !this.f34549e) {
            return false;
        }
        int i5 = this.f34551g == 1 ? 1 : 0;
        if (!this.f34550f && i5 == 0) {
            return false;
        }
        byte[] c4 = this.f34547c.c();
        c4[0] = 0;
        c4[1] = 0;
        c4[2] = 0;
        int i6 = 4 - this.f34548d;
        int i7 = 0;
        while (sf1Var.a() > 0) {
            sf1Var.a(this.f34547c.c(), i6, this.f34548d);
            this.f34547c.e(0);
            int x4 = this.f34547c.x();
            this.f34546b.e(0);
            this.f32145a.a(4, this.f34546b);
            this.f32145a.a(x4, sf1Var);
            i7 = i7 + 4 + x4;
        }
        this.f32145a.a(i4, i5, i7, 0, null);
        this.f34550f = true;
        return true;
    }
}
