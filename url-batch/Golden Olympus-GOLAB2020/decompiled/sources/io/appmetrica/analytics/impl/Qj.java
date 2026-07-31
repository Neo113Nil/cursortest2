package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class Qj implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f38175c;

    public Qj(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f38173a = str;
        this.f38174b = str2;
        this.f38175c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.getPluginExtension().reportError(this.f38173a, this.f38174b, this.f38175c);
    }
}
