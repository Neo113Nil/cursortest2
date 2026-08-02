package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class rf implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f7532a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f7533b;

    /* renamed from: c, reason: collision with root package name */
    public final b5 f7534c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7535d;

    public rf(SharedPreferences.Editor editor, Map map, b5 b5Var) {
        this.f7532a = editor;
        this.f7533b = map;
        this.f7534c = b5Var;
    }

    public final void a(String str, Object obj) {
        if (this.f7534c == null || si.a(this.f7533b.get(str), obj)) {
            return;
        }
        this.f7535d = true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.f7532a.apply();
        b5 b5Var = this.f7534c;
        if (b5Var == null || !this.f7535d) {
            return;
        }
        this.f7535d = false;
        mg.f7288d.a(b5Var.f6701a.f6743a, MetaDataRequest$RequestReason.EXTRAS);
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        if (!this.f7533b.isEmpty()) {
            this.f7535d = true;
        }
        this.f7532a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return this.f7532a.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        this.f7532a.putBoolean(str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f4) {
        a(str, Float.valueOf(f4));
        this.f7532a.putFloat(str, f4);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i4) {
        a(str, Integer.valueOf(i4));
        this.f7532a.putInt(str, i4);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j4) {
        a(str, Long.valueOf(j4));
        this.f7532a.putLong(str, j4);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        this.f7532a.putString(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        this.f7532a.putStringSet(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        if (this.f7533b.containsKey(str)) {
            this.f7535d = true;
        }
        this.f7532a.remove(str);
        return this;
    }
}
