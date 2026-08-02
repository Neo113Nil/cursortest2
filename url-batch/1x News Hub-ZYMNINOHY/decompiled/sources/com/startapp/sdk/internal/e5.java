package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class e5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3720b;

    public e5(com.startapp.sdk.components.a aVar, Context context) {
        this.f3720b = aVar;
        this.f3719a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f3719a;
        com.startapp.sdk.components.a aVar = this.f3720b;
        return new hj(context, aVar.f3444B, aVar.f3454M);
    }
}
