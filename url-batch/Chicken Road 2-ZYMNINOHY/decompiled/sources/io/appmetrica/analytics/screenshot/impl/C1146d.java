package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import c3.C0295g;
import c3.InterfaceC0291c;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146d implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f13459a;

    /* renamed from: b, reason: collision with root package name */
    public final U f13460b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1152j f13461c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0291c f13462d = new C0295g(new C1143a(this));

    public C1146d(ClientContext clientContext, U u4) {
        this.f13459a = clientContext;
        this.f13460b = u4;
    }

    public static final Activity.ScreenCaptureCallback d(C1146d c1146d) {
        return E.c0.n(((C0295g) c1146d.f13462d).a());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C1155m c1155m) {
        this.f13461c = c1155m != null ? c1155m.f13490a : null;
    }

    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f13459a.getActivityLifecycleRegistry().registerListener(new C1145c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
