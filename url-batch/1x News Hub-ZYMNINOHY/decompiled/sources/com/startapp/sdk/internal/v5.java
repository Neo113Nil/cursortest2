package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class v5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f4603b;

    public v5(com.startapp.sdk.components.a aVar, Context context) {
        this.f4603b = aVar;
        this.f4602a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new pk(this.f4602a, this.f4603b.f3463b);
    }
}
