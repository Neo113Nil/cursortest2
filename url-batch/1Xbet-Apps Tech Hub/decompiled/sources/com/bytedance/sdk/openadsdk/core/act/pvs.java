package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.customtabs.EngagementSignalsCallback;
import com.bytedance.sdk.openadsdk.core.Ju;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ActHelper.java */
/* loaded from: classes2.dex */
public class pvs {
    private static volatile boolean Jd = false;
    private static Boolean NB = null;
    private static int icD = -1;
    private static String pvs = null;
    private static ActServiceConnection sUS = null;
    private static int vG = -1;

    private pvs() {
    }

    public static String pvs(final Context context) {
        String str = pvs;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                pvs = null;
            } else if (!TextUtils.isEmpty(str2) && !pvs(context, intent) && arrayList.contains(str2)) {
                pvs = str2;
            } else {
                pvs = (String) arrayList.get(0);
            }
            if (!TextUtils.isEmpty(pvs)) {
                synchronized (pvs.class) {
                    if (!Jd) {
                        icD icd = new icD() { // from class: com.bytedance.sdk.openadsdk.core.act.pvs.1
                            @Override // com.bytedance.sdk.openadsdk.core.act.icD
                            public void pvs(final CustomTabsClient customTabsClient) {
                                Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.pvs.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Throwable th;
                                        boolean z;
                                        boolean z2;
                                        boolean z3 = false;
                                        try {
                                            CustomTabsCallback customTabsCallback = new CustomTabsCallback();
                                            EngagementSignalsCallback engagementSignalsCallback = new EngagementSignalsCallback() { // from class: com.bytedance.sdk.openadsdk.core.act.pvs.1.1.1
                                                @Override // androidx.browser.customtabs.EngagementSignalsCallback
                                                public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
                                                }

                                                @Override // androidx.browser.customtabs.EngagementSignalsCallback
                                                public void onSessionEnded(boolean z4, Bundle bundle) {
                                                }

                                                @Override // androidx.browser.customtabs.EngagementSignalsCallback
                                                public void onVerticalScrollEvent(boolean z4, Bundle bundle) {
                                                }
                                            };
                                            CustomTabsSession newSession = customTabsClient.newSession(customTabsCallback);
                                            z2 = newSession != null ? newSession.isEngagementSignalsApiAvailable(Bundle.EMPTY) : false;
                                            try {
                                                if (z2) {
                                                    int unused = pvs.icD = 1;
                                                    z3 = newSession.setEngagementSignalsCallback(engagementSignalsCallback, Bundle.EMPTY);
                                                    if (z3) {
                                                        int unused2 = pvs.vG = 1;
                                                    }
                                                } else {
                                                    int unused3 = pvs.icD = 0;
                                                }
                                                if (!z2 || !z3) {
                                                    Boolean unused4 = pvs.NB = Boolean.FALSE;
                                                } else {
                                                    Boolean unused5 = pvs.NB = Boolean.TRUE;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                z = false;
                                                z3 = z2;
                                                com.bytedance.sdk.component.utils.Ju.pvs("CustomTabsHelper", th.getMessage());
                                                z2 = z3;
                                                z3 = z;
                                                Object[] objArr = new Object[5];
                                                Boolean.valueOf(z2);
                                                Boolean.valueOf(z3);
                                                ActServiceConnection actServiceConnection = pvs.sUS;
                                                if (pvs.Jd) {
                                                    return;
                                                } else {
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z = false;
                                        }
                                        Object[] objArr2 = new Object[5];
                                        Boolean.valueOf(z2);
                                        Boolean.valueOf(z3);
                                        ActServiceConnection actServiceConnection2 = pvs.sUS;
                                        if (pvs.Jd || actServiceConnection2 == null) {
                                            return;
                                        }
                                        try {
                                            context.unbindService(actServiceConnection2);
                                        } catch (Throwable unused6) {
                                        }
                                    }
                                });
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.act.icD
                            public void pvs() {
                                ActServiceConnection unused = pvs.sUS = null;
                            }
                        };
                        if (sUS == null) {
                            sUS = new ActServiceConnection(icd);
                        }
                        CustomTabsClient.bindCustomTabsService(context, pvs, sUS);
                        Jd = true;
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("CustomTabsHelper", th.getMessage());
        }
        return pvs;
    }

    private static boolean pvs(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        if (queryIntentActivities.size() == 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            IntentFilter intentFilter = resolveInfo.filter;
            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                return true;
            }
        }
        return false;
    }

    public static int pvs() {
        Boolean bool = NB;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static int icD(Context context) {
        return !TextUtils.isEmpty(pvs(context)) ? 1 : 0;
    }

    public static int icD() {
        return icD;
    }

    public static int vG() {
        return vG;
    }

    public static void pvs(int i) {
        icD = i;
    }

    public static void icD(int i) {
        vG = i;
    }
}
