package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class c3 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f192a;
    public final /* synthetic */ p5 b;
    public final /* synthetic */ com.startapp.sdk.components.a c;

    public c3(com.startapp.sdk.components.a aVar, Context context, p5 p5Var) {
        this.c = aVar;
        this.f192a = context;
        this.b = p5Var;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        return new eh(this.f192a, this.c.E, new pa(new b3(this)), this.c.i, this.b);
    }
}
