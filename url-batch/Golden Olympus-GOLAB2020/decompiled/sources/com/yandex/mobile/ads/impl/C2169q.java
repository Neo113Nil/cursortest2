package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.tw1;

/* renamed from: com.yandex.mobile.ads.impl.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2169q implements p70 {

    /* renamed from: a, reason: collision with root package name */
    private final r f30625a = new r();

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f30626b = new sf1(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f30627c;

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.Cc
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] a4;
                a4 = C2169q.a();
                return a4;
            }
        };
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f30625a.a(r70Var, new e72.d(Integer.MIN_VALUE, 0, 1));
        r70Var.a();
        r70Var.a(new tw1.b(-9223372036854775807L, 0L));
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final int a(q70 q70Var, hj1 hj1Var) {
        int read = ((lz) q70Var).read(this.f30626b.c(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f30626b.e(0);
        this.f30626b.d(read);
        if (!this.f30627c) {
            this.f30625a.a(4, 0L);
            this.f30627c = true;
        }
        this.f30625a.a(this.f30626b);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        this.f30627c = false;
        this.f30625a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p70[] a() {
        return new p70[]{new C2169q()};
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        lz lzVar;
        int i4;
        sf1 sf1Var = new sf1(10);
        int i5 = 0;
        while (true) {
            lzVar = (lz) q70Var;
            lzVar.b(sf1Var.c(), 0, 10, false);
            sf1Var.e(0);
            if (sf1Var.w() != 4801587) {
                break;
            }
            sf1Var.f(3);
            int s4 = sf1Var.s();
            i5 += s4 + 10;
            lzVar.a(false, s4);
        }
        lzVar.c();
        lzVar.a(false, i5);
        int i6 = 0;
        int i7 = i5;
        while (true) {
            int i8 = 7;
            lzVar.b(sf1Var.c(), 0, 7, false);
            sf1Var.e(0);
            int z4 = sf1Var.z();
            if (z4 == 44096 || z4 == 44097) {
                i6++;
                if (i6 >= 4) {
                    return true;
                }
                byte[] c4 = sf1Var.c();
                if (c4.length < 7) {
                    i4 = -1;
                } else {
                    int i9 = ((c4[2] & 255) << 8) | (c4[3] & 255);
                    if (i9 == 65535) {
                        i9 = ((c4[4] & 255) << 16) | ((c4[5] & 255) << 8) | (c4[6] & 255);
                    } else {
                        i8 = 4;
                    }
                    if (z4 == 44097) {
                        i8 += 2;
                    }
                    i4 = i9 + i8;
                }
                if (i4 == -1) {
                    return false;
                }
                lzVar.a(false, i4 - 7);
            } else {
                lzVar.c();
                i7++;
                if (i7 - i5 >= 8192) {
                    return false;
                }
                lzVar.a(false, i7);
                i6 = 0;
            }
        }
    }
}
