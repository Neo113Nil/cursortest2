package B6;

import I.T;
import a.AbstractC0169a;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase_Impl;
import h.AbstractC0454a;
import h0.C0456b;
import h0.C0460f;
import h0.C0464j;
import h4.AbstractActivityC0488c;
import i0.AbstractC0540a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Unit;
import kotlin.collections.A;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;
import m0.C0684c;
import n.AbstractC0731q0;
import n.C0733s;
import o5.C0803a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228a;

    /* renamed from: b, reason: collision with root package name */
    public int f229b;

    /* renamed from: c, reason: collision with root package name */
    public Object f230c;

    /* renamed from: d, reason: collision with root package name */
    public Object f231d;

    public /* synthetic */ o(int i2, byte b7) {
        this.f228a = i2;
    }

    public static void b(String str) {
        if (kotlin.text.p.g(str, ":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i2 = 0;
        boolean z7 = false;
        while (i2 <= length) {
            boolean z8 = Intrinsics.d(str.charAt(!z7 ? i2 : length), 32) <= 0;
            if (z7) {
                if (!z8) {
                    break;
                } else {
                    length--;
                }
            } else if (z8) {
                i2++;
            } else {
                z7 = true;
            }
        }
        if (str.subSequence(i2, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            File file = new File(str);
            Intrinsics.checkNotNullParameter(file, "file");
            SQLiteDatabase.deleteDatabase(file);
        } catch (Exception e7) {
            Log.w("SupportSQLite", "delete failed: ", e7);
        }
    }

    public static void j(C0684c c0684c) {
        c0684c.j("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        Intrinsics.checkNotNullParameter("5181942b9ebc31ce68dacb56c16fd79f", "hash");
        c0684c.j("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }

    public void a() {
        D6.i iVar;
        ImageView imageView = (ImageView) this.f230c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0731q0.a(drawable);
        }
        if (drawable == null || (iVar = (D6.i) this.f231d) == null) {
            return;
        }
        C0733s.d(drawable, iVar, imageView.getDrawableState());
    }

    public int c() {
        int contentSensitivity;
        int i2 = this.f229b;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        View findViewById = ((Activity) this.f230c).findViewById(i2);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i2 + "not found");
    }

    public String d() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.f229b + 1;
        for (int i5 = 0; i5 < i2; i5++) {
            Object obj = ((Object[]) this.f230c)[i5];
            if (obj instanceof x6.e) {
                x6.e eVar = (x6.e) obj;
                if (!Intrinsics.a(eVar.c(), x6.i.f8443c)) {
                    int i7 = ((int[]) this.f231d)[i5];
                    if (i7 >= 0) {
                        sb.append(".");
                        sb.append(eVar.e(i7));
                    }
                } else if (((int[]) this.f231d)[i5] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f231d)[i5]);
                    sb.append("]");
                }
            } else if (obj != n.f227a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public void e(AttributeSet attributeSet, int i2) {
        int resourceId;
        ImageView imageView = (ImageView) this.f230c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0454a.f5042f;
        D0.j R4 = D0.j.R(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) R4.f331i;
        T.h(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) R4.f331i, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = O6.g.M(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0731q0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(R4.I(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC0731q0.c(typedArray.getInt(3, -1), null));
            }
            R4.W();
        } catch (Throwable th) {
            R4.W();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(C0684c db) {
        boolean z7;
        List list;
        B.f fVar = (B.f) this.f231d;
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Cursor E7 = db.E("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (E7.moveToFirst()) {
                if (E7.getInt(0) == 0) {
                    z7 = true;
                    E7.close();
                    B.f.f(db);
                    if (!z7) {
                        C0464j o7 = B.f.o(db);
                        if (!o7.f5109c) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + o7.f5108b);
                        }
                    }
                    j(db);
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) fVar.f152e;
                    list = workDatabase_Impl.f4096f;
                    if (list == null) {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((H0.b) workDatabase_Impl.f4096f.get(i2)).getClass();
                            Intrinsics.checkNotNullParameter(db, "db");
                        }
                        return;
                    }
                    return;
                }
            }
            z7 = false;
            E7.close();
            B.f.f(db);
            if (!z7) {
            }
            j(db);
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) fVar.f152e;
            list = workDatabase_Impl2.f4096f;
            if (list == null) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0169a.d(E7, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(C0684c db) {
        boolean z7;
        C0460f c0460f;
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Cursor E7 = db.E("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (E7.moveToFirst()) {
                if (E7.getInt(0) != 0) {
                    z7 = true;
                    E7.close();
                    if (z7) {
                        C0464j o7 = B.f.o(db);
                        if (!o7.f5109c) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + o7.f5108b);
                        }
                        j(db);
                    } else {
                        Cursor F4 = db.F(new C0654a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 0));
                        try {
                            String string = F4.moveToFirst() ? F4.getString(0) : null;
                            F4.close();
                            if (!"5181942b9ebc31ce68dacb56c16fd79f".equals(string) && !"ae2044fb577e65ee8bb576ca48a2f06e".equals(string)) {
                                throw new IllegalStateException(r4.f.i("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 5181942b9ebc31ce68dacb56c16fd79f, found: ", string));
                            }
                        } finally {
                        }
                    }
                    B.f fVar = (B.f) this.f231d;
                    ((WorkDatabase_Impl) fVar.f152e).f4091a = db;
                    db.j("PRAGMA foreign_keys = ON");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) fVar.f152e;
                    Intrinsics.checkNotNullParameter(db, "db");
                    c0460f = workDatabase_Impl.f4094d;
                    c0460f.getClass();
                    Intrinsics.checkNotNullParameter(db, "database");
                    synchronized (c0460f.f5085k) {
                        if (c0460f.f5081f) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            db.j("PRAGMA temp_store = MEMORY;");
                            db.j("PRAGMA recursive_triggers='ON';");
                            db.j("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            c0460f.c(db);
                            c0460f.f5082g = db.g("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            c0460f.f5081f = true;
                            Unit unit = Unit.f6114a;
                        }
                    }
                    List list = ((WorkDatabase_Impl) fVar.f152e).f4096f;
                    if (list != null) {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((H0.b) ((WorkDatabase_Impl) fVar.f152e).f4096f.get(i2)).getClass();
                            Intrinsics.checkNotNullParameter(db, "db");
                            Intrinsics.checkNotNullParameter(db, "db");
                            db.a();
                            try {
                                db.j("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - H0.m.f912a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                db.G();
                                db.h();
                            } catch (Throwable th) {
                                db.h();
                                throw th;
                            }
                        }
                    }
                    this.f230c = null;
                    return;
                }
            }
            z7 = false;
            E7.close();
            if (z7) {
            }
            B.f fVar2 = (B.f) this.f231d;
            ((WorkDatabase_Impl) fVar2.f152e).f4091a = db;
            db.j("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) fVar2.f152e;
            Intrinsics.checkNotNullParameter(db, "db");
            c0460f = workDatabase_Impl2.f4094d;
            c0460f.getClass();
            Intrinsics.checkNotNullParameter(db, "database");
            synchronized (c0460f.f5085k) {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0091 A[EDGE_INSN: B:87:0x0091->B:70:0x0091 BREAK  A[LOOP:3: B:49:0x002e->B:71:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(C0684c db, int i2, int i5) {
        Set set;
        Iterable iterable;
        TreeMap treeMap;
        boolean z7;
        B.f fVar = (B.f) this.f231d;
        Intrinsics.checkNotNullParameter(db, "db");
        C0456b c0456b = (C0456b) this.f230c;
        if (c0456b != null) {
            l2.c cVar = c0456b.f5065d;
            cVar.getClass();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (i2 == i5) {
                iterable = A.f6115d;
            } else {
                boolean z8 = i5 > i2;
                ArrayList arrayList = new ArrayList();
                int i7 = i2;
                do {
                    if (z8) {
                        if (i7 >= i5) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) cVar.f6269d).get(Integer.valueOf(i7));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer targetVersion : z8 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z8) {
                                int i8 = i7 + 1;
                                Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                int intValue = targetVersion.intValue();
                                if (i8 <= intValue && intValue <= i5) {
                                    Object obj = treeMap.get(targetVersion);
                                    Intrinsics.b(obj);
                                    arrayList.add(obj);
                                    i7 = targetVersion.intValue();
                                    z7 = true;
                                    break;
                                }
                            } else {
                                Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                int intValue2 = targetVersion.intValue();
                                if (i5 <= intValue2 && intValue2 < i7) {
                                    Object obj2 = treeMap.get(targetVersion);
                                    Intrinsics.b(obj2);
                                    arrayList.add(obj2);
                                    i7 = targetVersion.intValue();
                                    z7 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z7 = false;
                    } else {
                        if (i7 <= i5) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) cVar.f6269d).get(Integer.valueOf(i7));
                        if (treeMap == null) {
                        }
                    }
                } while (z7);
                iterable = null;
            }
            if (iterable != null) {
                Intrinsics.checkNotNullParameter(db, "db");
                int i9 = 0;
                S5.e eVar = new S5.e(i9, 1, defaultConstructorMarker);
                Cursor E7 = db.E("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (E7.moveToNext()) {
                    try {
                        eVar.add(E7.getString(i9));
                        i9 = 0;
                    } finally {
                    }
                }
                Unit unit = Unit.f6114a;
                E7.close();
                ListIterator listIterator = kotlin.collections.q.a(eVar).listIterator(0);
                while (true) {
                    S5.b bVar = (S5.b) listIterator;
                    if (!bVar.hasNext()) {
                        break;
                    }
                    String triggerName = (String) bVar.next();
                    Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
                    if (kotlin.text.p.l(triggerName, "room_fts_content_sync_")) {
                        db.j("DROP TRIGGER IF EXISTS ".concat(triggerName));
                    }
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((AbstractC0540a) it.next()).a(db);
                }
                C0464j o7 = B.f.o(db);
                if (!o7.f5109c) {
                    throw new IllegalStateException("Migration didn't properly handle: " + o7.f5108b);
                }
                j(db);
                return;
            }
        }
        boolean z9 = true;
        C0456b c0456b2 = (C0456b) this.f230c;
        if (c0456b2 != null) {
            if ((i2 > i5 && c0456b2.f5071k) || !c0456b2.j || ((set = c0456b2.f5072l) != null && set.contains(Integer.valueOf(i2)))) {
                z9 = false;
            }
            if (!z9) {
                db.j("DROP TABLE IF EXISTS `Dependency`");
                db.j("DROP TABLE IF EXISTS `WorkSpec`");
                db.j("DROP TABLE IF EXISTS `WorkTag`");
                db.j("DROP TABLE IF EXISTS `SystemIdInfo`");
                db.j("DROP TABLE IF EXISTS `WorkName`");
                db.j("DROP TABLE IF EXISTS `WorkProgress`");
                db.j("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) fVar.f152e;
                List list = workDatabase_Impl.f4096f;
                if (list != null) {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((H0.b) workDatabase_Impl.f4096f.get(i10)).getClass();
                        Intrinsics.checkNotNullParameter(db, "db");
                    }
                }
                B.f.f(db);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i2 + " to " + i5 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void i(int i2) {
        int contentSensitivity;
        int i5 = this.f229b;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        View findViewById = ((Activity) this.f230c).findViewById(i5);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i5 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i2) {
            return;
        }
        findViewById.setContentSensitivity(i2);
        findViewById.invalidate();
    }

    public String toString() {
        switch (this.f228a) {
            case 0:
                return d();
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb = new StringBuilder();
                if (((D6.x) this.f230c) == D6.x.f624i) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f229b);
                sb.append(' ');
                sb.append((String) this.f231d);
                return sb.toString();
        }
    }

    public o(D6.x protocol, int i2, String message) {
        this.f228a = 2;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f230c = protocol;
        this.f229b = i2;
        this.f231d = message;
    }

    public o(C0803a c0803a) {
        this.f228a = 5;
        this.f230c = new ConcurrentLinkedDeque();
        this.f229b = 1;
        this.f231d = c0803a;
    }

    public o(int i2, AbstractActivityC0488c abstractActivityC0488c, l4.b bVar) {
        this.f228a = 6;
        this.f230c = abstractActivityC0488c;
        this.f229b = i2;
        this.f231d = bVar;
        bVar.f6272e = this;
    }

    public o(C0456b configuration, B.f delegate) {
        this.f228a = 3;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter("5181942b9ebc31ce68dacb56c16fd79f", "identityHash");
        Intrinsics.checkNotNullParameter("ae2044fb577e65ee8bb576ca48a2f06e", "legacyHash");
        this.f228a = 3;
        this.f229b = 16;
        this.f230c = configuration;
        this.f231d = delegate;
    }

    public o(ImageView imageView) {
        this.f228a = 4;
        this.f229b = 0;
        this.f230c = imageView;
    }
}
