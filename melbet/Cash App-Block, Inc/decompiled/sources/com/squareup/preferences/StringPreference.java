package com.squareup.preferences;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class StringPreference {
    public final String key;
    public final SharedPreferences preferences;

    public StringPreference(SharedPreferences sharedPreferences, String str) {
        this.preferences = sharedPreferences;
        this.key = str;
    }

    public final void delete() {
        this.preferences.edit().remove(this.key).apply();
    }

    public final void set(String str) {
        str.getClass();
        this.preferences.edit().putString(this.key, str).apply();
    }

    public StringPreference(SharedPreferences sharedPreferences, String str, int i) {
        this.preferences = sharedPreferences;
        this.key = str;
    }
}
