package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzt implements zzggr {
    static final /* synthetic */ zzt zza = new zzt();

    private /* synthetic */ zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final /* synthetic */ Object apply(Object obj) {
        zzw zzwVar = (zzw) obj;
        int i = zzu.zzO;
        String str = zzwVar.zza;
        String str2 = zzwVar.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return sb.toString();
    }
}
