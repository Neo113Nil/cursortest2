package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zztw {
    private final zzacl zza;
    private final Map zzb = new HashMap();
    private final Set zzc = new HashSet();
    private final Map zzd = new HashMap();
    private zzgp zze;

    public zztw(zzacl zzaclVar) {
        this.zza = zzaclVar;
    }

    public final void zza(zzgp zzgpVar) {
        if (zzgpVar != this.zze) {
            this.zze = zzgpVar;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}
