package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class j4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f7123b;

    public j4(com.startapp.sdk.components.a aVar, Context context) {
        this.f7123b = aVar;
        this.f7122a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f7122a;
        ib ibVar = new ib(new i4(this));
        com.startapp.sdk.components.a aVar = this.f7123b;
        return new jg(context, ibVar, aVar.f6569j, aVar.f6545E, new h4());
    }
}
