package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class b5 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f179a;
    public final /* synthetic */ com.startapp.sdk.components.a b;

    public b5(com.startapp.sdk.components.a aVar, Context context) {
        this.b = aVar;
        this.f179a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        return new q(this.f179a, this.b.g, new a5());
    }
}
