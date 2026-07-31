package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class c4 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f193a;
    public final /* synthetic */ com.startapp.sdk.components.a b;

    public c4(com.startapp.sdk.components.a aVar, Context context) {
        this.b = aVar;
        this.f193a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        Context context = this.f193a;
        pa paVar = new pa(new b4(this));
        com.startapp.sdk.components.a aVar = this.b;
        return new sf(context, paVar, aVar.i, aVar.E, new a4());
    }
}
