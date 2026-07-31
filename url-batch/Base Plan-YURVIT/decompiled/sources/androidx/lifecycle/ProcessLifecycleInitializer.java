package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements O.b {
    @Override // O.b
    public final List a() {
        return E0.o.f219e;
    }

    @Override // O.b
    public final Object b(Context context) {
        P0.h.e(context, "context");
        O.a c2 = O.a.c(context);
        P0.h.d(c2, "getInstance(context)");
        if (!c2.f786b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!h.f1611a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            P0.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new g());
        }
        n nVar = n.f1620m;
        nVar.getClass();
        nVar.f1625i = new Handler();
        nVar.f1626j.a(d.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        P0.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new m(nVar));
        return nVar;
    }
}
