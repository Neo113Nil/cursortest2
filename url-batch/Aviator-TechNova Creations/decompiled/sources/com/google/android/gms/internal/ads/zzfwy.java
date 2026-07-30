package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfwy {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfwf zzd;
    private boolean zze;

    public zzfwy(Context context, zzbch zzbchVar, zzfwf zzfwfVar, boolean z) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(zzbchVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfwfVar;
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

    private static String zzh(zzbcj zzbcjVar) {
        zzbco zzi = zzbcp.zzi();
        zzi.zza(zzbcjVar.zza().zza());
        zzi.zzb(zzbcjVar.zza().zzb());
        zzi.zzd(zzbcjVar.zza().zzd());
        zzi.zze(zzbcjVar.zza().zze());
        zzi.zzc(zzbcjVar.zza().zzc());
        return Hex.bytesToStringLowercase(((zzbcp) zzi.zzbu()).zzaN());
    }

    private final void zzi(int i, long j) {
        this.zzd.zza(i, j);
    }

    private final void zzj(int i, long j, String str) {
        this.zzd.zzb(i, j, str);
    }

    private final zzbcp zzk(int i) {
        String string = i == 1 ? this.zzb.getString(zzg(), null) : this.zzb.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzian zzianVar = zzian.zza;
            return zzbcp.zzh(zzian.zzs(stringToBytes, 0, stringToBytes.length), this.zze ? zzibb.zza() : zzibb.zzb());
        } catch (zzicg unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzbcj zzbcjVar, zzfwx zzfwxVar) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzbcp zzk = zzk(1);
            String zza = zzbcjVar.zza().zza();
            if (zzk != null && zzk.zza().equals(zza)) {
                zzi(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File zze = zze(zza);
            if (zze.exists()) {
                boolean isDirectory = zze.isDirectory();
                String str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
                if (true != isDirectory) {
                    str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                boolean isFile = zze.isFile();
                String str2 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
                if (true != isFile) {
                    str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                z = false;
                StringBuilder sb = new StringBuilder(7);
                sb.append("d:");
                sb.append(str);
                sb.append(",f:");
                sb.append(str2);
                zzj(4023, currentTimeMillis2, sb.toString());
                zzi(4015, currentTimeMillis2);
            } else {
                z = false;
                if (!zze.mkdirs()) {
                    boolean canWrite = zze.canWrite();
                    String str3 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
                    if (true != canWrite) {
                        str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                    }
                    zzj(4024, currentTimeMillis2, "cw:".concat(str3));
                    zzi(4015, currentTimeMillis2);
                    return false;
                }
            }
            File zze2 = zze(zza);
            File file = new File(zze2, "pcam.jar");
            File file2 = new File(zze2, "pcbc");
            if (!zzfws.zzb(file, zzbcjVar.zzb().zzy())) {
                zzi(4016, currentTimeMillis);
                return z;
            }
            if (!zzfws.zzb(file2, zzbcjVar.zzc().zzy())) {
                zzi(4017, currentTimeMillis);
                return z;
            }
            if (zzfwxVar != null && !zzfwxVar.zza(file)) {
                zzi(4018, currentTimeMillis);
                zzfws.zze(zze2);
                return z;
            }
            String zzh = zzh(zzbcjVar);
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
            zzbcp zzk2 = zzk(1);
            if (zzk2 != null) {
                hashSet.add(zzk2.zza());
            }
            zzbcp zzk3 = zzk(2);
            if (zzk3 != null) {
                hashSet.add(zzk3.zza());
            }
            boolean z2 = z;
            File[] listFiles = new File(this.zza.getDir("pccache", z2 ? 1 : 0), this.zzc).listFiles();
            int length = listFiles.length;
            for (int i = z2 ? 1 : 0; i < length; i++) {
                File file3 = listFiles[i];
                if (!hashSet.contains(file3.getName())) {
                    zzfws.zze(file3);
                }
            }
            zzi(5014, currentTimeMillis);
            return true;
        }
    }

    public final boolean zzb(zzbcj zzbcjVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            if (!zzfws.zzb(new File(zze(zzbcjVar.zza().zza()), "pcbc"), zzbcjVar.zzc().zzy())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            String zzh = zzh(zzbcjVar);
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

    public final zzfwq zzc(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzbcp zzk = zzk(1);
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
            return new zzfwq(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzbcp zzk = zzk(1);
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
