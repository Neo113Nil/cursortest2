package com.squareup.cash.support.screenshot;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.cdf.customersupport.CaptureTrigger;
import com.squareup.cash.support.screens.SupportScreens;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes7.dex */
public abstract class AnalyticsUitlKt {
    public static final ComposableLambdaImpl lambda$2107090028 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(0), false, 2107090028);

    /* renamed from: lambda$-271752349, reason: not valid java name */
    public static final ComposableLambdaImpl f687lambda$271752349 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(6), false, -271752349);

    public static final CaptureTrigger toAnalyticsTrigger(SupportScreens.ScreenshotScreen.Trigger trigger) {
        trigger.getClass();
        int ordinal = trigger.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return CaptureTrigger.NOTIFICATION;
            }
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return CaptureTrigger.CHAT;
    }
}
