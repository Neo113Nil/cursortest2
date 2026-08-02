package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Ne implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f10714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Oe f10715d;

    public Ne(Oe oe, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f10715d = oe;
        this.f10712a = str;
        this.f10713b = str2;
        this.f10714c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ra) this.f10715d.f10755d.get()).getPluginExtension().reportError(this.f10712a, this.f10713b, this.f10714c);
    }
}
