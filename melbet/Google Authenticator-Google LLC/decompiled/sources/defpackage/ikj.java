package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikj {
    public final Object a;
    public final Object b;

    public ikj(Context context) {
        String packageName = context.getPackageName();
        this.b = packageName;
        String I = eos.I();
        if (I != null && !I.isEmpty()) {
            packageName = I;
        }
        this.a = packageName;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Object a(frv frvVar) {
        Object obj;
        ?? r0 = this.a;
        synchronized (r0) {
            if (!r0.containsKey(frvVar)) {
                dze b = ((boa) this.b).b();
                b.b = frvVar;
                r0.put(frvVar, new bnk((bnl) b.a, (frv) b.b));
            }
            obj = r0.get(frvVar);
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, koe] */
    public final fcu b(gpm gpmVar, iyi iyiVar) {
        Executor executor = gpmVar.f;
        if (executor == null) {
            executor = (Executor) this.b.b();
        }
        Executor executor2 = executor;
        hvi ar = hoq.ar(new gnq(this, gpmVar, 2), executor2);
        fcu s = exf.s(gpmVar.a, ar, gpmVar.b, jkd.a(), executor2, gpmVar.e, iyiVar);
        hel helVar = gpmVar.d;
        if (!helVar.isEmpty()) {
            s.c(new fci(helVar, executor2));
        }
        return s;
    }

    public ikj(koe koeVar, gpj gpjVar) {
        this.b = koeVar;
        this.a = gpjVar;
    }

    public ikj() {
        this.a = new ConcurrentLinkedQueue();
        this.b = new AtomicLong();
    }

    public ikj(koe koeVar) {
        this.a = new HashMap();
        this.b = koeVar;
    }

    public ikj(koe koeVar, boc bocVar) {
        Boolean bool = false;
        bool.getClass();
        this.b = (Set) ((jrx) koeVar).a;
        this.a = bocVar;
    }

    public ikj(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
