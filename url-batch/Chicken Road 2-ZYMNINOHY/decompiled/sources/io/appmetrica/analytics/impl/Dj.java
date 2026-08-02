package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Dj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f10206c;

    public Dj(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f10204a = str;
        this.f10205b = str2;
        this.f10206c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.getPluginExtension().reportError(this.f10204a, this.f10205b, this.f10206c);
    }
}
