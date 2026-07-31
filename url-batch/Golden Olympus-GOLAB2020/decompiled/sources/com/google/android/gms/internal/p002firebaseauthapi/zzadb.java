package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.internal.zzl;

/* loaded from: classes.dex */
final class zzadb extends zzaeg<Void, zzl> {
    private final String zzaa;
    private final String zzab;
    private final String zzac;
    private final boolean zzad;
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final long zzx;
    private final boolean zzy;
    private final boolean zzz;

    public zzadb(zzam zzamVar, String str, String str2, long j4, boolean z4, boolean z5, String str3, String str4, String str5, boolean z6) {
        super(8);
        Preconditions.checkNotNull(zzamVar);
        Preconditions.checkNotEmpty(str);
        this.zzu = Preconditions.checkNotEmpty(zzamVar.zzb());
        this.zzv = str;
        this.zzw = str2;
        this.zzx = j4;
        this.zzy = z4;
        this.zzz = z5;
        this.zzaa = str3;
        this.zzab = str4;
        this.zzac = str5;
        this.zzad = z6;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzb);
    }
}
