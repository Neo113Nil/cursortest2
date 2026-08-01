package s;

import K.C0012l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import q.C0288c;
import q.C0291f;
import t.AbstractC0308h;
import t.AbstractC0315o;
import t.C0302b;
import t.C0303c;
import t.C0305e;
import t.C0314n;
import v.C0324f;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299e extends C0298d {

    /* renamed from: A0, reason: collision with root package name */
    public int f3677A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0296b[] f3678B0;
    public C0296b[] C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3679D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f3680E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f3681F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f3682G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f3683H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f3684I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f3685J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f3686K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C0302b f3687L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f3688q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final C0012l f3689r0 = new C0012l(this);

    /* renamed from: s0, reason: collision with root package name */
    public final C0305e f3690s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3691t0;

    /* renamed from: u0, reason: collision with root package name */
    public C0324f f3692u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3693v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C0288c f3694w0;
    public int x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f3695y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3696z0;

    public C0299e() {
        C0305e c0305e = new C0305e();
        c0305e.f3769b = true;
        c0305e.f3770c = true;
        c0305e.f3771e = new ArrayList();
        new ArrayList();
        c0305e.f3772f = null;
        c0305e.f3773g = new C0302b();
        c0305e.h = new ArrayList();
        c0305e.f3768a = this;
        c0305e.d = this;
        this.f3690s0 = c0305e;
        this.f3692u0 = null;
        this.f3693v0 = false;
        this.f3694w0 = new C0288c();
        this.f3696z0 = 0;
        this.f3677A0 = 0;
        this.f3678B0 = new C0296b[4];
        this.C0 = new C0296b[4];
        this.f3679D0 = 257;
        this.f3680E0 = false;
        this.f3681F0 = false;
        this.f3682G0 = null;
        this.f3683H0 = null;
        this.f3684I0 = null;
        this.f3685J0 = null;
        this.f3686K0 = new HashSet();
        this.f3687L0 = new C0302b();
    }

    public static void V(C0298d c0298d, C0324f c0324f, C0302b c0302b) {
        int i;
        int i2;
        if (c0324f == null) {
            return;
        }
        if (c0298d.f3651g0 == 8 || (c0298d instanceof h) || (c0298d instanceof C0295a)) {
            c0302b.f3762e = 0;
            c0302b.f3763f = 0;
            return;
        }
        int[] iArr = c0298d.f3666p0;
        c0302b.f3759a = iArr[0];
        c0302b.f3760b = iArr[1];
        c0302b.f3761c = c0298d.q();
        c0302b.d = c0298d.k();
        c0302b.i = false;
        c0302b.f3765j = 0;
        boolean z2 = c0302b.f3759a == 3;
        boolean z3 = c0302b.f3760b == 3;
        boolean z4 = z2 && c0298d.f3635W > 0.0f;
        boolean z5 = z3 && c0298d.f3635W > 0.0f;
        if (z2 && c0298d.t(0) && c0298d.f3668r == 0 && !z4) {
            c0302b.f3759a = 2;
            if (z3 && c0298d.f3669s == 0) {
                c0302b.f3759a = 1;
            }
            z2 = false;
        }
        if (z3 && c0298d.t(1) && c0298d.f3669s == 0 && !z5) {
            c0302b.f3760b = 2;
            if (z2 && c0298d.f3668r == 0) {
                c0302b.f3760b = 1;
            }
            z3 = false;
        }
        if (c0298d.A()) {
            c0302b.f3759a = 1;
            z2 = false;
        }
        if (c0298d.B()) {
            c0302b.f3760b = 1;
            z3 = false;
        }
        int[] iArr2 = c0298d.f3670t;
        if (z4) {
            if (iArr2[0] == 4) {
                c0302b.f3759a = 1;
            } else if (!z3) {
                if (c0302b.f3760b == 1) {
                    i2 = c0302b.d;
                } else {
                    c0302b.f3759a = 2;
                    c0324f.b(c0298d, c0302b);
                    i2 = c0302b.f3763f;
                }
                c0302b.f3759a = 1;
                c0302b.f3761c = (int) (c0298d.f3635W * i2);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c0302b.f3760b = 1;
            } else if (!z2) {
                if (c0302b.f3759a == 1) {
                    i = c0302b.f3761c;
                } else {
                    c0302b.f3760b = 2;
                    c0324f.b(c0298d, c0302b);
                    i = c0302b.f3762e;
                }
                c0302b.f3760b = 1;
                if (c0298d.f3636X == -1) {
                    c0302b.d = (int) (i / c0298d.f3635W);
                } else {
                    c0302b.d = (int) (c0298d.f3635W * i);
                }
            }
        }
        c0324f.b(c0298d, c0302b);
        c0298d.O(c0302b.f3762e);
        c0298d.L(c0302b.f3763f);
        c0298d.f3618E = c0302b.h;
        c0298d.I(c0302b.f3764g);
        c0302b.f3765j = 0;
    }

    @Override // s.C0298d
    public final void C() {
        this.f3694w0.t();
        this.x0 = 0;
        this.f3695y0 = 0;
        this.f3688q0.clear();
        super.C();
    }

    @Override // s.C0298d
    public final void F(C0012l c0012l) {
        super.F(c0012l);
        int size = this.f3688q0.size();
        for (int i = 0; i < size; i++) {
            ((C0298d) this.f3688q0.get(i)).F(c0012l);
        }
    }

    @Override // s.C0298d
    public final void P(boolean z2, boolean z3) {
        super.P(z2, z3);
        int size = this.f3688q0.size();
        for (int i = 0; i < size; i++) {
            ((C0298d) this.f3688q0.get(i)).P(z2, z3);
        }
    }

    public final void R(C0298d c0298d, int i) {
        if (i == 0) {
            int i2 = this.f3696z0 + 1;
            C0296b[] c0296bArr = this.C0;
            if (i2 >= c0296bArr.length) {
                this.C0 = (C0296b[]) Arrays.copyOf(c0296bArr, c0296bArr.length * 2);
            }
            C0296b[] c0296bArr2 = this.C0;
            int i3 = this.f3696z0;
            c0296bArr2[i3] = new C0296b(c0298d, 0, this.f3693v0);
            this.f3696z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f3677A0 + 1;
            C0296b[] c0296bArr3 = this.f3678B0;
            if (i4 >= c0296bArr3.length) {
                this.f3678B0 = (C0296b[]) Arrays.copyOf(c0296bArr3, c0296bArr3.length * 2);
            }
            C0296b[] c0296bArr4 = this.f3678B0;
            int i5 = this.f3677A0;
            c0296bArr4[i5] = new C0296b(c0298d, 1, this.f3693v0);
            this.f3677A0 = i5 + 1;
        }
    }

    public final void S(C0288c c0288c) {
        boolean W2 = W(64);
        b(c0288c, W2);
        int size = this.f3688q0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            C0298d c0298d = (C0298d) this.f3688q0.get(i);
            boolean[] zArr = c0298d.f3631S;
            zArr[0] = false;
            zArr[1] = false;
            if (c0298d instanceof C0295a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                C0298d c0298d2 = (C0298d) this.f3688q0.get(i2);
                if (c0298d2 instanceof C0295a) {
                    C0295a c0295a = (C0295a) c0298d2;
                    for (int i3 = 0; i3 < c0295a.f3752r0; i3++) {
                        C0298d c0298d3 = c0295a.f3751q0[i3];
                        if (c0295a.f3591t0 || c0298d3.c()) {
                            int i4 = c0295a.f3590s0;
                            if (i4 == 0 || i4 == 1) {
                                c0298d3.f3631S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c0298d3.f3631S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f3686K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C0298d c0298d4 = (C0298d) this.f3688q0.get(i5);
            c0298d4.getClass();
            boolean z3 = c0298d4 instanceof g;
            if (z3 || (c0298d4 instanceof h)) {
                if (z3) {
                    hashSet.add(c0298d4);
                } else {
                    c0298d4.b(c0288c, W2);
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
                g gVar = (g) ((C0298d) it.next());
                for (int i6 = 0; i6 < gVar.f3752r0; i6++) {
                    if (hashSet.contains(gVar.f3751q0[i6])) {
                        gVar.b(c0288c, W2);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C0298d) it2.next()).b(c0288c, W2);
                }
                hashSet.clear();
            }
        }
        if (C0288c.f3523p) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C0298d c0298d5 = (C0298d) this.f3688q0.get(i7);
                c0298d5.getClass();
                if (!(c0298d5 instanceof g) && !(c0298d5 instanceof h)) {
                    hashSet2.add(c0298d5);
                }
            }
            a(this, c0288c, hashSet2, this.f3666p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C0298d c0298d6 = (C0298d) it3.next();
                j.b(this, c0288c, c0298d6);
                c0298d6.b(c0288c, W2);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C0298d c0298d7 = (C0298d) this.f3688q0.get(i8);
                if (c0298d7 instanceof C0299e) {
                    int[] iArr = c0298d7.f3666p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c0298d7.M(1);
                    }
                    if (i10 == 2) {
                        c0298d7.N(1);
                    }
                    c0298d7.b(c0288c, W2);
                    if (i9 == 2) {
                        c0298d7.M(i9);
                    }
                    if (i10 == 2) {
                        c0298d7.N(i10);
                    }
                } else {
                    j.b(this, c0288c, c0298d7);
                    if (!(c0298d7 instanceof g) && !(c0298d7 instanceof h)) {
                        c0298d7.b(c0288c, W2);
                    }
                }
            }
        }
        if (this.f3696z0 > 0) {
            j.a(this, c0288c, null, 0);
        }
        if (this.f3677A0 > 0) {
            j.a(this, c0288c, null, 1);
        }
    }

    public final boolean T(int i, boolean z2) {
        boolean z3;
        C0305e c0305e = this.f3690s0;
        C0299e c0299e = c0305e.f3768a;
        boolean z4 = false;
        int j2 = c0299e.j(0);
        int j3 = c0299e.j(1);
        int r2 = c0299e.r();
        int s2 = c0299e.s();
        ArrayList arrayList = c0305e.f3771e;
        if (z2 && (j2 == 2 || j3 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC0315o abstractC0315o = (AbstractC0315o) it.next();
                if (abstractC0315o.f3799f == i && !abstractC0315o.k()) {
                    z2 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z2 && j2 == 2) {
                    c0299e.M(1);
                    c0299e.O(c0305e.d(c0299e, 0));
                    c0299e.d.f3798e.d(c0299e.q());
                }
            } else if (z2 && j3 == 2) {
                c0299e.N(1);
                c0299e.L(c0305e.d(c0299e, 1));
                c0299e.f3646e.f3798e.d(c0299e.k());
            }
        }
        int[] iArr = c0299e.f3666p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int q2 = c0299e.q() + r2;
                c0299e.d.i.d(q2);
                c0299e.d.f3798e.d(q2 - r2);
                z3 = true;
            }
            z3 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int k2 = c0299e.k() + s2;
                c0299e.f3646e.i.d(k2);
                c0299e.f3646e.f3798e.d(k2 - s2);
                z3 = true;
            }
            z3 = false;
        }
        c0305e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC0315o abstractC0315o2 = (AbstractC0315o) it2.next();
            if (abstractC0315o2.f3799f == i && (abstractC0315o2.f3796b != c0299e || abstractC0315o2.f3800g)) {
                abstractC0315o2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC0315o abstractC0315o3 = (AbstractC0315o) it3.next();
            if (abstractC0315o3.f3799f == i && (z3 || abstractC0315o3.f3796b != c0299e)) {
                if (!abstractC0315o3.h.f3780j) {
                    break;
                }
                if (!abstractC0315o3.i.f3780j) {
                    break;
                }
                if (!(abstractC0315o3 instanceof C0303c) && !abstractC0315o3.f3798e.f3780j) {
                    break;
                }
            }
        }
        c0299e.M(j2);
        c0299e.N(j3);
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
        C0297c c0297c;
        int i2;
        int i3;
        C0297c c0297c2;
        int i4;
        int i5;
        C0288c c0288c;
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
        C0291f k2;
        C0288c c0288c2;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C0288c c0288c3;
        C0297c c0297c3;
        int i11;
        int i12;
        int i13;
        char c3;
        C0314n c0314n;
        C0314n c0314n2;
        int i14;
        int i15;
        int i16;
        int i17;
        int b2;
        C0314n c0314n3;
        C0314n c0314n4;
        int[] iArr;
        this.f3637Y = 0;
        this.f3638Z = 0;
        this.f3680E0 = false;
        this.f3681F0 = false;
        int size = this.f3688q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr2 = this.f3666p0;
        int i18 = iArr2[1];
        int i19 = iArr2[0];
        int i20 = this.f3691t0;
        C0297c c0297c4 = this.f3622J;
        C0297c c0297c5 = this.f3621I;
        if (i20 == 0 && j.c(this.f3679D0, 1)) {
            C0324f c0324f = this.f3692u0;
            int i21 = iArr2[0];
            int i22 = iArr2[1];
            E();
            ArrayList arrayList = this.f3688q0;
            int size2 = arrayList.size();
            for (int i23 = 0; i23 < size2; i23++) {
                ((C0298d) arrayList.get(i23)).E();
            }
            boolean z10 = this.f3693v0;
            if (i21 == 1) {
                J(0, q());
            } else {
                c0297c5.l(0);
                this.f3637Y = 0;
            }
            int i24 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i24 < size2) {
                C0297c c0297c6 = c0297c5;
                C0298d c0298d = (C0298d) arrayList.get(i24);
                int i25 = max6;
                if (c0298d instanceof h) {
                    h hVar = (h) c0298d;
                    iArr = iArr2;
                    if (hVar.f3749u0 == 1) {
                        int i26 = hVar.f3746r0;
                        if (i26 != -1) {
                            hVar.R(i26);
                        } else if (hVar.f3747s0 != -1 && A()) {
                            hVar.R(q() - hVar.f3747s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f3745q0 * q()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((c0298d instanceof C0295a) && ((C0295a) c0298d).U() == 0) {
                        z12 = true;
                    }
                }
                i24++;
                max6 = i25;
                c0297c5 = c0297c6;
                iArr2 = iArr;
            }
            i = max6;
            objArr = iArr2;
            c0297c = c0297c5;
            if (z11) {
                for (int i27 = 0; i27 < size2; i27++) {
                    C0298d c0298d2 = (C0298d) arrayList.get(i27);
                    if (c0298d2 instanceof h) {
                        h hVar2 = (h) c0298d2;
                        if (hVar2.f3749u0 == 1) {
                            AbstractC0308h.c(0, hVar2, c0324f, z10);
                        }
                    }
                }
            }
            AbstractC0308h.c(0, this, c0324f, z10);
            if (z12) {
                for (int i28 = 0; i28 < size2; i28++) {
                    C0298d c0298d3 = (C0298d) arrayList.get(i28);
                    if (c0298d3 instanceof C0295a) {
                        C0295a c0295a = (C0295a) c0298d3;
                        if (c0295a.U() == 0 && c0295a.T()) {
                            AbstractC0308h.c(1, c0295a, c0324f, z10);
                        }
                    }
                }
            }
            if (i22 == 1) {
                K(0, k());
            } else {
                c0297c4.l(0);
                this.f3638Z = 0;
            }
            boolean z13 = false;
            boolean z14 = false;
            for (int i29 = 0; i29 < size2; i29++) {
                C0298d c0298d4 = (C0298d) arrayList.get(i29);
                if (c0298d4 instanceof h) {
                    h hVar3 = (h) c0298d4;
                    if (hVar3.f3749u0 == 0) {
                        int i30 = hVar3.f3746r0;
                        if (i30 != -1) {
                            hVar3.R(i30);
                        } else if (hVar3.f3747s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f3747s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f3745q0 * k()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else if ((c0298d4 instanceof C0295a) && ((C0295a) c0298d4).U() == 1) {
                    z14 = true;
                }
            }
            if (z13) {
                for (int i31 = 0; i31 < size2; i31++) {
                    C0298d c0298d5 = (C0298d) arrayList.get(i31);
                    if (c0298d5 instanceof h) {
                        h hVar4 = (h) c0298d5;
                        if (hVar4.f3749u0 == 0) {
                            AbstractC0308h.i(1, hVar4, c0324f);
                        }
                    }
                }
            }
            AbstractC0308h.i(0, this, c0324f);
            if (z14) {
                for (int i32 = 0; i32 < size2; i32++) {
                    C0298d c0298d6 = (C0298d) arrayList.get(i32);
                    if (c0298d6 instanceof C0295a) {
                        C0295a c0295a2 = (C0295a) c0298d6;
                        if (c0295a2.U() == 1 && c0295a2.T()) {
                            AbstractC0308h.i(1, c0295a2, c0324f);
                        }
                    }
                }
            }
            for (int i33 = 0; i33 < size2; i33++) {
                C0298d c0298d7 = (C0298d) arrayList.get(i33);
                if (c0298d7.z() && AbstractC0308h.a(c0298d7)) {
                    V(c0298d7, c0324f, AbstractC0308h.f3784a);
                    if (!(c0298d7 instanceof h)) {
                        AbstractC0308h.c(0, c0298d7, c0324f, z10);
                        AbstractC0308h.i(0, c0298d7, c0324f);
                    } else if (((h) c0298d7).f3749u0 == 0) {
                        AbstractC0308h.i(0, c0298d7, c0324f);
                    } else {
                        AbstractC0308h.c(0, c0298d7, c0324f, z10);
                    }
                }
            }
            for (int i34 = 0; i34 < size; i34++) {
                C0298d c0298d8 = (C0298d) this.f3688q0.get(i34);
                if (c0298d8.z() && !(c0298d8 instanceof h) && !(c0298d8 instanceof C0295a) && !(c0298d8 instanceof g) && !c0298d8.F) {
                    int j2 = c0298d8.j(0);
                    int j3 = c0298d8.j(1);
                    if (j2 != 3 || c0298d8.f3668r == 1 || j3 != 3 || c0298d8.f3669s == 1) {
                        V(c0298d8, this.f3692u0, new C0302b());
                    }
                }
            }
        } else {
            i = max6;
            objArr = iArr2;
            c0297c = c0297c5;
        }
        C0288c c0288c4 = this.f3694w0;
        if (size <= 2 || !((i19 == 2 || i18 == 2) && j.c(this.f3679D0, 1024))) {
            i2 = size;
            i3 = i18;
            c0297c2 = c0297c4;
            i4 = i;
            i5 = max5;
            c0288c = c0288c4;
            i6 = i19;
        } else {
            C0324f c0324f2 = this.f3692u0;
            ArrayList arrayList2 = this.f3688q0;
            int size3 = arrayList2.size();
            int i35 = 0;
            while (i35 < size3) {
                C0298d c0298d9 = (C0298d) arrayList2.get(i35);
                char c4 = objArr[0];
                char c5 = objArr[1];
                int[] iArr3 = c0298d9.f3666p0;
                c0297c2 = c0297c4;
                if (!AbstractC0308h.h(c4, c5, iArr3[0], iArr3[1]) || (c0298d9 instanceof g)) {
                    i11 = max5;
                    i2 = size;
                    i12 = i18;
                    i13 = i19;
                    c0288c = c0288c4;
                    break;
                }
                i35++;
                c0297c4 = c0297c2;
            }
            c0297c2 = c0297c4;
            int i36 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i36 < size3) {
                int i37 = size;
                C0298d c0298d10 = (C0298d) arrayList2.get(i36);
                int i38 = i18;
                char c6 = objArr[0];
                int i39 = max5;
                char c7 = objArr[1];
                int i40 = i19;
                int[] iArr4 = c0298d10.f3666p0;
                C0288c c0288c5 = c0288c4;
                if (!AbstractC0308h.h(c6, c7, iArr4[0], iArr4[1])) {
                    V(c0298d10, c0324f2, this.f3687L0);
                }
                boolean z15 = c0298d10 instanceof h;
                if (z15) {
                    h hVar5 = (h) c0298d10;
                    if (hVar5.f3749u0 == 0) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(hVar5);
                    }
                    if (hVar5.f3749u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(hVar5);
                    }
                }
                if (c0298d10 instanceof i) {
                    if (c0298d10 instanceof C0295a) {
                        C0295a c0295a3 = (C0295a) c0298d10;
                        if (c0295a3.U() == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c0295a3);
                        }
                        if (c0295a3.U() == 1) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(c0295a3);
                        }
                    } else {
                        i iVar = (i) c0298d10;
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
                if (c0298d10.f3621I.f3612f == null && c0298d10.f3623K.f3612f == null && !z15 && !(c0298d10 instanceof C0295a)) {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    arrayList7.add(c0298d10);
                }
                if (c0298d10.f3622J.f3612f == null && c0298d10.f3624L.f3612f == null && c0298d10.f3625M.f3612f == null && !z15 && !(c0298d10 instanceof C0295a)) {
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                    }
                    arrayList8.add(c0298d10);
                }
                i36++;
                i18 = i38;
                size = i37;
                max5 = i39;
                i19 = i40;
                c0288c4 = c0288c5;
            }
            i11 = max5;
            C0288c c0288c6 = c0288c4;
            i2 = size;
            i12 = i18;
            i13 = i19;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    AbstractC0308h.b((h) it.next(), 0, arrayList9, null);
                }
            }
            int i41 = 0;
            C0314n c0314n5 = null;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    i iVar2 = (i) it2.next();
                    C0314n b3 = AbstractC0308h.b(iVar2, i41, arrayList9, c0314n5);
                    iVar2.R(i41, arrayList9, b3);
                    b3.a(arrayList9);
                    i41 = 0;
                    c0314n5 = null;
                }
            }
            HashSet hashSet = i(2).f3608a;
            if (hashSet != null) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    AbstractC0308h.b(((C0297c) it3.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).f3608a;
            if (hashSet2 != null) {
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    AbstractC0308h.b(((C0297c) it4.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).f3608a;
            if (hashSet3 != null) {
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    AbstractC0308h.b(((C0297c) it5.next()).d, 0, arrayList9, null);
                }
            }
            C0314n c0314n6 = null;
            if (arrayList7 != null) {
                Iterator it6 = arrayList7.iterator();
                while (it6.hasNext()) {
                    AbstractC0308h.b((C0298d) it6.next(), 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    AbstractC0308h.b((h) it7.next(), 1, arrayList9, null);
                }
            }
            int i42 = 1;
            if (arrayList6 != null) {
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    i iVar3 = (i) it8.next();
                    C0314n b4 = AbstractC0308h.b(iVar3, i42, arrayList9, c0314n6);
                    iVar3.R(i42, arrayList9, b4);
                    b4.a(arrayList9);
                    i42 = 1;
                    c0314n6 = null;
                }
            }
            HashSet hashSet4 = i(3).f3608a;
            if (hashSet4 != null) {
                Iterator it9 = hashSet4.iterator();
                while (it9.hasNext()) {
                    AbstractC0308h.b(((C0297c) it9.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).f3608a;
            if (hashSet5 != null) {
                Iterator it10 = hashSet5.iterator();
                while (it10.hasNext()) {
                    AbstractC0308h.b(((C0297c) it10.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).f3608a;
            if (hashSet6 != null) {
                Iterator it11 = hashSet6.iterator();
                while (it11.hasNext()) {
                    AbstractC0308h.b(((C0297c) it11.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).f3608a;
            if (hashSet7 != null) {
                Iterator it12 = hashSet7.iterator();
                while (it12.hasNext()) {
                    AbstractC0308h.b(((C0297c) it12.next()).d, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                Iterator it13 = arrayList8.iterator();
                while (it13.hasNext()) {
                    AbstractC0308h.b((C0298d) it13.next(), 1, arrayList9, null);
                }
            }
            for (int i43 = 0; i43 < size3; i43++) {
                C0298d c0298d11 = (C0298d) arrayList2.get(i43);
                int[] iArr5 = c0298d11.f3666p0;
                if (iArr5[0] == 3 && iArr5[1] == 3) {
                    int i44 = c0298d11.f3662n0;
                    int size4 = arrayList9.size();
                    int i45 = 0;
                    while (true) {
                        if (i45 >= size4) {
                            c0314n3 = null;
                            break;
                        }
                        c0314n3 = (C0314n) arrayList9.get(i45);
                        if (i44 == c0314n3.f3792b) {
                            break;
                        } else {
                            i45++;
                        }
                    }
                    int i46 = c0298d11.f3664o0;
                    int size5 = arrayList9.size();
                    int i47 = 0;
                    while (true) {
                        if (i47 >= size5) {
                            c0314n4 = null;
                            break;
                        }
                        c0314n4 = (C0314n) arrayList9.get(i47);
                        if (i46 == c0314n4.f3792b) {
                            break;
                        } else {
                            i47++;
                        }
                    }
                    if (c0314n3 != null && c0314n4 != null) {
                        c0314n3.c(0, c0314n4);
                        c0314n4.f3793c = 2;
                        arrayList9.remove(c0314n3);
                    }
                }
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    Iterator it14 = arrayList9.iterator();
                    int i48 = 0;
                    c0314n = null;
                    while (it14.hasNext()) {
                        C0314n c0314n7 = (C0314n) it14.next();
                        if (c0314n7.f3793c != 1) {
                            C0288c c0288c7 = c0288c6;
                            int b5 = c0314n7.b(c0288c7, 0);
                            if (b5 > i48) {
                                c0314n = c0314n7;
                                i48 = b5;
                            }
                            c0288c6 = c0288c7;
                        }
                    }
                    c0288c = c0288c6;
                    c3 = 1;
                    if (c0314n != null) {
                        M(1);
                        O(i48);
                        if (objArr[c3] == 2) {
                            Iterator it15 = arrayList9.iterator();
                            int i49 = 0;
                            c0314n2 = null;
                            while (it15.hasNext()) {
                                C0314n c0314n8 = (C0314n) it15.next();
                                if (c0314n8.f3793c != 0 && (b2 = c0314n8.b(c0288c, 1)) > i49) {
                                    c0314n2 = c0314n8;
                                    i49 = b2;
                                }
                            }
                            if (c0314n2 != null) {
                                N(1);
                                L(i49);
                                if (c0314n == null || c0314n2 != null) {
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
                                                    c0288c.getClass();
                                                    c0288c.f3530g = false;
                                                    if (this.f3679D0 == 0 && z16) {
                                                        c2 = 1;
                                                        c0288c.f3530g = true;
                                                    } else {
                                                        c2 = 1;
                                                    }
                                                    ArrayList arrayList10 = this.f3688q0;
                                                    boolean z17 = objArr[0] != 2 || objArr[c2] == 2;
                                                    this.f3696z0 = 0;
                                                    this.f3677A0 = 0;
                                                    i7 = i2;
                                                    for (i8 = 0; i8 < i7; i8++) {
                                                        C0298d c0298d12 = (C0298d) this.f3688q0.get(i8);
                                                        if (c0298d12 instanceof C0299e) {
                                                            ((C0299e) c0298d12).U();
                                                        }
                                                    }
                                                    boolean W2 = W(64);
                                                    boolean z18 = z2;
                                                    int i50 = 0;
                                                    z3 = true;
                                                    while (z3) {
                                                        int i51 = i50 + 1;
                                                        try {
                                                            c0288c.t();
                                                            this.f3696z0 = 0;
                                                            this.f3677A0 = 0;
                                                            g(c0288c);
                                                            for (int i52 = 0; i52 < i7; i52++) {
                                                                ((C0298d) this.f3688q0.get(i52)).g(c0288c);
                                                            }
                                                            S(c0288c);
                                                            try {
                                                                weakReference = this.f3682G0;
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
                                                                C0297c c0297c7 = (C0297c) this.f3682G0.get();
                                                                C0297c c0297c8 = c0297c2;
                                                                try {
                                                                    k2 = c0288c.k(c0297c8);
                                                                    c0288c2 = this.f3694w0;
                                                                    z5 = z18;
                                                                    c0297c2 = c0297c8;
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    z5 = z18;
                                                                    c0297c2 = c0297c8;
                                                                }
                                                                try {
                                                                    c0288c2.f(c0288c2.k(c0297c7), k2, 0, 5);
                                                                    this.f3682G0 = null;
                                                                    weakReference2 = this.f3684I0;
                                                                    if (weakReference2 != null && weakReference2.get() != null) {
                                                                        C0297c c0297c9 = (C0297c) this.f3684I0.get();
                                                                        C0291f k3 = c0288c.k(this.f3624L);
                                                                        C0288c c0288c8 = this.f3694w0;
                                                                        c0288c8.f(k3, c0288c8.k(c0297c9), 0, 5);
                                                                        this.f3684I0 = null;
                                                                    }
                                                                    weakReference3 = this.f3683H0;
                                                                    if (weakReference3 != null && weakReference3.get() != null) {
                                                                        C0297c c0297c10 = (C0297c) this.f3683H0.get();
                                                                        c0297c3 = c0297c;
                                                                        try {
                                                                            C0291f k4 = c0288c.k(c0297c3);
                                                                            C0288c c0288c9 = this.f3694w0;
                                                                            c0297c = c0297c3;
                                                                            c0288c9.f(c0288c9.k(c0297c10), k4, 0, 5);
                                                                            this.f3683H0 = null;
                                                                        } catch (Exception e6) {
                                                                            e = e6;
                                                                            c0297c = c0297c3;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr = j.f3753a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f3642b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f3644c0, k());
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
                                                                    weakReference4 = this.f3685J0;
                                                                    if (weakReference4 == null && weakReference4.get() != null) {
                                                                        C0297c c0297c11 = (C0297c) this.f3685J0.get();
                                                                        C0291f k5 = c0288c.k(this.f3623K);
                                                                        try {
                                                                            c0288c3 = this.f3694w0;
                                                                        } catch (Exception e7) {
                                                                            e = e7;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr2 = j.f3753a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f3642b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f3644c0, k());
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
                                                                            c0288c3.f(k5, c0288c3.k(c0297c11), 0, 5);
                                                                            try {
                                                                                this.f3685J0 = null;
                                                                            } catch (Exception e8) {
                                                                                e = e8;
                                                                                z3 = true;
                                                                                e.printStackTrace();
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr22 = j.f3753a;
                                                                                if (z3) {
                                                                                }
                                                                                if (z17) {
                                                                                }
                                                                                max = Math.max(this.f3642b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f3644c0, k());
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
                                                                            boolean[] zArr222 = j.f3753a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f3642b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f3644c0, k());
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
                                                                    c0288c.p();
                                                                    z3 = true;
                                                                } catch (Exception e10) {
                                                                    e = e10;
                                                                    z3 = true;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    boolean[] zArr2222 = j.f3753a;
                                                                    if (z3) {
                                                                    }
                                                                    if (z17) {
                                                                    }
                                                                    max = Math.max(this.f3642b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.f3644c0, k());
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
                                                                boolean[] zArr22222 = j.f3753a;
                                                                if (z3) {
                                                                    zArr22222[2] = false;
                                                                    boolean W3 = W(64);
                                                                    Q(c0288c, W3);
                                                                    int size6 = this.f3688q0.size();
                                                                    int i53 = 0;
                                                                    z6 = false;
                                                                    while (i53 < size6) {
                                                                        C0298d c0298d13 = (C0298d) this.f3688q0.get(i53);
                                                                        c0298d13.Q(c0288c, W3);
                                                                        boolean z19 = W3;
                                                                        int i54 = size6;
                                                                        if (c0298d13.h != -1 || c0298d13.i != -1) {
                                                                            z6 = true;
                                                                        }
                                                                        i53++;
                                                                        W3 = z19;
                                                                        size6 = i54;
                                                                    }
                                                                } else {
                                                                    Q(c0288c, W2);
                                                                    for (int i55 = 0; i55 < i7; i55++) {
                                                                        ((C0298d) this.f3688q0.get(i55)).Q(c0288c, W2);
                                                                    }
                                                                    z6 = false;
                                                                }
                                                                if (z17 && i51 < 8 && zArr22222[2]) {
                                                                    int i56 = 0;
                                                                    int i57 = 0;
                                                                    for (i10 = 0; i10 < i7; i10++) {
                                                                        C0298d c0298d14 = (C0298d) this.f3688q0.get(i10);
                                                                        i56 = Math.max(i56, c0298d14.q() + c0298d14.f3637Y);
                                                                        i57 = Math.max(i57, c0298d14.k() + c0298d14.f3638Z);
                                                                    }
                                                                    max3 = Math.max(this.f3642b0, i56);
                                                                    max4 = Math.max(this.f3644c0, i57);
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
                                                                max = Math.max(this.f3642b0, q());
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
                                                                max2 = Math.max(this.f3644c0, k());
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
                                                                        this.f3680E0 = r6;
                                                                        objArr[0] = r6;
                                                                        O(i5);
                                                                        z8 = r6;
                                                                        z6 = z8;
                                                                    }
                                                                    if (objArr[r6] == 2 && i4 > 0 && k() > i4) {
                                                                        this.f3681F0 = r6;
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
                                                        weakReference2 = this.f3684I0;
                                                        if (weakReference2 != null) {
                                                            C0297c c0297c92 = (C0297c) this.f3684I0.get();
                                                            C0291f k32 = c0288c.k(this.f3624L);
                                                            C0288c c0288c82 = this.f3694w0;
                                                            c0288c82.f(k32, c0288c82.k(c0297c92), 0, 5);
                                                            this.f3684I0 = null;
                                                        }
                                                        weakReference3 = this.f3683H0;
                                                        if (weakReference3 != null) {
                                                            C0297c c0297c102 = (C0297c) this.f3683H0.get();
                                                            c0297c3 = c0297c;
                                                            C0291f k42 = c0288c.k(c0297c3);
                                                            C0288c c0288c92 = this.f3694w0;
                                                            c0297c = c0297c3;
                                                            c0288c92.f(c0288c92.k(c0297c102), k42, 0, 5);
                                                            this.f3683H0 = null;
                                                        }
                                                        weakReference4 = this.f3685J0;
                                                        if (weakReference4 == null) {
                                                        }
                                                        c0288c.p();
                                                        z3 = true;
                                                        boolean[] zArr222222 = j.f3753a;
                                                        if (z3) {
                                                        }
                                                        if (z17) {
                                                            int i562 = 0;
                                                            int i572 = 0;
                                                            while (i10 < i7) {
                                                            }
                                                            max3 = Math.max(this.f3642b0, i562);
                                                            max4 = Math.max(this.f3644c0, i572);
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
                                                        max = Math.max(this.f3642b0, q());
                                                        if (max > q()) {
                                                        }
                                                        max2 = Math.max(this.f3644c0, k());
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
                                                    this.f3688q0 = arrayList10;
                                                    if (z4) {
                                                        objArr[0] = i6;
                                                        objArr[1] = i3;
                                                    }
                                                    F(c0288c.f3533l);
                                                }
                                                L(i16);
                                                this.f3681F0 = true;
                                            } else {
                                                i16 = i;
                                            }
                                            i17 = i16;
                                            i4 = i17;
                                            i5 = i15;
                                            z2 = true;
                                            if (W(64)) {
                                            }
                                            c0288c.getClass();
                                            c0288c.f3530g = false;
                                            if (this.f3679D0 == 0) {
                                            }
                                            c2 = 1;
                                            ArrayList arrayList102 = this.f3688q0;
                                            if (objArr[0] != 2) {
                                            }
                                            this.f3696z0 = 0;
                                            this.f3677A0 = 0;
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
                                            this.f3688q0 = arrayList102;
                                            if (z4) {
                                            }
                                            F(c0288c.f3533l);
                                        }
                                        O(i14);
                                        this.f3680E0 = true;
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
                                    c0288c.getClass();
                                    c0288c.f3530g = false;
                                    if (this.f3679D0 == 0) {
                                    }
                                    c2 = 1;
                                    ArrayList arrayList1022 = this.f3688q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.f3696z0 = 0;
                                    this.f3677A0 = 0;
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
                                    this.f3688q0 = arrayList1022;
                                    if (z4) {
                                    }
                                    F(c0288c.f3533l);
                                }
                            }
                        }
                        c0314n2 = null;
                        if (c0314n == null) {
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
                        c0288c.getClass();
                        c0288c.f3530g = false;
                        if (this.f3679D0 == 0) {
                        }
                        c2 = 1;
                        ArrayList arrayList10222 = this.f3688q0;
                        if (objArr[0] != 2) {
                        }
                        this.f3696z0 = 0;
                        this.f3677A0 = 0;
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
                        this.f3688q0 = arrayList10222;
                        if (z4) {
                        }
                        F(c0288c.f3533l);
                    }
                } else {
                    c0288c = c0288c6;
                    c3 = 1;
                }
                c0314n = null;
                if (objArr[c3] == 2) {
                }
                c0314n2 = null;
                if (c0314n == null) {
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
                c0288c.getClass();
                c0288c.f3530g = false;
                if (this.f3679D0 == 0) {
                }
                c2 = 1;
                ArrayList arrayList102222 = this.f3688q0;
                if (objArr[0] != 2) {
                }
                this.f3696z0 = 0;
                this.f3677A0 = 0;
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
                this.f3688q0 = arrayList102222;
                if (z4) {
                }
                F(c0288c.f3533l);
            }
            c0288c = c0288c6;
            i4 = i;
            i3 = i12;
            i5 = i11;
            i6 = i13;
        }
        z2 = false;
        if (W(64)) {
        }
        c0288c.getClass();
        c0288c.f3530g = false;
        if (this.f3679D0 == 0) {
        }
        c2 = 1;
        ArrayList arrayList1022222 = this.f3688q0;
        if (objArr[0] != 2) {
        }
        this.f3696z0 = 0;
        this.f3677A0 = 0;
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
        this.f3688q0 = arrayList1022222;
        if (z4) {
        }
        F(c0288c.f3533l);
    }

    public final boolean W(int i) {
        return (this.f3679D0 & i) == i;
    }

    @Override // s.C0298d
    public final void n(StringBuilder sb) {
        sb.append(this.f3654j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f3633U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f3634V);
        sb.append("\n");
        Iterator it = this.f3688q0.iterator();
        while (it.hasNext()) {
            ((C0298d) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
