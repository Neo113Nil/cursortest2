package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1080wb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f9516a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f9517b;

    public RunnableC1080wb(Handler handler, Q2 q22) {
        this.f9516a = new WeakReference(handler);
        this.f9517b = new WeakReference(q22);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f9516a.get();
        Q2 q22 = (Q2) this.f9517b.get();
        if (handler == null || q22 == null) {
            return;
        }
        boolean f3 = q22.f7300b.f();
        if (!f3) {
            PublicLogger publicLogger = q22.f7301c;
            Set set = D9.f6670a;
            EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
            U3 u32 = new U3("", "", 3, 0, publicLogger);
            Bi bi = q22.f7306h;
            Kh kh = q22.f7300b;
            bi.getClass();
            bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
        }
        if (f3) {
            return;
        }
        C1054vb.a(handler, q22, this);
    }
}
