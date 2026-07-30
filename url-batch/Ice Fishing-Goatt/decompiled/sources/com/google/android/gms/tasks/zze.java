package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class zze implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzf zzb;

    zze(zzf zzfVar, Task task) {
        this.zzb = zzfVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw zzwVar;
        zzw zzwVar2;
        zzw zzwVar3;
        Continuation continuation;
        try {
            continuation = this.zzb.zzb;
            Task task = (Task) continuation.then(this.zza);
            zzf zzfVar = this.zzb;
            if (task == null) {
                zzfVar.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            task.addOnSuccessListener(TaskExecutors.zza, zzfVar);
            task.addOnFailureListener(TaskExecutors.zza, this.zzb);
            task.addOnCanceledListener(TaskExecutors.zza, this.zzb);
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            zzf zzfVar2 = this.zzb;
            if (z) {
                zzwVar3 = zzfVar2.zzc;
                zzwVar3.zza((Exception) e.getCause());
            } else {
                zzwVar2 = zzfVar2.zzc;
                zzwVar2.zza(e);
            }
        } catch (Exception e2) {
            zzwVar = this.zzb.zzc;
            zzwVar.zza(e2);
        }
    }
}
