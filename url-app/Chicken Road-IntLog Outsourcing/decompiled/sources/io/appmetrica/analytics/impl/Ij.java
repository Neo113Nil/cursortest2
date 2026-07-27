package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Ij implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f6964c;

    public Ij(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f6962a = str;
        this.f6963b = str2;
        this.f6964c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.getPluginExtension().reportError(this.f6962a, this.f6963b, this.f6964c);
    }
}
