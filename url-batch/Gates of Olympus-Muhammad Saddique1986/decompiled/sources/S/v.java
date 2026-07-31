package S;

import B.Y;
import I.C0143d;
import I.C0165o;
import I.F;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import j.C0519A;
import j.C0547u;
import j.C0550x;
import java.util.HashMap;
import t0.C0992e;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0424c f4259a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4260b;

    /* renamed from: c, reason: collision with root package name */
    public C0547u f4261c;

    /* renamed from: j, reason: collision with root package name */
    public int f4268j;

    /* renamed from: d, reason: collision with root package name */
    public int f4262d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final Y f4263e = new Y(12);

    /* renamed from: f, reason: collision with root package name */
    public final C0550x f4264f = new C0550x();

    /* renamed from: g, reason: collision with root package name */
    public final C0519A f4265g = new C0519A();

    /* renamed from: h, reason: collision with root package name */
    public final K.d f4266h = new K.d(new F[16]);

    /* renamed from: i, reason: collision with root package name */
    public final C0165o f4267i = new C0165o(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final Y f4269k = new Y(12);

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f4270l = new HashMap();

    public v(InterfaceC0424c interfaceC0424c) {
        this.f4259a = interfaceC0424c;
    }

    public final void a(Object obj, A0.l lVar, InterfaceC0422a interfaceC0422a) {
        long[] jArr;
        long[] jArr2;
        int i3;
        Object obj2 = this.f4260b;
        C0547u c0547u = this.f4261c;
        int i4 = this.f4262d;
        this.f4260b = obj;
        this.f4261c = (C0547u) this.f4264f.e(obj);
        if (this.f4262d == -1) {
            this.f4262d = p.k().d();
        }
        C0165o c0165o = this.f4267i;
        K.d C = C0143d.C();
        try {
            C.b(c0165o);
            u.e(interfaceC0422a, lVar);
            C.o(C.f3216f - 1);
            Object obj3 = this.f4260b;
            f2.j.c(obj3);
            int i5 = this.f4262d;
            C0547u c0547u2 = this.f4261c;
            if (c0547u2 != null) {
                long[] jArr3 = c0547u2.f6330a;
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
                                    Object obj4 = c0547u2.f6331b[i10];
                                    jArr2 = jArr3;
                                    boolean z3 = c0547u2.f6332c[i10] != i5;
                                    if (z3) {
                                        d(obj3, obj4);
                                    }
                                    if (z3) {
                                        c0547u2.e(i10);
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
            this.f4260b = obj2;
            this.f4261c = c0547u;
            this.f4262d = i4;
        } catch (Throwable th) {
            C.o(C.f3216f - 1);
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

    public final void c(Object obj, int i3, Object obj2, C0547u c0547u) {
        int i4;
        if (this.f4268j > 0) {
            return;
        }
        int b3 = c0547u.b(obj);
        if (b3 < 0) {
            b3 = ~b3;
            i4 = -1;
        } else {
            i4 = c0547u.f6332c[b3];
        }
        c0547u.f6331b[b3] = obj;
        c0547u.f6332c[b3] = i3;
        if ((obj instanceof F) && i4 != i3) {
            I.E h3 = ((F) obj).h();
            this.f4270l.put(obj, h3.f2653f);
            C0547u c0547u2 = h3.f2652e;
            Y y3 = this.f4269k;
            y3.n(obj);
            Object[] objArr = c0547u2.f6331b;
            long[] jArr = c0547u2.f6330a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j3 = jArr[i5];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j3 & 255) < 128) {
                                y yVar = (y) objArr[(i5 << 3) + i7];
                                if (yVar instanceof z) {
                                    ((z) yVar).f(2);
                                }
                                y3.d(yVar, obj);
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
            if (obj instanceof z) {
                ((z) obj).f(2);
            }
            this.f4263e.d(obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        Y y3 = this.f4263e;
        y3.m(obj2, obj);
        if (!(obj2 instanceof F) || ((C0550x) y3.f334d).b(obj2)) {
            return;
        }
        this.f4269k.n(obj2);
        this.f4270l.remove(obj2);
    }

    public final void e() {
        C0992e c0992e;
        long[] jArr;
        int i3;
        C0992e c0992e2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        char c2;
        long j3;
        int i7;
        int i8;
        C0992e c0992e3 = C0992e.f8733k;
        C0550x c0550x = this.f4264f;
        long[] jArr3 = c0550x.f6344a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j4 = jArr3[i9];
            char c3 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i9 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((j4 & 255) < 128) {
                        int i13 = (i9 << 3) + i12;
                        Object obj = c0550x.f6345b[i13];
                        C0547u c0547u = (C0547u) c0550x.f6346c[i13];
                        Boolean bool = (Boolean) c0992e3.n(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = c0547u.f6331b;
                            int[] iArr = c0547u.f6332c;
                            long[] jArr4 = c0547u.f6330a;
                            int length2 = jArr4.length - 2;
                            c0992e2 = c0992e3;
                            jArr2 = jArr3;
                            i4 = length;
                            if (length2 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j6 = jArr4[i14];
                                    i6 = i11;
                                    long[] jArr5 = jArr4;
                                    c2 = 7;
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
                                c2 = 7;
                            }
                        } else {
                            c0992e2 = c0992e3;
                            jArr2 = jArr3;
                            i4 = length;
                            i5 = i9;
                            i6 = i11;
                            c2 = c3;
                            j3 = j5;
                        }
                        if (bool.booleanValue()) {
                            c0550x.h(i13);
                        }
                        i7 = 8;
                    } else {
                        c0992e2 = c0992e3;
                        jArr2 = jArr3;
                        i4 = length;
                        i5 = i9;
                        i6 = i11;
                        c2 = c3;
                        j3 = j5;
                        i7 = i10;
                    }
                    j4 >>= i7;
                    i12++;
                    i10 = i7;
                    j5 = j3;
                    c3 = c2;
                    c0992e3 = c0992e2;
                    jArr3 = jArr2;
                    length = i4;
                    i11 = i6;
                    i9 = i5;
                }
                c0992e = c0992e3;
                jArr = jArr3;
                int i19 = length;
                int i20 = i9;
                if (i11 != i10) {
                    return;
                }
                length = i19;
                i3 = i20;
            } else {
                c0992e = c0992e3;
                jArr = jArr3;
                i3 = i9;
            }
            if (i3 == length) {
                return;
            }
            i9 = i3 + 1;
            c0992e3 = c0992e;
            jArr3 = jArr;
        }
    }
}
