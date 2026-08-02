package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class g4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3852b;

    public g4(com.startapp.sdk.components.a aVar, Context context) {
        this.f3852b = aVar;
        this.f3851a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f3851a;
        ib ibVar = this.f3852b.f3449G;
        ib ibVar2 = new ib(new f4(this));
        com.startapp.sdk.components.a aVar = this.f3852b;
        return new l2(context, ibVar, ibVar2, aVar.f3470j, aVar.f3447E, new e4());
    }
}
