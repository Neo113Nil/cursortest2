package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import com.google.firebase.FirebaseApp;

/* loaded from: classes.dex */
public final class zzcb {
    private volatile int zza;
    private final zzaq zzb;
    private volatile boolean zzc;

    public zzcb(FirebaseApp firebaseApp) {
        this(firebaseApp.getApplicationContext(), new zzaq(firebaseApp));
    }

    private zzcb(Context context, zzaq zzaqVar) {
        this.zzc = false;
        this.zza = 0;
        this.zzb = zzaqVar;
        BackgroundDetector.initialize((Application) context.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new zzca(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzb() {
        return this.zza > 0 && !this.zzc;
    }

    public final void zza() {
        this.zzb.zzb();
    }

    public final void zza(int i4) {
        if (i4 > 0 && this.zza == 0) {
            this.zza = i4;
            if (zzb()) {
                this.zzb.zzc();
            }
        } else if (i4 == 0 && this.zza != 0) {
            this.zzb.zzb();
        }
        this.zza = i4;
    }

    public final void zza(zzagw zzagwVar) {
        if (zzagwVar == null) {
            return;
        }
        long zza = zzagwVar.zza();
        if (zza <= 0) {
            zza = 3600;
        }
        long zzb = zzagwVar.zzb() + (zza * 1000);
        zzaq zzaqVar = this.zzb;
        zzaqVar.zza = zzb;
        zzaqVar.zzb = -1L;
        if (zzb()) {
            this.zzb.zzc();
        }
    }
}
