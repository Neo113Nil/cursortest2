package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class pb implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f378a;
    public final String b;

    public pb(Context context, String str) {
        this.f378a = context;
        this.b = str;
    }

    @Override // com.startapp.sdk.internal.c2
    public final void a(Bitmap bitmap, int i) {
        if (bitmap != null) {
            Context context = this.f378a;
            String str = this.b;
            ConcurrentHashMap concurrentHashMap = z1.f517a;
            ((Executor) com.startapp.sdk.components.a.a(context).C.a()).execute(new y1(str, bitmap, context));
        }
    }
}
