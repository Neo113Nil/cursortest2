package s;

import K.C0011l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import q.C0271c;
import q.C0274f;
import t.AbstractC0291h;
import t.AbstractC0298o;
import t.C0285b;
import t.C0286c;
import t.C0288e;
import t.C0297n;
import v.C0311f;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282e extends C0281d {

    /* renamed from: A0, reason: collision with root package name */
    public int f3665A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0279b[] f3666B0;
    public C0279b[] C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3667D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f3668E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f3669F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f3670G0;
    public WeakReference H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f3671I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f3672J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f3673K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C0285b f3674L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f3675q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final C0011l f3676r0 = new C0011l(this);

    /* renamed from: s0, reason: collision with root package name */
    public final C0288e f3677s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3678t0;

    /* renamed from: u0, reason: collision with root package name */
    public C0311f f3679u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3680v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C0271c f3681w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3682x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f3683y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3684z0;

    public C0282e() {
        C0288e c0288e = new C0288e();
        c0288e.f3789b = true;
        c0288e.f3790c = true;
        c0288e.f3791e = new ArrayList();
        new ArrayList();
        c0288e.f3792f = null;
        c0288e.f3793g = new C0285b();
        c0288e.h = new ArrayList();
        c0288e.f3788a = this;
        c0288e.d = this;
        this.f3677s0 = c0288e;
        this.f3679u0 = null;
        this.f3680v0 = false;
        this.f3681w0 = new C0271c();
        this.f3684z0 = 0;
        this.f3665A0 = 0;
        this.f3666B0 = new C0279b[4];
        this.C0 = new C0279b[4];
        this.f3667D0 = 257;
        this.f3668E0 = false;
        this.f3669F0 = false;
        this.f3670G0 = null;
        this.H0 = null;
        this.f3671I0 = null;
        this.f3672J0 = null;
        this.f3673K0 = new HashSet();
        this.f3674L0 = new C0285b();
    }

    public static void V(C0281d c0281d, C0311f c0311f, C0285b c0285b) {
        int i;
        int i2;
        if (c0311f == null) {
            return;
        }
        if (c0281d.f3640g0 == 8 || (c0281d instanceof h) || (c0281d instanceof C0278a)) {
            c0285b.f3782e = 0;
            c0285b.f3783f = 0;
            return;
        }
        int[] iArr = c0281d.f3654p0;
        c0285b.f3779a = iArr[0];
        c0285b.f3780b = iArr[1];
        c0285b.f3781c = c0281d.q();
        c0285b.d = c0281d.k();
        c0285b.i = false;
        c0285b.f3785j = 0;
        boolean z2 = c0285b.f3779a == 3;
        boolean z3 = c0285b.f3780b == 3;
        boolean z4 = z2 && c0281d.f3624W > 0.0f;
        boolean z5 = z3 && c0281d.f3624W > 0.0f;
        if (z2 && c0281d.t(0) && c0281d.f3656r == 0 && !z4) {
            c0285b.f3779a = 2;
            if (z3 && c0281d.f3657s == 0) {
                c0285b.f3779a = 1;
            }
            z2 = false;
        }
        if (z3 && c0281d.t(1) && c0281d.f3657s == 0 && !z5) {
            c0285b.f3780b = 2;
            if (z2 && c0281d.f3656r == 0) {
                c0285b.f3780b = 1;
            }
            z3 = false;
        }
        if (c0281d.A()) {
            c0285b.f3779a = 1;
            z2 = false;
        }
        if (c0281d.B()) {
            c0285b.f3780b = 1;
            z3 = false;
        }
        int[] iArr2 = c0281d.f3658t;
        if (z4) {
            if (iArr2[0] == 4) {
                c0285b.f3779a = 1;
            } else if (!z3) {
                if (c0285b.f3780b == 1) {
                    i2 = c0285b.d;
                } else {
                    c0285b.f3779a = 2;
                    c0311f.b(c0281d, c0285b);
                    i2 = c0285b.f3783f;
                }
                c0285b.f3779a = 1;
                c0285b.f3781c = (int) (c0281d.f3624W * i2);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c0285b.f3780b = 1;
            } else if (!z2) {
                if (c0285b.f3779a == 1) {
                    i = c0285b.f3781c;
                } else {
                    c0285b.f3780b = 2;
                    c0311f.b(c0281d, c0285b);
                    i = c0285b.f3782e;
                }
                c0285b.f3780b = 1;
                if (c0281d.f3625X == -1) {
                    c0285b.d = (int) (i / c0281d.f3624W);
                } else {
                    c0285b.d = (int) (c0281d.f3624W * i);
                }
            }
        }
        c0311f.b(c0281d, c0285b);
        c0281d.O(c0285b.f3782e);
        c0281d.L(c0285b.f3783f);
        c0281d.f3607E = c0285b.h;
        c0281d.I(c0285b.f3784g);
        c0285b.f3785j = 0;
    }

    @Override // s.C0281d
    public final void C() {
        this.f3681w0.t();
        this.f3682x0 = 0;
        this.f3683y0 = 0;
        this.f3675q0.clear();
        super.C();
    }

    @Override // s.C0281d
    public final void F(C0011l c0011l) {
        super.F(c0011l);
        int size = this.f3675q0.size();
        for (int i = 0; i < size; i++) {
            ((C0281d) this.f3675q0.get(i)).F(c0011l);
        }
    }

    @Override // s.C0281d
    public final void P(boolean z2, boolean z3) {
        super.P(z2, z3);
        int size = this.f3675q0.size();
        for (int i = 0; i < size; i++) {
            ((C0281d) this.f3675q0.get(i)).P(z2, z3);
        }
    }

    public final void R(C0281d c0281d, int i) {
        if (i == 0) {
            int i2 = this.f3684z0 + 1;
            C0279b[] c0279bArr = this.C0;
            if (i2 >= c0279bArr.length) {
                this.C0 = (C0279b[]) Arrays.copyOf(c0279bArr, c0279bArr.length * 2);
            }
            C0279b[] c0279bArr2 = this.C0;
            int i3 = this.f3684z0;
            c0279bArr2[i3] = new C0279b(c0281d, 0, this.f3680v0);
            this.f3684z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f3665A0 + 1;
            C0279b[] c0279bArr3 = this.f3666B0;
            if (i4 >= c0279bArr3.length) {
                this.f3666B0 = (C0279b[]) Arrays.copyOf(c0279bArr3, c0279bArr3.length * 2);
            }
            C0279b[] c0279bArr4 = this.f3666B0;
            int i5 = this.f3665A0;
            c0279bArr4[i5] = new C0279b(c0281d, 1, this.f3680v0);
            this.f3665A0 = i5 + 1;
        }
    }

    public final void S(C0271c c0271c) {
        boolean W2 = W(64);
        b(c0271c, W2);
        int size = this.f3675q0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            C0281d c0281d = (C0281d) this.f3675q0.get(i);
            boolean[] zArr = c0281d.f3620S;
            zArr[0] = false;
            zArr[1] = false;
            if (c0281d instanceof C0278a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                C0281d c0281d2 = (C0281d) this.f3675q0.get(i2);
                if (c0281d2 instanceof C0278a) {
                    C0278a c0278a = (C0278a) c0281d2;
                    for (int i3 = 0; i3 < c0278a.f3739r0; i3++) {
                        C0281d c0281d3 = c0278a.f3738q0[i3];
                        if (c0278a.f3580t0 || c0281d3.c()) {
                            int i4 = c0278a.f3579s0;
                            if (i4 == 0 || i4 == 1) {
                                c0281d3.f3620S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c0281d3.f3620S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f3673K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C0281d c0281d4 = (C0281d) this.f3675q0.get(i5);
            c0281d4.getClass();
            boolean z3 = c0281d4 instanceof g;
            if (z3 || (c0281d4 instanceof h)) {
                if (z3) {
                    hashSet.add(c0281d4);
                } else {
                    c0281d4.b(c0271c, W2);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((C0281d) it.next());
                for (int i6 = 0; i6 < gVar.f3739r0; i6++) {
                    if (hashSet.contains(gVar.f3738q0[i6])) {
                        gVar.b(c0271c, W2);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C0281d) it2.next()).b(c0271c, W2);
                }
                hashSet.clear();
            }
        }
        if (C0271c.f3449p) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C0281d c0281d5 = (C0281d) this.f3675q0.get(i7);
                c0281d5.getClass();
                if (!(c0281d5 instanceof g) && !(c0281d5 instanceof h)) {
                    hashSet2.add(c0281d5);
                }
            }
            a(this, c0271c, hashSet2, this.f3654p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C0281d c0281d6 = (C0281d) it3.next();
                j.b(this, c0271c, c0281d6);
                c0281d6.b(c0271c, W2);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C0281d c0281d7 = (C0281d) this.f3675q0.get(i8);
                if (c0281d7 instanceof C0282e) {
                    int[] iArr = c0281d7.f3654p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c0281d7.M(1);
                    }
                    if (i10 == 2) {
                        c0281d7.N(1);
                    }
                    c0281d7.b(c0271c, W2);
                    if (i9 == 2) {
                        c0281d7.M(i9);
                    }
                    if (i10 == 2) {
                        c0281d7.N(i10);
                    }
                } else {
                    j.b(this, c0271c, c0281d7);
                    if (!(c0281d7 instanceof g) && !(c0281d7 instanceof h)) {
                        c0281d7.b(c0271c, W2);
                    }
                }
            }
        }
        if (this.f3684z0 > 0) {
            j.a(this, c0271c, null, 0);
        }
        if (this.f3665A0 > 0) {
            j.a(this, c0271c, null, 1);
        }
    }

    public final boolean T(int i, boolean z2) {
        boolean z3;
        C0288e c0288e = this.f3677s0;
        C0282e c0282e = c0288e.f3788a;
        boolean z4 = false;
        int j2 = c0282e.j(0);
        int j3 = c0282e.j(1);
        int r2 = c0282e.r();
        int s2 = c0282e.s();
        ArrayList arrayList = c0288e.f3791e;
        if (z2 && (j2 == 2 || j3 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC0298o abstractC0298o = (AbstractC0298o) it.next();
                if (abstractC0298o.f3819f == i && !abstractC0298o.k()) {
                    z2 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z2 && j2 == 2) {
                    c0282e.M(1);
                    c0282e.O(c0288e.d(c0282e, 0));
                    c0282e.d.f3818e.d(c0282e.q());
                }
            } else if (z2 && j3 == 2) {
                c0282e.N(1);
                c0282e.L(c0288e.d(c0282e, 1));
                c0282e.f3635e.f3818e.d(c0282e.k());
            }
        }
        int[] iArr = c0282e.f3654p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int q2 = c0282e.q() + r2;
                c0282e.d.i.d(q2);
                c0282e.d.f3818e.d(q2 - r2);
                z3 = true;
            }
            z3 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int k2 = c0282e.k() + s2;
                c0282e.f3635e.i.d(k2);
                c0282e.f3635e.f3818e.d(k2 - s2);
                z3 = true;
            }
            z3 = false;
        }
        c0288e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC0298o abstractC0298o2 = (AbstractC0298o) it2.next();
            if (abstractC0298o2.f3819f == i && (abstractC0298o2.f3816b != c0282e || abstractC0298o2.f3820g)) {
                abstractC0298o2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC0298o abstractC0298o3 = (AbstractC0298o) it3.next();
            if (abstractC0298o3.f3819f == i && (z3 || abstractC0298o3.f3816b != c0282e)) {
                if (!abstractC0298o3.h.f3800j) {
                    break;
                }
                if (!abstractC0298o3.i.f3800j) {
                    break;
                }
                if (!(abstractC0298o3 instanceof C0286c) && !abstractC0298o3.f3818e.f3800j) {
                    break;
                }
            }
        }
        c0282e.M(j2);
        c0282e.N(j3);
        return z4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:227|228|229|(1:231)|232|233|(2:234|235)|(3:353|354|(28:356|357|358|359|360|361|362|238|239|(1:243)|244|(6:248|249|250|251|252|253)|325|(1:350)(9:329|330|331|332|333|334|335|336|337)|338|339|260|(4:262|(3:264|(2:270|271)(1:268)|269)|272|273)(4:320|(1:322)|323|324)|274|(6:279|(1:281)|282|283|(1:287)|(1:291))|292|(1:294)(1:319)|295|(1:297)(1:318)|(1:317)(4:299|(1:304)|305|(3:310|(2:312|313)(1:315)|314))|316|(0)(0)|314))|237|238|239|(2:241|243)|244|(7:246|248|249|250|251|252|253)|325|(1:327)|350|338|339|260|(0)(0)|274|(7:277|279|(0)|282|283|(2:285|287)|(2:289|291))|292|(0)(0)|295|(0)(0)|(0)(0)|316|(0)(0)|314) */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0797, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0818 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0824 A[LOOP:14: B:280:0x0822->B:281:0x0824, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0609 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0633  */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        int i;
        Object[] objArr;
        C0280c c0280c;
        int i2;
        int i3;
        C0280c c0280c2;
        int i4;
        int i5;
        C0271c c0271c;
        int i6;
        boolean z2;
        char c2;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int max;
        ?? r6;
        boolean z7;
        int max2;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        int max3;
        int max4;
        WeakReference weakReference;
        C0274f k2;
        C0271c c0271c2;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C0271c c0271c3;
        C0280c c0280c3;
        int i11;
        int i12;
        int i13;
        char c3;
        C0297n c0297n;
        C0297n c0297n2;
        int i14;
        int i15;
        int i16;
        int i17;
        int b2;
        C0297n c0297n3;
        C0297n c0297n4;
        int[] iArr;
        this.f3626Y = 0;
        this.f3627Z = 0;
        this.f3668E0 = false;
        this.f3669F0 = false;
        int size = this.f3675q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr2 = this.f3654p0;
        int i18 = iArr2[1];
        int i19 = iArr2[0];
        int i20 = this.f3678t0;
        C0280c c0280c4 = this.f3611J;
        C0280c c0280c5 = this.f3610I;
        if (i20 == 0 && j.c(this.f3667D0, 1)) {
            C0311f c0311f = this.f3679u0;
            int i21 = iArr2[0];
            int i22 = iArr2[1];
            E();
            ArrayList arrayList = this.f3675q0;
            int size2 = arrayList.size();
            for (int i23 = 0; i23 < size2; i23++) {
                ((C0281d) arrayList.get(i23)).E();
            }
            boolean z10 = this.f3680v0;
            if (i21 == 1) {
                J(0, q());
            } else {
                c0280c5.l(0);
                this.f3626Y = 0;
            }
            int i24 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i24 < size2) {
                C0280c c0280c6 = c0280c5;
                C0281d c0281d = (C0281d) arrayList.get(i24);
                int i25 = max6;
                if (c0281d instanceof h) {
                    h hVar = (h) c0281d;
                    iArr = iArr2;
                    if (hVar.f3736u0 == 1) {
                        int i26 = hVar.f3733r0;
                        if (i26 != -1) {
                            hVar.R(i26);
                        } else if (hVar.f3734s0 != -1 && A()) {
                            hVar.R(q() - hVar.f3734s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f3732q0 * q()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((c0281d instanceof C0278a) && ((C0278a) c0281d).U() == 0) {
                        z12 = true;
                    }
                }
                i24++;
                max6 = i25;
                c0280c5 = c0280c6;
                iArr2 = iArr;
            }
            i = max6;
            objArr = iArr2;
            c0280c = c0280c5;
            if (z11) {
                for (int i27 = 0; i27 < size2; i27++) {
                    C0281d c0281d2 = (C0281d) arrayList.get(i27);
                    if (c0281d2 instanceof h) {
                        h hVar2 = (h) c0281d2;
                        if (hVar2.f3736u0 == 1) {
                            AbstractC0291h.c(0, hVar2, c0311f, z10);
                        }
                    }
                }
            }
            AbstractC0291h.c(0, this, c0311f, z10);
            if (z12) {
                for (int i28 = 0; i28 < size2; i28++) {
                    C0281d c0281d3 = (C0281d) arrayList.get(i28);
                    if (c0281d3 instanceof C0278a) {
                        C0278a c0278a = (C0278a) c0281d3;
                        if (c0278a.U() == 0 && c0278a.T()) {
                            AbstractC0291h.c(1, c0278a, c0311f, z10);
                        }
                    }
                }
            }
            if (i22 == 1) {
                K(0, k());
            } else {
                c0280c4.l(0);
                this.f3627Z = 0;
            }
            boolean z13 = false;
            boolean z14 = false;
            for (int i29 = 0; i29 < size2; i29++) {
                C0281d c0281d4 = (C0281d) arrayList.get(i29);
                if (c0281d4 instanceof h) {
                    h hVar3 = (h) c0281d4;
                    if (hVar3.f3736u0 == 0) {
                        int i30 = hVar3.f3733r0;
                        if (i30 != -1) {
                            hVar3.R(i30);
                        } else if (hVar3.f3734s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f3734s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f3732q0 * k()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else if ((c0281d4 instanceof C0278a) && ((C0278a) c0281d4).U() == 1) {
                    z14 = true;
                }
            }
            if (z13) {
                for (int i31 = 0; i31 < size2; i31++) {
                    C0281d c0281d5 = (C0281d) arrayList.get(i31);
                    if (c0281d5 instanceof h) {
                        h hVar4 = (h) c0281d5;
                        if (hVar4.f3736u0 == 0) {
                            AbstractC0291h.i(1, hVar4, c0311f);
                        }
                    }
                }
            }
            AbstractC0291h.i(0, this, c0311f);
            if (z14) {
                for (int i32 = 0; i32 < size2; i32++) {
                    C0281d c0281d6 = (C0281d) arrayList.get(i32);
                    if (c0281d6 instanceof C0278a) {
                        C0278a c0278a2 = (C0278a) c0281d6;
                        if (c0278a2.U() == 1 && c0278a2.T()) {
                            AbstractC0291h.i(1, c0278a2, c0311f);
                        }
                    }
                }
            }
            for (int i33 = 0; i33 < size2; i33++) {
                C0281d c0281d7 = (C0281d) arrayList.get(i33);
                if (c0281d7.z() && AbstractC0291h.a(c0281d7)) {
                    V(c0281d7, c0311f, AbstractC0291h.f3804a);
                    if (!(c0281d7 instanceof h)) {
                        AbstractC0291h.c(0, c0281d7, c0311f, z10);
                        AbstractC0291h.i(0, c0281d7, c0311f);
                    } else if (((h) c0281d7).f3736u0 == 0) {
                        AbstractC0291h.i(0, c0281d7, c0311f);
                    } else {
                        AbstractC0291h.c(0, c0281d7, c0311f, z10);
                    }
                }
            }
            for (int i34 = 0; i34 < size; i34++) {
                C0281d c0281d8 = (C0281d) this.f3675q0.get(i34);
                if (c0281d8.z() && !(c0281d8 instanceof h) && !(c0281d8 instanceof C0278a) && !(c0281d8 instanceof g) && !c0281d8.F) {
                    int j2 = c0281d8.j(0);
                    int j3 = c0281d8.j(1);
                    if (j2 != 3 || c0281d8.f3656r == 1 || j3 != 3 || c0281d8.f3657s == 1) {
                        V(c0281d8, this.f3679u0, new C0285b());
                    }
                }
            }
        } else {
            i = max6;
            objArr = iArr2;
            c0280c = c0280c5;
        }
        C0271c c0271c4 = this.f3681w0;
        if (size <= 2 || !((i19 == 2 || i18 == 2) && j.c(this.f3667D0, 1024))) {
            i2 = size;
            i3 = i18;
            c0280c2 = c0280c4;
            i4 = i;
            i5 = max5;
            c0271c = c0271c4;
            i6 = i19;
        } else {
            C0311f c0311f2 = this.f3679u0;
            ArrayList arrayList2 = this.f3675q0;
            int size3 = arrayList2.size();
            int i35 = 0;
            while (i35 < size3) {
                C0281d c0281d9 = (C0281d) arrayList2.get(i35);
                char c4 = objArr[0];
                char c5 = objArr[1];
                int[] iArr3 = c0281d9.f3654p0;
                c0280c2 = c0280c4;
                if (!AbstractC0291h.h(c4, c5, iArr3[0], iArr3[1]) || (c0281d9 instanceof g)) {
                    i11 = max5;
                    i2 = size;
                    i12 = i18;
                    i13 = i19;
                    c0271c = c0271c4;
                    break;
                }
                i35++;
                c0280c4 = c0280c2;
            }
            c0280c2 = c0280c4;
            int i36 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i36 < size3) {
                int i37 = size;
                C0281d c0281d10 = (C0281d) arrayList2.get(i36);
                int i38 = i18;
                char c6 = objArr[0];
                int i39 = max5;
                char c7 = objArr[1];
                int i40 = i19;
                int[] iArr4 = c0281d10.f3654p0;
                C0271c c0271c5 = c0271c4;
                if (!AbstractC0291h.h(c6, c7, iArr4[0], iArr4[1])) {
                    V(c0281d10, c0311f2, this.f3674L0);
                }
                boolean z15 = c0281d10 instanceof h;
                if (z15) {
                    h hVar5 = (h) c0281d10;
                    if (hVar5.f3736u0 == 0) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(hVar5);
                    }
                    if (hVar5.f3736u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(hVar5);
                    }
                }
                if (c0281d10 instanceof i) {
                    if (c0281d10 instanceof C0278a) {
                        C0278a c0278a3 = (C0278a) c0281d10;
                        if (c0278a3.U() == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c0278a3);
                        }
                        if (c0278a3.U() == 1) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(c0278a3);
                        }
                    } else {
                        i iVar = (i) c0281d10;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(iVar);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(iVar);
                    }
                }
                if (c0281d10.f3610I.f3601f == null && c0281d10.f3612K.f3601f == null && !z15 && !(c0281d10 instanceof C0278a)) {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    arrayList7.add(c0281d10);
                }
                if (c0281d10.f3611J.f3601f == null && c0281d10.f3613L.f3601f == null && c0281d10.f3614M.f3601f == null && !z15 && !(c0281d10 instanceof C0278a)) {
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                    }
                    arrayList8.add(c0281d10);
                }
                i36++;
                i18 = i38;
                size = i37;
                max5 = i39;
                i19 = i40;
                c0271c4 = c0271c5;
            }
            i11 = max5;
            C0271c c0271c6 = c0271c4;
            i2 = size;
            i12 = i18;
            i13 = i19;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    AbstractC0291h.b((h) it.next(), 0, arrayList9, null);
                }
            }
            int i41 = 0;
            C0297n c0297n5 = null;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    i iVar2 = (i) it2.next();
                    C0297n b3 = AbstractC0291h.b(iVar2, i41, arrayList9, c0297n5);
                    iVar2.R(i41, arrayList9, b3);
                    b3.a(arrayList9);
                    i41 = 0;
                    c0297n5 = null;
                }
            }
            HashSet hashSet = i(2).f3597a;
            if (hashSet != null) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    AbstractC0291h.b(((C0280c) it3.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).f3597a;
            if (hashSet2 != null) {
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    AbstractC0291h.b(((C0280c) it4.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).f3597a;
            if (hashSet3 != null) {
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    AbstractC0291h.b(((C0280c) it5.next()).d, 0, arrayList9, null);
                }
            }
            C0297n c0297n6 = null;
            if (arrayList7 != null) {
                Iterator it6 = arrayList7.iterator();
                while (it6.hasNext()) {
                    AbstractC0291h.b((C0281d) it6.next(), 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    AbstractC0291h.b((h) it7.next(), 1, arrayList9, null);
                }
            }
            int i42 = 1;
            if (arrayList6 != null) {
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    i iVar3 = (i) it8.next();
                    C0297n b4 = AbstractC0291h.b(iVar3, i42, arrayList9, c0297n6);
                    iVar3.R(i42, arrayList9, b4);
                    b4.a(arrayList9);
                    i42 = 1;
                    c0297n6 = null;
                }
            }
            HashSet hashSet4 = i(3).f3597a;
            if (hashSet4 != null) {
                Iterator it9 = hashSet4.iterator();
                while (it9.hasNext()) {
                    AbstractC0291h.b(((C0280c) it9.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).f3597a;
            if (hashSet5 != null) {
                Iterator it10 = hashSet5.iterator();
                while (it10.hasNext()) {
                    AbstractC0291h.b(((C0280c) it10.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).f3597a;
            if (hashSet6 != null) {
                Iterator it11 = hashSet6.iterator();
                while (it11.hasNext()) {
                    AbstractC0291h.b(((C0280c) it11.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).f3597a;
            if (hashSet7 != null) {
                Iterator it12 = hashSet7.iterator();
                while (it12.hasNext()) {
                    AbstractC0291h.b(((C0280c) it12.next()).d, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                Iterator it13 = arrayList8.iterator();
                while (it13.hasNext()) {
                    AbstractC0291h.b((C0281d) it13.next(), 1, arrayList9, null);
                }
            }
            for (int i43 = 0; i43 < size3; i43++) {
                C0281d c0281d11 = (C0281d) arrayList2.get(i43);
                int[] iArr5 = c0281d11.f3654p0;
                if (iArr5[0] == 3 && iArr5[1] == 3) {
                    int i44 = c0281d11.n0;
                    int size4 = arrayList9.size();
                    int i45 = 0;
                    while (true) {
                        if (i45 >= size4) {
                            c0297n3 = null;
                            break;
                        }
                        c0297n3 = (C0297n) arrayList9.get(i45);
                        if (i44 == c0297n3.f3812b) {
                            break;
                        } else {
                            i45++;
                        }
                    }
                    int i46 = c0281d11.f3652o0;
                    int size5 = arrayList9.size();
                    int i47 = 0;
                    while (true) {
                        if (i47 >= size5) {
                            c0297n4 = null;
                            break;
                        }
                        c0297n4 = (C0297n) arrayList9.get(i47);
                        if (i46 == c0297n4.f3812b) {
                            break;
                        } else {
                            i47++;
                        }
                    }
                    if (c0297n3 != null && c0297n4 != null) {
                        c0297n3.c(0, c0297n4);
                        c0297n4.f3813c = 2;
                        arrayList9.remove(c0297n3);
                    }
                }
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    Iterator it14 = arrayList9.iterator();
                    int i48 = 0;
                    c0297n = null;
                    while (it14.hasNext()) {
                        C0297n c0297n7 = (C0297n) it14.next();
                        if (c0297n7.f3813c != 1) {
                            C0271c c0271c7 = c0271c6;
                            int b5 = c0297n7.b(c0271c7, 0);
                            if (b5 > i48) {
                                c0297n = c0297n7;
                                i48 = b5;
                            }
                            c0271c6 = c0271c7;
                        }
                    }
                    c0271c = c0271c6;
                    c3 = 1;
                    if (c0297n != null) {
                        M(1);
                        O(i48);
                        if (objArr[c3] == 2) {
                            Iterator it15 = arrayList9.iterator();
                            int i49 = 0;
                            c0297n2 = null;
                            while (it15.hasNext()) {
                                C0297n c0297n8 = (C0297n) it15.next();
                                if (c0297n8.f3813c != 0 && (b2 = c0297n8.b(c0271c, 1)) > i49) {
                                    c0297n2 = c0297n8;
                                    i49 = b2;
                                }
                            }
                            if (c0297n2 != null) {
                                N(1);
                                L(i49);
                                if (c0297n == null || c0297n2 != null) {
                                    i6 = i13;
                                    if (i6 == 2) {
                                        i14 = i11;
                                        if (i14 >= q() || i14 <= 0) {
                                            i15 = q();
                                            i3 = i12;
                                            if (i3 != 2) {
                                                i16 = i;
                                                if (i16 >= k() || i16 <= 0) {
                                                    i17 = k();
                                                    i4 = i17;
                                                    i5 = i15;
                                                    z2 = true;
                                                    boolean z16 = !W(64) || W(128);
                                                    c0271c.getClass();
                                                    c0271c.f3456g = false;
                                                    if (this.f3667D0 == 0 && z16) {
                                                        c2 = 1;
                                                        c0271c.f3456g = true;
                                                    } else {
                                                        c2 = 1;
                                                    }
                                                    ArrayList arrayList10 = this.f3675q0;
                                                    boolean z17 = objArr[0] != 2 || objArr[c2] == 2;
                                                    this.f3684z0 = 0;
                                                    this.f3665A0 = 0;
                                                    i7 = i2;
                                                    for (i8 = 0; i8 < i7; i8++) {
                                                        C0281d c0281d12 = (C0281d) this.f3675q0.get(i8);
                                                        if (c0281d12 instanceof C0282e) {
                                                            ((C0282e) c0281d12).U();
                                                        }
                                                    }
                                                    boolean W2 = W(64);
                                                    boolean z18 = z2;
                                                    int i50 = 0;
                                                    z3 = true;
                                                    while (z3) {
                                                        int i51 = i50 + 1;
                                                        try {
                                                            c0271c.t();
                                                            this.f3684z0 = 0;
                                                            this.f3665A0 = 0;
                                                            g(c0271c);
                                                            for (int i52 = 0; i52 < i7; i52++) {
                                                                ((C0281d) this.f3675q0.get(i52)).g(c0271c);
                                                            }
                                                            S(c0271c);
                                                            try {
                                                                weakReference = this.f3670G0;
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                z5 = z18;
                                                            }
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            z5 = z18;
                                                        }
                                                        if (weakReference != null) {
                                                            try {
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                z5 = z18;
                                                            }
                                                            if (weakReference.get() != null) {
                                                                C0280c c0280c7 = (C0280c) this.f3670G0.get();
                                                                C0280c c0280c8 = c0280c2;
                                                                try {
                                                                    k2 = c0271c.k(c0280c8);
                                                                    c0271c2 = this.f3681w0;
                                                                    z5 = z18;
                                                                    c0280c2 = c0280c8;
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    z5 = z18;
                                                                    c0280c2 = c0280c8;
                                                                }
                                                                try {
                                                                    c0271c2.f(c0271c2.k(c0280c7), k2, 0, 5);
                                                                    this.f3670G0 = null;
                                                                    weakReference2 = this.f3671I0;
                                                                    if (weakReference2 != null && weakReference2.get() != null) {
                                                                        C0280c c0280c9 = (C0280c) this.f3671I0.get();
                                                                        C0274f k3 = c0271c.k(this.f3613L);
                                                                        C0271c c0271c8 = this.f3681w0;
                                                                        c0271c8.f(k3, c0271c8.k(c0280c9), 0, 5);
                                                                        this.f3671I0 = null;
                                                                    }
                                                                    weakReference3 = this.H0;
                                                                    if (weakReference3 != null && weakReference3.get() != null) {
                                                                        C0280c c0280c10 = (C0280c) this.H0.get();
                                                                        c0280c3 = c0280c;
                                                                        try {
                                                                            C0274f k4 = c0271c.k(c0280c3);
                                                                            C0271c c0271c9 = this.f3681w0;
                                                                            c0280c = c0280c3;
                                                                            c0271c9.f(c0271c9.k(c0280c10), k4, 0, 5);
                                                                            this.H0 = null;
                                                                        } catch (Exception e6) {
                                                                            e = e6;
                                                                            c0280c = c0280c3;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr = j.f3740a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f3631b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f3633c0, k());
                                                                            if (max2 > k()) {
                                                                            }
                                                                            if (!z8) {
                                                                            }
                                                                            z18 = z8;
                                                                            z9 = z6;
                                                                            i9 = 8;
                                                                            if (i51 <= i9) {
                                                                            }
                                                                            z3 = z9;
                                                                            i50 = i51;
                                                                        }
                                                                    }
                                                                    weakReference4 = this.f3672J0;
                                                                    if (weakReference4 == null && weakReference4.get() != null) {
                                                                        C0280c c0280c11 = (C0280c) this.f3672J0.get();
                                                                        C0274f k5 = c0271c.k(this.f3612K);
                                                                        try {
                                                                            c0271c3 = this.f3681w0;
                                                                        } catch (Exception e7) {
                                                                            e = e7;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr2 = j.f3740a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f3631b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f3633c0, k());
                                                                            if (max2 > k()) {
                                                                            }
                                                                            if (!z8) {
                                                                            }
                                                                            z18 = z8;
                                                                            z9 = z6;
                                                                            i9 = 8;
                                                                            if (i51 <= i9) {
                                                                            }
                                                                            z3 = z9;
                                                                            i50 = i51;
                                                                        }
                                                                        try {
                                                                            c0271c3.f(k5, c0271c3.k(c0280c11), 0, 5);
                                                                            try {
                                                                                this.f3672J0 = null;
                                                                            } catch (Exception e8) {
                                                                                e = e8;
                                                                                z3 = true;
                                                                                e.printStackTrace();
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr22 = j.f3740a;
                                                                                if (z3) {
                                                                                }
                                                                                if (z17) {
                                                                                }
                                                                                max = Math.max(this.f3631b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f3633c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z8) {
                                                                                }
                                                                                z18 = z8;
                                                                                z9 = z6;
                                                                                i9 = 8;
                                                                                if (i51 <= i9) {
                                                                                }
                                                                                z3 = z9;
                                                                                i50 = i51;
                                                                            }
                                                                        } catch (Exception e9) {
                                                                            e = e9;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr222 = j.f3740a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f3631b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f3633c0, k());
                                                                            if (max2 > k()) {
                                                                            }
                                                                            if (!z8) {
                                                                            }
                                                                            z18 = z8;
                                                                            z9 = z6;
                                                                            i9 = 8;
                                                                            if (i51 <= i9) {
                                                                            }
                                                                            z3 = z9;
                                                                            i50 = i51;
                                                                        }
                                                                    }
                                                                    c0271c.p();
                                                                    z3 = true;
                                                                } catch (Exception e10) {
                                                                    e = e10;
                                                                    z3 = true;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    boolean[] zArr2222 = j.f3740a;
                                                                    if (z3) {
                                                                    }
                                                                    if (z17) {
                                                                    }
                                                                    max = Math.max(this.f3631b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.f3633c0, k());
                                                                    if (max2 > k()) {
                                                                    }
                                                                    if (!z8) {
                                                                    }
                                                                    z18 = z8;
                                                                    z9 = z6;
                                                                    i9 = 8;
                                                                    if (i51 <= i9) {
                                                                    }
                                                                    z3 = z9;
                                                                    i50 = i51;
                                                                }
                                                                boolean[] zArr22222 = j.f3740a;
                                                                if (z3) {
                                                                    zArr22222[2] = false;
                                                                    boolean W3 = W(64);
                                                                    Q(c0271c, W3);
                                                                    int size6 = this.f3675q0.size();
                                                                    int i53 = 0;
                                                                    z6 = false;
                                                                    while (i53 < size6) {
                                                                        C0281d c0281d13 = (C0281d) this.f3675q0.get(i53);
                                                                        c0281d13.Q(c0271c, W3);
                                                                        boolean z19 = W3;
                                                                        int i54 = size6;
                                                                        if (c0281d13.h != -1 || c0281d13.i != -1) {
                                                                            z6 = true;
                                                                        }
                                                                        i53++;
                                                                        W3 = z19;
                                                                        size6 = i54;
                                                                    }
                                                                } else {
                                                                    Q(c0271c, W2);
                                                                    for (int i55 = 0; i55 < i7; i55++) {
                                                                        ((C0281d) this.f3675q0.get(i55)).Q(c0271c, W2);
                                                                    }
                                                                    z6 = false;
                                                                }
                                                                if (z17 && i51 < 8 && zArr22222[2]) {
                                                                    int i56 = 0;
                                                                    int i57 = 0;
                                                                    for (i10 = 0; i10 < i7; i10++) {
                                                                        C0281d c0281d14 = (C0281d) this.f3675q0.get(i10);
                                                                        i56 = Math.max(i56, c0281d14.q() + c0281d14.f3626Y);
                                                                        i57 = Math.max(i57, c0281d14.k() + c0281d14.f3627Z);
                                                                    }
                                                                    max3 = Math.max(this.f3631b0, i56);
                                                                    max4 = Math.max(this.f3633c0, i57);
                                                                    if (i6 == 2 && q() < max3) {
                                                                        O(max3);
                                                                        objArr[0] = 2;
                                                                        z6 = true;
                                                                        z5 = true;
                                                                    }
                                                                    if (i3 == 2 && k() < max4) {
                                                                        L(max4);
                                                                        objArr[1] = 2;
                                                                        z6 = true;
                                                                        z5 = true;
                                                                    }
                                                                }
                                                                max = Math.max(this.f3631b0, q());
                                                                if (max > q()) {
                                                                    O(max);
                                                                    r6 = 1;
                                                                    objArr[0] = 1;
                                                                    z6 = true;
                                                                    z7 = true;
                                                                } else {
                                                                    r6 = 1;
                                                                    z7 = z5;
                                                                }
                                                                max2 = Math.max(this.f3633c0, k());
                                                                if (max2 > k()) {
                                                                    L(max2);
                                                                    objArr[r6] = r6;
                                                                    z8 = r6;
                                                                    z6 = z8;
                                                                } else {
                                                                    z8 = z7;
                                                                }
                                                                if (!z8) {
                                                                    if (objArr[0] == 2 && i5 > 0 && q() > i5) {
                                                                        this.f3668E0 = r6;
                                                                        objArr[0] = r6;
                                                                        O(i5);
                                                                        z8 = r6;
                                                                        z6 = z8;
                                                                    }
                                                                    if (objArr[r6] == 2 && i4 > 0 && k() > i4) {
                                                                        this.f3669F0 = r6;
                                                                        objArr[r6] = r6;
                                                                        L(i4);
                                                                        i9 = 8;
                                                                        z9 = true;
                                                                        z18 = true;
                                                                        if (i51 <= i9) {
                                                                            z9 = false;
                                                                        }
                                                                        z3 = z9;
                                                                        i50 = i51;
                                                                    }
                                                                }
                                                                z18 = z8;
                                                                z9 = z6;
                                                                i9 = 8;
                                                                if (i51 <= i9) {
                                                                }
                                                                z3 = z9;
                                                                i50 = i51;
                                                            }
                                                        }
                                                        z5 = z18;
                                                        weakReference2 = this.f3671I0;
                                                        if (weakReference2 != null) {
                                                            C0280c c0280c92 = (C0280c) this.f3671I0.get();
                                                            C0274f k32 = c0271c.k(this.f3613L);
                                                            C0271c c0271c82 = this.f3681w0;
                                                            c0271c82.f(k32, c0271c82.k(c0280c92), 0, 5);
                                                            this.f3671I0 = null;
                                                        }
                                                        weakReference3 = this.H0;
                                                        if (weakReference3 != null) {
                                                            C0280c c0280c102 = (C0280c) this.H0.get();
                                                            c0280c3 = c0280c;
                                                            C0274f k42 = c0271c.k(c0280c3);
                                                            C0271c c0271c92 = this.f3681w0;
                                                            c0280c = c0280c3;
                                                            c0271c92.f(c0271c92.k(c0280c102), k42, 0, 5);
                                                            this.H0 = null;
                                                        }
                                                        weakReference4 = this.f3672J0;
                                                        if (weakReference4 == null) {
                                                        }
                                                        c0271c.p();
                                                        z3 = true;
                                                        boolean[] zArr222222 = j.f3740a;
                                                        if (z3) {
                                                        }
                                                        if (z17) {
                                                            int i562 = 0;
                                                            int i572 = 0;
                                                            while (i10 < i7) {
                                                            }
                                                            max3 = Math.max(this.f3631b0, i562);
                                                            max4 = Math.max(this.f3633c0, i572);
                                                            if (i6 == 2) {
                                                                O(max3);
                                                                objArr[0] = 2;
                                                                z6 = true;
                                                                z5 = true;
                                                            }
                                                            if (i3 == 2) {
                                                                L(max4);
                                                                objArr[1] = 2;
                                                                z6 = true;
                                                                z5 = true;
                                                            }
                                                        }
                                                        max = Math.max(this.f3631b0, q());
                                                        if (max > q()) {
                                                        }
                                                        max2 = Math.max(this.f3633c0, k());
                                                        if (max2 > k()) {
                                                        }
                                                        if (!z8) {
                                                        }
                                                        z18 = z8;
                                                        z9 = z6;
                                                        i9 = 8;
                                                        if (i51 <= i9) {
                                                        }
                                                        z3 = z9;
                                                        i50 = i51;
                                                    }
                                                    z4 = z18;
                                                    this.f3675q0 = arrayList10;
                                                    if (z4) {
                                                        objArr[0] = i6;
                                                        objArr[1] = i3;
                                                    }
                                                    F(c0271c.f3459l);
                                                }
                                                L(i16);
                                                this.f3669F0 = true;
                                            } else {
                                                i16 = i;
                                            }
                                            i17 = i16;
                                            i4 = i17;
                                            i5 = i15;
                                            z2 = true;
                                            if (W(64)) {
                                            }
                                            c0271c.getClass();
                                            c0271c.f3456g = false;
                                            if (this.f3667D0 == 0) {
                                            }
                                            c2 = 1;
                                            ArrayList arrayList102 = this.f3675q0;
                                            if (objArr[0] != 2) {
                                            }
                                            this.f3684z0 = 0;
                                            this.f3665A0 = 0;
                                            i7 = i2;
                                            while (i8 < i7) {
                                            }
                                            boolean W22 = W(64);
                                            boolean z182 = z2;
                                            int i502 = 0;
                                            z3 = true;
                                            while (z3) {
                                            }
                                            z4 = z182;
                                            this.f3675q0 = arrayList102;
                                            if (z4) {
                                            }
                                            F(c0271c.f3459l);
                                        }
                                        O(i14);
                                        this.f3668E0 = true;
                                    } else {
                                        i14 = i11;
                                    }
                                    i15 = i14;
                                    i3 = i12;
                                    if (i3 != 2) {
                                    }
                                    i17 = i16;
                                    i4 = i17;
                                    i5 = i15;
                                    z2 = true;
                                    if (W(64)) {
                                    }
                                    c0271c.getClass();
                                    c0271c.f3456g = false;
                                    if (this.f3667D0 == 0) {
                                    }
                                    c2 = 1;
                                    ArrayList arrayList1022 = this.f3675q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.f3684z0 = 0;
                                    this.f3665A0 = 0;
                                    i7 = i2;
                                    while (i8 < i7) {
                                    }
                                    boolean W222 = W(64);
                                    boolean z1822 = z2;
                                    int i5022 = 0;
                                    z3 = true;
                                    while (z3) {
                                    }
                                    z4 = z1822;
                                    this.f3675q0 = arrayList1022;
                                    if (z4) {
                                    }
                                    F(c0271c.f3459l);
                                }
                            }
                        }
                        c0297n2 = null;
                        if (c0297n == null) {
                        }
                        i6 = i13;
                        if (i6 == 2) {
                        }
                        i15 = i14;
                        i3 = i12;
                        if (i3 != 2) {
                        }
                        i17 = i16;
                        i4 = i17;
                        i5 = i15;
                        z2 = true;
                        if (W(64)) {
                        }
                        c0271c.getClass();
                        c0271c.f3456g = false;
                        if (this.f3667D0 == 0) {
                        }
                        c2 = 1;
                        ArrayList arrayList10222 = this.f3675q0;
                        if (objArr[0] != 2) {
                        }
                        this.f3684z0 = 0;
                        this.f3665A0 = 0;
                        i7 = i2;
                        while (i8 < i7) {
                        }
                        boolean W2222 = W(64);
                        boolean z18222 = z2;
                        int i50222 = 0;
                        z3 = true;
                        while (z3) {
                        }
                        z4 = z18222;
                        this.f3675q0 = arrayList10222;
                        if (z4) {
                        }
                        F(c0271c.f3459l);
                    }
                } else {
                    c0271c = c0271c6;
                    c3 = 1;
                }
                c0297n = null;
                if (objArr[c3] == 2) {
                }
                c0297n2 = null;
                if (c0297n == null) {
                }
                i6 = i13;
                if (i6 == 2) {
                }
                i15 = i14;
                i3 = i12;
                if (i3 != 2) {
                }
                i17 = i16;
                i4 = i17;
                i5 = i15;
                z2 = true;
                if (W(64)) {
                }
                c0271c.getClass();
                c0271c.f3456g = false;
                if (this.f3667D0 == 0) {
                }
                c2 = 1;
                ArrayList arrayList102222 = this.f3675q0;
                if (objArr[0] != 2) {
                }
                this.f3684z0 = 0;
                this.f3665A0 = 0;
                i7 = i2;
                while (i8 < i7) {
                }
                boolean W22222 = W(64);
                boolean z182222 = z2;
                int i502222 = 0;
                z3 = true;
                while (z3) {
                }
                z4 = z182222;
                this.f3675q0 = arrayList102222;
                if (z4) {
                }
                F(c0271c.f3459l);
            }
            c0271c = c0271c6;
            i4 = i;
            i3 = i12;
            i5 = i11;
            i6 = i13;
        }
        z2 = false;
        if (W(64)) {
        }
        c0271c.getClass();
        c0271c.f3456g = false;
        if (this.f3667D0 == 0) {
        }
        c2 = 1;
        ArrayList arrayList1022222 = this.f3675q0;
        if (objArr[0] != 2) {
        }
        this.f3684z0 = 0;
        this.f3665A0 = 0;
        i7 = i2;
        while (i8 < i7) {
        }
        boolean W222222 = W(64);
        boolean z1822222 = z2;
        int i5022222 = 0;
        z3 = true;
        while (z3) {
        }
        z4 = z1822222;
        this.f3675q0 = arrayList1022222;
        if (z4) {
        }
        F(c0271c.f3459l);
    }

    public final boolean W(int i) {
        return (this.f3667D0 & i) == i;
    }

    @Override // s.C0281d
    public final void n(StringBuilder sb) {
        sb.append(this.f3643j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f3622U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f3623V);
        sb.append("\n");
        Iterator it = this.f3675q0.iterator();
        while (it.hasNext()) {
            ((C0281d) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
