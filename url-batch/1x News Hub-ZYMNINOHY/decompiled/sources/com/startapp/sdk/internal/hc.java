package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hc implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3933a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3934b;

    public hc(Context context, String str) {
        this.f3933a = context;
        this.f3934b = str;
    }

    @Override // com.startapp.sdk.internal.i2
    public final void a(Bitmap bitmap, int i3) {
        if (bitmap != null) {
            Context context = this.f3933a;
            String str = this.f3934b;
            ConcurrentHashMap concurrentHashMap = f2.f3776a;
            ((Executor) com.startapp.sdk.components.a.a(context).f3445C.a()).execute(new e2(str, bitmap, context));
        }
    }
}
