package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements i1.b {
    @Override // i1.b
    public final List a() {
        return x2.q.f3887f;
    }

    @Override // i1.b
    public final Object b(Context context) {
        i3.d.e(context, "context");
        i1.a c5 = i1.a.c(context);
        i3.d.d(c5, "getInstance(context)");
        if (!c5.f1999b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!o.f728a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            i3.d.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
        }
        b0 b0Var = b0.f697n;
        b0Var.getClass();
        b0Var.f700j = new Handler();
        b0Var.f701k.d(l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        i3.d.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new a0(b0Var));
        return b0Var;
    }
}
