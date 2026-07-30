package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements p.b {
    @Override // p.b
    public final List a() {
        return u0.l.f1186b;
    }

    @Override // p.b
    public final Object b(Context context) {
        context.getClass();
        p.a c2 = p.a.c(context);
        c2.getClass();
        if (!c2.f1031b.contains(ProcessLifecycleInitializer.class)) {
            f0.l.b("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!h.f30a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new g());
        }
        o oVar = o.f41i;
        oVar.getClass();
        oVar.f46e = new Handler();
        oVar.f47f.a(d.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new m(oVar));
        return oVar;
    }
}
