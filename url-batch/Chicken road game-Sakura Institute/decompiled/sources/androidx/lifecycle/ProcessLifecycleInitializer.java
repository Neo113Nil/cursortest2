package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements b4.b {
    @Override // b4.b
    public final List a() {
        return e6.u.f2826f;
    }

    @Override // b4.b
    public final Object b(Context context) {
        r6.k.f(context, "context");
        b4.a c4 = b4.a.c(context);
        r6.k.e(c4, "getInstance(context)");
        if (!c4.f1386b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!s.f1027a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            r6.k.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        f0 f0Var = f0.f963n;
        f0Var.getClass();
        f0Var.f968j = new Handler();
        f0Var.f969k.d(n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        r6.k.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new e0(f0Var));
        return f0Var;
    }
}
