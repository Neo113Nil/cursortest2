package com.baidu.mapapi;

import android.content.Context;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import java.util.Map;

/* loaded from: classes2.dex */
public class SDKInitializer {
    public static final String SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR = "network error";
    public static final String SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_ERROR = "permission check error";
    public static final String SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_OK = "permission check ok";
    public static final String SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE = "error_code";
    public static final String SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_MESSAGE = "error_message";

    /* renamed from: b, reason: collision with root package name */
    private static boolean f5320b;

    /* renamed from: a, reason: collision with root package name */
    private static CoordType f5319a = CoordType.BD09LL;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Object, String> f5321c = null;

    private SDKInitializer() {
    }

    public static void addAuthResultListener(RequestAuthResultListener requestAuthResultListener) {
        com.baidu.mapsdkplatform.comapi.b.a(requestAuthResultListener);
    }

    public static boolean getAgreePrivacy() {
        return com.baidu.mapsdkplatform.comapi.b.b();
    }

    public static CommonInfo getCommonInfo() {
        return com.baidu.mapsdkplatform.comapi.b.a();
    }

    public static CoordType getCoordType() {
        return f5319a;
    }

    public static boolean getDebugMode() {
        return f5320b;
    }

    public static void initialize(Context context) {
        com.baidu.mapsdkplatform.comapi.b.a(context, false, null, null, null, null);
    }

    public static boolean isHttpsEnable() {
        return HttpClient.isHttpsEnable;
    }

    public static boolean isInitialized() {
        return com.baidu.mapsdkplatform.comapi.b.c();
    }

    public static void onBackground() {
        com.baidu.mapsdkplatform.comapi.b.d();
    }

    public static void onForeground() {
        com.baidu.mapsdkplatform.comapi.b.e();
    }

    public static void removeAuthResultListener(RequestAuthResultListener requestAuthResultListener) {
        com.baidu.mapsdkplatform.comapi.b.b(requestAuthResultListener);
    }

    public static void setAgreePrivacy(Context context, boolean z7) {
        com.baidu.mapsdkplatform.comapi.b.a(context, z7);
    }

    public static void setApiKey(String str) {
        PermissionCheck.setApiKey(str);
    }

    public static void setCommonInfo(CommonInfo commonInfo) {
        com.baidu.mapsdkplatform.comapi.b.a(commonInfo);
    }

    public static void setCoordType(CoordType coordType) {
        f5319a = coordType;
    }

    public static void setDebugMode(boolean z7) {
        f5320b = z7;
    }

    public static void setHttpsEnable(boolean z7) {
    }

    public static void unRegisterNetworkCallback() {
        if (com.baidu.mapsdkplatform.comapi.b.c()) {
            com.baidu.platform.comapi.util.NetworkUtil.unregisterNetworkCallback();
        }
    }

    public static void initialize(Context context, ISDKInitializerListener iSDKInitializerListener) {
        com.baidu.mapsdkplatform.comapi.b.a(context, false, null, null, null, iSDKInitializerListener);
    }

    public static void initialize(String str, Context context) {
        com.baidu.mapsdkplatform.comapi.b.a(context, false, null, str, null, null);
    }

    public static void initialize(Context context, boolean z7, String str, String str2) {
        com.baidu.mapsdkplatform.comapi.b.a(context, z7, str, str2, null, null);
    }
}
