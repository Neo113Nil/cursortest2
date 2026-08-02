package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kwk extends kwf implements kvu {
    private final kuh a;
    public final kuk e;
    public final kuk f;

    public kwk() {
        kul kulVar = kul.a;
        this.e = new kuk(null, kulVar);
        this.f = new kuk(null, kulVar);
        this.a = new kuh(false, kulVar);
    }

    private final void x() {
        ldh ldhVar;
        kwj kwjVar = (kwj) this.f.a;
        if (kwjVar == null || kwjVar.g()) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (kwjVar) {
                ldh b = kwjVar.b();
                ldhVar = null;
                if (b != null) {
                    kwi kwiVar = (kwi) b;
                    if (nanoTime - kwiVar.b >= 0 && y(kwiVar)) {
                        ldhVar = kwjVar.d(0);
                    }
                }
            }
        } while (((kwi) ldhVar) != null);
    }

    private final boolean y(Runnable runnable) {
        while (true) {
            kuk kukVar = this.e;
            Object obj = kukVar.a;
            if (v()) {
                return false;
            }
            if (obj == null) {
                if (kukVar.d(null, runnable)) {
                    return true;
                }
            } else if (obj instanceof lcu) {
                lcu lcuVar = (lcu) obj;
                int a = lcuVar.a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a != 1) {
                    return false;
                }
                kukVar.d(obj, lcuVar.c());
            } else {
                if (obj == kwl.b) {
                    return false;
                }
                lcu lcuVar2 = new lcu(8, true);
                lcuVar2.a((Runnable) obj);
                lcuVar2.a(runnable);
                if (kukVar.d(obj, lcuVar2)) {
                    return true;
                }
            }
        }
    }

    @Override // defpackage.kvj
    public final void a(kqn kqnVar, Runnable runnable) {
        i(runnable);
    }

    @Override // defpackage.kvu
    public final void c(long j, kuv kuvVar) {
        long a = kwl.a(j);
        if (a < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            kwg kwgVar = new kwg(this, a + nanoTime, kuvVar);
            u(nanoTime, kwgVar);
            ixg.d(kuvVar, kwgVar);
        }
    }

    public /* bridge */ kwc h(long j, Runnable runnable, kqn kqnVar) {
        return kvr.a.h(j, runnable, kqnVar);
    }

    public void i(Runnable runnable) {
        x();
        if (y(runnable)) {
            s();
        } else {
            kvq.a.i(runnable);
        }
    }

    @Override // defpackage.kwf
    public void k() {
        ldh d;
        ThreadLocal threadLocal = kxv.a;
        kxv.a.set(null);
        this.a.c();
        boolean z = kvo.a;
        while (true) {
            kuk kukVar = this.e;
            Object obj = kukVar.a;
            if (obj == null) {
                if (kukVar.d(null, kwl.b)) {
                    break;
                }
            } else if (obj instanceof lcu) {
                ((lcu) obj).d();
                break;
            } else {
                if (obj == kwl.b) {
                    break;
                }
                lcu lcuVar = new lcu(8, true);
                lcuVar.a((Runnable) obj);
                if (kukVar.d(obj, lcuVar)) {
                    break;
                }
            }
        }
        while (l() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            kwj kwjVar = (kwj) this.f.a;
            if (kwjVar == null) {
                return;
            }
            synchronized (kwjVar) {
                d = kwjVar.a() > 0 ? kwjVar.d(0) : null;
            }
            kwi kwiVar = (kwi) d;
            if (kwiVar == null) {
                return;
            } else {
                j(nanoTime, kwiVar);
            }
        }
    }

    @Override // defpackage.kwf
    public final long l() {
        Runnable runnable;
        kwi kwiVar;
        if (r()) {
            return 0L;
        }
        x();
        kuk kukVar = this.e;
        while (true) {
            Object obj = kukVar.a;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof lcu)) {
                if (obj == kwl.b) {
                    break;
                }
                if (kukVar.d(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                lcu lcuVar = (lcu) obj;
                Object b = lcuVar.b();
                if (b != lcu.a) {
                    runnable = (Runnable) b;
                    break;
                }
                kukVar.d(obj, lcuVar.c());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        kpi kpiVar = this.d;
        if (((kpiVar == null || kpiVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = kukVar.a;
        if (obj2 != null) {
            if (!(obj2 instanceof lcu)) {
                return obj2 == kwl.b ? Long.MAX_VALUE : 0L;
            }
            if (!((lcu) obj2).e()) {
                return 0L;
            }
        }
        kwj kwjVar = (kwj) this.f.a;
        if (kwjVar == null || (kwiVar = (kwi) kwjVar.c()) == null) {
            return Long.MAX_VALUE;
        }
        return ksl.h(kwiVar.b - System.nanoTime(), 0L);
    }

    protected final kwc t(long j, Runnable runnable) {
        long a = kwl.a(j);
        if (a >= 4611686018427387903L) {
            return kxi.a;
        }
        long nanoTime = System.nanoTime();
        kwh kwhVar = new kwh(a + nanoTime, runnable);
        u(nanoTime, kwhVar);
        return kwhVar;
    }

    public final void u(long j, kwi kwiVar) {
        if (!v()) {
            kuk kukVar = this.f;
            kwj kwjVar = (kwj) kukVar.a;
            if (kwjVar == null) {
                kukVar.d(null, new kwj(j));
                Object obj = kukVar.a;
                obj.getClass();
                kwjVar = (kwj) obj;
            }
            synchronized (kwiVar) {
                if (kwiVar._heap == kwl.a) {
                    return;
                }
                synchronized (kwjVar) {
                    kwi kwiVar2 = (kwi) kwjVar.b();
                    if (!v()) {
                        if (kwiVar2 == null) {
                            kwjVar.a = j;
                        } else {
                            long j2 = kwiVar2.b;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            long j3 = kwjVar.a;
                            if (j - j3 > 0) {
                                kwjVar.a = j;
                            } else {
                                j = j3;
                            }
                        }
                        if (kwiVar.b - j < 0) {
                            kwiVar.b = j;
                        }
                        boolean z = kvo.a;
                        kwiVar.d(kwjVar);
                        ldh[] ldhVarArr = kwjVar.b;
                        if (ldhVarArr == null) {
                            ldhVarArr = new ldh[4];
                            kwjVar.b = ldhVarArr;
                        } else if (kwjVar.a() >= ldhVarArr.length) {
                            int a = kwjVar.a();
                            Object[] copyOf = Arrays.copyOf(ldhVarArr, a + a);
                            copyOf.getClass();
                            ldhVarArr = (ldh[]) copyOf;
                            kwjVar.b = ldhVarArr;
                        }
                        int a2 = kwjVar.a();
                        kwjVar.e(a2 + 1);
                        ldhVarArr[a2] = kwiVar;
                        kwiVar.e(a2);
                        kwjVar.f(a2);
                        kwj kwjVar2 = (kwj) kukVar.a;
                        if ((kwjVar2 != null ? (kwi) kwjVar2.c() : null) == kwiVar) {
                            s();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        j(j, kwiVar);
    }

    public final boolean v() {
        return this.a.a();
    }

    protected final boolean w() {
        if (!q()) {
            return false;
        }
        kwj kwjVar = (kwj) this.f.a;
        if (kwjVar != null && !kwjVar.g()) {
            return false;
        }
        Object obj = this.e.a;
        if (obj == null) {
            return true;
        }
        return obj instanceof lcu ? ((lcu) obj).e() : obj == kwl.b;
    }
}
