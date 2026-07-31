package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzhl extends zzlz implements zzni {
    private zzhl() {
        throw null;
    }

    public final int zza() {
        return ((zzhm) this.zza).zzb();
    }

    public final long zzb() {
        return ((zzhm) this.zza).zzc();
    }

    public final long zzc() {
        return ((zzhm) this.zza).zzd();
    }

    public final zzhl zzd(Iterable iterable) {
        zzbe();
        zzhm.zzj((zzhm) this.zza, iterable);
        return this;
    }

    public final zzhl zze(zzhp zzhpVar) {
        zzbe();
        zzhm.zzk((zzhm) this.zza, (zzhq) zzhpVar.zzba());
        return this;
    }

    public final zzhl zzf(zzhq zzhqVar) {
        zzbe();
        zzhm.zzk((zzhm) this.zza, zzhqVar);
        return this;
    }

    public final zzhl zzg() {
        zzbe();
        ((zzhm) this.zza).zze = zzmd.zzcn();
        return this;
    }

    public final zzhl zzh(int i4) {
        zzbe();
        zzhm.zzn((zzhm) this.zza, i4);
        return this;
    }

    public final zzhl zzi(String str) {
        zzbe();
        zzhm.zzo((zzhm) this.zza, str);
        return this;
    }

    public final zzhl zzj(int i4, zzhp zzhpVar) {
        zzbe();
        zzhm.zzp((zzhm) this.zza, i4, (zzhq) zzhpVar.zzba());
        return this;
    }

    public final zzhl zzk(int i4, zzhq zzhqVar) {
        zzbe();
        zzhm.zzp((zzhm) this.zza, i4, zzhqVar);
        return this;
    }

    public final zzhl zzl(long j4) {
        zzbe();
        zzhm.zzq((zzhm) this.zza, j4);
        return this;
    }

    public final zzhl zzm(long j4) {
        zzbe();
        zzhm.zzr((zzhm) this.zza, j4);
        return this;
    }

    public final zzhq zzn(int i4) {
        return ((zzhm) this.zza).zzg(i4);
    }

    public final String zzo() {
        return ((zzhm) this.zza).zzh();
    }

    public final List zzp() {
        return Collections.unmodifiableList(((zzhm) this.zza).zzi());
    }

    public final boolean zzq() {
        return ((zzhm) this.zza).zzu();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzhl(zzip zzipVar) {
        super(r1);
        zzhm zzhmVar;
        zzhmVar = zzhm.zzb;
    }
}
