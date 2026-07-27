package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878og implements InterfaceC0774kg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8931a;

    /* renamed from: b, reason: collision with root package name */
    public final Bi f8932b;

    /* renamed from: c, reason: collision with root package name */
    public final C0515af f8933c;

    /* renamed from: d, reason: collision with root package name */
    public final R7 f8934d;

    /* renamed from: e, reason: collision with root package name */
    public final C1085wg f8935e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f8936f;

    public C0878og(Bi bi, C0515af c0515af, Handler handler) {
        this(bi, c0515af, handler, c0515af.s());
    }

    public final void a() {
        if (this.f8931a) {
            return;
        }
        Bi bi = this.f8932b;
        ResultReceiverC1136yg resultReceiverC1136yg = new ResultReceiverC1136yg(this.f8936f, this);
        bi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC1136yg);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3("", "", 4098, 0, anonymousInstance);
        u32.f7660m = bundle;
        M4 m42 = bi.f6605a;
        bi.a(Bi.a(u32, m42), m42, 1, (Map) null);
    }

    public C0878og(Bi bi, C0515af c0515af, Handler handler, boolean z) {
        this(bi, c0515af, handler, z, new R7(z), new C1085wg());
    }

    public C0878og(Bi bi, C0515af c0515af, Handler handler, boolean z, R7 r7, C1085wg c1085wg) {
        this.f8932b = bi;
        this.f8933c = c0515af;
        this.f8931a = z;
        this.f8934d = r7;
        this.f8935e = c1085wg;
        this.f8936f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0774kg
    public final void a(C0981sg c0981sg) {
        String str = c0981sg == null ? null : c0981sg.f9256a;
        if (this.f8931a) {
            return;
        }
        synchronized (this) {
            R7 r7 = this.f8934d;
            this.f8935e.getClass();
            r7.f7364d = C1085wg.a(str);
            r7.a();
        }
    }

    public final synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            R7 r7 = this.f8934d;
            r7.f7363c = deferredDeeplinkParametersListener;
            if (r7.f7361a) {
                r7.a(1);
            } else {
                r7.a();
            }
            this.f8933c.u();
        } catch (Throwable th) {
            this.f8933c.u();
            throw th;
        }
    }

    public final synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            R7 r7 = this.f8934d;
            r7.f7362b = deferredDeeplinkListener;
            if (r7.f7361a) {
                r7.a(1);
            } else {
                r7.a();
            }
            this.f8933c.u();
        } catch (Throwable th) {
            this.f8933c.u();
            throw th;
        }
    }
}
