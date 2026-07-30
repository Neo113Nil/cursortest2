package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzamy {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzamy(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010c A[Catch: RuntimeException -> 0x0139, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0139, blocks: (B:22:0x00b5, B:24:0x00bb, B:27:0x00cb, B:29:0x00cf, B:32:0x00de, B:34:0x00e2, B:37:0x00f3, B:39:0x00f7, B:42:0x0108, B:44:0x010c, B:46:0x0114, B:52:0x0135, B:50:0x0125, B:66:0x009a, B:20:0x0086), top: B:19:0x0086, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzamy zza(String str, zzamw zzamwVar) {
        zzamy zzamyVar;
        float f;
        int i;
        boolean z;
        int i2;
        int i3;
        int parseInt;
        zzgrc.zza(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i4 = zzamwVar.zzk;
        if (length != i4) {
            Object[] objArr = {Integer.valueOf(i4), Integer.valueOf(length), str};
            String str2 = zzfj.zza;
            zzee.zzc("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            String trim = split[zzamwVar.zza].trim();
            int i5 = zzamwVar.zzb;
            int zzd = i5 != -1 ? zzd(split[i5].trim()) : -1;
            int i6 = zzamwVar.zzc;
            Integer zzb = i6 != -1 ? zzb(split[i6].trim()) : null;
            int i7 = zzamwVar.zzd;
            Integer zzb2 = i7 != -1 ? zzb(split[i7].trim()) : null;
            int i8 = zzamwVar.zze;
            if (i8 != -1) {
                String trim2 = split[i8].trim();
                try {
                    try {
                        f = Float.parseFloat(trim2);
                        zzamyVar = null;
                    } catch (NumberFormatException e) {
                        zzamyVar = null;
                        StringBuilder sb = new StringBuilder(String.valueOf(trim2).length() + 29);
                        sb.append("Failed to parse font size: '");
                        sb.append(trim2);
                        sb.append("'");
                        zzee.zzd("SsaStyle", sb.toString(), e);
                    }
                    i = zzamwVar.zzf;
                    boolean z2 = false;
                    if (i == -1 && zze(split[i].trim())) {
                        z = false;
                        z2 = true;
                    } else {
                        z = false;
                    }
                    int i9 = zzamwVar.zzg;
                    boolean z3 = (i9 == -1 && zze(split[i9].trim())) ? true : z;
                    int i10 = zzamwVar.zzh;
                    boolean z4 = i10 == -1 && zze(split[i10].trim());
                    int i11 = zzamwVar.zzi;
                    boolean z5 = i11 == -1 && zze(split[i11].trim());
                    i2 = zzamwVar.zzj;
                    if (i2 != -1) {
                        String trim3 = split[i2].trim();
                        try {
                            parseInt = Integer.parseInt(trim3.trim());
                        } catch (NumberFormatException unused) {
                        }
                        if (parseInt == 1 || parseInt == 3) {
                            i3 = parseInt;
                            return new zzamy(trim, zzd, zzb, zzb2, f, z2, z3, z4, z5, i3);
                        }
                        String.valueOf(trim3);
                        zzee.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(trim3)));
                    }
                    i3 = -1;
                    return new zzamy(trim, zzd, zzb, zzb2, f, z2, z3, z4, z5, i3);
                } catch (RuntimeException e2) {
                    e = e2;
                    StringBuilder sb2 = new StringBuilder(str.length() + 36);
                    sb2.append("Skipping malformed 'Style:' line: '");
                    sb2.append(str);
                    sb2.append("'");
                    zzee.zzd("SsaStyle", sb2.toString(), e);
                    return zzamyVar;
                }
            }
            zzamyVar = null;
            f = -3.4028235E38f;
            i = zzamwVar.zzf;
            boolean z22 = false;
            if (i == -1) {
            }
            z = false;
            int i92 = zzamwVar.zzg;
            if (i92 == -1) {
            }
            int i102 = zzamwVar.zzh;
            if (i102 == -1) {
            }
            int i112 = zzamwVar.zzi;
            if (i112 == -1) {
            }
            i2 = zzamwVar.zzj;
            if (i2 != -1) {
            }
            i3 = -1;
            return new zzamy(trim, zzd, zzb, zzb2, f, z22, z3, z4, z5, i3);
        } catch (RuntimeException e3) {
            e = e3;
            zzamyVar = null;
        }
    }

    public static Integer zzb(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgrc.zza(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgxz.zza(((parseLong >> 24) & 255) ^ 255), zzgxz.zza(parseLong & 255), zzgxz.zza((parseLong >> 8) & 255), zzgxz.zza((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            zzee.zzd("SsaStyle", sb.toString(), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                String.valueOf(str);
                zzee.zzc("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            zzee.zzd("SsaStyle", sb.toString(), e);
            return false;
        }
    }
}
