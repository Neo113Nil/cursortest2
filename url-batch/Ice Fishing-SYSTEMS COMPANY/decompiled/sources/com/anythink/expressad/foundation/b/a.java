package com.anythink.expressad.foundation.b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18656a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f18657b;

    /* renamed from: c, reason: collision with root package name */
    private Context f18658c;

    /* renamed from: d, reason: collision with root package name */
    private String f18659d;

    /* renamed from: e, reason: collision with root package name */
    private String f18660e;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f18662g;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<Context> f18664j;

    /* renamed from: k, reason: collision with root package name */
    private WeakReference<Activity> f18665k;

    /* renamed from: l, reason: collision with root package name */
    private String f18666l;

    /* renamed from: f, reason: collision with root package name */
    private int f18661f = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18663h = false;

    private a() {
    }

    public static a c() {
        if (f18657b == null) {
            synchronized (a.class) {
                try {
                    if (f18657b == null) {
                        f18657b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18657b;
    }

    public final void a(String str) {
        this.f18666l = str;
    }

    public final String b() {
        try {
            Context context = this.f18658c;
            if (context != null) {
                return context.getPackageName();
            }
            return null;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public final void d() {
        if (this.f18663h) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f18662g = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    public final Context e() {
        return this.f18658c;
    }

    public final String f() {
        return !TextUtils.isEmpty(this.f18659d) ? this.f18659d : "";
    }

    public final String g() {
        return !TextUtils.isEmpty(this.f18660e) ? this.f18660e : "";
    }

    public final Context h() {
        WeakReference<Context> weakReference = this.f18664j;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final int i() {
        return this.f18661f;
    }

    public final JSONObject j() {
        return this.f18662g;
    }

    public final String a() {
        return this.f18666l;
    }

    public final void a(Context context) {
        this.f18658c = context;
    }

    private void a(int i) {
        this.f18661f = i;
    }

    public final void b(String str) {
        this.f18659d = str;
    }

    private void a(JSONObject jSONObject) {
        this.f18662g = jSONObject;
    }

    public final void b(Context context) {
        this.f18664j = new WeakReference<>(context);
    }

    public final void c(String str) {
        this.f18660e = str;
    }
}
