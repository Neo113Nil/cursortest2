package com.gates.olympus.miruv.data.db;

import L1.z;
import P1.d;
import android.database.Cursor;
import androidx.room.h;
import androidx.room.j;
import androidx.room.s;
import androidx.room.v;
import androidx.room.x;
import g2.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import n2.C0677B;
import n2.InterfaceC0700f;
import v1.e;

/* loaded from: classes.dex */
public final class SavedJointDao_Impl implements SavedJointDao {
    private final s __db;
    private final j __insertionAdapterOfSavedJointEntity;
    private final x __preparedStmtOfRemove;

    public SavedJointDao_Impl(s sVar) {
        this.__db = sVar;
        this.__insertionAdapterOfSavedJointEntity = new j(sVar) { // from class: com.gates.olympus.miruv.data.db.SavedJointDao_Impl.1
            @Override // androidx.room.x
            public String createQuery() {
                return "INSERT OR REPLACE INTO `saved_joints` (`jointId`,`savedAt`) VALUES (?,?)";
            }

            @Override // androidx.room.j
            public void bind(e eVar, SavedJointEntity savedJointEntity) {
                eVar.C(savedJointEntity.getJointId(), 1);
                eVar.J(savedJointEntity.getSavedAt(), 2);
            }
        };
        this.__preparedStmtOfRemove = new x(sVar) { // from class: com.gates.olympus.miruv.data.db.SavedJointDao_Impl.2
            @Override // androidx.room.x
            public String createQuery() {
                return "DELETE FROM saved_joints WHERE jointId = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.gates.olympus.miruv.data.db.SavedJointDao
    public Object add(final SavedJointEntity savedJointEntity, d dVar) {
        return h.a(this.__db, new Callable<z>() { // from class: com.gates.olympus.miruv.data.db.SavedJointDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public z call() {
                SavedJointDao_Impl.this.__db.beginTransaction();
                try {
                    SavedJointDao_Impl.this.__insertionAdapterOfSavedJointEntity.insert(savedJointEntity);
                    SavedJointDao_Impl.this.__db.setTransactionSuccessful();
                    return z.f2729a;
                } finally {
                    SavedJointDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // com.gates.olympus.miruv.data.db.SavedJointDao
    public InterfaceC0700f observeSavedIds() {
        final v a3 = v.a("SELECT jointId FROM saved_joints ORDER BY savedAt DESC", 0);
        return new C0677B(new androidx.room.e(this.__db, new String[]{"saved_joints"}, new Callable<List<String>>() { // from class: com.gates.olympus.miruv.data.db.SavedJointDao_Impl.5
            public void finalize() {
                a3.b();
            }

            @Override // java.util.concurrent.Callable
            public List<String> call() {
                Cursor V2 = i.V(SavedJointDao_Impl.this.__db, a3);
                try {
                    ArrayList arrayList = new ArrayList(V2.getCount());
                    while (V2.moveToNext()) {
                        arrayList.add(V2.getString(0));
                    }
                    return arrayList;
                } finally {
                    V2.close();
                }
            }
        }, null));
    }

    @Override // com.gates.olympus.miruv.data.db.SavedJointDao
    public Object remove(final String str, d dVar) {
        return h.a(this.__db, new Callable<z>() { // from class: com.gates.olympus.miruv.data.db.SavedJointDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public z call() {
                e acquire = SavedJointDao_Impl.this.__preparedStmtOfRemove.acquire();
                acquire.C(str, 1);
                try {
                    SavedJointDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.v();
                        SavedJointDao_Impl.this.__db.setTransactionSuccessful();
                        return z.f2729a;
                    } finally {
                        SavedJointDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    SavedJointDao_Impl.this.__preparedStmtOfRemove.release(acquire);
                }
            }
        }, dVar);
    }
}
