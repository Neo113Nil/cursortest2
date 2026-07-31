package w0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import m0.e0;
import m0.n2;
import m0.v0;
import o.d0;
import o.j0;
import o.k0;
import w1.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final p6.c f7548a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7549b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f7550c;

    /* renamed from: j, reason: collision with root package name */
    public int f7556j;

    /* renamed from: d, reason: collision with root package name */
    public int f7551d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f7552e = h0.a.q();

    /* renamed from: f, reason: collision with root package name */
    public final j0 f7553f = new j0();

    /* renamed from: g, reason: collision with root package name */
    public final k0 f7554g = new k0();

    /* renamed from: h, reason: collision with root package name */
    public final o0.e f7555h = new o0.e(new e0[16]);
    public final m0.r i = new m0.r(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final j0 f7557k = h0.a.q();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f7558l = new HashMap();

    public r(p6.c cVar) {
        this.f7548a = cVar;
    }

    public final void a(Object obj, a0.t tVar, p6.a aVar) {
        boolean z3;
        int i;
        int i8;
        Object obj2 = this.f7549b;
        d0 d0Var = this.f7550c;
        int i9 = this.f7551d;
        this.f7549b = obj;
        this.f7550c = (d0) this.f7553f.g(obj);
        if (this.f7551d == -1) {
            this.f7551d = Long.hashCode(m.k().g());
        }
        m0.r rVar = this.i;
        o0.e m7 = m0.b.m();
        boolean z7 = true;
        try {
            m7.b(rVar);
            q.j(tVar, aVar);
            m7.k(m7.f5580f - 1);
            Object obj3 = this.f7549b;
            q6.i.b(obj3);
            int i10 = this.f7551d;
            d0 d0Var2 = this.f7550c;
            if (d0Var2 != null) {
                long[] jArr = d0Var2.f5434a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j7 = jArr[i11];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            z3 = z7;
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j7 & 255) < 128) {
                                    int i15 = (i11 << 3) + i14;
                                    i8 = i12;
                                    Object obj4 = d0Var2.f5435b[i15];
                                    i = i14;
                                    boolean z8 = d0Var2.f5436c[i15] != i10 ? z3 : false;
                                    if (z8) {
                                        d(obj3, obj4);
                                    }
                                    if (z8) {
                                        d0Var2.g(i15);
                                    }
                                } else {
                                    i = i14;
                                    i8 = i12;
                                }
                                j7 >>= i8;
                                i14 = i + 1;
                                i12 = i8;
                            }
                            if (i13 != i12) {
                                break;
                            }
                        } else {
                            z3 = z7;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        z7 = z3;
                    }
                }
            }
            this.f7549b = obj2;
            this.f7550c = d0Var;
            this.f7551d = i9;
        } catch (Throwable th) {
            m7.k(m7.f5580f - 1);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (((w0.v) r1).e(2) == false) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x050f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Set set) {
        char c8;
        long j7;
        boolean z3;
        Iterator it;
        String str;
        j0 j0Var;
        Object g3;
        int i;
        Object g7;
        Object[] objArr;
        Iterator it2;
        int i8;
        String str2;
        j0 j0Var2;
        Object[] objArr2;
        long j8;
        long[] jArr;
        long[] jArr2;
        int i9;
        Object[] objArr3;
        int i10;
        int i11;
        int i12;
        d0 d0Var;
        long[] jArr3;
        v0 v0Var;
        Object[] objArr4;
        long[] jArr4;
        v0 v0Var2;
        Object[] objArr5;
        int i13;
        int i14;
        int i15;
        long j9;
        Object obj;
        Object obj2;
        Object obj3;
        int i16;
        int i17;
        long j10;
        int i18;
        int i19;
        v0 v0Var3 = v0.i;
        boolean z7 = set instanceof o0.g;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        o0.e eVar = this.f7555h;
        j0 j0Var3 = this.f7557k;
        HashMap hashMap = this.f7558l;
        j0 j0Var4 = this.f7552e;
        k0 k0Var = this.f7554g;
        if (z7) {
            k0 k0Var2 = ((o0.g) set).f5581d;
            Object[] objArr6 = k0Var2.f5490b;
            long[] jArr5 = k0Var2.f5489a;
            c8 = 7;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i20 = 0;
                z3 = false;
                j7 = -9187201950435737472L;
                while (true) {
                    int i21 = 8;
                    long j11 = jArr5[i20];
                    int i22 = i20;
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i23 = 8 - ((~(i22 - length)) >>> 31);
                        int i24 = 0;
                        while (i24 < i23) {
                            if ((j11 & 255) < 128) {
                                jArr4 = jArr5;
                                Object obj4 = objArr6[(i22 << 3) + i24];
                                v0Var2 = v0Var3;
                                if (obj4 instanceof v) {
                                    objArr5 = objArr6;
                                } else {
                                    objArr5 = objArr6;
                                }
                                if (j0Var3.c(obj4)) {
                                    Object g8 = j0Var3.g(obj4);
                                    if (g8 != null) {
                                        if (g8 instanceof k0) {
                                            k0 k0Var3 = (k0) g8;
                                            Object[] objArr7 = k0Var3.f5490b;
                                            long[] jArr6 = k0Var3.f5489a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                i15 = i24;
                                                boolean z8 = z3;
                                                int i25 = 0;
                                                while (true) {
                                                    long j12 = jArr6[i25];
                                                    j9 = j11;
                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i26 = 8 - ((~(i25 - length2)) >>> 31);
                                                        int i27 = 0;
                                                        while (i27 < i26) {
                                                            if ((j12 & 255) < 128) {
                                                                j10 = j12;
                                                                e0 e0Var = (e0) objArr7[(i25 << 3) + i27];
                                                                q6.i.c(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                                Object obj5 = hashMap.get(e0Var);
                                                                i18 = i27;
                                                                n2 n2Var = e0Var.f4904f;
                                                                if (n2Var == null) {
                                                                    n2Var = v0Var2;
                                                                }
                                                                if (n2Var.a(e0Var.h().f4893f, obj5)) {
                                                                    obj3 = obj4;
                                                                    i16 = length;
                                                                    i17 = i23;
                                                                    eVar.b(e0Var);
                                                                } else {
                                                                    Object g9 = j0Var4.g(e0Var);
                                                                    if (g9 != null) {
                                                                        if (g9 instanceof k0) {
                                                                            k0 k0Var4 = (k0) g9;
                                                                            Object[] objArr8 = k0Var4.f5490b;
                                                                            long[] jArr7 = k0Var4.f5489a;
                                                                            int length3 = jArr7.length - 2;
                                                                            if (length3 >= 0) {
                                                                                i16 = length;
                                                                                i17 = i23;
                                                                                int i28 = 0;
                                                                                while (true) {
                                                                                    long j13 = jArr7[i28];
                                                                                    long[] jArr8 = jArr7;
                                                                                    obj3 = obj4;
                                                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i29 = 8 - ((~(i28 - length3)) >>> 31);
                                                                                        int i30 = 0;
                                                                                        while (i30 < i29) {
                                                                                            if ((j13 & 255) < 128) {
                                                                                                i19 = i30;
                                                                                                k0Var.a(objArr8[(i28 << 3) + i30]);
                                                                                                z8 = true;
                                                                                            } else {
                                                                                                i19 = i30;
                                                                                            }
                                                                                            j13 >>= i21;
                                                                                            i30 = i19 + 1;
                                                                                        }
                                                                                        if (i29 != i21) {
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (i28 == length3) {
                                                                                        break;
                                                                                    }
                                                                                    i28++;
                                                                                    obj4 = obj3;
                                                                                    jArr7 = jArr8;
                                                                                    i21 = 8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            obj3 = obj4;
                                                                            i16 = length;
                                                                            i17 = i23;
                                                                            k0Var.a(g9);
                                                                            z8 = true;
                                                                        }
                                                                    }
                                                                    obj3 = obj4;
                                                                    i16 = length;
                                                                    i17 = i23;
                                                                }
                                                            } else {
                                                                obj3 = obj4;
                                                                i16 = length;
                                                                i17 = i23;
                                                                j10 = j12;
                                                                i18 = i27;
                                                            }
                                                            j12 = j10 >> 8;
                                                            i27 = i18 + 1;
                                                            i21 = 8;
                                                            length = i16;
                                                            i23 = i17;
                                                            obj4 = obj3;
                                                        }
                                                        obj2 = obj4;
                                                        i13 = length;
                                                        i14 = i23;
                                                        if (i26 != i21) {
                                                            break;
                                                        }
                                                    } else {
                                                        obj2 = obj4;
                                                        i13 = length;
                                                        i14 = i23;
                                                    }
                                                    if (i25 == length2) {
                                                        break;
                                                    }
                                                    i25++;
                                                    i21 = 8;
                                                    j11 = j9;
                                                    length = i13;
                                                    i23 = i14;
                                                    obj4 = obj2;
                                                }
                                                z3 = z8;
                                            }
                                        } else {
                                            obj2 = obj4;
                                            i13 = length;
                                            i14 = i23;
                                            i15 = i24;
                                            j9 = j11;
                                            e0 e0Var2 = (e0) g8;
                                            Object obj6 = hashMap.get(e0Var2);
                                            n2 n2Var2 = e0Var2.f4904f;
                                            if (n2Var2 == null) {
                                                n2Var2 = v0Var2;
                                            }
                                            if (n2Var2.a(e0Var2.h().f4893f, obj6)) {
                                                eVar.b(e0Var2);
                                            } else {
                                                Object g10 = j0Var4.g(e0Var2);
                                                if (g10 != null) {
                                                    if (g10 instanceof k0) {
                                                        k0 k0Var5 = (k0) g10;
                                                        Object[] objArr9 = k0Var5.f5490b;
                                                        long[] jArr9 = k0Var5.f5489a;
                                                        int length4 = jArr9.length - 2;
                                                        if (length4 >= 0) {
                                                            int i31 = 0;
                                                            while (true) {
                                                                long j14 = jArr9[i31];
                                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i32 = 8 - ((~(i31 - length4)) >>> 31);
                                                                    for (int i33 = 0; i33 < i32; i33++) {
                                                                        if ((j14 & 255) < 128) {
                                                                            k0Var.a(objArr9[(i31 << 3) + i33]);
                                                                            z3 = true;
                                                                        }
                                                                        j14 >>= 8;
                                                                    }
                                                                    if (i32 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i31 == length4) {
                                                                    break;
                                                                }
                                                                i31++;
                                                            }
                                                        }
                                                    } else {
                                                        k0Var.a(g10);
                                                        z3 = true;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    }
                                    obj2 = obj4;
                                    i13 = length;
                                    i14 = i23;
                                    i15 = i24;
                                    j9 = j11;
                                    obj = obj2;
                                } else {
                                    i13 = length;
                                    i14 = i23;
                                    i15 = i24;
                                    j9 = j11;
                                    obj = obj4;
                                }
                                Object g11 = j0Var4.g(obj);
                                if (g11 != null) {
                                    if (g11 instanceof k0) {
                                        k0 k0Var6 = (k0) g11;
                                        Object[] objArr10 = k0Var6.f5490b;
                                        long[] jArr10 = k0Var6.f5489a;
                                        int length5 = jArr10.length - 2;
                                        if (length5 >= 0) {
                                            int i34 = 0;
                                            while (true) {
                                                long j15 = jArr10[i34];
                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i35 = 8 - ((~(i34 - length5)) >>> 31);
                                                    for (int i36 = 0; i36 < i35; i36++) {
                                                        if ((j15 & 255) < 128) {
                                                            k0Var.a(objArr10[(i34 << 3) + i36]);
                                                            z3 = true;
                                                        }
                                                        j15 >>= 8;
                                                    }
                                                    if (i35 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i34 == length5) {
                                                    break;
                                                }
                                                i34++;
                                            }
                                        }
                                    } else {
                                        k0Var.a(g11);
                                        z3 = true;
                                    }
                                }
                                i24 = i15 + 1;
                                i21 = 8;
                                v0Var3 = v0Var2;
                                objArr6 = objArr5;
                                length = i13;
                                i23 = i14;
                                j11 = j9 >> 8;
                                jArr5 = jArr4;
                            } else {
                                jArr4 = jArr5;
                                v0Var2 = v0Var3;
                                objArr5 = objArr6;
                            }
                            i13 = length;
                            i14 = i23;
                            i15 = i24;
                            j9 = j11;
                            i24 = i15 + 1;
                            i21 = 8;
                            v0Var3 = v0Var2;
                            objArr6 = objArr5;
                            length = i13;
                            i23 = i14;
                            j11 = j9 >> 8;
                            jArr5 = jArr4;
                        }
                        jArr3 = jArr5;
                        v0Var = v0Var3;
                        objArr4 = objArr6;
                        int i37 = length;
                        if (i23 != i21) {
                            break;
                        }
                        length = i37;
                    } else {
                        jArr3 = jArr5;
                        v0Var = v0Var3;
                        objArr4 = objArr6;
                    }
                    if (i22 == length) {
                        break;
                    }
                    i20 = i22 + 1;
                    v0Var3 = v0Var;
                    jArr5 = jArr3;
                    objArr6 = objArr4;
                }
            } else {
                j7 = -9187201950435737472L;
                z3 = false;
            }
        } else {
            c8 = 7;
            j7 = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z3 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof v) || ((v) next).e(2)) {
                    if (j0Var3.c(next) && (g7 = j0Var3.g(next)) != null) {
                        if (g7 instanceof k0) {
                            k0 k0Var7 = (k0) g7;
                            Object[] objArr11 = k0Var7.f5490b;
                            long[] jArr11 = k0Var7.f5489a;
                            int length6 = jArr11.length - 2;
                            if (length6 >= 0) {
                                int i38 = 0;
                                while (true) {
                                    long j16 = jArr11[i38];
                                    long[] jArr12 = jArr11;
                                    Object[] objArr12 = objArr11;
                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i39 = 8 - ((~(i38 - length6)) >>> 31);
                                        int i40 = 0;
                                        while (i40 < i39) {
                                            if ((j16 & 255) < 128) {
                                                it2 = it3;
                                                e0 e0Var3 = (e0) objArr12[(i38 << 3) + i40];
                                                q6.i.c(e0Var3, str3);
                                                i8 = i40;
                                                Object obj7 = hashMap.get(e0Var3);
                                                str2 = str3;
                                                n2 n2Var3 = e0Var3.f4904f;
                                                if (n2Var3 == null) {
                                                    n2Var3 = v0Var3;
                                                }
                                                j0Var2 = j0Var3;
                                                if (n2Var3.a(e0Var3.h().f4893f, obj7)) {
                                                    objArr2 = objArr12;
                                                    j8 = j16;
                                                    eVar.b(e0Var3);
                                                } else {
                                                    Object g12 = j0Var4.g(e0Var3);
                                                    if (g12 != null) {
                                                        if (g12 instanceof k0) {
                                                            k0 k0Var8 = (k0) g12;
                                                            Object[] objArr13 = k0Var8.f5490b;
                                                            long[] jArr13 = k0Var8.f5489a;
                                                            int length7 = jArr13.length - 2;
                                                            if (length7 >= 0) {
                                                                objArr2 = objArr12;
                                                                boolean z9 = z3;
                                                                int i41 = 0;
                                                                while (true) {
                                                                    long j17 = jArr13[i41];
                                                                    j8 = j16;
                                                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i42 = 8 - ((~(i41 - length7)) >>> 31);
                                                                        int i43 = 0;
                                                                        while (i43 < i42) {
                                                                            if ((j17 & 255) < 128) {
                                                                                jArr2 = jArr13;
                                                                                k0Var.a(objArr13[(i41 << 3) + i43]);
                                                                                z9 = true;
                                                                            } else {
                                                                                jArr2 = jArr13;
                                                                            }
                                                                            j17 >>= 8;
                                                                            i43++;
                                                                            jArr13 = jArr2;
                                                                        }
                                                                        jArr = jArr13;
                                                                        if (i42 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr = jArr13;
                                                                    }
                                                                    if (i41 == length7) {
                                                                        break;
                                                                    }
                                                                    i41++;
                                                                    j16 = j8;
                                                                    jArr13 = jArr;
                                                                }
                                                                z3 = z9;
                                                            }
                                                        } else {
                                                            objArr2 = objArr12;
                                                            j8 = j16;
                                                            k0Var.a(g12);
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                                j16 = j8 >> 8;
                                                str3 = str2;
                                                j0Var3 = j0Var2;
                                                objArr12 = objArr2;
                                                i40 = i8 + 1;
                                                it3 = it2;
                                            } else {
                                                it2 = it3;
                                                i8 = i40;
                                                str2 = str3;
                                                j0Var2 = j0Var3;
                                            }
                                            objArr2 = objArr12;
                                            j8 = j16;
                                            j16 = j8 >> 8;
                                            str3 = str2;
                                            j0Var3 = j0Var2;
                                            objArr12 = objArr2;
                                            i40 = i8 + 1;
                                            it3 = it2;
                                        }
                                        it = it3;
                                        str = str3;
                                        j0Var = j0Var3;
                                        objArr = objArr12;
                                        if (i39 != 8) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        str = str3;
                                        j0Var = j0Var3;
                                        objArr = objArr12;
                                    }
                                    if (i38 == length6) {
                                        break;
                                    }
                                    i38++;
                                    it3 = it;
                                    jArr11 = jArr12;
                                    str3 = str;
                                    j0Var3 = j0Var;
                                    objArr11 = objArr;
                                }
                            }
                        } else {
                            it = it3;
                            str = str3;
                            j0Var = j0Var3;
                            e0 e0Var4 = (e0) g7;
                            Object obj8 = hashMap.get(e0Var4);
                            n2 n2Var4 = e0Var4.f4904f;
                            if (n2Var4 == null) {
                                n2Var4 = v0Var3;
                            }
                            if (n2Var4.a(e0Var4.h().f4893f, obj8)) {
                                eVar.b(e0Var4);
                            } else {
                                Object g13 = j0Var4.g(e0Var4);
                                if (g13 != null) {
                                    if (g13 instanceof k0) {
                                        k0 k0Var9 = (k0) g13;
                                        Object[] objArr14 = k0Var9.f5490b;
                                        long[] jArr14 = k0Var9.f5489a;
                                        int length8 = jArr14.length - 2;
                                        if (length8 >= 0) {
                                            int i44 = 0;
                                            while (true) {
                                                long j18 = jArr14[i44];
                                                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i45 = 8 - ((~(i44 - length8)) >>> 31);
                                                    for (int i46 = 0; i46 < i45; i46++) {
                                                        if ((j18 & 255) < 128) {
                                                            k0Var.a(objArr14[(i44 << 3) + i46]);
                                                            z3 = true;
                                                        }
                                                        j18 >>= 8;
                                                    }
                                                    if (i45 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i44 == length8) {
                                                    break;
                                                }
                                                i44++;
                                            }
                                        }
                                    } else {
                                        k0Var.a(g13);
                                        z3 = true;
                                    }
                                }
                            }
                        }
                        g3 = j0Var4.g(next);
                        if (g3 != null) {
                            if (g3 instanceof k0) {
                                k0 k0Var10 = (k0) g3;
                                Object[] objArr15 = k0Var10.f5490b;
                                long[] jArr15 = k0Var10.f5489a;
                                int length9 = jArr15.length - 2;
                                if (length9 >= 0) {
                                    while (true) {
                                        long j19 = jArr15[i];
                                        if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i47 = 8 - ((~(i - length9)) >>> 31);
                                            for (int i48 = 0; i48 < i47; i48++) {
                                                if ((j19 & 255) < 128) {
                                                    k0Var.a(objArr15[(i << 3) + i48]);
                                                    z3 = true;
                                                }
                                                j19 >>= 8;
                                            }
                                            if (i47 != 8) {
                                                break;
                                            }
                                        }
                                        i = i != length9 ? i + 1 : 0;
                                    }
                                }
                            } else {
                                k0Var.a(g3);
                                z3 = true;
                            }
                        }
                    }
                    it = it3;
                    str = str3;
                    j0Var = j0Var3;
                    g3 = j0Var4.g(next);
                    if (g3 != null) {
                    }
                } else {
                    it = it3;
                    str = str3;
                    j0Var = j0Var3;
                }
                it3 = it;
                str3 = str;
                j0Var3 = j0Var;
            }
        }
        int i49 = eVar.f5580f;
        if (i49 == 0) {
            return z3;
        }
        Object[] objArr16 = eVar.f5578d;
        int i50 = 0;
        while (i50 < i49) {
            e0 e0Var5 = (e0) objArr16[i50];
            int hashCode = Long.hashCode(m.k().g());
            Object g14 = j0Var4.g(e0Var5);
            if (g14 != null) {
                boolean z10 = g14 instanceof k0;
                j0 j0Var5 = this.f7553f;
                if (z10) {
                    k0 k0Var11 = (k0) g14;
                    Object[] objArr17 = k0Var11.f5490b;
                    long[] jArr16 = k0Var11.f5489a;
                    int length10 = jArr16.length - 2;
                    if (length10 >= 0) {
                        int i51 = 0;
                        while (true) {
                            long j20 = jArr16[i51];
                            i9 = i49;
                            objArr3 = objArr16;
                            if ((((~j20) << c8) & j20 & j7) != j7) {
                                int i52 = 8 - ((~(i51 - length10)) >>> 31);
                                int i53 = 0;
                                while (i53 < i52) {
                                    if ((j20 & 255) < 128) {
                                        i11 = i53;
                                        Object obj9 = objArr17[(i51 << 3) + i53];
                                        d0 d0Var2 = (d0) j0Var5.g(obj9);
                                        i12 = i50;
                                        if (d0Var2 == null) {
                                            d0Var = new d0();
                                            j0Var5.m(obj9, d0Var);
                                        } else {
                                            d0Var = d0Var2;
                                        }
                                        c(e0Var5, hashCode, obj9, d0Var);
                                    } else {
                                        i11 = i53;
                                        i12 = i50;
                                    }
                                    j20 >>= 8;
                                    i53 = i11 + 1;
                                    i50 = i12;
                                }
                                i10 = i50;
                                if (i52 != 8) {
                                    break;
                                }
                            } else {
                                i10 = i50;
                            }
                            if (i51 != length10) {
                                i51++;
                                i49 = i9;
                                objArr16 = objArr3;
                                i50 = i10;
                            }
                        }
                    } else {
                        i9 = i49;
                        objArr3 = objArr16;
                        i10 = i50;
                    }
                } else {
                    i9 = i49;
                    objArr3 = objArr16;
                    i10 = i50;
                    d0 d0Var3 = (d0) j0Var5.g(g14);
                    if (d0Var3 == null) {
                        d0Var3 = new d0();
                        j0Var5.m(g14, d0Var3);
                    }
                    c(e0Var5, hashCode, g14, d0Var3);
                }
            } else {
                i9 = i49;
                objArr3 = objArr16;
                i10 = i50;
            }
            i50 = i10 + 1;
            i49 = i9;
            objArr16 = objArr3;
        }
        eVar.g();
        return z3;
    }

    public final void c(Object obj, int i, Object obj2, d0 d0Var) {
        int i8;
        if (this.f7556j > 0) {
            return;
        }
        int c8 = d0Var.c(obj);
        if (c8 < 0) {
            c8 = ~c8;
            i8 = -1;
        } else {
            i8 = d0Var.f5436c[c8];
        }
        d0Var.f5435b[c8] = obj;
        d0Var.f5436c[c8] = i;
        if ((obj instanceof e0) && i8 != i) {
            m0.d0 h8 = ((e0) obj).h();
            this.f7558l.put(obj, h8.f4893f);
            d0 d0Var2 = h8.f4892e;
            j0 j0Var = this.f7557k;
            h0.a.U(j0Var, obj);
            Object[] objArr = d0Var2.f5435b;
            long[] jArr = d0Var2.f5434a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j7 = jArr[i9];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((j7 & 255) < 128) {
                                u uVar = (u) objArr[(i9 << 3) + i11];
                                if (uVar instanceof v) {
                                    ((v) uVar).f(2);
                                }
                                h0.a.i(j0Var, uVar, obj);
                            }
                            j7 >>= 8;
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
                ((v) obj).f(2);
            }
            h0.a.i(this.f7552e, obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        j0 j0Var = this.f7552e;
        h0.a.T(j0Var, obj2, obj);
        if (!(obj2 instanceof e0) || j0Var.c(obj2)) {
            return;
        }
        h0.a.U(this.f7557k, obj2);
        this.f7558l.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        long[] jArr;
        long[] jArr2;
        long j7;
        char c8;
        long j8;
        int i;
        boolean z3;
        long j9;
        j0 j0Var = this.f7553f;
        long[] jArr3 = j0Var.f5482a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j10 = jArr3[i8];
            char c9 = 7;
            long j11 = -9187201950435737472L;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((j10 & 255) < 128) {
                        int i12 = (i8 << 3) + i11;
                        c8 = c9;
                        Object obj = j0Var.f5483b[i12];
                        j8 = j11;
                        d0 d0Var = (d0) j0Var.f5484c[i12];
                        q6.i.c(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        boolean v7 = ((l1) obj).v();
                        if (!v7) {
                            Object[] objArr = d0Var.f5435b;
                            int[] iArr = d0Var.f5436c;
                            long[] jArr4 = d0Var.f5434a;
                            int i13 = i9;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j7 = j10;
                                int i14 = 0;
                                while (true) {
                                    long j12 = jArr4[i14];
                                    long[] jArr5 = jArr4;
                                    z3 = v7;
                                    if ((((~j12) << c8) & j12 & j8) != j8) {
                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j12 & 255) < 128) {
                                                int i17 = (i14 << 3) + i16;
                                                j9 = j12;
                                                Object obj2 = objArr[i17];
                                                int i18 = iArr[i17];
                                                d(obj, obj2);
                                            } else {
                                                j9 = j12;
                                            }
                                            j12 = j9 >> i13;
                                        }
                                        if (i15 != i13) {
                                            break;
                                        }
                                    }
                                    if (i14 == length2) {
                                        break;
                                    }
                                    i14++;
                                    v7 = z3;
                                    jArr4 = jArr5;
                                    i13 = 8;
                                }
                                if (!z3) {
                                    j0Var.l(i12);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j7 = j10;
                        z3 = v7;
                        if (!z3) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j7 = j10;
                        c8 = c9;
                        j8 = j11;
                        i = i9;
                    }
                    i11++;
                    i9 = i;
                    j10 = j7 >> i;
                    c9 = c8;
                    j11 = j8;
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
