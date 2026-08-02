package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0791ma implements InterfaceC0775lk {
    @Override // io.appmetrica.analytics.impl.InterfaceC0775lk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0775lk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
