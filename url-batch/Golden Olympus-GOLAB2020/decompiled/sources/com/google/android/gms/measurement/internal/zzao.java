package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* loaded from: classes.dex */
final class zzao {
    private final EnumMap zza;

    zzao() {
        this.zza = new EnumMap(zzjw.class);
    }

    public static zzao zzb(String str) {
        EnumMap enumMap = new EnumMap(zzjw.class);
        if (str.length() >= zzjw.values().length) {
            int i4 = 0;
            if (str.charAt(0) == '1') {
                zzjw[] values = zzjw.values();
                int length = values.length;
                int i5 = 1;
                while (i4 < length) {
                    enumMap.put((EnumMap) values[i4], (zzjw) zzan.zzb(str.charAt(i5)));
                    i4++;
                    i5++;
                }
                return new zzao(enumMap);
            }
        }
        return new zzao();
    }

    public final String toString() {
        char c4;
        StringBuilder sb = new StringBuilder("1");
        for (zzjw zzjwVar : zzjw.values()) {
            zzan zzanVar = (zzan) this.zza.get(zzjwVar);
            if (zzanVar == null) {
                zzanVar = zzan.UNSET;
            }
            c4 = zzanVar.zzl;
            sb.append(c4);
        }
        return sb.toString();
    }

    public final zzan zza(zzjw zzjwVar) {
        zzan zzanVar = (zzan) this.zza.get(zzjwVar);
        return zzanVar == null ? zzan.UNSET : zzanVar;
    }

    public final void zzc(zzjw zzjwVar, int i4) {
        zzan zzanVar = zzan.UNSET;
        if (i4 != -30) {
            if (i4 != -20) {
                if (i4 == -10) {
                    zzanVar = zzan.MANIFEST;
                } else if (i4 != 0) {
                    if (i4 == 30) {
                        zzanVar = zzan.INITIALIZATION;
                    }
                }
            }
            zzanVar = zzan.API;
        } else {
            zzanVar = zzan.TCF;
        }
        this.zza.put((EnumMap) zzjwVar, (zzjw) zzanVar);
    }

    public final void zzd(zzjw zzjwVar, zzan zzanVar) {
        this.zza.put((EnumMap) zzjwVar, (zzjw) zzanVar);
    }

    private zzao(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjw.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
