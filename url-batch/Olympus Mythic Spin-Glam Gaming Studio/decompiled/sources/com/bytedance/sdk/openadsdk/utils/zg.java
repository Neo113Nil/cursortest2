package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.adjust.sdk.Constants;
import com.ironsource.O6;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.player.UnityPlayerActivity;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class zg {
    private static final AtomicReference<Boolean> zmn = new AtomicReference<>(null);
    private static final AtomicReference<String> fs = new AtomicReference<>(null);

    public static void zmn(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (fs()) {
                com.bytedance.sdk.openadsdk.core.zn zmn2 = com.bytedance.sdk.openadsdk.core.zn.zmn();
                zmn2.zmn("w_ver", btk(context));
                zmn2.zmn("bp", fs(context));
                zmn2.zmn("is_fold", nps(context) ? 1 : 0);
                zmn2.zmn("abi", zmn());
                zmn2.zmn("t_ver", zn(context));
                zmn2.zmn(CampaignEx.JSON_KEY_AAB, fb(context));
            }
        } catch (Throwable unused) {
        }
    }

    public static int fs(Context context) {
        if (zg(context)) {
            return 1;
        }
        if (bvs(context)) {
            return 2;
        }
        return iv(context) ? 3 : 4;
    }

    private static boolean zg(Context context) {
        try {
            int i = UnityPlayerActivity.$r8$clinit;
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean bvs(Context context) {
        try {
            Class.forName("io.flutter.embedding.android.FlutterActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean iv(Context context) {
        try {
            Class.forName("com.facebook.react.ReactActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static String zn(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int fb(Context context) {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    public static String btk(Context context) {
        String str;
        try {
            AtomicReference<String> atomicReference = fs;
            String str2 = atomicReference.get();
            if (str2 != null) {
                return str2;
            }
            PackageInfo hhw = hhw(context);
            if (hhw == null) {
                str = "";
            } else {
                str = hhw.versionName;
            }
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, str);
            return str;
        } catch (Throwable unused) {
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(fs, null, "");
            return "";
        }
    }

    public static PackageInfo hhw(Context context) {
        PackageInfo currentWebViewPackage;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                currentWebViewPackage = WebView.getCurrentWebViewPackage();
                return currentWebViewPackage;
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
            return packageInfo != null ? packageInfo : rc(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static PackageInfo rc(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean nps(Context context) {
        boolean z;
        boolean z2;
        char c;
        try {
            AtomicReference<Boolean> atomicReference = zmn;
            Boolean bool = atomicReference.get();
            if (bool != null) {
                return bool.booleanValue();
            }
            String str = Build.BRAND;
            if (!TextUtils.isEmpty(str)) {
                str = str.toLowerCase();
            }
            String str2 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2.toLowerCase();
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, Boolean.FALSE);
                return false;
            }
            char c2 = 65535;
            if (TextUtils.isEmpty(str)) {
                z = false;
                z2 = false;
            } else {
                switch (str.hashCode()) {
                    case -759499589:
                        if (str.equals(Constants.REFERRER_API_XIAOMI)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3418016:
                        if (str.equals("oppo")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3620012:
                        if (str.equals(Constants.REFERRER_API_VIVO)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1864941562:
                        if (str.equals(Constants.REFERRER_API_SAMSUNG)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    z = bvs();
                } else if (c == 1) {
                    z = hhw();
                } else if (c == 2) {
                    z = btk();
                } else if (c != 3) {
                    z = false;
                    z2 = true;
                } else {
                    z = fb();
                }
                z2 = false;
            }
            if (z2 && !TextUtils.isEmpty(str2)) {
                switch (str2.hashCode()) {
                    case -759499589:
                        if (str2.equals(Constants.REFERRER_API_XIAOMI)) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 3418016:
                        if (str2.equals("oppo")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3620012:
                        if (str2.equals(Constants.REFERRER_API_VIVO)) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1864941562:
                        if (str2.equals(Constants.REFERRER_API_SAMSUNG)) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    z = bvs();
                } else if (c2 == 1) {
                    z = hhw();
                } else if (c2 == 2) {
                    z = btk();
                } else {
                    z = c2 != 3 ? false : fb();
                }
            }
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, Boolean.valueOf(z));
            return z;
        } catch (Throwable unused) {
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(zmn, null, Boolean.FALSE);
            return false;
        }
    }

    private static boolean fb() {
        String lowerCase;
        if (rc()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase2 = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase2)) {
                for (int i = 0; i < 12; i++) {
                    if (lowerCase2.contains(strArr2[i])) {
                        return true;
                    }
                }
            }
            lowerCase = Build.MODEL.toLowerCase();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        for (int i2 = 0; i2 < 12; i2++) {
            if (lowerCase.contains(strArr[i2])) {
                return true;
            }
        }
        if (fs()) {
            String zmn2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn("fold_config", "fold_samung", "");
            if (TextUtils.isEmpty(zmn2)) {
                return false;
            }
            for (String str : zmn2.split(StringUtils.COMMA)) {
                if (lowerCase.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean btk() {
        if (zg()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 6; i++) {
                    if (lowerCase.contains(strArr[i])) {
                        return true;
                    }
                }
                if (fs()) {
                    String zn = zn();
                    if (TextUtils.isEmpty(zn)) {
                        return false;
                    }
                    for (String str : zn.split(StringUtils.COMMA)) {
                        if (lowerCase.contains(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean hhw() {
        if (nps()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 7; i++) {
                    if (lowerCase.contains(strArr[i].toLowerCase())) {
                        return true;
                    }
                }
                if (fs()) {
                    String zn = zn();
                    if (TextUtils.isEmpty(zn)) {
                        return false;
                    }
                    for (String str : zn.split(StringUtils.COMMA)) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean nps() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", null).invoke(null, null));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("BED", "isVIVOFoldDevice return false " + th.getMessage());
            return false;
        }
    }

    private static boolean zg() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("BED", "isXiaomiFold return false " + th.getMessage());
            return false;
        }
    }

    private static boolean bvs() {
        if (iv()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i = 0; i < 9; i++) {
                    if (lowerCase.contains(strArr[i].toLowerCase())) {
                        return true;
                    }
                }
                if (fs()) {
                    String zn = zn();
                    if (TextUtils.isEmpty(zn)) {
                        return false;
                    }
                    for (String str : zn.split(StringUtils.COMMA)) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean iv() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object invoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, null).invoke(null, null), "oplus.hardware.type.fold");
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException e) {
            e = e;
            com.bytedance.sdk.component.utils.iqz.zn("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (IllegalAccessException e2) {
            e = e2;
            com.bytedance.sdk.component.utils.iqz.zn("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (NoSuchMethodException e3) {
            e = e3;
            com.bytedance.sdk.component.utils.iqz.zn("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (InvocationTargetException e4) {
            e = e4;
            com.bytedance.sdk.component.utils.iqz.zn("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String zmn() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    public static void zmn(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (fs()) {
                com.bytedance.sdk.openadsdk.core.zn zmn2 = com.bytedance.sdk.openadsdk.core.zn.zmn();
                String fs2 = zmn2.fs(O6.u, com.bytedance.sdk.openadsdk.core.iv.fs().nps());
                if (!TextUtils.isEmpty(fs2)) {
                    jSONObject.put(O6.u, fs2);
                }
                int fs3 = zmn2.fs("bp", fs(context));
                if (fs3 != 4) {
                    jSONObject.put("bp", fs3);
                }
                String fs4 = zmn2.fs("t_ver", zn(context));
                if (!TextUtils.isEmpty(fs4)) {
                    jSONObject.put("t_ver", fs4);
                }
                jSONObject.put("is_fold", zmn2.fs("is_fold", nps(context) ? 1 : 0));
                jSONObject.put(CampaignEx.JSON_KEY_AAB, zmn2.fs(CampaignEx.JSON_KEY_AAB, fb(context)));
                String fs5 = zmn2.fs("abi", zmn());
                if (TextUtils.isEmpty(fs5)) {
                    return;
                }
                jSONObject.put("abi", fs5);
            }
        } catch (Throwable unused) {
        }
    }

    public static void fs(JSONObject jSONObject, Context context) {
        try {
            if (fs()) {
                String fs2 = com.bytedance.sdk.openadsdk.core.zn.zmn().fs("w_ver", btk(context));
                if (TextUtils.isEmpty(fs2)) {
                    return;
                }
                jSONObject.put("w_ver", fs2);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean rc() {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object invoke = cls.getMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, null).invoke(null, null);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            if ("TRUE".equalsIgnoreCase((String) declaredMethod.invoke(invoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD"))) {
                return true;
            }
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(invoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            com.bytedance.sdk.component.utils.iqz.zn("PAG_BANNER", "get ss fold device error: " + e.getMessage());
            return false;
        }
    }

    public static boolean fs() {
        return com.bytedance.sdk.openadsdk.uqh.btk.zmn("fold_config", a.k, 0) == 1;
    }

    public static String zn() {
        return com.bytedance.sdk.openadsdk.uqh.btk.zmn("fold_config", "fold_default", "");
    }
}
