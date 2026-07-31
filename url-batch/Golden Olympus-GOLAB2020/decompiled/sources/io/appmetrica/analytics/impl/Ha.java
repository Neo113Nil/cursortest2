package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* loaded from: classes3.dex */
public final class Ha implements InterfaceC2968sk {
    @Override // io.appmetrica.analytics.impl.InterfaceC2968sk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2968sk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
