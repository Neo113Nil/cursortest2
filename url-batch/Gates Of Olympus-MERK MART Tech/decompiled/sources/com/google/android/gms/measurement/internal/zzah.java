package com.google.android.gms.measurement.internal;

import coil3.disk.DiskLruCache;
import com.google.android.gms.measurement.internal.zzin;
import java.util.EnumMap;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
final class zzah {
    private final EnumMap<zzin.zza, zzak> zza;

    public final zzak zza(zzin.zza zzaVar) {
        zzak zzakVar = this.zza.get(zzaVar);
        return zzakVar == null ? zzak.UNSET : zzakVar;
    }

    public static zzah zza(String str) {
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        if (str.length() >= zzin.zza.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                zzin.zza[] values = zzin.zza.values();
                int length = values.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put((EnumMap) values[i], (zzin.zza) zzak.zza(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new zzah(enumMap);
            }
        }
        return new zzah();
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder(DiskLruCache.VERSION);
        for (zzin.zza zzaVar : zzin.zza.values()) {
            zzak zzakVar = this.zza.get(zzaVar);
            if (zzakVar == null) {
                zzakVar = zzak.UNSET;
            }
            c = zzakVar.zzl;
            sb.append(c);
        }
        return sb.toString();
    }

    zzah() {
        this.zza = new EnumMap<>(zzin.zza.class);
    }

    private zzah(EnumMap<zzin.zza, zzak> enumMap) {
        EnumMap<zzin.zza, zzak> enumMap2 = new EnumMap<>((Class<zzin.zza>) zzin.zza.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public final void zza(zzin.zza zzaVar, int i) {
        zzak zzakVar = zzak.UNSET;
        if (i == -30) {
            zzakVar = zzak.TCF;
        } else {
            if (i != -20) {
                if (i == -10) {
                    zzakVar = zzak.MANIFEST;
                } else if (i != 0) {
                    if (i == 30) {
                        zzakVar = zzak.INITIALIZATION;
                    }
                }
            }
            zzakVar = zzak.API;
        }
        this.zza.put((EnumMap<zzin.zza, zzak>) zzaVar, (zzin.zza) zzakVar);
    }

    public final void zza(zzin.zza zzaVar, zzak zzakVar) {
        this.zza.put((EnumMap<zzin.zza, zzak>) zzaVar, (zzin.zza) zzakVar);
    }
}
