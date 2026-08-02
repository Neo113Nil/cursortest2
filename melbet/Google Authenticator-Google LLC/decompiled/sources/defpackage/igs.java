package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igs extends hmx {
    public static final /* synthetic */ int d = 0;
    private static final long e;
    public final Executor a;
    public final hac b;
    public final ikj c;
    private final Context f;
    private final koe g;
    private final iha h;
    private final koe i;
    private final boolean j;
    private volatile esi k;
    private final ikj l;
    private final ikg m;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        e = 3600L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igs(Context context, ckb ckbVar, erx erxVar, Executor executor, koe koeVar, ikg ikgVar, koe koeVar2, boolean z, ikj ikjVar) {
        super(null);
        ikj ikjVar2 = new ikj(context, ckbVar);
        this.f = context;
        this.c = ikjVar2;
        this.a = executor;
        this.i = koeVar;
        this.m = ikgVar;
        this.j = z;
        this.l = ikjVar;
        igq igqVar = new igq(context, koeVar2, koeVar);
        this.g = igqVar;
        this.h = new iha(e, igqVar);
        this.b = hoq.v(new dxi(erxVar, context, 20, null));
    }

    private final void e(ihj ihjVar, hvi hviVar) {
        hvi a;
        ikj ikjVar = this.l;
        if (ikjVar != null) {
            long c = ihjVar.c(null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = (-86400000) + elapsedRealtime;
            if (j > 0) {
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ikjVar.a;
                for (igx igxVar = (igx) concurrentLinkedQueue.peek(); igxVar != null && igxVar.a <= j; igxVar = (igx) concurrentLinkedQueue.peek()) {
                    if (concurrentLinkedQueue.remove(igxVar)) {
                        ((AtomicLong) ikjVar.b).addAndGet(-igxVar.b);
                    }
                }
            }
            AtomicLong atomicLong = (AtomicLong) ikjVar.b;
            long j2 = atomicLong.get();
            for (int i = 0; i < 10 && j2 + c < 1048576; i++) {
                j2 = atomicLong.get();
                if (atomicLong.compareAndSet(j2, j2 + c)) {
                    ((ConcurrentLinkedQueue) ikjVar.a).offer(new igx(elapsedRealtime, c));
                }
            }
            Log.w("ClientLoggingBackend", "Log rate too high, dropping logs.");
            a = hnu.aJ(false);
            hnu.aS(a, gvx.f(new kcv(this, hviVar, ihjVar, 1)), huf.a);
        }
        esi esiVar = this.k;
        if (esiVar == null) {
            synchronized (this) {
                esiVar = this.k;
                if (esiVar == null) {
                    esiVar = new esi();
                    this.k = esiVar;
                }
            }
        }
        a = esiVar.a(this.f, this.j, true);
        hnu.aS(a, gvx.f(new kcv(this, hviVar, ihjVar, 1)), huf.a);
    }

    @Override // defpackage.hmx, defpackage.hlw
    public final void a(RuntimeException runtimeException, hlu hluVar) {
        Log.e("ClientLoggingBackend", "Internal logging error", runtimeException);
    }

    @Override // defpackage.hlw
    public final void b(hlu hluVar) {
        long j;
        koe koeVar = this.i;
        koeVar.b();
        hvi hviVar = (hvi) this.m.a(hluVar).d(hnu.aJ(null));
        String str = hluVar.l() != null ? hluVar.l().b : null;
        iha ihaVar = this.h;
        igz igzVar = new igz(hluVar.f(), str);
        long e2 = hluVar.e();
        synchronized (ihaVar) {
            if (e2 >= ihaVar.c || ihaVar.d.size() >= 1000) {
                long nanos = TimeUnit.SECONDS.toNanos(ihaVar.a);
                LinkedHashMap linkedHashMap = ihaVar.d;
                Iterator it = linkedHashMap.values().iterator();
                int size = linkedHashMap.size();
                while (it.hasNext()) {
                    igy igyVar = (igy) it.next();
                    j = 0;
                    long j2 = igyVar.b + nanos;
                    if (j2 >= e2 && size <= 1000) {
                        ihaVar.c = j2;
                        break;
                    }
                    if (igyVar.c > 0 && ihaVar.e.size() < 1000) {
                        ihaVar.e.add(igyVar);
                    }
                    it.remove();
                    size--;
                }
            }
            j = 0;
            LinkedHashMap linkedHashMap2 = ihaVar.d;
            igy igyVar2 = (igy) linkedHashMap2.get(igzVar);
            if (igyVar2 != null) {
                if (igyVar2.c == j) {
                    igyVar2.d = ((igq) ihaVar.b).b().b(hluVar, 3, ign.a);
                }
                igyVar2.c++;
                for (igy igyVar3 : ihaVar.a()) {
                    hoq.H(igyVar3.c > j);
                    jkj jkjVar = igyVar3.d;
                    jkjVar.getClass();
                    long j3 = igyVar3.c;
                    if (!jkjVar.b.M()) {
                        jkjVar.t();
                    }
                    ihj ihjVar = (ihj) jkjVar.b;
                    ihj ihjVar2 = ihj.a;
                    ihjVar.b |= 2;
                    ihjVar.d = j3;
                    e((ihj) jkjVar.q(), igyVar3.a);
                }
                return;
            }
            linkedHashMap2.put(igzVar, new igy(hviVar, e2));
            ign b = ((igq) this.g).b();
            igl a = igm.a();
            a.b(true);
            a.c(true);
            a.d(true);
            jkj b2 = b.b(hluVar, 2, a.a());
            Throwable th = (Throwable) ign.a(hluVar, hkl.a);
            koeVar.b();
            if (hluVar.o().intValue() >= Integer.MAX_VALUE && !(th instanceof hkt)) {
                hrh hrhVar = ((ihj) b2.b).g;
                if (hrhVar == null) {
                    hrhVar = hrh.a;
                }
                jkj C = hrhVar.C();
                koeVar.b();
                jkj p = hoq.p(new igr(th));
                if (!C.b.M()) {
                    C.t();
                }
                hrh hrhVar2 = (hrh) C.b;
                hrm hrmVar = (hrm) p.q();
                hrmVar.getClass();
                hrhVar2.k = hrmVar;
                hrhVar2.b |= 1024;
                hrh hrhVar3 = (hrh) C.q();
                if (!b2.b.M()) {
                    b2.t();
                }
                ihj ihjVar3 = (ihj) b2.b;
                hrhVar3.getClass();
                ihjVar3.g = hrhVar3;
                ihjVar3.b |= 64;
            }
            koeVar.b();
            boolean z = gta.a;
            int i = hel.d;
            heg hegVar = new heg(4);
            for (guq b3 = gta.b(); b3 != null; b3 = b3.a()) {
                hegVar.h(b3.c());
            }
            List F = hnu.F(hegVar.g());
            if (!F.isEmpty()) {
                jkj k = ihg.a.k();
                if (!k.b.M()) {
                    k.t();
                }
                ihg ihgVar = (ihg) k.b;
                jkx jkxVar = ihgVar.b;
                if (!jkxVar.c()) {
                    ihgVar.b = jkp.A(jkxVar);
                }
                jiz.f(F, ihgVar.b);
                if (!b2.b.M()) {
                    b2.t();
                }
                ihj ihjVar4 = (ihj) b2.b;
                ihg ihgVar2 = (ihg) k.q();
                ihj ihjVar5 = ihj.a;
                ihgVar2.getClass();
                ihjVar4.h = ihgVar2;
                ihjVar4.b |= 128;
            }
            e((ihj) b2.q(), hviVar);
        }
    }

    @Override // defpackage.hlw
    public final boolean c(Level level) {
        this.i.b();
        return level.intValue() >= Level.WARNING.intValue();
    }
}
