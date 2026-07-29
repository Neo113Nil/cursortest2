package com.umeng.analytics;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tapjoy.TapjoyConstants;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.dplus.UMADplus;
import com.umeng.analytics.game.UMGameAgent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UnityUtil {
    public static Map<String, Object> jsonToMap(JSONObject jSONObject) throws JSONException {
        return jSONObject != JSONObject.NULL ? toMap(jSONObject) : new HashMap();
    }

    private static Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    private static List<Object> toList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static void registerSuperPropertyAll(Context context, String str) throws JSONException {
        for (Map.Entry<String, Object> entry : toMap(new JSONObject(str)).entrySet()) {
            UMADplus.registerSuperProperty(context, entry.getKey(), entry.getValue());
        }
    }

    public static void track(Context context, String str, String str2) throws JSONException {
        UMADplus.track(context, str, toMap(new JSONObject(str2)));
    }

    public static String getSuperProperty(Context context, String str) throws JSONException {
        Object superProperty = UMADplus.getSuperProperty(context, str);
        HashMap hashMap = new HashMap();
        hashMap.put("__umeng_internal_data_", superProperty);
        return new JSONObject(hashMap).toString();
    }

    public static void setFirstLaunchEvent(Context context, String str) {
        UMADplus.setFirstLaunchEvent(context, Arrays.asList(str.split(";=umengUnity=;")));
    }

    public static void initUnity(Context context, String str, String str2) {
        MobclickAgent.setScenarioType(context, MobclickAgent.EScenarioType.E_DUM_GAME);
        UMGameAgent.init(context);
    }

    public static boolean checkPermission(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0) {
                    return true;
                }
            } catch (Exception unused) {
            }
        } else if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[Catch: Exception -> 0x0098, TryCatch #5 {Exception -> 0x0098, blocks: (B:3:0x0001, B:5:0x0016, B:7:0x001c, B:14:0x0036, B:17:0x003e, B:18:0x0072, B:21:0x007e, B:23:0x0084, B:24:0x008e, B:29:0x0043, B:31:0x003b, B:48:0x004b, B:51:0x0055, B:56:0x005d, B:55:0x005a, B:60:0x0050, B:35:0x005f, B:39:0x0069, B:42:0x006e, B:45:0x0064, B:65:0x0024), top: B:2:0x0001, inners: #0, #1, #2, #3, #6, #8, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getDeviceInfo(Context context) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            String deviceId = checkPermission(context, "android.permission.READ_PHONE_STATE") ? ((TelephonyManager) context.getSystemService("phone")).getDeviceId() : null;
            try {
                fileReader = new FileReader("/sys/class/net/wlan0/address");
            } catch (FileNotFoundException unused) {
                fileReader = new FileReader("/sys/class/net/eth0/address");
            }
            try {
                bufferedReader = new BufferedReader(fileReader, 1024);
                try {
                    str = bufferedReader.readLine();
                    try {
                        fileReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } catch (IOException unused2) {
                    try {
                        fileReader.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    str = null;
                    jSONObject.put("mac", str);
                    if (TextUtils.isEmpty(deviceId)) {
                    }
                    if (TextUtils.isEmpty(deviceId)) {
                    }
                    jSONObject.put("device_id", deviceId);
                    return jSONObject.toString();
                } catch (Throwable th) {
                    th = th;
                    try {
                        fileReader.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            throw th;
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
            jSONObject.put("mac", str);
            if (TextUtils.isEmpty(deviceId)) {
                deviceId = str;
            }
            if (TextUtils.isEmpty(deviceId)) {
                deviceId = Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
            }
            jSONObject.put("device_id", deviceId);
            return jSONObject.toString();
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
