package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwl;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzpj<P> {
    private final Class<P> zza;
    private Map<zzzn, List<zzpi<P>>> zzb;
    private final List<zzpi<P>> zzc;
    private zzpi<P> zzd;
    private zznr zze;

    private final zzpj<P> zza(P p4, zzbo zzboVar, zzwl.zza zzaVar, boolean z4) {
        zzzn zzznVar;
        zzzn zzznVar2;
        if (this.zzb == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (p4 == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (zzaVar.zzc() != zzwc.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        zzpi<P> zzpiVar = new zzpi<>(p4, zzzn.zza(zzbi.zza(zzaVar)), zzaVar.zzc(), zzaVar.zzf(), zzaVar.zza(), zzaVar.zzb().zzf(), zzboVar);
        Map<zzzn, List<zzpi<P>>> map = this.zzb;
        List<zzpi<P>> list = this.zzc;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzpiVar);
        zzznVar = ((zzpi) zzpiVar).zzb;
        List<zzpi<P>> put = map.put(zzznVar, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(zzpiVar);
            zzznVar2 = ((zzpi) zzpiVar).zzb;
            map.put(zzznVar2, Collections.unmodifiableList(arrayList2));
        }
        list.add(zzpiVar);
        if (!z4) {
            return this;
        }
        if (this.zzd != null) {
            throw new IllegalStateException("you cannot set two primary primitives");
        }
        this.zzd = zzpiVar;
        return this;
    }

    public final zzpj<P> zzb(P p4, zzbo zzboVar, zzwl.zza zzaVar) {
        return zza(p4, zzboVar, zzaVar, true);
    }

    private zzpj(Class<P> cls) {
        this.zzb = new HashMap();
        this.zzc = new ArrayList();
        this.zza = cls;
        this.zze = zznr.zza;
    }

    public final zzpj<P> zza(P p4, zzbo zzboVar, zzwl.zza zzaVar) {
        return zza(p4, zzboVar, zzaVar, false);
    }

    public final zzpj<P> zza(zznr zznrVar) {
        if (this.zzb != null) {
            this.zze = zznrVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzpg<P> zza() {
        Map<zzzn, List<zzpi<P>>> map = this.zzb;
        if (map != null) {
            zzpg<P> zzpgVar = new zzpg<>(map, this.zzc, this.zzd, this.zze, this.zza);
            this.zzb = null;
            return zzpgVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
