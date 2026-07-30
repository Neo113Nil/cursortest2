package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbsn implements zzbre, zzbsm {
    private final zzbsm zza;
    private final HashSet zzb = new HashSet();

    public zzbsn(zzbsm zzbsmVar) {
        this.zza = zzbsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbre, com.google.android.gms.internal.ads.zzbrp
    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final void zzf() {
        HashSet hashSet = this.zzb;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            String obj = ((zzboh) simpleEntry.getValue()).toString();
            String.valueOf(obj);
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(obj)));
            this.zza.zzn((String) simpleEntry.getKey(), (zzboh) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzm(String str, zzboh zzbohVar) {
        this.zza.zzm(str, zzbohVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbohVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzn(String str, zzboh zzbohVar) {
        this.zza.zzn(str, zzbohVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbohVar));
    }
}
