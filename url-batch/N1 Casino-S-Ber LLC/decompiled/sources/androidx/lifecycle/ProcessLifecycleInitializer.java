package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.a6;
import defpackage.di;
import defpackage.fx;
import defpackage.gx;
import defpackage.qo;
import defpackage.t8;
import defpackage.up;
import defpackage.wp;
import defpackage.xp;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements qo {
    @Override // defpackage.qo
    public final List a() {
        return di.f;
    }

    @Override // defpackage.qo
    public final Object b(Context context) {
        context.getClass();
        a6 n = a6.n(context);
        n.getClass();
        if (!((HashSet) n.c).contains(ProcessLifecycleInitializer.class)) {
            t8.t("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!xp.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new wp());
        }
        gx gxVar = gx.n;
        gxVar.getClass();
        gxVar.j = new Handler();
        gxVar.k.d(up.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new fx(gxVar));
        return gxVar;
    }
}
