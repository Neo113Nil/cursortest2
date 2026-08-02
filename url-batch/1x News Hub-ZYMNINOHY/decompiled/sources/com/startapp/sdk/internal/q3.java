package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class q3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4337a;

    public q3(Context context) {
        this.f4337a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new fa(new sf(this.f4337a.getSharedPreferences("StartApp-54ff24db2aee60b9", 0)));
    }
}
