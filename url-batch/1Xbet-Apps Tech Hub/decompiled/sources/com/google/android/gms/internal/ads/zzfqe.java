package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzfqe implements Closeable {
    public static zzfqq zza() {
        return new zzfqq();
    }

    public static zzfqq zzb(final int i, zzfqp zzfqpVar) {
        return new zzfqq(new zzfuo() { // from class: com.google.android.gms.internal.ads.zzfqc
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        }, new zzfuo() { // from class: com.google.android.gms.internal.ads.zzfqd
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final Object zza() {
                return zzfqe.zze();
            }
        }, zzfqpVar);
    }

    public static zzfqq zzc(zzfuo<Integer> zzfuoVar, zzfuo<Integer> zzfuoVar2, zzfqp zzfqpVar) {
        return new zzfqq(zzfuoVar, zzfuoVar2, zzfqpVar);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
