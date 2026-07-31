package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class v4 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f461a;

    public v4(Context context) {
        this.f461a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        return new af(this.f461a.getSharedPreferences("com.startapp.sdk.extras", 0), new u4(this));
    }
}
