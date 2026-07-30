package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzahk extends zzahm {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzahk() {
        super(new zzaer());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzer zzerVar) {
        return Double.valueOf(Double.longBitsToDouble(zzerVar.zzD()));
    }

    private static String zzh(zzer zzerVar) {
        int zzt = zzerVar.zzt();
        int zzg = zzerVar.zzg();
        zzerVar.zzk(zzt);
        return new String(zzerVar.zzi(), zzg, zzt);
    }

    private static HashMap zzi(zzer zzerVar) {
        int zzH = zzerVar.zzH();
        HashMap hashMap = new HashMap(zzH);
        for (int i = 0; i < zzH; i++) {
            String zzh = zzh(zzerVar);
            Object zzj = zzj(zzerVar, zzerVar.zzs());
            if (zzj != null) {
                hashMap.put(zzh, zzj);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    protected final boolean zza(zzer zzerVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    protected final boolean zzb(zzer zzerVar, long j) {
        if (zzerVar.zzs() == 2 && "onMetaData".equals(zzh(zzerVar)) && zzerVar.zzd() != 0 && zzerVar.zzs() == 8) {
            HashMap zzi = zzi(zzerVar);
            Object obj = zzi.get(TypedValues.TransitionType.S_DURATION);
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzi.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzc;
    }

    public final long[] zze() {
        return this.zzd;
    }

    private static Object zzj(zzer zzerVar, int i) {
        if (i == 0) {
            return zzg(zzerVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzerVar.zzs() == 1);
        }
        if (i == 2) {
            return zzh(zzerVar);
        }
        if (i != 3) {
            if (i == 8) {
                return zzi(zzerVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzerVar).doubleValue());
                zzerVar.zzk(2);
                return date;
            }
            int zzH = zzerVar.zzH();
            ArrayList arrayList = new ArrayList(zzH);
            for (int i2 = 0; i2 < zzH; i2++) {
                Object zzj = zzj(zzerVar, zzerVar.zzs());
                if (zzj != null) {
                    arrayList.add(zzj);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String zzh = zzh(zzerVar);
            int zzs = zzerVar.zzs();
            if (zzs == 9) {
                return hashMap;
            }
            Object zzj2 = zzj(zzerVar, zzs);
            if (zzj2 != null) {
                hashMap.put(zzh, zzj2);
            }
        }
    }
}
