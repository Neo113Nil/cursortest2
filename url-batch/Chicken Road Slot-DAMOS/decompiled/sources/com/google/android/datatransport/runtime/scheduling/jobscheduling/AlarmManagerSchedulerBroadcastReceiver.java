package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a1.n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.appsflyer.internal.q;
import java.util.concurrent.Executor;
import k6.i;
import k6.o;
import q6.d;
import u6.a;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2100a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i3 = intent.getExtras().getInt("attemptNumber");
        o.b(context);
        n a9 = i.a();
        a9.G(queryParameter);
        a9.f42r = a.b(intValue);
        if (queryParameter2 != null) {
            a9.f41i = Base64.decode(queryParameter2, 0);
        }
        q6.i iVar = o.a().f5484d;
        ((Executor) iVar.g).execute(new d(iVar, a9.k(), i3, new q(2)));
    }
}
