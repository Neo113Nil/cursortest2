package io.appmetrica.analytics.impl;

import android.app.ActivityManager;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class Yo {
    public static /* synthetic */ ActivityManager.TaskDescription d(int i4, String str) {
        return new ActivityManager.TaskDescription(str, 0, i4);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout l(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
