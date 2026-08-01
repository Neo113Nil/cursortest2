package c6;

import android.content.Context;
import android.database.Cursor;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.work.impl.WorkDatabase_Impl;
import b1.c0;
import d2.v;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import je.l0;
import kotlin.collections.i0;
import te.a1;
import z4.w;
import z4.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i implements e1.f {

    /* renamed from: a, reason: collision with root package name */
    public Object f1820a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1821b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1822c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1823d;

    public i(Context context, a1.n nVar) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        a6.a aVar = new a6.a(applicationContext, nVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        a6.a aVar2 = new a6.a(applicationContext2, nVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        applicationContext3.getClass();
        String str = a6.k.f310a;
        a6.j jVar = new a6.j(applicationContext3, nVar);
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        a6.a aVar3 = new a6.a(applicationContext4, nVar, 2);
        this.f1820a = aVar;
        this.f1821b = aVar2;
        this.f1822c = jVar;
        this.f1823d = aVar3;
    }

    public static void a(i iVar, s4.d dVar) {
        iVar.getClass();
        dVar.getClass();
        if (((LinkedHashSet) iVar.f1822c).add(dVar)) {
            s4.g gVar = (s4.g) iVar.f1821b;
            gVar.getClass();
            if (dVar.f8422e != null) {
                a1.c(dVar, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            gVar.f8431e.addFirst(dVar);
            dVar.f8422e = iVar;
            gVar.b();
        }
    }

    public void b(s4.f fVar) {
        if (((LinkedHashSet) this.f1823d).add(fVar)) {
            ((s4.g) this.f1821b).a(this, fVar, -1);
        }
    }

    public void c(s4.j jVar, int i3) {
        if (i3 != 1 && i3 != 0) {
            a2.r.h(v4.a.j(i3, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.f1823d).add(jVar)) {
            ((s4.g) this.f1821b).a(this, jVar, i3);
        }
    }

    public void d(s4.f fVar, s4.b bVar) {
        s4.g gVar = (s4.g) this.f1821b;
        gVar.getClass();
        if (gVar.g != 0) {
            return;
        }
        s4.d c10 = gVar.c(-1);
        gVar.f8432f = c10;
        gVar.g = -1;
        gVar.f8433h = fVar;
        if (bVar != null) {
            if (c10 != null) {
                c10.d(bVar);
            }
            l0 l0Var = gVar.f8427a;
            s4.i iVar = new s4.i(bVar);
            l0Var.getClass();
            l0Var.k(null, iVar);
        }
    }

    public void e(c0 c0Var, boolean z10) {
        x1.q qVar = (x1.q) this.f1823d;
        List list = (List) c0Var.f954b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((x1.l) list.get(i3)).b()) {
                h(c0Var);
                return;
            }
        }
        a2.n nVar = (a2.n) this.f1820a;
        if (nVar == null) {
            i0.l("layoutCoordinates not set");
            return;
        }
        g8.b.M(c0Var, nVar.K(0L), new a3.d(9, this, qVar), false);
        if (((x1.o) this.f1821b) == x1.o.f10306e) {
            if (z10) {
                int size2 = list.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((x1.l) list.get(i10)).a();
                }
            }
            w7.m mVar = (w7.m) c0Var.f955c;
            if (mVar != null) {
                mVar.f10129a = !qVar.f10313c;
            }
        }
    }

    public g f(j jVar) {
        String str = jVar.f1824a;
        int i3 = jVar.f1825b;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1820a;
        z a9 = z.a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        if (str == null) {
            a9.r(1);
        } else {
            a9.l(1, str);
        }
        a9.f(2, i3);
        workDatabase_Impl.b();
        Cursor E = cf.c.E(workDatabase_Impl, a9);
        try {
            int F = f.F(E, "work_spec_id");
            int F2 = f.F(E, "generation");
            int F3 = f.F(E, "system_id");
            g gVar = null;
            String string = null;
            if (E.moveToFirst()) {
                if (!E.isNull(F)) {
                    string = E.getString(F);
                }
                gVar = new g(string, E.getInt(F2), E.getInt(F3));
            }
            return gVar;
        } finally {
            E.close();
            a9.d();
        }
    }

    public void g(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1820a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f1821b).e(gVar);
            workDatabase_Impl.u();
        } finally {
            workDatabase_Impl.h();
        }
    }

    public void h(c0 c0Var) {
        if (((x1.o) this.f1821b) == x1.o.f10306e) {
            a2.n nVar = (a2.n) this.f1820a;
            if (nVar == null) {
                i0.l("layoutCoordinates not set");
                return;
            }
            g8.b.M(c0Var, nVar.K(0L), new x1.p((x1.q) this.f1823d, 1), true);
        }
        this.f1821b = x1.o.f10307i;
    }

    public i(WorkDatabase_Impl workDatabase_Impl) {
        this.f1820a = workDatabase_Impl;
        this.f1821b = new b(workDatabase_Impl, 2);
        this.f1822c = new h(workDatabase_Impl, 0);
        this.f1823d = new h(workDatabase_Impl, 1);
    }

    public i(v vVar, e1.j jVar) {
        this.f1820a = vVar;
        this.f1821b = jVar;
        AutofillManager b10 = com.onesignal.common.k.b(vVar.getContext().getSystemService(com.onesignal.common.k.g()));
        if (b10 != null) {
            this.f1822c = b10;
            vVar.setImportantForAutofill(1);
            f2.a s3 = w.s(vVar);
            AutofillId g = s3 != null ? f1.b.g(s3.f4064d) : null;
            if (g != null) {
                this.f1823d = g;
                return;
            }
            throw v4.a.h("Required value was null.");
        }
        i0.l("Autofill service could not be located.");
        throw null;
    }

    public i(x1.q qVar) {
        this.f1823d = qVar;
        this.f1821b = x1.o.f10305d;
    }

    public i(Executor executor, r6.g gVar, p.e eVar, r6.g gVar2) {
        this.f1820a = executor;
        this.f1821b = gVar;
        this.f1822c = eVar;
        this.f1823d = gVar2;
    }

    public i(b1.h hVar) {
        this.f1820a = hVar;
        this.f1821b = new s4.g();
        new LinkedHashSet();
        this.f1822c = new LinkedHashSet();
        this.f1823d = new LinkedHashSet();
    }
}
