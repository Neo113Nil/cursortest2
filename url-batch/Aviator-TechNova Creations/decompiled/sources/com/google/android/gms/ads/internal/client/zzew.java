package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbqm;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzew extends zzbqm {
    final /* synthetic */ zzex zza;

    /* synthetic */ zzew(zzex zzexVar, byte[] bArr) {
        Objects.requireNonNull(zzexVar);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        InitializationStatus zzB;
        zzex zzexVar = this.zza;
        synchronized (zzexVar.zzw()) {
            zzexVar.zzy(false);
            zzexVar.zzz(true);
            arrayList = new ArrayList(zzexVar.zzx());
            zzexVar.zzx().clear();
        }
        zzB = zzex.zzB(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzB);
        }
    }
}
