package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzhcy extends zzhcw implements zzaom {
    private int zza;

    protected zzhcy(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    protected final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzaol.zzc(byteBuffer.get());
        zzaol.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
