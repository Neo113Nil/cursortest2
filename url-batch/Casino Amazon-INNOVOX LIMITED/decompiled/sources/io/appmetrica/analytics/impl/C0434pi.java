package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0434pi {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1436a = new HashMap();
    public final C0665z0 b;

    public C0434pi(C0665z0 c0665z0) {
        this.b = c0665z0;
    }

    public static C0434pi a() {
        return AbstractC0409oi.f1417a;
    }

    public final C0231hi a(Context context, String str) {
        C0231hi c0231hi;
        C0231hi c0231hi2 = (C0231hi) this.f1436a.get(str);
        if (c0231hi2 != null) {
            return c0231hi2;
        }
        synchronized (this.f1436a) {
            c0231hi = (C0231hi) this.f1436a.get(str);
            if (c0231hi == null) {
                IHandlerExecutor a2 = C0088c4.l().c.a();
                this.b.getClass();
                if (C0640y0.e == null) {
                    ((A9) a2).b.post(new RunnableC0384ni(this, context));
                }
                c0231hi = new C0231hi(context.getApplicationContext(), str, new C0665z0());
                this.f1436a.put(str, c0231hi);
                c0231hi.d(str);
            }
        }
        return c0231hi;
    }
}
