package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfrz extends zzfsp {
    final /* synthetic */ zzfsi zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfsg zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfsb zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfrz(zzfsb zzfsbVar, TaskCompletionSource taskCompletionSource, zzfsi zzfsiVar, int i, zzfsg zzfsgVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzfsbVar;
        this.zza = zzfsiVar;
        this.zzb = i;
        this.zzc = zzfsgVar;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfsl] */
    @Override // com.google.android.gms.internal.ads.zzfsp
    protected final void zza() {
        zzfso zzfsoVar;
        String str;
        String str2;
        try {
            ?? zze = this.zze.zza.zze();
            zzfsi zzfsiVar = this.zza;
            str2 = this.zze.zzd;
            int i = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfsiVar.zzb());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str2);
            bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, zzfsiVar.zza());
            zze.zzg(bundle, new zzfsa(this.zze, this.zzc));
        } catch (RemoteException e) {
            int i2 = this.zzb;
            zzfsoVar = zzfsb.zzb;
            str = this.zze.zzd;
            zzfsoVar.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i2), str);
            this.zzd.trySetException(new RuntimeException(e));
        }
    }
}
