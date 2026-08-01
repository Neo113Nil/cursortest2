package com.clutchquizarena.app.db;

import T.d;
import V0.n;
import W0.a;
import W0.c;
import W0.i;
import android.database.Cursor;
import androidx.room.g;
import androidx.room.o;
import androidx.room.t;
import androidx.room.u;
import androidx.room.v;
import g0.C0138a;
import g0.C0139b;
import g0.C0140c;
import g0.e;
import g1.f;
import i0.InterfaceC0142a;
import i0.InterfaceC0143b;
import j0.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile GameSessionDao _gameSessionDao;

    @Override // androidx.room.t
    public void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC0142a a2 = ((h) super.getOpenHelper()).a();
        try {
            super.beginTransaction();
            a2.o("DELETE FROM `game_sessions`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            a2.s("PRAGMA wal_checkpoint(FULL)").close();
            if (!a2.v()) {
                a2.o("VACUUM");
            }
        }
    }

    @Override // androidx.room.t
    public o createInvalidationTracker() {
        return new o(this, new HashMap(0), new HashMap(0), "game_sessions");
    }

    @Override // androidx.room.t
    public InterfaceC0143b createOpenHelper(g gVar) {
        u uVar = new u(1) { // from class: com.clutchquizarena.app.db.AppDatabase_Impl.1
            @Override // androidx.room.u
            public void createAllTables(InterfaceC0142a interfaceC0142a) {
                interfaceC0142a.o("CREATE TABLE IF NOT EXISTS `game_sessions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `score` INTEGER NOT NULL, `lives` INTEGER NOT NULL, `currentQuestionIndex` INTEGER NOT NULL, `correctAnswers` INTEGER NOT NULL, `totalQuestions` INTEGER NOT NULL, `elapsedTimeMs` INTEGER NOT NULL, `level` INTEGER NOT NULL, `isActive` INTEGER NOT NULL, `isWin` INTEGER NOT NULL, `finishedAt` INTEGER)");
                interfaceC0142a.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC0142a.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a6dd4b60aad1497c5f57af348604cbb5')");
            }

            @Override // androidx.room.u
            public void dropAllTables(InterfaceC0142a interfaceC0142a) {
                interfaceC0142a.o("DROP TABLE IF EXISTS `game_sessions`");
                List list = ((t) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
            }

            @Override // androidx.room.u
            public void onCreate(InterfaceC0142a interfaceC0142a) {
                List list = ((t) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
            }

            @Override // androidx.room.u
            public void onOpen(InterfaceC0142a interfaceC0142a) {
                ((t) AppDatabase_Impl.this).mDatabase = interfaceC0142a;
                AppDatabase_Impl.this.internalInitInvalidationTracker(interfaceC0142a);
                List list = ((t) AppDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
            }

            @Override // androidx.room.u
            public void onPostMigrate(InterfaceC0142a interfaceC0142a) {
            }

            @Override // androidx.room.u
            public void onPreMigrate(InterfaceC0142a interfaceC0142a) {
                f.e(interfaceC0142a, "db");
                c cVar = new c(10);
                Cursor s2 = interfaceC0142a.s("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (s2.moveToNext()) {
                    try {
                        cVar.add(s2.getString(0));
                    } finally {
                    }
                }
                d.k(s2, null);
                ListIterator listIterator = d.h(cVar).listIterator(0);
                while (true) {
                    a aVar = (a) listIterator;
                    if (!aVar.hasNext()) {
                        return;
                    }
                    String str = (String) aVar.next();
                    f.d(str, "triggerName");
                    if (str.startsWith("room_fts_content_sync_")) {
                        interfaceC0142a.o("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0294  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x02b1  */
            @Override // androidx.room.u
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public v onValidateSchema(InterfaceC0142a interfaceC0142a) {
                Map b2;
                i iVar;
                e eVar;
                HashMap hashMap = new HashMap(11);
                hashMap.put("id", new C0138a("id", "INTEGER", true, 1, null, 1));
                hashMap.put("score", new C0138a("score", "INTEGER", true, 0, null, 1));
                hashMap.put("lives", new C0138a("lives", "INTEGER", true, 0, null, 1));
                hashMap.put("currentQuestionIndex", new C0138a("currentQuestionIndex", "INTEGER", true, 0, null, 1));
                hashMap.put("correctAnswers", new C0138a("correctAnswers", "INTEGER", true, 0, null, 1));
                hashMap.put("totalQuestions", new C0138a("totalQuestions", "INTEGER", true, 0, null, 1));
                hashMap.put("elapsedTimeMs", new C0138a("elapsedTimeMs", "INTEGER", true, 0, null, 1));
                hashMap.put("level", new C0138a("level", "INTEGER", true, 0, null, 1));
                hashMap.put("isActive", new C0138a("isActive", "INTEGER", true, 0, null, 1));
                hashMap.put("isWin", new C0138a("isWin", "INTEGER", true, 0, null, 1));
                hashMap.put("finishedAt", new C0138a("finishedAt", "INTEGER", false, 0, null, 1));
                e eVar2 = new e(hashMap, new HashSet(0), new HashSet(0));
                f.e(interfaceC0142a, "database");
                Cursor s2 = interfaceC0142a.s("PRAGMA table_info(`game_sessions`)");
                try {
                    if (s2.getColumnCount() <= 0) {
                        b2 = n.f890a;
                        d.k(s2, null);
                    } else {
                        int columnIndex = s2.getColumnIndex("name");
                        int columnIndex2 = s2.getColumnIndex("type");
                        int columnIndex3 = s2.getColumnIndex("notnull");
                        int columnIndex4 = s2.getColumnIndex("pk");
                        int columnIndex5 = s2.getColumnIndex("dflt_value");
                        W0.f fVar = new W0.f();
                        while (s2.moveToNext()) {
                            String string = s2.getString(columnIndex);
                            String string2 = s2.getString(columnIndex2);
                            boolean z2 = s2.getInt(columnIndex3) != 0;
                            int i = s2.getInt(columnIndex4);
                            String string3 = s2.getString(columnIndex5);
                            f.d(string, "name");
                            f.d(string2, "type");
                            fVar.put(string, new C0138a(string, string2, z2, i, string3, 2));
                        }
                        b2 = fVar.b();
                        d.k(s2, null);
                    }
                    s2 = interfaceC0142a.s("PRAGMA foreign_key_list(`game_sessions`)");
                    try {
                        int columnIndex6 = s2.getColumnIndex("id");
                        int columnIndex7 = s2.getColumnIndex("seq");
                        int columnIndex8 = s2.getColumnIndex("table");
                        int columnIndex9 = s2.getColumnIndex("on_delete");
                        int columnIndex10 = s2.getColumnIndex("on_update");
                        List K2 = d.K(s2);
                        s2.moveToPosition(-1);
                        i iVar2 = new i();
                        while (s2.moveToNext()) {
                            if (s2.getInt(columnIndex7) == 0) {
                                int i2 = s2.getInt(columnIndex6);
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj : K2) {
                                    int i3 = columnIndex6;
                                    int i4 = columnIndex7;
                                    if (((C0140c) obj).f2550a == i2) {
                                        arrayList3.add(obj);
                                    }
                                    columnIndex6 = i3;
                                    columnIndex7 = i4;
                                }
                                int i5 = columnIndex6;
                                int i6 = columnIndex7;
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    C0140c c0140c = (C0140c) it.next();
                                    arrayList.add(c0140c.f2552c);
                                    arrayList2.add(c0140c.d);
                                }
                                String string4 = s2.getString(columnIndex8);
                                f.d(string4, "cursor.getString(tableColumnIndex)");
                                String string5 = s2.getString(columnIndex9);
                                f.d(string5, "cursor.getString(onDeleteColumnIndex)");
                                String string6 = s2.getString(columnIndex10);
                                f.d(string6, "cursor.getString(onUpdateColumnIndex)");
                                iVar2.add(new C0139b(string4, string5, string6, arrayList, arrayList2));
                                columnIndex6 = i5;
                                columnIndex7 = i6;
                                columnIndex8 = columnIndex8;
                            }
                        }
                        i i7 = d.i(iVar2);
                        d.k(s2, null);
                        s2 = interfaceC0142a.s("PRAGMA index_list(`game_sessions`)");
                        try {
                            int columnIndex11 = s2.getColumnIndex("name");
                            int columnIndex12 = s2.getColumnIndex("origin");
                            int columnIndex13 = s2.getColumnIndex("unique");
                            if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                                i iVar3 = new i();
                                while (s2.moveToNext()) {
                                    if ("c".equals(s2.getString(columnIndex12))) {
                                        String string7 = s2.getString(columnIndex11);
                                        boolean z3 = s2.getInt(columnIndex13) == 1;
                                        f.d(string7, "name");
                                        g0.d L2 = d.L(interfaceC0142a, string7, z3);
                                        if (L2 == null) {
                                            d.k(s2, null);
                                        } else {
                                            iVar3.add(L2);
                                        }
                                    }
                                }
                                i i8 = d.i(iVar3);
                                d.k(s2, null);
                                iVar = i8;
                                eVar = new e(b2, i7, iVar);
                                if (!eVar2.equals(eVar)) {
                                    return new v(true, null);
                                }
                                return new v(false, "game_sessions(com.clutchquizarena.app.db.GameSessionEntity).\n Expected:\n" + eVar2 + "\n Found:\n" + eVar);
                            }
                            d.k(s2, null);
                            iVar = null;
                            eVar = new e(b2, i7, iVar);
                            if (!eVar2.equals(eVar)) {
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
        };
        f.e(gVar, "configuration");
        int i = uVar.version;
        B.d dVar = new B.d();
        dVar.f43a = i;
        dVar.f44b = gVar;
        dVar.f45c = uVar;
        return new h(gVar.f1653a, "clutch_quiz.db", dVar);
    }

    @Override // com.clutchquizarena.app.db.AppDatabase
    public GameSessionDao gameSessionDao() {
        GameSessionDao gameSessionDao;
        if (this._gameSessionDao != null) {
            return this._gameSessionDao;
        }
        synchronized (this) {
            try {
                if (this._gameSessionDao == null) {
                    this._gameSessionDao = new GameSessionDao_Impl(this);
                }
                gameSessionDao = this._gameSessionDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gameSessionDao;
    }

    @Override // androidx.room.t
    public List<Object> getAutoMigrations(Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // androidx.room.t
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.t
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(GameSessionDao.class, GameSessionDao_Impl.getRequiredConverters());
        return hashMap;
    }
}
