package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaoq extends zzhcw {
    ByteBuffer zza;

    public zzaoq(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhcw
    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
