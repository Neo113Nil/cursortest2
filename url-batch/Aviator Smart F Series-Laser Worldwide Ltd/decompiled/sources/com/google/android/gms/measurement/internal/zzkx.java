package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzkx implements zzew {
    final /* synthetic */ String zza;
    final /* synthetic */ zzlg zzb;

    zzkx(zzlg zzlgVar, String str) {
        this.zzb = zzlgVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzew
    public final void zza(String str, int i8, Throwable th, byte[] bArr, Map map) {
        this.zzb.zzK(i8, th, bArr, this.zza);
    }
}
