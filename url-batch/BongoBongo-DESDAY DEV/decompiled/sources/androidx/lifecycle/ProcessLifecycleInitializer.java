package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import k0.C0150a;
import k0.InterfaceC0151b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0151b {
    @Override // k0.InterfaceC0151b
    public final List a() {
        return W0.p.f959a;
    }

    @Override // k0.InterfaceC0151b
    public final Object b(Context context) {
        h1.d.e(context, "context");
        C0150a c2 = C0150a.c(context);
        h1.d.d(c2, "getInstance(context)");
        if (!c2.f2733b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0081o.f1577a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            h1.d.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0080n());
        }
        A a2 = A.i;
        a2.getClass();
        a2.f1543e = new Handler();
        a2.f1544f.d(EnumC0078l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        h1.d.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new z(a2));
        return a2;
    }
}
