package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class q5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f7476b;

    public q5(com.startapp.sdk.components.a aVar, Context context) {
        this.f7476b = aVar;
        this.f7475a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f7475a;
        com.startapp.sdk.components.a aVar = this.f7476b;
        return new di(context, aVar.f6546F, aVar.f6544D, new p5());
    }
}
