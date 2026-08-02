package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Hj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f6090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6091b;

    public Hj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f6090a = pluginErrorDetails;
        this.f6091b = str;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.getPluginExtension().reportError(this.f6090a, this.f6091b);
    }
}
