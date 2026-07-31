package com.huawei.hms.framework.common;

import com.huawei.android.os.BuildEx;
import com.huawei.hms.android.SystemUtils;

/* loaded from: classes.dex */
public class EmuiUtil {
    public static final String BUILDEX_VERSION = "com.huawei.android.os.BuildEx$VERSION";
    public static final String EMUI_SDK_INT = "EMUI_SDK_INT";
    public static final String GET_PRIMARY_COLOR = "getPrimaryColor";
    public static final String GET_SUGGESTION_FOR_GROUND_COLOR_STYLE = "getSuggestionForgroundColorStyle";
    public static final String IMMERSION_STYLE = "com.huawei.android.immersion.ImmersionStyle";

    /* renamed from: a, reason: collision with root package name */
    private static int f14131a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f14132b = false;

    static {
        a();
        b();
    }

    private static void a() {
        int eMUIVersionCode = getEMUIVersionCode();
        Logger.d("KPMS_Util_Emui", "getEmuiType emuiVersionCode=" + eMUIVersionCode);
        if (eMUIVersionCode >= 17) {
            f14131a = 90;
        } else if (eMUIVersionCode >= 15) {
            f14131a = 81;
        } else if (eMUIVersionCode >= 14) {
            f14131a = 60;
        } else if (eMUIVersionCode >= 11) {
            f14131a = 50;
        } else if (eMUIVersionCode >= 10) {
            f14131a = 41;
        } else if (eMUIVersionCode >= 9) {
            f14131a = 40;
        } else if (eMUIVersionCode >= 8) {
            f14131a = 31;
        } else if (eMUIVersionCode >= 7) {
            f14131a = 30;
        }
        if (f14131a == -1) {
            Logger.i("KPMS_Util_Emui", "emuiType is unkown");
        }
    }

    private static void b() {
        String property = SystemPropUtils.getProperty("get", "ro.product.manufacturer", "android.os.SystemProperties", "");
        if (SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(property)) {
            f14132b = true;
        }
        Logger.i("KPMS_Util_Emui", "Get Manufacturer: " + property + ", isHuaweiDevice : " + f14132b);
    }

    public static int getEMUIVersionCode() {
        int intValue;
        Object staticFieldObj = ReflectionUtils.getStaticFieldObj(BUILDEX_VERSION, EMUI_SDK_INT);
        if (staticFieldObj != null) {
            try {
                intValue = ((Integer) staticFieldObj).intValue();
            } catch (ClassCastException e4) {
                Logger.e("KPMS_Util_Emui", "getEMUIVersionCode ClassCastException:", e4);
            }
            Logger.d("KPMS_Util_Emui", "the emui version code is::" + intValue);
            return intValue;
        }
        intValue = 0;
        Logger.d("KPMS_Util_Emui", "the emui version code is::" + intValue);
        return intValue;
    }

    public static boolean isEMUI() {
        return -1 != f14131a;
    }

    public static boolean isHuaweiDevice() {
        return f14132b;
    }

    public static boolean isUpPVersion() {
        try {
            if (ReflectionUtils.checkCompatible("com.huawei.android.os.BuildEx") && ReflectionUtils.checkCompatible(BUILDEX_VERSION)) {
                return BuildEx.VERSION.EMUI_SDK_INT >= 17;
            }
        } catch (NoSuchMethodError unused) {
            Logger.d("KPMS_Util_Emui", "no such method for com.huawei.android.os.BuildEx.VERSION");
        } catch (Throwable unused2) {
            Logger.d("KPMS_Util_Emui", "com.huawei.android.os.BuildEx.VERSION has other exception");
        }
        Logger.d("KPMS_Util_Emui", "com.huawei.android.os.BuildEx : false");
        return false;
    }
}
