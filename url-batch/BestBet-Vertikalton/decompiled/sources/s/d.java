package s;

import G1.AbstractC0001b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0309e;
import q.C0306b;
import q.C0307c;
import q.C0310f;
import t.C0345c;
import t.k;
import t.m;
import u0.C0372k;

/* loaded from: classes.dex */
public class d {

    /* renamed from: A, reason: collision with root package name */
    public int f3869A;

    /* renamed from: B, reason: collision with root package name */
    public float f3870B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f3871C;

    /* renamed from: D, reason: collision with root package name */
    public float f3872D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3873E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public int f3874G;

    /* renamed from: H, reason: collision with root package name */
    public int f3875H;

    /* renamed from: I, reason: collision with root package name */
    public final c f3876I;

    /* renamed from: J, reason: collision with root package name */
    public final c f3877J;

    /* renamed from: K, reason: collision with root package name */
    public final c f3878K;

    /* renamed from: L, reason: collision with root package name */
    public final c f3879L;

    /* renamed from: M, reason: collision with root package name */
    public final c f3880M;

    /* renamed from: N, reason: collision with root package name */
    public final c f3881N;

    /* renamed from: O, reason: collision with root package name */
    public final c f3882O;

    /* renamed from: P, reason: collision with root package name */
    public final c f3883P;

    /* renamed from: Q, reason: collision with root package name */
    public final c[] f3884Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f3885R;

    /* renamed from: S, reason: collision with root package name */
    public final boolean[] f3886S;

    /* renamed from: T, reason: collision with root package name */
    public d f3887T;

    /* renamed from: U, reason: collision with root package name */
    public int f3888U;

    /* renamed from: V, reason: collision with root package name */
    public int f3889V;

    /* renamed from: W, reason: collision with root package name */
    public float f3890W;

    /* renamed from: X, reason: collision with root package name */
    public int f3891X;

    /* renamed from: Y, reason: collision with root package name */
    public int f3892Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3893Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f3895a0;

    /* renamed from: b, reason: collision with root package name */
    public C0345c f3896b;

    /* renamed from: b0, reason: collision with root package name */
    public int f3897b0;

    /* renamed from: c, reason: collision with root package name */
    public C0345c f3898c;

    /* renamed from: c0, reason: collision with root package name */
    public int f3899c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f3900d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f3902e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f3904f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f3906g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f3907h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f3908i0;

    /* renamed from: j, reason: collision with root package name */
    public String f3909j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3910j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3911k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f3912k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3913l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f3914l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3915m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f3916m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3917n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3918n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3919o;
    public int o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3920p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f3921p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3922q;

    /* renamed from: r, reason: collision with root package name */
    public int f3923r;

    /* renamed from: s, reason: collision with root package name */
    public int f3924s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f3925t;

    /* renamed from: u, reason: collision with root package name */
    public int f3926u;

    /* renamed from: v, reason: collision with root package name */
    public int f3927v;

    /* renamed from: w, reason: collision with root package name */
    public float f3928w;

    /* renamed from: x, reason: collision with root package name */
    public int f3929x;

    /* renamed from: y, reason: collision with root package name */
    public int f3930y;

    /* renamed from: z, reason: collision with root package name */
    public float f3931z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3894a = false;
    public k d = null;

    /* renamed from: e, reason: collision with root package name */
    public m f3901e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f3903f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f3905g = true;
    public int h = -1;
    public int i = -1;

    public d() {
        new HashMap();
        this.f3911k = false;
        this.f3913l = false;
        this.f3915m = false;
        this.f3917n = false;
        this.f3919o = -1;
        this.f3920p = -1;
        this.f3922q = 0;
        this.f3923r = 0;
        this.f3924s = 0;
        this.f3925t = new int[2];
        this.f3926u = 0;
        this.f3927v = 0;
        this.f3928w = 1.0f;
        this.f3929x = 0;
        this.f3930y = 0;
        this.f3931z = 1.0f;
        this.f3869A = -1;
        this.f3870B = 1.0f;
        this.f3871C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f3872D = RecyclerView.f1937A0;
        this.f3873E = false;
        this.F = false;
        this.f3874G = 0;
        this.f3875H = 0;
        c cVar = new c(this, 2);
        this.f3876I = cVar;
        c cVar2 = new c(this, 3);
        this.f3877J = cVar2;
        c cVar3 = new c(this, 4);
        this.f3878K = cVar3;
        c cVar4 = new c(this, 5);
        this.f3879L = cVar4;
        c cVar5 = new c(this, 6);
        this.f3880M = cVar5;
        c cVar6 = new c(this, 8);
        this.f3881N = cVar6;
        c cVar7 = new c(this, 9);
        this.f3882O = cVar7;
        c cVar8 = new c(this, 7);
        this.f3883P = cVar8;
        this.f3884Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.f3885R = arrayList;
        this.f3886S = new boolean[2];
        this.f3921p0 = new int[]{1, 1};
        this.f3887T = null;
        this.f3888U = 0;
        this.f3889V = 0;
        this.f3890W = RecyclerView.f1937A0;
        this.f3891X = -1;
        this.f3892Y = 0;
        this.f3893Z = 0;
        this.f3895a0 = 0;
        this.f3900d0 = 0.5f;
        this.f3902e0 = 0.5f;
        this.f3906g0 = 0;
        this.f3907h0 = null;
        this.f3908i0 = 0;
        this.f3910j0 = 0;
        this.f3912k0 = new float[]{-1.0f, -1.0f};
        this.f3914l0 = new d[]{null, null};
        this.f3916m0 = new d[]{null, null};
        this.f3918n0 = -1;
        this.o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f2, float f3) {
        if (f2 == f3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f2);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        G(i, 0, "      size", sb);
        G(i2, 0, "      min", sb);
        G(i3, Integer.MAX_VALUE, "      max", sb);
        G(i4, 0, "      matchMin", sb);
        G(i5, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, c cVar) {
        if (cVar.f3867f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f3867f);
        sb.append("'");
        if (cVar.h != Integer.MIN_VALUE || cVar.f3868g != 0) {
            sb.append(",");
            sb.append(cVar.f3868g);
            if (cVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        return this.f3911k || (this.f3876I.f3865c && this.f3878K.f3865c);
    }

    public boolean B() {
        return this.f3913l || (this.f3877J.f3865c && this.f3879L.f3865c);
    }

    public void C() {
        this.f3876I.j();
        this.f3877J.j();
        this.f3878K.j();
        this.f3879L.j();
        this.f3880M.j();
        this.f3881N.j();
        this.f3882O.j();
        this.f3883P.j();
        this.f3887T = null;
        this.f3872D = RecyclerView.f1937A0;
        this.f3888U = 0;
        this.f3889V = 0;
        this.f3890W = RecyclerView.f1937A0;
        this.f3891X = -1;
        this.f3892Y = 0;
        this.f3893Z = 0;
        this.f3895a0 = 0;
        this.f3897b0 = 0;
        this.f3899c0 = 0;
        this.f3900d0 = 0.5f;
        this.f3902e0 = 0.5f;
        int[] iArr = this.f3921p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f3904f0 = null;
        this.f3906g0 = 0;
        this.f3908i0 = 0;
        this.f3910j0 = 0;
        float[] fArr = this.f3912k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f3919o = -1;
        this.f3920p = -1;
        int[] iArr2 = this.f3871C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f3923r = 0;
        this.f3924s = 0;
        this.f3928w = 1.0f;
        this.f3931z = 1.0f;
        this.f3927v = Integer.MAX_VALUE;
        this.f3930y = Integer.MAX_VALUE;
        this.f3926u = 0;
        this.f3929x = 0;
        this.f3869A = -1;
        this.f3870B = 1.0f;
        boolean[] zArr = this.f3903f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.f3886S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f3905g = true;
        int[] iArr3 = this.f3925t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        d dVar = this.f3887T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.f3885R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.f3911k = false;
        this.f3913l = false;
        this.f3915m = false;
        this.f3917n = false;
        ArrayList arrayList = this.f3885R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            cVar.f3865c = false;
            cVar.f3864b = 0;
        }
    }

    public void F(C0372k c0372k) {
        this.f3876I.k();
        this.f3877J.k();
        this.f3878K.k();
        this.f3879L.k();
        this.f3880M.k();
        this.f3883P.k();
        this.f3881N.k();
        this.f3882O.k();
    }

    public final void I(int i) {
        this.f3895a0 = i;
        this.f3873E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.f3911k) {
            return;
        }
        this.f3876I.l(i);
        this.f3878K.l(i2);
        this.f3892Y = i;
        this.f3888U = i2 - i;
        this.f3911k = true;
    }

    public final void K(int i, int i2) {
        if (this.f3913l) {
            return;
        }
        this.f3877J.l(i);
        this.f3879L.l(i2);
        this.f3893Z = i;
        this.f3889V = i2 - i;
        if (this.f3873E) {
            this.f3880M.l(i + this.f3895a0);
        }
        this.f3913l = true;
    }

    public final void L(int i) {
        this.f3889V = i;
        int i2 = this.f3899c0;
        if (i < i2) {
            this.f3889V = i2;
        }
    }

    public final void M(int i) {
        this.f3921p0[0] = i;
    }

    public final void N(int i) {
        this.f3921p0[1] = i;
    }

    public final void O(int i) {
        this.f3888U = i;
        int i2 = this.f3897b0;
        if (i < i2) {
            this.f3888U = i2;
        }
    }

    public void P(boolean z2, boolean z3) {
        int i;
        int i2;
        k kVar = this.d;
        boolean z4 = z2 & kVar.f4115g;
        m mVar = this.f3901e;
        boolean z5 = z3 & mVar.f4115g;
        int i3 = kVar.h.f4094g;
        int i4 = mVar.h.f4094g;
        int i5 = kVar.i.f4094g;
        int i6 = mVar.i.f4094g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z4) {
            this.f3892Y = i3;
        }
        if (z5) {
            this.f3893Z = i4;
        }
        if (this.f3906g0 == 8) {
            this.f3888U = 0;
            this.f3889V = 0;
            return;
        }
        int[] iArr = this.f3921p0;
        if (z4) {
            if (iArr[0] == 1 && i8 < (i2 = this.f3888U)) {
                i8 = i2;
            }
            this.f3888U = i8;
            int i10 = this.f3897b0;
            if (i8 < i10) {
                this.f3888U = i10;
            }
        }
        if (z5) {
            if (iArr[1] == 1 && i9 < (i = this.f3889V)) {
                i9 = i;
            }
            this.f3889V = i9;
            int i11 = this.f3899c0;
            if (i9 < i11) {
                this.f3889V = i11;
            }
        }
    }

