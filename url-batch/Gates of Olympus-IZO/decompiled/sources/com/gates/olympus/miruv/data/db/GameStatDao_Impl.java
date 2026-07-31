package com.gates.olympus.miruv.data.db;

import F.D0;
import L1.z;
import M1.B;
import P1.d;
import Q1.a;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.g;
import androidx.room.h;
import androidx.room.j;
import androidx.room.s;
import androidx.room.v;
import androidx.room.y;
import f.AbstractC0382a;
import g2.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import k2.AbstractC0546s;
import k2.AbstractC0552y;
import k2.C0536h;
import k2.S;
import n2.C0677B;
import n2.InterfaceC0700f;
import v1.e;

/* loaded from: classes.dex */
public final class GameStatDao_Impl implements GameStatDao {
    private final s __db;
    private final j __insertionAdapterOfGameStatEntity;

    public GameStatDao_Impl(s sVar) {
        this.__db = sVar;
        this.__insertionAdapterOfGameStatEntity = new j(sVar) { // from class: com.gates.olympus.miruv.data.db.GameStatDao_Impl.1
            @Override // androidx.room.x
            public String createQuery() {
                return "INSERT OR REPLACE INTO `game_stats` (`game`,`bestScore`,`lastScore`,`plays`) VALUES (?,?,?,?)";
            }

            @Override // androidx.room.j
            public void bind(e eVar, GameStatEntity gameStatEntity) {
                eVar.C(gameStatEntity.getGame(), 1);
                eVar.J(gameStatEntity.getBestScore(), 2);
                eVar.J(gameStatEntity.getLastScore(), 3);
                eVar.J(gameStatEntity.getPlays(), 4);
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.gates.olympus.miruv.data.db.GameStatDao
    public Object get(String str, d dVar) {
        final v a3 = v.a("SELECT * FROM game_stats WHERE game = ? LIMIT 1", 1);
        a3.C(str, 1);
        CancellationSignal cancellationSignal = new CancellationSignal();
        s sVar = this.__db;
        Callable<GameStatEntity> callable = new Callable<GameStatEntity>() { // from class: com.gates.olympus.miruv.data.db.GameStatDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GameStatEntity call() {
                Cursor V2 = i.V(GameStatDao_Impl.this.__db, a3);
                try {
                    return V2.moveToFirst() ? new GameStatEntity(V2.getString(AbstractC0382a.l(V2, "game")), V2.getInt(AbstractC0382a.l(V2, "bestScore")), V2.getInt(AbstractC0382a.l(V2, "lastScore")), V2.getInt(AbstractC0382a.l(V2, "plays"))) : null;
                } finally {
                    V2.close();
                    a3.b();
                }
            }
        };
        if (sVar.isOpenInternal() && sVar.inTransaction()) {
            return callable.call();
        }
        if (dVar.getContext().k(y.f4115d) != null) {
            throw new ClassCastException();
        }
        AbstractC0546s b2 = h.b(sVar);
        C0536h c0536h = new C0536h(1, B.G(dVar));
        c0536h.q();
        c0536h.s(new D0(cancellationSignal, 8, AbstractC0552y.q(S.f5331d, b2, null, new g(callable, c0536h, null), 2)));
        Object p = c0536h.p();
        a aVar = a.f3113d;
        return p;
    }

    @Override // com.gates.olympus.miruv.data.db.GameStatDao
    public InterfaceC0700f observeAll() {
        final v a3 = v.a("SELECT * FROM game_stats", 0);
        return new C0677B(new androidx.room.e(this.__db, new String[]{"game_stats"}, new Callable<List<GameStatEntity>>() { // from class: com.gates.olympus.miruv.data.db.GameStatDao_Impl.3
            public void finalize() {
                a3.b();
            }

            @Override // java.util.concurrent.Callable
            public List<GameStatEntity> call() {
                Cursor V2 = i.V(GameStatDao_Impl.this.__db, a3);
                try {
                    int l3 = AbstractC0382a.l(V2, "game");
                    int l4 = AbstractC0382a.l(V2, "bestScore");
                    int l5 = AbstractC0382a.l(V2, "lastScore");
                    int l6 = AbstractC0382a.l(V2, "plays");
                    ArrayList arrayList = new ArrayList(V2.getCount());
                    while (V2.moveToNext()) {
                        arrayList.add(new GameStatEntity(V2.getString(l3), V2.getInt(l4), V2.getInt(l5), V2.getInt(l6)));
                    }
                    return arrayList;
                } finally {
                    V2.close();
                }
            }
        }, null));
    }

    @Override // com.gates.olympus.miruv.data.db.GameStatDao
    public Object upsert(final GameStatEntity gameStatEntity, d dVar) {
        return h.a(this.__db, new Callable<z>() { // from class: com.gates.olympus.miruv.data.db.GameStatDao_Impl.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public z call() {
                GameStatDao_Impl.this.__db.beginTransaction();
                try {
                    GameStatDao_Impl.this.__insertionAdapterOfGameStatEntity.insert(gameStatEntity);
                    GameStatDao_Impl.this.__db.setTransactionSuccessful();
                    return z.f2729a;
                } finally {
                    GameStatDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }
}
