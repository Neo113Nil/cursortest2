package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;

/* loaded from: classes3.dex */
public final class bi0 implements q40 {

    /* renamed from: b, reason: collision with root package name */
    private p52 f23822b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23823c;

    /* renamed from: e, reason: collision with root package name */
    private int f23825e;

    /* renamed from: f, reason: collision with root package name */
    private int f23826f;

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f23821a = new sf1(10);

    /* renamed from: d, reason: collision with root package name */
    private long f23824d = -9223372036854775807L;

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(sf1 sf1Var) {
        if (this.f23822b == null) {
            throw new IllegalStateException();
        }
        if (this.f23823c) {
            int a4 = sf1Var.a();
            int i4 = this.f23826f;
            if (i4 < 10) {
                int min = Math.min(a4, 10 - i4);
                System.arraycopy(sf1Var.c(), sf1Var.d(), this.f23821a.c(), this.f23826f, min);
                if (this.f23826f + min == 10) {
                    this.f23821a.e(0);
                    if (73 != this.f23821a.t() || 68 != this.f23821a.t() || 51 != this.f23821a.t()) {
                        ms0.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f23823c = false;
                        return;
                    } else {
                        this.f23821a.f(3);
                        this.f23825e = this.f23821a.s() + 10;
                    }
                }
            }
            int min2 = Math.min(a4, this.f23825e - this.f23826f);
            this.f23822b.a(min2, sf1Var);
            this.f23826f += min2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void b() {
        int i4;
        p52 p52Var = this.f23822b;
        if (p52Var == null) {
            throw new IllegalStateException();
        }
        if (this.f23823c && (i4 = this.f23825e) != 0 && this.f23826f == i4) {
            long j4 = this.f23824d;
            if (j4 != -9223372036854775807L) {
                p52Var.a(j4, 1, i4, 0, null);
            }
            this.f23823c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(r70 r70Var, e72.d dVar) {
        dVar.a();
        p52 a4 = r70Var.a(dVar.c(), 5);
        this.f23822b = a4;
        a4.a(new yb0.a().b(dVar.b()).e("application/id3").a());
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(int i4, long j4) {
        if ((i4 & 4) == 0) {
            return;
        }
        this.f23823c = true;
        if (j4 != -9223372036854775807L) {
            this.f23824d = j4;
        }
        this.f23825e = 0;
        this.f23826f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a() {
        this.f23823c = false;
        this.f23824d = -9223372036854775807L;
    }
}
