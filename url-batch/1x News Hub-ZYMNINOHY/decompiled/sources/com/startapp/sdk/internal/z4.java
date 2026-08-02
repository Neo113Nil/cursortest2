package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class z4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4858a;

    public z4(Context context) {
        this.f4858a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(this.f4858a.getSharedPreferences("com.startapp.sdk", 0));
    }
}
