package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.DeflaterOutputStream;
import kotlin.io.encoding.Base64;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0946Xf implements C8R {
    public static PackageInfo A03;
    public static EnumC0623Ko A04;
    public static String A05;
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"rjWu3o3XUIKJimpXtRLH", "N3hUjd9gC1zTrolrzHWDwio6K0KaeF7v", "V8BOZxTrBek9nlJry76rEN1tEiA1lgnf", "2kaCuDD1e44XjFqxj97oS3bW7Y4jUXps", "VcJxC1jbHxk7XwGyeCWvHwY9E4qRcx1x", "dO6RHNbAuKw0kDbwpnJR", "8jPNINbp0cYAxxIn", "ugIdyp1aSJPFHYCiUHctz2XPYC5YD6Ud"};
    public static final C0U[] A09;
    public static final AtomicBoolean A0A;
    public static final AtomicInteger A0B;
    public final C6G A00;
    public final C7S A01;
    public final AnonymousClass87 A02;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A08[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "AJGqtkftO03LFXDJsHlFXR4ujVWNfKsn";
            strArr[7] = "0weTThgY8dzMPuXGgH30KJvXs1017h9U";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A08() {
        A07 = new byte[]{40, Ascii.CR, Ascii.NAK, Ascii.ETB, Ascii.ETB, 17, 7, 7, Ascii.GS, Ascii.SYN, Ascii.GS, Ascii.CAN, Ascii.GS, 0, Ascii.CR, Ascii.VT, 17, Ascii.SUB, Ascii.NAK, Ascii.SYN, Ascii.CAN, 17, 16, 41, 46, 56, 45, 42, 60, 87, 98, 109, 98, 111, 108, 100, 85, 68, 68, 75, 89, 93, 90, 75, 71, 80, 95, 75, 66, 81, 70, 71, 93, 91, 90, 78, 92, 71, 78, 92, 44, 62, 36, 41, 86, 67, 67, 69, 94, 85, 66, 67, 94, 88, 89, 72, 94, 83, 106, 97, 108, 108, 109, 122, 119, 124, 103, 99, 109, 102, 119, 109, 112, 124, 122, 105, 123, 62, 41, 50, 56, 48, 57, 79, 77, 92, 92, 73, 72, 83, 69, 72, 95, Ascii.NAK, Ascii.ETB, 4, 4, Ascii.US, 19, 4, 67, 70, 83, 70, 88, 87, 85, 72, 68, 66, 84, 84, 78, 73, 64, 88, 72, 87, 83, 78, 72, 73, 84, 92, 89, 76, 89, 71, 72, 74, 87, 91, 93, 75, 75, 81, 86, 95, 71, 87, 72, 76, 81, 87, 86, 75, 71, 91, 87, 77, 86, 76, 74, 65, 111, 106, Byte.MAX_VALUE, 106, 116, 123, 121, 100, 104, 110, 120, 120, 98, 101, 108, 116, 100, 123, Byte.MAX_VALUE, 98, 100, 101, 120, 116, 120, Byte.MAX_VALUE, 106, Byte.MAX_VALUE, 110, Ascii.FS, Ascii.GS, Ascii.SYN, Ascii.VT, 17, Ascii.FF, 1, Ascii.CR, Ascii.RS, 5, 5, Ascii.SO, 7, Ascii.DC4, 8, 4, Ascii.EM, Ascii.SO, Ascii.DC4, Ascii.SO, Ascii.GS, Ascii.SO, 5, Ascii.US, Ascii.CAN, 48, 35, 56, 56, 51, 58, 41, 58, 57, 49, 49, 51, 50, Ascii.RS, 57, 49, 52, Base64.padSymbol, 60, 120, 44, 55, 120, 58, 45, 49, 52, 60, 120, 45, 43, Base64.padSymbol, 42, 120, 44, 55, 51, Base64.padSymbol, 54, 95, 86, 68, 72, 82, 79, 88, 71, 91, 86, 78, 82, 69, 52, 57, 59, 60, 48, Base64.padSymbol, 38, 58, 56, 58, 49, 60, 38, 45, 42, 38, 52, 42, 37, 40, 51, 63, 35, 57, 62, 47, 41, 47, 40, 53, 50, 39, 42, 42, 35, 52, 75, 72, 68, 70, 75, 66, 109, 97, 107, 101, 5, Ascii.CR, Ascii.FF, 1, 9, Ascii.FS, 1, 7, 6, Ascii.ETB, Ascii.ESC, Ascii.CR, Ascii.SUB, Ascii.RS, 1, Ascii.VT, Ascii.CR, 72, 67, 82, 81, 73, 84, 77, 89, 82, 95, 86, 67, 64, 76, 90, 67, 90, 92, 80, 90, 92, 74, 93, 80, 70, 75, Ascii.SI, Ascii.DC2, Ascii.DC2, 9, Ascii.CAN, Ascii.EM, 96, 102, 116, 109, 116, 112, 109, 115, 98, 98, 109, 123, 124, 97, 102, 115, 126, 126, 119, 118, 96, 102, 116, 109, 116, 112, 109, 115, 98, 98, 109, 100, 119, 96, 97, 123, 125, 124, 63, 47, 62, 41, 41, 34, 51, 36, 41, 37, 43, 36, 56, Byte.MAX_VALUE, 111, 126, 105, 105, 98, 115, 123, 101, 104, 120, 100, 53, 34, 45, 57, 37, 39, 54, 39, 36, 47, 42, 47, 50, 63, Ascii.FS, 10, Ascii.FS, Ascii.FS, 6, 0, 1, 16, Ascii.ESC, 6, 2, 10, 70, 93, 90, 71, 74, 34, 36, 50, 37, 40, 54, 48, 50, 57, 35, 66, 85, 88, 68, 85, 70, 85, 89, 71, Byte.MAX_VALUE, 125, 118, 125, 106, 113, 123, 53, 46, 55, 55};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final String A0B(C8P c8p) {
        A09(this.A01, true);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map<String, String> A0C = A0C();
                if (TextUtils.isEmpty(AnonymousClass62.A00().A03())) {
                    AnonymousClass62.A07(this.A01);
                }
                A0C.put(A03(280, 4, 52), AnonymousClass62.A00().A03());
                A0C.put(A03(469, 10, 62), C8W.A06(this.A02, this.A01, false));
                if (IP.A1Z(this.A01)) {
                    A0C.put(A03(103, 10, 69), C01500v.A01(this.A01).A0K());
                }
                Iterator<Map.Entry<String, String>> it = A0C.entrySet().iterator();
                while (it.hasNext()) {
                    if (!c8p.A2V(it.next().getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(A0C).toString().getBytes());
                deflaterOutputStream.close();
                String replaceAll = byteArrayOutputStream.toString().replaceAll(A03(0, 1, 107), A03(0, 0, 37));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return replaceAll;
            } catch (Throwable th) {
                if (deflaterOutputStream != null) {
                    try {
                        deflaterOutputStream.close();
                    } catch (IOException unused2) {
                        throw th;
                    }
                }
                if (base64OutputStream != null) {
                    base64OutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th;
            }
        } catch (IOException e) {
            throw new RuntimeException(A03(241, 26, 17), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x01b8, code lost:
    
        if (r4 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x01ba, code lost:
    
        r5.put(A03(55, 5, 70), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x01c6, code lost:
    
        r5.put(A03(464, 5, 90), java.lang.String.valueOf(com.facebook.ads.redexgen.X.C0628Kv.A05(r9.A01)));
        r4 = r9.A01.A04().A7I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01e6, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x01e8, code lost:
    
        r5.put(A03(326, 17, 1), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01f4, code lost:
    
        r5.put(A03(2, 21, 29), java.lang.String.valueOf(r9.A02.A0C()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0211, code lost:
    
        if (r9.A02.A03() == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0213, code lost:
    
        r5.put(A03(36, 19, 93), java.lang.String.valueOf(r9.A02.A03()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x022a, code lost:
    
        r5.put(A03(479, 9, 93), com.facebook.ads.redexgen.X.C8M.A05(r9.A01));
        r5.put(A03(30, 6, 106), com.facebook.ads.redexgen.X.L0.A01(com.facebook.ads.redexgen.X.AnonymousClass86.A02()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0257, code lost:
    
        if (com.facebook.ads.redexgen.X.IO.A05(r9.A01) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0259, code lost:
    
        r4 = r9.A01.A04().A6x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0263, code lost:
    
        if (r4 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0265, code lost:
    
        r5.put(A03(60, 4, 36), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0271, code lost:
    
        r4 = r9.A01.A04().A7N();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x027f, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0281, code lost:
    
        r5.put(A03(355, 14, 70), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x028e, code lost:
    
        r8 = r9.A01.A06().A6c();
        r6 = A03(org.objectweb.asm.Opcodes.FRETURN, 29, 98);
        r7 = A03(org.objectweb.asm.Opcodes.D2L, 31, 81);
        r4 = A03(120, 23, 78);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x02b6, code lost:
    
        if (r8 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02b8, code lost:
    
        r5.put(r4, r8.A08());
        r5.put(r7, java.lang.String.valueOf(r8.A05()));
        r5.put(r6, java.lang.String.valueOf(r8.A06()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02d5, code lost:
    
        r5.put(A03(103, 10, 69), com.facebook.ads.redexgen.X.C01500v.A01(r9.A01).A0K());
        r4 = r9.A00.A03(r9.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02f4, code lost:
    
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02fa, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x02fc, code lost:
    
        r5.put(A03(78, 19, 97), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0309, code lost:
    
        r5.put(A03(267, 13, 94), java.lang.String.valueOf(r9.A01.A03().A8O()));
        r5.put(A03(228, 13, 63), java.lang.String.valueOf(com.facebook.ads.redexgen.X.C03147r.A0H(r9.A01)));
        r4 = new java.lang.StringBuilder();
        r7 = com.facebook.ads.redexgen.X.C0946Xf.A09;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0345, code lost:
    
        if (r6 >= r7.length) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0347, code lost:
    
        r4.append(r7[r6].A02() + 4000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0354, code lost:
    
        if (r6 == (r7.length - 1)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0356, code lost:
    
        r4.append(A03(1, 1, 104));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0361, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0388, code lost:
    
        r5.put(A03(210, 18, 2), r4.toString());
        r4 = A00(r9.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x039e, code lost:
    
        if (r4 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x03a0, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03a1, code lost:
    
        r5.put(A03(375, 20, 123), java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03b2, code lost:
    
        if (r4 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x03b4, code lost:
    
        r5.put(A03(395, 18, 123), java.lang.String.valueOf(r4.versionCode));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x03c7, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0364, code lost:
    
        r0 = A03(495, 4, 18);
        r5.put(r4, r0);
        r5.put(r7, r0);
        r5.put(r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0384, code lost:
    
        if (r4 != null) goto L12;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, String> A0C() {
        boolean z = false;
        A09(this.A01, false);
        AnonymousClass86.A0B(this.A01);
        AnonymousClass86.A08(this.A01);
        HashMap hashMap = new HashMap();
        C8O.A02(this.A01, hashMap);
        hashMap.put(A03(TypedValues.AttributesType.TYPE_PATH_ROTATE, 6, 78), Locale.getDefault().toString());
        float f = C0627Ku.A02;
        int i = this.A01.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.A01.getResources().getDisplayMetrics().heightPixels;
        hashMap.put(A03(203, 7, 17), String.valueOf(f));
        hashMap.put(A03(426, 12, 101), String.valueOf((int) (i / f)));
        hashMap.put(A03(TTAdConstant.VIDEO_INFO_CODE, 13, 37), String.valueOf((int) (i2 / f)));
        hashMap.put(A03(64, 14, 94), AnonymousClass62.A03());
        hashMap.put(A03(298, 9, 37), AnonymousClass62.A00().A02().name());
        hashMap.put(A03(284, 14, 48), String.valueOf(AnonymousClass62.A00().A01()));
        hashMap.put(A03(97, 6, 53), C8W.A03(this.A01, this.A02));
        hashMap.put(A03(113, 7, 31), this.A02.A08());
        hashMap.put(A03(322, 4, 105), this.A02.A09());
        hashMap.put(A03(369, 6, 20), String.valueOf(A01(this.A01).A00));
        hashMap.put(A03(307, 9, 47), this.A02.A0B());
        hashMap.put(A03(438, 14, 47), EnumC0615Kg.A01());
        hashMap.put(A03(343, 12, 79), String.valueOf(LK.A00(this.A01).A00));
        hashMap.put(A03(452, 12, 6), LM.A02(this.A01.A08().A01()));
        String str = A05;
        if (str != null) {
            String A032 = A03(23, 3, 33);
            String[] strArr = A08;
            if (strArr[1].charAt(17) != strArr[7].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[1] = "AqiFfSJaVcvWeekshHh0ldvtL31lvyuj";
            strArr2[7] = "9HeqxNTbWRKyR8KfBHSSaEFZWfPVqzw4";
            hashMap.put(A032, str);
        }
        String A02 = C0624Kp.A02(this.A01);
        String[] strArr3 = A08;
        if (strArr3[0].length() == strArr3[5].length()) {
            String[] strArr4 = A08;
            strArr4[1] = "BCkwQrwTZAh8DbNWYHcyNfiOEn9j0AAp";
            strArr4[7] = "Pk3Ope4wXmj489nPkHNYEkNTYlpVjL8G";
        }
    }

    static {
        A08();
        A0A = new AtomicBoolean();
        A0B = new AtomicInteger(0);
        A05 = null;
        A06 = false;
        A09 = new C0U[]{C0U.A16, C0U.A0k, C0U.A17, C0U.A1F, C0U.A11, C0U.A13, C0U.A23, C0U.A24, C0U.A25};
    }

    public C0946Xf(C7S c7s, boolean z, C6G c6g) {
        this.A01 = c7s;
        this.A02 = new AnonymousClass87(c7s);
        this.A00 = c6g;
        A09(c7s, z);
    }

    public static synchronized PackageInfo A00(C7S c7s) {
        PackageInfo packageInfo;
        synchronized (C0946Xf.class) {
            if (!A06) {
                A03 = L3.A00(c7s);
                A06 = true;
            }
            packageInfo = A03;
        }
        return packageInfo;
    }

    public static synchronized EnumC0623Ko A01(C7S c7s) {
        EnumC0623Ko enumC0623Ko;
        synchronized (C0946Xf.class) {
            if (A04 == null) {
                A04 = C0624Kp.A00(c7s.A04().A8o());
            }
            enumC0623Ko = A04;
        }
        return enumC0623Ko;
    }

    public static String A04(C7S c7s, String str) {
        try {
            PackageManager packageManager = c7s.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return C0630Kx.A03(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e) {
            if (A0A.compareAndSet(false, true)) {
                c7s.A07().A9M(A03(488, 7, 81), C03207x.A1P, new C03217y(e));
            }
            return null;
        }
    }

    public static void A09(final C7S c7s, boolean z) {
        if (!A0B.compareAndSet(0, 1)) {
            return;
        }
        A01(c7s);
        try {
            final SharedPreferences A00 = C0602Jt.A00(c7s);
            final AnonymousClass87 anonymousClass87 = new AnonymousClass87(c7s);
            final String str = A03(26, 4, 37) + anonymousClass87.A06();
            A05 = A00.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.8T
                public static byte[] A04;
                public static String[] A05 = {"XdxsWQHKmAYrPa6mv803llFsbG6xUBv1", "0ZMGl2pSIAaZIEqvxPmnMQII5PMyDfzp", "xK6bN8ERsE3qlK", "WJOztIfqKvqLg1zb8DcclROO5I1m6hYl", "NZ35AS4Ok4U2uFg9Bn0RAVLmEZFAhNaA", "i6NGDYiwjEbiTB59W8H8ewYatIcL2Rm5", "tt3j", "3tQ5yRyF2hXRO3n7qZm1zDaXW"};

                public static String A01(int i, int i2, int i3) {
                    byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
                    int i4 = 0;
                    while (true) {
                        int length = copyOfRange.length;
                        if (A05[2].length() != 14) {
                            throw new RuntimeException();
                        }
                        A05[0] = "ijq86j9eF5Bfako4vk0V9m1lrfYXSgO1";
                        if (i4 >= length) {
                            return new String(copyOfRange);
                        }
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 105);
                        i4++;
                    }
                }

                public static void A02() {
                    A04 = new byte[]{124, 125, 115, 110, 125, 109, 106, 102, 100, 39, 104, 103, 109, 123, 102, 96, 109, 39, Byte.MAX_VALUE, 108, 103, 109, 96, 103, 110, 120, 104, 122, 107, 114, 78, 94, 65, 74, 78, 111, 109, 102, 109, 122, 97, 107};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
                
                    if (r1.equals(r0) != false) goto L6;
                 */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Boolean call() throws Exception {
                    String A042;
                    String checksumApiFingerprint;
                    AtomicInteger atomicInteger;
                    String checksumApiFingerprint2;
                    String str2 = null;
                    if (Build.VERSION.SDK_INT < 31) {
                        String A01 = A01(0, 1, 70);
                        String checksumApiFingerprint3 = Build.VERSION.CODENAME;
                    }
                    if (IP.A2C(C7S.this)) {
                        String A0B2 = anonymousClass87.A0B();
                        String checksumApiFingerprint4 = A01(6, 19, 96);
                        if (checksumApiFingerprint4.equals(A0B2)) {
                            str2 = C0630Kx.A01(C7S.this);
                        }
                    }
                    if (str2 == null) {
                        C7S c7s2 = C7S.this;
                        String checksumApiFingerprint5 = c7s2.getPackageName();
                        checksumApiFingerprint2 = C0946Xf.A04(c7s2, checksumApiFingerprint5);
                        String unused = C0946Xf.A05 = checksumApiFingerprint2;
                    } else {
                        if (IP.A1K(C7S.this)) {
                            C7S c7s3 = C7S.this;
                            String checksumApiFingerprint6 = c7s3.getPackageName();
                            A042 = C0946Xf.A04(c7s3, checksumApiFingerprint6);
                            String checksumApiFingerprint7 = A01(1, 5, 119);
                            C03217y c03217y = new C03217y(checksumApiFingerprint7);
                            c03217y.A03(1);
                            c03217y.A04(1);
                            c03217y.A08(false);
                            JSONObject jSONObject = new JSONObject();
                            String checksumApiFingerprint8 = A01(25, 5, 114);
                            jSONObject.put(checksumApiFingerprint8, str2);
                            String checksumApiFingerprint9 = A01(30, 5, 68);
                            jSONObject.put(checksumApiFingerprint9, A042);
                            c03217y.A05(jSONObject);
                            InterfaceC03197w A072 = C7S.this.A07();
                            int i = C03207x.A1I;
                            String checksumApiFingerprint10 = A01(35, 7, 97);
                            A072.A9N(checksumApiFingerprint10, i, c03217y);
                        }
                        String unused2 = C0946Xf.A05 = str2;
                    }
                    SharedPreferences.Editor edit = A00.edit();
                    String str3 = str;
                    checksumApiFingerprint = C0946Xf.A05;
                    edit.putString(str3, checksumApiFingerprint).apply();
                    atomicInteger = C0946Xf.A0B;
                    atomicInteger.set(2);
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A0B.set(0);
        }
    }

    public final String A0A() {
        return A0B(C8Q.A00());
    }
}
