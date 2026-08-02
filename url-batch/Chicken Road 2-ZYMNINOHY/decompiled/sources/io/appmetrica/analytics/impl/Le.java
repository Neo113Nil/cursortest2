package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Le implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f10597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Oe f10598b;

    public Le(Oe oe, PluginErrorDetails pluginErrorDetails) {
        this.f10598b = oe;
        this.f10597a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ra) this.f10598b.f10755d.get()).getPluginExtension().reportUnhandledException(this.f10597a);
    }
}
