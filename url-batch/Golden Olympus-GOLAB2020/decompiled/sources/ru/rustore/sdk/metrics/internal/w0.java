package ru.rustore.sdk.metrics.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.MetricsClient;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f43775c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static w0 f43776d;

    /* renamed from: a, reason: collision with root package name */
    public final t0 f43777a;

    /* renamed from: b, reason: collision with root package name */
    public final MetricsClient f43778b;

    public static final class a {
        public final w0 a(Context context) {
            w0 w0Var;
            Intrinsics.checkNotNullParameter(context, "context");
            synchronized (this) {
                w0Var = w0.f43776d;
                if (w0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                    w0Var = new w0(applicationContext);
                    w0.f43776d = w0Var;
                }
            }
            return w0Var;
        }
    }

    public static final class b {
    }

    public w0(Context context) {
        y0 y0Var = new y0();
        b bVar = new b();
        x0 x0Var = new x0(context);
        n0 n0Var = new n0(new i0(new o(context, new b0(new w(), new x(), new z(new z0()), new a0())), bVar), new k0(new t(), new b1()), new l0(new t()), bVar);
        t0 t0Var = new t0(n0Var, new s0(n0Var, new r0(new a1(x0Var, new b1()), new c0(context), new o0(new s(new ru.rustore.sdk.metrics.internal.b(), new q0(), bVar)), new d1(context))));
        this.f43777a = t0Var;
        this.f43778b = new MetricsClient(new n(t0Var, new c(n0Var), new u0(context, new d(new f(new e()))), y0Var, bVar));
    }
}
