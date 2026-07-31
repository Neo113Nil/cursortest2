package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class c5 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f194a;
    public final /* synthetic */ com.startapp.sdk.components.a b;

    public c5(com.startapp.sdk.components.a aVar, Context context) {
        this.b = aVar;
        this.f194a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        return new sj(this.f194a, this.b.f160a);
    }
}
