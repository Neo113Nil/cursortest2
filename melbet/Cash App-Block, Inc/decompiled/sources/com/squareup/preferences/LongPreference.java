package com.squareup.preferences;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class LongPreference {
    public final long defaultValue;
    public final String key;
    public final SharedPreferences preferences;

    public LongPreference(SharedPreferences sharedPreferences, String str, long j) {
        this.preferences = sharedPreferences;
        this.key = str;
        this.defaultValue = j;
    }
}
