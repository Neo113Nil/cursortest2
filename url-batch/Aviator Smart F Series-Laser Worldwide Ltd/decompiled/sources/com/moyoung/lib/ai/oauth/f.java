package com.moyoung.lib.ai.oauth;

import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public class f {
    public static final String KEY_AUTH_CONFIG_VERSION = "key_auth_config_version";
    public static final String KEY_BEARER_TOKEN = "key_bearer_token";
    public static final String KEY_REFRESH_TOKEN = "key_refresh_token";
    public static final String KEY_TOKEN_TYPE = "key_token_type";
    private static final String PREF_NAME = "oauth_prefs";

    static void clearTokens() {
        if (com.moyoung.lib.ai.e.getContext() == null) {
            return;
        }
        SharedPreferences.Editor edit = com.moyoung.lib.ai.e.getContext().getSharedPreferences(PREF_NAME, 0).edit();
        edit.remove(KEY_BEARER_TOKEN);
        edit.remove(KEY_REFRESH_TOKEN);
        edit.remove(KEY_TOKEN_TYPE);
        edit.remove(KEY_AUTH_CONFIG_VERSION);
        edit.apply();
    }

    static String getAuthConfigVersion() {
        return com.moyoung.lib.ai.e.getContext() == null ? "1.2.3" : com.moyoung.lib.ai.e.getContext().getSharedPreferences(PREF_NAME, 0).getString(KEY_AUTH_CONFIG_VERSION, "1.2.3");
    }

    static String getRefreshToken() {
        return getTokenFromSP(KEY_REFRESH_TOKEN);
    }

    static String getRefreshTokenFromSP() {
        return getTokenFromSP(KEY_REFRESH_TOKEN);
    }

    public static String getToken() {
        return getTokenFromSP(KEY_BEARER_TOKEN);
    }

    static String getTokenFromSP(String str) {
        if (com.moyoung.lib.ai.e.getContext() == null) {
            return null;
        }
        return com.moyoung.lib.ai.e.getContext().getSharedPreferences(PREF_NAME, 0).getString(str, null);
    }

    public static String getTokenType() {
        return com.moyoung.lib.ai.e.getContext() == null ? "Bearer" : com.moyoung.lib.ai.e.getContext().getSharedPreferences(PREF_NAME, 0).getString(KEY_TOKEN_TYPE, "Bearer");
    }

    static void saveAuthConfigVersion(String str) {
        if (com.moyoung.lib.ai.e.getContext() == null) {
            return;
        }
        SharedPreferences.Editor edit = com.moyoung.lib.ai.e.getContext().getSharedPreferences(PREF_NAME, 0).edit();
        edit.putString(KEY_AUTH_CONFIG_VERSION, str);
        edit.apply();
    }

    static void saveTokenType(String str) {
        if (com.moyoung.lib.ai.e.getContext() == null) {
            return;
        }
        SharedPreferences.Editor edit = com.moyoung.lib.ai.e.getContext().getSharedPreferences(PREF_NAME, 0).edit();
        edit.putString(KEY_TOKEN_TYPE, str);
        edit.apply();
    }

    static void saveTokens(b bVar) {
        if (com.moyoung.lib.ai.e.getContext() == null) {
            return;
        }
        SharedPreferences.Editor edit = com.moyoung.lib.ai.e.getContext().getSharedPreferences(PREF_NAME, 0).edit();
        edit.putString(KEY_BEARER_TOKEN, bVar.getBearerToken());
        edit.putString(KEY_REFRESH_TOKEN, bVar.getRefreshToken());
        edit.putString(KEY_TOKEN_TYPE, bVar.getTokenType());
        edit.apply();
    }
}
