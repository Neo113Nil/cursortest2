package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0376na implements InterfaceC0361mk {
    @Override // io.appmetrica.analytics.impl.InterfaceC0361mk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0361mk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
