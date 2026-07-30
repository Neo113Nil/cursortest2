package q0;

import g0.d0;
import g0.e0;
import g0.f2;
import g0.t0;
import i.b0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import r1.h1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final q6.c f7442a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7443b;

    /* renamed from: c, reason: collision with root package name */
    public i.u f7444c;

    /* renamed from: j, reason: collision with root package name */
    public int f7451j;

    /* renamed from: d, reason: collision with root package name */
    public int f7445d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final b6.c f7446e = new b6.c(22);

    /* renamed from: f, reason: collision with root package name */
    public final i.x f7447f = new i.x();

    /* renamed from: g, reason: collision with root package name */
    public final b0 f7448g = new b0();

    /* renamed from: h, reason: collision with root package name */
    public final i0.d f7449h = new i0.d(new e0[16]);

    /* renamed from: i, reason: collision with root package name */
    public final g0.o f7450i = new g0.o(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final b6.c f7452k = new b6.c(22);

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f7453l = new HashMap();

    public s(q6.c cVar) {
        this.f7442a = cVar;
    }

    public final void a(Object obj, c1.a aVar, q6.a aVar2) {
        boolean z8;
        int i7;
        int i8;
        Object obj2 = this.f7443b;
        i.u uVar = this.f7444c;
        int i9 = this.f7445d;
        this.f7443b = obj;
        this.f7444c = (i.u) this.f7447f.e(obj);
        if (this.f7445d == -1) {
            this.f7445d = n.k().d();
        }
        g0.o oVar = this.f7450i;
        i0.d B = g0.d.B();
        boolean z9 = true;
        try {
            B.b(oVar);
            r.e(aVar2, aVar);
            B.o(B.f4842h - 1);
            Object obj3 = this.f7443b;
            r6.k.c(obj3);
            int i10 = this.f7445d;
            i.u uVar2 = this.f7444c;
            if (uVar2 != null) {
                long[] jArr = uVar2.f4798a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j8 = jArr[i11];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            z8 = z9;
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j8 & 255) < 128) {
                                    int i15 = (i11 << 3) + i14;
                                    i8 = i12;
                                    Object obj4 = uVar2.f4799b[i15];
                                    i7 = i14;
                                    boolean z10 = uVar2.f4800c[i15] != i10 ? z8 : false;
                                    if (z10) {
                                        d(obj3, obj4);
                                    }
                                    if (z10) {
                                        uVar2.e(i15);
                                    }
                                } else {
                                    i7 = i14;
                                    i8 = i12;
                                }
                                j8 >>= i8;
                                i14 = i7 + 1;
                                i12 = i8;
                            }
                            if (i13 != i12) {
                                break;
                            }
                        } else {
                            z8 = z9;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        z9 = z8;
                    }
                }
            }
            this.f7443b = obj2;
            this.f7444c = uVar;
            this.f7445d = i9;
        } catch (Throwable th) {
            B.o(B.f4842h - 1);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (((q0.v) r1).c(2) == false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x052d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Set set) {
        char c4;
        long j8;
        boolean z8;
        Iterator it;
        String str;
        b6.c cVar;
        Object e9;
        int i7;
        Object e10;
        Object[] objArr;
        Iterator it2;
        int i8;
        String str2;
        b6.c cVar2;
        Object[] objArr2;
        long j9;
        long[] jArr;
        long[] jArr2;
        i0.d dVar;
        Object[] objArr3;
        int i9;
        int i10;
        i0.d dVar2;
        i.u uVar;
        long[] jArr3;
        t0 t0Var;
        Object[] objArr4;
        long[] jArr4;
        t0 t0Var2;
        Object[] objArr5;
        int i11;
        int i12;
        int i13;
        long j10;
        Object obj;
        Object e11;
        Object e12;
        Object obj2;
        int i14;
        int i15;
        long j11;
        int i16;
        int i17;
        t0 t0Var3 = t0.f3903k;
        boolean z9 = set instanceof i0.f;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        i0.d dVar3 = this.f7449h;
        b6.c cVar3 = this.f7452k;
        HashMap hashMap = this.f7453l;
        b6.c cVar4 = this.f7446e;
        b0 b0Var = this.f7448g;
        if (z9) {
            b0 b0Var2 = ((i0.f) set).f4853f;
            Object[] objArr6 = b0Var2.f4722b;
            long[] jArr5 = b0Var2.f4721a;
            c4 = 7;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i18 = 0;
                z8 = false;
                j8 = -9187201950435737472L;
                while (true) {
                    int i19 = 8;
                    long j12 = jArr5[i18];
                    int i20 = i18;
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i21 = 8 - ((~(i20 - length)) >>> 31);
                        int i22 = 0;
                        while (i22 < i21) {
                            if ((j12 & 255) < 128) {
                                jArr4 = jArr5;
                                Object obj3 = objArr6[(i20 << 3) + i22];
                                t0Var2 = t0Var3;
                                if (obj3 instanceof v) {
                                    objArr5 = objArr6;
                                } else {
                                    objArr5 = objArr6;
                                }
                                if (((i.x) cVar3.f1394g).b(obj3) && (e12 = ((i.x) cVar3.f1394g).e(obj3)) != null) {
                                    if (e12 instanceof b0) {
                                        b0 b0Var3 = (b0) e12;
                                        Object[] objArr7 = b0Var3.f4722b;
                                        long[] jArr6 = b0Var3.f4721a;
                                        int length2 = jArr6.length - 2;
                                        if (length2 >= 0) {
                                            i13 = i22;
                                            boolean z10 = z8;
                                            int i23 = 0;
                                            while (true) {
                                                long j13 = jArr6[i23];
                                                j10 = j12;
                                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                    int i25 = 0;
                                                    while (i25 < i24) {
                                                        if ((j13 & 255) < 128) {
                                                            j11 = j13;
                                                            e0 e0Var = (e0) objArr7[(i23 << 3) + i25];
                                                            r6.k.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                            Object obj4 = hashMap.get(e0Var);
                                                            i16 = i25;
                                                            f2 f2Var = e0Var.f3717h;
                                                            if (f2Var == null) {
                                                                f2Var = t0Var2;
                                                            }
                                                            if (f2Var.a(e0Var.f().f3712f, obj4)) {
                                                                obj2 = obj3;
                                                                i14 = length;
                                                                i15 = i21;
                                                                dVar3.b(e0Var);
                                                            } else {
                                                                Object e13 = ((i.x) cVar4.f1394g).e(e0Var);
                                                                if (e13 != null) {
                                                                    if (e13 instanceof b0) {
                                                                        b0 b0Var4 = (b0) e13;
                                                                        Object[] objArr8 = b0Var4.f4722b;
                                                                        long[] jArr7 = b0Var4.f4721a;
                                                                        int length3 = jArr7.length - 2;
                                                                        if (length3 >= 0) {
                                                                            i14 = length;
                                                                            i15 = i21;
                                                                            int i26 = 0;
                                                                            while (true) {
                                                                                long j14 = jArr7[i26];
                                                                                long[] jArr8 = jArr7;
                                                                                obj2 = obj3;
                                                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                    int i27 = 8 - ((~(i26 - length3)) >>> 31);
                                                                                    int i28 = 0;
                                                                                    while (i28 < i27) {
                                                                                        if ((j14 & 255) < 128) {
                                                                                            i17 = i28;
                                                                                            b0Var.a(objArr8[(i26 << 3) + i28]);
                                                                                            z10 = true;
                                                                                        } else {
                                                                                            i17 = i28;
                                                                                        }
                                                                                        j14 >>= i19;
                                                                                        i28 = i17 + 1;
                                                                                    }
                                                                                    if (i27 != i19) {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (i26 == length3) {
                                                                                    break;
                                                                                }
                                                                                i26++;
                                                                                obj3 = obj2;
                                                                                jArr7 = jArr8;
                                                                                i19 = 8;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        obj2 = obj3;
                                                                        i14 = length;
                                                                        i15 = i21;
                                                                        b0Var.a(e13);
                                                                        z10 = true;
                                                                    }
                                                                }
                                                                obj2 = obj3;
                                                                i14 = length;
                                                                i15 = i21;
                                                            }
                                                        } else {
                                                            obj2 = obj3;
                                                            i14 = length;
                                                            i15 = i21;
                                                            j11 = j13;
                                                            i16 = i25;
                                                        }
                                                        j13 = j11 >> 8;
                                                        i25 = i16 + 1;
                                                        i19 = 8;
                                                        length = i14;
                                                        i21 = i15;
                                                        obj3 = obj2;
                                                    }
                                                    obj = obj3;
                                                    i11 = length;
                                                    i12 = i21;
                                                    if (i24 != i19) {
                                                        break;
                                                    }
                                                } else {
                                                    obj = obj3;
                                                    i11 = length;
                                                    i12 = i21;
                                                }
                                                if (i23 == length2) {
                                                    break;
                                                }
                                                i23++;
                                                i19 = 8;
                                                j12 = j10;
                                                length = i11;
                                                i21 = i12;
                                                obj3 = obj;
                                            }
                                            z8 = z10;
                                        }
                                    } else {
                                        obj = obj3;
                                        i11 = length;
                                        i12 = i21;
                                        i13 = i22;
                                        j10 = j12;
                                        e0 e0Var2 = (e0) e12;
                                        Object obj5 = hashMap.get(e0Var2);
                                        f2 f2Var2 = e0Var2.f3717h;
                                        if (f2Var2 == null) {
                                            f2Var2 = t0Var2;
                                        }
                                        if (f2Var2.a(e0Var2.f().f3712f, obj5)) {
                                            dVar3.b(e0Var2);
                                        } else {
                                            Object e14 = ((i.x) cVar4.f1394g).e(e0Var2);
                                            if (e14 != null) {
                                                if (e14 instanceof b0) {
                                                    b0 b0Var5 = (b0) e14;
                                                    Object[] objArr9 = b0Var5.f4722b;
                                                    long[] jArr9 = b0Var5.f4721a;
                                                    int length4 = jArr9.length - 2;
                                                    if (length4 >= 0) {
                                                        int i29 = 0;
                                                        while (true) {
                                                            long j15 = jArr9[i29];
                                                            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i30 = 8 - ((~(i29 - length4)) >>> 31);
                                                                for (int i31 = 0; i31 < i30; i31++) {
                                                                    if ((j15 & 255) < 128) {
                                                                        b0Var.a(objArr9[(i29 << 3) + i31]);
                                                                        z8 = true;
                                                                    }
                                                                    j15 >>= 8;
                                                                }
                                                                if (i30 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i29 == length4) {
                                                                break;
                                                            }
                                                            i29++;
                                                        }
                                                    }
                                                } else {
                                                    b0Var.a(e14);
                                                    z8 = true;
                                                }
                                            }
                                        }
                                    }
                                    e11 = ((i.x) cVar4.f1394g).e(obj);
                                    if (e11 != null) {
                                        if (e11 instanceof b0) {
                                            b0 b0Var6 = (b0) e11;
                                            Object[] objArr10 = b0Var6.f4722b;
                                            long[] jArr10 = b0Var6.f4721a;
                                            int length5 = jArr10.length - 2;
                                            if (length5 >= 0) {
                                                int i32 = 0;
                                                while (true) {
                                                    long j16 = jArr10[i32];
                                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i33 = 8 - ((~(i32 - length5)) >>> 31);
                                                        for (int i34 = 0; i34 < i33; i34++) {
                                                            if ((j16 & 255) < 128) {
                                                                b0Var.a(objArr10[(i32 << 3) + i34]);
                                                                z8 = true;
                                                            }
                                                            j16 >>= 8;
                                                        }
                                                        if (i33 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i32 == length5) {
                                                        break;
                                                    }
                                                    i32++;
                                                }
                                            }
                                        } else {
                                            b0Var.a(e11);
                                            z8 = true;
                                        }
                                    }
                                    i22 = i13 + 1;
                                    i19 = 8;
                                    t0Var3 = t0Var2;
                                    objArr6 = objArr5;
                                    length = i11;
                                    i21 = i12;
                                    j12 = j10 >> 8;
                                    jArr5 = jArr4;
                                }
                                obj = obj3;
                                i11 = length;
                                i12 = i21;
                                i13 = i22;
                                j10 = j12;
                                e11 = ((i.x) cVar4.f1394g).e(obj);
                                if (e11 != null) {
                                }
                                i22 = i13 + 1;
                                i19 = 8;
                                t0Var3 = t0Var2;
                                objArr6 = objArr5;
                                length = i11;
                                i21 = i12;
                                j12 = j10 >> 8;
                                jArr5 = jArr4;
                            } else {
                                jArr4 = jArr5;
                                t0Var2 = t0Var3;
                                objArr5 = objArr6;
                            }
                            i11 = length;
                            i12 = i21;
                            i13 = i22;
                            j10 = j12;
                            i22 = i13 + 1;
                            i19 = 8;
                            t0Var3 = t0Var2;
                            objArr6 = objArr5;
                            length = i11;
                            i21 = i12;
                            j12 = j10 >> 8;
                            jArr5 = jArr4;
                        }
                        jArr3 = jArr5;
                        t0Var = t0Var3;
                        objArr4 = objArr6;
                        int i35 = length;
                        if (i21 != i19) {
                            break;
                        }
                        length = i35;
                    } else {
                        jArr3 = jArr5;
                        t0Var = t0Var3;
                        objArr4 = objArr6;
                    }
                    if (i20 == length) {
                        break;
                    }
                    i18 = i20 + 1;
                    t0Var3 = t0Var;
                    jArr5 = jArr3;
                    objArr6 = objArr4;
                }
            } else {
                j8 = -9187201950435737472L;
                z8 = false;
            }
        } else {
            c4 = 7;
            j8 = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z8 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof v) || ((v) next).c(2)) {
                    if (((i.x) cVar3.f1394g).b(next) && (e10 = ((i.x) cVar3.f1394g).e(next)) != null) {
                        if (e10 instanceof b0) {
                            b0 b0Var7 = (b0) e10;
                            Object[] objArr11 = b0Var7.f4722b;
                            long[] jArr11 = b0Var7.f4721a;
                            int length6 = jArr11.length - 2;
                            if (length6 >= 0) {
                                int i36 = 0;
                                while (true) {
                                    long j17 = jArr11[i36];
                                    long[] jArr12 = jArr11;
                                    Object[] objArr12 = objArr11;
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i37 = 8 - ((~(i36 - length6)) >>> 31);
                                        int i38 = 0;
                                        while (i38 < i37) {
                                            if ((j17 & 255) < 128) {
                                                it2 = it3;
                                                e0 e0Var3 = (e0) objArr12[(i36 << 3) + i38];
                                                r6.k.d(e0Var3, str3);
                                                i8 = i38;
                                                Object obj6 = hashMap.get(e0Var3);
                                                str2 = str3;
                                                f2 f2Var3 = e0Var3.f3717h;
                                                if (f2Var3 == null) {
                                                    f2Var3 = t0Var3;
                                                }
                                                cVar2 = cVar3;
                                                if (f2Var3.a(e0Var3.f().f3712f, obj6)) {
                                                    objArr2 = objArr12;
                                                    j9 = j17;
                                                    dVar3.b(e0Var3);
                                                } else {
                                                    Object e15 = ((i.x) cVar4.f1394g).e(e0Var3);
                                                    if (e15 != null) {
                                                        if (e15 instanceof b0) {
                                                            b0 b0Var8 = (b0) e15;
                                                            Object[] objArr13 = b0Var8.f4722b;
                                                            long[] jArr13 = b0Var8.f4721a;
                                                            int length7 = jArr13.length - 2;
                                                            if (length7 >= 0) {
                                                                objArr2 = objArr12;
                                                                boolean z11 = z8;
                                                                int i39 = 0;
                                                                while (true) {
                                                                    long j18 = jArr13[i39];
                                                                    j9 = j17;
                                                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i40 = 8 - ((~(i39 - length7)) >>> 31);
                                                                        int i41 = 0;
                                                                        while (i41 < i40) {
                                                                            if ((j18 & 255) < 128) {
                                                                                jArr2 = jArr13;
                                                                                b0Var.a(objArr13[(i39 << 3) + i41]);
                                                                                z11 = true;
                                                                            } else {
                                                                                jArr2 = jArr13;
                                                                            }
                                                                            j18 >>= 8;
                                                                            i41++;
                                                                            jArr13 = jArr2;
                                                                        }
                                                                        jArr = jArr13;
                                                                        if (i40 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr = jArr13;
                                                                    }
                                                                    if (i39 == length7) {
                                                                        break;
                                                                    }
                                                                    i39++;
                                                                    j17 = j9;
                                                                    jArr13 = jArr;
                                                                }
                                                                z8 = z11;
                                                            }
                                                        } else {
                                                            objArr2 = objArr12;
                                                            j9 = j17;
                                                            b0Var.a(e15);
                                                            z8 = true;
                                                        }
                                                    }
                                                }
                                                j17 = j9 >> 8;
                                                str3 = str2;
                                                cVar3 = cVar2;
                                                objArr12 = objArr2;
                                                i38 = i8 + 1;
                                                it3 = it2;
                                            } else {
                                                it2 = it3;
                                                i8 = i38;
                                                str2 = str3;
                                                cVar2 = cVar3;
                                            }
                                            objArr2 = objArr12;
                                            j9 = j17;
                                            j17 = j9 >> 8;
                                            str3 = str2;
                                            cVar3 = cVar2;
                                            objArr12 = objArr2;
                                            i38 = i8 + 1;
                                            it3 = it2;
                                        }
                                        it = it3;
                                        str = str3;
                                        cVar = cVar3;
                                        objArr = objArr12;
                                        if (i37 != 8) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        str = str3;
                                        cVar = cVar3;
                                        objArr = objArr12;
                                    }
                                    if (i36 == length6) {
                                        break;
                                    }
                                    i36++;
                                    it3 = it;
                                    jArr11 = jArr12;
                                    str3 = str;
                                    cVar3 = cVar;
                                    objArr11 = objArr;
                                }
                            }
                        } else {
                            it = it3;
                            str = str3;
                            cVar = cVar3;
                            e0 e0Var4 = (e0) e10;
                            Object obj7 = hashMap.get(e0Var4);
                            f2 f2Var4 = e0Var4.f3717h;
                            if (f2Var4 == null) {
                                f2Var4 = t0Var3;
                            }
                            if (f2Var4.a(e0Var4.f().f3712f, obj7)) {
                                dVar3.b(e0Var4);
                            } else {
                                Object e16 = ((i.x) cVar4.f1394g).e(e0Var4);
                                if (e16 != null) {
                                    if (e16 instanceof b0) {
                                        b0 b0Var9 = (b0) e16;
                                        Object[] objArr14 = b0Var9.f4722b;
                                        long[] jArr14 = b0Var9.f4721a;
                                        int length8 = jArr14.length - 2;
                                        if (length8 >= 0) {
                                            int i42 = 0;
                                            while (true) {
                                                long j19 = jArr14[i42];
                                                if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i43 = 8 - ((~(i42 - length8)) >>> 31);
                                                    for (int i44 = 0; i44 < i43; i44++) {
                                                        if ((j19 & 255) < 128) {
                                                            b0Var.a(objArr14[(i42 << 3) + i44]);
                                                            z8 = true;
                                                        }
                                                        j19 >>= 8;
                                                    }
                                                    if (i43 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i42 == length8) {
                                                    break;
                                                }
                                                i42++;
                                            }
                                        }
                                    } else {
                                        b0Var.a(e16);
                                        z8 = true;
                                    }
                                }
                            }
                        }
                        e9 = ((i.x) cVar4.f1394g).e(next);
                        if (e9 != null) {
                            if (e9 instanceof b0) {
                                b0 b0Var10 = (b0) e9;
                                Object[] objArr15 = b0Var10.f4722b;
                                long[] jArr15 = b0Var10.f4721a;
                                int length9 = jArr15.length - 2;
                                if (length9 >= 0) {
                                    while (true) {
                                        long j20 = jArr15[i7];
                                        if ((((~j20) << 7) & j20 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i45 = 8 - ((~(i7 - length9)) >>> 31);
                                            for (int i46 = 0; i46 < i45; i46++) {
                                                if ((j20 & 255) < 128) {
                                                    b0Var.a(objArr15[(i7 << 3) + i46]);
                                                    z8 = true;
                                                }
                                                j20 >>= 8;
                                            }
                                            if (i45 != 8) {
                                                break;
                                            }
                                        }
                                        i7 = i7 != length9 ? i7 + 1 : 0;
                                    }
                                }
                            } else {
                                b0Var.a(e9);
                                z8 = true;
                            }
                        }
                    }
                    it = it3;
                    str = str3;
                    cVar = cVar3;
                    e9 = ((i.x) cVar4.f1394g).e(next);
                    if (e9 != null) {
                    }
                } else {
                    it = it3;
                    str = str3;
                    cVar = cVar3;
                }
                it3 = it;
                str3 = str;
                cVar3 = cVar;
            }
        }
        if (!dVar3.m()) {
            return z8;
        }
        int i47 = dVar3.f4842h;
        if (i47 > 0) {
            Object[] objArr16 = dVar3.f4840f;
            int i48 = 0;
            while (true) {
                e0 e0Var5 = (e0) objArr16[i48];
                int d8 = n.k().d();
                Object e17 = ((i.x) cVar4.f1394g).e(e0Var5);
                if (e17 != null) {
                    boolean z12 = e17 instanceof b0;
                    i.x xVar = this.f7447f;
                    if (z12) {
                        b0 b0Var11 = (b0) e17;
                        Object[] objArr17 = b0Var11.f4722b;
                        long[] jArr16 = b0Var11.f4721a;
                        int length10 = jArr16.length - 2;
                        if (length10 >= 0) {
                            int i49 = 0;
                            while (true) {
                                long j21 = jArr16[i49];
                                objArr3 = objArr16;
                                i9 = i48;
                                if ((((~j21) << c4) & j21 & j8) != j8) {
                                    int i50 = 8 - ((~(i49 - length10)) >>> 31);
                                    int i51 = 0;
                                    while (i51 < i50) {
                                        if ((j21 & 255) < 128) {
                                            i10 = i51;
                                            Object obj8 = objArr17[(i49 << 3) + i51];
                                            i.u uVar2 = (i.u) xVar.e(obj8);
                                            dVar2 = dVar3;
                                            if (uVar2 == null) {
                                                uVar = new i.u();
                                                xVar.i(obj8, uVar);
                                            } else {
                                                uVar = uVar2;
                                            }
                                            c(e0Var5, d8, obj8, uVar);
                                        } else {
                                            i10 = i51;
                                            dVar2 = dVar3;
                                        }
                                        j21 >>= 8;
                                        i51 = i10 + 1;
                                        dVar3 = dVar2;
                                    }
                                    dVar = dVar3;
                                    if (i50 != 8) {
                                        break;
                                    }
                                } else {
                                    dVar = dVar3;
                                }
                                if (i49 == length10) {
                                    break;
                                }
                                i49++;
                                i48 = i9;
                                objArr16 = objArr3;
                                dVar3 = dVar;
                            }
                        } else {
                            objArr3 = objArr16;
                            i9 = i48;
                            dVar = dVar3;
                        }
                    } else {
                        objArr3 = objArr16;
                        i9 = i48;
                        dVar = dVar3;
                        i.u uVar3 = (i.u) xVar.e(e17);
                        if (uVar3 == null) {
                            uVar3 = new i.u();
                            xVar.i(e17, uVar3);
                        }
                        c(e0Var5, d8, e17, uVar3);
                    }
                } else {
                    objArr3 = objArr16;
                    i9 = i48;
                    dVar = dVar3;
                }
                int i52 = i9 + 1;
                if (i52 >= i47) {
                    break;
                }
                i48 = i52;
                objArr16 = objArr3;
                dVar3 = dVar;
            }
        } else {
            dVar = dVar3;
        }
        dVar.h();
        return z8;
    }

    public final void c(Object obj, int i7, Object obj2, i.u uVar) {
        int i8;
        if (this.f7451j > 0) {
            return;
        }
        int b9 = uVar.b(obj);
        if (b9 < 0) {
            b9 = ~b9;
            i8 = -1;
        } else {
            i8 = uVar.f4800c[b9];
        }
        uVar.f4799b[b9] = obj;
        uVar.f4800c[b9] = i7;
        if ((obj instanceof e0) && i8 != i7) {
            d0 f9 = ((e0) obj).f();
            this.f7453l.put(obj, f9.f3712f);
            i.u uVar2 = f9.f3711e;
            b6.c cVar = this.f7452k;
            cVar.x(obj);
            Object[] objArr = uVar2.f4799b;
            long[] jArr = uVar2.f4798a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j8 = jArr[i9];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((j8 & 255) < 128) {
                                u uVar3 = (u) objArr[(i9 << 3) + i11];
                                if (uVar3 instanceof v) {
                                    ((v) uVar3).d(2);
                                }
                                cVar.n(uVar3, obj);
                            }
                            j8 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i9 == length) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
        if (i8 == -1) {
            if (obj instanceof v) {
                ((v) obj).d(2);
            }
            this.f7446e.n(obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        b6.c cVar = this.f7446e;
        cVar.w(obj2, obj);
        if (!(obj2 instanceof e0) || ((i.x) cVar.f1394g).b(obj2)) {
            return;
        }
        this.f7452k.x(obj2);
        this.f7453l.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        long[] jArr;
        long[] jArr2;
        long j8;
        char c4;
        long j9;
        int i7;
        boolean z8;
        long j10;
        i.x xVar = this.f7447f;
        long[] jArr3 = xVar.f4812a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j11 = jArr3[i8];
            char c6 = 7;
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((j11 & 255) < 128) {
                        int i12 = (i8 << 3) + i11;
                        c4 = c6;
                        Object obj = xVar.f4813b[i12];
                        j9 = j12;
                        i.u uVar = (i.u) xVar.f4814c[i12];
                        r6.k.d(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        boolean z9 = ((h1) obj).z();
                        if (!z9) {
                            Object[] objArr = uVar.f4799b;
                            int[] iArr = uVar.f4800c;
                            long[] jArr4 = uVar.f4798a;
                            int i13 = i9;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j8 = j11;
                                int i14 = 0;
                                while (true) {
                                    long j13 = jArr4[i14];
                                    long[] jArr5 = jArr4;
                                    z8 = z9;
                                    if ((((~j13) << c4) & j13 & j9) != j9) {
                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j13 & 255) < 128) {
                                                int i17 = (i14 << 3) + i16;
                                                j10 = j13;
                                                Object obj2 = objArr[i17];
                                                int i18 = iArr[i17];
                                                d(obj, obj2);
                                            } else {
                                                j10 = j13;
                                            }
                                            j13 = j10 >> i13;
                                        }
                                        if (i15 != i13) {
                                            break;
                                        }
                                    }
                                    if (i14 == length2) {
                                        break;
                                    }
                                    i14++;
                                    z9 = z8;
                                    jArr4 = jArr5;
                                    i13 = 8;
                                }
                                if (!z8) {
                                    xVar.h(i12);
                                }
                                i7 = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j8 = j11;
                        z8 = z9;
                        if (!z8) {
                        }
                        i7 = 8;
                    } else {
                        jArr2 = jArr3;
                        j8 = j11;
                        c4 = c6;
                        j9 = j12;
                        i7 = i9;
                    }
                    i11++;
                    i9 = i7;
                    j11 = j8 >> i7;
                    c6 = c4;
                    j12 = j9;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i10 != i9) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i8 == length) {
                return;
            }
            i8++;
            jArr3 = jArr;
        }
    }
}
