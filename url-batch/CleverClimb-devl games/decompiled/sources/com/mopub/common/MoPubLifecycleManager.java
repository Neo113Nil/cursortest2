package com.mopub.common;

import android.app.Activity;
import com.mopub.common.privacy.PersonalInfoManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class MoPubLifecycleManager implements LifecycleListener {
    private static MoPubLifecycleManager sInstance;
    private final Set<LifecycleListener> mLifecycleListeners = new HashSet();
    private final WeakReference<Activity> mMainActivity;

    private MoPubLifecycleManager(Activity activity) {
        this.mMainActivity = new WeakReference<>(activity);
    }

    public static synchronized MoPubLifecycleManager getInstance(Activity activity) {
        MoPubLifecycleManager moPubLifecycleManager;
        synchronized (MoPubLifecycleManager.class) {
            if (sInstance == null) {
                sInstance = new MoPubLifecycleManager(activity);
            }
            moPubLifecycleManager = sInstance;
        }
        return moPubLifecycleManager;
    }

    public void addLifecycleListener(LifecycleListener lifecycleListener) {
        Activity activity;
        if (lifecycleListener == null || !this.mLifecycleListeners.add(lifecycleListener) || (activity = this.mMainActivity.get()) == null) {
            return;
        }
        lifecycleListener.onCreate(activity);
        lifecycleListener.onStart(activity);
    }

    @Override // com.mopub.common.LifecycleListener
    public void onCreate(Activity activity) {
        Iterator<LifecycleListener> it = this.mLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onCreate(activity);
        }
    }

    @Override // com.mopub.common.LifecycleListener
    public void onStart(Activity activity) {
        Iterator<LifecycleListener> it = this.mLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onStart(activity);
        }
    }

    @Override // com.mopub.common.LifecycleListener
    public void onPause(Activity activity) {
        Iterator<LifecycleListener> it = this.mLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onPause(activity);
        }
    }

    @Override // com.mopub.common.LifecycleListener
    public void onResume(Activity activity) {
        PersonalInfoManager personalInformationManager = MoPub.getPersonalInformationManager();
        if (personalInformationManager != null) {
            personalInformationManager.requestSync(false);
        }
        Iterator<LifecycleListener> it = this.mLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onResume(activity);
        }
    }

    @Override // com.mopub.common.LifecycleListener
    public void onRestart(Activity activity) {
        Iterator<LifecycleListener> it = this.mLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onRestart(activity);
        }
    }

    @Override // com.mopub.common.LifecycleListener
    public void onStop(Activity activity) {
        Iterator<LifecycleListener> it = this.mLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onStop(activity);
        }
    }

    @Override // com.mopub.common.LifecycleListener
    public void onDestroy(Activity activity) {
        Iterator<LifecycleListener> it = this.mLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onDestroy(activity);
        }
    }

    @Override // com.mopub.common.LifecycleListener
    public void onBackPressed(Activity activity) {
        Iterator<LifecycleListener> it = this.mLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onBackPressed(activity);
        }
    }
}
