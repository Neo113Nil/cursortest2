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

/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* renamed from: l, reason: collision with root package name */
    private final ng0 f2408l;

    public OfflinePingSender(@RecentlyNonNull Context context, @RecentlyNonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2408l = qw.a().g(context, new ad0());
    }

    @Override // androidx.work.Worker
    @RecentlyNonNull
    public final ListenableWorker.a doWork() {
        try {
            this.f2408l.d();
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
