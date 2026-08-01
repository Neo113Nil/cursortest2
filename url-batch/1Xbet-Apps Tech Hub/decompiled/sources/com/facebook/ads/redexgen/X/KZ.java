package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.google.common.base.Ascii;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class KZ {
    public static byte[] A00;
    public static String[] A01 = {"HfGv3264Bq2TQ34NqRtE4P30TXR", "AZVpgJ8fi5FDz5AiC", "FCmmf0GU", "NGZF99o8OEHjBvmOxlLxN", "MEp80XUn5zKurDhCJ73", "hVp2plT6ulDLwck", "CErebgOhZelO8plRL7vU3", "v0a34uu5Y8rm3tpqkSr554RtUBdvL4ru"};

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{-49, -36, -19, -44, -48, -62, -49, -19, -31, -45, -47, -29, -32, -45, -19, -30, -35, -39, -45, -36, -20, -7, 10, -14, -5, -2, 10, -20, -17, 10, -18, -6, -7, -1, -16, -7, -1, -56, -58, -47, -47, -54, -41, -28, -55, -44, -46, -58, -50, -45, -6, Ascii.CAN, 37, -34, 43, -41, 42, 43, Ascii.CAN, 41, 43, -41, -8, 44, Ascii.ESC, 32, Ascii.FS, 37, Ascii.SUB, Ascii.FS, 5, Ascii.FS, 43, 46, 38, 41, 34, -8, Ascii.SUB, 43, 32, 45, 32, 43, 48, -27, -41, 4, Ascii.CAN, 34, Ascii.FS, -41, 42, 44, 41, Ascii.FS, -41, 43, Ascii.US, Ascii.CAN, 43, -41, 32, 43, -34, 42, -41, 32, 37, -41, 48, 38, 44, 41, -41, -8, 37, Ascii.ESC, 41, 38, 32, Ascii.ESC, 4, Ascii.CAN, 37, 32, Ascii.GS, Ascii.FS, 42, 43, -27, 47, 36, 35, -41, Ascii.GS, 32, 35, Ascii.FS, -27, -88, -69, -73, -75, -92, -62, -72, -75, -81, -60, -64, -65, -13, -30, -25, -29, -20, -31, -29, -52, -29, -14, -11, -19, -16, -23, -30, -76, -84, -71, -86, -84, -82, -65, -76, -63, -76, -65, -60, -58, -45, -55, -41, -44, -50, -55, -109, -50, -45, -39, -54, -45, -39, -109, -58, -56, -39, -50, -44, -45, -109, -69, -82, -86, -68, -49, -36, -46, -32, -35, -41, -46, -100, -41, -36, -30, -45, -36, -30, -100, -47, -49, -30, -45, -43, -35, -32, -25, -100, -80, -64, -67, -59, -63, -81, -80, -70, -77, -31, -15, -18, -10, -14, -28, -15, -44, -47, -53, -89, -91, -80, -80, -87, -74, -115, -88, -16, -7, -10, -14, -5, 1, -31, -4, -8, -14, -5, -75, -63, -65, Byte.MIN_VALUE, -77, -64, -74, -60, -63, -69, -74, Byte.MIN_VALUE, -76, -60, -63, -55, -59, -73, -60, Byte.MIN_VALUE, -77, -62, -62, -66, -69, -75, -77, -58, -69, -63, -64, -79, -69, -74, -78, -66, -68, 125, -80, -67, -77, -63, -66, -72, -77, 125, -59, -76, -67, -77, -72, -67, -74, -39, -27, -29, -92, -36, -41, -39, -37, -40, -27, -27, -31, -92, -35, -27, -27, -35, -30, -37, -26, -30, -41, -17, -23, -22, -27, -24, -37, -41, -28, -92, -67, -27, -27, -35, -30, -37, -58, -30, -41, -17, -55, -22, -27, -24, -37, -73, -60, -59, -20, -37, -24, -30, -41, -17, -69, -18, -22, -37, -24, -28, -41, -30, -73, -39, -22, -33, -20, -33, -22, -17, -72, -60, -62, -125, -69, -74, -72, -70, -73, -60, -60, -64, -125, -64, -74, -55, -74, -61, -74, -77, -62, -75, -79, -60, -75, -81, -66, -75, -57, -81, -60, -79, -78, -63, -67, Ascii.GS, Ascii.SYN, 35, Ascii.EM, 33, Ascii.SUB, 39, 9, Ascii.RS, 34, Ascii.SUB, -2, 10, 10, 6, -83, -71, -71, -75, Byte.MAX_VALUE, 116, 116, -75, -79, -90, -66, 115, -84, -76, -76, -84, -79, -86, 115, -88, -76, -78, 116, -72, -71, -76, -73, -86, 116, -90, -75, -75, -72, 116, -17, -5, -5, -9, -6, -66, -78, -61, -68, -74, -59, -13, -6, -23, -10, -16, -27, -3, -19, -23, -34, -10, -85, -28, -20, -20, -28, -23, -30, -85, -32, -20, -22, Ascii.CAN, Ascii.VT, Ascii.EM, Ascii.SI, 32, Ascii.VT, -13, Ascii.NAK, 10, Ascii.VT, 9, -4, -8, 10, -25, Ascii.FF, 3, -8};
    }

    static {
        A06();
    }

    private int A00(YA ya) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = ya.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(A04(391, 19, 25), 0)) != null && !TextUtils.isEmpty(packageInfo.versionName)) {
                return Integer.parseInt(packageInfo.versionName.split(A04(Opcodes.IF_ACMPNE, 2, 74), 2)[0]);
            }
            return -1;
        } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
            return -1;
        }
    }

    public static Intent A01(Uri uri) {
        Intent intent = new Intent(A04(Opcodes.PUTSTATIC, 26, 41), uri);
        intent.setComponent(null);
        if (Build.VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    public static Intent A02(YA ya, Uri uri) {
        Intent A012 = A01(uri);
        A012.addCategory(A04(205, 33, 50));
        A012.addFlags(268435456);
        A012.putExtra(A04(267, 34, 22), ya.getPackageName());
        A012.putExtra(A04(TTAdConstant.IMAGE_LIST_SIZE_CODE, 14, 20), false);
        if (IP.A1b(ya)) {
            if (A04(TypedValues.CycleType.TYPE_WAVE_OFFSET, 2, 31).equals(uri.getScheme())) {
                A012.setPackage(A04(391, 19, 25));
            }
        }
        return A012;
    }

    public static Intent A03(YA ya, Uri uri) {
        Intent A012 = A01(uri);
        A012.setPackage(A04(301, 19, 19));
        A012.putExtra(A04(248, 8, 8), ya.getPackageName());
        A012.putExtra(A04(486, 7, 72), true);
        return A012;
    }

    private String A05(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    private void A07(YA ya, Uri uri) throws KL {
        KN.A0B(ya, A02(ya, uri));
    }

    private void A08(YA ya, Uri uri, String str) {
        AdActivityIntent A04 = KN.A04(ya);
        A04.addFlags(268435456);
        A04.putExtra(A04(518, 8, 87), EnumC0600Jq.A02);
        A04.putExtra(A04(238, 10, 67), uri.toString());
        A04.putExtra(A04(256, 11, 81), str);
        A04.putExtra(A04(426, 11, 121), System.currentTimeMillis());
        try {
            KN.A09(ya, A04);
        } catch (KL e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            ya.A07().A9M(A04(Opcodes.JSR, 11, 15), C03207x.A0D, new C03217y(th));
            Log.e(A04(Opcodes.FCMPL, 17, 66), A04(50, 90, 123), th);
        }
    }

    private final void A09(YA ya, Uri uri, String str) throws KX, KL {
        if (A0F(ya)) {
            boolean A0J = A0J(ya, str);
            if (!A0J) {
                boolean canEnableSpliScreen = IP.A1u(ya);
                if (canEnableSpliScreen) {
                    boolean canEnableSpliScreen2 = KN.A0C(ya, A03(ya, uri));
                    if (canEnableSpliScreen2) {
                        return;
                    }
                }
            }
            boolean canEnableSpliScreen3 = A0H(ya, uri, str);
            if (canEnableSpliScreen3) {
                return;
            }
            Intent A02 = A02(ya, uri);
            A02.setPackage(A04(301, 19, 19));
            if (A0J) {
                A02.addFlags(268472320);
            }
            KN.A0B(ya, A02);
            return;
        }
        throw new KX();
    }

    private final void A0A(YA ya, Uri uri, String str) throws KL {
        boolean A05 = IQ.A05(ya);
        boolean isInAppBrowserEnabled = A0D(uri);
        if (isInAppBrowserEnabled && A05) {
            A08(ya, uri, str);
        } else {
            ya.A0E().A8V(A05);
            A07(ya, uri);
        }
    }

    public static void A0B(KZ kz, YA ya, Uri uri, String str) {
        kz.A0I(ya, uri, str);
    }

    public static void A0C(KZ kz, YA ya, Uri uri, String str) throws KL {
        boolean z = A0D(uri) && A04(493, 15, 65).equals(uri.getHost());
        boolean isGooglePlayWebLink = A04(480, 6, 21).equals(uri.getScheme());
        if (isGooglePlayWebLink || z) {
            try {
                kz.A09(ya, uri, str);
                return;
            } catch (KX unused) {
                kz.A0A(ya, uri, str);
                return;
            }
        }
        kz.A0A(ya, uri, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r0 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0D(Uri uri) {
        boolean isHttpPermitted;
        if (Build.VERSION.SDK_INT >= 24) {
            boolean isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            String[] strArr = A01;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A01[7] = "9DaYNTGnU6m41BFJKxw5hEDOoLHVmNBK";
            if (!isCleartextTrafficPermitted && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(uri.getHost())) {
                isHttpPermitted = false;
                String scheme = uri.getScheme();
                if (isHttpPermitted) {
                    boolean isHttpPermitted2 = A04(437, 4, 90).equalsIgnoreCase(scheme);
                }
                boolean isHttpPermitted3 = A04(475, 5, 75).equalsIgnoreCase(scheme);
                return !isHttpPermitted3;
            }
        }
        isHttpPermitted = true;
        String scheme2 = uri.getScheme();
        if (isHttpPermitted) {
        }
        boolean isHttpPermitted32 = A04(475, 5, 75).equalsIgnoreCase(scheme2);
        if (!isHttpPermitted32) {
        }
    }

    private boolean A0E(YA ya) {
        if (!IP.A15(ya)) {
            return false;
        }
        int A0D = IP.A0D(ya);
        if (A01[7].charAt(2) != 'a') {
            throw new RuntimeException();
        }
        A01[2] = "JMUKVK1n";
        int A002 = A00(ya);
        return A0D != -1 && A002 != -1 && A0D <= A002 && Build.VERSION.SDK_INT >= 28;
    }

    private boolean A0F(YA ya) {
        Intent playStoreIntent = new Intent(A04(Opcodes.PUTSTATIC, 26, 41), C0611Kc.A00(A04(441, 34, 9)));
        Iterator<ResolveInfo> it = ya.getPackageManager().queryIntentActivities(playStoreIntent, 0).iterator();
        while (it.hasNext()) {
            if (it.next().activityInfo.applicationInfo.packageName.equals(A04(301, 19, 19))) {
                return true;
            }
        }
        return false;
    }

    private boolean A0G(YA ya, Uri uri, String str) throws KL {
        try {
            Activity A0D = ya.A0D();
            String uri2 = uri.toString();
            if (A0D != null && !TextUtils.isEmpty(uri2)) {
                Intent intent = new Intent();
                if (IP.A16(ya)) {
                    String A06 = AbstractC1045aS.A06(str);
                    if (TextUtils.isEmpty(A06)) {
                        return false;
                    }
                    intent.putExtra(A04(0, 20, 82), A05(A06));
                }
                intent.setComponent(new ComponentName(A04(391, 19, 25), A04(320, 71, 58)));
                intent.putExtra(A04(Opcodes.F2L, 9, 39), uri2);
                intent.putExtra(A04(37, 13, 73), A05(A04(20, 17, 111)));
                if (!KN.A0C(ya, intent)) {
                    A0D.startActivityForResult(intent, 2);
                    return true;
                }
                return true;
            }
            return false;
        } catch (ActivityNotFoundException | IllegalStateException e) {
            ya.A0E().A9Q(e.getMessage());
            return false;
        }
    }

    private boolean A0H(YA ya, Uri uri, String str) throws KL {
        return A0E(ya) && A0G(ya, uri, str);
    }

    private final boolean A0I(YA ya, Uri uri, String str) {
        return KN.A0E(ya, uri, str);
    }

    public static boolean A0J(YA ya, String str) {
        boolean A1G = IP.A1G(ya);
        boolean isSplitScreenEnabled = Build.VERSION.SDK_INT >= 24;
        boolean onAndAboveNOS = A0K(ya, str);
        boolean isSplitScreenSupportedInApp = A1G && isSplitScreenEnabled && onAndAboveNOS;
        ya.A0E().A9l(onAndAboveNOS, isSplitScreenSupportedInApp);
        return isSplitScreenSupportedInApp;
    }

    public static boolean A0K(YA ya, String str) {
        Activity A0D;
        PackageManager packageManager;
        ActivityInfo activityInfo;
        try {
            A0D = ya.A0D();
            packageManager = ya.getPackageManager();
        } catch (PackageManager.NameNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            ya.A0E().A9j(e.getMessage());
        }
        if (A0D == null || packageManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 32) {
            activityInfo = packageManager.getActivityInfo(A0D.getComponentName(), PackageManager.ComponentInfoFlags.of(0L));
        } else {
            activityInfo = packageManager.getActivityInfo(A0D.getComponentName(), 128);
        }
        Field declaredField = ActivityInfo.class.getDeclaredField(A04(TypedValues.PositionType.TYPE_CURVE_FIT, 10, 106));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(activityInfo);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0;
        }
        return false;
    }

    public static boolean A0L(KZ kz, YA ya, Uri uri, String str) {
        try {
            A0C(kz, ya, uri, str);
            return true;
        } catch (KL e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            ya.A07().A9M(A04(Opcodes.JSR, 11, 15), C03207x.A05, new C03217y(th));
            return false;
        }
    }
}
