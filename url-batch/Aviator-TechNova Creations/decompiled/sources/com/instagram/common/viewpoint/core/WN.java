package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.base.Ascii;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class WN {
    public static byte[] A00;
    public static String[] A01 = {"T4dPy6oALRnRtXie0LYtNa7PXoaz5xNV", "GuB", "", "N5ZcwGbFLOfjQt8i7LOYdNhhAY9bfZ8J", "XGEF2r9HzP4eyBZiq0puzcaX55o", "r68Pu4BAqG0jUrZ19Ek7iVXcY822rh1q", "w97ZnD7u", "Y1Vl"};

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{77, 66, 83, 74, 78, 56, 77, 83, 95, 73, 79, 89, 94, 73, 83, 88, 67, 71, 73, 66, 84, 91, 74, 82, 69, 70, 74, 84, 81, 74, 86, 90, 91, 65, 80, 91, 65, 85, 87, 90, 90, 83, 68, 73, 82, 89, 91, 87, 95, 88, 88, 122, 117, 60, 111, 59, 104, 111, 122, 105, 111, 59, 90, 110, Byte.MAX_VALUE, 114, 126, 117, 120, 126, 85, 126, 111, 108, 116, 105, 112, 90, 120, 111, 114, 109, 114, 111, 98, 53, 59, 86, 122, 112, 126, 59, 104, 110, 105, 126, 59, 111, 115, 122, 111, 59, 114, 111, 60, 104, 59, 114, 117, 59, 98, 116, 110, 105, 59, 90, 117, Byte.MAX_VALUE, 105, 116, 114, Byte.MAX_VALUE, 86, 122, 117, 114, 125, 126, 104, 111, 53, 99, 118, 119, 59, 125, 114, 119, 126, 53, Ascii.FS, 1, Ascii.CR, Ascii.VT, Ascii.CAN, 6, Ascii.FF, Ascii.VT, Ascii.NAK, Ascii.NAK, 17, Ascii.DC2, 38, 55, 58, 54, Base64.padSymbol, 48, 54, Ascii.GS, 54, 39, 36, 60, 33, 56, Ascii.SUB, 104, 64, 79, 126, 64, 66, 85, 72, 87, 72, 85, 88, 41, 38, 44, 58, 39, 33, 44, 36, 43, 33, 55, 42, 44, 33, 107, 44, 43, 49, 32, 43, 49, 107, 36, 38, 49, 44, 42, 43, 107, 19, Ascii.FF, 0, Ascii.DC2, 58, 53, Utf8.REPLACEMENT_BYTE, 41, 52, 50, Utf8.REPLACEMENT_BYTE, 117, 50, 53, 47, 62, 53, 47, 117, 56, 58, 47, 62, 60, 52, 41, 34, 117, Ascii.EM, 9, Ascii.DC4, Ascii.FF, 8, Ascii.SUB, Ascii.EM, Ascii.ETB, Ascii.RS, 112, 125, 125, 126, 70, 86, 75, 83, 87, 65, 86, 113, 118, 104, 50, 48, Base64.padSymbol, Base64.padSymbol, 52, 35, Ascii.CAN, 53, Ascii.DC4, Ascii.SYN, Ascii.ESC, Ascii.ESC, Ascii.DC2, 5, 35, Ascii.SO, 7, Ascii.DC2, 54, 57, 60, 48, 59, 33, 1, 58, 62, 48, 59, 113, 125, Byte.MAX_VALUE, 60, 115, 124, 118, 96, 125, 123, 118, 60, 112, 96, 125, 101, 97, 119, 96, 60, 115, 98, 98, 126, 123, 113, 115, 102, 123, 125, 124, 77, 123, 118, Ascii.SI, 3, 1, 66, Ascii.CR, 2, 8, Ascii.RS, 3, 5, 8, 66, Ascii.SUB, 9, 2, 8, 5, 2, Ascii.VT, 103, 107, 105, 42, 98, 101, 103, 97, 102, 107, 107, 111, 42, 99, 107, 107, 99, 104, 97, 116, 104, 101, 125, 119, 112, 107, 118, 97, 101, 106, 42, 67, 107, 107, 99, 104, 97, 84, 104, 101, 125, 87, 112, 107, 118, 97, 69, 74, 75, 114, 97, 118, 104, 101, 125, 65, 124, 112, 97, 118, 106, 101, 104, 69, 103, 112, 109, 114, 109, 112, 125, 109, 97, 99, 32, 104, 111, 109, 107, 108, 97, 97, 101, 32, 101, 111, 122, 111, 96, 111, 66, 78, 79, 71, 72, 70, 126, 82, 84, 81, 81, 78, 83, 85, 82, 108, 84, 77, 85, 72, 118, 72, 79, 69, 78, 86, 3, Ascii.SI, Ascii.SO, 6, 9, 7, Utf8.REPLACEMENT_BYTE, 19, Ascii.NAK, 16, 16, Ascii.SI, Ascii.DC2, Ascii.DC4, 19, 51, 16, Ascii.FF, 9, Ascii.DC4, 51, 3, Ascii.DC2, 5, 5, Ascii.SO, 45, Ascii.NAK, Ascii.FF, Ascii.DC4, 9, 55, 9, Ascii.SO, 4, Ascii.SI, Ascii.ETB, 5, Ascii.DC4, 3, 7, Ascii.DC2, 3, 57, 8, 3, 17, 57, Ascii.DC2, 7, 4, 75, 79, 4, Ascii.VT, Ascii.SO, Ascii.SYN, 7, 16, 7, 6, Base64.padSymbol, 1, Ascii.SO, Ascii.VT, 1, 9, Base64.padSymbol, 6, 7, Ascii.SO, 3, Ascii.ESC, Base64.padSymbol, Ascii.SI, 17, 39, 46, 33, 43, 35, 42, Base64.padSymbol, Ascii.ESC, 38, 34, 42, Ascii.ETB, Ascii.VT, Ascii.VT, Ascii.SI, 36, 56, 56, 60, 118, 99, 99, 60, 32, 45, 53, 98, 43, 35, 35, 43, 32, 41, 98, 47, 35, 33, 99, Utf8.REPLACEMENT_BYTE, 56, 35, 62, 41, 99, 45, 60, 60, Utf8.REPLACEMENT_BYTE, 99, 38, 58, 58, 62, Base64.padSymbol, 82, 78, 78, 74, 73, 0, Ascii.NAK, Ascii.NAK, 74, 86, 91, 67, Ascii.DC4, 93, 85, 85, 93, 86, 95, Ascii.DC4, 89, 85, 87, Ascii.NAK, 94, 5, Ascii.CAN, Ascii.NAK, 64, 71, 90, 93, 72, 71, 93, 118, 78, 72, 68, 76, 90, Base64.padSymbol, 39, Ascii.VT, 55, 53, 55, Ascii.VT, 50, Base64.padSymbol, 56, 32, 49, 38, Ascii.VT, 55, 56, Base64.padSymbol, 55, Utf8.REPLACEMENT_BYTE, 39, Ascii.VT, 59, 58, Ascii.VT, 55, 32, 53, Ascii.CR, Ascii.ETB, 59, 7, Ascii.SYN, 1, 5, 16, Ascii.CR, Ascii.DC2, 1, 59, 5, Ascii.ETB, 59, 7, 16, 5, 59, Ascii.DC2, 86, 106, 102, 117, 108, 98, 115, 85, 76, 95, 72, 86, 91, 67, 57, 37, 40, 48, 103, 46, 38, 38, 46, 37, 44, 103, 42, 38, 36, 53, 34, 52, 46, Base64.padSymbol, 34, 10, 40, 35, 34, 35, 56, Utf8.REPLACEMENT_BYTE, 39, 35, 51, Ascii.US, 50, 65, 94, 82, 64, 99, 78, 71, 82};
    }

    static {
        A09();
    }

    private int A00(C1159dL c1159dL) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = c1159dL.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(A07(FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED, 19, 65), 0)) != null && !TextUtils.isEmpty(packageInfo.versionName)) {
                return Integer.parseInt(packageInfo.versionName.split(A07(Opcodes.IF_ACMPNE, 2, 9), 2)[0]);
            }
            return -1;
        } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
            return -1;
        }
    }

    public static Intent A01(Uri uri) {
        Intent intent = new Intent(A07(Opcodes.INVOKEDYNAMIC, 26, 10), uri);
        intent.setComponent(null);
        intent.setSelector(null);
        return intent;
    }

    public static Intent A02(C1159dL c1159dL, Uri uri) {
        Intent A012 = A01(uri);
        A012.addCategory(A07(212, 33, 20));
        A012.addFlags(268435456);
        A012.putExtra(A07(288, 34, 93), c1159dL.getPackageName());
        A012.putExtra(A07(494, 14, 41), false);
        if (U7.A1y(c1159dL)) {
            if (A07(TypedValues.PositionType.TYPE_CURVE_FIT, 2, 98).equals(uri.getScheme())) {
                A012.setPackage(A07(FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED, 19, 65));
            }
        }
        return A012;
    }

    public static Intent A03(C1159dL c1159dL, Uri uri) {
        Intent A012 = A01(uri);
        A012.setPackage(A07(322, 19, 35));
        A012.putExtra(A07(259, 8, 30), c1159dL.getPackageName());
        A012.putExtra(A07(682, 7, Opcodes.LNEG), true);
        return A012;
    }

    public static Uri A04(C1159dL c1159dL, Uri uri) {
        boolean equals = A07(676, 6, 72).equals(uri.getScheme());
        String A07 = A07(587, 26, Opcodes.LNEG);
        if (equals) {
            return WQ.A00(A07 + uri.getEncodedQuery());
        }
        if (uri.toString().startsWith(A07)) {
            return uri;
        }
        c1159dL.A0F().AB3(5);
        return null;
    }

    private final ME A05(C1159dL c1159dL, Uri uri, String str, Map<String, String> map) throws W9 {
        boolean A05 = U8.A05(c1159dL);
        boolean isInAppBrowserEnabled = A0F(uri);
        if (isInAppBrowserEnabled && A05) {
            A0C(c1159dL, uri, str, map);
            ME me = ME.A08;
            if (A01[7].length() == 30) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "";
            strArr[1] = "Q7p";
            return me;
        }
        c1159dL.A0F().A9p(A05);
        A0A(c1159dL, uri);
        return ME.A07;
    }

    public static ME A06(WN wn, C1159dL c1159dL, Uri uri, String str, Map<String, String> extraData) throws W9 {
        boolean z = A0F(uri) && A07(689, 15, 6).equals(uri.getHost());
        boolean isGooglePlayWebLink = A07(676, 6, 72).equals(uri.getScheme());
        if (!isGooglePlayWebLink && !z) {
            return wn.A05(c1159dL, uri, str, extraData);
        }
        try {
            wn.A0B(c1159dL, uri, str);
            return ME.A03;
        } catch (WL unused) {
            return wn.A05(c1159dL, uri, str, extraData);
        }
    }

    private String A08(String str) {
        return android.util.Base64.encodeToString(str.getBytes(), 0);
    }

    private void A0A(C1159dL c1159dL, Uri uri) throws W9 {
        WB.A0D(c1159dL, A02(c1159dL, uri));
    }

    private final void A0B(C1159dL c1159dL, Uri uri, String str) throws WL, W9 {
        if (A0H(c1159dL)) {
            if (U7.A1H(c1159dL)) {
                String queryParameter = uri.getQueryParameter(A07(613, 2, 62));
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (A01[3].charAt(29) != 'Z') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[4] = "AXwrjbGi2NqoDqohSkmHlyhQGK6";
                    strArr[6] = "xSKC0PNk";
                    String A07 = A07(615, 13, 102);
                    String packageName = uri.toString();
                    AbstractC0646Nw.A03(queryParameter, A07, packageName);
                }
            }
            boolean z = (c1159dL.A0H().A01() && U7.A1b(c1159dL)) || (U7.A1z(c1159dL) && A0I(c1159dL));
            if (!z) {
                boolean shouldTryToOpenSplitScreen = U7.A2L(c1159dL);
                if (shouldTryToOpenSplitScreen) {
                    boolean shouldTryToOpenSplitScreen2 = WB.A0E(c1159dL, A03(c1159dL, uri));
                    if (shouldTryToOpenSplitScreen2) {
                        return;
                    }
                }
            }
            boolean A0M = A0M(c1159dL, uri, str);
            if (A01[3].charAt(29) != 'Z') {
                A01[7] = "w5Gj6271lmeoEbiTTMEsWTdaWp";
                if (A0M) {
                    return;
                }
            } else {
                A01[3] = "TMuIQjN9vpUXBqY7VYY4Z8DVMg5lcZnK";
                if (A0M) {
                    return;
                }
            }
            boolean shouldTryToOpenSplitScreen3 = A0K(c1159dL, uri);
            if (shouldTryToOpenSplitScreen3) {
                return;
            }
            Intent A02 = A02(c1159dL, uri);
            A02.setPackage(A07(322, 19, 35));
            if (Build.VERSION.SDK_INT >= 24 && z) {
                A02.addFlags(268472320);
            }
            WB.A0D(c1159dL, A02);
            return;
        }
        throw new WL();
    }

    private void A0C(C1159dL c1159dL, Uri uri, String str, Map<String, String> map) {
        AdActivityIntent A05 = WB.A05(c1159dL);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            A05.addFlags(268435456);
        }
        A05.putExtra(A07(722, 8, 120), EnumC0829Vb.A03);
        A05.putExtra(A07(249, 10, 107), uri.toString());
        A05.putExtra(A07(277, 11, 26), str);
        A05.putExtra(A07(533, 11, 0), System.currentTimeMillis());
        if (map != null) {
            String A07 = A07(267, 10, 56);
            A05.putExtra(A07, map.get(A07));
            String A072 = A07(655, 21, 43);
            A05.putExtra(A072, map.get(A072));
            String A073 = A07(628, 27, 27);
            A05.putExtra(A073, map.get(A073));
            String A074 = A07(TypedValues.PositionType.TYPE_POSITION_TYPE, 23, 45);
            A05.putExtra(A074, map.get(A074));
            String A075 = A07(714, 8, 25);
            String str2 = map.get(A075);
            if (str2 != null) {
                A05.putExtra(A075, str2);
            }
        }
        try {
            WB.A0B(c1159dL, A05);
        } catch (W9 e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            c1159dL.A08().AAy(A07(Opcodes.JSR, 11, 110), AbstractC0772Sv.A0D, new C0773Sw(th));
            Log.e(A07(Opcodes.FCMPL, 17, 28), A07(50, 90, 84), th);
        }
    }

    public static void A0D(WN wn, C1159dL c1159dL, Uri uri, String str) {
        wn.A0N(c1159dL, uri, str);
    }

    public static void A0E(WN wn, C1159dL c1159dL, Uri uri, String str) throws W9 {
        A06(wn, c1159dL, uri, str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r0 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0F(Uri uri) {
        boolean isHttpPermitted = Build.VERSION.SDK_INT < 24 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(uri.getHost());
        String scheme = uri.getScheme();
        if (isHttpPermitted) {
            boolean isHttpPermitted2 = A07(544, 4, 48).equalsIgnoreCase(scheme);
        }
        boolean isHttpPermitted3 = A07(582, 5, 1).equalsIgnoreCase(scheme);
        return isHttpPermitted3;
    }

    private boolean A0G(C1159dL c1159dL) {
        if (!U7.A1E(c1159dL)) {
            return false;
        }
        int deviceFBVersion = U7.A0E(c1159dL);
        int A002 = A00(c1159dL);
        if (deviceFBVersion == -1 || A002 == -1 || deviceFBVersion > A002) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        String[] strArr = A01;
        String str = strArr[4];
        String str2 = strArr[6];
        int length = str.length();
        int fbVersionWithGPOverlay = str2.length();
        if (length == fbVersionWithGPOverlay) {
            throw new RuntimeException();
        }
        A01[7] = "9F";
        if (i < 28) {
            return false;
        }
        String[] strArr2 = A01;
        String str3 = strArr2[2];
        String str4 = strArr2[1];
        int length2 = str3.length();
        int fbVersionWithGPOverlay2 = str4.length();
        if (length2 != fbVersionWithGPOverlay2) {
            String[] strArr3 = A01;
            strArr3[4] = "HTEWLbQNfCJbfH7LEcJTogLCYG9";
            strArr3[6] = "jIuteURS";
            return true;
        }
        return true;
    }

    private boolean A0H(C1159dL c1159dL) {
        Intent playStoreIntent = new Intent(A07(Opcodes.INVOKEDYNAMIC, 26, 10), WQ.A00(A07(548, 34, 3)));
        Iterator<ResolveInfo> it = c1159dL.getPackageManager().queryIntentActivities(playStoreIntent, 0).iterator();
        do {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[5].charAt(7) != strArr[0].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "NqbTETCkL6wtg2G74gvKWlTJws9";
            strArr2[6] = "JszVyiBC";
            if (!hasNext) {
                return false;
            }
        } while (!it.next().activityInfo.applicationInfo.packageName.equals(A07(322, 19, 35)));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r0 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        r9 = android.content.res.Resources.getSystem().getBoolean(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r1 = r4.getIdentifier(A07(457, 37, 47), r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r1 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r10 = android.content.res.Resources.getSystem().getBoolean(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        r11 = com.instagram.common.viewpoint.core.WZ.A0C(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (r9 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (r10 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (r11 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        r8 = r8 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
    
        if (r0 != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0I(C1159dL c1159dL) {
        String A07;
        String A072;
        int identifier;
        boolean supportsSplitScreenMultiWindow = true;
        boolean z = Build.VERSION.SDK_INT >= 24;
        boolean A0J = A0J(c1159dL);
        String[] strArr = A01;
        if (strArr[5].charAt(7) != strArr[0].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "";
        strArr2[1] = "LeI";
        boolean z2 = z && A0J;
        boolean z3 = true;
        boolean supportsSplitScreenMultiWindow2 = true;
        boolean appResizingSupported = true;
        boolean onAndAboveNOS = U7.A28(c1159dL);
        if (onAndAboveNOS) {
            Resources system = Resources.getSystem();
            String[] strArr3 = A01;
            if (strArr3[5].charAt(7) != strArr3[0].charAt(7)) {
                String A073 = A07(431, 26, 110);
                A07 = A07(245, 4, 93);
                A072 = A07(Opcodes.PUTSTATIC, 7, 7);
                identifier = system.getIdentifier(A073, A07, A072);
            } else {
                String[] strArr4 = A01;
                strArr4[2] = "";
                strArr4[1] = "Rqc";
                String A074 = A07(431, 26, 110);
                A07 = A07(245, 4, 93);
                A072 = A07(Opcodes.PUTSTATIC, 7, 7);
                identifier = system.getIdentifier(A074, A07, A072);
            }
        }
        c1159dL.A0F().ABW(A0J, z2, z3, supportsSplitScreenMultiWindow2, appResizingSupported);
        return z2;
    }

    public static boolean A0J(C1159dL c1159dL) {
        Activity A0E;
        PackageManager packageManager;
        ActivityInfo activityInfo;
        try {
            A0E = c1159dL.A0E();
            packageManager = c1159dL.getPackageManager();
        } catch (PackageManager.NameNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            c1159dL.A0F().ABV(e.getMessage());
        }
        if (A0E == null || packageManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 32) {
            activityInfo = packageManager.getActivityInfo(A0E.getComponentName(), PackageManager.ComponentInfoFlags.of(0L));
        } else {
            activityInfo = packageManager.getActivityInfo(A0E.getComponentName(), 128);
        }
        Field declaredField = ActivityInfo.class.getDeclaredField(A07(TypedValues.TransitionType.TYPE_AUTO_TRANSITION, 10, 8));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(activityInfo);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0;
        }
        return false;
    }

    public static boolean A0K(C1159dL c1159dL, Uri uri) {
        String A07 = A07(322, 19, 35);
        if (!U7.A1G(c1159dL)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            c1159dL.A0F().AB3(1);
            return false;
        }
        PackageManager packageManager = c1159dL.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(A07, 0);
            if (packageInfo != null && !TextUtils.isEmpty(packageInfo.versionName)) {
                String[] split = packageInfo.versionName.split(A07(Opcodes.IF_ACMPNE, 2, 9), 2);
                if (split.length < 1) {
                    c1159dL.A0F().AB3(2);
                    return false;
                }
                if (Integer.parseInt(split[0]) < U7.A0G(c1159dL)) {
                    c1159dL.A0F().AB3(3);
                    return false;
                }
            }
            Intent intent = new Intent(A07(Opcodes.INVOKEDYNAMIC, 26, 10));
            String packageName = c1159dL.getPackageName();
            intent.setPackage(A07);
            Uri hsdpUri = A04(c1159dL, uri);
            if (hsdpUri == null) {
                return false;
            }
            intent.setData(hsdpUri);
            intent.putExtra(A07(682, 7, Opcodes.LNEG), true);
            intent.putExtra(A07(259, 8, 30), packageName);
            if (intent.resolveActivity(packageManager) != null) {
                Activity A0E = c1159dL.A0E();
                if (A0E == null) {
                    A0E = ActivityUtils.A00();
                }
                if (A0E != null) {
                    A0E.startActivityForResult(intent, 945321098);
                    c1159dL.A0F().AB3(0);
                    return true;
                }
                c1159dL.A0F().AB3(7);
                return false;
            }
            LH A0F = c1159dL.A0F();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "";
            strArr2[1] = "uL3";
            A0F.AB3(6);
            return false;
        } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
            c1159dL.A0F().AB3(4);
            return false;
        }
    }

    private boolean A0L(C1159dL c1159dL, Uri uri, String str) throws W9 {
        try {
            Activity A0E = c1159dL.A0E();
            String uri2 = uri.toString();
            if (A0E != null && !TextUtils.isEmpty(uri2)) {
                Intent fbIntent = new Intent();
                if (U7.A1F(c1159dL)) {
                    String A06 = AbstractC1434hy.A06(str);
                    if (TextUtils.isEmpty(A06)) {
                        return false;
                    }
                    fbIntent.putExtra(A07(0, 20, 67), A08(A06));
                }
                fbIntent.setComponent(new ComponentName(A07(FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED, 19, 65), A07(FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 71, 75)));
                fbIntent.putExtra(A07(Opcodes.F2L, 9, 22), uri2);
                fbIntent.putExtra(A07(37, 13, 89), A08(A07(20, 17, 90)));
                if (!WB.A0E(c1159dL, fbIntent)) {
                    A0E.startActivityForResult(fbIntent, 2);
                    return true;
                }
                return true;
            }
            return false;
        } catch (ActivityNotFoundException | IllegalStateException e) {
            c1159dL.A0F().AB2(e.getMessage());
            return false;
        }
    }

    private boolean A0M(C1159dL c1159dL, Uri uri, String str) throws W9 {
        return A0G(c1159dL) && A0L(c1159dL, uri, str);
    }

    private final boolean A0N(C1159dL c1159dL, Uri uri, String str) {
        return WB.A0G(c1159dL, uri, str);
    }

    public static boolean A0O(WN wn, C1159dL c1159dL, Uri uri, String str) {
        try {
            A0E(wn, c1159dL, uri, str);
            return true;
        } catch (W9 e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            c1159dL.A08().AAy(A07(Opcodes.JSR, 11, 110), AbstractC0772Sv.A05, new C0773Sw(th));
            return false;
        }
    }
}
