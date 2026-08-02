package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Ij implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f6164c;

    public Ij(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f6162a = str;
        this.f6163b = str2;
        this.f6164c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.getPluginExtension().reportError(this.f6162a, this.f6163b, this.f6164c);
    }
}
