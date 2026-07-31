package com.gates.olympus.miruv.data.db;

import F2.h;
import I2.d;
import N1.a;
import N1.c;
import a.AbstractC0157a;
import android.database.Cursor;
import androidx.room.i;
import androidx.room.o;
import androidx.room.s;
import androidx.room.t;
import androidx.room.u;
import h2.AbstractC0454p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import t1.C0918a;
import t1.e;
import v1.InterfaceC1018a;
import v1.b;
import w1.g;

/* loaded from: classes.dex */
public final class MiruvDatabase_Impl extends MiruvDatabase {
    private volatile GameStatDao _gameStatDao;
    private volatile SavedJointDao _savedJointDao;

    @Override // androidx.room.s
    public void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC1018a a3 = ((g) super.getOpenHelper()).a();
        try {
            super.beginTransaction();
            a3.q("DELETE FROM `saved_joints`");
            a3.q("DELETE FROM `game_stats`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            a3.K("PRAGMA wal_checkpoint(FULL)").close();
            if (!a3.M()) {
                a3.q("VACUUM");
            }
        }
    }

    @Override // androidx.room.s
    public o createInvalidationTracker() {
        return new o(this, new HashMap(0), new HashMap(0), "saved_joints", "game_stats");
    }

    @Override // androidx.room.s
    public b createOpenHelper(i iVar) {
        return new g(iVar.f4075a, "miruv.db", new h(iVar, new t(1) { // from class: com.gates.olympus.miruv.data.db.MiruvDatabase_Impl.1
            @Override // androidx.room.t
            public void createAllTables(InterfaceC1018a interfaceC1018a) {
                interfaceC1018a.q("CREATE TABLE IF NOT EXISTS `saved_joints` (`jointId` TEXT NOT NULL, `savedAt` INTEGER NOT NULL, PRIMARY KEY(`jointId`))");
                interfaceC1018a.q("CREATE TABLE IF NOT EXISTS `game_stats` (`game` TEXT NOT NULL, `bestScore` INTEGER NOT NULL, `lastScore` INTEGER NOT NULL, `plays` INTEGER NOT NULL, PRIMARY KEY(`game`))");
                interfaceC1018a.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC1018a.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '903dad90356ccb08d1456f2261911c5e')");
            }

            @Override // androidx.room.t
            public void dropAllTables(InterfaceC1018a interfaceC1018a) {
                interfaceC1018a.q("DROP TABLE IF EXISTS `saved_joints`");
                interfaceC1018a.q("DROP TABLE IF EXISTS `game_stats`");
                List list = ((s) MiruvDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
            }

            @Override // androidx.room.t
            public void onCreate(InterfaceC1018a interfaceC1018a) {
                List list = ((s) MiruvDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
            }

            @Override // androidx.room.t
            public void onOpen(InterfaceC1018a interfaceC1018a) {
                ((s) MiruvDatabase_Impl.this).mDatabase = interfaceC1018a;
                MiruvDatabase_Impl.this.internalInitInvalidationTracker(interfaceC1018a);
                List list = ((s) MiruvDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
            }

            @Override // androidx.room.t
            public void onPreMigrate(InterfaceC1018a interfaceC1018a) {
                Z1.i.f(interfaceC1018a, "db");
                c cVar = new c(10);
                Cursor K3 = interfaceC1018a.K("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (K3.moveToNext()) {
                    try {
                        cVar.add(K3.getString(0));
                    } finally {
                    }
                }
                d.u(K3, null);
                ListIterator listIterator = AbstractC0157a.k(cVar).listIterator(0);
                while (true) {
                    a aVar = (a) listIterator;
                    if (!aVar.hasNext()) {
                        return;
                    }
                    String str = (String) aVar.next();
                    Z1.i.e(str, "triggerName");
                    if (AbstractC0454p.i0(str, "room_fts_content_sync_")) {
                        interfaceC1018a.q("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
            }

            @Override // androidx.room.t
            public u onValidateSchema(InterfaceC1018a interfaceC1018a) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("jointId", new C0918a("jointId", "TEXT", true, 1, null, 1));
                hashMap.put("savedAt", new C0918a("savedAt", "INTEGER", true, 0, null, 1));
                e eVar = new e("saved_joints", hashMap, new HashSet(0), new HashSet(0));
                e a3 = e.a(interfaceC1018a, "saved_joints");
                if (!eVar.equals(a3)) {
                    return new u("saved_joints(com.gates.olympus.miruv.data.db.SavedJointEntity).\n Expected:\n" + eVar + "\n Found:\n" + a3, false);
                }
                HashMap hashMap2 = new HashMap(4);
                hashMap2.put("game", new C0918a("game", "TEXT", true, 1, null, 1));
                hashMap2.put("bestScore", new C0918a("bestScore", "INTEGER", true, 0, null, 1));
                hashMap2.put("lastScore", new C0918a("lastScore", "INTEGER", true, 0, null, 1));
                hashMap2.put("plays", new C0918a("plays", "INTEGER", true, 0, null, 1));
                e eVar2 = new e("game_stats", hashMap2, new HashSet(0), new HashSet(0));
                e a4 = e.a(interfaceC1018a, "game_stats");
                if (eVar2.equals(a4)) {
                    return new u(null, true);
                }
                return new u("game_stats(com.gates.olympus.miruv.data.db.GameStatEntity).\n Expected:\n" + eVar2 + "\n Found:\n" + a4, false);
            }

            @Override // androidx.room.t
            public void onPostMigrate(InterfaceC1018a interfaceC1018a) {
            }
        }));
    }

    @Override // com.gates.olympus.miruv.data.db.MiruvDatabase
    public GameStatDao gameStatDao() {
        GameStatDao gameStatDao;
        if (this._gameStatDao != null) {
            return this._gameStatDao;
        }
        synchronized (this) {
            try {
                if (this._gameStatDao == null) {
                    this._gameStatDao = new GameStatDao_Impl(this);
                }
                gameStatDao = this._gameStatDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gameStatDao;
    }

    @Override // androidx.room.s
    public List<Object> getAutoMigrations(Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // androidx.room.s
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.s
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(SavedJointDao.class, SavedJointDao_Impl.getRequiredConverters());
        hashMap.put(GameStatDao.class, GameStatDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.gates.olympus.miruv.data.db.MiruvDatabase
    public SavedJointDao savedJointDao() {
        SavedJointDao savedJointDao;
        if (this._savedJointDao != null) {
            return this._savedJointDao;
        }
        synchronized (this) {
            try {
                if (this._savedJointDao == null) {
                    this._savedJointDao = new SavedJointDao_Impl(this);
                }
                savedJointDao = this._savedJointDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return savedJointDao;
    }
}
