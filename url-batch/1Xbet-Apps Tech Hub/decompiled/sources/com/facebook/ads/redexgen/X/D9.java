package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class D9 {
    public static int A00;
    public static byte[] A01;
    public static String[] A02 = {"BAY", "ymxL57jYYv0jjQRcHQbZ4WAbO", "V4mYndI5uaXc7arEQ3TceizUtwuJpZsP", "bZ", "bvLsrur7DOWvoKolroRaEPylJxsC8CBw", "pPHP1LRPBsm50pfT1", "f9saOCuwOfCGSEN51CDIZYerwD3UjJFW", "NB4ZEOXNx"};
    public static final SparseIntArray A03;
    public static final SparseIntArray A04;
    public static final C0435Cy A05;
    public static final HashMap<D6, List<C0435Cy>> A06;
    public static final Map<String, Integer> A07;
    public static final Pattern A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A00() throws D7 {
        if (A00 == -1) {
            int i = 0;
            C0435Cy A062 = A06(A07(PointerIconCompat.TYPE_CELL, 9, 38), false);
            if (A062 != null) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : A062.A0J()) {
                    i = Math.max(A01(codecProfileLevel.level), i);
                }
                i = Math.max(i, C0557Hx.A02 >= 21 ? 345600 : 172800);
            }
            A00 = i;
        }
        return A00;
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 109);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x005f, code lost:
    
        if (r15 != r14) goto L20;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8 A[Catch: Exception -> 0x0151, TRY_ENTER, TryCatch #5 {Exception -> 0x0151, blocks: (B:8:0x0022, B:10:0x002a, B:13:0x0036, B:24:0x00c8, B:27:0x00d8, B:29:0x00de, B:33:0x0112, B:34:0x014d, B:31:0x0109, B:70:0x010d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<C0435Cy> A08(D6 d6, D8 d8, String str) throws D7 {
        int i;
        String A072;
        try {
            ArrayList<C0435Cy> arrayList = new ArrayList<>();
            String str2 = d6.A00;
            int A6O = d8.A6O();
            boolean AEu = d8.AEu();
            for (int i2 = 0; i2 < A6O; i2++) {
                MediaCodecInfo A6P = d8.A6P(i2);
                String name = A6P.getName();
                try {
                    if (A0C(A6P, name, AEu, str)) {
                        for (String str3 : A6P.getSupportedTypes()) {
                            if (str3.equalsIgnoreCase(str2)) {
                                try {
                                    MediaCodecInfo.CodecCapabilities capabilitiesForType = A6P.getCapabilitiesForType(str3);
                                    boolean A94 = d8.A94(str2, capabilitiesForType);
                                    boolean A0D = A0D(name);
                                    if (AEu) {
                                        try {
                                            boolean z = d6.A01;
                                            if (A02[7].length() != 9) {
                                                throw new RuntimeException();
                                            }
                                            String[] strArr = A02;
                                            strArr[3] = "CD";
                                            strArr[0] = "ZBY";
                                        } catch (Exception e) {
                                            e = e;
                                            i = C0557Hx.A02;
                                            A072 = A07(TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 38);
                                            if (i > 23) {
                                            }
                                            Log.e(A072, A07(Opcodes.GOTO, 22, 9) + name + A07(0, 2, 58) + str3 + A07(33, 1, 97));
                                            throw e;
                                        }
                                    }
                                    if (!AEu) {
                                        try {
                                            if (!d6.A01) {
                                                try {
                                                    arrayList.add(C0435Cy.A02(name, str2, capabilitiesForType, A0D, false));
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    i = C0557Hx.A02;
                                                    A072 = A07(TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 38);
                                                    if (i > 23) {
                                                    }
                                                    Log.e(A072, A07(Opcodes.GOTO, 22, 9) + name + A07(0, 2, 58) + str3 + A07(33, 1, 97));
                                                    throw e;
                                                }
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            String[] strArr2 = A02;
                                            if (strArr2[3].length() != strArr2[0].length()) {
                                                A02[5] = "MyzIrPx41nvhJUnfD";
                                                i = C0557Hx.A02;
                                                A072 = A07(TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 38);
                                                if (i > 23 || arrayList.isEmpty()) {
                                                    Log.e(A072, A07(Opcodes.GOTO, 22, 9) + name + A07(0, 2, 58) + str3 + A07(33, 1, 97));
                                                    throw e;
                                                }
                                                Log.e(A072, A07(780, 15, 115) + name + A07(2, 31, 118));
                                            }
                                        }
                                    }
                                    if (!AEu && A94) {
                                        arrayList.add(C0435Cy.A02(name + A07(46, 7, 0), str2, capabilitiesForType, A0D, true));
                                        return arrayList;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                }
                            }
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                    throw new D7(e);
                }
            }
            return arrayList;
        } catch (Exception e6) {
            e = e6;
        }
    }

    public static void A0A() {
        if (A02[4].charAt(9) != 'O') {
            throw new RuntimeException();
        }
        A02[1] = "WfhNiOeVQzQSnYcncz46tqnXb";
        A01 = new byte[]{-57, -49, 3, Ascii.VT, 73, 68, 76, 79, 72, 71, 3, 87, 82, 3, 84, 88, 72, 85, 92, 3, 70, 68, 83, 68, 69, 76, 79, 76, 87, 76, 72, 86, Ascii.FF, -9, -92, -106, -73, -23, -23, -21, -29, -33, -28, -35, -80, -106, -101, -32, -46, -48, -30, -33, -46, -1, -28, Ascii.RS, Ascii.SUB, Ascii.RS, Base64.padSymbol, 45, Ascii.CR, Ascii.CR, Ascii.SI, 16, 49, 47, 59, 48, 49, 62, -29, -47, -43, -48, -44, 10, -8, -4, -9, -4, -44, -62, -57, -63, -59, -31, -49, -44, -50, -45, -73, -86, -86, -92, -90, -65, -78, -78, -84, -81, -13, -26, -26, -32, -26, -72, -85, -85, -90, -85, -61, -55, -48, -63, -63, -61, -60, -27, -29, -17, -28, -27, -14, -45, -39, -32, -47, -35, -30, -34, -46, -44, -11, -13, -1, -12, -11, 2, 43, 49, 56, 53, 56, Ascii.ESC, 44, 77, 75, 87, 76, 77, 90, -36, -30, -23, -17, 8, Ascii.VT, -5, 2, Ascii.FF, -35, -2, -4, 8, -3, -2, Ascii.VT, -68, -41, -33, -30, -37, -38, -106, -22, -27, -106, -25, -21, -37, -24, -17, -106, -39, -27, -38, -37, -39, -106, -67, -90, -89, -91, 49, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.EM, 2, 6, 1, 48, Ascii.EM, Ascii.GS, Ascii.ESC, -31, -54, -50, -49, -64, -87, -80, -88, -60, -83, -76, -81, Ascii.DC2, -5, 2, 0, -3, -24, -27, -5, -23, -29, 44, Ascii.SUB, Ascii.ETB, -75, -90, -99, Ascii.DC2, 3, -3, 19, Ascii.CAN, -20, 10, 17, Ascii.DC2, Ascii.NAK, Ascii.FF, 17, 10, -61, 16, 4, Ascii.SI, 9, Ascii.DC2, Ascii.NAK, 16, 8, 7, -61, -28, -7, -26, -61, 6, Ascii.DC2, 7, 8, 6, -61, Ascii.SYN, Ascii.ETB, Ascii.NAK, Ascii.FF, 17, 10, -35, -61, -18, Ascii.FF, 19, Ascii.DC4, Ascii.ETB, Ascii.SO, 19, Ascii.FF, -59, Ascii.DC2, 6, 17, Ascii.VT, Ascii.DC4, Ascii.ETB, Ascii.DC2, 10, 9, -59, -19, -22, -5, -24, -59, 8, Ascii.DC4, 9, 10, 8, -59, Ascii.CAN, Ascii.EM, Ascii.ETB, Ascii.SO, 19, Ascii.FF, -33, -59, 8, -19, -18, -20, -35, -62, -61, -60, -17, -44, -40, -45, 6, -21, -17, -19, 3, -24, -20, -19, -61, -88, -81, -89, -5, -32, -25, -30, -50, -77, -70, -72, 5, -20, -23, -20, -45, -42, 8, -6, -28, -34, -62, -84, -87, Ascii.FS, 9, 0, -1, -20, -26, 32, 35, 6, Ascii.ETB, 56, 54, 66, 55, 56, 69, 10, 34, 33, 38, Ascii.RS, 0, 44, 33, 34, 32, 9, 38, 48, 49, -35, -2, Ascii.CR, 6, -35, 33, 38, 33, 43, -28, 49, -35, 41, 38, 48, 49, -35, 48, 34, 32, 50, 47, 34, -35, 33, 34, 32, 44, 33, 34, 47, -35, 35, 44, 47, -9, -35, -32, -8, -9, -4, -12, -42, 2, -9, -8, -10, -24, 7, -4, -1, -58, -35, -16, -19, -21, -104, -87, -88, 48, 37, 51, 48, 42, 37, Ascii.SO, 57, 54, Ascii.DC4, 6, 4, Ascii.SI, -27, -4, 47, 48, 37, 38, 42, -27, -8, -8, -6, -27, -5, Ascii.FS, Ascii.SUB, 38, Ascii.ESC, Ascii.FS, 41, 1, -1, 10, -32, -9, 42, 43, 32, 33, 37, -32, -13, 8, -11, -32, -10, Ascii.ETB, Ascii.NAK, 33, Ascii.SYN, Ascii.ETB, 36, Ascii.FF, 10, Ascii.NAK, -21, 2, 53, 54, 43, 44, 48, -21, -2, 19, 0, -21, 1, 34, 32, 44, 33, 34, 47, -21, 48, 34, 32, 50, 47, 34, -54, -56, -45, -87, -56, -49, -58, -87, -68, -48, -65, -60, -54, -87, -65, -64, -66, -54, -65, -64, -51, -87, -68, -68, -66, 8, 6, 17, -25, 6, Ascii.CR, 4, -25, -6, Ascii.SO, -3, 2, 8, -25, -3, -2, -4, 8, -3, -2, Ascii.VT, -25, -3, Ascii.FF, 9, -6, -4, -20, 43, 41, 52, 10, 41, 48, 39, 10, Ascii.GS, 49, 32, 37, 43, 10, 32, 33, Ascii.US, 43, 32, 33, 46, 10, 46, Ascii.GS, 51, -38, -40, -29, -71, -34, -48, -50, -71, -40, -37, -66, -71, -49, -16, -18, -6, -17, -16, -3, -15, -17, -6, -48, -11, -25, -27, -48, 3, 3, 5, -48, 6, 7, 5, -62, -64, -53, -95, -58, -72, -74, -95, -23, -29, -85, -95, -41, -40, -42, -7, -9, 2, -40, 17, Ascii.EM, Ascii.EM, 17, Ascii.SYN, Ascii.SI, -40, Ascii.FS, Ascii.VT, 33, -40, Ascii.SO, Ascii.SI, Ascii.CR, Ascii.EM, Ascii.SO, Ascii.SI, Ascii.FS, Ascii.VT, 9, Ascii.DC4, -22, 45, Ascii.US, 43, 41, -22, Ascii.GS, 49, 32, 37, 43, -22, 32, 33, Ascii.US, 43, 32, 33, 46, -22, Ascii.GS, Ascii.GS, Ascii.US, Ascii.SO, Ascii.FF, Ascii.ETB, -19, 48, 34, 46, 44, -19, 32, 52, 35, 40, 46, -19, 35, 36, 34, 46, 35, 36, 49, -19, 44, 47, -14, Ascii.CAN, Ascii.SYN, 33, -9, 58, 44, 56, 54, -9, 63, 50, 45, 46, 56, -9, 45, 46, 44, 56, 45, 46, 59, -9, 63, 57, 1, 63, 47, Ascii.EM, Ascii.FS, 32, 51, -32, -48, -70, -67, -62, -44, 49, 33, 52, 17, Ascii.SI, 56, 52, Ascii.DC2, Ascii.NAK, Ascii.ETB, 42, 51, 75, 73, 80, 80, 73, 78, 71, 0, 67, 79, 68, 69, 67, 0, -23, 2, -1, 2, 3, Ascii.VT, 2, -76, -43, -22, -41, -76, 0, -7, 10, -7, 0, -50, -76, 44, 69, 66, 69, 70, 78, 69, -9, Ascii.CAN, 45, Ascii.SUB, -9, 71, 73, 70, Base64.padSymbol, 64, 67, 60, 17, -9, Ascii.FF, 37, 34, 37, 38, 46, 37, -41, -1, -4, Ascii.CR, -6, -41, 35, Ascii.FS, 45, Ascii.FS, 35, -41, 42, 43, 41, 32, 37, Ascii.RS, -15, -41, 50, 75, 72, 75, 76, 84, 75, -3, 37, 34, 51, 32, -3, 77, 79, 76, 67, 70, 73, 66, -3, 80, 81, 79, 70, 75, 68, Ascii.ETB, -3, -7, 10, 2, 16, Ascii.SO, 10, Ascii.RS, -16, -34, -36, -60, -65, -88, -36, -28, -85, -87, -92, 62, Ascii.DC4, Ascii.CR, Ascii.EM, 45, Ascii.FS, 33, 39, -25, Ascii.GS, Ascii.EM, Ascii.ESC, -21, 0, Ascii.DC4, 3, 8, Ascii.SO, -50, 4, 0, 2, -46, -52, 9, Ascii.SO, 2, -25, -4, -23, -73, 66, 87, 68, 19, 73, Ascii.ETB, 4, Ascii.FF, Ascii.CAN, Ascii.NAK, 42, 40, 40, -18, -21, -4, -73, -9, 5, -14, -64, 17, Ascii.CR, 19, Ascii.ESC, Ascii.FF, -8, -20, -3, -12, -7, -16, -9, -1, -16, -20, -1, -1, Ascii.FF, Ascii.SO, Ascii.VT, 16, Ascii.VT, 17, -20, -38, -26, -20, -18, -25, -32, -29, -47, -34, -28, -33, -29, -6, -20, -7, 
        -7, -24, -11, -10, -3, -71, 9, -4, -9, -8, 2, -62, -12, 9, -10, 43, Ascii.RS, 33, 33, Ascii.SUB, 42, Ascii.GS, 32, 32, Ascii.EM, Ascii.ETB, -26, 53, 40, 43, 43, 36, 47, 43, 52, 50, 2, -19, -10, -12, -4, -19, 96, 75, 88, 85, 76, 82, 90, 75, 2, -19, -6, -9, -12, -4, -19};
    }

    static {
        A0A();
        A05 = C0435Cy.A01(A07(657, 22, 61));
        A08 = Pattern.compile(A07(899, 10, 19));
        A06 = new HashMap<>();
        A00 = -1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        A04 = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        A03 = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        A07 = hashMap;
        hashMap.put(A07(345, 3, 76), 1);
        hashMap.put(A07(352, 3, 65), 4);
        hashMap.put(A07(355, 3, 9), 16);
        hashMap.put(A07(358, 3, 99), 64);
        hashMap.put(A07(361, 3, 70), 256);
        hashMap.put(A07(313, 4, 79), 1024);
        hashMap.put(A07(TypedValues.AttributesType.TYPE_EASING, 4, 36), 4096);
        hashMap.put(A07(321, 4, 54), 16384);
        hashMap.put(A07(325, 4, 77), 65536);
        hashMap.put(A07(329, 4, 74), 262144);
        hashMap.put(A07(333, 4, 10), 1048576);
        hashMap.put(A07(337, 4, 66), 4194304);
        hashMap.put(A07(341, 4, 21), 16777216);
        hashMap.put(A07(221, 3, 72), 2);
        hashMap.put(A07(224, 3, 70), 8);
        hashMap.put(A07(227, 3, 119), 32);
        hashMap.put(A07(230, 3, 0), 128);
        hashMap.put(A07(233, 3, 93), 512);
        hashMap.put(A07(Opcodes.ANEWARRAY, 4, 8), 2048);
        hashMap.put(A07(Opcodes.INSTANCEOF, 4, 124), 8192);
        hashMap.put(A07(Opcodes.MULTIANEWARRAY, 4, 100), 32768);
        hashMap.put(A07(201, 4, 123), 131072);
        hashMap.put(A07(205, 4, 44), 524288);
        hashMap.put(A07(209, 4, 11), 2097152);
        hashMap.put(A07(213, 4, 15), 8388608);
        hashMap.put(A07(217, 4, 93), 33554432);
    }

    public static int A01(int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 8:
                break;
            case 16:
                break;
            case 32:
                break;
            case 64:
                break;
            case 128:
                break;
            case 256:
                break;
            case 512:
                break;
            case 1024:
                break;
            case 2048:
                break;
            case 4096:
                break;
            case 8192:
                break;
            case 16384:
                break;
            case 32768:
                break;
            case 65536:
                break;
        }
        return 25344;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r6.equals(A07(953, 4, 25)) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> A02(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(A07(897, 2, 85));
        char c = 0;
        String str2 = split[0];
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals(A07(936, 4, 25))) {
                    c = 2;
                    switch (c) {
                        case 0:
                        case 1:
                            return A04(str, split);
                        case 2:
                        case 3:
                            return A03(str, split);
                        default:
                            return null;
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 3006244:
                if (str2.equals(A07(940, 4, 116))) {
                    c = 3;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 3199032:
                break;
            case 3214780:
                String[] parts = A02;
                if (parts[4].charAt(9) != 'O') {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[2] = "MmTCu4eMbW5HStPFtCsv7ZFMn3CvoIap";
                strArr[6] = "LZKP0I4cIbW5T2P3pagUWnAfz2n8Y4ic";
                if (str2.equals(A07(957, 4, 34))) {
                    c = 1;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            default:
                c = 65535;
                switch (c) {
                }
        }
    }

    public static Pair<Integer, Integer> A03(String str, String[] strArr) {
        Integer valueOf;
        Integer valueOf2;
        int length = strArr.length;
        String A072 = A07(238, 37, 54);
        String A073 = A07(TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 38);
        if (length < 2) {
            Log.w(A073, A072 + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf2 = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                Log.w(A073, A072 + str);
                return null;
            }
            int i = A04.get(valueOf.intValue(), -1);
            if (i == -1) {
                Log.w(A073, A07(814, 21, 106) + valueOf);
                return null;
            }
            int i2 = A03.get(valueOf2.intValue(), -1);
            if (i2 == -1) {
                Log.w(A073, A07(795, 19, 39) + valueOf2);
                return null;
            }
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        } catch (NumberFormatException unused) {
            Log.w(A073, A072 + str);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        android.util.Log.w(r4, A07(835, 27, 74) + r3.group(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f4, code lost:
    
        return new android.util.Pair<>(java.lang.Integer.valueOf(r7), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d7, code lost:
    
        if (r6 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> A04(String str, String[] strArr) {
        int i;
        Integer level;
        int length = strArr.length;
        String A072 = A07(275, 38, 56);
        String A073 = A07(TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 38);
        if (length < 4) {
            Log.w(A073, A072 + str);
            return null;
        }
        Pattern pattern = A08;
        String str2 = strArr[1];
        if (A02[7].length() != 9) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "2f";
        strArr2[0] = "5sj";
        Matcher matcher = pattern.matcher(str2);
        if (!matcher.matches()) {
            Log.w(A073, A072 + str);
            return null;
        }
        String group = matcher.group(1);
        if (A07(53, 1, 97).equals(group)) {
            i = 1;
        } else if (A07(54, 1, 69).equals(group)) {
            i = 2;
        } else {
            Log.w(A073, A07(862, 29, 112) + group);
            return null;
        }
        Integer level2 = A07.get(strArr[3]);
        if (A02[5].length() != 17) {
            String[] strArr3 = A02;
            strArr3[2] = "NDllh4Gk9AYylWORiKA9sy5i8NPghk70";
            strArr3[6] = "TYaXTXlX2Wnboxk1WLU2nbrnETYd3GkV";
            level = level2;
        } else {
            A02[4] = "pDNfPE2mBOJDzsLiT7ZaRh6hSLEh4IuG";
            level = level2;
        }
    }

    public static C0435Cy A05() {
        return A05;
    }

    public static C0435Cy A06(String str, boolean z) throws D7 {
        List<C0435Cy> A09 = A09(str, z);
        if (A09.isEmpty()) {
            return null;
        }
        return A09.get(0);
    }

    public static synchronized List<C0435Cy> A09(String str, boolean z) throws D7 {
        synchronized (D9.class) {
            D6 d6 = new D6(str, z);
            HashMap<D6, List<C0435Cy>> hashMap = A06;
            List<C0435Cy> list = hashMap.get(d6);
            if (list != null) {
                return list;
            }
            D8 c0914Vz = C0557Hx.A02 >= 21 ? new C0914Vz(z) : new W0();
            ArrayList<C0435Cy> A082 = A08(d6, c0914Vz, str);
            if (z && A082.isEmpty() && 21 <= C0557Hx.A02 && C0557Hx.A02 <= 23) {
                c0914Vz = new W0();
                A082 = A08(d6, c0914Vz, str);
                if (!A082.isEmpty()) {
                    Log.w(A07(TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 38), A07(374, 51, 80) + str + A07(34, 12, 9) + A082.get(0).A02);
                }
            }
            if (A07(922, 14, 50).equals(str)) {
                A082.addAll(A08(new D6(A07(912, 10, 75), d6.A01), c0914Vz, str));
            }
            A0B(A082);
            List<C0435Cy> unmodifiableList = Collections.unmodifiableList(A082);
            hashMap.put(d6, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static void A0B(List<C0435Cy> list) {
        if (C0557Hx.A02 < 26 && list.size() > 1) {
            if (A07(583, 25, 111).equals(list.get(0).A02)) {
                for (int i = 1; i < list.size(); i++) {
                    C0435Cy c0435Cy = list.get(i);
                    if (A07(657, 22, 61).equals(c0435Cy.A02)) {
                        list.remove(i);
                        list.add(0, c0435Cy);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02d6, code lost:
    
        if (A07(80, 5, 36).equals(r3) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0327, code lost:
    
        if (r3 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0337, code lost:
    
        if (A07(457, 22, 74).equals(r8) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0339, code lost:
    
        r3 = com.facebook.ads.redexgen.X.C0557Hx.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0346, code lost:
    
        if (com.facebook.ads.redexgen.X.D9.A02[1].length() == 25) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x034c, code lost:
    
        if (r6.equals(r3) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x035e, code lost:
    
        if (com.facebook.ads.redexgen.X.C0557Hx.A03.startsWith(A07(1042, 8, 121)) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x036f, code lost:
    
        if (com.facebook.ads.redexgen.X.C0557Hx.A03.startsWith(A07(1050, 7, 27)) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0380, code lost:
    
        if (com.facebook.ads.redexgen.X.C0557Hx.A03.startsWith(A07(1036, 6, 27)) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0391, code lost:
    
        if (A07(763, 6, 32).equals(com.facebook.ads.redexgen.X.C0557Hx.A03) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03a3, code lost:
    
        if (A07(966, 12, 30).equals(com.facebook.ads.redexgen.X.C0557Hx.A03) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03b4, code lost:
    
        if (A07(55, 5, 125).equals(com.facebook.ads.redexgen.X.C0557Hx.A03) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03c5, code lost:
    
        if (A07(757, 6, 127).equals(com.facebook.ads.redexgen.X.C0557Hx.A03) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03d6, code lost:
    
        if (A07(769, 5, 113).equals(com.facebook.ads.redexgen.X.C0557Hx.A03) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03d8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03d9, code lost:
    
        com.facebook.ads.redexgen.X.D9.A02[7] = "xnGQuYocR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03e4, code lost:
    
        if (r6.equals(r3) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03ef, code lost:
    
        if (r3 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0424, code lost:
    
        if (r6.equals(r3) != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0435, code lost:
    
        if (com.facebook.ads.redexgen.X.C0557Hx.A03.startsWith(A07(944, 2, 120)) != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0446, code lost:
    
        if (com.facebook.ads.redexgen.X.C0557Hx.A03.startsWith(A07(997, 7, 26)) != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x044e, code lost:
    
        if (com.facebook.ads.redexgen.X.C0557Hx.A03.startsWith(r4) != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x045e, code lost:
    
        if (com.facebook.ads.redexgen.X.C0557Hx.A03.startsWith(A07(991, 6, 3)) != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x046f, code lost:
    
        if (com.facebook.ads.redexgen.X.C0557Hx.A03.startsWith(A07(androidx.core.view.PointerIconCompat.TYPE_WAIT, 2, 28)) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0471, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x047d, code lost:
    
        if (r6.equals(r3) != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (A07(123, 15, 35).equals(r8) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        if (A07(60, 10, 95).equals(r8) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (A07(364, 10, 102).equals(r8) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bc, code lost:
    
        if (A07(123, 15, 35).equals(r8) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
    
        if (r3.equals(r8) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010d, code lost:
    
        if (A07(909, 3, 112).equals(com.facebook.ads.redexgen.X.C0557Hx.A03) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010f, code lost:
    
        r3 = A07(891, 6, 52).equals(com.facebook.ads.redexgen.X.C0557Hx.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0129, code lost:
    
        if (com.facebook.ads.redexgen.X.D9.A02[7].length() == 9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0130, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013f, code lost:
    
        com.facebook.ads.redexgen.X.D9.A02[1] = "ikTWzPZnBqNKNF5U8hE3rEiIh";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0146, code lost:
    
        if (r3 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0157, code lost:
    
        if (com.facebook.ads.redexgen.X.C0557Hx.A03.startsWith(A07(236, 2, 94)) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0159, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013c, code lost:
    
        if (r3.equals(r8) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x023a, code lost:
    
        if (A07(774, 6, 120).equals(com.facebook.ads.redexgen.X.C0557Hx.A03) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02b0, code lost:
    
        if (A07(80, 3, 3).equals(r3) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02c1, code lost:
    
        if (A07(85, 5, 49).equals(com.facebook.ads.redexgen.X.C0557Hx.A03) == false) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0C(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(A07(46, 7, 0)))) {
            return false;
        }
        if (C0557Hx.A02 < 21) {
            if (A02[7].length() == 9) {
                A02[7] = "hakUGYeRw";
                if (!A07(110, 13, 19).equals(str) && !A07(Opcodes.L2D, 13, 123).equals(str) && !A07(Opcodes.DCMPL, 16, 44).equals(str)) {
                    if (A02[4].charAt(9) == 'O') {
                        String[] strArr = A02;
                        strArr[2] = "EEwaDdP6hCUFsSlrf0IgL40CqnGWtmyD";
                        strArr[6] = "0sHU723LRgirr3xWcDqxLM5fqrJixtiS";
                    }
                }
                return false;
            }
            throw new RuntimeException();
        }
        if (C0557Hx.A02 < 18 && A07(TypedValues.MotionType.TYPE_DRAW_PATH, 19, 30).equals(str)) {
            return false;
        }
        if (C0557Hx.A02 < 18) {
            String A072 = A07(530, 25, 14);
            if (A02[5].length() != 17) {
                A02[1] = "I2XnTXPHshEGYaXC6U4zicLut";
            } else {
                A02[1] = "WA2DMfsAb4qPRbwhTckvxt3Oj";
            }
            throw new RuntimeException();
        }
        if (C0557Hx.A02 == 16 && A07(TypedValues.TransitionType.TYPE_INTERPOLATOR, 26, 82).equals(str)) {
            if (!A07(946, 4, 51).equals(C0557Hx.A03)) {
                if (!A07(978, 6, 47).equals(C0557Hx.A03)) {
                    if (!A07(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 5, 72).equals(C0557Hx.A03)) {
                        if (!A07(1027, 9, 82).equals(C0557Hx.A03)) {
                            if (!A07(PointerIconCompat.TYPE_GRAB, 7, 71).equals(C0557Hx.A03) && !C0557Hx.A03.startsWith(A07(950, 3, 86))) {
                                if (!A07(90, 5, 7).equals(C0557Hx.A03)) {
                                    if (!A07(95, 5, 15).equals(C0557Hx.A03)) {
                                        if (!A07(100, 5, 67).equals(C0557Hx.A03)) {
                                            if (!A07(105, 5, 8).equals(C0557Hx.A03)) {
                                                if (!A07(348, 4, 51).equals(C0557Hx.A03)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        int i = C0557Hx.A02;
        if (A02[1].length() == 25) {
            A02[7] = "tnRGvETTi";
            if (i == 16 && A07(679, 26, 79).equals(str)) {
                if (!A07(70, 5, 51).equals(C0557Hx.A03)) {
                    if (!A07(75, 5, 90).equals(C0557Hx.A03)) {
                        String str3 = C0557Hx.A03;
                        if (A02[5].length() != 17) {
                            String[] strArr2 = A02;
                            strArr2[3] = "Sr";
                            strArr2[0] = "zUD";
                        } else {
                            A02[1] = "DeHWw2fWCjgMmVyUN9OyqRVSX";
                        }
                    }
                }
                return false;
            }
            int i2 = C0557Hx.A02;
            if (A02[4].charAt(9) == 'O') {
                String[] strArr3 = A02;
                strArr3[3] = "Ia";
                strArr3[0] = "P3O";
                String A073 = A07(984, 7, 12);
                if (i2 < 24) {
                    boolean equals = A07(627, 15, 53).equals(str);
                    if (A02[1].length() != 25) {
                        A02[7] = "KiHLQPnXR";
                    } else {
                        A02[1] = "37Lb1d6thx8YO69UbmwcSx6lm";
                    }
                }
                int i3 = C0557Hx.A02;
                String A074 = A07(961, 5, 58);
                if (i3 <= 19 && A07(642, 15, 6).equals(str)) {
                    String str4 = C0557Hx.A05;
                    if (A02[1].length() == 25) {
                        A02[5] = "blvbufqIPxoQJr0fY";
                    }
                }
                if (C0557Hx.A02 <= 19 && C0557Hx.A03.startsWith(A074) && A07(731, 26, 92).equals(str)) {
                    return false;
                }
                return (A07(922, 14, 50).equals(str2) && A07(555, 28, 76).equals(str)) ? false : true;
            }
        }
        throw new RuntimeException();
    }

    public static boolean A0D(String str) {
        if (C0557Hx.A02 <= 22) {
            if ((A07(447, 10, 116).equals(C0557Hx.A06) || A07(439, 8, 11).equals(C0557Hx.A06)) && (A07(479, 22, 69).equals(str) || A07(501, 29, 80).equals(str))) {
                return true;
            }
        }
        return false;
    }
}
