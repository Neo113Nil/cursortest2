package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.ces;
import defpackage.ceu;
import defpackage.cgy;
import defpackage.cov;
import defpackage.iyh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        ceu.b(context);
        iyh c = ces.c();
        c.k(queryParameter);
        c.l(cgy.b(intValue));
        if (queryParameter2 != null) {
            c.b = Base64.decode(queryParameter2, 0);
        }
        ceu.a().b.g(c.j(), i, new cov(1));
    }
}
