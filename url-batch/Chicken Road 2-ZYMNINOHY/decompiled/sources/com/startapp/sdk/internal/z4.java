package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class z4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f8008a;

    public z4(Context context) {
        this.f8008a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(this.f8008a.getSharedPreferences("com.startapp.sdk", 0));
    }
}
