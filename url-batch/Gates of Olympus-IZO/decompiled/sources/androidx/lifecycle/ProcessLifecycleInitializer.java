package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import y1.C1063a;
import y1.InterfaceC1064b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1064b {
    @Override // y1.InterfaceC1064b
    public final List a() {
        return M1.u.f2803d;
    }

    @Override // y1.InterfaceC1064b
    public final Object b(Context context) {
        Z1.i.f(context, "context");
        C1063a c3 = C1063a.c(context);
        Z1.i.e(c3, "getInstance(context)");
        if (!c3.f8829b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0233s.f4035a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Z1.i.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        C c4 = C.f3937l;
        c4.getClass();
        c4.f3942h = new Handler();
        c4.f3943i.d(EnumC0229n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Z1.i.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new B(c4));
        return c4;
    }
}
