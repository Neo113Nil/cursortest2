package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import i0.C0137a;
import i0.InterfaceC0138b;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0138b {
    @Override // i0.InterfaceC0138b
    public final List a() {
        return W0.q.f896a;
    }

    @Override // i0.InterfaceC0138b
    public final Object b(Context context) {
        e1.d.e(context, "context");
        C0137a c2 = C0137a.c(context);
        e1.d.d(c2, "getInstance(context)");
        if (!c2.f2516b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0072o.f1471a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            e1.d.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0071n());
        }
        A a2 = A.i;
        a2.getClass();
        a2.f1438e = new Handler();
        a2.f1439f.d(EnumC0069l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        e1.d.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new z(a2));
        return a2;
    }
}
