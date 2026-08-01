package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import j0.C0147a;
import j0.InterfaceC0148b;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0148b {
    @Override // j0.InterfaceC0148b
    public final List a() {
        return V0.p.f917a;
    }

    @Override // j0.InterfaceC0148b
    public final Object b(Context context) {
        g1.d.e(context, "context");
        C0147a c2 = C0147a.c(context);
        g1.d.d(c2, "getInstance(context)");
        if (!c2.f2634b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0075o.f1516a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            g1.d.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0074n());
        }
        A a2 = A.i;
        a2.getClass();
        a2.f1483e = new Handler();
        a2.f1484f.d(EnumC0072l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        g1.d.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new z(a2));
        return a2;
    }
}
