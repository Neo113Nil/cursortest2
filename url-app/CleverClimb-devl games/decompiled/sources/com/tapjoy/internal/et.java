package com.tapjoy.internal;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import com.tapjoy.FiveRocksIntegration;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJEarnedCurrencyListener;
import com.tapjoy.TJEventOptimizer;
import com.tapjoy.TJGetCurrencyBalanceListener;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.TJSetUserIDListener;
import com.tapjoy.TJSpendCurrencyListener;
import com.tapjoy.TJVideoListener;
import com.tapjoy.TapjoyAppSettings;
import com.tapjoy.TapjoyCache;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.TapjoyConnectFlag;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyException;
import com.tapjoy.TapjoyIntegrationException;
import com.tapjoy.TapjoyLog;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
class et extends es {

    /* renamed from: c, reason: collision with root package name */
    private boolean f8030c = false;

    /* renamed from: d, reason: collision with root package name */
    private String f8031d = "";
    private TJCurrency e = null;
    private TapjoyCache f = null;

    @Override // com.tapjoy.internal.es
    public final String b() {
        return "12.3.1";
    }

    et() {
    }

    @Override // com.tapjoy.internal.es
    public final void a(boolean z) {
        TapjoyLog.setDebugEnabled(z);
    }

    @Override // com.tapjoy.internal.es
    public final boolean a(Context context, String str) {
        return a(context, str, (Hashtable) null, (TJConnectListener) null);
    }

