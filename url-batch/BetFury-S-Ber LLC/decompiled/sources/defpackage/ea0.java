package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ea0 {
    public boolean a;
    public boolean b;
    public final vh c;
    public final pa0 d;
    public final List e;
    public final fe f;
    public ig0 g;

    public ea0(vh vhVar, pa0 pa0Var) {
        int i;
        ke keVar;
        ha0 ha0Var = vhVar.g;
        sl slVar = vhVar.c;
        String str = vhVar.b;
        this.c = vhVar;
        this.d = pa0Var;
        List list = vhVar.e;
        this.e = list == null ? wm.f : list;
        db0 db0Var = vhVar.t;
        if (db0Var != null) {
            if (str == null) {
                keVar = new ke(new i5(this, db0Var));
            } else {
                i5 i5Var = new i5(this, db0Var);
                ha0Var.getClass();
                int[] iArr = g8.a;
                int i2 = iArr[ha0Var.ordinal()];
                if (i2 == 1) {
                    i = 1;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + ha0Var + '\'').toString());
                    }
                    i = 4;
                }
                int i3 = iArr[ha0Var.ordinal()];
                if (i3 != 1 && i3 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + ha0Var + '\'').toString());
                }
                keVar = new ke(i5Var, str, i);
            }
            this.f = keVar;
        } else {
            if (slVar == null) {
                s9.k("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            Context context = vhVar.a;
            context.getClass();
            this.f = new hg0(new kz((jg0) new er(context, str, new u2(this, pa0Var.getVersion()))));
        }
        boolean z = ha0Var == ha0.WRITE_AHEAD_LOGGING;
        jg0 c = c();
        if (c != null) {
            c.setWriteAheadLoggingEnabled(z);
        }
    }

    public static final void a(ea0 ea0Var, cb0 cb0Var) {
        Object z90Var;
        pa0 pa0Var = ea0Var.d;
        vh vhVar = ea0Var.c;
        ha0 ha0Var = vhVar.g;
        ha0 ha0Var2 = ha0.WRITE_AHEAD_LOGGING;
        if (ha0Var == ha0Var2) {
            gk0.p(cb0Var, "PRAGMA journal_mode = WAL");
        } else {
            gk0.p(cb0Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (vhVar.g == ha0Var2) {
            gk0.p(cb0Var, "PRAGMA synchronous = NORMAL");
        } else {
            gk0.p(cb0Var, "PRAGMA synchronous = FULL");
        }
        b(cb0Var);
        eb0 N = cb0Var.N("PRAGMA user_version");
        try {
            N.G();
            int i = (int) N.getLong(0);
            mv.h(N, null);
            if (i != pa0Var.getVersion()) {
                gk0.p(cb0Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        ea0Var.d(cb0Var);
                    } else {
                        ea0Var.e(cb0Var, i, pa0Var.getVersion());
                    }
                    gk0.p(cb0Var, "PRAGMA user_version = " + pa0Var.getVersion());
                    z90Var = sk0.a;
                } catch (Throwable th) {
                    z90Var = new z90(th);
                }
                if (!(z90Var instanceof z90)) {
                    gk0.p(cb0Var, "END TRANSACTION");
                }
                Throwable a = aa0.a(z90Var);
                if (a != null) {
                    gk0.p(cb0Var, "ROLLBACK TRANSACTION");
                    throw a;
                }
            }
            ea0Var.f(cb0Var);
        } finally {
        }
    }

    public static void b(cb0 cb0Var) {
        eb0 N = cb0Var.N("PRAGMA busy_timeout");
        try {
            N.G();
            long j = N.getLong(0);
            mv.h(N, null);
            if (j < 3000) {
                gk0.p(cb0Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                mv.h(N, th);
                throw th2;
            }
        }
    }

    public final jg0 c() {
        fe feVar = this.f;
        hg0 hg0Var = feVar instanceof hg0 ? (hg0) feVar : null;
        if (hg0Var != null) {
            return (jg0) hg0Var.f.f;
        }
        return null;
    }

    public final void d(cb0 cb0Var) {
        cb0Var.getClass();
        eb0 N = cb0Var.N("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (N.G()) {
                if (N.getLong(0) == 0) {
                    z = true;
                }
            }
            mv.h(N, null);
            pa0 pa0Var = this.d;
            pa0Var.createAllTables(cb0Var);
            if (!z) {
                oa0 onValidateSchema = pa0Var.onValidateSchema(cb0Var);
                if (!onValidateSchema.a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + onValidateSchema.b).toString());
                }
            }
            g(cb0Var);
            pa0Var.onCreate(cb0Var);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((da0) it.next()).getClass();
                if (cb0Var instanceof gg0) {
                    ((gg0) cb0Var).f.getClass();
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
    public final void e(cb0 cb0Var, int i, int i2) {
        Iterable iterable;
        k50 k50Var;
        boolean z;
        cb0Var.getClass();
        vh vhVar = this.c;
        gz gzVar = vhVar.d;
        gzVar.getClass();
        if (i == i2) {
            iterable = wm.f;
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
                    LinkedHashMap linkedHashMap = gzVar.a;
                    if (z2) {
                        TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap != null) {
                            k50Var = new k50(treeMap, treeMap.keySet());
                            if (k50Var != null) {
                            }
                        }
                        k50Var = null;
                        if (k50Var != null) {
                        }
                    } else {
                        TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 != null) {
                            k50Var = new k50(treeMap2, treeMap2.descendingKeySet());
                            if (k50Var != null) {
                                break;
                            }
                            Map map = (Map) k50Var.f;
                            Iterator it = ((Iterable) k50Var.g).iterator();
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
                        k50Var = null;
                        if (k50Var != null) {
                        }
                    }
                } else {
                    if (i3 <= i2) {
                        iterable = arrayList;
                        break;
                    }
                    LinkedHashMap linkedHashMap2 = gzVar.a;
                    if (z2) {
                    }
                }
            } while (z);
            iterable = null;
        }
        pa0 pa0Var = this.d;
        if (iterable != null) {
            pa0Var.onPreMigrate(cb0Var);
            Iterator it2 = iterable.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                s9.c();
                return;
            }
            oa0 onValidateSchema = pa0Var.onValidateSchema(cb0Var);
            if (onValidateSchema.a) {
                pa0Var.onPostMigrate(cb0Var);
                g(cb0Var);
                return;
            } else {
                throw new IllegalStateException(("Migration didn't properly handle: " + onValidateSchema.b).toString());
            }
        }
        if (mv.B(vhVar, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (vhVar.s) {
            eb0 N = cb0Var.N("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                dy u = bi.u();
                while (N.G()) {
                    String h = N.h(0);
                    if (!uf0.r(h, "sqlite_", false) && !h.equals("android_metadata")) {
                        u.add(new k50(h, Boolean.valueOf(mv.c(N.h(1), "view"))));
                    }
                }
                dy i4 = bi.i(u);
                mv.h(N, null);
                ListIterator listIterator = i4.listIterator(0);
                while (true) {
                    ay ayVar = (ay) listIterator;
                    if (!ayVar.hasNext()) {
                        break;
                    }
                    k50 k50Var2 = (k50) ayVar.next();
                    String str = (String) k50Var2.f;
                    if (((Boolean) k50Var2.g).booleanValue()) {
                        gk0.p(cb0Var, "DROP VIEW IF EXISTS " + str);
                    } else {
                        gk0.p(cb0Var, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            pa0Var.dropAllTables(cb0Var);
        }
        Iterator it3 = this.e.iterator();
        while (it3.hasNext()) {
            ((da0) it3.next()).getClass();
            if (cb0Var instanceof gg0) {
                ((gg0) cb0Var).f.getClass();
            }
        }
        pa0Var.createAllTables(cb0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(cb0 cb0Var) {
        boolean z;
        Object z90Var;
        oa0 onValidateSchema;
        cb0Var.getClass();
        eb0 N = cb0Var.N("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (N.G()) {
                if (N.getLong(0) != 0) {
                    z = true;
                    mv.h(N, null);
                    pa0 pa0Var = this.d;
                    if (z) {
                        gk0.p(cb0Var, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            onValidateSchema = pa0Var.onValidateSchema(cb0Var);
                        } catch (Throwable th) {
                            z90Var = new z90(th);
                        }
                        if (!onValidateSchema.a) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + onValidateSchema.b).toString());
                        }
                        pa0Var.onPostMigrate(cb0Var);
                        g(cb0Var);
                        z90Var = sk0.a;
                        if (!(z90Var instanceof z90)) {
                            gk0.p(cb0Var, "END TRANSACTION");
                        }
                        Throwable a = aa0.a(z90Var);
                        if (a != null) {
                            gk0.p(cb0Var, "ROLLBACK TRANSACTION");
                            throw a;
                        }
                    } else {
                        N = cb0Var.N("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String h = N.G() ? N.h(0) : null;
                            mv.h(N, null);
                            if (!mv.c(pa0Var.getIdentityHash(), h) && !mv.c(pa0Var.getLegacyIdentityHash(), h)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + pa0Var.getIdentityHash() + ", found: " + h).toString());
                            }
                        } finally {
                        }
                    }
                    pa0Var.onOpen(cb0Var);
                    for (da0 da0Var : this.e) {
                        da0Var.getClass();
                        if (cb0Var instanceof gg0) {
                            ig0 ig0Var = ((gg0) cb0Var).f;
                            ig0Var.getClass();
                            da0Var.a.h(ig0Var);
                        }
                    }
                    this.a = true;
                }
            }
            z = false;
            mv.h(N, null);
            pa0 pa0Var2 = this.d;
            if (z) {
            }
            pa0Var2.onOpen(cb0Var);
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

    public final void g(cb0 cb0Var) {
        gk0.p(cb0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String identityHash = this.d.getIdentityHash();
        identityHash.getClass();
        gk0.p(cb0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + identityHash + "')");
    }

    public ea0(vh vhVar, h hVar) {
        ha0 ha0Var = vhVar.g;
        this.c = vhVar;
        this.d = new ca0("", -1, "");
        List list = vhVar.e;
        wm wmVar = wm.f;
        this.e = list == null ? wmVar : list;
        ArrayList l0 = uc.l0(list == null ? wmVar : list, new da0(new h(4, this)));
        Context context = vhVar.a;
        String str = vhVar.b;
        sl slVar = vhVar.c;
        gz gzVar = vhVar.d;
        boolean z = vhVar.f;
        Executor executor = vhVar.h;
        Executor executor2 = vhVar.i;
        Intent intent = vhVar.j;
        boolean z2 = vhVar.k;
        boolean z3 = vhVar.l;
        Set set = vhVar.m;
        String str2 = vhVar.n;
        File file = vhVar.o;
        Callable callable = vhVar.p;
        List list2 = vhVar.q;
        List list3 = vhVar.r;
        boolean z4 = vhVar.s;
        db0 db0Var = vhVar.t;
        qg qgVar = vhVar.u;
        context.getClass();
        gzVar.getClass();
        ha0Var.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        this.f = new hg0(new kz((jg0) hVar.h(new vh(context, str, slVar, gzVar, l0, z, ha0Var, executor, executor2, intent, z2, z3, set, str2, file, callable, list2, list3, z4, db0Var, qgVar))));
        boolean z5 = ha0Var == ha0.WRITE_AHEAD_LOGGING;
        jg0 c = c();
        if (c != null) {
            c.setWriteAheadLoggingEnabled(z5);
        }
    }
}
