package com.squareup.preferences;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class BooleanPreference {
    public final boolean defaultValue;
    public final String key;
    public final SharedPreferences preferences;

    public BooleanPreference(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.getClass();
        this.preferences = sharedPreferences;
        this.key = str;
        this.defaultValue = z;
    }

    public final boolean get() {
        return this.preferences.getBoolean(this.key, this.defaultValue);
    }

    public final void set(boolean z) {
        this.preferences.edit().putBoolean(this.key, z).apply();
    }
}
