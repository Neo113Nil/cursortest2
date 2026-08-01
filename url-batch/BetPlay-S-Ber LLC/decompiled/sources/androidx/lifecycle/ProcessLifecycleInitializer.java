package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.fp;
import defpackage.gq;
import defpackage.jq;
import defpackage.kq;
import defpackage.o8;
import defpackage.r6;
import defpackage.sx;
import defpackage.ux;
import defpackage.vh;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements fp {
    @Override // defpackage.fp
    public final List a() {
        return vh.f;
    }

    @Override // defpackage.fp
    public final Object b(Context context) {
        context.getClass();
        r6 n = r6.n(context);
        n.getClass();
        if (!((HashSet) n.c).contains(ProcessLifecycleInitializer.class)) {
            o8.t("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!kq.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new jq());
        }
        ux uxVar = ux.n;
        uxVar.getClass();
        uxVar.j = new Handler();
        uxVar.k.e(gq.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new sx(uxVar));
        return uxVar;
    }
}
