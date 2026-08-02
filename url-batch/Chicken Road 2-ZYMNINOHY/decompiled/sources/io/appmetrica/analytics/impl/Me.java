package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Me implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f10651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Oe f10653c;

    public Me(Oe oe, PluginErrorDetails pluginErrorDetails, String str) {
        this.f10653c = oe;
        this.f10651a = pluginErrorDetails;
        this.f10652b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ra) this.f10653c.f10755d.get()).getPluginExtension().reportError(this.f10651a, this.f10652b);
    }
}
