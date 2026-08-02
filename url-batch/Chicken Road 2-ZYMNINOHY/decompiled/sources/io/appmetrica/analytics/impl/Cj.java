package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Cj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f10167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10168b;

    public Cj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f10167a = pluginErrorDetails;
        this.f10168b = str;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.getPluginExtension().reportError(this.f10167a, this.f10168b);
    }
}
