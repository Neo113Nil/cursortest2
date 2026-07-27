package w2;

import A.C0022s;
import A.a0;
import A0.K;
import B1.C0097d;
import B1.C0098e;
import E1.i;
import G.C0192d;
import G.C0205j0;
import G.W;
import G.X0;
import I0.g;
import M2.C0256h;
import W2.C0286h;
import W2.y0;
import Y.f;
import Z.r;
import a2.ScheduledFutureC0420i;
import android.R;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import b2.C0517a;
import b2.k;
import f0.AbstractC0581b;
import f0.C0570A;
import f0.C0588i;
import f0.C0589j;
import f0.C0590k;
import f0.C0591l;
import f0.C0592m;
import f0.C0593n;
import f0.C0594o;
import f0.C0595p;
import f0.C0596q;
import f0.C0597r;
import f0.C0598s;
import f0.C0599t;
import f0.u;
import f0.v;
import f0.w;
import f0.x;
import f0.z;
import i.AbstractC0664E;
import i.C0661B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k1.h;
import kotlin.jvm.internal.Intrinsics;
import l.t0;
import o2.m;
import p1.C0991a;
import u3.l;
import w.EnumC1257F;
import y.t;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.y;
import z2.C1403G;

/* renamed from: w2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1294c implements k {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C1294c f11387e;

    /* renamed from: d, reason: collision with root package name */
    public Object f11388d;

    public /* synthetic */ C1294c(Object obj) {
        this.f11388d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:410:0x0164, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x02e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList j(C1294c c1294c, String str) {
        int i2;
        char charAt;
        C1294c c1294c2;
        char c4;
        ArrayList arrayList;
        int i4;
        char c5;
        ArrayList arrayList2;
        int i5;
        char c6;
        char c7;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j4;
        boolean z4;
        int i14;
        long j5;
        int floatToRawIntBits;
        long j6;
        long j7;
        int floatToRawIntBits2;
        int i15;
        int i16;
        long j8;
        int i17;
        char c8;
        long j9;
        int floatToRawIntBits3;
        long j10;
        float intBitsToFloat;
        C1294c c1294c3 = c1294c;
        char c9 = '\n';
        char c10 = 'z';
        int i18 = 32;
        char c11 = '0';
        int i19 = 1;
        ArrayList arrayList3 = new ArrayList();
        int length = str.length();
        int i20 = 0;
        while (i20 < length && Intrinsics.e(str.charAt(i20), 32) <= 0) {
            i20++;
        }
        while (length > i20 && Intrinsics.e(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i21 = 0;
        while (i20 < length) {
            while (true) {
                i2 = i20 + 1;
                charAt = str.charAt(i20);
                int i22 = charAt | ' ';
                if ((i22 - 122) * (i22 - 97) <= 0 && i22 != 101) {
                    break;
                }
                if (i2 >= length) {
                    charAt = 0;
                    break;
                }
                i20 = i2;
                c10 = 'z';
            }
            if (charAt != 0) {
                if ((charAt | ' ') != c10) {
                    int i23 = 0;
                    while (true) {
                        if (i2 >= length || Intrinsics.e(str.charAt(i2), i18) > 0) {
                            if (i2 == length) {
                                j9 = i2 << i18;
                                j10 = Float.floatToRawIntBits(Float.NaN);
                            } else {
                                char charAt2 = str.charAt(i2);
                                int i24 = charAt2 == '-' ? i19 : 0;
                                if (i24 != 0) {
                                    i6 = i2 + 1;
                                    if (i6 == length) {
                                        j9 = i6 << i18;
                                        floatToRawIntBits3 = Float.floatToRawIntBits(Float.NaN);
                                    } else {
                                        c7 = str.charAt(i6);
                                        if (((char) (c7 - '0')) >= c9 && c7 != '.') {
                                            j9 = i6 << i18;
                                            floatToRawIntBits3 = Float.floatToRawIntBits(Float.NaN);
                                        }
                                    }
                                    j10 = floatToRawIntBits3;
                                } else {
                                    c7 = charAt2;
                                    i6 = i2;
                                }
                                int length2 = str.length();
                                int i25 = i6;
                                long j11 = 0;
                                while (i25 != length) {
                                    int i26 = c7 - '0';
                                    if (((char) i26) >= c9) {
                                        break;
                                    }
                                    j11 = (j11 * 10) + i26;
                                    i25++;
                                    c7 = i25 < length2 ? str.charAt(i25) : (char) 0;
                                }
                                int i27 = i25 - i6;
                                if (i25 == length || c7 != '.') {
                                    i7 = i23;
                                    i8 = i2;
                                    c5 = charAt;
                                    i9 = i25;
                                    i10 = i9;
                                    i11 = 0;
                                } else {
                                    int i28 = i25 + 1;
                                    i10 = i28;
                                    while (true) {
                                        if (length - i10 < 4) {
                                            i7 = i23;
                                            i8 = i2;
                                            c5 = charAt;
                                            break;
                                        }
                                        i7 = i23;
                                        i8 = i2;
                                        c5 = charAt;
                                        long charAt3 = str.charAt(i10) | (str.charAt(i10 + 1) << 16) | (str.charAt(i10 + 2) << 32) | (str.charAt(i10 + 3) << 48);
                                        long j12 = charAt3 - 13511005043687472L;
                                        int i29 = (((charAt3 + 19703549022044230L) | j12) & (-35747867511423104L)) != 0 ? -1 : (int) ((j12 * 281475406208040961L) >>> 48);
                                        if (i29 < 0) {
                                            break;
                                        }
                                        j11 = (j11 * 10000) + i29;
                                        i10 += 4;
                                        i23 = i7;
                                        charAt = c5;
                                        i2 = i8;
                                    }
                                    if (i10 < length2) {
                                        c8 = str.charAt(i10);
                                        while (i10 != length) {
                                            int i30 = c8 - '0';
                                            if (((char) i30) >= '\n') {
                                                break;
                                            }
                                            j11 = (j11 * 10) + i30;
                                            i10++;
                                            if (i10 < length2) {
                                                c8 = str.charAt(i10);
                                            }
                                        }
                                        i11 = i28 - i10;
                                        i27 -= i11;
                                        c7 = c8;
                                        i9 = i28;
                                    }
                                    c8 = 0;
                                }
                                if (i27 == 0) {
                                    j6 = (i10 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
                                    i14 = 32;
                                    arrayList = arrayList3;
                                    i4 = length;
                                    c4 = '0';
                                } else {
                                    if ((c7 | ' ') == 101) {
                                        i12 = i10 + 1;
                                        char charAt4 = i12 < length2 ? str.charAt(i12) : (char) 0;
                                        boolean z5 = charAt4 == '-';
                                        if (z5 || charAt4 == '+') {
                                            i12 = i10 + 2;
                                        }
                                        char charAt5 = str.charAt(i12);
                                        int i31 = 0;
                                        while (true) {
                                            if (i12 == length) {
                                                arrayList = arrayList3;
                                                break;
                                            }
                                            int i32 = charAt5 - '0';
                                            arrayList = arrayList3;
                                            if (((char) i32) >= '\n') {
                                                break;
                                            }
                                            if (i31 < 1024) {
                                                i31 = (i31 * 10) + i32;
                                            }
                                            i12++;
                                            charAt5 = i12 < length2 ? str.charAt(i12) : (char) 0;
                                            arrayList3 = arrayList;
                                        }
                                        i13 = z5 ? -i31 : i31;
                                        i11 += i13;
                                    } else {
                                        arrayList = arrayList3;
                                        i12 = i10;
                                        i13 = 0;
                                    }
                                    int i33 = 19;
                                    if (i27 > 19) {
                                        char charAt6 = str.charAt(i6);
                                        int i34 = i6;
                                        while (true) {
                                            if (i12 == length) {
                                                i16 = i33;
                                                break;
                                            }
                                            if (charAt6 != '0' && charAt6 != '.') {
                                                i16 = 19;
                                                break;
                                            }
                                            if (charAt6 == '0') {
                                                i27--;
                                            }
                                            i34++;
                                            charAt6 = i34 < length2 ? str.charAt(i34) : (char) 0;
                                            i33 = 19;
                                        }
                                        if (i27 > i16) {
                                            char charAt7 = str.charAt(i6);
                                            i4 = length;
                                            long j13 = 0;
                                            while (true) {
                                                if (i6 == i25) {
                                                    break;
                                                }
                                                y.a aVar = y.f11688e;
                                                if (Long.compareUnsigned(j13, 1000000000000000000L) >= 0) {
                                                    break;
                                                }
                                                j13 = (j13 * 10) + (charAt7 - '0');
                                                i6++;
                                                charAt7 = i6 < length2 ? str.charAt(i6) : (char) 0;
                                            }
                                            y.a aVar2 = y.f11688e;
                                            if (Long.compareUnsigned(j13, 1000000000000000000L) >= 0) {
                                                i17 = (i25 - i6) + i13;
                                                j4 = j13;
                                                c4 = '0';
                                            } else {
                                                char charAt8 = str.charAt(i9);
                                                int i35 = i9;
                                                for (j8 = 1000000000000000000L; i35 != i10 && Long.compareUnsigned(j13, j8) < 0; j8 = 1000000000000000000L) {
                                                    j13 = (j13 * 10) + (charAt8 - '0');
                                                    i35++;
                                                    charAt8 = i35 < length2 ? str.charAt(i35) : (char) 0;
                                                }
                                                c4 = '0';
                                                i17 = (i9 - i35) + i13;
                                                j4 = j13;
                                            }
                                            i11 = i17;
                                            z4 = true;
                                            if (-10 <= i11 && i11 < 11 && !z4) {
                                                y.a aVar3 = y.f11688e;
                                                if (Long.compareUnsigned(j4, 16777216L) <= 0) {
                                                    float f4 = j4;
                                                    float[] fArr = AbstractC0581b.f6332a;
                                                    float f5 = i11 < 0 ? f4 / fArr[-i11] : f4 * fArr[i11];
                                                    if (i24 != 0) {
                                                        f5 = -f5;
                                                    }
                                                    j7 = i12 << 32;
                                                    floatToRawIntBits2 = Float.floatToRawIntBits(f5);
                                                    j6 = j7 | (floatToRawIntBits2 & 4294967295L);
                                                    i14 = 32;
                                                }
                                            }
                                            if (j4 != 0) {
                                                j7 = i12 << 32;
                                                floatToRawIntBits2 = Float.floatToRawIntBits(i24 != 0 ? -0.0f : 0.0f);
                                            } else {
                                                if (-126 > i11 || i11 >= 128) {
                                                    String substring = str.substring(i8, i12);
                                                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                                    i14 = 32;
                                                    j5 = i12 << 32;
                                                    floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring));
                                                } else {
                                                    long j14 = AbstractC0581b.f6333b[i11 + 325];
                                                    y.a aVar4 = y.f11688e;
                                                    int numberOfLeadingZeros = Long.numberOfLeadingZeros(j4);
                                                    long j15 = j4 << numberOfLeadingZeros;
                                                    long j16 = j15 & 4294967295L;
                                                    long j17 = j15 >>> 32;
                                                    long j18 = j14 & 4294967295L;
                                                    long j19 = j14 >>> 32;
                                                    long j20 = j17 * j19;
                                                    long j21 = j19 * j16;
                                                    long j22 = j20 + ((((j17 * j18) + ((j16 * j18) >>> 32)) + (j21 & 4294967295L)) >>> 32) + (j21 >>> 32);
                                                    int i36 = (int) (j22 >>> 63);
                                                    long j23 = j22 >>> (i36 + 9);
                                                    int i37 = numberOfLeadingZeros + (i36 ^ 1);
                                                    long j24 = j22 & 511;
                                                    if (j24 == 511 || (j24 == 0 && (j23 & 3) == 1)) {
                                                        String substring2 = str.substring(i8, i12);
                                                        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                                        j7 = i12 << 32;
                                                        floatToRawIntBits2 = Float.floatToRawIntBits(Float.parseFloat(substring2));
                                                    } else {
                                                        long j25 = (j23 + 1) >>> 1;
                                                        if (j25 >= 9007199254740992L) {
                                                            i37--;
                                                            j25 = 4503599627370496L;
                                                        }
                                                        long j26 = j25 & (-4503599627370497L);
                                                        long j27 = ((((i11 * 217706) >> 16) + 1024) + 63) - i37;
                                                        if (j27 < 1) {
                                                            i14 = 32;
                                                            i15 = i8;
                                                        } else if (j27 > 2046) {
                                                            i15 = i8;
                                                            i14 = 32;
                                                        } else {
                                                            i14 = 32;
                                                            j5 = i12 << 32;
                                                            floatToRawIntBits = Float.floatToRawIntBits((float) Double.longBitsToDouble((j27 << 52) | j26 | (i24 != 0 ? Long.MIN_VALUE : 0L)));
                                                        }
                                                        String substring3 = str.substring(i15, i12);
                                                        Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                                        j5 = i12 << i14;
                                                        floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring3));
                                                    }
                                                }
                                                j6 = j5 | (floatToRawIntBits & 4294967295L);
                                            }
                                            j6 = j7 | (floatToRawIntBits2 & 4294967295L);
                                            i14 = 32;
                                        }
                                    }
                                    i4 = length;
                                    c4 = '0';
                                    j4 = j11;
                                    z4 = false;
                                    if (-10 <= i11) {
                                        y.a aVar32 = y.f11688e;
                                        if (Long.compareUnsigned(j4, 16777216L) <= 0) {
                                        }
                                    }
                                    if (j4 != 0) {
                                    }
                                    j6 = j7 | (floatToRawIntBits2 & 4294967295L);
                                    i14 = 32;
                                }
                                int i38 = (int) (j6 >>> i14);
                                intBitsToFloat = Float.intBitsToFloat((int) (j6 & 4294967295L));
                                if (Float.isNaN(intBitsToFloat)) {
                                    c1294c2 = c1294c;
                                    float[] fArr2 = (float[]) c1294c2.f11388d;
                                    int i39 = i7 + 1;
                                    fArr2[i7] = intBitsToFloat;
                                    if (i39 >= fArr2.length) {
                                        float[] destination = new float[i39 * 2];
                                        c1294c2.f11388d = destination;
                                        int length3 = fArr2.length;
                                        Intrinsics.checkNotNullParameter(fArr2, "<this>");
                                        Intrinsics.checkNotNullParameter(destination, "destination");
                                        System.arraycopy(fArr2, 0, destination, 0, length3);
                                    }
                                    i2 = i38;
                                    i7 = i39;
                                } else {
                                    c1294c2 = c1294c;
                                    i2 = i38;
                                }
                                while (i2 < i4 && str.charAt(i2) == ',') {
                                    i2++;
                                }
                                if (i2 >= i4 || Float.isNaN(intBitsToFloat)) {
                                    break;
                                }
                                c9 = '\n';
                                length = i4;
                                arrayList3 = arrayList;
                                c11 = c4;
                                i23 = i7;
                                charAt = c5;
                                i19 = 1;
                                i18 = i14;
                            }
                            j6 = j9 | (j10 & 4294967295L);
                            i14 = i18;
                            c4 = c11;
                            i7 = i23;
                            arrayList = arrayList3;
                            i4 = length;
                            c5 = charAt;
                            int i382 = (int) (j6 >>> i14);
                            intBitsToFloat = Float.intBitsToFloat((int) (j6 & 4294967295L));
                            if (Float.isNaN(intBitsToFloat)) {
                            }
                            while (i2 < i4) {
                                i2++;
                            }
                            if (i2 >= i4) {
                                break;
                            }
                            break;
                        }
                        i2 += i19;
                    }
                    i20 = i2;
                    i21 = i7;
                } else {
                    c1294c2 = c1294c3;
                    c4 = c11;
                    arrayList = arrayList3;
                    i4 = length;
                    c5 = charAt;
                    i20 = i2;
                }
                float[] fArr3 = (float[]) c1294c2.f11388d;
                char c12 = c5;
                if (c12 == 'z' || c12 == 'Z') {
                    arrayList2 = arrayList;
                    arrayList2.add(C0589j.f6414c);
                    i5 = 1;
                } else {
                    arrayList2 = arrayList;
                    if (c12 == 'm') {
                        int i40 = i21 - 2;
                        if (i40 >= 0) {
                            arrayList2.add(new v(fArr3[0], fArr3[1]));
                            for (int i41 = 2; i41 <= i40; i41 += 2) {
                                arrayList2.add(new u(fArr3[i41], fArr3[i41 + 1]));
                            }
                        }
                        i5 = 1;
                    } else {
                        if (c12 == 'M') {
                            int i42 = i21 - 2;
                            if (i42 >= 0) {
                                arrayList2.add(new C0593n(fArr3[0], fArr3[1]));
                                for (int i43 = 2; i43 <= i42; i43 += 2) {
                                    arrayList2.add(new C0592m(fArr3[i43], fArr3[i43 + 1]));
                                }
                            }
                            c6 = 2;
                        } else {
                            c6 = 2;
                            if (c12 == 'l') {
                                int i44 = i21 - 2;
                                for (int i45 = 0; i45 <= i44; i45 += 2) {
                                    arrayList2.add(new u(fArr3[i45], fArr3[i45 + 1]));
                                }
                            } else if (c12 == 'L') {
                                int i46 = i21 - 2;
                                for (int i47 = 0; i47 <= i46; i47 += 2) {
                                    arrayList2.add(new C0592m(fArr3[i47], fArr3[i47 + 1]));
                                }
                            } else {
                                int i48 = 1;
                                if (c12 == 'h') {
                                    int i49 = i21 - 1;
                                    for (int i50 = 0; i50 <= i49; i50++) {
                                        arrayList2.add(new C0599t(fArr3[i50]));
                                    }
                                } else if (c12 == 'H') {
                                    int i51 = i21 - 1;
                                    for (int i52 = 0; i52 <= i51; i52++) {
                                        arrayList2.add(new C0591l(fArr3[i52]));
                                    }
                                } else if (c12 == 'v') {
                                    int i53 = i21 - 1;
                                    for (int i54 = 0; i54 <= i53; i54++) {
                                        arrayList2.add(new z(fArr3[i54]));
                                    }
                                } else if (c12 == 'V') {
                                    int i55 = i21 - 1;
                                    for (int i56 = 0; i56 <= i55; i56++) {
                                        arrayList2.add(new C0570A(fArr3[i56]));
                                    }
                                } else if (c12 == 'c') {
                                    int i57 = i21 - 6;
                                    int i58 = 0;
                                    while (i58 <= i57) {
                                        arrayList2.add(new C0598s(fArr3[i58], fArr3[i58 + 1], fArr3[i58 + 2], fArr3[i58 + 3], fArr3[i58 + 4], fArr3[i58 + 5]));
                                        i58 += 6;
                                        i48 = 1;
                                    }
                                } else {
                                    if (c12 == 'C') {
                                        int i59 = i21 - 6;
                                        for (int i60 = 0; i60 <= i59; i60 += 6) {
                                            arrayList2.add(new C0590k(fArr3[i60], fArr3[i60 + 1], fArr3[i60 + 2], fArr3[i60 + 3], fArr3[i60 + 4], fArr3[i60 + 5]));
                                        }
                                    } else if (c12 == 's') {
                                        int i61 = i21 - 4;
                                        for (int i62 = 0; i62 <= i61; i62 += 4) {
                                            arrayList2.add(new x(fArr3[i62], fArr3[i62 + 1], fArr3[i62 + 2], fArr3[i62 + 3]));
                                        }
                                    } else if (c12 == 'S') {
                                        int i63 = i21 - 4;
                                        for (int i64 = 0; i64 <= i63; i64 += 4) {
                                            arrayList2.add(new C0595p(fArr3[i64], fArr3[i64 + 1], fArr3[i64 + 2], fArr3[i64 + 3]));
                                        }
                                    } else if (c12 == 'q') {
                                        int i65 = i21 - 4;
                                        for (int i66 = 0; i66 <= i65; i66 += 4) {
                                            arrayList2.add(new w(fArr3[i66], fArr3[i66 + 1], fArr3[i66 + 2], fArr3[i66 + 3]));
                                        }
                                    } else if (c12 == 'Q') {
                                        int i67 = i21 - 4;
                                        for (int i68 = 0; i68 <= i67; i68 += 4) {
                                            arrayList2.add(new C0594o(fArr3[i68], fArr3[i68 + 1], fArr3[i68 + 2], fArr3[i68 + 3]));
                                        }
                                    } else {
                                        char c13 = 2;
                                        if (c12 == 't') {
                                            int i69 = i21 - 2;
                                            for (int i70 = 0; i70 <= i69; i70 += 2) {
                                                arrayList2.add(new f0.y(fArr3[i70], fArr3[i70 + 1]));
                                            }
                                        } else if (c12 == 'T') {
                                            int i71 = i21 - 2;
                                            for (int i72 = 0; i72 <= i71; i72 += 2) {
                                                arrayList2.add(new C0596q(fArr3[i72], fArr3[i72 + 1]));
                                            }
                                        } else if (c12 == 'a') {
                                            int i73 = i21 - 7;
                                            int i74 = 0;
                                            while (i74 <= i73) {
                                                arrayList2.add(new C0597r(fArr3[i74], fArr3[i74 + 1], fArr3[i74 + 2], Float.compare(fArr3[i74 + 3], 0.0f) != 0, Float.compare(fArr3[i74 + 4], 0.0f) != 0, fArr3[i74 + 5], fArr3[i74 + 6]));
                                                i74 += 7;
                                                c13 = 2;
                                            }
                                        } else {
                                            if (c12 != 'A') {
                                                throw new IllegalArgumentException("Unknown command for: " + c12);
                                            }
                                            int i75 = i21 - 7;
                                            for (int i76 = 0; i76 <= i75; i76 += 7) {
                                                arrayList2.add(new C0588i(fArr3[i76], fArr3[i76 + 1], fArr3[i76 + 2], Float.compare(fArr3[i76 + 3], 0.0f) != 0, Float.compare(fArr3[i76 + 4], 0.0f) != 0, fArr3[i76 + 5], fArr3[i76 + 6]));
                                            }
                                        }
                                        i5 = 1;
                                        c1294c3 = c1294c2;
                                        i19 = i5;
                                        length = i4;
                                        arrayList3 = arrayList2;
                                        c11 = c4;
                                        c9 = '\n';
                                        c10 = 'z';
                                        i18 = 32;
                                    }
                                    i5 = 1;
                                    c1294c3 = c1294c2;
                                    i19 = i5;
                                    length = i4;
                                    arrayList3 = arrayList2;
                                    c11 = c4;
                                    c9 = '\n';
                                    c10 = 'z';
                                    i18 = 32;
                                }
                                i5 = i48;
                                c1294c3 = c1294c2;
                                i19 = i5;
                                length = i4;
                                arrayList3 = arrayList2;
                                c11 = c4;
                                c9 = '\n';
                                c10 = 'z';
                                i18 = 32;
                            }
                        }
                        i5 = 1;
                        c1294c3 = c1294c2;
                        i19 = i5;
                        length = i4;
                        arrayList3 = arrayList2;
                        c11 = c4;
                        c9 = '\n';
                        c10 = 'z';
                        i18 = 32;
                    }
                }
                c1294c3 = c1294c2;
                i19 = i5;
                length = i4;
                arrayList3 = arrayList2;
                c11 = c4;
                c9 = '\n';
                c10 = 'z';
                i18 = 32;
            } else {
                i20 = i2;
                c10 = 'z';
            }
        }
        return arrayList3;
    }

    public void a(int i2) {
        List list = (List) this.f11388d;
        if (list.isEmpty() || !(((Number) list.get(0)).intValue() == i2 || ((Number) list.get(list.size() - 1)).intValue() == i2)) {
            int size = list.size();
            list.add(Integer.valueOf(i2));
            while (size > 0) {
                int i4 = ((size + 1) >>> 1) - 1;
                int intValue = ((Number) list.get(i4)).intValue();
                if (i2 <= intValue) {
                    break;
                }
                list.set(size, Integer.valueOf(intValue));
                size = i4;
            }
            list.set(size, Integer.valueOf(i2));
        }
    }

    @Override // b2.k
    public void b(C0517a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C0286h c0286h = (C0286h) this.f11388d;
        if (c0286h.x()) {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            c0286h.u(null);
        }
    }

    @Override // b2.k
    public void c(t snap) {
        Intrinsics.checkNotNullParameter(snap, "snap");
        Boolean bool = (Boolean) k2.b.b(((m) snap.m("myGame").f11494e).f8941d.getValue(), Boolean.TYPE);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        String str = (String) k2.b.b(((m) snap.m("serverCheckUrl").f11494e).f8941d.getValue(), String.class);
        if (str == null) {
            str = "";
        }
        String str2 = (String) k2.b.b(((m) snap.m("title").f11494e).f8941d.getValue(), String.class);
        C0098e c0098e = new C0098e(booleanValue, str, str2 != null ? str2 : "");
        C0286h c0286h = (C0286h) this.f11388d;
        if (c0286h.x()) {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            c0286h.u(c0098e);
        }
    }

    public void d(Object obj, Object obj2) {
        i.y yVar = (i.y) this.f11388d;
        int d4 = yVar.d(obj);
        boolean z4 = d4 < 0;
        Object obj3 = z4 ? null : yVar.f6984c[d4];
        if (obj3 != null) {
            if (obj3 instanceof C0661B) {
                ((C0661B) obj3).a(obj2);
            } else if (obj3 != obj2) {
                C0661B c0661b = new C0661B();
                c0661b.a(obj3);
                c0661b.a(obj2);
                obj2 = c0661b;
            }
            obj2 = obj3;
        }
        if (!z4) {
            yVar.f6984c[d4] = obj2;
            return;
        }
        int i2 = ~d4;
        yVar.f6983b[i2] = obj;
        yVar.f6984c[i2] = obj2;
    }

    public T e(C0256h modelClass) {
        String str;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        C0256h.f3597b.getClass();
        Class jClass = modelClass.f3601a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String str2 = null;
        if (!jClass.isAnonymousClass() && !jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            HashMap hashMap = C0256h.f3599d;
            if (isArray) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(jClass.getName());
                if (str2 == null) {
                    str2 = jClass.getCanonicalName();
                }
            }
        }
        if (str2 != null) {
            return ((C0097d) this.f11388d).t(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public X0 f() {
        h a4 = h.a();
        if (a4.b() == 1) {
            return new I0.k(true);
        }
        C0205j0 K3 = C0192d.K(Boolean.FALSE, W.f2779l);
        g gVar = new g(K3, this);
        a4.f7381a.writeLock().lock();
        try {
            if (a4.f7383c != 1 && a4.f7383c != 2) {
                a4.f7382b.add(gVar);
                a4.f7381a.writeLock().unlock();
                return K3;
            }
            a4.f7384d.post(new G1.k(Arrays.asList(gVar), a4.f7383c, null));
            a4.f7381a.writeLock().unlock();
            return K3;
        } catch (Throwable th) {
            a4.f7381a.writeLock().unlock();
            throw th;
        }
    }

    public void g() {
        View view = (View) this.f11388d;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void h(float f4, float f5, float f6, float f7) {
        C0097d c0097d = (C0097d) this.f11388d;
        r k4 = c0097d.k();
        long N3 = l.N(f.d(c0097d.s()) - (f6 + f4), f.b(c0097d.s()) - (f7 + f5));
        if (f.d(N3) < 0.0f || f.b(N3) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        c0097d.G(N3);
        k4.q(f4, f5);
    }

    public void i() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(long j4, E2.c cVar) {
        B1.w wVar;
        int i2;
        if (cVar instanceof B1.w) {
            wVar = (B1.w) cVar;
            int i4 = wVar.f1029l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                wVar.f1029l = i4 - Integer.MIN_VALUE;
                Object obj = wVar.f1027j;
                D2.a aVar = D2.a.f2163d;
                i2 = wVar.f1029l;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    B1.x xVar = new B1.x(this, null);
                    wVar.f1029l = 1;
                    obj = y0.b(j4, xVar, wVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1343r.b(obj);
                }
                String str = (String) obj;
                return str != null ? "" : str;
            }
        }
        wVar = new B1.w(this, cVar);
        Object obj2 = wVar.f1027j;
        D2.a aVar2 = D2.a.f2163d;
        i2 = wVar.f1029l;
        if (i2 != 0) {
        }
        String str2 = (String) obj2;
        if (str2 != null) {
        }
    }

    public boolean l(Object obj, Object obj2) {
        i.y yVar = (i.y) this.f11388d;
        Object e4 = yVar.e(obj);
        if (e4 == null) {
            return false;
        }
        if (!(e4 instanceof C0661B)) {
            if (!e4.equals(obj2)) {
                return false;
            }
            yVar.g(obj);
            return true;
        }
        C0661B c0661b = (C0661B) e4;
        boolean j4 = c0661b.j(obj2);
        if (j4 && c0661b.g()) {
            yVar.g(obj);
        }
        return j4;
    }

    public void m(Object obj) {
        boolean z4;
        i.y yVar = (i.y) this.f11388d;
        long[] jArr = yVar.f6982a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr[i2];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j4) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj2 = yVar.f6983b[i6];
                        Object obj3 = yVar.f6984c[i6];
                        if (obj3 instanceof C0661B) {
                            Intrinsics.d(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            C0661B c0661b = (C0661B) obj3;
                            c0661b.j(obj);
                            z4 = c0661b.g();
                        } else {
                            z4 = obj3 == obj;
                        }
                        if (z4) {
                            yVar.h(i6);
                        }
                    }
                    j4 >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public void n(float f4, float f5, long j4) {
        r k4 = ((C0097d) this.f11388d).k();
        k4.q(Y.c.d(j4), Y.c.e(j4));
        k4.f(f4, f5);
        k4.q(-Y.c.d(j4), -Y.c.e(j4));
    }

    public void o(Exception exc) {
        ScheduledFutureC0420i scheduledFutureC0420i = (ScheduledFutureC0420i) this.f11388d;
        scheduledFutureC0420i.getClass();
        if (Q0.h.f3934l.p(scheduledFutureC0420i, null, new Q0.c(exc))) {
            Q0.h.e(scheduledFutureC0420i);
        }
    }

    public void p() {
        View view;
        View view2 = (View) this.f11388d;
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
        view.post(new C.t(3, view));
    }

    public int q() {
        int intValue;
        List list = (List) this.f11388d;
        if (!(list.size() > 0)) {
            C0192d.w("Set is empty");
            throw null;
        }
        int intValue2 = ((Number) list.get(0)).intValue();
        while (!list.isEmpty() && ((Number) list.get(0)).intValue() == intValue2) {
            list.set(0, C1403G.x(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i2 = 0;
            while (i2 < size2) {
                int intValue3 = ((Number) list.get(i2)).intValue();
                int i4 = (i2 + 1) * 2;
                int i5 = i4 - 1;
                int intValue4 = ((Number) list.get(i5)).intValue();
                if (i4 >= size || (intValue = ((Number) list.get(i4)).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        list.set(i2, Integer.valueOf(intValue4));
                        list.set(i5, Integer.valueOf(intValue3));
                        i2 = i5;
                    }
                } else if (intValue > intValue3) {
                    list.set(i2, Integer.valueOf(intValue));
                    list.set(i4, Integer.valueOf(intValue3));
                    i2 = i4;
                }
            }
        }
        return intValue2;
    }

    public void r(float f4, float f5) {
        ((C0097d) this.f11388d).k().q(f4, f5);
    }

    public void s(G0.y yVar, long j4, boolean z4, C0022s c0022s) {
        ((a0) this.f11388d).n(K.b(a0.a((a0) this.f11388d, yVar, j4, z4, false, c0022s, false)) ? EnumC1257F.f11025i : EnumC1257F.f11024e);
    }

    public C1294c(int i2) {
        int i4 = 3;
        boolean z4 = false;
        switch (i2) {
            case 4:
                this.f11388d = Build.VERSION.SDK_INT >= 28 ? new i(i4) : new H1.f(i4, z4);
                break;
            case 5:
                this.f11388d = new ArrayList();
                break;
            case 12:
                this.f11388d = new SparseArray(10);
                break;
            case 13:
                long[] jArr = AbstractC0664E.f6891a;
                this.f11388d = new i.y();
                break;
            case 27:
                this.f11388d = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f11388d = new HashSet();
                break;
        }
    }

    public /* synthetic */ C1294c(Y y4, V v4, int i2) {
        this(y4, v4, C0991a.f9082b);
    }

    public C1294c(Y store, V factory, t0 defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f11388d = new C0097d(store, factory, defaultCreationExtras);
    }
}
