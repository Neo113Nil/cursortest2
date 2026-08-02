package defpackage;

import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gva {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gva(gvn gvnVar, koe koeVar, Set set, int i) {
        this.d = gvnVar;
        this.a = 2;
        guc d = guc.d(set);
        d.getClass();
        this.c = d;
        this.b = new gnk(koeVar, this, 3);
    }

    @cci
    public final gtt a(int i, @ccj String str) {
        guc gucVar = gub.a;
        gucVar.getClass();
        return c(i, str, gucVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, koe] */
    @cci
    public final gtt b(int i, long j, long j2) {
        Object b = this.b.b();
        b.getClass();
        return ((gvn) this.d).d((guc) b, j, j2, 2, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, koe] */
    @cci
    public final gtt c(int i, @ccj String str, guc gucVar) {
        gucVar.getClass();
        guc e = guc.e((guc) this.b.b(), gucVar);
        e.getClass();
        return ((gvn) this.d).c(str, e, 2, i);
    }

    @cci
    public final gut d(int i, @ccj String str) {
        if (!hoq.aI()) {
            return new gsw(6);
        }
        guc gucVar = gub.a;
        gucVar.getClass();
        return e(i, str, gucVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, koe] */
    @cci
    public final gup e(int i, @ccj String str, guc gucVar) {
        gucVar.getClass();
        guc e = guc.e((guc) this.b.b(), gucVar);
        e.getClass();
        return ((gvn) this.d).e(str, e, 2, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, koe] */
    public final gtt f(String str, int i) {
        Object b = this.b.b();
        b.getClass();
        return ((gvn) this.d).c(str, (guc) b, 2, i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [egc, java.lang.Object] */
    public final hvi g(boolean z) {
        long epochMilli = Instant.now().toEpochMilli();
        ?? r2 = this.b;
        hvi a = z ? r2.a() : r2.b();
        hoq.av(a, new ehg(this, z, epochMilli), huf.a);
        return a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [egc, java.lang.Object] */
    public final hvi h(boolean z, String str, int i) {
        long epochMilli = Instant.now().toEpochMilli();
        ?? r0 = this.b;
        hvi c = z ? r0.c(str, i) : r0.d(str, i);
        hoq.av(c, new ehf(this, i, z, epochMilli), huf.a);
        return c;
    }

    public gva(egc egcVar, int i, fwm fwmVar, String str) {
        this.b = egcVar;
        this.c = fwmVar;
        this.a = i;
        this.d = str;
    }

    public gva(int i, kee keeVar, Executor executor) {
        this.a = i;
        this.c = keeVar;
        this.b = executor;
        this.d = new ConcurrentHashMap(8);
    }
}
