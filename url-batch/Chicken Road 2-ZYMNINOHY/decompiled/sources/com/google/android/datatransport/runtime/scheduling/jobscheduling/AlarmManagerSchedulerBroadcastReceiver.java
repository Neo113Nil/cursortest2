package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.j;
import L1.r;
import R1.g;
import R1.m;
import V1.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5749a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i4 = intent.getExtras().getInt("attemptNumber");
        r.b(context);
        j a3 = L1.j.a();
        a3.D(queryParameter);
        a3.f203d = a.b(intValue);
        if (queryParameter2 != null) {
            a3.f202c = Base64.decode(queryParameter2, 0);
        }
        m mVar = r.a().f1665d;
        mVar.f2366e.execute(new g(mVar, a3.h(), i4, new R1.a(0)));
    }
}
