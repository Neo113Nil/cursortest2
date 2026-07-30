package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzik {
    private final Map zza;

    public zzik() {
        this.zza = new HashMap();
    }

    public final zzik zza(String str, int i) {
        this.zza.put(str, Integer.valueOf(i));
        return this;
    }

    public final zzik zzb(String str, long j) {
        this.zza.put(str, Long.valueOf(j));
        return this;
    }

    public final zzik zzc(String str, float f) {
        this.zza.put(str, Float.valueOf(f));
        return this;
    }

    public final zzik zzd(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzik zze(String str, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.zza.put(str, null);
            return this;
        }
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        allocate.put(byteBuffer.duplicate());
        allocate.flip();
        this.zza.put(str, allocate);
        return this;
    }

    public final zzik zzf(String str) {
        this.zza.remove(str);
        return this;
    }

    public final zzil zzg() {
        return new zzil(this.zza, null);
    }
}
