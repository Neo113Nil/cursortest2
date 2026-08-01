package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaeo extends zzaeq {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzaeo() {
        super(new zzacd());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzfj zzfjVar) {
        return Double.valueOf(Double.longBitsToDouble(zzfjVar.zzs()));
    }

    private static String zzi(zzfj zzfjVar) {
        int zzp = zzfjVar.zzp();
        int zzc = zzfjVar.zzc();
        zzfjVar.zzH(zzp);
        return new String(zzfjVar.zzI(), zzc, zzp);
    }

    private static HashMap zzj(zzfj zzfjVar) {
        int zzo = zzfjVar.zzo();
        HashMap hashMap = new HashMap(zzo);
        for (int i = 0; i < zzo; i++) {
            String zzi = zzi(zzfjVar);
            Object zzh = zzh(zzfjVar, zzfjVar.zzl());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzaeq
    protected final boolean zza(zzfj zzfjVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeq
    protected final boolean zzb(zzfj zzfjVar, long j) {
        if (zzfjVar.zzl() == 2 && "onMetaData".equals(zzi(zzfjVar)) && zzfjVar.zza() != 0 && zzfjVar.zzl() == 8) {
            HashMap zzj = zzj(zzfjVar);
            Object obj = zzj.get(TypedValues.TransitionType.S_DURATION);
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzj.get("keyframes");
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
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }

    private static Object zzh(zzfj zzfjVar, int i) {
        if (i == 0) {
            return zzg(zzfjVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzfjVar.zzl() == 1);
        }
        if (i == 2) {
            return zzi(zzfjVar);
        }
        if (i != 3) {
            if (i == 8) {
                return zzj(zzfjVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzfjVar).doubleValue());
                zzfjVar.zzH(2);
                return date;
            }
            int zzo = zzfjVar.zzo();
            ArrayList arrayList = new ArrayList(zzo);
            for (int i2 = 0; i2 < zzo; i2++) {
                Object zzh = zzh(zzfjVar, zzfjVar.zzl());
                if (zzh != null) {
                    arrayList.add(zzh);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String zzi = zzi(zzfjVar);
            int zzl = zzfjVar.zzl();
            if (zzl == 9) {
                return hashMap;
            }
            Object zzh2 = zzh(zzfjVar, zzl);
            if (zzh2 != null) {
                hashMap.put(zzi, zzh2);
            }
        }
    }
}
