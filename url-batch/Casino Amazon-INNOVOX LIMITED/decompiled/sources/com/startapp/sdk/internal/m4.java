package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class m4 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f330a;
    public final /* synthetic */ com.startapp.sdk.components.a b;

    public m4(com.startapp.sdk.components.a aVar, Context context) {
        this.b = aVar;
        this.f330a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        return new rf(this.b.g, new pa(new l4(this)), new k4(), this.f330a);
    }
}
