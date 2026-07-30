package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgud extends zzgsc {
    private final zzguf zza;

    zzgud(zzguf zzgufVar, int i) {
        super(zzgufVar.size(), i);
        this.zza = zzgufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