    @Override // com.tapjoy.internal.es
    public synchronized boolean a(final Context context, String str, Hashtable hashtable, final TJConnectListener tJConnectListener) {
        String valueOf;
        if (hashtable != null) {
            try {
                Object obj = hashtable.get(TapjoyConnectFlag.ENABLE_LOGGING);
                if (obj != null) {
                    TapjoyLog.setDebugEnabled("true".equals(obj.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        TapjoyConnectCore.setSDKType("event");
        boolean z = false;
        if (context == null) {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "The application context is NULL"));
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
            return false;
        }
        if (jr.c(str)) {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "The SDK key is NULL. A valid SDK key is required to connect successfully to Tapjoy"));
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
            return false;
        }
        FiveRocksIntegration.a();
        try {
            TapjoyAppSettings.init(context);
            TapjoyConnectCore.requestTapjoyConnect(context, str, hashtable, new TJConnectListener() { // from class: com.tapjoy.internal.et.1
                @Override // com.tapjoy.TJConnectListener
                public final void onConnectSuccess() {
                    et.this.e = new TJCurrency(context);
                    et.this.f = new TapjoyCache(context);
                    try {
                        TJEventOptimizer.init(context);
                        et.this.f8028a = true;
                        if (tJConnectListener != null) {
                            tJConnectListener.onConnectSuccess();
                        }
                    } catch (InterruptedException unused) {
                        onConnectFailure();
                    } catch (RuntimeException e) {
                        TapjoyLog.w("TapjoyAPI", e.getMessage());
                        onConnectFailure();
                    }
                }

                @Override // com.tapjoy.TJConnectListener
                public final void onConnectFailure() {
                    if (tJConnectListener != null) {
                        tJConnectListener.onConnectFailure();
                    }
                }
            });
            this.f8030c = true;
            if (Build.VERSION.SDK_INT < 14) {
                TapjoyLog.i("TapjoyAPI", "Automatic session tracking is not available on this device.");
            } else {
                if (hashtable != null && (valueOf = String.valueOf(hashtable.get(TapjoyConnectFlag.DISABLE_AUTOMATIC_SESSION_TRACKING))) != null && valueOf.equalsIgnoreCase("true")) {
                    z = true;
                }
                if (!z) {
                    fm.a(context);
                } else {
                    TapjoyLog.i("TapjoyAPI", "Automatic session tracking is disabled.");
                }
            }
            return true;
        } catch (TapjoyIntegrationException e) {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e.getMessage()));
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
            return false;
        } catch (TapjoyException e2) {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e2.getMessage()));
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
            return false;
        }
    }

    @Override // com.tapjoy.internal.es
    public final synchronized boolean a(final Context context, String str, final TJConnectListener tJConnectListener) {
        TapjoyConnectCore.setSDKType("event");
        if (context == null) {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "The application context is NULL"));
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
            return false;
        }
        if (jr.c(str)) {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "The limited SDK key is NULL. A valid limited SDK key is required to connect successfully to Tapjoy"));
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
            return false;
        }
        try {
            TapjoyConnectCore.requestLimitedTapjoyConnect(context, str, new TJConnectListener() { // from class: com.tapjoy.internal.et.2
                @Override // com.tapjoy.TJConnectListener
                public final void onConnectSuccess() {
                    et.this.f = new TapjoyCache(context);
                    et.this.f8029b = true;
                    if (tJConnectListener != null) {
                        tJConnectListener.onConnectSuccess();
                    }
                }

                @Override // com.tapjoy.TJConnectListener
                public final void onConnectFailure() {
                    if (tJConnectListener != null) {
                        tJConnectListener.onConnectFailure();
                    }
                }
            });
            return true;
        } catch (TapjoyIntegrationException e) {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e.getMessage()));
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
            return false;
        } catch (TapjoyException e2) {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e2.getMessage()));
            if (tJConnectListener != null) {
                tJConnectListener.onConnectFailure();
            }
            return false;
        }
    }

    @Override // com.tapjoy.internal.es
    public final TJPlacement a(String str, TJPlacementListener tJPlacementListener) {
        return TJPlacementManager.a(str, "", "", tJPlacementListener);
    }

    @Override // com.tapjoy.internal.es
    public final TJPlacement b(String str, TJPlacementListener tJPlacementListener) {
        return TJPlacementManager.b(str, "", "", tJPlacementListener);
    }

    @Override // com.tapjoy.internal.es
    public final void a(Activity activity) {
        if (activity != null) {
            b.a(activity);
        } else {
            TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Cannot set activity to NULL"));
        }
    }

    @Override // com.tapjoy.internal.es
    public final void a(float f) {
        if (k("setCurrencyMultiplier")) {
            TapjoyConnectCore.getInstance().setCurrencyMultiplier(f);
        }
    }

    @Override // com.tapjoy.internal.es
    public final float c() {
        if (k("getCurrencyMultiplier")) {
            return TapjoyConnectCore.getInstance().getCurrencyMultiplier();
        }
        return 1.0f;
    }

    @Override // com.tapjoy.internal.es
    public final void e(String str) {
        if (j("actionComplete")) {
            TapjoyConnectCore.getInstance().actionComplete(str);
        }
    }

    @Override // com.tapjoy.internal.es
    public final void a(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener) {
        if (this.e == null || !j("getCurrencyBalance")) {
            return;
        }
        this.e.getCurrencyBalance(tJGetCurrencyBalanceListener);
    }

    @Override // com.tapjoy.internal.es
    public final void a(int i, TJSpendCurrencyListener tJSpendCurrencyListener) {
        if (this.e == null || !j("spendCurrency")) {
            return;
        }
        this.e.spendCurrency(i, tJSpendCurrencyListener);
    }

    @Override // com.tapjoy.internal.es
    public final void a(int i, TJAwardCurrencyListener tJAwardCurrencyListener) {
        if (this.e == null || !j("awardCurrency")) {
            return;
        }
        this.e.awardCurrency(i, tJAwardCurrencyListener);
    }

    @Override // com.tapjoy.internal.es
    public final void a(TJEarnedCurrencyListener tJEarnedCurrencyListener) {
        if (this.e == null || !j("setEarnedCurrencyListener")) {
            return;
        }
        this.e.setEarnedCurrencyListener(tJEarnedCurrencyListener);
    }

    @Override // com.tapjoy.internal.es
    public final void a(TJVideoListener tJVideoListener) {
        if (k("setVideoListener")) {
            TJAdUnit.f7589a = tJVideoListener;
        }
    }

    @Override // com.tapjoy.internal.es
    public final void a(String str, String str2, String str3, String str4) {
        go.a(str, str2, str3, str4);
    }

    @Override // com.tapjoy.internal.es
    public final void a(String str, String str2) {
        go.a(str, null, null, str2);
    }

    @Override // com.tapjoy.internal.es
    public final void a(String str) {
        go.a(null, str, null, null, 0L);
    }

    @Override // com.tapjoy.internal.es
    public final void a(String str, long j) {
        go.a(null, str, null, null, j);
    }

    @Override // com.tapjoy.internal.es
    public final void a(String str, String str2, long j) {
        go.a(str, str2, null, null, j);
    }

    @Override // com.tapjoy.internal.es
    public final void b(String str, String str2, String str3, String str4) {
        go.a(str, str2, str3, str4, 0L);
    }

    @Override // com.tapjoy.internal.es
    public final void a(String str, String str2, String str3, String str4, long j) {
        go.a(str, str2, str3, str4, j);
    }

    @Override // com.tapjoy.internal.es
    public final void a(String str, String str2, String str3, String str4, String str5, long j) {
        go.a(str, str2, str3, str4, str5, j, null, 0L, null, 0L);
    }

    @Override // com.tapjoy.internal.es
    public final void a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2) {
        go.a(str, str2, str3, str4, str5, j, str6, j2, null, 0L);
    }

    @Override // com.tapjoy.internal.es
    public final void a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        go.a(str, str2, str3, str4, str5, j, str6, j2, str7, j3);
    }

    @Override // com.tapjoy.internal.es
    public final void d() {
        if (k("startSession")) {
            if (Build.VERSION.SDK_INT >= 14) {
                fm.a();
            }
            TapjoyConnectCore.getInstance().appResume();
            go.a();
        }
    }

    @Override // com.tapjoy.internal.es
    public final void e() {
        if (k("endSession")) {
            if (Build.VERSION.SDK_INT >= 14) {
                fm.a();
            }
            ha.a().n = false;
            TapjoyConnectCore.getInstance().appPause();
            go.b();
        }
    }

    @Override // com.tapjoy.internal.es
    public final void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 14) {
            fm.a();
        }
        ha.a().n = true;
        go.a(activity);
    }

    @Override // com.tapjoy.internal.es
    public final void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 14) {
            fm.a();
        }
        go.b(activity);
    }

    @Override // com.tapjoy.internal.es
    public final void a(String str, TJSetUserIDListener tJSetUserIDListener) {
        if (!k("setUserID")) {
            if (tJSetUserIDListener != null) {
                tJSetUserIDListener.onSetUserIDFailure(this.f8031d);
            }
        } else {
            TapjoyConnectCore.setUserID(str, tJSetUserIDListener);
            ha a2 = ha.a();
            if (a2.d("setUserId")) {
                a2.f.b(gv.a(str));
            }
        }
    }

    @Override // com.tapjoy.internal.es
    public final Set f() {
        return ha.a().c();
    }

    @Override // com.tapjoy.internal.es
    public final void a(Set set) {
        ha.a().a(set);
    }

    @Override // com.tapjoy.internal.es
    public final void g() {
        ha.a().a((Set) null);
    }

    @Override // com.tapjoy.internal.es
    public final void c(String str) {
        if (jr.c(str)) {
            return;
        }
        ha a2 = ha.a();
        Set c2 = a2.c();
        if (c2.add(str)) {
            a2.a(c2);
        }
    }

    @Override // com.tapjoy.internal.es
    public final void d(String str) {
        if (jr.c(str)) {
            return;
        }
        ha a2 = ha.a();
        Set c2 = a2.c();
        if (c2.remove(str)) {
            a2.a(c2);
        }
    }

    @Override // com.tapjoy.internal.es
    public final boolean h() {
        ha a2 = ha.a();
        if (!a2.d("isPushNotificationDisabled")) {
            return false;
        }
        boolean f = a2.f.f();
        gx.a("isPushNotificationDisabled = {}", Boolean.valueOf(f));
        return f;
    }

    @Override // com.tapjoy.internal.es
    public final void b(boolean z) {
        String str;
        Object[] objArr;
        String str2;
        String b2;
        ha a2 = ha.a();
        if (a2.d("setPushNotificationDisabled")) {
            boolean a3 = a2.f.a(z);
            char c2 = 1;
            if (a3) {
                str = "setPushNotificationDisabled({}) called";
                str2 = Boolean.valueOf(z);
                objArr = new Object[1];
                c2 = 0;
            } else {
                str = "setPushNotificationDisabled({}) called, but it is already {}";
                objArr = new Object[2];
                objArr[0] = Boolean.valueOf(z);
                str2 = z ? "disabled" : TJAdUnitConstants.String.ENABLED;
            }
            objArr[c2] = str2;
            gx.a(str, objArr);
            if (a3 && a2.k && !jr.c(a2.f8237d)) {
                if (a2.o != null) {
                    b2 = null;
                } else {
                    hc b3 = hc.b(a2.e);
                    b2 = jr.b(b3.f8511b.b(b3.f8510a));
                }
                a2.a(b2);
            }
        }
    }

    @Override // com.tapjoy.internal.es
    public final boolean i() {
        return this.f8028a;
    }

    @Override // com.tapjoy.internal.es
    public final boolean j() {
        return this.f8029b;
    }

    @Override // com.tapjoy.internal.es
    public final String g(String str) {
        if (j("getSupportURL")) {
            return TapjoyConnectCore.getSupportURL(str);
        }
        return null;
    }

    @Override // com.tapjoy.internal.es
    public final String k() {
        return TapjoyConnectCore.getUserToken();
    }

    @Override // com.tapjoy.internal.es
    public final void i(String str) {
        ha.a().a(str);
    }

    @Override // com.tapjoy.internal.es
    public final void a(Context context, Map map) {
        ha a2 = ha.a();
        if (a2.e == null) {
            a2.b(context);
        }
        hc.b(a2.e);
        Context context2 = a2.e;
        boolean z = true;
        new Object[1][0] = map;
        String str = (String) map.get("fiverocks");
        if (str != null) {
            if (hd.a(context2).f()) {
                ha.a(context2).b(str);
                return;
            }
            String str2 = (String) map.get(TJAdUnitConstants.String.TITLE);
            String str3 = (String) map.get(TJAdUnitConstants.String.MESSAGE);
            if (str3 != null) {
                String str4 = (String) map.get("rich");
                String str5 = (String) map.get("sound");
                String str6 = (String) map.get("payload");
                String str7 = (String) map.get("always");
                boolean z2 = "true".equals(str7) || Boolean.TRUE.equals(str7);
                String str8 = (String) map.get("repeatable");
                if (!"true".equals(str8) && !Boolean.TRUE.equals(str8)) {
                    z = false;
                }
                String str9 = (String) map.get("placement");
                int b2 = hc.b(map.get("nid"));
                String str10 = (String) map.get("channel_id");
                if (z2 || !ha.a(context2).d()) {
                    Notification a3 = hc.a(context2, str, jr.a(str2), str3, hc.a((Object) str4), hc.a((Object) str5), str6, str9, b2, str10);
                    if (ha.a(context2).a(context2, str, z)) {
                        hc.a(context2, b2, a3);
                    }
                }
            }
        }
    }

    private boolean j(String str) {
        if (this.f8028a) {
            return true;
        }
        TapjoyLog.w("TapjoyAPI", "Can not call " + str + " because Tapjoy SDK has not successfully connected.");
        return false;
    }

    private boolean k(String str) {
        if (this.f8030c) {
            return true;
        }
        this.f8031d = "Can not call " + str + " because Tapjoy SDK is not initialized.";
        TapjoyLog.e("TapjoyAPI", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, this.f8031d));
        return false;
    }

    @Override // com.tapjoy.internal.es
    public final void c(boolean z) {
        gf a2 = gf.a();
        a2.f8180a = Boolean.valueOf(z);
        if (a2.b()) {
            return;
        }
        a2.f8183d = true;
    }

    @Override // com.tapjoy.internal.es
    public final void h(String str) {
        gf a2 = gf.a();
        if (al.a(str)) {
            return;
        }
        a2.f8181b = str;
        if (a2.c()) {
            return;
        }
        a2.f8183d = true;
    }

    @Override // com.tapjoy.internal.es
    public final void d(boolean z) {
        gf a2 = gf.a();
        a2.f8182c = Boolean.valueOf(z);
        if (a2.d()) {
            return;
        }
        a2.f8183d = true;
    }

    @Override // com.tapjoy.internal.es
    public final void a(String str, String str2, double d2, String str3) {
        String a2;
        String a3;
        ha a4 = ha.a();
        if (!a4.c("trackPurchase") || (a2 = gv.a(str, "trackPurchase", InAppPurchaseMetaData.KEY_PRODUCT_ID)) == null || (a3 = gv.a(str2, "trackPurchase", "currencyCode")) == null) {
            return;
        }
        if (a3.length() != 3) {
            gx.a("trackPurchase", "currencyCode", "invalid currency code");
        } else {
            a4.g.a(a2, a3.toUpperCase(Locale.US), d2, (String) null, (String) null, gv.b(str3));
            gx.a("trackPurchase called");
        }
    }

    @Override // com.tapjoy.internal.es
    public final void a(String str, String str2, String str3, String str4, Map map) {
        ha a2 = ha.a();
        if (!a2.c("trackEvent") || jr.c(str2)) {
            return;
        }
        LinkedHashMap b2 = jv.b();
        if (map != null && map.size() > 0) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                if (key != null) {
                    if (key instanceof String) {
                        String a3 = gv.a((String) key, "trackEvent", "key in values map");
                        if (a3 == null) {
                            return;
                        }
                        Object value = entry.getValue();
                        if (value instanceof Number) {
                            b2.put(a3, Long.valueOf(((Number) value).longValue()));
                        } else {
                            gx.a("trackEvent", "value in values map", "must be a long");
                            return;
                        }
                    }
                } else {
                    if (gx.f8223a) {
                        x.a("Tapjoy", "{}: {} must not be null", "trackEvent", "key in values map");
                        return;
                    }
                    return;
                }
            }
        }
        a2.g.a(str, str2, str3, str4, b2);
        gx.a("trackEvent category:{}, name:{}, p1:{}, p2:{}, values:{} called", str, str2, str3, str4, b2);
    }

    @Override // com.tapjoy.internal.es
    public final void a(int i) {
        ha a2 = ha.a();
        if (a2.d("setUserLevel")) {
            gx.a("setUserLevel({}) called", Integer.valueOf(i));
            a2.f.a(i >= 0 ? Integer.valueOf(i) : null);
        }
    }

    @Override // com.tapjoy.internal.es
    public final void b(int i) {
        ha a2 = ha.a();
        if (a2.d("setUserFriendCount")) {
            gx.a("setUserFriendCount({}) called", Integer.valueOf(i));
            a2.f.b(i >= 0 ? Integer.valueOf(i) : null);
        }
    }

    @Override // com.tapjoy.internal.es
    public final void b(String str) {
        ha a2 = ha.a();
        if (a2.d("setAppDataVersion")) {
            a2.f.a(gv.a(str));
        }
    }

    @Override // com.tapjoy.internal.es
    public final void a(int i, String str) {
        ha a2 = ha.a();
        if (a2.d("setUserCohortVariable")) {
            boolean z = i > 0 && i <= 5;
            if (gx.f8223a && !z) {
                gx.b("setCohortVariable: variableIndex is out of range");
            }
            if (z) {
                gx.a("setUserCohortVariable({}, {}) called", Integer.valueOf(i), str);
                a2.f.a(i, gv.a(str));
            }
        }
    }

    @Override // com.tapjoy.internal.es
    public final void f(String str) {
        ha a2 = ha.a();
        gx.a("setGcmSender({}) called", str);
        a2.f8237d = jr.a(str);
        a2.b();
    }

    @Override // com.tapjoy.internal.es
    public final void a(GLSurfaceView gLSurfaceView) {
        ha.a();
        ha.a(gLSurfaceView);
    }
}
