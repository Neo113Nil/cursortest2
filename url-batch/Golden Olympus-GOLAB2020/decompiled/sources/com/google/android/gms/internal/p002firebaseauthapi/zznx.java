package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zznx {
    private ArrayList<zznw> zza = new ArrayList<>();
    private zznr zzb = zznr.zza;
    private Integer zzc = null;

    public final zznx zza(zzbq zzbqVar, int i4, String str, String str2) {
        ArrayList<zznw> arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zznw(zzbqVar, i4, str, str2));
        return this;
    }

    public final zznx zza(zznr zznrVar) {
        if (this.zza != null) {
            this.zzb = zznrVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zznx zza(int i4) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i4);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zznu zza() {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList<zznw> arrayList = this.zza;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    zznw zznwVar = arrayList.get(i4);
                    i4++;
                    if (zznwVar.zza() == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zznu zznuVar = new zznu(this.zzb, Collections.unmodifiableList(this.zza), this.zzc);
            this.zza = null;
            return zznuVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
