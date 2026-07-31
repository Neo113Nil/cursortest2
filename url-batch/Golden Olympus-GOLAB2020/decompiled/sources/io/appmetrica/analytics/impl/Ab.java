package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Ab extends JSONObject {
    public Ab() {
    }

    public final Long a(String str) {
        try {
            return Long.valueOf(getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String b(String str) {
        if (!has(str)) {
            return "";
        }
        try {
            return getString(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public Ab(String str) {
        super(str);
    }
}
