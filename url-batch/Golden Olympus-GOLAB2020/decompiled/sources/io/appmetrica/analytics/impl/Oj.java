package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class Oj implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f38087a;

    public Oj(PluginErrorDetails pluginErrorDetails) {
        this.f38087a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.getPluginExtension().reportUnhandledException(this.f38087a);
    }
}
