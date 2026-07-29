package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* compiled from: SPHelper.java */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static t f8959a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Context f8960b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f8961c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final String f8962d = "mobclick_agent_user_";

    /* compiled from: SPHelper.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final t f8963a = new t();

        private a() {
        }
    }

    public static synchronized t a(Context context) {
        t tVar;
        synchronized (t.class) {
            if (f8960b == null && context != null) {
                f8960b = context.getApplicationContext();
            }
            if (f8960b != null) {
                f8961c = context.getPackageName();
            }
            tVar = a.f8963a;
        }
        return tVar;
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor edit = e().edit();
        edit.putString("au_p", str);
        edit.putString("au_u", str2);
        edit.commit();
    }

    public String[] a() {
        SharedPreferences e = e();
        if (e != null) {
            String string = e.getString("au_p", null);
            String string2 = e.getString("au_u", null);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                return new String[]{string, string2};
            }
        }
        return null;
    }

    public void b() {
        SharedPreferences e = e();
        if (e != null) {
            e.edit().remove("au_p").remove("au_u").commit();
        }
    }

    public String c() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8960b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    public void a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8960b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    public void a(int i) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8960b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i).commit();
        }
    }

    public int d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8960b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    private SharedPreferences e() {
        if (f8960b == null) {
            return null;
        }
        return f8960b.getSharedPreferences(f8962d + f8961c, 0);
    }
}
