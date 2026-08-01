package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgos {

    @Nullable
    private ArrayList zza = new ArrayList();
    private zzgop zzb = zzgop.zza;

    @Nullable
    private Integer zzc = null;

    public final zzgos zza(zzgcr zzgcrVar, int i, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzgou(zzgcrVar, i, str, str2, null));
        return this;
    }

    public final zzgos zzb(zzgop zzgopVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzgopVar;
        return this;
    }

    public final zzgos zzc(int i) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i);
        return this;
    }

    public final zzgow zzd() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int intValue = num.intValue();
            ArrayList arrayList = this.zza;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int zza = ((zzgou) arrayList.get(i)).zza();
                i++;
                if (zza == intValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        zzgow zzgowVar = new zzgow(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
        this.zza = null;
        return zzgowVar;
    }
}
