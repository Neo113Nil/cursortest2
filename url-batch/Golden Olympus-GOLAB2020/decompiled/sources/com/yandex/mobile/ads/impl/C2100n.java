package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.tw1;

/* renamed from: com.yandex.mobile.ads.impl.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2100n implements p70 {

    /* renamed from: a, reason: collision with root package name */
    private final C2123o f29319a = new C2123o();

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f29320b = new sf1(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f29321c;

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.Da
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] a4;
                a4 = C2100n.a();
                return a4;
            }
        };
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f29319a.a(r70Var, new e72.d(Integer.MIN_VALUE, 0, 1));
        r70Var.a();
        r70Var.a(new tw1.b(-9223372036854775807L, 0L));
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final int a(q70 q70Var, hj1 hj1Var) {
        int read = ((lz) q70Var).read(this.f29320b.c(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f29320b.e(0);
        this.f29320b.d(read);
        if (!this.f29321c) {
            this.f29319a.a(4, 0L);
            this.f29321c = true;
        }
        this.f29319a.a(this.f29320b);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        this.f29321c = false;
        this.f29319a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p70[] a() {
        return new p70[]{new C2100n()};
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        lz lzVar;
        sf1 sf1Var = new sf1(10);
        int i4 = 0;
        while (true) {
            lzVar = (lz) q70Var;
            lzVar.b(sf1Var.c(), 0, 10, false);
            sf1Var.e(0);
            if (sf1Var.w() != 4801587) {
                break;
            }
            sf1Var.f(3);
            int s4 = sf1Var.s();
            i4 += s4 + 10;
            lzVar.a(false, s4);
        }
        lzVar.c();
        lzVar.a(false, i4);
        int i5 = 0;
        int i6 = i4;
        while (true) {
            lzVar.b(sf1Var.c(), 0, 6, false);
            sf1Var.e(0);
            if (sf1Var.z() != 2935) {
                lzVar.c();
                i6++;
                if (i6 - i4 >= 8192) {
                    return false;
                }
                lzVar.a(false, i6);
                i5 = 0;
            } else {
                i5++;
                if (i5 >= 4) {
                    return true;
                }
                int a4 = C2146p.a(sf1Var.c());
                if (a4 == -1) {
                    return false;
                }
                lzVar.a(false, a4 - 6);
            }
        }
    }
}
