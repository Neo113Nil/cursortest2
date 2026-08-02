package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851oi {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12525a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C1118z0 f12526b;

    public C0851oi(C1118z0 c1118z0) {
        this.f12526b = c1118z0;
    }

    public static C0851oi a() {
        return AbstractC0825ni.f12468a;
    }

    public final C0644gi a(Context context, String str) {
        C0644gi c0644gi;
        C0644gi c0644gi2 = (C0644gi) this.f12525a.get(str);
        if (c0644gi2 != null) {
            return c0644gi2;
        }
        synchronized (this.f12525a) {
            try {
                c0644gi = (C0644gi) this.f12525a.get(str);
                if (c0644gi == null) {
                    IHandlerExecutor a3 = C0501b4.l().f11457c.a();
                    this.f12526b.getClass();
                    if (C1092y0.f13042e == null) {
                        ((C1127z9) a3).f13097b.post(new RunnableC0799mi(this, context));
                    }
                    c0644gi = new C0644gi(context.getApplicationContext(), str, new C1118z0());
                    this.f12525a.put(str, c0644gi);
                    c0644gi.c(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0644gi;
    }
}
