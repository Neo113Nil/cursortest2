package F2;

import A2.v;
import H2.AbstractC0080b;
import Z1.i;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.room.t;
import androidx.room.u;
import e2.C0380d;
import f.AbstractC0382a;
import j.AbstractC0476B;
import j.C0503u;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import u.C0938f;
import u.C0940h;
import u.InterfaceC0946n;
import u.x;
import v1.InterfaceC1018a;

/* loaded from: classes.dex */
public final class h implements x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1501d;

    /* renamed from: e, reason: collision with root package name */
    public int f1502e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1503f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1504g;

    public /* synthetic */ h(int i3, byte b2) {
        this.f1501d = i3;
    }

    public static void d(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i3 = 0;
        boolean z3 = false;
        while (i3 <= length) {
            boolean z4 = i.g(str.charAt(!z3 ? i3 : length), 32) <= 0;
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

    public void a(int i3, InterfaceC0946n interfaceC0946n) {
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0080b.h("size should be >=0, but was ", i3).toString());
        }
        if (i3 == 0) {
            return;
        }
        C0940h c0940h = new C0940h(this.f1502e, i3, interfaceC0946n);
        this.f1502e += i3;
        ((K.d) this.f1503f).b(c0940h);
    }

    @Override // u.x
    public int b(Object obj) {
        C0503u c0503u = (C0503u) this.f1503f;
        int c3 = c0503u.c(obj);
        if (c3 >= 0) {
            return c0503u.f5214c[c3];
        }
        return -1;
    }

    public void c(int i3) {
        if (i3 < 0 || i3 >= this.f1502e) {
            StringBuilder l3 = AbstractC0080b.l("Index ", i3, ", size ");
            l3.append(this.f1502e);
            throw new IndexOutOfBoundsException(l3.toString());
        }
    }

    public C0940h e(int i3) {
        c(i3);
        C0940h c0940h = (C0940h) this.f1504g;
        if (c0940h != null) {
            int i4 = c0940h.f8067b;
            int i5 = c0940h.f8066a;
            if (i3 < i4 + i5 && i5 <= i3) {
                return c0940h;
            }
        }
        K.d dVar = (K.d) this.f1503f;
        C0940h c0940h2 = (C0940h) dVar.f2640d[g2.i.D(i3, dVar)];
        this.f1504g = c0940h2;
        return c0940h2;
    }

    public Object f(int i3) {
        int i4 = i3 - this.f1502e;
        if (i4 >= 0) {
            Object[] objArr = (Object[]) this.f1504g;
            i.f(objArr, "<this>");
            if (i4 <= objArr.length - 1) {
                return objArr[i4];
            }
        }
        return null;
    }

    public String g() {
        StringBuilder sb = new StringBuilder("$");
        int i3 = this.f1502e + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            Object obj = ((Object[]) this.f1503f)[i4];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!i.a(serialDescriptor.i(), u2.h.f8551c)) {
                    int i5 = ((int[]) this.f1504g)[i4];
                    if (i5 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.a(i5));
                    }
                } else if (((int[]) this.f1504g)[i4] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f1504g)[i4]);
                    sb.append("]");
                }
            } else if (obj != y2.f.f8838a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String sb2 = sb.toString();
        i.e(sb2, "toString(...)");
        return sb2;
    }

    public void h(InterfaceC1018a interfaceC1018a) {
        w1.b bVar = (w1.b) interfaceC1018a;
        Cursor K3 = bVar.K("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z3 = false;
            if (K3.moveToFirst()) {
                if (K3.getInt(0) == 0) {
                    z3 = true;
                }
            }
            I2.d.u(K3, null);
            t tVar = (t) this.f1504g;
            tVar.createAllTables(interfaceC1018a);
            if (!z3) {
                u onValidateSchema = tVar.onValidateSchema(interfaceC1018a);
                if (!onValidateSchema.f4104a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f4105b);
                }
            }
            bVar.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '903dad90356ccb08d1456f2261911c5e')");
            tVar.onCreate(interfaceC1018a);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(InterfaceC1018a interfaceC1018a) {
        boolean z3;
        w1.b bVar = (w1.b) interfaceC1018a;
        Cursor K3 = bVar.K("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (K3.moveToFirst()) {
                if (K3.getInt(0) != 0) {
                    z3 = true;
                    I2.d.u(K3, null);
                    t tVar = (t) this.f1504g;
                    if (z3) {
                        u onValidateSchema = tVar.onValidateSchema(interfaceC1018a);
                        if (!onValidateSchema.f4104a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f4105b);
                        }
                        tVar.onPostMigrate(interfaceC1018a);
                        bVar.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        bVar.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '903dad90356ccb08d1456f2261911c5e')");
                    } else {
                        Cursor H3 = bVar.H(new C2.c("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = H3.moveToFirst() ? H3.getString(0) : null;
                            I2.d.u(H3, null);
                            if (!"903dad90356ccb08d1456f2261911c5e".equals(string) && !"7fd52a5721e84d0946a1447dc915891a".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 903dad90356ccb08d1456f2261911c5e, found: " + string);
                            }
                        } finally {
                        }
                    }
                    tVar.onOpen(interfaceC1018a);
                    this.f1503f = null;
                }
            }
            z3 = false;
            I2.d.u(K3, null);
            t tVar2 = (t) this.f1504g;
            if (z3) {
            }
            tVar2.onOpen(interfaceC1018a);
            this.f1503f = null;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0041 A[EDGE_INSN: B:60:0x0041->B:43:0x0041 BREAK  A[LOOP:0: B:22:0x0029->B:44:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(InterfaceC1018a interfaceC1018a, int i3, int i4) {
        Iterable iterable;
        TreeMap treeMap;
        boolean z3;
        androidx.room.i iVar = (androidx.room.i) this.f1503f;
        t tVar = (t) this.f1504g;
        if (iVar != null) {
            A2.g gVar = iVar.f4076b;
            gVar.getClass();
            if (i3 == i4) {
                iterable = M1.u.f2803d;
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
                        treeMap = (TreeMap) ((LinkedHashMap) gVar.f83b).get(Integer.valueOf(i5));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z4 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z4) {
                                int i6 = i5 + 1;
                                i.e(num, "targetVersion");
                                int intValue = num.intValue();
                                if (i6 <= intValue && intValue <= i4) {
                                    Object obj = treeMap.get(num);
                                    i.c(obj);
                                    arrayList.add(obj);
                                    i5 = num.intValue();
                                    z3 = true;
                                    break;
                                }
                            } else {
                                i.e(num, "targetVersion");
                                int intValue2 = num.intValue();
                                if (i4 <= intValue2 && intValue2 < i5) {
                                    Object obj2 = treeMap.get(num);
                                    i.c(obj2);
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
                        treeMap = (TreeMap) ((LinkedHashMap) gVar.f83b).get(Integer.valueOf(i5));
                        if (treeMap == null) {
                        }
                    }
                } while (z3);
                iterable = null;
            }
            if (iterable != null) {
                tVar.onPreMigrate(interfaceC1018a);
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                u onValidateSchema = tVar.onValidateSchema(interfaceC1018a);
                if (!onValidateSchema.f4104a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f4105b);
                }
                tVar.onPostMigrate(interfaceC1018a);
                w1.b bVar = (w1.b) interfaceC1018a;
                bVar.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '903dad90356ccb08d1456f2261911c5e')");
                return;
            }
        }
        if (((androidx.room.i) this.f1503f) != null) {
            tVar.dropAllTables(interfaceC1018a);
            tVar.createAllTables(interfaceC1018a);
            return;
        }
        throw new IllegalStateException("A migration from " + i3 + " to " + i4 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public String toString() {
        switch (this.f1501d) {
            case 0:
                StringBuilder sb = new StringBuilder();
                if (((v) this.f1503f) == v.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f1502e);
                sb.append(' ');
                sb.append((String) this.f1504g);
                String sb2 = sb.toString();
                i.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            case 5:
                return g();
            default:
                return super.toString();
        }
    }

    public h(v vVar, int i3, String str) {
        this.f1501d = 0;
        this.f1503f = vVar;
        this.f1502e = i3;
        this.f1504g = str;
    }

    public h(androidx.room.i iVar, t tVar) {
        this.f1501d = 2;
        i.f(iVar, "configuration");
        int i3 = tVar.version;
        this.f1501d = 2;
        this.f1502e = i3;
        this.f1503f = iVar;
        this.f1504g = tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r9 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(C0380d c0380d, AbstractC0382a abstractC0382a) {
        Object c0938f;
        this.f1501d = 4;
        h n3 = abstractC0382a.n();
        int i3 = c0380d.f4768d;
        if (i3 >= 0) {
            int min = Math.min(c0380d.f4769e, n3.f1502e - 1);
            if (min < i3) {
                C0503u c0503u = AbstractC0476B.f5134a;
                i.d(c0503u, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
                this.f1503f = c0503u;
                this.f1504g = new Object[0];
                this.f1502e = 0;
                return;
            }
            int i4 = (min - i3) + 1;
            this.f1504g = new Object[i4];
            this.f1502e = i3;
            C0503u c0503u2 = new C0503u(i4);
            n3.c(i3);
            n3.c(min);
            if (min >= i3) {
                K.d dVar = (K.d) n3.f1503f;
                int D = g2.i.D(i3, dVar);
                int i5 = ((C0940h) dVar.f2640d[D]).f8066a;
                while (i5 <= min) {
                    C0940h c0940h = (C0940h) dVar.f2640d[D];
                    Y1.c key = c0940h.f8068c.getKey();
                    int i6 = c0940h.f8066a;
                    int max = Math.max(i3, i6);
                    int min2 = Math.min(min, (c0940h.f8067b + i6) - 1);
                    if (max <= min2) {
                        while (true) {
                            if (key != null) {
                                c0938f = key.j(Integer.valueOf(max - i6));
                            }
                            c0938f = new C0938f(max);
                            c0503u2.f(max, c0938f);
                            ((Object[]) this.f1504g)[max - this.f1502e] = c0938f;
                            max = max != min2 ? max + 1 : max;
                        }
                    }
                    i5 += c0940h.f8067b;
                    D++;
                }
                this.f1503f = c0503u2;
                return;
            }
            throw new IllegalArgumentException(("toIndex (" + min + ") should be not smaller than fromIndex (" + i3 + ')').toString());
        }
        throw new IllegalStateException("negative nearestRange.first");
    }

    public h() {
        this.f1501d = 3;
        this.f1503f = new K.d(new C0940h[16]);
    }
}
