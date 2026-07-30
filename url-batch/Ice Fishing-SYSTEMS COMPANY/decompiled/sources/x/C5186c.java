package x;

import java.util.ArrayList;
import java.util.Iterator;
import w.C5143c;
import w.C5144d;
import w.C5145e;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5186c extends AbstractC5199p {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f41723k;

    /* renamed from: l, reason: collision with root package name */
    public int f41724l;

    public C5186c(C5144d c5144d, int i) {
        super(c5144d);
        C5144d c5144d2;
        this.f41723k = new ArrayList();
        this.f41762f = i;
        C5144d c5144d3 = this.f41758b;
        C5144d m8 = c5144d3.m(i);
        while (true) {
            C5144d c5144d4 = m8;
            c5144d2 = c5144d3;
            c5144d3 = c5144d4;
            if (c5144d3 == null) {
                break;
            } else {
                m8 = c5144d3.m(this.f41762f);
            }
        }
        this.f41758b = c5144d2;
        int i4 = this.f41762f;
        Object obj = i4 == 0 ? c5144d2.f41444d : i4 == 1 ? c5144d2.f41446e : null;
        ArrayList arrayList = this.f41723k;
        arrayList.add(obj);
        C5144d l9 = c5144d2.l(this.f41762f);
        while (l9 != null) {
            int i9 = this.f41762f;
            arrayList.add(i9 == 0 ? l9.f41444d : i9 == 1 ? l9.f41446e : null);
            l9 = l9.l(this.f41762f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC5199p abstractC5199p = (AbstractC5199p) it.next();
            int i10 = this.f41762f;
            if (i10 == 0) {
                abstractC5199p.f41758b.f41440b = this;
            } else if (i10 == 1) {
                abstractC5199p.f41758b.f41442c = this;
            }
        }
        if (this.f41762f == 0 && ((C5145e) this.f41758b.f41432T).f41494v0 && arrayList.size() > 1) {
            this.f41758b = ((AbstractC5199p) arrayList.get(arrayList.size() - 1)).f41758b;
        }
        this.f41724l = this.f41762f == 0 ? this.f41758b.f41454i0 : this.f41758b.f41456j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0397, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // x.InterfaceC5187d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC5187d interfaceC5187d) {
        int i;
        int i4;
        boolean z8;
        float f6;
        int i9;
        int i10;
        int i11;
        int i12;
        float f9;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z9;
        int i21;
        C5189f c5189f = this.f41764h;
        if (c5189f.f41741j) {
            C5189f c5189f2 = this.i;
            if (c5189f2.f41741j) {
                C5144d c5144d = this.f41758b.f41432T;
                boolean z10 = c5144d instanceof C5145e ? ((C5145e) c5144d).f41494v0 : false;
                int i22 = c5189f2.f41739g - c5189f.f41739g;
                ArrayList arrayList = this.f41723k;
                int size = arrayList.size();
                int i23 = 0;
                while (true) {
                    i = -1;
                    i4 = 8;
                    if (i23 >= size) {
                        i23 = -1;
                        break;
                    } else if (((AbstractC5199p) arrayList.get(i23)).f41758b.f41451g0 != 8) {
                        break;
                    } else {
                        i23++;
                    }
                }
                int i24 = size - 1;
                int i25 = i24;
                while (true) {
                    if (i25 < 0) {
                        break;
                    }
                    if (((AbstractC5199p) arrayList.get(i25)).f41758b.f41451g0 != 8) {
                        i = i25;
                        break;
                    }
                    i25--;
                }
                int i26 = 0;
                while (i26 < 2) {
                    f6 = 0.0f;
                    int i27 = 0;
                    i11 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    while (i27 < size) {
                        AbstractC5199p abstractC5199p = (AbstractC5199p) arrayList.get(i27);
                        C5144d c5144d2 = abstractC5199p.f41758b;
                        boolean z11 = z10;
                        if (c5144d2.f41451g0 == i4) {
                            i20 = i26;
                        } else {
                            i29++;
                            if (i27 > 0 && i27 >= i23) {
                                i11 += abstractC5199p.f41764h.f41738f;
                            }
                            C5190g c5190g = abstractC5199p.f41761e;
                            int i30 = c5190g.f41739g;
                            i20 = i26;
                            boolean z12 = abstractC5199p.f41760d != 3;
                            if (z12) {
                                int i31 = this.f41762f;
                                if (i31 == 0 && !c5144d2.f41444d.f41761e.f41741j) {
                                    return;
                                }
                                if (i31 == 1 && !c5144d2.f41446e.f41761e.f41741j) {
                                    return;
                                } else {
                                    z9 = z12;
                                }
                            } else {
                                z9 = z12;
                                if (abstractC5199p.f41757a == 1 && i20 == 0) {
                                    i21 = c5190g.f41744m;
                                    i28++;
                                } else if (c5190g.f41741j) {
                                    i21 = i30;
                                }
                                z9 = true;
                                if (z9) {
                                    i28++;
                                    float f10 = c5144d2.f41458k0[this.f41762f];
                                    if (f10 >= 0.0f) {
                                        f6 += f10;
                                    }
                                } else {
                                    i11 += i21;
                                }
                                if (i27 < i24 && i27 < i) {
                                    i11 += -abstractC5199p.i.f41738f;
                                }
                            }
                            i21 = i30;
                            if (z9) {
                            }
                            if (i27 < i24) {
                                i11 += -abstractC5199p.i.f41738f;
                            }
                        }
                        i27++;
                        z10 = z11;
                        i26 = i20;
                        i4 = 8;
                    }
                    z8 = z10;
                    int i32 = i26;
                    if (i11 < i22 || i28 == 0) {
                        i9 = i28;
                        i10 = i29;
                        break;
                    } else {
                        i26 = i32 + 1;
                        z10 = z8;
                        i4 = 8;
                    }
                }
                z8 = z10;
                f6 = 0.0f;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                int i33 = c5189f.f41739g;
                if (z8) {
                    i33 = c5189f2.f41739g;
                }
                float f11 = 0.5f;
                if (i11 > i22) {
                    i33 = z8 ? i33 + ((int) (((i11 - i22) / 2.0f) + 0.5f)) : i33 - ((int) (((i11 - i22) / 2.0f) + 0.5f));
                }
                if (i9 > 0) {
                    float f12 = i22 - i11;
                    int i34 = (int) ((f12 / i9) + 0.5f);
                    int i35 = 0;
                    int i36 = 0;
                    while (i35 < size) {
                        float f13 = f11;
                        AbstractC5199p abstractC5199p2 = (AbstractC5199p) arrayList.get(i35);
                        int i37 = i33;
                        C5144d c5144d3 = abstractC5199p2.f41758b;
                        int i38 = i9;
                        float f14 = f12;
                        if (c5144d3.f41451g0 != 8 && abstractC5199p2.f41760d == 3) {
                            C5190g c5190g2 = abstractC5199p2.f41761e;
                            if (!c5190g2.f41741j) {
                                if (f6 > 0.0f) {
                                    i15 = (int) (((c5144d3.f41458k0[this.f41762f] * f14) / f6) + f13);
                                    i16 = i34;
                                } else {
                                    i15 = i34;
                                    i16 = i15;
                                }
                                if (this.f41762f == 0) {
                                    i17 = c5144d3.f41473v;
                                    i18 = c5144d3.f41472u;
                                } else {
                                    i17 = c5144d3.f41476y;
                                    i18 = c5144d3.f41475x;
                                }
                                i19 = i35;
                                int max = Math.max(i18, abstractC5199p2.f41757a == 1 ? Math.min(i15, c5190g2.f41744m) : i15);
                                if (i17 > 0) {
                                    max = Math.min(i17, max);
                                }
                                if (max != i15) {
                                    i36++;
                                    i15 = max;
                                }
                                c5190g2.d(i15);
                                i35 = i19 + 1;
                                i33 = i37;
                                f11 = f13;
                                i9 = i38;
                                f12 = f14;
                                i34 = i16;
                            }
                        }
                        i16 = i34;
                        i19 = i35;
                        i35 = i19 + 1;
                        i33 = i37;
                        f11 = f13;
                        i9 = i38;
                        f12 = f14;
                        i34 = i16;
                    }
                    i12 = i33;
                    f9 = f11;
                    int i39 = i9;
                    if (i36 > 0) {
                        i9 = i39 - i36;
                        i11 = 0;
                        for (int i40 = 0; i40 < size; i40++) {
                            AbstractC5199p abstractC5199p3 = (AbstractC5199p) arrayList.get(i40);
                            if (abstractC5199p3.f41758b.f41451g0 != 8) {
                                if (i40 > 0 && i40 >= i23) {
                                    i11 += abstractC5199p3.f41764h.f41738f;
                                }
                                i11 += abstractC5199p3.f41761e.f41739g;
                                if (i40 < i24 && i40 < i) {
                                    i11 += -abstractC5199p3.i.f41738f;
                                }
                            }
                        }
                    } else {
                        i9 = i39;
                    }
                    i14 = 2;
                    if (this.f41724l == 2 && i36 == 0) {
                        i13 = 0;
                        this.f41724l = 0;
                    } else {
                        i13 = 0;
                    }
                } else {
                    i12 = i33;
                    f9 = 0.5f;
                    i13 = 0;
                    i14 = 2;
                }
                if (i11 > i22) {
                    this.f41724l = i14;
                }
                if (i10 > 0 && i9 == 0 && i23 == i) {
                    this.f41724l = i14;
                }
                int i41 = this.f41724l;
                if (i41 == 1) {
                    int i42 = i10 > 1 ? (i22 - i11) / (i10 - 1) : i10 == 1 ? (i22 - i11) / 2 : i13;
                    if (i9 > 0) {
                        i42 = i13;
                    }
                    int i43 = i12;
                    for (int i44 = i13; i44 < size; i44++) {
                        AbstractC5199p abstractC5199p4 = (AbstractC5199p) arrayList.get(z8 ? size - (i44 + 1) : i44);
                        int i45 = abstractC5199p4.f41758b.f41451g0;
                        C5189f c5189f3 = abstractC5199p4.i;
                        C5189f c5189f4 = abstractC5199p4.f41764h;
                        if (i45 == 8) {
                            c5189f4.d(i43);
                            c5189f3.d(i43);
                        } else {
                            if (i44 > 0) {
                                i43 = z8 ? i43 - i42 : i43 + i42;
                            }
                            if (i44 > 0 && i44 >= i23) {
                                i43 = z8 ? i43 - c5189f4.f41738f : i43 + c5189f4.f41738f;
                            }
                            if (z8) {
                                c5189f3.d(i43);
                            } else {
                                c5189f4.d(i43);
                            }
                            C5190g c5190g3 = abstractC5199p4.f41761e;
                            int i46 = c5190g3.f41739g;
                            if (abstractC5199p4.f41760d == 3 && abstractC5199p4.f41757a == 1) {
                                i46 = c5190g3.f41744m;
                            }
                            i43 = z8 ? i43 - i46 : i43 + i46;
                            if (z8) {
                                c5189f4.d(i43);
                            } else {
                                c5189f3.d(i43);
                            }
                            abstractC5199p4.f41763g = true;
                            if (i44 < i24 && i44 < i) {
                                i43 = z8 ? i43 - (-c5189f3.f41738f) : i43 + (-c5189f3.f41738f);
                            }
                        }
                    }
                    return;
                }
                if (i41 == 0) {
                    int i47 = (i22 - i11) / (i10 + 1);
                    if (i9 > 0) {
                        i47 = i13;
                    }
                    int i48 = i12;
                    for (int i49 = i13; i49 < size; i49++) {
                        AbstractC5199p abstractC5199p5 = (AbstractC5199p) arrayList.get(z8 ? size - (i49 + 1) : i49);
                        int i50 = abstractC5199p5.f41758b.f41451g0;
                        C5189f c5189f5 = abstractC5199p5.i;
                        C5189f c5189f6 = abstractC5199p5.f41764h;
                        if (i50 == 8) {
                            c5189f6.d(i48);
                            c5189f5.d(i48);
                        } else {
                            int i51 = z8 ? i48 - i47 : i48 + i47;
                            if (i49 > 0 && i49 >= i23) {
                                i51 = z8 ? i51 - c5189f6.f41738f : i51 + c5189f6.f41738f;
                            }
                            if (z8) {
                                c5189f5.d(i51);
                            } else {
                                c5189f6.d(i51);
                            }
                            C5190g c5190g4 = abstractC5199p5.f41761e;
                            int i52 = c5190g4.f41739g;
                            if (abstractC5199p5.f41760d == 3 && abstractC5199p5.f41757a == 1) {
                                i52 = Math.min(i52, c5190g4.f41744m);
                            }
                            i48 = z8 ? i51 - i52 : i51 + i52;
                            if (z8) {
                                c5189f6.d(i48);
                            } else {
                                c5189f5.d(i48);
                            }
                            if (i49 < i24 && i49 < i) {
                                i48 = z8 ? i48 - (-c5189f5.f41738f) : i48 + (-c5189f5.f41738f);
                            }
                        }
                    }
                    return;
                }
                if (i41 == 2) {
                    float f15 = this.f41762f == 0 ? this.f41758b.f41445d0 : this.f41758b.f41447e0;
                    if (z8) {
                        f15 = 1.0f - f15;
                    }
                    int i53 = (int) (((i22 - i11) * f15) + f9);
                    if (i53 < 0 || i9 > 0) {
                        i53 = i13;
                    }
                    int i54 = z8 ? i12 - i53 : i12 + i53;
                    for (int i55 = i13; i55 < size; i55++) {
                        AbstractC5199p abstractC5199p6 = (AbstractC5199p) arrayList.get(z8 ? size - (i55 + 1) : i55);
                        int i56 = abstractC5199p6.f41758b.f41451g0;
                        C5189f c5189f7 = abstractC5199p6.i;
                        C5189f c5189f8 = abstractC5199p6.f41764h;
                        if (i56 == 8) {
                            c5189f8.d(i54);
                            c5189f7.d(i54);
                        } else {
                            if (i55 > 0 && i55 >= i23) {
                                i54 = z8 ? i54 - c5189f8.f41738f : i54 + c5189f8.f41738f;
                            }
                            if (z8) {
                                c5189f7.d(i54);
                            } else {
                                c5189f8.d(i54);
                            }
                            C5190g c5190g5 = abstractC5199p6.f41761e;
                            int i57 = c5190g5.f41739g;
                            if (abstractC5199p6.f41760d == 3 && abstractC5199p6.f41757a == 1) {
                                i57 = c5190g5.f41744m;
                            }
                            i54 += i57;
                            if (z8) {
                                c5189f8.d(i54);
                            } else {
                                c5189f7.d(i54);
                            }
                            if (i55 < i24 && i55 < i) {
                                i54 = z8 ? i54 - (-c5189f7.f41738f) : i54 + (-c5189f7.f41738f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // x.AbstractC5199p
    public final void d() {
        ArrayList arrayList = this.f41723k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC5199p) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C5144d c5144d = ((AbstractC5199p) arrayList.get(0)).f41758b;
        C5144d c5144d2 = ((AbstractC5199p) arrayList.get(size - 1)).f41758b;
        int i = this.f41762f;
        C5189f c5189f = this.i;
        C5189f c5189f2 = this.f41764h;
        if (i == 0) {
            C5143c c5143c = c5144d.f41422I;
            C5143c c5143c2 = c5144d2.f41423K;
            C5189f i4 = AbstractC5199p.i(c5143c, 0);
            int e6 = c5143c.e();
            C5144d m8 = m();
            if (m8 != null) {
                e6 = m8.f41422I.e();
            }
            if (i4 != null) {
                AbstractC5199p.b(c5189f2, i4, e6);
            }
            C5189f i9 = AbstractC5199p.i(c5143c2, 0);
            int e9 = c5143c2.e();
            C5144d n9 = n();
            if (n9 != null) {
                e9 = n9.f41423K.e();
            }
            if (i9 != null) {
                AbstractC5199p.b(c5189f, i9, -e9);
            }
        } else {
            C5143c c5143c3 = c5144d.J;
            C5143c c5143c4 = c5144d2.f41424L;
            C5189f i10 = AbstractC5199p.i(c5143c3, 1);
            int e10 = c5143c3.e();
            C5144d m9 = m();
            if (m9 != null) {
                e10 = m9.J.e();
            }
            if (i10 != null) {
                AbstractC5199p.b(c5189f2, i10, e10);
            }
            C5189f i11 = AbstractC5199p.i(c5143c4, 1);
            int e11 = c5143c4.e();
            C5144d n10 = n();
            if (n10 != null) {
                e11 = n10.f41424L.e();
            }
            if (i11 != null) {
                AbstractC5199p.b(c5189f, i11, -e11);
            }
        }
        c5189f2.f41733a = this;
        c5189f.f41733a = this;
    }

    @Override // x.AbstractC5199p
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f41723k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC5199p) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // x.AbstractC5199p
    public final void f() {
        this.f41759c = null;
        Iterator it = this.f41723k.iterator();
        while (it.hasNext()) {
            ((AbstractC5199p) it.next()).f();
        }
    }

    @Override // x.AbstractC5199p
    public final long j() {
        ArrayList arrayList = this.f41723k;
        int size = arrayList.size();
        long j9 = 0;
        for (int i = 0; i < size; i++) {
            j9 = r5.i.f41738f + ((AbstractC5199p) arrayList.get(i)).j() + j9 + r5.f41764h.f41738f;
        }
        return j9;
    }

    @Override // x.AbstractC5199p
    public final boolean k() {
        ArrayList arrayList = this.f41723k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC5199p) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C5144d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f41723k;
            if (i >= arrayList.size()) {
                return null;
            }
            C5144d c5144d = ((AbstractC5199p) arrayList.get(i)).f41758b;
            if (c5144d.f41451g0 != 8) {
                return c5144d;
            }
            i++;
        }
    }

    public final C5144d n() {
        ArrayList arrayList = this.f41723k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5144d c5144d = ((AbstractC5199p) arrayList.get(size)).f41758b;
            if (c5144d.f41451g0 != 8) {
                return c5144d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f41762f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f41723k.iterator();
        while (it.hasNext()) {
            AbstractC5199p abstractC5199p = (AbstractC5199p) it.next();
            sb.append("<");
            sb.append(abstractC5199p);
            sb.append("> ");
        }
        return sb.toString();
    }
}
