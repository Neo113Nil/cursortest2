package s;

import T.r;
import android.view.View;
import com.luckyarcade.spinthrow.GameConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0319e;
import q.C0316b;
import q.C0317c;
import q.C0320f;
import t.C0332c;
import t.C0335f;
import t.C0340k;
import t.C0342m;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0327d {

    /* renamed from: A, reason: collision with root package name */
    public int f4009A;

    /* renamed from: B, reason: collision with root package name */
    public float f4010B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f4011C;

    /* renamed from: D, reason: collision with root package name */
    public float f4012D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4013E;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public int f4014G;

    /* renamed from: H, reason: collision with root package name */
    public int f4015H;

    /* renamed from: I, reason: collision with root package name */
    public final C0326c f4016I;

    /* renamed from: J, reason: collision with root package name */
    public final C0326c f4017J;

    /* renamed from: K, reason: collision with root package name */
    public final C0326c f4018K;

    /* renamed from: L, reason: collision with root package name */
    public final C0326c f4019L;

    /* renamed from: M, reason: collision with root package name */
    public final C0326c f4020M;

    /* renamed from: N, reason: collision with root package name */
    public final C0326c f4021N;

    /* renamed from: O, reason: collision with root package name */
    public final C0326c f4022O;

    /* renamed from: P, reason: collision with root package name */
    public final C0326c f4023P;

    /* renamed from: Q, reason: collision with root package name */
    public final C0326c[] f4024Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f4025R;

    /* renamed from: S, reason: collision with root package name */
    public final boolean[] f4026S;

    /* renamed from: T, reason: collision with root package name */
    public C0327d f4027T;

    /* renamed from: U, reason: collision with root package name */
    public int f4028U;

    /* renamed from: V, reason: collision with root package name */
    public int f4029V;

    /* renamed from: W, reason: collision with root package name */
    public float f4030W;

    /* renamed from: X, reason: collision with root package name */
    public int f4031X;

    /* renamed from: Y, reason: collision with root package name */
    public int f4032Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f4033Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f4035a0;

    /* renamed from: b, reason: collision with root package name */
    public C0332c f4036b;

    /* renamed from: b0, reason: collision with root package name */
    public int f4037b0;

    /* renamed from: c, reason: collision with root package name */
    public C0332c f4038c;

    /* renamed from: c0, reason: collision with root package name */
    public int f4039c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f4041d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f4043e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f4045f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f4047g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f4048h0;
    public int i0;

    /* renamed from: j, reason: collision with root package name */
    public String f4049j;

    /* renamed from: j0, reason: collision with root package name */
    public int f4050j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4051k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f4052k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4053l;

    /* renamed from: l0, reason: collision with root package name */
    public final C0327d[] f4054l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4055m;
    public final C0327d[] m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4056n;

    /* renamed from: n0, reason: collision with root package name */
    public int f4057n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4058o;

    /* renamed from: o0, reason: collision with root package name */
    public int f4059o0;

    /* renamed from: p, reason: collision with root package name */
    public int f4060p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f4061p0;

    /* renamed from: q, reason: collision with root package name */
    public int f4062q;

    /* renamed from: r, reason: collision with root package name */
    public int f4063r;

    /* renamed from: s, reason: collision with root package name */
    public int f4064s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f4065t;

    /* renamed from: u, reason: collision with root package name */
    public int f4066u;

    /* renamed from: v, reason: collision with root package name */
    public int f4067v;

    /* renamed from: w, reason: collision with root package name */
    public float f4068w;

    /* renamed from: x, reason: collision with root package name */
    public int f4069x;

    /* renamed from: y, reason: collision with root package name */
    public int f4070y;

    /* renamed from: z, reason: collision with root package name */
    public float f4071z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4034a = false;

    /* renamed from: d, reason: collision with root package name */
    public C0340k f4040d = null;

    /* renamed from: e, reason: collision with root package name */
    public C0342m f4042e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f4044f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f4046g = true;
    public int h = -1;
    public int i = -1;

    public C0327d() {
        new HashMap();
        this.f4051k = false;
        this.f4053l = false;
        this.f4055m = false;
        this.f4056n = false;
        this.f4058o = -1;
        this.f4060p = -1;
        this.f4062q = 0;
        this.f4063r = 0;
        this.f4064s = 0;
        this.f4065t = new int[2];
        this.f4066u = 0;
        this.f4067v = 0;
        this.f4068w = 1.0f;
        this.f4069x = 0;
        this.f4070y = 0;
        this.f4071z = 1.0f;
        this.f4009A = -1;
        this.f4010B = 1.0f;
        this.f4011C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f4012D = 0.0f;
        this.f4013E = false;
        this.F = false;
        this.f4014G = 0;
        this.f4015H = 0;
        C0326c c0326c = new C0326c(this, 2);
        this.f4016I = c0326c;
        C0326c c0326c2 = new C0326c(this, 3);
        this.f4017J = c0326c2;
        C0326c c0326c3 = new C0326c(this, 4);
        this.f4018K = c0326c3;
        C0326c c0326c4 = new C0326c(this, 5);
        this.f4019L = c0326c4;
        C0326c c0326c5 = new C0326c(this, 6);
        this.f4020M = c0326c5;
        C0326c c0326c6 = new C0326c(this, 8);
        this.f4021N = c0326c6;
        C0326c c0326c7 = new C0326c(this, 9);
        this.f4022O = c0326c7;
        C0326c c0326c8 = new C0326c(this, 7);
        this.f4023P = c0326c8;
        this.f4024Q = new C0326c[]{c0326c, c0326c3, c0326c2, c0326c4, c0326c5, c0326c8};
        ArrayList arrayList = new ArrayList();
        this.f4025R = arrayList;
        this.f4026S = new boolean[2];
        this.f4061p0 = new int[]{1, 1};
        this.f4027T = null;
        this.f4028U = 0;
        this.f4029V = 0;
        this.f4030W = 0.0f;
        this.f4031X = -1;
        this.f4032Y = 0;
        this.f4033Z = 0;
        this.f4035a0 = 0;
        this.f4041d0 = 0.5f;
        this.f4043e0 = 0.5f;
        this.f4047g0 = 0;
        this.f4048h0 = null;
        this.i0 = 0;
        this.f4050j0 = 0;
        this.f4052k0 = new float[]{-1.0f, -1.0f};
        this.f4054l0 = new C0327d[]{null, null};
        this.m0 = new C0327d[]{null, null};
        this.f4057n0 = -1;
        this.f4059o0 = -1;
        arrayList.add(c0326c);
        arrayList.add(c0326c2);
        arrayList.add(c0326c3);
        arrayList.add(c0326c4);
        arrayList.add(c0326c6);
        arrayList.add(c0326c7);
        arrayList.add(c0326c8);
        arrayList.add(c0326c5);
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

    public static void p(StringBuilder sb, String str, C0326c c0326c) {
        if (c0326c.f4007f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(c0326c.f4007f);
        sb.append("'");
        if (c0326c.h != Integer.MIN_VALUE || c0326c.f4008g != 0) {
            sb.append(",");
            sb.append(c0326c.f4008g);
            if (c0326c.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(c0326c.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        return this.f4051k || (this.f4016I.f4004c && this.f4018K.f4004c);
    }

    public boolean B() {
        return this.f4053l || (this.f4017J.f4004c && this.f4019L.f4004c);
    }

    public void C() {
        this.f4016I.j();
        this.f4017J.j();
        this.f4018K.j();
        this.f4019L.j();
        this.f4020M.j();
        this.f4021N.j();
        this.f4022O.j();
        this.f4023P.j();
        this.f4027T = null;
        this.f4012D = 0.0f;
        this.f4028U = 0;
        this.f4029V = 0;
        this.f4030W = 0.0f;
        this.f4031X = -1;
        this.f4032Y = 0;
        this.f4033Z = 0;
        this.f4035a0 = 0;
        this.f4037b0 = 0;
        this.f4039c0 = 0;
        this.f4041d0 = 0.5f;
        this.f4043e0 = 0.5f;
        int[] iArr = this.f4061p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f4045f0 = null;
        this.f4047g0 = 0;
        this.i0 = 0;
        this.f4050j0 = 0;
        float[] fArr = this.f4052k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f4058o = -1;
        this.f4060p = -1;
        int[] iArr2 = this.f4011C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f4063r = 0;
        this.f4064s = 0;
        this.f4068w = 1.0f;
        this.f4071z = 1.0f;
        this.f4067v = Integer.MAX_VALUE;
        this.f4070y = Integer.MAX_VALUE;
        this.f4066u = 0;
        this.f4069x = 0;
        this.f4009A = -1;
        this.f4010B = 1.0f;
        boolean[] zArr = this.f4044f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.f4026S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f4046g = true;
        int[] iArr3 = this.f4065t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        C0327d c0327d = this.f4027T;
        if (c0327d != null && (c0327d instanceof C0328e)) {
            ((C0328e) c0327d).getClass();
        }
        ArrayList arrayList = this.f4025R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0326c) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.f4051k = false;
        this.f4053l = false;
        this.f4055m = false;
        this.f4056n = false;
        ArrayList arrayList = this.f4025R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0326c c0326c = (C0326c) arrayList.get(i);
            c0326c.f4004c = false;
            c0326c.f4003b = 0;
        }
    }

    public void F(r rVar) {
        this.f4016I.k();
        this.f4017J.k();
        this.f4018K.k();
        this.f4019L.k();
        this.f4020M.k();
        this.f4023P.k();
        this.f4021N.k();
        this.f4022O.k();
    }

    public final void I(int i) {
        this.f4035a0 = i;
        this.f4013E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.f4051k) {
            return;
        }
        this.f4016I.l(i);
        this.f4018K.l(i2);
        this.f4032Y = i;
        this.f4028U = i2 - i;
        this.f4051k = true;
    }

    public final void K(int i, int i2) {
        if (this.f4053l) {
            return;
        }
        this.f4017J.l(i);
        this.f4019L.l(i2);
        this.f4033Z = i;
        this.f4029V = i2 - i;
        if (this.f4013E) {
            this.f4020M.l(i + this.f4035a0);
        }
        this.f4053l = true;
    }

    public final void L(int i) {
        this.f4029V = i;
        int i2 = this.f4039c0;
        if (i < i2) {
            this.f4029V = i2;
        }
    }

    public final void M(int i) {
        this.f4061p0[0] = i;
    }

    public final void N(int i) {
        this.f4061p0[1] = i;
    }

    public final void O(int i) {
        this.f4028U = i;
        int i2 = this.f4037b0;
        if (i < i2) {
            this.f4028U = i2;
        }
    }

    public void P(boolean z2, boolean z3) {
        int i;
        int i2;
        C0340k c0340k = this.f4040d;
        boolean z4 = z2 & c0340k.f4201g;
        C0342m c0342m = this.f4042e;
        boolean z5 = z3 & c0342m.f4201g;
        int i3 = c0340k.h.f4178g;
        int i4 = c0342m.h.f4178g;
        int i5 = c0340k.i.f4178g;
        int i6 = c0342m.i.f4178g;
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
            this.f4032Y = i3;
        }
        if (z5) {
            this.f4033Z = i4;
        }
        if (this.f4047g0 == 8) {
            this.f4028U = 0;
            this.f4029V = 0;
            return;
        }
        int[] iArr = this.f4061p0;
        if (z4) {
            if (iArr[0] == 1 && i8 < (i2 = this.f4028U)) {
                i8 = i2;
            }
            this.f4028U = i8;
            int i10 = this.f4037b0;
            if (i8 < i10) {
                this.f4028U = i10;
            }
        }
        if (z5) {
            if (iArr[1] == 1 && i9 < (i = this.f4029V)) {
                i9 = i;
            }
            this.f4029V = i9;
            int i11 = this.f4039c0;
            if (i9 < i11) {
                this.f4029V = i11;
            }
        }
    }

    public void Q(C0317c c0317c, boolean z2) {
        int i;
        int i2;
        C0342m c0342m;
        C0340k c0340k;
        C0326c c0326c = this.f4016I;
        c0317c.getClass();
        int n2 = C0317c.n(c0326c);
        int n3 = C0317c.n(this.f4017J);
        int n4 = C0317c.n(this.f4018K);
        int n5 = C0317c.n(this.f4019L);
        if (z2 && (c0340k = this.f4040d) != null) {
            C0335f c0335f = c0340k.h;
            if (c0335f.f4179j) {
                C0335f c0335f2 = c0340k.i;
                if (c0335f2.f4179j) {
                    n2 = c0335f.f4178g;
                    n4 = c0335f2.f4178g;
                }
            }
        }
        if (z2 && (c0342m = this.f4042e) != null) {
            C0335f c0335f3 = c0342m.h;
            if (c0335f3.f4179j) {
                C0335f c0335f4 = c0342m.i;
                if (c0335f4.f4179j) {
                    n3 = c0335f3.f4178g;
                    n5 = c0335f4.f4178g;
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
        this.f4032Y = n2;
        this.f4033Z = n3;
        if (this.f4047g0 == 8) {
            this.f4028U = 0;
            this.f4029V = 0;
            return;
        }
        int[] iArr = this.f4061p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.f4028U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.f4029V)) {
            i5 = i;
        }
        this.f4028U = i4;
        this.f4029V = i5;
        int i7 = this.f4039c0;
        if (i5 < i7) {
            this.f4029V = i7;
        }
        int i8 = this.f4037b0;
        if (i4 < i8) {
            this.f4028U = i8;
        }
        int i9 = this.f4067v;
        if (i9 > 0 && i6 == 3) {
            this.f4028U = Math.min(this.f4028U, i9);
        }
        int i10 = this.f4070y;
        if (i10 > 0 && iArr[1] == 3) {
            this.f4029V = Math.min(this.f4029V, i10);
        }
        int i11 = this.f4028U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.f4029V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(C0328e c0328e, C0317c c0317c, HashSet hashSet, int i, boolean z2) {
        if (z2) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(c0328e, c0317c, this);
            hashSet.remove(this);
            b(c0317c, c0328e.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.f4016I.f4002a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C0326c) it.next()).f4005d.a(c0328e, c0317c, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.f4018K.f4002a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C0326c) it2.next()).f4005d.a(c0328e, c0317c, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f4017J.f4002a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C0326c) it3.next()).f4005d.a(c0328e, c0317c, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.f4019L.f4002a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C0326c) it4.next()).f4005d.a(c0328e, c0317c, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.f4020M.f4002a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C0326c) it5.next()).f4005d.a(c0328e, c0317c, hashSet, i, true);
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
    public void b(C0317c c0317c, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        boolean[] zArr;
        boolean z5;
        C0327d c0327d;
        C0327d c0327d2;
        C0326c c0326c;
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
        C0326c c0326c2;
        boolean z12;
        boolean z13;
        int i12;
        int[] iArr2;
        C0326c c0326c3;
        C0326c c0326c4;
        C0326c c0326c5;
        C0320f c0320f;
        C0320f c0320f2;
        C0320f c0320f3;
        C0320f c0320f4;
        C0320f c0320f5;
        int[] iArr3;
        int i13;
        int i14;
        int i15;
        C0327d c0327d3;
        C0317c c0317c2;
        C0320f c0320f6;
        C0320f c0320f7;
        C0320f c0320f8;
        int i16;
        C0320f c0320f9;
        C0320f c0320f10;
        C0317c c0317c3;
        boolean z14;
        C0340k c0340k;
        C0335f c0335f;
        int i17;
        boolean x2;
        boolean y2;
        boolean z15;
        C0340k c0340k2;
        C0342m c0342m;
        boolean z16;
        boolean z17;
        ?? r10;
        C0326c c0326c6 = this.f4016I;
        C0320f k2 = c0317c.k(c0326c6);
        C0326c c0326c7 = this.f4018K;
        C0320f k3 = c0317c.k(c0326c7);
        C0326c c0326c8 = this.f4017J;
        C0320f k4 = c0317c.k(c0326c8);
        C0326c c0326c9 = this.f4019L;
        C0320f k5 = c0317c.k(c0326c9);
        C0326c c0326c10 = this.f4020M;
        C0320f k6 = c0317c.k(c0326c10);
        C0327d c0327d4 = this.f4027T;
        if (c0327d4 != null) {
            int[] iArr4 = c0327d4.f4061p0;
            if (iArr4[0] == 2) {
                r10 = 1;
                z17 = true;
            } else {
                z17 = false;
                r10 = 1;
            }
            boolean z18 = iArr4[r10] == 2 ? r10 : false;
            int i18 = this.f4062q;
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
            i = this.f4047g0;
            zArr = this.f4026S;
            if (i == 8) {
                ArrayList arrayList = this.f4025R;
                int size = arrayList.size();
                int i19 = 0;
                while (true) {
                    if (i19 < size) {
                        ArrayList arrayList2 = arrayList;
                        HashSet hashSet = ((C0326c) arrayList.get(i19)).f4002a;
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
            z5 = this.f4051k;
            if (!z5 || this.f4053l) {
                if (z5) {
                    c0317c.d(k2, this.f4032Y);
                    c0317c.d(k3, this.f4032Y + this.f4028U);
                    if (z4 && (c0327d2 = this.f4027T) != null) {
                        C0328e c0328e = (C0328e) c0327d2;
                        WeakReference weakReference = c0328e.f4078H0;
                        if (weakReference == null || weakReference.get() == null || c0326c6.d() > ((C0326c) c0328e.f4078H0.get()).d()) {
                            c0328e.f4078H0 = new WeakReference(c0326c6);
                        }
                        WeakReference weakReference2 = c0328e.f4080J0;
                        if (weakReference2 == null || weakReference2.get() == null || c0326c7.d() > ((C0326c) c0328e.f4080J0.get()).d()) {
                            c0328e.f4080J0 = new WeakReference(c0326c7);
                        }
                    }
                }
                if (this.f4053l) {
                    c0317c.d(k4, this.f4033Z);
                    c0317c.d(k5, this.f4033Z + this.f4029V);
                    HashSet hashSet2 = c0326c10.f4002a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        c0317c.d(k6, this.f4033Z + this.f4035a0);
                    }
                    if (z3 && (c0327d = this.f4027T) != null) {
                        C0328e c0328e2 = (C0328e) c0327d;
                        WeakReference weakReference3 = c0328e2.f4077G0;
                        if (weakReference3 == null || weakReference3.get() == null || c0326c8.d() > ((C0326c) c0328e2.f4077G0.get()).d()) {
                            c0328e2.f4077G0 = new WeakReference(c0326c8);
                        }
                        WeakReference weakReference4 = c0328e2.f4079I0;
                        if (weakReference4 == null || weakReference4.get() == null || c0326c9.d() > ((C0326c) c0328e2.f4079I0.get()).d()) {
                            c0328e2.f4079I0 = new WeakReference(c0326c9);
                        }
                    }
                }
                if (this.f4051k && this.f4053l) {
                    this.f4051k = false;
                    this.f4053l = false;
                    return;
                }
            }
            boolean[] zArr3 = this.f4044f;
            if (z2 || (c0340k2 = this.f4040d) == null || (c0342m = this.f4042e) == null) {
                c0326c = c0326c10;
                zArr2 = zArr;
            } else {
                zArr2 = zArr;
                C0335f c0335f2 = c0340k2.h;
                c0326c = c0326c10;
                if (c0335f2.f4179j && c0340k2.i.f4179j && c0342m.h.f4179j && c0342m.i.f4179j) {
                    c0317c.d(k2, c0335f2.f4178g);
                    c0317c.d(k3, this.f4040d.i.f4178g);
                    c0317c.d(k4, this.f4042e.h.f4178g);
                    c0317c.d(k5, this.f4042e.i.f4178g);
                    c0317c.d(k6, this.f4042e.f4187k.f4178g);
                    if (this.f4027T != null) {
                        if (z4 && zArr3[0] && !x()) {
                            c0317c.f(c0317c.k(this.f4027T.f4018K), k3, 0, 8);
                        }
                        if (z3 && zArr3[1] && !y()) {
                            z16 = false;
                            c0317c.f(c0317c.k(this.f4027T.f4019L), k5, 0, 8);
                            this.f4051k = z16;
                            this.f4053l = z16;
                            return;
                        }
                    }
                    z16 = false;
                    this.f4051k = z16;
                    this.f4053l = z16;
                    return;
                }
            }
            if (this.f4027T == null) {
                if (w(0)) {
                    ((C0328e) this.f4027T).R(this, 0);
                    x2 = true;
                } else {
                    x2 = x();
                }
                if (w(1)) {
                    ((C0328e) this.f4027T).R(this, 1);
                    y2 = true;
                } else {
                    y2 = y();
                }
                if (!x2 && z4 && this.f4047g0 != 8 && c0326c6.f4007f == null && c0326c7.f4007f == null) {
                    z15 = x2;
                    c0317c.f(c0317c.k(this.f4027T.f4018K), k3, 0, 1);
                } else {
                    z15 = x2;
                }
                if (!y2 && z3 && this.f4047g0 != 8 && c0326c8.f4007f == null && c0326c9.f4007f == null && c0326c == null) {
                    c0317c.f(c0317c.k(this.f4027T.f4019L), k5, 0, 1);
                }
                z6 = y2;
                z7 = z15;
            } else {
                z6 = false;
                z7 = false;
            }
            i2 = this.f4028U;
            i3 = this.f4037b0;
            if (i2 >= i3) {
                i3 = i2;
            }
            i4 = this.f4029V;
            i5 = this.f4039c0;
            if (i4 >= i5) {
                i5 = i4;
            }
            int[] iArr5 = this.f4061p0;
            int i20 = iArr5[0];
            int i21 = i3;
            boolean z19 = i20 == 3;
            int i22 = iArr5[1];
            int i23 = i5;
            boolean z20 = i22 == 3;
            int i24 = this.f4031X;
            this.f4009A = i24;
            f2 = this.f4030W;
            this.f4010B = f2;
            int i25 = this.f4063r;
            int i26 = this.f4064s;
            if (f2 <= 0.0f) {
                iArr = iArr5;
                if (this.f4047g0 != 8) {
                    if (i20 == 3 && i25 == 0) {
                        i25 = 3;
                    }
                    if (i22 == 3 && i26 == 0) {
                        i26 = 3;
                    }
                    if (i20 == 3 && i22 == 3 && i25 == 3 && i26 == 3) {
                        if (i24 == -1) {
                            if (z19 && !z20) {
                                this.f4009A = 0;
                            } else if (!z19 && z20) {
                                this.f4009A = 1;
                                if (i24 == -1) {
                                    this.f4010B = 1.0f / f2;
                                }
                            }
                        }
                        if (this.f4009A == 0 && (!c0326c8.h() || !c0326c9.h())) {
                            this.f4009A = 1;
                        } else if (this.f4009A == 1 && (!c0326c6.h() || !c0326c7.h())) {
                            this.f4009A = 0;
                        }
                        if (this.f4009A == -1 && (!c0326c8.h() || !c0326c9.h() || !c0326c6.h() || !c0326c7.h())) {
                            if (c0326c8.h() && c0326c9.h()) {
                                this.f4009A = 0;
                            } else if (c0326c6.h() && c0326c7.h()) {
                                this.f4010B = 1.0f / this.f4010B;
                                this.f4009A = 1;
                            }
                        }
                        if (this.f4009A == -1) {
                            int i27 = this.f4066u;
                            if (i27 > 0 && this.f4069x == 0) {
                                this.f4009A = 0;
                            } else if (i27 == 0 && this.f4069x > 0) {
                                this.f4010B = 1.0f / this.f4010B;
                                this.f4009A = 1;
                            }
                        }
                    } else {
                        if (i20 == 3 && i25 == 3) {
                            this.f4009A = 0;
                            i8 = (int) (f2 * i4);
                            if (i22 != 3) {
                                i7 = i26;
                                i9 = i23;
                                z8 = false;
                                i6 = 4;
                                int[] iArr6 = this.f4065t;
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
                                c0326c2 = this.f4023P;
                                z12 = !c0326c2.h();
                                z13 = zArr2[0];
                                boolean z21 = zArr2[1];
                                i12 = this.f4058o;
                                iArr2 = this.f4011C;
                                if (i12 != 2) {
                                }
                                c0326c3 = c0326c9;
                                c0326c4 = c0326c2;
                                c0326c5 = c0326c;
                                c0320f = k4;
                                c0320f2 = k6;
                                c0320f3 = k5;
                                c0320f4 = k3;
                                c0320f5 = k2;
                                iArr3 = iArr2;
                                if (z2) {
                                }
                                i16 = i15;
                                if ((c0327d3.f4060p != 2 ? i14 : i16) != 0) {
                                }
                                c0320f9 = c0320f7;
                                c0320f10 = c0320f8;
                                if (z8) {
                                }
                                if (c0326c4.h()) {
                                }
                                this.f4051k = false;
                                this.f4053l = false;
                            }
                            i6 = i25;
                            i7 = i26;
                            i9 = i23;
                            z8 = true;
                            int[] iArr62 = this.f4065t;
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
                            c0326c2 = this.f4023P;
                            z12 = !c0326c2.h();
                            z13 = zArr2[0];
                            boolean z212 = zArr2[1];
                            i12 = this.f4058o;
                            iArr2 = this.f4011C;
                            if (i12 != 2) {
                            }
                            c0326c3 = c0326c9;
                            c0326c4 = c0326c2;
                            c0326c5 = c0326c;
                            c0320f = k4;
                            c0320f2 = k6;
                            c0320f3 = k5;
                            c0320f4 = k3;
                            c0320f5 = k2;
                            iArr3 = iArr2;
                            if (z2) {
                            }
                            i16 = i15;
                            if ((c0327d3.f4060p != 2 ? i14 : i16) != 0) {
                            }
                            c0320f9 = c0320f7;
                            c0320f10 = c0320f8;
                            if (z8) {
                            }
                            if (c0326c4.h()) {
                            }
                            this.f4051k = false;
                            this.f4053l = false;
                        }
                        if (i22 == 3 && i26 == 3) {
                            this.f4009A = 1;
                            if (i24 == -1) {
                                this.f4010B = 1.0f / f2;
                            }
                            i9 = (int) (this.f4010B * i2);
                            i6 = i25;
                            if (i20 == 3) {
                                i7 = i26;
                                i8 = i21;
                                z8 = true;
                                int[] iArr622 = this.f4065t;
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
                                c0326c2 = this.f4023P;
                                z12 = !c0326c2.h();
                                z13 = zArr2[0];
                                boolean z2122 = zArr2[1];
                                i12 = this.f4058o;
                                iArr2 = this.f4011C;
                                if (i12 != 2) {
                                }
                                c0326c3 = c0326c9;
                                c0326c4 = c0326c2;
                                c0326c5 = c0326c;
                                c0320f = k4;
                                c0320f2 = k6;
                                c0320f3 = k5;
                                c0320f4 = k3;
                                c0320f5 = k2;
                                iArr3 = iArr2;
                                if (z2) {
                                }
                                i16 = i15;
                                if ((c0327d3.f4060p != 2 ? i14 : i16) != 0) {
                                }
                                c0320f9 = c0320f7;
                                c0320f10 = c0320f8;
                                if (z8) {
                                }
                                if (c0326c4.h()) {
                                }
                                this.f4051k = false;
                                this.f4053l = false;
                            }
                            i8 = i21;
                            z8 = false;
                            i7 = 4;
                            int[] iArr6222 = this.f4065t;
                            iArr6222[0] = i6;
                            iArr6222[1] = i7;
                            if (z8) {
                                int i28 = this.f4009A;
                                i10 = -1;
                                if (i28 == 0 || i28 == -1) {
                                    z9 = true;
                                    if (z8 || !((i17 = this.f4009A) == 1 || i17 == i10)) {
                                        c2 = 0;
                                        z10 = false;
                                    } else {
                                        c2 = 0;
                                        z10 = true;
                                    }
                                    z11 = iArr[c2] != 2 && (this instanceof C0328e);
                                    i11 = !z11 ? 0 : i8;
                                    c0326c2 = this.f4023P;
                                    z12 = !c0326c2.h();
                                    z13 = zArr2[0];
                                    boolean z21222 = zArr2[1];
                                    i12 = this.f4058o;
                                    iArr2 = this.f4011C;
                                    if (i12 != 2 && !this.f4051k) {
                                        if (z2 && (c0340k = this.f4040d) != null) {
                                            c0335f = c0340k.h;
                                            if (c0335f.f4179j && c0340k.i.f4179j) {
                                                if (!z2) {
                                                    c0317c.d(k2, c0335f.f4178g);
                                                    c0317c.d(k3, this.f4040d.i.f4178g);
                                                    if (this.f4027T != null && z4 && zArr3[0] && !x()) {
                                                        c0317c.f(c0317c.k(this.f4027T.f4018K), k3, 0, 8);
                                                    }
                                                    c0320f4 = k3;
                                                    c0320f5 = k2;
                                                    c0326c3 = c0326c9;
                                                    c0326c4 = c0326c2;
                                                    c0326c5 = c0326c;
                                                    c0320f = k4;
                                                    c0320f2 = k6;
                                                    c0320f3 = k5;
                                                    iArr3 = iArr2;
                                                    if (z2) {
                                                        c0327d3 = this;
                                                        C0342m c0342m2 = c0327d3.f4042e;
                                                        if (c0342m2 != null) {
                                                            C0335f c0335f3 = c0342m2.h;
                                                            if (c0335f3.f4179j && c0342m2.i.f4179j) {
                                                                c0317c2 = c0317c;
                                                                c0320f8 = c0320f;
                                                                c0317c2.d(c0320f8, c0335f3.f4178g);
                                                                c0320f7 = c0320f3;
                                                                c0317c2.d(c0320f7, c0327d3.f4042e.i.f4178g);
                                                                c0320f6 = c0320f2;
                                                                c0317c2.d(c0320f6, c0327d3.f4042e.f4187k.f4178g);
                                                                C0327d c0327d5 = c0327d3.f4027T;
                                                                if (c0327d5 == null || z6 || !z3) {
                                                                    i13 = 8;
                                                                    i14 = 0;
                                                                    i15 = 1;
                                                                } else {
                                                                    i15 = 1;
                                                                    if (zArr3[1]) {
                                                                        i13 = 8;
                                                                        i14 = 0;
                                                                        c0317c2.f(c0317c2.k(c0327d5.f4019L), c0320f7, 0, 8);
                                                                    } else {
                                                                        i13 = 8;
                                                                        i14 = 0;
                                                                    }
                                                                }
                                                                i16 = i14;
                                                                if ((c0327d3.f4060p != 2 ? i14 : i16) != 0 || c0327d3.f4053l) {
                                                                    c0320f9 = c0320f7;
                                                                    c0320f10 = c0320f8;
                                                                } else {
                                                                    boolean z22 = (iArr[i15] == 2 && (c0327d3 instanceof C0328e)) ? i15 : i14;
                                                                    if (z22) {
                                                                        i9 = i14;
                                                                    }
                                                                    C0327d c0327d6 = c0327d3.f4027T;
                                                                    C0320f k7 = c0327d6 != null ? c0317c2.k(c0327d6.f4019L) : null;
                                                                    C0327d c0327d7 = c0327d3.f4027T;
                                                                    C0320f k8 = c0327d7 != null ? c0317c2.k(c0327d7.f4017J) : null;
                                                                    int i29 = c0327d3.f4035a0;
                                                                    if (i29 > 0 || c0327d3.f4047g0 == i13) {
                                                                        C0326c c0326c11 = c0326c5;
                                                                        if (c0326c11.f4007f != null) {
                                                                            c0317c2.e(c0320f6, c0320f8, i29, i13);
                                                                            c0317c2.e(c0320f6, c0317c2.k(c0326c11.f4007f), c0326c11.e(), i13);
                                                                            if (z3) {
                                                                                c0317c2.f(k7, c0317c2.k(c0326c3), i14, 5);
                                                                            }
                                                                            z14 = i14;
                                                                            c0320f9 = c0320f7;
                                                                            c0320f10 = c0320f8;
                                                                            d(c0317c, false, z3, z4, zArr3[i15], k8, k7, iArr[i15], z22, c0327d3.f4017J, c0327d3.f4019L, c0327d3.f4033Z, i9, c0327d3.f4039c0, iArr3[i15], c0327d3.f4043e0, z10, iArr[i14] != 3 ? i15 : i14, z6, z7, z21222, i7, i6, c0327d3.f4069x, c0327d3.f4070y, c0327d3.f4071z, z14);
                                                                        } else if (c0327d3.f4047g0 == i13) {
                                                                            c0317c2.e(c0320f6, c0320f8, c0326c11.e(), i13);
                                                                        } else {
                                                                            c0317c2.e(c0320f6, c0320f8, i29, i13);
                                                                        }
                                                                    }
                                                                    z14 = z12;
                                                                    c0320f9 = c0320f7;
                                                                    c0320f10 = c0320f8;
                                                                    d(c0317c, false, z3, z4, zArr3[i15], k8, k7, iArr[i15], z22, c0327d3.f4017J, c0327d3.f4019L, c0327d3.f4033Z, i9, c0327d3.f4039c0, iArr3[i15], c0327d3.f4043e0, z10, iArr[i14] != 3 ? i15 : i14, z6, z7, z21222, i7, i6, c0327d3.f4069x, c0327d3.f4070y, c0327d3.f4071z, z14);
                                                                }
                                                                if (z8) {
                                                                    c0317c3 = c0317c;
                                                                } else if (this.f4009A == 1) {
                                                                    float f3 = this.f4010B;
                                                                    C0316b l2 = c0317c.l();
                                                                    l2.f3904d.g(c0320f9, -1.0f);
                                                                    l2.f3904d.g(c0320f10, 1.0f);
                                                                    l2.f3904d.g(c0320f4, f3);
                                                                    l2.f3904d.g(c0320f5, -f3);
                                                                    c0317c3 = c0317c;
                                                                    c0317c3.c(l2);
                                                                } else {
                                                                    c0317c3 = c0317c;
                                                                    float f4 = this.f4010B;
                                                                    C0316b l3 = c0317c.l();
                                                                    l3.f3904d.g(c0320f4, -1.0f);
                                                                    l3.f3904d.g(c0320f5, 1.0f);
                                                                    l3.f3904d.g(c0320f9, f4);
                                                                    l3.f3904d.g(c0320f10, -f4);
                                                                    c0317c3.c(l3);
                                                                }
                                                                if (c0326c4.h()) {
                                                                    C0326c c0326c12 = c0326c4;
                                                                    C0327d c0327d8 = c0326c12.f4007f.f4005d;
                                                                    float radians = (float) Math.toRadians(this.f4012D + 90.0f);
                                                                    int e2 = c0326c12.e();
                                                                    C0320f k9 = c0317c3.k(i(2));
                                                                    C0320f k10 = c0317c3.k(i(3));
                                                                    C0320f k11 = c0317c3.k(i(4));
                                                                    C0320f k12 = c0317c3.k(i(5));
                                                                    C0320f k13 = c0317c3.k(c0327d8.i(2));
                                                                    C0320f k14 = c0317c3.k(c0327d8.i(3));
                                                                    C0320f k15 = c0317c3.k(c0327d8.i(4));
                                                                    C0320f k16 = c0317c3.k(c0327d8.i(5));
                                                                    C0316b l4 = c0317c.l();
                                                                    double d2 = radians;
                                                                    double d3 = e2;
                                                                    float sin = (float) (Math.sin(d2) * d3);
                                                                    l4.f3904d.g(k14, 0.5f);
                                                                    l4.f3904d.g(k16, 0.5f);
                                                                    l4.f3904d.g(k10, -0.5f);
                                                                    l4.f3904d.g(k12, -0.5f);
                                                                    l4.f3902b = -sin;
                                                                    c0317c3.c(l4);
                                                                    C0316b l5 = c0317c.l();
                                                                    float cos = (float) (Math.cos(d2) * d3);
                                                                    l5.f3904d.g(k13, 0.5f);
                                                                    l5.f3904d.g(k15, 0.5f);
                                                                    l5.f3904d.g(k9, -0.5f);
                                                                    l5.f3904d.g(k11, -0.5f);
                                                                    l5.f3902b = -cos;
                                                                    c0317c3.c(l5);
                                                                }
                                                                this.f4051k = false;
                                                                this.f4053l = false;
                                                            }
                                                        }
                                                        c0317c2 = c0317c;
                                                        c0320f6 = c0320f2;
                                                        c0320f7 = c0320f3;
                                                        c0320f8 = c0320f;
                                                        i13 = 8;
                                                        i14 = 0;
                                                        i15 = 1;
                                                    } else {
                                                        i13 = 8;
                                                        i14 = 0;
                                                        i15 = 1;
                                                        c0327d3 = this;
                                                        c0317c2 = c0317c;
                                                        c0320f6 = c0320f2;
                                                        c0320f7 = c0320f3;
                                                        c0320f8 = c0320f;
                                                    }
                                                    i16 = i15;
                                                    if ((c0327d3.f4060p != 2 ? i14 : i16) != 0) {
                                                    }
                                                    c0320f9 = c0320f7;
                                                    c0320f10 = c0320f8;
                                                    if (z8) {
                                                    }
                                                    if (c0326c4.h()) {
                                                    }
                                                    this.f4051k = false;
                                                    this.f4053l = false;
                                                }
                                            }
                                        }
                                        C0327d c0327d9 = this.f4027T;
                                        C0320f k17 = c0327d9 == null ? c0317c.k(c0327d9.f4018K) : null;
                                        C0327d c0327d10 = this.f4027T;
                                        c0320f2 = k6;
                                        c0326c5 = c0326c;
                                        c0320f3 = k5;
                                        iArr3 = iArr2;
                                        c0326c3 = c0326c9;
                                        c0320f = k4;
                                        c0320f4 = k3;
                                        c0326c4 = c0326c2;
                                        c0320f5 = k2;
                                        d(c0317c, true, z4, z3, zArr3[0], c0327d10 == null ? c0317c.k(c0327d10.f4016I) : null, k17, iArr[0], z11, this.f4016I, this.f4018K, this.f4032Y, i11, this.f4037b0, iArr2[0], this.f4041d0, z9, iArr[1] != 3, z7, z6, z13, i6, i7, this.f4066u, this.f4067v, this.f4068w, z12);
                                        if (z2) {
                                        }
                                        i16 = i15;
                                        if ((c0327d3.f4060p != 2 ? i14 : i16) != 0) {
                                        }
                                        c0320f9 = c0320f7;
                                        c0320f10 = c0320f8;
                                        if (z8) {
                                        }
                                        if (c0326c4.h()) {
                                        }
                                        this.f4051k = false;
                                        this.f4053l = false;
                                    }
                                    c0326c3 = c0326c9;
                                    c0326c4 = c0326c2;
                                    c0326c5 = c0326c;
                                    c0320f = k4;
                                    c0320f2 = k6;
                                    c0320f3 = k5;
                                    c0320f4 = k3;
                                    c0320f5 = k2;
                                    iArr3 = iArr2;
                                    if (z2) {
                                    }
                                    i16 = i15;
                                    if ((c0327d3.f4060p != 2 ? i14 : i16) != 0) {
                                    }
                                    c0320f9 = c0320f7;
                                    c0320f10 = c0320f8;
                                    if (z8) {
                                    }
                                    if (c0326c4.h()) {
                                    }
                                    this.f4051k = false;
                                    this.f4053l = false;
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
                            c0326c2 = this.f4023P;
                            z12 = !c0326c2.h();
                            z13 = zArr2[0];
                            boolean z212222 = zArr2[1];
                            i12 = this.f4058o;
                            iArr2 = this.f4011C;
                            if (i12 != 2) {
                                if (z2) {
                                    c0335f = c0340k.h;
                                    if (c0335f.f4179j) {
                                        if (!z2) {
                                        }
                                    }
                                }
                                C0327d c0327d92 = this.f4027T;
                                if (c0327d92 == null) {
                                }
                                C0327d c0327d102 = this.f4027T;
                                if (c0327d102 == null) {
                                }
                                c0320f2 = k6;
                                c0326c5 = c0326c;
                                c0320f3 = k5;
                                iArr3 = iArr2;
                                c0326c3 = c0326c9;
                                c0320f = k4;
                                c0320f4 = k3;
                                c0326c4 = c0326c2;
                                c0320f5 = k2;
                                d(c0317c, true, z4, z3, zArr3[0], c0327d102 == null ? c0317c.k(c0327d102.f4016I) : null, k17, iArr[0], z11, this.f4016I, this.f4018K, this.f4032Y, i11, this.f4037b0, iArr2[0], this.f4041d0, z9, iArr[1] != 3, z7, z6, z13, i6, i7, this.f4066u, this.f4067v, this.f4068w, z12);
                                if (z2) {
                                }
                                i16 = i15;
                                if ((c0327d3.f4060p != 2 ? i14 : i16) != 0) {
                                }
                                c0320f9 = c0320f7;
                                c0320f10 = c0320f8;
                                if (z8) {
                                }
                                if (c0326c4.h()) {
                                }
                                this.f4051k = false;
                                this.f4053l = false;
                            }
                            c0326c3 = c0326c9;
                            c0326c4 = c0326c2;
                            c0326c5 = c0326c;
                            c0320f = k4;
                            c0320f2 = k6;
                            c0320f3 = k5;
                            c0320f4 = k3;
                            c0320f5 = k2;
                            iArr3 = iArr2;
                            if (z2) {
                            }
                            i16 = i15;
                            if ((c0327d3.f4060p != 2 ? i14 : i16) != 0) {
                            }
                            c0320f9 = c0320f7;
                            c0320f10 = c0320f8;
                            if (z8) {
                            }
                            if (c0326c4.h()) {
                            }
                            this.f4051k = false;
                            this.f4053l = false;
                        }
                    }
                    i6 = i25;
                    i7 = i26;
                    i8 = i21;
                    i9 = i23;
                    z8 = true;
                    int[] iArr62222 = this.f4065t;
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
                    c0326c2 = this.f4023P;
                    z12 = !c0326c2.h();
                    z13 = zArr2[0];
                    boolean z2122222 = zArr2[1];
                    i12 = this.f4058o;
                    iArr2 = this.f4011C;
                    if (i12 != 2) {
                    }
                    c0326c3 = c0326c9;
                    c0326c4 = c0326c2;
                    c0326c5 = c0326c;
                    c0320f = k4;
                    c0320f2 = k6;
                    c0320f3 = k5;
                    c0320f4 = k3;
                    c0320f5 = k2;
                    iArr3 = iArr2;
                    if (z2) {
                    }
                    i16 = i15;
                    if ((c0327d3.f4060p != 2 ? i14 : i16) != 0) {
                    }
                    c0320f9 = c0320f7;
                    c0320f10 = c0320f8;
                    if (z8) {
                    }
                    if (c0326c4.h()) {
                    }
                    this.f4051k = false;
                    this.f4053l = false;
                }
            } else {
                iArr = iArr5;
            }
            i6 = i25;
            i7 = i26;
            i8 = i21;
            i9 = i23;
            z8 = false;
            int[] iArr622222 = this.f4065t;
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
            c0326c2 = this.f4023P;
            z12 = !c0326c2.h();
            z13 = zArr2[0];
            boolean z21222222 = zArr2[1];
            i12 = this.f4058o;
            iArr2 = this.f4011C;
            if (i12 != 2) {
            }
            c0326c3 = c0326c9;
            c0326c4 = c0326c2;
            c0326c5 = c0326c;
            c0320f = k4;
            c0320f2 = k6;
            c0320f3 = k5;
            c0320f4 = k3;
            c0320f5 = k2;
            iArr3 = iArr2;
            if (z2) {
            }
            i16 = i15;
            if ((c0327d3.f4060p != 2 ? i14 : i16) != 0) {
            }
            c0320f9 = c0320f7;
            c0320f10 = c0320f8;
            if (z8) {
            }
            if (c0326c4.h()) {
            }
            this.f4051k = false;
            this.f4053l = false;
        }
        z3 = false;
        z4 = false;
        i = this.f4047g0;
        zArr = this.f4026S;
        if (i == 8) {
        }
        z5 = this.f4051k;
        if (!z5) {
        }
        if (z5) {
        }
        if (this.f4053l) {
        }
        if (this.f4051k) {
            this.f4051k = false;
            this.f4053l = false;
            return;
        }
        boolean[] zArr32 = this.f4044f;
        if (z2) {
        }
        c0326c = c0326c10;
        zArr2 = zArr;
        if (this.f4027T == null) {
        }
        i2 = this.f4028U;
        i3 = this.f4037b0;
        if (i2 >= i3) {
        }
        i4 = this.f4029V;
        i5 = this.f4039c0;
        if (i4 >= i5) {
        }
        int[] iArr52 = this.f4061p0;
        int i202 = iArr52[0];
        int i212 = i3;
        if (i202 == 3) {
        }
        int i222 = iArr52[1];
        int i232 = i5;
        if (i222 == 3) {
        }
        int i242 = this.f4031X;
        this.f4009A = i242;
        f2 = this.f4030W;
        this.f4010B = f2;
        int i252 = this.f4063r;
        int i262 = this.f4064s;
        if (f2 <= 0.0f) {
        }
        i6 = i252;
        i7 = i262;
        i8 = i212;
        i9 = i232;
        z8 = false;
        int[] iArr6222222 = this.f4065t;
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
        c0326c2 = this.f4023P;
        z12 = !c0326c2.h();
        z13 = zArr2[0];
        boolean z212222222 = zArr2[1];
        i12 = this.f4058o;
        iArr2 = this.f4011C;
        if (i12 != 2) {
        }
        c0326c3 = c0326c9;
        c0326c4 = c0326c2;
        c0326c5 = c0326c;
        c0320f = k4;
        c0320f2 = k6;
        c0320f3 = k5;
        c0320f4 = k3;
        c0320f5 = k2;
        iArr3 = iArr2;
        if (z2) {
        }
        i16 = i15;
        if ((c0327d3.f4060p != 2 ? i14 : i16) != 0) {
        }
        c0320f9 = c0320f7;
        c0320f10 = c0320f8;
        if (z8) {
        }
        if (c0326c4.h()) {
        }
        this.f4051k = false;
        this.f4053l = false;
    }

    public boolean c() {
        return this.f4047g0 != 8;
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
    public final void d(C0317c c0317c, boolean z2, boolean z3, boolean z4, boolean z5, C0320f c0320f, C0320f c0320f2, int i, boolean z6, C0326c c0326c, C0326c c0326c2, int i2, int i3, int i4, int i5, float f2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i6, int i7, int i8, int i9, float f3, boolean z12) {
        boolean z13;
        boolean z14;
        int i10;
        boolean z15;
        int i11;
        int i12;
        int i13;
        boolean z16;
        boolean z17;
        C0320f k2;
        C0320f k3;
        C0320f c0320f3;
        C0320f c0320f4;
        C0320f c0320f5;
        C0320f c0320f6;
        boolean z18;
        int i14;
        char c2;
        int i15;
        C0326c c0326c3;
        C0320f c0320f7;
        int i16;
        boolean z19;
        C0320f c0320f8;
        boolean z20;
        boolean z21;
        int i17;
        int i18;
        C0320f c0320f9;
        int i19;
        boolean z22;
        int i20;
        boolean z23;
        C0326c c0326c4;
        C0320f c0320f10;
        C0320f c0320f11;
        boolean z24;
        int i21;
        C0327d c0327d;
        boolean z25;
        int i22;
        C0327d c0327d2;
        C0327d c0327d3;
        C0320f c0320f12;
        C0320f c0320f13;
        boolean z26;
        boolean z27;
        C0320f c0320f14;
        C0320f c0320f15;
        C0327d c0327d4;
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
        C0320f c0320f16;
        int i31;
        int i32 = i8;
        int i33 = i9;
        C0320f k4 = c0317c.k(c0326c);
        C0320f k5 = c0317c.k(c0326c2);
        C0320f k6 = c0317c.k(c0326c.f4007f);
        C0320f k7 = c0317c.k(c0326c2.f4007f);
        boolean h = c0326c.h();
        boolean h2 = c0326c2.h();
        boolean h3 = this.f4023P.h();
        int i34 = h2 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h3) {
            i34++;
        }
        int i35 = i34;
        int i36 = z7 ? 3 : i6;
        int a2 = AbstractC0319e.a(i);
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
        if (this.f4047g0 == 8) {
            i10 = 0;
            z14 = false;
        } else {
            i10 = i39;
        }
        if (z12) {
            if (!h && !h2 && !h3) {
                c0317c.d(k4, i2);
            } else if (h && !h2) {
                z15 = h3;
                i11 = 8;
                c0317c.e(k4, k6, c0326c.e(), 8);
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
                    c0317c.f(k5, k4, i32, 8);
                    i10 = Math.max(i10, i32);
                }
                if (i33 > 0) {
                    if (!z3 || i36 != 1) {
                        c0317c.g(k5, k4, i33, 8);
                    }
                    i10 = Math.min(i10, i33);
                }
                if (i36 == 1) {
                    if (z3) {
                        c0317c.e(k5, k4, i10, 8);
                    } else if (z9) {
                        c0317c.e(k5, k4, i10, 5);
                        c0317c.g(k5, k4, i10, 8);
                    } else {
                        c0317c.e(k5, k4, i10, 5);
                        c0317c.g(k5, k4, i10, 8);
                    }
                } else if (i36 == 2) {
                    int i40 = c0326c.f4006e;
                    if (i40 == 3 || i40 == 5) {
                        k2 = c0317c.k(this.f4027T.i(3));
                        k3 = c0317c.k(this.f4027T.i(5));
                    } else {
                        k2 = c0317c.k(this.f4027T.i(2));
                        k3 = c0317c.k(this.f4027T.i(4));
                    }
                    C0316b l2 = c0317c.l();
                    i12 = i35;
                    l2.f3904d.g(k5, -1.0f);
                    l2.f3904d.g(k4, 1.0f);
                    l2.f3904d.g(k3, f3);
                    l2.f3904d.g(k2, -f3);
                    c0317c.c(l2);
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
                c0317c.e(k5, k4, max, 8);
                z17 = z5;
                i12 = i35;
                z16 = false;
                i13 = i32;
            }
            if (z12) {
                c0320f3 = c0320f;
                c0320f4 = c0320f2;
                c0320f5 = k5;
                c0320f6 = k4;
                z18 = z17;
                i14 = i12;
                c2 = 1;
                i15 = 2;
            } else if (z9) {
                c0320f3 = c0320f;
                c0320f4 = c0320f2;
                c0320f5 = k5;
                c0320f6 = k4;
                z18 = z17;
                i14 = i12;
                i15 = 2;
                c2 = 1;
            } else {
                if (!h && !h2 && !z15) {
                    c0326c4 = c0326c2;
                    c0320f15 = k5;
                    z24 = z17;
                    c0320f14 = k7;
                } else if (!h || h2) {
                    if (h || !h2) {
                        c0320f7 = k7;
                        if (h && h2) {
                            C0327d c0327d5 = c0326c.f4007f.f4005d;
                            C0327d c0327d6 = c0326c2.f4007f.f4005d;
                            C0327d c0327d7 = this.f4027T;
                            int i41 = 6;
                            if (z16) {
                                if (i36 != 0) {
                                    if (i36 == 2) {
                                        if ((c0327d5 instanceof C0324a) || (c0327d6 instanceof C0324a)) {
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
                                        if (this.f4009A == -1) {
                                            if (z10) {
                                                c0320f8 = c0320f2;
                                                i18 = 8;
                                                z19 = true;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                                i17 = z3 ? 5 : 4;
                                            } else {
                                                c0320f8 = c0320f2;
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
                                                c0320f8 = c0320f2;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                                i17 = 6;
                                                i18 = 5;
                                            } else {
                                                if (i33 != 0 || i13 != 0) {
                                                    c0320f8 = c0320f2;
                                                    z20 = true;
                                                    z21 = true;
                                                    z22 = true;
                                                    i17 = 6;
                                                    i18 = 5;
                                                } else if (z10) {
                                                    i18 = (c0327d5 == c0327d7 || c0327d6 == c0327d7) ? 5 : 4;
                                                    c0320f8 = c0320f2;
                                                    z20 = true;
                                                    z21 = true;
                                                    z22 = true;
                                                    i17 = 6;
                                                } else {
                                                    c0320f8 = c0320f2;
                                                    z20 = true;
                                                    z21 = true;
                                                    z22 = true;
                                                    i17 = 6;
                                                    i18 = 5;
                                                    i20 = 8;
                                                    if (z21 || k6 != c0320f7 || c0327d5 == c0327d7) {
                                                        z23 = z19;
                                                    } else {
                                                        z21 = false;
                                                        z23 = false;
                                                    }
                                                    if (z20) {
                                                        if (z16 || z8 || z10 || k6 != c0320f || c0320f7 != c0320f8) {
                                                            z26 = z3;
                                                            i25 = i17;
                                                            i26 = i18;
                                                        } else {
                                                            z26 = false;
                                                            i26 = 8;
                                                            z23 = false;
                                                            i25 = 8;
                                                        }
                                                        c0327d2 = c0327d6;
                                                        c0326c4 = c0326c2;
                                                        z24 = z17;
                                                        c0327d3 = c0327d5;
                                                        i21 = i13;
                                                        c0320f10 = c0320f7;
                                                        i22 = 4;
                                                        z25 = true;
                                                        c0320f12 = k6;
                                                        c0327d = c0327d7;
                                                        c0320f11 = k5;
                                                        c0320f13 = k4;
                                                        c0317c.b(k4, k6, c0326c.e(), f2, c0320f7, k5, c0326c2.e(), i25);
                                                        i18 = i26;
                                                    } else {
                                                        c0326c4 = c0326c2;
                                                        c0320f10 = c0320f7;
                                                        c0320f11 = k5;
                                                        z24 = z17;
                                                        i21 = i13;
                                                        c0327d = c0327d7;
                                                        z25 = z19;
                                                        i22 = 4;
                                                        c0327d2 = c0327d6;
                                                        c0327d3 = c0327d5;
                                                        c0320f12 = k6;
                                                        c0320f13 = k4;
                                                        z26 = z3;
                                                    }
                                                    z27 = z23;
                                                    if (this.f4047g0 != 8 && ((hashSet = c0326c4.f4002a) == null || hashSet.size() <= 0)) {
                                                        return;
                                                    }
                                                    c0320f14 = c0320f10;
                                                    if (z21) {
                                                        if (z26 && c0320f12 != c0320f14 && !z16 && ((c0327d3 instanceof C0324a) || (c0327d2 instanceof C0324a))) {
                                                            i18 = 6;
                                                        }
                                                        c0317c.f(c0320f13, c0320f12, c0326c.e(), i18);
                                                        c0320f15 = c0320f11;
                                                        c0317c.g(c0320f15, c0320f14, -c0326c2.e(), i18);
                                                    } else {
                                                        c0320f15 = c0320f11;
                                                    }
                                                    if (z26 || !z11 || (c0327d3 instanceof C0324a) || (c0327d2 instanceof C0324a)) {
                                                        c0327d4 = c0327d;
                                                    } else {
                                                        c0327d4 = c0327d;
                                                        if (c0327d2 != c0327d4) {
                                                            i18 = 6;
                                                            i23 = 6;
                                                            z27 = z25;
                                                            if (z27) {
                                                                if (z22 && (!z10 || z4)) {
                                                                    if (c0327d3 != c0327d4 && c0327d2 != c0327d4) {
                                                                        i41 = i23;
                                                                    }
                                                                    if ((c0327d3 instanceof h) || (c0327d2 instanceof h)) {
                                                                        i41 = 5;
                                                                    }
                                                                    if ((c0327d3 instanceof C0324a) || (c0327d2 instanceof C0324a)) {
                                                                        i41 = 5;
                                                                    }
                                                                    i23 = Math.max(z10 ? 5 : i41, i23);
                                                                }
                                                                int i42 = i23;
                                                                if (z26) {
                                                                    i42 = Math.min(i18, i42);
                                                                    if (z7 && !z10 && (c0327d3 == c0327d4 || c0327d2 == c0327d4)) {
                                                                        i42 = i22;
                                                                    }
                                                                }
                                                                c0317c.e(c0320f13, c0320f12, c0326c.e(), i42);
                                                                c0317c.e(c0320f15, c0320f14, -c0326c2.e(), i42);
                                                            }
                                                            if (z26) {
                                                                C0320f c0320f17 = c0320f12;
                                                                int e2 = c0320f == c0320f17 ? c0326c.e() : 0;
                                                                if (c0320f17 != c0320f) {
                                                                    c0317c.f(c0320f13, c0320f, e2, 5);
                                                                }
                                                            }
                                                            if (z26 && z16 && i4 == 0 && i21 == 0) {
                                                                if (z16 || i16 != 3) {
                                                                    i24 = 5;
                                                                    c0317c.f(c0320f15, c0320f13, 0, 5);
                                                                } else {
                                                                    c0317c.f(c0320f15, c0320f13, 0, 8);
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
                                                        c0317c.f(c0320f15, c0320f13, 0, 5);
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
                                                if (this.f4047g0 != 8) {
                                                }
                                                c0320f14 = c0320f10;
                                                if (z21) {
                                                }
                                                if (z26) {
                                                }
                                                c0327d4 = c0327d;
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
                                        if (this.f4047g0 != 8) {
                                        }
                                        c0320f14 = c0320f10;
                                        if (z21) {
                                        }
                                        if (z26) {
                                        }
                                        c0327d4 = c0327d;
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
                                        c0320f8 = c0320f2;
                                        i17 = 6;
                                        i18 = 5;
                                        z20 = false;
                                        z21 = false;
                                    }
                                    i30 = i24;
                                    if (z26 || !z24) {
                                        return;
                                    }
                                    if (c0326c4.f4007f != null) {
                                        i31 = c0326c2.e();
                                        c0320f16 = c0320f2;
                                    } else {
                                        c0320f16 = c0320f2;
                                        i31 = 0;
                                    }
                                    if (c0320f14 != c0320f16) {
                                        c0317c.f(c0320f16, c0320f15, i31, i30);
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
                                } else if (k6.f3929f && c0320f7.f3929f) {
                                    c0317c.e(k4, k6, c0326c.e(), 8);
                                    c0317c.e(k5, c0320f7, -c0326c2.e(), 8);
                                    return;
                                } else {
                                    i28 = 8;
                                    z28 = false;
                                    z29 = true;
                                    z30 = false;
                                    i29 = 8;
                                }
                                if ((c0327d5 instanceof C0324a) || (c0327d6 instanceof C0324a)) {
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
                                c0320f8 = c0320f2;
                                if (z21) {
                                }
                                z23 = z19;
                                if (z20) {
                                }
                                z27 = z23;
                                if (this.f4047g0 != 8) {
                                }
                                c0320f14 = c0320f10;
                                if (z21) {
                                }
                                if (z26) {
                                }
                                c0327d4 = c0327d;
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
                            if (k6.f3929f && c0320f7.f3929f) {
                                c0317c.b(k4, k6, c0326c.e(), f2, c0320f7, k5, c0326c2.e(), 8);
                                if (z3 && z17) {
                                    if (c0326c2.f4007f != null) {
                                        i19 = c0326c2.e();
                                        c0320f9 = c0320f2;
                                    } else {
                                        c0320f9 = c0320f2;
                                        i19 = 0;
                                    }
                                    if (c0320f7 != c0320f9) {
                                        c0317c.f(c0320f9, k5, i19, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            c0320f8 = c0320f2;
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
                            if (this.f4047g0 != 8) {
                            }
                            c0320f14 = c0320f10;
                            if (z21) {
                            }
                            if (z26) {
                            }
                            c0327d4 = c0327d;
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
                        c0320f7 = k7;
                        c0317c.e(k5, c0320f7, -c0326c2.e(), 8);
                        if (z3) {
                            c0317c.f(k4, c0320f, 0, 5);
                            c0326c4 = c0326c2;
                            i24 = 5;
                            c0320f14 = c0320f7;
                            c0320f15 = k5;
                            z24 = z17;
                            z26 = z3;
                            i30 = i24;
                            if (z26) {
                            }
                        }
                    }
                    c0326c4 = c0326c2;
                    c0320f14 = c0320f7;
                    c0320f15 = k5;
                    z24 = z17;
                } else {
                    c0326c4 = c0326c2;
                    c0320f15 = k5;
                    z24 = z17;
                    i30 = (z3 && (c0326c.f4007f.f4005d instanceof C0324a)) ? 8 : 5;
                    c0320f14 = k7;
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
                c0317c.f(c0320f6, c0320f3, 0, 8);
                C0326c c0326c5 = this.f4020M;
                char c3 = (z2 || c0326c5.f4007f == null) ? c2 : (char) 0;
                if (!z2 && (c0326c3 = c0326c5.f4007f) != null) {
                    C0327d c0327d8 = c0326c3.f4005d;
                    if (c0327d8.f4030W != 0.0f) {
                        int[] iArr = c0327d8.f4061p0;
                        if (iArr[0] == 3 && iArr[c2] == 3) {
                            c3 = c2;
                        }
                    }
                    c3 = 0;
                }
                if (c3 != 0) {
                    c0317c.f(c0320f4, c0320f5, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (z6) {
            c0317c.e(k5, k4, 0, 3);
            if (i4 > 0) {
                c0317c.f(k5, k4, i4, 8);
            }
            if (i5 < Integer.MAX_VALUE) {
                c0317c.g(k5, k4, i5, 8);
            }
        } else {
            c0317c.e(k5, k4, i10, i11);
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

    public final void e(int i, C0327d c0327d, int i2, int i3) {
        boolean z2;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, c0327d, i2, 0);
                    e(4, c0327d, i2, 0);
                    i(7).a(c0327d.i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, c0327d, i2, 0);
                        e(5, c0327d, i2, 0);
                        i(7).a(c0327d.i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            C0326c i4 = i(2);
            C0326c i5 = i(4);
            C0326c i6 = i(3);
            C0326c i7 = i(5);
            boolean z3 = true;
            if ((i4 == null || !i4.h()) && (i5 == null || !i5.h())) {
                e(2, c0327d, 2, 0);
                e(4, c0327d, 4, 0);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i6 == null || !i6.h()) && (i7 == null || !i7.h())) {
                e(3, c0327d, 3, 0);
                e(5, c0327d, 5, 0);
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                i(7).a(c0327d.i(7), 0);
                return;
            } else if (z2) {
                i(8).a(c0327d.i(8), 0);
                return;
            } else {
                if (z3) {
                    i(9).a(c0327d.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            C0326c i8 = i(2);
            C0326c i9 = c0327d.i(i2);
            C0326c i10 = i(4);
            i8.a(i9, 0);
            i10.a(i9, 0);
            i(8).a(i9, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            C0326c i11 = c0327d.i(i2);
            i(3).a(i11, 0);
            i(5).a(i11, 0);
            i(9).a(i11, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(c0327d.i(2), 0);
            i(4).a(c0327d.i(4), 0);
            i(8).a(c0327d.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(c0327d.i(3), 0);
            i(5).a(c0327d.i(5), 0);
            i(9).a(c0327d.i(i2), 0);
            return;
        }
        C0326c i12 = i(i);
        C0326c i13 = c0327d.i(i2);
        if (i12.i(i13)) {
            if (i == 6) {
                C0326c i14 = i(3);
                C0326c i15 = i(5);
                if (i14 != null) {
                    i14.j();
                }
                if (i15 != null) {
                    i15.j();
                }
            } else if (i == 3 || i == 5) {
                C0326c i16 = i(6);
                if (i16 != null) {
                    i16.j();
                }
                C0326c i17 = i(7);
                if (i17.f4007f != i13) {
                    i17.j();
                }
                C0326c f2 = i(i).f();
                C0326c i18 = i(9);
                if (i18.h()) {
                    f2.j();
                    i18.j();
                }
            } else if (i == 2 || i == 4) {
                C0326c i19 = i(7);
                if (i19.f4007f != i13) {
                    i19.j();
                }
                C0326c f3 = i(i).f();
                C0326c i20 = i(8);
                if (i20.h()) {
                    f3.j();
                    i20.j();
                }
            }
            i12.a(i13, i3);
        }
    }

    public final void f(C0326c c0326c, C0326c c0326c2, int i) {
        if (c0326c.f4005d == this) {
            e(c0326c.f4006e, c0326c2.f4005d, c0326c2.f4006e, i);
        }
    }

    public final void g(C0317c c0317c) {
        c0317c.k(this.f4016I);
        c0317c.k(this.f4017J);
        c0317c.k(this.f4018K);
        c0317c.k(this.f4019L);
        if (this.f4035a0 > 0) {
            c0317c.k(this.f4020M);
        }
    }

    public final void h() {
        if (this.f4040d == null) {
            C0340k c0340k = new C0340k(this);
            c0340k.h.f4176e = 4;
            c0340k.i.f4176e = 5;
            c0340k.f4200f = 0;
            this.f4040d = c0340k;
        }
        if (this.f4042e == null) {
            C0342m c0342m = new C0342m(this);
            C0335f c0335f = new C0335f(c0342m);
            c0342m.f4187k = c0335f;
            c0342m.f4188l = null;
            c0342m.h.f4176e = 6;
            c0342m.i.f4176e = 7;
            c0335f.f4176e = 8;
            c0342m.f4200f = 1;
            this.f4042e = c0342m;
        }
    }

    public C0326c i(int i) {
        switch (AbstractC0319e.a(i)) {
            case 0:
                return null;
            case 1:
                return this.f4016I;
            case 2:
                return this.f4017J;
            case GameConfig.COMBO_EVERY /* 3 */:
                return this.f4018K;
            case 4:
                return this.f4019L;
            case 5:
                return this.f4020M;
            case 6:
                return this.f4023P;
            case 7:
                return this.f4021N;
            case 8:
                return this.f4022O;
            default:
                throw new AssertionError(X0.e.h(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.f4061p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f4047g0 == 8) {
            return 0;
        }
        return this.f4029V;
    }

    public final C0327d l(int i) {
        C0326c c0326c;
        C0326c c0326c2;
        if (i != 0) {
            if (i == 1 && (c0326c2 = (c0326c = this.f4019L).f4007f) != null && c0326c2.f4007f == c0326c) {
                return c0326c2.f4005d;
            }
            return null;
        }
        C0326c c0326c3 = this.f4018K;
        C0326c c0326c4 = c0326c3.f4007f;
        if (c0326c4 == null || c0326c4.f4007f != c0326c3) {
            return null;
        }
        return c0326c4.f4005d;
    }

    public final C0327d m(int i) {
        C0326c c0326c;
        C0326c c0326c2;
        if (i != 0) {
            if (i == 1 && (c0326c2 = (c0326c = this.f4017J).f4007f) != null && c0326c2.f4007f == c0326c) {
                return c0326c2.f4005d;
            }
            return null;
        }
        C0326c c0326c3 = this.f4016I;
        C0326c c0326c4 = c0326c3.f4007f;
        if (c0326c4 == null || c0326c4.f4007f != c0326c3) {
            return null;
        }
        return c0326c4.f4005d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f4049j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f4028U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f4029V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f4032Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.f4033Z);
        sb.append("\n");
        p(sb, "left", this.f4016I);
        p(sb, "top", this.f4017J);
        p(sb, "right", this.f4018K);
        p(sb, "bottom", this.f4019L);
        p(sb, "baseline", this.f4020M);
        p(sb, "centerX", this.f4021N);
        p(sb, "centerY", this.f4022O);
        int i = this.f4028U;
        int i2 = this.f4037b0;
        int[] iArr = this.f4011C;
        int i3 = iArr[0];
        int i4 = this.f4066u;
        int i5 = this.f4063r;
        float f2 = this.f4068w;
        float[] fArr = this.f4052k0;
        float f3 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f2);
        int i6 = this.f4029V;
        int i7 = this.f4039c0;
        int i8 = iArr[1];
        int i9 = this.f4069x;
        int i10 = this.f4064s;
        float f4 = this.f4071z;
        float f5 = fArr[1];
        o(sb, "    height", i6, i7, i8, i9, i10, f4);
        float f6 = this.f4030W;
        int i11 = this.f4031X;
        if (f6 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f6);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.f4041d0, 0.5f);
        H(sb, "    verticalBias", this.f4043e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.f4050j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f4047g0 == 8) {
            return 0;
        }
        return this.f4028U;
    }

    public final int r() {
        C0327d c0327d = this.f4027T;
        return (c0327d == null || !(c0327d instanceof C0328e)) ? this.f4032Y : ((C0328e) c0327d).x0 + this.f4032Y;
    }

    public final int s() {
        C0327d c0327d = this.f4027T;
        return (c0327d == null || !(c0327d instanceof C0328e)) ? this.f4033Z : ((C0328e) c0327d).f4090y0 + this.f4033Z;
    }

    public final boolean t(int i) {
        if (i == 0) {
            return (this.f4016I.f4007f != null ? 1 : 0) + (this.f4018K.f4007f != null ? 1 : 0) < 2;
        }
        return ((this.f4017J.f4007f != null ? 1 : 0) + (this.f4019L.f4007f != null ? 1 : 0)) + (this.f4020M.f4007f != null ? 1 : 0) < 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.f4048h0 != null) {
            str = "id: " + this.f4048h0 + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f4032Y);
        sb.append(", ");
        sb.append(this.f4033Z);
        sb.append(") - (");
        sb.append(this.f4028U);
        sb.append(" x ");
        sb.append(this.f4029V);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i, int i2) {
        C0326c c0326c;
        C0326c c0326c2;
        C0326c c0326c3;
        C0326c c0326c4;
        if (i == 0) {
            C0326c c0326c5 = this.f4016I;
            C0326c c0326c6 = c0326c5.f4007f;
            if (c0326c6 != null && c0326c6.f4004c && (c0326c4 = (c0326c3 = this.f4018K).f4007f) != null && c0326c4.f4004c) {
                return (c0326c4.d() - c0326c3.e()) - (c0326c5.e() + c0326c5.f4007f.d()) >= i2;
            }
        } else {
            C0326c c0326c7 = this.f4017J;
            C0326c c0326c8 = c0326c7.f4007f;
            if (c0326c8 != null && c0326c8.f4004c && (c0326c2 = (c0326c = this.f4019L).f4007f) != null && c0326c2.f4004c) {
                return (c0326c2.d() - c0326c.e()) - (c0326c7.e() + c0326c7.f4007f.d()) >= i2;
            }
        }
        return false;
    }

    public final void v(int i, int i2, int i3, int i4, C0327d c0327d) {
        i(i).b(c0327d.i(i2), i3, i4, true);
    }

    public final boolean w(int i) {
        C0326c c0326c;
        C0326c c0326c2;
        int i2 = i * 2;
        C0326c[] c0326cArr = this.f4024Q;
        C0326c c0326c3 = c0326cArr[i2];
        C0326c c0326c4 = c0326c3.f4007f;
        return (c0326c4 == null || c0326c4.f4007f == c0326c3 || (c0326c2 = (c0326c = c0326cArr[i2 + 1]).f4007f) == null || c0326c2.f4007f != c0326c) ? false : true;
    }

    public final boolean x() {
        C0326c c0326c = this.f4016I;
        C0326c c0326c2 = c0326c.f4007f;
        if (c0326c2 != null && c0326c2.f4007f == c0326c) {
            return true;
        }
        C0326c c0326c3 = this.f4018K;
        C0326c c0326c4 = c0326c3.f4007f;
        return c0326c4 != null && c0326c4.f4007f == c0326c3;
    }

    public final boolean y() {
        C0326c c0326c = this.f4017J;
        C0326c c0326c2 = c0326c.f4007f;
        if (c0326c2 != null && c0326c2.f4007f == c0326c) {
            return true;
        }
        C0326c c0326c3 = this.f4019L;
        C0326c c0326c4 = c0326c3.f4007f;
        return c0326c4 != null && c0326c4.f4007f == c0326c3;
    }

    public final boolean z() {
        return this.f4046g && this.f4047g0 != 8;
    }
}
