package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Re implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f6552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Te f6554c;

    public Re(Te te, PluginErrorDetails pluginErrorDetails, String str) {
        this.f6554c = te;
        this.f6552a = pluginErrorDetails;
        this.f6553b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ya) this.f6554c.f6711d.get()).getPluginExtension().reportError(this.f6552a, this.f6553b);
    }
}
