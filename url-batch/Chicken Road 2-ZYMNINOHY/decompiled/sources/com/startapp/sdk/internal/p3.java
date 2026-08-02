package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class p3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f7435b;

    public p3(com.startapp.sdk.components.a aVar, Context context) {
        this.f7435b = aVar;
        this.f7434a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f7434a;
        com.startapp.sdk.components.a aVar = this.f7435b;
        return new g6(context, aVar.f6547G, aVar.f6567h);
    }
}
