package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.internal.zzau;

/* loaded from: classes.dex */
final class zzaei implements zzadm {
    final /* synthetic */ zzaeg zza;

    zzaei(zzaeg zzaegVar) {
        this.zza = zzaegVar;
    }

    private final void zza(zzaen zzaenVar) {
        this.zza.zzi.execute(new zzaeo(this, zzaenVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zzb(String str) {
        int i4 = this.zza.zza;
        Preconditions.checkState(i4 == 8, "Unexpected response type " + i4);
        zza(new zzaek(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zzc(String str) {
        int i4 = this.zza.zza;
        Preconditions.checkState(i4 == 7, "Unexpected response type " + i4);
        zzaeg.zza(this.zza);
    }

    private final void zza(Status status, AuthCredential authCredential, String str, String str2) {
        zzaeg.zza(this.zza, status);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzn = authCredential;
        zzaegVar.zzo = str;
        zzaegVar.zzp = str2;
        zzau zzauVar = zzaegVar.zzf;
        if (zzauVar != null) {
            zzauVar.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zzb() {
        int i4 = this.zza.zza;
        Preconditions.checkState(i4 == 6, "Unexpected response type " + i4);
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zzc() {
        int i4 = this.zza.zza;
        Preconditions.checkState(i4 == 9, "Unexpected response type " + i4);
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(String str) {
        int i4 = this.zza.zza;
        Preconditions.checkState(i4 == 8, "Unexpected response type " + i4);
        this.zza.zzu = true;
        zza(new zzaem(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzafw zzafwVar) {
        int i4 = this.zza.zza;
        Preconditions.checkState(i4 == 3, "Unexpected response type " + i4);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzl = zzafwVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza() {
        int i4 = this.zza.zza;
        Preconditions.checkState(i4 == 5, "Unexpected response type " + i4);
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzzt zzztVar) {
        zza(zzztVar.zza(), zzztVar.zzb(), zzztVar.zzc(), zzztVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzzs zzzsVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzq = zzzsVar;
        zzaegVar.zza(zzao.zza("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(Status status, PhoneAuthCredential phoneAuthCredential) {
        int i4 = this.zza.zza;
        Preconditions.checkState(i4 == 2, "Unexpected response type " + i4);
        zza(status, phoneAuthCredential, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(Status status) {
        String statusMessage = status.getStatusMessage();
        if (statusMessage != null) {
            if (statusMessage.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (statusMessage.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (statusMessage.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (statusMessage.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (statusMessage.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (statusMessage.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (statusMessage.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (statusMessage.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (statusMessage.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (statusMessage.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzaeg zzaegVar = this.zza;
        if (zzaegVar.zza == 8) {
            zzaegVar.zzu = true;
            zza(new zzael(this, status));
        } else {
            zzaeg.zza(zzaegVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzags zzagsVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzs = zzagsVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzagt zzagtVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzr = zzagtVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzagw zzagwVar, zzagl zzaglVar) {
        int i4 = this.zza.zza;
        Preconditions.checkState(i4 == 2, "Unexpected response type: " + i4);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzj = zzagwVar;
        zzaegVar.zzk = zzaglVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzahg zzahgVar) {
        int i4 = this.zza.zza;
        Preconditions.checkState(i4 == 4, "Unexpected response type " + i4);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzm = zzahgVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzahh zzahhVar) {
        zzaeg.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzahs zzahsVar) {
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzt = zzahsVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(zzagw zzagwVar) {
        int i4 = this.zza.zza;
        Preconditions.checkState(i4 == 1, "Unexpected response type: " + i4);
        zzaeg zzaegVar = this.zza;
        zzaegVar.zzj = zzagwVar;
        zzaeg.zza(zzaegVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final void zza(PhoneAuthCredential phoneAuthCredential) {
        int i4 = this.zza.zza;
        Preconditions.checkState(i4 == 8, "Unexpected response type " + i4);
        this.zza.zzu = true;
        zza(new zzaej(this, phoneAuthCredential));
    }
}
