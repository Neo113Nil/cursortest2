package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class i3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a6 f3954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3955c;

    public i3(com.startapp.sdk.components.a aVar, Context context, a6 a6Var) {
        this.f3955c = aVar;
        this.f3953a = context;
        this.f3954b = a6Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f3953a;
        ib ibVar = new ib(new h3(this));
        com.startapp.sdk.components.a aVar = this.f3955c;
        return new mh(context, ibVar, aVar.f3447E, aVar.f3470j, this.f3954b, new g3());
    }
}
