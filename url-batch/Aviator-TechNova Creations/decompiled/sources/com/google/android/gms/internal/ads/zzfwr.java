package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfwr {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzbch zzd;

    public zzfwr(Context context, zzbch zzbchVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfws.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfws.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzbchVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int zza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 6);
        sb.append("FBAMTD");
        sb.append(zza);
        return sb.toString();
    }

    private final String zzf() {
        int zza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 6);
        sb.append("LATMTD");
        sb.append(zza);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzbcj zzbcjVar, zzfwx zzfwxVar) {
        boolean z;
        zzbcp zzc;
        zzbcp zzc2;
        String zza = zzbcjVar.zza().zza();
        byte[] zzy = zzbcjVar.zzb().zzy();
        byte[] zzy2 = zzbcjVar.zzc().zzy();
        if (!TextUtils.isEmpty(zza) && zzy2 != null && zzy2.length != 0) {
            File file = this.zza;
            zzfws.zze(file);
            file.mkdirs();
            zzfws.zzc(zza, file).mkdirs();
            File zza2 = zzfws.zza(zza, "pcam.jar", file);
            if ((zzy == null || zzy.length <= 0 || zzfws.zzb(zza2, zzy)) && zzfws.zzb(zzfws.zza(zza, "pcbc", file), zzy2)) {
                File zza3 = zzfws.zza(zzbcjVar.zza().zza(), "pcam.jar", file);
                if (zza3.exists() && zzfwxVar != null && !zzfwxVar.zza(zza3)) {
                    return false;
                }
                String zza4 = zzbcjVar.zza().zza();
                if (!TextUtils.isEmpty(zza4)) {
                    File zza5 = zzfws.zza(zza4, "pcam.jar", file);
                    File zza6 = zzfws.zza(zza4, "pcbc", file);
                    File zza7 = zzfws.zza(zza4, "pcam.jar", zzd());
                    File zza8 = zzfws.zza(zza4, "pcbc", zzd());
                    if ((!zza5.exists() || zza5.renameTo(zza7)) && zza6.exists() && zza6.renameTo(zza8)) {
                        zzbco zzi = zzbcp.zzi();
                        zzi.zza(zzbcjVar.zza().zza());
                        zzi.zzb(zzbcjVar.zza().zzb());
                        zzi.zzd(zzbcjVar.zza().zzd());
                        zzi.zze(zzbcjVar.zza().zze());
                        zzi.zzc(zzbcjVar.zza().zzc());
                        zzbcp zzbcpVar = (zzbcp) zzi.zzbu();
                        zzbcp zzc3 = zzc(1);
                        SharedPreferences.Editor edit = this.zzc.edit();
                        if (zzc3 != null && !zzbcpVar.zza().equals(zzc3.zza())) {
                            edit.putString(zze(), Hex.bytesToStringLowercase(zzc3.zzaN()));
                        }
                        edit.putString(zzf(), Hex.bytesToStringLowercase(zzbcpVar.zzaN()));
                        if (edit.commit()) {
                            z = true;
                            HashSet hashSet = new HashSet();
                            zzc = zzc(1);
                            if (zzc != null) {
                                hashSet.add(zzc.zza());
                            }
                            zzc2 = zzc(2);
                            if (zzc2 != null) {
                                hashSet.add(zzc2.zza());
                            }
                            for (File file2 : zzd().listFiles()) {
                                String name = file2.getName();
                                if (!hashSet.contains(name)) {
                                    zzfws.zze(zzfws.zzc(name, zzd()));
                                }
                            }
                            return z;
                        }
                    }
                }
                z = false;
                HashSet hashSet2 = new HashSet();
                zzc = zzc(1);
                if (zzc != null) {
                }
                zzc2 = zzc(2);
                if (zzc2 != null) {
                }
                while (r4 < r1) {
                }
                return z;
            }
        }
        return false;
    }

    public final zzfwq zzb(int i) {
        zzbcp zzc = zzc(1);
        if (zzc == null) {
            return null;
        }
        String zza = zzc.zza();
        File zza2 = zzfws.zza(zza, "pcam.jar", zzd());
        if (!zza2.exists()) {
            zza2 = zzfws.zza(zza, "pcam", zzd());
        }
        return new zzfwq(zzc, zza2, zzfws.zza(zza, "pcbc", zzd()), zzfws.zza(zza, "pcopt", zzd()));
    }

    final zzbcp zzc(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzian zzianVar = zzian.zza;
            zzbcp zzg = zzbcp.zzg(zzian.zzs(stringToBytes, 0, stringToBytes.length));
            String zza = zzg.zza();
            File zza2 = zzfws.zza(zza, "pcam.jar", zzd());
            if (!zza2.exists()) {
                zza2 = zzfws.zza(zza, "pcam", zzd());
            }
            File zza3 = zzfws.zza(zza, "pcbc", zzd());
            if (zza2.exists()) {
                if (zza3.exists()) {
                    return zzg;
                }
            }
        } catch (zzicg unused) {
        }
        return null;
    }
}
