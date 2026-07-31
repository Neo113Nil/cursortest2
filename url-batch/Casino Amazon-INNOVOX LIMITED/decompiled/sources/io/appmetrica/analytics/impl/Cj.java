package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class Cj implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f800a;

    public Cj(PluginErrorDetails pluginErrorDetails) {
        this.f800a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa) {
        sa.getPluginExtension().reportUnhandledException(this.f800a);
    }
}
