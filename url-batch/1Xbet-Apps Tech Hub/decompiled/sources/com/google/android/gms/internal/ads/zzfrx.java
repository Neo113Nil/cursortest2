package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfrx extends zzfsp {
    final /* synthetic */ zzfsd zza;
    final /* synthetic */ zzfsg zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfsb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfrx(zzfsb zzfsbVar, TaskCompletionSource taskCompletionSource, zzfsd zzfsdVar, zzfsg zzfsgVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzfsbVar;
        this.zza = zzfsdVar;
        this.zzb = zzfsgVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfsl] */
    @Override // com.google.android.gms.internal.ads.zzfsp
    protected final void zza() {
        zzfso zzfsoVar;
        String str;
        String str2;
        String str3;
        try {
            ?? zze = this.zzd.zza.zze();
            zzfsb zzfsbVar = this.zzd;
            str2 = zzfsbVar.zzd;
            zzfsd zzfsdVar = this.zza;
            str3 = zzfsbVar.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfsdVar.zze());
            bundle.putString("adFieldEnifd", zzfsdVar.zzf());
            bundle.putInt("layoutGravity", zzfsdVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfsdVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", zzfsdVar.zzd());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str3);
            if (zzfsdVar.zzg() != null) {
                bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, zzfsdVar.zzg());
            }
            zze.zzf(str2, bundle, new zzfsa(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfsb zzfsbVar2 = this.zzd;
            zzfsoVar = zzfsb.zzb;
            str = zzfsbVar2.zzd;
            zzfsoVar.zzb(e, "show overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
