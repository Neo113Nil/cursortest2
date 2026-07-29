package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzde;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@VisibleForTesting
/* loaded from: classes.dex */
public final class GoogleAnalytics extends com.google.android.gms.analytics.zza {
    private static List<Runnable> zzqv = new ArrayList();
    private boolean zzqw;
    private Set<zza> zzqx;
    private boolean zzqy;
    private boolean zzqz;
    private volatile boolean zzra;
    private boolean zzrb;

    interface zza {
        void zzc(Activity activity);

        void zzd(Activity activity);
    }

    @TargetApi(14)
    class zzb implements Application.ActivityLifecycleCallbacks {
        zzb() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            GoogleAnalytics.this.zza(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            GoogleAnalytics.this.zzb(activity);
        }
    }

    @VisibleForTesting
    public GoogleAnalytics(zzat zzatVar) {
        super(zzatVar);
        this.zzqx = new HashSet();
    }

    public static GoogleAnalytics getInstance(Context context) {
        return zzat.zzc(context).zzck();
    }

    public static void zzn() {
        synchronized (GoogleAnalytics.class) {
            if (zzqv != null) {
                Iterator<Runnable> it = zzqv.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                zzqv = null;
            }
        }
    }

    public final void dispatchLocalHits() {
        zzh().zzby().zzbo();
    }

    @TargetApi(14)
    public final void enableAutoActivityReports(Application application) {
        if (this.zzqy) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new zzb());
        this.zzqy = true;
    }

    public final boolean getAppOptOut() {
        return this.zzra;
    }

    @Deprecated
    public final Logger getLogger() {
        return zzcl.getLogger();
    }

    public final boolean isDryRunEnabled() {
        return this.zzqz;
    }

    public final boolean isInitialized() {
        return this.zzqw;
    }

    public final Tracker newTracker(int i) {
        Tracker tracker;
        zzdc zzo;
        synchronized (this) {
            tracker = new Tracker(zzh(), null, null);
            if (i > 0 && (zzo = new zzda(zzh()).zzo(i)) != null) {
                tracker.zza(zzo);
            }
            tracker.zzm();
        }
        return tracker;
    }

    public final Tracker newTracker(String str) {
        Tracker tracker;
        synchronized (this) {
            tracker = new Tracker(zzh(), str, null);
            tracker.zzm();
        }
        return tracker;
    }

    public final void reportActivityStart(Activity activity) {
        if (this.zzqy) {
            return;
        }
        zza(activity);
    }

    public final void reportActivityStop(Activity activity) {
        if (this.zzqy) {
            return;
        }
        zzb(activity);
    }

    public final void setAppOptOut(boolean z) {
        this.zzra = z;
        if (this.zzra) {
            zzh().zzby().zzbn();
        }
    }

    public final void setDryRun(boolean z) {
        this.zzqz = z;
    }

    public final void setLocalDispatchPeriod(int i) {
        zzh().zzby().setLocalDispatchPeriod(i);
    }

    @Deprecated
    public final void setLogger(Logger logger) {
        zzcl.setLogger(logger);
        if (this.zzrb) {
            return;
        }
        String str = zzcc.zzyh.get();
        String str2 = zzcc.zzyh.get();
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 112);
        sb.append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
        sb.append(str2);
        sb.append(" DEBUG");
        Log.i(str, sb.toString());
        this.zzrb = true;
    }

    @VisibleForTesting
    final void zza(Activity activity) {
        Iterator<zza> it = this.zzqx.iterator();
        while (it.hasNext()) {
            it.next().zzc(activity);
        }
    }

    final void zza(zza zzaVar) {
        this.zzqx.add(zzaVar);
        Context context = zzh().getContext();
        if (context instanceof Application) {
            enableAutoActivityReports((Application) context);
        }
    }

    @VisibleForTesting
    final void zzb(Activity activity) {
        Iterator<zza> it = this.zzqx.iterator();
        while (it.hasNext()) {
            it.next().zzd(activity);
        }
    }

    final void zzb(zza zzaVar) {
        this.zzqx.remove(zzaVar);
    }

    public final void zzm() {
        zzde zzca = zzh().zzca();
        zzca.zzfm();
        if (zzca.zzfn()) {
            setDryRun(zzca.zzfo());
        }
        zzca.zzfm();
        this.zzqw = true;
    }
}
