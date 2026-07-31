package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ze implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f526a;
    public final Map b;
    public final u4 c;
    public boolean d;

    public ze(SharedPreferences.Editor editor, Map map, u4 u4Var) {
        this.f526a = editor;
        this.b = map;
        this.c = u4Var;
    }

    public final void a(String str, Object obj) {
        if (this.c == null || zh.a(this.b.get(str), obj)) {
            return;
        }
        this.d = true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.f526a.apply();
        u4 u4Var = this.c;
        if (u4Var == null || !this.d) {
            return;
        }
        this.d = false;
        vf.d.a(u4Var.f448a.f461a, MetaDataRequest$RequestReason.EXTRAS);
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        if (!this.b.isEmpty()) {
            this.d = true;
        }
        this.f526a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return this.f526a.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        a(str, Float.valueOf(f));
        this.f526a.putFloat(str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        this.f526a.putString(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        this.f526a.putStringSet(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        if (this.b.containsKey(str)) {
            this.d = true;
        }
        this.f526a.remove(str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ze putInt(String str, int i) {
        a(str, Integer.valueOf(i));
        this.f526a.putInt(str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ze putLong(String str, long j) {
        a(str, Long.valueOf(j));
        this.f526a.putLong(str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ze putBoolean(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        this.f526a.putBoolean(str, z);
        return this;
    }
}
