package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import i0.C0135a;
import i0.InterfaceC0136b;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0136b {
    @Override // i0.InterfaceC0136b
    public final List a() {
        return Q0.m.f664a;
    }

    @Override // i0.InterfaceC0136b
    public final Object b(Context context) {
        X0.e.e(context, "context");
        C0135a c2 = C0135a.c(context);
        X0.e.d(c2, "getInstance(context)");
        if (!c2.f2378b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0071o.f1362a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            X0.e.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0070n());
        }
        A a2 = A.i;
        a2.getClass();
        a2.f1329e = new Handler();
        a2.f1330f.d(EnumC0068l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        X0.e.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new z(a2));
        return a2;
    }
}
