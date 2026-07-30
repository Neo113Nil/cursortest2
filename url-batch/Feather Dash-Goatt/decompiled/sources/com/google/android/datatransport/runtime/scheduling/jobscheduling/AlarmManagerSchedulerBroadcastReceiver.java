package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.cc;
import defpackage.ez0;
import defpackage.i8;
import defpackage.ij1;
import defpackage.ne0;
import defpackage.ul1;
import defpackage.w2;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        ij1.b(context);
        i8 a2 = cc.a();
        a2.r(queryParameter);
        a2.h = ez0.b(intValue);
        if (queryParameter2 != null) {
            a2.g = Base64.decode(queryParameter2, 0);
        }
        ne0 ne0Var = ij1.a().d;
        ((Executor) ne0Var.e).execute(new ul1(ne0Var, a2.b(), i, new w2(0)));
    }
}
