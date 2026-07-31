package u;

import java.util.ArrayList;
import t.C3422d;
import t.C3423e;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3448c extends m {

    /* renamed from: k, reason: collision with root package name */
    ArrayList f46312k;

    /* renamed from: l, reason: collision with root package name */
    private int f46313l;

    public C3448c(C3423e c3423e, int i4) {
        super(c3423e);
        this.f46312k = new ArrayList();
        this.f46363f = i4;
        q();
    }

    private void q() {
        C3423e c3423e;
        C3423e c3423e2 = this.f46359b;
        C3423e F4 = c3423e2.F(this.f46363f);
        while (true) {
            C3423e c3423e3 = F4;
            c3423e = c3423e2;
            c3423e2 = c3423e3;
            if (c3423e2 == null) {
                break;
            } else {
                F4 = c3423e2.F(this.f46363f);
            }
        }
        this.f46359b = c3423e;
        this.f46312k.add(c3423e.H(this.f46363f));
        C3423e D4 = c3423e.D(this.f46363f);
        while (D4 != null) {
            this.f46312k.add(D4.H(this.f46363f));
            D4 = D4.D(this.f46363f);
        }
        ArrayList arrayList = this.f46312k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            m mVar = (m) obj;
            int i5 = this.f46363f;
            if (i5 == 0) {
                mVar.f46359b.f46114c = this;
            } else if (i5 == 1) {
                mVar.f46359b.f46116d = this;
            }
        }
        if (this.f46363f == 0 && ((t.f) this.f46359b.E()).W0() && this.f46312k.size() > 1) {
            ArrayList arrayList2 = this.f46312k;
            this.f46359b = ((m) arrayList2.get(arrayList2.size() - 1)).f46359b;
        }
        this.f46313l = this.f46363f == 0 ? this.f46359b.v() : this.f46359b.J();
    }

    private C3423e r() {
        for (int i4 = 0; i4 < this.f46312k.size(); i4++) {
            m mVar = (m) this.f46312k.get(i4);
            if (mVar.f46359b.M() != 8) {
                return mVar.f46359b;
            }
        }
        return null;
    }

    private C3423e s() {
        for (int size = this.f46312k.size() - 1; size >= 0; size--) {
            m mVar = (m) this.f46312k.get(size);
            if (mVar.f46359b.M() != 8) {
                return mVar.f46359b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b8, code lost:
    
        if (r2 != r7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e4, code lost:
    
        r12 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01e0, code lost:
    
        r12 = r25 + 1;
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01de, code lost:
    
        if (r2 != r7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0414, code lost:
    
        r1 = r1 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d6, code lost:
    
        if (r2.f46332j != false) goto L58;
     */
    @Override // u.m, u.InterfaceC3449d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(InterfaceC3449d interfaceC3449d) {
        int i4;
        int i5;
        boolean z4;
        float f4;
        float f5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f6;
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int max;
        boolean z5;
        if (this.f46365h.f46332j && this.f46366i.f46332j) {
            C3423e E4 = this.f46359b.E();
            boolean W02 = (E4 == null || !(E4 instanceof t.f)) ? false : ((t.f) E4).W0();
            int i15 = this.f46366i.f46329g - this.f46365h.f46329g;
            int size = this.f46312k.size();
            int i16 = 0;
            while (true) {
                i4 = -1;
                i5 = 8;
                if (i16 >= size) {
                    i16 = -1;
                    break;
                } else if (((m) this.f46312k.get(i16)).f46359b.M() != 8) {
                    break;
                } else {
                    i16++;
                }
            }
            int i17 = size - 1;
            int i18 = i17;
            while (true) {
                if (i18 < 0) {
                    break;
                }
                if (((m) this.f46312k.get(i18)).f46359b.M() != 8) {
                    i4 = i18;
                    break;
                }
                i18--;
            }
            int i19 = 0;
            while (i19 < 2) {
                int i20 = 0;
                i7 = 0;
                i8 = 0;
                int i21 = 0;
                f5 = 0.0f;
                while (i20 < size) {
                    m mVar = (m) this.f46312k.get(i20);
                    if (mVar.f46359b.M() == i5) {
                        z5 = W02;
                    } else {
                        i21++;
                        if (i20 > 0 && i20 >= i16) {
                            i7 += mVar.f46365h.f46328f;
                        }
                        C3452g c3452g = mVar.f46362e;
                        int i22 = c3452g.f46329g;
                        boolean z6 = mVar.f46361d != C3423e.b.MATCH_CONSTRAINT;
                        if (z6) {
                            int i23 = this.f46363f;
                            if (i23 == 0 && !mVar.f46359b.f46118e.f46362e.f46332j) {
                                return;
                            }
                            if (i23 == 1 && !mVar.f46359b.f46120f.f46362e.f46332j) {
                                return;
                            } else {
                                z5 = W02;
                            }
                        } else {
                            z5 = W02;
                            if (mVar.f46358a == 1 && i19 == 0) {
                                i22 = c3452g.f46344m;
                                i8++;
                            }
                            z6 = true;
                        }
                        if (z6) {
                            i7 += i22;
                        } else {
                            i8++;
                            float f8 = mVar.f46359b.f46143q0[this.f46363f];
                            if (f8 >= 0.0f) {
                                f5 += f8;
                            }
                        }
                        if (i20 < i17 && i20 < i4) {
                            i7 += -mVar.f46366i.f46328f;
                        }
                    }
                    i20++;
                    W02 = z5;
                    i5 = 8;
                }
                z4 = W02;
                f4 = 0.0f;
                if (i7 < i15 || i8 == 0) {
                    i6 = i21;
                    break;
                } else {
                    i19++;
                    W02 = z4;
                    i5 = 8;
                }
            }
            z4 = W02;
            f4 = 0.0f;
            f5 = 0.0f;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            int i24 = this.f46365h.f46329g;
            if (z4) {
                i24 = this.f46366i.f46329g;
            }
            float f9 = 0.5f;
            if (i7 > i15) {
                i24 = z4 ? i24 + ((int) (((i7 - i15) / 2.0f) + 0.5f)) : i24 - ((int) (((i7 - i15) / 2.0f) + 0.5f));
            }
            if (i8 > 0) {
                float f10 = i15 - i7;
                int i25 = (int) ((f10 / i8) + 0.5f);
                int i26 = 0;
                int i27 = 0;
                while (i26 < size) {
                    m mVar2 = (m) this.f46312k.get(i26);
                    float f11 = f9;
                    int i28 = i24;
                    if (mVar2.f46359b.M() != 8 && mVar2.f46361d == C3423e.b.MATCH_CONSTRAINT) {
                        C3452g c3452g2 = mVar2.f46362e;
                        if (!c3452g2.f46332j) {
                            int i29 = f5 > f4 ? (int) (((mVar2.f46359b.f46143q0[this.f46363f] * f10) / f5) + f11) : i25;
                            f7 = f10;
                            if (this.f46363f == 0) {
                                C3423e c3423e = mVar2.f46359b;
                                i12 = i25;
                                int i30 = c3423e.f46140p;
                                i13 = i26;
                                i14 = i27;
                                max = Math.max(c3423e.f46138o, mVar2.f46358a == 1 ? Math.min(i29, c3452g2.f46344m) : i29);
                                if (i30 > 0) {
                                    max = Math.min(i30, max);
                                }
                            } else {
                                i12 = i25;
                                i13 = i26;
                                i14 = i27;
                                C3423e c3423e2 = mVar2.f46359b;
                                int i31 = c3423e2.f46146s;
                                max = Math.max(c3423e2.f46144r, mVar2.f46358a == 1 ? Math.min(i29, c3452g2.f46344m) : i29);
                                if (i31 > 0) {
                                    max = Math.min(i31, max);
                                }
                            }
                            mVar2.f46362e.d(i29);
                            i26 = i13 + 1;
                            f9 = f11;
                            i24 = i28;
                            f10 = f7;
                            i25 = i12;
                        }
                    }
                    f7 = f10;
                    i12 = i25;
                    i13 = i26;
                    i27 = i27;
                    i26 = i13 + 1;
                    f9 = f11;
                    i24 = i28;
                    f10 = f7;
                    i25 = i12;
                }
                i9 = i24;
                f6 = f9;
                int i32 = i27;
                if (i32 > 0) {
                    i8 -= i32;
                    i7 = 0;
                    for (int i33 = 0; i33 < size; i33++) {
                        m mVar3 = (m) this.f46312k.get(i33);
                        if (mVar3.f46359b.M() != 8) {
                            if (i33 > 0 && i33 >= i16) {
                                i7 += mVar3.f46365h.f46328f;
                            }
                            i7 += mVar3.f46362e.f46329g;
                            if (i33 < i17 && i33 < i4) {
                                i7 += -mVar3.f46366i.f46328f;
                            }
                        }
                    }
                }
                i11 = 2;
                if (this.f46313l == 2 && i32 == 0) {
                    i10 = 0;
                    this.f46313l = 0;
                } else {
                    i10 = 0;
                }
            } else {
                i9 = i24;
                f6 = 0.5f;
                i10 = 0;
                i11 = 2;
            }
            if (i7 > i15) {
                this.f46313l = i11;
            }
            if (i6 > 0 && i8 == 0 && i16 == i4) {
                this.f46313l = i11;
            }
            int i34 = this.f46313l;
            if (i34 == 1) {
                int i35 = i6 > 1 ? (i15 - i7) / (i6 - 1) : i6 == 1 ? (i15 - i7) / 2 : i10;
                if (i8 > 0) {
                    i35 = i10;
                }
                int i36 = i9;
                while (i10 < size) {
                    m mVar4 = (m) this.f46312k.get(z4 ? size - (i10 + 1) : i10);
                    if (mVar4.f46359b.M() == 8) {
                        mVar4.f46365h.d(i36);
                        mVar4.f46366i.d(i36);
                    } else {
                        if (i10 > 0) {
                            i36 = z4 ? i36 - i35 : i36 + i35;
                        }
                        if (i10 > 0 && i10 >= i16) {
                            i36 = z4 ? i36 - mVar4.f46365h.f46328f : i36 + mVar4.f46365h.f46328f;
                        }
                        if (z4) {
                            mVar4.f46366i.d(i36);
                        } else {
                            mVar4.f46365h.d(i36);
                        }
                        C3452g c3452g3 = mVar4.f46362e;
                        int i37 = c3452g3.f46329g;
                        if (mVar4.f46361d == C3423e.b.MATCH_CONSTRAINT && mVar4.f46358a == 1) {
                            i37 = c3452g3.f46344m;
                        }
                        i36 = z4 ? i36 - i37 : i36 + i37;
                        if (z4) {
                            mVar4.f46365h.d(i36);
                        } else {
                            mVar4.f46366i.d(i36);
                        }
                        mVar4.f46364g = true;
                        if (i10 < i17 && i10 < i4) {
                            i36 = z4 ? i36 - (-mVar4.f46366i.f46328f) : i36 + (-mVar4.f46366i.f46328f);
                        }
                    }
                    i10++;
                }
                return;
            }
            if (i34 == 0) {
                int i38 = (i15 - i7) / (i6 + 1);
                if (i8 > 0) {
                    i38 = i10;
                }
                int i39 = i9;
                while (i10 < size) {
                    m mVar5 = (m) this.f46312k.get(z4 ? size - (i10 + 1) : i10);
                    if (mVar5.f46359b.M() == 8) {
                        mVar5.f46365h.d(i39);
                        mVar5.f46366i.d(i39);
                    } else {
                        int i40 = z4 ? i39 - i38 : i39 + i38;
                        if (i10 > 0 && i10 >= i16) {
                            i40 = z4 ? i40 - mVar5.f46365h.f46328f : i40 + mVar5.f46365h.f46328f;
                        }
                        if (z4) {
                            mVar5.f46366i.d(i40);
                        } else {
                            mVar5.f46365h.d(i40);
                        }
                        C3452g c3452g4 = mVar5.f46362e;
                        int i41 = c3452g4.f46329g;
                        if (mVar5.f46361d == C3423e.b.MATCH_CONSTRAINT && mVar5.f46358a == 1) {
                            i41 = Math.min(i41, c3452g4.f46344m);
                        }
                        i39 = z4 ? i40 - i41 : i40 + i41;
                        if (z4) {
                            mVar5.f46365h.d(i39);
                        } else {
                            mVar5.f46366i.d(i39);
                        }
                        if (i10 < i17 && i10 < i4) {
                            i39 = z4 ? i39 - (-mVar5.f46366i.f46328f) : i39 + (-mVar5.f46366i.f46328f);
                        }
                    }
                    i10++;
                }
                return;
            }
            if (i34 == 2) {
                float u4 = this.f46363f == 0 ? this.f46359b.u() : this.f46359b.I();
                if (z4) {
                    u4 = 1.0f - u4;
                }
                int i42 = (int) (((i15 - i7) * u4) + f6);
                if (i42 < 0 || i8 > 0) {
                    i42 = i10;
                }
                int i43 = z4 ? i9 - i42 : i9 + i42;
                while (i10 < size) {
                    m mVar6 = (m) this.f46312k.get(z4 ? size - (i10 + 1) : i10);
                    if (mVar6.f46359b.M() == 8) {
                        mVar6.f46365h.d(i43);
                        mVar6.f46366i.d(i43);
                    } else {
                        if (i10 > 0 && i10 >= i16) {
                            i43 = z4 ? i43 - mVar6.f46365h.f46328f : i43 + mVar6.f46365h.f46328f;
                        }
                        if (z4) {
                            mVar6.f46366i.d(i43);
                        } else {
                            mVar6.f46365h.d(i43);
                        }
                        C3452g c3452g5 = mVar6.f46362e;
                        int i44 = c3452g5.f46329g;
                        if (mVar6.f46361d == C3423e.b.MATCH_CONSTRAINT && mVar6.f46358a == 1) {
                            i44 = c3452g5.f46344m;
                        }
                        i43 += i44;
                        if (z4) {
                            mVar6.f46365h.d(i43);
                        } else {
                            mVar6.f46366i.d(i43);
                        }
                        if (i10 < i17 && i10 < i4) {
                            i43 = z4 ? i43 - (-mVar6.f46366i.f46328f) : i43 + (-mVar6.f46366i.f46328f);
                        }
                    }
                    i10++;
                }
            }
        }
    }

    @Override // u.m
    void d() {
        ArrayList arrayList = this.f46312k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((m) obj).d();
        }
        int size2 = this.f46312k.size();
        if (size2 < 1) {
            return;
        }
        C3423e c3423e = ((m) this.f46312k.get(0)).f46359b;
        C3423e c3423e2 = ((m) this.f46312k.get(size2 - 1)).f46359b;
        if (this.f46363f == 0) {
            C3422d c3422d = c3423e.f46085B;
            C3422d c3422d2 = c3423e2.f46087D;
            C3451f i5 = i(c3422d, 0);
            int b4 = c3422d.b();
            C3423e r4 = r();
            if (r4 != null) {
                b4 = r4.f46085B.b();
            }
            if (i5 != null) {
                b(this.f46365h, i5, b4);
            }
            C3451f i6 = i(c3422d2, 0);
            int b5 = c3422d2.b();
            C3423e s4 = s();
            if (s4 != null) {
                b5 = s4.f46087D.b();
            }
            if (i6 != null) {
                b(this.f46366i, i6, -b5);
            }
        } else {
            C3422d c3422d3 = c3423e.f46086C;
            C3422d c3422d4 = c3423e2.f46088E;
            C3451f i7 = i(c3422d3, 1);
            int b6 = c3422d3.b();
            C3423e r5 = r();
            if (r5 != null) {
                b6 = r5.f46086C.b();
            }
            if (i7 != null) {
                b(this.f46365h, i7, b6);
            }
            C3451f i8 = i(c3422d4, 1);
            int b7 = c3422d4.b();
            C3423e s5 = s();
            if (s5 != null) {
                b7 = s5.f46088E.b();
            }
            if (i8 != null) {
                b(this.f46366i, i8, -b7);
            }
        }
        this.f46365h.f46323a = this;
        this.f46366i.f46323a = this;
    }

    @Override // u.m
    public void e() {
        for (int i4 = 0; i4 < this.f46312k.size(); i4++) {
            ((m) this.f46312k.get(i4)).e();
        }
    }

    @Override // u.m
    void f() {
        this.f46360c = null;
        ArrayList arrayList = this.f46312k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((m) obj).f();
        }
    }

    @Override // u.m
    public long j() {
        int size = this.f46312k.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            j4 = j4 + r4.f46365h.f46328f + ((m) this.f46312k.get(i4)).j() + r4.f46366i.f46328f;
        }
        return j4;
    }

    @Override // u.m
    boolean m() {
        int size = this.f46312k.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!((m) this.f46312k.get(i4)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f46363f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        ArrayList arrayList = this.f46312k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            sb2 = ((sb2 + "<") + ((m) obj)) + "> ";
        }
        return sb2;
    }
}
