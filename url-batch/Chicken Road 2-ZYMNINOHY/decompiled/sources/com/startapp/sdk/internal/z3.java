package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class z3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f8007a;

    public z3(Context context) {
        this.f8007a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f8007a;
        return new yg(context, new sf(context.getSharedPreferences("StartApp-9b9bfdb86df82dad", 0)), new y3());
    }
}
