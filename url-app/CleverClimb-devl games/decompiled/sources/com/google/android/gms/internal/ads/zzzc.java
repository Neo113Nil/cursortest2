package com.google.android.gms.internal.ads;

import com.google.ads.a;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;

@zzadh
/* loaded from: classes2.dex */
public final class zzzc {
    public static int zza(a.EnumC0366a enumC0366a) {
        switch (enumC0366a) {
            case INVALID_REQUEST:
                return 1;
            case NETWORK_ERROR:
                return 2;
            case NO_FILL:
                return 3;
            default:
                return 0;
        }
    }

    public static MediationAdRequest zza(zzjj zzjjVar, boolean z) {
        a.b bVar;
        HashSet hashSet = zzjjVar.zzapy != null ? new HashSet(zzjjVar.zzapy) : null;
        Date date = new Date(zzjjVar.zzapw);
        switch (zzjjVar.zzapx) {
            case 1:
                bVar = a.b.MALE;
                break;
            case 2:
                bVar = a.b.FEMALE;
                break;
            default:
                bVar = a.b.UNKNOWN;
                break;
        }
        return new MediationAdRequest(date, bVar, hashSet, z, zzjjVar.zzaqe);
    }
}
