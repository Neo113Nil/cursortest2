package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class g4 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f245a;
    public final /* synthetic */ com.startapp.sdk.components.a b;

    public g4(com.startapp.sdk.components.a aVar, Context context) {
        this.b = aVar;
        this.f245a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        return new xe(this.f245a, this.b.D, new f4());
    }
}
