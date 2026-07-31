package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B0.c;
import D0.j;
import D0.s;
import J0.f;
import J0.k;
import N0.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3839a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i7 = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        c a7 = j.a();
        a7.A(queryParameter);
        a7.f73i = a.b(intValue);
        if (queryParameter2 != null) {
            a7.f72h = Base64.decode(queryParameter2, 0);
        }
        k kVar = s.a().f361d;
        kVar.f1273e.execute(new f(kVar, a7.e(), i7, new J0.a(0)));
    }
}
