package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import b2.C0193g;
import b2.InterfaceC0189c;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021d implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9030a;

    /* renamed from: b, reason: collision with root package name */
    public final U f9031b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1027j f9032c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0189c f9033d = new C0193g(new C1018a(this));

    public C1021d(ClientContext clientContext, U u3) {
        this.f9030a = clientContext;
        this.f9031b = u3;
    }

    public static final Activity.ScreenCaptureCallback d(C1021d c1021d) {
        return C1.b.m(((C0193g) c1021d.f9033d).a());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C1030m c1030m) {
        this.f9032c = c1030m != null ? c1030m.f9060a : null;
    }

    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f9030a.getActivityLifecycleRegistry().registerListener(new C1020c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
