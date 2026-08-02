package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements W.b {
    @Override // W.b
    public final List a() {
        return c2.m.f2637a;
    }

    @Override // W.b
    public final Object create(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        W.a c3 = W.a.c(context);
        kotlin.jvm.internal.j.d(c3, "getInstance(context)");
        if (!c3.f1614b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!k.f2384a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new j());
        }
        t tVar = t.f2400i;
        tVar.getClass();
        tVar.f2405e = new Handler();
        tVar.f.e(EnumC0165g.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.j.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new s(tVar));
        return tVar;
    }
}
