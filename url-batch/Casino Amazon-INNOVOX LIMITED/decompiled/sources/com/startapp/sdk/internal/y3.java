package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class y3 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f504a;
    public final /* synthetic */ com.startapp.sdk.components.a b;

    public y3(com.startapp.sdk.components.a aVar, Context context) {
        this.b = aVar;
        this.f504a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        Context context = this.f504a;
        pa paVar = this.b.G;
        pa paVar2 = new pa(new x3(this));
        com.startapp.sdk.components.a aVar = this.b;
        return new f2(context, paVar, paVar2, aVar.i, aVar.E, new w3());
    }
}
