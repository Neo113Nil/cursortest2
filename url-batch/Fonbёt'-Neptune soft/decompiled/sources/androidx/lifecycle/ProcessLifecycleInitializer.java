package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements Q.b {
    @Override // Q.b
    public final List a() {
        return G0.l.f490e;
    }

    @Override // Q.b
    public final Object b(Context context) {
        Q0.h.e(context, "context");
        Q.a c2 = Q.a.c(context);
        Q0.h.d(c2, "getInstance(context)");
        if (!c2.f960b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!j.f1773a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Q0.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new i());
        }
        r rVar = r.f1786m;
        rVar.getClass();
        rVar.f1791i = new Handler();
        rVar.f1792j.c(f.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Q0.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new q(rVar));
        return rVar;
    }
}
