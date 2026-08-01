package com.bytedance.sdk.openadsdk.core.act;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;

/* loaded from: classes2.dex */
public class ActServiceConnection extends CustomTabsServiceConnection {
    private icD mConnectionCallback;

    public ActServiceConnection(icD icd) {
        this.mConnectionCallback = icd;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        icD icd = this.mConnectionCallback;
        if (icd != null) {
            icd.pvs(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        icD icd = this.mConnectionCallback;
        if (icd != null) {
            icd.pvs();
        }
    }
}
