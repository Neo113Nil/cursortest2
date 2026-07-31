package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class J0 implements AppMetricaPlugins {

    /* renamed from: a, reason: collision with root package name */
    public final L0 f898a;

    public J0(L0 l0) {
        this.f898a = l0;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f898a.a(pluginErrorDetails, str);
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f898a.a(pluginErrorDetails);
    }

    public J0() {
        this(new L0());
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f898a.a(str, str2, pluginErrorDetails);
    }
}
