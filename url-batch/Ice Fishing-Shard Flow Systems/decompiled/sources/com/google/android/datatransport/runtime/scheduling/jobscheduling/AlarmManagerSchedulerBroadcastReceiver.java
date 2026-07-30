package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import D0.j;
import a1.i;
import a1.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import g1.e;
import k1.AbstractC0594a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4350a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        p.b(context);
        j a7 = i.a();
        a7.b0(queryParameter);
        a7.f332l = AbstractC0594a.b(intValue);
        if (queryParameter2 != null) {
            a7.f331i = Base64.decode(queryParameter2, 0);
        }
        g1.i iVar = p.a().f3082d;
        iVar.f5002e.execute(new e(iVar, a7.A(), i2, new com.appsflyer.internal.p(2)));
    }
}
