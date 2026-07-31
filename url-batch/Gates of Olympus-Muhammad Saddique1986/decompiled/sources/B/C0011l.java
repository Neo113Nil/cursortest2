package B;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import j.AbstractC0520B;
import j.C0547u;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.TreeMap;
import k2.C0572d;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m.y0;
import n2.AbstractC0737q;
import p.C0756c0;
import s.C0937f;
import t.C0978f;
import t.C0980h;
import u0.O0;

/* renamed from: B.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l implements t.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f420d;

    /* renamed from: e, reason: collision with root package name */
    public int f421e;

    /* renamed from: f, reason: collision with root package name */
    public Object f422f;

    /* renamed from: g, reason: collision with root package name */
    public Object f423g;

    public /* synthetic */ C0011l(int i3, byte b3) {
        this.f420d = i3;
    }

    public static void d(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i3 = 0;
        boolean z3 = false;
        while (i3 <= length) {
            boolean z4 = f2.j.g(str.charAt(!z3 ? i3 : length), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                } else {
                    length--;
                }
            } else if (z4) {
                i3++;
            } else {
                z3 = true;
            }
        }
        if (str.subSequence(i3, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e3) {
            Log.w("SupportSQLite", "delete failed: ", e3);
        }
    }

    public void a(int i3, G1.m mVar) {
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.h("size should be >=0, but was ", i3).toString());
        }
        if (i3 == 0) {
            return;
        }
        C0980h c0980h = new C0980h(this.f421e, i3, mVar);
        this.f421e += i3;
        ((K.d) this.f422f).b(c0980h);
    }

    @Override // t.t
    public int b(Object obj) {
        C0547u c0547u = (C0547u) this.f422f;
        int c2 = c0547u.c(obj);
        if (c2 >= 0) {
            return c0547u.f6332c[c2];
        }
        return -1;
    }

    public void c(int i3) {
        if (i3 < 0 || i3 >= this.f421e) {
            StringBuilder k3 = A.k.k(i3, "Index ", ", size ");
            k3.append(this.f421e);
            throw new IndexOutOfBoundsException(k3.toString());
        }
    }

    public C0980h e(int i3) {
        c(i3);
        C0980h c0980h = (C0980h) this.f423g;
        if (c0980h != null) {
            int i4 = c0980h.f8479b;
            int i5 = c0980h.f8478a;
            if (i3 < i4 + i5 && i5 <= i3) {
                return c0980h;
            }
        }
        K.d dVar = (K.d) this.f422f;
        C0980h c0980h2 = (C0980h) dVar.f3214d[n.T.d(i3, dVar)];
        this.f423g = c0980h2;
        return c0980h2;
    }

    public String f() {
        StringBuilder sb = new StringBuilder("$");
        int i3 = this.f421e + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            Object obj = ((Object[]) this.f422f)[i4];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!f2.j.a(serialDescriptor.i(), A2.k.f258d)) {
                    int i5 = ((int[]) this.f423g)[i4];
                    if (i5 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.a(i5));
                    }
                } else if (((int[]) this.f423g)[i4] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f423g)[i4]);
                    sb.append("]");
                }
            } else if (obj != E2.i.f1055a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String sb2 = sb.toString();
        f2.j.e(sb2, "toString(...)");
        return sb2;
    }

    public void g(A1.c cVar) {
    }

    public void h(A1.c cVar) {
        Cursor n3 = cVar.n("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z3 = false;
            if (n3.moveToFirst()) {
                if (n3.getInt(0) == 0) {
                    z3 = true;
                }
            }
            O2.d.t(n3, null);
            Y y3 = (Y) this.f423g;
            cVar.g("CREATE TABLE IF NOT EXISTS `clients` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `phone` TEXT NOT NULL, `note` TEXT NOT NULL, `createdAt` INTEGER NOT NULL)");
            cVar.g("CREATE TABLE IF NOT EXISTS `haircuts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `clientId` INTEGER, `clientName` TEXT NOT NULL, `service` TEXT NOT NULL, `price` REAL NOT NULL, `note` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
            cVar.g("CREATE INDEX IF NOT EXISTS `index_haircuts_clientId` ON `haircuts` (`clientId`)");
            cVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fa77e3f566aacaac76c67d9ee5e3c842')");
            if (!z3) {
                C0756c0 k3 = Y.k(cVar);
                if (!k3.f7650a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) k3.f7651b));
                }
            }
            cVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fa77e3f566aacaac76c67d9ee5e3c842')");
            ArrayList arrayList = ((AppDatabase_Impl) y3.f334d).f9924f;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                O2.d.t(n3, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(A1.c cVar) {
        boolean z3;
        w1.q qVar;
        Cursor n3 = cVar.n("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (n3.moveToFirst()) {
                if (n3.getInt(0) != 0) {
                    z3 = true;
                    O2.d.t(n3, null);
                    if (z3) {
                        C0756c0 k3 = Y.k(cVar);
                        if (!k3.f7650a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) k3.f7651b));
                        }
                        cVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        cVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fa77e3f566aacaac76c67d9ee5e3c842')");
                    } else {
                        Cursor q3 = cVar.q(new m1.q("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = q3.moveToFirst() ? q3.getString(0) : null;
                            O2.d.t(q3, null);
                            if (!"fa77e3f566aacaac76c67d9ee5e3c842".equals(string) && !"44fdd9757242a2eaea480684657f1d25".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: fa77e3f566aacaac76c67d9ee5e3c842, found: " + string);
                            }
                        } finally {
                        }
                    }
                    Y y3 = (Y) this.f423g;
                    ((AppDatabase_Impl) y3.f334d).f9919a = cVar;
                    AppDatabase_Impl appDatabase_Impl = (AppDatabase_Impl) y3.f334d;
                    appDatabase_Impl.getClass();
                    qVar = appDatabase_Impl.f9923e;
                    qVar.getClass();
                    synchronized (qVar.f9900l) {
                        if (qVar.f9895g) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            cVar.g("PRAGMA temp_store = MEMORY;");
                            cVar.g("PRAGMA recursive_triggers='ON';");
                            cVar.g("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            qVar.e(cVar);
                            qVar.f9896h = cVar.d("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            qVar.f9895g = true;
                        }
                    }
                    ArrayList arrayList = ((AppDatabase_Impl) y3.f334d).f9924f;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            it.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                    this.f422f = null;
                    return;
                }
            }
            z3 = false;
            O2.d.t(n3, null);
            if (z3) {
            }
            Y y32 = (Y) this.f423g;
            ((AppDatabase_Impl) y32.f334d).f9919a = cVar;
            AppDatabase_Impl appDatabase_Impl2 = (AppDatabase_Impl) y32.f334d;
            appDatabase_Impl2.getClass();
            qVar = appDatabase_Impl2.f9923e;
            qVar.getClass();
            synchronized (qVar.f9900l) {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0045 A[EDGE_INSN: B:85:0x0045->B:68:0x0045 BREAK  A[LOOP:2: B:47:0x002e->B:69:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(A1.c cVar, int i3, int i4) {
        Iterable iterable;
        TreeMap treeMap;
        boolean z3;
        G2.m mVar = (G2.m) this.f422f;
        Y y3 = (Y) this.f423g;
        if (mVar != null) {
            y0 y0Var = (y0) mVar.f2211g;
            y0Var.getClass();
            if (i3 == i4) {
                iterable = S1.u.f4320d;
            } else {
                boolean z4 = i4 > i3;
                ArrayList arrayList = new ArrayList();
                int i5 = i3;
                do {
                    if (z4) {
                        if (i5 >= i4) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) y0Var.f6913d).get(Integer.valueOf(i5));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z4 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z4) {
                                int i6 = i5 + 1;
                                f2.j.e(num, "targetVersion");
                                int intValue = num.intValue();
                                if (i6 <= intValue && intValue <= i4) {
                                    Object obj = treeMap.get(num);
                                    f2.j.c(obj);
                                    arrayList.add(obj);
                                    i5 = num.intValue();
                                    z3 = true;
                                    break;
                                }
                            } else {
                                f2.j.e(num, "targetVersion");
                                int intValue2 = num.intValue();
                                if (i4 <= intValue2 && intValue2 < i5) {
                                    Object obj2 = treeMap.get(num);
                                    f2.j.c(obj2);
                                    arrayList.add(obj2);
                                    i5 = num.intValue();
                                    z3 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z3 = false;
                    } else {
                        if (i5 <= i4) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) y0Var.f6913d).get(Integer.valueOf(i5));
                        if (treeMap == null) {
                        }
                    }
                } while (z3);
                iterable = null;
            }
            if (iterable != null) {
                T1.b bVar = new T1.b(10);
                Cursor n3 = cVar.n("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (n3.moveToNext()) {
                    try {
                        bVar.add(n3.getString(0));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            O2.d.t(n3, th);
                            throw th2;
                        }
                    }
                }
                O2.d.t(n3, null);
                ListIterator listIterator = O2.l.P(bVar).listIterator(0);
                while (true) {
                    S.x xVar = (S.x) listIterator;
                    if (!xVar.hasNext()) {
                        break;
                    }
                    String str = (String) xVar.next();
                    f2.j.e(str, "triggerName");
                    if (AbstractC0737q.z(str, "room_fts_content_sync_")) {
                        cVar.g("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                C0756c0 k3 = Y.k(cVar);
                if (!k3.f7650a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + ((String) k3.f7651b));
                }
                cVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fa77e3f566aacaac76c67d9ee5e3c842')");
                return;
            }
        }
        if (((G2.m) this.f422f) == null) {
            throw new IllegalStateException("A migration from " + i3 + " to " + i4 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        cVar.g("DROP TABLE IF EXISTS `clients`");
        cVar.g("DROP TABLE IF EXISTS `haircuts`");
        ArrayList arrayList2 = ((AppDatabase_Impl) y3.f334d).f9924f;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        cVar.g("CREATE TABLE IF NOT EXISTS `clients` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `phone` TEXT NOT NULL, `note` TEXT NOT NULL, `createdAt` INTEGER NOT NULL)");
        cVar.g("CREATE TABLE IF NOT EXISTS `haircuts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `clientId` INTEGER, `clientName` TEXT NOT NULL, `service` TEXT NOT NULL, `price` REAL NOT NULL, `note` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
        cVar.g("CREATE INDEX IF NOT EXISTS `index_haircuts_clientId` ON `haircuts` (`clientId`)");
        cVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fa77e3f566aacaac76c67d9ee5e3c842')");
    }

    public String toString() {
        switch (this.f420d) {
            case 1:
                return f();
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                StringBuilder sb = new StringBuilder();
                if (((G2.s) this.f422f) == G2.s.f2273e) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f421e);
                sb.append(' ');
                sb.append((String) this.f423g);
                String sb2 = sb.toString();
                f2.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C0011l(G2.s sVar, int i3, String str) {
        this.f420d = 2;
        this.f422f = sVar;
        this.f421e = i3;
        this.f423g = str;
    }

    public C0011l(G2.m mVar, Y y3) {
        this.f420d = 6;
        this.f420d = 6;
        this.f421e = 1;
        this.f422f = mVar;
        this.f423g = y3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r9 == null) goto L16;
     */
    /* JADX WARN: Type inference failed for: r5v2, types: [e2.c, f2.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0011l(C0572d c0572d, C0937f c0937f) {
        Object c0978f;
        this.f420d = 5;
        C0011l c0011l = c0937f.f8229a;
        int i3 = c0572d.f6419d;
        if (i3 >= 0) {
            int min = Math.min(c0572d.f6420e, c0011l.f421e - 1);
            if (min < i3) {
                C0547u c0547u = AbstractC0520B.f6252a;
                f2.j.d(c0547u, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
                this.f422f = c0547u;
                this.f423g = new Object[0];
                this.f421e = 0;
                return;
            }
            int i4 = (min - i3) + 1;
            this.f423g = new Object[i4];
            this.f421e = i3;
            C0547u c0547u2 = new C0547u(i4);
            c0011l.c(i3);
            c0011l.c(min);
            if (min >= i3) {
                K.d dVar = (K.d) c0011l.f422f;
                int d3 = n.T.d(i3, dVar);
                int i5 = ((C0980h) dVar.f3214d[d3]).f8478a;
                while (i5 <= min) {
                    C0980h c0980h = (C0980h) dVar.f3214d[d3];
                    ?? r5 = (f2.k) c0980h.f8480c.f2116b;
                    int i6 = c0980h.f8478a;
                    int max = Math.max(i3, i6);
                    int min2 = Math.min(min, (c0980h.f8479b + i6) - 1);
                    if (max <= min2) {
                        while (true) {
                            if (r5 != 0) {
                                c0978f = r5.n(Integer.valueOf(max - i6));
                            }
                            c0978f = new C0978f(max);
                            c0547u2.f(max, c0978f);
                            ((Object[]) this.f423g)[max - this.f421e] = c0978f;
                            max = max != min2 ? max + 1 : max;
                        }
                    }
                    i5 += c0980h.f8479b;
                    d3++;
                }
                this.f422f = c0547u2;
                return;
            }
            throw new IllegalArgumentException(("toIndex (" + min + ") should be not smaller than fromIndex (" + i3 + ')').toString());
        }
        throw new IllegalStateException("negative nearestRange.first");
    }

    public C0011l() {
        this.f420d = 4;
        this.f422f = new K.d(new C0980h[16]);
    }

    public C0011l(O0 o02) {
        this.f420d = 0;
        this.f422f = o02;
    }
}
