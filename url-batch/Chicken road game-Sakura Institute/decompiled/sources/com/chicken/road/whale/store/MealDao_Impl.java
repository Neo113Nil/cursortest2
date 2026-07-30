package com.chicken.road.whale.store;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.g0;
import androidx.room.f;
import androidx.room.h;
import androidx.room.i;
import androidx.room.u;
import androidx.room.x;
import d6.z;
import f7.a0;
import h6.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import u3.r;
import u3.t;
import y3.e;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class MealDao_Impl implements MealDao {
    private final u __db;
    private final h __deletionAdapterOfMeal;
    private final i __insertionAdapterOfMeal;
    private final h __updateAdapterOfMeal;

    public MealDao_Impl(u uVar) {
        this.__db = uVar;
        this.__insertionAdapterOfMeal = new i(uVar) { // from class: com.chicken.road.whale.store.MealDao_Impl.1
            @Override // androidx.room.z
            public String createQuery() {
                return "INSERT OR REPLACE INTO `meals` (`id`,`name`,`category`,`ingredients`,`notes`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            @Override // androidx.room.i
            public void bind(e eVar, Meal meal) {
                eVar.r(meal.getId(), 1);
                eVar.H(meal.getName(), 2);
                eVar.H(meal.getCategory(), 3);
                eVar.H(meal.getIngredients(), 4);
                eVar.H(meal.getNotes(), 5);
            }
        };
        this.__deletionAdapterOfMeal = new h(uVar) { // from class: com.chicken.road.whale.store.MealDao_Impl.2
            @Override // androidx.room.z
            public String createQuery() {
                return "DELETE FROM `meals` WHERE `id` = ?";
            }

            @Override // androidx.room.h
            public void bind(e eVar, Meal meal) {
                eVar.r(meal.getId(), 1);
            }
        };
        this.__updateAdapterOfMeal = new h(uVar) { // from class: com.chicken.road.whale.store.MealDao_Impl.3
            @Override // androidx.room.z
            public String createQuery() {
                return "UPDATE OR ABORT `meals` SET `id` = ?,`name` = ?,`category` = ?,`ingredients` = ?,`notes` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.h
            public void bind(e eVar, Meal meal) {
                eVar.r(meal.getId(), 1);
                eVar.H(meal.getName(), 2);
                eVar.H(meal.getCategory(), 3);
                eVar.H(meal.getIngredients(), 4);
                eVar.H(meal.getNotes(), 5);
                eVar.r(meal.getId(), 6);
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.chicken.road.whale.store.MealDao
    public Object byId(long j8, d dVar) {
        final x k8 = x.k("SELECT * FROM meals WHERE id = ?", 1);
        k8.r(j8, 1);
        return f.a(this.__db, new CancellationSignal(), new Callable<Meal>() { // from class: com.chicken.road.whale.store.MealDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Meal call() {
                Cursor l8 = t.l(MealDao_Impl.this.__db, k8);
                try {
                    return l8.moveToFirst() ? new Meal(l8.getLong(r.f(l8, "id")), l8.getString(r.f(l8, "name")), l8.getString(r.f(l8, "category")), l8.getString(r.f(l8, "ingredients")), l8.getString(r.f(l8, "notes"))) : null;
                } finally {
                    l8.close();
                    k8.n();
                }
            }
        }, dVar);
    }

    @Override // com.chicken.road.whale.store.MealDao
    public Object delete(final Meal meal, d dVar) {
        return f.b(this.__db, new Callable<z>() { // from class: com.chicken.road.whale.store.MealDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public z call() {
                MealDao_Impl.this.__db.beginTransaction();
                try {
                    MealDao_Impl.this.__deletionAdapterOfMeal.handle(meal);
                    MealDao_Impl.this.__db.setTransactionSuccessful();
                    return z.f2639a;
                } finally {
                    MealDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // com.chicken.road.whale.store.MealDao
    public Object insert(final Meal meal, d dVar) {
        return f.b(this.__db, new Callable<Long>() { // from class: com.chicken.road.whale.store.MealDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                MealDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(MealDao_Impl.this.__insertionAdapterOfMeal.insertAndReturnId(meal));
                    MealDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    MealDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // com.chicken.road.whale.store.MealDao
    public f7.f observeAll() {
        final x k8 = x.k("SELECT * FROM meals ORDER BY name COLLATE NOCASE", 0);
        return new a0(new g0(this.__db, new String[]{"meals"}, new Callable<List<Meal>>() { // from class: com.chicken.road.whale.store.MealDao_Impl.7
            public void finalize() {
                k8.n();
            }

            @Override // java.util.concurrent.Callable
            public List<Meal> call() {
                Cursor l8 = t.l(MealDao_Impl.this.__db, k8);
                try {
                    int f9 = r.f(l8, "id");
                    int f10 = r.f(l8, "name");
                    int f11 = r.f(l8, "category");
                    int f12 = r.f(l8, "ingredients");
                    int f13 = r.f(l8, "notes");
                    ArrayList arrayList = new ArrayList(l8.getCount());
                    while (l8.moveToNext()) {
                        arrayList.add(new Meal(l8.getLong(f9), l8.getString(f10), l8.getString(f11), l8.getString(f12), l8.getString(f13)));
                    }
                    return arrayList;
                } finally {
                    l8.close();
                }
            }
        }, (d) null, 2));
    }

    @Override // com.chicken.road.whale.store.MealDao
    public Object update(final Meal meal, d dVar) {
        return f.b(this.__db, new Callable<z>() { // from class: com.chicken.road.whale.store.MealDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public z call() {
                MealDao_Impl.this.__db.beginTransaction();
                try {
                    MealDao_Impl.this.__updateAdapterOfMeal.handle(meal);
                    MealDao_Impl.this.__db.setTransactionSuccessful();
                    return z.f2639a;
                } finally {
                    MealDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }
}
