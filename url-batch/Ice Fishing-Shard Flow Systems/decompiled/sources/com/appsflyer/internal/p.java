package com.appsflyer.internal;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4348d;

    public /* synthetic */ p(int i2) {
        this.f4348d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4348d) {
            case 0:
                AFj1rSDK.getRevenue();
                break;
            case 1:
                com.onesignal.common.threading.a.prewarm$lambda$2();
                break;
            default:
                int i2 = AlarmManagerSchedulerBroadcastReceiver.f4350a;
                break;
        }
    }
}
