package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628g2 implements InterfaceC0775lk, ApplicationStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f11901a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f11902b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f11903c = ApplicationState.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f11904d = new CopyOnWriteArraySet();

    public final void a(int i4) {
        this.f11901a.remove(Integer.valueOf(i4));
        a();
    }

    public final void b(int i4) {
        this.f11902b.add(Integer.valueOf(i4));
        this.f11901a.remove(Integer.valueOf(i4));
        a();
    }

    public final void c(int i4) {
        this.f11901a.add(Integer.valueOf(i4));
        this.f11902b.remove(Integer.valueOf(i4));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState getCurrentState() {
        return this.f11903c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0775lk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0775lk
    public final void onDestroy() {
        if (this.f11903c == ApplicationState.VISIBLE) {
            this.f11903c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f11904d.add(applicationStateObserver);
        }
        return this.f11903c;
    }

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f11901a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f11902b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f11903c != applicationState) {
            this.f11903c = applicationState;
            Iterator it = this.f11904d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f11903c);
            }
        }
    }
}
