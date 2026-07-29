package com.google.android.gms.internal.drive;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class zziz {
    final int tag;
    final byte[] zzng;

    zziz(int i, byte[] bArr) {
        this.tag = i;
        this.zzng = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziz)) {
            return false;
        }
        zziz zzizVar = (zziz) obj;
        return this.tag == zzizVar.tag && Arrays.equals(this.zzng, zzizVar.zzng);
    }

    public final int hashCode() {
        return ((this.tag + 527) * 31) + Arrays.hashCode(this.zzng);
    }
}
