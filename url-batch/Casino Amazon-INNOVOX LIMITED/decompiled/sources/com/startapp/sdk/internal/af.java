package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class af implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f171a;
    public final u4 b;

    public af(SharedPreferences sharedPreferences) {
        this.f171a = sharedPreferences;
        this.b = null;
    }

    @Override // android.content.SharedPreferences
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ze edit() {
        return new ze(this.f171a.edit(), this.f171a.getAll(), this.b);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        try {
            return this.f171a.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        try {
            return this.f171a.getAll();
        } catch (Throwable unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        try {
            return this.f171a.getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        try {
            return this.f171a.getFloat(str, f);
        } catch (Throwable unused) {
            return f;
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        try {
            return this.f171a.getInt(str, i);
        } catch (Throwable unused) {
            return i;
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        try {
            return this.f171a.getLong(str, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        try {
            return this.f171a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        try {
            return this.f171a.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f171a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f171a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public af(SharedPreferences sharedPreferences, u4 u4Var) {
        this.f171a = sharedPreferences;
        this.b = u4Var;
    }
}
