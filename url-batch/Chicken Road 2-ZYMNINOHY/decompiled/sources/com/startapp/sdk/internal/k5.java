package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class k5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f7179b;

    public k5(com.startapp.sdk.components.a aVar, Context context) {
        this.f7179b = aVar;
        this.f7178a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new q(this.f7178a, this.f7179b.f6567h, new j5());
    }
}
