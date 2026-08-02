package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ajw {
    public kvm a;
    public Executor b;
    public Executor c;
    public ajk d;
    public boolean e;
    public ajb i;
    public final brr j = new brr((char[]) null);
    public final ThreadLocal f = new ThreadLocal();
    public final Map g = new LinkedHashMap();
    public boolean h = true;

    private final Object w(kri kriVar) {
        if (!q()) {
            return abf.e(this, false, true, new ajq(kriVar, 2));
        }
        m();
        try {
            Object a = kriVar.a();
            p();
            return a;
        } finally {
            n();
        }
    }

    public abstract ajk a();

    public final ajk b() {
        ajk ajkVar = this.d;
        if (ajkVar != null) {
            return ajkVar;
        }
        ksp.a("internalTracker");
        return null;
    }

    public akb c() {
        throw new kok("An operation is not implemented.");
    }

    public final amn d() {
        ajb ajbVar = this.i;
        if (ajbVar == null) {
            ksp.a("connectionManager");
            ajbVar = null;
        }
        amn amnVar = ajbVar.d;
        if (amnVar != null) {
            return amnVar;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Object e(Callable callable) {
        return w(new nb(callable, 8));
    }

    public List f(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ixd.m(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(ixf.f((ktj) entry.getKey()), entry.getValue());
        }
        return u();
    }

    public Map g() {
        Set<Map.Entry> entrySet = h().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ksl.f(ixd.m(ixc.w(entrySet)), 16));
        for (Map.Entry entry : entrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            ktj h = ixf.h(cls);
            ArrayList arrayList = new ArrayList(ixc.w(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ixf.h((Class) it.next()));
            }
            kol kolVar = new kol(h, arrayList);
            linkedHashMap.put(kolVar.a, kolVar.b);
        }
        return linkedHashMap;
    }

    protected Map h() {
        return kpl.a;
    }

    public Set i() {
        Set j = j();
        ArrayList arrayList = new ArrayList(ixc.w(j));
        Iterator it = j.iterator();
        while (it.hasNext()) {
            arrayList.add(ixf.h((Class) it.next()));
        }
        return ixc.s(arrayList);
    }

    public Set j() {
        return kpm.a;
    }

    public final kqn k() {
        kvm kvmVar = this.a;
        if (kvmVar == null) {
            ksp.a("coroutineScope");
            kvmVar = null;
        }
        return ((lby) kvmVar).a;
    }

    public final void l() {
        if (!this.e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void m() {
        l();
        l();
        amj b = d().b();
        if (!b.g()) {
            zy.f(new aki(b(), (kqj) null, 1));
        }
        if (((ams) b).e.isWriteAheadLoggingEnabled()) {
            b.c();
        } else {
            b.b();
        }
    }

    public final void n() {
        d().b().d();
        if (r()) {
            return;
        }
        ajk b = b();
        b.b.f(b.f, b.g);
    }

    public final void o(Runnable runnable) {
        w(new nb(runnable, 7));
    }

    public final void p() {
        d().b().f();
    }

    public final boolean q() {
        ajb ajbVar = this.i;
        if (ajbVar == null) {
            ksp.a("connectionManager");
            ajbVar = null;
        }
        return ajbVar.d != null;
    }

    public final boolean r() {
        return s() && d().b().g();
    }

    public final boolean s() {
        ajb ajbVar = this.i;
        if (ajbVar == null) {
            ksp.a("connectionManager");
            ajbVar = null;
        }
        amj amjVar = ajbVar.e;
        if (amjVar != null) {
            return amjVar.h();
        }
        return false;
    }

    public final void t(ana anaVar) {
        ajk b = b();
        akt aktVar = b.b;
        amh a = anaVar.a("PRAGMA query_only");
        try {
            a.l();
            boolean n = a.n();
            ixf.i(a, null);
            if (!n) {
                yj.o(anaVar, "PRAGMA temp_store = MEMORY");
                yj.o(anaVar, "PRAGMA recursive_triggers = 1");
                yj.o(anaVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (aktVar.c) {
                    yj.o(anaVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    yj.o(anaVar, ksp.r("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                ajn ajnVar = aktVar.e;
                ReentrantLock reentrantLock = ajnVar.a;
                reentrantLock.lock();
                try {
                    ajnVar.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (b.h) {
                yp ypVar = b.i;
            }
        } finally {
        }
    }

    public List u() {
        return kpk.a;
    }

    public final Object v(krx krxVar, kqj kqjVar) {
        ajb ajbVar = this.i;
        if (ajbVar == null) {
            ksp.a("connectionManager");
            ajbVar = null;
        }
        alf alfVar = (alf) kqjVar.bU().get(alf.a);
        ald aldVar = alfVar != null ? alfVar.b : null;
        if (aldVar != null) {
            return krxVar.a(aldVar, kqjVar);
        }
        alh alhVar = ajbVar.f;
        ald aldVar2 = new ald(alhVar.b, (ana) alhVar.c.a());
        return ixg.f(new alf(aldVar2), new alg(krxVar, aldVar2, (kqj) null, 0), kqjVar);
    }
}
