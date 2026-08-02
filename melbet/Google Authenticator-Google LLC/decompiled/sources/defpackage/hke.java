package defpackage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hke extends hkn implements hkv {
    protected hke(Level level) {
        super(level);
    }

    @Override // defpackage.hkn
    protected final hoj a() {
        return hoh.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [hld] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [hld] */
    /* JADX WARN: Type inference failed for: r15v8, types: [hlg] */
    /* JADX WARN: Type inference failed for: r15v9, types: [hld] */
    /* JADX WARN: Type inference failed for: r4v14, types: [hld] */
    @Override // defpackage.hkn
    protected final boolean b(hkr hkrVar) {
        int a;
        int i;
        hkd hkdVar;
        hka hkaVar;
        ?? r15;
        hma k = k();
        int b = k.b();
        int i2 = 0;
        while (true) {
            if (i2 >= b) {
                break;
            }
            if (k.c(i2).a != "eye3tag") {
                i2++;
            } else if (k.d(hkl.a) == null) {
                hky hkyVar = hkl.i;
                if (k.d(hkyVar) == null) {
                    p(hkyVar, hlj.SMALL);
                }
            }
        }
        hkm hkmVar = this.c;
        if (hkmVar != null) {
            if (hkrVar != null) {
                long j = this.b;
                hks hksVar = hkd.a;
                hkc hkcVar = (hkc) hkmVar.d(hkl.d);
                if (hkcVar == null) {
                    hkdVar = null;
                } else {
                    hkd hkdVar2 = (hkd) hkd.a.b(hkrVar, hkmVar);
                    hoq.g(j >= 0, "timestamp cannot be negative");
                    AtomicLong atomicLong = hkdVar2.b;
                    long j2 = atomicLong.get();
                    if (j2 >= 0) {
                        long nanos = hkcVar.a.toNanos(1L) + j2;
                        if (nanos < 0 || j < nanos) {
                            hkdVar = hkd.c;
                        }
                    }
                    atomicLong.compareAndSet(j2, -j);
                    hkdVar = hkdVar2;
                }
                hkm hkmVar2 = this.c;
                hks hksVar2 = hka.a;
                if (((Integer) hkmVar2.d(hkl.b)) == null) {
                    hkaVar = null;
                } else {
                    hka hkaVar2 = (hka) hka.a.b(hkrVar, hkmVar2);
                    AtomicLong atomicLong2 = hkaVar2.b;
                    hkaVar = hkaVar2;
                    if (atomicLong2.incrementAndGet() < r5.intValue()) {
                        hkaVar = hka.c;
                    }
                }
                hld b2 = hld.b(hkdVar, hkaVar);
                hkm hkmVar3 = this.c;
                hks hksVar3 = hlg.a;
                Integer num = (Integer) hkmVar3.d(hkl.c);
                if (num == null || num.intValue() <= 0) {
                    r15 = 0;
                } else {
                    r15 = (hlg) hlg.a.b(hkrVar, hkmVar3);
                    if ((((Random) hlg.b.get()).nextInt(num.intValue()) == 0 ? r15.e.incrementAndGet() : r15.e.get()) <= 0) {
                        r15 = hlg.c;
                    }
                }
                hld b3 = hld.b(b2, r15);
                this.d = b3;
                if (b3 == hld.c) {
                    return false;
                }
            }
            hkm hkmVar4 = this.c;
            hky hkyVar2 = hkl.i;
            hlj hljVar = (hlj) hkmVar4.d(hkyVar2);
            if (hljVar != null) {
                hkm hkmVar5 = this.c;
                if (hkmVar5 != null && (a = hkmVar5.a(hkyVar2)) >= 0) {
                    int i3 = a + a;
                    int i4 = i3 + 2;
                    while (true) {
                        i = hkmVar5.b;
                        if (i4 >= i + i) {
                            break;
                        }
                        Object obj = hkmVar5.a[i4];
                        if (!obj.equals(hkyVar2)) {
                            Object[] objArr = hkmVar5.a;
                            objArr[i3] = obj;
                            objArr[i3 + 1] = objArr[i4 + 1];
                            i3 += 2;
                        }
                        i4 += 2;
                    }
                    hkmVar5.b = i - ((i4 - i3) >> 1);
                    while (i3 < i4) {
                        hkmVar5.a[i3] = null;
                        i3++;
                    }
                }
                hma k2 = k();
                hky hkyVar3 = hkl.a;
                p(hkyVar3, new hkt((Throwable) k2.d(hkyVar3), hljVar, hom.b(hkn.class, hljVar.f, 1)));
            }
        }
        return true;
    }
}
