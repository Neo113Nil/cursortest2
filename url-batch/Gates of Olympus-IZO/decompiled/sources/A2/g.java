package A2;

import D1.C0014b;
import F.C0;
import F.C0078z0;
import F.P;
import F.S;
import I.C0089d;
import I.C0102j0;
import I.X;
import I.X0;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import androidx.lifecycle.V;
import b0.C0288u;
import b0.InterfaceC0285r;
import com.gates.olympus.miruv.MiruvApp;
import com.gates.olympus.miruv.data.db.MiruvDatabase;
import e1.C0354c;
import e1.InterfaceC0359h;
import e1.O;
import e1.Q;
import e1.Y;
import e1.a0;
import f.AbstractC0382a;
import h.AbstractC0416e;
import h0.AbstractC0421b;
import h0.C0417A;
import h0.C0428i;
import h0.C0429j;
import h1.C0438i;
import h2.AbstractC0447i;
import i1.C0466c;
import j.AbstractC0478D;
import j.C0475A;
import j.C0506x;
import j1.C0518i;
import j1.InterfaceC0517h;
import j1.RunnableC0516g;
import j1.ThreadFactoryC0510a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k.C0523b;
import l.J;
import l.N;
import m.B0;
import m.C0577B;
import m.InterfaceC0576A;
import m.InterfaceC0608s;
import m.w0;
import n2.AbstractC0682G;
import n2.C0692Q;
import n2.InterfaceC0700f;
import t0.AbstractC0898f;

