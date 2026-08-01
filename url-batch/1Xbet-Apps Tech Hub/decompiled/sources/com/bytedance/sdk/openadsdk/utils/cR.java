package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import com.bytedance.sdk.openadsdk.activity.TTBaseActivity;
import com.bytedance.sdk.openadsdk.core.act.AdActAction;
import java.util.HashMap;

/* compiled from: OpenUtils.java */
/* loaded from: classes2.dex */
public class cR {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.Wyp.pvs.icD icD(String str, int i, com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        com.bytedance.sdk.openadsdk.Wyp.pvs.icD icd = new com.bytedance.sdk.openadsdk.Wyp.pvs.icD();
        icd.pvs(str);
        icd.pvs(cRVar);
        icd.icD(jlb.pvs(cRVar));
        icd.pvs(i);
        icd.pvs(false);
        icd.icD(cRVar.jhZ());
        return icd;
    }

    public static boolean pvs(Context context, final String str, final com.bytedance.sdk.openadsdk.core.model.cR cRVar, final String str2) {
        if (context instanceof Activity) {
            if (!pvs((Activity) context)) {
                context = null;
            }
        } else {
            Activity icD = com.bytedance.sdk.openadsdk.core.IP.pvs().NB().icD();
            if (icD != null && pvs(icD)) {
                context = icD;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.mnm.pvs();
        }
        if (context == null) {
            return false;
        }
        final String pvs = jlb.pvs(cRVar);
        if (!com.bytedance.sdk.component.utils.mnm.pvs(str)) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(icD(str2, 5, cRVar));
            return false;
        }
        final String icD2 = com.bytedance.sdk.openadsdk.core.model.cR.icD(context, cRVar);
        if (!TextUtils.isEmpty(icD2)) {
            try {
                final CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setUrlBarHidingEnabled(false);
                builder.setShareState(2);
                if (context instanceof Activity) {
                    builder.setDefaultColorSchemeParams(new CustomTabColorSchemeParams.Builder().setToolbarColor(((Activity) context).getWindow().getNavigationBarColor()).build());
                }
                final Context context2 = context;
                new AdActAction(context, cRVar, str2, str).pvs(new AdActAction.BindCustomTabsServiceCallback() { // from class: com.bytedance.sdk.openadsdk.utils.cR.1
                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindSuccess(CustomTabsSession customTabsSession) {
                        if (customTabsSession != null) {
                            try {
                                CustomTabsIntent.Builder.this.setSession(customTabsSession);
                            } catch (Throwable th) {
                                String message = th.getMessage();
                                com.bytedance.sdk.component.utils.Ju.pvs("OpenUtils", message);
                                com.bytedance.sdk.openadsdk.Wyp.pvs.icD icD3 = cR.icD(str2, 13, cRVar);
                                icD3.vG(message);
                                com.bytedance.sdk.openadsdk.icD.vG.pvs(icD3);
                                cR.icD(context2, str, cRVar, str2, pvs);
                                return;
                            }
                        }
                        CustomTabsIntent build = CustomTabsIntent.Builder.this.build();
                        if (!(context2 instanceof Activity)) {
                            build.intent.addFlags(268435456);
                        }
                        com.bytedance.sdk.openadsdk.core.act.vG.pvs(context2, icD2, build, Uri.parse(str));
                        Context context3 = context2;
                        if (context3 instanceof TTBaseActivity) {
                            ((TTBaseActivity) context3).pvs(true);
                        }
                        com.bytedance.sdk.openadsdk.Wyp.pvs.icD icD4 = cR.icD(str2, 100, cRVar);
                        icD4.pvs(true);
                        icD4.icD(8);
                        com.bytedance.sdk.openadsdk.icD.vG.pvs(icD4);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindFail(int i, String str3) {
                        com.bytedance.sdk.openadsdk.Wyp.pvs.icD icD3 = cR.icD(str2, i, cRVar);
                        icD3.vG(str3);
                        com.bytedance.sdk.openadsdk.icD.vG.pvs(icD3);
                        cR.icD(context2, str, cRVar, str2, pvs);
                    }
                });
                return true;
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.component.utils.Ju.pvs("OpenUtils", message);
                com.bytedance.sdk.openadsdk.Wyp.pvs.icD icD3 = icD(str2, 12, cRVar);
                icD3.vG(message);
                com.bytedance.sdk.openadsdk.icD.vG.pvs(icD3);
                return icD(context, str, cRVar, str2, pvs);
            }
        }
        return icD(context, str, cRVar, str2, pvs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean icD(Context context, String str, com.bytedance.sdk.openadsdk.core.model.cR cRVar, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.Wyp.pvs.icD icD = icD(str2, 100, cRVar);
                icD.pvs(true);
                icD.icD(2);
                com.bytedance.sdk.openadsdk.icD.vG.pvs(icD);
                return true;
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.openadsdk.Wyp.pvs.icD icD2 = icD(str2, 7, cRVar);
                icD2.vG(message);
                icD2.icD(2);
                com.bytedance.sdk.openadsdk.icD.vG.pvs(icD2);
                return false;
            }
        } catch (Throwable th2) {
            String message2 = th2.getMessage();
            com.bytedance.sdk.openadsdk.Wyp.pvs.icD icD3 = icD(str2, 6, cRVar);
            icD3.vG(message2);
            icD3.icD(2);
            com.bytedance.sdk.openadsdk.icD.vG.pvs(icD3);
            return false;
        }
    }

    public static boolean icD(Context context, String str, com.bytedance.sdk.openadsdk.core.model.cR cRVar, String str2) {
        if (context instanceof Activity) {
            if (!pvs((Activity) context)) {
                context = null;
            }
        } else {
            Activity icD = com.bytedance.sdk.openadsdk.core.IP.pvs().NB().icD();
            if (icD != null && pvs(icD)) {
                context = icD;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.mnm.pvs();
        }
        if (context == null || !pvs(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        HashMap hashMap = new HashMap();
        hashMap.put("deeplink_url", str);
        hashMap.put("jsb_deeplink", 1);
        if (jlb.so(context)) {
            if (jlb.pvs(context, intent)) {
                com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str2, "open_url_app", hashMap);
                try {
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.icD.kj.pvs().pvs(hashMap).pvs(cRVar, str2);
                    return true;
                } catch (Throwable unused) {
                }
            }
            return false;
        }
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str2, "open_url_app", hashMap);
            context.startActivity(intent);
            com.bytedance.sdk.openadsdk.icD.kj.pvs().pvs(hashMap).pvs(cRVar, str2);
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static boolean pvs(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean pvs(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
