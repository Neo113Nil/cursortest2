package Q;

import A.g0;
import G.C0192d;
import G.C0214o;
import i.C0661B;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.C1064e;
import w2.C1294c;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f3905a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3906b;

    /* renamed from: c, reason: collision with root package name */
    public i.v f3907c;

    /* renamed from: j, reason: collision with root package name */
    public int f3914j;

    /* renamed from: d, reason: collision with root package name */
    public int f3908d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final C1294c f3909e = new C1294c(13);

    /* renamed from: f, reason: collision with root package name */
    public final i.y f3910f = new i.y();

    /* renamed from: g, reason: collision with root package name */
    public final C0661B f3911g = new C0661B();

    /* renamed from: h, reason: collision with root package name */
    public final I.d f3912h = new I.d(new G.F[16]);

    /* renamed from: i, reason: collision with root package name */
    public final C0214o f3913i = new C0214o(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final C1294c f3915k = new C1294c(13);

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f3916l = new HashMap();

    public z(Function1 function1) {
        this.f3905a = function1;
    }

    public final void a(Object obj, g0 g0Var, Function0 function0) {
        long[] jArr;
        long[] jArr2;
        int i2;
        Object obj2 = this.f3906b;
        i.v vVar = this.f3907c;
        int i4 = this.f3908d;
        this.f3906b = obj;
        this.f3907c = (i.v) this.f3910f.e(obj);
        if (this.f3908d == -1) {
            this.f3908d = q.k().d();
        }
        C0214o c0214o = this.f3913i;
        I.d C3 = C0192d.C();
        try {
            C3.b(c0214o);
            w.e(function0, g0Var);
            C3.n(C3.f3332i - 1);
            Object obj3 = this.f3906b;
            Intrinsics.c(obj3);
            int i5 = this.f3908d;
            i.v vVar2 = this.f3907c;
            if (vVar2 != null) {
                long[] jArr3 = vVar2.f6968a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j4 = jArr3[i6];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j4 & 255) < 128) {
                                    int i10 = (i6 << 3) + i9;
                                    Object obj4 = vVar2.f6969b[i10];
                                    jArr2 = jArr3;
                                    boolean z4 = vVar2.f6970c[i10] != i5;
                                    if (z4) {
                                        d(obj3, obj4);
                                    }
                                    if (z4) {
                                        vVar2.e(i10);
                                    }
                                    i2 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i2 = i7;
                                }
                                j4 >>= i2;
                                i9++;
                                i7 = i2;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i8 != i7) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        jArr3 = jArr;
                    }
                }
            }
            this.f3906b = obj2;
            this.f3907c = vVar;
            this.f3908d = i4;
        } catch (Throwable th) {
            C3.n(C3.f3332i - 1);
            throw th;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean b(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.z.b(java.util.Set):boolean");
    }

    public final void c(Object obj, int i2, Object obj2, i.v vVar) {
        int i4;
        if (this.f3914j > 0) {
            return;
        }
        int b4 = vVar.b(obj);
        if (b4 < 0) {
            b4 = ~b4;
            i4 = -1;
        } else {
            i4 = vVar.f6970c[b4];
        }
        vVar.f6969b[b4] = obj;
        vVar.f6970c[b4] = i2;
        if ((obj instanceof G.F) && i4 != i2) {
            G.E f4 = ((G.F) obj).f();
            this.f3916l.put(obj, f4.f2651f);
            i.v vVar2 = f4.f2650e;
            C1294c c1294c = this.f3915k;
            c1294c.m(obj);
            Object[] objArr = vVar2.f6969b;
            long[] jArr = vVar2.f6968a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j4 = jArr[i5];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                D d4 = (D) objArr[(i5 << 3) + i7];
                                if (d4 instanceof E) {
                                    ((E) d4).c(2);
                                }
                                c1294c.d(d4, obj);
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        if (i4 == -1) {
            if (obj instanceof E) {
                ((E) obj).c(2);
            }
            this.f3909e.d(obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        C1294c c1294c = this.f3909e;
        c1294c.l(obj2, obj);
        if (!(obj2 instanceof G.F) || ((i.y) c1294c.f11388d).b(obj2)) {
            return;
        }
        this.f3915k.m(obj2);
        this.f3916l.remove(obj2);
    }

    public final void e() {
        C1064e c1064e;
        long[] jArr;
        int i2;
        C1064e c1064e2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        char c4;
        long j4;
        int i7;
        int i8;
        C1064e c1064e3 = C1064e.f9784m;
        i.y yVar = this.f3910f;
        long[] jArr3 = yVar.f6982a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j5 = jArr3[i9];
            char c5 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i9 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((j5 & 255) < 128) {
                        int i13 = (i9 << 3) + i12;
                        Object obj = yVar.f6983b[i13];
                        i.v vVar = (i.v) yVar.f6984c[i13];
                        Boolean bool = (Boolean) c1064e3.invoke(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = vVar.f6969b;
                            int[] iArr = vVar.f6970c;
                            long[] jArr4 = vVar.f6968a;
                            int length2 = jArr4.length - 2;
                            c1064e2 = c1064e3;
                            jArr2 = jArr3;
                            i4 = length;
                            if (length2 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j7 = jArr4[i14];
                                    i6 = i11;
                                    long[] jArr5 = jArr4;
                                    c4 = 7;
                                    j4 = -9187201950435737472L;
                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            if ((j7 & 255) < 128) {
                                                int i17 = (i14 << 3) + i16;
                                                i8 = i9;
                                                Object obj2 = objArr[i17];
                                                int i18 = iArr[i17];
                                                d(obj, obj2);
                                            } else {
                                                i8 = i9;
                                            }
                                            j7 >>= 8;
                                            i16++;
                                            i9 = i8;
                                        }
                                        i5 = i9;
                                        if (i15 != 8) {
                                            break;
                                        }
                                    } else {
                                        i5 = i9;
                                    }
                                    if (i14 == length2) {
                                        break;
                                    }
                                    i14++;
                                    i11 = i6;
                                    jArr4 = jArr5;
                                    i9 = i5;
                                }
                            } else {
                                i5 = i9;
                                i6 = i11;
                                j4 = -9187201950435737472L;
                                c4 = 7;
                            }
                        } else {
                            c1064e2 = c1064e3;
                            jArr2 = jArr3;
                            i4 = length;
                            i5 = i9;
                            i6 = i11;
                            c4 = c5;
                            j4 = j6;
                        }
                        if (bool.booleanValue()) {
                            yVar.h(i13);
                        }
                        i7 = 8;
                    } else {
                        c1064e2 = c1064e3;
                        jArr2 = jArr3;
                        i4 = length;
                        i5 = i9;
                        i6 = i11;
                        c4 = c5;
                        j4 = j6;
                        i7 = i10;
                    }
                    j5 >>= i7;
                    i12++;
                    i10 = i7;
                    j6 = j4;
                    c5 = c4;
                    c1064e3 = c1064e2;
                    jArr3 = jArr2;
                    length = i4;
                    i11 = i6;
                    i9 = i5;
                }
                c1064e = c1064e3;
                jArr = jArr3;
                int i19 = length;
                int i20 = i9;
                if (i11 != i10) {
                    return;
                }
                length = i19;
                i2 = i20;
            } else {
                c1064e = c1064e3;
                jArr = jArr3;
                i2 = i9;
            }
            if (i2 == length) {
                return;
            }
            i9 = i2 + 1;
            c1064e3 = c1064e;
            jArr3 = jArr;
        }
    }
}
