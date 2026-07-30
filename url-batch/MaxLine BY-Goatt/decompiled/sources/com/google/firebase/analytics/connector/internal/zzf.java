package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import defpackage.bl3;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class zzf implements bl3 {
    final /* synthetic */ zzg zza;

    public zzf(zzg zzgVar) {
        Objects.requireNonNull(zzgVar);
        this.zza = zzgVar;
    }

    @Override // defpackage.bl3
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str == null || !zzc.zzc(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle(NativeProtocol.WEB_DIALOG_PARAMS, bundle);
        this.zza.zzd().onMessageTriggered(3, bundle2);
    }
}
