package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Jf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2620Jf {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25781a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f25782b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f25783c;

    /* renamed from: d, reason: collision with root package name */
    public final C2881Yl f25784d;

    public C2620Jf(Context context, C2881Yl c2881Yl) {
        this.f25783c = context;
        this.f25784d = c2881Yl;
    }

    public final synchronized void a(String str) {
        try {
            HashMap hashMap = this.f25781a;
            if (hashMap.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f25783c) : this.f25783c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf = new SharedPreferencesOnSharedPreferenceChangeListenerC2586Hf(this, str);
            hashMap.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC2586Hf);
        } catch (Throwable th) {
            throw th;
        }
    }
}
