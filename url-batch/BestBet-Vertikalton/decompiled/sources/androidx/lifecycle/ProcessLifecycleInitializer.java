package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import n0.C0292a;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements n0.b {
    @Override // n0.b
    public final List a() {
        return Y0.s.f1516a;
    }

    @Override // n0.b
    public final Object b(Context context) {
        k1.e.e(context, "context");
        C0292a c2 = C0292a.c(context);
        k1.e.d(c2, "getInstance(context)");
        if (!c2.f3556b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0076q.f1893a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            k1.e.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0075p());
        }
        C c3 = C.i;
        c3.getClass();
        c3.f1856e = new Handler();
        c3.f1857f.d(EnumC0071l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        k1.e.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new B(c3));
        return c3;
    }
}
