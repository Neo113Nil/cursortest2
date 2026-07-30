package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzvs extends zzvj {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhz zzc;

    protected zzvs() {
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    protected final void zzM() {
        for (zzvr zzvrVar : this.zza.values()) {
            zzvrVar.zza.zzq(zzvrVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    protected void zza(zzhz zzhzVar) {
        this.zzc = zzhzVar;
        this.zzb = zzfj.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    protected final void zzc() {
        for (zzvr zzvrVar : this.zza.values()) {
            zzvrVar.zza.zzr(zzvrVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    protected void zzd() {
        HashMap hashMap = this.zza;
        for (zzvr zzvrVar : hashMap.values()) {
            zzwm zzwmVar = zzvrVar.zza;
            zzwmVar.zzs(zzvrVar.zzb);
            zzvq zzvqVar = zzvrVar.zzc;
            zzwmVar.zzm(zzvqVar);
            zzwmVar.zzo(zzvqVar);
        }
        hashMap.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public void zzt() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzvr) it.next()).zza.zzt();
        }
    }

    protected abstract void zzu(Object obj, zzwm zzwmVar, zzbf zzbfVar);

    protected final void zzv(final Object obj, zzwm zzwmVar) {
        HashMap hashMap = this.zza;
        zzgrc.zza(!hashMap.containsKey(obj));
        zzwl zzwlVar = new zzwl() { // from class: com.google.android.gms.internal.ads.zzvp
            @Override // com.google.android.gms.internal.ads.zzwl
            public final /* synthetic */ void zza(zzwm zzwmVar2, zzbf zzbfVar) {
                zzvs.this.zzu(obj, zzwmVar2, zzbfVar);
            }
        };
        zzvq zzvqVar = new zzvq(this, obj);
        hashMap.put(obj, new zzvr(zzwmVar, zzwlVar, zzvqVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzwmVar.zzl(handler, zzvqVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzwmVar.zzn(handler2, zzvqVar);
        zzwmVar.zzp(zzwlVar, this.zzc, zzk());
        if (zzj()) {
            return;
        }
        zzwmVar.zzr(zzwlVar);
    }

    protected int zzw(Object obj, int i) {
        return 0;
    }

    protected zzwk zzx(Object obj, zzwk zzwkVar) {
        throw null;
    }

    protected long zzy(Object obj, long j, zzwk zzwkVar) {
        return j;
    }
}
