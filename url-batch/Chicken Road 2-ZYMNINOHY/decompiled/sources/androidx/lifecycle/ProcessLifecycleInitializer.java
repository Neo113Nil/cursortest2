package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import n1.C1318a;
import n1.InterfaceC1319b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1319b {
    @Override // n1.InterfaceC1319b
    public final List a() {
        return d3.q.f8333a;
    }

    @Override // n1.InterfaceC1319b
    public final Object create(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        C1318a c4 = C1318a.c(context);
        kotlin.jvm.internal.i.d(c4, "getInstance(context)");
        if (!c4.f14585b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0233l.f5047a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0232k());
        }
        w wVar = w.f5074i;
        wVar.getClass();
        wVar.f5079e = new Handler();
        wVar.f5080f.e(EnumC0229h.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new v(wVar));
        return wVar;
    }
}
