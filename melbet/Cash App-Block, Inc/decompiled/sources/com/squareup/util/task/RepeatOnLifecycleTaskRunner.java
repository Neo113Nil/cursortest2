package com.squareup.util.task;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public final class RepeatOnLifecycleTaskRunner {
    public final Lifecycle lifecycle;

    public RepeatOnLifecycleTaskRunner(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }
}
