package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfeu {
    public static com.google.android.gms.ads.internal.client.zzq zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfdv zzfdvVar = (zzfdv) it.next();
            if (zzfdvVar.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfdvVar.zza, zzfdvVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfdv zzb(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzqVar.zzi ? new zzfdv(-3, 0, true) : new zzfdv(zzqVar.zze, zzqVar.zzb, false);
    }
}
