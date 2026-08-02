package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class sf implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4433a;

    /* renamed from: b, reason: collision with root package name */
    public final b5 f4434b;

    public sf(SharedPreferences sharedPreferences) {
        this.f4433a = sharedPreferences;
        this.f4434b = null;
    }

    @Override // android.content.SharedPreferences
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rf edit() {
        return new rf(this.f4433a.edit(), this.f4433a.getAll(), this.f4434b);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        try {
            return this.f4433a.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        try {
            return this.f4433a.getAll();
        } catch (Throwable unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        try {
            return this.f4433a.getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        try {
            return this.f4433a.getFloat(str, f);
        } catch (Throwable unused) {
            return f;
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i3) {
        try {
            return this.f4433a.getInt(str, i3);
        } catch (Throwable unused) {
            return i3;
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j3) {
        try {
            return this.f4433a.getLong(str, j3);
        } catch (Throwable unused) {
            return j3;
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        try {
            return this.f4433a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        try {
            return this.f4433a.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4433a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4433a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public sf(SharedPreferences sharedPreferences, b5 b5Var) {
        this.f4433a = sharedPreferences;
        this.f4434b = b5Var;
    }
}
