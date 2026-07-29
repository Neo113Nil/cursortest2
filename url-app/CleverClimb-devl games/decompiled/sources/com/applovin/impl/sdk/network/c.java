package com.applovin.impl.sdk.network;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f3336a = new Object();

    private static JSONObject a(String str, Context context) {
        JSONObject b2 = b(context);
        if (b2 == null) {
            b2 = new JSONObject();
        }
        if (!b2.has(str)) {
            try {
                b2.put(str, new JSONObject());
            } catch (JSONException unused) {
            }
        }
        return b2;
    }

    static void a(int i, String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f3336a) {
            String c2 = l.c(str);
            JSONObject a2 = a(c2, context);
            String num = Integer.toString(i);
            JSONObject optJSONObject = a2.optJSONObject(c2);
            try {
                optJSONObject.put(num, optJSONObject.optInt(num) + 1);
            } catch (JSONException unused) {
            }
            try {
                a2.put(c2, optJSONObject);
            } catch (JSONException unused2) {
            }
            a(a2, context);
        }
    }

    public static void a(Context context) {
        synchronized (f3336a) {
            com.applovin.impl.sdk.b.e.a((com.applovin.impl.sdk.b.d) com.applovin.impl.sdk.b.d.k, context);
        }
    }

    private static void a(JSONObject jSONObject, Context context) {
        com.applovin.impl.sdk.b.e.a(com.applovin.impl.sdk.b.d.k, jSONObject.toString(), context);
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject;
        synchronized (f3336a) {
            try {
                try {
                    jSONObject = new JSONObject((String) com.applovin.impl.sdk.b.e.b(com.applovin.impl.sdk.b.d.k, "{}", context));
                } catch (JSONException unused) {
                    return new JSONObject();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }
}
