package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class m40 implements q40 {

    /* renamed from: a, reason: collision with root package name */
    private final List<e72.a> f28871a;

    /* renamed from: b, reason: collision with root package name */
    private final p52[] f28872b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28873c;

    /* renamed from: d, reason: collision with root package name */
    private int f28874d;

    /* renamed from: e, reason: collision with root package name */
    private int f28875e;

    /* renamed from: f, reason: collision with root package name */
    private long f28876f = -9223372036854775807L;

    public m40(List<e72.a> list) {
        this.f28871a = list;
        this.f28872b = new p52[list.size()];
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(sf1 sf1Var) {
        if (this.f28873c) {
            if (this.f28874d == 2) {
                if (sf1Var.a() == 0) {
                    return;
                }
                if (sf1Var.t() != 32) {
                    this.f28873c = false;
                }
                this.f28874d--;
                if (!this.f28873c) {
                    return;
                }
            }
            if (this.f28874d == 1) {
                if (sf1Var.a() == 0) {
                    return;
                }
                if (sf1Var.t() != 0) {
                    this.f28873c = false;
                }
                this.f28874d--;
                if (!this.f28873c) {
                    return;
                }
            }
            int d4 = sf1Var.d();
            int a4 = sf1Var.a();
            for (p52 p52Var : this.f28872b) {
                sf1Var.e(d4);
                p52Var.a(a4, sf1Var);
            }
            this.f28875e += a4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void b() {
        if (this.f28873c) {
            if (this.f28876f != -9223372036854775807L) {
                for (p52 p52Var : this.f28872b) {
                    p52Var.a(this.f28876f, 1, this.f28875e, 0, null);
                }
            }
            this.f28873c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(r70 r70Var, e72.d dVar) {
        for (int i4 = 0; i4 < this.f28872b.length; i4++) {
            e72.a aVar = this.f28871a.get(i4);
            dVar.a();
            p52 a4 = r70Var.a(dVar.c(), 3);
            a4.a(new yb0.a().b(dVar.b()).e("application/dvbsubs").a(Collections.singletonList(aVar.f25124b)).d(aVar.f25123a).a());
            this.f28872b[i4] = a4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(int i4, long j4) {
        if ((i4 & 4) == 0) {
            return;
        }
        this.f28873c = true;
        if (j4 != -9223372036854775807L) {
            this.f28876f = j4;
        }
        this.f28875e = 0;
        this.f28874d = 2;
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a() {
        this.f28873c = false;
        this.f28876f = -9223372036854775807L;
    }
}
