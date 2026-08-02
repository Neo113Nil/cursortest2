package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0929wb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f8562a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f8563b;

    public RunnableC0929wb(Handler handler, Q2 q22) {
        this.f8562a = new WeakReference(handler);
        this.f8563b = new WeakReference(q22);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f8562a.get();
        Q2 q22 = (Q2) this.f8563b.get();
        if (handler == null || q22 == null) {
            return;
        }
        boolean f = q22.f6484b.f();
        if (!f) {
            PublicLogger publicLogger = q22.f6485c;
            Set set = D9.f5886a;
            EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
            U3 u3 = new U3("", "", 3, 0, publicLogger);
            Bi bi = q22.f6489h;
            Kh kh = q22.f6484b;
            bi.getClass();
            bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        }
        if (f) {
            return;
        }
        C0903vb.a(handler, q22, this);
    }
}
