package D1;

import D3.AbstractActivityC0117e;
import D3.M;
import F5.q;
import M5.v;
import Q.f;
import Q.j;
import V5.o;
import X5.t;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.i;
import l5.C0512p;
import m0.l;
import m5.C0524a;
import m5.C0526c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f367a;

    /* renamed from: b, reason: collision with root package name */
    public int f368b;

    /* renamed from: c, reason: collision with root package name */
    public Object f369c;

    /* renamed from: d, reason: collision with root package name */
    public Object f370d;

    public /* synthetic */ b(int i7, byte b7) {
        this.f367a = i7;
    }

    public static void b(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i7 = 0;
        boolean z5 = false;
        while (i7 <= length) {
            boolean z6 = i.g(str.charAt(!z5 ? i7 : length), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                } else {
                    length--;
                }
            } else if (z6) {
                i7++;
            } else {
                z5 = true;
            }
        }
        if (str.subSequence(i7, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e4) {
            Log.w("SupportSQLite", "delete failed: ", e4);
        }
    }

    public c a() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        return new c(((Long) this.f370d).longValue(), (String) this.f369c, this.f368b);
    }

    public int c() {
        int contentSensitivity;
        int i7 = this.f368b;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        View findViewById = ((Activity) this.f369c).findViewById(i7);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i7 + "not found");
    }

    public String d() {
        StringBuilder sb = new StringBuilder("$");
        int i7 = this.f368b + 1;
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = ((Object[]) this.f369c)[i8];
            if (obj instanceof R5.e) {
                R5.e eVar = (R5.e) obj;
                if (!i.a(eVar.c(), R5.i.f2173c)) {
                    int i9 = ((int[]) this.f370d)[i8];
                    if (i9 >= 0) {
                        sb.append(".");
                        sb.append(eVar.e(i9));
                    }
                } else if (((int[]) this.f370d)[i8] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f370d)[i8]);
                    sb.append("]");
                }
            } else if (obj != o.f2742a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String sb2 = sb.toString();
        i.d(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(V.c cVar) {
        boolean z5;
        List list;
        a6.d dVar = (a6.d) this.f370d;
        Cursor F6 = cVar.F("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (F6.moveToFirst()) {
                if (F6.getInt(0) == 0) {
                    z5 = true;
                    F6.close();
                    a6.d.c(cVar);
                    if (!z5) {
                        j g7 = a6.d.g(cVar);
                        if (!g7.f1947b) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g7.f1946a);
                        }
                    }
                    cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) dVar.f3172f;
                    list = workDatabase_Impl.f3566f;
                    if (list == null) {
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((m0.b) workDatabase_Impl.f3566f.get(i7)).getClass();
                        }
                        return;
                    }
                    return;
                }
            }
            z5 = false;
            F6.close();
            a6.d.c(cVar);
            if (!z5) {
            }
            cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) dVar.f3172f;
            list = workDatabase_Impl2.f3566f;
            if (list == null) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                A3.c.D(F6, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(V.c cVar) {
        boolean z5;
        f fVar;
        Cursor F6 = cVar.F("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (F6.moveToFirst()) {
                if (F6.getInt(0) != 0) {
                    z5 = true;
                    F6.close();
                    if (z5) {
                        j g7 = a6.d.g(cVar);
                        if (!g7.f1947b) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g7.f1946a);
                        }
                        cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    } else {
                        Cursor y = cVar.y(new v("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = y.moveToFirst() ? y.getString(0) : null;
                            y.close();
                            if (!"5181942b9ebc31ce68dacb56c16fd79f".equals(string) && !"ae2044fb577e65ee8bb576ca48a2f06e".equals(string)) {
                                throw new IllegalStateException(C1.c.h("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 5181942b9ebc31ce68dacb56c16fd79f, found: ", string));
                            }
                        } finally {
                        }
                    }
                    a6.d dVar = (a6.d) this.f370d;
                    ((WorkDatabase_Impl) dVar.f3172f).f3561a = cVar;
                    cVar.h("PRAGMA foreign_keys = ON");
                    fVar = ((WorkDatabase_Impl) dVar.f3172f).f3564d;
                    fVar.getClass();
                    synchronized (fVar.f1926k) {
                        if (fVar.f1921f) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            cVar.h("PRAGMA temp_store = MEMORY;");
                            cVar.h("PRAGMA recursive_triggers='ON';");
                            cVar.h("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            fVar.c(cVar);
                            fVar.f1922g = cVar.e("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            fVar.f1921f = true;
                        }
                    }
                    List list = ((WorkDatabase_Impl) dVar.f3172f).f3566f;
                    if (list != null) {
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((m0.b) ((WorkDatabase_Impl) dVar.f3172f).f3566f.get(i7)).getClass();
                            cVar.a();
                            try {
                                cVar.h("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - l.f5367a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                cVar.G();
                                cVar.g();
                            } catch (Throwable th) {
                                cVar.g();
                                throw th;
                            }
                        }
                    }
                    this.f369c = null;
                    return;
                }
            }
            z5 = false;
            F6.close();
            if (z5) {
            }
            a6.d dVar2 = (a6.d) this.f370d;
            ((WorkDatabase_Impl) dVar2.f3172f).f3561a = cVar;
            cVar.h("PRAGMA foreign_keys = ON");
            fVar = ((WorkDatabase_Impl) dVar2.f3172f).f3564d;
            fVar.getClass();
            synchronized (fVar.f1926k) {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0085 A[EDGE_INSN: B:86:0x0085->B:69:0x0085 BREAK  A[LOOP:3: B:48:0x0022->B:70:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(V.c cVar, int i7, int i8) {
        Set set;
        Iterable iterable;
        TreeMap treeMap;
        boolean z5;
        a6.d dVar = (a6.d) this.f370d;
        Q.b bVar = (Q.b) this.f369c;
        if (bVar != null) {
            M m4 = bVar.f1905d;
            m4.getClass();
            if (i7 == i8) {
                iterable = C0512p.f5303f;
            } else {
                boolean z6 = i8 > i7;
                ArrayList arrayList = new ArrayList();
                int i9 = i7;
                do {
                    if (z6) {
                        if (i9 >= i8) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) m4.f401g).get(Integer.valueOf(i9));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer targetVersion : z6 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z6) {
                                int i10 = i9 + 1;
                                i.d(targetVersion, "targetVersion");
                                int intValue = targetVersion.intValue();
                                if (i10 <= intValue && intValue <= i8) {
                                    Object obj = treeMap.get(targetVersion);
                                    i.b(obj);
                                    arrayList.add(obj);
                                    i9 = targetVersion.intValue();
                                    z5 = true;
                                    break;
                                }
                            } else {
                                i.d(targetVersion, "targetVersion");
                                int intValue2 = targetVersion.intValue();
                                if (i8 <= intValue2 && intValue2 < i9) {
                                    Object obj2 = treeMap.get(targetVersion);
                                    i.b(obj2);
                                    arrayList.add(obj2);
                                    i9 = targetVersion.intValue();
                                    z5 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z5 = false;
                    } else {
                        if (i9 <= i8) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) m4.f401g).get(Integer.valueOf(i9));
                        if (treeMap == null) {
                        }
                    }
                } while (z5);
                iterable = null;
            }
            if (iterable != null) {
                C0526c c0526c = new C0526c(10);
                Cursor F6 = cVar.F("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (F6.moveToNext()) {
                    try {
                        c0526c.add(F6.getString(0));
                    } finally {
                    }
                }
                F6.close();
                ListIterator listIterator = AbstractC0676f.c(c0526c).listIterator(0);
                while (true) {
                    C0524a c0524a = (C0524a) listIterator;
                    if (!c0524a.hasNext()) {
                        break;
                    }
                    String triggerName = (String) c0524a.next();
                    i.d(triggerName, "triggerName");
                    if (q.I(triggerName, "room_fts_content_sync_")) {
                        cVar.h("DROP TRIGGER IF EXISTS ".concat(triggerName));
                    }
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((R.a) it.next()).a(cVar);
                }
                j g7 = a6.d.g(cVar);
                if (!g7.f1947b) {
                    throw new IllegalStateException("Migration didn't properly handle: " + g7.f1946a);
                }
                cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                return;
            }
        }
        Q.b bVar2 = (Q.b) this.f369c;
        if (bVar2 != null) {
            if (!((i7 <= i8 || !bVar2.f1912k) && bVar2.f1911j && ((set = bVar2.f1913l) == null || !set.contains(Integer.valueOf(i7))))) {
                cVar.h("DROP TABLE IF EXISTS `Dependency`");
                cVar.h("DROP TABLE IF EXISTS `WorkSpec`");
                cVar.h("DROP TABLE IF EXISTS `WorkTag`");
                cVar.h("DROP TABLE IF EXISTS `SystemIdInfo`");
                cVar.h("DROP TABLE IF EXISTS `WorkName`");
                cVar.h("DROP TABLE IF EXISTS `WorkProgress`");
                cVar.h("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) dVar.f3172f;
                List list = workDatabase_Impl.f3566f;
                if (list != null) {
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((m0.b) workDatabase_Impl.f3566f.get(i11)).getClass();
                    }
                }
                a6.d.c(cVar);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i7 + " to " + i8 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void i(int i7) {
        int contentSensitivity;
        int i8 = this.f368b;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        View findViewById = ((Activity) this.f369c).findViewById(i8);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i8 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i7) {
            return;
        }
        findViewById.setContentSensitivity(i7);
        findViewById.invalidate();
    }

    public String toString() {
        switch (this.f367a) {
            case 4:
                return d();
            case 5:
            default:
                return super.toString();
            case 6:
                StringBuilder sb = new StringBuilder();
                if (((t) this.f370d) == t.f3037h) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f368b);
                sb.append(' ');
                sb.append((String) this.f369c);
                return sb.toString();
        }
    }

    public b(t tVar, int i7, String str) {
        this.f367a = 6;
        this.f370d = tVar;
        this.f368b = i7;
        this.f369c = str;
    }

    public b(H4.a aVar) {
        this.f367a = 1;
        this.f369c = new ConcurrentLinkedDeque();
        this.f368b = 1;
        this.f370d = aVar;
    }

    public b(int i7, AbstractActivityC0117e abstractActivityC0117e, J1.c cVar) {
        this.f367a = 3;
        this.f369c = abstractActivityC0117e;
        this.f368b = i7;
        this.f370d = cVar;
        cVar.f1289g = this;
    }

    public b(Q.b bVar, a6.d dVar) {
        this.f367a = 2;
        this.f367a = 2;
        this.f368b = 16;
        this.f369c = bVar;
        this.f370d = dVar;
    }

    public void e(V.c cVar) {
    }
}
