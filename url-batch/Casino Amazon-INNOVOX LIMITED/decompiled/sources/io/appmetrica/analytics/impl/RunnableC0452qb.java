package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0452qb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1452a;
    public final WeakReference b;

    public RunnableC0452qb(Handler handler, J2 j2) {
        this.f1452a = new WeakReference(handler);
        this.b = new WeakReference(j2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f1452a.get();
        J2 j2 = (J2) this.b.get();
        if (handler == null || j2 == null) {
            return;
        }
        boolean f = j2.b.f();
        if (!f) {
            PublicLogger publicLogger = j2.c;
            Set set = AbstractC0624x9.f1563a;
            EnumC0095cb enumC0095cb = EnumC0095cb.EVENT_TYPE_UNDEFINED;
            N3 n3 = new N3("", "", 3, 0, publicLogger);
            C0633xi c0633xi = j2.h;
            Gh gh = j2.b;
            c0633xi.getClass();
            c0633xi.a(C0633xi.a(n3, gh), gh, 1, (Map) null);
        }
        if (f) {
            return;
        }
        C0427pb.a(handler, j2, this);
    }
}
