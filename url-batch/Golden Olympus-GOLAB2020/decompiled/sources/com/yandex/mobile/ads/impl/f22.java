package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
public final class f22 implements r70 {

    /* renamed from: b, reason: collision with root package name */
    private final long f25594b;

    /* renamed from: c, reason: collision with root package name */
    private final r70 f25595c;

    public f22(long j4, r70 r70Var) {
        this.f25594b = j4;
        this.f25595c = r70Var;
    }

    final class a implements tw1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ tw1 f25596a;

        a(tw1 tw1Var) {
            this.f25596a = tw1Var;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final tw1.a b(long j4) {
            tw1.a b4 = this.f25596a.b(j4);
            vw1 vw1Var = b4.f32717a;
            long j5 = vw1Var.f33815a;
            long j6 = vw1Var.f33816b;
            long j7 = f22.this.f25594b;
            vw1 vw1Var2 = new vw1(j5, j6 + j7);
            vw1 vw1Var3 = b4.f32718b;
            return new tw1.a(vw1Var2, new vw1(vw1Var3.f33815a, vw1Var3.f33816b + j7));
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final long c() {
            return this.f25596a.c();
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final boolean b() {
            return this.f25596a.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.r70
    public final void a() {
        this.f25595c.a();
    }

    @Override // com.yandex.mobile.ads.impl.r70
    public final void a(tw1 tw1Var) {
        this.f25595c.a(new a(tw1Var));
    }

    @Override // com.yandex.mobile.ads.impl.r70
    public final p52 a(int i4, int i5) {
        return this.f25595c.a(i4, i5);
    }
}
