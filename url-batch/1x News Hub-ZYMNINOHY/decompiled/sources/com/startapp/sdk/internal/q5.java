package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class q5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f4340b;

    public q5(com.startapp.sdk.components.a aVar, Context context) {
        this.f4340b = aVar;
        this.f4339a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f4339a;
        com.startapp.sdk.components.a aVar = this.f4340b;
        return new di(context, aVar.f3448F, aVar.f3446D, new p5());
    }
}
