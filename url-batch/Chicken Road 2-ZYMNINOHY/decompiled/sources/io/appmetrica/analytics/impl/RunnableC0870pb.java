package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.pb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0870pb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f12573a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f12574b;

    public RunnableC0870pb(Handler handler, I2 i22) {
        this.f12573a = new WeakReference(handler);
        this.f12574b = new WeakReference(i22);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f12573a.get();
        I2 i22 = (I2) this.f12574b.get();
        if (handler == null || i22 == null) {
            return;
        }
        boolean f4 = i22.f10390b.f();
        if (!f4) {
            PublicLogger publicLogger = i22.f10391c;
            Set set = AbstractC1049w9.f12924a;
            EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
            M3 m32 = new M3("", "", 3, 0, publicLogger);
            C1058wi c1058wi = i22.f10396h;
            Fh fh = i22.f10390b;
            c1058wi.getClass();
            c1058wi.a(C1058wi.a(m32, fh), fh, 1, (Map) null);
        }
        if (f4) {
            return;
        }
        C0844ob.a(handler, i22, this);
    }
}
