package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import defpackage.bl3;
import defpackage.s93;
import defpackage.th2;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class zzd implements bl3 {
    final /* synthetic */ zze zza;

    public zzd(zze zzeVar) {
        Objects.requireNonNull(zzeVar);
        this.zza = zzeVar;
    }

    @Override // defpackage.bl3
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        zze zzeVar = this.zza;
        if (zzeVar.zza.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i = zzc.zza;
            String p = th2.p(str2, s93.p, s93.n);
            if (p != null) {
                str2 = p;
            }
            bundle2.putString("events", str2);
            zzeVar.zzd().onMessageTriggered(2, bundle2);
        }
    }
}
