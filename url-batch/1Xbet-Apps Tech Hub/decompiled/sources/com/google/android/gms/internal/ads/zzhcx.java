package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzhcx extends zzhda implements zzaom {
    zzaon zza;
    protected final String zzb = "moov";

    public zzhcx(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zzb(zzhdb zzhdbVar, ByteBuffer byteBuffer, long j, zzaoj zzaojVar) throws IOException {
        zzhdbVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzhdbVar;
        this.zzf = zzhdbVar.zzb();
        zzhdbVar.zze(zzhdbVar.zzb() + j);
        this.zzg = zzhdbVar.zzb();
        this.zzc = zzaojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zzc(zzaon zzaonVar) {
        this.zza = zzaonVar;
    }
}
