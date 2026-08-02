package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class t4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f7590b;

    public t4(com.startapp.sdk.components.a aVar, Context context) {
        this.f7590b = aVar;
        this.f7589a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new ig(this.f7590b.f6567h, new ib(new s4(this)), new r4(), this.f7589a);
    }
}
