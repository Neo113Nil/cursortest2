package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class rf implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f4395a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4396b;

    /* renamed from: c, reason: collision with root package name */
    public final b5 f4397c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4398d;

    public rf(SharedPreferences.Editor editor, Map map, b5 b5Var) {
        this.f4395a = editor;
        this.f4396b = map;
        this.f4397c = b5Var;
    }

    public final void a(String str, Object obj) {
        if (this.f4397c == null || si.a(this.f4396b.get(str), obj)) {
            return;
        }
        this.f4398d = true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.f4395a.apply();
        b5 b5Var = this.f4397c;
        if (b5Var == null || !this.f4398d) {
            return;
        }
        this.f4398d = false;
        mg.f4159d.a(b5Var.f3595a.f3634a, MetaDataRequest$RequestReason.EXTRAS);
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        if (!this.f4396b.isEmpty()) {
            this.f4398d = true;
        }
        this.f4395a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return this.f4395a.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        this.f4395a.putBoolean(str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        a(str, Float.valueOf(f));
        this.f4395a.putFloat(str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i3) {
        a(str, Integer.valueOf(i3));
        this.f4395a.putInt(str, i3);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j3) {
        a(str, Long.valueOf(j3));
        this.f4395a.putLong(str, j3);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        this.f4395a.putString(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        this.f4395a.putStringSet(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        if (this.f4396b.containsKey(str)) {
            this.f4398d = true;
        }
        this.f4395a.remove(str);
        return this;
    }
}
