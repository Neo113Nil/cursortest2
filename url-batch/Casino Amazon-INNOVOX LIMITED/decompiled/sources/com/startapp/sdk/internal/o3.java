package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class o3 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f358a;

    public o3(Context context) {
        this.f358a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        Context context = this.f358a;
        return new hg(context, new af(context.getSharedPreferences("StartApp-9b9bfdb86df82dad", 0)), new n3());
    }
}
