package com.baidu.mshield.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.mshield.utility.g;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class c implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f8387a;

    /* renamed from: b, reason: collision with root package name */
    public Context f8388b;

    /* renamed from: c, reason: collision with root package name */
    public int f8389c;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences.Editor f8390d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8391e;

    /* renamed from: f, reason: collision with root package name */
    public String f8392f;

    /* renamed from: g, reason: collision with root package name */
    public String f8393g;

    public c(Context context, SharedPreferences sharedPreferences, String str, boolean z7, int i8) {
        this(context, sharedPreferences, str, z7, i8, null);
    }

    public final Bundle a(String str, String str2, String str3) {
        try {
            com.baidu.mshield.b.c.a.b("SPT callProviderGet:" + str + "_" + str2 + "_" + str3);
            Bundle bundle = new Bundle();
            bundle.putString("operation", str);
            bundle.putString("pref_name", this.f8392f);
            bundle.putString("key", str2);
            bundle.putString("defult_value", str3);
            return this.f8391e ? TextUtils.isEmpty(this.f8393g) ? g.a(this.f8388b, "CallPreferences", bundle) : g.a(this.f8388b, "CallPreferences", bundle, this.f8393g) : g.a(this.f8388b, "CallPreferences", bundle);
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        throw new RuntimeException("This preference not allow to call contains.");
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        SharedPreferences.Editor editor = this.f8390d;
        if (editor != null) {
            return editor;
        }
        SharedPreferences sharedPreferences = this.f8387a;
        if (sharedPreferences != null) {
            return sharedPreferences.edit();
        }
        return null;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new RuntimeException("This preference not allow to call getAll.");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z7) {
        try {
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        if (this.f8389c != 1 || (this.f8391e && !TextUtils.isEmpty(this.f8393g))) {
            Bundle a8 = a("getBoolean", str, String.valueOf(z7));
            if (a8 != null) {
                com.baidu.mshield.b.c.a.b("SPT getBoolean:return by resultBundle");
                return a8.getBoolean("result", z7);
            }
            return z7;
        }
        if (this.f8387a == null) {
            return z7;
        }
        com.baidu.mshield.b.c.a.b("SPT getBoolean:return by mBase");
        return this.f8387a.getBoolean(str, z7);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f8) {
        try {
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        if (this.f8389c != 1 || (this.f8391e && !TextUtils.isEmpty(this.f8393g))) {
            Bundle a8 = a("getFloat", str, String.valueOf(f8));
            if (a8 != null) {
                com.baidu.mshield.b.c.a.b("SPT getFloat:return by resultBundle");
                return a8.getFloat("result", f8);
            }
            return f8;
        }
        if (this.f8387a == null) {
            return f8;
        }
        com.baidu.mshield.b.c.a.b("SPT getFloat:return by mBase");
        return this.f8387a.getFloat(str, f8);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i8) {
        try {
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        if (this.f8389c != 1 || (this.f8391e && !TextUtils.isEmpty(this.f8393g))) {
            Bundle a8 = a("getInt", str, String.valueOf(i8));
            if (a8 != null) {
                com.baidu.mshield.b.c.a.b("SPT getInt:return by resultBundle");
                return a8.getInt("result", i8);
            }
            return i8;
        }
        if (this.f8387a == null) {
            return i8;
        }
        com.baidu.mshield.b.c.a.b("SPT getInt:return by mBase");
        return this.f8387a.getInt(str, i8);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j8) {
        try {
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        if (this.f8389c != 1 || (this.f8391e && !TextUtils.isEmpty(this.f8393g))) {
            Bundle a8 = a("getLong", str, String.valueOf(j8));
            if (a8 != null) {
                com.baidu.mshield.b.c.a.b("SPT getLong:return by resultBundle");
                return a8.getLong("result", j8);
            }
            return j8;
        }
        if (this.f8387a == null) {
            return j8;
        }
        com.baidu.mshield.b.c.a.b("SPT getLong:return by mBase");
        return this.f8387a.getLong(str, j8);
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        try {
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        if (this.f8389c != 1 || (this.f8391e && !TextUtils.isEmpty(this.f8393g))) {
            Bundle a8 = a("getString", str, str2);
            if (a8 != null) {
                com.baidu.mshield.b.c.a.b("SPT getString:return by resultBundle");
                return a8.getString("result", str2);
            }
            return str2;
        }
        if (this.f8387a == null) {
            return str2;
        }
        com.baidu.mshield.b.c.a.b("SPT getString:return by mBase");
        return this.f8387a.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        throw new RuntimeException("This preference not allow to call getStringSet.");
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        try {
            SharedPreferences sharedPreferences = this.f8387a;
            if (sharedPreferences != null) {
                sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        try {
            SharedPreferences sharedPreferences = this.f8387a;
            if (sharedPreferences != null) {
                sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public c(Context context, SharedPreferences sharedPreferences, String str, boolean z7, int i8, String str2) {
        this.f8388b = context;
        this.f8389c = i8;
        this.f8387a = sharedPreferences;
        this.f8390d = new b(context, sharedPreferences != null ? sharedPreferences.edit() : null, str, z7, this.f8389c, str2);
        this.f8391e = z7;
        this.f8392f = str;
        this.f8393g = str2;
    }
}
