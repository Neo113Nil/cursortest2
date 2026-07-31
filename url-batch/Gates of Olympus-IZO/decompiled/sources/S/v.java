package S;

import F.C0047j0;
import I.C0089d;
import I.C0111o;
import I.E;
import I.G;
import j.C0475A;
import j.C0503u;
import j.C0506x;
import java.util.HashMap;
import t0.C0897e;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Y1.c f3250a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3251b;

    /* renamed from: c, reason: collision with root package name */
    public C0503u f3252c;

    /* renamed from: j, reason: collision with root package name */
    public int f3259j;

    /* renamed from: d, reason: collision with root package name */
    public int f3253d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final A2.g f3254e = new A2.g(12);

    /* renamed from: f, reason: collision with root package name */
    public final C0506x f3255f = new C0506x();

    /* renamed from: g, reason: collision with root package name */
    public final C0475A f3256g = new C0475A();

    /* renamed from: h, reason: collision with root package name */
    public final K.d f3257h = new K.d(new G[16]);

    /* renamed from: i, reason: collision with root package name */
    public final C0111o f3258i = new C0111o(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final A2.g f3260k = new A2.g(12);

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f3261l = new HashMap();

    public v(Y1.c cVar) {
        this.f3250a = cVar;
    }

    public final void a(Object obj, C0047j0 c0047j0, Y1.a aVar) {
        long[] jArr;
        long[] jArr2;
        int i3;
        Object obj2 = this.f3251b;
        C0503u c0503u = this.f3252c;
        int i4 = this.f3253d;
        this.f3251b = obj;
        this.f3252c = (C0503u) this.f3255f.e(obj);
        if (this.f3253d == -1) {
            this.f3253d = q.k().d();
        }
        C0111o c0111o = this.f3258i;
        K.d C = C0089d.C();
        try {
            C.b(c0111o);
            u.e(aVar, c0047j0);
            C.o(C.f2642f - 1);
            Object obj3 = this.f3251b;
            Z1.i.c(obj3);
            int i5 = this.f3253d;
            C0503u c0503u2 = this.f3252c;
            if (c0503u2 != null) {
                long[] jArr3 = c0503u2.f5212a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j3 = jArr3[i6];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j3 & 255) < 128) {
                                    int i10 = (i6 << 3) + i9;
                                    Object obj4 = c0503u2.f5213b[i10];
                                    jArr2 = jArr3;
                                    boolean z3 = c0503u2.f5214c[i10] != i5;
                                    if (z3) {
                                        d(obj3, obj4);
                                    }
                                    if (z3) {
                                        c0503u2.e(i10);
                                    }
                                    i3 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i3 = i7;
                                }
                                j3 >>= i3;
                                i9++;
                                i7 = i3;
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
            this.f3251b = obj2;
            this.f3252c = c0503u;
            this.f3253d = i4;
        } catch (Throwable th) {
            C.o(C.f2642f - 1);
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
            Method dump skipped, instructions count: 1856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S.v.b(java.util.Set):boolean");
    }

    public final void c(Object obj, int i3, Object obj2, C0503u c0503u) {
        int i4;
        if (this.f3259j > 0) {
            return;
        }
        int b2 = c0503u.b(obj);
        if (b2 < 0) {
            b2 = ~b2;
            i4 = -1;
        } else {
            i4 = c0503u.f5214c[b2];
        }
        c0503u.f5213b[b2] = obj;
        c0503u.f5214c[b2] = i3;
        if ((obj instanceof G) && i4 != i3) {
            E h3 = ((G) obj).h();
            this.f3261l.put(obj, h3.f2093f);
            C0503u c0503u2 = h3.f2092e;
            A2.g gVar = this.f3260k;
            gVar.r(obj);
            Object[] objArr = c0503u2.f5213b;
            long[] jArr = c0503u2.f5212a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j3 = jArr[i5];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j3 & 255) < 128) {
                                x xVar = (x) objArr[(i5 << 3) + i7];
                                if (xVar instanceof y) {
                                    ((y) xVar).f(2);
                                }
                                gVar.j(xVar, obj);
                            }
                            j3 >>= 8;
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
            if (obj instanceof y) {
                ((y) obj).f(2);
            }
            this.f3254e.j(obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        A2.g gVar = this.f3254e;
        gVar.q(obj2, obj);
        if (!(obj2 instanceof G) || ((C0506x) gVar.f83b).b(obj2)) {
            return;
        }
        this.f3260k.r(obj2);
        this.f3261l.remove(obj2);
    }

    public final void e() {
        C0897e c0897e;
        long[] jArr;
        int i3;
        C0897e c0897e2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        char c3;
        long j3;
        int i7;
        int i8;
        C0897e c0897e3 = C0897e.f7901k;
        C0506x c0506x = this.f3255f;
        long[] jArr3 = c0506x.f5226a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j4 = jArr3[i9];
            char c4 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i9 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((j4 & 255) < 128) {
                        int i13 = (i9 << 3) + i12;
                        Object obj = c0506x.f5227b[i13];
                        C0503u c0503u = (C0503u) c0506x.f5228c[i13];
                        Boolean bool = (Boolean) c0897e3.j(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = c0503u.f5213b;
                            int[] iArr = c0503u.f5214c;
                            long[] jArr4 = c0503u.f5212a;
                            int length2 = jArr4.length - 2;
                            c0897e2 = c0897e3;
                            jArr2 = jArr3;
                            i4 = length;
                            if (length2 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j6 = jArr4[i14];
                                    i6 = i11;
                                    long[] jArr5 = jArr4;
                                    c3 = 7;
                                    j3 = -9187201950435737472L;
                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            if ((j6 & 255) < 128) {
                                                int i17 = (i14 << 3) + i16;
                                                i8 = i9;
                                                Object obj2 = objArr[i17];
                                                int i18 = iArr[i17];
                                                d(obj, obj2);
                                            } else {
                                                i8 = i9;
                                            }
                                            j6 >>= 8;
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
                                j3 = -9187201950435737472L;
                                c3 = 7;
                            }
                        } else {
                            c0897e2 = c0897e3;
                            jArr2 = jArr3;
                            i4 = length;
                            i5 = i9;
                            i6 = i11;
                            c3 = c4;
                            j3 = j5;
                        }
                        if (bool.booleanValue()) {
                            c0506x.h(i13);
                        }
                        i7 = 8;
                    } else {
                        c0897e2 = c0897e3;
                        jArr2 = jArr3;
                        i4 = length;
                        i5 = i9;
                        i6 = i11;
                        c3 = c4;
                        j3 = j5;
                        i7 = i10;
                    }
                    j4 >>= i7;
                    i12++;
                    i10 = i7;
                    j5 = j3;
                    c4 = c3;
                    c0897e3 = c0897e2;
                    jArr3 = jArr2;
                    length = i4;
                    i11 = i6;
                    i9 = i5;
                }
                c0897e = c0897e3;
                jArr = jArr3;
                int i19 = length;
                int i20 = i9;
                if (i11 != i10) {
                    return;
                }
                length = i19;
                i3 = i20;
            } else {
                c0897e = c0897e3;
                jArr = jArr3;
                i3 = i9;
            }
            if (i3 == length) {
                return;
            }
            i9 = i3 + 1;
            c0897e3 = c0897e;
            jArr3 = jArr;
        }
    }
}
