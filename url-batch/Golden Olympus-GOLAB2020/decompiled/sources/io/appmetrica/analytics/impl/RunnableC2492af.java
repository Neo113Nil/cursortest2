package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2492af implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f38675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2546cf f38677c;

    public RunnableC2492af(C2546cf c2546cf, PluginErrorDetails pluginErrorDetails, String str) {
        this.f38677c = c2546cf;
        this.f38675a = pluginErrorDetails;
        this.f38676b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2804mb) this.f38677c.f38777d.get()).getPluginExtension().reportError(this.f38675a, this.f38676b);
    }
}