/* loaded from: classes.dex */
public final class g implements InterfaceC0359h, InterfaceC0517h, InterfaceC0608s, B0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82a;

    /* renamed from: b, reason: collision with root package name */
    public Object f83b;

    public /* synthetic */ g(int i3, Object obj) {
        this.f82a = i3;
        this.f83b = obj;
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
    public static ArrayList p(g gVar, String str) {
        int i3;
        int i4;
        char charAt;
        ArrayList arrayList;
        int i5;
        char c3;
        int i6;
        g gVar2;
        ArrayList arrayList2;
        char c4;
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
        char c5;
        char c6;
        int i15;
        char c7;
        long j8;
        int floatToRawIntBits5;
        float intBitsToFloat;
        g gVar3 = gVar;
        ArrayList arrayList3 = new ArrayList();
        int length = str.length();
        int i16 = 0;
        while (true) {
            i3 = 32;
            if (i16 >= length || Z1.i.g(str.charAt(i16), 32) > 0) {
                break;
            }
            i16++;
        }
        while (length > i16 && Z1.i.g(str.charAt(length - 1), 32) <= 0) {
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
                        if (i4 >= length || Z1.i.g(str.charAt(i4), i3) > 0) {
                            if (i4 != length) {
                                c3 = charAt;
                                char charAt2 = str.charAt(i4);
                                boolean z4 = charAt2 == '-';
                                if (z4) {
                                    i7 = i4 + 1;
                                    if (i7 == length) {
                                        j8 = i7 << i3;
                                        floatToRawIntBits5 = Float.floatToRawIntBits(Float.NaN);
                                    } else {
                                        c4 = str.charAt(i7);
                                        if (((char) (c4 - '0')) >= '\n' && c4 != '.') {
                                            j8 = i7 << i3;
                                            floatToRawIntBits5 = Float.floatToRawIntBits(Float.NaN);
                                        }
                                    }
                                } else {
                                    c4 = charAt2;
                                    i7 = i4;
                                }
                                int length2 = str.length();
                                int i19 = i7;
                                long j9 = 0;
                                while (i19 != length) {
                                    int i20 = c4 - '0';
                                    if (((char) i20) >= '\n') {
                                        break;
                                    }
                                    j9 = (j9 * 10) + i20;
                                    i19++;
                                    c4 = i19 < length2 ? str.charAt(i19) : (char) 0;
                                }
                                int i21 = i19 - i7;
                                if (i19 == length || c4 != '.') {
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
                                        c7 = str.charAt(i10);
                                        while (i10 != length) {
                                            int i24 = c7 - '0';
                                            if (((char) i24) >= '\n') {
                                                break;
                                            }
                                            j9 = (j9 * 10) + i24;
                                            i10++;
                                            if (i10 < length2) {
                                                c7 = str.charAt(i10);
                                            }
                                        }
                                        i12 = i22 - i10;
                                        i11 = i15 - i12;
                                        c4 = c7;
                                        i9 = i22;
                                    }
                                    c7 = 0;
                                }
                                if (i11 == 0) {
                                    arrayList = arrayList3;
                                    j4 = 4294967295L;
                                    i5 = length;
                                    floatToRawIntBits = (i10 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
                                    i6 = 32;
                                } else {
                                    if ((c4 | ' ') == 101) {
                                        i13 = i10 + 1;
                                        if (i13 < length2) {
                                            c6 = str.charAt(i13);
                                            c5 = '-';
                                        } else {
                                            c5 = '-';
                                            c6 = 0;
                                        }
                                        boolean z5 = c6 == c5;
                                        if (z5 || c6 == '+') {
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
                                                float[] fArr = AbstractC0421b.f4919a;
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
                                                Z1.i.e(str.substring(i4, i13), "this as java.lang.String…ing(startIndex, endIndex)");
                                                i6 = 32;
                                                j4 = 4294967295L;
                                                floatToRawIntBits = (i13 << 32) | (Float.floatToRawIntBits(Float.parseFloat(r0)) & 4294967295L);
                                            } else {
                                                long j12 = AbstractC0421b.f4920b[i12 + 325];
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
                                                    Z1.i.e(str.substring(i4, i13), "this as java.lang.String…ing(startIndex, endIndex)");
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
                                                        Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
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
                                    gVar2 = gVar;
                                    float[] fArr2 = (float[]) gVar2.f83b;
                                    i17 = i8 + 1;
                                    fArr2[i8] = intBitsToFloat;
                                    if (i17 >= fArr2.length) {
                                        float[] fArr3 = new float[i17 * 2];
                                        gVar2.f83b = fArr3;
                                        System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
                                    }
                                    i4 = i31;
                                } else {
                                    gVar2 = gVar;
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
                                charAt = c3;
                                arrayList3 = arrayList;
                            } else {
                                c3 = charAt;
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
                            charAt = c3;
                            arrayList3 = arrayList;
                        } else {
                            i4++;
                        }
                    }
                } else {
                    arrayList = arrayList3;
                    i5 = length;
                    c3 = charAt;
                    i6 = i3;
                    gVar2 = gVar3;
                }
                i16 = i4;
                float[] fArr4 = (float[]) gVar2.f83b;
                char c8 = c3;
                if (c8 == 'z' || c8 == 'Z') {
                    arrayList2 = arrayList;
                    arrayList2.add(C0429j.f4999c);
                } else {
                    arrayList2 = arrayList;
                    int i32 = 2;
                    if (c8 == 'm') {
                        int i33 = i17 - 2;
                        if (i33 >= 0) {
                            arrayList2.add(new h0.v(fArr4[0], fArr4[1]));
                            while (i32 <= i33) {
                                arrayList2.add(new h0.u(fArr4[i32], fArr4[i32 + 1]));
                                i32 += 2;
                            }
                        }
                    } else {
                        if (c8 == 'M') {
                            int i34 = i17 - 2;
                            if (i34 >= 0) {
                                arrayList2.add(new h0.n(fArr4[0], fArr4[1]));
                                while (i32 <= i34) {
                                    arrayList2.add(new h0.m(fArr4[i32], fArr4[i32 + 1]));
                                    i32 += 2;
                                }
                            }
                        } else if (c8 == 'l') {
                            int i35 = i17 - 2;
                            for (int i36 = 0; i36 <= i35; i36 += 2) {
                                arrayList2.add(new h0.u(fArr4[i36], fArr4[i36 + 1]));
                            }
                        } else if (c8 == 'L') {
                            int i37 = i17 - 2;
                            for (int i38 = 0; i38 <= i37; i38 += 2) {
                                arrayList2.add(new h0.m(fArr4[i38], fArr4[i38 + 1]));
                            }
                        } else if (c8 == 'h') {
                            int i39 = i17 - 1;
                            for (int i40 = 0; i40 <= i39; i40++) {
                                arrayList2.add(new h0.t(fArr4[i40]));
                            }
                        } else if (c8 == 'H') {
                            int i41 = i17 - 1;
                            for (int i42 = 0; i42 <= i41; i42++) {
                                arrayList2.add(new h0.l(fArr4[i42]));
                            }
                        } else if (c8 == 'v') {
                            int i43 = i17 - 1;
                            for (int i44 = 0; i44 <= i43; i44++) {
                                arrayList2.add(new h0.z(fArr4[i44]));
                            }
                        } else if (c8 == 'V') {
                            int i45 = i17 - 1;
                            for (int i46 = 0; i46 <= i45; i46++) {
                                arrayList2.add(new C0417A(fArr4[i46]));
                            }
                        } else if (c8 == 'c') {
                            int i47 = i17 - 6;
                            for (int i48 = 0; i48 <= i47; i48 += 6) {
                                arrayList2.add(new h0.s(fArr4[i48], fArr4[i48 + 1], fArr4[i48 + 2], fArr4[i48 + 3], fArr4[i48 + 4], fArr4[i48 + 5]));
                            }
                        } else if (c8 == 'C') {
                            int i49 = i17 - 6;
                            for (int i50 = 0; i50 <= i49; i50 += 6) {
                                arrayList2.add(new h0.k(fArr4[i50], fArr4[i50 + 1], fArr4[i50 + 2], fArr4[i50 + 3], fArr4[i50 + 4], fArr4[i50 + 5]));
                            }
                        } else if (c8 == 's') {
                            int i51 = i17 - 4;
                            for (int i52 = 0; i52 <= i51; i52 += 4) {
                                arrayList2.add(new h0.x(fArr4[i52], fArr4[i52 + 1], fArr4[i52 + 2], fArr4[i52 + 3]));
                            }
                        } else if (c8 == 'S') {
                            int i53 = i17 - 4;
                            for (int i54 = 0; i54 <= i53; i54 += 4) {
                                arrayList2.add(new h0.p(fArr4[i54], fArr4[i54 + 1], fArr4[i54 + 2], fArr4[i54 + 3]));
                            }
                        } else if (c8 == 'q') {
                            int i55 = i17 - 4;
                            for (int i56 = 0; i56 <= i55; i56 += 4) {
                                arrayList2.add(new h0.w(fArr4[i56], fArr4[i56 + 1], fArr4[i56 + 2], fArr4[i56 + 3]));
                            }
                        } else if (c8 == 'Q') {
                            int i57 = i17 - 4;
                            for (int i58 = 0; i58 <= i57; i58 += 4) {
                                arrayList2.add(new h0.o(fArr4[i58], fArr4[i58 + 1], fArr4[i58 + 2], fArr4[i58 + 3]));
                            }
                        } else if (c8 == 't') {
                            int i59 = i17 - 2;
                            for (int i60 = 0; i60 <= i59; i60 += 2) {
                                arrayList2.add(new h0.y(fArr4[i60], fArr4[i60 + 1]));
                            }
                        } else if (c8 == 'T') {
                            int i61 = i17 - 2;
                            for (int i62 = 0; i62 <= i61; i62 += 2) {
                                arrayList2.add(new h0.q(fArr4[i62], fArr4[i62 + 1]));
                            }
                        } else if (c8 == 'a') {
                            int i63 = i17 - 7;
                            for (int i64 = 0; i64 <= i63; i64 += 7) {
                                arrayList2.add(new h0.r(fArr4[i64], fArr4[i64 + 1], fArr4[i64 + 2], Float.compare(fArr4[i64 + 3], 0.0f) != 0, Float.compare(fArr4[i64 + 4], 0.0f) != 0, fArr4[i64 + 5], fArr4[i64 + 6]));
                            }
                        } else {
                            if (c8 != 'A') {
                                throw new IllegalArgumentException("Unknown command for: " + c8);
                            }
                            int i65 = i17 - 7;
                            for (int i66 = 0; i66 <= i65; i66 += 7) {
                                arrayList2.add(new C0428i(fArr4[i66], fArr4[i66 + 1], fArr4[i66 + 2], Float.compare(fArr4[i66 + 3], 0.0f) != 0, Float.compare(fArr4[i66 + 4], 0.0f) != 0, fArr4[i66 + 5], fArr4[i66 + 6]));
                            }
                        }
                        gVar3 = gVar2;
                        arrayList3 = arrayList2;
                        length = i5;
                        i3 = i6;
                    }
                }
                gVar3 = gVar2;
                arrayList3 = arrayList2;
                length = i5;
                i3 = i6;
            } else {
                i16 = i4;
            }
        }
        return arrayList3;
    }

    @Override // m.B0, m.A0
    public boolean a() {
        ((k) this.f83b).getClass();
        return false;
    }

    @Override // m.A0
    public m.r b(long j3, m.r rVar, m.r rVar2, m.r rVar3) {
        return ((k) this.f83b).b(j3, rVar, rVar2, rVar3);
    }

    @Override // m.A0
    public m.r c(long j3, m.r rVar, m.r rVar2, m.r rVar3) {
        return ((k) this.f83b).c(j3, rVar, rVar2, rVar3);
    }

    @Override // m.A0
    public long d(m.r rVar, m.r rVar2, m.r rVar3) {
        return ((k) this.f83b).d(rVar, rVar2, rVar3);
    }

    @Override // m.A0
    public m.r e(m.r rVar, m.r rVar2, m.r rVar3) {
        return ((k) this.f83b).e(rVar, rVar2, rVar3);
    }

    @Override // j1.InterfaceC0517h
    public void f(final AbstractC0416e abstractC0416e) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0510a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: j1.k
            @Override // java.lang.Runnable
            public final void run() {
                A2.g gVar = A2.g.this;
                AbstractC0416e abstractC0416e2 = abstractC0416e;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                gVar.getClass();
                try {
                    r L2 = g2.i.L((Context) gVar.f83b);
                    if (L2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    q qVar = (q) L2.f5283a;
                    synchronized (qVar.f5277d) {
                        qVar.f5279f = threadPoolExecutor2;
                    }
                    L2.f5283a.f(new l(abstractC0416e2, threadPoolExecutor2));
                } catch (Throwable th) {
                    abstractC0416e2.x(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // e1.InterfaceC0359h
    public InterfaceC0700f g() {
        return ((InterfaceC0359h) this.f83b).g();
    }

    @Override // m.InterfaceC0608s
    public InterfaceC0576A get(int i3) {
        switch (this.f82a) {
            case 27:
                return (C0577B) this.f83b;
            default:
                return (InterfaceC0576A) this.f83b;
        }
    }

    @Override // e1.InterfaceC0359h
    public Object h(Y1.e eVar, R1.c cVar) {
        return ((InterfaceC0359h) this.f83b).h(new C0466c(eVar, null), cVar);
    }

    public void i(int i3) {
        List list = (List) this.f83b;
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

    public void j(Object obj, Object obj2) {
        C0506x c0506x = (C0506x) this.f83b;
        int d3 = c0506x.d(obj);
        boolean z3 = d3 < 0;
        Object obj3 = z3 ? null : c0506x.f5228c[d3];
        if (obj3 != null) {
            if (obj3 instanceof C0475A) {
                ((C0475A) obj3).a(obj2);
            } else if (obj3 != obj2) {
                C0475A c0475a = new C0475A();
                c0475a.a(obj3);
                c0475a.a(obj2);
                obj2 = c0475a;
            }
            obj2 = obj3;
        }
        if (!z3) {
            c0506x.f5228c[d3] = obj2;
            return;
        }
        int i3 = ~d3;
        c0506x.f5227b[i3] = obj;
        c0506x.f5228c[i3] = obj2;
    }

    public V k(Z1.d dVar) {
        String str;
        Class cls = dVar.f3469a;
        Z1.i.f(cls, "jClass");
        String str2 = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            HashMap hashMap = Z1.d.f3467c;
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
            return ((C0014b) this.f83b).n(dVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public Y l() {
        return (Y) ((C0692Q) this.f83b).getValue();
    }

    public X0 m() {
        C0518i a3 = C0518i.a();
        if (a3.b() == 1) {
            return new I0.k(true);
        }
        C0102j0 J3 = C0089d.J(Boolean.FALSE, X.f2228i);
        I0.g gVar = new I0.g(J3, this);
        a3.f5256a.writeLock().lock();
        try {
            if (a3.f5258c != 1 && a3.f5258c != 2) {
                a3.f5257b.add(gVar);
                a3.f5256a.writeLock().unlock();
                return J3;
            }
            a3.f5259d.post(new RunnableC0516g(Arrays.asList(gVar), a3.f5258c, null));
            a3.f5256a.writeLock().unlock();
            return J3;
        } catch (Throwable th) {
            a3.f5256a.writeLock().unlock();
            throw th;
        }
    }

    public void n(float f3, float f4, float f5, float f6) {
        C0014b c0014b = (C0014b) this.f83b;
        InterfaceC0285r h3 = c0014b.h();
        long h4 = I2.d.h(a0.f.d(c0014b.m()) - (f5 + f3), a0.f.b(c0014b.m()) - (f6 + f4));
        if (a0.f.d(h4) < 0.0f || a0.f.b(h4) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        c0014b.y(h4);
        h3.r(f3, f4);
    }

    public long o() {
        switch (this.f82a) {
            case 5:
                S s3 = (S) this.f83b;
                long j3 = ((C0) s3.f1093v.f83b).f878c;
                if (j3 != 16) {
                    return j3;
                }
                C0078z0 c0078z0 = (C0078z0) AbstractC0898f.i(s3, F.B0.f872b);
                if (c0078z0 != null) {
                    long j4 = c0078z0.f1440a;
                    if (j4 != 16) {
                        return j4;
                    }
                }
                return ((C0288u) AbstractC0898f.i(s3, P.f1079a)).f4298a;
            default:
                return ((C0) this.f83b).f878c;
        }
    }

    public boolean q(Object obj, Object obj2) {
        C0506x c0506x = (C0506x) this.f83b;
        Object e3 = c0506x.e(obj);
        if (e3 == null) {
            return false;
        }
        if (!(e3 instanceof C0475A)) {
            if (!e3.equals(obj2)) {
                return false;
            }
            c0506x.g(obj);
            return true;
        }
        C0475A c0475a = (C0475A) e3;
        boolean j3 = c0475a.j(obj2);
        if (j3 && c0475a.g()) {
            c0506x.g(obj);
        }
        return j3;
    }

    public void r(Object obj) {
        boolean z3;
        C0506x c0506x = (C0506x) this.f83b;
        long[] jArr = c0506x.f5226a;
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
                        Object obj2 = c0506x.f5227b[i6];
                        Object obj3 = c0506x.f5228c[i6];
                        if (obj3 instanceof C0475A) {
                            Z1.i.d(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            C0475A c0475a = (C0475A) obj3;
                            c0475a.j(obj);
                            z3 = c0475a.g();
                        } else {
                            z3 = obj3 == obj;
                        }
                        if (z3) {
                            c0506x.h(i6);
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

    public void s(float f3, float f4, long j3) {
        InterfaceC0285r h3 = ((C0014b) this.f83b).h();
        h3.r(a0.c.d(j3), a0.c.e(j3));
        h3.e(f3, f4);
        h3.r(-a0.c.d(j3), -a0.c.e(j3));
    }

    public int t() {
        int intValue;
        List list = (List) this.f83b;
        if (!(list.size() > 0)) {
            C0089d.w("Set is empty");
            throw null;
        }
        int intValue2 = ((Number) list.get(0)).intValue();
        while (!list.isEmpty() && ((Number) list.get(0)).intValue() == intValue2) {
            list.set(0, M1.l.s0(list));
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

    public void u(float f3, float f4) {
        ((C0014b) this.f83b).h().r(f3, f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r6.f4677a > r2.f4677a) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(Y y3) {
        C0692Q c0692q;
        Object value;
        Y y4;
        Z1.i.f(y3, "newState");
        do {
            c0692q = (C0692Q) this.f83b;
            value = c0692q.getValue();
            y4 = (Y) value;
            if (!(y4 instanceof Q ? true : Z1.i.a(y4, a0.f4680b))) {
                if (!(y4 instanceof C0354c)) {
                    if (!(y4 instanceof O)) {
                        throw new L1.f();
                    }
                }
            }
            y4 = y3;
        } while (!c0692q.i(value, y4));
    }

    public /* synthetic */ g(int i3, boolean z3) {
        this.f82a = i3;
    }

    public g(MiruvApp miruvApp) {
        String str;
        this.f82a = 1;
        Context applicationContext = miruvApp.getApplicationContext();
        Z1.i.e(applicationContext, "getApplicationContext(...)");
        if (!AbstractC0447i.t0("miruv.db")) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            g gVar = new g(18);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C0523b c0523b = new C0523b(9);
            Object systemService = applicationContext.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            androidx.room.i iVar = new androidx.room.i(applicationContext, c0523b, gVar, arrayList, (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3, linkedHashSet, arrayList2, arrayList3);
            Package r12 = MiruvDatabase.class.getPackage();
            Z1.i.c(r12);
            String name = r12.getName();
            String canonicalName = MiruvDatabase.class.getCanonicalName();
            Z1.i.c(canonicalName);
            Z1.i.e(name, "fullPackage");
            if (name.length() != 0) {
                canonicalName = canonicalName.substring(name.length() + 1);
                Z1.i.e(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            String replace = canonicalName.replace('.', '_');
            Z1.i.e(replace, "replace(...)");
            String concat = replace.concat("_Impl");
            try {
                if (name.length() == 0) {
                    str = concat;
                } else {
                    str = name + '.' + concat;
                }
                Class<?> cls = Class.forName(str, true, MiruvDatabase.class.getClassLoader());
                Z1.i.d(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                androidx.room.s sVar = (androidx.room.s) cls.getDeclaredConstructor(null).newInstance(null);
                sVar.init(iVar);
                MiruvDatabase miruvDatabase = (MiruvDatabase) sVar;
                this.f83b = new com.gates.olympus.miruv.data.e(miruvDatabase.savedJointDao(), miruvDatabase.gameStatDao());
                return;
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("Cannot find implementation for " + MiruvDatabase.class.getCanonicalName() + ". " + concat + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor " + MiruvDatabase.class.getCanonicalName());
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + MiruvDatabase.class.getCanonicalName());
            }
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public g(M0.b bVar) {
        this.f82a = 26;
        this.f83b = new J(N.f5447a, bVar);
    }

    public g(int i3) {
        F0.a aVar;
        this.f82a = i3;
        switch (i3) {
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                this.f83b = new LinkedHashSet();
                break;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                if (Build.VERSION.SDK_INT >= 28) {
                    aVar = new F0.a(2);
                } else {
                    aVar = new F0.a(3);
                }
                this.f83b = aVar;
                break;
            case 8:
                this.f83b = new ArrayList();
                break;
            case 11:
                this.f83b = new SparseArray(10);
                break;
            case 12:
                long[] jArr = AbstractC0478D.f5136a;
                this.f83b = new C0506x();
                break;
            case AbstractC0382a.f4781e /* 15 */:
                this.f83b = new CopyOnWriteArrayList();
                new HashMap();
                break;
            case 18:
                this.f83b = new LinkedHashMap();
                break;
            case 21:
                this.f83b = new AtomicInteger(0);
                break;
            case 22:
                this.f83b = AbstractC0682G.b(a0.f4680b);
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                Z1.i.f(timeUnit, "timeUnit");
                this.f83b = new E2.l(D2.e.f600h, timeUnit);
                break;
        }
    }

    public g(androidx.lifecycle.a0 a0Var, androidx.lifecycle.X x3, w0 w0Var) {
        this.f82a = 17;
        Z1.i.f(a0Var, "store");
        Z1.i.f(w0Var, "defaultCreationExtras");
        this.f83b = new C0014b(a0Var, x3, w0Var);
    }

    public g(Context context) {
        this.f82a = 25;
        this.f83b = context.getApplicationContext();
    }

    public g(B2.b bVar) {
        this.f82a = 3;
        this.f83b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), bVar);
    }

    public g(float f3, float f4, m.r rVar) {
        Object gVar;
        this.f82a = 29;
        if (rVar != null) {
            gVar = new n(f3, f4, rVar);
        } else {
            gVar = new g(f3, f4);
        }
        this.f83b = new k(6, gVar);
    }

    public g(float f3, float f4) {
        this.f82a = 27;
        this.f83b = new C0577B(f3, f4, 0.01f);
    }
}
