package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class TK {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-86, -93, -92, -39, -85, -43, -92, -85, -54, -58, -59, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, -61, -66, -55, -66, -74, -63, -66, -49, -74, -55, -66, -60, -61, 117, -56, -55, -74, -57, -55, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, -59, -53, -66, -70, -67, -46, 121, -62, -57, -62, -51, -62, -70, -59, -62, -45, -66, -67, 122, 121, -84, -60, -62, -55, -55, -62, -57, -64, -121, -90, -68, -62, 109, -79, -68, -69, 116, -63, 109, -80, -82, -71, -71, 109, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -114, -79, -64, 123, -74, -69, -74, -63, -74, -82, -71, -74, -57, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, -62, -69, -80, -63, -74, -68, -69, -82, -71, -74, -63, -58, 109, -70, -82, -58, 109, -69, -68, -63, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, -58, 123, -120, -105, -112, -58, -52, -63, -45, -56, 0, 6, -5, Ascii.CR, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, -31, -40, -46, -3, 2, -3, 8, -3, -11, 0, -3, Ascii.SO, -7, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static YU A00() {
        return new YU();
    }

    public static YP A01(C1133cu c1133cu) {
        return new YP(c1133cu);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        XJ.A01.execute(new YV(initListener, initResult));
    }

    public static void A06(C1133cu c1133cu) {
        if (U9.A0P(c1133cu) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new C0762Sl(Thread.getDefaultUncaughtExceptionHandler(), c1133cu, new YL());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e) {
                c1133cu.A08().AAy(A02(Opcodes.IFNULL, 7, 78), AbstractC0772Sv.A1X, new C0773Sw(e));
            }
        }
    }

    public static void A07(C1133cu c1133cu) {
        A0H(c1133cu, null, null, 3);
    }

    public static void A08(C1133cu c1133cu) {
        A0H(c1133cu, null, null, 3);
    }

    public static void A09(C1133cu c1133cu) {
        if (U7.A2H(c1133cu)) {
            A0F(c1133cu, 0);
        }
        if (U7.A2Q(c1133cu)) {
            A0B(c1133cu);
        }
    }

    public static void A0A(C1133cu c1133cu) {
        if (U7.A2I(c1133cu)) {
            String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c1133cu, null, 3);
        }
    }

    public static void A0B(C1133cu c1133cu) {
        XU.A06.execute(new C0909Yg(c1133cu));
    }

    public static void A0C(C1133cu c1133cu) {
        AbstractC0635Nl.A02(c1133cu);
        C0766Sp.A0C(c1133cu, new YK(c1133cu), new C0977aO(), BuildConfigApi.isDebug());
        c1133cu.A0A();
        A0D(c1133cu);
    }

    public static void A0D(C1133cu c1133cu) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(c1133cu);
        String string = sharedPreferences.getString(A02(Opcodes.INVOKEDYNAMIC, 12, Opcodes.LSHL), null);
        String string2 = sharedPreferences.getString(A02(239, 11, 116), null);
        if (string != null && string2 != null) {
            InterfaceC0771Su A08 = c1133cu.A08();
            C0773Sw c0773Sw = new C0773Sw(string2);
            String flashConfig = A02(Opcodes.PUTFIELD, 5, 63);
            A08.ABR(flashConfig, 3701, c0773Sw);
        }
    }

    public static void A0F(C1133cu c1133cu, int i) {
        SP.A01(c1133cu);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            VF.A02();
        }
        A06(c1133cu);
        AbstractC0849Vw.A00(U7.A0q(c1133cu), BuildConfigApi.isDebug(), A00(), A01(c1133cu));
        S0.A03(U7.A04(c1133cu));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            C1256ev.A09(new YN(c1133cu));
        }
        if (i == 3) {
            Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c1133cu.A08().ABR(A02(Opcodes.GETSTATIC, 3, 6), AbstractC0772Sv.A0R, new C0773Sw(A02(215, 24, 67)));
        }
        ActivityUtils.A04(c1133cu, AudienceNetworkActivity.class);
        XU.A05(c1133cu);
        C0805Ud.A05(c1133cu);
        MW.A01(c1133cu);
        if (U7.A16(c1133cu)) {
            AbstractC0719Qt.A00(c1133cu);
        }
        if (U7.A1u(c1133cu)) {
            C0870Wt.A02().A8s(c1133cu);
        }
    }

    public static void A0G(C1133cu c1133cu, AudienceNetworkAds.InitListener initListener, int i) {
        SP.A01(c1133cu);
        boolean z = false;
        synchronized (TK.class) {
            boolean execute = A00;
            if (!execute) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z = true;
                        }
                    }
                }
                A00 = true;
                z = true;
            }
        }
        if (z) {
            A0F(c1133cu, i);
            XU.A08.execute(new ZW(c1133cu, initListener));
        } else {
            if (i != 1) {
                return;
            }
            String A022 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new TJ(true, A022));
            } else {
                Log.w(A02(8, 17, 99), A022);
            }
        }
    }

    public static void A0H(C1133cu c1133cu, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i) {
        VF.A05(A02(205, 10, Opcodes.DREM), A02(25, 26, 52), A02(0, 8, 82));
        C1256ev.A06();
        A0G(c1133cu, initListener, i);
    }

    public static synchronized boolean A0I() {
        boolean z;
        synchronized (TK.class) {
            z = A00;
        }
        return z;
    }
}
