package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.dd0;
import defpackage.gz0;
import defpackage.hz0;
import defpackage.i8;
import defpackage.l80;
import defpackage.ng0;
import defpackage.nv;
import defpackage.qg0;
import defpackage.rg0;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Ll80;", "Lvg0;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements l80 {
    @Override // defpackage.l80
    public final List a() {
        return nv.d;
    }

    @Override // defpackage.l80
    public final Object b(Context context) {
        context.getClass();
        i8 h = i8.h(context);
        h.getClass();
        if (!((HashSet) h.g).contains(ProcessLifecycleInitializer.class)) {
            dd0.j("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!rg0.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new qg0());
        }
        hz0 hz0Var = hz0.l;
        hz0Var.getClass();
        hz0Var.i = new Handler();
        hz0Var.j.d(ng0.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new gz0(hz0Var));
        return hz0Var;
    }
}
