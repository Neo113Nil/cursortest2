package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import j0.C0145a;
import j0.InterfaceC0146b;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0146b {
    @Override // j0.InterfaceC0146b
    public final List a() {
        return S0.p.f795a;
    }

    @Override // j0.InterfaceC0146b
    public final Object b(Context context) {
        d1.d.e(context, "context");
        C0145a c2 = C0145a.c(context);
        d1.d.d(c2, "getInstance(context)");
        if (!c2.f2596b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0074o.f1485a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            d1.d.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0073n());
        }
        A a2 = A.i;
        a2.getClass();
        a2.f1452e = new Handler();
        a2.f1453f.d(EnumC0071l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        d1.d.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new z(a2));
        return a2;
    }
}
