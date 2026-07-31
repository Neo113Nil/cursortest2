package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzjx {
    public static final zzjx zza = new zzjx(null, null, 100);
    private final EnumMap zzb;
    private final int zzc;

    public zzjx(Boolean bool, Boolean bool2, int i4) {
        EnumMap enumMap = new EnumMap(zzjw.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap) zzjw.AD_STORAGE, (zzjw) zzh(null));
        enumMap.put((EnumMap) zzjw.ANALYTICS_STORAGE, (zzjw) zzh(null));
        this.zzc = i4;
    }

    static char zza(zzju zzjuVar) {
        if (zzjuVar == null) {
            return '-';
        }
        int ordinal = zzjuVar.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    static zzju zzd(String str) {
        return str == null ? zzju.UNINITIALIZED : str.equals("granted") ? zzju.GRANTED : str.equals("denied") ? zzju.DENIED : zzju.UNINITIALIZED;
    }

    static zzju zzg(char c4) {
        return c4 != '+' ? c4 != '0' ? c4 != '1' ? zzju.UNINITIALIZED : zzju.GRANTED : zzju.DENIED : zzju.POLICY;
    }

    static zzju zzh(Boolean bool) {
        return bool == null ? zzju.UNINITIALIZED : bool.booleanValue() ? zzju.GRANTED : zzju.DENIED;
    }

    public static zzjx zzi(Bundle bundle, int i4) {
        zzjw[] zzjwVarArr;
        if (bundle == null) {
            return new zzjx(null, null, i4);
        }
        EnumMap enumMap = new EnumMap(zzjw.class);
        zzjwVarArr = zzjv.STORAGE.zzd;
        for (zzjw zzjwVar : zzjwVarArr) {
            enumMap.put((EnumMap) zzjwVar, (zzjw) zzd(bundle.getString(zzjwVar.zze)));
        }
        return new zzjx(enumMap, i4);
    }

    public static zzjx zzj(zzju zzjuVar, zzju zzjuVar2, int i4) {
        EnumMap enumMap = new EnumMap(zzjw.class);
        enumMap.put((EnumMap) zzjw.AD_STORAGE, (zzjw) zzjuVar);
        enumMap.put((EnumMap) zzjw.ANALYTICS_STORAGE, (zzjw) zzjuVar2);
        return new zzjx(enumMap, -10);
    }

    public static zzjx zzk(String str, int i4) {
        EnumMap enumMap = new EnumMap(zzjw.class);
        zzjw[] zzb = zzjv.STORAGE.zzb();
        for (int i5 = 0; i5 < zzb.length; i5++) {
            String str2 = str == null ? "" : str;
            zzjw zzjwVar = zzb[i5];
            int i6 = i5 + 2;
            if (i6 < str2.length()) {
                enumMap.put((EnumMap) zzjwVar, (zzjw) zzg(str2.charAt(i6)));
            } else {
                enumMap.put((EnumMap) zzjwVar, (zzjw) zzju.UNINITIALIZED);
            }
        }
        return new zzjx(enumMap, i4);
    }

    static String zzn(int i4) {
        return i4 != -30 ? i4 != -20 ? i4 != -10 ? i4 != 0 ? i4 != 30 ? i4 != 90 ? i4 != 100 ? "OTHER" : GrsBaseInfo.CountryCodeSource.UNKNOWN : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    static String zzo(zzju zzjuVar) {
        int ordinal = zzjuVar.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    public static boolean zzs(int i4, int i5) {
        int i6 = -30;
        if (i4 == -20) {
            if (i5 == -30) {
                return true;
            }
            i4 = -20;
        }
        if (i4 != -30) {
            i6 = i4;
        } else if (i5 == -20) {
            return true;
        }
        return i6 == i5 || i4 < i5;
    }

    public final boolean equals(Object obj) {
        zzjw[] zzjwVarArr;
        if (!(obj instanceof zzjx)) {
            return false;
        }
        zzjx zzjxVar = (zzjx) obj;
        zzjwVarArr = zzjv.STORAGE.zzd;
        for (zzjw zzjwVar : zzjwVarArr) {
            if (this.zzb.get(zzjwVar) != zzjxVar.zzb.get(zzjwVar)) {
                return false;
            }
        }
        return this.zzc == zzjxVar.zzc;
    }

    public final int hashCode() {
        Iterator it = this.zzb.values().iterator();
        int i4 = this.zzc * 17;
        while (it.hasNext()) {
            i4 = (i4 * 31) + ((zzju) it.next()).hashCode();
        }
        return i4;
    }

    public final String toString() {
        zzjw[] zzjwVarArr;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzn(this.zzc));
        zzjwVarArr = zzjv.STORAGE.zzd;
        for (zzjw zzjwVar : zzjwVarArr) {
            sb.append(StringUtils.COMMA);
            sb.append(zzjwVar.zze);
            sb.append("=");
            zzju zzjuVar = (zzju) this.zzb.get(zzjwVar);
            if (zzjuVar == null) {
                zzjuVar = zzju.UNINITIALIZED;
            }
            sb.append(zzjuVar);
        }
        return sb.toString();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final Bundle zzc() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzb.entrySet()) {
            String zzo = zzo((zzju) entry.getValue());
            if (zzo != null) {
                bundle.putString(((zzjw) entry.getKey()).zze, zzo);
            }
        }
        return bundle;
    }

    public final zzju zze() {
        zzju zzjuVar = (zzju) this.zzb.get(zzjw.AD_STORAGE);
        return zzjuVar == null ? zzju.UNINITIALIZED : zzjuVar;
    }

    public final zzju zzf() {
        zzju zzjuVar = (zzju) this.zzb.get(zzjw.ANALYTICS_STORAGE);
        return zzjuVar == null ? zzju.UNINITIALIZED : zzjuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjx zzl(zzjx zzjxVar) {
        zzjw[] zzjwVarArr;
        EnumMap enumMap = new EnumMap(zzjw.class);
        zzjwVarArr = zzjv.STORAGE.zzd;
        for (zzjw zzjwVar : zzjwVarArr) {
            zzju zzjuVar = (zzju) this.zzb.get(zzjwVar);
            zzju zzjuVar2 = (zzju) zzjxVar.zzb.get(zzjwVar);
            if (zzjuVar != null) {
                if (zzjuVar2 != null) {
                    zzju zzjuVar3 = zzju.UNINITIALIZED;
                    if (zzjuVar != zzjuVar3) {
                        if (zzjuVar2 != zzjuVar3) {
                            zzju zzjuVar4 = zzju.POLICY;
                            if (zzjuVar != zzjuVar4) {
                                if (zzjuVar2 != zzjuVar4) {
                                    zzju zzjuVar5 = zzju.DENIED;
                                    zzjuVar = (zzjuVar == zzjuVar5 || zzjuVar2 == zzjuVar5) ? zzjuVar5 : zzju.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (zzjuVar == null) {
                    enumMap.put((EnumMap) zzjwVar, (zzjw) zzjuVar);
                }
            }
            zzjuVar = zzjuVar2;
            if (zzjuVar == null) {
            }
        }
        return new zzjx(enumMap, 100);
    }

    public final zzjx zzm(zzjx zzjxVar) {
        zzjw[] zzjwVarArr;
        EnumMap enumMap = new EnumMap(zzjw.class);
        zzjwVarArr = zzjv.STORAGE.zzd;
        for (zzjw zzjwVar : zzjwVarArr) {
            zzju zzjuVar = (zzju) this.zzb.get(zzjwVar);
            if (zzjuVar == zzju.UNINITIALIZED) {
                zzjuVar = (zzju) zzjxVar.zzb.get(zzjwVar);
            }
            if (zzjuVar != null) {
                enumMap.put((EnumMap) zzjwVar, (zzjw) zzjuVar);
            }
        }
        return new zzjx(enumMap, this.zzc);
    }

    public final String zzp() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zzjw zzjwVar : zzjv.STORAGE.zzb()) {
            zzju zzjuVar = (zzju) this.zzb.get(zzjwVar);
            char c4 = '-';
            if (zzjuVar != null && (ordinal = zzjuVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c4 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c4 = '1';
            }
            sb.append(c4);
        }
        return sb.toString();
    }

    public final String zzq() {
        StringBuilder sb = new StringBuilder("G1");
        for (zzjw zzjwVar : zzjv.STORAGE.zzb()) {
            sb.append(zza((zzju) this.zzb.get(zzjwVar)));
        }
        return sb.toString();
    }

    public final boolean zzr(zzjw zzjwVar) {
        return ((zzju) this.zzb.get(zzjwVar)) != zzju.DENIED;
    }

    public final boolean zzt() {
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (((zzju) it.next()) != zzju.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzu(zzjx zzjxVar) {
        EnumMap enumMap = this.zzb;
        for (zzjw zzjwVar : (zzjw[]) enumMap.keySet().toArray(new zzjw[0])) {
            zzju zzjuVar = (zzju) enumMap.get(zzjwVar);
            zzju zzjuVar2 = (zzju) zzjxVar.zzb.get(zzjwVar);
            zzju zzjuVar3 = zzju.DENIED;
            if (zzjuVar == zzjuVar3 && zzjuVar2 != zzjuVar3) {
                return true;
            }
        }
        return false;
    }

    private zzjx(EnumMap enumMap, int i4) {
        EnumMap enumMap2 = new EnumMap(zzjw.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i4;
    }
}
