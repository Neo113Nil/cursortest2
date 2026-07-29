package com.umeng.commonsdk.internal;

import android.content.Context;

/* compiled from: UMInternalData.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f8987b;

    /* renamed from: a, reason: collision with root package name */
    private Context f8988a;

    /* renamed from: c, reason: collision with root package name */
    private c f8989c;

    private b(Context context) {
        this.f8988a = context;
        this.f8989c = new c(context);
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f8987b == null) {
                f8987b = new b(context.getApplicationContext());
            }
            bVar = f8987b;
        }
        return bVar;
    }

    public c a() {
        return this.f8989c;
    }
}
