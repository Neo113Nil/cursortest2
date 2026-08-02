package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719jg implements InterfaceC0616fg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12136a;

    /* renamed from: b, reason: collision with root package name */
    public final C1058wi f12137b;

    /* renamed from: c, reason: collision with root package name */
    public final Ve f12138c;

    /* renamed from: d, reason: collision with root package name */
    public final L7 f12139d;

    /* renamed from: e, reason: collision with root package name */
    public final C0926rg f12140e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f12141f;

    public C0719jg(C1058wi c1058wi, Ve ve, Handler handler) {
        this(c1058wi, ve, handler, ve.s());
    }

    public final void a() {
        if (this.f12136a) {
            return;
        }
        C1058wi c1058wi = this.f12137b;
        ResultReceiverC0978tg resultReceiverC0978tg = new ResultReceiverC0978tg(this.f12141f, this);
        c1058wi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC0978tg);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3("", "", 4098, 0, anonymousInstance);
        m32.f10806m = bundle;
        F4 f4 = c1058wi.f12944a;
        c1058wi.a(C1058wi.a(m32, f4), f4, 1, (Map) null);
    }

    public C0719jg(C1058wi c1058wi, Ve ve, Handler handler, boolean z) {
        this(c1058wi, ve, handler, z, new L7(z), new C0926rg());
    }

    public C0719jg(C1058wi c1058wi, Ve ve, Handler handler, boolean z, L7 l7, C0926rg c0926rg) {
        this.f12137b = c1058wi;
        this.f12138c = ve;
        this.f12136a = z;
        this.f12139d = l7;
        this.f12140e = c0926rg;
        this.f12141f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0616fg
    public final void a(C0823ng c0823ng) {
        String str = c0823ng == null ? null : c0823ng.f12464a;
        if (this.f12136a) {
            return;
        }
        synchronized (this) {
            L7 l7 = this.f12139d;
            this.f12140e.getClass();
            l7.f10581d = C0926rg.a(str);
            l7.a();
        }
    }

    public final synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            L7 l7 = this.f12139d;
            l7.f10580c = deferredDeeplinkParametersListener;
            if (l7.f10578a) {
                l7.a(1);
            } else {
                l7.a();
            }
            this.f12138c.u();
        } catch (Throwable th) {
            this.f12138c.u();
            throw th;
        }
    }

    public final synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            L7 l7 = this.f12139d;
            l7.f10579b = deferredDeeplinkListener;
            if (l7.f10578a) {
                l7.a(1);
            } else {
                l7.a();
            }
            this.f12138c.u();
        } catch (Throwable th) {
            this.f12138c.u();
            throw th;
        }
    }
}
