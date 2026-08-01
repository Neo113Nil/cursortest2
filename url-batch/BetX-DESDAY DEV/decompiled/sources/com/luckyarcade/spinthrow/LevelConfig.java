package com.luckyarcade.spinthrow;

/* loaded from: classes.dex */
public final class LevelConfig {
    private final Difficulty difficulty;
    private final String displayName;
    private final int knivesRequired;
    private final int lives;
    private final float minGapDeg;
    private final float rotationDegPerSec;

    public LevelConfig(Difficulty difficulty, int i, int i2, float f2, float f3, String str) {
        X0.f.e(difficulty, "difficulty");
        X0.f.e(str, "displayName");
        this.difficulty = difficulty;
        this.knivesRequired = i;
        this.lives = i2;
        this.rotationDegPerSec = f2;
        this.minGapDeg = f3;
        this.displayName = str;
    }

    public static /* synthetic */ LevelConfig copy$default(LevelConfig levelConfig, Difficulty difficulty, int i, int i2, float f2, float f3, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            difficulty = levelConfig.difficulty;
        }
        if ((i3 & 2) != 0) {
            i = levelConfig.knivesRequired;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = levelConfig.lives;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            f2 = levelConfig.rotationDegPerSec;
        }
        float f4 = f2;
        if ((i3 & 16) != 0) {
            f3 = levelConfig.minGapDeg;
        }
        float f5 = f3;
        if ((i3 & 32) != 0) {
            str = levelConfig.displayName;
        }
        return levelConfig.copy(difficulty, i4, i5, f4, f5, str);
    }

    public final Difficulty component1() {
        return this.difficulty;
    }

    public final int component2() {
        return this.knivesRequired;
    }

    public final int component3() {
        return this.lives;
    }

    public final float component4() {
        return this.rotationDegPerSec;
    }

    public final float component5() {
        return this.minGapDeg;
    }

    public final String component6() {
        return this.displayName;
    }

    public final LevelConfig copy(Difficulty difficulty, int i, int i2, float f2, float f3, String str) {
        X0.f.e(difficulty, "difficulty");
        X0.f.e(str, "displayName");
        return new LevelConfig(difficulty, i, i2, f2, f3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelConfig)) {
            return false;
        }
        LevelConfig levelConfig = (LevelConfig) obj;
        return this.difficulty == levelConfig.difficulty && this.knivesRequired == levelConfig.knivesRequired && this.lives == levelConfig.lives && Float.compare(this.rotationDegPerSec, levelConfig.rotationDegPerSec) == 0 && Float.compare(this.minGapDeg, levelConfig.minGapDeg) == 0 && X0.f.a(this.displayName, levelConfig.displayName);
    }

    public final Difficulty getDifficulty() {
        return this.difficulty;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getKnivesRequired() {
        return this.knivesRequired;
    }

    public final int getLives() {
        return this.lives;
    }

    public final float getMinGapDeg() {
        return this.minGapDeg;
    }

    public final float getRotationDegPerSec() {
        return this.rotationDegPerSec;
    }

    public int hashCode() {
        return this.displayName.hashCode() + ((Float.hashCode(this.minGapDeg) + ((Float.hashCode(this.rotationDegPerSec) + ((Integer.hashCode(this.lives) + ((Integer.hashCode(this.knivesRequired) + (this.difficulty.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "LevelConfig(difficulty=" + this.difficulty + ", knivesRequired=" + this.knivesRequired + ", lives=" + this.lives + ", rotationDegPerSec=" + this.rotationDegPerSec + ", minGapDeg=" + this.minGapDeg + ", displayName=" + this.displayName + ")";
    }
}
