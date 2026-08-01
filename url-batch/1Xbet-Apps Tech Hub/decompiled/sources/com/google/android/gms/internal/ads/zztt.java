package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zztt extends zztl {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhs zzc;

    protected zztt() {
    }

    protected abstract void zzA(Object obj, zzum zzumVar, zzda zzdaVar);

    protected final void zzB(final Object obj, zzum zzumVar) {
        zzef.zzd(!this.zza.containsKey(obj));
        zzul zzulVar = new zzul() { // from class: com.google.android.gms.internal.ads.zztq
            @Override // com.google.android.gms.internal.ads.zzul
            public final void zza(zzum zzumVar2, zzda zzdaVar) {
                zztt.this.zzA(obj, zzumVar2, zzdaVar);
            }
        };
        zztr zztrVar = new zztr(this, obj);
        this.zza.put(obj, new zzts(zzumVar, zzulVar, zztrVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzumVar.zzh(handler, zztrVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzumVar.zzg(handler2, zztrVar);
        zzumVar.zzm(zzulVar, this.zzc, zzb());
        if (zzu()) {
            return;
        }
        zzumVar.zzi(zzulVar);
    }

    @Override // com.google.android.gms.internal.ads.zztl
    protected final void zzj() {
        for (zzts zztsVar : this.zza.values()) {
            zztsVar.zza.zzi(zztsVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztl
    protected final void zzl() {
        for (zzts zztsVar : this.zza.values()) {
            zztsVar.zza.zzk(zztsVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztl
    protected void zzn(zzhs zzhsVar) {
        this.zzc = zzhsVar;
        this.zzb = zzfs.zzw(null);
    }

    @Override // com.google.android.gms.internal.ads.zztl
    protected void zzq() {
        for (zzts zztsVar : this.zza.values()) {
            zztsVar.zza.zzp(zztsVar.zzb);
            zztsVar.zza.zzs(zztsVar.zzc);
            zztsVar.zza.zzr(zztsVar.zzc);
        }
        this.zza.clear();
    }

    protected int zzw(Object obj, int i) {
        return 0;
    }

    protected long zzx(Object obj, long j, zzuk zzukVar) {
        return j;
    }

    protected zzuk zzy(Object obj, zzuk zzukVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public void zzz() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzts) it.next()).zza.zzz();
        }
    }
}
