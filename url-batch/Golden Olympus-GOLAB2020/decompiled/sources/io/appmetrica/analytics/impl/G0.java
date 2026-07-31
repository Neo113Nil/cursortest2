package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f37547a = C3082x4.l().g().a();

    /* renamed from: b, reason: collision with root package name */
    public final C3000u0 f37548b;

    /* renamed from: c, reason: collision with root package name */
    public final C2599ef f37549c;

    /* renamed from: d, reason: collision with root package name */
    public final C2679hf f37550d;

    public G0() {
        C3000u0 c3000u0 = new C3000u0();
        this.f37548b = c3000u0;
        this.f37549c = new C2599ef(c3000u0);
        this.f37550d = new C2679hf();
    }

    public final void a(final PluginErrorDetails pluginErrorDetails) {
        C2599ef c2599ef = this.f37549c;
        c2599ef.f38926a.a(null);
        c2599ef.f38927b.a(pluginErrorDetails);
        C2679hf c2679hf = this.f37550d;
        Intrinsics.checkNotNull(pluginErrorDetails);
        c2679hf.getClass();
        this.f37547a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Jo
            @Override // java.lang.Runnable
            public final void run() {
                G0.a(G0.this, pluginErrorDetails);
            }
        });
    }

    public final void a(final PluginErrorDetails pluginErrorDetails, final String str) {
        C2599ef c2599ef = this.f37549c;
        c2599ef.f38926a.a(null);
        c2599ef.f38927b.a(pluginErrorDetails);
        if (c2599ef.f38929d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f39527a) {
            C2679hf c2679hf = this.f37550d;
            Intrinsics.checkNotNull(pluginErrorDetails);
            c2679hf.getClass();
            this.f37547a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Io
                @Override // java.lang.Runnable
                public final void run() {
                    G0.a(G0.this, pluginErrorDetails, str);
                }
            });
        }
    }

    public final void a(final String str, final String str2, final PluginErrorDetails pluginErrorDetails) {
        C2599ef c2599ef = this.f37549c;
        c2599ef.f38926a.a(null);
        c2599ef.f38928c.a(str);
        C2679hf c2679hf = this.f37550d;
        Intrinsics.checkNotNull(str);
        c2679hf.getClass();
        this.f37547a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Ko
            @Override // java.lang.Runnable
            public final void run() {
                G0.a(G0.this, str, str2, pluginErrorDetails);
            }
        });
    }

    public static final void a(G0 g02, PluginErrorDetails pluginErrorDetails, String str) {
        g02.f37548b.getClass();
        C2974t0 c2974t0 = C2974t0.f39820e;
        Intrinsics.checkNotNull(c2974t0);
        Ec i4 = c2974t0.f().i();
        Intrinsics.checkNotNull(i4);
        i4.f37439a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(G0 g02, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        g02.f37548b.getClass();
        C2974t0 c2974t0 = C2974t0.f39820e;
        Intrinsics.checkNotNull(c2974t0);
        Ec i4 = c2974t0.f().i();
        Intrinsics.checkNotNull(i4);
        i4.f37439a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(G0 g02, PluginErrorDetails pluginErrorDetails) {
        g02.f37548b.getClass();
        C2974t0 c2974t0 = C2974t0.f39820e;
        Intrinsics.checkNotNull(c2974t0);
        Ec i4 = c2974t0.f().i();
        Intrinsics.checkNotNull(i4);
        i4.f37439a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
