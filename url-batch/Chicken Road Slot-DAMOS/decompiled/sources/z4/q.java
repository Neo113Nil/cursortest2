package z4;

import android.content.Context;
import android.content.Intent;
import c7.p0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10807a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10808b;

    /* renamed from: c, reason: collision with root package name */
    public final a f10809c;

    /* renamed from: d, reason: collision with root package name */
    public final c4.h f10810d;

    /* renamed from: e, reason: collision with root package name */
    public final List f10811e;

    /* renamed from: f, reason: collision with root package name */
    public final b5.b f10812f;
    public final j5.d g;

    /* renamed from: h, reason: collision with root package name */
    public k5.d f10813h;

    public q(a aVar, c4.h hVar, a3.z zVar) {
        int i3;
        b5.b fVar;
        this.f10809c = aVar;
        this.f10810d = hVar;
        List list = aVar.f10707e;
        t tVar = aVar.g;
        j5.c cVar = aVar.f10705c;
        i5.b bVar = aVar.f10720t;
        String str = aVar.f10704b;
        this.f10811e = list == null ? kotlin.collections.j0.f5574d : list;
        if (bVar != null) {
            this.g = null;
            if (bVar.k()) {
                fVar = new b5.q(new c6.l(this, bVar), str == null ? ":memory:" : str, zVar);
            } else if (str == null) {
                fVar = new b5.f(new c6.l(this, bVar));
            } else {
                c6.l lVar = new c6.l(this, bVar);
                int ordinal = tVar.ordinal();
                if (ordinal == 1) {
                    i3 = 1;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + tVar + '\'').toString());
                    }
                    i3 = 4;
                }
                int ordinal2 = tVar.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + tVar + '\'').toString());
                }
                fVar = new b5.f(lVar, str, i3);
            }
            this.f10812f = fVar;
        } else {
            if (cVar == null) {
                a1.e("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            Context context = aVar.f10703a;
            context.getClass();
            j5.d e2 = cVar.e(new j5.b(context, str, new o(this, hVar.f1753a), false, false));
            this.g = e2;
            this.f10812f = new b5.q(new l.d(e2), str == null ? ":memory:" : str, zVar);
        }
        boolean z10 = tVar == t.f10832i;
        j5.d dVar = this.g;
        if (dVar != null) {
            dVar.setWriteAheadLoggingEnabled(z10);
        }
    }

    public static final void a(q qVar, i5.a aVar) {
        Object mVar;
        c4.h hVar = qVar.f10810d;
        b(aVar);
        a aVar2 = qVar.f10809c;
        t tVar = aVar2.g;
        t tVar2 = t.f10832i;
        if (tVar == tVar2) {
            g8.b.y(aVar, "PRAGMA journal_mode = WAL");
        } else {
            g8.b.y(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (aVar2.g == tVar2) {
            g8.b.y(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            g8.b.y(aVar, "PRAGMA synchronous = FULL");
        }
        i5.c K = aVar.K("PRAGMA user_version");
        try {
            K.E();
            int i3 = (int) K.getLong(0);
            cf.c.m(K, null);
            int i10 = hVar.f1753a;
            if (i3 != i10) {
                g8.b.y(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    hd.l lVar = hd.n.f4511e;
                    if (i3 == 0) {
                        qVar.c(aVar);
                    } else {
                        qVar.d(aVar, i3, i10);
                    }
                    g8.b.y(aVar, "PRAGMA user_version = " + i10);
                    mVar = Unit.f5554a;
                } catch (Throwable th) {
                    hd.l lVar2 = hd.n.f4511e;
                    mVar = new hd.m(th);
                }
                if (!(mVar instanceof hd.m)) {
                    g8.b.y(aVar, "END TRANSACTION");
                }
                Throwable a9 = hd.n.a(mVar);
                if (a9 != null) {
                    g8.b.y(aVar, "ROLLBACK TRANSACTION");
                    throw a9;
                }
            }
            qVar.e(aVar);
        } finally {
        }
    }

    public static void b(i5.a aVar) {
        i5.c K = aVar.K("PRAGMA busy_timeout");
        try {
            K.E();
            long j = K.getLong(0);
            cf.c.m(K, null);
            if (j < 3000) {
                g8.b.y(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cf.c.m(K, th);
                throw th2;
            }
        }
    }

    public final void c(i5.a aVar) {
        aVar.getClass();
        i5.c K = aVar.K("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (K.E()) {
                if (K.getLong(0) == 0) {
                    z10 = true;
                }
            }
            cf.c.m(K, null);
            c4.h hVar = this.f10810d;
            hVar.a(aVar);
            if (!z10) {
                p0 g = hVar.g(aVar);
                if (!g.f1972c) {
                    a1.h(g.f1971b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            g8.b.y(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            g8.b.y(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) hVar.f1754b) + "')");
            hVar.c(aVar);
            Iterator it = this.f10811e.iterator();
            while (it.hasNext()) {
                ((s) it.next()).getClass();
                if (aVar instanceof l5.a) {
                    ((l5.a) aVar).f5861d.getClass();
                }
            }
        } finally {
        }
    }

    public final void d(i5.a aVar, int i3, int i10) {
        aVar.getClass();
        a aVar2 = this.f10809c;
        List<c5.a> z10 = g8.b.z(aVar2.f10706d, i3, i10);
        c4.h hVar = this.f10810d;
        if (z10 != null) {
            hVar.f(aVar);
            for (c5.a aVar3 : z10) {
                aVar3.getClass();
                if (!(aVar instanceof l5.a)) {
                    throw new hd.k("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                aVar3.a(((l5.a) aVar).f5861d);
            }
            p0 g = hVar.g(aVar);
            if (!g.f1972c) {
                a1.h(g.f1971b, "Migration didn't properly handle: ");
                return;
            }
            hVar.e(aVar);
            g8.b.y(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            g8.b.y(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) hVar.f1754b) + "')");
            return;
        }
        if (g8.b.F(aVar2, i3, i10)) {
            throw new IllegalStateException(("A migration from " + i3 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (aVar2.f10719s) {
            i5.c K = aVar.K("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                id.d b10 = kotlin.collections.x.b();
                while (K.E()) {
                    String k10 = K.k(0);
                    if (!kotlin.text.o.h(k10, "sqlite_") && !k10.equals("android_metadata")) {
                        b10.add(new Pair(k10, Boolean.valueOf(Intrinsics.a(K.k(1), "view"))));
                    }
                }
                id.d a9 = kotlin.collections.x.a(b10);
                cf.c.m(K, null);
                ListIterator listIterator = a9.listIterator(0);
                while (true) {
                    b1.d0 d0Var = (b1.d0) listIterator;
                    if (!d0Var.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) d0Var.next();
                    String str = (String) pair.f5552d;
                    if (((Boolean) pair.f5553e).booleanValue()) {
                        g8.b.y(aVar, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        g8.b.y(aVar, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } finally {
            }
        } else {
            hVar.b(aVar);
        }
        Iterator it = this.f10811e.iterator();
        while (it.hasNext()) {
            ((s) it.next()).getClass();
            if (aVar instanceof l5.a) {
                ((l5.a) aVar).f5861d.getClass();
            }
        }
        hVar.a(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(i5.a aVar) {
        boolean z10;
        Object mVar;
        p0 g;
        aVar.getClass();
        i5.c K = aVar.K("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (K.E()) {
                if (K.getLong(0) != 0) {
                    z10 = true;
                    cf.c.m(K, null);
                    c4.h hVar = this.f10810d;
                    if (z10) {
                        g8.b.y(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            hd.l lVar = hd.n.f4511e;
                            g = hVar.g(aVar);
                        } catch (Throwable th) {
                            hd.l lVar2 = hd.n.f4511e;
                            mVar = new hd.m(th);
                        }
                        if (!g.f1972c) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + g.f1971b).toString());
                        }
                        hVar.e(aVar);
                        g8.b.y(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        g8.b.y(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) hVar.f1754b) + "')");
                        mVar = Unit.f5554a;
                        if (!(mVar instanceof hd.m)) {
                            g8.b.y(aVar, "END TRANSACTION");
                        }
                        Throwable a9 = hd.n.a(mVar);
                        if (a9 != null) {
                            g8.b.y(aVar, "ROLLBACK TRANSACTION");
                            throw a9;
                        }
                    } else {
                        K = aVar.K("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String k10 = K.E() ? K.k(0) : null;
                            cf.c.m(K, null);
                            if (!((String) hVar.f1754b).equals(k10) && !((String) hVar.f1755c).equals(k10)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) hVar.f1754b) + ", found: " + k10).toString());
                            }
                        } finally {
                        }
                    }
                    hVar.d(aVar);
                    for (s sVar : this.f10811e) {
                        sVar.getClass();
                        if (aVar instanceof l5.a) {
                            sVar.a(((l5.a) aVar).f5861d);
                        }
                    }
                    this.f10807a = true;
                }
            }
            z10 = false;
            cf.c.m(K, null);
            c4.h hVar2 = this.f10810d;
            if (z10) {
            }
            hVar2.d(aVar);
            while (r0.hasNext()) {
            }
            this.f10807a = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public q(a aVar, a1.d dVar, a3.z zVar) {
        t tVar = aVar.g;
        this.f10809c = aVar;
        this.f10810d = new n(-1, "", "");
        List list = aVar.f10707e;
        this.f10811e = list == null ? kotlin.collections.j0.f5574d : list;
        ArrayList F = CollectionsKt.F(list == null ? kotlin.collections.j0.f5574d : list, new p(new a1.d(22, this)));
        Context context = aVar.f10703a;
        String str = aVar.f10704b;
        j5.c cVar = aVar.f10705c;
        k4.d dVar2 = aVar.f10706d;
        boolean z10 = aVar.f10708f;
        Executor executor = aVar.f10709h;
        Executor executor2 = aVar.f10710i;
        Intent intent = aVar.j;
        boolean z11 = aVar.f10711k;
        boolean z12 = aVar.f10712l;
        Set set = aVar.f10713m;
        String str2 = aVar.f10714n;
        File file = aVar.f10715o;
        Callable callable = aVar.f10716p;
        List list2 = aVar.f10717q;
        List list3 = aVar.f10718r;
        boolean z13 = aVar.f10719s;
        i5.b bVar = aVar.f10720t;
        CoroutineContext coroutineContext = aVar.f10721u;
        context.getClass();
        dVar2.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        a aVar2 = new a(context, str, cVar, dVar2, F, z10, tVar, executor, executor2, intent, z11, z12, set, str2, file, callable, list2, list3, z13, bVar, coroutineContext);
        aVar2.f10722v = aVar.f10722v;
        j5.d dVar3 = (j5.d) dVar.invoke(aVar2);
        this.g = dVar3;
        l.d dVar4 = new l.d(dVar3);
        String str3 = aVar.f10704b;
        this.f10812f = new b5.q(dVar4, str3 == null ? ":memory:" : str3, zVar);
        boolean z14 = tVar == t.f10832i;
        if (dVar3 != null) {
            dVar3.setWriteAheadLoggingEnabled(z14);
        }
    }
}
