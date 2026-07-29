package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzabd;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzabd<M extends zzabd<M>> extends zzabj {
    protected zzabf zzbzh;

    @Override // com.google.android.gms.internal.measurement.zzabj
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzabd zzabdVar = (zzabd) super.clone();
        zzabh.zza(this, zzabdVar);
        return zzabdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzabj
    protected int zza() {
        if (this.zzbzh == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzbzh.size(); i2++) {
            i += this.zzbzh.zzaw(i2).zza();
        }
        return i;
    }

    public final <T> T zza(zzabe<M, T> zzabeVar) {
        zzabg zzav;
        if (this.zzbzh == null || (zzav = this.zzbzh.zzav(zzabeVar.tag >>> 3)) == null) {
            return null;
        }
        return (T) zzav.zzb(zzabeVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzabj
    public void zza(zzabb zzabbVar) throws IOException {
        if (this.zzbzh == null) {
            return;
        }
        for (int i = 0; i < this.zzbzh.size(); i++) {
            this.zzbzh.zzaw(i).zza(zzabbVar);
        }
    }

    protected final boolean zza(zzaba zzabaVar, int i) throws IOException {
        int position = zzabaVar.getPosition();
        if (!zzabaVar.zzam(i)) {
            return false;
        }
        int i2 = i >>> 3;
        zzabl zzablVar = new zzabl(i, zzabaVar.zzc(position, zzabaVar.getPosition() - position));
        zzabg zzabgVar = null;
        if (this.zzbzh == null) {
            this.zzbzh = new zzabf();
        } else {
            zzabgVar = this.zzbzh.zzav(i2);
        }
        if (zzabgVar == null) {
            zzabgVar = new zzabg();
            this.zzbzh.zza(i2, zzabgVar);
        }
        zzabgVar.zza(zzablVar);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzabj
    /* renamed from: zzvz */
    public final /* synthetic */ zzabj clone() throws CloneNotSupportedException {
        return (zzabd) clone();
    }
}
