package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class sf implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f7570a;

    /* renamed from: b, reason: collision with root package name */
    public final b5 f7571b;

    public sf(SharedPreferences sharedPreferences) {
        this.f7570a = sharedPreferences;
        this.f7571b = null;
    }

    @Override // android.content.SharedPreferences
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rf edit() {
        return new rf(this.f7570a.edit(), this.f7570a.getAll(), this.f7571b);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        try {
            return this.f7570a.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        try {
            return this.f7570a.getAll();
        } catch (Throwable unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        try {
            return this.f7570a.getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f4) {
        try {
            return this.f7570a.getFloat(str, f4);
        } catch (Throwable unused) {
            return f4;
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i4) {
        try {
            return this.f7570a.getInt(str, i4);
        } catch (Throwable unused) {
            return i4;
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j4) {
        try {
            return this.f7570a.getLong(str, j4);
        } catch (Throwable unused) {
            return j4;
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        try {
            return this.f7570a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        try {
            return this.f7570a.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f7570a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f7570a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public sf(SharedPreferences sharedPreferences, b5 b5Var) {
        this.f7570a = sharedPreferences;
        this.f7571b = b5Var;
    }
}
