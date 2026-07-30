package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaca {
    private final Context zza;
    private boolean zzb;
    private zzuw zzc = zzuw.zzb;
    private final zzui zzd;
    private Handler zze;
    private zzadm zzf;

    public zzaca(Context context) {
        this.zza = context;
        this.zzd = new zzuc(context, null, null);
    }

    public final zzaca zza(zzuw zzuwVar) {
        this.zzc = zzuwVar;
        return this;
    }

    public final zzaca zzb(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzaca zzc(zzadm zzadmVar) {
        this.zzf = zzadmVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r3.zzf != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzacc zzd() {
        boolean z;
        zzgrc.zzi(!this.zzb);
        Handler handler = this.zze;
        if (handler != null || this.zzf != null) {
            z = false;
            if (handler != null) {
            }
            zzgrc.zzi(z);
            this.zzb = true;
            return new zzacc(this);
        }
        z = true;
        zzgrc.zzi(z);
        this.zzb = true;
        return new zzacc(this);
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzuw zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzui zzg() {
        return this.zzd;
    }

    final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    final /* synthetic */ zzadm zzi() {
        return this.zzf;
    }
}
