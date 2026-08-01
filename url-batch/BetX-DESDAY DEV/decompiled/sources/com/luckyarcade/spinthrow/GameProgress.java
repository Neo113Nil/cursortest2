package com.luckyarcade.spinthrow;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class GameProgress {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_BEST_SCORE = "best_score";
    private static final String KEY_CRYSTALS = "crystals";
    private static final String KEY_UNLOCKED = "unlocked_difficulty";
    private static final String PREFS_NAME = "lucky_throw_progress";
    private final SharedPreferences prefs;

    public static final class Companion {
        public /* synthetic */ Companion(X0.c cVar) {
            this();
        }

        private Companion() {
        }
    }

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

    public GameProgress(Context context) {
        X0.f.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        X0.f.d(sharedPreferences, "getSharedPreferences(...)");
        this.prefs = sharedPreferences;
    }

    public final void addCrystals(int i) {
        setCrystals(getCrystals() + i);
    }

    public final int getBestScore() {
        return this.prefs.getInt(KEY_BEST_SCORE, 0);
    }

    public final int getCrystals() {
        return this.prefs.getInt(KEY_CRYSTALS, 0);
    }

    public final int getUnlockedDifficulty() {
        return this.prefs.getInt(KEY_UNLOCKED, 0);
    }

    public final boolean isDifficultyUnlocked(Difficulty difficulty) {
        X0.f.e(difficulty, "difficulty");
        int i = WhenMappings.$EnumSwitchMapping$0[difficulty.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                throw new N0.c();
            }
            if (getUnlockedDifficulty() >= 2) {
                return true;
            }
        } else if (getUnlockedDifficulty() >= 1) {
            return true;
        }
        return false;
    }

    public final void setBestScore(int i) {
        if (i > getBestScore()) {
            SharedPreferences.Editor edit = this.prefs.edit();
            edit.putInt(KEY_BEST_SCORE, i);
            edit.apply();
        }
    }

    public final void setCrystals(int i) {
        SharedPreferences.Editor edit = this.prefs.edit();
        if (i < 0) {
            i = 0;
        }
        edit.putInt(KEY_CRYSTALS, i);
        edit.apply();
    }

    public final void setUnlockedDifficulty(int i) {
        if (i > getUnlockedDifficulty()) {
            SharedPreferences.Editor edit = this.prefs.edit();
            edit.putInt(KEY_UNLOCKED, i);
            edit.apply();
        }
    }

    public final void unlockNext(Difficulty difficulty) {
        X0.f.e(difficulty, "difficulty");
        int i = WhenMappings.$EnumSwitchMapping$0[difficulty.ordinal()];
        if (i == 1) {
            setUnlockedDifficulty(1);
        } else if (i == 2) {
            setUnlockedDifficulty(2);
        } else if (i != 3) {
            throw new N0.c();
        }
    }
}
