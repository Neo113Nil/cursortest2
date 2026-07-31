package B;

import I.C0143d;
import I.C0156j0;
import I.W0;
import a.AbstractC0235a;
import a0.C0238c;
import a0.C0241f;
import android.R;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import e2.InterfaceC0426e;
import h0.AbstractC0459b;
import h0.C0448A;
import h0.C0466i;
import h0.C0467j;
import h0.C0468k;
import h0.C0469l;
import h0.C0470m;
import h0.C0471n;
import h0.C0472o;
import h0.C0473p;
import h0.C0474q;
import h0.C0475r;
import h0.C0476s;
import h1.C0485c;
import h1.InterfaceC0490h;
import j.AbstractC0522D;
import j.C0519A;
import j.C0550x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l1.C0594c;
import m.C0606B;
import m.InterfaceC0605A;
import m.InterfaceC0633s;
import m.s0;
import m1.RunnableC0649g;
import p.C0756c0;
import t2.AbstractC1035F;
import t2.C1045P;
import t2.InterfaceC1053f;
import u2.AbstractC1151c;
import x1.C1222a;
import x1.C1225d;
import x1.C1226e;

/* loaded from: classes.dex */
public class Y implements InterfaceC0490h, InterfaceC0633s {

    /* renamed from: d, reason: collision with root package name */
    public Object f334d;

    public /* synthetic */ Y(Object obj) {
        this.f334d = obj;
    }

