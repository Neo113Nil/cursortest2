package com.squareup.cash.ui;

import android.app.Activity;
import android.util.Log;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequestKt;
import app.cash.broadway.navigation.Navigator;
import com.google.android.gms.measurement.internal.zzky;
import com.squareup.cash.bugreporting.screens.BugReportingScreen;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class ScreenshotReportingManager {
    public zzky activityTracker;
    public final FeatureFlagManager featureFlagManager;
    public Navigator navigator;
    public final CoroutineScope scope;
    public final StateFlowImpl currentActivityFlow = FlowKt.MutableStateFlow(null);
    public final LinkedHashMap activityLaunchers = new LinkedHashMap();
    public final LinkedHashMap activityCallbacks = new LinkedHashMap();

    public ScreenshotReportingManager(FeatureFlagManager featureFlagManager, CoroutineScope coroutineScope) {
        this.featureFlagManager = featureFlagManager;
        this.scope = coroutineScope;
    }

    public static final void access$registerScreenshotDetection(final ScreenshotReportingManager screenshotReportingManager, final Activity activity) {
        try {
            Activity.ScreenCaptureCallback screenCaptureCallback = new Activity.ScreenCaptureCallback() { // from class: com.squareup.cash.ui.ScreenshotReportingManager$$ExternalSyntheticLambda3
                @Override // android.app.Activity.ScreenCaptureCallback
                public final void onScreenCaptured() {
                    ScreenshotReportingManager screenshotReportingManager2 = ScreenshotReportingManager.this;
                    ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) screenshotReportingManager2.activityLaunchers.get(activity);
                    if (activityResultLauncher != null) {
                        activityResultLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest$default());
                        return;
                    }
                    Navigator navigator = screenshotReportingManager2.navigator;
                    if (navigator != null) {
                        navigator.goTo(new BugReportingScreen(EmptyList.INSTANCE));
                    }
                }
            };
            activity.registerScreenCaptureCallback(activity.getMainExecutor(), screenCaptureCallback);
            screenshotReportingManager.activityCallbacks.put(activity, screenCaptureCallback);
        } catch (Exception e) {
            Log.e("ScreenshotReporting", "Failed to register screenshot detection for ".concat(activity.getClass().getSimpleName()), e);
        }
    }

    public static final void access$unregisterScreenshotDetection(ScreenshotReportingManager screenshotReportingManager, Activity activity) {
        LinkedHashMap linkedHashMap = screenshotReportingManager.activityCallbacks;
        try {
            Activity.ScreenCaptureCallback m = WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m(linkedHashMap.get(activity));
            if (m != null) {
                activity.unregisterScreenCaptureCallback(m);
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m(linkedHashMap.remove(activity));
            }
        } catch (Exception e) {
            Log.e("ScreenshotReporting", "Failed to unregister screenshot detection for ".concat(activity.getClass().getSimpleName()), e);
        }
    }
}
