package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Se implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f6643c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Te f6644d;

    public Se(Te te, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f6644d = te;
        this.f6641a = str;
        this.f6642b = str2;
        this.f6643c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ya) this.f6644d.f6711d.get()).getPluginExtension().reportError(this.f6641a, this.f6642b, this.f6643c);
    }
}
