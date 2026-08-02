package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* renamed from: io.appmetrica.analytics.impl.vo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038vo extends SimpleThreadSafeToggle implements ApplicationStateObserver {
    public C1038vo() {
        super(false, "[VisibleAppStateOnlyTrackingStatusToggle]");
        synchronized (this) {
            a(C0817na.k().e().registerStickyObserver(this));
        }
    }

    public final void a(ApplicationState applicationState) {
        updateState(applicationState == ApplicationState.VISIBLE);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
    public final synchronized void onApplicationStateChanged(ApplicationState applicationState) {
        a(applicationState);
    }
}
