package com.bytedance.sdk.openadsdk.core.iv;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.ev;
import com.bytedance.sdk.openadsdk.utils.nu;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class cn {
    public static void zmn(final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("preloadStaticRes") { // from class: com.bytedance.sdk.openadsdk.core.iv.cn.1
            @Override // java.lang.Runnable
            public void run() {
                ev rsi;
                ev.zmn hhw;
                com.bytedance.sdk.openadsdk.core.model.nqi nqiVar2 = nqiVar;
                if (nqiVar2 == null || (rsi = nqiVar2.rsi()) == null || (hhw = rsi.hhw()) == null) {
                    return;
                }
                String kw = com.bytedance.sdk.openadsdk.core.settings.rc.fs().kw();
                cn.zmn(nqiVar, hhw.zmn(), kw);
                cn.zn(hhw.fs(), kw);
                cn.fb(hhw.zn(), kw);
            }
        });
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                String zmn = com.bytedance.sdk.openadsdk.core.mw.fb.zmn(str, optString);
                String zmn2 = com.bytedance.sdk.component.utils.btk.zmn(zmn);
                InputStream zmn3 = com.bytedance.sdk.openadsdk.iv.fb.zmn(zmn, zmn2);
                if (zmn3 != null) {
                    try {
                        zmn3.close();
                    } catch (IOException unused) {
                    }
                } else {
                    com.bytedance.sdk.openadsdk.iv.fb.zmn(zmn).zn(1).zmn(zmn2).zmn(new com.bytedance.sdk.openadsdk.iv.fs(nqiVar, zmn, new com.bytedance.sdk.component.btk.cyb() { // from class: com.bytedance.sdk.openadsdk.core.iv.cn.2
                        @Override // com.bytedance.sdk.component.btk.cyb
                        public void zmn(int i2, String str2, @Nullable Throwable th) {
                        }

                        @Override // com.bytedance.sdk.component.btk.cyb
                        public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
                            rcVar.zmn();
                        }
                    }), 4);
                }
            }
        }
    }

    public static boolean fs(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        ev rsi;
        return (nqiVar == null || (rsi = nqiVar.rsi()) == null || rsi.hhw() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zn(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                String zmn = com.bytedance.sdk.openadsdk.core.mw.fb.zmn(str, optString);
                File zmn2 = zmn(zmn);
                if (zmn2 != null && zmn2.exists() && zmn2.length() > 0) {
                    return;
                } else {
                    zn(zmn);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fb(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                String zmn = com.bytedance.sdk.openadsdk.core.mw.fb.zmn(str, optString);
                File zmn2 = zmn(zmn);
                if (zmn2 != null && zmn2.exists() && zmn2.length() > 0) {
                    return;
                } else {
                    zn(zmn);
                }
            }
        }
    }

    private static void zn(String str) {
        File zmn = zmn(str);
        if (zmn == null) {
            return;
        }
        File file = new File(zmn + ".tmp");
        com.bytedance.sdk.component.nps.fs.zmn fb = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fb();
        fb.zmn(8);
        fb.fs("preloadStaticRes");
        fb.zn(str);
        fb.zmn(zmn.getParent(), zmn.getName());
        com.bytedance.sdk.component.nps.fs btk = fb.btk();
        if (btk != null && btk.hhw() && btk.btk() != null && btk.btk().exists()) {
            com.bytedance.sdk.component.utils.iqz.zmn("ExpressStaticResPreload", "downloadFile: success url=".concat(String.valueOf(str)));
            return;
        }
        if (zmn.exists()) {
            try {
                zmn.delete();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn("ExpressStaticResPreload", th.getMessage());
            }
        }
        if (file.exists()) {
            try {
                file.delete();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.iqz.zn("ExpressStaticResPreload", th2.getMessage());
            }
        }
    }

    public static File zmn(String str) {
        String zmn = com.bytedance.sdk.component.utils.btk.zmn(str);
        if (zmn == null) {
            return null;
        }
        return new File(com.bytedance.sdk.component.utils.nps.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), new File(CacheDirFactory.getRootDir()).getName() + "/express_static_res"), zmn);
    }

    public static InputStream fs(String str) {
        File zmn = zmn(str);
        if (zmn != null && zmn.exists() && zmn.length() > 0) {
            try {
                return new FileInputStream(zmn);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn("ExpressStaticResPreload", th.getMessage());
            }
        }
        return null;
    }
}
