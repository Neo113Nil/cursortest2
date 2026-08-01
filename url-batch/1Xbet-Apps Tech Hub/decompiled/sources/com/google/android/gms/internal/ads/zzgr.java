package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzgr extends IOException {
    public final int zza;

    public zzgr(int i) {
        this.zza = i;
    }

    public zzgr(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzgr(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzgr(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
