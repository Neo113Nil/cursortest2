package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class v5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f7745b;

    public v5(com.startapp.sdk.components.a aVar, Context context) {
        this.f7745b = aVar;
        this.f7744a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new pk(this.f7744a, this.f7745b.f6561b);
    }
}
