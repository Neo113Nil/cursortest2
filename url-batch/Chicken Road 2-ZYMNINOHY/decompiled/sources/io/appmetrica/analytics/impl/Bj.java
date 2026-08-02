package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Bj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f10120a;

    public Bj(PluginErrorDetails pluginErrorDetails) {
        this.f10120a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.getPluginExtension().reportUnhandledException(this.f10120a);
    }
}
