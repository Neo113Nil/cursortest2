package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.bv;
import defpackage.fx;
import defpackage.hx;
import defpackage.ix;
import defpackage.l60;
import defpackage.m60;
import defpackage.s6;
import defpackage.s9;
import defpackage.wm;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements bv {
    @Override // defpackage.bv
    public final List a() {
        return wm.f;
    }

    @Override // defpackage.bv
    public final Object b(Context context) {
        context.getClass();
        s6 m = s6.m(context);
        m.getClass();
        if (!((HashSet) m.c).contains(ProcessLifecycleInitializer.class)) {
            s9.u("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!ix.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new hx());
        }
        m60 m60Var = m60.n;
        m60Var.getClass();
        m60Var.j = new Handler();
        m60Var.k.d(fx.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new l60(m60Var));
        return m60Var;
    }
}
