package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import n.C0081a;
import n.InterfaceC0082b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0082b {
    @Override // n.InterfaceC0082b
    public final List a() {
        return V.m.f441b;
    }

    @Override // n.InterfaceC0082b
    public final Object b(Context context) {
        e0.h.e(context, "context");
        C0081a c2 = C0081a.c(context);
        e0.h.d(c2, "getInstance(context)");
        if (!c2.f1080b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!h.f490a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            e0.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new g());
        }
        n nVar = n.f497i;
        nVar.getClass();
        nVar.f502e = new Handler();
        nVar.f503f.a(d.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        e0.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new m(nVar));
        return nVar;
    }
}
