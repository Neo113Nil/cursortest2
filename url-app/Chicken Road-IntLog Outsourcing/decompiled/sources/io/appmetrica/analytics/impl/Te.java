package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* loaded from: classes.dex */
public final class Te implements IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    public final We f7537a = new We();

    /* renamed from: b, reason: collision with root package name */
    public final Xe f7538b = new Xe();

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f7539c = C0736j4.l().g().a();

    /* renamed from: d, reason: collision with root package name */
    public final Provider f7540d;

    public Te(Provider<Ya> provider) {
        this.f7540d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        We we = this.f7537a;
        we.f7667a.a(pluginErrorDetails);
        if (we.f7669c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f9268a) {
            this.f7538b.getClass();
            this.f7539c.execute(new Re(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f7537a.f7667a.a(pluginErrorDetails);
        this.f7538b.getClass();
        this.f7539c.execute(new Qe(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f7537a.f7668b.a(str);
        this.f7538b.getClass();
        this.f7539c.execute(new Se(this, str, str2, pluginErrorDetails));
    }
}
