package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfmh {
    private static final zzfmh zza = new zzfmh();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfmh() {
    }

    public static zzfmh zza() {
        return zza;
    }

    public final void zzb(zzfln zzflnVar) {
        this.zzb.add(zzflnVar);
    }

    public final void zzc(zzfln zzflnVar) {
        ArrayList arrayList = this.zzc;
        boolean zzg = zzg();
        arrayList.add(zzflnVar);
        if (zzg) {
            return;
        }
        zzfmp.zza().zzc();
    }

    public final void zzd(zzfln zzflnVar) {
        ArrayList arrayList = this.zzb;
        boolean zzg = zzg();
        arrayList.remove(zzflnVar);
        this.zzc.remove(zzflnVar);
        if (!zzg || zzg()) {
            return;
        }
        zzfmp.zza().zze();
    }

    public final Collection zze() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final Collection zzf() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
