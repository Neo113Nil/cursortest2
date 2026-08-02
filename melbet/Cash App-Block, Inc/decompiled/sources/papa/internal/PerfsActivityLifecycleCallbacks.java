package papa.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Window;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaad;
import curtains.WindowsKt;
import curtains.WindowsKt$onNextDraw$1;
import curtains.internal.WindowCallbackWrapper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import papa.ActivityTouchEvent;
import papa.AppStart$AppStartData;
import papa.AppUpdateData;
import papa.AppVisibilityState;
import papa.PapaEvent;
import papa.internal.LaunchTracker;
import papa.internal.PerfsActivityLifecycleCallbacks;

/* loaded from: classes3.dex */
public final class PerfsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public final Perfs$$ExternalSyntheticLambda4 appStartUpdateCallback;
    public final Perfs$$ExternalSyntheticLambda2 appVisibilityStateCallback;
    public boolean firstActivityCreated;
    public boolean firstActivityResumed;
    public boolean firstActivityStarted;
    public boolean firstDraw;
    public boolean firstGlobalLayout;
    public boolean firstPreDraw;
    public boolean firstTouchEvent;
    public final LaunchTracker launchTracker;
    public final Handler handler = new Handler(Looper.getMainLooper());
    public final LinkedHashSet resumedActivityHashes = new LinkedHashSet();
    public final LinkedHashSet startedActivityHashes = new LinkedHashSet();
    public final LinkedHashMap createdActivityHashes = new LinkedHashMap();
    public final ArrayList joinedPosts = new ArrayList();

    public final class OnCreateRecord {
        public final boolean hasSavedState;
        public final boolean sameMessage;

        public OnCreateRecord(boolean z, boolean z2) {
            this.sameMessage = z;
            this.hasSavedState = z2;
        }
    }

    public PerfsActivityLifecycleCallbacks(Perfs$$ExternalSyntheticLambda4 perfs$$ExternalSyntheticLambda4, Perfs$$ExternalSyntheticLambda2 perfs$$ExternalSyntheticLambda2, Perfs$$ExternalSyntheticLambda3 perfs$$ExternalSyntheticLambda3) {
        this.appStartUpdateCallback = perfs$$ExternalSyntheticLambda4;
        this.appVisibilityStateCallback = perfs$$ExternalSyntheticLambda2;
        this.launchTracker = new LaunchTracker(perfs$$ExternalSyntheticLambda3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        recordActivityCreated(activity, bundle);
        int i = 1;
        if (!this.firstActivityCreated) {
            this.firstActivityCreated = true;
            AppStart$AppStartData appStart$AppStartData = Perfs.appStartData;
            if (appStart$AppStartData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appStartData");
                throw null;
            }
            SystemClock.uptimeMillis();
            activity.getIntent();
            Perfs.appStartData = AppStart$AppStartData.copy$default(appStart$AppStartData, null, null, null, null, null, new ActivityTouchEvent(), null, null, null, null, null, null, null, null, -2097153);
        }
        int i2 = 0;
        if (!this.firstGlobalLayout) {
            PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2 perfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2 = new PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2(this, activity, i2);
            OnPreDrawListenerWrapper onPreDrawListenerWrapper = new OnPreDrawListenerWrapper(1);
            Window window = activity.getWindow();
            window.getClass();
            WindowsKt.onDecorViewReady(window, new Perfs$$ExternalSyntheticLambda2(new LaunchTracker$$ExternalSyntheticLambda0(8, window, onPreDrawListenerWrapper, perfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2), 12));
        }
        if (!this.firstPreDraw) {
            Window window2 = activity.getWindow();
            window2.getClass();
            AppUpdateData.onNextPreDraw(window2, new PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2(this, activity, i));
        }
        if (!this.firstDraw) {
            Window window3 = activity.getWindow();
            window3.getClass();
            WindowsKt.onDecorViewReady(window3, new WindowsKt$onNextDraw$1(new PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2(this, activity, 2), i2));
        }
        if (this.firstTouchEvent) {
            return;
        }
        ViewTreeObservers$$ExternalSyntheticLambda3 viewTreeObservers$$ExternalSyntheticLambda3 = new ViewTreeObservers$$ExternalSyntheticLambda3(14, this, activity);
        Window window4 = activity.getWindow();
        window4.getClass();
        Lazy lazy = WindowsKt.tooltipString$delegate;
        Lazy lazy2 = WindowCallbackWrapper.jetpackWrapperClass$delegate;
        ((CopyOnWriteArrayList) PapaEvent.getListeners(window4).socket).add(new ViewTreeObserversKt$onNextTouchEvent$1(viewTreeObservers$$ExternalSyntheticLambda3, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        this.createdActivityHashes.remove(Integer.toHexString(System.identityHashCode(activity)));
        this.launchTracker.pushLaunchInProgressDeadline();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        this.resumedActivityHashes.remove(Integer.toHexString(System.identityHashCode(activity)));
        this.launchTracker.pushLaunchInProgressDeadline();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        recordActivityCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        activity.getClass();
        recordActivityResumed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        activity.getClass();
        recordActivityStarted(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        String recordActivityResumed = recordActivityResumed(activity);
        if (!this.firstActivityResumed) {
            this.firstActivityResumed = true;
            updateAppStart(activity.getClass().getName(), new SaversKt$$ExternalSyntheticLambda5(19));
        }
        OnCreateRecord onCreateRecord = (OnCreateRecord) MapsKt__MapsKt.getValue(this.createdActivityHashes, recordActivityResumed);
        LaunchedActivityStartingTransition launchedActivityStartingTransition = onCreateRecord.sameMessage ? onCreateRecord.hasSavedState ? LaunchedActivityStartingTransition.CREATED_WITH_STATE : LaunchedActivityStartingTransition.CREATED_NO_STATE : LaunchedActivityStartingTransition.STARTED;
        LaunchTracker launchTracker = this.launchTracker;
        launchTracker.getClass();
        if (((LaunchTracker.LaunchInProgress) launchTracker.launchInProgress) == null) {
            return;
        }
        Window window = activity.getWindow();
        window.getClass();
        AppUpdateData.onNextPreDraw(window, new LaunchTracker$$ExternalSyntheticLambda0(0, launchTracker, recordActivityResumed, launchedActivityStartingTransition));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzaad.onActivitySaveInstanceState(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        recordActivityStarted(activity);
        if (this.firstActivityStarted) {
            return;
        }
        this.firstActivityStarted = true;
        updateAppStart(activity.getClass().getName(), new SaversKt$$ExternalSyntheticLambda5(23));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        String hexString = Integer.toHexString(System.identityHashCode(activity));
        LinkedHashSet linkedHashSet = this.startedActivityHashes;
        linkedHashSet.remove(hexString);
        boolean isEmpty = linkedHashSet.isEmpty();
        LaunchTracker launchTracker = this.launchTracker;
        if (isEmpty) {
            launchTracker.getClass();
            launchTracker.lastAppBecameInvisibleRealtimeMillis = Long.valueOf(SystemClock.elapsedRealtime());
            this.appVisibilityStateCallback.invoke(AppVisibilityState.INVISIBLE);
        }
        launchTracker.pushLaunchInProgressDeadline();
    }

    public final void recordActivityCreated(Activity activity, Bundle bundle) {
        final String hexString = Integer.toHexString(System.identityHashCode(activity));
        LinkedHashMap linkedHashMap = this.createdActivityHashes;
        if (linkedHashMap.containsKey(hexString)) {
            return;
        }
        boolean isEmpty = this.startedActivityHashes.isEmpty();
        LaunchTracker launchTracker = this.launchTracker;
        launchTracker.pushLaunchInProgressDeadline();
        if (isEmpty) {
            hexString.getClass();
            launchTracker.appMightBecomeVisible(hexString);
        }
        final boolean z = bundle != null;
        linkedHashMap.put(hexString, new OnCreateRecord(true, z));
        Function0 function0 = new Function0() { // from class: papa.internal.PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LinkedHashMap linkedHashMap2 = PerfsActivityLifecycleCallbacks.this.createdActivityHashes;
                String str = hexString;
                if (linkedHashMap2.containsKey(str)) {
                    linkedHashMap2.put(str, new PerfsActivityLifecycleCallbacks.OnCreateRecord(false, z));
                }
                return Unit.INSTANCE;
            }
        };
        ArrayList arrayList = this.joinedPosts;
        boolean isEmpty2 = arrayList.isEmpty();
        arrayList.add(function0);
        if (isEmpty2) {
            this.handler.post(new AFLogger$$ExternalSyntheticLambda0(this, 16));
        }
    }

    public final String recordActivityResumed(Activity activity) {
        String hexString = Integer.toHexString(System.identityHashCode(activity));
        LinkedHashSet linkedHashSet = this.resumedActivityHashes;
        if (linkedHashSet.contains(hexString)) {
            hexString.getClass();
            return hexString;
        }
        linkedHashSet.add(hexString);
        this.launchTracker.pushLaunchInProgressDeadline();
        hexString.getClass();
        return hexString;
    }

    public final void recordActivityStarted(Activity activity) {
        String hexString = Integer.toHexString(System.identityHashCode(activity));
        LinkedHashSet linkedHashSet = this.startedActivityHashes;
        if (linkedHashSet.contains(hexString)) {
            return;
        }
        boolean isEmpty = linkedHashSet.isEmpty();
        LaunchTracker launchTracker = this.launchTracker;
        launchTracker.pushLaunchInProgressDeadline();
        if (isEmpty) {
            hexString.getClass();
            launchTracker.appMightBecomeVisible(hexString);
            this.appVisibilityStateCallback.invoke(AppVisibilityState.VISIBLE);
        }
        linkedHashSet.add(hexString);
    }

    public final void updateAppStart(String str, Function2 function2) {
        this.appStartUpdateCallback.invoke(new Perfs$$ExternalSyntheticLambda2(str, function2));
    }
}
