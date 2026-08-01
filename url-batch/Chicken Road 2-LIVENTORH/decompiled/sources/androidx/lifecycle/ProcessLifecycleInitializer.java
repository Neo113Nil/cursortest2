package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements h1.b {
    @Override // h1.b
    public final List a() {
        return a3.m.f113f;
    }

    @Override // h1.b
    public final Object b(Context context) {
        f3.d.e(context, "context");
        h1.a c4 = h1.a.c(context);
        f3.d.d(c4, "getInstance(context)");
        if (!c4.f1802b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!o.f624a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            f3.d.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
        }
        b0 b0Var = b0.f592n;
        b0Var.getClass();
        b0Var.f596j = new Handler();
        b0Var.f597k.d(l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        f3.d.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new a0(b0Var));
        return b0Var;
    }
}
