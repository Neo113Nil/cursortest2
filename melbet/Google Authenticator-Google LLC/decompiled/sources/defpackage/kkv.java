package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkv implements kfi {
    final kkw a;
    public final /* synthetic */ kky b;

    public kkv(kky kkyVar, kkw kkwVar) {
        this.b = kkyVar;
        this.a = kkwVar;
    }

    private static final Integer b(kaa kaaVar) {
        String str = (String) kaaVar.c(kky.b);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0269  */
    @Override // defpackage.kfi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kbq kbqVar, kfh kfhVar, kaa kaaVar) {
        boolean z;
        boolean z2;
        long j;
        kks kksVar;
        String str;
        kky kkyVar = this.b;
        synchronized (kkyVar.m) {
            kku kkuVar = kkyVar.r;
            kkw kkwVar = this.a;
            kkwVar.b = true;
            Collection collection = kkuVar.c;
            if (collection.contains(kkwVar)) {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.remove(kkwVar);
                kkuVar = new kku(kkuVar.b, DesugarCollections.unmodifiableCollection(arrayList), kkuVar.d, kkuVar.f, kkuVar.g, kkuVar.a, kkuVar.h, kkuVar.e);
            }
            kkyVar.r = kkuVar;
            kkyVar.q.a(kbqVar.o);
        }
        kky kkyVar2 = this.b;
        if (kkyVar2.u.decrementAndGet() == Integer.MIN_VALUE) {
            kkyVar2.h.execute(new kkh(this, 4));
            return;
        }
        kkw kkwVar2 = this.a;
        if (kkwVar2.c) {
            kkyVar2.d(kkwVar2);
            if (kkyVar2.r.f == kkwVar2) {
                kkyVar2.v(kbqVar, kfhVar, kaaVar);
                return;
            }
            return;
        }
        kfh kfhVar2 = kfh.d;
        if (kfhVar == kfhVar2 && kkyVar2.t.incrementAndGet() > 1000) {
            kkyVar2.d(kkwVar2);
            if (kkyVar2.r.f == kkwVar2) {
                kbn kbnVar = kbn.INTERNAL;
                Charset charset = khd.a;
                kbq a = kbnVar.a();
                String str2 = kbqVar.p;
                if (str2 == null) {
                    str = kbqVar.o.toString();
                } else {
                    str = kbqVar.o.toString() + ": " + str2;
                }
                kkyVar2.v(a.e("Too many transparent retries. Might be a bug in gRPC: ".concat(String.valueOf(str))).d(kbqVar.q), kfhVar, kaaVar);
                return;
            }
            return;
        }
        if (kkyVar2.r.f == null) {
            if (kfhVar == kfhVar2 || (kfhVar == kfh.b && kkyVar2.s.compareAndSet(false, true))) {
                kky kkyVar3 = this.b;
                kkw kkwVar3 = this.a;
                kkw b = kkyVar3.b(kkwVar3.d, true, false);
                if (b != null) {
                    if (kkyVar3.l) {
                        synchronized (kkyVar3.m) {
                            kku kkuVar2 = kkyVar3.r;
                            ArrayList arrayList2 = new ArrayList(kkuVar2.d);
                            arrayList2.remove(kkwVar3);
                            arrayList2.add(b);
                            kkyVar3.r = new kku(kkuVar2.b, kkuVar2.c, DesugarCollections.unmodifiableCollection(arrayList2), kkuVar2.f, kkuVar2.g, kkuVar2.a, kkuVar2.h, kkuVar2.e);
                        }
                    }
                    this.b.g.execute(new kga(this, b, 20));
                    return;
                }
                return;
            }
            if (kfhVar != kfh.c) {
                kkyVar2.s.set(true);
                if (kkyVar2.l) {
                    Integer b2 = b(kaaVar);
                    kky kkyVar4 = this.b;
                    boolean contains = kkyVar4.k.c.contains(kbqVar.o);
                    boolean z3 = (kkyVar4.p == null || (!contains && (b2 == null || b2.intValue() >= 0))) ? false : !r7.b();
                    if (contains && !z3 && !kbqVar.g() && b2 != null && b2.intValue() > 0) {
                        b2 = 0;
                    }
                    boolean z4 = contains && !z3;
                    if (z4 && b2 != null) {
                        if (b2.intValue() < 0) {
                            kkyVar4.u();
                        } else {
                            Object obj = kkyVar4.m;
                            synchronized (obj) {
                                kks kksVar2 = kkyVar4.y;
                                if (kksVar2 != null) {
                                    Future a2 = kksVar2.a();
                                    kks kksVar3 = new kks(obj);
                                    kkyVar4.y = kksVar3;
                                    if (a2 != null) {
                                        a2.cancel(false);
                                    }
                                    kksVar3.b(kkyVar4.i.schedule(new cns(kkyVar4, kksVar3, 2), b2.intValue(), TimeUnit.MILLISECONDS));
                                }
                            }
                        }
                    }
                    kky kkyVar5 = this.b;
                    synchronized (kkyVar5.m) {
                        kku kkuVar3 = kkyVar5.r;
                        kkw kkwVar4 = this.a;
                        ArrayList arrayList3 = new ArrayList(kkuVar3.d);
                        arrayList3.remove(kkwVar4);
                        kkyVar5.r = new kku(kkuVar3.b, kkuVar3.c, DesugarCollections.unmodifiableCollection(arrayList3), kkuVar3.f, kkuVar3.g, kkuVar3.a, kkuVar3.h, kkuVar3.e);
                        if (z4 && (kkyVar5.w(kkyVar5.r) || !kkyVar5.r.d.isEmpty())) {
                            return;
                        }
                    }
                } else {
                    kkz kkzVar = kkyVar2.j;
                    if (kkzVar == null) {
                        z = false;
                    } else {
                        boolean contains2 = kkzVar.f.contains(kbqVar.o);
                        Integer b3 = b(kaaVar);
                        boolean z5 = (kkyVar2.p == null || (!contains2 && (b3 == null || b3.intValue() >= 0))) ? false : !r14.b();
                        if (kkzVar.a > kkwVar2.d + 1 && !z5) {
                            if (b3 != null) {
                                z2 = true;
                                if (b3.intValue() >= 0) {
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(b3.intValue());
                                    kkyVar2.z = kkzVar.b;
                                    j = nanos;
                                }
                                z = false;
                            } else if (contains2) {
                                long j2 = kkyVar2.z;
                                double nextDouble = kky.e ? (kky.d.nextDouble() * 0.4d) + 0.8d : kky.d.nextDouble();
                                z2 = true;
                                kkyVar2.z = Math.min((long) (kkyVar2.z * kkzVar.d), kkzVar.c);
                                j = (long) (j2 * nextDouble);
                            }
                            z = z2;
                            if (z) {
                                kkw b4 = kkyVar2.b(kkwVar2.d + 1, false, false);
                                if (b4 != null) {
                                    Object obj2 = kkyVar2.m;
                                    synchronized (obj2) {
                                        kksVar = new kks(obj2);
                                        kkyVar2.x = kksVar;
                                    }
                                    kksVar.b(this.b.i.schedule(new kfu(this, kksVar, b4, 4), j, TimeUnit.NANOSECONDS));
                                    return;
                                }
                                return;
                            }
                        }
                        z = false;
                    }
                    j = 0;
                    if (z) {
                    }
                }
            } else if (kkyVar2.l) {
                kkyVar2.u();
            }
        }
        kky kkyVar6 = this.b;
        kkw kkwVar5 = this.a;
        kkyVar6.d(kkwVar5);
        if (kkyVar6.r.f == kkwVar5) {
            kkyVar6.v(kbqVar, kfhVar, kaaVar);
        }
    }

    @Override // defpackage.kfi
    public final void c(kaa kaaVar) {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        kkw kkwVar = this.a;
        int i3 = kkwVar.d;
        if (i3 > 0) {
            jzw jzwVar = kky.a;
            kaaVar.f(jzwVar);
            kaaVar.h(jzwVar, String.valueOf(i3));
        }
        kky kkyVar = this.b;
        kkyVar.d(kkwVar);
        if (kkyVar.r.f == kkwVar) {
            kkx kkxVar = kkyVar.p;
            if (kkxVar != null) {
                do {
                    atomicInteger = kkxVar.d;
                    i = atomicInteger.get();
                    i2 = kkxVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, Math.min(kkxVar.c + i, i2)));
            }
            kkyVar.h.execute(new kga(this, kaaVar, 18, null));
        }
    }

    @Override // defpackage.kmp
    public final void d(kmo kmoVar) {
        kky kkyVar = this.b;
        kkw kkwVar = kkyVar.r.f;
        hoq.I(kkwVar != null, "Headers should be received prior to messages.");
        if (kkwVar != this.a) {
            khd.e(kmoVar);
        } else {
            kkyVar.h.execute(new kyf(this, kmoVar, 1));
        }
    }

    @Override // defpackage.kmp
    public final void e() {
        kky kkyVar = this.b;
        if (kkyVar.k()) {
            kkyVar.h.execute(new kkh(this, 5));
        }
    }
}
