package com.baidu.platform.comapi.h.q;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static JSONObject f9235a;

    /* renamed from: b, reason: collision with root package name */
    private static a f9236b;

    private a() {
    }

    public boolean a(String str) {
        return false;
    }

    public static a a() {
        if (f9236b == null) {
            f9236b = new a();
        }
        if (f9235a == null) {
            f9235a = new JSONObject();
        }
        return f9236b;
    }

    public void a(String str, String str2) {
        try {
            f9235a.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    public void a(String str, int i8) {
        try {
            f9235a.put(str, Integer.toString(i8));
        } catch (JSONException unused) {
        }
    }
}
