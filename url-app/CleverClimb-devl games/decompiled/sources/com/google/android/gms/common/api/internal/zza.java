package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zza extends ActivityLifecycleObserver {
    private final WeakReference<C0367zza> zzds;

    /* renamed from: com.google.android.gms.common.api.internal.zza$zza, reason: collision with other inner class name */
    static class C0367zza extends LifecycleCallback {
        private List<Runnable> zzdt;

        private C0367zza(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.zzdt = new ArrayList();
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0367zza zza(Activity activity) {
            C0367zza c0367zza;
            synchronized (activity) {
                LifecycleFragment fragment = getFragment(activity);
                c0367zza = (C0367zza) fragment.getCallbackOrNull("LifecycleObserverOnStop", C0367zza.class);
                if (c0367zza == null) {
                    c0367zza = new C0367zza(fragment);
                }
            }
            return c0367zza;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized void zza(Runnable runnable) {
            this.zzdt.add(runnable);
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            List<Runnable> list;
            synchronized (this) {
                list = this.zzdt;
                this.zzdt = new ArrayList();
            }
            Iterator<Runnable> it = list.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    public zza(Activity activity) {
        this(C0367zza.zza(activity));
    }

    private zza(C0367zza c0367zza) {
        this.zzds = new WeakReference<>(c0367zza);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C0367zza c0367zza = this.zzds.get();
        if (c0367zza == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        c0367zza.zza(runnable);
        return this;
    }
}
