package defpackage;

import android.content.Context;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.aa2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ib2 {
    public boolean a;
    public boolean b;
    public final k70 c;
    public final xf0 d;
    public final List e;
    public final y00 f;
    public zs0 g;

    public ib2(k70 k70Var, xf0 xf0Var) {
        int i;
        b10 b10Var;
        this.c = k70Var;
        this.d = xf0Var;
        List list = k70Var.e;
        kb2 kb2Var = k70Var.f;
        u30 u30Var = k70Var.c;
        String str = k70Var.b;
        this.e = list == null ? ah0.m : list;
        oc2 oc2Var = k70Var.o;
        if (oc2Var != null) {
            if (str == null) {
                b10Var = new b10(new t21(this, oc2Var));
            } else {
                t21 t21Var = new t21(this, oc2Var);
                int ordinal = kb2Var.ordinal();
                if (ordinal == 1) {
                    i = 1;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + kb2Var + '\'').toString());
                    }
                    i = 4;
                }
                int ordinal2 = kb2Var.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + kb2Var + '\'').toString());
                }
                b10Var = new b10(t21Var, str, i);
            }
            this.f = b10Var;
        } else {
            if (u30Var == null) {
                lh.e("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            Context context = k70Var.a;
            context.getClass();
            ft0 ft0Var = new ft0(context, str, new r5(this, xf0Var.a));
            at0 at0Var = new at0();
            at0Var.m = ft0Var;
            this.f = new ar2(at0Var);
        }
        boolean z = kb2Var == kb2.o;
        br2 c = c();
        if (c != null) {
            c.setWriteAheadLoggingEnabled(z);
        }
    }

    public static final void a(ib2 ib2Var, nc2 nc2Var) {
        Object ba2Var;
        xf0 xf0Var = ib2Var.d;
        k70 k70Var = ib2Var.c;
        kb2 kb2Var = k70Var.f;
        kb2 kb2Var2 = kb2.o;
        if (kb2Var == kb2Var2) {
            s03.l(nc2Var, "PRAGMA journal_mode = WAL");
        } else {
            s03.l(nc2Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (k70Var.f == kb2Var2) {
            s03.l(nc2Var, "PRAGMA synchronous = NORMAL");
        } else {
            s03.l(nc2Var, "PRAGMA synchronous = FULL");
        }
        b(nc2Var);
        uc2 M = nc2Var.M("PRAGMA user_version");
        try {
            M.E();
            int i = (int) M.getLong(0);
            yk3.w(M, null);
            int i2 = xf0Var.a;
            if (i != i2) {
                s03.l(nc2Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    aa2.a aVar = aa2.m;
                    if (i == 0) {
                        ib2Var.d(nc2Var);
                    } else {
                        ib2Var.e(nc2Var, i, i2);
                    }
                    s03.l(nc2Var, "PRAGMA user_version = " + i2);
                    ba2Var = Unit.a;
                } catch (Throwable th) {
                    aa2.a aVar2 = aa2.m;
                    ba2Var = new ba2(th);
                }
                if (!(ba2Var instanceof ba2)) {
                    s03.l(nc2Var, "END TRANSACTION");
                }
                Throwable a = aa2.a(ba2Var);
                if (a != null) {
                    s03.l(nc2Var, "ROLLBACK TRANSACTION");
                    throw a;
                }
            }
            ib2Var.f(nc2Var);
        } finally {
        }
    }

    public static void b(nc2 nc2Var) {
        uc2 M = nc2Var.M("PRAGMA busy_timeout");
        try {
            M.E();
            long j = M.getLong(0);
            yk3.w(M, null);
            if (j < 3000) {
                s03.l(nc2Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                yk3.w(M, th);
                throw th2;
            }
        }
    }

    public final br2 c() {
        y00 y00Var = this.f;
        ar2 ar2Var = y00Var instanceof ar2 ? (ar2) y00Var : null;
        if (ar2Var != null) {
            return (br2) ar2Var.m.m;
        }
        return null;
    }

    public final void d(nc2 nc2Var) {
        nc2Var.getClass();
        uc2 M = nc2Var.M("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (M.E()) {
                if (M.getLong(0) == 0) {
                    z = true;
                }
            }
            yk3.w(M, null);
            xf0 xf0Var = this.d;
            xf0Var.a(nc2Var);
            if (!z) {
                mb2 g = xf0Var.g(nc2Var);
                if (!g.b) {
                    b71.w(g.a, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            g(nc2Var);
            xf0Var.c(nc2Var);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((hb2) it.next()).getClass();
                if (nc2Var instanceof zq2) {
                    ((zq2) nc2Var).m.getClass();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0097 A[EDGE_INSN: B:120:0x0097->B:104:0x0097 BREAK  A[LOOP:3: B:82:0x001e->B:105:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(nc2 nc2Var, int i, int i2) {
        Iterable iterable;
        Pair pair;
        boolean z;
        nc2Var.getClass();
        k70 k70Var = this.c;
        zg1 zg1Var = k70Var.d;
        zg1Var.getClass();
        if (i == i2) {
            iterable = ah0.m;
        } else {
            boolean z2 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            do {
                if (z2) {
                    if (i3 >= i2) {
                        iterable = arrayList;
                        break;
                    }
                    LinkedHashMap linkedHashMap = zg1Var.a;
                    if (z2) {
                        TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap != null) {
                            pair = new Pair(treeMap, treeMap.keySet());
                            if (pair != null) {
                            }
                        }
                        pair = null;
                        if (pair != null) {
                        }
                    } else {
                        TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 != null) {
                            pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                            if (pair != null) {
                                break;
                            }
                            Map map = (Map) pair.m;
                            Iterator it = ((Iterable) pair.n).iterator();
                            while (it.hasNext()) {
                                int intValue = ((Number) it.next()).intValue();
                                if (!z2) {
                                    if (i2 <= intValue && intValue < i3) {
                                        Object obj = map.get(Integer.valueOf(intValue));
                                        obj.getClass();
                                        arrayList.add(obj);
                                        z = true;
                                        i3 = intValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= intValue && intValue <= i2) {
                                    Object obj2 = map.get(Integer.valueOf(intValue));
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    z = true;
                                    i3 = intValue;
                                    break;
                                }
                            }
                            z = false;
                        }
                        pair = null;
                        if (pair != null) {
                        }
                    }
                } else {
                    if (i3 <= i2) {
                        iterable = arrayList;
                        break;
                    }
                    LinkedHashMap linkedHashMap2 = zg1Var.a;
                    if (z2) {
                    }
                }
            } while (z);
            iterable = null;
        }
        xf0 xf0Var = this.d;
        if (iterable != null) {
            xf0Var.f(nc2Var);
            Iterator it2 = iterable.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                b71.o();
                return;
            }
            mb2 g = xf0Var.g(nc2Var);
            if (!g.b) {
                b71.w(g.a, "Migration didn't properly handle: ");
                return;
            } else {
                xf0Var.e(nc2Var);
                g(nc2Var);
                return;
            }
        }
        if (l41.N(k70Var, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (k70Var.n) {
            uc2 M = nc2Var.M("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                le1 b = pv.b();
                while (M.E()) {
                    String j = M.j(0);
                    if (!tp2.o(j, "sqlite_", false) && !j.equals("android_metadata")) {
                        b.add(new Pair(j, Boolean.valueOf(Intrinsics.b(M.j(1), ViewHierarchyConstants.VIEW_KEY))));
                    }
                }
                le1 a = pv.a(b);
                yk3.w(M, null);
                ListIterator listIterator = a.listIterator(0);
                while (true) {
                    sx0 sx0Var = (sx0) listIterator;
                    if (!sx0Var.hasNext()) {
                        break;
                    }
                    Pair pair2 = (Pair) sx0Var.next();
                    String str = (String) pair2.m;
                    if (((Boolean) pair2.n).booleanValue()) {
                        s03.l(nc2Var, "DROP VIEW IF EXISTS " + str);
                    } else {
                        s03.l(nc2Var, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            xf0Var.b(nc2Var);
        }
        Iterator it3 = this.e.iterator();
        while (it3.hasNext()) {
            ((hb2) it3.next()).getClass();
            if (nc2Var instanceof zq2) {
                ((zq2) nc2Var).m.getClass();
            }
        }
        xf0Var.a(nc2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(nc2 nc2Var) {
        boolean z;
        Object ba2Var;
        mb2 g;
        nc2Var.getClass();
        uc2 M = nc2Var.M("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (M.E()) {
                if (M.getLong(0) != 0) {
                    z = true;
                    yk3.w(M, null);
                    xf0 xf0Var = this.d;
                    if (z) {
                        s03.l(nc2Var, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            aa2.a aVar = aa2.m;
                            g = xf0Var.g(nc2Var);
                        } catch (Throwable th) {
                            aa2.a aVar2 = aa2.m;
                            ba2Var = new ba2(th);
                        }
                        if (!g.b) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + g.a).toString());
                        }
                        xf0Var.e(nc2Var);
                        g(nc2Var);
                        ba2Var = Unit.a;
                        if (!(ba2Var instanceof ba2)) {
                            s03.l(nc2Var, "END TRANSACTION");
                        }
                        Throwable a = aa2.a(ba2Var);
                        if (a != null) {
                            s03.l(nc2Var, "ROLLBACK TRANSACTION");
                            throw a;
                        }
                    } else {
                        M = nc2Var.M("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String j = M.E() ? M.j(0) : null;
                            yk3.w(M, null);
                            if (!((String) xf0Var.b).equals(j) && !((String) xf0Var.c).equals(j)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) xf0Var.b) + ", found: " + j).toString());
                            }
                        } finally {
                        }
                    }
                    xf0Var.d(nc2Var);
                    for (hb2 hb2Var : this.e) {
                        hb2Var.getClass();
                        if (nc2Var instanceof zq2) {
                            zs0 zs0Var = ((zq2) nc2Var).m;
                            zs0Var.getClass();
                            hb2Var.a.invoke(zs0Var);
                        }
                    }
                    this.a = true;
                }
            }
            z = false;
            yk3.w(M, null);
            xf0 xf0Var2 = this.d;
            if (z) {
            }
            xf0Var2.d(nc2Var);
            while (r0.hasNext()) {
            }
            this.a = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final void g(nc2 nc2Var) {
        s03.l(nc2Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        s03.l(nc2Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.d.b) + "')");
    }

    public ib2(k70 k70Var, zd zdVar) {
        this.c = k70Var;
        this.d = new gb2(-1, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        List list = k70Var.e;
        this.e = list == null ? ah0.m : list;
        zv.F(list == null ? ah0.m : list, new hb2(new a0(10, this)));
        Context context = k70Var.a;
        zg1 zg1Var = k70Var.d;
        Executor executor = k70Var.g;
        Executor executor2 = k70Var.h;
        List list2 = k70Var.l;
        List list3 = k70Var.m;
        context.getClass();
        zg1Var.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        throw new ws1(null, 1, null);
    }
}
