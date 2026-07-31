package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3068wg implements InterfaceC2964sg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40080a;

    /* renamed from: b, reason: collision with root package name */
    public final Ji f40081b;

    /* renamed from: c, reason: collision with root package name */
    public final C2730jf f40082c;

    /* renamed from: d, reason: collision with root package name */
    public final C2619f8 f40083d;

    /* renamed from: e, reason: collision with root package name */
    public final Eg f40084e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f40085f;

    public C3068wg(Ji ji, C2730jf c2730jf, @NonNull Handler handler) {
        this(ji, c2730jf, handler, c2730jf.s());
    }

    public final void a() {
        if (this.f40080a) {
            return;
        }
        Ji ji = this.f40081b;
        Gg gg = new Gg(this.f40085f, this);
        ji.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", gg);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4("", "", 4098, 0, anonymousInstance);
        c2694i4.f39388m = bundle;
        C2482a5 c2482a5 = ji.f37839a;
        ji.a(Ji.a(c2694i4, c2482a5), c2482a5, 1, null);
    }

    public C3068wg(Ji ji, C2730jf c2730jf, Handler handler, boolean z4) {
        this(ji, c2730jf, handler, z4, new C2619f8(z4), new Eg());
    }

    public C3068wg(Ji ji, C2730jf c2730jf, Handler handler, boolean z4, C2619f8 c2619f8, Eg eg) {
        this.f40081b = ji;
        this.f40082c = c2730jf;
        this.f40080a = z4;
        this.f40083d = c2619f8;
        this.f40084e = eg;
        this.f40085f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2964sg
    public final void a(Ag ag) {
        String str = ag == null ? null : ag.f37183a;
        if (this.f40080a) {
            return;
        }
        synchronized (this) {
            C2619f8 c2619f8 = this.f40083d;
            this.f40084e.getClass();
            c2619f8.f38960d = Eg.a(str);
            c2619f8.a();
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            C2619f8 c2619f8 = this.f40083d;
            c2619f8.f38959c = deferredDeeplinkParametersListener;
            if (c2619f8.f38957a) {
                c2619f8.a(1);
            } else {
                c2619f8.a();
            }
            this.f40082c.u();
        } catch (Throwable th) {
            this.f40082c.u();
            throw th;
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            C2619f8 c2619f8 = this.f40083d;
            c2619f8.f38958b = deferredDeeplinkListener;
            if (c2619f8.f38957a) {
                c2619f8.a(1);
            } else {
                c2619f8.a();
            }
            this.f40082c.u();
        } catch (Throwable th) {
            this.f40082c.u();
            throw th;
        }
    }
}
