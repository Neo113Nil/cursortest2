package com.my.tracker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.AbstractC1620c3;
import com.my.tracker.obfuscated.AbstractC1708y2;
import com.my.tracker.obfuscated.C1623d1;
import com.my.tracker.obfuscated.C1712z2;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class MyTracker {

    @NonNull
    public static final String VERSION = "3.3.2";

    /* renamed from: a, reason: collision with root package name */
    private static final List f20844a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    private static volatile C1623d1 f20845b;

    public interface AttributionListener {
        void onReceiveAttribution(@NonNull MyTrackerAttribution myTrackerAttribution);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1712z2 f20846a;

        /* renamed from: b, reason: collision with root package name */
        static final MyTrackerConfig f20847b;

        static {
            C1712z2 x4 = C1712z2.x();
            f20846a = x4;
            f20847b = MyTrackerConfig.newConfig(x4);
        }
    }

    private static void a(int i4, boolean z4) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(i4, z4);
        }
    }

    public static void applyPlugin(@NonNull MyTrackerPluginConfig myTrackerPluginConfig) {
        f20844a.add(myTrackerPluginConfig);
    }

    public static void flush() {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a();
        }
    }

    @NonNull
    public static String getInstanceId(@NonNull Context context) {
        return AbstractC1620c3.a(context);
    }

    @NonNull
    public static MyTrackerConfig getTrackerConfig() {
        return a.f20847b;
    }

    @NonNull
    public static MyTrackerParams getTrackerParams() {
        return a.f20846a.m();
    }

    public static String handleDeeplink(Intent intent) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 != null) {
            return c1623d1.a(intent);
        }
        AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        return null;
    }

    public static void incrementEventTimeSpent(int i4) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(i4);
        }
    }

    public static void initTracker(@NonNull String str, @NonNull Application application) {
        if (TextUtils.isEmpty(str)) {
            AbstractC1708y2.b("MyTracker initialization failed: id can't be empty");
            return;
        }
        if (f20845b != null) {
            AbstractC1708y2.c("MyTracker has already been initialized");
            return;
        }
        synchronized (MyTracker.class) {
            try {
                if (f20845b != null) {
                    AbstractC1708y2.c("MyTracker has already been initialized");
                } else {
                    C1712z2 c1712z2 = a.f20846a;
                    ArrayList arrayList = new ArrayList(f20844a);
                    C1623d1 a4 = C1623d1.a(str, c1712z2, application);
                    a4.a(arrayList);
                    f20845b = a4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isDebugMode() {
        return AbstractC1708y2.a();
    }

    public static void onActivityResult(int i4, Intent intent) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(i4, intent);
        }
    }

    public static void onPurchasesUpdated(int i4, List<Object> list) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(i4, list);
        }
    }

    public static void setAttributionListener(AttributionListener attributionListener) {
        setAttributionListener(attributionListener, null);
    }

    public static void setDebugMode(boolean z4) {
        AbstractC1708y2.a(z4);
    }

    public static void startAnytimeTimeSpent(int i4) {
        a(i4, true);
    }

    public static void startForegroundTimeSpent(int i4) {
        a(i4, false);
    }

    public static void stopAnytimeTimeSpent(int i4) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.b(i4, true);
        }
    }

    public static void stopForegroundTimeSpent(int i4) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.b(i4, false);
        }
    }

    public static void trackAdEvent(@NonNull AdEvent adEvent) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(adEvent);
        }
    }

    public static void trackAppGalleryPurchaseEvent(@NonNull Object obj, @NonNull String str, @NonNull String str2, @NonNull String str3, Map<String, String> map) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(obj, str, str2, str3, map);
        }
    }

    public static void trackEvent(@NonNull String str) {
        trackEvent(str, null);
    }

    public static void trackInviteEvent() {
        trackInviteEvent(null);
    }

    public static void trackLaunchManually(@NonNull Activity activity) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(activity);
        }
    }

    public static void trackLevelEvent() {
        trackLevelEvent(null);
    }

    public static void trackLoginEvent(@NonNull String str, String str2) {
        trackLoginEvent(str, str2, null);
    }

    public static void trackMiniAppEvent(@NonNull MiniAppEvent miniAppEvent) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(miniAppEvent);
        }
    }

    public static void trackPurchaseEvent(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull String str) {
        trackPurchaseEvent(jSONObject, jSONObject2, str, null);
    }

    public static void trackRegistrationEvent(@NonNull String str, String str2) {
        trackRegistrationEvent(str, str2, null);
    }

    public static void setAttributionListener(AttributionListener attributionListener, Handler handler) {
        a.f20846a.a(attributionListener, handler);
    }

    public static void trackEvent(@NonNull String str, Map<String, String> map) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(str, map);
        }
    }

    public static void trackInviteEvent(Map<String, String> map) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(map);
        }
    }

    public static void trackLevelEvent(int i4, Map<String, String> map) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(i4, map);
        }
    }

    public static void trackLoginEvent(@NonNull String str, String str2, Map<String, String> map) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(str, str2, map);
        }
    }

    public static void trackPurchaseEvent(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull String str, Map<String, String> map) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.a(jSONObject, jSONObject2, str, map);
        }
    }

    public static void trackRegistrationEvent(@NonNull String str, String str2, Map<String, String> map) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.b(str, str2, map);
        }
    }

    public static void trackLevelEvent(Map<String, String> map) {
        C1623d1 c1623d1 = f20845b;
        if (c1623d1 == null) {
            AbstractC1708y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1623d1.b(map);
        }
    }
}
