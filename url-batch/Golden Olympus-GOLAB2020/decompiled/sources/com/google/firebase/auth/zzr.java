package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.zzbo;

/* loaded from: classes.dex */
final class zzr extends zzbo<Void> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ ActionCodeSettings zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    zzr(FirebaseAuth firebaseAuth, String str, ActionCodeSettings actionCodeSettings) {
        this.zza = str;
        this.zzb = actionCodeSettings;
        this.zzc = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<Void> zza(String str) {
        zzabq zzabqVar;
        FirebaseApp firebaseApp;
        String str2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link sign in for " + this.zza + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for email link sign in for " + this.zza);
        }
        zzabqVar = this.zzc.zze;
        firebaseApp = this.zzc.zza;
        String str3 = this.zza;
        ActionCodeSettings actionCodeSettings = this.zzb;
        str2 = this.zzc.zzk;
        return zzabqVar.zzb(firebaseApp, str3, actionCodeSettings, str2, str);
    }
}
