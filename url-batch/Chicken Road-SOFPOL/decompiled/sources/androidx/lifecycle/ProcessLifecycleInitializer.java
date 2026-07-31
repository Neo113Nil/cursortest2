package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements a5.b {
    @Override // a5.b
    public final List a() {
        return d6.u.f2326d;
    }

    @Override // a5.b
    public final Object b(Context context) {
        q6.i.e(context, "context");
        a5.a c8 = a5.a.c(context);
        q6.i.d(c8, "getInstance(...)");
        if (!c8.f235b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!r.f859a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            q6.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new q());
        }
        d0 d0Var = d0.f815l;
        d0Var.getClass();
        d0Var.f820h = new Handler();
        d0Var.i.d(o.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        q6.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new c0(d0Var));
        return d0Var;
    }
}
