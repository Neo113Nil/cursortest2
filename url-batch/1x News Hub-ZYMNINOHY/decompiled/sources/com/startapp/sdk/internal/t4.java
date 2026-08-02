package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class t4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f4453b;

    public t4(com.startapp.sdk.components.a aVar, Context context) {
        this.f4453b = aVar;
        this.f4452a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new ig(this.f4453b.f3468h, new ib(new s4(this)), new r4(), this.f4452a);
    }
}
