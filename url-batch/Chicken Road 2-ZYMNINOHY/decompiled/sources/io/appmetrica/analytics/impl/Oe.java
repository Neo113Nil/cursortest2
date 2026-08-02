package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* loaded from: classes.dex */
public final class Oe implements IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Re f10752a = new Re();

    /* renamed from: b, reason: collision with root package name */
    public final Se f10753b = new Se();

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f10754c = C0501b4.l().g().a();

    /* renamed from: d, reason: collision with root package name */
    public final Provider f10755d;

    public Oe(Provider<Ra> provider) {
        this.f10755d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        Re re = this.f10752a;
        re.f10883a.a(pluginErrorDetails);
        if (re.f10885c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f12630a) {
            this.f10753b.getClass();
            this.f10754c.execute(new Me(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f10752a.f10883a.a(pluginErrorDetails);
        this.f10753b.getClass();
        this.f10754c.execute(new Le(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f10752a.f10884b.a(str);
        this.f10753b.getClass();
        this.f10754c.execute(new Ne(this, str, str2, pluginErrorDetails));
    }
}
