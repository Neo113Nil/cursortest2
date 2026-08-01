package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzayp {
    private final zzayv zza;
    private final zzbae zzb;
    private final boolean zzc;

    private zzayp() {
        this.zzb = zzbaf.zzd();
        this.zzc = false;
        this.zza = new zzayv();
    }

    public static zzayp zza() {
        return new zzayp();
    }

    private final synchronized String zzd(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzk(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((zzbaf) this.zzb.zzal()).zzax(), 3));
    }

    private final synchronized void zze(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(zzd(i).getBytes());
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

    private final synchronized void zzf(int i) {
        zzbae zzbaeVar = this.zzb;
        zzbaeVar.zzd();
        zzbaeVar.zzc(com.google.android.gms.ads.internal.util.zzt.zzd());
        zzayu zzayuVar = new zzayu(this.zza, ((zzbaf) this.zzb.zzal()).zzax(), null);
        int i2 = i - 1;
        zzayuVar.zza(i2);
        zzayuVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void zzb(zzayo zzayoVar) {
        if (this.zzc) {
            try {
                zzayoVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeO)).booleanValue()) {
                zze(i);
            } else {
                zzf(i);
            }
        }
    }

    public zzayp(zzayv zzayvVar) {
        this.zzb = zzbaf.zzd();
        this.zza = zzayvVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeN)).booleanValue();
    }
}
