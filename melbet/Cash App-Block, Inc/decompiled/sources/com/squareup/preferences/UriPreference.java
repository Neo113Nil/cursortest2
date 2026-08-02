package com.squareup.preferences;

import android.content.SharedPreferences;
import android.net.Uri;

/* loaded from: classes.dex */
public final class UriPreference {
    public final String defaultValue = null;
    public final String key;
    public final SharedPreferences preferences;

    public UriPreference(SharedPreferences sharedPreferences, String str) {
        this.preferences = sharedPreferences;
        this.key = str;
    }

    public final Uri get() {
        String string2 = this.preferences.getString(this.key, this.defaultValue);
        if (string2 != null) {
            return Uri.parse(string2);
        }
        return null;
    }

    public final void set(Uri uri) {
        this.preferences.edit().putString(this.key, uri != null ? uri.toString() : null).apply();
    }
}
