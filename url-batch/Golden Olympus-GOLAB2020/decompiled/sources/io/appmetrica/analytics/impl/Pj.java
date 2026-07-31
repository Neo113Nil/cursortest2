package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class Pj implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f38139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38140b;

    public Pj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f38139a = pluginErrorDetails;
        this.f38140b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.getPluginExtension().reportError(this.f38139a, this.f38140b);
    }
}
