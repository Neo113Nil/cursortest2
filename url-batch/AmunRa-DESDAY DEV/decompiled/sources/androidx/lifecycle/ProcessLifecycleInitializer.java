package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import i0.C0136a;
import i0.InterfaceC0137b;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0137b {
    @Override // i0.InterfaceC0137b
    public final List a() {
        return R0.q.f712a;
    }

    @Override // i0.InterfaceC0137b
    public final Object b(Context context) {
        Z0.d.e(context, "context");
        C0136a c2 = C0136a.c(context);
        Z0.d.d(c2, "getInstance(context)");
        if (!c2.f2465b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0073o.f1401a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Z0.d.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0072n());
        }
        A a2 = A.i;
        a2.getClass();
        a2.f1368e = new Handler();
        a2.f1369f.d(EnumC0070l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Z0.d.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new z(a2));
        return a2;
    }
}
