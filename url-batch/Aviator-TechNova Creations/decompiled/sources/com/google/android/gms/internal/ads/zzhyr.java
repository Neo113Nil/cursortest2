package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzhyr extends zzhys {
    final /* synthetic */ zzhys zza;

    /* synthetic */ zzhyr(zzhys zzhysVar, byte[] bArr) {
        Objects.requireNonNull(zzhysVar);
        this.zza = zzhysVar;
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 21);
        sb.append("NullSafeTypeAdapter[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhys
    public final void zza(zzhzs zzhzsVar, Object obj) throws IOException {
        throw null;
    }
}
