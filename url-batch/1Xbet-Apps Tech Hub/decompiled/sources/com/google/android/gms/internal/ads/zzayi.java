package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzayi extends PushbackInputStream {
    final /* synthetic */ zzayj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzayi(zzayj zzayjVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzayjVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzayl.zze(this.zza.zzc);
        super.close();
    }
}
