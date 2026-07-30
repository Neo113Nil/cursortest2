package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.e01;
import defpackage.h01;
import defpackage.i01;
import defpackage.iq1;
import defpackage.jq1;
import defpackage.m9;
import defpackage.p50;
import defpackage.u9;
import defpackage.yo0;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements yo0 {
    @Override // defpackage.yo0
    public final List PxuCJdSBwIXG() {
        return p50.rtx2ld2ELZv4;
    }

    @Override // defpackage.yo0
    public final Object lS5Rgt96tfkO(Context context) {
        context.getClass();
        m9 S9EYkSpbGuxq = m9.S9EYkSpbGuxq(context);
        S9EYkSpbGuxq.getClass();
        if (!((HashSet) S9EYkSpbGuxq.wdg6QnbFHrFF).contains(ProcessLifecycleInitializer.class)) {
            u9.rtx2ld2ELZv4("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!i01.PxuCJdSBwIXG.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new h01());
        }
        jq1.Companion.getClass();
        jq1 jq1Var = jq1.gPXPFXrUH4XX;
        jq1Var.getClass();
        jq1Var.x50lh2ztY7Y5 = new Handler();
        jq1Var.cpQdD2nAriOS.Y1f8riQaR6yg(e01.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new iq1(jq1Var));
        return jq1Var;
    }
}
