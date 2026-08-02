package defpackage;

import android.content.Context;
import android.view.View;
import java.io.EOFException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gjl {
    public final Context a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [dup] */
    public gjl(dsf dsfVar) {
        this.c = dsfVar;
        Context context = dsfVar.a;
        context.getClass();
        this.a = context;
        dsg dsgVar = dsfVar.b;
        dsgVar.getClass();
        dov dovVar = dsfVar.c;
        dovVar.getClass();
        ekx ekxVar = new ekx(new ehq(dsgVar, dovVar));
        this.m = ekxVar;
        this.g = ekxVar.d;
        this.j = ekxVar.a;
        gzp gzpVar = dsfVar.e.a;
        byte[] bArr = null;
        this.k = new fwm((Object) new bwt(5), (Object) new ajt(15), (byte[]) null);
        int i = 1;
        this.l = new dwd(dsfVar, i);
        bst bstVar = new bst(dsfVar, (byte[]) null);
        dsf dsfVar2 = (dsf) bstVar.a;
        dov dovVar2 = dsfVar2.c;
        gzp gzpVar2 = dsfVar2.e.m;
        gyf gyfVar = gyf.a;
        fwm fwmVar = new fwm(dovVar2, (gzp) gyfVar);
        dja djaVar = ((dsf) bstVar.a).e.r;
        dut dutVar = new dut(djaVar, fwmVar, bstVar, i);
        dut dutVar2 = new dut(djaVar, fwmVar, bstVar, 0);
        djaVar.v();
        this.h = new dun(dutVar, dutVar2);
        ebv ebvVar = dsfVar.e;
        eca ecaVar = ebvVar.f;
        this.b = dsfVar.g.a;
        gzp gzpVar3 = ebvVar.m;
        this.f = gyfVar;
        gzp gzpVar4 = ebvVar.l;
        this.d = dsfVar.n;
        this.e = new bry(dsfVar, (short[]) null);
        if (ebvVar.e.f()) {
            cx cxVar = new cx(this, 7, bArr);
            gzp gzpVar5 = ((eco) dsfVar.e.e.b()).a;
            gzpVar5.getClass();
            bArr = new dup(cxVar, gzpVar5);
        }
        this.i = bArr;
    }

    public static final int b(RandomAccessFile randomAccessFile) {
        int i;
        try {
            i = randomAccessFile.readInt();
        } catch (EOFException unused) {
            i = -1;
        } catch (Throwable th) {
            randomAccessFile.seek(0L);
            throw th;
        }
        randomAccessFile.seek(0L);
        return i;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void a(boolean z) {
        gty aC = hoq.aC(184, "StartupAfterPackageReplaced");
        try {
            hvi as = hoq.as(new gjq(this, z, 1), this.h);
            gaj gajVar = (gaj) this.i.b();
            aC.b(as);
            gajVar.c(as, 30L, TimeUnit.SECONDS);
            ixf.j(aC, null);
        } finally {
        }
    }

    public final void c(View view, jit jitVar) {
        Object obj = ((bry) this.e).a;
        ((dsf) obj).d.b.a(view, jitVar != null ? dja.F((dsf) obj, jitVar) : null);
    }

    public final void d(boolean z) {
        dsi dsiVar = (dsi) ((dsf) this.c).h.b();
        if (dsiVar.b == z) {
            return;
        }
        dsiVar.b = z;
        Iterator it = dsiVar.a.iterator();
        while (it.hasNext()) {
            ((ehn) it.next()).a();
        }
    }

    public final void e(View view, jit jitVar) {
        dsf dsfVar = (dsf) this.c;
        dsfVar.d.a.a(view, dja.F(dsfVar, jitVar));
    }

    public final void f(jit jitVar) {
        dsf dsfVar = (dsf) this.c;
        if (dja.F(dsfVar, jitVar) != null) {
            eca ecaVar = dsfVar.e.f;
        }
        if (dja.F(dsfVar, jitVar) == null) {
            return;
        }
        eca ecaVar2 = dsfVar.e.f;
    }

    public gjl(Context context, fwm fwmVar, gzp gzpVar, Map map, Map map2, koe koeVar, koe koeVar2, hvl hvlVar, jpt jptVar, koe koeVar3, cka ckaVar, koe koeVar4) {
        gzpVar.getClass();
        map.getClass();
        map2.getClass();
        koeVar.getClass();
        koeVar2.getClass();
        hvlVar.getClass();
        jptVar.getClass();
        koeVar4.getClass();
        this.a = context;
        this.c = fwmVar;
        this.d = map;
        this.e = map2;
        this.f = koeVar;
        this.g = koeVar2;
        this.h = hvlVar;
        this.i = jptVar;
        this.j = koeVar3;
        this.k = ckaVar;
        this.l = koeVar4;
        if (ixc.r(map.keySet(), map2.keySet()).isEmpty()) {
            this.b = ((Boolean) gzpVar.d(false)).booleanValue();
            this.m = fwmVar.l() ? ixd.q(map, map2) : map2;
        } else {
            Set r = ixc.r(map.keySet(), map2.keySet());
            Objects.toString(r);
            throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(r.toString()));
        }
    }
}
