package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.lbsapi.auth.LBSAuthManagerListener;
import com.baidu.mapapi.CommonInfo;
import com.baidu.mapapi.RequestAuthResultListener;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.crrepa.band.my.model.storage.BaseParamNames;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PermissionCheck {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8216a = "PermissionCheck";

    /* renamed from: b, reason: collision with root package name */
    private static Context f8217b;

    /* renamed from: c, reason: collision with root package name */
    private static String f8218c;

    /* renamed from: d, reason: collision with root package name */
    private static Hashtable<String, String> f8219d;

    /* renamed from: e, reason: collision with root package name */
    private static LBSAuthManager f8220e;

    /* renamed from: f, reason: collision with root package name */
    private static LBSAuthManagerListener f8221f;

    /* renamed from: g, reason: collision with root package name */
    private static d f8222g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set<RequestAuthResultListener> f8223h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f8224i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static int f8225j = 601;

    /* renamed from: k, reason: collision with root package name */
    private static boolean f8226k = false;

    /* renamed from: l, reason: collision with root package name */
    public static int f8227l = 200;

    /* renamed from: m, reason: collision with root package name */
    public static int f8228m = 202;

    /* renamed from: n, reason: collision with root package name */
    public static int f8229n = 252;

    /* renamed from: o, reason: collision with root package name */
    public static int f8230o = -11;

    /* renamed from: p, reason: collision with root package name */
    public static int f8231p = -10;

    private static class b implements LBSAuthManagerListener {
        private b() {
        }

        @Override // com.baidu.lbsapi.auth.LBSAuthManagerListener
        public void onAuthResult(int i8, String str) {
            if (str == null) {
                Log.e(PermissionCheck.f8216a, "The result is null");
                int permissionCheck = PermissionCheck.permissionCheck();
                Log.d(PermissionCheck.f8216a, "onAuthResult try permissionCheck result is: " + permissionCheck);
                synchronized (PermissionCheck.f8224i) {
                    try {
                        for (RequestAuthResultListener requestAuthResultListener : PermissionCheck.f8223h) {
                            if (requestAuthResultListener != null) {
                                requestAuthResultListener.onAuthResult(2, RequestAuthResultListener.MESSAGE_AUTH_RESULT_NULL);
                            }
                        }
                    } finally {
                    }
                }
                return;
            }
            c cVar = new c();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("status")) {
                    cVar.f8232a = jSONObject.optInt("status");
                }
                if (jSONObject.has("appid")) {
                    cVar.f8234c = jSONObject.optString("appid");
                }
                if (jSONObject.has("uid")) {
                    cVar.f8233b = jSONObject.optString("uid");
                }
                if (jSONObject.has("message")) {
                    cVar.f8235d = jSONObject.optString("message");
                }
                if (jSONObject.has(BaseParamNames.TOKEN)) {
                    cVar.f8236e = jSONObject.optString(BaseParamNames.TOKEN);
                }
                if (jSONObject.has("ak_permission")) {
                    cVar.f8237f = jSONObject.optInt("ak_permission");
                }
                if (jSONObject.has("user_permission")) {
                    cVar.f8238g = jSONObject.optInt("user_permission");
                }
                if (jSONObject.has("ap")) {
                    cVar.f8239h = jSONObject.optLong("ap");
                }
                if (jSONObject.has(MapBundleKey.OfflineMapKey.OFFLINE_UPDATE)) {
                    cVar.f8240i = jSONObject.optLong(MapBundleKey.OfflineMapKey.OFFLINE_UPDATE);
                }
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
            int unused = PermissionCheck.f8225j = cVar.f8232a;
            if (PermissionCheck.f8222g != null && PermissionCheck.f8226k) {
                PermissionCheck.f8222g.a(cVar);
            }
            synchronized (PermissionCheck.f8224i) {
                try {
                    for (RequestAuthResultListener requestAuthResultListener2 : PermissionCheck.f8223h) {
                        if (requestAuthResultListener2 != null) {
                            requestAuthResultListener2.onAuthResult(cVar.f8232a, cVar.f8235d);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f8232a = 0;

        /* renamed from: b, reason: collision with root package name */
        public String f8233b = "-1";

        /* renamed from: c, reason: collision with root package name */
        public String f8234c = "-1";

        /* renamed from: d, reason: collision with root package name */
        public String f8235d = "";

        /* renamed from: e, reason: collision with root package name */
        public String f8236e;

        /* renamed from: f, reason: collision with root package name */
        public int f8237f;

        /* renamed from: g, reason: collision with root package name */
        public int f8238g;

        /* renamed from: h, reason: collision with root package name */
        public long f8239h;

        /* renamed from: i, reason: collision with root package name */
        public long f8240i;

        public String toString() {
            return String.format("=============================================\n----------------- 鉴权错误信息 ------------\nsha1;package:%s\nkey:%s\nerrorcode: %d uid: %s appid %s msg: %s\n请仔细核查 SHA1、package与key申请信息是否对应，key是否删除，平台是否匹配\n=============================================\n", com.baidu.mapsdkplatform.comapi.util.a.a(PermissionCheck.f8217b), PermissionCheck.f8218c, Integer.valueOf(this.f8232a), this.f8233b, this.f8234c, this.f8235d);
        }
    }

    public interface d {
        void a(c cVar);
    }

    public static void addRequestAuthResultListener(RequestAuthResultListener requestAuthResultListener) {
        synchronized (f8224i) {
            if (requestAuthResultListener != null) {
                try {
                    f8223h.add(requestAuthResultListener);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void destory() {
        f8222g = null;
        f8217b = null;
        f8221f = null;
    }

    public static String getApiKey() {
        return f8218c;
    }

    public static int getPermissionResult() {
        return f8225j;
    }

    public static void init(Context context) {
        ApplicationInfo applicationInfo;
        String str;
        f8217b = context;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(f8217b.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            applicationInfo = null;
        }
        if (applicationInfo != null && TextUtils.isEmpty(f8218c)) {
            f8218c = applicationInfo.metaData.getString("com.baidu.lbsapi.API_KEY");
        }
        if (f8219d == null) {
            f8219d = new Hashtable<>();
        }
        if (f8220e == null) {
            f8220e = LBSAuthManager.getInstance(f8217b);
        }
        if (f8221f == null) {
            f8221f = new b();
        }
        try {
            str = context.getPackageManager().getPackageInfo(f8217b.getPackageName(), 0).applicationInfo.loadLabel(f8217b.getPackageManager()).toString();
        } catch (Exception e9) {
            e9.printStackTrace();
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject(g.s());
            f8219d.put("mb", jSONObject.optString("mb"));
            f8219d.put("os", jSONObject.optString("os"));
            f8219d.put("sv", jSONObject.optString("sv"));
            f8219d.put("imt", "1");
            f8219d.put("net", jSONObject.optString("net"));
            f8219d.put("cpu", jSONObject.optString("cpu"));
            f8219d.put("glr", jSONObject.optString("glr"));
            f8219d.put("glv", jSONObject.optString("glv"));
            f8219d.put("resid", jSONObject.optString("resid"));
            f8219d.put("appid", "-1");
            f8219d.put("ver", "1");
            f8219d.put("screen", String.format("(%d,%d)", Integer.valueOf(jSONObject.optInt("screen_x")), Integer.valueOf(jSONObject.optInt("screen_y"))));
            f8219d.put("dpi", String.format("(%d,%d)", Integer.valueOf(jSONObject.optInt("dpi_x")), Integer.valueOf(jSONObject.optInt("dpi_y"))));
            f8219d.put("pcn", jSONObject.optString("pcn"));
            f8219d.put("cuid", jSONObject.optString("cuid"));
            f8219d.put("name", str);
        } catch (Exception unused) {
        }
    }

    public static synchronized int permissionCheck() {
        synchronized (PermissionCheck.class) {
            try {
                if (!f8226k) {
                    return 0;
                }
                LBSAuthManager lBSAuthManager = f8220e;
                if (lBSAuthManager != null && f8221f != null && f8217b != null) {
                    lBSAuthManager.setKey(f8218c);
                    CommonInfo a8 = com.baidu.mapsdkplatform.comapi.b.a();
                    if (a8 != null) {
                        String androidID = a8.getAndroidID();
                        if (!TextUtils.isEmpty(androidID)) {
                            f8220e.setAndroidId(androidID);
                        }
                    }
                    int authenticate = f8220e.authenticate(false, "lbs_androidsdk", f8219d, f8221f);
                    if (authenticate != 0) {
                        Log.e(f8216a, "permission check result is: " + authenticate);
                    }
                    return authenticate;
                }
                Log.e(f8216a, "The authManager is: " + f8220e + "; the authCallback is: " + f8221f + "; the mContext is: " + f8217b);
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void removeRequestAuthResultListener(RequestAuthResultListener requestAuthResultListener) {
        synchronized (f8224i) {
            if (requestAuthResultListener != null) {
                try {
                    f8223h.remove(requestAuthResultListener);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void setApiKey(String str) {
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        f8218c = str;
    }

    public static void setPermissionCheckResultListener(d dVar) {
        f8222g = dVar;
    }

    public static void setPrivacyMode(boolean z7) {
        f8226k = z7;
        if (z7) {
            permissionCheck();
        } else {
            g.u();
        }
    }
}
