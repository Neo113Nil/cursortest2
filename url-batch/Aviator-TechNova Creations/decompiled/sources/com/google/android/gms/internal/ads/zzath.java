package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzath extends zzijr implements Closeable {
    static {
        zzijy.zzb(zzath.class);
    }

    public zzath(zzijs zzijsVar, zzatg zzatgVar) throws IOException {
        zzd(zzijsVar, zzijsVar.zzb(), zzatgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzijr
    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
