package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfpi {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfpi(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfpj.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfpj.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb = new StringBuilder("FBAMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    private final String zzf() {
        StringBuilder sb = new StringBuilder("LATMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzavc zzavcVar, zzfpo zzfpoVar) {
        boolean z;
        zzavf zzb;
        zzavf zzb2;
        String zzk = zzavcVar.zzd().zzk();
        byte[] zzA = zzavcVar.zzf().zzA();
        byte[] zzA2 = zzavcVar.zze().zzA();
        if (!TextUtils.isEmpty(zzk) && zzA2 != null && zzA2.length != 0) {
            zzfpj.zzd(this.zza);
            this.zza.mkdirs();
            zzfpj.zzc(zzk, this.zza).mkdirs();
            File zzb3 = zzfpj.zzb(zzk, "pcam.jar", this.zza);
            if ((zzA == null || zzA.length <= 0 || zzfpj.zze(zzb3, zzA)) && zzfpj.zze(zzfpj.zzb(zzk, "pcbc", this.zza), zzA2)) {
                File zzb4 = zzfpj.zzb(zzavcVar.zzd().zzk(), "pcam.jar", this.zza);
                if (zzb4.exists() && zzfpoVar != null && !zzfpoVar.zza(zzb4)) {
                    return false;
                }
                String zzk2 = zzavcVar.zzd().zzk();
                if (!TextUtils.isEmpty(zzk2)) {
                    File zzb5 = zzfpj.zzb(zzk2, "pcam.jar", this.zza);
                    File zzb6 = zzfpj.zzb(zzk2, "pcbc", this.zza);
                    File zzb7 = zzfpj.zzb(zzk2, "pcam.jar", zzd());
                    File zzb8 = zzfpj.zzb(zzk2, "pcbc", zzd());
                    if ((!zzb5.exists() || zzb5.renameTo(zzb7)) && zzb6.exists() && zzb6.renameTo(zzb8)) {
                        zzave zze = zzavf.zze();
                        zze.zze(zzavcVar.zzd().zzk());
                        zze.zza(zzavcVar.zzd().zzj());
                        zze.zzb(zzavcVar.zzd().zza());
                        zze.zzd(zzavcVar.zzd().zzd());
                        zze.zzc(zzavcVar.zzd().zzc());
                        zzavf zzavfVar = (zzavf) zze.zzal();
                        zzavf zzb9 = zzb(1);
                        SharedPreferences.Editor edit = this.zzc.edit();
                        if (zzb9 != null && !zzavfVar.zzk().equals(zzb9.zzk())) {
                            edit.putString(zze(), Hex.bytesToStringLowercase(zzb9.zzax()));
                        }
                        edit.putString(zzf(), Hex.bytesToStringLowercase(zzavfVar.zzax()));
                        if (edit.commit()) {
                            z = true;
                            HashSet hashSet = new HashSet();
                            zzb = zzb(1);
                            if (zzb != null) {
                                hashSet.add(zzb.zzk());
                            }
                            zzb2 = zzb(2);
                            if (zzb2 != null) {
                                hashSet.add(zzb2.zzk());
                            }
                            for (File file : zzd().listFiles()) {
                                String name = file.getName();
                                if (!hashSet.contains(name)) {
                                    zzfpj.zzd(zzfpj.zzc(name, zzd()));
                                }
                            }
                            return z;
                        }
                    }
                }
                z = false;
                HashSet hashSet2 = new HashSet();
                zzb = zzb(1);
                if (zzb != null) {
                }
                zzb2 = zzb(2);
                if (zzb2 != null) {
                }
                while (r4 < r1) {
                }
                return z;
            }
        }
        return false;
    }

    final zzavf zzb(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzgve zzgveVar = zzgve.zzb;
            zzavf zzh = zzavf.zzh(zzgve.zzv(stringToBytes, 0, stringToBytes.length));
            String zzk = zzh.zzk();
            File zzb = zzfpj.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzfpj.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzfpj.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzgwy unused) {
        }
        return null;
    }

    public final zzfph zzc(int i) {
        zzavf zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzfpj.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzfpj.zzb(zzk, "pcam", zzd());
        }
        return new zzfph(zzb, zzb2, zzfpj.zzb(zzk, "pcbc", zzd()), zzfpj.zzb(zzk, "pcopt", zzd()));
    }
}
