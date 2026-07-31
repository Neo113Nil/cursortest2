package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.ad0;
import com.google.android.gms.internal.ads.ng0;
import com.google.android.gms.internal.ads.qw;
import x3.b;

/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: l, reason: collision with root package name */
    private final ng0 f2407l;

    public OfflineNotificationPoster(@RecentlyNonNull Context context, @RecentlyNonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2407l = qw.a().g(context, new ad0());
    }

    @Override // androidx.work.Worker
    @RecentlyNonNull
    public final ListenableWorker.a doWork() {
        try {
            this.f2407l.t5(b.B3(getApplicationContext()), getInputData().i("uri"), getInputData().i("gws_query_id"));
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
