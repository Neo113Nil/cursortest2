package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class h3 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f257a;
    public final /* synthetic */ com.startapp.sdk.components.a b;

    public h3(com.startapp.sdk.components.a aVar, Context context) {
        this.b = aVar;
        this.f257a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        Context context = this.f257a;
        com.startapp.sdk.components.a aVar = this.b;
        return new x5(context, aVar.G, aVar.g);
    }
}
