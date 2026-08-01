package com.clutchquizarena.app.db;

import g1.d;
import g1.f;

/* loaded from: classes.dex */
public final class GameSessionEntity {
    private final int correctAnswers;
    private final int currentQuestionIndex;
    private final long elapsedTimeMs;
    private final Long finishedAt;
    private final long id;
    private final boolean isActive;
    private final boolean isWin;
    private final int level;
    private final int lives;
    private final int score;
    private final int totalQuestions;

    public GameSessionEntity() {
        this(0L, 0, 0, 0, 0, 0, 0L, 0, false, false, null, 2047, null);
    }

    public final long component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.isWin;
    }

    public final Long component11() {
        return this.finishedAt;
    }

    public final int component2() {
        return this.score;
    }

    public final int component3() {
        return this.lives;
    }

    public final int component4() {
        return this.currentQuestionIndex;
    }

    public final int component5() {
        return this.correctAnswers;
    }

    public final int component6() {
        return this.totalQuestions;
    }

    public final long component7() {
        return this.elapsedTimeMs;
    }

    public final int component8() {
        return this.level;
    }

    public final boolean component9() {
        return this.isActive;
    }

    public final GameSessionEntity copy(long j2, int i, int i2, int i3, int i4, int i5, long j3, int i6, boolean z2, boolean z3, Long l2) {
        return new GameSessionEntity(j2, i, i2, i3, i4, i5, j3, i6, z2, z3, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameSessionEntity)) {
            return false;
        }
        GameSessionEntity gameSessionEntity = (GameSessionEntity) obj;
        return this.id == gameSessionEntity.id && this.score == gameSessionEntity.score && this.lives == gameSessionEntity.lives && this.currentQuestionIndex == gameSessionEntity.currentQuestionIndex && this.correctAnswers == gameSessionEntity.correctAnswers && this.totalQuestions == gameSessionEntity.totalQuestions && this.elapsedTimeMs == gameSessionEntity.elapsedTimeMs && this.level == gameSessionEntity.level && this.isActive == gameSessionEntity.isActive && this.isWin == gameSessionEntity.isWin && f.a(this.finishedAt, gameSessionEntity.finishedAt);
    }

    public final int getCorrectAnswers() {
        return this.correctAnswers;
    }

    public final int getCurrentQuestionIndex() {
        return this.currentQuestionIndex;
    }

    public final long getElapsedTimeMs() {
        return this.elapsedTimeMs;
    }

    public final Long getFinishedAt() {
        return this.finishedAt;
    }

    public final long getId() {
        return this.id;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getLives() {
        return this.lives;
    }

    public final int getScore() {
        return this.score;
    }

    public final int getTotalQuestions() {
        return this.totalQuestions;
    }

    public int hashCode() {
        int hashCode = (Boolean.hashCode(this.isWin) + ((Boolean.hashCode(this.isActive) + ((Integer.hashCode(this.level) + ((Long.hashCode(this.elapsedTimeMs) + ((Integer.hashCode(this.totalQuestions) + ((Integer.hashCode(this.correctAnswers) + ((Integer.hashCode(this.currentQuestionIndex) + ((Integer.hashCode(this.lives) + ((Integer.hashCode(this.score) + (Long.hashCode(this.id) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Long l2 = this.finishedAt;
        return hashCode + (l2 == null ? 0 : l2.hashCode());
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isWin() {
        return this.isWin;
    }

    public String toString() {
        return "GameSessionEntity(id=" + this.id + ", score=" + this.score + ", lives=" + this.lives + ", currentQuestionIndex=" + this.currentQuestionIndex + ", correctAnswers=" + this.correctAnswers + ", totalQuestions=" + this.totalQuestions + ", elapsedTimeMs=" + this.elapsedTimeMs + ", level=" + this.level + ", isActive=" + this.isActive + ", isWin=" + this.isWin + ", finishedAt=" + this.finishedAt + ")";
    }

    public GameSessionEntity(long j2, int i, int i2, int i3, int i4, int i5, long j3, int i6, boolean z2, boolean z3, Long l2) {
        this.id = j2;
        this.score = i;
        this.lives = i2;
        this.currentQuestionIndex = i3;
        this.correctAnswers = i4;
        this.totalQuestions = i5;
        this.elapsedTimeMs = j3;
        this.level = i6;
        this.isActive = z2;
        this.isWin = z3;
        this.finishedAt = l2;
    }

    public /* synthetic */ GameSessionEntity(long j2, int i, int i2, int i3, int i4, int i5, long j3, int i6, boolean z2, boolean z3, Long l2, int i7, d dVar) {
        this((i7 & 1) != 0 ? 0L : j2, (i7 & 2) != 0 ? 0 : i, (i7 & 4) != 0 ? 3 : i2, (i7 & 8) != 0 ? 0 : i3, (i7 & 16) != 0 ? 0 : i4, (i7 & 32) != 0 ? 10 : i5, (i7 & 64) == 0 ? j3 : 0L, (i7 & 128) != 0 ? 1 : i6, (i7 & 256) == 0 ? z2 : true, (i7 & 512) == 0 ? z3 : false, (i7 & 1024) != 0 ? null : l2);
    }
}
