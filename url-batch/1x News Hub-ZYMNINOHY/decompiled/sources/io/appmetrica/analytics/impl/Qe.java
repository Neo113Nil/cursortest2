package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Qe implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f6515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Te f6516b;

    public Qe(Te te, PluginErrorDetails pluginErrorDetails) {
        this.f6516b = te;
        this.f6515a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ya) this.f6516b.f6711d.get()).getPluginExtension().reportUnhandledException(this.f6515a);
    }
}
