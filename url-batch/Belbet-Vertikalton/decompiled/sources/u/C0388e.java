package u;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import s.C0378c;
import s.C0381f;
import v.AbstractC0399h;
import v.AbstractC0406o;
import v.C0393b;
import v.C0394c;
import v.C0396e;
import v.C0405n;
import x.C0415f;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388e extends C0387d {

    /* renamed from: A0, reason: collision with root package name */
    public int f4292A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0385b[] f4293B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0385b[] f4294C0;
    public int D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f4295E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f4296F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f4297G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f4298H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f4299I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f4300J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f4301K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C0393b f4302L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f4303q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final I0.h f4304r0 = new I0.h(this);
    public final C0396e s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4305t0;

    /* renamed from: u0, reason: collision with root package name */
    public C0415f f4306u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4307v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C0378c f4308w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f4309x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f4310y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f4311z0;

    public C0388e() {
        C0396e c0396e = new C0396e();
        c0396e.f4409b = true;
        c0396e.f4410c = true;
        c0396e.e = new ArrayList();
        new ArrayList();
        c0396e.f4412f = null;
        c0396e.f4413g = new C0393b();
        c0396e.f4414h = new ArrayList();
        c0396e.f4408a = this;
        c0396e.f4411d = this;
        this.s0 = c0396e;
        this.f4306u0 = null;
        this.f4307v0 = false;
        this.f4308w0 = new C0378c();
        this.f4311z0 = 0;
        this.f4292A0 = 0;
        this.f4293B0 = new C0385b[4];
        this.f4294C0 = new C0385b[4];
        this.D0 = 257;
        this.f4295E0 = false;
        this.f4296F0 = false;
        this.f4297G0 = null;
        this.f4298H0 = null;
        this.f4299I0 = null;
        this.f4300J0 = null;
        this.f4301K0 = new HashSet();
        this.f4302L0 = new C0393b();
    }

    public static void V(C0387d c0387d, C0415f c0415f, C0393b c0393b) {
        int i;
        int i2;
        if (c0415f == null) {
            return;
        }
        if (c0387d.f4266g0 == 8 || (c0387d instanceof h) || (c0387d instanceof C0384a)) {
            c0393b.e = 0;
            c0393b.f4403f = 0;
            return;
        }
        int[] iArr = c0387d.f4281p0;
        c0393b.f4399a = iArr[0];
        c0393b.f4400b = iArr[1];
        c0393b.f4401c = c0387d.q();
        c0393b.f4402d = c0387d.k();
        c0393b.i = false;
        c0393b.j = 0;
        boolean z2 = c0393b.f4399a == 3;
        boolean z3 = c0393b.f4400b == 3;
        boolean z4 = z2 && c0387d.f4250W > 0.0f;
        boolean z5 = z3 && c0387d.f4250W > 0.0f;
        if (z2 && c0387d.t(0) && c0387d.f4283r == 0 && !z4) {
            c0393b.f4399a = 2;
            if (z3 && c0387d.f4284s == 0) {
                c0393b.f4399a = 1;
            }
            z2 = false;
        }
        if (z3 && c0387d.t(1) && c0387d.f4284s == 0 && !z5) {
            c0393b.f4400b = 2;
            if (z2 && c0387d.f4283r == 0) {
                c0393b.f4400b = 1;
            }
            z3 = false;
        }
        if (c0387d.A()) {
            c0393b.f4399a = 1;
            z2 = false;
        }
        if (c0387d.B()) {
            c0393b.f4400b = 1;
            z3 = false;
        }
        int[] iArr2 = c0387d.f4285t;
        if (z4) {
            if (iArr2[0] == 4) {
                c0393b.f4399a = 1;
            } else if (!z3) {
                if (c0393b.f4400b == 1) {
                    i2 = c0393b.f4402d;
                } else {
                    c0393b.f4399a = 2;
                    c0415f.b(c0387d, c0393b);
                    i2 = c0393b.f4403f;
                }
                c0393b.f4399a = 1;
                c0393b.f4401c = (int) (c0387d.f4250W * i2);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c0393b.f4400b = 1;
            } else if (!z2) {
                if (c0393b.f4399a == 1) {
                    i = c0393b.f4401c;
                } else {
                    c0393b.f4400b = 2;
                    c0415f.b(c0387d, c0393b);
                    i = c0393b.e;
                }
                c0393b.f4400b = 1;
                if (c0387d.f4251X == -1) {
                    c0393b.f4402d = (int) (i / c0387d.f4250W);
                } else {
                    c0393b.f4402d = (int) (c0387d.f4250W * i);
                }
            }
        }
        c0415f.b(c0387d, c0393b);
        c0387d.O(c0393b.e);
        c0387d.L(c0393b.f4403f);
        c0387d.f4233E = c0393b.f4405h;
        c0387d.I(c0393b.f4404g);
        c0393b.j = 0;
    }

    @Override // u.C0387d
    public final void C() {
        this.f4308w0.t();
        this.f4309x0 = 0;
        this.f4310y0 = 0;
        this.f4303q0.clear();
        super.C();
    }

    @Override // u.C0387d
    public final void F(I0.h hVar) {
        super.F(hVar);
        int size = this.f4303q0.size();
        for (int i = 0; i < size; i++) {
            ((C0387d) this.f4303q0.get(i)).F(hVar);
        }
    }

    @Override // u.C0387d
    public final void P(boolean z2, boolean z3) {
        super.P(z2, z3);
        int size = this.f4303q0.size();
        for (int i = 0; i < size; i++) {
            ((C0387d) this.f4303q0.get(i)).P(z2, z3);
        }
    }

    public final void R(C0387d c0387d, int i) {
        if (i == 0) {
            int i2 = this.f4311z0 + 1;
            C0385b[] c0385bArr = this.f4294C0;
            if (i2 >= c0385bArr.length) {
                this.f4294C0 = (C0385b[]) Arrays.copyOf(c0385bArr, c0385bArr.length * 2);
            }
            C0385b[] c0385bArr2 = this.f4294C0;
            int i3 = this.f4311z0;
            c0385bArr2[i3] = new C0385b(c0387d, 0, this.f4307v0);
            this.f4311z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f4292A0 + 1;
            C0385b[] c0385bArr3 = this.f4293B0;
            if (i4 >= c0385bArr3.length) {
                this.f4293B0 = (C0385b[]) Arrays.copyOf(c0385bArr3, c0385bArr3.length * 2);
            }
            C0385b[] c0385bArr4 = this.f4293B0;
            int i5 = this.f4292A0;
            c0385bArr4[i5] = new C0385b(c0387d, 1, this.f4307v0);
            this.f4292A0 = i5 + 1;
        }
    }

    public final void S(C0378c c0378c) {
        boolean W2 = W(64);
        b(c0378c, W2);
        int size = this.f4303q0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            C0387d c0387d = (C0387d) this.f4303q0.get(i);
            boolean[] zArr = c0387d.f4246S;
            zArr[0] = false;
            zArr[1] = false;
            if (c0387d instanceof C0384a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                C0387d c0387d2 = (C0387d) this.f4303q0.get(i2);
                if (c0387d2 instanceof C0384a) {
                    C0384a c0384a = (C0384a) c0387d2;
                    for (int i3 = 0; i3 < c0384a.f4367r0; i3++) {
                        C0387d c0387d3 = c0384a.f4366q0[i3];
                        if (c0384a.f4205t0 || c0387d3.c()) {
                            int i4 = c0384a.s0;
                            if (i4 == 0 || i4 == 1) {
                                c0387d3.f4246S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c0387d3.f4246S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f4301K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C0387d c0387d4 = (C0387d) this.f4303q0.get(i5);
            c0387d4.getClass();
            boolean z3 = c0387d4 instanceof g;
            if (z3 || (c0387d4 instanceof h)) {
                if (z3) {
                    hashSet.add(c0387d4);
                } else {
                    c0387d4.b(c0378c, W2);
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
                g gVar = (g) ((C0387d) it.next());
                for (int i6 = 0; i6 < gVar.f4367r0; i6++) {
                    if (hashSet.contains(gVar.f4366q0[i6])) {
                        gVar.b(c0378c, W2);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C0387d) it2.next()).b(c0378c, W2);
                }
                hashSet.clear();
            }
        }
        if (C0378c.f4113p) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C0387d c0387d5 = (C0387d) this.f4303q0.get(i7);
                c0387d5.getClass();
                if (!(c0387d5 instanceof g) && !(c0387d5 instanceof h)) {
                    hashSet2.add(c0387d5);
                }
            }
            a(this, c0378c, hashSet2, this.f4281p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C0387d c0387d6 = (C0387d) it3.next();
                j.b(this, c0378c, c0387d6);
                c0387d6.b(c0378c, W2);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C0387d c0387d7 = (C0387d) this.f4303q0.get(i8);
                if (c0387d7 instanceof C0388e) {
                    int[] iArr = c0387d7.f4281p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c0387d7.M(1);
                    }
                    if (i10 == 2) {
                        c0387d7.N(1);
                    }
                    c0387d7.b(c0378c, W2);
                    if (i9 == 2) {
                        c0387d7.M(i9);
                    }
                    if (i10 == 2) {
                        c0387d7.N(i10);
                    }
                } else {
                    j.b(this, c0378c, c0387d7);
                    if (!(c0387d7 instanceof g) && !(c0387d7 instanceof h)) {
                        c0387d7.b(c0378c, W2);
                    }
                }
            }
        }
        if (this.f4311z0 > 0) {
            j.a(this, c0378c, null, 0);
        }
        if (this.f4292A0 > 0) {
            j.a(this, c0378c, null, 1);
        }
    }

    public final boolean T(int i, boolean z2) {
        boolean z3;
        C0396e c0396e = this.s0;
        C0388e c0388e = c0396e.f4408a;
        boolean z4 = false;
        int j = c0388e.j(0);
        int j2 = c0388e.j(1);
        int r2 = c0388e.r();
        int s2 = c0388e.s();
        ArrayList arrayList = c0396e.e;
        if (z2 && (j == 2 || j2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC0406o abstractC0406o = (AbstractC0406o) it.next();
                if (abstractC0406o.f4440f == i && !abstractC0406o.k()) {
                    z2 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z2 && j == 2) {
                    c0388e.M(1);
                    c0388e.O(c0396e.d(c0388e, 0));
                    c0388e.f4260d.e.d(c0388e.q());
                }
            } else if (z2 && j2 == 2) {
                c0388e.N(1);
                c0388e.L(c0396e.d(c0388e, 1));
                c0388e.e.e.d(c0388e.k());
            }
        }
        int[] iArr = c0388e.f4281p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int q2 = c0388e.q() + r2;
                c0388e.f4260d.i.d(q2);
                c0388e.f4260d.e.d(q2 - r2);
                z3 = true;
            }
            z3 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int k2 = c0388e.k() + s2;
                c0388e.e.i.d(k2);
                c0388e.e.e.d(k2 - s2);
                z3 = true;
            }
            z3 = false;
        }
        c0396e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC0406o abstractC0406o2 = (AbstractC0406o) it2.next();
            if (abstractC0406o2.f4440f == i && (abstractC0406o2.f4437b != c0388e || abstractC0406o2.f4441g)) {
                abstractC0406o2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC0406o abstractC0406o3 = (AbstractC0406o) it3.next();
            if (abstractC0406o3.f4440f == i && (z3 || abstractC0406o3.f4437b != c0388e)) {
                if (!abstractC0406o3.f4442h.j) {
                    break;
                }
                if (!abstractC0406o3.i.j) {
                    break;
                }
                if (!(abstractC0406o3 instanceof C0394c) && !abstractC0406o3.e.j) {
                    break;
                }
            }
        }
        c0388e.M(j);
        c0388e.N(j2);
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
        C0386c c0386c;
        int i2;
        int i3;
        C0386c c0386c2;
        int i4;
        int i5;
        C0378c c0378c;
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
        C0381f k2;
        C0378c c0378c2;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C0378c c0378c3;
        C0386c c0386c3;
        int i11;
        int i12;
        int i13;
        char c3;
        C0405n c0405n;
        C0405n c0405n2;
        int i14;
        int i15;
        int i16;
        int i17;
        int b2;
        C0405n c0405n3;
        C0405n c0405n4;
        int[] iArr;
        this.f4252Y = 0;
        this.f4253Z = 0;
        this.f4295E0 = false;
        this.f4296F0 = false;
        int size = this.f4303q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr2 = this.f4281p0;
        int i18 = iArr2[1];
        int i19 = iArr2[0];
        int i20 = this.f4305t0;
        C0386c c0386c4 = this.f4237J;
        C0386c c0386c5 = this.f4236I;
        if (i20 == 0 && j.c(this.D0, 1)) {
            C0415f c0415f = this.f4306u0;
            int i21 = iArr2[0];
            int i22 = iArr2[1];
            E();
            ArrayList arrayList = this.f4303q0;
            int size2 = arrayList.size();
            for (int i23 = 0; i23 < size2; i23++) {
                ((C0387d) arrayList.get(i23)).E();
            }
            boolean z10 = this.f4307v0;
            if (i21 == 1) {
                J(0, q());
            } else {
                c0386c5.l(0);
                this.f4252Y = 0;
            }
            int i24 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i24 < size2) {
                C0386c c0386c6 = c0386c5;
                C0387d c0387d = (C0387d) arrayList.get(i24);
                int i25 = max6;
                if (c0387d instanceof h) {
                    h hVar = (h) c0387d;
                    iArr = iArr2;
                    if (hVar.f4364u0 == 1) {
                        int i26 = hVar.f4362r0;
                        if (i26 != -1) {
                            hVar.R(i26);
                        } else if (hVar.s0 != -1 && A()) {
                            hVar.R(q() - hVar.s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f4361q0 * q()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((c0387d instanceof C0384a) && ((C0384a) c0387d).U() == 0) {
                        z12 = true;
                    }
                }
                i24++;
                max6 = i25;
                c0386c5 = c0386c6;
                iArr2 = iArr;
            }
            i = max6;
            objArr = iArr2;
            c0386c = c0386c5;
            if (z11) {
                for (int i27 = 0; i27 < size2; i27++) {
                    C0387d c0387d2 = (C0387d) arrayList.get(i27);
                    if (c0387d2 instanceof h) {
                        h hVar2 = (h) c0387d2;
                        if (hVar2.f4364u0 == 1) {
                            AbstractC0399h.c(0, hVar2, c0415f, z10);
                        }
                    }
                }
            }
            AbstractC0399h.c(0, this, c0415f, z10);
            if (z12) {
                for (int i28 = 0; i28 < size2; i28++) {
                    C0387d c0387d3 = (C0387d) arrayList.get(i28);
                    if (c0387d3 instanceof C0384a) {
                        C0384a c0384a = (C0384a) c0387d3;
                        if (c0384a.U() == 0 && c0384a.T()) {
                            AbstractC0399h.c(1, c0384a, c0415f, z10);
                        }
                    }
                }
            }
            if (i22 == 1) {
                K(0, k());
            } else {
                c0386c4.l(0);
                this.f4253Z = 0;
            }
            boolean z13 = false;
            boolean z14 = false;
            for (int i29 = 0; i29 < size2; i29++) {
                C0387d c0387d4 = (C0387d) arrayList.get(i29);
                if (c0387d4 instanceof h) {
                    h hVar3 = (h) c0387d4;
                    if (hVar3.f4364u0 == 0) {
                        int i30 = hVar3.f4362r0;
                        if (i30 != -1) {
                            hVar3.R(i30);
                        } else if (hVar3.s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f4361q0 * k()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else if ((c0387d4 instanceof C0384a) && ((C0384a) c0387d4).U() == 1) {
                    z14 = true;
                }
            }
            if (z13) {
                for (int i31 = 0; i31 < size2; i31++) {
                    C0387d c0387d5 = (C0387d) arrayList.get(i31);
                    if (c0387d5 instanceof h) {
                        h hVar4 = (h) c0387d5;
                        if (hVar4.f4364u0 == 0) {
                            AbstractC0399h.i(1, hVar4, c0415f);
                        }
                    }
                }
            }
            AbstractC0399h.i(0, this, c0415f);
            if (z14) {
                for (int i32 = 0; i32 < size2; i32++) {
                    C0387d c0387d6 = (C0387d) arrayList.get(i32);
                    if (c0387d6 instanceof C0384a) {
                        C0384a c0384a2 = (C0384a) c0387d6;
                        if (c0384a2.U() == 1 && c0384a2.T()) {
                            AbstractC0399h.i(1, c0384a2, c0415f);
                        }
                    }
                }
            }
            for (int i33 = 0; i33 < size2; i33++) {
                C0387d c0387d7 = (C0387d) arrayList.get(i33);
                if (c0387d7.z() && AbstractC0399h.a(c0387d7)) {
                    V(c0387d7, c0415f, AbstractC0399h.f4425a);
                    if (!(c0387d7 instanceof h)) {
                        AbstractC0399h.c(0, c0387d7, c0415f, z10);
                        AbstractC0399h.i(0, c0387d7, c0415f);
                    } else if (((h) c0387d7).f4364u0 == 0) {
                        AbstractC0399h.i(0, c0387d7, c0415f);
                    } else {
                        AbstractC0399h.c(0, c0387d7, c0415f, z10);
                    }
                }
            }
            for (int i34 = 0; i34 < size; i34++) {
                C0387d c0387d8 = (C0387d) this.f4303q0.get(i34);
                if (c0387d8.z() && !(c0387d8 instanceof h) && !(c0387d8 instanceof C0384a) && !(c0387d8 instanceof g) && !c0387d8.f4234F) {
                    int j = c0387d8.j(0);
                    int j2 = c0387d8.j(1);
                    if (j != 3 || c0387d8.f4283r == 1 || j2 != 3 || c0387d8.f4284s == 1) {
                        V(c0387d8, this.f4306u0, new C0393b());
                    }
                }
            }
        } else {
            i = max6;
            objArr = iArr2;
            c0386c = c0386c5;
        }
        C0378c c0378c4 = this.f4308w0;
        if (size <= 2 || !((i19 == 2 || i18 == 2) && j.c(this.D0, 1024))) {
            i2 = size;
            i3 = i18;
            c0386c2 = c0386c4;
            i4 = i;
            i5 = max5;
            c0378c = c0378c4;
            i6 = i19;
        } else {
            C0415f c0415f2 = this.f4306u0;
            ArrayList arrayList2 = this.f4303q0;
            int size3 = arrayList2.size();
            int i35 = 0;
            while (i35 < size3) {
                C0387d c0387d9 = (C0387d) arrayList2.get(i35);
                char c4 = objArr[0];
                char c5 = objArr[1];
                int[] iArr3 = c0387d9.f4281p0;
                c0386c2 = c0386c4;
                if (!AbstractC0399h.h(c4, c5, iArr3[0], iArr3[1]) || (c0387d9 instanceof g)) {
                    i11 = max5;
                    i2 = size;
                    i12 = i18;
                    i13 = i19;
                    c0378c = c0378c4;
                    break;
                }
                i35++;
                c0386c4 = c0386c2;
            }
            c0386c2 = c0386c4;
            int i36 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i36 < size3) {
                int i37 = size;
                C0387d c0387d10 = (C0387d) arrayList2.get(i36);
                int i38 = i18;
                char c6 = objArr[0];
                int i39 = max5;
                char c7 = objArr[1];
                int i40 = i19;
                int[] iArr4 = c0387d10.f4281p0;
                C0378c c0378c5 = c0378c4;
                if (!AbstractC0399h.h(c6, c7, iArr4[0], iArr4[1])) {
                    V(c0387d10, c0415f2, this.f4302L0);
                }
                boolean z15 = c0387d10 instanceof h;
                if (z15) {
                    h hVar5 = (h) c0387d10;
                    if (hVar5.f4364u0 == 0) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(hVar5);
                    }
                    if (hVar5.f4364u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(hVar5);
                    }
                }
                if (c0387d10 instanceof i) {
                    if (c0387d10 instanceof C0384a) {
                        C0384a c0384a3 = (C0384a) c0387d10;
                        if (c0384a3.U() == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c0384a3);
                        }
                        if (c0384a3.U() == 1) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(c0384a3);
                        }
                    } else {
                        i iVar = (i) c0387d10;
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
                if (c0387d10.f4236I.f4226f == null && c0387d10.f4238K.f4226f == null && !z15 && !(c0387d10 instanceof C0384a)) {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    arrayList7.add(c0387d10);
                }
                if (c0387d10.f4237J.f4226f == null && c0387d10.f4239L.f4226f == null && c0387d10.f4240M.f4226f == null && !z15 && !(c0387d10 instanceof C0384a)) {
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                    }
                    arrayList8.add(c0387d10);
                }
                i36++;
                i18 = i38;
                size = i37;
                max5 = i39;
                i19 = i40;
                c0378c4 = c0378c5;
            }
            i11 = max5;
            C0378c c0378c6 = c0378c4;
            i2 = size;
            i12 = i18;
            i13 = i19;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    AbstractC0399h.b((h) it.next(), 0, arrayList9, null);
                }
            }
            int i41 = 0;
            C0405n c0405n5 = null;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    i iVar2 = (i) it2.next();
                    C0405n b3 = AbstractC0399h.b(iVar2, i41, arrayList9, c0405n5);
                    iVar2.R(i41, arrayList9, b3);
                    b3.a(arrayList9);
                    i41 = 0;
                    c0405n5 = null;
                }
            }
            HashSet hashSet = i(2).f4222a;
            if (hashSet != null) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    AbstractC0399h.b(((C0386c) it3.next()).f4225d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).f4222a;
            if (hashSet2 != null) {
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    AbstractC0399h.b(((C0386c) it4.next()).f4225d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).f4222a;
            if (hashSet3 != null) {
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    AbstractC0399h.b(((C0386c) it5.next()).f4225d, 0, arrayList9, null);
                }
            }
            C0405n c0405n6 = null;
            if (arrayList7 != null) {
                Iterator it6 = arrayList7.iterator();
                while (it6.hasNext()) {
                    AbstractC0399h.b((C0387d) it6.next(), 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    AbstractC0399h.b((h) it7.next(), 1, arrayList9, null);
                }
            }
            int i42 = 1;
            if (arrayList6 != null) {
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    i iVar3 = (i) it8.next();
                    C0405n b4 = AbstractC0399h.b(iVar3, i42, arrayList9, c0405n6);
                    iVar3.R(i42, arrayList9, b4);
                    b4.a(arrayList9);
                    i42 = 1;
                    c0405n6 = null;
                }
            }
            HashSet hashSet4 = i(3).f4222a;
            if (hashSet4 != null) {
                Iterator it9 = hashSet4.iterator();
                while (it9.hasNext()) {
                    AbstractC0399h.b(((C0386c) it9.next()).f4225d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).f4222a;
            if (hashSet5 != null) {
                Iterator it10 = hashSet5.iterator();
                while (it10.hasNext()) {
                    AbstractC0399h.b(((C0386c) it10.next()).f4225d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).f4222a;
            if (hashSet6 != null) {
                Iterator it11 = hashSet6.iterator();
                while (it11.hasNext()) {
                    AbstractC0399h.b(((C0386c) it11.next()).f4225d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).f4222a;
            if (hashSet7 != null) {
                Iterator it12 = hashSet7.iterator();
                while (it12.hasNext()) {
                    AbstractC0399h.b(((C0386c) it12.next()).f4225d, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                Iterator it13 = arrayList8.iterator();
                while (it13.hasNext()) {
                    AbstractC0399h.b((C0387d) it13.next(), 1, arrayList9, null);
                }
            }
            for (int i43 = 0; i43 < size3; i43++) {
                C0387d c0387d11 = (C0387d) arrayList2.get(i43);
                int[] iArr5 = c0387d11.f4281p0;
                if (iArr5[0] == 3 && iArr5[1] == 3) {
                    int i44 = c0387d11.f4278n0;
                    int size4 = arrayList9.size();
                    int i45 = 0;
                    while (true) {
                        if (i45 >= size4) {
                            c0405n3 = null;
                            break;
                        }
                        c0405n3 = (C0405n) arrayList9.get(i45);
                        if (i44 == c0405n3.f4433b) {
                            break;
                        } else {
                            i45++;
                        }
                    }
                    int i46 = c0387d11.o0;
                    int size5 = arrayList9.size();
                    int i47 = 0;
                    while (true) {
                        if (i47 >= size5) {
                            c0405n4 = null;
                            break;
                        }
                        c0405n4 = (C0405n) arrayList9.get(i47);
                        if (i46 == c0405n4.f4433b) {
                            break;
                        } else {
                            i47++;
                        }
                    }
                    if (c0405n3 != null && c0405n4 != null) {
                        c0405n3.c(0, c0405n4);
                        c0405n4.f4434c = 2;
                        arrayList9.remove(c0405n3);
                    }
                }
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    Iterator it14 = arrayList9.iterator();
                    int i48 = 0;
                    c0405n = null;
                    while (it14.hasNext()) {
                        C0405n c0405n7 = (C0405n) it14.next();
                        if (c0405n7.f4434c != 1) {
                            C0378c c0378c7 = c0378c6;
                            int b5 = c0405n7.b(c0378c7, 0);
                            if (b5 > i48) {
                                c0405n = c0405n7;
                                i48 = b5;
                            }
                            c0378c6 = c0378c7;
                        }
                    }
                    c0378c = c0378c6;
                    c3 = 1;
                    if (c0405n != null) {
                        M(1);
                        O(i48);
                        if (objArr[c3] == 2) {
                            Iterator it15 = arrayList9.iterator();
                            int i49 = 0;
                            c0405n2 = null;
                            while (it15.hasNext()) {
                                C0405n c0405n8 = (C0405n) it15.next();
                                if (c0405n8.f4434c != 0 && (b2 = c0405n8.b(c0378c, 1)) > i49) {
                                    c0405n2 = c0405n8;
                                    i49 = b2;
                                }
                            }
                            if (c0405n2 != null) {
                                N(1);
                                L(i49);
                                if (c0405n == null || c0405n2 != null) {
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
                                                    c0378c.getClass();
                                                    c0378c.f4120g = false;
                                                    if (this.D0 == 0 && z16) {
                                                        c2 = 1;
                                                        c0378c.f4120g = true;
                                                    } else {
                                                        c2 = 1;
                                                    }
                                                    ArrayList arrayList10 = this.f4303q0;
                                                    boolean z17 = objArr[0] != 2 || objArr[c2] == 2;
                                                    this.f4311z0 = 0;
                                                    this.f4292A0 = 0;
                                                    i7 = i2;
                                                    for (i8 = 0; i8 < i7; i8++) {
                                                        C0387d c0387d12 = (C0387d) this.f4303q0.get(i8);
                                                        if (c0387d12 instanceof C0388e) {
                                                            ((C0388e) c0387d12).U();
                                                        }
                                                    }
                                                    boolean W2 = W(64);
                                                    boolean z18 = z2;
                                                    int i50 = 0;
                                                    z3 = true;
                                                    while (z3) {
                                                        int i51 = i50 + 1;
                                                        try {
                                                            c0378c.t();
                                                            this.f4311z0 = 0;
                                                            this.f4292A0 = 0;
                                                            g(c0378c);
                                                            for (int i52 = 0; i52 < i7; i52++) {
                                                                ((C0387d) this.f4303q0.get(i52)).g(c0378c);
                                                            }
                                                            S(c0378c);
                                                            try {
                                                                weakReference = this.f4297G0;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                z5 = z18;
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            z5 = z18;
                                                        }
                                                        if (weakReference != null) {
                                                            try {
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                z5 = z18;
                                                            }
                                                            if (weakReference.get() != null) {
                                                                C0386c c0386c7 = (C0386c) this.f4297G0.get();
                                                                C0386c c0386c8 = c0386c2;
                                                                try {
                                                                    k2 = c0378c.k(c0386c8);
                                                                    c0378c2 = this.f4308w0;
                                                                    z5 = z18;
                                                                    c0386c2 = c0386c8;
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    z5 = z18;
                                                                    c0386c2 = c0386c8;
                                                                }
                                                                try {
                                                                    c0378c2.f(c0378c2.k(c0386c7), k2, 0, 5);
                                                                    this.f4297G0 = null;
                                                                    weakReference2 = this.f4299I0;
                                                                    if (weakReference2 != null && weakReference2.get() != null) {
                                                                        C0386c c0386c9 = (C0386c) this.f4299I0.get();
                                                                        C0381f k3 = c0378c.k(this.f4239L);
                                                                        C0378c c0378c8 = this.f4308w0;
                                                                        c0378c8.f(k3, c0378c8.k(c0386c9), 0, 5);
                                                                        this.f4299I0 = null;
                                                                    }
                                                                    weakReference3 = this.f4298H0;
                                                                    if (weakReference3 != null && weakReference3.get() != null) {
                                                                        C0386c c0386c10 = (C0386c) this.f4298H0.get();
                                                                        c0386c3 = c0386c;
                                                                        try {
                                                                            C0381f k4 = c0378c.k(c0386c3);
                                                                            C0378c c0378c9 = this.f4308w0;
                                                                            c0386c = c0386c3;
                                                                            c0378c9.f(c0378c9.k(c0386c10), k4, 0, 5);
                                                                            this.f4298H0 = null;
                                                                        } catch (Exception e5) {
                                                                            e = e5;
                                                                            c0386c = c0386c3;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr = j.f4368a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f4257b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f4259c0, k());
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
                                                                    weakReference4 = this.f4300J0;
                                                                    if (weakReference4 == null && weakReference4.get() != null) {
                                                                        C0386c c0386c11 = (C0386c) this.f4300J0.get();
                                                                        C0381f k5 = c0378c.k(this.f4238K);
                                                                        try {
                                                                            c0378c3 = this.f4308w0;
                                                                        } catch (Exception e6) {
                                                                            e = e6;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr2 = j.f4368a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f4257b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f4259c0, k());
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
                                                                            c0378c3.f(k5, c0378c3.k(c0386c11), 0, 5);
                                                                            try {
                                                                                this.f4300J0 = null;
                                                                            } catch (Exception e7) {
                                                                                e = e7;
                                                                                z3 = true;
                                                                                e.printStackTrace();
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr22 = j.f4368a;
                                                                                if (z3) {
                                                                                }
                                                                                if (z17) {
                                                                                }
                                                                                max = Math.max(this.f4257b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f4259c0, k());
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
                                                                        } catch (Exception e8) {
                                                                            e = e8;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr222 = j.f4368a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f4257b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f4259c0, k());
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
                                                                    c0378c.p();
                                                                    z3 = true;
                                                                } catch (Exception e9) {
                                                                    e = e9;
                                                                    z3 = true;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    boolean[] zArr2222 = j.f4368a;
                                                                    if (z3) {
                                                                    }
                                                                    if (z17) {
                                                                    }
                                                                    max = Math.max(this.f4257b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.f4259c0, k());
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
                                                                boolean[] zArr22222 = j.f4368a;
                                                                if (z3) {
                                                                    zArr22222[2] = false;
                                                                    boolean W3 = W(64);
                                                                    Q(c0378c, W3);
                                                                    int size6 = this.f4303q0.size();
                                                                    int i53 = 0;
                                                                    z6 = false;
                                                                    while (i53 < size6) {
                                                                        C0387d c0387d13 = (C0387d) this.f4303q0.get(i53);
                                                                        c0387d13.Q(c0378c, W3);
                                                                        boolean z19 = W3;
                                                                        int i54 = size6;
                                                                        if (c0387d13.f4267h != -1 || c0387d13.i != -1) {
                                                                            z6 = true;
                                                                        }
                                                                        i53++;
                                                                        W3 = z19;
                                                                        size6 = i54;
                                                                    }
                                                                } else {
                                                                    Q(c0378c, W2);
                                                                    for (int i55 = 0; i55 < i7; i55++) {
                                                                        ((C0387d) this.f4303q0.get(i55)).Q(c0378c, W2);
                                                                    }
                                                                    z6 = false;
                                                                }
                                                                if (z17 && i51 < 8 && zArr22222[2]) {
                                                                    int i56 = 0;
                                                                    int i57 = 0;
                                                                    for (i10 = 0; i10 < i7; i10++) {
                                                                        C0387d c0387d14 = (C0387d) this.f4303q0.get(i10);
                                                                        i56 = Math.max(i56, c0387d14.q() + c0387d14.f4252Y);
                                                                        i57 = Math.max(i57, c0387d14.k() + c0387d14.f4253Z);
                                                                    }
                                                                    max3 = Math.max(this.f4257b0, i56);
                                                                    max4 = Math.max(this.f4259c0, i57);
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
                                                                max = Math.max(this.f4257b0, q());
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
                                                                max2 = Math.max(this.f4259c0, k());
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
                                                                        this.f4295E0 = r6;
                                                                        objArr[0] = r6;
                                                                        O(i5);
                                                                        z8 = r6;
                                                                        z6 = z8;
                                                                    }
                                                                    if (objArr[r6] == 2 && i4 > 0 && k() > i4) {
                                                                        this.f4296F0 = r6;
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
                                                        weakReference2 = this.f4299I0;
                                                        if (weakReference2 != null) {
                                                            C0386c c0386c92 = (C0386c) this.f4299I0.get();
                                                            C0381f k32 = c0378c.k(this.f4239L);
                                                            C0378c c0378c82 = this.f4308w0;
                                                            c0378c82.f(k32, c0378c82.k(c0386c92), 0, 5);
                                                            this.f4299I0 = null;
                                                        }
                                                        weakReference3 = this.f4298H0;
                                                        if (weakReference3 != null) {
                                                            C0386c c0386c102 = (C0386c) this.f4298H0.get();
                                                            c0386c3 = c0386c;
                                                            C0381f k42 = c0378c.k(c0386c3);
                                                            C0378c c0378c92 = this.f4308w0;
                                                            c0386c = c0386c3;
                                                            c0378c92.f(c0378c92.k(c0386c102), k42, 0, 5);
                                                            this.f4298H0 = null;
                                                        }
                                                        weakReference4 = this.f4300J0;
                                                        if (weakReference4 == null) {
                                                        }
                                                        c0378c.p();
                                                        z3 = true;
                                                        boolean[] zArr222222 = j.f4368a;
                                                        if (z3) {
                                                        }
                                                        if (z17) {
                                                            int i562 = 0;
                                                            int i572 = 0;
                                                            while (i10 < i7) {
                                                            }
                                                            max3 = Math.max(this.f4257b0, i562);
                                                            max4 = Math.max(this.f4259c0, i572);
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
                                                        max = Math.max(this.f4257b0, q());
                                                        if (max > q()) {
                                                        }
                                                        max2 = Math.max(this.f4259c0, k());
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
                                                    this.f4303q0 = arrayList10;
                                                    if (z4) {
                                                        objArr[0] = i6;
                                                        objArr[1] = i3;
                                                    }
                                                    F(c0378c.f4123l);
                                                }
                                                L(i16);
                                                this.f4296F0 = true;
                                            } else {
                                                i16 = i;
                                            }
                                            i17 = i16;
                                            i4 = i17;
                                            i5 = i15;
                                            z2 = true;
                                            if (W(64)) {
                                            }
                                            c0378c.getClass();
                                            c0378c.f4120g = false;
                                            if (this.D0 == 0) {
                                            }
                                            c2 = 1;
                                            ArrayList arrayList102 = this.f4303q0;
                                            if (objArr[0] != 2) {
                                            }
                                            this.f4311z0 = 0;
                                            this.f4292A0 = 0;
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
                                            this.f4303q0 = arrayList102;
                                            if (z4) {
                                            }
                                            F(c0378c.f4123l);
                                        }
                                        O(i14);
                                        this.f4295E0 = true;
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
                                    c0378c.getClass();
                                    c0378c.f4120g = false;
                                    if (this.D0 == 0) {
                                    }
                                    c2 = 1;
                                    ArrayList arrayList1022 = this.f4303q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.f4311z0 = 0;
                                    this.f4292A0 = 0;
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
                                    this.f4303q0 = arrayList1022;
                                    if (z4) {
                                    }
                                    F(c0378c.f4123l);
                                }
                            }
                        }
                        c0405n2 = null;
                        if (c0405n == null) {
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
                        c0378c.getClass();
                        c0378c.f4120g = false;
                        if (this.D0 == 0) {
                        }
                        c2 = 1;
                        ArrayList arrayList10222 = this.f4303q0;
                        if (objArr[0] != 2) {
                        }
                        this.f4311z0 = 0;
                        this.f4292A0 = 0;
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
                        this.f4303q0 = arrayList10222;
                        if (z4) {
                        }
                        F(c0378c.f4123l);
                    }
                } else {
                    c0378c = c0378c6;
                    c3 = 1;
                }
                c0405n = null;
                if (objArr[c3] == 2) {
                }
                c0405n2 = null;
                if (c0405n == null) {
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
                c0378c.getClass();
                c0378c.f4120g = false;
                if (this.D0 == 0) {
                }
                c2 = 1;
                ArrayList arrayList102222 = this.f4303q0;
                if (objArr[0] != 2) {
                }
                this.f4311z0 = 0;
                this.f4292A0 = 0;
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
                this.f4303q0 = arrayList102222;
                if (z4) {
                }
                F(c0378c.f4123l);
            }
            c0378c = c0378c6;
            i4 = i;
            i3 = i12;
            i5 = i11;
            i6 = i13;
        }
        z2 = false;
        if (W(64)) {
        }
        c0378c.getClass();
        c0378c.f4120g = false;
        if (this.D0 == 0) {
        }
        c2 = 1;
        ArrayList arrayList1022222 = this.f4303q0;
        if (objArr[0] != 2) {
        }
        this.f4311z0 = 0;
        this.f4292A0 = 0;
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
        this.f4303q0 = arrayList1022222;
        if (z4) {
        }
        F(c0378c.f4123l);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // u.C0387d
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f4248U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f4249V);
        sb.append("\n");
        Iterator it = this.f4303q0.iterator();
        while (it.hasNext()) {
            ((C0387d) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
