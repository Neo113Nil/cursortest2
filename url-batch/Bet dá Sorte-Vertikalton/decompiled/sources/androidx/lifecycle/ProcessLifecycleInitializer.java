package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import i0.C0136a;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements i0.b {
    @Override // i0.b
    public final List a() {
        return T0.q.f844a;
    }

    @Override // i0.b
    public final Object b(Context context) {
        b1.d.e(context, "context");
        C0136a c2 = C0136a.c(context);
        b1.d.d(c2, "getInstance(context)");
        if (!c2.f2497b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0074o.f1443a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            b1.d.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0073n());
        }
        A a2 = A.i;
        a2.getClass();
        a2.f1410e = new Handler();
        a2.f1411f.d(EnumC0071l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        b1.d.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new z(a2));
        return a2;
    }
}
