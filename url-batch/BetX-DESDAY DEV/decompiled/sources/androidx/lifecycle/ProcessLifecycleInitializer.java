package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import h0.C0165a;
import h0.InterfaceC0166b;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0166b {
    @Override // h0.InterfaceC0166b
    public final List a() {
        return O0.q.f695a;
    }

    @Override // h0.InterfaceC0166b
    public final Object b(Context context) {
        X0.f.e(context, "context");
        C0165a c2 = C0165a.c(context);
        X0.f.d(c2, "getInstance(context)");
        if (!c2.f2625b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0084q.f1495a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            X0.f.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0083p());
        }
        C c3 = C.i;
        c3.getClass();
        c3.f1440e = new Handler();
        c3.f1441f.e(EnumC0080m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        X0.f.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new B(c3));
        return c3;
    }
}
