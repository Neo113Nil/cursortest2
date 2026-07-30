package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.b33;
import defpackage.f33;
import defpackage.gm;
import defpackage.m;
import defpackage.mh;
import defpackage.pz2;
import defpackage.z42;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        pz2.b(context);
        mh a2 = gm.a();
        a2.F(queryParameter);
        a2.p = z42.b(intValue);
        if (queryParameter2 != null) {
            a2.o = Base64.decode(queryParameter2, 0);
        }
        f33 f33Var = pz2.a().d;
        f33Var.e.execute(new b33(f33Var, a2.i(), i, new m(4)));
    }
}
