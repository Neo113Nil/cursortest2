package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgjd {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzika zzd;
    private final zzgoe zze;

    zzgjd(Context context, SharedPreferences sharedPreferences, zzika zzikaVar, zzgoe zzgoeVar) {
        this.zzc = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        zzfws.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        zzfws.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzikaVar;
        this.zze = zzgoeVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(((zzbch) this.zzd.zzb()).zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int zza = ((zzbch) this.zzd.zzb()).zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 6);
        sb.append("FBAMTD");
        sb.append(zza);
        return sb.toString();
    }

    private final String zzf() {
        int zza = ((zzbch) this.zzd.zzb()).zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 6);
        sb.append("LATMTD");
        sb.append(zza);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0140 A[LOOP:0: B:24:0x0140->B:30:0x0160, LOOP_START, PHI: r2
      0x0140: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:23:0x013e, B:30:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        boolean z;
        zzgdu zzc;
        zzgdu zzc2;
        File[] listFiles;
        String zza = zzgduVar.zza().zza();
        if (!TextUtils.isEmpty(zza) && bArr2.length != 0) {
            File file = this.zza;
            zzfws.zze(file);
            file.mkdirs();
            File zzc3 = zzfws.zzc(zza, file);
            zzc3.getClass();
            zzc3.mkdirs();
            File zza2 = zzfws.zza(zza, "pcam.jar", file);
            zza2.getClass();
            if (bArr == null || bArr.length <= 0 || zzfws.zzb(zza2, bArr)) {
                File zza3 = zzfws.zza(zza, "pcbc", file);
                zza3.getClass();
                if (zzfws.zzb(zza3, bArr2)) {
                    String zza4 = zzgduVar.zza().zza();
                    if (!TextUtils.isEmpty(zza4)) {
                        File zza5 = zzfws.zza(zza4, "pcam.jar", file);
                        zza5.getClass();
                        File zza6 = zzfws.zza(zza4, "pcbc", file);
                        zza6.getClass();
                        File zza7 = zzfws.zza(zza4, "pcam.jar", zzd());
                        zza7.getClass();
                        File zza8 = zzfws.zza(zza4, "pcbc", zzd());
                        zza8.getClass();
                        if (zza5.exists() && !zza5.renameTo(zza7)) {
                            this.zze.zzb(15318);
                        } else if (zza6.exists() && zza6.renameTo(zza8)) {
                            zzgdu zzc4 = zzc(1);
                            SharedPreferences.Editor edit = this.zzc.edit();
                            if (zzc4 != null && !zzgduVar.zza().zza().equals(zzc4.zza().zza())) {
                                edit.putString(zze(), Hex.bytesToStringLowercase(zzc4.zzaN()));
                            }
                            edit.putString(zzf(), Hex.bytesToStringLowercase(zzgduVar.zzaN()));
                            if (edit.commit()) {
                                z = true;
                                HashSet hashSet = new HashSet();
                                zzc = zzc(1);
                                if (zzc != null) {
                                    hashSet.add(zzc.zza().zza());
                                }
                                zzc2 = zzc(2);
                                if (zzc2 != null) {
                                    hashSet.add(zzc2.zza().zza());
                                }
                                listFiles = zzd().listFiles();
                                if (listFiles != null) {
                                    for (File file2 : listFiles) {
                                        String name = file2.getName();
                                        if (!hashSet.contains(name)) {
                                            File zzc5 = zzfws.zzc(name, zzd());
                                            zzc5.getClass();
                                            zzfws.zze(zzc5);
                                        }
                                    }
                                }
                                return z;
                            }
                            this.zze.zzb(15320);
                        } else {
                            this.zze.zzb(15319);
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
                    listFiles = zzd().listFiles();
                    if (listFiles != null) {
                    }
                    return z;
                }
            }
        }
        this.zze.zzb(15316);
        return false;
    }

    public final zzfwq zzb(int i) {
        zzgdu zzc = zzc(1);
        if (zzc == null) {
            this.zze.zzb(15315);
            return null;
        }
        String zza = zzc.zza().zza();
        File zza2 = zzfws.zza(zza, "pcam.jar", zzd());
        zza2.getClass();
        if (!zza2.exists()) {
            zza2 = zzfws.zza(zza, "pcam", zzd());
            zza2.getClass();
        }
        File zza3 = zzfws.zza(zza, "pcopt", zzd());
        zza3.getClass();
        File zza4 = zzfws.zza(zza, "pcbc", zzd());
        zza4.getClass();
        return new zzfwq(zzc.zza(), zza2, zza4, zza3);
    }

    public final zzgdu zzc(int i) {
        zzgdu zzd;
        String zza;
        File zza2;
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzian zzianVar = zzian.zza;
            zzd = zzgdu.zzd(zzian.zzs(stringToBytes, 0, stringToBytes.length));
            zza = zzd.zza().zza();
            zza2 = zzfws.zza(zza, "pcam.jar", zzd());
        } catch (zzicg unused) {
            this.zze.zzb(15317);
        }
        if (zza2 == null) {
            throw null;
        }
        File file = zza2;
        if (!zza2.exists()) {
            zza2 = zzfws.zza(zza, "pcam", zzd());
            if (zza2 == null) {
                throw null;
            }
            File file2 = zza2;
        }
        File zza3 = zzfws.zza(zza, "pcbc", zzd());
        if (zza3 == null) {
            throw null;
        }
        File file3 = zza3;
        if (zza2.exists() && zza3.exists()) {
            return zzd;
        }
        return null;
    }
}
