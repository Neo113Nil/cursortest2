package com.squareup.cash.ui;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation$Callback;
import java.util.List;

/* loaded from: classes4.dex */
public final class InsetsCollector$Companion$NoOpAnimationCallback extends WindowInsetsAnimation$Callback {
    public static final InsetsCollector$Companion$NoOpAnimationCallback INSTANCE = new InsetsCollector$Companion$NoOpAnimationCallback(0);

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        windowInsets.getClass();
        list.getClass();
        return InsetsCollector.CONSUMED;
    }
}
