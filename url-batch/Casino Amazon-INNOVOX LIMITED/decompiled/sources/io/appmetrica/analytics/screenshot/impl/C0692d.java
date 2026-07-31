package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0692d implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f1725a;
    public final U b;
    public volatile C0698j c;
    public final Lazy d = LazyKt.lazy(new C0689a(this));

    public C0692d(ClientContext clientContext, U u) {
        this.f1725a = clientContext;
        this.b = u;
    }

    public static final Activity.ScreenCaptureCallback d(C0692d c0692d) {
        return (Activity.ScreenCaptureCallback) c0692d.d.getValue();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C0701m c0701m) {
        this.c = c0701m != null ? c0701m.f1739a : null;
    }

    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f1725a.getActivityLifecycleRegistry().registerListener(new C0691c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
