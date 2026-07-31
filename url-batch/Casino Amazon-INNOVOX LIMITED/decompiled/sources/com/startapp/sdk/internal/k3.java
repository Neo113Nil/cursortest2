package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class k3 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f297a;

    public k3(Context context) {
        this.f297a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        return new n0(new af(this.f297a.getSharedPreferences("StartApp-790ba54ab8e69f2f", 0)));
    }
}
