package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import l5.C0512p;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements X.b {
    @Override // X.b
    public final Object create(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        X.a c7 = X.a.c(context);
        kotlin.jvm.internal.i.d(c7, "getInstance(context)");
        if (!c7.f2858b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0251s.f3522a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        E e4 = E.f3455n;
        e4.getClass();
        e4.f3460j = new Handler();
        e4.f3461k.e(EnumC0246m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new D(e4));
        return e4;
    }

    @Override // X.b
    public final List dependencies() {
        return C0512p.f5303f;
    }
}
