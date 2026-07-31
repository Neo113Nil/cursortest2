package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Bi {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f37255a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C3000u0 f37256b;

    public Bi(C3000u0 c3000u0) {
        this.f37256b = c3000u0;
    }

    public static Bi a() {
        return Ai.f37187a;
    }

    public final C2992ti a(Context context, String str) {
        C2992ti c2992ti;
        C2992ti c2992ti2 = (C2992ti) this.f37255a.get(str);
        if (c2992ti2 != null) {
            return c2992ti2;
        }
        synchronized (this.f37255a) {
            try {
                c2992ti = (C2992ti) this.f37255a.get(str);
                if (c2992ti == null) {
                    IHandlerExecutor a4 = C3082x4.l().f40118c.a();
                    this.f37256b.getClass();
                    if (C2974t0.f39820e == null) {
                        ((U9) a4).f38354b.post(new RunnableC3148zi(this, context));
                    }
                    c2992ti = new C2992ti(context.getApplicationContext(), str, new C3000u0());
                    this.f37255a.put(str, c2992ti);
                    c2992ti.c(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2992ti;
    }
}
