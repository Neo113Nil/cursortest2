package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzico {
    zzico() {
    }

    public static final List zza(Object obj, long j) {
        zzicd zzicdVar = (zzicd) zziem.zzn(obj, j);
        if (zzicdVar.zza()) {
            return zzicdVar;
        }
        int size = zzicdVar.size();
        zzicd zzh = zzicdVar.zzh(size == 0 ? 10 : size + size);
        zziem.zzo(obj, j, zzh);
        return zzh;
    }
}
