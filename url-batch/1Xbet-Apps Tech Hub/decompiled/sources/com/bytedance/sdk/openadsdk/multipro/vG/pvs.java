package com.bytedance.sdk.openadsdk.multipro.vG;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.sUS.pvs.sUS;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.multipro.Jd;

/* compiled from: FrequentCallProviderImpl.java */
/* loaded from: classes2.dex */
public class pvs implements com.bytedance.sdk.openadsdk.multipro.pvs {
    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public int pvs(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public int pvs(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public Cursor pvs(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public Uri pvs(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public String pvs() {
        return "t_frequent";
    }

    private static sUS Jd() {
        try {
            if (mnm.pvs() != null) {
                return com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(mnm.pvs());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean pvs(String str) {
        if (mnm.pvs() == null) {
            return false;
        }
        try {
            sUS Jd = Jd();
            if (Jd != null) {
                return "true".equals(Jd.pvs(Uri.parse(NB() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean icD() {
        if (mnm.pvs() == null) {
            return false;
        }
        try {
            sUS Jd = Jd();
            if (Jd != null) {
                return "true".equals(Jd.pvs(Uri.parse(NB() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String vG() {
        if (mnm.pvs() == null) {
            return null;
        }
        try {
            sUS Jd = Jd();
            if (Jd != null) {
                return Jd.pvs(Uri.parse(NB() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String NB() {
        return Jd.icD + "/t_frequent/";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.pvs
    public String pvs(Uri uri) {
        new StringBuilder("get type uri: ").append(uri);
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.Jd.pvs.pvs().pvs(uri.getQueryParameter("rit")) ? "true" : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.Jd.pvs.pvs().icD() ? "true" : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.Jd.pvs.pvs().vG();
        }
        return null;
    }
}
