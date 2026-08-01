package com.clutchquizarena.app.db;

import X0.d;

/* loaded from: classes.dex */
public interface GameSessionDao {
    Object deactivateAll(d dVar);

    Object getActiveSession(d dVar);

    Object getAllFinished(d dVar);

    Object getBestScore(d dVar);

    Object insert(GameSessionEntity gameSessionEntity, d dVar);

    Object update(GameSessionEntity gameSessionEntity, d dVar);
}
