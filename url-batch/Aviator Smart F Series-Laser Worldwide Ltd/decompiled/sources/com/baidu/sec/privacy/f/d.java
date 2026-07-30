package com.baidu.sec.privacy.f;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.common.primitives.UnsignedBytes;
import h4.p;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileReader;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static int f10669a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10670b;

    /* renamed from: c, reason: collision with root package name */
    public PublicKey f10671c;

    public class a implements Comparator<c> {
        public a(d dVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            int i8 = cVar2.f10674c - cVar.f10674c;
            if (i8 != 0) {
                return i8;
            }
            boolean z7 = cVar.f10673b;
            if (z7 && cVar2.f10673b) {
                return 0;
            }
            if (z7) {
                return -1;
            }
            if (cVar2.f10673b) {
                return 1;
            }
            return i8;
        }
    }

    public static class b {
        public static byte[] a(byte[] bArr) {
            return a(bArr, bArr.length);
        }

        public static byte[] a(byte[] bArr, int i8) {
            byte b8;
            int i9;
            int i10 = (i8 / 4) * 3;
            if (i10 == 0) {
                return new byte[0];
            }
            byte[] bArr2 = new byte[i10];
            int i11 = i8;
            int i12 = 0;
            while (true) {
                byte b9 = bArr[i11 - 1];
                b8 = 10;
                if (b9 != 10 && b9 != 13 && b9 != 32 && b9 != 9) {
                    if (b9 != 61) {
                        break;
                    }
                    i12++;
                }
                i11--;
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i13 < i11) {
                byte b10 = bArr[i13];
                if (b10 != b8 && b10 != 13 && b10 != 32 && b10 != 9) {
                    if (b10 >= 65 && b10 <= 90) {
                        i9 = b10 - 65;
                    } else if (b10 >= 97 && b10 <= 122) {
                        i9 = b10 + a4.a.f20b2;
                    } else if (b10 >= 48 && b10 <= 57) {
                        i9 = b10 + 4;
                    } else if (b10 == 43) {
                        i9 = 62;
                    } else {
                        if (b10 != 47) {
                            return null;
                        }
                        i9 = 63;
                    }
                    i15 = ((byte) i9) | (i15 << 6);
                    if (i16 % 4 == 3) {
                        bArr2[i14] = (byte) ((16711680 & i15) >> 16);
                        int i17 = i14 + 2;
                        bArr2[i14 + 1] = (byte) ((65280 & i15) >> 8);
                        i14 += 3;
                        bArr2[i17] = (byte) (i15 & 255);
                    }
                    i16++;
                }
                i13++;
                b8 = 10;
            }
            if (i12 > 0) {
                int i18 = i15 << (i12 * 6);
                int i19 = i14 + 1;
                bArr2[i14] = (byte) ((i18 & 16711680) >> 16);
                if (i12 == 1) {
                    i14 += 2;
                    bArr2[i19] = (byte) ((i18 & 65280) >> 8);
                } else {
                    i14 = i19;
                }
            }
            byte[] bArr3 = new byte[i14];
            System.arraycopy(bArr2, 0, bArr3, 0, i14);
            return bArr3;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public ApplicationInfo f10672a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f10673b;

        /* renamed from: c, reason: collision with root package name */
        public int f10674c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f10675d;

        public /* synthetic */ c(a aVar) {
            this();
        }

        public c() {
            this.f10674c = 0;
            this.f10675d = false;
            this.f10673b = false;
        }
    }

    /* renamed from: com.baidu.sec.privacy.f.d$d, reason: collision with other inner class name */
    public static class C0146d {

        /* renamed from: a, reason: collision with root package name */
        public String f10676a;

        /* renamed from: b, reason: collision with root package name */
        public String f10677b;

        /* renamed from: c, reason: collision with root package name */
        public int f10678c = 0;

        public static boolean a(int i8) {
            return i8 >= 14;
        }

        public static boolean b(String str) {
            return TextUtils.isEmpty(str);
        }

        public boolean c() {
            return b(this.f10677b);
        }

        public boolean b() {
            return a(this.f10678c);
        }

        public static C0146d a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                String str2 = "0";
                String str3 = "0";
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!d.d("ZGV2aWNlaWQ=").equals(next) && !d.d("dmVy").equals(next)) {
                        str3 = jSONObject.optString(next, "0");
                    }
                }
                String string = jSONObject.getString(d.d("ZGV2aWNlaWQ="));
                jSONObject.getInt(d.d("dmVy"));
                int length = TextUtils.isEmpty(str3) ? 0 : str3.length();
                if (!TextUtils.isEmpty(string)) {
                    C0146d c0146d = new C0146d();
                    c0146d.f10676a = string;
                    c0146d.f10678c = length;
                    if (length >= 14) {
                        return c0146d;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                    c0146d.f10677b = str2;
                    return c0146d;
                }
            } catch (Exception e8) {
                com.baidu.sec.privacy.f.c.a(e8);
            }
            return null;
        }

        public static C0146d b(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            C0146d c0146d = new C0146d();
            c0146d.f10676a = str;
            int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
            c0146d.f10678c = length;
            if (length >= 14) {
                return c0146d;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "0";
            }
            c0146d.f10677b = str2;
            return c0146d;
        }

        public String a() {
            String str = this.f10677b;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return this.f10676a + b5.b.VERTICAL + str;
        }
    }

    public static final class e {
        public static byte[] a() {
            return new byte[]{48, a4.a.f103z1, 3, a4.a.Z0, 48, a4.a.f103z1, 2, 75, -96, 3, 2, 1, 2, 2, 4, a4.a.f39g1, -93, a4.a.f82s1, 122, 48, 13, 6, 9, a4.a.f66n0, -122, 72, -122, -9, 13, 1, 1, 11, 5, 0, 48, a4.a.X0, 49, 11, 48, 9, 6, 3, 85, 4, 6, 19, 2, a4.a.Z0, a4.a.f55k1, 49, 16, 48, 14, 6, 3, 85, 4, 8, 19, 7, a4.a.Y0, a4.a.f19b1, a4.a.f35f1, a4.a.f39g1, a4.a.f35f1, a4.a.f55k1, a4.a.f27d1, 49, 16, 48, 14, 6, 3, 85, 4, 7, 19, 7, a4.a.f31e1, a4.a.X0, a4.a.f35f1, a4.a.f15a1, a4.a.f35f1, a4.a.X0, a4.a.f55k1, 49, 14, 48, 12, 6, 3, 85, 4, 10, 19, 5, a4.a.Y0, a4.a.X0, a4.a.f35f1, a4.a.f15a1, a4.a.f76q1, 49, 14, 48, 12, 6, 3, 85, 4, 11, 19, 5, a4.a.Y0, a4.a.X0, a4.a.f35f1, a4.a.f15a1, a4.a.f76q1, 49, 14, 48, 12, 6, 3, 85, 4, 3, 19, 5, a4.a.Y0, a4.a.X0, a4.a.f35f1, a4.a.f15a1, a4.a.f76q1, 48, 32, 23, 13, 49, 53, 49, 48, 50, 49, 48, 52, 51, 54, 51, 55, a4.a.T0, 24, 15, 50, 48, 55, 48, 48, 55, 50, 52, 48, 52, 51, 54, 51, 55, a4.a.T0, 48, a4.a.X0, 49, 11, 48, 9, 6, 3, 85, 4, 6, 19, 2, a4.a.Z0, a4.a.f55k1, 49, 16, 48, 14, 6, 3, 85, 4, 8, 19, 7, a4.a.Y0, a4.a.f19b1, a4.a.f35f1, a4.a.f39g1, a4.a.f35f1, a4.a.f55k1, a4.a.f27d1, 49, 16, 48, 14, 6, 3, 85, 4, 7, 19, 7, a4.a.f31e1, a4.a.X0, a4.a.f35f1, a4.a.f15a1, a4.a.f35f1, a4.a.X0, a4.a.f55k1, 49, 14, 48, 12, 6, 3, 85, 4, 10, 19, 5, a4.a.Y0, a4.a.X0, a4.a.f35f1, a4.a.f15a1, a4.a.f76q1, 49, 14, 48, 12, 6, 3, 85, 4, 11, 19, 5, a4.a.Y0, a4.a.X0, a4.a.f35f1, a4.a.f15a1, a4.a.f76q1, 49, 14, 48, 12, 6, 3, 85, 4, 3, 19, 5, a4.a.Y0, a4.a.X0, a4.a.f35f1, a4.a.f15a1, a4.a.f76q1, 48, a4.a.f103z1, 1, 34, 48, 13, 6, 9, a4.a.f66n0, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 3, a4.a.f103z1, 1, 15, 0, 48, a4.a.f103z1, 1, 10, 2, a4.a.f103z1, 1, 1, 0, a4.a.R1, a4.a.P1, -2, -41, Byte.MAX_VALUE, 37, -25, -33, a4.a.V0, 51, a4.a.Z1, 32, -81, 61, a4.a.f47i1, 37, a4.a.f97x1, 14, a4.a.A1, a4.a.f85t1, -55, -29, 34, -60, a4.a.Q0, a4.a.f36f2, -46, a4.a.f85t1, -93, a4.a.f36f2, -27, a4.a.X0, 54, 35, 0, -6, a4.a.P0, 67, a4.a.G1, 43, -24, 26, 88, -5, 33, 27, -105, 49, 76, a4.a.f24c2, -32, a4.a.f35f1, -48, 67, a4.a.M0, a4.a.f23c1, -111, -81, a4.a.V0, -103, p.f16767c, 17, 55, a4.a.N0, -34, -80, a4.a.W1, a4.a.f48i2, a4.a.T1, 6, 91, 10, 48, -56, -1, 45, 9, 23, 34, 6, a4.a.f27d1, 35, -51, 29, 70, -19, -51, 20, -39, -43, -97, 75, 23, a4.a.B1, -101, a4.a.f20b2, a4.a.X1, a4.a.K1, -88, a4.a.f48i2, a4.a.f20b2, 80, a4.a.T0, a4.a.W1, -119, 51, -80, 118, UnsignedBytes.MAX_POWER_OF_TWO, a4.a.f52j2, a4.a.J1, a4.a.Y0, -29, -27, 60, -119, a4.a.Y1, a4.a.f55k1, 61, 51, a4.a.G, 53, 66, -99, -45, -25, a4.a.f59l1, a4.a.D1, 25, a4.a.f16a2, Byte.MAX_VALUE, 3, 51, a4.a.M1, 57, a4.a.Q1, a4.a.f73p1, -59, -117, 74, a4.a.f20b2, 121, a4.a.D0, 19, -8, -109, 33, a4.a.f44h2, 76, -105, a4.a.f100y1, -23, 5, a4.a.Z0, -82, 22, -99, 51, 78, -26, 77, -52, -29, 121, a4.a.f66n0, a4.a.W1, 20, 2, a4.a.f73p1, a4.a.f59l1, a4.a.W1, 2, a4.a.U1, a4.a.Q1, -54, a4.a.N0, a4.a.f70o1, a4.a.O0, 50, a4.a.f91v1, -83, a4.a.W0, 20, -40, -118, a4.a.f35f1, a4.a.T0, a4.a.f24c2, a4.a.f82s1, -33, -110, 12, a4.a.f40g2, a4.a.f50j0, 34, a4.a.A1, a4.a.G1, a4.a.M0, -54, -103, -109, a4.a.B1, 26, 94, -89, -98, a4.a.f56k2, -66, a4.a.S0, 48, a4.a.f32e2, -51, a4.a.f43h1, -60, 12, a4.a.f67n1, a4.a.f20b2, a4.a.f79r1, 49, -31, -65, a4.a.f63m1, -99, 3, a4.a.Q1, 79, -88, -38, -87, -25, -38, 41, a4.a.f55k1, -25, 29, 49, a4.a.f91v1, a4.a.W1, a4.a.P1, 77, a4.a.f56k2, a4.a.Q1, a4.a.f67n1, -63, 118, a4.a.G, -5, a4.a.B1, 19, 22, a4.a.Y1, a4.a.X1, 78, 28, 47, a4.a.f28d2, 2, 3, 1, 0, 1, -93, 33, 48, 31, 48, 29, 6, 3, 85, 29, 14, 4, 22, 4, 20, -41, a4.a.J1, 33, a4.a.f103z1, -103, 35, a4.a.f70o1, -83, a4.a.Z0, a4.a.f55k1, -39, a4.a.f55k1, a4.a.A1, -118, a4.a.f28d2, a4.a.R0, -103, 30, 12, -53, 48, 13, 6, 9, a4.a.f66n0, -122, 72, -122, -9, 13, 1, 1, 11, 5, 0, 3, a4.a.f103z1, 1, 1, 0, 0, -117, 0, -28, 51, 26, -4, a4.a.f40g2, 86, Byte.MAX_VALUE, 14, -101, -48, 121, a4.a.f70o1, -53, a4.a.f16a2, a4.a.G, 4, -83, 49, a4.a.f39g1, a4.a.f40g2, -44, a4.a.G1, -105, 19, a4.a.I0, -32, a4.a.I0, a4.a.U0, 21, 51, 61, -21, a4.a.Y1, 71, 91, 64, 75, a4.a.f16a2, -48, a4.a.f23c1, 17, a4.a.E1, -23, a4.a.f32e2, 51, 23, -104, a4.a.f43h1, a4.a.I0, -30, a4.a.f51j1, -6, a4.a.f78r0, -44, -46, a4.a.Z1, -54, -55, 63, 77, -54, a4.a.f56k2, -51, 27, -1, a4.a.f67n1, 86, -80, 28, -89, 29, -20, 49, -8, 57, -7, -30, 61, a4.a.J1, -6, -60, a4.a.f63m1, 45, -32, -93, 19, -62, -89, a4.a.f39g1, 91, a4.a.W0, -48, a4.a.T0, -59, a4.a.f78r0, a4.a.f31e1, a4.a.f59l1, -88, 51, -39, a4.a.f58l0, -36, a4.a.H1, 86, a4.a.O1, 25, 30, 94, a4.a.f48i2, a4.a.f40g2, -57, a4.a.D0, -21, -111, a4.a.f31e1, -50, -3, a4.a.D1, a4.a.Q1, -43, 61, a4.a.f35f1, -3, 57, a4.a.M0, 51, -3, -31, a4.a.f35f1, a4.a.f52j2, 19, 77, -82, a4.a.E1, 121, a4.a.f47i1, -63, a4.a.f103z1, a4.a.f78r0, -43, 14, -56, 21, 47, 63, -104, -7, a4.a.f63m1, 57, a4.a.f15a1, -9, a4.a.f52j2, -101, a4.a.f43h1, a4.a.V1, -64, 91, -104, -61, 0, -7, a4.a.f16a2, -19, 75, 12, a4.a.f59l1, Byte.MAX_VALUE, a4.a.F1, -46, -99, -111, -93, a4.a.f36f2, -42, -66, 32, a4.a.N0, 70, a4.a.f51j1, -57, 10, 19, -49, -44, a4.a.D0, 21, 31, -61, -59, a4.a.P0, a4.a.f44h2, 43, 73, -88, a4.a.f82s1, -58, -46, a4.a.f78r0, 66, 41, -2, a4.a.f24c2, -6, -42, a4.a.f27d1, 8, 4, a4.a.S0, a4.a.f55k1, -122, a4.a.L0, a4.a.R1, a4.a.G0, a4.a.f32e2, 13, -117, 35, -52, -6, a4.a.f39g1, a4.a.P1, 91, -62, -56, -26, -41, -109, a4.a.L0, a4.a.L1, -43, -29, a4.a.f63m1, 43, a4.a.f103z1, a4.a.f100y1, 122, -47, -30, -96, -2, 78, a4.a.f72p0, a4.a.O1, -38, a4.a.B1, a4.a.L1, 73, -105, -66, 5, a4.a.S1, -7, 56};
        }
    }

    public static final class f {
        public static byte[] a(byte[] bArr) {
            try {
                return MessageDigest.getInstance("SHA-1").digest(bArr);
            } catch (Exception e8) {
                d.b(e8);
                return new byte[0];
            }
        }
    }

    static {
        new String(b.a(new byte[]{77, 122, a4.a.I0, 121, 77, a4.a.Q0, 73, a4.a.f82s1, 77, a4.a.L0, 73, 61}));
        new String(b.a(new byte[]{a4.a.T0, 71, a4.a.f47i1, a4.a.f39g1, a4.a.f15a1, a4.a.R0, a4.a.O0, 112, a4.a.S0, a4.a.R0, 73, 61}));
    }

    public d(Context context) {
        this.f10670b = context.getApplicationContext();
        c();
    }

    public static void b(Throwable th) {
    }

    public static String d(String str) {
        return new String(b.a(str.getBytes()));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Throwable th;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            try {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(e.a());
                try {
                    this.f10671c = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream2).getPublicKey();
                    byteArrayInputStream2.close();
                } catch (Exception e8) {
                    e = e8;
                    byteArrayInputStream = byteArrayInputStream2;
                    try {
                        b(e);
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                    } catch (Throwable th2) {
                        byteArrayInputStream2 = byteArrayInputStream;
                        th = th2;
                        ByteArrayInputStream byteArrayInputStream3 = byteArrayInputStream2;
                        th = th;
                        byteArrayInputStream = byteArrayInputStream3;
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception e9) {
                                b(e9);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ByteArrayInputStream byteArrayInputStream32 = byteArrayInputStream2;
                    th = th;
                    byteArrayInputStream = byteArrayInputStream32;
                    if (byteArrayInputStream != null) {
                    }
                    throw th;
                }
            } catch (Exception e10) {
                b(e10);
            }
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
            if (byteArrayInputStream != null) {
            }
            throw th;
        }
    }

    public final String e(String str) {
        return "0";
    }

    public final String f(String str) {
        try {
            return Settings.System.getString(this.f10670b.getContentResolver(), str);
        } catch (Exception e8) {
            b(e8);
            return null;
        }
    }

    public static String b(Context context) {
        C0146d a8 = a(context);
        return a8 != null ? a8.a() : "";
    }

    public static String a(byte[] bArr) {
        if (bArr != null) {
            String str = "";
            for (byte b8 : bArr) {
                String hexString = Integer.toHexString(b8 & 255);
                str = hexString.length() == 1 ? str + "0" + hexString : str + hexString;
            }
            return str.toLowerCase();
        }
        throw new IllegalArgumentException("Argument b ( byte array ) is null! ");
    }

    public final boolean b(String str) {
        return this.f10670b.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public final C0146d b() {
        return C0146d.b(f("com.baidu.deviceid"), f("bd_setting_i"));
    }

    public final String[] a(Signature[] signatureArr) {
        int length = signatureArr.length;
        String[] strArr = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            strArr[i8] = a(f.a(signatureArr[i8].toByteArray()));
        }
        return strArr;
    }

    public static byte[] a(byte[] bArr, PublicKey publicKey) {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, publicKey);
        return cipher.doFinal(bArr);
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "";
    }

    public final List<c> a(Intent intent, boolean z7) {
        byte[] a8;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = this.f10670b.getPackageManager();
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && activityInfo.applicationInfo != null) {
                    try {
                        ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                        Bundle bundle = packageManager.getReceiverInfo(new ComponentName(activityInfo2.packageName, activityInfo2.name), 128).metaData;
                        if (bundle != null) {
                            String string = bundle.getString("galaxy_data");
                            if (!TextUtils.isEmpty(string)) {
                                byte[] a9 = b.a(string.getBytes("utf-8"));
                                JSONObject jSONObject = new JSONObject(new String(a9));
                                c cVar = new c(null);
                                cVar.f10674c = jSONObject.getInt("priority");
                                cVar.f10672a = resolveInfo.activityInfo.applicationInfo;
                                if (this.f10670b.getPackageName().equals(resolveInfo.activityInfo.applicationInfo.packageName)) {
                                    cVar.f10673b = true;
                                }
                                if (z7) {
                                    String string2 = bundle.getString("galaxy_sf");
                                    if (!TextUtils.isEmpty(string2)) {
                                        PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.applicationInfo.packageName, 64);
                                        JSONArray jSONArray = jSONObject.getJSONArray("sigs");
                                        int length = jSONArray.length();
                                        String[] strArr = new String[length];
                                        for (int i8 = 0; i8 < length; i8++) {
                                            strArr[i8] = jSONArray.getString(i8);
                                        }
                                        if (a(strArr, a(packageInfo.signatures)) && (a8 = a(b.a(string2.getBytes()), this.f10671c)) != null && Arrays.equals(a8, f.a(a9))) {
                                            cVar.f10675d = true;
                                        }
                                    }
                                }
                                arrayList.add(cVar);
                            }
                        }
                    } catch (Exception e8) {
                        b(e8);
                    }
                }
            }
        }
        Collections.sort(arrayList, new a(this));
        return arrayList;
    }

    public final boolean a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        HashSet hashSet2 = new HashSet();
        for (String str2 : strArr2) {
            hashSet2.add(str2);
        }
        return hashSet.equals(hashSet2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(File file) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                try {
                    char[] cArr = new char[8192];
                    CharArrayWriter charArrayWriter = new CharArrayWriter();
                    while (true) {
                        int read = fileReader.read(cArr);
                        if (read <= 0) {
                            break;
                        }
                        charArrayWriter.write(cArr, 0, read);
                    }
                    String charArrayWriter2 = charArrayWriter.toString();
                    try {
                        fileReader.close();
                    } catch (Exception e8) {
                        b(e8);
                    }
                    return charArrayWriter2;
                } catch (Exception e9) {
                    e = e9;
                    b(e);
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Exception e10) {
                            b(e10);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileReader2 = fileReader;
                if (fileReader2 != null) {
                    try {
                        fileReader2.close();
                    } catch (Exception e11) {
                        b(e11);
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileReader2 != null) {
            }
            throw th;
        }
    }

    public static C0146d a(Context context) {
        return new d(context).a();
    }

    public final C0146d a() {
        List<c> a8 = a(new Intent("com.baidu.intent.action.GALAXY").setPackage(this.f10670b.getPackageName()), true);
        boolean z7 = false;
        if (a8 == null || a8.size() == 0) {
            for (int i8 = 0; i8 < 3; i8++) {
            }
        } else {
            boolean z8 = a8.get(0).f10675d;
            if (!z8) {
                for (int i9 = 0; i9 < 3; i9++) {
                }
            }
            z7 = z8;
        }
        File file = new File(this.f10670b.getFilesDir(), com.baidu.bbalbscesium.f.f3879g);
        C0146d a9 = file.exists() ? C0146d.a(c(a(file))) : null;
        if (a9 == null) {
            f10669a |= 16;
            List<c> a10 = a(new Intent("com.baidu.intent.action.GALAXY"), z7);
            if (a10 != null) {
                File filesDir = this.f10670b.getFilesDir();
                String name = "files".equals(filesDir.getName()) ? "files" : filesDir.getName();
                for (c cVar : a10) {
                    if (!cVar.f10673b) {
                        File file2 = new File(new File(cVar.f10672a.dataDir, name), com.baidu.bbalbscesium.f.f3879g);
                        if (file2.exists() && (a9 = C0146d.a(c(a(file2)))) != null) {
                            break;
                        }
                    }
                }
            }
        }
        if (a9 == null) {
            a9 = C0146d.a(c(f("com.baidu.deviceid.v2")));
        }
        boolean b8 = b("android.permission.READ_EXTERNAL_STORAGE");
        if (a9 == null && b8) {
            f10669a |= 2;
        }
        if (a9 == null) {
            f10669a |= 8;
            a9 = b();
        }
        if (a9 == null && b8) {
            f10669a |= 1;
            e("");
        }
        a(a9);
        return a9;
    }

    public final boolean a(C0146d c0146d) {
        if (c0146d == null) {
            return false;
        }
        if (c0146d.b()) {
            c0146d.f10677b = "O";
            return true;
        }
        if (!c0146d.c()) {
            return false;
        }
        c0146d.f10677b = "0";
        return true;
    }
}
