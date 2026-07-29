package com.appsflyer;

import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.InstanceIDListenerService;

/* loaded from: classes.dex */
public class GcmInstanceIdListener extends InstanceIDListenerService {
    @Override // com.google.android.gms.iid.InstanceIDListenerService
    public void onTokenRefresh() {
        String str;
        super.onTokenRefresh();
        String a2 = j.a().a("gcmProjectNumber");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            str = InstanceID.getInstance(getApplicationContext()).getToken(a2, "GCM", null);
        } catch (Throwable th) {
            d.a("Error registering for uninstall tracking", th);
            str = null;
        }
        if (str != null) {
            d.d("GCM Refreshed Token = ".concat(String.valueOf(str)));
            q a3 = q.a(j.a().a("afUninstallToken"));
            q qVar = new q(currentTimeMillis, str);
            if (a3.a(qVar)) {
                ah.a(getApplicationContext(), qVar);
            }
        }
    }
}
