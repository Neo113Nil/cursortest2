package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.a52;
import defpackage.ah0;
import defpackage.b52;
import defpackage.bd1;
import defpackage.cd1;
import defpackage.g21;
import defpackage.lh;
import defpackage.mh;
import defpackage.yc1;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements g21 {
    @Override // defpackage.g21
    public final List a() {
        return ah0.m;
    }

    @Override // defpackage.g21
    public final Object b(Context context) {
        context.getClass();
        mh t = mh.t(context);
        t.getClass();
        if (!((HashSet) t.o).contains(ProcessLifecycleInitializer.class)) {
            lh.g("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!cd1.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new bd1());
        }
        b52 b52Var = b52.u;
        b52Var.getClass();
        b52Var.q = new Handler();
        b52Var.r.f(yc1.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new a52(b52Var));
        return b52Var;
    }
}
