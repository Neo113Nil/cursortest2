package com.appsflyer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static j f3470a = new j();

    /* renamed from: c, reason: collision with root package name */
    private boolean f3472c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3473d;
    private String e;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f3471b = new HashMap();
    private boolean f = false;

    private j() {
    }

    public static j a() {
        return f3470a;
    }

    public void a(String str, String str2) {
        this.f3471b.put(str, str2);
    }

    public void a(String str, boolean z) {
        this.f3471b.put(str, Boolean.toString(z));
    }

    public String a(String str) {
        return (String) this.f3471b.get(str);
    }

    public boolean b(String str, boolean z) {
        String a2 = a(str);
        return a2 == null ? z : Boolean.valueOf(a2).booleanValue();
    }

    public int a(String str, int i) {
        String a2 = a(str);
        return a2 == null ? i : Integer.valueOf(a2).intValue();
    }

    protected void b() {
        this.f3472c = true;
    }

    protected boolean c() {
        return this.f3473d;
    }

    protected void a(boolean z) {
        this.f3473d = z;
    }

    protected void d() {
        this.f3473d = true;
    }

    protected void b(String str) {
        a("AF_REFERRER", str);
        this.e = str;
    }

    public String a(Context context) {
        if (this.e != null) {
            return this.e;
        }
        if (a("AF_REFERRER") != null) {
            return a("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("appsflyer-data", 0).getString(TapjoyConstants.TJC_REFERRER, null);
    }

    public boolean e() {
        return b("disableLogs", false);
    }

    public boolean f() {
        return b("disableOtherSdk", false);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void a(SharedPreferences sharedPreferences) {
        String jSONObject = new JSONObject(this.f3471b).toString();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("savedProperties", jSONObject);
        if (Build.VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    public void b(Context context) {
        String string;
        if (this.f || (string = context.getSharedPreferences("appsflyer-data", 0).getString("savedProperties", null)) == null) {
            return;
        }
        d.c("Loading properties..");
        try {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (this.f3471b.get(next) == null) {
                    this.f3471b.put(next, jSONObject.getString(next));
                }
            }
            this.f = true;
        } catch (JSONException e) {
            d.a("Failed loading properties", e);
        }
        StringBuilder sb = new StringBuilder("Done loading properties: ");
        sb.append(this.f);
        d.c(sb.toString());
    }
}
