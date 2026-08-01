package com.bytedance.sdk.component.sUS.pvs.icD.icD;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.sUS.pvs.pvs.pvs.sUS;
import com.bytedance.sdk.component.sUS.pvs.pvs.pvs.yiw;
import com.bytedance.sdk.component.sUS.pvs.so;
import java.util.Iterator;
import java.util.List;

/* compiled from: EventProviderImpl.java */
/* loaded from: classes.dex */
public class pvs {
    private static ContentResolver vG() {
        try {
            if (so.yiw().sUS() != null) {
                return so.yiw().sUS().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void pvs() {
        if (so.yiw().sUS() == null) {
            return;
        }
        try {
            ContentResolver vG = vG();
            if (vG != null) {
                vG.getType(Uri.parse(Jd() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void icD() {
        if (so.yiw().sUS() == null) {
            return;
        }
        try {
            ContentResolver vG = vG();
            if (vG != null) {
                vG.getType(Uri.parse(Jd() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar) {
        if (pvsVar == null) {
            return;
        }
        try {
            ContentResolver vG = vG();
            if (vG != null) {
                vG.getType(Uri.parse(Jd() + "adLogDispatch?event=" + sUS.pvs(pvsVar.sUS())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void pvs(String str, List<String> list, boolean z) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(sUS.pvs(it.next())).append(",");
            }
            String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(sUS.pvs(sb.toString())) + "&replace=" + String.valueOf(z);
            ContentResolver vG = vG();
            if (vG != null) {
                vG.getType(Uri.parse(Jd() + "trackAdUrl" + str2));
            }
        } catch (Throwable unused) {
        }
    }

    public static void pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver vG = vG();
            if (vG != null) {
                vG.getType(Uri.parse(Jd() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }

    private static String Jd() {
        return yiw.icD + "/ad_log_event/";
    }
}
