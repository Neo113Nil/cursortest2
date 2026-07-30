package b6;

import a0.x0;
import a2.j0;
import android.R;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.b1;
import androidx.lifecycle.c0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import c7.h;
import com.chicken.road.whale.plate.PlateVault;
import com.chicken.road.whale.store.Meal;
import e6.x;
import f1.a0;
import f1.b0;
import f1.j;
import f1.l;
import f1.m;
import f1.n;
import f1.o;
import f1.p;
import f1.q;
import f1.s;
import f1.t;
import f1.u;
import f1.v;
import f1.w;
import f1.y;
import f1.z;
import f7.f0;
import f7.q0;
import g0.g1;
import g0.m2;
import g0.t0;
import g3.d0;
import g3.f;
import g3.i0;
import g3.k0;
import g5.k;
import i.e0;
import i2.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k.l0;
import k.p0;
import l.a2;
import l.r;
import l.u1;
import l3.i;
import q6.e;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class c implements k, x, f, r, a2 {

    /* renamed from: h, reason: collision with root package name */
    public static volatile c f1392h;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1393f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1394g;

    public /* synthetic */ c(int i7, Object obj) {
        this.f1393f = i7;
        this.f1394g = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:404:0x016f, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x02e0  */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList u(c cVar, String str) {
        int i7;
        int i8;
        char charAt;
        int i9;
        ?? r20;
        int i10;
        long j8;
        char c4;
        int i11;
        int i12;
        char c6;
        char c9;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j9;
        long j10;
        boolean z8;
        long j11;
        int floatToRawIntBits;
        int i19;
        int i20;
        int i21;
        long j12;
        char c10;
        long j13;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i22 = 0;
        while (true) {
            i7 = 32;
            if (i22 >= length || r6.k.g(str.charAt(i22), 32) > 0) {
                break;
            }
            i22++;
        }
        while (length > i22 && r6.k.g(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i23 = 0;
        while (i22 < length) {
            while (true) {
                i8 = i22 + 1;
                charAt = str.charAt(i22);
                int i24 = charAt | ' ';
                if ((i24 - 122) * (i24 - 97) <= 0 && i24 != 101) {
                    break;
                }
                if (i8 >= length) {
                    charAt = 0;
                    break;
                }
                i22 = i8;
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i23 = 0;
                    while (true) {
                        if (i8 >= length || r6.k.g(str.charAt(i8), i7) > 0) {
                            if (i8 == length) {
                                i9 = i7;
                                i10 = i23;
                                j13 = (i8 << i9) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
                                j8 = 4294967295L;
                                r20 = 1;
                            } else {
                                i9 = i7;
                                i10 = i23;
                                char charAt2 = str.charAt(i8);
                                boolean z9 = charAt2 == '-';
                                r20 = 1;
                                r20 = 1;
                                if (z9) {
                                    i11 = i8 + 1;
                                    if (i11 == length) {
                                        j13 = (i11 << i9) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
                                        j8 = 4294967295L;
                                    } else {
                                        j8 = 4294967295L;
                                        c4 = str.charAt(i11);
                                        if (((char) (c4 - '0')) >= '\n' && c4 != '.') {
                                            j11 = i11 << i9;
                                            j12 = Float.floatToRawIntBits(Float.NaN);
                                            j13 = j11 | (j12 & j8);
                                        }
                                    }
                                } else {
                                    j8 = 4294967295L;
                                    c4 = charAt2;
                                    i11 = i8;
                                }
                                int length2 = str.length();
                                int i25 = i11;
                                long j14 = 0;
                                while (i25 != length) {
                                    int i26 = c4 - '0';
                                    if (((char) i26) >= '\n') {
                                        break;
                                    }
                                    int i27 = i8;
                                    j14 = (j14 * 10) + i26;
                                    i25++;
                                    c4 = i25 < length2 ? str.charAt(i25) : (char) 0;
                                    i8 = i27;
                                }
                                int i28 = i8;
                                int i29 = i25 - i11;
                                if (i25 == length || c4 != '.') {
                                    i12 = i25;
                                    c6 = 16;
                                    c9 = '0';
                                    i13 = i12;
                                    i14 = i13;
                                    i15 = 0;
                                } else {
                                    int i30 = i25 + 1;
                                    i13 = i30;
                                    c6 = 16;
                                    while (true) {
                                        c9 = '0';
                                        if (length - i13 < 4) {
                                            i12 = i25;
                                            break;
                                        }
                                        i12 = i25;
                                        long charAt3 = str.charAt(i13) | (str.charAt(i13 + 1) << 16) | (str.charAt(i13 + 2) << i9) | (str.charAt(i13 + 3) << 48);
                                        long j15 = charAt3 - 13511005043687472L;
                                        int i31 = (((charAt3 + 19703549022044230L) | j15) & (-35747867511423104L)) != 0 ? -1 : (int) ((j15 * 281475406208040961L) >>> 48);
                                        if (i31 < 0) {
                                            break;
                                        }
                                        j14 = (j14 * 10000) + i31;
                                        i13 += 4;
                                        i25 = i12;
                                    }
                                    if (i13 < length2) {
                                        c10 = str.charAt(i13);
                                        while (i13 != length) {
                                            int i32 = c10 - '0';
                                            if (((char) i32) >= '\n') {
                                                break;
                                            }
                                            j14 = (j14 * 10) + i32;
                                            i13++;
                                            if (i13 < length2) {
                                                c10 = str.charAt(i13);
                                            }
                                        }
                                        i15 = i30 - i13;
                                        i29 -= i15;
                                        c4 = c10;
                                        i14 = i30;
                                    }
                                    c10 = 0;
                                }
                                if (i29 == 0) {
                                    j11 = i13 << i9;
                                    floatToRawIntBits = Float.floatToRawIntBits(Float.NaN);
                                } else {
                                    if ((c4 | ' ') == 101) {
                                        i17 = i13 + 1;
                                        char charAt4 = i17 < length2 ? str.charAt(i17) : (char) 0;
                                        boolean z10 = charAt4 == '-';
                                        if (z10 || charAt4 == '+') {
                                            i17 = i13 + 2;
                                        }
                                        char charAt5 = str.charAt(i17);
                                        i18 = 0;
                                        while (true) {
                                            if (i17 == length) {
                                                i16 = i28;
                                                i21 = i15;
                                                break;
                                            }
                                            int i33 = charAt5 - '0';
                                            i16 = i28;
                                            i21 = i15;
                                            if (((char) i33) >= '\n') {
                                                break;
                                            }
                                            if (i18 < 1024) {
                                                i18 = (i18 * 10) + i33;
                                            }
                                            i17++;
                                            charAt5 = i17 < length2 ? str.charAt(i17) : (char) 0;
                                            i28 = i16;
                                            i15 = i21;
                                        }
                                        if (z10) {
                                            i18 = -i18;
                                        }
                                        i15 = i21 + i18;
                                    } else {
                                        i16 = i28;
                                        i17 = i13;
                                        i18 = 0;
                                    }
                                    int i34 = 19;
                                    if (i29 > 19) {
                                        int i35 = i11;
                                        char charAt6 = str.charAt(i11);
                                        j9 = Long.MIN_VALUE;
                                        while (true) {
                                            if (i17 == length) {
                                                break;
                                            }
                                            if (charAt6 != c9 && charAt6 != '.') {
                                                i34 = 19;
                                                break;
                                            }
                                            if (charAt6 == '0') {
                                                i29--;
                                            }
                                            i35++;
                                            charAt6 = i35 < length2 ? str.charAt(i35) : (char) 0;
                                            i34 = 19;
                                            c9 = '0';
                                        }
                                        if (i29 > i34) {
                                            char charAt7 = str.charAt(i11);
                                            long j16 = 0;
                                            while (true) {
                                                i19 = i11;
                                                if (i11 == i12 || Long.compare(j16 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                    break;
                                                }
                                                j16 = (j16 * 10) + (charAt7 - '0');
                                                i11 = i19 + 1;
                                                charAt7 = i11 < length2 ? str.charAt(i11) : (char) 0;
                                            }
                                            if (Long.compare(j16 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                i15 = (i12 - i19) + i18;
                                            } else {
                                                char charAt8 = str.charAt(i14);
                                                int i36 = i14;
                                                while (true) {
                                                    i20 = i36;
                                                    if (i36 == i13 || Long.compare(j16 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                        break;
                                                    }
                                                    j16 = (j16 * 10) + (charAt8 - '0');
                                                    i36 = i20 + 1;
                                                    charAt8 = i36 < length2 ? str.charAt(i36) : (char) 0;
                                                }
                                                i15 = (i14 - i20) + i18;
                                            }
                                            z8 = true;
                                            j10 = j16;
                                            if (-10 > i15 && i15 < 11 && !z8 && Long.compare(j10 ^ j9, -9223372036837998592L) <= 0) {
                                                float f9 = j10;
                                                float[] fArr = f1.b.f3082a;
                                                float f10 = i15 < 0 ? f9 / fArr[-i15] : f9 * fArr[i15];
                                                if (z9) {
                                                    f10 = -f10;
                                                }
                                                j11 = i17 << i9;
                                                floatToRawIntBits = Float.floatToRawIntBits(f10);
                                            } else if (j10 != 0) {
                                                j11 = i17 << i9;
                                                floatToRawIntBits = Float.floatToRawIntBits(z9 ? -0.0f : 0.0f);
                                            } else if (-126 > i15 || i15 >= 128) {
                                                String substring = str.substring(i16, i17);
                                                r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                                j11 = i17 << i9;
                                                floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring));
                                            } else {
                                                long j17 = f1.b.f3083b[i15 + 325];
                                                int numberOfLeadingZeros = Long.numberOfLeadingZeros(j10);
                                                long j18 = j10 << numberOfLeadingZeros;
                                                long j19 = j18 & j8;
                                                long j20 = j18 >>> i9;
                                                long j21 = j17 & j8;
                                                long j22 = j17 >>> i9;
                                                long j23 = j20 * j22;
                                                long j24 = j22 * j19;
                                                long j25 = j23 + ((((j20 * j21) + ((j19 * j21) >>> i9)) + (j24 & j8)) >>> i9) + (j24 >>> i9);
                                                int i37 = (int) (j25 >>> 63);
                                                long j26 = j25 >>> (i37 + 9);
                                                int i38 = numberOfLeadingZeros + (i37 ^ 1);
                                                long j27 = j25 & 511;
                                                if (j27 == 511 || (j27 == 0 && (j26 & 3) == 1)) {
                                                    String substring2 = str.substring(i16, i17);
                                                    r6.k.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                                    j11 = i17 << i9;
                                                    floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring2));
                                                } else {
                                                    long j28 = (j26 + 1) >>> 1;
                                                    if (j28 >= 9007199254740992L) {
                                                        i38--;
                                                        j28 = 4503599627370496L;
                                                    }
                                                    long j29 = j28 & (-4503599627370497L);
                                                    long j30 = ((((i15 * 217706) >> c6) + 1024) + 63) - i38;
                                                    if (j30 < 1 || j30 > 2046) {
                                                        String substring3 = str.substring(i16, i17);
                                                        r6.k.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                                        j11 = i17 << i9;
                                                        floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring3));
                                                    } else {
                                                        j11 = i17 << i9;
                                                        floatToRawIntBits = Float.floatToRawIntBits((float) Double.longBitsToDouble((j30 << 52) | j29 | (z9 ? j9 : 0L)));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        j9 = Long.MIN_VALUE;
                                    }
                                    j10 = j14;
                                    z8 = false;
                                    if (-10 > i15) {
                                    }
                                    if (j10 != 0) {
                                    }
                                }
                                j12 = floatToRawIntBits;
                                j13 = j11 | (j12 & j8);
                            }
                            int i39 = (int) (j13 >>> i9);
                            float intBitsToFloat = Float.intBitsToFloat((int) (j13 & j8));
                            if (Float.isNaN(intBitsToFloat)) {
                                i8 = i39;
                                i23 = i10;
                            } else {
                                float[] fArr2 = (float[]) cVar.f1394g;
                                int i40 = i10 + 1;
                                fArr2[i10] = intBitsToFloat;
                                if (i40 >= fArr2.length) {
                                    float[] fArr3 = new float[i40 * 2];
                                    cVar.f1394g = fArr3;
                                    System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
                                }
                                i23 = i40;
                                i8 = i39;
                            }
                            while (i8 < length && str.charAt(i8) == ',') {
                                i8++;
                            }
                            if (i8 >= length || Float.isNaN(intBitsToFloat)) {
                                break;
                            }
                            i7 = i9;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    i9 = i7;
                    r20 = 1;
                }
                float[] fArr4 = (float[]) cVar.f1394g;
                if (charAt == 'z' || charAt == 'Z') {
                    arrayList.add(f1.k.f3196c);
                } else {
                    int i41 = 2;
                    if (charAt == 'm') {
                        int i42 = i23 - 2;
                        if (i42 >= 0) {
                            arrayList.add(new w(fArr4[0], fArr4[r20]));
                            while (i41 <= i42) {
                                arrayList.add(new v(fArr4[i41], fArr4[i41 + 1]));
                                i41 += 2;
                            }
                        }
                    } else {
                        if (charAt == 'M') {
                            int i43 = i23 - 2;
                            if (i43 >= 0) {
                                arrayList.add(new o(fArr4[0], fArr4[r20]));
                                while (i41 <= i43) {
                                    arrayList.add(new n(fArr4[i41], fArr4[i41 + 1]));
                                    i41 += 2;
                                }
                            }
                        } else if (charAt == 'l') {
                            int i44 = i23 - 2;
                            for (int i45 = 0; i45 <= i44; i45 += 2) {
                                arrayList.add(new v(fArr4[i45], fArr4[i45 + 1]));
                            }
                        } else if (charAt == 'L') {
                            int i46 = i23 - 2;
                            for (int i47 = 0; i47 <= i46; i47 += 2) {
                                arrayList.add(new n(fArr4[i47], fArr4[i47 + 1]));
                            }
                        } else if (charAt == 'h') {
                            int i48 = i23 - 1;
                            for (int i49 = 0; i49 <= i48; i49++) {
                                arrayList.add(new u(fArr4[i49]));
                            }
                        } else if (charAt == 'H') {
                            int i50 = i23 - 1;
                            for (int i51 = 0; i51 <= i50; i51++) {
                                arrayList.add(new m(fArr4[i51]));
                            }
                        } else if (charAt == 'v') {
                            int i52 = i23 - 1;
                            for (int i53 = 0; i53 <= i52; i53++) {
                                arrayList.add(new a0(fArr4[i53]));
                            }
                        } else if (charAt == 'V') {
                            int i54 = i23 - 1;
                            for (int i55 = 0; i55 <= i54; i55++) {
                                arrayList.add(new b0(fArr4[i55]));
                            }
                        } else if (charAt == 'c') {
                            int i56 = i23 - 6;
                            for (int i57 = 0; i57 <= i56; i57 += 6) {
                                arrayList.add(new t(fArr4[i57], fArr4[i57 + 1], fArr4[i57 + 2], fArr4[i57 + 3], fArr4[i57 + 4], fArr4[i57 + 5]));
                            }
                        } else if (charAt == 'C') {
                            int i58 = i23 - 6;
                            for (int i59 = 0; i59 <= i58; i59 += 6) {
                                arrayList.add(new l(fArr4[i59], fArr4[i59 + 1], fArr4[i59 + 2], fArr4[i59 + 3], fArr4[i59 + 4], fArr4[i59 + 5]));
                            }
                        } else if (charAt == 's') {
                            int i60 = i23 - 4;
                            for (int i61 = 0; i61 <= i60; i61 += 4) {
                                arrayList.add(new y(fArr4[i61], fArr4[i61 + 1], fArr4[i61 + 2], fArr4[i61 + 3]));
                            }
                        } else if (charAt == 'S') {
                            int i62 = i23 - 4;
                            for (int i63 = 0; i63 <= i62; i63 += 4) {
                                arrayList.add(new q(fArr4[i63], fArr4[i63 + 1], fArr4[i63 + 2], fArr4[i63 + 3]));
                            }
                        } else if (charAt == 'q') {
                            int i64 = i23 - 4;
                            for (int i65 = 0; i65 <= i64; i65 += 4) {
                                arrayList.add(new f1.x(fArr4[i65], fArr4[i65 + 1], fArr4[i65 + 2], fArr4[i65 + 3]));
                            }
                        } else if (charAt == 'Q') {
                            int i66 = i23 - 4;
                            for (int i67 = 0; i67 <= i66; i67 += 4) {
                                arrayList.add(new p(fArr4[i67], fArr4[i67 + 1], fArr4[i67 + 2], fArr4[i67 + 3]));
                            }
                        } else if (charAt == 't') {
                            int i68 = i23 - 2;
                            for (int i69 = 0; i69 <= i68; i69 += 2) {
                                arrayList.add(new z(fArr4[i69], fArr4[i69 + 1]));
                            }
                        } else if (charAt == 'T') {
                            int i70 = i23 - 2;
                            for (int i71 = 0; i71 <= i70; i71 += 2) {
                                arrayList.add(new f1.r(fArr4[i71], fArr4[i71 + 1]));
                            }
                        } else if (charAt == 'a') {
                            int i72 = i23 - 7;
                            for (int i73 = 0; i73 <= i72; i73 += 7) {
                                arrayList.add(new s(fArr4[i73], fArr4[i73 + 1], fArr4[i73 + 2], Float.compare(fArr4[i73 + 3], 0.0f) != 0 ? r20 : false, Float.compare(fArr4[i73 + 4], 0.0f) != 0 ? r20 : false, fArr4[i73 + 5], fArr4[i73 + 6]));
                            }
                        } else {
                            if (charAt != 'A') {
                                throw new IllegalArgumentException("Unknown command for: " + charAt);
                            }
                            int i74 = i23 - 7;
                            for (int i75 = 0; i75 <= i74; i75 += 7) {
                                arrayList.add(new j(fArr4[i75], fArr4[i75 + 1], fArr4[i75 + 2], Float.compare(fArr4[i75 + 3], 0.0f) != 0 ? r20 : false, Float.compare(fArr4[i75 + 4], 0.0f) != 0 ? r20 : false, fArr4[i75 + 5], fArr4[i75 + 6]));
                            }
                        }
                        i22 = i8;
                        i7 = i9;
                    }
                }
                i22 = i8;
                i7 = i9;
            } else {
                i22 = i8;
            }
        }
        return arrayList;
    }

    public void A() {
        View view;
        View view2 = (View) this.f1394g;
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
        view.post(new c0(3, view));
    }

    public void B(float f9, float f10) {
        ((b1.b) this.f1394g).k().k(f9, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r6.f4147a > r2.f4147a) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Type inference failed for: r3v4, types: [h7.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void C(i0 i0Var) {
        Object value;
        i0 i0Var2;
        r6.k.f(i0Var, "newState");
        q0 q0Var = (q0) this.f1394g;
        do {
            value = q0Var.getValue();
            i0Var2 = (i0) value;
            if (!(i0Var2 instanceof d0 ? true : r6.k.a(i0Var2, k0.f4164b))) {
                if (!(i0Var2 instanceof g3.c)) {
                    if (!(i0Var2 instanceof g3.b0)) {
                        throw new b4.c();
                    }
                }
                ?? r32 = g7.c.f4481b;
                if (value == null) {
                    value = r32;
                }
                if (i0Var2 == null) {
                    i0Var2 = r32;
                }
            }
            i0Var2 = i0Var;
            ?? r322 = g7.c.f4481b;
            if (value == null) {
            }
            if (i0Var2 == null) {
            }
        } while (!q0Var.l(value, i0Var2));
    }

    public void D(g2.w wVar, long j8, boolean z8, a0.s sVar) {
        x0 x0Var = (x0) this.f1394g;
        x0Var.n(j0.b(x0.a(x0Var, wVar, j8, z8, false, sVar, false)) ? w.a0.f9185h : w.a0.f9184g);
    }

    @Override // l.a2, l.y1
    public boolean a() {
        ((g3.k) this.f1394g).getClass();
        return false;
    }

    @Override // l.y1
    public long b(l.q qVar, l.q qVar2, l.q qVar3) {
        return ((g3.k) this.f1394g).b(qVar, qVar2, qVar3);
    }

    @Override // l.y1
    public l.q c(l.q qVar, l.q qVar2, l.q qVar3) {
        return ((g3.k) this.f1394g).c(qVar, qVar2, qVar3);
    }

    @Override // g3.f
    public Object d(e eVar, j6.c cVar) {
        return ((f) this.f1394g).d(new k3.c(eVar, null, 0), cVar);
    }

    @Override // l.y1
    public l.q e(long j8, l.q qVar, l.q qVar2, l.q qVar3) {
        return ((g3.k) this.f1394g).e(j8, qVar, qVar2, qVar3);
    }

    @Override // l.y1
    public l.q f(long j8, l.q qVar, l.q qVar2, l.q qVar3) {
        return ((g3.k) this.f1394g).f(j8, qVar, qVar2, qVar3);
    }

    @Override // e6.x
    public String g(Object obj) {
        return ((Meal) obj).getCategory();
    }

    @Override // l.r
    public l.b0 get(int i7) {
        switch (this.f1393f) {
            case 27:
                return (l.c0) this.f1394g;
            default:
                return (l.b0) this.f1394g;
        }
    }

    @Override // g5.k
    public void h(androidx.room.c cVar) {
        h hVar = (h) this.f1394g;
        PlateVault plateVault = PlateVault.INSTANCE;
        Boolean bool = (Boolean) p5.b.b(((t5.m) cVar.r(plateVault.at(1)).f1069g).f8910f.getValue(), Boolean.TYPE);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        String str = (String) p5.b.b(((t5.m) cVar.r(plateVault.at(2)).f1069g).f8910f.getValue(), String.class);
        if (str == null) {
            str = "";
        }
        String str2 = (String) p5.b.b(((t5.m) cVar.r(plateVault.at(3)).f1069g).f8910f.getValue(), String.class);
        f4.a aVar = new f4.a(booleanValue, str, str2 != null ? str2 : "");
        if (hVar.v()) {
            hVar.resumeWith(aVar);
        }
    }

    @Override // g3.f
    public f7.f i() {
        return ((f) this.f1394g).i();
    }

    @Override // e6.x
    public Iterator l() {
        return ((Iterable) this.f1394g).iterator();
    }

    @Override // g5.k
    public void m(g5.a aVar) {
        r6.k.f(aVar, "error");
        h hVar = (h) this.f1394g;
        if (hVar.v()) {
            hVar.resumeWith(null);
        }
    }

    public void n(Object obj, Object obj2) {
        i.x xVar = (i.x) this.f1394g;
        int d8 = xVar.d(obj);
        boolean z8 = d8 < 0;
        Object obj3 = z8 ? null : xVar.f4814c[d8];
        if (obj3 != null) {
            if (obj3 instanceof i.b0) {
                ((i.b0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                i.b0 b0Var = new i.b0();
                b0Var.a(obj3);
                b0Var.a(obj2);
                obj2 = b0Var;
            }
            obj2 = obj3;
        }
        if (!z8) {
            xVar.f4814c[d8] = obj2;
            return;
        }
        int i7 = ~d8;
        xVar.f4813b[i7] = obj;
        xVar.f4814c[i7] = obj2;
    }

    public w0 o(r6.d dVar) {
        String str;
        b1.b bVar = (b1.b) this.f1394g;
        HashMap hashMap = r6.d.f7955c;
        Class cls = dVar.f7957a;
        r6.k.f(cls, "jClass");
        String str2 = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            if (cls.isArray()) {
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
            return bVar.q("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2), dVar);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public i0 p() {
        return (i0) ((q0) this.f1394g).getValue();
    }

    public m2 q() {
        l3.k a3 = l3.k.a();
        if (a3.b() == 1) {
            return new i2.k(true);
        }
        g1 J = g0.d.J(Boolean.FALSE, t0.f3903k);
        g gVar = new g(J, this);
        a3.f5908a.writeLock().lock();
        try {
            if (a3.f5910c != 1 && a3.f5910c != 2) {
                a3.f5909b.add(gVar);
                a3.f5908a.writeLock().unlock();
                return J;
            }
            a3.f5911d.post(new i(Arrays.asList(gVar), a3.f5910c, null));
            a3.f5908a.writeLock().unlock();
            return J;
        } catch (Throwable th) {
            a3.f5908a.writeLock().unlock();
            throw th;
        }
    }

    public void r() {
        View view = (View) this.f1394g;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void s(float f9, float f10, float f11, float f12) {
        b1.b bVar = (b1.b) this.f1394g;
        z0.r k8 = bVar.k();
        long a3 = v0.d.a(y0.f.d(bVar.p()) - (f11 + f9), y0.f.b(bVar.p()) - (f12 + f10));
        if (y0.f.d(a3) < 0.0f || y0.f.b(a3) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        bVar.C(a3);
        k8.k(f9, f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(long j8, j6.c cVar) {
        f4.q qVar;
        int i7;
        if (cVar instanceof f4.q) {
            qVar = (f4.q) cVar;
            int i8 = qVar.f3344h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                qVar.f3344h = i8 - Integer.MIN_VALUE;
                Object obj = qVar.f3342f;
                i7 = qVar.f3344h;
                if (i7 != 0) {
                    d6.a.e(obj);
                    f4.s sVar = new f4.s(this, null);
                    qVar.f3344h = 1;
                    obj = c7.a0.y(j8, sVar, qVar);
                    i6.a aVar = i6.a.f4956f;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                String str = (String) obj;
                return str != null ? "" : str;
            }
        }
        qVar = new f4.q(this, cVar);
        Object obj2 = qVar.f3342f;
        i7 = qVar.f3344h;
        if (i7 != 0) {
        }
        String str2 = (String) obj2;
        if (str2 != null) {
        }
    }

    public boolean w(Object obj, Object obj2) {
        i.x xVar = (i.x) this.f1394g;
        Object e9 = xVar.e(obj);
        if (e9 == null) {
            return false;
        }
        if (!(e9 instanceof i.b0)) {
            if (!e9.equals(obj2)) {
                return false;
            }
            xVar.g(obj);
            return true;
        }
        i.b0 b0Var = (i.b0) e9;
        boolean j8 = b0Var.j(obj2);
        if (j8 && b0Var.g()) {
            xVar.g(obj);
        }
        return j8;
    }

    public void x(Object obj) {
        boolean z8;
        i.x xVar = (i.x) this.f1394g;
        long[] jArr = xVar.f4812a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j8 = jArr[i7];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j8) < 128) {
                        int i10 = (i7 << 3) + i9;
                        Object obj2 = xVar.f4813b[i10];
                        Object obj3 = xVar.f4814c[i10];
                        if (obj3 instanceof i.b0) {
                            i.b0 b0Var = (i.b0) obj3;
                            b0Var.j(obj);
                            z8 = b0Var.g();
                        } else {
                            z8 = obj3 == obj;
                        }
                        if (z8) {
                            xVar.h(i10);
                        }
                    }
                    j8 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public void y(float f9, float f10, long j8) {
        z0.r k8 = ((b1.b) this.f1394g).k();
        k8.k(y0.c.d(j8), y0.c.e(j8));
        k8.c(f9, f10);
        k8.k(-y0.c.d(j8), -y0.c.e(j8));
    }

    public void z(Exception exc) {
        f5.i iVar = (f5.i) this.f1394g;
        if (q2.h.f7506k.r(iVar, null, new q2.c(exc))) {
            q2.h.g(iVar);
        }
    }

    public /* synthetic */ c(int i7, boolean z8) {
        this.f1393f = i7;
    }

    public c(m2.b bVar) {
        this.f1393f = 24;
        this.f1394g = new l0(p0.f5256a, bVar);
    }

    public c(int i7) {
        Object iVar;
        this.f1393f = i7;
        switch (i7) {
            case 4:
                this.f1394g = new LinkedHashMap();
                break;
            case 11:
                if (Build.VERSION.SDK_INT >= 28) {
                    iVar = new m4.f();
                } else {
                    iVar = new j4.i(8);
                }
                this.f1394g = iVar;
                break;
            case 17:
                this.f1394g = new AtomicInteger(0);
                break;
            case 18:
                this.f1394g = f0.c(k0.f4164b);
                break;
            case 20:
                this.f1394g = new Handler(Looper.getMainLooper());
                break;
            case 21:
                this.f1394g = new SparseArray(10);
                break;
            case 22:
                long[] jArr = e0.f4736a;
                this.f1394g = new i.x();
                break;
            default:
                this.f1394g = new HashSet();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[LOOP:1: B:14:0x003f->B:15:0x0041, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(int[] iArr, float[] fArr, float[][] fArr2) {
        int i7;
        int length;
        int i8;
        this.f1393f = 26;
        int length2 = fArr.length - 1;
        l.s[][] sVarArr = new l.s[length2][];
        int i9 = 1;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length2) {
            int i12 = iArr[i11];
            int i13 = 3;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            i13 = 4;
                            if (i12 != 4) {
                                i13 = 5;
                                if (i12 != 5) {
                                    i7 = i10;
                                    float[] fArr3 = fArr2[i11];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    l.s[] sVarArr2 = new l.s[length];
                                    for (i8 = 0; i8 < length; i8++) {
                                        int i14 = i8 * 2;
                                        float f9 = fArr[i11];
                                        int i15 = i11 + 1;
                                        float f10 = fArr[i15];
                                        float[] fArr4 = fArr2[i11];
                                        float f11 = fArr4[i14];
                                        int i16 = i14 + 1;
                                        float f12 = fArr4[i16];
                                        float[] fArr5 = fArr2[i15];
                                        sVarArr2[i8] = new l.s(i7, f9, f10, f11, f12, fArr5[i14], fArr5[i16]);
                                    }
                                    sVarArr[i11] = sVarArr2;
                                    i11++;
                                    i10 = i7;
                                }
                            }
                        }
                    }
                    i9 = 2;
                    i7 = i9;
                    float[] fArr32 = fArr2[i11];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    l.s[] sVarArr22 = new l.s[length];
                    while (i8 < length) {
                    }
                    sVarArr[i11] = sVarArr22;
                    i11++;
                    i10 = i7;
                }
                i9 = 1;
                i7 = i9;
                float[] fArr322 = fArr2[i11];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                l.s[] sVarArr222 = new l.s[length];
                while (i8 < length) {
                }
                sVarArr[i11] = sVarArr222;
                i11++;
                i10 = i7;
            }
            i7 = i13;
            float[] fArr3222 = fArr2[i11];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            l.s[] sVarArr2222 = new l.s[length];
            while (i8 < length) {
            }
            sVarArr[i11] = sVarArr2222;
            i11++;
            i10 = i7;
        }
        this.f1394g = sVarArr;
    }

    public c(View view) {
        this.f1393f = 8;
        if (Build.VERSION.SDK_INT >= 30) {
            b3.i iVar = new b3.i(7, view);
            iVar.f1337i = view;
            this.f1394g = iVar;
            return;
        }
        this.f1394g = new c(7, view);
    }

    public void t() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b1 b1Var, y0 y0Var, int i7) {
        this(b1Var, y0Var, q3.a.f7511b);
        this.f1393f = 3;
    }

    public c(b1 b1Var, y0 y0Var, u1 u1Var) {
        this.f1393f = 3;
        r6.k.f(b1Var, "store");
        r6.k.f(u1Var, "defaultCreationExtras");
        this.f1394g = new b1.b(b1Var, y0Var, u1Var);
    }

    public c(b.d dVar) {
        this.f1393f = 6;
        this.f1394g = new CopyOnWriteArrayList();
        new HashMap();
    }

    public c(float f9, float f10, l.q qVar) {
        Object cVar;
        this.f1393f = 29;
        if (qVar != null) {
            cVar = new f1.g(f9, f10, qVar);
        } else {
            cVar = new c(f9, f10);
        }
        this.f1394g = new g3.k(3, cVar);
    }

    public c(float f9, float f10) {
        this.f1393f = 27;
        this.f1394g = new l.c0(f9, f10, 0.01f);
    }
}
