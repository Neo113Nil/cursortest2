package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaqj extends ByteArrayOutputStream {
    private final zzapy zza;

    public zzaqj(zzapy zzapyVar, int i) {
        this.zza = zzapyVar;
        this.buf = zzapyVar.zza(Math.max(i, 256));
    }

    private final void zza(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        zzapy zzapyVar = this.zza;
        int i2 = this.count + i;
        byte[] zza = zzapyVar.zza(i2 + i2);
        System.arraycopy(this.buf, 0, zza, 0, this.count);
        zzapyVar.zzb(this.buf);
        this.buf = zza;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.zzb(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zzb(this.buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        zza(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        zza(i2);
        super.write(bArr, i, i2);
    }
}
