package com.luckyarcade.spinthrow;

/* loaded from: classes.dex */
public final class GameConfig {
    public static final int COMBO_BONUS = 5;
    public static final int COMBO_EVERY = 3;
    public static final int CRYSTALS_PER_WIN = 5;
    public static final GameConfig INSTANCE = new GameConfig();
    public static final int SCORE_PER_STICK = 10;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Difficulty.values().length];
            try {
                iArr[Difficulty.EASY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Difficulty.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Difficulty.HARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private GameConfig() {
    }

    public final LevelConfig forDifficulty(Difficulty difficulty) {
        X0.f.e(difficulty, "difficulty");
        int i = WhenMappings.$EnumSwitchMapping$0[difficulty.ordinal()];
        if (i == 1) {
            return new LevelConfig(Difficulty.EASY, 6, 4, 55.0f, 16.0f, "Easy");
        }
        if (i == 2) {
            return new LevelConfig(Difficulty.MEDIUM, 9, 3, 88.0f, 13.0f, "Medium");
        }
        if (i == 3) {
            return new LevelConfig(Difficulty.HARD, 12, 3, 110.0f, 12.0f, "Hard");
        }
        throw new N0.c();
    }

    public final LevelConfig forLevel(int i) {
        int m2 = q1.d.m(i, 1, 12);
        LevelConfig forDifficulty = m2 <= 4 ? forDifficulty(Difficulty.EASY) : m2 <= 8 ? forDifficulty(Difficulty.MEDIUM) : forDifficulty(Difficulty.HARD);
        int i2 = m2 - 1;
        return LevelConfig.copy$default(forDifficulty, null, forDifficulty.getKnivesRequired() + (i2 / 4), 0, forDifficulty.getRotationDegPerSec() + (i2 * 3.0f), 0.0f, X0.e.d("Level ", m2), 21, null);
    }
}
