package com.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import com.tapjoy.internal.es;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Tapjoy {
    public static final String INTENT_EXTRA_PUSH_PAYLOAD = "com.tapjoy.PUSH_PAYLOAD";

    public static String getVersion() {
        return es.a().b();
    }

    public static void setDebugEnabled(boolean z) {
        es.a().a(z);
    }

    public static boolean connect(Context context, String str) {
        return es.a().a(context, str);
    }

    public static boolean connect(Context context, String str, Hashtable hashtable) {
        return es.a().a(context, str, hashtable, (TJConnectListener) null);
    }

    public static synchronized boolean connect(Context context, String str, Hashtable hashtable, TJConnectListener tJConnectListener) {
        boolean a2;
        synchronized (Tapjoy.class) {
            a2 = es.a().a(context, str, hashtable, tJConnectListener);
        }
        return a2;
    }

    public static TJPlacement getPlacement(String str, TJPlacementListener tJPlacementListener) {
        return es.a().a(str, tJPlacementListener);
    }

    public static void setActivity(Activity activity) {
        es.a().a(activity);
    }

    public static void getCurrencyBalance(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener) {
        es.a().a(tJGetCurrencyBalanceListener);
    }

    public static void spendCurrency(int i, TJSpendCurrencyListener tJSpendCurrencyListener) {
        es.a().a(i, tJSpendCurrencyListener);
    }

    public static void awardCurrency(int i, TJAwardCurrencyListener tJAwardCurrencyListener) {
        es.a().a(i, tJAwardCurrencyListener);
    }

    public static void setEarnedCurrencyListener(TJEarnedCurrencyListener tJEarnedCurrencyListener) {
        es.a().a(tJEarnedCurrencyListener);
    }

    @Deprecated
    public static void setCurrencyMultiplier(float f) {
        es.a().a(f);
    }

    @Deprecated
    public static float getCurrencyMultiplier() {
        return es.a().c();
    }

    public static void trackPurchase(String str, String str2, double d2, String str3) {
        es.a().a(str, str2, d2, str3);
    }

    public static void trackPurchase(String str, String str2, String str3, String str4) {
        es.a().a(str, str2, str3, str4);
    }

    @Deprecated
    public static void trackPurchase(String str, String str2) {
        es.a().a(str, str2);
    }

    public static void trackEvent(String str) {
        es.a().a(str);
    }

    public static void trackEvent(String str, long j) {
        es.a().a(str, j);
    }

    public static void trackEvent(String str, String str2, long j) {
        es.a().a(str, str2, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4) {
        es.a().b(str, str2, str3, str4);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, long j) {
        es.a().a(str, str2, str3, str4, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j) {
        es.a().a(str, str2, str3, str4, str5, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2) {
        es.a().a(str, str2, str3, str4, str5, j, str6, j2);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        es.a().a(str, str2, str3, str4, str5, j, str6, j2, str7, j3);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, Map map) {
        es.a().a(str, str2, str3, str4, map);
    }

    public static void startSession() {
        es.a().d();
    }

    public static void endSession() {
        es.a().e();
    }

    public static void onActivityStart(Activity activity) {
        es.a().b(activity);
    }

    public static void onActivityStop(Activity activity) {
        es.a().c(activity);
    }

    public static void setUserID(String str) {
        setUserID(str, null);
    }

    public static void setUserID(String str, TJSetUserIDListener tJSetUserIDListener) {
        es.a().a(str, tJSetUserIDListener);
    }

    public static void setUserLevel(int i) {
        es.a().a(i);
    }

    public static void setUserFriendCount(int i) {
        es.a().b(i);
    }

    public static void setAppDataVersion(String str) {
        es.a().b(str);
    }

    public static void setUserCohortVariable(int i, String str) {
        es.a().a(i, str);
    }

    public static Set getUserTags() {
        return es.a().f();
    }

    public static void setUserTags(Set set) {
        es.a().a(set);
    }

    public static void clearUserTags() {
        es.a().g();
    }

    public static void addUserTag(String str) {
        es.a().c(str);
    }

    public static void removeUserTag(String str) {
        es.a().d(str);
    }

    public static void setVideoListener(TJVideoListener tJVideoListener) {
        es.a().a(tJVideoListener);
    }

    public static void actionComplete(String str) {
        es.a().e(str);
    }

    public static void setGcmSender(String str) {
        es.a().f(str);
    }

    public static void setDeviceToken(String str) {
        es.a().i(str);
    }

    public static void setReceiveRemoteNotification(Context context, Map map) {
        es.a().a(context, map);
    }

    public static boolean isPushNotificationDisabled() {
        return es.a().h();
    }

    public static void setPushNotificationDisabled(boolean z) {
        es.a().b(z);
    }

    public static void loadSharedLibrary() {
        try {
            System.loadLibrary("tapjoy");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static void setGLSurfaceView(GLSurfaceView gLSurfaceView) {
        es.a().a(gLSurfaceView);
    }

    public static String getSupportURL() {
        return es.a().g(null);
    }

    public static String getSupportURL(String str) {
        return es.a().g(str);
    }

    public static String getUserToken() {
        return es.a().k();
    }

    public static boolean isConnected() {
        return es.a().i();
    }

    public static void subjectToGDPR(boolean z) {
        es.a().c(z);
    }

    public static void setUserConsent(String str) {
        es.a().h(str);
    }

    public static void belowConsentAge(boolean z) {
        es.a().d(z);
    }

    public static synchronized boolean limitedConnect(Context context, String str, TJConnectListener tJConnectListener) {
        boolean a2;
        synchronized (Tapjoy.class) {
            a2 = es.a().a(context, str, tJConnectListener);
        }
        return a2;
    }

    public static boolean isLimitedConnected() {
        return es.a().j();
    }

    public static TJPlacement getLimitedPlacement(String str, TJPlacementListener tJPlacementListener) {
        return es.a().b(str, tJPlacementListener);
    }
}
