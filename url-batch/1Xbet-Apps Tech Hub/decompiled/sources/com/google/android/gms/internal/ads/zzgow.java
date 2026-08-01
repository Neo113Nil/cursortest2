package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgow {
    private final zzgop zza;
    private final List zzb;

    @Nullable
    private final Integer zzc;

    /* synthetic */ zzgow(zzgop zzgopVar, List list, Integer num, zzgov zzgovVar) {
        this.zza = zzgopVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgow)) {
            return false;
        }
        zzgow zzgowVar = (zzgow) obj;
        if (this.zza.equals(zzgowVar.zza) && this.zzb.equals(zzgowVar.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzgowVar.zzc;
            if (num == num2) {
                return true;
            }
            if (num != null && num.equals(num2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
