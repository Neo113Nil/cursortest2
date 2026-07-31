package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.b9;
import com.ironsource.fh;
import com.ironsource.gr;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.of;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SDKUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19554a = "SDKUtils";

    /* renamed from: b, reason: collision with root package name */
    private static String f19555b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f19556c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f19557d = null;

    /* renamed from: e, reason: collision with root package name */
    private static int f19558e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static String f19559f = null;

    /* renamed from: g, reason: collision with root package name */
    private static Map<String, String> f19560g = null;

    /* renamed from: h, reason: collision with root package name */
    private static String f19561h = "";

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f19562i = new AtomicInteger(1);

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        AtomicInteger atomicInteger;
        int i4;
        int i5;
        do {
            atomicInteger = f19562i;
            i4 = atomicInteger.get();
            i5 = i4 + 1;
            if (i5 > 16777215) {
                i5 = 1;
            }
        } while (!atomicInteger.compareAndSet(i4, i5));
        return i4;
    }

    public static int convertDpToPx(int i4) {
        return (int) TypedValue.applyDimension(0, i4, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i4) {
        return (int) TypedValue.applyDimension(1, i4, Resources.getSystem().getDisplayMetrics());
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            o9.d().a(e4);
            Logger.d(f19554a, "Failed decoding string " + e4.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j4) {
        return (int) ((j4 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e4) {
            o9.d().a(e4);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] encrypt(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
            try {
                messageDigest.reset();
                messageDigest.update(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e4) {
                e = e4;
                o9.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                if (messageDigest != null) {
                }
            } catch (NoSuchAlgorithmException e5) {
                e = e5;
                o9.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                if (messageDigest != null) {
                }
            }
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e6) {
            e = e6;
            messageDigest = null;
        }
        if (messageDigest != null) {
            return messageDigest.digest();
        }
        return null;
    }

    public static String fetchDemandSourceId(gr grVar) {
        return fetchDemandSourceId(grVar.a());
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e4) {
                    o9.d().a(e4);
                    Logger.i(f19554a, "flatMapToJsonAsStringfailed " + e4.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z4) {
        return z4 ? 5894 : 1798;
    }

    public static String getAdvertiserId() {
        return f19555b;
    }

    public static String getControllerConfig() {
        return f19559f;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(f19557d) ? f19557d : "";
    }

    public static int getDebugMode() {
        return f19558e;
    }

    public static String getFileName(String str) {
        try {
            return URLEncoder.encode(str.split(File.separator)[r1.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f19560g;
    }

    public static String getLimitAdTracking() {
        return f19556c;
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e4) {
            o9.d().a(e4);
            throw new RuntimeException(e4);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(b9.d.f15347b);
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(b9.a.f15288b);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) {
        of f4 = nm.S().f();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(b9.h.f15492n, translateOrientation(f4.H(context)));
            return jSONObject;
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return jSONObject;
        }
    }

    public static fh.e getProductType(String str) {
        fh.e eVar = fh.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        fh.e eVar2 = fh.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "8.8.0";
    }

    public static String getTesterParameters() {
        return f19561h;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception e4) {
            o9.d().a(e4);
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState)) {
                return true;
            }
            return "mounted_ro".equals(externalStorageState);
        } catch (Exception e4) {
            o9.d().a(e4);
            return false;
        }
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity);
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        of f4 = nm.S().f();
        String p4 = f4.p(context);
        String a4 = f4.a(context);
        if (!TextUtils.isEmpty(p4)) {
            f19555b = p4;
        }
        if (TextUtils.isEmpty(a4)) {
            return;
        }
        f19556c = a4;
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap hashMap = new HashMap();
        if (mapArr != null) {
            for (Map<String, String> map : mapArr) {
                if (map != null) {
                    hashMap.putAll(map);
                }
            }
        }
        return hashMap;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                String string = jSONArray.getString(i4);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j4) {
        return (int) ((j4 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f19559f = str;
        nm.M().n().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(String str) {
        f19557d = str;
    }

    public static void setDebugMode(int i4) {
        f19558e = i4;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f19560g = map;
    }

    public static void setTesterParameters(String str) {
        f19561h = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new a()).show();
    }

    public static String translateDeviceOrientation(int i4) {
        return i4 != 1 ? i4 != 2 ? "none" : b9.h.f15433C : b9.h.f15435D;
    }

    public static String translateOrientation(int i4) {
        return i4 != 1 ? i4 != 2 ? "none" : b9.h.f15433C : b9.h.f15435D;
    }

    public static String translateRequestedOrientation(int i4) {
        if (i4 == 0) {
            return b9.h.f15433C;
        }
        if (i4 == 1) {
            return b9.h.f15435D;
        }
        if (i4 == 11) {
            return b9.h.f15433C;
        }
        if (i4 == 12) {
            return b9.h.f15435D;
        }
        switch (i4) {
            case 6:
            case 8:
                return b9.h.f15433C;
            case 7:
            case 9:
                return b9.h.f15435D;
            default:
                return "none";
        }
    }

    public static void updateControllerConfig(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(f19559f);
            jSONObject2.put(str, jSONObject);
            f19559f = jSONObject2.toString();
        } catch (JSONException e4) {
            o9.d().a(e4);
            Logger.i(f19554a, "Unable to update controllerConfigs: " + e4.toString());
        }
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(optString) ? optString : jSONObject.optString("demandSourceName");
    }
}
