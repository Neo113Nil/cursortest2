package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class e5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f6834b;

    public e5(com.startapp.sdk.components.a aVar, Context context) {
        this.f6834b = aVar;
        this.f6833a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f6833a;
        com.startapp.sdk.components.a aVar = this.f6834b;
        return new hj(context, aVar.f6542B, aVar.f6552M);
    }
}
