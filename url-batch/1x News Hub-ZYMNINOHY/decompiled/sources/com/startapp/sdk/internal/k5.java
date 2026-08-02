package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class k5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f4051b;

    public k5(com.startapp.sdk.components.a aVar, Context context) {
        this.f4051b = aVar;
        this.f4050a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new q(this.f4050a, this.f4051b.f3468h, new j5());
    }
}
