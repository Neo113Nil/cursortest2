package com.winpower.neonfit.data;

import a.AbstractC0058a;
import a1.d;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C;
import androidx.room.e;
import androidx.room.g;
import androidx.room.i;
import androidx.room.k;
import androidx.room.l;
import androidx.room.w;
import androidx.room.z;
import j1.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import k0.InterfaceC0203e;
import n.C0288n;
import r1.AbstractC0366p;
import r1.AbstractC0369t;
import r1.C0355e;
import r1.H;
import r1.L;
import u1.b;

/* loaded from: classes.dex */
public final class FoodDao_Impl implements FoodDao {
    private final w __db;
    private final k __deletionAdapterOfFoodEntry;
    private final l __insertionAdapterOfFoodEntry;
    private final B __preparedStmtOfDeleteEntriesBetween;

    public FoodDao_Impl(w wVar) {
        this.__db = wVar;
        this.__insertionAdapterOfFoodEntry = new l(wVar) { // from class: com.winpower.neonfit.data.FoodDao_Impl.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(wVar);
                h.e(wVar, "database");
            }

            @Override // androidx.room.B
            public String createQuery() {
                return "INSERT OR ABORT INTO `food_entries` (`id`,`name`,`calories`,`protein`,`fat`,`carbs`,`loggedAt`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            @Override // androidx.room.l
            public void bind(InterfaceC0203e interfaceC0203e, FoodEntry foodEntry) {
                interfaceC0203e.t(1, foodEntry.getId());
                if (foodEntry.getName() == null) {
                    interfaceC0203e.k(2);
                } else {
                    interfaceC0203e.l(foodEntry.getName(), 2);
                }
                interfaceC0203e.t(3, foodEntry.getCalories());
                interfaceC0203e.m(4, foodEntry.getProtein());
                interfaceC0203e.m(5, foodEntry.getFat());
                interfaceC0203e.m(6, foodEntry.getCarbs());
                interfaceC0203e.t(7, foodEntry.getLoggedAt());
            }
        };
        this.__deletionAdapterOfFoodEntry = new k(wVar) { // from class: com.winpower.neonfit.data.FoodDao_Impl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(wVar);
                h.e(wVar, "database");
            }

            @Override // androidx.room.B
            public String createQuery() {
                return "DELETE FROM `food_entries` WHERE `id` = ?";
            }

            @Override // androidx.room.k
            public void bind(InterfaceC0203e interfaceC0203e, FoodEntry foodEntry) {
                interfaceC0203e.t(1, foodEntry.getId());
            }
        };
        this.__preparedStmtOfDeleteEntriesBetween = new B(wVar) { // from class: com.winpower.neonfit.data.FoodDao_Impl.3
            @Override // androidx.room.B
            public String createQuery() {
                return "DELETE FROM food_entries WHERE loggedAt >= ? AND loggedAt < ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.winpower.neonfit.data.FoodDao
    public Object delete(final FoodEntry foodEntry, d dVar) {
        return i.a(this.__db, new Callable<W0.i>() { // from class: com.winpower.neonfit.data.FoodDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public W0.i call() {
                FoodDao_Impl.this.__db.beginTransaction();
                try {
                    FoodDao_Impl.this.__deletionAdapterOfFoodEntry.handle(foodEntry);
                    FoodDao_Impl.this.__db.setTransactionSuccessful();
                    return W0.i.f1345a;
                } finally {
                    FoodDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // com.winpower.neonfit.data.FoodDao
    public Object deleteEntriesBetween(final long j, final long j2, d dVar) {
        return i.a(this.__db, new Callable<W0.i>() { // from class: com.winpower.neonfit.data.FoodDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public W0.i call() {
                InterfaceC0203e acquire = FoodDao_Impl.this.__preparedStmtOfDeleteEntriesBetween.acquire();
                acquire.t(1, j);
                acquire.t(2, j2);
                try {
                    FoodDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.A();
                        FoodDao_Impl.this.__db.setTransactionSuccessful();
                        return W0.i.f1345a;
                    } finally {
                        FoodDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    FoodDao_Impl.this.__preparedStmtOfDeleteEntriesBetween.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.winpower.neonfit.data.FoodDao
    public Object getEntriesBetween(long j, long j2, d dVar) {
        final z a2 = z.a();
        a2.t(1, j);
        a2.t(2, j2);
        CancellationSignal cancellationSignal = new CancellationSignal();
        w wVar = this.__db;
        Callable<List<FoodEntry>> callable = new Callable<List<FoodEntry>>() { // from class: com.winpower.neonfit.data.FoodDao_Impl.8
            @Override // java.util.concurrent.Callable
            public List<FoodEntry> call() {
                Cursor U2 = AbstractC0058a.U(FoodDao_Impl.this.__db, a2);
                try {
                    int w2 = H1.l.w(U2, "id");
                    int w3 = H1.l.w(U2, "name");
                    int w4 = H1.l.w(U2, "calories");
                    int w5 = H1.l.w(U2, "protein");
                    int w6 = H1.l.w(U2, "fat");
                    int w7 = H1.l.w(U2, "carbs");
                    int w8 = H1.l.w(U2, "loggedAt");
                    ArrayList arrayList = new ArrayList(U2.getCount());
                    while (U2.moveToNext()) {
                        arrayList.add(new FoodEntry(U2.getLong(w2), U2.isNull(w3) ? null : U2.getString(w3), U2.getInt(w4), U2.getFloat(w5), U2.getFloat(w6), U2.getFloat(w7), U2.getLong(w8)));
                    }
                    return arrayList;
                } finally {
                    U2.close();
                    a2.z();
                }
            }
        };
        if (wVar.isOpenInternal() && wVar.inTransaction()) {
            return callable.call();
        }
        if (dVar.getContext().d(C.f2073a) != null) {
            throw new ClassCastException();
        }
        AbstractC0366p b2 = i.b(wVar);
        C0355e c0355e = new C0355e(H1.l.C(dVar), 1);
        c0355e.o();
        c0355e.q(new L(new g(cancellationSignal, AbstractC0369t.h(H.f4043a, b2, new androidx.room.h(callable, c0355e, null), 2))));
        return c0355e.n();
    }

    @Override // com.winpower.neonfit.data.FoodDao
    public Object insert(final FoodEntry foodEntry, d dVar) {
        return i.a(this.__db, new Callable<Long>() { // from class: com.winpower.neonfit.data.FoodDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                FoodDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(FoodDao_Impl.this.__insertionAdapterOfFoodEntry.insertAndReturnId(foodEntry));
                    FoodDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    FoodDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // com.winpower.neonfit.data.FoodDao
    public b observeEntriesBetween(long j, long j2) {
        final z a2 = z.a();
        a2.t(1, j);
        a2.t(2, j2);
        return new C0288n(2, new e(this.__db, new String[]{"food_entries"}, new Callable<List<FoodEntry>>() { // from class: com.winpower.neonfit.data.FoodDao_Impl.7
            public void finalize() {
                a2.z();
            }

            @Override // java.util.concurrent.Callable
            public List<FoodEntry> call() {
                Cursor U2 = AbstractC0058a.U(FoodDao_Impl.this.__db, a2);
                try {
                    int w2 = H1.l.w(U2, "id");
                    int w3 = H1.l.w(U2, "name");
                    int w4 = H1.l.w(U2, "calories");
                    int w5 = H1.l.w(U2, "protein");
                    int w6 = H1.l.w(U2, "fat");
                    int w7 = H1.l.w(U2, "carbs");
                    int w8 = H1.l.w(U2, "loggedAt");
                    ArrayList arrayList = new ArrayList(U2.getCount());
                    while (U2.moveToNext()) {
                        arrayList.add(new FoodEntry(U2.getLong(w2), U2.isNull(w3) ? null : U2.getString(w3), U2.getInt(w4), U2.getFloat(w5), U2.getFloat(w6), U2.getFloat(w7), U2.getLong(w8)));
                    }
                    return arrayList;
                } finally {
                    U2.close();
                }
            }
        }, null));
    }
}
