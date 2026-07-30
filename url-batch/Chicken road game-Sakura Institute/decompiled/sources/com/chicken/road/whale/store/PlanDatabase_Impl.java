package com.chicken.road.whale.store;

import a0.l;
import android.database.Cursor;
import androidx.room.p;
import androidx.room.s;
import androidx.room.u;
import androidx.room.v;
import androidx.room.w;
import f6.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import r6.k;
import w3.e;
import y3.a;
import y3.b;
import z3.g;
import z6.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class PlanDatabase_Impl extends PlanDatabase {
    private volatile GroceryDao _groceryDao;
    private volatile MealDao _mealDao;
    private volatile PlanDao _planDao;

    @Override // androidx.room.u
    public void clearAllTables() {
        super.assertNotMainThread();
        a b9 = ((g) super.getOpenHelper()).b();
        try {
            super.beginTransaction();
            b9.i("DELETE FROM `meals`");
            b9.i("DELETE FROM `plan_entries`");
            b9.i("DELETE FROM `grocery_items`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            b9.O("PRAGMA wal_checkpoint(FULL)").close();
            if (!b9.s()) {
                b9.i("VACUUM");
            }
        }
    }

    @Override // androidx.room.u
    public p createInvalidationTracker() {
        return new p(this, new HashMap(0), new HashMap(0), "meals", "plan_entries", "grocery_items");
    }

    @Override // androidx.room.u
    public b createOpenHelper(androidx.room.g gVar) {
        return new g(gVar.f1083a, "platora.db", new l(gVar, new v(1) { // from class: com.chicken.road.whale.store.PlanDatabase_Impl.1
            @Override // androidx.room.v
            public void createAllTables(a aVar) {
                aVar.i("CREATE TABLE IF NOT EXISTS `meals` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `category` TEXT NOT NULL, `ingredients` TEXT NOT NULL, `notes` TEXT NOT NULL)");
                aVar.i("CREATE TABLE IF NOT EXISTS `plan_entries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dayIndex` INTEGER NOT NULL, `slot` TEXT NOT NULL, `mealId` INTEGER NOT NULL)");
                aVar.i("CREATE TABLE IF NOT EXISTS `grocery_items` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `checked` INTEGER NOT NULL, `manual` INTEGER NOT NULL)");
                aVar.i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                aVar.i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '50f31e2e3e7ac4f9b1b612754ed93c7a')");
            }

            @Override // androidx.room.v
            public void dropAllTables(a aVar) {
                aVar.i("DROP TABLE IF EXISTS `meals`");
                aVar.i("DROP TABLE IF EXISTS `plan_entries`");
                aVar.i("DROP TABLE IF EXISTS `grocery_items`");
                List list = ((u) PlanDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((s) it.next()).onDestructiveMigration(aVar);
                    }
                }
            }

            @Override // androidx.room.v
            public void onCreate(a aVar) {
                List list = ((u) PlanDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((s) it.next()).onCreate(aVar);
                    }
                }
            }

            @Override // androidx.room.v
            public void onOpen(a aVar) {
                ((u) PlanDatabase_Impl.this).mDatabase = aVar;
                PlanDatabase_Impl.this.internalInitInvalidationTracker(aVar);
                List list = ((u) PlanDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((s) it.next()).onOpen(aVar);
                    }
                }
            }

            @Override // androidx.room.v
            public void onPreMigrate(a aVar) {
                k.f(aVar, "db");
                c cVar = new c(10);
                Cursor O = aVar.O("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (O.moveToNext()) {
                    try {
                        cVar.add(O.getString(0));
                    } finally {
                    }
                }
                O.close();
                ListIterator listIterator = t6.a.s(cVar).listIterator(0);
                while (true) {
                    f6.a aVar2 = (f6.a) listIterator;
                    if (!aVar2.hasNext()) {
                        return;
                    }
                    String str = (String) aVar2.next();
                    k.e(str, "triggerName");
                    if (o.v(str, "room_fts_content_sync_")) {
                        aVar.i("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
            }

            @Override // androidx.room.v
            public w onValidateSchema(a aVar) {
                HashMap hashMap = new HashMap(5);
                hashMap.put("id", new w3.a("id", "INTEGER", true, 1, null, 1));
                hashMap.put("name", new w3.a("name", "TEXT", true, 0, null, 1));
                hashMap.put("category", new w3.a("category", "TEXT", true, 0, null, 1));
                hashMap.put("ingredients", new w3.a("ingredients", "TEXT", true, 0, null, 1));
                hashMap.put("notes", new w3.a("notes", "TEXT", true, 0, null, 1));
                e eVar = new e("meals", hashMap, new HashSet(0), new HashSet(0));
                e a3 = e.a(aVar, "meals");
                if (!eVar.equals(a3)) {
                    return new w("meals(com.chicken.road.whale.store.Meal).\n Expected:\n" + eVar + "\n Found:\n" + a3, false);
                }
                HashMap hashMap2 = new HashMap(4);
                hashMap2.put("id", new w3.a("id", "INTEGER", true, 1, null, 1));
                hashMap2.put("dayIndex", new w3.a("dayIndex", "INTEGER", true, 0, null, 1));
                hashMap2.put("slot", new w3.a("slot", "TEXT", true, 0, null, 1));
                hashMap2.put("mealId", new w3.a("mealId", "INTEGER", true, 0, null, 1));
                e eVar2 = new e("plan_entries", hashMap2, new HashSet(0), new HashSet(0));
                e a9 = e.a(aVar, "plan_entries");
                if (!eVar2.equals(a9)) {
                    return new w("plan_entries(com.chicken.road.whale.store.PlanEntry).\n Expected:\n" + eVar2 + "\n Found:\n" + a9, false);
                }
                HashMap hashMap3 = new HashMap(4);
                hashMap3.put("id", new w3.a("id", "INTEGER", true, 1, null, 1));
                hashMap3.put("name", new w3.a("name", "TEXT", true, 0, null, 1));
                hashMap3.put("checked", new w3.a("checked", "INTEGER", true, 0, null, 1));
                hashMap3.put("manual", new w3.a("manual", "INTEGER", true, 0, null, 1));
                e eVar3 = new e("grocery_items", hashMap3, new HashSet(0), new HashSet(0));
                e a10 = e.a(aVar, "grocery_items");
                if (eVar3.equals(a10)) {
                    return new w(null, true);
                }
                return new w("grocery_items(com.chicken.road.whale.store.GroceryItem).\n Expected:\n" + eVar3 + "\n Found:\n" + a10, false);
            }

            @Override // androidx.room.v
            public void onPostMigrate(a aVar) {
            }
        }));
    }

    @Override // androidx.room.u
    public List<Object> getAutoMigrations(Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // androidx.room.u
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.u
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(MealDao.class, MealDao_Impl.getRequiredConverters());
        hashMap.put(PlanDao.class, PlanDao_Impl.getRequiredConverters());
        hashMap.put(GroceryDao.class, GroceryDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.chicken.road.whale.store.PlanDatabase
    public GroceryDao groceryDao() {
        GroceryDao groceryDao;
        if (this._groceryDao != null) {
            return this._groceryDao;
        }
        synchronized (this) {
            try {
                if (this._groceryDao == null) {
                    this._groceryDao = new GroceryDao_Impl(this);
                }
                groceryDao = this._groceryDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return groceryDao;
    }

    @Override // com.chicken.road.whale.store.PlanDatabase
    public MealDao mealDao() {
        MealDao mealDao;
        if (this._mealDao != null) {
            return this._mealDao;
        }
        synchronized (this) {
            try {
                if (this._mealDao == null) {
                    this._mealDao = new MealDao_Impl(this);
                }
                mealDao = this._mealDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mealDao;
    }

    @Override // com.chicken.road.whale.store.PlanDatabase
    public PlanDao planDao() {
        PlanDao planDao;
        if (this._planDao != null) {
            return this._planDao;
        }
        synchronized (this) {
            try {
                if (this._planDao == null) {
                    this._planDao = new PlanDao_Impl(this);
                }
                planDao = this._planDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return planDao;
    }
}
