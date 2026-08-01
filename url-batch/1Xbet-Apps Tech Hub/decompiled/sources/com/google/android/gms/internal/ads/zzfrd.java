package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfrd {
    public static ListenableFuture zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfrc zzfrcVar = new zzfrc(task, null);
        task.addOnCompleteListener(zzgbr.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfrb
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfrc zzfrcVar2 = zzfrc.this;
                if (task2.isCanceled()) {
                    zzfrcVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfrcVar2.zzc(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzfrcVar2.zzd(exception);
            }
        });
        return zzfrcVar;
    }
}
