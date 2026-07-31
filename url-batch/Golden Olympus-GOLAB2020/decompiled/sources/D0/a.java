package D0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.ads.installreferrer.commons.LogUtil;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {
    public static Uri a(String str) {
        Uri uri = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String a4 = e.a(str);
            String d4 = c(e.a(a4)) ? (String) new JSONObject(e.a(a4)).get("dplink") : a4.contains("hw_dplink") ? d(a4) : null;
            if (d4 == null) {
                return null;
            }
            uri = Uri.parse(d4);
            LogUtil.logInfo("AGReferrerDetails", "get deeplink url success");
            return uri;
        } catch (Throwable th) {
            LogUtil.logError("AGReferrerDetails", "getDeeplinkUrl exception: " + th.getClass().getSimpleName());
            return uri;
        }
    }

    public static String b(Context context) {
        Cursor cursor;
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = context.getContentResolver();
        String[] strArr = {context.getPackageName()};
        String str = null;
        try {
            cursor = contentResolver.query(parse, null, null, strArr, null);
            try {
                if (cursor != null) {
                    cursor.moveToFirst();
                    str = cursor.getString(5);
                } else {
                    LogUtil.logWarn("AGReferrerDetails", "referrer is null");
                }
                if (cursor != null) {
                    cursor.close();
                }
                return str;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (cursor == null) {
                    throw th2;
                }
                cursor.close();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    private static boolean c(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String d(String str) {
        int indexOf = str.indexOf("hw_dplink") + 10;
        int i4 = indexOf;
        while (i4 < str.length() && str.charAt(i4) != '&') {
            i4++;
        }
        return e.a(str.substring(indexOf, i4));
    }
}
