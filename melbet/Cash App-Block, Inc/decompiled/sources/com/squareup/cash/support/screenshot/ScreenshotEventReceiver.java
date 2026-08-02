package com.squareup.cash.support.screenshot;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.cdf.customersupport.CustomerSupportCaptureAddScreenshot;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screenshot.ScreenshotViewEvent;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda0;
import com.squareup.util.android.SecurePixelCopy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class ScreenshotEventReceiver implements Ui.EventReceiver {
    public final Analytics analytics;
    public final Navigator navigator;
    public final RealScreenshotManager screenshotManager;
    public final MainActivity$$ExternalSyntheticLambda0 windowProvider;

    public ScreenshotEventReceiver(Navigator navigator, MainActivity$$ExternalSyntheticLambda0 mainActivity$$ExternalSyntheticLambda0, RealScreenshotManager realScreenshotManager, Analytics analytics) {
        navigator.getClass();
        this.navigator = navigator;
        this.windowProvider = mainActivity$$ExternalSyntheticLambda0;
        this.screenshotManager = realScreenshotManager;
        this.analytics = analytics;
    }

    @Override // app.cash.broadway.ui.Ui.EventReceiver
    public final void sendEvent(ScreenshotViewEvent screenshotViewEvent) {
        screenshotViewEvent.getClass();
        boolean z = screenshotViewEvent instanceof ScreenshotViewEvent.TakeScreenshot;
        RealScreenshotManager realScreenshotManager = this.screenshotManager;
        if (z) {
            ScreenshotViewEvent.TakeScreenshot takeScreenshot = (ScreenshotViewEvent.TakeScreenshot) screenshotViewEvent;
            this.analytics.track(new CustomerSupportCaptureAddScreenshot(takeScreenshot.getScreenshotArgs().flowToken, takeScreenshot.getScreenshotArgs().screenshotRequestId, AnalyticsUitlKt.toAnalyticsTrigger(takeScreenshot.getScreenshotArgs().trigger)), null);
            StateFlowImpl stateFlowImpl = realScreenshotManager.screenshotState;
            stateFlowImpl.updateState(null, ScreenshotManager$ScreenshotState.copy$default((ScreenshotManager$ScreenshotState) stateFlowImpl.getValue(), false, null, null, null, true, 14));
            return;
        }
        if (!(screenshotViewEvent instanceof ScreenshotViewEvent.PreparationCompleted)) {
            if (screenshotViewEvent instanceof ScreenshotViewEvent.ScreenshotResultDisplayed) {
                StateFlowImpl stateFlowImpl2 = realScreenshotManager.screenshotState;
                stateFlowImpl2.updateState(null, ScreenshotManager$ScreenshotState.copy$default((ScreenshotManager$ScreenshotState) stateFlowImpl2.getValue(), false, null, null, null, false, 27));
                return;
            } else {
                if (!(screenshotViewEvent instanceof ScreenshotViewEvent.Done)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                StateFlowImpl stateFlowImpl3 = realScreenshotManager.screenshotState;
                stateFlowImpl3.updateState(null, ScreenshotManager$ScreenshotState.copy$default((ScreenshotManager$ScreenshotState) stateFlowImpl3.getValue(), false, null, null, null, false, 30));
                this.navigator.goTo(new SupportScreens.ScreenshotScreen.ScreenshotReviewScreen(((ScreenshotViewEvent.Done) screenshotViewEvent).getScreenshotArgs()));
                return;
            }
        }
        Window window = (Window) this.windowProvider.invoke();
        RealSandboxer$$ExternalSyntheticLambda0 realSandboxer$$ExternalSyntheticLambda0 = new RealSandboxer$$ExternalSyntheticLambda0(realScreenshotManager, 26);
        View decorView = window.getDecorView();
        decorView.getClass();
        int[] iArr = new int[2];
        decorView.getLocationInWindow(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], decorView.getWidth() + i, decorView.getHeight() + iArr[1]);
        Bitmap createBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
        RealScreenshotManager$$ExternalSyntheticLambda2 realScreenshotManager$$ExternalSyntheticLambda2 = new RealScreenshotManager$$ExternalSyntheticLambda2(realSandboxer$$ExternalSyntheticLambda0, createBitmap);
        Handler handler = decorView.getHandler();
        handler.getClass();
        SecurePixelCopy.request(window, rect, createBitmap, realScreenshotManager$$ExternalSyntheticLambda2, handler);
    }
}
