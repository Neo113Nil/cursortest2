package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2519bf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f38728c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2546cf f38729d;

    public RunnableC2519bf(C2546cf c2546cf, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f38729d = c2546cf;
        this.f38726a = str;
        this.f38727b = str2;
        this.f38728c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC2804mb) this.f38729d.f38777d.get()).getPluginExtension().reportError(this.f38726a, this.f38727b, this.f38728c);
    }
}
