package com.appsflyer.internal;

import android.app.ApplicationExitInfo;
import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n {
    public static /* bridge */ /* synthetic */ ApplicationExitInfo g(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds j(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation k(int i3, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i3, interpolator, j);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation l(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void p() {
    }
}
