package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcfa implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    final zzcez zza(zzcdw zzcdwVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcez zzcezVar = (zzcez) it.next();
            if (zzcezVar.zza == zzcdwVar) {
                return zzcezVar;
            }
        }
        return null;
    }

    public final void zzb(zzcez zzcezVar) {
        this.zza.add(zzcezVar);
    }

    public final void zzc(zzcez zzcezVar) {
        this.zza.remove(zzcezVar);
    }

    public final boolean zzd(zzcdw zzcdwVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcez zzcezVar = (zzcez) it.next();
            if (zzcezVar.zza == zzcdwVar) {
                arrayList.add(zzcezVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcez) it2.next()).zzb.zzf();
        }
        return true;
    }
}
