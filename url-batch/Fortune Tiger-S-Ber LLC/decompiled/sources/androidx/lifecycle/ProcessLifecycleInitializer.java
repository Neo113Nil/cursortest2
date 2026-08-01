package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements d1.b {
    @Override // d1.b
    public final List a() {
        return n2.o.f2953f;
    }

    @Override // d1.b
    public final Object b(Context context) {
        u2.c.e(context, "context");
        d1.a c = d1.a.c(context);
        u2.c.d(c, "getInstance(context)");
        if (!c.f1469b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!o.f596a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            u2.c.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
        }
        b0 b0Var = b0.f570n;
        b0Var.getClass();
        b0Var.f573j = new Handler();
        b0Var.f574k.d(l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        u2.c.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new a0(b0Var));
        return b0Var;
    }
}
