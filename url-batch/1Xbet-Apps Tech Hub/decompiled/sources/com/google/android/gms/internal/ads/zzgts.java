package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgts {
    public static final zzgts zza = new zzgts(new zzgtt());
    public static final zzgts zzb = new zzgts(new zzgtx());
    public static final zzgts zzc = new zzgts(new zzgtz());
    public static final zzgts zzd = new zzgts(new zzgty());
    public static final zzgts zze = new zzgts(new zzgtu());
    public static final zzgts zzf = new zzgts(new zzgtw());
    public static final zzgts zzg = new zzgts(new zzgtv());
    private final zzgtr zzh;

    public zzgts(zzgua zzguaVar) {
        if (zzgjm.zzb()) {
            this.zzh = new zzgtq(zzguaVar, null);
        } else if (zzguh.zza()) {
            this.zzh = new zzgtm(zzguaVar, null);
        } else {
            this.zzh = new zzgto(zzguaVar, null);
        }
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzh.zza(str);
    }
}
