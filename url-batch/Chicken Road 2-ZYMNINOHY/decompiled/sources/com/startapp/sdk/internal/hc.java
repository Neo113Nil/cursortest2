package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hc implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7058a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7059b;

    public hc(Context context, String str) {
        this.f7058a = context;
        this.f7059b = str;
    }

    @Override // com.startapp.sdk.internal.i2
    public final void a(Bitmap bitmap, int i4) {
        if (bitmap != null) {
            Context context = this.f7058a;
            String str = this.f7059b;
            ConcurrentHashMap concurrentHashMap = f2.f6892a;
            ((Executor) com.startapp.sdk.components.a.a(context).f6543C.a()).execute(new e2(str, bitmap, context));
        }
    }
}
