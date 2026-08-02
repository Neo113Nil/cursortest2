package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class k3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a6 f7176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f7177c;

    public k3(com.startapp.sdk.components.a aVar, Context context, a6 a6Var) {
        this.f7177c = aVar;
        this.f7175a = context;
        this.f7176b = a6Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new vh(this.f7175a, this.f7177c.f6545E, new ib(new j3(this)), this.f7177c.f6569j, this.f7176b);
    }
}
