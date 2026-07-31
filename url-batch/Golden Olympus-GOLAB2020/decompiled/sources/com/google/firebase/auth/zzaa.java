package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth.zza;
import com.google.firebase.auth.FirebaseAuth.zzb;
import com.google.firebase.auth.internal.zzbo;
import com.google.firebase.auth.internal.zzcc;

/* loaded from: classes.dex */
final class zzaa extends zzbo<AuthResult> {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ FirebaseUser zzb;
    private final /* synthetic */ EmailAuthCredential zzc;
    private final /* synthetic */ FirebaseAuth zzd;

    zzaa(FirebaseAuth firebaseAuth, boolean z4, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = z4;
        this.zzb = firebaseUser;
        this.zzc = emailAuthCredential;
        this.zzd = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzcc] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(String str) {
        zzabq zzabqVar;
        FirebaseApp firebaseApp;
        zzabq zzabqVar2;
        FirebaseApp firebaseApp2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        if (this.zza) {
            zzabqVar2 = this.zzd.zze;
            firebaseApp2 = this.zzd.zza;
            return zzabqVar2.zzb(firebaseApp2, (FirebaseUser) Preconditions.checkNotNull(this.zzb), this.zzc, str, (zzcc) this.zzd.new zza());
        }
        zzabqVar = this.zzd.zze;
        firebaseApp = this.zzd.zza;
        return zzabqVar.zza(firebaseApp, this.zzc, str, (com.google.firebase.auth.internal.zzl) this.zzd.new zzb());
    }
}
