package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* loaded from: classes.dex */
public final class Te implements IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    public final We f6708a = new We();

    /* renamed from: b, reason: collision with root package name */
    public final Xe f6709b = new Xe();

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f6710c = C0585j4.l().g().a();

    /* renamed from: d, reason: collision with root package name */
    public final Provider f6711d;

    public Te(Provider<Ya> provider) {
        this.f6711d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        We we = this.f6708a;
        we.f6832a.a(pluginErrorDetails);
        if (we.f6834c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f8327a) {
            this.f6709b.getClass();
            this.f6710c.execute(new Re(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f6708a.f6832a.a(pluginErrorDetails);
        this.f6709b.getClass();
        this.f6710c.execute(new Qe(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f6708a.f6833b.a(str);
        this.f6709b.getClass();
        this.f6710c.execute(new Se(this, str, str2, pluginErrorDetails));
    }
}
