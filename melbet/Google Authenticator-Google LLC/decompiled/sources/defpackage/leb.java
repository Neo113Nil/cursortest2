package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class leb {
    private final kuk a;
    public final kuk b;
    public final kuj c;
    public final kui d;
    public final kry e;
    private final kuj f;

    public leb() {
        kul kulVar = kul.a;
        this.f = new kuj(0L, kulVar);
        this.c = new kuj(0L, kulVar);
        led ledVar = new led(0L, null, 2);
        this.a = new kuk(ledVar, kulVar);
        this.b = new kuk(ledVar, kulVar);
        this.d = new kui(1, kulVar);
        this.e = new ldv(this, 2);
    }

    public final void d() {
        kui kuiVar;
        int i;
        do {
            kuiVar = this.d;
            i = kuiVar.b;
            if (i <= 1) {
                return;
            }
        } while (!kuiVar.d(i, 1));
    }

    public final void e() {
        Object a;
        long j;
        led ledVar;
        while (true) {
            int b = this.d.b();
            if (b > 0) {
                d();
                throw new IllegalStateException("The number of released permits cannot be greater than 1");
            }
            if (b >= 0) {
                return;
            }
            kuk kukVar = this.a;
            led ledVar2 = (led) kukVar.a;
            long b2 = this.f.b();
            long j2 = lec.f;
            long j3 = b2 / j2;
            lea leaVar = lea.a;
            while (true) {
                a = lbw.a(ledVar2, j3, leaVar);
                if (lcz.a(a)) {
                    j = b2;
                    break;
                }
                lbx b3 = lcz.b(a);
                while (true) {
                    lbx lbxVar = (lbx) kukVar.a;
                    ledVar = ledVar2;
                    j = b2;
                    if (lbxVar.b >= b3.b) {
                        break;
                    }
                    if (!b3.u()) {
                        break;
                    }
                    if (!kukVar.d(lbxVar, b3)) {
                        if (b3.s()) {
                            b3.p();
                        }
                        ledVar2 = ledVar;
                        b2 = j;
                    } else if (lbxVar.s()) {
                        lbxVar.p();
                    }
                }
                ledVar2 = ledVar;
                b2 = j;
            }
            led ledVar3 = (led) lcz.b(a);
            ledVar3.o();
            if (ledVar3.b <= j3) {
                int i = (int) (j % j2);
                bst bstVar = ledVar3.c;
                ldb ldbVar = lec.b;
                Object a2 = bstVar.A(i).a(ldbVar);
                if (a2 == null) {
                    int i2 = lec.a;
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (bstVar.A(i).a == lec.c) {
                            return;
                        }
                    }
                    if (!bstVar.A(i).d(ldbVar, lec.d)) {
                        return;
                    }
                } else if (a2 == lec.e) {
                    continue;
                } else {
                    if (!(a2 instanceof kuv)) {
                        if (a2 instanceof ldu) {
                            throw null;
                        }
                        Objects.toString(a2);
                        throw new IllegalStateException("unexpected: ".concat(a2.toString()));
                    }
                    kuv kuvVar = (kuv) a2;
                    Object i4 = kuvVar.i(kow.a, this.e);
                    if (i4 != null) {
                        kuvVar.a(i4);
                        return;
                    }
                }
            }
        }
    }
}
