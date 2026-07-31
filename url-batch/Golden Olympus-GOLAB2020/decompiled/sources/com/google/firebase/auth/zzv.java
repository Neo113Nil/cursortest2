package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.internal.p002firebaseauthapi.zzahy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.internal.zzcd;

/* loaded from: classes.dex */
final class zzv implements Continuation<zzahs, Task<TotpSecret>> {
    private final /* synthetic */ FirebaseAuth zza;

    zzv(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<TotpSecret> then(Task<zzahs> task) {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) Preconditions.checkNotNull(task.getException()));
        }
        zzahs result = task.getResult();
        if (result instanceof zzahy) {
            zzahy zzahyVar = (zzahy) result;
            return Tasks.forResult(new zzcd(Preconditions.checkNotEmpty(zzahyVar.zzf()), Preconditions.checkNotEmpty(zzahyVar.zze()), zzahyVar.zzc(), zzahyVar.zzb(), zzahyVar.zzd(), Preconditions.checkNotEmpty(zzahyVar.zza()), this.zza));
        }
        throw new IllegalArgumentException("Response should be an instance of StartTotpMfaEnrollmentResponse but was " + result.getClass().getName() + ".");
    }
}
