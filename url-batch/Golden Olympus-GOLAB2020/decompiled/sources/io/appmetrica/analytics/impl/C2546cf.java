package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2546cf implements IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    public final C2626ff f38774a = new C2626ff();

    /* renamed from: b, reason: collision with root package name */
    public final C2653gf f38775b = new C2653gf();

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f38776c = C3082x4.l().g().a();

    /* renamed from: d, reason: collision with root package name */
    public final Provider f38777d;

    public C2546cf(@NonNull Provider<InterfaceC2804mb> provider) {
        this.f38777d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, String str) {
        C2626ff c2626ff = this.f38774a;
        c2626ff.f38966a.a(pluginErrorDetails);
        if (c2626ff.f38968c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f39527a) {
            this.f38775b.getClass();
            this.f38776c.execute(new RunnableC2492af(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        this.f38774a.f38966a.a(pluginErrorDetails);
        this.f38775b.getClass();
        this.f38776c.execute(new Ze(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f38774a.f38967b.a(str);
        this.f38775b.getClass();
        this.f38776c.execute(new RunnableC2519bf(this, str, str2, pluginErrorDetails));
    }
}
