package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.ck;
import com.ironsource.ec;
import com.ironsource.fk;
import com.ironsource.gh;
import com.ironsource.mh;
import com.ironsource.nh;
import com.ironsource.o9;
import com.ironsource.oo;
import com.ironsource.sdk.controller.C1561e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.sj;
import com.ironsource.wj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IronSourceNetwork {

    /* renamed from: a, reason: collision with root package name */
    static final String f19050a = "IronSourceNetwork";

    /* renamed from: b, reason: collision with root package name */
    private static ck f19051b;

    /* renamed from: c, reason: collision with root package name */
    private static List<oo> f19052c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static fk f19053d;

    private static synchronized void a() {
        synchronized (IronSourceNetwork.class) {
            if (f19051b == null) {
                throw new NullPointerException("Call initSDK first");
            }
        }
    }

    public static synchronized void addInitListener(oo ooVar) {
        synchronized (IronSourceNetwork.class) {
            fk fkVar = f19053d;
            if (fkVar == null) {
                f19052c.add(ooVar);
            } else if (fkVar.b()) {
                ooVar.onSuccess();
            } else {
                ooVar.onFail(f19053d.a());
            }
        }
    }

    public static synchronized void destroyAd(sj sjVar) {
        synchronized (IronSourceNetwork.class) {
            a();
            f19051b.b(sjVar);
        }
    }

    public static synchronized C1561e getControllerManager() {
        C1561e a4;
        synchronized (IronSourceNetwork.class) {
            a4 = f19051b.a();
        }
        return a4;
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            if (TextUtils.isEmpty(str)) {
                Logger.e(f19050a, "applicationKey is NULL");
                return;
            }
            if (f19051b == null) {
                SDKUtils.setInitSDKParams(map);
                try {
                    a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
                } catch (Exception e4) {
                    o9.d().a(e4);
                    Logger.e(f19050a, "Failed to init event tracker: " + e4.getMessage());
                }
                f19051b = wj.a(context, str, str2);
            }
        }
    }

    public static synchronized boolean isAdAvailableForInstance(sj sjVar) {
        synchronized (IronSourceNetwork.class) {
            ck ckVar = f19051b;
            if (ckVar == null) {
                return false;
            }
            return ckVar.a(sjVar);
        }
    }

    public static synchronized void loadAd(sj sjVar, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            f19051b.a(sjVar, map);
        }
    }

    public static synchronized void loadAdView(Activity activity, sj sjVar, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            f19051b.b(activity, sjVar, map);
        }
    }

    public static void onPause(Activity activity) {
        ck ckVar = f19051b;
        if (ckVar == null) {
            return;
        }
        ckVar.onPause(activity);
    }

    public static void onResume(Activity activity) {
        ck ckVar = f19051b;
        if (ckVar == null) {
            return;
        }
        ckVar.onResume(activity);
    }

    public static synchronized void release(Activity activity) {
        synchronized (IronSourceNetwork.class) {
            ck ckVar = f19051b;
            if (ckVar == null) {
                return;
            }
            ckVar.a(activity);
        }
    }

    public static synchronized void showAd(Activity activity, sj sjVar, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            f19051b.a(activity, sjVar, map);
        }
    }

    public static synchronized void updateInitFailed(gh ghVar) {
        synchronized (IronSourceNetwork.class) {
            try {
                f19053d = new fk(ghVar);
                Iterator<oo> it = f19052c.iterator();
                while (it.hasNext()) {
                    it.next().onFail(ghVar);
                }
                f19052c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void updateInitSucceeded() {
        synchronized (IronSourceNetwork.class) {
            try {
                f19053d = new fk();
                Iterator<oo> it = f19052c.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess();
                }
                f19052c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void a(Context context, JSONObject jSONObject, String str, String str2, Map<String, String> map) {
        if (jSONObject != null) {
            ec a4 = nh.a(jSONObject);
            if (a4.a()) {
                mh.a(a4, nh.a(context, str, str2, map));
            }
        }
    }
}
