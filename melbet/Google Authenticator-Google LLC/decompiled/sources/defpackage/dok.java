package defpackage;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dok implements doq, dor {
    public final Map a = new LinkedHashMap();
    public final Object b = new Object();
    public final ehn c;
    public final bry d;
    public final fwm e;
    private final fwm f;

    public dok(fwm fwmVar, fwm fwmVar2, bry bryVar, ehn ehnVar) {
        this.f = fwmVar;
        this.e = fwmVar2;
        this.d = bryVar;
        this.c = ehnVar;
    }

    public static boolean g(dop dopVar) {
        doo dooVar = dopVar.c;
        if (dooVar == null) {
            dooVar = doo.a;
        }
        return !dooVar.equals(doo.a);
    }

    public static boolean h(dop dopVar) {
        return !dop.a.equals(dopVar);
    }

    public static boolean i(dop dopVar) {
        ikc ikcVar = dopVar.b;
        if (ikcVar == null) {
            ikcVar = ikc.a;
        }
        return dih.m(ikcVar) != null;
    }

    public final gzp a() {
        this.f.K();
        return gyf.a;
    }

    public final hvi b() {
        return hoq.au(this.f.K(), new doj(this, 0), huf.a);
    }

    public final hvi c() {
        return gwu.g(this.d.b()).e(IOException.class, new bpn(this, 20), huf.a);
    }

    public final void d(dof dofVar, Executor executor) {
        executor.getClass();
        synchronized (this.b) {
            this.a.put(dofVar, executor);
        }
    }

    @Override // defpackage.doq
    public final void e() {
        her i;
        synchronized (this.b) {
            i = her.i(this.a);
        }
        hjr it = i.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Executor executor = (Executor) entry.getValue();
            dof dofVar = (dof) entry.getKey();
            dofVar.getClass();
            executor.execute(gvx.h(new dlj(dofVar, 3)));
        }
    }

    @Override // defpackage.dor
    public final void f() {
        her i;
        synchronized (this.b) {
            i = her.i(this.a);
        }
        hjr it = i.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Executor executor = (Executor) entry.getValue();
            dof dofVar = (dof) entry.getKey();
            dofVar.getClass();
            executor.execute(gvx.h(new dlj(dofVar, 2)));
        }
    }

    public final hvi j(int i) {
        return hoq.au(b(), new doi(this, i, 1), huf.a);
    }
}
