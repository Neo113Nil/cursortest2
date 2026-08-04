package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzfvl {
    protected final File zza;

    public zzfvl(File file) {
        this.zza = file;
    }

    public final File zza() {
        return this.zza;
    }

    public abstract ListenableFuture zzb();

    public abstract ListenableFuture zzc(Object obj);
}
