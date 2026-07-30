package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class nj implements k93, am1, ih0, g, mt1, q20 {
    public final /* synthetic */ int m;

    public /* synthetic */ nj(int i) {
        this.m = i;
    }

    public static final eu b(nj njVar, String str) {
        eu euVar = new eu(str);
        eu.d.put(str, euVar);
        return euVar;
    }

    public static final void c(rj rjVar, long j, boolean z) {
        rj rjVar2;
        ReentrantLock reentrantLock = rj.h;
        if (rj.l == null) {
            rj.l = new rj();
            oj ojVar = new oj("Okio Watchdog");
            ojVar.setDaemon(true);
            ojVar.start();
        }
        long nanoTime = System.nanoTime();
        if (j != 0 && z) {
            rjVar.g = Math.min(j, rjVar.c() - nanoTime) + nanoTime;
        } else if (j != 0) {
            rjVar.g = j + nanoTime;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            rjVar.g = rjVar.c();
        }
        long j2 = rjVar.g - nanoTime;
        rj rjVar3 = rj.l;
        rjVar3.getClass();
        while (true) {
            rjVar2 = rjVar3.f;
            if (rjVar2 == null || j2 < rjVar2.g - nanoTime) {
                break;
            } else {
                rjVar3 = rjVar2;
            }
        }
        rjVar.f = rjVar2;
        rjVar3.f = rjVar;
        if (rjVar3 == rj.l) {
            rj.i.signal();
        }
    }

    public static final w92 d(w92 w92Var) {
        if ((w92Var != null ? w92Var.s : null) == null) {
            return w92Var;
        }
        v92 f = w92Var.f();
        f.g = null;
        return f.a();
    }

    public static rj e() {
        rj rjVar = rj.l;
        rjVar.getClass();
        rj rjVar2 = rjVar.f;
        if (rjVar2 == null) {
            long nanoTime = System.nanoTime();
            rj.i.await(rj.j, TimeUnit.MILLISECONDS);
            rj rjVar3 = rj.l;
            rjVar3.getClass();
            if (rjVar3.f != null || System.nanoTime() - nanoTime < rj.k) {
                return null;
            }
            return rj.l;
        }
        long nanoTime2 = rjVar2.g - System.nanoTime();
        if (nanoTime2 > 0) {
            rj.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        rj rjVar4 = rj.l;
        rjVar4.getClass();
        rjVar4.f = rjVar2.f;
        rjVar2.f = null;
        rjVar2.e = 2;
        return rjVar2;
    }

    public static dr g(String str) {
        if (str.length() % 2 != 0) {
            lh.c("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (ap.m(str.charAt(i2 + 1)) + (ap.m(str.charAt(i2)) << 4));
        }
        return new dr(bArr);
    }

    public static dr j(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(yt.b);
        bytes.getClass();
        dr drVar = new dr(bytes);
        drVar.o = str;
        return drVar;
    }

    public static xd1 q(List list) {
        return new xd1(list, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
    }

    public static long r(float f, float f2, float f3) {
        int i = aw.h;
        pa2 pa2Var = kw.e;
        if (0.0f > f || f > 360.0f || 0.0f > f2 || f2 > 1.0f || 0.0f > f3 || f3 > 1.0f) {
            k21.a("HSL (" + f + ", " + f2 + ", " + f3 + ") must be in range (0..360, 0..1, 0..1)");
        }
        return ap.b(s(0, f, f2, f3), s(8, f, f2, f3), s(4, f, f2, f3), 1.0f, pa2Var);
    }

    public static float s(int i, float f, float f2, float f3) {
        float f4 = ((f / 30.0f) + i) % 12.0f;
        return f3 - (Math.max(-1.0f, Math.min(f4 - 3.0f, Math.min(9.0f - f4, 1.0f))) * (Math.min(f3, 1.0f - f3) * f2));
    }

    public static boolean t(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static xd1 u(List list) {
        return new xd1(list, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L));
    }

    public static void v(jh0 jh0Var, StringBuilder sb) {
        int charAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        jh0Var.c.append(new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)}));
        sb.delete(0, 3);
    }

    @Override // defpackage.q20
    public long a(long j, long j2) {
        switch (this.m) {
            case 26:
                float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i = ne2.a;
                return floatToRawIntBits;
            case 27:
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                int i2 = ne2.a;
                return floatToRawIntBits2;
            case 28:
                float j3 = j8.j(j, j2);
                long floatToRawIntBits3 = (Float.floatToRawIntBits(j3) << 32) | (Float.floatToRawIntBits(j3) & 4294967295L);
                int i3 = ne2.a;
                return floatToRawIntBits3;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long floatToRawIntBits4 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i4 = ne2.a;
                    return floatToRawIntBits4;
                }
                float j4 = j8.j(j, j2);
                long floatToRawIntBits5 = (Float.floatToRawIntBits(j4) << 32) | (Float.floatToRawIntBits(j4) & 4294967295L);
                int i5 = ne2.a;
                return floatToRawIntBits5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    @Override // defpackage.k93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eo f(String str, int i, EnumMap enumMap) {
        char c;
        int i2;
        int i3;
        int i4;
        co coVar;
        int i5;
        int i6;
        int i7;
        co C;
        int i8;
        int i9;
        int i10;
        LinkedList a;
        Charset charset = StandardCharsets.ISO_8859_1;
        gh0 gh0Var = gh0.n;
        if (enumMap.containsKey(gh0Var)) {
            charset = Charset.forName(enumMap.get(gh0Var).toString());
        }
        gh0 gh0Var2 = gh0.m;
        int parseInt = enumMap.containsKey(gh0Var2) ? Integer.parseInt(enumMap.get(gh0Var2).toString()) : 33;
        gh0 gh0Var3 = gh0.v;
        int parseInt2 = enumMap.containsKey(gh0Var3) ? Integer.parseInt(enumMap.get(gh0Var3).toString()) : 0;
        int i11 = 1;
        if (i != 1) {
            lh.e("Can only encode AZTEC, but got ".concat(q40.v(i)));
            return null;
        }
        byte[] bytes = str.getBytes(charset);
        int[] iArr = iv1.c;
        List<ro2> singletonList = Collections.singletonList(ro2.e);
        int i12 = 0;
        while (true) {
            int i13 = 4;
            int i14 = 2;
            c = '\n';
            i2 = 3;
            if (i12 >= bytes.length) {
                break;
            }
            int i15 = i12 + 1;
            byte b = i15 < bytes.length ? bytes[i15] : (byte) 0;
            byte b2 = bytes[i12];
            if (b2 == 13) {
                if (b == 10) {
                    i9 = 2;
                    if (i9 <= 0) {
                    }
                    singletonList = a;
                    i12++;
                    i11 = i10;
                }
                i9 = 0;
                if (i9 <= 0) {
                }
                singletonList = a;
                i12++;
                i11 = i10;
            } else if (b2 == 44) {
                if (b == 32) {
                    i9 = 4;
                    if (i9 <= 0) {
                    }
                    singletonList = a;
                    i12++;
                    i11 = i10;
                }
                i9 = 0;
                if (i9 <= 0) {
                }
                singletonList = a;
                i12++;
                i11 = i10;
            } else if (b2 != 46) {
                if (b2 == 58 && b == 32) {
                    i9 = 5;
                    if (i9 <= 0) {
                        LinkedList linkedList = new LinkedList();
                        for (ro2 ro2Var : singletonList) {
                            ro2 b3 = ro2Var.b(i12);
                            linkedList.add(b3.d(4, i9));
                            if (ro2Var.a != 4) {
                                linkedList.add(b3.e(4, i9));
                            }
                            if (i9 == 3 || i9 == 4) {
                                linkedList.add(b3.d(2, 16 - i9).d(2, i11));
                            }
                            if (ro2Var.c > 0) {
                                linkedList.add(ro2Var.a(i12).a(i15));
                            }
                        }
                        a = px0.a(linkedList);
                        i10 = i11;
                        i12 = i15;
                    } else {
                        LinkedList linkedList2 = new LinkedList();
                        for (ro2 ro2Var2 : singletonList) {
                            char c2 = (char) (bytes[i12] & 255);
                            int[][] iArr2 = px0.c;
                            int i16 = ro2Var2.a;
                            int i17 = iArr2[i16][c2] > 0 ? i11 : 0;
                            ro2 ro2Var3 = null;
                            int i18 = 0;
                            while (i18 <= i13) {
                                int i19 = i11;
                                int i20 = iArr2[i18][c2];
                                if (i20 > 0) {
                                    if (ro2Var3 == null) {
                                        ro2Var3 = ro2Var2.b(i12);
                                    }
                                    ro2 ro2Var4 = ro2Var3;
                                    if (i17 == 0 || i18 == i16 || i18 == i14) {
                                        linkedList2.add(ro2Var4.d(i18, i20));
                                    }
                                    if (i17 == 0 && px0.d[i16][i18] >= 0) {
                                        linkedList2.add(ro2Var4.e(i18, i20));
                                    }
                                    ro2Var3 = ro2Var4;
                                }
                                i18++;
                                i11 = i19;
                                i13 = 4;
                                i14 = 2;
                            }
                            int i21 = i11;
                            if (ro2Var2.c > 0 || iArr2[i16][c2] == 0) {
                                linkedList2.add(ro2Var2.a(i12));
                            }
                            i11 = i21;
                            i13 = 4;
                            i14 = 2;
                        }
                        i10 = i11;
                        a = px0.a(linkedList2);
                    }
                    singletonList = a;
                    i12++;
                    i11 = i10;
                }
                i9 = 0;
                if (i9 <= 0) {
                }
                singletonList = a;
                i12++;
                i11 = i10;
            } else {
                if (b == 32) {
                    i9 = 3;
                    if (i9 <= 0) {
                    }
                    singletonList = a;
                    i12++;
                    i11 = i10;
                }
                i9 = 0;
                if (i9 <= 0) {
                }
                singletonList = a;
                i12++;
                i11 = i10;
            }
        }
        int i22 = i11;
        ro2 ro2Var5 = (ro2) Collections.min(singletonList, new zo0(9));
        ro2Var5.getClass();
        LinkedList linkedList3 = new LinkedList();
        for (ay2 ay2Var = ro2Var5.b(bytes.length).b; ay2Var != null; ay2Var = ay2Var.a) {
            linkedList3.addFirst(ay2Var);
        }
        co coVar2 = new co();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((ay2) it.next()).a(coVar2, bytes);
        }
        int i23 = coVar2.n;
        int i24 = ((parseInt * i23) / 100) + 11;
        int i25 = i23 + i24;
        if (parseInt2 == 0) {
            co coVar3 = null;
            int i26 = 0;
            int i27 = 0;
            while (i26 <= 32) {
                int i28 = i26 <= i2 ? i22 : 0;
                int i29 = i28 != 0 ? i26 + 1 : i26;
                int i30 = ((i28 != 0 ? 88 : 112) + (i29 << 4)) * i29;
                if (i25 <= i30) {
                    if (coVar3 == null || i27 != iArr[i29]) {
                        i3 = iArr[i29];
                        coVar3 = iv1.V(coVar2, i3);
                    } else {
                        i3 = i27;
                    }
                    int i31 = i30 - (i30 % i3);
                    if ((i28 == 0 || coVar3.n <= (i3 << 6)) && coVar3.n + i24 <= i31) {
                        i4 = i3;
                        coVar = coVar3;
                        i5 = i28;
                        i6 = i29;
                        i7 = i30;
                    } else {
                        i27 = i3;
                    }
                }
                i26++;
                c = c;
                i2 = 3;
            }
            lh.e("Data too large for an Aztec code");
            return null;
        }
        i5 = parseInt2 < 0 ? i22 : 0;
        i6 = Math.abs(parseInt2);
        if (i6 > (i5 != 0 ? 4 : 32)) {
            lh.e(in1.l(parseInt2, "Illegal value ", " for layers"));
            return null;
        }
        i7 = ((i5 != 0 ? 88 : 112) + (i6 << 4)) * i6;
        i4 = iArr[i6];
        int i32 = i7 - (i7 % i4);
        coVar = iv1.V(coVar2, i4);
        int i33 = coVar.n;
        if (i24 + i33 > i32) {
            lh.e("Data to large for user specified layer");
            return null;
        }
        if (i5 != 0 && i33 > (i4 << 6)) {
            lh.e("Data to large for user specified layer");
            return null;
        }
        co C2 = iv1.C(coVar, i7, i4);
        int i34 = coVar.n / i4;
        co coVar4 = new co();
        if (i5 != 0) {
            coVar4.b(i6 - 1, 2);
            coVar4.b(i34 - 1, 6);
            C = iv1.C(coVar4, 28, 4);
        } else {
            coVar4.b(i6 - 1, 5);
            coVar4.b(i34 - 1, 11);
            C = iv1.C(coVar4, 40, 4);
        }
        int i35 = (i5 == 0 ? 14 : 11) + (i6 << 2);
        int[] iArr3 = new int[i35];
        if (i5 != 0) {
            for (int i36 = 0; i36 < i35; i36++) {
                iArr3[i36] = i36;
            }
            i8 = i35;
        } else {
            int i37 = i35 / 2;
            i8 = (((i37 - 1) / 15) * 2) + i35 + 1;
            int i38 = i8 / 2;
            for (int i39 = 0; i39 < i37; i39++) {
                iArr3[(i37 - i39) - 1] = (i38 - r10) - 1;
                iArr3[i37 + i39] = (i39 / 15) + i39 + i38 + 1;
            }
        }
        eo eoVar = new eo(i8, i8);
        int i40 = 0;
        for (int i41 = 0; i41 < i6; i41++) {
            int i42 = 2;
            int i43 = ((i6 - i41) << 2) + (i5 != 0 ? 9 : 12);
            int i44 = 0;
            while (i44 < i43) {
                int i45 = i44 << 1;
                int i46 = 0;
                while (i46 < i42) {
                    if (C2.d(i40 + i45 + i46)) {
                        int i47 = i41 << 1;
                        eoVar.b(iArr3[i47 + i46], iArr3[i47 + i44]);
                    }
                    if (C2.d((i43 << 1) + i40 + i45 + i46)) {
                        int i48 = i41 << 1;
                        eoVar.b(iArr3[i48 + i44], iArr3[((i35 - 1) - i48) - i46]);
                    }
                    if (C2.d((i43 << 2) + i40 + i45 + i46)) {
                        int i49 = (i35 - 1) - (i41 << 1);
                        eoVar.b(iArr3[i49 - i46], iArr3[i49 - i44]);
                    }
                    if (C2.d((i43 * 6) + i40 + i45 + i46)) {
                        int i50 = i41 << 1;
                        eoVar.b(iArr3[((i35 - 1) - i50) - i44], iArr3[i50 + i46]);
                    }
                    i46++;
                    i42 = 2;
                }
                i44++;
                i42 = 2;
            }
            i40 += i43 << 3;
        }
        int i51 = i8 / 2;
        if (i5 != 0) {
            for (int i52 = 0; i52 < 7; i52++) {
                int i53 = (i51 - 3) + i52;
                if (C.d(i52)) {
                    eoVar.b(i53, i51 - 5);
                }
                if (C.d(i52 + 7)) {
                    eoVar.b(i51 + 5, i53);
                }
                if (C.d(20 - i52)) {
                    eoVar.b(i53, i51 + 5);
                }
                if (C.d(27 - i52)) {
                    eoVar.b(i51 - 5, i53);
                }
            }
        } else {
            for (int i54 = 0; i54 < 10; i54++) {
                int i55 = (i54 / 5) + (i51 - 5) + i54;
                if (C.d(i54)) {
                    eoVar.b(i55, i51 - 7);
                }
                if (C.d(i54 + 10)) {
                    eoVar.b(i51 + 7, i55);
                }
                if (C.d(29 - i54)) {
                    eoVar.b(i55, i51 + 7);
                }
                if (C.d(39 - i54)) {
                    eoVar.b(i51 - 7, i55);
                }
            }
        }
        if (i5 != 0) {
            iv1.u(eoVar, i51, 5);
        } else {
            iv1.u(eoVar, i51, 7);
            int i56 = 0;
            int i57 = 0;
            while (i56 < (i35 / 2) - 1) {
                for (int i58 = i51 & 1; i58 < i8; i58 += 2) {
                    int i59 = i51 - i57;
                    eoVar.b(i59, i58);
                    int i60 = i51 + i57;
                    eoVar.b(i60, i58);
                    eoVar.b(i58, i59);
                    eoVar.b(i58, i60);
                }
                i56 += 15;
                i57 += 16;
            }
        }
        int i61 = eoVar.m;
        int max = Math.max(200, i61);
        int i62 = eoVar.n;
        int max2 = Math.max(200, i62);
        int min = Math.min(max / i61, max2 / i62);
        int i63 = (max - (i61 * min)) / 2;
        int i64 = (max2 - (i62 * min)) / 2;
        eo eoVar2 = new eo(max, max2);
        int i65 = 0;
        while (i65 < i62) {
            int i66 = i63;
            int i67 = 0;
            while (i67 < i61) {
                if (eoVar.a(i67, i65)) {
                    eoVar2.c(i66, i64, min, min);
                }
                i67++;
                i66 += min;
            }
            i65++;
            i64 += min;
        }
        return eoVar2;
    }

    public int h(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return h((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    @Override // defpackage.am1
    public Object i(u52 u52Var) {
        return u52Var.a.invoke();
    }

    public void k(jh0 jh0Var) {
        StringBuilder sb;
        switch (this.m) {
            case 3:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((char) 0);
                while (true) {
                    boolean b = jh0Var.b();
                    sb = jh0Var.c;
                    if (b) {
                        sb2.append(jh0Var.a());
                        int i = jh0Var.d + 1;
                        jh0Var.d = i;
                        if (iv1.M(jh0Var.a, i, 5) != 5) {
                            jh0Var.e = 0;
                        }
                    }
                }
                int length = sb2.length() - 1;
                int length2 = sb.length() + length + 1;
                jh0Var.c(length2);
                boolean z = jh0Var.f.b - length2 > 0;
                if (jh0Var.b() || z) {
                    if (length <= 249) {
                        sb2.setCharAt(0, (char) length);
                    } else if (length > 1555) {
                        lh.g("Message length not in valid ranges: ".concat(String.valueOf(length)));
                        break;
                    } else {
                        sb2.setCharAt(0, (char) ((length / 250) + 249));
                        sb2.insert(1, (char) (length % 250));
                    }
                }
                int length3 = sb2.length();
                for (int i2 = 0; i2 < length3; i2++) {
                    int length4 = (((sb.length() + 1) * 149) % 255) + 1 + sb2.charAt(i2);
                    if (length4 > 255) {
                        length4 -= 256;
                    }
                    jh0Var.d((char) length4);
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder();
                while (true) {
                    if (jh0Var.b()) {
                        char a = jh0Var.a();
                        jh0Var.d++;
                        int h = h(a, sb3);
                        int length5 = jh0Var.c.length() + ((sb3.length() / 3) << 1);
                        jh0Var.c(length5);
                        int i3 = jh0Var.f.b - length5;
                        if (!jh0Var.b()) {
                            StringBuilder sb4 = new StringBuilder();
                            if (sb3.length() % 3 == 2 && (i3 < 2 || i3 > 2)) {
                                int length6 = sb3.length();
                                sb3.delete(length6 - h, length6);
                                jh0Var.d--;
                                h = h(jh0Var.a(), sb4);
                                jh0Var.f = null;
                            }
                            while (sb3.length() % 3 == 1 && ((h <= 3 && i3 != 1) || h > 3)) {
                                int length7 = sb3.length();
                                sb3.delete(length7 - h, length7);
                                jh0Var.d--;
                                h = h(jh0Var.a(), sb4);
                                jh0Var.f = null;
                            }
                        } else if (sb3.length() % 3 == 0 && iv1.M(jh0Var.a, jh0Var.d, o()) != o()) {
                            jh0Var.e = 0;
                        }
                    }
                }
                p(jh0Var, sb3);
                break;
        }
    }

    public synchronized eu l(String str) {
        eu euVar;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = eu.d;
            euVar = (eu) linkedHashMap.get(str);
            if (euVar == null) {
                euVar = (eu) linkedHashMap.get(tp2.o(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : tp2.o(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (euVar == null) {
                    euVar = new eu(str);
                }
                linkedHashMap.put(str, euVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return euVar;
    }

    @Override // defpackage.mt1
    public Object n() {
        switch (this.m) {
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return new ConcurrentHashMap();
            case 18:
                return new TreeMap();
            case 19:
                return new LinkedHashMap();
            case 20:
                return new ie1();
            case 21:
                return new TreeSet();
            case 22:
                return new LinkedHashSet();
            case 23:
                return new ArrayDeque();
            case 24:
                return new ArrayList();
            default:
                return new ConcurrentSkipListMap();
        }
    }

    public int o() {
        return 1;
    }

    public void p(jh0 jh0Var, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int length3 = jh0Var.c.length() + length;
        jh0Var.c(length3);
        int i = jh0Var.f.b - length3;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                v(jh0Var, sb);
            }
            if (jh0Var.b()) {
                jh0Var.d((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                v(jh0Var, sb);
            }
            if (jh0Var.b()) {
                jh0Var.d((char) 254);
            }
            jh0Var.d--;
        } else {
            if (length2 != 0) {
                lh.g("Unexpected case. Please report!");
                return;
            }
            while (sb.length() >= 3) {
                v(jh0Var, sb);
            }
            if (i > 0 || jh0Var.b()) {
                jh0Var.d((char) 254);
            }
        }
        jh0Var.e = 0;
    }

    public String toString() {
        switch (this.m) {
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return "Empty";
            case 15:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
