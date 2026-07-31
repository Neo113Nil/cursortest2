package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class Dj implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f814a;
    public final /* synthetic */ String b;

    public Dj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f814a = pluginErrorDetails;
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa) {
        sa.getPluginExtension().reportError(this.f814a, this.b);
    }
}
