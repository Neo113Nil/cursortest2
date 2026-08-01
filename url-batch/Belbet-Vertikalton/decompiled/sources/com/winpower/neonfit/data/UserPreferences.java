package com.winpower.neonfit.data;

import android.content.Context;
import android.content.SharedPreferences;
import j1.e;
import j1.h;

/* loaded from: classes.dex */
public final class UserPreferences {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_CALORIE_GOAL = 2000;
    public static final int DEFAULT_CARB_GOAL = 250;
    public static final int DEFAULT_FAT_GOAL = 65;
    public static final int DEFAULT_PROTEIN_GOAL = 150;
    private static final String KEY_CALORIE_GOAL = "calorie_goal";
    private static final String KEY_CARB_GOAL = "carb_goal";
    private static final String KEY_CELEBRATE_CRASH = "celebrate_crash";
    private static final String KEY_CRASH_SHOWN_DATE = "crash_shown_date";
    private static final String KEY_FAT_GOAL = "fat_goal";
    private static final String KEY_PROTEIN_GOAL = "protein_goal";
    private static final String PREFS_NAME = "neonfit_prefs";
    private final SharedPreferences prefs;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public UserPreferences(Context context) {
        h.e(context, "context");
        this.prefs = context.getSharedPreferences(PREFS_NAME, 0);
    }

    public final int getCarbGoal() {
        return this.prefs.getInt(KEY_CARB_GOAL, DEFAULT_CARB_GOAL);
    }

    public final boolean getCelebrateCrash() {
        return this.prefs.getBoolean(KEY_CELEBRATE_CRASH, true);
    }

    public final String getCrashShownDate() {
        String string = this.prefs.getString(KEY_CRASH_SHOWN_DATE, "");
        return string == null ? "" : string;
    }

    public final int getDailyCalorieGoal() {
        return this.prefs.getInt(KEY_CALORIE_GOAL, DEFAULT_CALORIE_GOAL);
    }

    public final int getFatGoal() {
        return this.prefs.getInt(KEY_FAT_GOAL, 65);
    }

    public final int getProteinGoal() {
        return this.prefs.getInt(KEY_PROTEIN_GOAL, DEFAULT_PROTEIN_GOAL);
    }

    public final void setCarbGoal(int i) {
        SharedPreferences sharedPreferences = this.prefs;
        h.d(sharedPreferences, "prefs");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i < 1) {
            i = 1;
        }
        edit.putInt(KEY_CARB_GOAL, i);
        edit.apply();
    }

    public final void setCelebrateCrash(boolean z2) {
        SharedPreferences sharedPreferences = this.prefs;
        h.d(sharedPreferences, "prefs");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(KEY_CELEBRATE_CRASH, z2);
        edit.apply();
    }

    public final void setCrashShownDate(String str) {
        h.e(str, "value");
        SharedPreferences sharedPreferences = this.prefs;
        h.d(sharedPreferences, "prefs");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(KEY_CRASH_SHOWN_DATE, str);
        edit.apply();
    }

    public final void setDailyCalorieGoal(int i) {
        SharedPreferences sharedPreferences = this.prefs;
        h.d(sharedPreferences, "prefs");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i < 1) {
            i = 1;
        }
        edit.putInt(KEY_CALORIE_GOAL, i);
        edit.apply();
    }

    public final void setFatGoal(int i) {
        SharedPreferences sharedPreferences = this.prefs;
        h.d(sharedPreferences, "prefs");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i < 1) {
            i = 1;
        }
        edit.putInt(KEY_FAT_GOAL, i);
        edit.apply();
    }

    public final void setProteinGoal(int i) {
        SharedPreferences sharedPreferences = this.prefs;
        h.d(sharedPreferences, "prefs");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i < 1) {
            i = 1;
        }
        edit.putInt(KEY_PROTEIN_GOAL, i);
        edit.apply();
    }
}
