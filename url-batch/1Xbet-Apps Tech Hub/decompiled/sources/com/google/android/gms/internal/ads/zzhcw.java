package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzhcw implements zzaom {
    private static final zzhdh zza = zzhdh.zzb(zzhcw.class);
    protected final String zzb;
    long zze;
    zzhdb zzg;
    private zzaon zzh;
    private ByteBuffer zzi;
    long zzf = -1;
    private ByteBuffer zzj = null;
    boolean zzd = true;
    boolean zzc = true;

    protected zzhcw(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        if (this.zzd) {
            return;
        }
        try {
            zzhdh zzhdhVar = zza;
            String str = this.zzb;
            zzhdhVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzi = this.zzg.zzd(this.zze, this.zzf);
            this.zzd = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zzb(zzhdb zzhdbVar, ByteBuffer byteBuffer, long j, zzaoj zzaojVar) throws IOException {
        this.zze = zzhdbVar.zzb();
        byteBuffer.remaining();
        this.zzf = j;
        this.zzg = zzhdbVar;
        zzhdbVar.zze(zzhdbVar.zzb() + j);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zzc(zzaon zzaonVar) {
        this.zzh = zzaonVar;
    }

    protected abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        zzd();
        zzhdh zzhdhVar = zza;
        String str = this.zzb;
        zzhdhVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
