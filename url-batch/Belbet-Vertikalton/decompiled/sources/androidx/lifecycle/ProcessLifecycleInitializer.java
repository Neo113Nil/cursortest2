package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import n0.C0314a;
import n0.InterfaceC0315b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0315b {
    @Override // n0.InterfaceC0315b
    public final List a() {
        return X0.t.f1385a;
    }

    @Override // n0.InterfaceC0315b
    public final Object b(Context context) {
        j1.h.e(context, "context");
        C0314a c2 = C0314a.c(context);
        j1.h.d(c2, "getInstance(context)");
        if (!c2.f3753b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0082q.f1943a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            j1.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0081p());
        }
        C c3 = C.i;
        c3.getClass();
        c3.e = new Handler();
        c3.f1904f.d(EnumC0077l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        j1.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new B(c3));
        return c3;
    }
}
