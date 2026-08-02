package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class g4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f6971b;

    public g4(com.startapp.sdk.components.a aVar, Context context) {
        this.f6971b = aVar;
        this.f6970a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f6970a;
        ib ibVar = this.f6971b.f6547G;
        ib ibVar2 = new ib(new f4(this));
        com.startapp.sdk.components.a aVar = this.f6971b;
        return new l2(context, ibVar, ibVar2, aVar.f6569j, aVar.f6545E, new e4());
    }
}
