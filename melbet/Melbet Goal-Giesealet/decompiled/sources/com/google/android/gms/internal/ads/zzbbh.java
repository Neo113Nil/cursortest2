package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbbn;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbbh {
    private final zzbbm zza;
    private final zzbbn.zzt.zza zzb;
    private final boolean zzc;

    private zzbbh() {
        this.zzb = zzbbn.zzt.zzx();
        this.zzc = false;
        this.zza = new zzbbm();
    }

    public static zzbbh zza() {
        return new zzbbh();
    }

    private final synchronized void zzd(int i) {
        zzbbn.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(com.google.android.gms.ads.internal.util.zzs.zzk());
        zzbbl zzbblVar = new zzbbl(this.zza, zzaVar.zzbu().zzaN(), null);
        int i2 = i - 1;
        zzbblVar.zzb(i2);
        zzbblVar.zza();
        String num = Integer.toString(i2, 10);
        String.valueOf(num);
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(num)));
    }

    private final synchronized void zze(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfqm.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzf(i).getBytes());
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(int i) {
        zzbbn.zzt.zza zzaVar;
        zzaVar = this.zzb;
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", zzaVar.zzf(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(zzaVar.zzbu().zzaN(), 3));
    }

    public final synchronized void zzb(zzbbg zzbbgVar) {
        if (this.zzc) {
            try {
                zzbbgVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfE)).booleanValue()) {
                zze(i);
            } else {
                zzd(i);
            }
        }
    }

    public zzbbh(zzbbm zzbbmVar) {
        this.zzb = zzbbn.zzt.zzx();
        this.zza = zzbbmVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfD)).booleanValue();
    }
}
