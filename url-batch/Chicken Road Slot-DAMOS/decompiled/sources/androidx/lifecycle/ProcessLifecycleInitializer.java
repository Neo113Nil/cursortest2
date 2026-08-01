package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Ln5/b;", "Landroidx/lifecycle/u;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements n5.b {
    @Override // n5.b
    public final List a() {
        return kotlin.collections.j0.f5574d;
    }

    @Override // n5.b
    public final Object b(Context context) {
        context.getClass();
        n5.a c10 = n5.a.c(context);
        c10.getClass();
        if (!c10.f7145b.contains(ProcessLifecycleInitializer.class)) {
            kotlin.collections.i0.l("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!r.f718a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new q());
        }
        g0 g0Var = g0.f683w;
        g0Var.getClass();
        g0Var.f688s = new Handler();
        g0Var.f689t.d(o.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new f0(g0Var));
        return g0Var;
    }
}
