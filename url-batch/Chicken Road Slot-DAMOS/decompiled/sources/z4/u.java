package z4;

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
import kotlin.collections.CollectionsKt;
import kotlin.collections.o0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public le.d f10834a;

    /* renamed from: b, reason: collision with root package name */
    public CoroutineContext f10835b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f10836c;

    /* renamed from: d, reason: collision with root package name */
    public d6.l f10837d;

    /* renamed from: e, reason: collision with root package name */
    public q f10838e;

    /* renamed from: f, reason: collision with root package name */
    public f f10839f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10840h;
    public final c6.e g = new c6.e(new d2.o(0, this, u.class, "onClosed", "onClosed()V", 0, 7));

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f10841i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    public boolean f10842k = true;

    public final void a() {
        if (this.f10840h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            kotlin.collections.i0.l("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!p() || q()) {
            return;
        }
        CoroutineContext coroutineContext = (CoroutineContext) this.f10841i.get();
        if ((coroutineContext != null ? (c0) coroutineContext.m(c0.f10729e) : null) == null) {
            return;
        }
        kotlin.collections.i0.l("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    public final void c() {
        a();
        a();
        k5.d G = k().G();
        if (!G.t()) {
            w.M(new b5.d0(j(), null, 13));
        }
        if (G.f5410d.isWriteAheadLoggingEnabled()) {
            G.d();
        } else {
            G.a();
        }
    }

    public List d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(o0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(a.a.D((ce.b) entry.getKey()), entry.getValue());
        }
        return i(linkedHashMap2);
    }

    public abstract f e();

    public c4.h f() {
        throw new hd.k(null, 1, null);
    }

    public j5.d g(a aVar) {
        aVar.getClass();
        throw new hd.k(null, 1, null);
    }

    public final void h() {
        k().G().i();
        if (q()) {
            return;
        }
        f j = j();
        j.f10737b.e(j.f10740e, j.f10741f);
    }

    public List i(LinkedHashMap linkedHashMap) {
        return kotlin.collections.j0.f5574d;
    }

    public final f j() {
        f fVar = this.f10839f;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.f("internalTracker");
        throw null;
    }

    public final j5.d k() {
        q qVar = this.f10838e;
        if (qVar == null) {
            Intrinsics.f("connectionManager");
            throw null;
        }
        j5.d dVar = qVar.g;
        if (dVar != null) {
            return dVar;
        }
        kotlin.collections.i0.l("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set l() {
        Set m10 = m();
        ArrayList arrayList = new ArrayList(kotlin.collections.z.j(m10, 10));
        Iterator it = m10.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a.F((Class) it.next()));
        }
        return CollectionsKt.T(arrayList);
    }

    public Set m() {
        return kotlin.collections.l0.f5576d;
    }

    public LinkedHashMap n() {
        Set<Map.Entry> entrySet = o().entrySet();
        int a9 = o0.a(kotlin.collections.z.j(entrySet, 10));
        if (a9 < 16) {
            a9 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a9);
        for (Map.Entry entry : entrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            wd.h F = a.a.F(cls);
            ArrayList arrayList = new ArrayList(kotlin.collections.z.j(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a.a.F((Class) it.next()));
            }
            linkedHashMap.put(F, arrayList);
        }
        return linkedHashMap;
    }

    public Map o() {
        kotlin.collections.k0 k0Var = kotlin.collections.k0.f5575d;
        k0Var.getClass();
        return k0Var;
    }

    public final boolean p() {
        q qVar = this.f10838e;
        if (qVar != null) {
            return qVar.g != null;
        }
        Intrinsics.f("connectionManager");
        throw null;
    }

    public final boolean q() {
        return s() && k().G().t();
    }

    public final void r(i5.a aVar) {
        aVar.getClass();
        f j = j();
        n0 n0Var = j.f10737b;
        n0Var.getClass();
        i5.c K = aVar.K("PRAGMA query_only");
        try {
            K.E();
            boolean A = K.A();
            cf.c.m(K, null);
            if (!A) {
                g8.b.y(aVar, "PRAGMA temp_store = MEMORY");
                g8.b.y(aVar, "PRAGMA recursive_triggers = 1");
                g8.b.y(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (n0Var.f10799c) {
                    g8.b.y(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    g8.b.y(aVar, kotlin.text.o.g("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                j jVar = n0Var.g;
                ReentrantLock reentrantLock = jVar.f10760a;
                reentrantLock.lock();
                try {
                    jVar.f10763d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (j.g) {
            }
        } finally {
        }
    }

    public final boolean s() {
        q qVar = this.f10838e;
        if (qVar == null) {
            Intrinsics.f("connectionManager");
            throw null;
        }
        k5.d dVar = qVar.f10813h;
        if (dVar != null) {
            return dVar.isOpen();
        }
        return false;
    }

    public final Object t(Callable callable) {
        a0 a0Var = new a0(1, callable);
        if (p()) {
            c();
            try {
                Object call = callable.call();
                u();
                return call;
            } finally {
                h();
            }
        }
        a1.d dVar = new a1.d(24, a0Var);
        a();
        b();
        Object obj = (CoroutineContext) this.f10841i.get();
        if (obj == null) {
            obj = kotlin.coroutines.g.f5592d;
        }
        return w.M(new b5.t(obj, this, dVar, null, 3));
    }

    public final void u() {
        k().G().p();
    }

    public final Object v(boolean z10, Function2 function2, nd.c cVar) {
        q qVar = this.f10838e;
        if (qVar != null) {
            return qVar.f10812f.y(z10, function2, cVar);
        }
        Intrinsics.f("connectionManager");
        throw null;
    }
}
