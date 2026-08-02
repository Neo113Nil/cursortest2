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
public final class C0727og implements InterfaceC0623kg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8011a;

    /* renamed from: b, reason: collision with root package name */
    public final Bi f8012b;

    /* renamed from: c, reason: collision with root package name */
    public final C0364af f8013c;

    /* renamed from: d, reason: collision with root package name */
    public final R7 f8014d;

    /* renamed from: e, reason: collision with root package name */
    public final C0934wg f8015e;
    public final Handler f;

    public C0727og(Bi bi, C0364af c0364af, Handler handler) {
        this(bi, c0364af, handler, c0364af.s());
    }

    public final void a() {
        if (this.f8011a) {
            return;
        }
        Bi bi = this.f8012b;
        ResultReceiverC0985yg resultReceiverC0985yg = new ResultReceiverC0985yg(this.f, this);
        bi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC0985yg);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3("", "", 4098, 0, anonymousInstance);
        u3.f6826m = bundle;
        M4 m4 = bi.f5824a;
        bi.a(Bi.a(u3, m4), m4, 1, (Map) null);
    }

    public C0727og(Bi bi, C0364af c0364af, Handler handler, boolean z) {
        this(bi, c0364af, handler, z, new R7(z), new C0934wg());
    }

    public C0727og(Bi bi, C0364af c0364af, Handler handler, boolean z, R7 r7, C0934wg c0934wg) {
        this.f8012b = bi;
        this.f8013c = c0364af;
        this.f8011a = z;
        this.f8014d = r7;
        this.f8015e = c0934wg;
        this.f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0623kg
    public final void a(C0830sg c0830sg) {
        String str = c0830sg == null ? null : c0830sg.f8315a;
        if (this.f8011a) {
            return;
        }
        synchronized (this) {
            R7 r7 = this.f8014d;
            this.f8015e.getClass();
            r7.f6545d = C0934wg.a(str);
            r7.a();
        }
    }

    public final synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            R7 r7 = this.f8014d;
            r7.f6544c = deferredDeeplinkParametersListener;
            if (r7.f6542a) {
                r7.a(1);
            } else {
                r7.a();
            }
            this.f8013c.u();
        } catch (Throwable th) {
            this.f8013c.u();
            throw th;
        }
    }

    public final synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            R7 r7 = this.f8014d;
            r7.f6543b = deferredDeeplinkListener;
            if (r7.f6542a) {
                r7.a(1);
            } else {
                r7.a();
            }
            this.f8013c.u();
        } catch (Throwable th) {
            this.f8013c.u();
            throw th;
        }
    }
}
