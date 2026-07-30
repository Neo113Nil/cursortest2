package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ProfileCache {
    public static final String CACHED_PROFILE_KEY = "com.facebook.ProfileManager.CachedProfile";
    public static final Companion Companion = new Companion(null);
    public static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
    private final SharedPreferences sharedPreferences;

    public ProfileCache() {
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
    }

    public final void clear() {
        this.sharedPreferences.edit().remove(CACHED_PROFILE_KEY).apply();
    }

    public final Profile load() {
        String string = this.sharedPreferences.getString(CACHED_PROFILE_KEY, null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void save(Profile profile) {
        profile.getClass();
        JSONObject jSONObject = profile.toJSONObject();
        if (jSONObject != null) {
            this.sharedPreferences.edit().putString(CACHED_PROFILE_KEY, jSONObject.toString()).apply();
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
