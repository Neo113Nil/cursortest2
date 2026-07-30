package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gn2 {
    public final Function1 a;
    public Object b;
    public hn1 c;
    public int j;
    public int d = -1;
    public final tn1 e = z71.k();
    public final tn1 f = new tn1();
    public final un1 g = new un1();
    public final eo1 h = new eo1(new ia0[16]);
    public final yz i = new yz(1, this);
    public final tn1 k = z71.k();
    public final HashMap l = new HashMap();

    public gn2(Function1 function1) {
        this.a = function1;
    }

    public final void a(Object obj, a0 a0Var, Function0 function0) {
        boolean z;
        int i;
        int i2;
        Object obj2 = this.b;
        hn1 hn1Var = this.c;
        int i3 = this.d;
        this.b = obj;
        this.c = (hn1) this.f.g(obj);
        if (this.d == -1) {
            this.d = Long.hashCode(tm2.k().g());
        }
        yz yzVar = this.i;
        eo1 d = ij2.d();
        boolean z2 = true;
        try {
            d.b(yzVar);
            ci2.g(function0, a0Var);
            d.l(d.o - 1);
            Object obj3 = this.b;
            obj3.getClass();
            int i4 = this.d;
            hn1 hn1Var2 = this.c;
            if (hn1Var2 != null) {
                long[] jArr = hn1Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            z = z2;
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    int i9 = (i5 << 3) + i8;
                                    i2 = i6;
                                    Object obj4 = hn1Var2.b[i9];
                                    i = i8;
                                    boolean z3 = hn1Var2.c[i9] != i4 ? z : false;
                                    if (z3) {
                                        d(obj3, obj4);
                                    }
                                    if (z3) {
                                        hn1Var2.g(i9);
                                    }
                                } else {
                                    i = i8;
                                    i2 = i6;
                                }
                                j >>= i2;
                                i8 = i + 1;
                                i6 = i2;
                            }
                            if (i7 != i6) {
                                break;
                            }
                        } else {
                            z = z2;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        z2 = z;
                    }
                }
            }
            this.b = obj2;
            this.c = hn1Var;
            this.d = i3;
        } catch (Throwable th) {
            d.l(d.o - 1);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:276:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0549 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Set set) {
        char c;
        long j;
        boolean z;
        Iterator it;
        Object g;
        int i;
        Object g2;
        Object[] objArr;
        long[] jArr;
        Iterator it2;
        int i2;
        Object[] objArr2;
        long j2;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i3;
        Object[] objArr5;
        int i4;
        int i5;
        int i6;
        hn1 hn1Var;
        long[] jArr3;
        by1 by1Var;
        Object[] objArr6;
        tn1 tn1Var;
        HashMap hashMap;
        long[] jArr4;
        by1 by1Var2;
        Object[] objArr7;
        tn1 tn1Var2;
        HashMap hashMap2;
        int i7;
        int i8;
        int i9;
        long j3;
        int i10;
        Object g3;
        HashMap hashMap3;
        Object[] objArr8;
        tn1 tn1Var3;
        HashMap hashMap4;
        int i11;
        int i12;
        long j4;
        int i13;
        long[] jArr5;
        long[] jArr6;
        by1 by1Var3 = by1.B;
        boolean z2 = set instanceof qe2;
        eo1 eo1Var = this.h;
        int i14 = 8;
        tn1 tn1Var4 = this.k;
        HashMap hashMap5 = this.l;
        tn1 tn1Var5 = this.e;
        un1 un1Var = this.g;
        if (z2) {
            un1 un1Var2 = ((qe2) set).m;
            Object[] objArr9 = un1Var2.b;
            long[] jArr7 = un1Var2.a;
            c = 7;
            int length = jArr7.length - 2;
            if (length >= 0) {
                int i15 = 0;
                z = false;
                j = -9187201950435737472L;
                while (true) {
                    long j5 = jArr7[i15];
                    int i16 = i15;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j5 & 255) < 128) {
                                int i19 = i14;
                                Object obj = objArr9[(i16 << 3) + i18];
                                jArr4 = jArr7;
                                if (obj instanceof zo2) {
                                    by1Var2 = by1Var3;
                                    if (!((zo2) obj).f(2)) {
                                        objArr7 = objArr9;
                                        tn1Var2 = tn1Var4;
                                        hashMap2 = hashMap5;
                                        i7 = length;
                                        i8 = i17;
                                        i9 = i18;
                                        j3 = j5;
                                        i10 = 8;
                                    }
                                } else {
                                    by1Var2 = by1Var3;
                                }
                                if (!tn1Var4.c(obj) || (g3 = tn1Var4.g(obj)) == null) {
                                    objArr7 = objArr9;
                                    tn1Var2 = tn1Var4;
                                    hashMap2 = hashMap5;
                                    i7 = length;
                                    i8 = i17;
                                    i9 = i18;
                                    j3 = j5;
                                } else if (g3 instanceof un1) {
                                    un1 un1Var3 = (un1) g3;
                                    Object[] objArr10 = un1Var3.b;
                                    long[] jArr8 = un1Var3.a;
                                    int length2 = jArr8.length - 2;
                                    if (length2 >= 0) {
                                        i9 = i18;
                                        boolean z3 = z;
                                        int i20 = 0;
                                        while (true) {
                                            long j6 = jArr8[i20];
                                            j3 = j5;
                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                int i22 = 0;
                                                while (i22 < i21) {
                                                    if ((j6 & 255) < 128) {
                                                        objArr8 = objArr9;
                                                        ia0 ia0Var = (ia0) objArr10[(i20 << 3) + i22];
                                                        ia0Var.getClass();
                                                        j4 = j6;
                                                        Object obj2 = hashMap5.get(ia0Var);
                                                        zm2 zm2Var = ia0Var.o;
                                                        if (zm2Var == null) {
                                                            zm2Var = by1Var2;
                                                        }
                                                        i13 = i22;
                                                        if (zm2Var.d(ia0Var.i().f, obj2)) {
                                                            tn1Var3 = tn1Var4;
                                                            hashMap4 = hashMap5;
                                                            i11 = length;
                                                            i12 = i17;
                                                            eo1Var.b(ia0Var);
                                                        } else {
                                                            Object g4 = tn1Var5.g(ia0Var);
                                                            if (g4 != null) {
                                                                if (g4 instanceof un1) {
                                                                    un1 un1Var4 = (un1) g4;
                                                                    Object[] objArr11 = un1Var4.b;
                                                                    long[] jArr9 = un1Var4.a;
                                                                    int length3 = jArr9.length - 2;
                                                                    if (length3 >= 0) {
                                                                        i11 = length;
                                                                        i12 = i17;
                                                                        int i23 = 0;
                                                                        while (true) {
                                                                            long j7 = jArr9[i23];
                                                                            tn1Var3 = tn1Var4;
                                                                            hashMap4 = hashMap5;
                                                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                                                                int i25 = 0;
                                                                                while (i25 < i24) {
                                                                                    if ((j7 & 255) < 128) {
                                                                                        jArr6 = jArr9;
                                                                                        un1Var.a(objArr11[(i23 << 3) + i25]);
                                                                                        z3 = true;
                                                                                    } else {
                                                                                        jArr6 = jArr9;
                                                                                    }
                                                                                    j7 >>= i19;
                                                                                    i25++;
                                                                                    jArr9 = jArr6;
                                                                                }
                                                                                jArr5 = jArr9;
                                                                                if (i24 != i19) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                jArr5 = jArr9;
                                                                            }
                                                                            if (i23 == length3) {
                                                                                break;
                                                                            }
                                                                            i23++;
                                                                            tn1Var4 = tn1Var3;
                                                                            hashMap5 = hashMap4;
                                                                            jArr9 = jArr5;
                                                                            i19 = 8;
                                                                        }
                                                                    }
                                                                } else {
                                                                    tn1Var3 = tn1Var4;
                                                                    hashMap4 = hashMap5;
                                                                    i11 = length;
                                                                    i12 = i17;
                                                                    un1Var.a(g4);
                                                                    z3 = true;
                                                                }
                                                                Unit unit = Unit.a;
                                                            }
                                                            tn1Var3 = tn1Var4;
                                                            hashMap4 = hashMap5;
                                                            i11 = length;
                                                            i12 = i17;
                                                            Unit unit2 = Unit.a;
                                                        }
                                                    } else {
                                                        objArr8 = objArr9;
                                                        tn1Var3 = tn1Var4;
                                                        hashMap4 = hashMap5;
                                                        i11 = length;
                                                        i12 = i17;
                                                        j4 = j6;
                                                        i13 = i22;
                                                    }
                                                    j6 = j4 >> 8;
                                                    i22 = i13 + 1;
                                                    i19 = 8;
                                                    objArr9 = objArr8;
                                                    length = i11;
                                                    i17 = i12;
                                                    tn1Var4 = tn1Var3;
                                                    hashMap5 = hashMap4;
                                                }
                                                objArr7 = objArr9;
                                                tn1Var2 = tn1Var4;
                                                hashMap3 = hashMap5;
                                                i7 = length;
                                                i8 = i17;
                                                if (i21 != i19) {
                                                    break;
                                                }
                                            } else {
                                                objArr7 = objArr9;
                                                tn1Var2 = tn1Var4;
                                                hashMap3 = hashMap5;
                                                i7 = length;
                                                i8 = i17;
                                            }
                                            if (i20 == length2) {
                                                break;
                                            }
                                            i20++;
                                            j5 = j3;
                                            objArr9 = objArr7;
                                            length = i7;
                                            i17 = i8;
                                            tn1Var4 = tn1Var2;
                                            hashMap5 = hashMap3;
                                            i19 = 8;
                                        }
                                        z = z3;
                                    } else {
                                        objArr7 = objArr9;
                                        tn1Var2 = tn1Var4;
                                        hashMap3 = hashMap5;
                                        i7 = length;
                                        i8 = i17;
                                        i9 = i18;
                                        j3 = j5;
                                    }
                                    hashMap2 = hashMap3;
                                } else {
                                    objArr7 = objArr9;
                                    tn1Var2 = tn1Var4;
                                    i7 = length;
                                    i8 = i17;
                                    i9 = i18;
                                    j3 = j5;
                                    ia0 ia0Var2 = (ia0) g3;
                                    hashMap2 = hashMap5;
                                    Object obj3 = hashMap2.get(ia0Var2);
                                    zm2 zm2Var2 = ia0Var2.o;
                                    if (zm2Var2 == null) {
                                        zm2Var2 = by1Var2;
                                    }
                                    if (zm2Var2.d(ia0Var2.i().f, obj3)) {
                                        eo1Var.b(ia0Var2);
                                    } else {
                                        Object g5 = tn1Var5.g(ia0Var2);
                                        if (g5 != null) {
                                            if (g5 instanceof un1) {
                                                un1 un1Var5 = (un1) g5;
                                                Object[] objArr12 = un1Var5.b;
                                                long[] jArr10 = un1Var5.a;
                                                int length4 = jArr10.length - 2;
                                                if (length4 >= 0) {
                                                    int i26 = 0;
                                                    while (true) {
                                                        long j8 = jArr10[i26];
                                                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i27 = 8 - ((~(i26 - length4)) >>> 31);
                                                            for (int i28 = 0; i28 < i27; i28++) {
                                                                if ((j8 & 255) < 128) {
                                                                    un1Var.a(objArr12[(i26 << 3) + i28]);
                                                                    z = true;
                                                                }
                                                                j8 >>= 8;
                                                            }
                                                            if (i27 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i26 == length4) {
                                                            break;
                                                        }
                                                        i26++;
                                                    }
                                                }
                                            } else {
                                                un1Var.a(g5);
                                                z = true;
                                            }
                                        }
                                        Unit unit3 = Unit.a;
                                    }
                                }
                                Object g6 = tn1Var5.g(obj);
                                if (g6 != null) {
                                    if (g6 instanceof un1) {
                                        un1 un1Var6 = (un1) g6;
                                        Object[] objArr13 = un1Var6.b;
                                        long[] jArr11 = un1Var6.a;
                                        int length5 = jArr11.length - 2;
                                        if (length5 >= 0) {
                                            int i29 = 0;
                                            while (true) {
                                                long j9 = jArr11[i29];
                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i30 = 8 - ((~(i29 - length5)) >>> 31);
                                                    for (int i31 = 0; i31 < i30; i31++) {
                                                        if ((j9 & 255) < 128) {
                                                            un1Var.a(objArr13[(i29 << 3) + i31]);
                                                            z = true;
                                                        }
                                                        j9 >>= 8;
                                                    }
                                                    if (i30 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i29 == length5) {
                                                    break;
                                                }
                                                i29++;
                                            }
                                        }
                                    } else {
                                        un1Var.a(g6);
                                        z = true;
                                    }
                                }
                                i10 = 8;
                            } else {
                                jArr4 = jArr7;
                                by1Var2 = by1Var3;
                                objArr7 = objArr9;
                                tn1Var2 = tn1Var4;
                                hashMap2 = hashMap5;
                                i7 = length;
                                i8 = i17;
                                i9 = i18;
                                j3 = j5;
                                i10 = i14;
                            }
                            i18 = i9 + 1;
                            i14 = i10;
                            jArr7 = jArr4;
                            objArr9 = objArr7;
                            length = i7;
                            i17 = i8;
                            j5 = j3 >> i10;
                            tn1Var4 = tn1Var2;
                            hashMap5 = hashMap2;
                            by1Var3 = by1Var2;
                        }
                        jArr3 = jArr7;
                        by1Var = by1Var3;
                        objArr6 = objArr9;
                        tn1Var = tn1Var4;
                        hashMap = hashMap5;
                        int i32 = length;
                        if (i17 != i14) {
                            break;
                        }
                        length = i32;
                    } else {
                        jArr3 = jArr7;
                        by1Var = by1Var3;
                        objArr6 = objArr9;
                        tn1Var = tn1Var4;
                        hashMap = hashMap5;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i15 = i16 + 1;
                    hashMap5 = hashMap;
                    jArr7 = jArr3;
                    by1Var3 = by1Var;
                    objArr9 = objArr6;
                    tn1Var4 = tn1Var;
                    i14 = 8;
                }
            } else {
                j = -9187201950435737472L;
                z = false;
            }
        } else {
            tn1 tn1Var6 = tn1Var4;
            c = 7;
            j = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof zo2) || ((zo2) next).f(2)) {
                    tn1 tn1Var7 = tn1Var6;
                    if (tn1Var7.c(next) && (g2 = tn1Var7.g(next)) != null) {
                        if (g2 instanceof un1) {
                            un1 un1Var7 = (un1) g2;
                            Object[] objArr14 = un1Var7.b;
                            long[] jArr12 = un1Var7.a;
                            int length6 = jArr12.length - 2;
                            if (length6 >= 0) {
                                int i33 = 0;
                                while (true) {
                                    long j10 = jArr12[i33];
                                    tn1Var6 = tn1Var7;
                                    long[] jArr13 = jArr12;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i34 = 8 - ((~(i33 - length6)) >>> 31);
                                        int i35 = 0;
                                        while (i35 < i34) {
                                            if ((j10 & 255) < 128) {
                                                it2 = it3;
                                                ia0 ia0Var3 = (ia0) objArr14[(i33 << 3) + i35];
                                                ia0Var3.getClass();
                                                i2 = i35;
                                                Object obj4 = hashMap5.get(ia0Var3);
                                                objArr2 = objArr14;
                                                zm2 zm2Var3 = ia0Var3.o;
                                                if (zm2Var3 == null) {
                                                    zm2Var3 = by1Var3;
                                                }
                                                boolean z4 = z;
                                                if (zm2Var3.d(ia0Var3.i().f, obj4)) {
                                                    j2 = j10;
                                                    jArr2 = jArr13;
                                                    eo1Var.b(ia0Var3);
                                                    z = z4;
                                                } else {
                                                    Object g7 = tn1Var5.g(ia0Var3);
                                                    if (g7 != null) {
                                                        if (g7 instanceof un1) {
                                                            un1 un1Var8 = (un1) g7;
                                                            Object[] objArr15 = un1Var8.b;
                                                            long[] jArr14 = un1Var8.a;
                                                            int length7 = jArr14.length - 2;
                                                            if (length7 >= 0) {
                                                                j2 = j10;
                                                                boolean z5 = z4;
                                                                int i36 = 0;
                                                                while (true) {
                                                                    long j11 = jArr14[i36];
                                                                    z4 = z5;
                                                                    jArr2 = jArr13;
                                                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i37 = 8 - ((~(i36 - length7)) >>> 31);
                                                                        int i38 = 0;
                                                                        while (i38 < i37) {
                                                                            if ((j11 & 255) < 128) {
                                                                                objArr4 = objArr15;
                                                                                un1Var.a(objArr4[(i36 << 3) + i38]);
                                                                                z4 = true;
                                                                            } else {
                                                                                objArr4 = objArr15;
                                                                            }
                                                                            j11 >>= 8;
                                                                            i38++;
                                                                            objArr15 = objArr4;
                                                                        }
                                                                        objArr3 = objArr15;
                                                                        if (i37 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        objArr3 = objArr15;
                                                                    }
                                                                    z5 = z4;
                                                                    if (i36 == length7) {
                                                                        z = z5;
                                                                        break;
                                                                    }
                                                                    i36++;
                                                                    jArr13 = jArr2;
                                                                    objArr15 = objArr3;
                                                                }
                                                            }
                                                        } else {
                                                            j2 = j10;
                                                            jArr2 = jArr13;
                                                            un1Var.a(g7);
                                                            z = true;
                                                        }
                                                        Unit unit4 = Unit.a;
                                                    }
                                                    j2 = j10;
                                                    jArr2 = jArr13;
                                                    z = z4;
                                                    Unit unit42 = Unit.a;
                                                }
                                            } else {
                                                it2 = it3;
                                                i2 = i35;
                                                objArr2 = objArr14;
                                                j2 = j10;
                                                jArr2 = jArr13;
                                            }
                                            j10 = j2 >> 8;
                                            i35 = i2 + 1;
                                            it3 = it2;
                                            objArr14 = objArr2;
                                            jArr13 = jArr2;
                                        }
                                        it = it3;
                                        objArr = objArr14;
                                        jArr = jArr13;
                                        if (i34 != 8) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        objArr = objArr14;
                                        jArr = jArr13;
                                    }
                                    if (i33 == length6) {
                                        break;
                                    }
                                    i33++;
                                    it3 = it;
                                    objArr14 = objArr;
                                    jArr12 = jArr;
                                    tn1Var7 = tn1Var6;
                                }
                            }
                        } else {
                            it = it3;
                            tn1Var6 = tn1Var7;
                            ia0 ia0Var4 = (ia0) g2;
                            Object obj5 = hashMap5.get(ia0Var4);
                            zm2 zm2Var4 = ia0Var4.o;
                            if (zm2Var4 == null) {
                                zm2Var4 = by1Var3;
                            }
                            if (zm2Var4.d(ia0Var4.i().f, obj5)) {
                                eo1Var.b(ia0Var4);
                            } else {
                                Object g8 = tn1Var5.g(ia0Var4);
                                if (g8 != null) {
                                    if (g8 instanceof un1) {
                                        un1 un1Var9 = (un1) g8;
                                        Object[] objArr16 = un1Var9.b;
                                        long[] jArr15 = un1Var9.a;
                                        int length8 = jArr15.length - 2;
                                        if (length8 >= 0) {
                                            int i39 = 0;
                                            while (true) {
                                                long j12 = jArr15[i39];
                                                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i40 = 8 - ((~(i39 - length8)) >>> 31);
                                                    for (int i41 = 0; i41 < i40; i41++) {
                                                        if ((j12 & 255) < 128) {
                                                            un1Var.a(objArr16[(i39 << 3) + i41]);
                                                            z = true;
                                                        }
                                                        j12 >>= 8;
                                                    }
                                                    if (i40 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i39 == length8) {
                                                    break;
                                                }
                                                i39++;
                                            }
                                        }
                                    } else {
                                        un1Var.a(g8);
                                        z = true;
                                    }
                                }
                                Unit unit5 = Unit.a;
                            }
                        }
                        g = tn1Var5.g(next);
                        if (g != null) {
                            if (g instanceof un1) {
                                un1 un1Var10 = (un1) g;
                                Object[] objArr17 = un1Var10.b;
                                long[] jArr16 = un1Var10.a;
                                int length9 = jArr16.length - 2;
                                if (length9 >= 0) {
                                    while (true) {
                                        long j13 = jArr16[i];
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i42 = 8 - ((~(i - length9)) >>> 31);
                                            for (int i43 = 0; i43 < i42; i43++) {
                                                if ((j13 & 255) < 128) {
                                                    un1Var.a(objArr17[(i << 3) + i43]);
                                                    z = true;
                                                }
                                                j13 >>= 8;
                                            }
                                            if (i42 != 8) {
                                                break;
                                            }
                                        }
                                        i = i != length9 ? i + 1 : 0;
                                    }
                                }
                            } else {
                                un1Var.a(g);
                                z = true;
                            }
                        }
                    }
                    it = it3;
                    tn1Var6 = tn1Var7;
                    g = tn1Var5.g(next);
                    if (g != null) {
                    }
                } else {
                    it = it3;
                }
                it3 = it;
            }
        }
        int i44 = eo1Var.o;
        if (i44 != 0) {
            Object[] objArr18 = eo1Var.m;
            int i45 = 0;
            while (i45 < i44) {
                ia0 ia0Var5 = (ia0) objArr18[i45];
                int hashCode = Long.hashCode(tm2.k().g());
                Object g9 = tn1Var5.g(ia0Var5);
                if (g9 != null) {
                    boolean z6 = g9 instanceof un1;
                    tn1 tn1Var8 = this.f;
                    if (z6) {
                        un1 un1Var11 = (un1) g9;
                        Object[] objArr19 = un1Var11.b;
                        long[] jArr17 = un1Var11.a;
                        int length10 = jArr17.length - 2;
                        if (length10 >= 0) {
                            int i46 = 0;
                            while (true) {
                                long j14 = jArr17[i46];
                                i3 = i44;
                                objArr5 = objArr18;
                                if ((((~j14) << c) & j14 & j) != j) {
                                    int i47 = 8 - ((~(i46 - length10)) >>> 31);
                                    int i48 = 0;
                                    while (i48 < i47) {
                                        if ((j14 & 255) < 128) {
                                            i5 = i48;
                                            Object obj6 = objArr19[(i46 << 3) + i48];
                                            hn1 hn1Var2 = (hn1) tn1Var8.g(obj6);
                                            i6 = i45;
                                            if (hn1Var2 == null) {
                                                hn1Var = new hn1();
                                                tn1Var8.m(obj6, hn1Var);
                                                Unit unit6 = Unit.a;
                                            } else {
                                                hn1Var = hn1Var2;
                                            }
                                            c(ia0Var5, hashCode, obj6, hn1Var);
                                        } else {
                                            i5 = i48;
                                            i6 = i45;
                                        }
                                        j14 >>= 8;
                                        i48 = i5 + 1;
                                        i45 = i6;
                                    }
                                    i4 = i45;
                                    if (i47 != 8) {
                                        break;
                                    }
                                } else {
                                    i4 = i45;
                                }
                                if (i46 != length10) {
                                    i46++;
                                    i44 = i3;
                                    objArr18 = objArr5;
                                    i45 = i4;
                                }
                            }
                        } else {
                            i3 = i44;
                            objArr5 = objArr18;
                            i4 = i45;
                        }
                    } else {
                        i3 = i44;
                        objArr5 = objArr18;
                        i4 = i45;
                        hn1 hn1Var3 = (hn1) tn1Var8.g(g9);
                        if (hn1Var3 == null) {
                            hn1Var3 = new hn1();
                            tn1Var8.m(g9, hn1Var3);
                            Unit unit7 = Unit.a;
                        }
                        c(ia0Var5, hashCode, g9, hn1Var3);
                    }
                } else {
                    i3 = i44;
                    objArr5 = objArr18;
                    i4 = i45;
                }
                i45 = i4 + 1;
                i44 = i3;
                objArr18 = objArr5;
            }
            eo1Var.g();
        }
        return z;
    }

    public final void c(Object obj, int i, Object obj2, hn1 hn1Var) {
        int i2;
        if (this.j > 0) {
            return;
        }
        int c = hn1Var.c(obj);
        if (c < 0) {
            c = ~c;
            i2 = -1;
        } else {
            i2 = hn1Var.c[c];
        }
        hn1Var.b[c] = obj;
        hn1Var.c[c] = i;
        if ((obj instanceof ia0) && i2 != i) {
            ha0 i3 = ((ia0) obj).i();
            this.l.put(obj, i3.f);
            hn1 hn1Var2 = i3.e;
            tn1 tn1Var = this.k;
            z71.N(tn1Var, obj);
            Object[] objArr = hn1Var2.b;
            long[] jArr = hn1Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((j & 255) < 128) {
                                yo2 yo2Var = (yo2) objArr[(i4 << 3) + i6];
                                if (yo2Var instanceof zo2) {
                                    ((zo2) yo2Var).g(2);
                                }
                                z71.d(tn1Var, yo2Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof zo2) {
                ((zo2) obj).g(2);
            }
            z71.d(this.e, obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        tn1 tn1Var = this.e;
        z71.M(tn1Var, obj2, obj);
        if (!(obj2 instanceof ia0) || tn1Var.c(obj2)) {
            return;
        }
        z71.N(this.k, obj2);
        this.l.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        tn1 tn1Var = this.f;
        long[] jArr3 = tn1Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = tn1Var.b[i6];
                        j2 = j5;
                        hn1 hn1Var = (hn1) tn1Var.c[i6];
                        obj.getClass();
                        boolean E = ((sx1) obj).E();
                        if (!E) {
                            Object[] objArr = hn1Var.b;
                            int[] iArr = hn1Var.c;
                            long[] jArr4 = hn1Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = E;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                d(obj, obj2);
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    E = z;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (!z) {
                                    tn1Var.l(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        z = E;
                        if (!z) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
