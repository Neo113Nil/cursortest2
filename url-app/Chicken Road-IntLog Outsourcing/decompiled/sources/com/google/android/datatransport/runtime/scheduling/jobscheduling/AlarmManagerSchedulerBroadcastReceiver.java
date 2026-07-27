package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B4.i;
import V0.o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import b1.C0273j;
import b1.RunnableC0264a;
import b1.RunnableC0269f;
import f1.AbstractC0416a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4949a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        o.b(context);
        i a6 = V0.i.a();
        a6.R(queryParameter);
        a6.f313d = AbstractC0416a.b(intValue);
        if (queryParameter2 != null) {
            a6.f312c = Base64.decode(queryParameter2, 0);
        }
        C0273j c0273j = o.a().f3224d;
        V0.i v4 = a6.v();
        RunnableC0264a runnableC0264a = new RunnableC0264a(0);
        c0273j.getClass();
        c0273j.f4791e.execute(new RunnableC0269f(c0273j, v4, i2, runnableC0264a));
    }
}
