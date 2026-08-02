package com.startapp.sdk.internal;

import android.content.Context;
import android.preference.PreferenceManager;

/* loaded from: classes.dex */
public final class a5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6639a;

    public a5(Context context) {
        this.f6639a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(PreferenceManager.getDefaultSharedPreferences(this.f6639a));
    }
}
