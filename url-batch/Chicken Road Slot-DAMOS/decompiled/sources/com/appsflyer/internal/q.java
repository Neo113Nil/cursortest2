package com.appsflyer.internal;

import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import d2.h0;
import d2.v;
import s.d0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2092d;

    public /* synthetic */ q(int i3) {
        this.f2092d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2092d) {
            case 0:
                AFj1sSDK.AFAdRevenueData();
                return;
            case 1:
                d0 d0Var = v.f3547c1;
                synchronized (d0Var) {
                    try {
                        int i3 = Build.VERSION.SDK_INT;
                        Object[] objArr = d0Var.f8284a;
                        int i10 = d0Var.f8285b;
                        int i11 = 0;
                        if (i3 < 30) {
                            while (i11 < i10) {
                                v vVar = (v) objArr[i11];
                                boolean showLayoutBounds = vVar.getShowLayoutBounds();
                                Class cls = v.Z0;
                                vVar.setShowLayoutBounds(h0.m());
                                if (showLayoutBounds != vVar.getShowLayoutBounds()) {
                                    vVar.post(new d2.k(vVar, 2));
                                }
                                i11++;
                            }
                        } else {
                            while (i11 < i10) {
                                v vVar2 = (v) objArr[i11];
                                vVar2.post(new d2.k(vVar2, 3));
                                i11++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                int i12 = AlarmManagerSchedulerBroadcastReceiver.f2100a;
                return;
        }
    }
}
