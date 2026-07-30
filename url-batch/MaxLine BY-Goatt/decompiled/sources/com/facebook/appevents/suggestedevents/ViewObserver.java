package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.appevents.codeless.internal.SensitiveUserDataUtils;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.k3;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ViewObserver implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int MAX_TEXT_LENGTH = 300;
    private final WeakReference<Activity> activityWeakReference;
    private final AtomicBoolean isTracking;
    private final Handler uiThreadHandler;
    public static final Companion Companion = new Companion(null);
    private static final Map<Integer, ViewObserver> observers = new HashMap();

    private ViewObserver(Activity activity) {
        this.activityWeakReference = new WeakReference<>(activity);
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.isTracking = new AtomicBoolean(false);
    }

    public static final /* synthetic */ Map access$getObservers$cp() {
        if (CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewObserver.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$startTracking(ViewObserver viewObserver) {
        if (CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
            return;
        }
        try {
            viewObserver.startTracking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewObserver.class);
        }
    }

    public static final /* synthetic */ void access$stopTracking(ViewObserver viewObserver) {
        if (CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
            return;
        }
        try {
            viewObserver.stopTracking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewObserver.class);
        }
    }

    private final void process() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            k3 k3Var = new k3(27, this);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                k3Var.run();
            } else {
                this.uiThreadHandler.post(k3Var);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void process$lambda$0(ViewObserver viewObserver) {
        if (CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
            return;
        }
        try {
            viewObserver.getClass();
            try {
                View rootView = AppEventUtility.getRootView(viewObserver.activityWeakReference.get());
                Activity activity = viewObserver.activityWeakReference.get();
                if (rootView != null && activity != null) {
                    for (View view : SuggestedEventViewHierarchy.getAllClickableViews(rootView)) {
                        if (!SensitiveUserDataUtils.isSensitiveUserData(view)) {
                            String textOfViewRecursively = SuggestedEventViewHierarchy.getTextOfViewRecursively(view);
                            if (textOfViewRecursively.length() > 0 && textOfViewRecursively.length() <= MAX_TEXT_LENGTH) {
                                ViewOnClickListener.Companion companion = ViewOnClickListener.Companion;
                                String localClassName = activity.getLocalClassName();
                                localClassName.getClass();
                                companion.attachListener$facebook_core_release(view, rootView, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewObserver.class);
        }
    }

    private final void startTracking() {
        View rootView;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (!this.isTracking.getAndSet(true) && (rootView = AppEventUtility.getRootView(this.activityWeakReference.get())) != null) {
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    process();
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void startTrackingActivity(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
            return;
        }
        try {
            Companion.startTrackingActivity(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewObserver.class);
        }
    }

    private final void stopTracking() {
        View rootView;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(false) && (rootView = AppEventUtility.getRootView(this.activityWeakReference.get())) != null) {
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void stopTrackingActivity(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
            return;
        }
        try {
            Companion.stopTrackingActivity(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewObserver.class);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            process();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startTrackingActivity(Activity activity) {
            activity.getClass();
            int hashCode = activity.hashCode();
            Map access$getObservers$cp = ViewObserver.access$getObservers$cp();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = access$getObservers$cp.get(valueOf);
            if (obj == null) {
                obj = new ViewObserver(activity, null);
                access$getObservers$cp.put(valueOf, obj);
            }
            ViewObserver.access$startTracking((ViewObserver) obj);
        }

        public final void stopTrackingActivity(Activity activity) {
            activity.getClass();
            ViewObserver viewObserver = (ViewObserver) ViewObserver.access$getObservers$cp().remove(Integer.valueOf(activity.hashCode()));
            if (viewObserver != null) {
                ViewObserver.access$stopTracking(viewObserver);
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ ViewObserver(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }
}
