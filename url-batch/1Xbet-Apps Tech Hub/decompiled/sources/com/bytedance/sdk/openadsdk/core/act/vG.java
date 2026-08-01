package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;

/* compiled from: CustomTabActivityHelper.java */
/* loaded from: classes2.dex */
public class vG implements icD {
    public static void pvs(Context context, String str, CustomTabsIntent customTabsIntent, Uri uri) {
        customTabsIntent.intent.setPackage(str);
        customTabsIntent.launchUrl(context, uri);
    }

    @Override // com.bytedance.sdk.openadsdk.core.act.icD
    public void pvs(CustomTabsClient customTabsClient) {
        throw null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.act.icD
    public void pvs() {
        throw null;
    }
}
