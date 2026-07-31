package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.appmetrica.analytics.impl.m2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2795m2 implements InterfaceC2968sk, ApplicationStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f39434a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f39435b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f39436c = ApplicationState.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f39437d = new CopyOnWriteArraySet();

    public final void a(int i4) {
        this.f39434a.remove(Integer.valueOf(i4));
        a();
    }

    public final void b(int i4) {
        this.f39435b.add(Integer.valueOf(i4));
        this.f39434a.remove(Integer.valueOf(i4));
        a();
    }

    public final void c(int i4) {
        this.f39434a.add(Integer.valueOf(i4));
        this.f39435b.remove(Integer.valueOf(i4));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState getCurrentState() {
        return this.f39436c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2968sk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2968sk
    public final void onDestroy() {
        if (this.f39436c == ApplicationState.VISIBLE) {
            this.f39436c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f39437d.add(applicationStateObserver);
        }
        return this.f39436c;
    }

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f39434a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f39435b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f39436c != applicationState) {
            this.f39436c = applicationState;
            Iterator it = this.f39437d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f39436c);
            }
        }
    }
}
