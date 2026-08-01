package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzawk {
    private final Object zza = new Object();
    private zzawi zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            zzawi zzawiVar = this.zzb;
            if (zzawiVar == null) {
                return null;
            }
            return zzawiVar.zza();
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            zzawi zzawiVar = this.zzb;
            if (zzawiVar == null) {
                return null;
            }
            return zzawiVar.zzb();
        }
    }

    public final void zzc(zzawj zzawjVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzawi();
            }
            this.zzb.zzf(zzawjVar);
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    zzcbn.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzawi();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzawj zzawjVar) {
        synchronized (this.zza) {
            zzawi zzawiVar = this.zzb;
            if (zzawiVar == null) {
                return;
            }
            zzawiVar.zzh(zzawjVar);
        }
    }
}
