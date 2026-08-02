package defpackage;

import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfe {
    public final Object a;

    public cfe(int i) {
        jkl jklVar = (jkl) dkw.a.k();
        this.a = jklVar;
        jkl jklVar2 = jklVar;
        if (!jklVar2.b.M()) {
            jklVar2.t();
        }
        dkw dkwVar = (dkw) jklVar.b;
        dkwVar.c = i - 1;
        dkwVar.b |= 1;
    }

    public static final void h(StringBuilder sb, Throwable th) {
        sb.append(th.getClass().getName());
        sb.append("\n");
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append("\n");
        }
    }

    public final dku a() {
        return new dku((dkw) ((jkj) this.a).q());
    }

    public final void b(dkt dktVar) {
        Object obj = this.a;
        jkl jklVar = (jkl) obj;
        iwq iwqVar = dktVar.b;
        hoq.H(!jklVar.an(iwqVar));
        int a = iwqVar.a();
        jkj jkjVar = (jkj) obj;
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        dkw dkwVar = (dkw) jklVar.b;
        dkw dkwVar2 = dkw.a;
        jkt jktVar = dkwVar.d;
        if (!jktVar.c()) {
            dkwVar.d = jkp.y(jktVar);
        }
        dkwVar.d.g(a);
        jklVar.ao(iwqVar, dktVar.a);
    }

    public final void c() {
        Object obj = ((jrx) this.a).a;
        obj.getClass();
        if (((hnu) ((Optional) obj).orElse(null)) != null) {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jpt] */
    public final String d(ful fulVar) {
        String b = ((fwm) this.a.b()).b(fulVar);
        return b == null ? "" : b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final boolean e(String str) {
        int i = djl.a;
        return this.a.contains(str);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    public final hvi f(ggg gggVar, String str, hvi hviVar) {
        hvi f = hso.f(hti.f(hviVar, new fyc(gggVar, 11), g(gggVar)), Throwable.class, new fyc(gggVar, 10), g(gggVar));
        long j = gggVar.c;
        if (j > 0) {
            ?? r2 = this.a;
            f = hso.f(hnu.aQ(f, j, TimeUnit.MILLISECONDS, r2), TimeoutException.class, new fxn(7), r2);
        } else if (j == 0 && !f.isDone()) {
            f.cancel(true);
            f = hnu.aJ(gge.a);
        }
        return hti.f(f, new bso(str, gggVar, 17, null), g(gggVar));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final Executor g(ggg gggVar) {
        return gggVar.c == 0 ? huf.a : this.a;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jsb] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, jsb] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, jsb] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, jsb] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, jsb] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, jsb] */
    public final iwq i(ggh gghVar, krt krtVar, Executor executor, Map map, krx krxVar, krt krtVar2, htr htrVar, kri kriVar, Set set) {
        ghf ghfVar = (ghf) this.a;
        return new iwq(((jrk) ghfVar.d).b(), (cfe) ((jrx) ghfVar.g).a, (Map) ghfVar.a.b(), (kee) ghfVar.c.b(), (hvl) ghfVar.f.b(), (iyi) ghfVar.e.b(), (gzp) ghfVar.h.b(), (Map) ghfVar.b.b(), gghVar, krtVar, executor, map, krxVar, krtVar2, htrVar, kriVar, set);
    }

    public cfe(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public cfe(hvi hviVar) {
        fao.c();
        hviVar.getClass();
        this.a = hviVar;
    }

    public cfe(List list) {
        oy.am(!list.isEmpty(), "APIs must not be empty.");
        this.a = list;
    }

    public cfe(jkj jkjVar) {
        hoq.y(((hre) jkjVar.b).d != 0, "VeIdentifier must be non-zero");
        this.a = jkjVar;
    }

    public cfe(Set set) {
        set.getClass();
        this.a = set;
    }

    public cfe() {
        Set k = hnu.k();
        k.getClass();
        this.a = k;
    }

    public cfe(Object obj) {
        this.a = obj;
    }

    public cfe(jpt jptVar) {
        jptVar.getClass();
        this.a = jptVar;
    }

    public cfe(koe koeVar, koe koeVar2) {
        koeVar.getClass();
        koeVar2.getClass();
        this.a = koeVar;
        new LinkedHashMap();
    }
}
