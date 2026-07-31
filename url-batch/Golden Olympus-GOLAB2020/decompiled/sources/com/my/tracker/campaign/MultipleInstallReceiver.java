package com.my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.my.tracker.obfuscated.AbstractC1708y2;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class MultipleInstallReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20869a = CampaignReceiver.class.getName();

    /* renamed from: b, reason: collision with root package name */
    private static final String f20870b = MultipleInstallReceiver.class.getName();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f20871c = new AtomicBoolean();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            return;
        }
        if (!f20871c.compareAndSet(false, true)) {
            AbstractC1708y2.a("MultipleInstallReceiver: attempt to call, but it was called before");
            return;
        }
        AbstractC1708y2.a("MultipleInstallReceiver called");
        CampaignReceiver.a(context, intent);
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER").setPackage(context.getPackageName()), 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null) {
                String str = activityInfo.name;
                if (!f20869a.equals(str) && !f20870b.equals(str)) {
                    AbstractC1708y2.a("MultipleInstallReceiver: trigger onReceive class " + str);
                    try {
                        ((BroadcastReceiver) Class.forName(str).newInstance()).onReceive(context, intent);
                    } catch (Throwable th) {
                        AbstractC1708y2.a("MultipleInstallReceiver: error in BroadcastReceiver " + str + " : " + th.getMessage());
                    }
                }
            }
        }
    }
}
