package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3158d implements P {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f40741a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f40742b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C3163i f40743c;

    /* renamed from: d, reason: collision with root package name */
    public final W1.h f40744d = W1.i.b(new C3155a(this));

    public C3158d(@NotNull ClientContext clientContext, @NotNull Q q4) {
        this.f40741a = clientContext;
        this.f40742b = q4;
    }

    public static final Activity.ScreenCaptureCallback d(C3158d c3158d) {
        return U1.e.a(c3158d.f40744d.getValue());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a(@Nullable C3166l c3166l) {
        this.f40743c = c3166l != null ? c3166l.f40769a : null;
    }

    @NotNull
    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f40741a.getActivityLifecycleRegistry().registerListener(new C3157c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
