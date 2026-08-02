package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class n4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f7316b;

    public n4(com.startapp.sdk.components.a aVar, Context context) {
        this.f7316b = aVar;
        this.f7315a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new pf(this.f7315a, this.f7316b.f6544D, new m4());
    }
}
