package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final long f4411d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f4412a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4413b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4414c;

    public A(String str, String str2, long j) {
        this.f4412a = str;
        this.f4413b = str2;
        this.f4414c = j;
    }

    public static String a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e7);
            return null;
        }
    }

    public static A b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new A(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new A(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e7) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e7);
            return null;
        }
    }
}
