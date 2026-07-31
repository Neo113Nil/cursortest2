package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* loaded from: classes.dex */
final class tm0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f12266a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ um0 f12267b;

    public tm0(um0 um0Var, String str) {
        this.f12267b = um0Var;
        this.f12266a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<sm0> list;
        synchronized (this.f12267b) {
            list = this.f12267b.f12852b;
            for (sm0 sm0Var : list) {
                sm0Var.f11875a.b(sm0Var.f11876b, sharedPreferences, this.f12266a, str);
            }
        }
    }
}
