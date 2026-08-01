package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.br;
import defpackage.g9;
import defpackage.gs;
import defpackage.i00;
import defpackage.ik;
import defpackage.is;
import defpackage.j00;
import defpackage.js;
import defpackage.k6;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements br {
    @Override // defpackage.br
    public final List a() {
        return ik.f;
    }

    @Override // defpackage.br
    public final Object b(Context context) {
        context.getClass();
        k6 r = k6.r(context);
        r.getClass();
        if (!((HashSet) r.h).contains(ProcessLifecycleInitializer.class)) {
            g9.s("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!js.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new is());
        }
        j00 j00Var = j00.n;
        j00Var.getClass();
        j00Var.j = new Handler();
        j00Var.k.d(gs.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new i00(j00Var));
        return j00Var;
    }
}
