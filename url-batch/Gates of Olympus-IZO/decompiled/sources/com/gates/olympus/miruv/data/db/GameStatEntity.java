package com.gates.olympus.miruv.data.db;

import H2.AbstractC0080b;
import Z1.i;

/* loaded from: classes.dex */
public final class GameStatEntity {
    public static final int $stable = 0;
    private final int bestScore;
    private final String game;
    private final int lastScore;
    private final int plays;

    public GameStatEntity(String str, int i3, int i4, int i5) {
        i.f(str, "game");
        this.game = str;
        this.bestScore = i3;
        this.lastScore = i4;
        this.plays = i5;
    }

    public static /* synthetic */ GameStatEntity copy$default(GameStatEntity gameStatEntity, String str, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = gameStatEntity.game;
        }
        if ((i6 & 2) != 0) {
            i3 = gameStatEntity.bestScore;
        }
        if ((i6 & 4) != 0) {
            i4 = gameStatEntity.lastScore;
        }
        if ((i6 & 8) != 0) {
            i5 = gameStatEntity.plays;
        }
        return gameStatEntity.copy(str, i3, i4, i5);
    }

    public final String component1() {
        return this.game;
    }

    public final int component2() {
        return this.bestScore;
    }

    public final int component3() {
        return this.lastScore;
    }

    public final int component4() {
        return this.plays;
    }

    public final GameStatEntity copy(String str, int i3, int i4, int i5) {
        i.f(str, "game");
        return new GameStatEntity(str, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameStatEntity)) {
            return false;
        }
        GameStatEntity gameStatEntity = (GameStatEntity) obj;
        return i.a(this.game, gameStatEntity.game) && this.bestScore == gameStatEntity.bestScore && this.lastScore == gameStatEntity.lastScore && this.plays == gameStatEntity.plays;
    }

    public final int getBestScore() {
        return this.bestScore;
    }

    public final String getGame() {
        return this.game;
    }

    public final int getLastScore() {
        return this.lastScore;
    }

    public final int getPlays() {
        return this.plays;
    }

    public int hashCode() {
        return Integer.hashCode(this.plays) + AbstractC0080b.b(this.lastScore, AbstractC0080b.b(this.bestScore, this.game.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "GameStatEntity(game=" + this.game + ", bestScore=" + this.bestScore + ", lastScore=" + this.lastScore + ", plays=" + this.plays + ")";
    }
}
