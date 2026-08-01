package com.bytedance.sdk.component.sUS.pvs.icD.icD;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.sUS.pvs.Jd;
import com.bytedance.sdk.component.sUS.pvs.pvs.pvs.yiw;
import com.bytedance.sdk.component.sUS.pvs.sUS;
import com.bytedance.sdk.component.sUS.pvs.so;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: OverSeasEventProviderImpl.java */
/* loaded from: classes.dex */
public class icD {
    public static sUS pvs;

    public int pvs(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public int pvs(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor pvs(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri pvs(Uri uri, ContentValues contentValues) {
        return null;
    }

    public String vG() {
        return "ad_log_event";
    }

    public static sUS pvs(Context context) {
        try {
            if (pvs == null) {
                pvs = so.yiw().mnm().qh();
            }
        } catch (Exception unused) {
        }
        return pvs;
    }

    public static void pvs() {
        if (so.yiw().sUS() == null) {
            return;
        }
        try {
            sUS pvs2 = pvs(so.yiw().sUS());
            if (pvs2 != null) {
                pvs2.pvs(Uri.parse(Jd() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void icD() {
        if (so.yiw().sUS() == null) {
            return;
        }
        try {
            sUS pvs2 = pvs(so.yiw().sUS());
            if (pvs2 != null) {
                pvs2.pvs(Uri.parse(Jd() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void pvs(com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar) {
        if (pvsVar == null) {
            return;
        }
        try {
            sUS pvs2 = pvs(so.yiw().sUS());
            if (pvs2 != null) {
                pvs2.pvs(Uri.parse(Jd() + "adLogDispatch?event=" + com.bytedance.sdk.component.sUS.pvs.pvs.pvs.sUS.pvs(pvsVar.sUS())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void pvs(String str, List<String> list, boolean z, int i, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(com.bytedance.sdk.component.sUS.pvs.pvs.pvs.sUS.pvs(it.next())).append(",");
            }
            String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.sUS.pvs.pvs.pvs.sUS.pvs(sb.toString())) + "&replace=" + String.valueOf(z) + "&urlType=" + String.valueOf(i) + "&adId=" + str2;
            sUS pvs2 = pvs(so.yiw().sUS());
            if (pvs2 != null) {
                pvs2.pvs(Uri.parse(Jd() + "trackAdUrl" + str3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void pvs(String str, boolean z) {
        if (so.yiw().mnm().sUS() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            sUS pvs2 = pvs(so.yiw().sUS());
            if (pvs2 != null) {
                pvs2.pvs(Uri.parse(Jd() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z));
            }
        } catch (Throwable unused) {
        }
    }

    private static String Jd() {
        return yiw.icD + "/ad_log_event/";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0037, code lost:
    
        if (r0.equals("adLogStop") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String pvs(Uri uri) {
        com.bytedance.sdk.component.sUS.pvs.Jd.pvs vG;
        char c = 2;
        String str = uri.getPath().split("/")[2];
        str.hashCode();
        int i = 0;
        switch (str.hashCode()) {
            case -482705237:
                if (str.equals("trackAdFailed")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -171493183:
                if (str.equals("adLogStart")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 964299715:
                break;
            case 1025736635:
                if (str.equals("adLogDispatch")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1131732929:
                if (str.equals("trackAdUrl")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                com.bytedance.sdk.component.sUS.pvs.sUS.pvs.pvs().pvs(uri.getQueryParameter("did"), uri.getBooleanQueryParameter("triggerOnInit", false));
                break;
            case 1:
                so.yiw().Mxy();
                break;
            case 2:
                so.yiw().qh();
                break;
            case 3:
                String queryParameter = uri.getQueryParameter(NotificationCompat.CATEGORY_EVENT);
                if (!TextUtils.isEmpty(queryParameter) && (vG = com.bytedance.sdk.component.sUS.pvs.Jd.pvs.pvs.vG(com.bytedance.sdk.component.sUS.pvs.pvs.pvs.sUS.icD(queryParameter))) != null) {
                    Jd.pvs.pvs(vG);
                    break;
                }
                break;
            case 4:
                try {
                    String queryParameter2 = uri.getQueryParameter("did");
                    boolean booleanValue = Boolean.valueOf(uri.getQueryParameter("replace")).booleanValue();
                    String queryParameter3 = uri.getQueryParameter("track");
                    String queryParameter4 = uri.getQueryParameter("urlType");
                    String queryParameter5 = uri.getQueryParameter("adId");
                    String[] split = com.bytedance.sdk.component.sUS.pvs.pvs.pvs.sUS.icD(queryParameter3).split(",");
                    if (split.length > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : split) {
                            String icD = com.bytedance.sdk.component.sUS.pvs.pvs.pvs.sUS.icD(str2);
                            if (!TextUtils.isEmpty(icD)) {
                                arrayList.add(icD);
                            }
                        }
                        try {
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                i = Integer.parseInt(queryParameter4);
                            }
                        } catch (Exception unused) {
                        }
                        com.bytedance.sdk.component.sUS.pvs.sUS.pvs.pvs().pvs(queryParameter2, arrayList, booleanValue, null, i, queryParameter5);
                        break;
                    }
                } catch (Throwable unused2) {
                    return null;
                }
                break;
        }
        return null;
    }
}
