package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class j4 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f284a;

    public j4(Context context) {
        this.f284a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        Context context = this.f284a;
        return new ub(context, new af(context.getSharedPreferences("StartApp-b36110d5cb803404", 0)), new i4(), new Handler(Looper.getMainLooper()));
    }
}
