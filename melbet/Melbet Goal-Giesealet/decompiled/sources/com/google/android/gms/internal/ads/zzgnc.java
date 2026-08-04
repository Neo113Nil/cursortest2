package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgnc implements Serializable {
    private static final zzgnc zza = new zzgnc(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzgnc(int[] iArr, int i, int i2) {
        this.zzb = iArr;
        this.zzc = i2;
    }

    public static zzgnc zza() {
        return zza;
    }

    public static zzgnc zzb(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgnc(copyOf, 0, copyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgnc)) {
            return false;
        }
        zzgnc zzgncVar = (zzgnc) obj;
        int i = this.zzc;
        if (i != zzgncVar.zzc) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (zzd(i2) != zzgncVar.zzd(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + Integer.hashCode(this.zzb[i2]);
        }
        return i;
    }

    public final String toString() {
        int i = this.zzc;
        if (i == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.zzb;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd(int i) {
        zzghc.zzm(i, this.zzc, "index");
        return this.zzb[i];
    }
}
