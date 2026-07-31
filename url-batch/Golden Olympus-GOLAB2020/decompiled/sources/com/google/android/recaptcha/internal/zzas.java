package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import o2.Q;

/* loaded from: classes.dex */
public final class zzas {
    public static final Task zza(Q q4) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        q4.invokeOnCompletion(new zzar(taskCompletionSource, q4));
        return taskCompletionSource.getTask();
    }
}
