package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.ta, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001ta implements InterfaceC0908pk {
    @Override // io.appmetrica.analytics.impl.InterfaceC0908pk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0908pk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
