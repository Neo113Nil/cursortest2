package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.7r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03147r {
    public static SparseIntArray A00;
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"lfqbOpCQc8eNVWWSF0ti", "aQ5ZOD0I", "7f7up0GBGRCd1p0enpCjG4lcj76", "dHBYXWbpLBdqteinvxBO5bOixoP3oT04", "DPNUUQYEctncegz3shse9IBb8Vdl47", "4q0rwT09y0cbatV7Yp", "6l64E9SK9p5G", "edaEIeRSccYYgTnyelVwcwdzoe4C2sfO"};
    public static final List<Integer> A06;
    public static final List<C03157s> A07;
    public static final AtomicBoolean A08;
    public static final AtomicInteger A09;
    public static final AtomicReference<InterfaceC03127p> A0A;
    public static final AtomicReference<InterfaceC03137q> A0B;
    public static final AtomicReference<Boolean> A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-93, -105, -40, -37, -37, -32, -21, -32, -26, -27, -40, -29, -64, -27, -35, -26, -105, -76, -105, -110, -122, -45, -53, -39, -39, -57, -51, -53, -122, -93, -122, 91, 79, -94, -92, -111, -93, -88, -97, -108, 114, -98, -109, -108, 79, 108, 79, 116, -66, -36, -23, -94, -17, -101, -25, -22, -30, -101, -65, -32, -35, -16, -30, -101, -64, -15, -32, -23, -17, -87, -101, -66, -22, -23, -17, -32, -13, -17, -101, -28, -18, -101, -23, -16, -25, -25, -87, 119, -93, -87, -94, -88, -103, -90, 110, 84, -79, -46, -49, -30, -44, -115, -48, -33, -50, -32, -43, -115, -49, -46, -48, -50, -30, -32, -46, -115, -36, -45, -115, -46, -29, -46, -37, -31, -115, -28, -42, -31, -43, -115, -32, -30, -49, -31, -26, -35, -46, -115, -86, -115, 108, -97, -118, -116, -116, -117, -116, -117, 71, -112, -107, 84, -108, -116, -108, -106, -103, -96, 71, -109, -106, -114, 71, -109, -112, -108, -112, -101, 72, 71, 115, -120, -102, -101, 71, -116, -99, -116, -107, -101, 97, 71, -108, -57, -78, -76, -65, -61, -72, -66, -67, 111, -109, -76, -79, -60, -74, 111, -108, -59, -76, -67, -61, 111, -58, -72, -61, -73, 111, -62, -60, -79, -61, -56, -65, -76, 111, -116, 111, -97, -46, -67, -65, -54, -50, -61, -55, -56, 122, -66, -49, -52, -61, -56, -63, 122, -58, -55, -63, -63, -61, -56, -63, 122, -66, -65, -68, -49, -63, 122, -65, -48, -65, -56, -50, -120, -27, Ascii.CAN, 3, 5, 16, Ascii.DC4, 9, Ascii.SI, Ascii.SO, -64, 19, 8, Ascii.SI, Ascii.NAK, Ascii.FF, 4, -64, Ascii.SO, Ascii.SI, Ascii.DC4, -64, 8, 1, 16, 16, 5, Ascii.SO, -64, 8, 5, Ascii.DC2, 5, -50, -101, -105, -106, -54, -71, -66, -70, -61, -72, -70, -93, -70, -55, -52, -60, -57, -64, -28, 9, 1, 10, -69, -33, 0, -3, 16, 2, -69, -32, 17, 0, 9, Ascii.SI, -69, Ascii.DC2, 4, Ascii.SI, 3, -69, Ascii.SO, 16, -3, Ascii.SI, Ascii.DC4, Ascii.VT, 0, -69, -40, -69, -53, -26, -26, -105, -28, -40, -27, -16, -105, -36, -19, -36, -27, -21, -22, -105, -26, -35, -105, -22, -20, -39, -21, -16, -25, -36, -105, -38, -26, -37, -36, -79, -105, -101, -99, -104, -99, -102, -83, -102, -104, -91, -88, -96, -96, -94, -89, -96, -21, -8, -3, -24, -19, -18, -3, -18, -20, -3, -14, -8, -9, -24, 0, -8, -24, -4, -14, -16, -9, -22, -11, -24, -19, -22, -3, -22, -24, -11, -8, -16, -16, -14, -9, -16, -62, -64, -62, -57, -60, -57, -58, -49, -62, -41, -56, -42, -41, -4, -3, -9, 4, 7, -1, -1, 1, 6, -1, -52, -37, -44, -44, -53, -46, -41, -34, -47, -51, -28, -49, -38, -41, -46, -49, -30, -41, -35, -36, 0, -9, 6, 9, 1, 4, -3};
    }

    static {
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0B = new AtomicReference<>();
        A0A = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A06 = Arrays.asList(10, 50, 100, 1000);
        A07 = Collections.synchronizedList(new ArrayList());
        A09 = new AtomicInteger();
        A08 = new AtomicBoolean();
        A0C = new AtomicReference<>();
        A02 = false;
    }

    public static int A00(String str, int i, C7S c7s) {
        if ((A01(465, 7, 107).equals(str) && C03207x.A1z == i) || A01(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 5, 56).equals(str) || A01(445, 6, 63).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 98).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 18).equals(str)) {
            return IR.A05(c7s);
        }
        if (A05[3].charAt(3) != 'Y') {
            throw new RuntimeException();
        }
        A05[7] = "MSKlPe4okWTggpeViHGlBF3nlCraGBz9";
        return -1;
    }

    public static /* synthetic */ List A02() {
        List<C03157s> list = A07;
        String[] strArr = A05;
        if (strArr[4].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        A05[1] = "TV2BvPAOYvnRV0R5I88rwwfNZOOU8";
        return list;
    }

    public static void A05(C7S c7s, int i, int i2) {
        c7s.A07().A9M(A01(435, 10, 113), C03207x.A2W, new C03217y(A01(338, 33, 80) + i, A01(87, 9, 13) + i2));
    }

    @Deprecated
    public static void A06(C7S c7s, String str, int i, C03217y c03217y) {
        if (c7s == null) {
            A0F(new RuntimeException(A01(48, 39, 84)));
            return;
        }
        C7R.A01(c7s.A01());
        if (A02 && c03217y.A00() == 0) {
            A0D(new RuntimeException(A01(96, 44, 70) + str + A01(31, 16, 8) + i, c03217y));
        }
        try {
            if (A0I(c7s, str, i, Math.random(), c03217y)) {
                A09(c7s, str, i, c03217y);
            }
        } catch (Throwable t) {
            A0F(t);
        }
    }

    @Deprecated
    public static void A07(C7S c7s, String str, int i, C03217y c03217y) {
        try {
            c03217y.A03(2);
            c03217y.A08(false);
            c03217y.A04(1);
            if (IR.A0Q(c7s)) {
                c03217y.A06(true);
            } else {
                c03217y.A06(false);
            }
            A06(c7s, str, i, c03217y);
        } catch (Throwable t) {
            A0F(t);
        }
    }

    @Deprecated
    public static void A08(C7S c7s, String str, int i, C03217y c03217y) {
        try {
            c03217y.A03(2);
            c03217y.A06(false);
            A06(c7s, str, i, c03217y);
        } catch (Throwable t) {
            A0F(t);
        }
    }

    public static void A09(C7S c7s, String str, int i, C03217y c03217y) {
        synchronized (C03147r.class) {
            if (!A03) {
                int A012 = IR.A01(c7s);
                AtomicInteger atomicInteger = A09;
                int threshold = atomicInteger.getAndIncrement();
                if (threshold < A012 - 1) {
                    A07.add(new C03157s(str, i, c03217y));
                } else if (atomicInteger.get() == A012) {
                    A07.add(new C03157s(A01(435, 10, 113), C03207x.A2T, new C03217y(A01(Opcodes.F2L, 42, 0) + str + A01(47, 1, 19) + i)));
                }
            } else {
                A0A(c7s, str, i, c03217y, true);
            }
        }
    }

    public static void A0A(C7S c7s, String str, int i, C03217y c03217y, boolean z) {
        InterfaceC03137q interfaceC03137q = A0B.get();
        boolean z2 = interfaceC03137q != null && interfaceC03137q.A93();
        if (A08.get() || z2) {
            int A002 = c03217y.A00();
            String A012 = A01(289, 17, 46);
            String A013 = A01(31, 16, 8);
            if (A002 == 0) {
                Log.e(A012, A01(Opcodes.INVOKEVIRTUAL, 37, 40) + str + A013 + i, c03217y);
            } else {
                Log.i(A012, A01(306, 32, 116) + str + A013 + i + A01(19, 12, 63) + c03217y.getMessage() + A01(0, 19, 80) + c03217y.A02());
            }
        }
        Y1 y1 = new Y1(c7s, str, i, c03217y, interfaceC03137q);
        if (z) {
            A01.execute(y1);
        } else {
            y1.run();
        }
    }

    public static void A0C(Y9 y9, InterfaceC03137q interfaceC03137q, InterfaceC03127p interfaceC03127p, boolean z) {
        A0A.set(interfaceC03127p);
        A0B.set(interfaceC03137q);
        A08.set(z);
        synchronized (C03147r.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new Y2(y9));
            }
        }
    }

    public static void A0D(final RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.ads.redexgen.X.7o
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    @Deprecated
    public static void A0E(Throwable th) {
        if (A02) {
            A0D(new RuntimeException(A01(256, 33, 121), th));
        }
    }

    public static void A0F(Throwable th) {
        Log.e(A01(289, 17, 46), A01(219, 37, 51), th);
        if (A02) {
            A0D(new RuntimeException(th));
        }
    }

    public static boolean A0H(C7S c7s) {
        Boolean shouldLogFunnelEvents = A0C.get();
        if (shouldLogFunnelEvents != null) {
            return shouldLogFunnelEvents.booleanValue();
        }
        return IR.A0A(c7s) != 0;
    }

    public static boolean A0I(C7S c7s, String str, int i, double d, C03217y c03217y) {
        double d2;
        boolean z;
        int additionalDebugLoggingSamplingPercentage;
        try {
            int A042 = IR.A04(c7s);
            if (A042 < 1) {
                return false;
            }
            HashMap<String, Integer> A0M = IR.A0M(c7s);
            Set<String> keySet = A0M.keySet();
            String str2 = str + A01(47, 1, 19) + i;
            boolean contains = keySet.contains(str2);
            if (contains) {
                Integer num = A0M.get(str2);
                int additionalDebugLoggingSamplingPercentage2 = num != null ? num.intValue() : -1;
                if (additionalDebugLoggingSamplingPercentage2 == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage2 > 0) {
                    return d <= 1.0d / ((double) additionalDebugLoggingSamplingPercentage2);
                }
                if (IR.A03(c7s) < 1) {
                    return false;
                }
                d2 = (A042 * r0) / 10000.0d;
            } else if (!c03217y.A09()) {
                d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            } else {
                d2 = A042 / 100.0d;
            }
            double A002 = c7s.A08().A00();
            if (A01(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 5, 56).equals(str)) {
                if (c7s.A04().A8o()) {
                    return true;
                }
                int additionalDebugLoggingSamplingPercentage3 = IR.A06(c7s);
                if (additionalDebugLoggingSamplingPercentage3 == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage3 > 0) {
                    double d3 = 1.0d / additionalDebugLoggingSamplingPercentage3;
                    return contains ? A002 <= d3 * d2 : A002 <= d3;
                }
            }
            if (A01(465, 7, 107).equals(str) && C03207x.A1z == i) {
                if (!A08.get()) {
                    additionalDebugLoggingSamplingPercentage = IR.A0E(c7s);
                } else {
                    additionalDebugLoggingSamplingPercentage = 1;
                }
                if (additionalDebugLoggingSamplingPercentage == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage > 0) {
                    double d4 = 1.0d / additionalDebugLoggingSamplingPercentage;
                    return contains ? A002 <= d4 * d2 : A002 <= d4;
                }
            }
            if (A01(427, 8, 60).equals(str)) {
                return true;
            }
            if (A01(445, 6, 63).equals(str)) {
                if (IR.A0S(c7s) && c03217y.A0A()) {
                    return !contains || d >= 1.0d - d2;
                }
                AtomicReference<Boolean> atomicReference = A0C;
                Boolean bool = atomicReference.get();
                if (bool != null) {
                    return bool.booleanValue();
                }
                int additionalDebugLoggingSamplingPercentage4 = IR.A0A(c7s);
                if (additionalDebugLoggingSamplingPercentage4 == 0) {
                    atomicReference.set(false);
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage4 > 0) {
                    double d5 = 1.0d / additionalDebugLoggingSamplingPercentage4;
                    return contains ? A002 <= d5 * d2 : A002 <= d5;
                }
            }
            if (A01(451, 14, 71).equals(str)) {
                if (c7s.A04().A8o()) {
                    return true;
                }
                z = true;
                int additionalDebugLoggingSamplingPercentage5 = IR.A0B(c7s);
                if (additionalDebugLoggingSamplingPercentage5 == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage5 > 0) {
                    double d6 = additionalDebugLoggingSamplingPercentage5;
                    String[] strArr = A05;
                    if (strArr[4].length() == strArr[0].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A05;
                    strArr2[4] = "KJjq974XMuOG6VE2UuXyW1KY5FJsZ9";
                    strArr2[0] = "oDF6i4FckldRw4UZ8099";
                    double d7 = 1.0d / d6;
                    if (contains) {
                        return A002 <= d7 * d2;
                    }
                    String[] strArr3 = A05;
                    if (strArr3[5].length() == strArr3[2].length()) {
                        throw new RuntimeException();
                    }
                    A05[7] = "qAglZRfXbaaC8J2ltzId8jp93qQE3ecw";
                    return A002 <= d7;
                }
            } else {
                z = true;
            }
            if (d >= 1.0d - d2) {
                return z;
            }
            return false;
        } catch (Throwable th) {
            if (A05[7].charAt(14) != 'T') {
                A05[6] = "gQ";
                A0F(th);
                return false;
            }
            A0F(th);
            return false;
        }
    }

    public static boolean A0J(C7S c7s, String str, int i, C03217y c03217y) {
        if (!IR.A0P(c7s)) {
            return true;
        }
        int customLimit = A00.get(i);
        int eventsLimit = IR.A00(c7s);
        if (c03217y.A01() != -1) {
            eventsLimit = c03217y.A01();
        } else {
            int currentCounter = A00(str, i, c7s);
            if (eventsLimit < currentCounter) {
                eventsLimit = currentCounter;
            }
        }
        if (customLimit >= eventsLimit) {
            if (A06.contains(Integer.valueOf(customLimit))) {
                boolean A0B2 = c03217y.A0B();
                if (A05[3].charAt(3) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[5] = "DtDXz8TrFQQZw1pkgy";
                strArr[2] = "wKGFu6BM2pQR03pr0dyvmA98nTz";
                if (A0B2) {
                    A05(c7s, i, customLimit);
                }
            }
            A00.put(i, customLimit + 1);
            return true;
        }
        A00.put(i, customLimit + 1);
        return false;
    }
}
