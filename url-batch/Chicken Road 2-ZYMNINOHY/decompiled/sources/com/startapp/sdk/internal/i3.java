package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class i3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a6 f7079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f7080c;

    public i3(com.startapp.sdk.components.a aVar, Context context, a6 a6Var) {
        this.f7080c = aVar;
        this.f7078a = context;
        this.f7079b = a6Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f7078a;
        ib ibVar = new ib(new h3(this));
        com.startapp.sdk.components.a aVar = this.f7080c;
        return new mh(context, ibVar, aVar.f6545E, aVar.f6569j, this.f7079b, new g3());
    }
}
