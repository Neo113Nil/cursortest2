package com.chicken.road.whale.store;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.g0;
import androidx.room.f;
import androidx.room.h;
import androidx.room.i;
import androidx.room.u;
import androidx.room.x;
import androidx.room.z;
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
public final class GroceryDao_Impl implements GroceryDao {
    private final u __db;
    private final h __deletionAdapterOfGroceryItem;
    private final i __insertionAdapterOfGroceryItem;
    private final z __preparedStmtOfClearChecked;
    private final z __preparedStmtOfClearGenerated;
    private final h __updateAdapterOfGroceryItem;

    public GroceryDao_Impl(u uVar) {
        this.__db = uVar;
        this.__insertionAdapterOfGroceryItem = new i(uVar) { // from class: com.chicken.road.whale.store.GroceryDao_Impl.1
            @Override // androidx.room.z
            public String createQuery() {
                return "INSERT OR ABORT INTO `grocery_items` (`id`,`name`,`checked`,`manual`) VALUES (nullif(?, 0),?,?,?)";
            }

            @Override // androidx.room.i
            public void bind(e eVar, GroceryItem groceryItem) {
                eVar.r(groceryItem.getId(), 1);
                eVar.H(groceryItem.getName(), 2);
                eVar.r(groceryItem.getChecked() ? 1L : 0L, 3);
                eVar.r(groceryItem.getManual() ? 1L : 0L, 4);
            }
        };
        this.__deletionAdapterOfGroceryItem = new h(uVar) { // from class: com.chicken.road.whale.store.GroceryDao_Impl.2
            @Override // androidx.room.z
            public String createQuery() {
                return "DELETE FROM `grocery_items` WHERE `id` = ?";
            }

            @Override // androidx.room.h
            public void bind(e eVar, GroceryItem groceryItem) {
                eVar.r(groceryItem.getId(), 1);
            }
        };
        this.__updateAdapterOfGroceryItem = new h(uVar) { // from class: com.chicken.road.whale.store.GroceryDao_Impl.3
            @Override // androidx.room.z
            public String createQuery() {
                return "UPDATE OR ABORT `grocery_items` SET `id` = ?,`name` = ?,`checked` = ?,`manual` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.h
            public void bind(e eVar, GroceryItem groceryItem) {
                eVar.r(groceryItem.getId(), 1);
                eVar.H(groceryItem.getName(), 2);
                eVar.r(groceryItem.getChecked() ? 1L : 0L, 3);
                eVar.r(groceryItem.getManual() ? 1L : 0L, 4);
                eVar.r(groceryItem.getId(), 5);
            }
        };
        this.__preparedStmtOfClearChecked = new z(uVar) { // from class: com.chicken.road.whale.store.GroceryDao_Impl.4
            @Override // androidx.room.z
            public String createQuery() {
                return "DELETE FROM grocery_items WHERE checked = 1";
            }
        };
        this.__preparedStmtOfClearGenerated = new z(uVar) { // from class: com.chicken.road.whale.store.GroceryDao_Impl.5
            @Override // androidx.room.z
            public String createQuery() {
                return "DELETE FROM grocery_items WHERE manual = 0";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.chicken.road.whale.store.GroceryDao
    public Object clearChecked(d dVar) {
        return f.b(this.__db, new Callable<d6.z>() { // from class: com.chicken.road.whale.store.GroceryDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public d6.z call() {
                e acquire = GroceryDao_Impl.this.__preparedStmtOfClearChecked.acquire();
                try {
                    GroceryDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.l();
                        GroceryDao_Impl.this.__db.setTransactionSuccessful();
                        return d6.z.f2639a;
                    } finally {
                        GroceryDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GroceryDao_Impl.this.__preparedStmtOfClearChecked.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.chicken.road.whale.store.GroceryDao
    public Object clearGenerated(d dVar) {
        return f.b(this.__db, new Callable<d6.z>() { // from class: com.chicken.road.whale.store.GroceryDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public d6.z call() {
                e acquire = GroceryDao_Impl.this.__preparedStmtOfClearGenerated.acquire();
                try {
                    GroceryDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.l();
                        GroceryDao_Impl.this.__db.setTransactionSuccessful();
                        return d6.z.f2639a;
                    } finally {
                        GroceryDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GroceryDao_Impl.this.__preparedStmtOfClearGenerated.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.chicken.road.whale.store.GroceryDao
    public Object delete(final GroceryItem groceryItem, d dVar) {
        return f.b(this.__db, new Callable<d6.z>() { // from class: com.chicken.road.whale.store.GroceryDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public d6.z call() {
                GroceryDao_Impl.this.__db.beginTransaction();
                try {
                    GroceryDao_Impl.this.__deletionAdapterOfGroceryItem.handle(groceryItem);
                    GroceryDao_Impl.this.__db.setTransactionSuccessful();
                    return d6.z.f2639a;
                } finally {
                    GroceryDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // com.chicken.road.whale.store.GroceryDao
    public Object insert(final GroceryItem groceryItem, d dVar) {
        return f.b(this.__db, new Callable<d6.z>() { // from class: com.chicken.road.whale.store.GroceryDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public d6.z call() {
                GroceryDao_Impl.this.__db.beginTransaction();
                try {
                    GroceryDao_Impl.this.__insertionAdapterOfGroceryItem.insert(groceryItem);
                    GroceryDao_Impl.this.__db.setTransactionSuccessful();
                    return d6.z.f2639a;
                } finally {
                    GroceryDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // com.chicken.road.whale.store.GroceryDao
    public Object names(d dVar) {
        final x k8 = x.k("SELECT name FROM grocery_items", 0);
        return f.a(this.__db, new CancellationSignal(), new Callable<List<String>>() { // from class: com.chicken.road.whale.store.GroceryDao_Impl.12
            @Override // java.util.concurrent.Callable
            public List<String> call() {
                Cursor l8 = t.l(GroceryDao_Impl.this.__db, k8);
                try {
                    ArrayList arrayList = new ArrayList(l8.getCount());
                    while (l8.moveToNext()) {
                        arrayList.add(l8.getString(0));
                    }
                    return arrayList;
                } finally {
                    l8.close();
                    k8.n();
                }
            }
        }, dVar);
    }

    @Override // com.chicken.road.whale.store.GroceryDao
    public f7.f observeAll() {
        final x k8 = x.k("SELECT * FROM grocery_items ORDER BY checked, name COLLATE NOCASE", 0);
        return new a0(new g0(this.__db, new String[]{"grocery_items"}, new Callable<List<GroceryItem>>() { // from class: com.chicken.road.whale.store.GroceryDao_Impl.11
            public void finalize() {
                k8.n();
            }

            @Override // java.util.concurrent.Callable
            public List<GroceryItem> call() {
                boolean z8;
                Cursor l8 = t.l(GroceryDao_Impl.this.__db, k8);
                try {
                    int f9 = r.f(l8, "id");
                    int f10 = r.f(l8, "name");
                    int f11 = r.f(l8, "checked");
                    int f12 = r.f(l8, "manual");
                    ArrayList arrayList = new ArrayList(l8.getCount());
                    while (l8.moveToNext()) {
                        long j8 = l8.getLong(f9);
                        String string = l8.getString(f10);
                        boolean z9 = false;
                        if (l8.getInt(f11) != 0) {
                            z8 = false;
                            z9 = true;
                        } else {
                            z8 = false;
                        }
                        arrayList.add(new GroceryItem(j8, string, z9, l8.getInt(f12) != 0 ? true : z8));
                    }
                    return arrayList;
                } finally {
                    l8.close();
                }
            }
        }, (d) null, 2));
    }

    @Override // com.chicken.road.whale.store.GroceryDao
    public Object update(final GroceryItem groceryItem, d dVar) {
        return f.b(this.__db, new Callable<d6.z>() { // from class: com.chicken.road.whale.store.GroceryDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public d6.z call() {
                GroceryDao_Impl.this.__db.beginTransaction();
                try {
                    GroceryDao_Impl.this.__updateAdapterOfGroceryItem.handle(groceryItem);
                    GroceryDao_Impl.this.__db.setTransactionSuccessful();
                    return d6.z.f2639a;
                } finally {
                    GroceryDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }
}
