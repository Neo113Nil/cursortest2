package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class k3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a6 f4048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f4049c;

    public k3(com.startapp.sdk.components.a aVar, Context context, a6 a6Var) {
        this.f4049c = aVar;
        this.f4047a = context;
        this.f4048b = a6Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new vh(this.f4047a, this.f4049c.f3447E, new ib(new j3(this)), this.f4049c.f3470j, this.f4048b);
    }
}
