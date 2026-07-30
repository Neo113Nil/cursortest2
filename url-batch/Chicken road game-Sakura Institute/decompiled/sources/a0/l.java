package a0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s1.l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements s.r {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f99f;

    /* renamed from: g, reason: collision with root package name */
    public int f100g;

    /* renamed from: h, reason: collision with root package name */
    public Object f101h;

    /* renamed from: i, reason: collision with root package name */
    public Object f102i;

    public /* synthetic */ l(int i7, byte b9) {
        this.f99f = i7;
    }

    public static void c(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i7 = 0;
        boolean z8 = false;
        while (i7 <= length) {
            boolean z9 = r6.k.g(str.charAt(!z8 ? i7 : length), 32) <= 0;
            if (z8) {
                if (!z9) {
                    break;
                } else {
                    length--;
                }
            } else if (z9) {
                i7++;
            } else {
                z8 = true;
            }
        }
        if (str.subSequence(i7, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e9) {
            Log.w("SupportSQLite", "delete failed: ", e9);
        }
    }

    public void a(int i7) {
        if (i7 < 0 || i7 >= this.f100g) {
            StringBuilder n8 = m.n(i7, "Index ", ", size ");
            n8.append(this.f100g);
            throw new IndexOutOfBoundsException(n8.toString());
        }
    }

    @Override // s.r
    public int b(Object obj) {
        i.u uVar = (i.u) this.f101h;
        int c4 = uVar.c(obj);
        if (c4 >= 0) {
            return uVar.f4800c[c4];
        }
        return -1;
    }

    public s.g d(int i7) {
        a(i7);
        s.g gVar = (s.g) this.f102i;
        if (gVar != null) {
            int i8 = gVar.f8004a;
            if (i7 < gVar.f8005b + i8 && i8 <= i7) {
                return gVar;
            }
        }
        i0.d dVar = (i0.d) this.f101h;
        s.g gVar2 = (s.g) dVar.f4840f[a8.d.l(i7, dVar)];
        this.f102i = gVar2;
        return gVar2;
    }

    public String e() {
        StringBuilder sb = new StringBuilder("$");
        int i7 = this.f100g + 1;
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = ((Object[]) this.f101h)[i8];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!r6.k.a(serialDescriptor.c(), m7.h.f6464h)) {
                    int i9 = ((int[]) this.f102i)[i8];
                    if (i9 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.e(i9));
                    }
                } else if (((int[]) this.f102i)[i8] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f102i)[i8]);
                    sb.append("]");
                }
            } else if (obj != q7.g.f7552a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String sb2 = sb.toString();
        r6.k.e(sb2, "toString(...)");
        return sb2;
    }

    public void f(y3.a aVar) {
        androidx.room.v vVar = (androidx.room.v) this.f102i;
        z3.b bVar = (z3.b) aVar;
        Cursor O = bVar.O("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z8 = false;
            if (O.moveToFirst()) {
                if (O.getInt(0) == 0) {
                    z8 = true;
                }
            }
            O.close();
            vVar.createAllTables(aVar);
            if (!z8) {
                androidx.room.w onValidateSchema = vVar.onValidateSchema(aVar);
                if (!onValidateSchema.f1119a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f1120b);
                }
            }
            bVar.i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '50f31e2e3e7ac4f9b1b612754ed93c7a')");
            vVar.onCreate(aVar);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(y3.a aVar) {
        boolean z8;
        androidx.room.v vVar = (androidx.room.v) this.f102i;
        z3.b bVar = (z3.b) aVar;
        Cursor O = bVar.O("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (O.moveToFirst()) {
                if (O.getInt(0) != 0) {
                    z8 = true;
                    O.close();
                    if (z8) {
                        androidx.room.w onValidateSchema = vVar.onValidateSchema(aVar);
                        if (!onValidateSchema.f1119a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f1120b);
                        }
                        vVar.onPostMigrate(aVar);
                        bVar.i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        bVar.i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '50f31e2e3e7ac4f9b1b612754ed93c7a')");
                    } else {
                        Cursor p6 = bVar.p(new q5.g("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = p6.moveToFirst() ? p6.getString(0) : null;
                            p6.close();
                            if (!"50f31e2e3e7ac4f9b1b612754ed93c7a".equals(string) && !"7a9621043b897987c4e86558851b2e9a".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 50f31e2e3e7ac4f9b1b612754ed93c7a, found: " + string);
                            }
                        } finally {
                        }
                    }
                    vVar.onOpen(aVar);
                    this.f101h = null;
                }
            }
            z8 = false;
            O.close();
            if (z8) {
            }
            vVar.onOpen(aVar);
            this.f101h = null;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0085 A[EDGE_INSN: B:60:0x0085->B:43:0x0085 BREAK  A[LOOP:0: B:22:0x0022->B:44:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(y3.a aVar, int i7, int i8) {
        Iterable iterable;
        TreeMap treeMap;
        boolean z8;
        androidx.room.v vVar = (androidx.room.v) this.f102i;
        androidx.room.g gVar = (androidx.room.g) this.f101h;
        if (gVar != null) {
            b6.c cVar = gVar.f1084b;
            cVar.getClass();
            if (i7 == i8) {
                iterable = e6.u.f2826f;
            } else {
                boolean z9 = i8 > i7;
                ArrayList arrayList = new ArrayList();
                int i9 = i7;
                do {
                    if (z9) {
                        if (i9 >= i8) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) cVar.f1394g).get(Integer.valueOf(i9));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z9 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z9) {
                                int i10 = i9 + 1;
                                r6.k.e(num, "targetVersion");
                                int intValue = num.intValue();
                                if (i10 <= intValue && intValue <= i8) {
                                    Object obj = treeMap.get(num);
                                    r6.k.c(obj);
                                    arrayList.add(obj);
                                    i9 = num.intValue();
                                    z8 = true;
                                    break;
                                }
                            } else {
                                r6.k.e(num, "targetVersion");
                                int intValue2 = num.intValue();
                                if (i8 <= intValue2 && intValue2 < i9) {
                                    Object obj2 = treeMap.get(num);
                                    r6.k.c(obj2);
                                    arrayList.add(obj2);
                                    i9 = num.intValue();
                                    z8 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z8 = false;
                    } else {
                        if (i9 <= i8) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) cVar.f1394g).get(Integer.valueOf(i9));
                        if (treeMap == null) {
                        }
                    }
                } while (z8);
                iterable = null;
            }
            if (iterable != null) {
                vVar.onPreMigrate(aVar);
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                androidx.room.w onValidateSchema = vVar.onValidateSchema(aVar);
                if (!onValidateSchema.f1119a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f1120b);
                }
                vVar.onPostMigrate(aVar);
                z3.b bVar = (z3.b) aVar;
                bVar.i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '50f31e2e3e7ac4f9b1b612754ed93c7a')");
                return;
            }
        }
        androidx.room.g gVar2 = (androidx.room.g) this.f101h;
        if (gVar2 != null && gVar2.f1087e.contains(Integer.valueOf(i7))) {
            vVar.dropAllTables(aVar);
            vVar.createAllTables(aVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i7 + " to " + i8 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public String toString() {
        switch (this.f99f) {
            case 3:
                return e();
            case 6:
                StringBuilder sb = new StringBuilder();
                if (((s7.q) this.f101h) == s7.q.f8662g) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f100g);
                sb.append(' ');
                sb.append((String) this.f102i);
                String sb2 = sb.toString();
                r6.k.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public l(s7.q qVar, int i7, String str) {
        this.f99f = 6;
        this.f101h = qVar;
        this.f100g = i7;
        this.f102i = str;
    }

    public l(androidx.room.g gVar, androidx.room.v vVar) {
        this.f99f = 1;
        r6.k.f(gVar, "configuration");
        int i7 = vVar.version;
        this.f99f = 1;
        this.f100g = i7;
        this.f101h = gVar;
        this.f102i = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r9 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(w6.d dVar, r.e eVar) {
        Object eVar2;
        this.f99f = 5;
        l lVar = eVar.f7597a;
        int i7 = dVar.f9521f;
        if (i7 >= 0) {
            int min = Math.min(dVar.f9522g, lVar.f100g - 1);
            if (min < i7) {
                i.u uVar = i.c0.f4730a;
                r6.k.d(uVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
                this.f101h = uVar;
                this.f102i = new Object[0];
                this.f100g = 0;
                return;
            }
            int i8 = (min - i7) + 1;
            this.f102i = new Object[i8];
            this.f100g = i7;
            i.u uVar2 = new i.u(i8);
            i0.d dVar2 = (i0.d) lVar.f101h;
            lVar.a(i7);
            lVar.a(min);
            if (min >= i7) {
                int l8 = a8.d.l(i7, dVar2);
                int i9 = ((s.g) dVar2.f4840f[l8]).f8004a;
                while (i9 <= min) {
                    s.g gVar = (s.g) dVar2.f4840f[l8];
                    q6.c cVar = (q6.c) gVar.f8006c.f1230g;
                    int i10 = gVar.f8004a;
                    int max = Math.max(i7, i10);
                    int min2 = Math.min(min, (gVar.f8005b + i10) - 1);
                    if (max <= min2) {
                        while (true) {
                            if (cVar != null) {
                                eVar2 = cVar.f(Integer.valueOf(max - i10));
                            }
                            eVar2 = new s.e(max);
                            uVar2.f(max, eVar2);
                            ((Object[]) this.f102i)[max - this.f100g] = eVar2;
                            max = max != min2 ? max + 1 : max;
                        }
                    }
                    i9 += gVar.f8005b;
                    l8++;
                }
                this.f101h = uVar2;
                return;
            }
            throw new IllegalArgumentException(("toIndex (" + min + ") should be not smaller than fromIndex (" + i7 + ')').toString());
        }
        throw new IllegalStateException("negative nearestRange.first");
    }

    public l() {
        this.f99f = 4;
        this.f101h = new i0.d(new s.g[16]);
    }

    public l(l2 l2Var) {
        this.f99f = 0;
        this.f101h = l2Var;
    }
}
