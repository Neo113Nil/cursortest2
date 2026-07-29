package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.ac;
import com.google.android.gms.common.Scopes;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProfileCache.java */
/* loaded from: classes.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f6464a = l.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    v() {
    }

    Profile a() {
        String string = this.f6464a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    void a(Profile profile) {
        ac.a(profile, Scopes.PROFILE);
        JSONObject jSONObject = profile.toJSONObject();
        if (jSONObject != null) {
            this.f6464a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
        }
    }

    void b() {
        this.f6464a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
}
