package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes3.dex */
final class zzlb implements zzln {
    final /* synthetic */ zzlg zza;

    zzlb(zzlg zzlgVar) {
        this.zza = zzlgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzln
    public final void zza(String str, String str2, Bundle bundle) {
        zzge zzgeVar;
        zzge zzgeVar2;
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzaB().zzp(new zzla(this, str, "_err", bundle));
            return;
        }
        zzlg zzlgVar = this.zza;
        zzgeVar = zzlgVar.zzn;
        if (zzgeVar != null) {
            zzgeVar2 = zzlgVar.zzn;
            zzgeVar2.zzaA().zzd().zzb("AppId not known when logging event", "_err");
        }
    }
}
