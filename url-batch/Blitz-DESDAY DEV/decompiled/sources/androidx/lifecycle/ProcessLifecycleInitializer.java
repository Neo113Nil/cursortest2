package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import k0.C0171a;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements k0.b {
    @Override // k0.b
    public final List a() {
        return X0.s.f992a;
    }

    @Override // k0.b
    public final Object b(Context context) {
        g1.d.e(context, "context");
        C0171a c2 = C0171a.c(context);
        g1.d.d(c2, "getInstance(context)");
        if (!c2.f2836b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0072o.f1573a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            g1.d.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0071n());
        }
        A a2 = A.i;
        a2.getClass();
        a2.f1540e = new Handler();
        a2.f1541f.d(EnumC0069l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        g1.d.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new z(a2));
        return a2;
    }
}
