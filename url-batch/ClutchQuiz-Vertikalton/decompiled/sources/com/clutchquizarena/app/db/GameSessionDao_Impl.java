package com.clutchquizarena.app.db;

import X0.d;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import androidx.room.i;
import androidx.room.t;
import androidx.room.w;
import androidx.room.y;
import g1.f;
import i0.InterfaceC0146e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class GameSessionDao_Impl implements GameSessionDao {
    private final t __db;
    private final i __insertionAdapterOfGameSessionEntity;
    private final y __preparedStmtOfDeactivateAll;
    private final h __updateAdapterOfGameSessionEntity;

    public GameSessionDao_Impl(t tVar) {
        this.__db = tVar;
        this.__insertionAdapterOfGameSessionEntity = new i(tVar) { // from class: com.clutchquizarena.app.db.GameSessionDao_Impl.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(tVar);
                f.e(tVar, "database");
            }

            @Override // androidx.room.y
            public String createQuery() {
                return "INSERT OR ABORT INTO `game_sessions` (`id`,`score`,`lives`,`currentQuestionIndex`,`correctAnswers`,`totalQuestions`,`elapsedTimeMs`,`level`,`isActive`,`isWin`,`finishedAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.i
            public void bind(InterfaceC0146e interfaceC0146e, GameSessionEntity gameSessionEntity) {
                interfaceC0146e.r(1, gameSessionEntity.getId());
                interfaceC0146e.r(2, gameSessionEntity.getScore());
                interfaceC0146e.r(3, gameSessionEntity.getLives());
                interfaceC0146e.r(4, gameSessionEntity.getCurrentQuestionIndex());
                interfaceC0146e.r(5, gameSessionEntity.getCorrectAnswers());
                interfaceC0146e.r(6, gameSessionEntity.getTotalQuestions());
                interfaceC0146e.r(7, gameSessionEntity.getElapsedTimeMs());
                interfaceC0146e.r(8, gameSessionEntity.getLevel());
                interfaceC0146e.r(9, gameSessionEntity.isActive() ? 1L : 0L);
                interfaceC0146e.r(10, gameSessionEntity.isWin() ? 1L : 0L);
                if (gameSessionEntity.getFinishedAt() == null) {
                    interfaceC0146e.f(11);
                } else {
                    interfaceC0146e.r(11, gameSessionEntity.getFinishedAt().longValue());
                }
            }
        };
        this.__updateAdapterOfGameSessionEntity = new h(tVar) { // from class: com.clutchquizarena.app.db.GameSessionDao_Impl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(tVar);
                f.e(tVar, "database");
            }

            @Override // androidx.room.y
            public String createQuery() {
                return "UPDATE OR ABORT `game_sessions` SET `id` = ?,`score` = ?,`lives` = ?,`currentQuestionIndex` = ?,`correctAnswers` = ?,`totalQuestions` = ?,`elapsedTimeMs` = ?,`level` = ?,`isActive` = ?,`isWin` = ?,`finishedAt` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.h
            public void bind(InterfaceC0146e interfaceC0146e, GameSessionEntity gameSessionEntity) {
                interfaceC0146e.r(1, gameSessionEntity.getId());
                interfaceC0146e.r(2, gameSessionEntity.getScore());
                interfaceC0146e.r(3, gameSessionEntity.getLives());
                interfaceC0146e.r(4, gameSessionEntity.getCurrentQuestionIndex());
                interfaceC0146e.r(5, gameSessionEntity.getCorrectAnswers());
                interfaceC0146e.r(6, gameSessionEntity.getTotalQuestions());
                interfaceC0146e.r(7, gameSessionEntity.getElapsedTimeMs());
                interfaceC0146e.r(8, gameSessionEntity.getLevel());
                interfaceC0146e.r(9, gameSessionEntity.isActive() ? 1L : 0L);
                interfaceC0146e.r(10, gameSessionEntity.isWin() ? 1L : 0L);
                if (gameSessionEntity.getFinishedAt() == null) {
                    interfaceC0146e.f(11);
                } else {
                    interfaceC0146e.r(11, gameSessionEntity.getFinishedAt().longValue());
                }
                interfaceC0146e.r(12, gameSessionEntity.getId());
            }
        };
        this.__preparedStmtOfDeactivateAll = new y(tVar) { // from class: com.clutchquizarena.app.db.GameSessionDao_Impl.3
            @Override // androidx.room.y
            public String createQuery() {
                return "UPDATE game_sessions SET isActive = 0 WHERE isActive = 1";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.clutchquizarena.app.db.GameSessionDao
    public Object deactivateAll(d dVar) {
        return androidx.room.f.b(this.__db, new Callable<U0.i>() { // from class: com.clutchquizarena.app.db.GameSessionDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public U0.i call() {
                InterfaceC0146e acquire = GameSessionDao_Impl.this.__preparedStmtOfDeactivateAll.acquire();
                try {
                    GameSessionDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.w();
                        GameSessionDao_Impl.this.__db.setTransactionSuccessful();
                        return U0.i.f864a;
                    } finally {
                        GameSessionDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GameSessionDao_Impl.this.__preparedStmtOfDeactivateAll.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.clutchquizarena.app.db.GameSessionDao
    public Object getActiveSession(d dVar) {
        final w a2 = w.a("SELECT * FROM game_sessions WHERE isActive = 1 LIMIT 1");
        return androidx.room.f.a(this.__db, new CancellationSignal(), new Callable<GameSessionEntity>() { // from class: com.clutchquizarena.app.db.GameSessionDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GameSessionEntity call() {
                Cursor I2 = T.d.I(GameSessionDao_Impl.this.__db, a2);
                try {
                    int s2 = T.d.s(I2, "id");
                    int s3 = T.d.s(I2, "score");
                    int s4 = T.d.s(I2, "lives");
                    int s5 = T.d.s(I2, "currentQuestionIndex");
                    int s6 = T.d.s(I2, "correctAnswers");
                    int s7 = T.d.s(I2, "totalQuestions");
                    int s8 = T.d.s(I2, "elapsedTimeMs");
                    int s9 = T.d.s(I2, "level");
                    int s10 = T.d.s(I2, "isActive");
                    int s11 = T.d.s(I2, "isWin");
                    int s12 = T.d.s(I2, "finishedAt");
                    GameSessionEntity gameSessionEntity = null;
                    if (I2.moveToFirst()) {
                        gameSessionEntity = new GameSessionEntity(I2.getLong(s2), I2.getInt(s3), I2.getInt(s4), I2.getInt(s5), I2.getInt(s6), I2.getInt(s7), I2.getLong(s8), I2.getInt(s9), I2.getInt(s10) != 0, I2.getInt(s11) != 0, I2.isNull(s12) ? null : Long.valueOf(I2.getLong(s12)));
                    }
                    return gameSessionEntity;
                } finally {
                    I2.close();
                    a2.p();
                }
            }
        }, dVar);
    }

    @Override // com.clutchquizarena.app.db.GameSessionDao
    public Object getAllFinished(d dVar) {
        final w a2 = w.a("SELECT * FROM game_sessions WHERE isActive = 0 ORDER BY finishedAt DESC");
        return androidx.room.f.a(this.__db, new CancellationSignal(), new Callable<List<GameSessionEntity>>() { // from class: com.clutchquizarena.app.db.GameSessionDao_Impl.9
            @Override // java.util.concurrent.Callable
            public List<GameSessionEntity> call() {
                Cursor I2 = T.d.I(GameSessionDao_Impl.this.__db, a2);
                try {
                    int s2 = T.d.s(I2, "id");
                    int s3 = T.d.s(I2, "score");
                    int s4 = T.d.s(I2, "lives");
                    int s5 = T.d.s(I2, "currentQuestionIndex");
                    int s6 = T.d.s(I2, "correctAnswers");
                    int s7 = T.d.s(I2, "totalQuestions");
                    int s8 = T.d.s(I2, "elapsedTimeMs");
                    int s9 = T.d.s(I2, "level");
                    int s10 = T.d.s(I2, "isActive");
                    int s11 = T.d.s(I2, "isWin");
                    int s12 = T.d.s(I2, "finishedAt");
                    ArrayList arrayList = new ArrayList(I2.getCount());
                    while (I2.moveToNext()) {
                        arrayList.add(new GameSessionEntity(I2.getLong(s2), I2.getInt(s3), I2.getInt(s4), I2.getInt(s5), I2.getInt(s6), I2.getInt(s7), I2.getLong(s8), I2.getInt(s9), I2.getInt(s10) != 0, I2.getInt(s11) != 0, I2.isNull(s12) ? null : Long.valueOf(I2.getLong(s12))));
                    }
                    return arrayList;
                } finally {
                    I2.close();
                    a2.p();
                }
            }
        }, dVar);
    }

    @Override // com.clutchquizarena.app.db.GameSessionDao
    public Object getBestScore(d dVar) {
        final w a2 = w.a("SELECT MAX(score) FROM game_sessions WHERE isActive = 0");
        return androidx.room.f.a(this.__db, new CancellationSignal(), new Callable<Integer>() { // from class: com.clutchquizarena.app.db.GameSessionDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() {
                Cursor I2 = T.d.I(GameSessionDao_Impl.this.__db, a2);
                try {
                    Integer num = null;
                    if (I2.moveToFirst() && !I2.isNull(0)) {
                        num = Integer.valueOf(I2.getInt(0));
                    }
                    return num;
                } finally {
                    I2.close();
                    a2.p();
                }
            }
        }, dVar);
    }

    @Override // com.clutchquizarena.app.db.GameSessionDao
    public Object insert(final GameSessionEntity gameSessionEntity, d dVar) {
        return androidx.room.f.b(this.__db, new Callable<Long>() { // from class: com.clutchquizarena.app.db.GameSessionDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                GameSessionDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(GameSessionDao_Impl.this.__insertionAdapterOfGameSessionEntity.insertAndReturnId(gameSessionEntity));
                    GameSessionDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    GameSessionDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // com.clutchquizarena.app.db.GameSessionDao
    public Object update(final GameSessionEntity gameSessionEntity, d dVar) {
        return androidx.room.f.b(this.__db, new Callable<U0.i>() { // from class: com.clutchquizarena.app.db.GameSessionDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public U0.i call() {
                GameSessionDao_Impl.this.__db.beginTransaction();
                try {
                    GameSessionDao_Impl.this.__updateAdapterOfGameSessionEntity.handle(gameSessionEntity);
                    GameSessionDao_Impl.this.__db.setTransactionSuccessful();
                    return U0.i.f864a;
                } finally {
                    GameSessionDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }
}
