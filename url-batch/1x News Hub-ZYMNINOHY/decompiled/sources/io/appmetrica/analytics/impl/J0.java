package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f6189a = C0585j4.l().g().a();

    /* renamed from: b, reason: collision with root package name */
    public final C0944x0 f6190b;

    /* renamed from: c, reason: collision with root package name */
    public final Ve f6191c;

    /* renamed from: d, reason: collision with root package name */
    public final Ye f6192d;

    public J0() {
        C0944x0 c0944x0 = new C0944x0();
        this.f6190b = c0944x0;
        this.f6191c = new Ve(c0944x0);
        this.f6192d = new Ye();
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        Ve ve = this.f6191c;
        ve.f6795a.a(null);
        ve.f6796b.a(pluginErrorDetails);
        Ye ye = this.f6192d;
        kotlin.jvm.internal.j.b(pluginErrorDetails);
        ye.getClass();
        this.f6189a.execute(new A1.a(this, 14, pluginErrorDetails));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        Ve ve = this.f6191c;
        ve.f6795a.a(null);
        ve.f6796b.a(pluginErrorDetails);
        if (ve.f6798d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f8327a) {
            Ye ye = this.f6192d;
            kotlin.jvm.internal.j.b(pluginErrorDetails);
            ye.getClass();
            this.f6189a.execute(new A0.a(this, pluginErrorDetails, str, 8));
        }
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Ve ve = this.f6191c;
        ve.f6795a.a(null);
        ve.f6797c.a(str);
        Ye ye = this.f6192d;
        kotlin.jvm.internal.j.b(str);
        ye.getClass();
        this.f6189a.execute(new Y1.X(this, str, str2, pluginErrorDetails, 5));
    }

    public static final void a(J0 j02, PluginErrorDetails pluginErrorDetails, String str) {
        j02.f6190b.getClass();
        C0918w0 c0918w0 = C0918w0.f8537e;
        kotlin.jvm.internal.j.b(c0918w0);
        C0775qc i3 = c0918w0.f().i();
        kotlin.jvm.internal.j.b(i3);
        i3.f8159a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(J0 j02, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        j02.f6190b.getClass();
        C0918w0 c0918w0 = C0918w0.f8537e;
        kotlin.jvm.internal.j.b(c0918w0);
        C0775qc i3 = c0918w0.f().i();
        kotlin.jvm.internal.j.b(i3);
        i3.f8159a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(J0 j02, PluginErrorDetails pluginErrorDetails) {
        j02.f6190b.getClass();
        C0918w0 c0918w0 = C0918w0.f8537e;
        kotlin.jvm.internal.j.b(c0918w0);
        C0775qc i3 = c0918w0.f().i();
        kotlin.jvm.internal.j.b(i3);
        i3.f8159a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
