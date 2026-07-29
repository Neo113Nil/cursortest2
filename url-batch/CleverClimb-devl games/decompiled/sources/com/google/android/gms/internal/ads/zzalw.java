package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
final class zzalw<T> implements zzank<zzp, T> {
    private final /* synthetic */ zzalz zzcti;

    zzalw(zzalt zzaltVar, zzalz zzalzVar) {
        this.zzcti = zzalzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzank
    public final /* synthetic */ Object apply(zzp zzpVar) {
        return this.zzcti.zze(new ByteArrayInputStream(zzpVar.data));
    }
}
