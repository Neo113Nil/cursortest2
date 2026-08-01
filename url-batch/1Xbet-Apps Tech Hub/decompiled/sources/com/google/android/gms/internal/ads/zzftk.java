package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzftk implements zzftz {
    protected zzftk() {
    }

    public static zzftk zzc(char c) {
        return new zzfth(c);
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
