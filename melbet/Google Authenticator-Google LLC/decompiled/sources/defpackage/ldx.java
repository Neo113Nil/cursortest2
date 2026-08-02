package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldx extends leb {
    public final kuk a = new kuk(ldy.a, kul.a);

    public final boolean a() {
        return Math.max(this.d.b, 0) == 0;
    }

    public final Object b(kqj kqjVar) {
        Object a;
        long j;
        led ledVar;
        while (true) {
            kui kuiVar = this.d;
            int i = kuiVar.b;
            int i2 = 1;
            if (i > 1) {
                super.d();
            } else {
                if (i <= 0) {
                    kuw c = ixg.c(ixe.d(kqjVar));
                    try {
                        ldw ldwVar = new ldw(this, c);
                        while (true) {
                            int andDecrement = kui.a.getAndDecrement(kuiVar);
                            if (andDecrement <= i2) {
                                if (andDecrement > 0) {
                                    ldwVar.k(kow.a);
                                    break;
                                }
                                kuk kukVar = this.b;
                                led ledVar2 = (led) kukVar.a;
                                long b = this.c.b();
                                ldz ldzVar = ldz.a;
                                long j2 = lec.f;
                                long j3 = b / j2;
                                while (true) {
                                    a = lbw.a(ledVar2, j3, ldzVar);
                                    if (!lcz.a(a)) {
                                        lbx b2 = lcz.b(a);
                                        while (true) {
                                            lbx lbxVar = (lbx) kukVar.a;
                                            ledVar = ledVar2;
                                            j = b;
                                            if (lbxVar.b >= b2.b) {
                                                break;
                                            }
                                            if (!b2.u()) {
                                                break;
                                            }
                                            if (!kukVar.d(lbxVar, b2)) {
                                                if (b2.s()) {
                                                    b2.p();
                                                }
                                                ledVar2 = ledVar;
                                                b = j;
                                            } else if (lbxVar.s()) {
                                                lbxVar.p();
                                            }
                                        }
                                    } else {
                                        j = b;
                                        break;
                                    }
                                    ledVar2 = ledVar;
                                    b = j;
                                }
                                led ledVar3 = (led) lcz.b(a);
                                int i3 = (int) (j % j2);
                                bst bstVar = ledVar3.c;
                                if (bstVar.A(i3).d(null, ldwVar)) {
                                    ldwVar.a.D(ledVar3, i3);
                                    break;
                                }
                                if (bstVar.A(i3).d(lec.b, lec.c)) {
                                    ldwVar.k(kow.a);
                                    break;
                                }
                                boolean z = kvo.a;
                                i2 = 1;
                            }
                        }
                        Object l = c.l();
                        kqp kqpVar = kqp.a;
                        if (l == kqpVar) {
                            kqjVar.getClass();
                        }
                        return l != kqpVar ? kow.a : l;
                    } catch (Throwable th) {
                        c.A();
                        throw th;
                    }
                }
                if (kuiVar.d(1, 0)) {
                    boolean z2 = kvo.a;
                    this.a.c(null);
                    return kow.a;
                }
            }
        }
    }

    public final void c() {
        while (a()) {
            kuk kukVar = this.a;
            Object obj = kukVar.a;
            ldb ldbVar = ldy.a;
            if (obj != ldbVar && kukVar.d(obj, ldbVar)) {
                e();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + kvp.b(this) + "[isLocked=" + a() + ",owner=" + this.a.a + "]";
    }
}
