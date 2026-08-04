package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public class zzgb extends IOException {
    public final int zza;

    public zzgb(int i) {
        this.zza = i;
    }

    public zzgb(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzgb(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzgb(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
