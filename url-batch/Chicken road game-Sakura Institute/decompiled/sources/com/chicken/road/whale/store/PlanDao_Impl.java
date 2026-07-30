package com.chicken.road.whale.store;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.g0;
import androidx.room.f;
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
public final class PlanDao_Impl implements PlanDao {
    private final u __db;
    private final i __insertionAdapterOfPlanEntry;
    private final z __preparedStmtOfClearForMeal;
    private final z __preparedStmtOfClearSlot;

    public PlanDao_Impl(u uVar) {
        this.__db = uVar;
        this.__insertionAdapterOfPlanEntry = new i(uVar) { // from class: com.chicken.road.whale.store.PlanDao_Impl.1
            @Override // androidx.room.z
            public String createQuery() {
                return "INSERT OR ABORT INTO `plan_entries` (`id`,`dayIndex`,`slot`,`mealId`) VALUES (nullif(?, 0),?,?,?)";
            }

            @Override // androidx.room.i
            public void bind(e eVar, PlanEntry planEntry) {
                eVar.r(planEntry.getId(), 1);
                eVar.r(planEntry.getDayIndex(), 2);
                eVar.H(planEntry.getSlot(), 3);
                eVar.r(planEntry.getMealId(), 4);
            }
        };
        this.__preparedStmtOfClearSlot = new z(uVar) { // from class: com.chicken.road.whale.store.PlanDao_Impl.2
            @Override // androidx.room.z
            public String createQuery() {
                return "DELETE FROM plan_entries WHERE dayIndex = ? AND slot = ?";
            }
        };
        this.__preparedStmtOfClearForMeal = new z(uVar) { // from class: com.chicken.road.whale.store.PlanDao_Impl.3
            @Override // androidx.room.z
            public String createQuery() {
                return "DELETE FROM plan_entries WHERE mealId = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.chicken.road.whale.store.PlanDao
    public Object all(d dVar) {
        final x k8 = x.k("SELECT * FROM plan_entries", 0);
        return f.a(this.__db, new CancellationSignal(), new Callable<List<PlanEntry>>() { // from class: com.chicken.road.whale.store.PlanDao_Impl.8
            @Override // java.util.concurrent.Callable
            public List<PlanEntry> call() {
                Cursor l8 = t.l(PlanDao_Impl.this.__db, k8);
                try {
                    int f9 = r.f(l8, "id");
                    int f10 = r.f(l8, "dayIndex");
                    int f11 = r.f(l8, "slot");
                    int f12 = r.f(l8, "mealId");
                    ArrayList arrayList = new ArrayList(l8.getCount());
                    while (l8.moveToNext()) {
                        arrayList.add(new PlanEntry(l8.getLong(f9), l8.getInt(f10), l8.getString(f11), l8.getLong(f12)));
                    }
                    return arrayList;
                } finally {
                    l8.close();
                    k8.n();
                }
            }
        }, dVar);
    }

    @Override // com.chicken.road.whale.store.PlanDao
    public Object clearForMeal(final long j8, d dVar) {
        return f.b(this.__db, new Callable<d6.z>() { // from class: com.chicken.road.whale.store.PlanDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public d6.z call() {
                e acquire = PlanDao_Impl.this.__preparedStmtOfClearForMeal.acquire();
                acquire.r(j8, 1);
                try {
                    PlanDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.l();
                        PlanDao_Impl.this.__db.setTransactionSuccessful();
                        return d6.z.f2639a;
                    } finally {
                        PlanDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    PlanDao_Impl.this.__preparedStmtOfClearForMeal.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.chicken.road.whale.store.PlanDao
    public Object clearSlot(final int i7, final String str, d dVar) {
        return f.b(this.__db, new Callable<d6.z>() { // from class: com.chicken.road.whale.store.PlanDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public d6.z call() {
                e acquire = PlanDao_Impl.this.__preparedStmtOfClearSlot.acquire();
                acquire.r(i7, 1);
                acquire.H(str, 2);
                try {
                    PlanDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.l();
                        PlanDao_Impl.this.__db.setTransactionSuccessful();
                        return d6.z.f2639a;
                    } finally {
                        PlanDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    PlanDao_Impl.this.__preparedStmtOfClearSlot.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.chicken.road.whale.store.PlanDao
    public Object insert(final PlanEntry planEntry, d dVar) {
        return f.b(this.__db, new Callable<d6.z>() { // from class: com.chicken.road.whale.store.PlanDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public d6.z call() {
                PlanDao_Impl.this.__db.beginTransaction();
                try {
                    PlanDao_Impl.this.__insertionAdapterOfPlanEntry.insert(planEntry);
                    PlanDao_Impl.this.__db.setTransactionSuccessful();
                    return d6.z.f2639a;
                } finally {
                    PlanDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // com.chicken.road.whale.store.PlanDao
    public f7.f observeAll() {
        final x k8 = x.k("SELECT * FROM plan_entries", 0);
        return new a0(new g0(this.__db, new String[]{"plan_entries"}, new Callable<List<PlanEntry>>() { // from class: com.chicken.road.whale.store.PlanDao_Impl.7
            public void finalize() {
                k8.n();
            }

            @Override // java.util.concurrent.Callable
            public List<PlanEntry> call() {
                Cursor l8 = t.l(PlanDao_Impl.this.__db, k8);
                try {
                    int f9 = r.f(l8, "id");
                    int f10 = r.f(l8, "dayIndex");
                    int f11 = r.f(l8, "slot");
                    int f12 = r.f(l8, "mealId");
                    ArrayList arrayList = new ArrayList(l8.getCount());
                    while (l8.moveToNext()) {
                        arrayList.add(new PlanEntry(l8.getLong(f9), l8.getInt(f10), l8.getString(f11), l8.getLong(f12)));
                    }
                    return arrayList;
                } finally {
                    l8.close();
                }
            }
        }, (d) null, 2));
    }
}
