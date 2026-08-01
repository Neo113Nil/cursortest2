package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.google.android.material.internal.ViewUtils;
import com.google.common.base.Ascii;
import dalvik.system.InMemoryDexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01741t {
    public static byte[] A00;
    public static final AtomicBoolean A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{69, Ascii.CAN, 2, Ascii.FF, 5, 124, 103, 38, 32, 124, 5, 99, Ascii.DC2, 120, 7, Ascii.RS, 57, 10, Ascii.RS, Base64.padSymbol, 37, 16, 33, Ascii.EM, 42, 5, 125, 38, 123, 50, 57, Ascii.GS, 35, 5, 37, 59, 5, 123, Ascii.US, Byte.MAX_VALUE, 10, 5, 38, Byte.MAX_VALUE, Ascii.EM, 103, 43, Ascii.CR, 117, Byte.MAX_VALUE, 104, 116, 113, 121, 72, 111, 119, 96, 109, 104, 101, 33, 98, 100, 115, 117, 59, 33, Ascii.DC2, 53, 45, 58, 55, 50, 63, 123, 40, 50, 60, 53, 52, 48, 48, 59, 48, 19, 56, 55, 59, Ascii.RS, Ascii.DC2, 8, 17, Ascii.DC2, 16, 62, 64, Ascii.SO, 73, 59, 56, 40, 60, 63, 56, 56, 54, 58, 56, 40, 65, 56, 52, 48, 48, 59, 58, Ascii.RS, 50, 58, 56, 40, 60, 56, 10, 33, 19, 72, 35, 64, 49, Base64.padSymbol, 54, 3, Ascii.CR, 10, 43, 16, Ascii.DC4, 33, 55, 43, 63, 17, 115, 63, 50, Ascii.GS, Ascii.ESC, 76, 78, 9, 33, 50, Ascii.VT, 76, 55, Ascii.ETB, 42, 49, 3, Ascii.VT, 44, 45, 19, 0, Ascii.DC4, 63, Ascii.ESC, 72, 55, 47, Ascii.DC4, Ascii.CR, Ascii.ESC, Ascii.GS, Ascii.FS, 60, Ascii.DC4, 76, 55, Ascii.SYN, 43, 72, Ascii.SYN, 17, 9, 40, 32, 51, Ascii.DC2, 73, 41, 50, 53, Ascii.SI, 17, 8, 56, 1, Ascii.FS, Ascii.FS, Ascii.FS, 86, Ascii.ESC, 82, 10, 58, Ascii.SYN, 115, 79, 19, 55, 17, 56, 56, 47, 1, 86, 56, 43, 41, 65, 40, Ascii.DC4, Ascii.GS, Ascii.GS, Ascii.ESC, 9, 46, Ascii.US, 51, 56, Ascii.SUB, Ascii.DC4, 60, 47, 40, 64, 19, 64, 62, Ascii.NAK, 16, 76, Ascii.ETB, Ascii.GS, 62, Ascii.CR, 59, 40, 35, 55, 76, 51, 35, 82, 79, Ascii.US, 59, 54, 65, 16, 8, 52, Ascii.DC2, 40, Ascii.SUB, 43, 73, Ascii.DC4, 1, 75, 53, 115, 33, 77, Ascii.SYN, 51, 45, 53, Ascii.CAN, 10, 43, 74, 42, Ascii.NAK, 46, Ascii.SI, 73, Ascii.CAN, 44, 63, 72, 52, Ascii.DC4, Base64.padSymbol, Ascii.ESC, Ascii.SYN, 41, Ascii.ESC, 17, 48, 64, 74, 43, 86, Ascii.DC2, 59, 42, 10, 62, Ascii.DC2, 44, 19, 47, 52, 75, 32, Ascii.ESC, Ascii.US, 77, 47, 52, Ascii.FF, Ascii.GS, 53, Ascii.CR, 51, Ascii.FF, 78, 60, 86, 32, Ascii.SI, 1, 19, 76, 47, 115, Ascii.SUB, Ascii.VT, 73, 46, Ascii.VT, 65, Ascii.US, Ascii.DC2, Ascii.FF, Ascii.FF, 43, Ascii.CR, Ascii.NAK, Ascii.FF, Ascii.CAN, 43, 86, 40, 79, Ascii.RS, 8, Ascii.FS, 16, 55, 10, Ascii.ETB, Ascii.VT, 58, 48, 60, 77, 77, 33, 33, 82, Base64.padSymbol, 75, 78, 64, 9, 43, 33, 17, 58, 33, 72, Ascii.VT, Ascii.RS, 54, 48, Ascii.SYN, 56, Ascii.DC4, 9, 35, 0, Ascii.CAN, 3, Ascii.RS, 55, Base64.padSymbol, Ascii.SI, Ascii.SUB, 43, 115, 19, 73, 45, Ascii.CR, Ascii.SUB, Ascii.FS, Ascii.DC4, 79, 41, Base64.padSymbol, 17, 40, 16, 78, 45, 32, 1, 65, 35, 44, Ascii.DC2, 77, 73, 76, 82, Ascii.US, 8, Base64.padSymbol, 48, 17, 60, 3, 51, 10, 64, 53, 43, 73, 44, 44, Ascii.VT, 64, Ascii.SUB, Ascii.RS, Ascii.DC4, 16, 8, 74, 56, Ascii.DC2, 45, 53, 78, Ascii.FS, Ascii.DC2, Ascii.FS, Ascii.SI, 44, 50, 41, 35, Base64.padSymbol, 55, Ascii.GS, 115, 64, 40, 48, Base64.padSymbol, 56, 40, 56, 59, 115, 80, 115, 123, 63, 94, 79, 86, 37, 63, 117, 116, 102, 124, 103, 110, Ascii.GS, Ascii.SUB, Ascii.EM, 63, 36, 45, 94, 89, 90, Ascii.ESC, 5, Ascii.CAN, 4, 62, 63, 45, 69, 126, 99, 101, 96, 96, Byte.MAX_VALUE, 98, 100, 117, 116, 48, 121, 126, 99, 100, 113, 124, 124, 117, 98, 71, 124, 97, 103, 98, 98, 125, 96, 102, 119, 118, 50, 100, 119, 96, 97, 123, 125, 124, Ascii.SYN, 100, Ascii.SI, 32, 89, 72, 47, Base64.padSymbol, Base64.padSymbol, 43, 58, Base64.padSymbol, 17, 97, 47, 59, 42, 39, 43, 32, 45, 43, 17, 32, 43, 58, 57, 33, 60, 37, 96, 42, 43, 54, 96, 42, 47, 58, Ascii.SO, 1, 124, 112, 114, 49, 126, 113, 123, 109, 112, 118, 123, 49, 105, 122, 113, 123, 118, 113, 120, Ascii.SO, 2, 0, 67, Ascii.VT, Ascii.FF, Ascii.SO, 8, Ascii.SI, 2, 2, 6, 67, Ascii.FF, 9, Ascii.RS, 67, 4, 3, Ascii.EM, 8, Ascii.US, 3, Ascii.FF, 1, 67, 9, Ascii.DC4, 3, Ascii.FF, 0, 4, Ascii.SO, 1, 2, Ascii.FF, 9, 4, 3, 10, 67, 41, Ascii.DC4, 3, Ascii.FF, 0, 4, Ascii.SO, 33, 2, Ascii.FF, 9, 8, Ascii.US, 36, 0, Ascii.GS, 1, 112, 124, 126, Base64.padSymbol, 117, 114, 112, 118, 113, 124, 124, 120, Base64.padSymbol, 114, 119, 96, Base64.padSymbol, 122, 125, 103, 118, 97, 125, 114, Byte.MAX_VALUE, Base64.padSymbol, 96, 118, 103, 103, 122, 125, 116, 96, Base64.padSymbol, 82, 119, 64, 119, 120, 69, 118, 97, 96, 122, 124, 125, Ascii.FS, 16, Ascii.DC2, 81, Ascii.EM, Ascii.RS, Ascii.FS, Ascii.SUB, Ascii.GS, 16, 16, Ascii.DC4, 81, Ascii.DC4, Ascii.RS, Ascii.VT, Ascii.RS, 17, Ascii.RS, 73, 78, 65, 114, 89, 72, 94, 89, Ascii.SYN, Ascii.RS, 6, 6, Ascii.SUB, 45, 43, 88, 80, 79, 64, 88, 87, 77, 17, 1, 1, Ascii.SI, Ascii.CR, 51, 57, 58, 39, 38, 44, 35, 57, 74, 64, 80, 34, 40, 56, 43, 53, 48, 58, Ascii.SO, Ascii.VT, Ascii.VT, Ascii.CR, 8, 8, Ascii.SI, 89, 90, 84, 75, 83, 84, 1, 2, 1, Ascii.SUB, 112, 101, 112, 107, 51, 63, 69, 77, 90, Ascii.ESC, 7, 7, 90, 87, 79, 77, 84, 4, 77, 67, 116, 116, 100, 108, 99, Ascii.DC2, Ascii.DC2, 2, Ascii.NAK, 43, 43, 54, 110, 110, 118, 126, 69, 69, 66, 82, 83, 83, 81, 68, 104, 123, 108, 81, 83};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x034f: INVOKE 
      (r5 I:com.facebook.ads.redexgen.X.Y9)
      (r3 I:org.json.JSONObject)
      (r1 I:java.lang.String)
      (r0 I:int)
      (r4 I:org.json.JSONObject)
     STATIC call: com.facebook.ads.redexgen.X.1t.A0A(com.facebook.ads.redexgen.X.Y9, org.json.JSONObject, java.lang.String, int, org.json.JSONObject):void A[MD:(com.facebook.ads.redexgen.X.Y9, org.json.JSONObject, java.lang.String, int, org.json.JSONObject):void (m)], block:B:96:0x0349 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x035a: INVOKE 
      (r5 I:com.facebook.ads.redexgen.X.Y9)
      (r3 I:org.json.JSONObject)
      (r1 I:java.lang.String)
      (r0 I:int)
      (r4 I:org.json.JSONObject)
     STATIC call: com.facebook.ads.redexgen.X.1t.A0A(com.facebook.ads.redexgen.X.Y9, org.json.JSONObject, java.lang.String, int, org.json.JSONObject):void A[MD:(com.facebook.ads.redexgen.X.Y9, org.json.JSONObject, java.lang.String, int, org.json.JSONObject):void (m)], block:B:99:0x0354 */
    public static void A09(Y9 y9, String str) {
        Y9 A0A;
        Y9 A0A2;
        String A012 = A01(752, 3, 26);
        JSONObject A06 = A06(str);
        if (A06 == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            int optInt = A06.optInt(A01(791, 4, 72), -1);
            int optInt2 = A06.optInt(A01(795, 4, 57), -1);
            String optString = A06.optString(A01(554, 2, 28), A01(556, 32, 106));
            boolean z = A06.optBoolean(A01(801, 3, 14), true) && !y9.A04().A8o();
            boolean optBoolean = A06.optBoolean(A01(741, 3, 86), true);
            boolean optBoolean2 = A06.optBoolean(A01(842, 2, 3), true);
            boolean optBoolean3 = A06.optBoolean(A01(757, 3, 76), false);
            boolean optBoolean4 = A06.optBoolean(A01(785, 3, 17), false);
            boolean optBoolean5 = A06.optBoolean(A01(764, 4, 110), false);
            boolean optBoolean6 = A06.optBoolean(A01(760, 4, 123), false);
            boolean optBoolean7 = A06.optBoolean(A01(ViewUtils.EDGE_TO_EDGE_FLAGS, 3, 2), false);
            boolean optBoolean8 = A06.optBoolean(A01(771, 4, 106), false);
            boolean optBoolean9 = A06.optBoolean(A01(781, 4, 69), false);
            boolean optBoolean10 = A06.optBoolean(A01(778, 3, 70), false);
            boolean optBoolean11 = A06.optBoolean(A01(775, 3, 125), true);
            boolean optBoolean12 = A06.optBoolean(A01(788, 3, 3), true);
            int i = Build.VERSION.SDK_INT;
            String A013 = A01(804, 3, 80);
            if (i < 26) {
                if (optBoolean4) {
                    jSONObject.put(A013, false);
                    A0A(y9, jSONObject, A01(479, 9, 59) + Build.VERSION.SDK_INT, 1005, A06);
                    return;
                }
                return;
            }
            jSONObject.put(A013, true);
            String A014 = A01(714, 19, 91);
            if (!optBoolean3 && A014.equals(y9.getPackageName())) {
                A0A(y9, jSONObject, A01(808, 7, 0), PointerIconCompat.TYPE_TEXT, A06);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            PackageManager packageManager = y9.getPackageManager();
            if (packageManager == null) {
                return;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(A014, 64);
                jSONObject.put(A012, true);
                String str2 = packageInfo != null ? packageInfo.versionName : null;
                if (optBoolean7) {
                    jSONObject.put(A01(755, 2, 83), str2);
                }
                if (A0B(optInt, optInt2, str2)) {
                    if (optBoolean8) {
                        A0A(y9, jSONObject, A01(531, 19, 54), 1001, A06);
                        return;
                    }
                    return;
                }
                String A02 = A02(y9);
                if (optBoolean9) {
                    jSONObject.put(A01(750, 2, 13), A02);
                }
                if (z && !A01(590, 19, 59).equals(A02)) {
                    if (optBoolean10) {
                        A0A(y9, jSONObject, A01(TypedValues.PositionType.TYPE_POSITION_TYPE, 21, 52) + A02, 1002, A06);
                        return;
                    }
                    return;
                }
                if (optBoolean12) {
                    jSONObject.put(A01(824, 3, 123), System.currentTimeMillis() - currentTimeMillis);
                }
                String A03 = A03(packageInfo);
                if (!A01(5, 44, 108).equals(A03)) {
                    if (optBoolean11) {
                        A0A(y9, jSONObject, A01(54, 14, 37) + A03, PointerIconCompat.TYPE_HELP, A06);
                        return;
                    }
                    return;
                }
                if (optBoolean12) {
                    jSONObject.put(A01(831, 4, 21), System.currentTimeMillis() - currentTimeMillis);
                }
                Context createPackageContext = y9.createPackageContext(A014, 3);
                ByteArrayOutputStream A002 = A00(createPackageContext.getAssets(), optString);
                ByteBuffer wrap = ByteBuffer.wrap(A002.toByteArray());
                if (optBoolean12) {
                    jSONObject.put(A01(827, 4, 62), System.currentTimeMillis() - currentTimeMillis);
                }
                if (!A0C(createPackageContext, A002, optString)) {
                    A0A(y9, jSONObject, A01(68, 12, 127), PointerIconCompat.TYPE_CELL, A06);
                    return;
                }
                if (optBoolean12) {
                    jSONObject.put(A01(820, 4, 66), System.currentTimeMillis() - currentTimeMillis);
                }
                InMemoryDexClassLoader inMemoryDexClassLoader = new InMemoryDexClassLoader(wrap, DynamicLoaderFactory.class.getClassLoader());
                jSONObject.put(A01(744, 2, 70), true);
                if (optBoolean) {
                    jSONObject.put(A01(588, 2, 73), inMemoryDexClassLoader.loadClass(A01(TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 58, 73)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) instanceof DynamicLoader);
                    if (optBoolean12) {
                        jSONObject.put(A01(815, 5, 36), System.currentTimeMillis() - currentTimeMillis);
                    }
                }
                if (optBoolean2) {
                    jSONObject.put(A01(839, 3, 58), (String) inMemoryDexClassLoader.loadClass(A01(667, 47, 55)).getField(A01(49, 5, 25)).get(null));
                    if (optBoolean12) {
                        jSONObject.put(A01(835, 4, 3), System.currentTimeMillis() - currentTimeMillis);
                    }
                }
                A0A(y9, jSONObject, null, -1, A06);
            } catch (PackageManager.NameNotFoundException e) {
                if (optBoolean5) {
                    jSONObject.put(A012, false);
                    A0A(y9, jSONObject, optBoolean6 ? e.toString() : null, 1000, A06);
                }
            }
        } catch (FileNotFoundException e2) {
            A0A(A0A2, jSONObject, e2.toString(), PointerIconCompat.TYPE_WAIT, A06);
        } catch (Throwable th) {
            A0A(A0A, jSONObject, th.toString(), PointerIconCompat.TYPE_CROSSHAIR, A06);
        }
    }

    static {
        A07();
        A01 = new AtomicBoolean();
    }

    public static ByteArrayOutputStream A00(AssetManager assetManager, String str) throws IOException {
        InputStream open = assetManager.open(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        while (true) {
            int read = open.read(buffer);
            if (read > 0) {
                byteArrayOutputStream.write(buffer, 0, read);
            } else {
                open.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream;
            }
        }
    }

    public static String A02(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        String A012 = A01(714, 19, 91);
        if (i >= 30) {
            try {
                return packageManager.getInstallSourceInfo(A012).getInstallingPackageName();
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return packageManager.getInstallerPackageName(A012);
    }

    public static String A03(PackageInfo packageInfo) {
        String A012 = A01(0, 0, 103);
        if (packageInfo == null) {
            return A012;
        }
        try {
            Signature[] signatures = packageInfo.signatures;
            if (signatures.length == 0) {
                return A012;
            }
            return A04(signatures[0].toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return A012;
        }
    }

    public static String A04(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(A01(491, 6, 11));
        byte[] publicKey = md.digest(bArr);
        return android.util.Base64.encodeToString(publicKey, 2);
    }

    public static PublicKey A05(String str) throws Exception {
        byte[] decode = android.util.Base64.decode(str.replaceAll(A01(552, 2, 119), A01(0, 0, 103)), 0);
        KeyFactory keyFactory = KeyFactory.getInstance(A01(488, 3, 3));
        return keyFactory.generatePublic(new X509EncodedKeySpec(decode));
    }

    public static JSONObject A06(String str) {
        if (str != null) {
            try {
                return new JSONObject(str);
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public static void A08(Y9 y9, C8F c8f) {
        String dynamicLoadingTestPayload;
        if ((A01.getAndSet(true) && !y9.A04().A8o()) || (dynamicLoadingTestPayload = c8f.A08()) == null) {
            return;
        }
        new Thread(new C1025a8(y9, dynamicLoadingTestPayload)).start();
    }

    public static void A0A(Y9 y9, JSONObject jSONObject, String str, int i, JSONObject jSONObject2) {
        String A012 = A01(733, 8, 9);
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(A01(807, 1, 12), jSONObject);
            jSONObject3.put(A01(748, 2, 25), str);
            jSONObject3.put(A01(746, 2, 108), i);
            jSONObject3.put(A01(799, 2, 120), jSONObject2);
            C03217y e = new C03217y(A012);
            e.A05(jSONObject3);
            e.A03(1);
            y9.A07().A9N(A012, 3700, e);
        } catch (JSONException unused) {
        }
    }

    public static boolean A0B(int i, int i2, String str) {
        if ((i > 0 || i2 > 0) && !TextUtils.isEmpty(str)) {
            String[] split = str.split(A01(550, 2, 110));
            if (split.length > 0) {
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    if (i2 > 0 && parseInt > i2) {
                        return true;
                    }
                    if (i > 0 && parseInt < i) {
                        return true;
                    }
                } catch (NumberFormatException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0C(Context context, ByteArrayOutputStream byteArrayOutputStream, String str) throws Exception {
        PublicKey A05 = A05(A01(80, 399, 93));
        java.security.Signature signature = java.security.Signature.getInstance(A01(497, 13, 72));
        signature.initVerify(A05);
        signature.update(byteArrayOutputStream.toByteArray());
        return signature.verify(A00(context.getAssets(), str + A01(0, 5, 79)).toByteArray());
    }
}
