package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class Ze implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f38618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2546cf f38619b;

    public Ze(C2546cf c2546cf, PluginErrorDetails pluginErrorDetails) {
        this.f38619b = c2546cf;
        this.f38618a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2804mb) this.f38619b.f38777d.get()).getPluginExtension().reportUnhandledException(this.f38618a);
    }
}
