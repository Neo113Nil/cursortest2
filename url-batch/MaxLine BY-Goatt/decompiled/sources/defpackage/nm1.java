package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class nm1 implements k93, cu1, c22, l22, f52, ek0, cf2 {
    public final /* synthetic */ int m;

    public /* synthetic */ nm1(int i) {
        this.m = i;
    }

    public static final String h(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i10][i11];
                    byte[] bArr4 = n33.a;
                    int i13 = b & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = bArr[i7 + i12];
                byte[] bArr5 = n33.a;
                i4 = i3 - (b2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length != i11) {
                    z2 = z;
                } else {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            return new String(bArr, i7, i9, charset);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    public static final boolean i(qz1 qz1Var) {
        qz1 qz1Var2 = l92.e;
        dr drVar = qz1Var.m;
        int j = dr.j(drVar, j.a);
        if (j == -1) {
            j = dr.j(qz1Var.m, j.b);
        }
        if (j != -1) {
            drVar = dr.n(drVar, j + 1, 0, 2);
        } else if (qz1Var.e() != null && drVar.c() == 2) {
            drVar = dr.p;
        }
        return !tp2.h(drVar.p(), ".class", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(nm1 nm1Var) {
        vo2 vo2Var;
        d12 d12Var;
        d12 d12Var2;
        vo2 vo2Var2 = r72.x;
        do {
            vo2Var = r72.x;
            d12Var = (d12) vo2Var.getValue();
            w02 w02Var = d12Var.p;
            je1 je1Var = (je1) w02Var.get(nm1Var);
            if (je1Var == null) {
                d12Var2 = d12Var;
            } else {
                Object obj = je1Var.a;
                Object obj2 = je1Var.b;
                uz2 uz2Var = w02Var.p;
                uz2 v = uz2Var.v(nm1Var != null ? nm1Var.hashCode() : 0, 0, nm1Var);
                if (uz2Var != v) {
                    w02Var = v == null ? w02.r : new w02(v, w02Var.q - 1);
                }
                qb2 qb2Var = qb2.Q;
                if (obj != qb2Var) {
                    V v2 = w02Var.get(obj);
                    v2.getClass();
                    w02Var = w02Var.f(obj, new je1(((je1) v2).a, obj2));
                }
                if (obj2 != qb2Var) {
                    V v3 = w02Var.get(obj2);
                    v3.getClass();
                    w02Var = w02Var.f(obj2, new je1(obj, ((je1) v3).b));
                }
                Object obj3 = obj != qb2Var ? d12Var.n : obj2;
                if (obj2 != qb2Var) {
                    obj = d12Var.o;
                }
                d12Var2 = new d12(obj3, obj, w02Var);
            }
            if (d12Var == d12Var2) {
                return;
            }
        } while (!vo2Var.j(d12Var, d12Var2));
    }

    public static ArrayList k(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((s52) obj) != s52.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(rv.l(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((s52) obj2).m);
        }
        return arrayList2;
    }

    public static eo l(byte[][] bArr, int i) {
        int i2 = i * 2;
        int length = bArr[0].length + i2;
        int length2 = bArr.length + i2;
        eo eoVar = new eo(length, length2);
        int[] iArr = eoVar.p;
        int length3 = iArr.length;
        for (int i3 = 0; i3 < length3; i3++) {
            iArr[i3] = 0;
        }
        int i4 = (length2 - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    eoVar.b(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return eoVar;
    }

    public static byte[] m(List list) {
        list.getClass();
        fq fqVar = new fq();
        ArrayList k = k(list);
        int size = k.size();
        int i = 0;
        while (i < size) {
            Object obj = k.get(i);
            i++;
            String str = (String) obj;
            fqVar.L(str.length());
            fqVar.Q(str);
        }
        return fqVar.s(fqVar.n);
    }

    public static cp1 n(Context context, op1 op1Var, Bundle bundle, zc1 zc1Var, hp1 hp1Var) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        op1Var.getClass();
        zc1Var.getClass();
        return new cp1(context, op1Var, bundle, zc1Var, hp1Var, uuid, null);
    }

    public static Typeface o(String str, jq0 jq0Var, int i) {
        if (i == 0 && Intrinsics.b(jq0Var, jq0.q) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int w = o70.w(i, jq0Var);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(w) : Typeface.create(str, w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01bd, code lost:
    
        r14 = (r14 - r4) - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e5, code lost:
    
        r14 = r14 - r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0430 A[LOOP:12: B:213:0x042e->B:214:0x0430, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final eo p(String str, int i, EnumMap enumMap) {
        int i2;
        gh0 gh0Var;
        xt xtVar;
        boolean z;
        String str2;
        char c;
        char c2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        String str3;
        int i9;
        int i10;
        int i11;
        if (i != 11) {
            lh.e("Can only encode PDF_417, but got ".concat(q40.v(i)));
            return null;
        }
        gh0 gh0Var2 = gh0.s;
        boolean booleanValue = enumMap.containsKey(gh0Var2) ? Boolean.valueOf(enumMap.get(gh0Var2).toString()).booleanValue() : false;
        gh0 gh0Var3 = gh0.t;
        if (enumMap.containsKey(gh0Var3)) {
            String obj = enumMap.get(gh0Var3).toString();
            if (obj == null) {
                ch2.l("Name is null");
            } else if (!obj.equals("AUTO")) {
                if (obj.equals("TEXT")) {
                    i2 = 2;
                } else if (obj.equals("BYTE")) {
                    i2 = 3;
                } else if (obj.equals("NUMERIC")) {
                    i2 = 4;
                } else {
                    lh.e("No enum constant com.google.zxing.pdf417.encoder.Compaction.".concat(obj));
                }
                gh0Var = gh0.u;
                if (enumMap.containsKey(gh0Var)) {
                    enumMap.get(gh0Var).getClass();
                    b71.o();
                    return null;
                }
                gh0 gh0Var4 = gh0.r;
                int parseInt = enumMap.containsKey(gh0Var4) ? Integer.parseInt(enumMap.get(gh0Var4).toString()) : 30;
                gh0 gh0Var5 = gh0.m;
                int parseInt2 = enumMap.containsKey(gh0Var5) ? Integer.parseInt(enumMap.get(gh0Var5).toString()) : 2;
                gh0 gh0Var6 = gh0.n;
                Charset forName = enumMap.containsKey(gh0Var6) ? Charset.forName(enumMap.get(gh0Var6).toString()) : null;
                String str4 = "Error correction level must be between 0 and 8!";
                if (parseInt2 < 0 || parseInt2 > 8) {
                    lh.e("Error correction level must be between 0 and 8!");
                    return null;
                }
                int i12 = 1 << (parseInt2 + 1);
                Charset charset = ux1.e;
                StringBuilder sb = new StringBuilder(str.length());
                if (forName == null) {
                    forName = charset;
                } else if (!charset.equals(forName) && (xtVar = (xt) xt.p.get(forName.name())) != null) {
                    int i13 = xtVar.m[0];
                    if (i13 >= 0 && i13 < 900) {
                        sb.append((char) 927);
                        sb.append((char) i13);
                    } else if (i13 < 810900) {
                        sb.append((char) 926);
                        sb.append((char) ((i13 / 900) - 1));
                        sb.append((char) (i13 % 900));
                    } else {
                        if (i13 >= 811800) {
                            throw new l93("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i13)));
                        }
                        sb.append((char) 925);
                        sb.append((char) (810900 - i13));
                    }
                }
                int length = str.length();
                int u = q40.u(i2);
                if (u == 1) {
                    z = booleanValue;
                    str2 = "Error correction level must be between 0 and 8!";
                    ux1.c(str, 0, length, sb, 0);
                } else if (u == 2) {
                    z = booleanValue;
                    str2 = "Error correction level must be between 0 and 8!";
                    byte[] bytes = str.getBytes(forName);
                    ux1.a(bytes, bytes.length, 1, sb);
                } else if (u != 3) {
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    while (i14 < length) {
                        int length2 = str.length();
                        char c3 = '0';
                        if (i14 < length2) {
                            int i17 = i14;
                            char charAt = str.charAt(i14);
                            int i18 = 0;
                            while (charAt >= '0' && charAt <= '9' && i17 < length2) {
                                i18++;
                                i17++;
                                if (i17 < length2) {
                                    charAt = str.charAt(i17);
                                }
                            }
                            i8 = i18;
                        } else {
                            i8 = 0;
                        }
                        if (i8 >= 13) {
                            sb.append((char) 902);
                            ux1.b(i14, i8, str, sb);
                            i14 += i8;
                            i16 = 2;
                            i15 = 0;
                        } else {
                            int length3 = str.length();
                            int i19 = i14;
                            while (true) {
                                if (i19 >= length3) {
                                    z3 = booleanValue;
                                    str3 = str4;
                                    break;
                                }
                                str3 = str4;
                                char charAt2 = str.charAt(i19);
                                z3 = booleanValue;
                                int i20 = 0;
                                while (i20 < 13 && charAt2 >= c3 && charAt2 <= '9' && i19 < length3) {
                                    i20++;
                                    i19++;
                                    if (i19 < length3) {
                                        charAt2 = str.charAt(i19);
                                    }
                                    c3 = '0';
                                }
                                if (i20 <= 0) {
                                    char charAt3 = str.charAt(i19);
                                    if (charAt3 != '\t' && charAt3 != '\n' && charAt3 != '\r' && (charAt3 < ' ' || charAt3 > '~')) {
                                        break;
                                    }
                                    i19++;
                                }
                                booleanValue = z3;
                                str4 = str3;
                                c3 = '0';
                            }
                            if (i9 >= 5 || i8 == length) {
                                if (i16 != 0) {
                                    sb.append((char) 900);
                                    i10 = 0;
                                    i16 = 0;
                                } else {
                                    i10 = i15;
                                }
                                i15 = ux1.c(str, i14, i9, sb, i10);
                                i14 += i9;
                            } else {
                                CharsetEncoder newEncoder = forName.newEncoder();
                                int length4 = str.length();
                                int i21 = i14;
                                while (i21 < length4) {
                                    char charAt4 = str.charAt(i21);
                                    int i22 = 0;
                                    while (i22 < 13 && charAt4 >= '0') {
                                        if (charAt4 > '9' || (i11 = i21 + (i22 = i22 + 1)) >= length4) {
                                            break;
                                        }
                                        charAt4 = str.charAt(i11);
                                    }
                                    if (i22 >= 13) {
                                        break;
                                    }
                                    char charAt5 = str.charAt(i21);
                                    if (!newEncoder.canEncode(charAt5)) {
                                        throw new l93("Non-encodable character detected: " + charAt5 + " (Unicode: " + ((int) charAt5) + ')');
                                    }
                                    i21++;
                                }
                                int i23 = i21 - i14;
                                if (i23 == 0) {
                                    i23 = 1;
                                }
                                int i24 = i14 + i23;
                                byte[] bytes2 = str.substring(i14, i24).getBytes(forName);
                                if (bytes2.length == 1 && i16 == 0) {
                                    ux1.a(bytes2, 1, 0, sb);
                                } else {
                                    ux1.a(bytes2, bytes2.length, i16, sb);
                                    i16 = 1;
                                    i15 = 0;
                                }
                                i14 = i24;
                            }
                            booleanValue = z3;
                            str4 = str3;
                        }
                    }
                    z = booleanValue;
                    str2 = str4;
                } else {
                    z = booleanValue;
                    str2 = "Error correction level must be between 0 and 8!";
                    sb.append((char) 902);
                    ux1.b(0, length, str, sb);
                }
                String sb2 = sb.toString();
                int length5 = sb2.length();
                float f = 0.0f;
                int[] iArr = null;
                for (int i25 = 2; i25 <= 30; i25++) {
                    int i26 = length5 + 1 + i12;
                    int i27 = i26 / i25;
                    int i28 = i27 + 1;
                    if (i25 * i28 < i26 + i25) {
                        i27 = i28;
                    }
                    if (i27 < 2) {
                        break;
                    }
                    if (i27 <= 30) {
                        float f2 = (((i25 * 17) + 69) * 0.357f) / (i27 * 2.0f);
                        if (iArr == null || Math.abs(f2 - 3.0f) <= Math.abs(f - 3.0f)) {
                            iArr = new int[]{i25, i27};
                            f = f2;
                        }
                    }
                }
                if (iArr == null) {
                    int i29 = length5 + 1 + i12;
                    int i30 = i29 / 2;
                    int i31 = i30 + 1;
                    if (2 * i31 < i29 + 2) {
                        i30 = i31;
                    }
                    if (i30 < 2) {
                        c = 0;
                        c2 = 1;
                        iArr = new int[]{2, 2};
                        if (iArr != null) {
                            throw new l93("Unable to fit message in columns");
                        }
                        int i32 = iArr[c];
                        int i33 = iArr[c2];
                        int i34 = (i32 * i33) - i12 > length5 + 1 ? (r5 - length5) - 1 : 0;
                        if (length5 + i12 + 1 > 929) {
                            throw new l93("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
                        }
                        int i35 = length5 + i34 + 1;
                        StringBuilder sb3 = new StringBuilder(i35);
                        sb3.append((char) i35);
                        sb3.append(sb2);
                        for (int i36 = 0; i36 < i34; i36++) {
                            sb3.append((char) 900);
                        }
                        String sb4 = sb3.toString();
                        int[][] iArr2 = s03.f;
                        if (parseInt2 < 0 || parseInt2 > 8) {
                            lh.e(str2);
                            return null;
                        }
                        char[] cArr = new char[i12];
                        int length6 = sb4.length();
                        for (int i37 = 0; i37 < length6; i37++) {
                            int i38 = i12 - 1;
                            int charAt6 = (sb4.charAt(i37) + cArr[i38]) % 929;
                            while (i38 > 0) {
                                cArr[i38] = (char) ((cArr[i38 - 1] + (929 - ((iArr2[parseInt2][i38] * charAt6) % 929))) % 929);
                                i38--;
                            }
                            cArr[0] = (char) ((929 - ((charAt6 * iArr2[parseInt2][0]) % 929)) % 929);
                        }
                        StringBuilder sb5 = new StringBuilder(i12);
                        for (int i39 = i12 - 1; i39 >= 0; i39--) {
                            char c4 = cArr[i39];
                            if (c4 != 0) {
                                cArr[i39] = (char) (929 - c4);
                            }
                            sb5.append(cArr[i39]);
                        }
                        String sb6 = sb5.toString();
                        gn gnVar = new gn(i33, i32);
                        String concat = sb4.concat(sb6);
                        int[][] iArr3 = iv1.d;
                        int i40 = 0;
                        int i41 = 0;
                        while (i40 < i33) {
                            int i42 = i40 % 3;
                            gnVar.b++;
                            iv1.w(130728, 17, gnVar.d());
                            if (i42 == 0) {
                                i5 = (i40 / 3) * 30;
                                i3 = ((i33 - 1) / 3) + i5;
                                i6 = i32 - 1;
                            } else if (i42 == 1) {
                                i5 = (i40 / 3) * 30;
                                int i43 = i33 - 1;
                                i3 = (parseInt2 * 3) + i5 + (i43 % 3);
                                i6 = i43 / 3;
                            } else {
                                int i44 = (i40 / 3) * 30;
                                i3 = (i32 - 1) + i44;
                                i4 = (parseInt2 * 3) + i44 + ((i33 - 1) % 3);
                                iv1.w(iArr3[i42][i3], 17, gnVar.d());
                                int i45 = i41;
                                for (i7 = 0; i7 < i32; i7++) {
                                    iv1.w(iArr3[i42][concat.charAt(i45)], 17, gnVar.d());
                                    i45++;
                                }
                                if (z) {
                                    iv1.w(iArr3[i42][i4], 17, gnVar.d());
                                    iv1.w(260649, 18, gnVar.d());
                                } else {
                                    iv1.w(260649, 1, gnVar.d());
                                }
                                i40++;
                                i41 = i45;
                            }
                            i4 = i6 + i5;
                            iv1.w(iArr3[i42][i3], 17, gnVar.d());
                            int i452 = i41;
                            while (i7 < i32) {
                            }
                            if (z) {
                            }
                            i40++;
                            i41 = i452;
                        }
                        byte[][] h = gnVar.h(1, 4);
                        if (h[0].length < h.length) {
                            h = w(h);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int length7 = 200 / h[0].length;
                        int length8 = 200 / h.length;
                        if (length7 >= length8) {
                            length7 = length8;
                        }
                        if (length7 <= 1) {
                            return l(h, parseInt);
                        }
                        byte[][] h2 = gnVar.h(length7, length7 << 2);
                        if (z2) {
                            h2 = w(h2);
                        }
                        return l(h2, parseInt);
                    }
                }
                c = 0;
                c2 = 1;
                if (iArr != null) {
                }
            }
            i2 = 0;
            gh0Var = gh0.u;
            if (enumMap.containsKey(gh0Var)) {
            }
        }
        i2 = 1;
        gh0Var = gh0.u;
        if (enumMap.containsKey(gh0Var)) {
        }
    }

    public static qz1 r(String str) {
        str.getClass();
        dr drVar = j.a;
        fq fqVar = new fq();
        fqVar.Q(str);
        return j.d(fqVar, false);
    }

    public static qz1 s(File file) {
        String str = qz1.n;
        String file2 = file.toString();
        file2.getClass();
        return r(file2);
    }

    public static boolean t() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static byte[][] w(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // defpackage.l22
    public Typeface a(int i, jq0 jq0Var) {
        return o(null, jq0Var, i);
    }

    @Override // defpackage.l22
    public Typeface c(xu0 xu0Var, jq0 jq0Var, int i) {
        String str;
        xu0Var.getClass();
        int i2 = jq0Var.m / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "sans-serif-thin";
        } else if (2 > i2 || i2 >= 4) {
            if (i2 != 4) {
                if (i2 == 5) {
                    str = "sans-serif-medium";
                } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                    str = "sans-serif-black";
                }
            }
            str = "sans-serif";
        } else {
            str = "sans-serif-light";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface o = o(str, jq0Var, i);
            if (!Intrinsics.b(o, Typeface.create(Typeface.DEFAULT, o70.w(i, jq0Var))) && !Intrinsics.b(o, o(null, jq0Var, i))) {
                typeface = o;
            }
        }
        return typeface == null ? o("sans-serif", jq0Var, i) : typeface;
    }

    @Override // defpackage.f52
    public void d() {
        switch (this.m) {
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.f52
    public void e(int i, Object obj) {
        String str;
        switch (this.m) {
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = BuildConfig.FLAVOR;
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0396 A[LOOP:3: B:99:0x0394->B:100:0x0396, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018e A[LOOP:1: B:66:0x0161->B:74:0x018e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0279  */
    @Override // defpackage.k93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eo f(String str, int i, EnumMap enumMap) {
        k93 njVar;
        boolean equals;
        rl1 rl1Var;
        byte[] bytes;
        int length;
        int i2;
        rl1 rl1Var2;
        gh0 gh0Var;
        int i3;
        int ordinal;
        int i4;
        gh0 gh0Var2;
        int i5;
        m43 m43Var;
        int i6;
        int i7;
        int e;
        int i8;
        int i9;
        int i10;
        int i11;
        char c;
        int i12;
        xt xtVar;
        int i13;
        int i14 = 3;
        switch (this.m) {
            case 0:
                switch (q40.u(i)) {
                    case 0:
                        njVar = new nj(1);
                        break;
                    case 1:
                        njVar = new fv();
                        break;
                    case 2:
                        njVar = new f01(2);
                        break;
                    case 3:
                        njVar = new f01(i14);
                        break;
                    case 4:
                        njVar = new f01(1);
                        break;
                    case 5:
                        njVar = new u30(2);
                        break;
                    case 6:
                        njVar = new af0(1);
                        break;
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                        njVar = new af0(0);
                        break;
                    case 8:
                        njVar = new f01(0);
                        break;
                    case 9:
                    case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                    case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                    default:
                        lh.e("No encoder available for format ".concat(q40.v(i)));
                        return null;
                    case 10:
                        njVar = new nm1(6);
                        break;
                    case 11:
                        njVar = new nm1(18);
                        break;
                    case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                        njVar = new ot2(5);
                        break;
                    case 15:
                        njVar = new af0(2);
                        break;
                }
                return njVar.f(str, i, enumMap);
            case 6:
                return p(str, i, enumMap);
            default:
                int[] iArr = yj1.j;
                if (str.isEmpty()) {
                    lh.e("Found empty contents");
                    return null;
                }
                if (i != 12) {
                    lh.e("Can only encode QR_CODE, but got ".concat(q40.v(i)));
                    return null;
                }
                gh0 gh0Var3 = gh0.m;
                if (enumMap.containsKey(gh0Var3)) {
                    String obj = enumMap.get(gh0Var3).toString();
                    if (obj == null) {
                        ch2.l("Name is null");
                    } else if (!obj.equals("L")) {
                        if (obj.equals("M")) {
                            i14 = 2;
                        } else if (!obj.equals("Q")) {
                            if (obj.equals("H")) {
                                i14 = 4;
                            } else {
                                lh.e("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(obj));
                            }
                        }
                        gh0 gh0Var4 = gh0.r;
                        int parseInt = enumMap.containsKey(gh0Var4) ? Integer.parseInt(enumMap.get(gh0Var4).toString()) : 4;
                        gh0 gh0Var5 = gh0.n;
                        boolean containsKey = enumMap.containsKey(gh0Var5);
                        String obj2 = containsKey ? enumMap.get(gh0Var5).toString() : "ISO-8859-1";
                        equals = "Shift_JIS".equals(obj2);
                        int i15 = 0;
                        rl1Var = rl1.BYTE;
                        if (equals) {
                            try {
                                bytes = str.getBytes("Shift_JIS");
                                length = bytes.length;
                            } catch (UnsupportedEncodingException unused) {
                            }
                            if (length % 2 == 0) {
                                for (0; i2 < length; i2 + 2) {
                                    int i16 = bytes[i2] & 255;
                                    i2 = ((i16 >= 129 && i16 <= 159) || (i16 >= 224 && i16 <= 235)) ? i2 + 2 : 0;
                                }
                                rl1Var2 = rl1.KANJI;
                                int[] iArr2 = rl1Var2.m;
                                co coVar = new co();
                                int i17 = 8;
                                if (rl1Var2 != rl1Var && containsKey && (xtVar = (xt) xt.p.get(obj2)) != null) {
                                    coVar.b(7, 4);
                                    coVar.b(xtVar.m[0], 8);
                                }
                                gh0Var = gh0.x;
                                if (enumMap.containsKey(gh0Var) || !Boolean.valueOf(enumMap.get(gh0Var).toString()).booleanValue()) {
                                    i3 = 4;
                                } else {
                                    i3 = 4;
                                    coVar.b(5, 4);
                                }
                                coVar.b(rl1Var2.n, i3);
                                co coVar2 = new co();
                                ordinal = rl1Var2.ordinal();
                                int i18 = 10;
                                if (ordinal == 1) {
                                    if (ordinal == 2) {
                                        int length2 = str.length();
                                        int i19 = 0;
                                        while (i19 < length2) {
                                            char charAt = str.charAt(i19);
                                            int i20 = charAt < '`' ? iArr[charAt] : -1;
                                            if (i20 == -1) {
                                                throw new l93();
                                            }
                                            int i21 = i17;
                                            int i22 = i19 + 1;
                                            if (i22 < length2) {
                                                char charAt2 = str.charAt(i22);
                                                int i23 = charAt2 < '`' ? iArr[charAt2] : -1;
                                                if (i23 == -1) {
                                                    throw new l93();
                                                }
                                                coVar2.b((i20 * 45) + i23, 11);
                                                i19 += 2;
                                            } else {
                                                coVar2.b(i20, 6);
                                                i19 = i22;
                                            }
                                            i17 = i21;
                                        }
                                    } else if (ordinal == i3) {
                                        try {
                                            for (byte b : str.getBytes(obj2)) {
                                                coVar2.b(b, 8);
                                            }
                                        } catch (UnsupportedEncodingException e2) {
                                            throw new l93(e2);
                                        }
                                    } else {
                                        if (ordinal != 6) {
                                            throw new l93("Invalid mode: ".concat(String.valueOf(rl1Var2)));
                                        }
                                        try {
                                            byte[] bytes2 = str.getBytes("Shift_JIS");
                                            int length3 = bytes2.length;
                                            for (int i24 = 0; i24 < length3; i24 += 2) {
                                                int i25 = ((bytes2[i24] & 255) << 8) | (bytes2[i24 + 1] & 255);
                                                int i26 = 33088;
                                                if (i25 < 33088 || i25 > 40956) {
                                                    if (i25 < 57408 || i25 > 60351) {
                                                        i12 = -1;
                                                        if (i12 != -1) {
                                                            throw new l93("Invalid byte sequence");
                                                        }
                                                        coVar2.b(((i12 >> 8) * 192) + (i12 & 255), 13);
                                                    } else {
                                                        i26 = 49472;
                                                    }
                                                }
                                                i12 = i25 - i26;
                                                if (i12 != -1) {
                                                }
                                            }
                                        } catch (UnsupportedEncodingException e3) {
                                            throw new l93(e3);
                                        }
                                    }
                                    i4 = i17;
                                } else {
                                    i4 = 8;
                                    int length4 = str.length();
                                    int i27 = 0;
                                    while (i27 < length4) {
                                        int charAt3 = str.charAt(i27) - '0';
                                        int i28 = i27 + 2;
                                        if (i28 < length4) {
                                            coVar2.b(((str.charAt(i27 + 1) - '0') * 10) + (charAt3 * 100) + (str.charAt(i28) - '0'), i18);
                                            i27 += 3;
                                        } else {
                                            i27++;
                                            if (i27 < length4) {
                                                coVar2.b((charAt3 * 10) + (str.charAt(i27) - '0'), 7);
                                                i27 = i28;
                                            } else {
                                                coVar2.b(charAt3, 4);
                                            }
                                        }
                                        i18 = 10;
                                    }
                                }
                                gh0Var2 = gh0.w;
                                if (enumMap.containsKey(gh0Var2)) {
                                    m43 a = m43.a(1);
                                    int i29 = coVar.n;
                                    int i30 = a.a;
                                    int i31 = iArr2[i30 <= 9 ? (char) 0 : i30 <= 26 ? (char) 1 : (char) 2] + i29 + coVar2.n;
                                    int i32 = 1;
                                    while (i32 <= 40) {
                                        m43 a2 = m43.a(i32);
                                        int i33 = a2.c;
                                        r5 r5Var = a2.b[q40.u(i14)];
                                        int i34 = r5Var.a;
                                        ak0[] ak0VarArr = (ak0[]) r5Var.b;
                                        int length5 = ak0VarArr.length;
                                        i5 = parseInt;
                                        int i35 = i15;
                                        int i36 = i35;
                                        while (i35 < length5) {
                                            int i37 = i35;
                                            i36 += ak0VarArr[i37].m;
                                            i35 = i37 + 1;
                                        }
                                        if (i33 - (i36 * i34) >= (i31 + 7) / 8) {
                                            int i38 = coVar.n;
                                            int i39 = a2.a;
                                            int i40 = iArr2[i39 <= 9 ? i15 : i39 <= 26 ? 1 : 2] + i38 + coVar2.n;
                                            int i41 = 1;
                                            while (i41 <= 40) {
                                                m43 a3 = m43.a(i41);
                                                int i42 = a3.c;
                                                r5 r5Var2 = a3.b[q40.u(i14)];
                                                int i43 = r5Var2.a;
                                                ak0[] ak0VarArr2 = (ak0[]) r5Var2.b;
                                                int length6 = ak0VarArr2.length;
                                                int i44 = i15;
                                                int i45 = i44;
                                                while (i44 < length6) {
                                                    i45 += ak0VarArr2[i44].m;
                                                    i44++;
                                                    i41 = i41;
                                                }
                                                int i46 = i41;
                                                if (i42 - (i45 * i43) >= (i40 + 7) / 8) {
                                                    m43Var = a3;
                                                } else {
                                                    i41 = i46 + 1;
                                                    i4 = 8;
                                                    i15 = 0;
                                                }
                                            }
                                            throw new l93("Data too big");
                                        }
                                        i32++;
                                        parseInt = i5;
                                        i4 = 8;
                                        i15 = 0;
                                    }
                                    throw new l93("Data too big");
                                }
                                m43Var = m43.a(Integer.parseInt(enumMap.get(gh0Var2).toString()));
                                int i47 = coVar.n;
                                int i48 = m43Var.a;
                                int i49 = iArr2[i48 <= 9 ? (char) 0 : i48 <= 26 ? (char) 1 : (char) 2] + i47 + coVar2.n;
                                int i50 = m43Var.c;
                                r5 r5Var3 = m43Var.b[q40.u(i14)];
                                int i51 = r5Var3.a;
                                int i52 = 0;
                                for (ak0 ak0Var : (ak0[]) r5Var3.b) {
                                    i52 += ak0Var.m;
                                }
                                if (i50 - (i52 * i51) < (i49 + 7) / 8) {
                                    throw new l93("Data too big for requested version");
                                }
                                i5 = parseInt;
                                int i53 = m43Var.a;
                                int i54 = m43Var.c;
                                co coVar3 = new co();
                                i6 = coVar.n;
                                coVar3.c(i6);
                                for (i7 = i15; i7 < i6; i7++) {
                                    coVar3.a(coVar.d(i7));
                                }
                                e = rl1Var2 != rl1Var ? coVar2.e() : str.length();
                                int i55 = iArr2[i53 > 9 ? i15 : i53 <= 26 ? 1 : 2];
                                i8 = 1 << i55;
                                if (e < i8) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(e);
                                    sb.append(" is bigger than ");
                                    sb.append(i8 - 1);
                                    throw new l93(sb.toString());
                                }
                                coVar3.b(e, i55);
                                int i56 = coVar2.n;
                                coVar3.c(coVar3.n + i56);
                                for (int i57 = i15; i57 < i56; i57++) {
                                    coVar3.a(coVar2.d(i57));
                                }
                                r5 r5Var4 = m43Var.b[q40.u(i14)];
                                int i58 = r5Var4.a;
                                ak0[] ak0VarArr3 = (ak0[]) r5Var4.b;
                                int length7 = ak0VarArr3.length;
                                int i59 = i15;
                                int i60 = i59;
                                while (i59 < length7) {
                                    i60 += ak0VarArr3[i59].m;
                                    i59++;
                                }
                                int i61 = i54 - (i60 * i58);
                                int i62 = i61 << 3;
                                if (coVar3.n > i62) {
                                    throw new l93("data bits cannot fit in the QR Code" + coVar3.n + " > " + i62);
                                }
                                for (int i63 = i15; i63 < 4 && coVar3.n < i62; i63++) {
                                    coVar3.a(i15);
                                }
                                boolean z = i15;
                                int i64 = coVar3.n & 7;
                                if (i64 > 0) {
                                    for (int i65 = i4; i64 < i65; i65 = 8) {
                                        coVar3.a(z);
                                        i64++;
                                        z = 0;
                                    }
                                }
                                int e4 = i61 - coVar3.e();
                                for (int i66 = 0; i66 < e4; i66++) {
                                    coVar3.b((i66 & 1) == 0 ? 236 : 17, 8);
                                }
                                if (coVar3.n != i62) {
                                    throw new l93("Bits size does not equal capacity");
                                }
                                int i67 = 0;
                                for (ak0 ak0Var2 : ak0VarArr3) {
                                    i67 += ak0Var2.m;
                                }
                                if (coVar3.e() != i61) {
                                    throw new l93("Number of bits and data bytes does not match");
                                }
                                ArrayList arrayList = new ArrayList(i67);
                                int i68 = 0;
                                int i69 = 0;
                                int i70 = 0;
                                int i71 = 0;
                                while (i68 < i67) {
                                    int[] iArr3 = new int[1];
                                    int[] iArr4 = new int[1];
                                    if (i68 >= i67) {
                                        throw new l93("Block ID too large");
                                    }
                                    int i72 = i54 % i67;
                                    int i73 = i67 - i72;
                                    int i74 = i54 / i67;
                                    int i75 = i61 / i67;
                                    int i76 = i75 + 1;
                                    int i77 = i53;
                                    int i78 = i74 - i75;
                                    int i79 = (i74 + 1) - i76;
                                    if (i78 != i79) {
                                        throw new l93("EC bytes mismatch");
                                    }
                                    if (i67 != i73 + i72) {
                                        throw new l93("RS blocks mismatch");
                                    }
                                    if (i54 != ((i76 + i79) * i72) + ((i75 + i78) * i73)) {
                                        throw new l93("Total bytes mismatch");
                                    }
                                    if (i68 < i73) {
                                        c = 0;
                                        iArr3[0] = i75;
                                        iArr4[0] = i78;
                                    } else {
                                        c = 0;
                                        iArr3[0] = i76;
                                        iArr4[0] = i79;
                                    }
                                    int i80 = iArr3[c];
                                    byte[] bArr = new byte[i80];
                                    int i81 = i69 << 3;
                                    int i82 = 0;
                                    while (i82 < i80) {
                                        int i83 = i68;
                                        int i84 = i67;
                                        int[] iArr5 = iArr4;
                                        int i85 = 0;
                                        for (int i86 = 0; i86 < 8; i86++) {
                                            if (coVar3.d(i81)) {
                                                i85 |= 1 << (7 - i86);
                                            }
                                            i81++;
                                        }
                                        bArr[i82] = (byte) i85;
                                        i82++;
                                        i67 = i84;
                                        i68 = i83;
                                        iArr4 = iArr5;
                                    }
                                    int i87 = i68;
                                    int i88 = i67;
                                    int i89 = iArr4[0];
                                    int[] iArr6 = new int[i80 + i89];
                                    for (int i90 = 0; i90 < i80; i90++) {
                                        iArr6[i90] = bArr[i90] & 255;
                                    }
                                    new tt1(yu0.k).m(iArr6, i89);
                                    byte[] bArr2 = new byte[i89];
                                    for (int i91 = 0; i91 < i89; i91++) {
                                        bArr2[i91] = (byte) iArr6[i80 + i91];
                                    }
                                    arrayList.add(new po(bArr, bArr2));
                                    i70 = Math.max(i70, i80);
                                    i71 = Math.max(i71, i89);
                                    i69 += iArr3[0];
                                    i68 = i87 + 1;
                                    i67 = i88;
                                    i53 = i77;
                                }
                                int i92 = i53;
                                if (i61 != i69) {
                                    throw new l93("Data bytes does not match offset");
                                }
                                co coVar4 = new co();
                                for (int i93 = 0; i93 < i70; i93++) {
                                    int size = arrayList.size();
                                    int i94 = 0;
                                    while (i94 < size) {
                                        Object obj3 = arrayList.get(i94);
                                        i94++;
                                        byte[] bArr3 = ((po) obj3).a;
                                        if (i93 < bArr3.length) {
                                            coVar4.b(bArr3[i93], 8);
                                        }
                                    }
                                }
                                for (int i95 = 0; i95 < i71; i95++) {
                                    int size2 = arrayList.size();
                                    int i96 = 0;
                                    while (i96 < size2) {
                                        Object obj4 = arrayList.get(i96);
                                        i96++;
                                        byte[] bArr4 = ((po) obj4).b;
                                        if (i95 < bArr4.length) {
                                            coVar4.b(bArr4[i95], 8);
                                        }
                                    }
                                }
                                if (i54 != coVar4.e()) {
                                    StringBuilder n = in1.n(i54, "Interleaving error: ", " and ");
                                    n.append(coVar4.e());
                                    n.append(" differ.");
                                    throw new l93(n.toString());
                                }
                                int i97 = (i92 * 4) + 17;
                                boolean z2 = false;
                                yq yqVar = new yq(i97, i97, 0);
                                int i98 = yqVar.o;
                                int i99 = yqVar.n;
                                int i100 = Integer.MAX_VALUE;
                                int i101 = 0;
                                int i102 = -1;
                                while (i101 < 8) {
                                    l41.r(coVar4, i14, m43Var, i101, yqVar);
                                    int y = tk3.y(yqVar, z2) + tk3.y(yqVar, true);
                                    byte[][] bArr5 = (byte[][]) yqVar.p;
                                    int i103 = 0;
                                    for (int i104 = 0; i104 < i98 - 1; i104++) {
                                        byte[] bArr6 = bArr5[i104];
                                        int i105 = 0;
                                        while (i105 < i99 - 1) {
                                            byte b2 = bArr6[i105];
                                            int i106 = i105 + 1;
                                            int i107 = i101;
                                            if (b2 == bArr6[i106]) {
                                                byte[] bArr7 = bArr5[i104 + 1];
                                                if (b2 == bArr7[i105] && b2 == bArr7[i106]) {
                                                    i103++;
                                                }
                                            }
                                            i105 = i106;
                                            i101 = i107;
                                        }
                                    }
                                    int i108 = i101;
                                    int i109 = (i103 * 3) + y;
                                    int i110 = 0;
                                    for (int i111 = 0; i111 < i98; i111++) {
                                        int i112 = 0;
                                        while (i112 < i99) {
                                            byte[] bArr8 = bArr5[i111];
                                            int i113 = i112 + 6;
                                            if (i113 < i99) {
                                                i9 = i110;
                                                byte b3 = 1;
                                                if (bArr8[i112] == 1 && bArr8[i112 + 1] == 0 && bArr8[i112 + 2] == 1 && bArr8[i112 + 3] == 1 && bArr8[i112 + 4] == 1 && bArr8[i112 + 5] == 0 && bArr8[i113] == 1) {
                                                    int max = Math.max(i112 - 4, 0);
                                                    int min = Math.min(i112, bArr8.length);
                                                    while (true) {
                                                        if (max < min) {
                                                            i10 = i112;
                                                            if (bArr8[max] == b3) {
                                                                int max2 = Math.max(i10 + 7, 0);
                                                                int min2 = Math.min(i10 + 11, bArr8.length);
                                                                while (max2 < min2) {
                                                                    if (bArr8[max2] != b3) {
                                                                        max2++;
                                                                        b3 = 1;
                                                                    }
                                                                }
                                                            } else {
                                                                max++;
                                                                i112 = i10;
                                                                b3 = 1;
                                                            }
                                                        } else {
                                                            i10 = i112;
                                                        }
                                                    }
                                                    i110 = i9 + 1;
                                                    i11 = i111 + 6;
                                                    if (i11 >= i98) {
                                                        byte b4 = 1;
                                                        if (bArr5[i111][i10] == 1 && bArr5[i111 + 1][i10] == 0 && bArr5[i111 + 2][i10] == 1 && bArr5[i111 + 3][i10] == 1 && bArr5[i111 + 4][i10] == 1 && bArr5[i111 + 5][i10] == 0 && bArr5[i11][i10] == 1) {
                                                            int max3 = Math.max(i111 - 4, 0);
                                                            int min3 = Math.min(i111, bArr5.length);
                                                            while (true) {
                                                                if (max3 < min3) {
                                                                    if (bArr5[max3][i10] == b4) {
                                                                        int min4 = Math.min(i111 + 11, bArr5.length);
                                                                        for (int max4 = Math.max(i111 + 7, 0); max4 < min4; max4++) {
                                                                            if (bArr5[max4][i10] == 1) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        max3++;
                                                                        b4 = 1;
                                                                    }
                                                                }
                                                            }
                                                            i110++;
                                                        }
                                                    }
                                                    i112 = i10 + 1;
                                                }
                                            } else {
                                                i9 = i110;
                                            }
                                            i10 = i112;
                                            i110 = i9;
                                            i11 = i111 + 6;
                                            if (i11 >= i98) {
                                            }
                                            i112 = i10 + 1;
                                        }
                                    }
                                    int i114 = (i110 * 40) + i109;
                                    int i115 = 0;
                                    int i116 = 0;
                                    while (i115 < i98) {
                                        byte[] bArr9 = bArr5[i115];
                                        int i117 = i116;
                                        for (int i118 = 0; i118 < i99; i118++) {
                                            if (bArr9[i118] == 1) {
                                                i117++;
                                            }
                                        }
                                        i115++;
                                        i116 = i117;
                                    }
                                    int i119 = i98 * i99;
                                    int abs = (((Math.abs((i116 << 1) - i119) * 10) / i119) * 10) + i114;
                                    if (abs < i100) {
                                        i100 = abs;
                                        i102 = i108;
                                    }
                                    i101 = i108 + 1;
                                    z2 = false;
                                }
                                l41.r(coVar4, i14, m43Var, i102, yqVar);
                                int i120 = i5 << 1;
                                int i121 = i99 + i120;
                                int i122 = i120 + i98;
                                int max5 = Math.max(200, i121);
                                int max6 = Math.max(200, i122);
                                int min5 = Math.min(max5 / i121, max6 / i122);
                                int i123 = (max5 - (i99 * min5)) / 2;
                                int i124 = (max6 - (i98 * min5)) / 2;
                                eo eoVar = new eo(max5, max6);
                                int i125 = 0;
                                while (i125 < i98) {
                                    int i126 = i123;
                                    int i127 = 0;
                                    while (i127 < i99) {
                                        if (yqVar.r(i127, i125) == 1) {
                                            eoVar.c(i126, i124, min5, min5);
                                        }
                                        i127++;
                                        i126 += min5;
                                    }
                                    i125++;
                                    i124 += min5;
                                }
                                return eoVar;
                            }
                        }
                        i13 = 0;
                        boolean z3 = false;
                        boolean z4 = false;
                        while (true) {
                            if (i13 < str.length()) {
                                char charAt4 = str.charAt(i13);
                                if (charAt4 >= '0' && charAt4 <= '9') {
                                    z4 = true;
                                } else if ((charAt4 < '`' ? iArr[charAt4] : -1) == -1) {
                                    break;
                                } else {
                                    z3 = true;
                                }
                                i13++;
                            } else if (z3) {
                                rl1Var2 = rl1.ALPHANUMERIC;
                            } else if (z4) {
                                rl1Var2 = rl1.NUMERIC;
                            }
                        }
                        int[] iArr22 = rl1Var2.m;
                        co coVar5 = new co();
                        int i172 = 8;
                        if (rl1Var2 != rl1Var) {
                        }
                        gh0Var = gh0.x;
                        if (enumMap.containsKey(gh0Var)) {
                        }
                        i3 = 4;
                        coVar5.b(rl1Var2.n, i3);
                        co coVar22 = new co();
                        ordinal = rl1Var2.ordinal();
                        int i182 = 10;
                        if (ordinal == 1) {
                        }
                        gh0Var2 = gh0.w;
                        if (enumMap.containsKey(gh0Var2)) {
                        }
                        int i532 = m43Var.a;
                        int i542 = m43Var.c;
                        co coVar32 = new co();
                        i6 = coVar5.n;
                        coVar32.c(i6);
                        while (i7 < i6) {
                        }
                        if (rl1Var2 != rl1Var) {
                        }
                        int i552 = iArr22[i532 > 9 ? i15 : i532 <= 26 ? 1 : 2];
                        i8 = 1 << i552;
                        if (e < i8) {
                        }
                    }
                    i14 = 0;
                    gh0 gh0Var42 = gh0.r;
                    if (enumMap.containsKey(gh0Var42)) {
                    }
                    gh0 gh0Var52 = gh0.n;
                    boolean containsKey2 = enumMap.containsKey(gh0Var52);
                    if (containsKey2) {
                    }
                    equals = "Shift_JIS".equals(obj2);
                    int i152 = 0;
                    rl1Var = rl1.BYTE;
                    if (equals) {
                    }
                    i13 = 0;
                    boolean z32 = false;
                    boolean z42 = false;
                    while (true) {
                        if (i13 < str.length()) {
                        }
                        i13++;
                    }
                    int[] iArr222 = rl1Var2.m;
                    co coVar52 = new co();
                    int i1722 = 8;
                    if (rl1Var2 != rl1Var) {
                    }
                    gh0Var = gh0.x;
                    if (enumMap.containsKey(gh0Var)) {
                    }
                    i3 = 4;
                    coVar52.b(rl1Var2.n, i3);
                    co coVar222 = new co();
                    ordinal = rl1Var2.ordinal();
                    int i1822 = 10;
                    if (ordinal == 1) {
                    }
                    gh0Var2 = gh0.w;
                    if (enumMap.containsKey(gh0Var2)) {
                    }
                    int i5322 = m43Var.a;
                    int i5422 = m43Var.c;
                    co coVar322 = new co();
                    i6 = coVar52.n;
                    coVar322.c(i6);
                    while (i7 < i6) {
                    }
                    if (rl1Var2 != rl1Var) {
                    }
                    int i5522 = iArr222[i5322 > 9 ? i152 : i5322 <= 26 ? 1 : 2];
                    i8 = 1 << i5522;
                    if (e < i8) {
                    }
                }
                i14 = 1;
                gh0 gh0Var422 = gh0.r;
                if (enumMap.containsKey(gh0Var422)) {
                }
                gh0 gh0Var522 = gh0.n;
                boolean containsKey22 = enumMap.containsKey(gh0Var522);
                if (containsKey22) {
                }
                equals = "Shift_JIS".equals(obj2);
                int i1522 = 0;
                rl1Var = rl1.BYTE;
                if (equals) {
                }
                i13 = 0;
                boolean z322 = false;
                boolean z422 = false;
                while (true) {
                    if (i13 < str.length()) {
                    }
                    i13++;
                }
                int[] iArr2222 = rl1Var2.m;
                co coVar522 = new co();
                int i17222 = 8;
                if (rl1Var2 != rl1Var) {
                }
                gh0Var = gh0.x;
                if (enumMap.containsKey(gh0Var)) {
                }
                i3 = 4;
                coVar522.b(rl1Var2.n, i3);
                co coVar2222 = new co();
                ordinal = rl1Var2.ordinal();
                int i18222 = 10;
                if (ordinal == 1) {
                }
                gh0Var2 = gh0.w;
                if (enumMap.containsKey(gh0Var2)) {
                }
                int i53222 = m43Var.a;
                int i54222 = m43Var.c;
                co coVar3222 = new co();
                i6 = coVar522.n;
                coVar3222.c(i6);
                while (i7 < i6) {
                }
                if (rl1Var2 != rl1Var) {
                }
                int i55222 = iArr2222[i53222 > 9 ? i1522 : i53222 <= 26 ? 1 : 2];
                i8 = 1 << i55222;
                if (e < i8) {
                }
                break;
        }
    }

    @Override // defpackage.w52
    public Object get() {
        dq2 dq2Var = new dq2(15);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            ch2.l("Null flags");
            return null;
        }
        hashMap.put(y42.m, new fm(30000L, 86400000L, set));
        if (set == null) {
            ch2.l("Null flags");
            return null;
        }
        hashMap.put(y42.o, new fm(1000L, 86400000L, set));
        if (set == null) {
            ch2.l("Null flags");
            return null;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(re2.n)));
        if (unmodifiableSet == null) {
            ch2.l("Null flags");
            return null;
        }
        hashMap.put(y42.n, new fm(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() >= y42.values().length) {
            new HashMap();
            return new em(dq2Var, hashMap);
        }
        lh.g("Not all priorities have been configured");
        return null;
    }

    public int q() {
        switch (this.m) {
            case 3:
                return 16;
            default:
                return 8;
        }
    }

    public String toString() {
        switch (this.m) {
            case 28:
                return "SharingStarted.Eagerly";
            case 29:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    private final void u() {
    }

    @Override // defpackage.cu1
    public int b(int i) {
        return i;
    }

    @Override // defpackage.cu1
    public int g(int i) {
        return i;
    }

    private final void v(int i, Object obj) {
    }

    public void x(m32 m32Var, int i, int i2) {
    }

    @Override // defpackage.cf2
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.cf2
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
