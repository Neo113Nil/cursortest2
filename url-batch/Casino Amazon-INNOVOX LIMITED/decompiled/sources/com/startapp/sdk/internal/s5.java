package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class s5 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f416a;
    public final /* synthetic */ p5 b;
    public final /* synthetic */ com.startapp.sdk.components.a c;

    public s5(com.startapp.sdk.components.a aVar, Context context, p5 p5Var) {
        this.c = aVar;
        this.f416a = context;
        this.b = p5Var;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        Context context = this.f416a;
        pa paVar = new pa(new r5(this));
        com.startapp.sdk.components.a aVar = this.c;
        return new vg(context, paVar, aVar.E, aVar.i, this.b, new q5());
    }
}
