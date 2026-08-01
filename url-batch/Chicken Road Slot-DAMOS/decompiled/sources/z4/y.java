package z4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c7.p0;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y extends j5.a {

    /* renamed from: b, reason: collision with root package name */
    public a f10844b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10845c;

    /* renamed from: d, reason: collision with root package name */
    public final l.d f10846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a aVar, l.d dVar) {
        super(16);
        aVar.getClass();
        this.f10845c = aVar.f10707e;
        this.f10844b = aVar;
        this.f10846d = dVar;
    }

    @Override // j5.a
    public final void c(k5.d dVar) {
        Cursor o6 = dVar.o(new a8.f("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'", 2));
        try {
            boolean z10 = false;
            if (o6.moveToFirst()) {
                if (o6.getInt(0) == 0) {
                    z10 = true;
                }
            }
            o6.close();
            l.d.o(dVar);
            if (!z10) {
                p0 v10 = l.d.v(dVar);
                if (!v10.f1972c) {
                    a1.i(v10.f1971b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            SQLiteDatabase sQLiteDatabase = dVar.f5410d;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
            List list = this.f10845c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                i7.a.G(o6, th);
                throw th2;
            }
        }
    }

    @Override // j5.a
    public final void d(k5.d dVar, int i3, int i10) {
        f(dVar, i3, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    @Override // j5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(k5.d dVar) {
        boolean z10;
        List list;
        SQLiteDatabase sQLiteDatabase = dVar.f5410d;
        Cursor o6 = dVar.o(new a8.f("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'", 2));
        try {
            if (o6.moveToFirst()) {
                if (o6.getInt(0) != 0) {
                    z10 = true;
                    o6.close();
                    if (z10) {
                        p0 v10 = l.d.v(dVar);
                        if (!v10.f1972c) {
                            a1.i(v10.f1971b, "Pre-packaged database has an invalid schema: ");
                            return;
                        } else {
                            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                        }
                    } else {
                        o6 = dVar.o(new a8.f("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 2));
                        try {
                            String string = o6.moveToFirst() ? o6.getString(0) : null;
                            o6.close();
                            if (!"5181942b9ebc31ce68dacb56c16fd79f".equals(string) && !"ae2044fb577e65ee8bb576ca48a2f06e".equals(string)) {
                                kotlin.collections.i0.l(v4.a.k("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 5181942b9ebc31ce68dacb56c16fd79f, found: ", string));
                                return;
                            }
                        } finally {
                        }
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10846d.f5643e;
                    sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
                    workDatabase_Impl.r(new l5.a(dVar));
                    list = this.f10845c;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((s) it.next()).a(dVar);
                        }
                    }
                    this.f10844b = null;
                }
            }
            z10 = false;
            o6.close();
            if (z10) {
            }
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) this.f10846d.f5643e;
            sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            workDatabase_Impl2.r(new l5.a(dVar));
            list = this.f10845c;
            if (list != null) {
            }
            this.f10844b = null;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @Override // j5.a
    public final void f(k5.d dVar, int i3, int i10) {
        SQLiteDatabase sQLiteDatabase = dVar.f5410d;
        a aVar = this.f10844b;
        if (aVar != null) {
            k4.d dVar2 = aVar.f10706d;
            dVar2.getClass();
            List<c5.a> z10 = g8.b.z(dVar2, i3, i10);
            if (z10 != null) {
                cf.c.r(new l5.a(dVar));
                for (c5.a aVar2 : z10) {
                    aVar2.getClass();
                    aVar2.a(dVar);
                }
                p0 v10 = l.d.v(dVar);
                if (!v10.f1972c) {
                    a1.i(v10.f1971b, "Migration didn't properly handle: ");
                    return;
                } else {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    return;
                }
            }
        }
        a aVar3 = this.f10844b;
        if (aVar3 == null || g8.b.F(aVar3, i3, i10)) {
            throw new IllegalStateException("A migration from " + i3 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (aVar3.f10719s) {
            Cursor o6 = dVar.o(new a8.f("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'", 2));
            try {
                id.d b10 = kotlin.collections.x.b();
                while (o6.moveToNext()) {
                    String string = o6.getString(0);
                    string.getClass();
                    if (!string.startsWith("sqlite_") && !string.equals("android_metadata")) {
                        b10.add(new Pair(string, Boolean.valueOf(Intrinsics.a(o6.getString(1), "view"))));
                    }
                }
                id.d a9 = kotlin.collections.x.a(b10);
                o6.close();
                ListIterator listIterator = a9.listIterator(0);
                while (true) {
                    b1.d0 d0Var = (b1.d0) listIterator;
                    if (!d0Var.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) d0Var.next();
                    String str = (String) pair.f5552d;
                    if (((Boolean) pair.f5553e).booleanValue()) {
                        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
        }
        List list = this.f10845c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((s) it.next()).getClass();
            }
        }
        l.d.o(dVar);
    }

    @Override // j5.a
    public final void b(k5.d dVar) {
    }
}
