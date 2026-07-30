package com.baidu.ar.bean;

import android.text.TextUtils;
import com.baidu.ar.ARType;
import com.baidu.ar.constants.ARConfigKey;
import com.baidu.ar.k8;
import com.google.android.exoplayer2.offline.DownloadService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ARConfig {
    private static final String AR_SDK_SALT_FIGURE = "777078ec21930de508131ba36035de6b";
    public static final int LAUNCH_AR_TAB = 2;
    public static final int LAUNCH_AR_TAB_CASE = 3;
    public static final int LAUNCH_MODE_H5 = 1;
    public static final int LAUNCH_MODE_TAKE_PICTURE = 0;
    public static int TYPE_VPS = 11;
    public static boolean isQAMockOpen = false;
    private static String mARExtraInfo = "";
    private static String mARId = null;
    private static int mARInitialType = -1;
    private static String mARKey = null;
    private static int mARLaunchMode = 0;
    private static String mARPath = null;
    private static int mARType = -1;
    private static String mArFrom = null;
    private static String mArValue = null;
    private static boolean mIsNeedLastPreview = false;
    private static String mNavigation3DofARKey = "10327252";
    private static String mNavigation3DofNpcARKey = "10327190";
    private static String mNavigation6DofARKey = "10327251";
    private static String mNavigation6DofNpcARKey = "10326330";
    private static String sCUID = "";
    public static String sFeaPointsDir;

    public static String getARExtraInfo() {
        return mARExtraInfo;
    }

    public static String getARId() {
        return mARId;
    }

    public static int getARInitialType() {
        return mARInitialType;
    }

    public static String getARKey() {
        return mARKey;
    }

    public static int getARLaunchMode() {
        return mARLaunchMode;
    }

    public static String getARPath() {
        return mARPath;
    }

    public static int getARType() {
        return mARType;
    }

    public static String getArFrom() {
        return mArFrom;
    }

    public static String getArValue() {
        return mArValue;
    }

    public static String getCUID() {
        return sCUID;
    }

    public static String getNavigation3DofARKey() {
        return mNavigation3DofARKey;
    }

    public static String getNavigation3DofNpcARKey() {
        return mNavigation3DofNpcARKey;
    }

    public static String getNavigation6DofARKey() {
        return mNavigation6DofARKey;
    }

    public static String getNavigation6DofNpcARKey() {
        return mNavigation6DofNpcARKey;
    }

    public static Object[] getSignatureAndTime() {
        return getSignatureAndTime(DuMixARConfig.getAipAppId(), DuMixARConfig.getAPIKey());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0033, B:9:0x003c, B:10:0x0042, B:13:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:22:0x0089, B:23:0x0095, B:25:0x009b, B:26:0x009f, B:30:0x00ae, B:33:0x00be, B:34:0x00c1, B:36:0x00c7, B:37:0x00ce, B:39:0x00d4, B:40:0x00db, B:42:0x00e1, B:47:0x008e, B:49:0x0069, B:50:0x004d, B:54:0x0024), top: B:2:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0033, B:9:0x003c, B:10:0x0042, B:13:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:22:0x0089, B:23:0x0095, B:25:0x009b, B:26:0x009f, B:30:0x00ae, B:33:0x00be, B:34:0x00c1, B:36:0x00c7, B:37:0x00ce, B:39:0x00d4, B:40:0x00db, B:42:0x00e1, B:47:0x008e, B:49:0x0069, B:50:0x004d, B:54:0x0024), top: B:2:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0033, B:9:0x003c, B:10:0x0042, B:13:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:22:0x0089, B:23:0x0095, B:25:0x009b, B:26:0x009f, B:30:0x00ae, B:33:0x00be, B:34:0x00c1, B:36:0x00c7, B:37:0x00ce, B:39:0x00d4, B:40:0x00db, B:42:0x00e1, B:47:0x008e, B:49:0x0069, B:50:0x004d, B:54:0x0024), top: B:2:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0033, B:9:0x003c, B:10:0x0042, B:13:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:22:0x0089, B:23:0x0095, B:25:0x009b, B:26:0x009f, B:30:0x00ae, B:33:0x00be, B:34:0x00c1, B:36:0x00c7, B:37:0x00ce, B:39:0x00d4, B:40:0x00db, B:42:0x00e1, B:47:0x008e, B:49:0x0069, B:50:0x004d, B:54:0x0024), top: B:2:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0033, B:9:0x003c, B:10:0x0042, B:13:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:22:0x0089, B:23:0x0095, B:25:0x009b, B:26:0x009f, B:30:0x00ae, B:33:0x00be, B:34:0x00c1, B:36:0x00c7, B:37:0x00ce, B:39:0x00d4, B:40:0x00db, B:42:0x00e1, B:47:0x008e, B:49:0x0069, B:50:0x004d, B:54:0x0024), top: B:2:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0033, B:9:0x003c, B:10:0x0042, B:13:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:22:0x0089, B:23:0x0095, B:25:0x009b, B:26:0x009f, B:30:0x00ae, B:33:0x00be, B:34:0x00c1, B:36:0x00c7, B:37:0x00ce, B:39:0x00d4, B:40:0x00db, B:42:0x00e1, B:47:0x008e, B:49:0x0069, B:50:0x004d, B:54:0x0024), top: B:2:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0033, B:9:0x003c, B:10:0x0042, B:13:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:22:0x0089, B:23:0x0095, B:25:0x009b, B:26:0x009f, B:30:0x00ae, B:33:0x00be, B:34:0x00c1, B:36:0x00c7, B:37:0x00ce, B:39:0x00d4, B:40:0x00db, B:42:0x00e1, B:47:0x008e, B:49:0x0069, B:50:0x004d, B:54:0x0024), top: B:2:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0033, B:9:0x003c, B:10:0x0042, B:13:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:22:0x0089, B:23:0x0095, B:25:0x009b, B:26:0x009f, B:30:0x00ae, B:33:0x00be, B:34:0x00c1, B:36:0x00c7, B:37:0x00ce, B:39:0x00d4, B:40:0x00db, B:42:0x00e1, B:47:0x008e, B:49:0x0069, B:50:0x004d, B:54:0x0024), top: B:2:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0069 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0033, B:9:0x003c, B:10:0x0042, B:13:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:22:0x0089, B:23:0x0095, B:25:0x009b, B:26:0x009f, B:30:0x00ae, B:33:0x00be, B:34:0x00c1, B:36:0x00c7, B:37:0x00ce, B:39:0x00d4, B:40:0x00db, B:42:0x00e1, B:47:0x008e, B:49:0x0069, B:50:0x004d, B:54:0x0024), top: B:2:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004d A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0033, B:9:0x003c, B:10:0x0042, B:13:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:22:0x0089, B:23:0x0095, B:25:0x009b, B:26:0x009f, B:30:0x00ae, B:33:0x00be, B:34:0x00c1, B:36:0x00c7, B:37:0x00ce, B:39:0x00d4, B:40:0x00db, B:42:0x00e1, B:47:0x008e, B:49:0x0069, B:50:0x004d, B:54:0x0024), top: B:2:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0014, B:6:0x002a, B:7:0x0033, B:9:0x003c, B:10:0x0042, B:13:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0077, B:19:0x007d, B:20:0x0083, B:22:0x0089, B:23:0x0095, B:25:0x009b, B:26:0x009f, B:30:0x00ae, B:33:0x00be, B:34:0x00c1, B:36:0x00c7, B:37:0x00ce, B:39:0x00d4, B:40:0x00db, B:42:0x00e1, B:47:0x008e, B:49:0x0069, B:50:0x004d, B:54:0x0024), top: B:2:0x0014, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void initARConfig(String str) {
        String str2;
        String str3;
        String string;
        String string2;
        String str4 = "arType";
        String str5 = ARConfigKey.OLD_AR_KEY;
        try {
            JSONObject jSONObject = new JSONObject(str);
            mArValue = str;
            if (jSONObject.has("ar_key")) {
                str5 = "ar_key";
            } else if (!jSONObject.has(ARConfigKey.OLD_AR_KEY)) {
                str2 = null;
                setARKey(str2);
                setARPath(!jSONObject.has(ARConfigKey.AR_PATH) ? jSONObject.getString(ARConfigKey.AR_PATH) : null);
                if (!jSONObject.has("ar_type")) {
                    str4 = "ar_type";
                } else if (!jSONObject.has("arType")) {
                    str3 = null;
                    if (TextUtils.isEmpty(str3)) {
                        setARType(ARType.TRACK_2D.getTypeValue());
                    } else {
                        setARType(Integer.parseInt(str3));
                        setARInitialType(Integer.parseInt(str3));
                    }
                    string = jSONObject.has(ARConfigKey.AR_LAUNCH_MODE) ? jSONObject.getString(ARConfigKey.AR_LAUNCH_MODE) : null;
                    if (TextUtils.isEmpty(string)) {
                        setARLaunchMode(0);
                    } else {
                        setARLaunchMode(Integer.parseInt(string));
                    }
                    string2 = jSONObject.has(ARConfigKey.AR_ID) ? jSONObject.getString(ARConfigKey.AR_ID) : null;
                    setARId(string2);
                    if (TextUtils.isEmpty(getARKey()) && string2 != null) {
                        try {
                            setARKey(new JSONObject(string2).optString(DownloadService.KEY_CONTENT_ID));
                        } catch (JSONException e8) {
                            e8.printStackTrace();
                        }
                    }
                    if (jSONObject.has(ARConfigKey.AR_FROM)) {
                        setArFrom(jSONObject.getString(ARConfigKey.AR_FROM));
                    }
                    if (jSONObject.has(ARConfigKey.AR_NEED_LAST_PREVIEW)) {
                        setIsNeedLastPreview(jSONObject.getBoolean(ARConfigKey.AR_NEED_LAST_PREVIEW));
                    }
                    if (jSONObject.has(ARConfigKey.EXTRA_INFO)) {
                        setARExtraInfo(jSONObject.getString(ARConfigKey.EXTRA_INFO));
                        return;
                    }
                    return;
                }
                str3 = jSONObject.getString(str4);
                if (TextUtils.isEmpty(str3)) {
                }
                if (jSONObject.has(ARConfigKey.AR_LAUNCH_MODE)) {
                }
                if (TextUtils.isEmpty(string)) {
                }
                if (jSONObject.has(ARConfigKey.AR_ID)) {
                }
                setARId(string2);
                if (TextUtils.isEmpty(getARKey())) {
                    setARKey(new JSONObject(string2).optString(DownloadService.KEY_CONTENT_ID));
                }
                if (jSONObject.has(ARConfigKey.AR_FROM)) {
                }
                if (jSONObject.has(ARConfigKey.AR_NEED_LAST_PREVIEW)) {
                }
                if (jSONObject.has(ARConfigKey.EXTRA_INFO)) {
                }
            }
            str2 = jSONObject.getString(str5);
            setARKey(str2);
            setARPath(!jSONObject.has(ARConfigKey.AR_PATH) ? jSONObject.getString(ARConfigKey.AR_PATH) : null);
            if (!jSONObject.has("ar_type")) {
            }
            str3 = jSONObject.getString(str4);
            if (TextUtils.isEmpty(str3)) {
            }
            if (jSONObject.has(ARConfigKey.AR_LAUNCH_MODE)) {
            }
            if (TextUtils.isEmpty(string)) {
            }
            if (jSONObject.has(ARConfigKey.AR_ID)) {
            }
            setARId(string2);
            if (TextUtils.isEmpty(getARKey())) {
            }
            if (jSONObject.has(ARConfigKey.AR_FROM)) {
            }
            if (jSONObject.has(ARConfigKey.AR_NEED_LAST_PREVIEW)) {
            }
            if (jSONObject.has(ARConfigKey.EXTRA_INFO)) {
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static boolean isBox() {
        return "2".equals(DuMixARConfig.getAipAppId()) && !"com.baidu.ar.boxdemo".equals(DuMixARConfig.getPackageName());
    }

    public static boolean isNeedLastPreview() {
        return mIsNeedLastPreview;
    }

    public static boolean isOpen() {
        return isOpen(DuMixARConfig.getAipAppId());
    }

    public static void setARExtraInfo(String str) {
        mARExtraInfo = str;
    }

    public static void setARId(String str) {
        mARId = str;
    }

    public static void setARInitialType(int i8) {
        mARInitialType = i8;
    }

    public static void setARKey(String str) {
        mARKey = str;
    }

    public static void setARLaunchMode(int i8) {
        mARLaunchMode = i8;
    }

    public static void setARPath(String str) {
        mARPath = str;
    }

    public static void setARType(int i8) {
        mARType = i8;
    }

    public static void setArFrom(String str) {
        mArFrom = str;
    }

    public static void setCUID(String str) {
        sCUID = str;
    }

    public static void setIsNeedLastPreview(boolean z7) {
        mIsNeedLastPreview = z7;
    }

    public static Object[] getSignatureAndTime(String str, String str2) {
        Object[] objArr = new Object[2];
        long currentTimeMillis = System.currentTimeMillis();
        if (isOpen(str)) {
            objArr[0] = k8.b(str + AR_SDK_SALT_FIGURE + currentTimeMillis);
        } else {
            objArr[0] = k8.b(str + str2 + AR_SDK_SALT_FIGURE + currentTimeMillis);
        }
        objArr[1] = Long.valueOf(currentTimeMillis);
        return objArr;
    }

    public static boolean isOpen(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return Long.parseLong(str) > 10000;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
