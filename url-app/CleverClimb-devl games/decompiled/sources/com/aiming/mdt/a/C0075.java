package com.aiming.mdt.a;

import android.content.Context;
import android.text.TextUtils;
import com.aiming.mdt.a.C0177;
import java.util.HashMap;

/* renamed from: com.aiming.mdt.a.ʻʽʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0075 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f176 = 0;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static volatile C0075 f177 = null;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f179 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    private static char[] f175 = {' ', 'J', ':', 'G', 'n', '`', 'c', 'j', 'i', 's', 'J', '2', '[', 'r', 'p', 'p', 'V', 'd', 228, 254, 254, 256, 233, 192, 208, 240, 241, 233, 238, 252, 213, 200, 216, '?', '~', 130, 's', 'I', '[', 128, 'V', 'T', '{', 'y', 'i', 'k', 'x', 'v', 'x', 'y', 't', 'j', 'J', 'W', 'y', 'x', '|', 'i', 'j', 128, 29, 'V', 'p', 'p', 'r', '[', '2', 'E', 'g', 'f', 'j', 'W', 'X', 'n', 'G', ':', 'J'};

    /* renamed from: ʼ, reason: contains not printable characters */
    private static HashMap<String, String> f178 = new HashMap<>();

    static {
        int i = f176 + 55;
        f179 = i % 128;
        if (i % 2 != 0) {
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static String m223(String str, int i) {
        HashMap<String, String> hashMap = f178;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        if (!hashMap.containsKey(sb.toString())) {
            return "";
        }
        HashMap<String, String> hashMap2 = f178;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i);
        String str2 = hashMap2.get(sb2.toString());
        int i2 = f179 + 63;
        f176 = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static C0075 m224() {
        if (f177 == null) {
            synchronized (C0075.class) {
                if (f177 == null) {
                    f177 = new C0075();
                }
            }
        }
        return f177;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static String m225(String str, int[] iArr, boolean z) {
        byte[] bytes;
        char[] cArr;
        char[] cArr2;
        int i = f179 + 95;
        f176 = i % 128;
        int i2 = i % 2;
        int i3 = f179 + 99;
        f176 = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 4 : (char) 18) != 4) {
            bytes = str.getBytes("ISO-8859-1");
        } else {
            bytes = str.getBytes("ISO-8859-1");
            Object obj = null;
            super.hashCode();
        }
        byte[] bArr = bytes;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr3 = new char[i5];
        System.arraycopy(f175, i4, cArr3, 0, i5);
        if (bArr != null) {
            cArr = new char[i5];
            char c2 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = f176 + 51;
                f179 = i9 % 128;
                int i10 = i9 % 2;
                if ((bArr[i8] == 1 ? '8' : 'Z') != '8') {
                    cArr[i8] = (char) ((cArr3[i8] << 1) - c2);
                } else {
                    cArr[i8] = (char) (((cArr3[i8] << 1) + 1) - c2);
                }
                c2 = cArr[i8];
            }
        } else {
            cArr = cArr3;
        }
        if ((i7 > 0 ? 'N' : ':') == 'N') {
            int i11 = f176 + 45;
            f179 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i5];
            System.arraycopy(cArr, 0, cArr4, 0, i5);
            int i13 = i5 - i7;
            System.arraycopy(cArr4, 0, cArr, i13, i7);
            System.arraycopy(cArr4, i7, cArr, 0, i13);
        }
        if (z) {
            int i14 = f179 + 53;
            f176 = i14 % 128;
            int i15 = i14 % 2;
            cArr2 = new char[i5];
            for (int i16 = 0; i16 < i5; i16++) {
                cArr2[i16] = cArr[(i5 - i16) - 1];
            }
            int i17 = f179 + 39;
            f176 = i17 % 128;
            int i18 = i17 % 2;
        } else {
            cArr2 = cArr;
        }
        if (i6 > 0) {
            int i19 = 0;
            while (i19 < i5) {
                int i20 = f176 + 29;
                f179 = i20 % 128;
                if (!(i20 % 2 != 0)) {
                    cArr2[i19] = (char) (cArr2[i19] << iArr[2]);
                    i19 += 14;
                } else {
                    cArr2[i19] = (char) (cArr2[i19] - iArr[2]);
                    i19++;
                }
            }
        }
        return new String(cArr2);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static void m226(String str, int i, String str2, int i2) {
        try {
            HashMap<String, String> hashMap = f178;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i2);
            String str3 = hashMap.get(sb.toString());
            if (TextUtils.isEmpty(str)) {
                int i3 = f179 + 17;
                f176 = i3 % 128;
                int i4 = i3 % 2;
                str = str3;
            }
            if ((!TextUtils.isEmpty(str2)) && (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str))) {
                switch (i) {
                    case 3:
                        C0031.m48(str, 3, str2, i2);
                        return;
                    case 4:
                        C0031.m48(str, 4, str2, i2);
                        return;
                    case 6:
                        C0031.m48(str, 5, str2, i2);
                        return;
                    case 7:
                        C0031.m48(str, 6, str2, i2);
                        return;
                    case 10:
                        C0031.m48(str, 7, str2, i2);
                        return;
                    case 11:
                        C0031.m48(str, 8, str2, i2);
                        break;
                }
                int i5 = f176 + 11;
                f179 = i5 % 128;
                if (i5 % 2 == 0) {
                }
                return;
            }
            m225("\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{33, 27, 18, 0}, true).intern();
            C0044.m108();
        } catch (Exception e) {
            C0076.m232().m236(e);
            m225("\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{60, 17, 0, 17}, true).intern();
            e.getMessage();
            C0044.m108();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static /* synthetic */ HashMap m227() {
        int i = f179 + 47;
        f176 = i % 128;
        int i2 = i % 2;
        HashMap<String, String> hashMap = f178;
        int i3 = f176 + 33;
        f179 = i3 % 128;
        if (i3 % 2 == 0) {
        }
        return hashMap;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m228(int i, String str, int i2, Object obj, C0177.AbstractC0178 abstractC0178) {
        int i3 = f176 + 71;
        f179 = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (i == 4) {
                HashMap<String, String> hashMap = f178;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i2);
                hashMap.put(sb.toString(), C0126.m473(String.valueOf(obj)));
                HashMap<String, String> hashMap2 = f178;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i2);
                abstractC0178.mo591(hashMap2.get(sb2.toString()));
                return;
            }
            if (i != 11) {
                HashMap<String, String> hashMap3 = f178;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(i2);
                abstractC0178.mo591(hashMap3.get(sb3.toString()));
                return;
            }
            HashMap<String, String> hashMap4 = f178;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(i2);
            hashMap4.put(sb4.toString(), C0029.m31(String.valueOf(obj)));
            HashMap<String, String> hashMap5 = f178;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(i2);
            abstractC0178.mo591(hashMap5.get(sb5.toString()));
            int i5 = f176 + 95;
            f179 = i5 % 128;
            if ((i5 % 2 != 0 ? 'Y' : (char) 2) != 'Y') {
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m225("\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{17, 16, 142, 0}, true).intern();
            e.getMessage();
            C0044.m108();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m229(Context context, int i, String str, int i2, Object obj, C0177.AbstractC0178 abstractC0178) {
        int i3 = f179 + 29;
        f176 = i3 % 128;
        int i4 = i3 % 2;
        try {
            switch (i) {
                case 3:
                    if (!C0177.m678()) {
                        abstractC0178.mo591("");
                        break;
                    } else {
                        C0113.m425(String.valueOf(obj), new C0055(this, str, i2, abstractC0178));
                        int i5 = f176 + 105;
                        f179 = i5 % 128;
                        if (i5 % 2 == 0) {
                        }
                    }
                    break;
                case 4:
                    HashMap<String, String> hashMap = f178;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i2);
                    String str2 = hashMap.get(sb.toString());
                    C0031.m40(str2, Integer.toString(4), str, i2);
                    abstractC0178.mo591(str2);
                    break;
                case 5:
                case 8:
                case 9:
                default:
                    HashMap<String, String> hashMap2 = f178;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(i2);
                    abstractC0178.mo591(hashMap2.get(sb2.toString()));
                    break;
                case 6:
                    HashMap<String, String> hashMap3 = f178;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(i2);
                    hashMap3.put(sb3.toString(), C0143.m541(context));
                    HashMap<String, String> hashMap4 = f178;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(i2);
                    String str3 = hashMap4.get(sb4.toString());
                    C0031.m40(str3, Integer.toString(5), str, i2);
                    abstractC0178.mo591(str3);
                    break;
                case 7:
                    HashMap<String, String> hashMap5 = f178;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str);
                    sb5.append(i2);
                    hashMap5.put(sb5.toString(), C0116.m432(obj));
                    HashMap<String, String> hashMap6 = f178;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str);
                    sb6.append(i2);
                    String str4 = hashMap6.get(sb6.toString());
                    C0031.m40(str4, Integer.toString(6), str, i2);
                    abstractC0178.mo591(str4);
                    break;
                case 10:
                    HashMap<String, String> hashMap7 = f178;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str);
                    sb7.append(i2);
                    hashMap7.put(sb7.toString(), C0103.m377(obj));
                    HashMap<String, String> hashMap8 = f178;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str);
                    sb8.append(i2);
                    String str5 = hashMap8.get(sb8.toString());
                    C0031.m40(str5, Integer.toString(7), str, i2);
                    abstractC0178.mo591(str5);
                    break;
                case 11:
                    HashMap<String, String> hashMap9 = f178;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(str);
                    sb9.append(i2);
                    String str6 = hashMap9.get(sb9.toString());
                    C0031.m40(str6, Integer.toString(8), str, i2);
                    abstractC0178.mo591(str6);
                    int i6 = f176 + 23;
                    f179 = i6 % 128;
                    if (i6 % 2 == 0) {
                    }
                    break;
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m225("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000", new int[]{0, 17, 0, 17}, false).intern();
            e.getMessage();
            C0044.m108();
        }
    }
}
