package com.winpower.neonfit.data;

import D.d;
import H1.l;
import X0.u;
import Y0.a;
import Y0.c;
import Y0.f;
import Y0.i;
import android.database.Cursor;
import androidx.room.j;
import androidx.room.r;
import androidx.room.w;
import androidx.room.x;
import androidx.room.y;
import i0.C0176a;
import i0.C0177b;
import i0.C0178c;
import i0.C0179d;
import i0.C0180e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import k0.InterfaceC0199a;
import k0.InterfaceC0200b;
import l0.h;
import q1.m;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile FoodDao _foodDao;

    @Override // androidx.room.w
    public void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC0199a d2 = ((h) super.getOpenHelper()).d();
        try {
            super.beginTransaction();
            d2.r("DELETE FROM `food_entries`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            d2.u("PRAGMA wal_checkpoint(FULL)").close();
            if (!d2.x()) {
                d2.r("VACUUM");
            }
        }
    }

    @Override // androidx.room.w
    public r createInvalidationTracker() {
        return new r(this, new HashMap(0), new HashMap(0), "food_entries");
    }

    @Override // androidx.room.w
    public InterfaceC0200b createOpenHelper(j jVar) {
        return new h(jVar.f2102a, "neonfit.db", new d(jVar, new x(1) { // from class: com.winpower.neonfit.data.AppDatabase_Impl.1
            @Override // androidx.room.x
            public void createAllTables(InterfaceC0199a interfaceC0199a) {
                interfaceC0199a.r("CREATE TABLE IF NOT EXISTS `food_entries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `calories` INTEGER NOT NULL, `protein` REAL NOT NULL, `fat` REAL NOT NULL, `carbs` REAL NOT NULL, `loggedAt` INTEGER NOT NULL)");
                interfaceC0199a.r("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC0199a.r("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ad2920939625b3409e4302d305cde49b')");
            }

            @Override // androidx.room.x
            public void dropAllTables(InterfaceC0199a interfaceC0199a) {
                interfaceC0199a.r("DROP TABLE IF EXISTS `food_entries`");
                List list = ((w) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
            }

            @Override // androidx.room.x
            public void onCreate(InterfaceC0199a interfaceC0199a) {
                List list = ((w) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
            }

            @Override // androidx.room.x
            public void onOpen(InterfaceC0199a interfaceC0199a) {
                ((w) AppDatabase_Impl.this).mDatabase = interfaceC0199a;
                AppDatabase_Impl.this.internalInitInvalidationTracker(interfaceC0199a);
                List list = ((w) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
            }

            @Override // androidx.room.x
            public void onPostMigrate(InterfaceC0199a interfaceC0199a) {
            }

            @Override // androidx.room.x
            public void onPreMigrate(InterfaceC0199a interfaceC0199a) {
                j1.h.e(interfaceC0199a, "db");
                c cVar = new c(10);
                Cursor u2 = interfaceC0199a.u("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (u2.moveToNext()) {
                    try {
                        cVar.add(u2.getString(0));
                    } finally {
                    }
                }
                l.j(u2, null);
                ListIterator listIterator = l.f(cVar).listIterator(0);
                while (true) {
                    a aVar = (a) listIterator;
                    if (!aVar.hasNext()) {
                        return;
                    }
                    String str = (String) aVar.next();
                    j1.h.d(str, "triggerName");
                    if (m.s0(str, "room_fts_content_sync_", false)) {
                        interfaceC0199a.r("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0258  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0275  */
            @Override // androidx.room.x
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public y onValidateSchema(InterfaceC0199a interfaceC0199a) {
                Map b2;
                i iVar;
                C0180e c0180e;
                HashMap hashMap = new HashMap(7);
                hashMap.put("id", new C0176a("id", "INTEGER", true, 1, null, 1));
                hashMap.put("name", new C0176a("name", "TEXT", true, 0, null, 1));
                hashMap.put("calories", new C0176a("calories", "INTEGER", true, 0, null, 1));
                hashMap.put("protein", new C0176a("protein", "REAL", true, 0, null, 1));
                hashMap.put("fat", new C0176a("fat", "REAL", true, 0, null, 1));
                hashMap.put("carbs", new C0176a("carbs", "REAL", true, 0, null, 1));
                hashMap.put("loggedAt", new C0176a("loggedAt", "INTEGER", true, 0, null, 1));
                C0180e c0180e2 = new C0180e(hashMap, new HashSet(0), new HashSet(0));
                j1.h.e(interfaceC0199a, "database");
                Cursor u2 = interfaceC0199a.u("PRAGMA table_info(`food_entries`)");
                try {
                    if (u2.getColumnCount() <= 0) {
                        b2 = u.f1386a;
                        l.j(u2, null);
                    } else {
                        int columnIndex = u2.getColumnIndex("name");
                        int columnIndex2 = u2.getColumnIndex("type");
                        int columnIndex3 = u2.getColumnIndex("notnull");
                        int columnIndex4 = u2.getColumnIndex("pk");
                        int columnIndex5 = u2.getColumnIndex("dflt_value");
                        f fVar = new f();
                        while (u2.moveToNext()) {
                            String string = u2.getString(columnIndex);
                            String string2 = u2.getString(columnIndex2);
                            boolean z2 = u2.getInt(columnIndex3) != 0;
                            int i = u2.getInt(columnIndex4);
                            String string3 = u2.getString(columnIndex5);
                            j1.h.d(string, "name");
                            j1.h.d(string2, "type");
                            fVar.put(string, new C0176a(string, string2, z2, i, string3, 2));
                        }
                        b2 = fVar.b();
                        l.j(u2, null);
                    }
                    u2 = interfaceC0199a.u("PRAGMA foreign_key_list(`food_entries`)");
                    try {
                        int columnIndex6 = u2.getColumnIndex("id");
                        int columnIndex7 = u2.getColumnIndex("seq");
                        int columnIndex8 = u2.getColumnIndex("table");
                        int columnIndex9 = u2.getColumnIndex("on_delete");
                        int columnIndex10 = u2.getColumnIndex("on_update");
                        List P2 = l.P(u2);
                        u2.moveToPosition(-1);
                        i iVar2 = new i();
                        while (u2.moveToNext()) {
                            if (u2.getInt(columnIndex7) == 0) {
                                int i2 = u2.getInt(columnIndex6);
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj : P2) {
                                    int i3 = columnIndex6;
                                    int i4 = columnIndex7;
                                    if (((C0178c) obj).f3148a == i2) {
                                        arrayList3.add(obj);
                                    }
                                    columnIndex6 = i3;
                                    columnIndex7 = i4;
                                }
                                int i5 = columnIndex6;
                                int i6 = columnIndex7;
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    C0178c c0178c = (C0178c) it.next();
                                    arrayList.add(c0178c.f3150c);
                                    arrayList2.add(c0178c.f3151d);
                                }
                                String string4 = u2.getString(columnIndex8);
                                j1.h.d(string4, "cursor.getString(tableColumnIndex)");
                                String string5 = u2.getString(columnIndex9);
                                j1.h.d(string5, "cursor.getString(onDeleteColumnIndex)");
                                String string6 = u2.getString(columnIndex10);
                                j1.h.d(string6, "cursor.getString(onUpdateColumnIndex)");
                                iVar2.add(new C0177b(string4, string5, string6, arrayList, arrayList2));
                                columnIndex6 = i5;
                                columnIndex7 = i6;
                                columnIndex8 = columnIndex8;
                            }
                        }
                        i i7 = H1.d.i(iVar2);
                        l.j(u2, null);
                        u2 = interfaceC0199a.u("PRAGMA index_list(`food_entries`)");
                        try {
                            int columnIndex11 = u2.getColumnIndex("name");
                            int columnIndex12 = u2.getColumnIndex("origin");
                            int columnIndex13 = u2.getColumnIndex("unique");
                            if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                                i iVar3 = new i();
                                while (u2.moveToNext()) {
                                    if ("c".equals(u2.getString(columnIndex12))) {
                                        String string7 = u2.getString(columnIndex11);
                                        boolean z3 = u2.getInt(columnIndex13) == 1;
                                        j1.h.d(string7, "name");
                                        C0179d Q2 = l.Q(interfaceC0199a, string7, z3);
                                        if (Q2 == null) {
                                            l.j(u2, null);
                                        } else {
                                            iVar3.add(Q2);
                                        }
                                    }
                                }
                                i i8 = H1.d.i(iVar3);
                                l.j(u2, null);
                                iVar = i8;
                                c0180e = new C0180e(b2, i7, iVar);
                                if (!c0180e2.equals(c0180e)) {
                                    return new y(null, true);
                                }
                                return new y("food_entries(com.winpower.neonfit.data.FoodEntry).\n Expected:\n" + c0180e2 + "\n Found:\n" + c0180e, false);
                            }
                            l.j(u2, null);
                            iVar = null;
                            c0180e = new C0180e(b2, i7, iVar);
                            if (!c0180e2.equals(c0180e)) {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        }));
    }

    @Override // com.winpower.neonfit.data.AppDatabase
    public FoodDao foodDao() {
        FoodDao foodDao;
        if (this._foodDao != null) {
            return this._foodDao;
        }
        synchronized (this) {
            try {
                if (this._foodDao == null) {
                    this._foodDao = new FoodDao_Impl(this);
                }
                foodDao = this._foodDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return foodDao;
    }

    @Override // androidx.room.w
    public List<Object> getAutoMigrations(Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // androidx.room.w
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.w
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(FoodDao.class, FoodDao_Impl.getRequiredConverters());
        return hashMap;
    }
}
