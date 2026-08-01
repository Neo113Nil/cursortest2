package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzij {
    private final AudioManager zza;
    private final zzih zzb;
    private zzii zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzij(Context context, Handler handler, zzii zziiVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.zza = audioManager;
        this.zzc = zziiVar;
        this.zzb = new zzih(this, handler);
        this.zzd = 0;
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzfs.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i) {
        int zzX;
        zzii zziiVar = this.zzc;
        if (zziiVar != null) {
            zzke zzkeVar = (zzke) zziiVar;
            boolean zzv = zzkeVar.zza.zzv();
            zzX = zzki.zzX(zzv, i);
            zzkeVar.zza.zzak(zzv, i, zzX);
        }
    }

    private final void zzg(int i) {
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.zze != f) {
            this.zze = f;
            zzii zziiVar = this.zzc;
            if (zziiVar != null) {
                ((zzke) zziiVar).zza.zzah();
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }

    static /* bridge */ /* synthetic */ void zzc(zzij zzijVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzijVar.zzg(3);
                return;
            } else {
                zzijVar.zzf(0);
                zzijVar.zzg(2);
                return;
            }
        }
        if (i == -1) {
            zzijVar.zzf(-1);
            zzijVar.zze();
        } else if (i == 1) {
            zzijVar.zzg(1);
            zzijVar.zzf(1);
        } else {
            zzez.zzf("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }
}
