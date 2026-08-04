package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfpy {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfpf zzd;
    private boolean zze;

    public zzfpy(Context context, zzaxq zzaxqVar, zzfpf zzfpfVar, boolean z) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(zzaxqVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfpfVar;
        this.zze = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        String str = this.zzc;
        String.valueOf(str);
        return "FBAMTD".concat(String.valueOf(str));
    }

    private final String zzg() {
        String str = this.zzc;
        String.valueOf(str);
        return "LATMTD".concat(String.valueOf(str));
    }

    private static String zzh(zzaxs zzaxsVar) {
        zzaxv zzi = zzaxw.zzi();
        zzi.zza(zzaxsVar.zza().zza());
        zzi.zzb(zzaxsVar.zza().zzb());
        zzi.zzd(zzaxsVar.zza().zzd());
        zzi.zze(zzaxsVar.zza().zze());
        zzi.zzc(zzaxsVar.zza().zzc());
        return Hex.bytesToStringLowercase(((zzaxw) zzi.zzbu()).zzaN());
    }

    private final void zzi(int i, long j) {
        this.zzd.zza(i, j);
    }

    private final void zzj(int i, long j, String str) {
        this.zzd.zzb(i, j, str);
    }

    private final zzaxw zzk(int i) {
        String string = i == 1 ? this.zzb.getString(zzg(), null) : this.zzb.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzhhb zzhhbVar = zzhhb.zzb;
            return zzaxw.zzh(zzhhb.zzr(stringToBytes, 0, stringToBytes.length), this.zze ? zzhhr.zza() : zzhhr.zzb());
        } catch (zzhiw unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzaxs zzaxsVar, zzfpx zzfpxVar) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzaxw zzk = zzk(1);
            String zza = zzaxsVar.zza().zza();
            if (zzk != null && zzk.zza().equals(zza)) {
                zzi(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File zze = zze(zza);
            if (zze.exists()) {
                String str = true != zze.isDirectory() ? "0" : "1";
                String str2 = true != zze.isFile() ? "0" : "1";
                z = false;
                StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                sb.append("d:");
                sb.append(str);
                sb.append(",f:");
                sb.append(str2);
                zzj(4023, currentTimeMillis2, sb.toString());
                zzi(4015, currentTimeMillis2);
            } else {
                z = false;
                if (!zze.mkdirs()) {
                    zzj(4024, currentTimeMillis2, "cw:".concat(true != zze.canWrite() ? "0" : "1"));
                    zzi(4015, currentTimeMillis2);
                    return false;
                }
            }
            File zze2 = zze(zza);
            File file = new File(zze2, "pcam.jar");
            File file2 = new File(zze2, "pcbc");
            if (!zzfps.zzb(file, zzaxsVar.zzb().zzv())) {
                zzi(4016, currentTimeMillis);
                return z;
            }
            if (!zzfps.zzb(file2, zzaxsVar.zzc().zzv())) {
                zzi(4017, currentTimeMillis);
                return z;
            }
            if (zzfpxVar != null && !zzfpxVar.zza(file)) {
                zzi(4018, currentTimeMillis);
                zzfps.zze(zze2);
                return z;
            }
            String zzh = zzh(zzaxsVar);
            long currentTimeMillis3 = System.currentTimeMillis();
            SharedPreferences sharedPreferences = this.zzb;
            String string = sharedPreferences.getString(zzg(), null);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(zzg(), zzh);
            if (string != null) {
                edit.putString(zzf(), string);
            }
            if (!edit.commit()) {
                zzi(4019, currentTimeMillis3);
                return z;
            }
            HashSet hashSet = new HashSet();
            zzaxw zzk2 = zzk(1);
            if (zzk2 != null) {
                hashSet.add(zzk2.zza());
            }
            zzaxw zzk3 = zzk(2);
            if (zzk3 != null) {
                hashSet.add(zzk3.zza());
            }
            boolean z2 = z;
            File[] listFiles = new File(this.zza.getDir("pccache", z2 ? 1 : 0), this.zzc).listFiles();
            int length = listFiles.length;
            for (int i = z2 ? 1 : 0; i < length; i++) {
                File file3 = listFiles[i];
                if (!hashSet.contains(file3.getName())) {
                    zzfps.zze(file3);
                }
            }
            zzi(5014, currentTimeMillis);
            return true;
        }
    }

    public final boolean zzb(zzaxs zzaxsVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            if (!zzfps.zzb(new File(zze(zzaxsVar.zza().zza()), "pcbc"), zzaxsVar.zzc().zzv())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            String zzh = zzh(zzaxsVar);
            SharedPreferences.Editor edit = this.zzb.edit();
            edit.putString(zzg(), zzh);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final zzfpq zzc(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzaxw zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            File zze = zze(zzk.zza());
            File file = new File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze, "pcam");
            }
            File file2 = new File(zze, "pcbc");
            File file3 = new File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new zzfpq(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzaxw zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze = zze(zzk.zza());
            if (!new File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            }
            if (new File(zze, "pcbc").exists()) {
                zzi(5019, currentTimeMillis);
                return true;
            }
            zzi(4027, currentTimeMillis);
            return false;
        }
    }
}
