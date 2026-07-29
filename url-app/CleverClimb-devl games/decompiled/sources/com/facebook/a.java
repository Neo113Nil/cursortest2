package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.ac;
import com.youappi.sdk.mediation.admob.ParamNames;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccessTokenCache.java */
/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f4716a;

    /* renamed from: b, reason: collision with root package name */
    private final C0336a f4717b;

    /* renamed from: c, reason: collision with root package name */
    private t f4718c;

    a(SharedPreferences sharedPreferences, C0336a c0336a) {
        this.f4716a = sharedPreferences;
        this.f4717b = c0336a;
    }

    public a() {
        this(l.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new C0336a());
    }

    public AccessToken a() {
        if (c()) {
            return d();
        }
        if (!e()) {
            return null;
        }
        AccessToken f = f();
        if (f == null) {
            return f;
        }
        a(f);
        g().b();
        return f;
    }

    public void a(AccessToken accessToken) {
        ac.a(accessToken, ParamNames.ACCESS_TOKEN);
        try {
            this.f4716a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.toJSONObject().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public void b() {
        this.f4716a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (e()) {
            g().b();
        }
    }

    private boolean c() {
        return this.f4716a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private AccessToken d() {
        String string = this.f4716a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.createFromJSONObject(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean e() {
        return l.c();
    }

    private AccessToken f() {
        Bundle a2 = g().a();
        if (a2 == null || !t.a(a2)) {
            return null;
        }
        return AccessToken.createFromLegacyCache(a2);
    }

    private t g() {
        if (this.f4718c == null) {
            synchronized (this) {
                if (this.f4718c == null) {
                    this.f4718c = this.f4717b.a();
                }
            }
        }
        return this.f4718c;
    }

    /* compiled from: AccessTokenCache.java */
    /* renamed from: com.facebook.a$a, reason: collision with other inner class name */
    static class C0336a {
        C0336a() {
        }

        public t a() {
            return new t(l.f());
        }
    }
}
