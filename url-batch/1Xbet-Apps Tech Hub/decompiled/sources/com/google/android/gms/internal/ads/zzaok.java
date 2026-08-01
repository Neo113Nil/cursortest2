package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaok extends zzhda implements Closeable {
    private static final zzhdh zza = zzhdh.zzb(zzaok.class);

    public zzaok(zzhdb zzhdbVar, zzaoj zzaojVar) throws IOException {
        zzf(zzhdbVar, zzhdbVar.zzc(), zzaojVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhda, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhda
    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