    public void Q(C0307c c0307c, boolean z2) {
        int i;
        int i2;
        m mVar;
        k kVar;
        c cVar = this.f3876I;
        c0307c.getClass();
        int n2 = C0307c.n(cVar);
        int n3 = C0307c.n(this.f3877J);
        int n4 = C0307c.n(this.f3878K);
        int n5 = C0307c.n(this.f3879L);
        if (z2 && (kVar = this.d) != null) {
            t.f fVar = kVar.h;
            if (fVar.f4095j) {
                t.f fVar2 = kVar.i;
                if (fVar2.f4095j) {
                    n2 = fVar.f4094g;
                    n4 = fVar2.f4094g;
                }
            }
        }
        if (z2 && (mVar = this.f3901e) != null) {
            t.f fVar3 = mVar.h;
            if (fVar3.f4095j) {
                t.f fVar4 = mVar.i;
                if (fVar4.f4095j) {
                    n3 = fVar3.f4094g;
                    n5 = fVar4.f4094g;
                }
            }
        }
        int i3 = n5 - n3;
        if (n4 - n2 < 0 || i3 < 0 || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE || n5 == Integer.MIN_VALUE || n5 == Integer.MAX_VALUE) {
            n2 = 0;
            n3 = 0;
            n4 = 0;
            n5 = 0;
        }
        int i4 = n4 - n2;
        int i5 = n5 - n3;
        this.f3892Y = n2;
        this.f3893Z = n3;
        if (this.f3906g0 == 8) {
            this.f3888U = 0;
            this.f3889V = 0;
            return;
        }
        int[] iArr = this.f3921p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.f3888U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.f3889V)) {
            i5 = i;
        }
        this.f3888U = i4;
        this.f3889V = i5;
        int i7 = this.f3899c0;
        if (i5 < i7) {
            this.f3889V = i7;
        }
        int i8 = this.f3897b0;
        if (i4 < i8) {
            this.f3888U = i8;
        }
        int i9 = this.f3927v;
        if (i9 > 0 && i6 == 3) {
            this.f3888U = Math.min(this.f3888U, i9);
        }
        int i10 = this.f3930y;
        if (i10 > 0 && iArr[1] == 3) {
            this.f3889V = Math.min(this.f3889V, i10);
        }
        int i11 = this.f3888U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.f3889V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(e eVar, C0307c c0307c, HashSet hashSet, int i, boolean z2) {
        if (z2) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, c0307c, this);
            hashSet.remove(this);
            b(c0307c, eVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.f3876I.f3863a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).d.a(eVar, c0307c, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.f3878K.f3863a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).d.a(eVar, c0307c, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f3877J.f3863a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).d.a(eVar, c0307c, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.f3879L.f3863a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).d.a(eVar, c0307c, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.f3880M.f3863a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).d.a(eVar, c0307c, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020e  */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(C0307c c0307c, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        boolean[] zArr;
        boolean z5;
        d dVar;
        d dVar2;
        c cVar;
        boolean[] zArr2;
        boolean z6;
        boolean z7;
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        char c2;
        boolean z10;
        boolean z11;
        int i11;
        c cVar2;
        boolean z12;
        boolean z13;
        int i12;
        int[] iArr2;
        c cVar3;
        c cVar4;
        c cVar5;
        C0310f c0310f;
        C0310f c0310f2;
        C0310f c0310f3;
        C0310f c0310f4;
        C0310f c0310f5;
        int[] iArr3;
        int i13;
        int i14;
        int i15;
        d dVar3;
        C0307c c0307c2;
        C0310f c0310f6;
        C0310f c0310f7;
        C0310f c0310f8;
        int i16;
        C0310f c0310f9;
        C0310f c0310f10;
        C0307c c0307c3;
        boolean z14;
        k kVar;
        t.f fVar;
        int i17;
        boolean x2;
        boolean y2;
        boolean z15;
        k kVar2;
        m mVar;
        boolean z16;
        boolean z17;
        ?? r10;
        c cVar6 = this.f3876I;
        C0310f k2 = c0307c.k(cVar6);
        c cVar7 = this.f3878K;
        C0310f k3 = c0307c.k(cVar7);
        c cVar8 = this.f3877J;
        C0310f k4 = c0307c.k(cVar8);
        c cVar9 = this.f3879L;
        C0310f k5 = c0307c.k(cVar9);
        c cVar10 = this.f3880M;
        C0310f k6 = c0307c.k(cVar10);
        d dVar4 = this.f3887T;
        if (dVar4 != null) {
            int[] iArr4 = dVar4.f3921p0;
            if (iArr4[0] == 2) {
                r10 = 1;
                z17 = true;
            } else {
                z17 = false;
                r10 = 1;
            }
            boolean z18 = iArr4[r10] == 2 ? r10 : false;
            int i18 = this.f3922q;
            if (i18 == r10) {
                z4 = z17;
                z3 = false;
            } else if (i18 == 2) {
                z3 = z18;
                z4 = false;
            } else if (i18 != 3) {
                z3 = z18;
                z4 = z17;
            }
            i = this.f3906g0;
            zArr = this.f3886S;
            if (i == 8) {
                ArrayList arrayList = this.f3885R;
                int size = arrayList.size();
                int i19 = 0;
                while (true) {
                    if (i19 < size) {
                        ArrayList arrayList2 = arrayList;
                        HashSet hashSet = ((c) arrayList.get(i19)).f3863a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i19++;
                        arrayList = arrayList2;
                    } else if (!zArr[0] && !zArr[1]) {
                        return;
                    }
                }
            }
            z5 = this.f3911k;
            if (!z5 || this.f3913l) {
                if (z5) {
                    c0307c.d(k2, this.f3892Y);
                    c0307c.d(k3, this.f3892Y + this.f3888U);
                    if (z4 && (dVar2 = this.f3887T) != null) {
                        e eVar = (e) dVar2;
                        WeakReference weakReference = eVar.H0;
                        if (weakReference == null || weakReference.get() == null || cVar6.d() > ((c) eVar.H0.get()).d()) {
                            eVar.H0 = new WeakReference(cVar6);
                        }
                        WeakReference weakReference2 = eVar.f3940J0;
                        if (weakReference2 == null || weakReference2.get() == null || cVar7.d() > ((c) eVar.f3940J0.get()).d()) {
                            eVar.f3940J0 = new WeakReference(cVar7);
                        }
                    }
                }
                if (this.f3913l) {
                    c0307c.d(k4, this.f3893Z);
                    c0307c.d(k5, this.f3893Z + this.f3889V);
                    HashSet hashSet2 = cVar10.f3863a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        c0307c.d(k6, this.f3893Z + this.f3895a0);
                    }
                    if (z3 && (dVar = this.f3887T) != null) {
                        e eVar2 = (e) dVar;
                        WeakReference weakReference3 = eVar2.f3938G0;
                        if (weakReference3 == null || weakReference3.get() == null || cVar8.d() > ((c) eVar2.f3938G0.get()).d()) {
                            eVar2.f3938G0 = new WeakReference(cVar8);
                        }
                        WeakReference weakReference4 = eVar2.f3939I0;
                        if (weakReference4 == null || weakReference4.get() == null || cVar9.d() > ((c) eVar2.f3939I0.get()).d()) {
                            eVar2.f3939I0 = new WeakReference(cVar9);
                        }
                    }
                }
                if (this.f3911k && this.f3913l) {
                    this.f3911k = false;
                    this.f3913l = false;
                    return;
                }
            }
            boolean[] zArr3 = this.f3903f;
            if (z2 || (kVar2 = this.d) == null || (mVar = this.f3901e) == null) {
                cVar = cVar10;
                zArr2 = zArr;
            } else {
                zArr2 = zArr;
                t.f fVar2 = kVar2.h;
                cVar = cVar10;
                if (fVar2.f4095j && kVar2.i.f4095j && mVar.h.f4095j && mVar.i.f4095j) {
                    c0307c.d(k2, fVar2.f4094g);
                    c0307c.d(k3, this.d.i.f4094g);
                    c0307c.d(k4, this.f3901e.h.f4094g);
                    c0307c.d(k5, this.f3901e.i.f4094g);
                    c0307c.d(k6, this.f3901e.f4103k.f4094g);
                    if (this.f3887T != null) {
                        if (z4 && zArr3[0] && !x()) {
                            c0307c.f(c0307c.k(this.f3887T.f3878K), k3, 0, 8);
                        }
                        if (z3 && zArr3[1] && !y()) {
                            z16 = false;
                            c0307c.f(c0307c.k(this.f3887T.f3879L), k5, 0, 8);
                            this.f3911k = z16;
                            this.f3913l = z16;
                            return;
                        }
                    }
                    z16 = false;
                    this.f3911k = z16;
                    this.f3913l = z16;
                    return;
                }
            }
            if (this.f3887T == null) {
                if (w(0)) {
                    ((e) this.f3887T).R(this, 0);
                    x2 = true;
                } else {
                    x2 = x();
                }
                if (w(1)) {
                    ((e) this.f3887T).R(this, 1);
                    y2 = true;
                } else {
                    y2 = y();
                }
                if (!x2 && z4 && this.f3906g0 != 8 && cVar6.f3867f == null && cVar7.f3867f == null) {
                    z15 = x2;
                    c0307c.f(c0307c.k(this.f3887T.f3878K), k3, 0, 1);
                } else {
                    z15 = x2;
                }
                if (!y2 && z3 && this.f3906g0 != 8 && cVar8.f3867f == null && cVar9.f3867f == null && cVar == null) {
                    c0307c.f(c0307c.k(this.f3887T.f3879L), k5, 0, 1);
                }
                z6 = y2;
                z7 = z15;
            } else {
                z6 = false;
                z7 = false;
            }
            i2 = this.f3888U;
            i3 = this.f3897b0;
            if (i2 >= i3) {
                i3 = i2;
            }
            i4 = this.f3889V;
            i5 = this.f3899c0;
            if (i4 >= i5) {
                i5 = i4;
            }
            int[] iArr5 = this.f3921p0;
            int i20 = iArr5[0];
            int i21 = i3;
            boolean z19 = i20 == 3;
            int i22 = iArr5[1];
            int i23 = i5;
            boolean z20 = i22 == 3;
            int i24 = this.f3891X;
            this.f3869A = i24;
            f2 = this.f3890W;
            this.f3870B = f2;
            int i25 = this.f3923r;
            int i26 = this.f3924s;
            if (f2 <= RecyclerView.f1937A0) {
                iArr = iArr5;
                if (this.f3906g0 != 8) {
                    if (i20 == 3 && i25 == 0) {
                        i25 = 3;
                    }
                    if (i22 == 3 && i26 == 0) {
                        i26 = 3;
                    }
                    if (i20 == 3 && i22 == 3 && i25 == 3 && i26 == 3) {
                        if (i24 == -1) {
                            if (z19 && !z20) {
                                this.f3869A = 0;
                            } else if (!z19 && z20) {
                                this.f3869A = 1;
                                if (i24 == -1) {
                                    this.f3870B = 1.0f / f2;
                                }
                            }
                        }
                        if (this.f3869A == 0 && (!cVar8.h() || !cVar9.h())) {
                            this.f3869A = 1;
                        } else if (this.f3869A == 1 && (!cVar6.h() || !cVar7.h())) {
                            this.f3869A = 0;
                        }
                        if (this.f3869A == -1 && (!cVar8.h() || !cVar9.h() || !cVar6.h() || !cVar7.h())) {
                            if (cVar8.h() && cVar9.h()) {
                                this.f3869A = 0;
                            } else if (cVar6.h() && cVar7.h()) {
                                this.f3870B = 1.0f / this.f3870B;
                                this.f3869A = 1;
                            }
                        }
                        if (this.f3869A == -1) {
                            int i27 = this.f3926u;
                            if (i27 > 0 && this.f3929x == 0) {
                                this.f3869A = 0;
                            } else if (i27 == 0 && this.f3929x > 0) {
                                this.f3870B = 1.0f / this.f3870B;
                                this.f3869A = 1;
                            }
                        }
                    } else {
                        if (i20 == 3 && i25 == 3) {
                            this.f3869A = 0;
                            i8 = (int) (f2 * i4);
                            if (i22 != 3) {
                                i7 = i26;
                                i9 = i23;
                                z8 = false;
                                i6 = 4;
                                int[] iArr6 = this.f3925t;
                                iArr6[0] = i6;
                                iArr6[1] = i7;
                                if (z8) {
                                }
                                z9 = false;
                                if (z8) {
                                }
                                c2 = 0;
                                z10 = false;
                                if (iArr[c2] != 2) {
                                }
                                if (!z11) {
                                }
                                cVar2 = this.f3883P;
                                z12 = !cVar2.h();
                                z13 = zArr2[0];
                                boolean z21 = zArr2[1];
                                i12 = this.f3919o;
                                iArr2 = this.f3871C;
                                if (i12 != 2) {
                                }
                                cVar3 = cVar9;
                                cVar4 = cVar2;
                                cVar5 = cVar;
                                c0310f = k4;
                                c0310f2 = k6;
                                c0310f3 = k5;
                                c0310f4 = k3;
                                c0310f5 = k2;
                                iArr3 = iArr2;
                                if (z2) {
                                }
                                i16 = i15;
                                if ((dVar3.f3920p != 2 ? i14 : i16) != 0) {
                                }
                                c0310f9 = c0310f7;
                                c0310f10 = c0310f8;
                                if (z8) {
                                }
                                if (cVar4.h()) {
                                }
                                this.f3911k = false;
                                this.f3913l = false;
                            }
                            i6 = i25;
                            i7 = i26;
                            i9 = i23;
                            z8 = true;
                            int[] iArr62 = this.f3925t;
                            iArr62[0] = i6;
                            iArr62[1] = i7;
                            if (z8) {
                            }
                            z9 = false;
                            if (z8) {
                            }
                            c2 = 0;
                            z10 = false;
                            if (iArr[c2] != 2) {
                            }
                            if (!z11) {
                            }
                            cVar2 = this.f3883P;
                            z12 = !cVar2.h();
                            z13 = zArr2[0];
                            boolean z212 = zArr2[1];
                            i12 = this.f3919o;
                            iArr2 = this.f3871C;
                            if (i12 != 2) {
                            }
                            cVar3 = cVar9;
                            cVar4 = cVar2;
                            cVar5 = cVar;
                            c0310f = k4;
                            c0310f2 = k6;
                            c0310f3 = k5;
                            c0310f4 = k3;
                            c0310f5 = k2;
                            iArr3 = iArr2;
                            if (z2) {
                            }
                            i16 = i15;
                            if ((dVar3.f3920p != 2 ? i14 : i16) != 0) {
                            }
                            c0310f9 = c0310f7;
                            c0310f10 = c0310f8;
                            if (z8) {
                            }
                            if (cVar4.h()) {
                            }
                            this.f3911k = false;
                            this.f3913l = false;
                        }
                        if (i22 == 3 && i26 == 3) {
                            this.f3869A = 1;
                            if (i24 == -1) {
                                this.f3870B = 1.0f / f2;
                            }
                            i9 = (int) (this.f3870B * i2);
                            i6 = i25;
                            if (i20 == 3) {
                                i7 = i26;
                                i8 = i21;
                                z8 = true;
                                int[] iArr622 = this.f3925t;
                                iArr622[0] = i6;
                                iArr622[1] = i7;
                                if (z8) {
                                }
                                z9 = false;
                                if (z8) {
                                }
                                c2 = 0;
                                z10 = false;
                                if (iArr[c2] != 2) {
                                }
                                if (!z11) {
                                }
                                cVar2 = this.f3883P;
                                z12 = !cVar2.h();
                                z13 = zArr2[0];
                                boolean z2122 = zArr2[1];
                                i12 = this.f3919o;
                                iArr2 = this.f3871C;
                                if (i12 != 2) {
                                }
                                cVar3 = cVar9;
                                cVar4 = cVar2;
                                cVar5 = cVar;
                                c0310f = k4;
                                c0310f2 = k6;
                                c0310f3 = k5;
                                c0310f4 = k3;
                                c0310f5 = k2;
                                iArr3 = iArr2;
                                if (z2) {
                                }
                                i16 = i15;
                                if ((dVar3.f3920p != 2 ? i14 : i16) != 0) {
                                }
                                c0310f9 = c0310f7;
                                c0310f10 = c0310f8;
                                if (z8) {
                                }
                                if (cVar4.h()) {
                                }
                                this.f3911k = false;
                                this.f3913l = false;
                            }
                            i8 = i21;
                            z8 = false;
                            i7 = 4;
                            int[] iArr6222 = this.f3925t;
                            iArr6222[0] = i6;
                            iArr6222[1] = i7;
                            if (z8) {
                                int i28 = this.f3869A;
                                i10 = -1;
                                if (i28 == 0 || i28 == -1) {
                                    z9 = true;
                                    if (z8 || !((i17 = this.f3869A) == 1 || i17 == i10)) {
                                        c2 = 0;
                                        z10 = false;
                                    } else {
                                        c2 = 0;
                                        z10 = true;
                                    }
                                    z11 = iArr[c2] != 2 && (this instanceof e);
                                    i11 = !z11 ? 0 : i8;
                                    cVar2 = this.f3883P;
                                    z12 = !cVar2.h();
                                    z13 = zArr2[0];
                                    boolean z21222 = zArr2[1];
                                    i12 = this.f3919o;
                                    iArr2 = this.f3871C;
                                    if (i12 != 2 && !this.f3911k) {
                                        if (z2 && (kVar = this.d) != null) {
                                            fVar = kVar.h;
                                            if (fVar.f4095j && kVar.i.f4095j) {
                                                if (!z2) {
                                                    c0307c.d(k2, fVar.f4094g);
                                                    c0307c.d(k3, this.d.i.f4094g);
                                                    if (this.f3887T != null && z4 && zArr3[0] && !x()) {
                                                        c0307c.f(c0307c.k(this.f3887T.f3878K), k3, 0, 8);
                                                    }
                                                    c0310f4 = k3;
                                                    c0310f5 = k2;
                                                    cVar3 = cVar9;
                                                    cVar4 = cVar2;
                                                    cVar5 = cVar;
                                                    c0310f = k4;
                                                    c0310f2 = k6;
                                                    c0310f3 = k5;
                                                    iArr3 = iArr2;
                                                    if (z2) {
                                                        dVar3 = this;
                                                        m mVar2 = dVar3.f3901e;
                                                        if (mVar2 != null) {
                                                            t.f fVar3 = mVar2.h;
                                                            if (fVar3.f4095j && mVar2.i.f4095j) {
                                                                c0307c2 = c0307c;
                                                                c0310f8 = c0310f;
                                                                c0307c2.d(c0310f8, fVar3.f4094g);
                                                                c0310f7 = c0310f3;
                                                                c0307c2.d(c0310f7, dVar3.f3901e.i.f4094g);
                                                                c0310f6 = c0310f2;
                                                                c0307c2.d(c0310f6, dVar3.f3901e.f4103k.f4094g);
                                                                d dVar5 = dVar3.f3887T;
                                                                if (dVar5 == null || z6 || !z3) {
                                                                    i13 = 8;
                                                                    i14 = 0;
                                                                    i15 = 1;
                                                                } else {
                                                                    i15 = 1;
                                                                    if (zArr3[1]) {
                                                                        i13 = 8;
                                                                        i14 = 0;
                                                                        c0307c2.f(c0307c2.k(dVar5.f3879L), c0310f7, 0, 8);
                                                                    } else {
                                                                        i13 = 8;
                                                                        i14 = 0;
                                                                    }
                                                                }
                                                                i16 = i14;
                                                                if ((dVar3.f3920p != 2 ? i14 : i16) != 0 || dVar3.f3913l) {
                                                                    c0310f9 = c0310f7;
                                                                    c0310f10 = c0310f8;
                                                                } else {
                                                                    boolean z22 = (iArr[i15] == 2 && (dVar3 instanceof e)) ? i15 : i14;
                                                                    if (z22) {
                                                                        i9 = i14;
                                                                    }
                                                                    d dVar6 = dVar3.f3887T;
                                                                    C0310f k7 = dVar6 != null ? c0307c2.k(dVar6.f3879L) : null;
                                                                    d dVar7 = dVar3.f3887T;
                                                                    C0310f k8 = dVar7 != null ? c0307c2.k(dVar7.f3877J) : null;
                                                                    int i29 = dVar3.f3895a0;
                                                                    if (i29 > 0 || dVar3.f3906g0 == i13) {
                                                                        c cVar11 = cVar5;
                                                                        if (cVar11.f3867f != null) {
                                                                            c0307c2.e(c0310f6, c0310f8, i29, i13);
                                                                            c0307c2.e(c0310f6, c0307c2.k(cVar11.f3867f), cVar11.e(), i13);
                                                                            if (z3) {
                                                                                c0307c2.f(k7, c0307c2.k(cVar3), i14, 5);
                                                                            }
                                                                            z14 = i14;
                                                                            c0310f9 = c0310f7;
                                                                            c0310f10 = c0310f8;
                                                                            d(c0307c, false, z3, z4, zArr3[i15], k8, k7, iArr[i15], z22, dVar3.f3877J, dVar3.f3879L, dVar3.f3893Z, i9, dVar3.f3899c0, iArr3[i15], dVar3.f3902e0, z10, iArr[i14] != 3 ? i15 : i14, z6, z7, z21222, i7, i6, dVar3.f3929x, dVar3.f3930y, dVar3.f3931z, z14);
                                                                        } else if (dVar3.f3906g0 == i13) {
                                                                            c0307c2.e(c0310f6, c0310f8, cVar11.e(), i13);
                                                                        } else {
                                                                            c0307c2.e(c0310f6, c0310f8, i29, i13);
                                                                        }
                                                                    }
                                                                    z14 = z12;
                                                                    c0310f9 = c0310f7;
                                                                    c0310f10 = c0310f8;
                                                                    d(c0307c, false, z3, z4, zArr3[i15], k8, k7, iArr[i15], z22, dVar3.f3877J, dVar3.f3879L, dVar3.f3893Z, i9, dVar3.f3899c0, iArr3[i15], dVar3.f3902e0, z10, iArr[i14] != 3 ? i15 : i14, z6, z7, z21222, i7, i6, dVar3.f3929x, dVar3.f3930y, dVar3.f3931z, z14);
                                                                }
                                                                if (z8) {
                                                                    c0307c3 = c0307c;
                                                                } else if (this.f3869A == 1) {
                                                                    float f3 = this.f3870B;
                                                                    C0306b l2 = c0307c.l();
                                                                    l2.d.g(c0310f9, -1.0f);
                                                                    l2.d.g(c0310f10, 1.0f);
                                                                    l2.d.g(c0310f4, f3);
                                                                    l2.d.g(c0310f5, -f3);
                                                                    c0307c3 = c0307c;
                                                                    c0307c3.c(l2);
                                                                } else {
                                                                    c0307c3 = c0307c;
                                                                    float f4 = this.f3870B;
                                                                    C0306b l3 = c0307c.l();
                                                                    l3.d.g(c0310f4, -1.0f);
                                                                    l3.d.g(c0310f5, 1.0f);
                                                                    l3.d.g(c0310f9, f4);
                                                                    l3.d.g(c0310f10, -f4);
                                                                    c0307c3.c(l3);
                                                                }
                                                                if (cVar4.h()) {
                                                                    c cVar12 = cVar4;
                                                                    d dVar8 = cVar12.f3867f.d;
                                                                    float radians = (float) Math.toRadians(this.f3872D + 90.0f);
                                                                    int e2 = cVar12.e();
                                                                    C0310f k9 = c0307c3.k(i(2));
                                                                    C0310f k10 = c0307c3.k(i(3));
                                                                    C0310f k11 = c0307c3.k(i(4));
                                                                    C0310f k12 = c0307c3.k(i(5));
                                                                    C0310f k13 = c0307c3.k(dVar8.i(2));
                                                                    C0310f k14 = c0307c3.k(dVar8.i(3));
                                                                    C0310f k15 = c0307c3.k(dVar8.i(4));
                                                                    C0310f k16 = c0307c3.k(dVar8.i(5));
                                                                    C0306b l4 = c0307c.l();
                                                                    double d = radians;
                                                                    double d2 = e2;
                                                                    float sin = (float) (Math.sin(d) * d2);
                                                                    l4.d.g(k14, 0.5f);
                                                                    l4.d.g(k16, 0.5f);
                                                                    l4.d.g(k10, -0.5f);
                                                                    l4.d.g(k12, -0.5f);
                                                                    l4.f3719b = -sin;
                                                                    c0307c3.c(l4);
                                                                    C0306b l5 = c0307c.l();
                                                                    float cos = (float) (Math.cos(d) * d2);
                                                                    l5.d.g(k13, 0.5f);
                                                                    l5.d.g(k15, 0.5f);
                                                                    l5.d.g(k9, -0.5f);
                                                                    l5.d.g(k11, -0.5f);
                                                                    l5.f3719b = -cos;
                                                                    c0307c3.c(l5);
                                                                }
                                                                this.f3911k = false;
                                                                this.f3913l = false;
                                                            }
                                                        }
                                                        c0307c2 = c0307c;
                                                        c0310f6 = c0310f2;
                                                        c0310f7 = c0310f3;
                                                        c0310f8 = c0310f;
                                                        i13 = 8;
                                                        i14 = 0;
                                                        i15 = 1;
                                                    } else {
                                                        i13 = 8;
                                                        i14 = 0;
                                                        i15 = 1;
                                                        dVar3 = this;
                                                        c0307c2 = c0307c;
                                                        c0310f6 = c0310f2;
                                                        c0310f7 = c0310f3;
                                                        c0310f8 = c0310f;
                                                    }
                                                    i16 = i15;
                                                    if ((dVar3.f3920p != 2 ? i14 : i16) != 0) {
                                                    }
                                                    c0310f9 = c0310f7;
                                                    c0310f10 = c0310f8;
                                                    if (z8) {
                                                    }
                                                    if (cVar4.h()) {
                                                    }
                                                    this.f3911k = false;
                                                    this.f3913l = false;
                                                }
                                            }
                                        }
                                        d dVar9 = this.f3887T;
                                        C0310f k17 = dVar9 == null ? c0307c.k(dVar9.f3878K) : null;
                                        d dVar10 = this.f3887T;
                                        c0310f2 = k6;
                                        cVar5 = cVar;
                                        c0310f3 = k5;
                                        iArr3 = iArr2;
                                        cVar3 = cVar9;
                                        c0310f = k4;
                                        c0310f4 = k3;
                                        cVar4 = cVar2;
                                        c0310f5 = k2;
                                        d(c0307c, true, z4, z3, zArr3[0], dVar10 == null ? c0307c.k(dVar10.f3876I) : null, k17, iArr[0], z11, this.f3876I, this.f3878K, this.f3892Y, i11, this.f3897b0, iArr2[0], this.f3900d0, z9, iArr[1] != 3, z7, z6, z13, i6, i7, this.f3926u, this.f3927v, this.f3928w, z12);
                                        if (z2) {
                                        }
                                        i16 = i15;
                                        if ((dVar3.f3920p != 2 ? i14 : i16) != 0) {
                                        }
                                        c0310f9 = c0310f7;
                                        c0310f10 = c0310f8;
                                        if (z8) {
                                        }
                                        if (cVar4.h()) {
                                        }
                                        this.f3911k = false;
                                        this.f3913l = false;
                                    }
                                    cVar3 = cVar9;
                                    cVar4 = cVar2;
                                    cVar5 = cVar;
                                    c0310f = k4;
                                    c0310f2 = k6;
                                    c0310f3 = k5;
                                    c0310f4 = k3;
                                    c0310f5 = k2;
                                    iArr3 = iArr2;
                                    if (z2) {
                                    }
                                    i16 = i15;
                                    if ((dVar3.f3920p != 2 ? i14 : i16) != 0) {
                                    }
                                    c0310f9 = c0310f7;
                                    c0310f10 = c0310f8;
                                    if (z8) {
                                    }
                                    if (cVar4.h()) {
                                    }
                                    this.f3911k = false;
                                    this.f3913l = false;
                                }
                            } else {
                                i10 = -1;
                            }
                            z9 = false;
                            if (z8) {
                            }
                            c2 = 0;
                            z10 = false;
                            if (iArr[c2] != 2) {
                            }
                            if (!z11) {
                            }
                            cVar2 = this.f3883P;
                            z12 = !cVar2.h();
                            z13 = zArr2[0];
                            boolean z212222 = zArr2[1];
                            i12 = this.f3919o;
                            iArr2 = this.f3871C;
                            if (i12 != 2) {
                                if (z2) {
                                    fVar = kVar.h;
                                    if (fVar.f4095j) {
                                        if (!z2) {
                                        }
                                    }
                                }
                                d dVar92 = this.f3887T;
                                if (dVar92 == null) {
                                }
                                d dVar102 = this.f3887T;
                                if (dVar102 == null) {
                                }
                                c0310f2 = k6;
                                cVar5 = cVar;
                                c0310f3 = k5;
                                iArr3 = iArr2;
                                cVar3 = cVar9;
                                c0310f = k4;
                                c0310f4 = k3;
                                cVar4 = cVar2;
                                c0310f5 = k2;
                                d(c0307c, true, z4, z3, zArr3[0], dVar102 == null ? c0307c.k(dVar102.f3876I) : null, k17, iArr[0], z11, this.f3876I, this.f3878K, this.f3892Y, i11, this.f3897b0, iArr2[0], this.f3900d0, z9, iArr[1] != 3, z7, z6, z13, i6, i7, this.f3926u, this.f3927v, this.f3928w, z12);
                                if (z2) {
                                }
                                i16 = i15;
                                if ((dVar3.f3920p != 2 ? i14 : i16) != 0) {
                                }
                                c0310f9 = c0310f7;
                                c0310f10 = c0310f8;
                                if (z8) {
                                }
                                if (cVar4.h()) {
                                }
                                this.f3911k = false;
                                this.f3913l = false;
                            }
                            cVar3 = cVar9;
                            cVar4 = cVar2;
                            cVar5 = cVar;
                            c0310f = k4;
                            c0310f2 = k6;
                            c0310f3 = k5;
                            c0310f4 = k3;
                            c0310f5 = k2;
                            iArr3 = iArr2;
                            if (z2) {
                            }
                            i16 = i15;
                            if ((dVar3.f3920p != 2 ? i14 : i16) != 0) {
                            }
                            c0310f9 = c0310f7;
                            c0310f10 = c0310f8;
                            if (z8) {
                            }
                            if (cVar4.h()) {
                            }
                            this.f3911k = false;
                            this.f3913l = false;
                        }
                    }
                    i6 = i25;
                    i7 = i26;
                    i8 = i21;
                    i9 = i23;
                    z8 = true;
                    int[] iArr62222 = this.f3925t;
                    iArr62222[0] = i6;
                    iArr62222[1] = i7;
                    if (z8) {
                    }
                    z9 = false;
                    if (z8) {
                    }
                    c2 = 0;
                    z10 = false;
                    if (iArr[c2] != 2) {
                    }
                    if (!z11) {
                    }
                    cVar2 = this.f3883P;
                    z12 = !cVar2.h();
                    z13 = zArr2[0];
                    boolean z2122222 = zArr2[1];
                    i12 = this.f3919o;
                    iArr2 = this.f3871C;
                    if (i12 != 2) {
                    }
                    cVar3 = cVar9;
                    cVar4 = cVar2;
                    cVar5 = cVar;
                    c0310f = k4;
                    c0310f2 = k6;
                    c0310f3 = k5;
                    c0310f4 = k3;
                    c0310f5 = k2;
                    iArr3 = iArr2;
                    if (z2) {
                    }
                    i16 = i15;
                    if ((dVar3.f3920p != 2 ? i14 : i16) != 0) {
                    }
                    c0310f9 = c0310f7;
                    c0310f10 = c0310f8;
                    if (z8) {
                    }
                    if (cVar4.h()) {
                    }
                    this.f3911k = false;
                    this.f3913l = false;
                }
            } else {
                iArr = iArr5;
            }
            i6 = i25;
            i7 = i26;
            i8 = i21;
            i9 = i23;
            z8 = false;
            int[] iArr622222 = this.f3925t;
            iArr622222[0] = i6;
            iArr622222[1] = i7;
            if (z8) {
            }
            z9 = false;
            if (z8) {
            }
            c2 = 0;
            z10 = false;
            if (iArr[c2] != 2) {
            }
            if (!z11) {
            }
            cVar2 = this.f3883P;
            z12 = !cVar2.h();
            z13 = zArr2[0];
            boolean z21222222 = zArr2[1];
            i12 = this.f3919o;
            iArr2 = this.f3871C;
            if (i12 != 2) {
            }
            cVar3 = cVar9;
            cVar4 = cVar2;
            cVar5 = cVar;
            c0310f = k4;
            c0310f2 = k6;
            c0310f3 = k5;
            c0310f4 = k3;
            c0310f5 = k2;
            iArr3 = iArr2;
            if (z2) {
            }
            i16 = i15;
            if ((dVar3.f3920p != 2 ? i14 : i16) != 0) {
            }
            c0310f9 = c0310f7;
            c0310f10 = c0310f8;
            if (z8) {
            }
            if (cVar4.h()) {
            }
            this.f3911k = false;
            this.f3913l = false;
        }
        z3 = false;
        z4 = false;
        i = this.f3906g0;
        zArr = this.f3886S;
        if (i == 8) {
        }
        z5 = this.f3911k;
        if (!z5) {
        }
        if (z5) {
        }
        if (this.f3913l) {
        }
        if (this.f3911k) {
            this.f3911k = false;
            this.f3913l = false;
            return;
        }
        boolean[] zArr32 = this.f3903f;
        if (z2) {
        }
        cVar = cVar10;
        zArr2 = zArr;
        if (this.f3887T == null) {
        }
        i2 = this.f3888U;
        i3 = this.f3897b0;
        if (i2 >= i3) {
        }
        i4 = this.f3889V;
        i5 = this.f3899c0;
        if (i4 >= i5) {
        }
        int[] iArr52 = this.f3921p0;
        int i202 = iArr52[0];
        int i212 = i3;
        if (i202 == 3) {
        }
        int i222 = iArr52[1];
        int i232 = i5;
        if (i222 == 3) {
        }
        int i242 = this.f3891X;
        this.f3869A = i242;
        f2 = this.f3890W;
        this.f3870B = f2;
        int i252 = this.f3923r;
        int i262 = this.f3924s;
        if (f2 <= RecyclerView.f1937A0) {
        }
        i6 = i252;
        i7 = i262;
        i8 = i212;
        i9 = i232;
        z8 = false;
        int[] iArr6222222 = this.f3925t;
        iArr6222222[0] = i6;
        iArr6222222[1] = i7;
        if (z8) {
        }
        z9 = false;
        if (z8) {
        }
        c2 = 0;
        z10 = false;
        if (iArr[c2] != 2) {
        }
        if (!z11) {
        }
        cVar2 = this.f3883P;
        z12 = !cVar2.h();
        z13 = zArr2[0];
        boolean z212222222 = zArr2[1];
        i12 = this.f3919o;
        iArr2 = this.f3871C;
        if (i12 != 2) {
        }
        cVar3 = cVar9;
        cVar4 = cVar2;
        cVar5 = cVar;
        c0310f = k4;
        c0310f2 = k6;
        c0310f3 = k5;
        c0310f4 = k3;
        c0310f5 = k2;
        iArr3 = iArr2;
        if (z2) {
        }
        i16 = i15;
        if ((dVar3.f3920p != 2 ? i14 : i16) != 0) {
        }
        c0310f9 = c0310f7;
        c0310f10 = c0310f8;
        if (z8) {
        }
        if (cVar4.h()) {
        }
        this.f3911k = false;
        this.f3913l = false;
    }

    public boolean c() {
        return this.f3906g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0455 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(C0307c c0307c, boolean z2, boolean z3, boolean z4, boolean z5, C0310f c0310f, C0310f c0310f2, int i, boolean z6, c cVar, c cVar2, int i2, int i3, int i4, int i5, float f2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i6, int i7, int i8, int i9, float f3, boolean z12) {
        boolean z13;
        boolean z14;
        int i10;
        boolean z15;
        int i11;
        int i12;
        int i13;
        boolean z16;
        boolean z17;
        C0310f k2;
        C0310f k3;
        C0310f c0310f3;
        C0310f c0310f4;
        C0310f c0310f5;
        C0310f c0310f6;
        boolean z18;
        int i14;
        char c2;
        int i15;
        c cVar3;
        C0310f c0310f7;
        int i16;
        boolean z19;
        C0310f c0310f8;
        boolean z20;
        boolean z21;
        int i17;
        int i18;
        C0310f c0310f9;
        int i19;
        boolean z22;
        int i20;
        boolean z23;
        c cVar4;
        C0310f c0310f10;
        C0310f c0310f11;
        boolean z24;
        int i21;
        d dVar;
        boolean z25;
        int i22;
        d dVar2;
        d dVar3;
        C0310f c0310f12;
        C0310f c0310f13;
        boolean z26;
        boolean z27;
        C0310f c0310f14;
        C0310f c0310f15;
        d dVar4;
        int i23;
        int i24;
        HashSet hashSet;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z28;
        boolean z29;
        boolean z30;
        int i29;
        int i30;
        C0310f c0310f16;
        int i31;
        int i32 = i8;
        int i33 = i9;
        C0310f k4 = c0307c.k(cVar);
        C0310f k5 = c0307c.k(cVar2);
        C0310f k6 = c0307c.k(cVar.f3867f);
        C0310f k7 = c0307c.k(cVar2.f3867f);
        boolean h = cVar.h();
        boolean h2 = cVar2.h();
        boolean h3 = this.f3883P.h();
        int i34 = h2 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h3) {
            i34++;
        }
        int i35 = i34;
        int i36 = z7 ? 3 : i6;
        int a2 = AbstractC0309e.a(i);
        boolean z31 = (a2 == 0 || a2 == 1 || a2 != 2 || i36 == 4) ? false : true;
        int i37 = this.h;
        if (i37 == -1 || !z2) {
            i37 = i3;
            z13 = z31;
        } else {
            this.h = -1;
            z13 = false;
        }
        int i38 = this.i;
        if (i38 == -1 || z2) {
            z14 = z13;
        } else {
            this.i = -1;
            i37 = i38;
            z14 = false;
        }
        int i39 = i37;
        if (this.f3906g0 == 8) {
            i10 = 0;
            z14 = false;
        } else {
            i10 = i39;
        }
        if (z12) {
            if (!h && !h2 && !h3) {
                c0307c.d(k4, i2);
            } else if (h && !h2) {
                z15 = h3;
                i11 = 8;
                c0307c.e(k4, k6, cVar.e(), 8);
            }
            z15 = h3;
            i11 = 8;
        } else {
            z15 = h3;
            i11 = 8;
        }
        if (z14) {
            if (i35 == 2 || z7 || !(i36 == 1 || i36 == 0)) {
                if (i32 == -2) {
                    i32 = i10;
                }
                if (i33 == -2) {
                    i33 = i10;
                }
                if (i10 > 0 && i36 != 1) {
                    i10 = 0;
                }
                if (i32 > 0) {
                    c0307c.f(k5, k4, i32, 8);
                    i10 = Math.max(i10, i32);
                }
                if (i33 > 0) {
                    if (!z3 || i36 != 1) {
                        c0307c.g(k5, k4, i33, 8);
                    }
                    i10 = Math.min(i10, i33);
                }
                if (i36 == 1) {
                    if (z3) {
                        c0307c.e(k5, k4, i10, 8);
                    } else if (z9) {
                        c0307c.e(k5, k4, i10, 5);
                        c0307c.g(k5, k4, i10, 8);
                    } else {
                        c0307c.e(k5, k4, i10, 5);
                        c0307c.g(k5, k4, i10, 8);
                    }
                } else if (i36 == 2) {
                    int i40 = cVar.f3866e;
                    if (i40 == 3 || i40 == 5) {
                        k2 = c0307c.k(this.f3887T.i(3));
                        k3 = c0307c.k(this.f3887T.i(5));
                    } else {
                        k2 = c0307c.k(this.f3887T.i(2));
                        k3 = c0307c.k(this.f3887T.i(4));
                    }
                    C0306b l2 = c0307c.l();
                    i12 = i35;
                    l2.d.g(k5, -1.0f);
                    l2.d.g(k4, 1.0f);
                    l2.d.g(k3, f3);
                    l2.d.g(k2, -f3);
                    c0307c.c(l2);
                    z17 = z5;
                    i13 = i32;
                    z16 = z3 ? false : z14;
                } else {
                    i12 = i35;
                    i13 = i32;
                    z16 = z14;
                    z17 = true;
                }
            } else {
                int max = Math.max(i32, i10);
                if (i33 > 0) {
                    max = Math.min(i33, max);
                }
                c0307c.e(k5, k4, max, 8);
                z17 = z5;
                i12 = i35;
                z16 = false;
                i13 = i32;
            }
            if (z12) {
                c0310f3 = c0310f;
                c0310f4 = c0310f2;
                c0310f5 = k5;
                c0310f6 = k4;
                z18 = z17;
                i14 = i12;
                c2 = 1;
                i15 = 2;
            } else if (z9) {
                c0310f3 = c0310f;
                c0310f4 = c0310f2;
                c0310f5 = k5;
                c0310f6 = k4;
                z18 = z17;
                i14 = i12;
                i15 = 2;
                c2 = 1;
            } else {
                if (!h && !h2 && !z15) {
                    cVar4 = cVar2;
                    c0310f15 = k5;
                    z24 = z17;
                    c0310f14 = k7;
                } else if (!h || h2) {
                    if (h || !h2) {
                        c0310f7 = k7;
                        if (h && h2) {
                            d dVar5 = cVar.f3867f.d;
                            d dVar6 = cVar2.f3867f.d;
                            d dVar7 = this.f3887T;
                            int i41 = 6;
                            if (z16) {
                                if (i36 != 0) {
                                    if (i36 == 2) {
                                        if ((dVar5 instanceof C0316a) || (dVar6 instanceof C0316a)) {
                                            i16 = i36;
                                            i17 = 6;
                                            i18 = 5;
                                            z19 = true;
                                            z20 = true;
                                            z21 = true;
                                            z22 = false;
                                            i20 = 4;
                                        } else {
                                            i16 = i36;
                                            i17 = 6;
                                            i18 = 5;
                                            z19 = true;
                                            z20 = true;
                                            z21 = true;
                                            z22 = false;
                                            i20 = 5;
                                        }
                                    } else if (i36 == 1) {
                                        i16 = i36;
                                        i17 = 6;
                                        i18 = 8;
                                        z19 = true;
                                        z20 = true;
                                        z21 = true;
                                        z22 = false;
                                        i20 = 4;
                                    } else if (i36 == 3) {
                                        i16 = i36;
                                        if (this.f3869A == -1) {
                                            if (z10) {
                                                c0310f8 = c0310f2;
                                                i18 = 8;
                                                z19 = true;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                                i17 = z3 ? 5 : 4;
                                            } else {
                                                c0310f8 = c0310f2;
                                                i18 = 8;
                                                z19 = true;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                                i17 = 8;
                                            }
                                        } else if (z7) {
                                            if (i7 != 2) {
                                                z19 = true;
                                                if (i7 != 1) {
                                                    i18 = 8;
                                                    i27 = 5;
                                                    i20 = i27;
                                                    z20 = z19;
                                                    z21 = z20;
                                                    z22 = z21;
                                                    i17 = 6;
                                                }
                                            } else {
                                                z19 = true;
                                            }
                                            i18 = 5;
                                            i27 = 4;
                                            i20 = i27;
                                            z20 = z19;
                                            z21 = z20;
                                            z22 = z21;
                                            i17 = 6;
                                        } else {
                                            z19 = true;
                                            if (i33 > 0) {
                                                c0310f8 = c0310f2;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                                i17 = 6;
                                                i18 = 5;
                                            } else {
                                                if (i33 != 0 || i13 != 0) {
                                                    c0310f8 = c0310f2;
                                                    z20 = true;
                                                    z21 = true;
                                                    z22 = true;
                                                    i17 = 6;
                                                    i18 = 5;
                                                } else if (z10) {
                                                    i18 = (dVar5 == dVar7 || dVar6 == dVar7) ? 5 : 4;
                                                    c0310f8 = c0310f2;
                                                    z20 = true;
                                                    z21 = true;
                                                    z22 = true;
                                                    i17 = 6;
                                                } else {
                                                    c0310f8 = c0310f2;
                                                    z20 = true;
                                                    z21 = true;
                                                    z22 = true;
                                                    i17 = 6;
                                                    i18 = 5;
                                                    i20 = 8;
                                                    if (z21 || k6 != c0310f7 || dVar5 == dVar7) {
                                                        z23 = z19;
                                                    } else {
                                                        z21 = false;
                                                        z23 = false;
                                                    }
                                                    if (z20) {
                                                        if (z16 || z8 || z10 || k6 != c0310f || c0310f7 != c0310f8) {
                                                            z26 = z3;
                                                            i25 = i17;
                                                            i26 = i18;
                                                        } else {
                                                            z26 = false;
                                                            i26 = 8;
                                                            z23 = false;
                                                            i25 = 8;
                                                        }
                                                        dVar2 = dVar6;
                                                        cVar4 = cVar2;
                                                        z24 = z17;
                                                        dVar3 = dVar5;
                                                        i21 = i13;
                                                        c0310f10 = c0310f7;
                                                        i22 = 4;
                                                        z25 = true;
                                                        c0310f12 = k6;
                                                        dVar = dVar7;
                                                        c0310f11 = k5;
                                                        c0310f13 = k4;
                                                        c0307c.b(k4, k6, cVar.e(), f2, c0310f7, k5, cVar2.e(), i25);
                                                        i18 = i26;
                                                    } else {
                                                        cVar4 = cVar2;
                                                        c0310f10 = c0310f7;
                                                        c0310f11 = k5;
                                                        z24 = z17;
                                                        i21 = i13;
                                                        dVar = dVar7;
                                                        z25 = z19;
                                                        i22 = 4;
                                                        dVar2 = dVar6;
                                                        dVar3 = dVar5;
                                                        c0310f12 = k6;
                                                        c0310f13 = k4;
                                                        z26 = z3;
                                                    }
                                                    z27 = z23;
                                                    if (this.f3906g0 != 8 && ((hashSet = cVar4.f3863a) == null || hashSet.size() <= 0)) {
                                                        return;
                                                    }
                                                    c0310f14 = c0310f10;
                                                    if (z21) {
                                                        if (z26 && c0310f12 != c0310f14 && !z16 && ((dVar3 instanceof C0316a) || (dVar2 instanceof C0316a))) {
                                                            i18 = 6;
                                                        }
                                                        c0307c.f(c0310f13, c0310f12, cVar.e(), i18);
                                                        c0310f15 = c0310f11;
                                                        c0307c.g(c0310f15, c0310f14, -cVar2.e(), i18);
                                                    } else {
                                                        c0310f15 = c0310f11;
                                                    }
                                                    if (z26 || !z11 || (dVar3 instanceof C0316a) || (dVar2 instanceof C0316a)) {
                                                        dVar4 = dVar;
                                                    } else {
                                                        dVar4 = dVar;
                                                        if (dVar2 != dVar4) {
                                                            i18 = 6;
                                                            i23 = 6;
                                                            z27 = z25;
                                                            if (z27) {
                                                                if (z22 && (!z10 || z4)) {
                                                                    if (dVar3 != dVar4 && dVar2 != dVar4) {
                                                                        i41 = i23;
                                                                    }
                                                                    if ((dVar3 instanceof h) || (dVar2 instanceof h)) {
                                                                        i41 = 5;
                                                                    }
                                                                    if ((dVar3 instanceof C0316a) || (dVar2 instanceof C0316a)) {
                                                                        i41 = 5;
                                                                    }
                                                                    i23 = Math.max(z10 ? 5 : i41, i23);
                                                                }
                                                                int i42 = i23;
                                                                if (z26) {
                                                                    i42 = Math.min(i18, i42);
                                                                    if (z7 && !z10 && (dVar3 == dVar4 || dVar2 == dVar4)) {
                                                                        i42 = i22;
                                                                    }
                                                                }
                                                                c0307c.e(c0310f13, c0310f12, cVar.e(), i42);
                                                                c0307c.e(c0310f15, c0310f14, -cVar2.e(), i42);
                                                            }
                                                            if (z26) {
                                                                C0310f c0310f17 = c0310f12;
                                                                int e2 = c0310f == c0310f17 ? cVar.e() : 0;
                                                                if (c0310f17 != c0310f) {
                                                                    c0307c.f(c0310f13, c0310f, e2, 5);
                                                                }
                                                            }
                                                            if (z26 && z16 && i4 == 0 && i21 == 0) {
                                                                if (z16 || i16 != 3) {
                                                                    i24 = 5;
                                                                    c0307c.f(c0310f15, c0310f13, 0, 5);
                                                                } else {
                                                                    c0307c.f(c0310f15, c0310f13, 0, 8);
                                                                }
                                                            }
                                                            i24 = 5;
                                                        }
                                                    }
                                                    i23 = i20;
                                                    if (z27) {
                                                    }
                                                    if (z26) {
                                                    }
                                                    if (z26) {
                                                        if (z16) {
                                                        }
                                                        i24 = 5;
                                                        c0307c.f(c0310f15, c0310f13, 0, 5);
                                                    }
                                                    i24 = 5;
                                                }
                                                i20 = 4;
                                                if (z21) {
                                                }
                                                z23 = z19;
                                                if (z20) {
                                                }
                                                z27 = z23;
                                                if (this.f3906g0 != 8) {
                                                }
                                                c0310f14 = c0310f10;
                                                if (z21) {
                                                }
                                                if (z26) {
                                                }
                                                dVar4 = dVar;
                                                i23 = i20;
                                                if (z27) {
                                                }
                                                if (z26) {
                                                }
                                                if (z26) {
                                                }
                                                i24 = 5;
                                            }
                                        }
                                        i20 = 5;
                                        if (z21) {
                                        }
                                        z23 = z19;
                                        if (z20) {
                                        }
                                        z27 = z23;
                                        if (this.f3906g0 != 8) {
                                        }
                                        c0310f14 = c0310f10;
                                        if (z21) {
                                        }
                                        if (z26) {
                                        }
                                        dVar4 = dVar;
                                        i23 = i20;
                                        if (z27) {
                                        }
                                        if (z26) {
                                        }
                                        if (z26) {
                                        }
                                        i24 = 5;
                                    } else {
                                        i16 = i36;
                                        z19 = true;
                                        c0310f8 = c0310f2;
                                        i17 = 6;
                                        i18 = 5;
                                        z20 = false;
                                        z21 = false;
                                    }
                                    i30 = i24;
                                    if (z26 || !z24) {
                                        return;
                                    }
                                    if (cVar4.f3867f != null) {
                                        i31 = cVar2.e();
                                        c0310f16 = c0310f2;
                                    } else {
                                        c0310f16 = c0310f2;
                                        i31 = 0;
                                    }
                                    if (c0310f14 != c0310f16) {
                                        c0307c.f(c0310f16, c0310f15, i31, i30);
                                        return;
                                    }
                                    return;
                                }
                                if (i33 != 0 || i13 != 0) {
                                    i28 = 5;
                                    z28 = true;
                                    z29 = false;
                                    z30 = true;
                                    i29 = 5;
                                } else if (k6.f3743f && c0310f7.f3743f) {
                                    c0307c.e(k4, k6, cVar.e(), 8);
                                    c0307c.e(k5, c0310f7, -cVar2.e(), 8);
                                    return;
                                } else {
                                    i28 = 8;
                                    z28 = false;
                                    z29 = true;
                                    z30 = false;
                                    i29 = 8;
                                }
                                if ((dVar5 instanceof C0316a) || (dVar6 instanceof C0316a)) {
                                    i18 = i28;
                                    i17 = 6;
                                    z21 = z30;
                                    z19 = true;
                                    i20 = 4;
                                } else {
                                    i18 = i28;
                                    z21 = z30;
                                    i20 = i29;
                                    z19 = true;
                                    i17 = 6;
                                }
                                z22 = z29;
                                z20 = z28;
                                i16 = i36;
                                c0310f8 = c0310f2;
                                if (z21) {
                                }
                                z23 = z19;
                                if (z20) {
                                }
                                z27 = z23;
                                if (this.f3906g0 != 8) {
                                }
                                c0310f14 = c0310f10;
                                if (z21) {
                                }
                                if (z26) {
                                }
                                dVar4 = dVar;
                                i23 = i20;
                                if (z27) {
                                }
                                if (z26) {
                                }
                                if (z26) {
                                }
                                i24 = 5;
                                i30 = i24;
                                if (z26) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            i16 = i36;
                            z19 = true;
                            if (k6.f3743f && c0310f7.f3743f) {
                                c0307c.b(k4, k6, cVar.e(), f2, c0310f7, k5, cVar2.e(), 8);
                                if (z3 && z17) {
                                    if (cVar2.f3867f != null) {
                                        i19 = cVar2.e();
                                        c0310f9 = c0310f2;
                                    } else {
                                        c0310f9 = c0310f2;
                                        i19 = 0;
                                    }
                                    if (c0310f7 != c0310f9) {
                                        c0307c.f(c0310f9, k5, i19, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            c0310f8 = c0310f2;
                            z20 = true;
                            z21 = true;
                            i17 = 6;
                            i18 = 5;
                            z22 = false;
                            i20 = 4;
                            if (z21) {
                            }
                            z23 = z19;
                            if (z20) {
                            }
                            z27 = z23;
                            if (this.f3906g0 != 8) {
                            }
                            c0310f14 = c0310f10;
                            if (z21) {
                            }
                            if (z26) {
                            }
                            dVar4 = dVar;
                            i23 = i20;
                            if (z27) {
                            }
                            if (z26) {
                            }
                            if (z26) {
                            }
                            i24 = 5;
                            i30 = i24;
                            if (z26) {
                            }
                        }
                    } else {
                        c0310f7 = k7;
                        c0307c.e(k5, c0310f7, -cVar2.e(), 8);
                        if (z3) {
                            c0307c.f(k4, c0310f, 0, 5);
                            cVar4 = cVar2;
                            i24 = 5;
                            c0310f14 = c0310f7;
                            c0310f15 = k5;
                            z24 = z17;
                            z26 = z3;
                            i30 = i24;
                            if (z26) {
                            }
                        }
                    }
                    cVar4 = cVar2;
                    c0310f14 = c0310f7;
                    c0310f15 = k5;
                    z24 = z17;
                } else {
                    cVar4 = cVar2;
                    c0310f15 = k5;
                    z24 = z17;
                    i30 = (z3 && (cVar.f3867f.d instanceof C0316a)) ? 8 : 5;
                    c0310f14 = k7;
                    z26 = z3;
                    if (z26) {
                    }
                }
                i24 = 5;
                z26 = z3;
                i30 = i24;
                if (z26) {
                }
            }
            if (i14 >= i15 && z3 && z18) {
                c0307c.f(c0310f6, c0310f3, 0, 8);
                c cVar5 = this.f3880M;
                char c3 = (z2 || cVar5.f3867f == null) ? c2 : (char) 0;
                if (!z2 && (cVar3 = cVar5.f3867f) != null) {
                    d dVar8 = cVar3.d;
                    if (dVar8.f3890W != RecyclerView.f1937A0) {
                        int[] iArr = dVar8.f3921p0;
                        if (iArr[0] == 3 && iArr[c2] == 3) {
                            c3 = c2;
                        }
                    }
                    c3 = 0;
                }
                if (c3 != 0) {
                    c0307c.f(c0310f4, c0310f5, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (z6) {
            c0307c.e(k5, k4, 0, 3);
            if (i4 > 0) {
                c0307c.f(k5, k4, i4, 8);
            }
            if (i5 < Integer.MAX_VALUE) {
                c0307c.g(k5, k4, i5, 8);
            }
        } else {
            c0307c.e(k5, k4, i10, i11);
        }
        z17 = z5;
        i12 = i35;
        i13 = i32;
        z16 = z14;
        if (z12) {
        }
        if (i14 >= i15) {
        }
    }

    public final void e(int i, d dVar, int i2, int i3) {
        boolean z2;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, dVar, i2, 0);
                    e(4, dVar, i2, 0);
                    i(7).a(dVar.i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, dVar, i2, 0);
                        e(5, dVar, i2, 0);
                        i(7).a(dVar.i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            c i4 = i(2);
            c i5 = i(4);
            c i6 = i(3);
            c i7 = i(5);
            boolean z3 = true;
            if ((i4 == null || !i4.h()) && (i5 == null || !i5.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i6 == null || !i6.h()) && (i7 == null || !i7.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                i(7).a(dVar.i(7), 0);
                return;
            } else if (z2) {
                i(8).a(dVar.i(8), 0);
                return;
            } else {
                if (z3) {
                    i(9).a(dVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            c i8 = i(2);
            c i9 = dVar.i(i2);
            c i10 = i(4);
            i8.a(i9, 0);
            i10.a(i9, 0);
            i(8).a(i9, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            c i11 = dVar.i(i2);
            i(3).a(i11, 0);
            i(5).a(i11, 0);
            i(9).a(i11, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i2), 0);
            return;
        }
        c i12 = i(i);
        c i13 = dVar.i(i2);
        if (i12.i(i13)) {
            if (i == 6) {
                c i14 = i(3);
                c i15 = i(5);
                if (i14 != null) {
                    i14.j();
                }
                if (i15 != null) {
                    i15.j();
                }
            } else if (i == 3 || i == 5) {
                c i16 = i(6);
                if (i16 != null) {
                    i16.j();
                }
                c i17 = i(7);
                if (i17.f3867f != i13) {
                    i17.j();
                }
                c f2 = i(i).f();
                c i18 = i(9);
                if (i18.h()) {
                    f2.j();
                    i18.j();
                }
            } else if (i == 2 || i == 4) {
                c i19 = i(7);
                if (i19.f3867f != i13) {
                    i19.j();
                }
                c f3 = i(i).f();
                c i20 = i(8);
                if (i20.h()) {
                    f3.j();
                    i20.j();
                }
            }
            i12.a(i13, i3);
        }
    }

    public final void f(c cVar, c cVar2, int i) {
        if (cVar.d == this) {
            e(cVar.f3866e, cVar2.d, cVar2.f3866e, i);
        }
    }

    public final void g(C0307c c0307c) {
        c0307c.k(this.f3876I);
        c0307c.k(this.f3877J);
        c0307c.k(this.f3878K);
        c0307c.k(this.f3879L);
        if (this.f3895a0 > 0) {
            c0307c.k(this.f3880M);
        }
    }

    public final void h() {
        if (this.d == null) {
            k kVar = new k(this);
            kVar.h.f4092e = 4;
            kVar.i.f4092e = 5;
            kVar.f4114f = 0;
            this.d = kVar;
        }
        if (this.f3901e == null) {
            m mVar = new m(this);
            t.f fVar = new t.f(mVar);
            mVar.f4103k = fVar;
            mVar.f4104l = null;
            mVar.h.f4092e = 6;
            mVar.i.f4092e = 7;
            fVar.f4092e = 8;
            mVar.f4114f = 1;
            this.f3901e = mVar;
        }
    }

    public c i(int i) {
        switch (AbstractC0309e.a(i)) {
            case 0:
                return null;
            case 1:
                return this.f3876I;
            case 2:
                return this.f3877J;
            case 3:
                return this.f3878K;
            case 4:
                return this.f3879L;
            case 5:
                return this.f3880M;
            case 6:
                return this.f3883P;
            case 7:
                return this.f3881N;
            case 8:
                return this.f3882O;
            default:
                throw new AssertionError(AbstractC0001b.k(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.f3921p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f3906g0 == 8) {
            return 0;
        }
        return this.f3889V;
    }

    public final d l(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.f3879L).f3867f) != null && cVar2.f3867f == cVar) {
                return cVar2.d;
            }
            return null;
        }
        c cVar3 = this.f3878K;
        c cVar4 = cVar3.f3867f;
        if (cVar4 == null || cVar4.f3867f != cVar3) {
            return null;
        }
        return cVar4.d;
    }

    public final d m(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.f3877J).f3867f) != null && cVar2.f3867f == cVar) {
                return cVar2.d;
            }
            return null;
        }
        c cVar3 = this.f3876I;
        c cVar4 = cVar3.f3867f;
        if (cVar4 == null || cVar4.f3867f != cVar3) {
            return null;
        }
        return cVar4.d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f3909j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f3888U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f3889V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f3892Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.f3893Z);
        sb.append("\n");
        p(sb, "left", this.f3876I);
        p(sb, "top", this.f3877J);
        p(sb, "right", this.f3878K);
        p(sb, "bottom", this.f3879L);
        p(sb, "baseline", this.f3880M);
        p(sb, "centerX", this.f3881N);
        p(sb, "centerY", this.f3882O);
        int i = this.f3888U;
        int i2 = this.f3897b0;
        int[] iArr = this.f3871C;
        int i3 = iArr[0];
        int i4 = this.f3926u;
        int i5 = this.f3923r;
        float f2 = this.f3928w;
        float[] fArr = this.f3912k0;
        float f3 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f2);
        int i6 = this.f3889V;
        int i7 = this.f3899c0;
        int i8 = iArr[1];
        int i9 = this.f3929x;
        int i10 = this.f3924s;
        float f4 = this.f3931z;
        float f5 = fArr[1];
        o(sb, "    height", i6, i7, i8, i9, i10, f4);
        float f6 = this.f3890W;
        int i11 = this.f3891X;
        if (f6 != RecyclerView.f1937A0) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f6);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.f3900d0, 0.5f);
        H(sb, "    verticalBias", this.f3902e0, 0.5f);
        G(this.f3908i0, 0, "    horizontalChainStyle", sb);
        G(this.f3910j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f3906g0 == 8) {
            return 0;
        }
        return this.f3888U;
    }

    public final int r() {
        d dVar = this.f3887T;
        return (dVar == null || !(dVar instanceof e)) ? this.f3892Y : ((e) dVar).f3949x0 + this.f3892Y;
    }

    public final int s() {
        d dVar = this.f3887T;
        return (dVar == null || !(dVar instanceof e)) ? this.f3893Z : ((e) dVar).f3950y0 + this.f3893Z;
    }

    public final boolean t(int i) {
        if (i == 0) {
            return (this.f3876I.f3867f != null ? 1 : 0) + (this.f3878K.f3867f != null ? 1 : 0) < 2;
        }
        return ((this.f3877J.f3867f != null ? 1 : 0) + (this.f3879L.f3867f != null ? 1 : 0)) + (this.f3880M.f3867f != null ? 1 : 0) < 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.f3907h0 != null) {
            str = "id: " + this.f3907h0 + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f3892Y);
        sb.append(", ");
        sb.append(this.f3893Z);
        sb.append(") - (");
        sb.append(this.f3888U);
        sb.append(" x ");
        sb.append(this.f3889V);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i, int i2) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i == 0) {
            c cVar5 = this.f3876I;
            c cVar6 = cVar5.f3867f;
            if (cVar6 != null && cVar6.f3865c && (cVar4 = (cVar3 = this.f3878K).f3867f) != null && cVar4.f3865c) {
                return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f3867f.d()) >= i2;
            }
        } else {
            c cVar7 = this.f3877J;
            c cVar8 = cVar7.f3867f;
            if (cVar8 != null && cVar8.f3865c && (cVar2 = (cVar = this.f3879L).f3867f) != null && cVar2.f3865c) {
                return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f3867f.d()) >= i2;
            }
        }
        return false;
    }

    public final void v(int i, int i2, int i3, int i4, d dVar) {
        i(i).b(dVar.i(i2), i3, i4, true);
    }

    public final boolean w(int i) {
        c cVar;
        c cVar2;
        int i2 = i * 2;
        c[] cVarArr = this.f3884Q;
        c cVar3 = cVarArr[i2];
        c cVar4 = cVar3.f3867f;
        return (cVar4 == null || cVar4.f3867f == cVar3 || (cVar2 = (cVar = cVarArr[i2 + 1]).f3867f) == null || cVar2.f3867f != cVar) ? false : true;
    }

    public final boolean x() {
        c cVar = this.f3876I;
        c cVar2 = cVar.f3867f;
        if (cVar2 != null && cVar2.f3867f == cVar) {
            return true;
        }
        c cVar3 = this.f3878K;
        c cVar4 = cVar3.f3867f;
        return cVar4 != null && cVar4.f3867f == cVar3;
    }

    public final boolean y() {
        c cVar = this.f3877J;
        c cVar2 = cVar.f3867f;
        if (cVar2 != null && cVar2.f3867f == cVar) {
            return true;
        }
        c cVar3 = this.f3879L;
        c cVar4 = cVar3.f3867f;
        return cVar4 != null && cVar4.f3867f == cVar3;
    }

    public final boolean z() {
        return this.f3905g && this.f3906g0 != 8;
    }
}
