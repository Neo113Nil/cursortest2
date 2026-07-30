package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzanu implements Comparable {
    public final int zza;
    public final zzanp zzb;

    public zzanu(int i, zzanp zzanpVar) {
        this.zza = i;
        this.zzb = zzanpVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzanu) obj).zza);
    }
}
