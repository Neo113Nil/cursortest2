package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class um0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, tm0> f12851a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List<sm0> f12852b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f12853c;

    /* renamed from: d, reason: collision with root package name */
    private final rl0 f12854d;

    um0(Context context, rl0 rl0Var) {
        this.f12853c = context;
        this.f12854d = rl0Var;
    }

    final /* synthetic */ void b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f12854d.e();
        }
    }

    final synchronized void c(String str) {
        if (this.f12851a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = "__default__".equals(str) ? PreferenceManager.getDefaultSharedPreferences(this.f12853c) : this.f12853c.getSharedPreferences(str, 0);
        tm0 tm0Var = new tm0(this, str);
        this.f12851a.put(str, tm0Var);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(tm0Var);
    }

    final synchronized void d(sm0 sm0Var) {
        this.f12852b.add(sm0Var);
    }
}
