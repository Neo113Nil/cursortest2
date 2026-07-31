package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements C1.b {
    @Override // C1.b
    public final List a() {
        return S1.u.f4320d;
    }

    @Override // C1.b
    public final Object b(Context context) {
        f2.j.f(context, "context");
        C1.a c2 = C1.a.c(context);
        f2.j.e(c2, "getInstance(context)");
        if (!c2.f686b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0289s.f5236a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            f2.j.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        C c3 = C.f5138l;
        c3.getClass();
        c3.f5143h = new Handler();
        c3.f5144i.d(EnumC0285n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        f2.j.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new B(c3));
        return c3;
    }
}
