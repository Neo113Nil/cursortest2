package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ti, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858ti {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8377a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C0944x0 f8378b;

    public C0858ti(C0944x0 c0944x0) {
        this.f8378b = c0944x0;
    }

    public static C0858ti a() {
        return AbstractC0832si.f8319a;
    }

    public final C0651li a(Context context, String str) {
        C0651li c0651li;
        C0651li c0651li2 = (C0651li) this.f8377a.get(str);
        if (c0651li2 != null) {
            return c0651li2;
        }
        synchronized (this.f8377a) {
            try {
                c0651li = (C0651li) this.f8377a.get(str);
                if (c0651li == null) {
                    IHandlerExecutor a3 = C0585j4.l().f7594c.a();
                    this.f8378b.getClass();
                    if (C0918w0.f8537e == null) {
                        ((G9) a3).f6035b.post(new RunnableC0806ri(this, context));
                    }
                    c0651li = new C0651li(context.getApplicationContext(), str, new C0944x0());
                    this.f8377a.put(str, c0651li);
                    c0651li.d(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0651li;
    }
}
