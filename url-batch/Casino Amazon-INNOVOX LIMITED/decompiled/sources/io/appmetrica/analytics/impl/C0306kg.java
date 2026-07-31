package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import androidx.core.view.InputDeviceCompat;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.kg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0306kg implements InterfaceC0203gg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1344a;
    public final C0633xi b;
    public final We c;
    public final M7 d;
    public final C0506sg e;
    public final Handler f;

    public C0306kg(C0633xi c0633xi, We we, Handler handler) {
        this(c0633xi, we, handler, we.s());
    }

    public final void a() {
        if (this.f1344a) {
            return;
        }
        C0633xi c0633xi = this.b;
        ResultReceiverC0556ug resultReceiverC0556ug = new ResultReceiverC0556ug(this.f, this);
        c0633xi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC0556ug);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC0624x9.f1563a;
        EnumC0095cb enumC0095cb = EnumC0095cb.EVENT_TYPE_UNDEFINED;
        N3 n3 = new N3("", "", InputDeviceCompat.SOURCE_TOUCHSCREEN, 0, anonymousInstance);
        n3.m = bundle;
        G4 g4 = c0633xi.f1567a;
        c0633xi.a(C0633xi.a(n3, g4), g4, 1, (Map) null);
    }

    public C0306kg(C0633xi c0633xi, We we, Handler handler, boolean z) {
        this(c0633xi, we, handler, z, new M7(z), new C0506sg());
    }

    public C0306kg(C0633xi c0633xi, We we, Handler handler, boolean z, M7 m7, C0506sg c0506sg) {
        this.b = c0633xi;
        this.c = we;
        this.f1344a = z;
        this.d = m7;
        this.e = c0506sg;
        this.f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0203gg
    public final void a(C0407og c0407og) {
        String str = c0407og == null ? null : c0407og.f1416a;
        if (this.f1344a) {
            return;
        }
        synchronized (this) {
            M7 m7 = this.d;
            this.e.getClass();
            m7.d = C0506sg.a(str);
            m7.a();
        }
    }

    public final synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            M7 m7 = this.d;
            m7.c = deferredDeeplinkParametersListener;
            if (m7.f951a) {
                m7.a(1);
            } else {
                m7.a();
            }
        } finally {
            this.c.u();
        }
    }

    public final synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            M7 m7 = this.d;
            m7.b = deferredDeeplinkListener;
            if (m7.f951a) {
                m7.a(1);
            } else {
                m7.a();
            }
        } finally {
            this.c.u();
        }
    }
}
