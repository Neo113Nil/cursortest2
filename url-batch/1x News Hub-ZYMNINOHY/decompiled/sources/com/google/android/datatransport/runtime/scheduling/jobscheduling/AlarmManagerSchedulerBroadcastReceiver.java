package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import A0.f;
import B0.m;
import F0.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import v0.i;
import v0.n;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2654a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i3 = intent.getExtras().getInt("attemptNumber");
        n.b(context);
        f a3 = i.a();
        a3.R(queryParameter);
        a3.f25d = a.b(intValue);
        if (queryParameter2 != null) {
            a3.f24c = Base64.decode(queryParameter2, 0);
        }
        m mVar = n.a().f10570d;
        i t3 = a3.t();
        B0.a aVar = new B0.a(0);
        mVar.getClass();
        mVar.f152e.execute(new B0.f(mVar, t3, i3, aVar));
    }
}
