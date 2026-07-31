package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.bytedance.sdk.component.utils.fs;
import com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity;
import java.util.HashMap;

/* loaded from: classes14.dex */
public class uqh {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.cyb.zmn.fs fs(String str, int i, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        com.bytedance.sdk.openadsdk.cyb.zmn.fs fsVar = new com.bytedance.sdk.openadsdk.cyb.zmn.fs();
        fsVar.zmn(str);
        fsVar.zmn(nqiVar);
        fsVar.fs(oub.zmn(nqiVar));
        fsVar.zmn(i);
        fsVar.zmn(false);
        fsVar.fs(nqiVar.va());
        return fsVar;
    }

    public static boolean zmn(Context context, String str, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str2, boolean z) {
        if (context instanceof Activity) {
            if (!zmn((Activity) context)) {
                context = null;
            }
        } else {
            Activity fs = com.bytedance.sdk.openadsdk.core.cyb.zmn().btk().fs();
            if (fs != null && zmn(fs)) {
                context = fs;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.kgc.zmn();
        }
        if (context == null) {
            return false;
        }
        oub.zmn(nqiVar);
        if (!com.bytedance.sdk.component.utils.kgc.zmn(str)) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(fs(str2, 5, nqiVar));
            return false;
        }
        String fs2 = com.bytedance.sdk.openadsdk.core.model.nqi.fs(context, nqiVar);
        if (!TextUtils.isEmpty(fs2)) {
            try {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setUrlBarHidingEnabled(false);
                builder.setShareState(2);
                try {
                    CustomTabsIntent build = builder.build();
                    if (!(context instanceof Activity)) {
                        build.intent.addFlags(268435456);
                    }
                    com.bytedance.sdk.openadsdk.core.zmn.zmn.zmn(context, fs2, build, Uri.parse(str));
                    if (context instanceof TTBaseActivity) {
                        ((TTBaseActivity) context).zn(true);
                    }
                    com.bytedance.sdk.openadsdk.cyb.zmn.fs fs3 = fs(str2, 100, nqiVar);
                    fs3.zmn(true);
                    fs3.fs(8);
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(fs3);
                } catch (Throwable th) {
                    String message = th.getMessage();
                    com.bytedance.sdk.component.utils.iqz.zn("OpenUtils", message);
                    com.bytedance.sdk.openadsdk.cyb.zmn.fs fs4 = fs(str2, 13, nqiVar);
                    fs4.zn(message);
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(fs4);
                    fs(context, str, nqiVar, str2, true);
                }
                return true;
            } catch (Throwable th2) {
                String message2 = th2.getMessage();
                com.bytedance.sdk.component.utils.iqz.zn("OpenUtils", message2);
                com.bytedance.sdk.openadsdk.cyb.zmn.fs fs5 = fs(str2, 12, nqiVar);
                fs5.zn(message2);
                com.bytedance.sdk.openadsdk.fb.zn.zmn(fs5);
                return fs(context, str, nqiVar, str2, z);
            }
        }
        return fs(context, str, nqiVar, str2, z);
    }

    private static boolean fs(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, final String str2, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return com.bytedance.sdk.component.utils.fs.zmn(context, intent, new fs.InterfaceC0135fs() { // from class: com.bytedance.sdk.openadsdk.utils.uqh.1
                @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
                public void zmn() {
                    com.bytedance.sdk.openadsdk.cyb.zmn.fs fs = uqh.fs(str2, 100, nqiVar);
                    fs.zmn(true);
                    fs.fs(2);
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(fs);
                }

                @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
                public void zmn(Throwable th) {
                    String message = th.getMessage();
                    com.bytedance.sdk.openadsdk.cyb.zmn.fs fs = uqh.fs(str2, 7, nqiVar);
                    fs.zn(message);
                    fs.fs(2);
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(fs);
                }
            }, z);
        } catch (Throwable th) {
            String message = th.getMessage();
            com.bytedance.sdk.openadsdk.cyb.zmn.fs fs = fs(str2, 6, nqiVar);
            fs.zn(message);
            fs.fs(2);
            com.bytedance.sdk.openadsdk.fb.zn.zmn(fs);
            return false;
        }
    }

    public static boolean zmn(Context context, String str, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str2) {
        if (context instanceof Activity) {
            if (!zmn((Activity) context)) {
                context = null;
            }
        } else {
            Activity fs = com.bytedance.sdk.openadsdk.core.cyb.zmn().btk().fs();
            if (fs != null && zmn(fs)) {
                context = fs;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.kgc.zmn();
        }
        Context context2 = context;
        if (context2 == null || !zmn(str)) {
            return false;
        }
        new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
        HashMap hashMap = new HashMap();
        hashMap.put("deeplink_url", str);
        hashMap.put("jsb_deeplink", 1);
        return com.bytedance.sdk.openadsdk.phc.zmn.zmn.zmn.zmn(context2, str, nqiVar, oub.fs(nqiVar), hashMap, true);
    }

    public static boolean zmn(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean zmn(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
