package com.startapp.sdk.internal;

import android.content.Context;
import android.preference.PreferenceManager;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class t4 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f433a;

    public t4(Context context) {
        this.f433a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        return new af(PreferenceManager.getDefaultSharedPreferences(this.f433a));
    }
}
