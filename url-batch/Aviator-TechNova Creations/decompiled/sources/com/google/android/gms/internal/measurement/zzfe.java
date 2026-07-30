package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes3.dex */
public final class zzfe extends zzkx implements zzmj {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzfe() {
        super(r0);
        zzff zzffVar;
        zzffVar = zzff.zza;
    }

    public final int zza() {
        return ((zzff) this.zza).zzb();
    }

    public final zzfd zzb(int i) {
        return ((zzff) this.zza).zzd(i);
    }

    public final zzfe zzc() {
        zzaH();
        ((zzff) this.zza).zzj = zzff.zzbH();
        return this;
    }

    public final zzfe zzd(int i, zzfc zzfcVar) {
        zzaH();
        zzff.zzq((zzff) this.zza, i, (zzfd) zzfcVar.zzaD());
        return this;
    }

    public final String zze() {
        return ((zzff) this.zza).zzk();
    }

    public final List zzf() {
        return Collections.unmodifiableList(((zzff) this.zza).zzm());
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzff) this.zza).zzn());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzfe(zzez zzezVar) {
        super(r1);
        zzff zzffVar;
        zzffVar = zzff.zza;
    }
}
