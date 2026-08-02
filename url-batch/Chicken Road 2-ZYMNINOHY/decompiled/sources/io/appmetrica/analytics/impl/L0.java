package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f10551a = C0501b4.l().g().a();

    /* renamed from: b, reason: collision with root package name */
    public final C1118z0 f10552b;

    /* renamed from: c, reason: collision with root package name */
    public final Qe f10553c;

    /* renamed from: d, reason: collision with root package name */
    public final Te f10554d;

    public L0() {
        C1118z0 c1118z0 = new C1118z0();
        this.f10552b = c1118z0;
        this.f10553c = new Qe(c1118z0);
        this.f10554d = new Te();
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        Qe qe = this.f10553c;
        qe.f10840a.a(null);
        qe.f10841b.a(pluginErrorDetails);
        Te te = this.f10554d;
        kotlin.jvm.internal.i.b(pluginErrorDetails);
        te.getClass();
        this.f10551a.execute(new g0.p(this, 3, pluginErrorDetails));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        Qe qe = this.f10553c;
        qe.f10840a.a(null);
        qe.f10841b.a(pluginErrorDetails);
        if (qe.f10843d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f12630a) {
            Te te = this.f10554d;
            kotlin.jvm.internal.i.b(pluginErrorDetails);
            te.getClass();
            this.f10551a.execute(new Q1.a(this, pluginErrorDetails, str, 11));
        }
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Qe qe = this.f10553c;
        qe.f10840a.a(null);
        qe.f10842c.a(str);
        Te te = this.f10554d;
        kotlin.jvm.internal.i.b(str);
        te.getClass();
        this.f10551a.execute(new Ko(this, str, str2, pluginErrorDetails, 1));
    }

    public static final void a(L0 l02, PluginErrorDetails pluginErrorDetails, String str) {
        l02.f10552b.getClass();
        C1092y0 c1092y0 = C1092y0.f13042e;
        kotlin.jvm.internal.i.b(c1092y0);
        C0715jc i4 = c1092y0.f().i();
        kotlin.jvm.internal.i.b(i4);
        i4.f12127a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(L0 l02, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        l02.f10552b.getClass();
        C1092y0 c1092y0 = C1092y0.f13042e;
        kotlin.jvm.internal.i.b(c1092y0);
        C0715jc i4 = c1092y0.f().i();
        kotlin.jvm.internal.i.b(i4);
        i4.f12127a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(L0 l02, PluginErrorDetails pluginErrorDetails) {
        l02.f10552b.getClass();
        C1092y0 c1092y0 = C1092y0.f13042e;
        kotlin.jvm.internal.i.b(c1092y0);
        C0715jc i4 = c1092y0.f().i();
        kotlin.jvm.internal.i.b(i4);
        i4.f12127a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
