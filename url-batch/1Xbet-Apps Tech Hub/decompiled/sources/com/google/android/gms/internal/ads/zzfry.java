package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfry extends zzfsp {
    final /* synthetic */ zzfrs zza;
    final /* synthetic */ zzfsg zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfsb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfry(zzfsb zzfsbVar, TaskCompletionSource taskCompletionSource, zzfrs zzfrsVar, zzfsg zzfsgVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfsbVar;
        this.zza = zzfrsVar;
        this.zzb = zzfsgVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfsl] */
    @Override // com.google.android.gms.internal.ads.zzfsp
    protected final void zza() {
        zzfso zzfsoVar;
        String str;
        String str2;
        try {
            ?? zze = this.zzd.zza.zze();
            zzfrs zzfrsVar = this.zza;
            str2 = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfrsVar.zzb());
            bundle.putString("callerPackage", str2);
            bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, zzfrsVar.zza());
            zze.zze(bundle, new zzfsa(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfsb zzfsbVar = this.zzd;
            zzfsoVar = zzfsb.zzb;
            str = zzfsbVar.zzd;
            zzfsoVar.zzb(e, "dismiss overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
