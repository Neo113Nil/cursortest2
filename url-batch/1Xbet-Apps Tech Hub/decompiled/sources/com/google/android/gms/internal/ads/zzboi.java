package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzboi implements zzbmz, zzboh {
    private final zzboh zza;
    private final HashSet zzb = new HashSet();

    public zzboi(zzboh zzbohVar) {
        this.zza = zzbohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz, com.google.android.gms.internal.ads.zzbnk
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz, com.google.android.gms.internal.ads.zzbnk
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbmy.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbkd) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbkd) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbmy.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz, com.google.android.gms.internal.ads.zzbmx
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbmy.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbmy.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zzq(String str, zzbkd zzbkdVar) {
        this.zza.zzq(str, zzbkdVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbkdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zzr(String str, zzbkd zzbkdVar) {
        this.zza.zzr(str, zzbkdVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbkdVar));
    }
}