    public static C0756c0 k(A1.c cVar) {
        HashMap hashMap = new HashMap(5);
        hashMap.put("id", new C1222a("id", "INTEGER", true, 1, null, 1));
        hashMap.put("name", new C1222a("name", "TEXT", true, 0, null, 1));
        hashMap.put("phone", new C1222a("phone", "TEXT", true, 0, null, 1));
        hashMap.put("note", new C1222a("note", "TEXT", true, 0, null, 1));
        hashMap.put("createdAt", new C1222a("createdAt", "INTEGER", true, 0, null, 1));
        C1226e c1226e = new C1226e("clients", hashMap, new HashSet(0), new HashSet(0));
        C1226e a3 = C1226e.a(cVar, "clients");
        if (!c1226e.equals(a3)) {
            return new C0756c0("clients(com.gatesof.olympus.martu.marku.data.db.ClientEntity).\n Expected:\n" + c1226e + "\n Found:\n" + a3, false);
        }
        HashMap hashMap2 = new HashMap(7);
        hashMap2.put("id", new C1222a("id", "INTEGER", true, 1, null, 1));
        hashMap2.put("clientId", new C1222a("clientId", "INTEGER", false, 0, null, 1));
        hashMap2.put("clientName", new C1222a("clientName", "TEXT", true, 0, null, 1));
        hashMap2.put("service", new C1222a("service", "TEXT", true, 0, null, 1));
        hashMap2.put("price", new C1222a("price", "REAL", true, 0, null, 1));
        hashMap2.put("note", new C1222a("note", "TEXT", true, 0, null, 1));
        hashMap2.put("timestamp", new C1222a("timestamp", "INTEGER", true, 0, null, 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new C1225d("index_haircuts_clientId", false, Arrays.asList("clientId"), Arrays.asList("ASC")));
        C1226e c1226e2 = new C1226e("haircuts", hashMap2, hashSet, hashSet2);
        C1226e a4 = C1226e.a(cVar, "haircuts");
        if (c1226e2.equals(a4)) {
            return new C0756c0((String) null, true);
        }
        return new C0756c0("haircuts(com.gatesof.olympus.martu.marku.data.db.HaircutEntity).\n Expected:\n" + c1226e2 + "\n Found:\n" + a4, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:399:0x015c, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList l(Y y3, String str) {
        int i3;
        int i4;
        char charAt;
        ArrayList arrayList;
        int i5;
        char c2;
        int i6;
        Y y4;
        ArrayList arrayList2;
        char c3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j3;
        boolean z3;
        long j4;
        long floatToRawIntBits;
        long j5;
        long floatToRawIntBits2;
        long j6;
        long j7;
        long floatToRawIntBits3;
        int floatToRawIntBits4;
        char c4;
        char c5;
        int i15;
        char c6;
        long j8;
        int floatToRawIntBits5;
        float intBitsToFloat;
        Y y5 = y3;
        ArrayList arrayList3 = new ArrayList();
        int length = str.length();
        int i16 = 0;
        while (true) {
            i3 = 32;
            if (i16 >= length || f2.j.g(str.charAt(i16), 32) > 0) {
                break;
            }
            i16++;
        }
        while (length > i16 && f2.j.g(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i17 = 0;
        while (i16 < length) {
            while (true) {
                i4 = i16 + 1;
                charAt = str.charAt(i16);
                int i18 = charAt | ' ';
                if ((i18 - 122) * (i18 - 97) <= 0 && i18 != 101) {
                    break;
                }
                if (i4 >= length) {
                    charAt = 0;
                    break;
                }
                i16 = i4;
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i17 = 0;
                    while (true) {
                        if (i4 >= length || f2.j.g(str.charAt(i4), i3) > 0) {
                            if (i4 != length) {
                                c2 = charAt;
                                char charAt2 = str.charAt(i4);
                                boolean z4 = charAt2 == '-';
                                if (z4) {
                                    i7 = i4 + 1;
                                    if (i7 == length) {
                                        j8 = i7 << i3;
                                        floatToRawIntBits5 = Float.floatToRawIntBits(Float.NaN);
                                    } else {
                                        c3 = str.charAt(i7);
                                        if (((char) (c3 - '0')) >= '\n' && c3 != '.') {
                                            j8 = i7 << i3;
                                            floatToRawIntBits5 = Float.floatToRawIntBits(Float.NaN);
                                        }
                                    }
                                } else {
                                    c3 = charAt2;
                                    i7 = i4;
                                }
                                int length2 = str.length();
                                int i19 = i7;
                                long j9 = 0;
                                while (i19 != length) {
                                    int i20 = c3 - '0';
                                    if (((char) i20) >= '\n') {
                                        break;
                                    }
                                    j9 = (j9 * 10) + i20;
                                    i19++;
                                    c3 = i19 < length2 ? str.charAt(i19) : (char) 0;
                                }
                                int i21 = i19 - i7;
                                if (i19 == length || c3 != '.') {
                                    i8 = i17;
                                    i9 = i19;
                                    i10 = i9;
                                    i11 = i21;
                                    i12 = 0;
                                } else {
                                    int i22 = i19 + 1;
                                    i10 = i22;
                                    while (true) {
                                        if (length - i10 < 4) {
                                            i8 = i17;
                                            i15 = i21;
                                            break;
                                        }
                                        i8 = i17;
                                        i15 = i21;
                                        long charAt3 = str.charAt(i10) | (str.charAt(i10 + 1) << 16) | (str.charAt(i10 + 2) << 32) | (str.charAt(i10 + 3) << 48);
                                        long j10 = charAt3 - 13511005043687472L;
                                        int i23 = (((charAt3 + 19703549022044230L) | j10) & (-35747867511423104L)) != 0 ? -1 : (int) ((j10 * 281475406208040961L) >>> 48);
                                        if (i23 < 0) {
                                            break;
                                        }
                                        j9 = (j9 * 10000) + i23;
                                        i10 += 4;
                                        i17 = i8;
                                        i21 = i15;
                                    }
                                    if (i10 < length2) {
                                        c6 = str.charAt(i10);
                                        while (i10 != length) {
                                            int i24 = c6 - '0';
                                            if (((char) i24) >= '\n') {
                                                break;
                                            }
                                            j9 = (j9 * 10) + i24;
                                            i10++;
                                            if (i10 < length2) {
                                                c6 = str.charAt(i10);
                                            }
                                        }
                                        i12 = i22 - i10;
                                        i11 = i15 - i12;
                                        c3 = c6;
                                        i9 = i22;
                                    }
                                    c6 = 0;
                                }
                                if (i11 == 0) {
                                    arrayList = arrayList3;
                                    j4 = 4294967295L;
                                    i5 = length;
                                    floatToRawIntBits = (i10 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
                                    i6 = 32;
                                } else {
                                    if ((c3 | ' ') == 101) {
                                        i13 = i10 + 1;
                                        if (i13 < length2) {
                                            c5 = str.charAt(i13);
                                            c4 = '-';
                                        } else {
                                            c4 = '-';
                                            c5 = 0;
                                        }
                                        boolean z5 = c5 == c4;
                                        if (z5 || c5 == '+') {
                                            i13 = i10 + 2;
                                        }
                                        char charAt4 = str.charAt(i13);
                                        i14 = 0;
                                        while (true) {
                                            if (i13 == length) {
                                                arrayList = arrayList3;
                                                break;
                                            }
                                            int i25 = charAt4 - '0';
                                            arrayList = arrayList3;
                                            if (((char) i25) >= '\n') {
                                                break;
                                            }
                                            if (i14 < 1024) {
                                                i14 = (i14 * 10) + i25;
                                            }
                                            i13++;
                                            charAt4 = i13 < length2 ? str.charAt(i13) : (char) 0;
                                            arrayList3 = arrayList;
                                        }
                                        if (z5) {
                                            i14 = -i14;
                                        }
                                        i12 += i14;
                                    } else {
                                        arrayList = arrayList3;
                                        i13 = i10;
                                        i14 = 0;
                                    }
                                    int i26 = 19;
                                    if (i11 > 19) {
                                        char charAt5 = str.charAt(i7);
                                        int i27 = i7;
                                        while (true) {
                                            if (i13 == length) {
                                                break;
                                            }
                                            if (charAt5 != '0' && charAt5 != '.') {
                                                i26 = 19;
                                                break;
                                            }
                                            if (charAt5 == '0') {
                                                i11--;
                                            }
                                            i27++;
                                            charAt5 = i27 < length2 ? str.charAt(i27) : (char) 0;
                                            i26 = 19;
                                        }
                                        if (i11 > i26) {
                                            char charAt6 = str.charAt(i7);
                                            long j11 = 0;
                                            while (true) {
                                                i5 = length;
                                                if (i7 == i19 || Long.compare(j11 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                    break;
                                                }
                                                j11 = (j11 * 10) + (charAt6 - '0');
                                                i7++;
                                                charAt6 = i7 < length2 ? str.charAt(i7) : (char) 0;
                                                length = i5;
                                            }
                                            if (Long.compare(j11 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                i12 = (i19 - i7) + i14;
                                            } else {
                                                char charAt7 = str.charAt(i9);
                                                int i28 = i9;
                                                while (i28 != i10 && Long.compare(j11 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                    j11 = (j11 * 10) + (charAt7 - '0');
                                                    i28++;
                                                    charAt7 = i28 < length2 ? str.charAt(i28) : (char) 0;
                                                }
                                                i12 = (i9 - i28) + i14;
                                            }
                                            j3 = j11;
                                            z3 = true;
                                            if (-10 > i12 && i12 < 11 && !z3 && Long.compare(j3 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
                                                float f3 = j3;
                                                float[] fArr = AbstractC0459b.f5908a;
                                                float f4 = i12 < 0 ? f3 / fArr[-i12] : f3 * fArr[i12];
                                                if (z4) {
                                                    f4 = -f4;
                                                }
                                                j5 = i13 << 32;
                                                floatToRawIntBits4 = Float.floatToRawIntBits(f4);
                                            } else if (j3 != 0) {
                                                j5 = i13 << 32;
                                                floatToRawIntBits4 = Float.floatToRawIntBits(z4 ? -0.0f : 0.0f);
                                            } else if (-126 > i12 || i12 >= 128) {
                                                f2.j.e(str.substring(i4, i13), "this as java.lang.String…ing(startIndex, endIndex)");
                                                i6 = 32;
                                                j4 = 4294967295L;
                                                floatToRawIntBits = (i13 << 32) | (Float.floatToRawIntBits(Float.parseFloat(r0)) & 4294967295L);
                                            } else {
                                                long j12 = AbstractC0459b.f5909b[i12 + 325];
                                                int numberOfLeadingZeros = Long.numberOfLeadingZeros(j3);
                                                long j13 = j3 << numberOfLeadingZeros;
                                                long j14 = j13 & 4294967295L;
                                                long j15 = j13 >>> 32;
                                                long j16 = j12 & 4294967295L;
                                                long j17 = j12 >>> 32;
                                                long j18 = j15 * j17;
                                                long j19 = j17 * j14;
                                                long j20 = j18 + ((((j15 * j16) + ((j14 * j16) >>> 32)) + (j19 & 4294967295L)) >>> 32) + (j19 >>> 32);
                                                int i29 = (int) (j20 >>> 63);
                                                long j21 = j20 >>> (i29 + 9);
                                                int i30 = numberOfLeadingZeros + (i29 ^ 1);
                                                long j22 = j20 & 511;
                                                if (j22 == 511 || (j22 == 0 && (j21 & 3) == 1)) {
                                                    f2.j.e(str.substring(i4, i13), "this as java.lang.String…ing(startIndex, endIndex)");
                                                    j5 = i13 << 32;
                                                    floatToRawIntBits2 = Float.floatToRawIntBits(Float.parseFloat(r0)) & 4294967295L;
                                                    floatToRawIntBits = j5 | floatToRawIntBits2;
                                                    i6 = 32;
                                                    j4 = 4294967295L;
                                                } else {
                                                    long j23 = (j21 + 1) >>> 1;
                                                    if (j23 >= 9007199254740992L) {
                                                        i30--;
                                                        j23 = 4503599627370496L;
                                                    }
                                                    long j24 = j23 & (-4503599627370497L);
                                                    long j25 = ((((i12 * 217706) >> 16) + 1024) + 63) - i30;
                                                    if (j25 < 1 || j25 > 2046) {
                                                        i6 = 32;
                                                        j6 = 4294967295L;
                                                        String substring = str.substring(i4, i13);
                                                        f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                                        j7 = i13 << 32;
                                                        floatToRawIntBits3 = Float.floatToRawIntBits(Float.parseFloat(substring));
                                                    } else {
                                                        i6 = 32;
                                                        j7 = i13 << 32;
                                                        floatToRawIntBits3 = Float.floatToRawIntBits((float) Double.longBitsToDouble((j25 << 52) | j24 | (z4 ? Long.MIN_VALUE : 0L)));
                                                        j6 = 4294967295L;
                                                    }
                                                    floatToRawIntBits = j7 | (floatToRawIntBits3 & j6);
                                                    j4 = j6;
                                                }
                                            }
                                            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
                                            floatToRawIntBits = j5 | floatToRawIntBits2;
                                            i6 = 32;
                                            j4 = 4294967295L;
                                        }
                                    }
                                    i5 = length;
                                    j3 = j9;
                                    z3 = false;
                                    if (-10 > i12) {
                                    }
                                    if (j3 != 0) {
                                    }
                                }
                                int i31 = (int) (floatToRawIntBits >>> i6);
                                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j4));
                                if (Float.isNaN(intBitsToFloat)) {
                                    y4 = y3;
                                    float[] fArr2 = (float[]) y4.f334d;
                                    i17 = i8 + 1;
                                    fArr2[i8] = intBitsToFloat;
                                    if (i17 >= fArr2.length) {
                                        float[] fArr3 = new float[i17 * 2];
                                        y4.f334d = fArr3;
                                        System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
                                    }
                                    i4 = i31;
                                } else {
                                    y4 = y3;
                                    i4 = i31;
                                    i17 = i8;
                                }
                                while (i4 < i5 && str.charAt(i4) == ',') {
                                    i4++;
                                }
                                if (i4 < i5 || Float.isNaN(intBitsToFloat)) {
                                    break;
                                    break;
                                }
                                i3 = i6;
                                length = i5;
                                charAt = c2;
                                arrayList3 = arrayList;
                            } else {
                                c2 = charAt;
                                j8 = i4 << i3;
                                floatToRawIntBits5 = Float.floatToRawIntBits(Float.NaN);
                            }
                            arrayList = arrayList3;
                            i5 = length;
                            floatToRawIntBits = j8 | (floatToRawIntBits5 & 4294967295L);
                            i6 = i3;
                            i8 = i17;
                            j4 = 4294967295L;
                            int i312 = (int) (floatToRawIntBits >>> i6);
                            intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j4));
                            if (Float.isNaN(intBitsToFloat)) {
                            }
                            while (i4 < i5) {
                                i4++;
                            }
                            if (i4 < i5) {
                                break;
                            }
                            i3 = i6;
                            length = i5;
                            charAt = c2;
                            arrayList3 = arrayList;
                        } else {
                            i4++;
                        }
                    }
                } else {
                    arrayList = arrayList3;
                    i5 = length;
                    c2 = charAt;
                    i6 = i3;
                    y4 = y5;
                }
                i16 = i4;
                float[] fArr4 = (float[]) y4.f334d;
                char c7 = c2;
                if (c7 == 'z' || c7 == 'Z') {
                    arrayList2 = arrayList;
                    arrayList2.add(C0467j.f5990c);
                } else {
                    arrayList2 = arrayList;
                    int i32 = 2;
                    if (c7 == 'm') {
                        int i33 = i17 - 2;
                        if (i33 >= 0) {
                            arrayList2.add(new h0.v(fArr4[0], fArr4[1]));
                            while (i32 <= i33) {
                                arrayList2.add(new h0.u(fArr4[i32], fArr4[i32 + 1]));
                                i32 += 2;
                            }
                        }
                    } else {
                        if (c7 == 'M') {
                            int i34 = i17 - 2;
                            if (i34 >= 0) {
                                arrayList2.add(new C0471n(fArr4[0], fArr4[1]));
                                while (i32 <= i34) {
                                    arrayList2.add(new C0470m(fArr4[i32], fArr4[i32 + 1]));
                                    i32 += 2;
                                }
                            }
                        } else if (c7 == 'l') {
                            int i35 = i17 - 2;
                            for (int i36 = 0; i36 <= i35; i36 += 2) {
                                arrayList2.add(new h0.u(fArr4[i36], fArr4[i36 + 1]));
                            }
                        } else if (c7 == 'L') {
                            int i37 = i17 - 2;
                            for (int i38 = 0; i38 <= i37; i38 += 2) {
                                arrayList2.add(new C0470m(fArr4[i38], fArr4[i38 + 1]));
                            }
                        } else if (c7 == 'h') {
                            int i39 = i17 - 1;
                            for (int i40 = 0; i40 <= i39; i40++) {
                                arrayList2.add(new h0.t(fArr4[i40]));
                            }
                        } else if (c7 == 'H') {
                            int i41 = i17 - 1;
                            for (int i42 = 0; i42 <= i41; i42++) {
                                arrayList2.add(new C0469l(fArr4[i42]));
                            }
                        } else if (c7 == 'v') {
                            int i43 = i17 - 1;
                            for (int i44 = 0; i44 <= i43; i44++) {
                                arrayList2.add(new h0.z(fArr4[i44]));
                            }
                        } else if (c7 == 'V') {
                            int i45 = i17 - 1;
                            for (int i46 = 0; i46 <= i45; i46++) {
                                arrayList2.add(new C0448A(fArr4[i46]));
                            }
                        } else if (c7 == 'c') {
                            int i47 = i17 - 6;
                            for (int i48 = 0; i48 <= i47; i48 += 6) {
                                arrayList2.add(new C0476s(fArr4[i48], fArr4[i48 + 1], fArr4[i48 + 2], fArr4[i48 + 3], fArr4[i48 + 4], fArr4[i48 + 5]));
                            }
                        } else if (c7 == 'C') {
                            int i49 = i17 - 6;
                            for (int i50 = 0; i50 <= i49; i50 += 6) {
                                arrayList2.add(new C0468k(fArr4[i50], fArr4[i50 + 1], fArr4[i50 + 2], fArr4[i50 + 3], fArr4[i50 + 4], fArr4[i50 + 5]));
                            }
                        } else if (c7 == 's') {
                            int i51 = i17 - 4;
                            for (int i52 = 0; i52 <= i51; i52 += 4) {
                                arrayList2.add(new h0.x(fArr4[i52], fArr4[i52 + 1], fArr4[i52 + 2], fArr4[i52 + 3]));
                            }
                        } else if (c7 == 'S') {
                            int i53 = i17 - 4;
                            for (int i54 = 0; i54 <= i53; i54 += 4) {
                                arrayList2.add(new C0473p(fArr4[i54], fArr4[i54 + 1], fArr4[i54 + 2], fArr4[i54 + 3]));
                            }
                        } else if (c7 == 'q') {
                            int i55 = i17 - 4;
                            for (int i56 = 0; i56 <= i55; i56 += 4) {
                                arrayList2.add(new h0.w(fArr4[i56], fArr4[i56 + 1], fArr4[i56 + 2], fArr4[i56 + 3]));
                            }
                        } else if (c7 == 'Q') {
                            int i57 = i17 - 4;
                            for (int i58 = 0; i58 <= i57; i58 += 4) {
                                arrayList2.add(new C0472o(fArr4[i58], fArr4[i58 + 1], fArr4[i58 + 2], fArr4[i58 + 3]));
                            }
                        } else if (c7 == 't') {
                            int i59 = i17 - 2;
                            for (int i60 = 0; i60 <= i59; i60 += 2) {
                                arrayList2.add(new h0.y(fArr4[i60], fArr4[i60 + 1]));
                            }
                        } else if (c7 == 'T') {
                            int i61 = i17 - 2;
                            for (int i62 = 0; i62 <= i61; i62 += 2) {
                                arrayList2.add(new C0474q(fArr4[i62], fArr4[i62 + 1]));
                            }
                        } else if (c7 == 'a') {
                            int i63 = i17 - 7;
                            for (int i64 = 0; i64 <= i63; i64 += 7) {
                                arrayList2.add(new C0475r(fArr4[i64], fArr4[i64 + 1], fArr4[i64 + 2], Float.compare(fArr4[i64 + 3], 0.0f) != 0, Float.compare(fArr4[i64 + 4], 0.0f) != 0, fArr4[i64 + 5], fArr4[i64 + 6]));
                            }
                        } else {
                            if (c7 != 'A') {
                                throw new IllegalArgumentException("Unknown command for: " + c7);
                            }
                            int i65 = i17 - 7;
                            for (int i66 = 0; i66 <= i65; i66 += 7) {
                                arrayList2.add(new C0466i(fArr4[i66], fArr4[i66 + 1], fArr4[i66 + 2], Float.compare(fArr4[i66 + 3], 0.0f) != 0, Float.compare(fArr4[i66 + 4], 0.0f) != 0, fArr4[i66 + 5], fArr4[i66 + 6]));
                            }
                        }
                        y5 = y4;
                        arrayList3 = arrayList2;
                        length = i5;
                        i3 = i6;
                    }
                }
                y5 = y4;
                arrayList3 = arrayList2;
                length = i5;
                i3 = i6;
            } else {
                i16 = i4;
            }
        }
        return arrayList3;
    }

    @Override // h1.InterfaceC0490h
    public Object a(InterfaceC0426e interfaceC0426e, X1.c cVar) {
        return ((InterfaceC0490h) this.f334d).a(new C0594c(interfaceC0426e, null), cVar);
    }

    @Override // h1.InterfaceC0490h
    public InterfaceC1053f b() {
        return ((InterfaceC0490h) this.f334d).b();
    }

    public void c(int i3) {
        List list = (List) this.f334d;
        if (list.isEmpty() || !(((Number) list.get(0)).intValue() == i3 || ((Number) list.get(list.size() - 1)).intValue() == i3)) {
            int size = list.size();
            list.add(Integer.valueOf(i3));
            while (size > 0) {
                int i4 = ((size + 1) >>> 1) - 1;
                int intValue = ((Number) list.get(i4)).intValue();
                if (i3 <= intValue) {
                    break;
                }
                list.set(size, Integer.valueOf(intValue));
                size = i4;
            }
            list.set(size, Integer.valueOf(i3));
        }
    }

    public void d(Object obj, Object obj2) {
        C0550x c0550x = (C0550x) this.f334d;
        int d3 = c0550x.d(obj);
        boolean z3 = d3 < 0;
        Object obj3 = z3 ? null : c0550x.f6346c[d3];
        if (obj3 != null) {
            if (obj3 instanceof C0519A) {
                ((C0519A) obj3).a(obj2);
            } else if (obj3 != obj2) {
                C0519A c0519a = new C0519A();
                c0519a.a(obj3);
                c0519a.a(obj2);
                obj2 = c0519a;
            }
            obj2 = obj3;
        }
        if (!z3) {
            c0550x.f6346c[d3] = obj2;
            return;
        }
        int i3 = ~d3;
        c0550x.f6345b[i3] = obj;
        c0550x.f6346c[i3] = obj2;
    }

    public androidx.lifecycle.V e(f2.d dVar) {
        String str;
        Class cls = dVar.f5821a;
        f2.j.f(cls, "jClass");
        String str2 = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            HashMap hashMap = f2.d.f5819c;
            if (isArray) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(cls.getName());
                if (str2 == null) {
                    str2 = cls.getCanonicalName();
                }
            }
        }
        if (str2 != null) {
            return ((G1.m) this.f334d).o(dVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public h1.X f() {
        return (h1.X) ((C1045P) this.f334d).getValue();
    }

    public W0 g() {
        m1.i a3 = m1.i.a();
        if (a3.b() == 1) {
            return new K0.j(true);
        }
        C0156j0 K3 = C0143d.K(Boolean.FALSE, I.W.f2783i);
        K0.f fVar = new K0.f(K3, this);
        a3.f6946a.writeLock().lock();
        try {
            if (a3.f6948c != 1 && a3.f6948c != 2) {
                a3.f6947b.add(fVar);
                a3.f6946a.writeLock().unlock();
                return K3;
            }
            a3.f6949d.post(new RunnableC0649g(Arrays.asList(fVar), a3.f6948c, null));
            a3.f6946a.writeLock().unlock();
            return K3;
        } catch (Throwable th) {
            a3.f6946a.writeLock().unlock();
            throw th;
        }
    }

    @Override // m.InterfaceC0633s
    public InterfaceC0605A get(int i3) {
        return (C0606B) this.f334d;
    }

    public void h() {
        View view = (View) this.f334d;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void i(float f3, float f4, float f5, float f6) {
        G1.m mVar = (G1.m) this.f334d;
        b0.r h3 = mVar.h();
        long e3 = AbstractC0235a.e(C0241f.d(mVar.n()) - (f5 + f3), C0241f.b(mVar.n()) - (f6 + f4));
        if (C0241f.d(e3) < 0.0f || C0241f.b(e3) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        mVar.z(e3);
        h3.s(f3, f4);
    }

    public boolean m(Object obj, Object obj2) {
        C0550x c0550x = (C0550x) this.f334d;
        Object e3 = c0550x.e(obj);
        if (e3 == null) {
            return false;
        }
        if (!(e3 instanceof C0519A)) {
            if (!e3.equals(obj2)) {
                return false;
            }
            c0550x.g(obj);
            return true;
        }
        C0519A c0519a = (C0519A) e3;
        boolean j3 = c0519a.j(obj2);
        if (j3 && c0519a.g()) {
            c0550x.g(obj);
        }
        return j3;
    }

    public void n(Object obj) {
        boolean z3;
        C0550x c0550x = (C0550x) this.f334d;
        long[] jArr = c0550x.f6344a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j3 = jArr[i3];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j3) < 128) {
                        int i6 = (i3 << 3) + i5;
                        Object obj2 = c0550x.f6345b[i6];
                        Object obj3 = c0550x.f6346c[i6];
                        if (obj3 instanceof C0519A) {
                            f2.j.d(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            C0519A c0519a = (C0519A) obj3;
                            c0519a.j(obj);
                            z3 = c0519a.g();
                        } else {
                            z3 = obj3 == obj;
                        }
                        if (z3) {
                            c0550x.h(i6);
                        }
                    }
                    j3 >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public void o(float f3, float f4, long j3) {
        b0.r h3 = ((G1.m) this.f334d).h();
        h3.s(C0238c.d(j3), C0238c.e(j3));
        h3.e(f3, f4);
        h3.s(-C0238c.d(j3), -C0238c.e(j3));
    }

    public void p() {
        View view;
        View view2 = (View) this.f334d;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new E.t(7, view));
    }

    public int q() {
        int intValue;
        List list = (List) this.f334d;
        if (!(list.size() > 0)) {
            C0143d.w("Set is empty");
            throw null;
        }
        int intValue2 = ((Number) list.get(0)).intValue();
        while (!list.isEmpty() && ((Number) list.get(0)).intValue() == intValue2) {
            list.set(0, S1.l.Q0(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i3 = 0;
            while (i3 < size2) {
                int intValue3 = ((Number) list.get(i3)).intValue();
                int i4 = (i3 + 1) * 2;
                int i5 = i4 - 1;
                int intValue4 = ((Number) list.get(i5)).intValue();
                if (i4 >= size || (intValue = ((Number) list.get(i4)).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        list.set(i3, Integer.valueOf(intValue4));
                        list.set(i5, Integer.valueOf(intValue3));
                        i3 = i5;
                    }
                } else if (intValue > intValue3) {
                    list.set(i3, Integer.valueOf(intValue));
                    list.set(i4, Integer.valueOf(intValue3));
                    i3 = i4;
                }
            }
        }
        return intValue2;
    }

    public void r(float f3, float f4) {
        ((G1.m) this.f334d).h().s(f3, f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r6.f6130a > r2.f6130a) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Type inference failed for: r3v4, types: [m1.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(h1.X x3) {
        C1045P c1045p;
        Object value;
        h1.X x4;
        f2.j.f(x3, "newState");
        do {
            c1045p = (C1045P) this.f334d;
            value = c1045p.getValue();
            x4 = (h1.X) value;
            if (!(x4 instanceof h1.P ? true : f2.j.a(x4, h1.Z.f6133b))) {
                if (!(x4 instanceof C0485c)) {
                    if (!(x4 instanceof h1.N)) {
                        throw new C1.c();
                    }
                }
                ?? r3 = AbstractC1151c.f9682b;
                if (value == null) {
                    value = r3;
                }
                if (x4 == null) {
                    x4 = r3;
                }
            }
            x4 = x3;
            ?? r32 = AbstractC1151c.f9682b;
            if (value == null) {
            }
            if (x4 == null) {
            }
        } while (!c1045p.l(value, x4));
    }

    public void t(I0.z zVar, long j3, boolean z3, r rVar) {
        ((a0) this.f334d).n(C0.J.b(a0.a((a0) this.f334d, zVar, j3, z3, false, rVar, false)) ? x.F.f9946f : x.F.f9945e);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(J1.a aVar, X1.c cVar) {
        H1.e eVar;
        int i3;
        if (cVar instanceof H1.e) {
            eVar = (H1.e) cVar;
            int i4 = eVar.f2626j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.f2626j = i4 - Integer.MIN_VALUE;
                Object obj = eVar.f2624h;
                W1.a aVar2 = W1.a.f4608d;
                i3 = eVar.f2626j;
                if (i3 == 0) {
                    if (i3 == 1) {
                        R1.a.e(obj);
                    }
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = eVar.f2623g;
                    R1.a.e(obj);
                    return new Long(aVar.f3159a);
                }
                R1.a.e(obj);
                long j3 = aVar.f3159a;
                G1.b bVar = (G1.b) this.f334d;
                if (j3 == 0) {
                    G1.h hVar = new G1.h(j3, aVar.f3160b, aVar.f3161c, aVar.f3162d, aVar.f3163e);
                    eVar.f2626j = 1;
                    obj = ((G1.g) bVar).insert(hVar, eVar);
                    return obj == aVar2 ? aVar2 : obj;
                }
                G1.h hVar2 = new G1.h(j3, aVar.f3160b, aVar.f3161c, aVar.f3162d, aVar.f3163e);
                eVar.f2623g = aVar;
                eVar.f2626j = 2;
                if (((G1.g) bVar).update(hVar2, eVar) == aVar2) {
                    return aVar2;
                }
                return new Long(aVar.f3159a);
            }
        }
        eVar = new H1.e(this, cVar);
        Object obj2 = eVar.f2624h;
        W1.a aVar22 = W1.a.f4608d;
        i3 = eVar.f2626j;
        if (i3 == 0) {
        }
    }

    public Y(int i3) {
        boolean z3 = false;
        switch (i3) {
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                f2.j.f(timeUnit, "timeUnit");
                this.f334d = new K2.k(J2.e.f3199h, timeUnit);
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                this.f334d = Build.VERSION.SDK_INT >= 28 ? new A1.i(4, z3) : new A1.i(5, z3);
                break;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f334d = new ArrayList();
                break;
            case 11:
                this.f334d = new SparseArray(10);
                break;
            case 12:
                long[] jArr = AbstractC0522D.f6254a;
                this.f334d = new C0550x();
                break;
            case 14:
                this.f334d = new LinkedHashSet();
                break;
            case 20:
                this.f334d = new CopyOnWriteArrayList();
                new HashMap();
                break;
            case 25:
                this.f334d = new AtomicInteger(0);
                break;
            case 26:
                this.f334d = AbstractC1035F.c(h1.Z.f6133b);
                break;
            default:
                this.f334d = new ConcurrentHashMap(16);
                break;
        }
    }

    public Y(O0.b bVar) {
        this.f334d = new l.K(l.O.f6467a, bVar);
    }

    public Y(androidx.lifecycle.a0 a0Var, androidx.lifecycle.X x3, s0 s0Var) {
        f2.j.f(a0Var, "store");
        f2.j.f(s0Var, "defaultCreationExtras");
        this.f334d = new G1.m(a0Var, x3, s0Var);
    }

    public void j() {
    }
}
