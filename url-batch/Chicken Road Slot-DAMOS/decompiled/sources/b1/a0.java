package b1;

import c2.p1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f932a;

    /* renamed from: b, reason: collision with root package name */
    public Object f933b;

    /* renamed from: c, reason: collision with root package name */
    public s.c0 f934c;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f940k;

    /* renamed from: d, reason: collision with root package name */
    public int f935d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final s.h0 f936e = z4.w.k();

    /* renamed from: f, reason: collision with root package name */
    public final s.h0 f937f = new s.h0();
    public final s.i0 g = new s.i0();

    /* renamed from: h, reason: collision with root package name */
    public final o0.e f938h = new o0.e(new n0.y[16]);

    /* renamed from: i, reason: collision with root package name */
    public final z f939i = new z(0, this);

    /* renamed from: l, reason: collision with root package name */
    public final s.h0 f941l = z4.w.k();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f942m = new HashMap();

    public a0(Function1 function1) {
        this.f932a = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (((b1.g0) r14).f(2) == false) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Set set) {
        char c10;
        long j;
        boolean z10;
        Iterator it;
        a0 a0Var;
        int i3;
        a0 a0Var2;
        boolean z11;
        boolean z12;
        Object[] objArr;
        Iterator it2;
        int i10;
        Object[] objArr2;
        long j3;
        boolean z13;
        int i11;
        int i12;
        int i13;
        Object[] objArr3;
        int i14;
        int i15;
        s.c0 c0Var;
        long[] jArr;
        Object[] objArr4;
        int i16;
        long[] jArr2;
        Object[] objArr5;
        int i17;
        int i18;
        long j10;
        int i19;
        int i20;
        Object obj;
        Object[] objArr6;
        int i21;
        long j11;
        Object[] objArr7;
        int i22;
        int i23;
        Object obj2;
        Object[] objArr8;
        Object[] objArr9;
        a0 a0Var3 = this;
        boolean z14 = set instanceof o0.h;
        o0.e eVar = a0Var3.f938h;
        s.h0 h0Var = a0Var3.f941l;
        HashMap hashMap = a0Var3.f942m;
        s.h0 h0Var2 = a0Var3.f936e;
        s.i0 i0Var = a0Var3.g;
        if (z14) {
            s.i0 i0Var2 = ((o0.h) set).f7331d;
            Object[] objArr10 = i0Var2.f8320b;
            long[] jArr3 = i0Var2.f8319a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i24 = 0;
                c10 = 7;
                z10 = false;
                j = -9187201950435737472L;
                while (true) {
                    long j12 = jArr3[i24];
                    int i25 = 8;
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i26 = 8 - ((~(i24 - length)) >>> 31);
                        int i27 = 0;
                        while (i27 < i26) {
                            if ((j12 & 255) < 128) {
                                Object obj3 = objArr10[(i24 << 3) + i27];
                                if (obj3 instanceof g0) {
                                    jArr2 = jArr3;
                                } else {
                                    jArr2 = jArr3;
                                }
                                if (a0Var3.j || !h0Var.c(obj3)) {
                                    objArr5 = objArr10;
                                    i17 = length;
                                    i18 = i24;
                                    j10 = j12;
                                    i19 = i26;
                                    i20 = i27;
                                    obj = obj3;
                                } else {
                                    a0Var3.j = true;
                                    try {
                                        Object g = h0Var.g(obj3);
                                        if (g == null) {
                                            objArr5 = objArr10;
                                        } else if (g instanceof s.i0) {
                                            s.i0 i0Var3 = (s.i0) g;
                                            Object[] objArr11 = i0Var3.f8320b;
                                            long[] jArr4 = i0Var3.f8319a;
                                            objArr5 = objArr10;
                                            int length2 = jArr4.length - 2;
                                            if (length2 >= 0) {
                                                j10 = j12;
                                                int i28 = 0;
                                                Object[] objArr12 = objArr11;
                                                while (true) {
                                                    long j13 = jArr4[i28];
                                                    i17 = length;
                                                    i18 = i24;
                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                                        int i30 = 0;
                                                        while (i30 < i29) {
                                                            if ((j13 & 255) < 128) {
                                                                i21 = i30;
                                                                n0.y yVar = (n0.y) objArr12[(i28 << 3) + i30];
                                                                yVar.getClass();
                                                                j11 = j13;
                                                                if (Intrinsics.a(yVar.i().f6843f, hashMap.get(yVar))) {
                                                                    objArr7 = objArr12;
                                                                    i22 = i26;
                                                                    i23 = i27;
                                                                    obj2 = obj3;
                                                                    eVar.b(yVar);
                                                                } else {
                                                                    Object g2 = h0Var2.g(yVar);
                                                                    if (g2 != null) {
                                                                        if (g2 instanceof s.i0) {
                                                                            s.i0 i0Var4 = (s.i0) g2;
                                                                            Object[] objArr13 = i0Var4.f8320b;
                                                                            long[] jArr5 = i0Var4.f8319a;
                                                                            int length3 = jArr5.length - 2;
                                                                            if (length3 >= 0) {
                                                                                objArr7 = objArr12;
                                                                                i22 = i26;
                                                                                int i31 = 0;
                                                                                while (true) {
                                                                                    long j14 = jArr5[i31];
                                                                                    i23 = i27;
                                                                                    obj2 = obj3;
                                                                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i32 = 8 - ((~(i31 - length3)) >>> 31);
                                                                                        int i33 = 0;
                                                                                        while (i33 < i32) {
                                                                                            if ((j14 & 255) < 128) {
                                                                                                objArr9 = objArr13;
                                                                                                i0Var.a(objArr9[(i31 << 3) + i33]);
                                                                                                z10 = true;
                                                                                            } else {
                                                                                                objArr9 = objArr13;
                                                                                            }
                                                                                            j14 >>= i25;
                                                                                            i33++;
                                                                                            objArr13 = objArr9;
                                                                                        }
                                                                                        objArr8 = objArr13;
                                                                                        if (i32 != i25) {
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        objArr8 = objArr13;
                                                                                    }
                                                                                    if (i31 == length3) {
                                                                                        break;
                                                                                    }
                                                                                    i31++;
                                                                                    i27 = i23;
                                                                                    obj3 = obj2;
                                                                                    objArr13 = objArr8;
                                                                                    i25 = 8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            objArr7 = objArr12;
                                                                            i22 = i26;
                                                                            i23 = i27;
                                                                            obj2 = obj3;
                                                                            i0Var.a(g2);
                                                                            z10 = true;
                                                                        }
                                                                    }
                                                                }
                                                                i30 = i21 + 1;
                                                                i25 = 8;
                                                                j13 = j11 >> 8;
                                                                i26 = i22;
                                                                objArr12 = objArr7;
                                                                i27 = i23;
                                                                obj3 = obj2;
                                                            } else {
                                                                i21 = i30;
                                                                j11 = j13;
                                                            }
                                                            objArr7 = objArr12;
                                                            i22 = i26;
                                                            i23 = i27;
                                                            obj2 = obj3;
                                                            i30 = i21 + 1;
                                                            i25 = 8;
                                                            j13 = j11 >> 8;
                                                            i26 = i22;
                                                            objArr12 = objArr7;
                                                            i27 = i23;
                                                            obj3 = obj2;
                                                        }
                                                        objArr6 = objArr12;
                                                        i19 = i26;
                                                        i20 = i27;
                                                        obj = obj3;
                                                        if (i29 != i25) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr6 = objArr12;
                                                        i19 = i26;
                                                        i20 = i27;
                                                        obj = obj3;
                                                    }
                                                    if (i28 == length2) {
                                                        break;
                                                    }
                                                    i28++;
                                                    length = i17;
                                                    i24 = i18;
                                                    i26 = i19;
                                                    objArr12 = objArr6;
                                                    i27 = i20;
                                                    obj3 = obj;
                                                    i25 = 8;
                                                }
                                            }
                                        } else {
                                            objArr5 = objArr10;
                                            i17 = length;
                                            i18 = i24;
                                            j10 = j12;
                                            i19 = i26;
                                            i20 = i27;
                                            obj = obj3;
                                            n0.y yVar2 = (n0.y) g;
                                            if (Intrinsics.a(yVar2.i().f6843f, hashMap.get(yVar2))) {
                                                eVar.b(yVar2);
                                            } else {
                                                Object g10 = h0Var2.g(yVar2);
                                                if (g10 != null) {
                                                    if (g10 instanceof s.i0) {
                                                        s.i0 i0Var5 = (s.i0) g10;
                                                        Object[] objArr14 = i0Var5.f8320b;
                                                        long[] jArr6 = i0Var5.f8319a;
                                                        int length4 = jArr6.length - 2;
                                                        if (length4 >= 0) {
                                                            int i34 = 0;
                                                            while (true) {
                                                                long j15 = jArr6[i34];
                                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i35 = 8 - ((~(i34 - length4)) >>> 31);
                                                                    for (int i36 = 0; i36 < i35; i36++) {
                                                                        if ((j15 & 255) < 128) {
                                                                            i0Var.a(objArr14[(i34 << 3) + i36]);
                                                                            z10 = true;
                                                                        }
                                                                        j15 >>= 8;
                                                                    }
                                                                    if (i35 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i34 == length4) {
                                                                    break;
                                                                }
                                                                i34++;
                                                            }
                                                        }
                                                    } else {
                                                        i0Var.a(g10);
                                                        z10 = true;
                                                    }
                                                }
                                            }
                                        }
                                        i17 = length;
                                        i18 = i24;
                                        j10 = j12;
                                        i19 = i26;
                                        i20 = i27;
                                        obj = obj3;
                                    } finally {
                                        a0Var3.j = false;
                                    }
                                }
                                Object g11 = h0Var2.g(obj);
                                if (g11 != null) {
                                    if (g11 instanceof s.i0) {
                                        s.i0 i0Var6 = (s.i0) g11;
                                        Object[] objArr15 = i0Var6.f8320b;
                                        long[] jArr7 = i0Var6.f8319a;
                                        int length5 = jArr7.length - 2;
                                        if (length5 >= 0) {
                                            int i37 = 0;
                                            while (true) {
                                                long j16 = jArr7[i37];
                                                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i38 = 8 - ((~(i37 - length5)) >>> 31);
                                                    long j17 = j16;
                                                    for (int i39 = 0; i39 < i38; i39++) {
                                                        if ((j17 & 255) < 128) {
                                                            i0Var.a(objArr15[(i37 << 3) + i39]);
                                                            z10 = true;
                                                        }
                                                        j17 >>= 8;
                                                    }
                                                    if (i38 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i37 == length5) {
                                                    break;
                                                }
                                                i37++;
                                            }
                                        }
                                    } else {
                                        i0Var.a(g11);
                                        z10 = true;
                                    }
                                }
                                j12 = j10 >> 8;
                                i27 = i20 + 1;
                                jArr3 = jArr2;
                                i25 = 8;
                                objArr10 = objArr5;
                                length = i17;
                                i24 = i18;
                                i26 = i19;
                            } else {
                                jArr2 = jArr3;
                            }
                            objArr5 = objArr10;
                            i17 = length;
                            i18 = i24;
                            j10 = j12;
                            i19 = i26;
                            i20 = i27;
                            j12 = j10 >> 8;
                            i27 = i20 + 1;
                            jArr3 = jArr2;
                            i25 = 8;
                            objArr10 = objArr5;
                            length = i17;
                            i24 = i18;
                            i26 = i19;
                        }
                        jArr = jArr3;
                        objArr4 = objArr10;
                        int i40 = length;
                        int i41 = i24;
                        if (i26 != i25) {
                            break;
                        }
                        length = i40;
                        i16 = i41;
                    } else {
                        jArr = jArr3;
                        objArr4 = objArr10;
                        i16 = i24;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i24 = i16 + 1;
                    jArr3 = jArr;
                    objArr10 = objArr4;
                }
            } else {
                c10 = 7;
                j = -9187201950435737472L;
                z10 = false;
            }
        } else {
            c10 = 7;
            j = -9187201950435737472L;
            Iterator it3 = set.iterator();
            boolean z15 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof g0) || ((g0) next).f(2)) {
                    if (a0Var3.j || !h0Var.c(next)) {
                        it = it3;
                        a0Var = a0Var3;
                        i3 = 0;
                    } else {
                        a0Var3.j = true;
                        try {
                            Object g12 = h0Var.g(next);
                            if (g12 != null) {
                                try {
                                    if (g12 instanceof s.i0) {
                                        s.i0 i0Var7 = (s.i0) g12;
                                        Object[] objArr16 = i0Var7.f8320b;
                                        long[] jArr8 = i0Var7.f8319a;
                                        int length6 = jArr8.length - 2;
                                        if (length6 >= 0) {
                                            boolean z16 = z15;
                                            int i42 = 0;
                                            while (true) {
                                                long j18 = jArr8[i42];
                                                long[] jArr9 = jArr8;
                                                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i43 = 8 - ((~(i42 - length6)) >>> 31);
                                                    int i44 = 0;
                                                    while (i44 < i43) {
                                                        if ((j18 & 255) < 128) {
                                                            it2 = it3;
                                                            n0.y yVar3 = (n0.y) objArr16[(i42 << 3) + i44];
                                                            yVar3.getClass();
                                                            i10 = i44;
                                                            objArr2 = objArr16;
                                                            if (Intrinsics.a(yVar3.i().f6843f, hashMap.get(yVar3))) {
                                                                j3 = j18;
                                                                eVar.b(yVar3);
                                                            } else {
                                                                Object g13 = h0Var2.g(yVar3);
                                                                if (g13 != null) {
                                                                    if (g13 instanceof s.i0) {
                                                                        s.i0 i0Var8 = (s.i0) g13;
                                                                        Object[] objArr17 = i0Var8.f8320b;
                                                                        long[] jArr10 = i0Var8.f8319a;
                                                                        int length7 = jArr10.length - 2;
                                                                        if (length7 >= 0) {
                                                                            boolean z17 = z16;
                                                                            j3 = j18;
                                                                            int i45 = 0;
                                                                            while (true) {
                                                                                long j19 = jArr10[i45];
                                                                                long[] jArr11 = jArr10;
                                                                                if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                    int i46 = 8 - ((~(i45 - length7)) >>> 31);
                                                                                    for (int i47 = 0; i47 < i46; i47 = i11 + 1) {
                                                                                        if ((j19 & 255) < 128) {
                                                                                            i11 = i47;
                                                                                            i0Var.a(objArr17[(i45 << 3) + i47]);
                                                                                            z17 = true;
                                                                                        } else {
                                                                                            i11 = i47;
                                                                                        }
                                                                                        j19 >>= 8;
                                                                                    }
                                                                                    if (i46 != 8) {
                                                                                        z13 = z17;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (i45 == length7) {
                                                                                    z16 = z17;
                                                                                    break;
                                                                                }
                                                                                i45++;
                                                                                jArr10 = jArr11;
                                                                            }
                                                                            z13 = z16;
                                                                        }
                                                                    } else {
                                                                        j3 = j18;
                                                                        i0Var.a(g13);
                                                                        z13 = true;
                                                                    }
                                                                    z16 = z13;
                                                                }
                                                                j3 = j18;
                                                                z13 = z16;
                                                                z16 = z13;
                                                            }
                                                        } else {
                                                            it2 = it3;
                                                            i10 = i44;
                                                            objArr2 = objArr16;
                                                            j3 = j18;
                                                        }
                                                        j18 = j3 >> 8;
                                                        i44 = i10 + 1;
                                                        objArr16 = objArr2;
                                                        it3 = it2;
                                                    }
                                                    it = it3;
                                                    objArr = objArr16;
                                                    if (i43 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    it = it3;
                                                    objArr = objArr16;
                                                }
                                                if (i42 == length6) {
                                                    break;
                                                }
                                                i42++;
                                                it3 = it;
                                                jArr8 = jArr9;
                                                objArr16 = objArr;
                                            }
                                            z15 = z16;
                                        }
                                    } else {
                                        it = it3;
                                        n0.y yVar4 = (n0.y) g12;
                                        if (Intrinsics.a(yVar4.i().f6843f, hashMap.get(yVar4))) {
                                            eVar.b(yVar4);
                                        } else {
                                            Object g14 = h0Var2.g(yVar4);
                                            if (g14 != null) {
                                                if (g14 instanceof s.i0) {
                                                    s.i0 i0Var9 = (s.i0) g14;
                                                    Object[] objArr18 = i0Var9.f8320b;
                                                    long[] jArr12 = i0Var9.f8319a;
                                                    int length8 = jArr12.length - 2;
                                                    if (length8 >= 0) {
                                                        boolean z18 = z15;
                                                        int i48 = 0;
                                                        while (true) {
                                                            long j20 = jArr12[i48];
                                                            if ((((~j20) << 7) & j20 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i49 = 8 - ((~(i48 - length8)) >>> 31);
                                                                long j21 = j20;
                                                                for (int i50 = 0; i50 < i49; i50++) {
                                                                    if ((j21 & 255) < 128) {
                                                                        i0Var.a(objArr18[(i48 << 3) + i50]);
                                                                        z18 = true;
                                                                    }
                                                                    j21 >>= 8;
                                                                }
                                                                if (i49 != 8) {
                                                                    z12 = z18;
                                                                    break;
                                                                }
                                                            }
                                                            if (i48 == length8) {
                                                                z15 = z18;
                                                                break;
                                                            }
                                                            i48++;
                                                        }
                                                    }
                                                } else {
                                                    i0Var.a(g14);
                                                    z12 = true;
                                                }
                                                z15 = z12;
                                            }
                                            z12 = z15;
                                            z15 = z12;
                                        }
                                    }
                                    i3 = 0;
                                    a0Var = this;
                                    a0Var.j = false;
                                } catch (Throwable th) {
                                    th = th;
                                    z11 = false;
                                    a0Var2 = this;
                                    a0Var2.j = z11;
                                    throw th;
                                }
                            }
                            it = it3;
                            i3 = 0;
                            a0Var = this;
                            a0Var.j = false;
                        } catch (Throwable th2) {
                            th = th2;
                            a0Var2 = a0Var3;
                            z11 = false;
                        }
                    }
                    boolean z19 = z15;
                    Object g15 = h0Var2.g(next);
                    if (g15 != null) {
                        if (g15 instanceof s.i0) {
                            s.i0 i0Var10 = (s.i0) g15;
                            Object[] objArr19 = i0Var10.f8320b;
                            long[] jArr13 = i0Var10.f8319a;
                            int length9 = jArr13.length - 2;
                            if (length9 >= 0) {
                                int i51 = i3;
                                while (true) {
                                    long j22 = jArr13[i51];
                                    if ((((~j22) << 7) & j22 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i52 = 8 - ((~(i51 - length9)) >>> 31);
                                        long j23 = j22;
                                        for (int i53 = i3; i53 < i52; i53++) {
                                            if ((j23 & 255) < 128) {
                                                i0Var.a(objArr19[(i51 << 3) + i53]);
                                                z19 = true;
                                            }
                                            j23 >>= 8;
                                        }
                                        if (i52 != 8) {
                                            break;
                                        }
                                    }
                                    if (i51 == length9) {
                                        break;
                                    }
                                    i51++;
                                }
                            }
                        } else {
                            i0Var.a(g15);
                            z19 = true;
                        }
                    }
                    z15 = z19;
                } else {
                    it = it3;
                    a0Var = a0Var3;
                }
                it3 = it;
                a0Var3 = a0Var;
            }
            z10 = z15;
        }
        a0 a0Var4 = a0Var3;
        int i54 = 0;
        if (!a0Var4.j && (i12 = eVar.f7319i) != 0) {
            Object[] objArr20 = eVar.f7317d;
            int i55 = 0;
            while (i55 < i12) {
                n0.y yVar5 = (n0.y) objArr20[i55];
                int hashCode = Long.hashCode(r.j().g());
                Object g16 = h0Var2.g(yVar5);
                if (g16 != null) {
                    boolean z20 = g16 instanceof s.i0;
                    s.h0 h0Var3 = a0Var4.f937f;
                    if (z20) {
                        s.i0 i0Var11 = (s.i0) g16;
                        Object[] objArr21 = i0Var11.f8320b;
                        long[] jArr14 = i0Var11.f8319a;
                        int length10 = jArr14.length - 2;
                        if (length10 >= 0) {
                            int i56 = i54;
                            while (true) {
                                long j24 = jArr14[i56];
                                objArr3 = objArr20;
                                if ((((~j24) << c10) & j24 & j) != j) {
                                    int i57 = 8 - ((~(i56 - length10)) >>> 31);
                                    int i58 = 0;
                                    while (i58 < i57) {
                                        if ((j24 & 255) < 128) {
                                            i14 = i12;
                                            Object obj4 = objArr21[(i56 << 3) + i58];
                                            s.c0 c0Var2 = (s.c0) h0Var3.g(obj4);
                                            i15 = i58;
                                            if (c0Var2 == null) {
                                                c0Var = new s.c0();
                                                h0Var3.m(obj4, c0Var);
                                            } else {
                                                c0Var = c0Var2;
                                            }
                                            a0Var4.b(yVar5, hashCode, obj4, c0Var);
                                        } else {
                                            i14 = i12;
                                            i15 = i58;
                                        }
                                        j24 >>= 8;
                                        i58 = i15 + 1;
                                        i12 = i14;
                                    }
                                    i13 = i12;
                                    if (i57 != 8) {
                                        break;
                                    }
                                } else {
                                    i13 = i12;
                                }
                                if (i56 != length10) {
                                    i56++;
                                    objArr20 = objArr3;
                                    i12 = i13;
                                }
                            }
                        } else {
                            i13 = i12;
                            objArr3 = objArr20;
                        }
                    } else {
                        i13 = i12;
                        objArr3 = objArr20;
                        s.c0 c0Var3 = (s.c0) h0Var3.g(g16);
                        if (c0Var3 == null) {
                            c0Var3 = new s.c0();
                            h0Var3.m(g16, c0Var3);
                        }
                        a0Var4.b(yVar5, hashCode, g16, c0Var3);
                    }
                } else {
                    i13 = i12;
                    objArr3 = objArr20;
                }
                i55++;
                objArr20 = objArr3;
                i12 = i13;
                i54 = 0;
            }
            eVar.g();
        }
        return z10;
    }

    public final void b(Object obj, int i3, Object obj2, s.c0 c0Var) {
        int i10;
        if (this.f940k > 0) {
            return;
        }
        int b10 = c0Var.b(obj);
        if (b10 < 0) {
            b10 = ~b10;
            i10 = -1;
        } else {
            i10 = c0Var.f8279c[b10];
        }
        c0Var.f8278b[b10] = obj;
        c0Var.f8279c[b10] = i3;
        if ((obj instanceof n0.y) && i10 != i3) {
            n0.x i11 = ((n0.y) obj).i();
            this.f942m.put(obj, i11.f6843f);
            s.c0 c0Var2 = i11.f6842e;
            s.h0 h0Var = this.f941l;
            z4.w.K(h0Var, obj);
            Object[] objArr = c0Var2.f8278b;
            long[] jArr = c0Var2.f8277a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j = jArr[i12];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((j & 255) < 128) {
                                f0 f0Var = (f0) objArr[(i12 << 3) + i14];
                                if (f0Var instanceof g0) {
                                    ((g0) f0Var).g(2);
                                }
                                z4.w.e(h0Var, f0Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        }
                    }
                    if (i12 == length) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        if (i10 == -1) {
            if (obj instanceof g0) {
                ((g0) obj).g(2);
            }
            z4.w.e(this.f936e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        s.h0 h0Var = this.f936e;
        z4.w.J(h0Var, obj2, obj);
        if (!(obj2 instanceof n0.y) || h0Var.c(obj2)) {
            return;
        }
        z4.w.K(this.f941l, obj2);
        this.f942m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c10;
        long j3;
        int i3;
        boolean z10;
        long j10;
        s.h0 h0Var = this.f937f;
        long[] jArr3 = h0Var.f8312a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j11 = jArr3[i10];
            char c11 = 7;
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((j11 & 255) < 128) {
                        int i14 = (i10 << 3) + i13;
                        c10 = c11;
                        Object obj = h0Var.f8313b[i14];
                        j3 = j12;
                        s.c0 c0Var = (s.c0) h0Var.f8314c[i14];
                        obj.getClass();
                        boolean o6 = ((p1) obj).o();
                        if (!o6) {
                            Object[] objArr = c0Var.f8278b;
                            int[] iArr = c0Var.f8279c;
                            long[] jArr4 = c0Var.f8277a;
                            int i15 = i11;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j11;
                                int i16 = 0;
                                while (true) {
                                    long j13 = jArr4[i16];
                                    long[] jArr5 = jArr4;
                                    z10 = o6;
                                    if ((((~j13) << c10) & j13 & j3) != j3) {
                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j13 & 255) < 128) {
                                                int i19 = (i16 << 3) + i18;
                                                j10 = j13;
                                                Object obj2 = objArr[i19];
                                                int i20 = iArr[i19];
                                                c(obj, obj2);
                                            } else {
                                                j10 = j13;
                                            }
                                            j13 = j10 >> i15;
                                        }
                                        if (i17 != i15) {
                                            break;
                                        }
                                    }
                                    if (i16 == length2) {
                                        break;
                                    }
                                    i16++;
                                    o6 = z10;
                                    jArr4 = jArr5;
                                    i15 = 8;
                                }
                                if (!z10) {
                                    h0Var.l(i14);
                                }
                                i3 = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j11;
                        z10 = o6;
                        if (!z10) {
                        }
                        i3 = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j11;
                        c10 = c11;
                        j3 = j12;
                        i3 = i11;
                    }
                    i13++;
                    i11 = i3;
                    j11 = j >> i3;
                    c11 = c10;
                    j12 = j3;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i12 != i11) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i10 == length) {
                return;
            }
            i10++;
            jArr3 = jArr;
        }
    }
}
