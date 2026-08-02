package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class s3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7552a;

    public s3(Context context) {
        this.f7552a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new q0(new sf(this.f7552a.getSharedPreferences("StartApp-790ba54ab8e69f2f", 0)));
    }
}
