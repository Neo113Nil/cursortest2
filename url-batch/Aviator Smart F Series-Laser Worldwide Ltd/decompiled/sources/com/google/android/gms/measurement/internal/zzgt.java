package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzgt implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzgw zzb;

    zzgt(zzgw zzgwVar, String str) {
        this.zzb = zzgwVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzlg zzlgVar;
        zzlg zzlgVar2;
        zzlgVar = this.zzb.zza;
        zzlgVar.zzA();
        zzlgVar2 = this.zzb.zza;
        return zzlgVar2.zzi().zzu(this.zza);
    }
}
