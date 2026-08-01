package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbti;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public class OfflineNotificationPoster extends Worker {
    private final zzbti zza;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zza().zzm(context, new zzbpo());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        try {
            this.zza.zzi(ObjectWrapper.wrap(getApplicationContext()), getInputData().getString("uri"), getInputData().getString("gws_query_id"));
            return ListenableWorker.Result.success();
        } catch (RemoteException unused) {
            return ListenableWorker.Result.failure();
        }
    }
}
