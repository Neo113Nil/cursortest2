package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.dO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3093dO extends AbstractC2982bM {

    /* renamed from: K0, reason: collision with root package name */
    public static final /* synthetic */ int f30001K0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final AbstractC3149eQ[] f30002A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f30003A0;

    /* renamed from: B, reason: collision with root package name */
    public final AbstractC3149eQ[] f30004B;

    /* renamed from: B0, reason: collision with root package name */
    public final boolean f30005B0;

    /* renamed from: C, reason: collision with root package name */
    public final C3554m f30006C;
    public boolean C0;

    /* renamed from: D, reason: collision with root package name */
    public final C3709ot f30007D;

    /* renamed from: D0, reason: collision with root package name */
    public final int f30008D0;

    /* renamed from: E, reason: collision with root package name */
    public final Mt f30009E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f30010E0;

    /* renamed from: F, reason: collision with root package name */
    public final C3365iO f30011F;

    /* renamed from: F0, reason: collision with root package name */
    public C3181f3 f30012F0;

    /* renamed from: G, reason: collision with root package name */
    public final C3759pp f30013G;

    /* renamed from: G0, reason: collision with root package name */
    public C4280zO f30014G0;

    /* renamed from: H, reason: collision with root package name */
    public final CopyOnWriteArraySet f30015H;

    /* renamed from: H0, reason: collision with root package name */
    public int f30016H0;

    /* renamed from: I, reason: collision with root package name */
    public final L7 f30017I;

    /* renamed from: I0, reason: collision with root package name */
    public long f30018I0;
    public final ArrayList J;

    /* renamed from: J0, reason: collision with root package name */
    public XQ f30019J0;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f30020K;

    /* renamed from: L, reason: collision with root package name */
    public final OO f30021L;

    /* renamed from: M, reason: collision with root package name */
    public final Looper f30022M;

    /* renamed from: N, reason: collision with root package name */
    public final InterfaceC4147x f30023N;

    /* renamed from: O, reason: collision with root package name */
    public final T2 f30024O;

    /* renamed from: P, reason: collision with root package name */
    public final VN f30025P;

    /* renamed from: Q, reason: collision with root package name */
    public final M f30026Q;

    /* renamed from: R, reason: collision with root package name */
    public final C4088vv f30027R;

    /* renamed from: S, reason: collision with root package name */
    public final O2 f30028S;

    /* renamed from: T, reason: collision with root package name */
    public final long f30029T;

    /* renamed from: U, reason: collision with root package name */
    public final C2728Pl f30030U;

    /* renamed from: V, reason: collision with root package name */
    public final C4313b f30031V;

    /* renamed from: W, reason: collision with root package name */
    public final C4017ue f30032W;

    /* renamed from: X, reason: collision with root package name */
    public final C4164xG f30033X;
    public final C4164xG Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f30034Z;

    /* renamed from: n0, reason: collision with root package name */
    public int f30035n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f30036o0;

    /* renamed from: p0, reason: collision with root package name */
    public final GO f30037p0;

    /* renamed from: q0, reason: collision with root package name */
    public final HO f30038q0;

    /* renamed from: r0, reason: collision with root package name */
    public final TN f30039r0;

    /* renamed from: s0, reason: collision with root package name */
    public C3399j6 f30040s0;

    /* renamed from: t0, reason: collision with root package name */
    public C3181f3 f30041t0;

    /* renamed from: u0, reason: collision with root package name */
    public Surface f30042u0;

    /* renamed from: v, reason: collision with root package name */
    public final C3877s f30043v;

    /* renamed from: v0, reason: collision with root package name */
    public Surface f30044v0;

    /* renamed from: w, reason: collision with root package name */
    public final C3399j6 f30045w;

    /* renamed from: w0, reason: collision with root package name */
    public final int f30046w0;

    /* renamed from: x, reason: collision with root package name */
    public final C2865Xm f30047x;

    /* renamed from: x0, reason: collision with root package name */
    public Xr f30048x0;

    /* renamed from: y, reason: collision with root package name */
    public final Context f30049y;

    /* renamed from: y0, reason: collision with root package name */
    public final C2777Sj f30050y0;

    /* renamed from: z, reason: collision with root package name */
    public final IO f30051z;

    /* renamed from: z0, reason: collision with root package name */
    public float f30052z0;

    static {
        A2.a("media3.exoplayer");
    }

    public C3093dO(SN sn, IO io) {
        super(5);
        this.f30047x = new C2865Xm();
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = AbstractC3548lu.f32613a;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 31 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.10.0] [");
            sb.append(str);
            sb.append("]");
            AbstractC3217fl.y("ExoPlayerImpl", sb.toString());
            Context context = sn.f27537a;
            Looper looper = sn.f27544h;
            this.f30049y = context.getApplicationContext();
            T2 t22 = sn.f27538b;
            this.f30021L = new OO(t22);
            this.f30008D0 = sn.i;
            this.f30050y0 = sn.f27545j;
            this.f30046w0 = sn.f27546k;
            this.f30003A0 = false;
            this.f30029T = sn.f27551p;
            VN vn = new VN(this);
            this.f30025P = vn;
            this.f30026Q = new M(1);
            Handler handler = new Handler(looper);
            C2478Aq c2478Aq = sn.f27539c;
            int i = SN.f27536z;
            this.f30002A = ((Rx) c2478Aq.f23905u).h(handler, vn, vn);
            this.f30004B = new AbstractC3149eQ[2];
            int i4 = 0;
            while (true) {
                AbstractC3149eQ[] abstractC3149eQArr = this.f30004B;
                int length = abstractC3149eQArr.length;
                if (i4 >= 2) {
                    break;
                }
                AbstractC3149eQ abstractC3149eQ = this.f30002A[i4];
                abstractC3149eQArr[i4] = null;
                i4++;
            }
            this.f30006C = (C3554m) sn.f27541e.a();
            sn.f27540d.a();
            this.f30023N = (InterfaceC4147x) sn.f27543g.a();
            this.f30020K = sn.f27547l;
            this.f30038q0 = sn.f27548m;
            this.f30037p0 = sn.f27549n;
            this.f30022M = looper;
            this.f30024O = t22;
            this.f30051z = io;
            this.f30013G = new C3759pp(new CopyOnWriteArraySet(), looper, looper.getThread(), t22, new C2929aO(this), true);
            this.f30015H = new CopyOnWriteArraySet();
            this.J = new ArrayList();
            this.f30019J0 = new XQ();
            this.f30039r0 = TN.f27746a;
            int length2 = this.f30002A.length;
            this.f30043v = new C3877s(new FO[2], new InterfaceC3716p[2], C4176xb.f35186b, null);
            this.f30017I = new L7();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i9 = 0; i9 < 20; i9++) {
                int i10 = iArr[i9];
                PA.T(!false);
                sparseBooleanArray.append(i10, true);
            }
            this.f30006C.getClass();
            PA.T(!false);
            sparseBooleanArray.append(29, true);
            PA.T(!false);
            C3526lP c3526lP = new C3526lP(sparseBooleanArray);
            this.f30045w = new C3399j6(c3526lP);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i11 = 0; i11 < c3526lP.f32566a.size(); i11++) {
                int a9 = c3526lP.a(i11);
                PA.T(!false);
                sparseBooleanArray2.append(a9, true);
            }
            PA.T(!false);
            sparseBooleanArray2.append(4, true);
            PA.T(!false);
            sparseBooleanArray2.append(10, true);
            PA.T(!false);
            this.f30040s0 = new C3399j6(new C3526lP(sparseBooleanArray2));
            this.f30007D = this.f30024O.A(this.f30022M, null);
            Mt mt = new Mt(11, this);
            this.f30009E = mt;
            this.f30014G0 = C4280zO.a(this.f30043v);
            this.f30021L.B(this.f30051z, this.f30022M);
            VO vo = new VO(sn.f27558w);
            C3365iO c3365iO = new C3365iO(this.f30049y, this.f30002A, this.f30004B, this.f30006C, this.f30043v, (InterfaceC3525lO) sn.f27542f.a(), this.f30023N, this.f30021L, this.f30038q0, sn.f27560y, sn.f27550o, sn.f27559x, this.f30022M, this.f30024O, mt, vo, this.f30039r0);
            Looper looper2 = c3365iO.f31334B;
            C3709ot c3709ot = c3365iO.f31382z;
            this.f30011F = c3365iO;
            this.f30052z0 = 1.0f;
            C3181f3 c3181f3 = C3181f3.f30581B;
            this.f30041t0 = c3181f3;
            this.f30012F0 = c3181f3;
            this.f30016H0 = -1;
            FB fb = C2794Tj.f27817a;
            this.f30005B0 = true;
            OO oo = this.f30021L;
            oo.getClass();
            this.f30013G.a(oo);
            InterfaceC4147x interfaceC4147x = this.f30023N;
            Handler handler2 = new Handler(this.f30022M);
            OO oo2 = this.f30021L;
            A a10 = (A) interfaceC4147x;
            a10.getClass();
            oo2.getClass();
            C3562m7 c3562m7 = a10.f23786v;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c3562m7.f32668u;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C4093w c4093w = (C4093w) it.next();
                if (c4093w.f34911b == oo2) {
                    c4093w.f34912c = true;
                    copyOnWriteArrayList.remove(c4093w);
                }
            }
            ((CopyOnWriteArrayList) c3562m7.f32668u).add(new C4093w(handler2, oo2));
            this.f30015H.add(this.f30025P);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31) {
                this.f30024O.A(looper2, null).e(new K2.i(this.f30049y, sn.f27556u, this, vo));
            }
            C2728Pl c2728Pl = new C2728Pl(looper2, this.f30022M, this.f30024O, new C2929aO(this));
            this.f30030U = c2728Pl;
            RunnableC3873rw runnableC3873rw = new RunnableC3873rw(12, this);
            C3709ot c3709ot2 = (C3709ot) c2728Pl.f27030b;
            if (c3709ot2.f33230a.getLooper().getThread().isAlive()) {
                c3709ot2.e(runnableC3873rw);
            }
            T2 t23 = this.f30024O;
            C2837Wb c2837Wb = new C2837Wb(13);
            context.getApplicationContext();
            t23.A(looper2, null);
            new Q0.d(c2837Wb, t23.A(looper, null));
            boolean z8 = (sn.f27553r == Integer.MAX_VALUE || sn.f27554s == Integer.MAX_VALUE) ? false : true;
            C4088vv c4088vv = new C4088vv(context, looper2, this.f30024O);
            this.f30027R = c4088vv;
            if (c4088vv.f34897n != z8) {
                c4088vv.f34897n = z8;
                c4088vv.k(z8, c4088vv.f34898u);
            }
            T2 t24 = this.f30024O;
            O2 o22 = new O2(3);
            context.getApplicationContext();
            t24.A(looper2, null);
            t24.A(Looper.getMainLooper(), null);
            this.f30028S = o22;
            int i13 = AbstractC3471kO.f32294a;
            C3100dd c3100dd = C3100dd.f30070d;
            this.f30048x0 = Xr.f28710c;
            this.f30032W = i12 >= 34 ? new C4017ue(this, context) : null;
            this.f30033X = new C4164xG(this);
            this.Y = new C4164xG(this);
            this.f30031V = new C4313b(this, this.f30025P, this.f30024O, sn.f27552q, sn.f27553r, sn.f27554s, sn.f27555t);
            c3709ot.b(38, this.f30037p0).a();
            C2777Sj c2777Sj = this.f30050y0;
            c3709ot.getClass();
            C3333ht g9 = C3709ot.g();
            g9.f31278a = c3709ot.f33230a.obtainMessage(31, 0, 0, c2777Sj);
            g9.a();
            M1(1, 3, this.f30050y0);
            M1(2, 4, Integer.valueOf(this.f30046w0));
            M1(2, 5, 0);
            M1(1, 9, Boolean.valueOf(this.f30003A0));
            M1(6, 8, this.f30026Q);
            M1(-1, 16, Integer.valueOf(this.f30008D0));
            this.f30047x.a();
        } catch (Throwable th) {
            this.f30047x.a();
            throw th;
        }
    }

    public static long F1(C4280zO c4280zO) {
        Y7 y72 = new Y7();
        L7 l72 = new L7();
        AbstractC3832r8 abstractC3832r8 = c4280zO.f35530a;
        abstractC3832r8.o(c4280zO.f35531b.f24043a, l72);
        long j9 = c4280zO.f35532c;
        if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
            return j9;
        }
        abstractC3832r8.b(l72.f26108c, y72, 0L).getClass();
        return 0L;
    }

    public static C4280zO H1(C4280zO c4280zO, int i) {
        C4280zO d2 = c4280zO.d(i);
        return (i == 1 || i == 4) ? d2.f(false) : d2;
    }

    public final void A1(RN rn) {
        C4280zO c4280zO = this.f30014G0;
        C4280zO g9 = c4280zO.g(c4280zO.f35531b);
        g9.f35544p = g9.f35546r;
        g9.f35545q = 0L;
        C4280zO H1 = H1(g9, 1);
        if (rn != null) {
            H1 = H1.e(rn);
        }
        C4280zO c4280zO2 = H1;
        this.f30034Z++;
        C3709ot c3709ot = this.f30011F.f31382z;
        c3709ot.getClass();
        C3333ht g10 = C3709ot.g();
        g10.f31278a = c3709ot.f33230a.obtainMessage(6);
        g10.a();
        E1(c4280zO2, 0, false, 5, com.anythink.basead.exoplayer.b.f6539b, -1);
    }

    public final int B1(C4280zO c4280zO) {
        AbstractC3832r8 abstractC3832r8 = c4280zO.f35530a;
        return abstractC3832r8.g() ? this.f30016H0 : abstractC3832r8.o(c4280zO.f35531b.f24043a, this.f30017I).f26108c;
    }

    public final long C1(C4280zO c4280zO) {
        BQ bq = c4280zO.f35531b;
        if (!bq.b()) {
            return AbstractC3548lu.t(D1(c4280zO));
        }
        Object obj = bq.f24043a;
        L7 l72 = this.f30017I;
        AbstractC3832r8 abstractC3832r8 = c4280zO.f35530a;
        abstractC3832r8.o(obj, l72);
        long j9 = c4280zO.f35532c;
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            abstractC3832r8.b(B1(c4280zO), (Y7) this.f29483n, 0L).getClass();
            return AbstractC3548lu.t(0L);
        }
        return AbstractC3548lu.t(j9) + AbstractC3548lu.t(0L);
    }

    public final long D1(C4280zO c4280zO) {
        AbstractC3832r8 abstractC3832r8 = c4280zO.f35530a;
        if (abstractC3832r8.g()) {
            return AbstractC3548lu.u(this.f30018I0);
        }
        long j9 = c4280zO.f35546r;
        BQ bq = c4280zO.f35531b;
        if (bq.b()) {
            return j9;
        }
        abstractC3832r8.o(bq.f24043a, this.f30017I);
        return j9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05a3 A[LOOP:0: B:109:0x059b->B:111:0x05a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x05d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0614 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0623 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x052a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E1(final C4280zO c4280zO, int i, boolean z8, int i4, long j9, int i9) {
        int i10;
        int i11;
        boolean z9;
        Pair pair;
        boolean z10;
        boolean z11;
        int i12;
        boolean booleanValue;
        C3235g2 c3235g2;
        List list;
        int i13;
        boolean z12;
        boolean z13;
        AbstractC3832r8 r12;
        C3181f3 c3181f3;
        int i14;
        int i15;
        int m12;
        O2 o22;
        C4088vv c4088vv;
        boolean p1;
        boolean z14;
        boolean z15;
        int i16;
        RN rn;
        RN rn2;
        C3877s c3877s;
        C3877s c3877s2;
        final byte b9;
        final int i17;
        C3399j6 c3399j6;
        boolean A12;
        AbstractC3832r8 r13;
        int i18;
        boolean z16;
        AbstractC3832r8 r14;
        boolean z17;
        boolean z18;
        AbstractC3832r8 r15;
        boolean z19;
        boolean z20;
        boolean g9;
        C3526lP c3526lP;
        int i19;
        C3399j6 c3399j62;
        int i20;
        int i21;
        Object obj;
        C3235g2 c3235g22;
        Object obj2;
        long j10;
        long F12;
        int i22;
        Object obj3;
        C3235g2 c3235g23;
        Object obj4;
        int i23 = i4;
        C4280zO c4280zO2 = this.f30014G0;
        this.f30014G0 = c4280zO;
        AbstractC3832r8 abstractC3832r8 = c4280zO.f35530a;
        if (!abstractC3832r8.g()) {
            Object obj5 = c4280zO.f35531b.f24043a;
            PA.U(String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", obj5, abstractC3832r8.getClass().getName(), Integer.valueOf(abstractC3832r8.a())), abstractC3832r8.e(obj5) != -1);
        }
        AbstractC3832r8 abstractC3832r82 = c4280zO2.f35530a;
        boolean equals = abstractC3832r82.equals(abstractC3832r8);
        if (abstractC3832r8.g() && abstractC3832r82.g()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else {
            if (abstractC3832r8.g() == abstractC3832r82.g()) {
                BQ bq = c4280zO2.f35531b;
                Object obj6 = bq.f24043a;
                i10 = 0;
                L7 l72 = this.f30017I;
                int i24 = abstractC3832r82.o(obj6, l72).f26108c;
                Y7 y72 = (Y7) this.f29483n;
                Object obj7 = abstractC3832r82.b(i24, y72, 0L).f28794a;
                BQ bq2 = c4280zO.f35531b;
                if (obj7.equals(abstractC3832r8.b(abstractC3832r8.o(bq2.f24043a, l72).f26108c, y72, 0L).f28794a)) {
                    if (z8) {
                        if (i23 != 0) {
                            i11 = i23;
                        } else if (bq.f24046d < bq2.f24046d) {
                            pair = new Pair(Boolean.TRUE, 0);
                            i11 = 0;
                            z9 = true;
                        } else {
                            i11 = 0;
                        }
                        z9 = true;
                    } else {
                        i11 = i23;
                        z9 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                } else {
                    if (!z8) {
                        z10 = false;
                        z11 = false;
                    } else if (i23 == 0) {
                        i23 = 0;
                        i12 = 1;
                        z11 = true;
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i12));
                        i11 = i23;
                        z9 = z11;
                    } else {
                        z10 = true;
                        z11 = true;
                    }
                    if (z10 && i23 == 1) {
                        i12 = 2;
                    } else {
                        if (equals) {
                            throw new IllegalStateException();
                        }
                        i12 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i12));
                    i11 = i23;
                    z9 = z11;
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                int intValue = ((Integer) pair.second).intValue();
                if (booleanValue) {
                    c3235g2 = null;
                } else {
                    c3235g2 = !abstractC3832r8.g() ? abstractC3832r8.b(abstractC3832r8.o(c4280zO.f35531b.f24043a, this.f30017I).f26108c, (Y7) this.f29483n, 0L).f28795b : null;
                    this.f30012F0 = C3181f3.f30581B;
                }
                if (booleanValue && c4280zO2.f35538j.equals(c4280zO.f35538j)) {
                    z12 = z9;
                } else {
                    P2 a9 = this.f30012F0.a();
                    list = c4280zO.f35538j;
                    i13 = i10;
                    while (i13 < list.size()) {
                        R3 r32 = (R3) list.get(i13);
                        int i25 = i10;
                        while (true) {
                            InterfaceC4043v3[] interfaceC4043v3Arr = r32.f27306a;
                            z13 = z9;
                            if (i25 < interfaceC4043v3Arr.length) {
                                interfaceC4043v3Arr[i25].a(a9);
                                i25++;
                                z9 = z13;
                            }
                        }
                        i13++;
                        z9 = z13;
                    }
                    z12 = z9;
                    this.f30012F0 = new C3181f3(a9);
                }
                r12 = r1();
                if (r12.g()) {
                    C3235g2 c3235g24 = r12.b(t1(), (Y7) this.f29483n, 0L).f28795b;
                    P2 a10 = this.f30012F0.a();
                    C3181f3 c3181f32 = c3235g24.f30941d;
                    if (c3181f32 != null) {
                        CharSequence charSequence = c3181f32.f30583a;
                        if (charSequence != null) {
                            a10.f26799a = charSequence;
                        }
                        CharSequence charSequence2 = c3181f32.f30584b;
                        if (charSequence2 != null) {
                            a10.f26800b = charSequence2;
                        }
                        CharSequence charSequence3 = c3181f32.f30585c;
                        if (charSequence3 != null) {
                            a10.f26801c = charSequence3;
                        }
                        CharSequence charSequence4 = c3181f32.f30586d;
                        if (charSequence4 != null) {
                            a10.f26802d = charSequence4;
                        }
                        CharSequence charSequence5 = c3181f32.f30587e;
                        if (charSequence5 != null) {
                            a10.f26803e = charSequence5;
                        }
                        byte[] bArr = c3181f32.f30588f;
                        if (bArr != null) {
                            a10.f26804f = (byte[]) bArr.clone();
                            a10.f26805g = c3181f32.f30589g;
                        }
                        Integer num = c3181f32.f30590h;
                        if (num != null) {
                            a10.f26806h = num;
                        }
                        Integer num2 = c3181f32.i;
                        if (num2 != null) {
                            a10.i = num2;
                        }
                        Integer num3 = c3181f32.f30591j;
                        if (num3 != null) {
                            a10.f26807j = num3;
                        }
                        Boolean bool = c3181f32.f30592k;
                        if (bool != null) {
                            a10.f26808k = bool;
                        }
                        Integer num4 = c3181f32.f30593l;
                        if (num4 != null) {
                            a10.f26809l = num4;
                        }
                        Integer num5 = c3181f32.f30594m;
                        if (num5 != null) {
                            a10.f26809l = num5;
                        }
                        Integer num6 = c3181f32.f30595n;
                        if (num6 != null) {
                            a10.f26810m = num6;
                        }
                        Integer num7 = c3181f32.f30596o;
                        if (num7 != null) {
                            a10.f26811n = num7;
                        }
                        Integer num8 = c3181f32.f30597p;
                        if (num8 != null) {
                            a10.f26812o = num8;
                        }
                        Integer num9 = c3181f32.f30598q;
                        if (num9 != null) {
                            a10.f26813p = num9;
                        }
                        Integer num10 = c3181f32.f30599r;
                        if (num10 != null) {
                            a10.f26814q = num10;
                        }
                        CharSequence charSequence6 = c3181f32.f30600s;
                        if (charSequence6 != null) {
                            a10.f26815r = charSequence6;
                        }
                        CharSequence charSequence7 = c3181f32.f30601t;
                        if (charSequence7 != null) {
                            a10.f26816s = charSequence7;
                        }
                        CharSequence charSequence8 = c3181f32.f30602u;
                        if (charSequence8 != null) {
                            a10.f26817t = charSequence8;
                        }
                        Integer num11 = c3181f32.f30603v;
                        if (num11 != null) {
                            a10.f26818u = num11;
                        }
                        Integer num12 = c3181f32.f30604w;
                        if (num12 != null) {
                            a10.f26819v = num12;
                        }
                        CharSequence charSequence9 = c3181f32.f30605x;
                        if (charSequence9 != null) {
                            a10.f26820w = charSequence9;
                        }
                        CharSequence charSequence10 = c3181f32.f30606y;
                        if (charSequence10 != null) {
                            a10.f26821x = charSequence10;
                        }
                        Integer num13 = c3181f32.f30607z;
                        if (num13 != null) {
                            a10.f26822y = num13;
                        }
                        UB ub = c3181f32.f30582A;
                        if (!ub.isEmpty()) {
                            a10.f26823z = UB.n(ub);
                        }
                    }
                    c3181f3 = new C3181f3(a10);
                } else {
                    c3181f3 = this.f30012F0;
                }
                boolean equals2 = c3181f3.equals(this.f30041t0);
                this.f30041t0 = c3181f3;
                i14 = c4280zO2.f35540l == c4280zO.f35540l ? 1 : i10;
                i15 = c4280zO2.f35534e == c4280zO.f35534e ? 1 : i10;
                if (i15 == 0 || i14 != 0) {
                    m12 = m1();
                    o22 = this.f30028S;
                    c4088vv = this.f30027R;
                    if (m12 != 2 || m12 == 3) {
                        P0();
                        this.f30014G0.getClass();
                        c4088vv.g(p1());
                        p1 = p1();
                        if (o22.f26640u != p1) {
                            o22.f26640u = p1;
                        }
                    } else {
                        boolean z21 = i10;
                        c4088vv.g(z21);
                        if (o22.f26640u) {
                            o22.f26640u = z21;
                        }
                    }
                }
                z14 = c4280zO2.f35536g == c4280zO.f35536g;
                if (!equals) {
                    this.f30013G.c(0, new ZN(c4280zO, i));
                }
                if (z12) {
                    z15 = equals2;
                    i16 = i15;
                } else {
                    L7 l73 = new L7();
                    if (abstractC3832r82.g()) {
                        z15 = equals2;
                        i16 = i15;
                        i20 = i9;
                        i21 = i20;
                        obj = null;
                        c3235g22 = null;
                        obj2 = null;
                    } else {
                        Object obj8 = c4280zO2.f35531b.f24043a;
                        abstractC3832r82.o(obj8, l73);
                        int i26 = l73.f26108c;
                        int e6 = abstractC3832r82.e(obj8);
                        Y7 y73 = (Y7) this.f29483n;
                        z15 = equals2;
                        i16 = i15;
                        obj = abstractC3832r82.b(i26, y73, 0L).f28794a;
                        c3235g22 = y73.f28795b;
                        obj2 = obj8;
                        i20 = i26;
                        i21 = e6;
                    }
                    if (i11 == 0) {
                        BQ bq3 = c4280zO2.f35531b;
                        if (bq3.b()) {
                            j10 = l73.b(bq3.f24044b, bq3.f24045c);
                            F12 = F1(c4280zO2);
                            String str = AbstractC3548lu.f32613a;
                            BQ bq4 = c4280zO2.f35531b;
                            C2967b7 c2967b7 = new C2967b7(obj, i20, c3235g22, obj2, i21, AbstractC3548lu.t(j10), AbstractC3548lu.t(F12), bq4.f24044b, bq4.f24045c);
                            int t12 = t1();
                            int O12 = O1();
                            if (this.f30014G0.f35530a.g()) {
                                C4280zO c4280zO3 = this.f30014G0;
                                Object obj9 = c4280zO3.f35531b.f24043a;
                                c4280zO3.f35530a.o(obj9, this.f30017I);
                                int e9 = this.f30014G0.f35530a.e(obj9);
                                AbstractC3832r8 abstractC3832r83 = this.f30014G0.f35530a;
                                Y7 y74 = (Y7) this.f29483n;
                                i22 = e9;
                                obj3 = abstractC3832r83.b(t12, y74, 0L).f28794a;
                                c3235g23 = y74.f28795b;
                                obj4 = obj9;
                            } else {
                                i22 = O12;
                                obj3 = null;
                                c3235g23 = null;
                                obj4 = null;
                            }
                            long t9 = AbstractC3548lu.t(j9);
                            long t10 = !this.f30014G0.f35531b.b() ? AbstractC3548lu.t(F1(this.f30014G0)) : t9;
                            BQ bq5 = this.f30014G0.f35531b;
                            C2967b7 c2967b72 = new C2967b7(obj3, t12, c3235g23, obj4, i22, t9, t10, bq5.f24044b, bq5.f24045c);
                            C3759pp c3759pp = this.f30013G;
                            C3398j5 c3398j5 = new C3398j5();
                            c3398j5.f32083n = i11;
                            c3398j5.f32084u = c2967b7;
                            c3398j5.f32085v = c2967b72;
                            c3759pp.c(11, c3398j5);
                        } else {
                            j10 = bq3.f24047e != -1 ? F1(this.f30014G0) : l73.f26109d;
                            F12 = j10;
                            String str2 = AbstractC3548lu.f32613a;
                            BQ bq42 = c4280zO2.f35531b;
                            C2967b7 c2967b73 = new C2967b7(obj, i20, c3235g22, obj2, i21, AbstractC3548lu.t(j10), AbstractC3548lu.t(F12), bq42.f24044b, bq42.f24045c);
                            int t122 = t1();
                            int O122 = O1();
                            if (this.f30014G0.f35530a.g()) {
                            }
                            long t92 = AbstractC3548lu.t(j9);
                            if (!this.f30014G0.f35531b.b()) {
                            }
                            BQ bq52 = this.f30014G0.f35531b;
                            C2967b7 c2967b722 = new C2967b7(obj3, t122, c3235g23, obj4, i22, t92, t10, bq52.f24044b, bq52.f24045c);
                            C3759pp c3759pp2 = this.f30013G;
                            C3398j5 c3398j52 = new C3398j5();
                            c3398j52.f32083n = i11;
                            c3398j52.f32084u = c2967b73;
                            c3398j52.f32085v = c2967b722;
                            c3759pp2.c(11, c3398j52);
                        }
                    } else if (c4280zO2.f35531b.b()) {
                        j10 = c4280zO2.f35546r;
                        F12 = F1(c4280zO2);
                        String str22 = AbstractC3548lu.f32613a;
                        BQ bq422 = c4280zO2.f35531b;
                        C2967b7 c2967b732 = new C2967b7(obj, i20, c3235g22, obj2, i21, AbstractC3548lu.t(j10), AbstractC3548lu.t(F12), bq422.f24044b, bq422.f24045c);
                        int t1222 = t1();
                        int O1222 = O1();
                        if (this.f30014G0.f35530a.g()) {
                        }
                        long t922 = AbstractC3548lu.t(j9);
                        if (!this.f30014G0.f35531b.b()) {
                        }
                        BQ bq522 = this.f30014G0.f35531b;
                        C2967b7 c2967b7222 = new C2967b7(obj3, t1222, c3235g23, obj4, i22, t922, t10, bq522.f24044b, bq522.f24045c);
                        C3759pp c3759pp22 = this.f30013G;
                        C3398j5 c3398j522 = new C3398j5();
                        c3398j522.f32083n = i11;
                        c3398j522.f32084u = c2967b732;
                        c3398j522.f32085v = c2967b7222;
                        c3759pp22.c(11, c3398j522);
                    } else {
                        j10 = c4280zO2.f35546r;
                        F12 = j10;
                        String str222 = AbstractC3548lu.f32613a;
                        BQ bq4222 = c4280zO2.f35531b;
                        C2967b7 c2967b7322 = new C2967b7(obj, i20, c3235g22, obj2, i21, AbstractC3548lu.t(j10), AbstractC3548lu.t(F12), bq4222.f24044b, bq4222.f24045c);
                        int t12222 = t1();
                        int O12222 = O1();
                        if (this.f30014G0.f35530a.g()) {
                        }
                        long t9222 = AbstractC3548lu.t(j9);
                        if (!this.f30014G0.f35531b.b()) {
                        }
                        BQ bq5222 = this.f30014G0.f35531b;
                        C2967b7 c2967b72222 = new C2967b7(obj3, t12222, c3235g23, obj4, i22, t9222, t10, bq5222.f24044b, bq5222.f24045c);
                        C3759pp c3759pp222 = this.f30013G;
                        C3398j5 c3398j5222 = new C3398j5();
                        c3398j5222.f32083n = i11;
                        c3398j5222.f32084u = c2967b7322;
                        c3398j5222.f32085v = c2967b72222;
                        c3759pp222.c(11, c3398j5222);
                    }
                }
                if (booleanValue) {
                    this.f30013G.c(1, new C3307hK(c3235g2, intValue));
                }
                rn = c4280zO2.f35535f;
                rn2 = c4280zO.f35535f;
                if (rn != rn2) {
                    C3759pp c3759pp3 = this.f30013G;
                    final int i27 = 3;
                    c3759pp3.c(10, new InterfaceC3865ro() { // from class: com.google.android.gms.internal.ads.WN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
                        /* renamed from: b */
                        public final /* synthetic */ void mo2b(Object obj10) {
                            C4280zO c4280zO4 = c4280zO;
                            I6 i62 = (I6) obj10;
                            switch (i27) {
                                case 0:
                                    int i28 = C3093dO.f30001K0;
                                    i62.g0(c4280zO4.f35535f);
                                    break;
                                case 1:
                                    int i29 = C3093dO.f30001K0;
                                    i62.e0(c4280zO4.f35534e);
                                    break;
                                case 2:
                                    int i30 = C3093dO.f30001K0;
                                    C4045v5 c4045v5 = c4280zO4.f35543o;
                                    i62.r();
                                    break;
                                default:
                                    int i31 = C3093dO.f30001K0;
                                    i62.i0(c4280zO4.f35535f);
                                    break;
                            }
                        }
                    });
                    if (rn2 != null) {
                        final int i28 = 0;
                        c3759pp3.c(10, new InterfaceC3865ro() { // from class: com.google.android.gms.internal.ads.WN
                            @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
                            /* renamed from: b */
                            public final /* synthetic */ void mo2b(Object obj10) {
                                C4280zO c4280zO4 = c4280zO;
                                I6 i62 = (I6) obj10;
                                switch (i28) {
                                    case 0:
                                        int i282 = C3093dO.f30001K0;
                                        i62.g0(c4280zO4.f35535f);
                                        break;
                                    case 1:
                                        int i29 = C3093dO.f30001K0;
                                        i62.e0(c4280zO4.f35534e);
                                        break;
                                    case 2:
                                        int i30 = C3093dO.f30001K0;
                                        C4045v5 c4045v5 = c4280zO4.f35543o;
                                        i62.r();
                                        break;
                                    default:
                                        int i31 = C3093dO.f30001K0;
                                        i62.i0(c4280zO4.f35535f);
                                        break;
                                }
                            }
                        });
                    }
                }
                c3877s = c4280zO2.i;
                c3877s2 = c4280zO.i;
                if (c3877s != c3877s2) {
                    C3554m c3554m = this.f30006C;
                    Object obj10 = c3877s2.f34153x;
                    c3554m.getClass();
                    final int i29 = 0;
                    this.f30013G.c(2, new InterfaceC3865ro() { // from class: com.google.android.gms.internal.ads.XN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
                        /* renamed from: b */
                        public final /* synthetic */ void mo2b(Object obj11) {
                            C4280zO c4280zO4 = c4280zO;
                            I6 i62 = (I6) obj11;
                            switch (i29) {
                                case 0:
                                    int i30 = C3093dO.f30001K0;
                                    Object obj12 = c4280zO4.i.f34152w;
                                    i62.o();
                                    break;
                                default:
                                    int i31 = C3093dO.f30001K0;
                                    boolean z22 = c4280zO4.f35540l;
                                    i62.h();
                                    break;
                            }
                        }
                    });
                }
                if (!z15) {
                    this.f30013G.c(14, new C3307hK(this.f30041t0));
                }
                if (z14) {
                    b9 = 0;
                } else {
                    b9 = 0;
                    this.f30013G.c(3, new InterfaceC3865ro() { // from class: com.google.android.gms.internal.ads.YN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
                        /* renamed from: b */
                        public final /* synthetic */ void mo2b(Object obj11) {
                            C4280zO c4280zO4 = c4280zO;
                            I6 i62 = (I6) obj11;
                            switch (b9) {
                                case 0:
                                    int i30 = C3093dO.f30001K0;
                                    boolean z22 = c4280zO4.f35536g;
                                    i62.f();
                                    break;
                                default:
                                    int i31 = C3093dO.f30001K0;
                                    int i32 = c4280zO4.f35542n;
                                    i62.j();
                                    break;
                            }
                        }
                    });
                }
                if (i16 == 0 || i14 != 0) {
                    this.f30013G.c(-1, new ZN(c4280zO, b9, b9));
                }
                if (i16 != 0) {
                    final int i30 = 1;
                    this.f30013G.c(4, new InterfaceC3865ro() { // from class: com.google.android.gms.internal.ads.WN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
                        /* renamed from: b */
                        public final /* synthetic */ void mo2b(Object obj102) {
                            C4280zO c4280zO4 = c4280zO;
                            I6 i62 = (I6) obj102;
                            switch (i30) {
                                case 0:
                                    int i282 = C3093dO.f30001K0;
                                    i62.g0(c4280zO4.f35535f);
                                    break;
                                case 1:
                                    int i292 = C3093dO.f30001K0;
                                    i62.e0(c4280zO4.f35534e);
                                    break;
                                case 2:
                                    int i302 = C3093dO.f30001K0;
                                    C4045v5 c4045v5 = c4280zO4.f35543o;
                                    i62.r();
                                    break;
                                default:
                                    int i31 = C3093dO.f30001K0;
                                    i62.i0(c4280zO4.f35535f);
                                    break;
                            }
                        }
                    });
                }
                if (i14 == 0 || c4280zO2.f35541m != c4280zO.f35541m) {
                    i17 = 1;
                    this.f30013G.c(5, new InterfaceC3865ro() { // from class: com.google.android.gms.internal.ads.XN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
                        /* renamed from: b */
                        public final /* synthetic */ void mo2b(Object obj11) {
                            C4280zO c4280zO4 = c4280zO;
                            I6 i62 = (I6) obj11;
                            switch (i17) {
                                case 0:
                                    int i302 = C3093dO.f30001K0;
                                    Object obj12 = c4280zO4.i.f34152w;
                                    i62.o();
                                    break;
                                default:
                                    int i31 = C3093dO.f30001K0;
                                    boolean z22 = c4280zO4.f35540l;
                                    i62.h();
                                    break;
                            }
                        }
                    });
                } else {
                    i17 = 1;
                }
                if (c4280zO2.f35542n != c4280zO.f35542n) {
                    this.f30013G.c(6, new InterfaceC3865ro() { // from class: com.google.android.gms.internal.ads.YN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
                        /* renamed from: b */
                        public final /* synthetic */ void mo2b(Object obj11) {
                            C4280zO c4280zO4 = c4280zO;
                            I6 i62 = (I6) obj11;
                            switch (i17) {
                                case 0:
                                    int i302 = C3093dO.f30001K0;
                                    boolean z22 = c4280zO4.f35536g;
                                    i62.f();
                                    break;
                                default:
                                    int i31 = C3093dO.f30001K0;
                                    int i32 = c4280zO4.f35542n;
                                    i62.j();
                                    break;
                            }
                        }
                    });
                }
                if (c4280zO2.i() != c4280zO.i()) {
                    this.f30013G.c(7, new ZN(c4280zO, i17, (byte) 0));
                }
                if (!c4280zO2.f35543o.equals(c4280zO.f35543o)) {
                    final int i31 = 2;
                    this.f30013G.c(12, new InterfaceC3865ro() { // from class: com.google.android.gms.internal.ads.WN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
                        /* renamed from: b */
                        public final /* synthetic */ void mo2b(Object obj102) {
                            C4280zO c4280zO4 = c4280zO;
                            I6 i62 = (I6) obj102;
                            switch (i31) {
                                case 0:
                                    int i282 = C3093dO.f30001K0;
                                    i62.g0(c4280zO4.f35535f);
                                    break;
                                case 1:
                                    int i292 = C3093dO.f30001K0;
                                    i62.e0(c4280zO4.f35534e);
                                    break;
                                case 2:
                                    int i302 = C3093dO.f30001K0;
                                    C4045v5 c4045v5 = c4280zO4.f35543o;
                                    i62.r();
                                    break;
                                default:
                                    int i312 = C3093dO.f30001K0;
                                    i62.i0(c4280zO4.f35535f);
                                    break;
                            }
                        }
                    });
                }
                c3399j6 = this.f30040s0;
                IO io = this.f30051z;
                C3399j6 c3399j63 = this.f30045w;
                String str3 = AbstractC3548lu.f32613a;
                A12 = io.A1();
                AbstractC3832r8 r16 = io.r1();
                boolean z22 = r16.g() && r16.b(io.t1(), (Y7) io.f29483n, 0L).f28799f;
                r13 = io.r1();
                if (r13.g()) {
                    int t13 = io.t1();
                    io.k();
                    io.q1();
                    int i32 = r13.i(t13);
                    i18 = -1;
                    z16 = i32 != -1;
                } else {
                    z16 = false;
                    i18 = -1;
                }
                r14 = io.r1();
                if (r14.g()) {
                    int t14 = io.t1();
                    io.k();
                    io.q1();
                    z17 = r14.h(t14, 0, false) != i18;
                } else {
                    z17 = false;
                }
                AbstractC3832r8 r17 = io.r1();
                z18 = r17.g() && r17.b(io.t1(), (Y7) io.f29483n, 0L).b();
                r15 = io.r1();
                if (r15.g()) {
                    z19 = z22;
                    if (r15.b(io.t1(), (Y7) io.f29483n, 0L).f28800g) {
                        z20 = true;
                        g9 = io.r1().g();
                        M.h hVar = new M.h(5);
                        c3526lP = c3399j63.f32086a;
                        for (i19 = 0; i19 < c3526lP.f32566a.size(); i19++) {
                            hVar.t(c3526lP.a(i19));
                        }
                        if (!A12) {
                            hVar.t(4);
                        }
                        if ((z19 || A12) ? false : true) {
                            hVar.t(5);
                        }
                        if ((z16 || A12) ? false : true) {
                            hVar.t(6);
                        }
                        if (g9 && (z16 || !z18 || z19) && !A12) {
                            hVar.t(7);
                        }
                        if ((z17 || A12) ? false : true) {
                            hVar.t(8);
                        }
                        if (g9 && (z17 || (z18 && z20)) && !A12) {
                            hVar.t(9);
                        }
                        if (!A12) {
                            hVar.t(10);
                        }
                        if ((z19 || A12) ? false : true) {
                            hVar.t(11);
                        }
                        if ((z19 || A12) ? false : true) {
                            hVar.t(12);
                        }
                        c3399j62 = new C3399j6(hVar.u());
                        this.f30040s0 = c3399j62;
                        if (!c3399j62.equals(c3399j6)) {
                            this.f30013G.c(13, new C4086vt(10, this));
                        }
                        this.f30013G.d();
                    }
                } else {
                    z19 = z22;
                }
                z20 = false;
                g9 = io.r1().g();
                M.h hVar2 = new M.h(5);
                c3526lP = c3399j63.f32086a;
                while (i19 < c3526lP.f32566a.size()) {
                }
                if (!A12) {
                }
                if ((z19 || A12) ? false : true) {
                }
                if ((z16 || A12) ? false : true) {
                }
                if (g9 && (z16 || !z18 || z19) && !A12) {
                }
                if ((z17 || A12) ? false : true) {
                }
                if (g9 && (z17 || (z18 && z20)) && !A12) {
                }
                if (!A12) {
                }
                if ((z19 || A12) ? false : true) {
                }
                if ((z19 || A12) ? false : true) {
                }
                c3399j62 = new C3399j6(hVar2.u());
                this.f30040s0 = c3399j62;
                if (!c3399j62.equals(c3399j6)) {
                }
                this.f30013G.d();
            }
            pair = new Pair(Boolean.TRUE, 3);
        }
        i11 = i23;
        i10 = 0;
        z9 = z8;
        booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (booleanValue) {
        }
        P2 a92 = this.f30012F0.a();
        list = c4280zO.f35538j;
        i13 = i10;
        while (i13 < list.size()) {
        }
        z12 = z9;
        this.f30012F0 = new C3181f3(a92);
        r12 = r1();
        if (r12.g()) {
        }
        boolean equals22 = c3181f3.equals(this.f30041t0);
        this.f30041t0 = c3181f3;
        if (c4280zO2.f35540l == c4280zO.f35540l) {
        }
        if (c4280zO2.f35534e == c4280zO.f35534e) {
        }
        if (i15 == 0) {
        }
        m12 = m1();
        o22 = this.f30028S;
        c4088vv = this.f30027R;
        if (m12 != 2) {
        }
        P0();
        this.f30014G0.getClass();
        c4088vv.g(p1());
        p1 = p1();
        if (o22.f26640u != p1) {
        }
        if (c4280zO2.f35536g == c4280zO.f35536g) {
        }
        if (!equals) {
        }
        if (z12) {
        }
        if (booleanValue) {
        }
        rn = c4280zO2.f35535f;
        rn2 = c4280zO.f35535f;
        if (rn != rn2) {
        }
        c3877s = c4280zO2.i;
        c3877s2 = c4280zO.i;
        if (c3877s != c3877s2) {
        }
        if (!z15) {
        }
        if (z14) {
        }
        if (i16 == 0) {
        }
        this.f30013G.c(-1, new ZN(c4280zO, b9, b9));
        if (i16 != 0) {
        }
        if (i14 == 0) {
        }
        i17 = 1;
        this.f30013G.c(5, new InterfaceC3865ro() { // from class: com.google.android.gms.internal.ads.XN
            @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
            /* renamed from: b */
            public final /* synthetic */ void mo2b(Object obj11) {
                C4280zO c4280zO4 = c4280zO;
                I6 i62 = (I6) obj11;
                switch (i17) {
                    case 0:
                        int i302 = C3093dO.f30001K0;
                        Object obj12 = c4280zO4.i.f34152w;
                        i62.o();
                        break;
                    default:
                        int i312 = C3093dO.f30001K0;
                        boolean z222 = c4280zO4.f35540l;
                        i62.h();
                        break;
                }
            }
        });
        if (c4280zO2.f35542n != c4280zO.f35542n) {
        }
        if (c4280zO2.i() != c4280zO.i()) {
        }
        if (!c4280zO2.f35543o.equals(c4280zO.f35543o)) {
        }
        c3399j6 = this.f30040s0;
        IO io2 = this.f30051z;
        C3399j6 c3399j632 = this.f30045w;
        String str32 = AbstractC3548lu.f32613a;
        A12 = io2.A1();
        AbstractC3832r8 r162 = io2.r1();
        if (r162.g()) {
        }
        r13 = io2.r1();
        if (r13.g()) {
        }
        r14 = io2.r1();
        if (r14.g()) {
        }
        AbstractC3832r8 r172 = io2.r1();
        if (r172.g()) {
        }
        r15 = io2.r1();
        if (r15.g()) {
        }
        z20 = false;
        g9 = io2.r1().g();
        M.h hVar22 = new M.h(5);
        c3526lP = c3399j632.f32086a;
        while (i19 < c3526lP.f32566a.size()) {
        }
        if (!A12) {
        }
        if ((z19 || A12) ? false : true) {
        }
        if ((z16 || A12) ? false : true) {
        }
        if (g9 && (z16 || !z18 || z19) && !A12) {
        }
        if ((z17 || A12) ? false : true) {
        }
        if (g9 && (z17 || (z18 && z20)) && !A12) {
        }
        if (!A12) {
        }
        if ((z19 || A12) ? false : true) {
        }
        if ((z19 || A12) ? false : true) {
        }
        c3399j62 = new C3399j6(hVar22.u());
        this.f30040s0 = c3399j62;
        if (!c3399j62.equals(c3399j6)) {
        }
        this.f30013G.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4280zO G1(C4280zO c4280zO, AbstractC3832r8 abstractC3832r8, Pair pair) {
        boolean z8;
        List list;
        PA.n(abstractC3832r8.g() || pair != null);
        AbstractC3832r8 abstractC3832r82 = c4280zO.f35530a;
        long C12 = C1(c4280zO);
        C4280zO c4 = c4280zO.c(abstractC3832r8);
        if (abstractC3832r8.g()) {
            BQ bq = C4280zO.f35529t;
            long u7 = AbstractC3548lu.u(this.f30018I0);
            C4280zO g9 = c4.b(bq, u7, u7, u7, 0L, C3041cR.f29709d, this.f30043v, C3675oC.f33115x).g(bq);
            g9.f35544p = g9.f35546r;
            return g9;
        }
        BQ bq2 = c4.f35531b;
        Object obj = bq2.f24043a;
        String str = AbstractC3548lu.f32613a;
        boolean equals = obj.equals(pair.first);
        BQ bq3 = !equals ? new BQ(-1L, pair.first) : bq2;
        long longValue = ((Long) pair.second).longValue();
        long u9 = AbstractC3548lu.u(C12);
        if (!abstractC3832r82.g()) {
            L7 l72 = this.f30017I;
            abstractC3832r82.o(obj, l72);
            if (equals && u9 - longValue == 1) {
                L7 o9 = abstractC3832r82.o(obj, l72);
                z8 = true;
                if (u9 == o9.f26109d) {
                    u9--;
                }
                if (equals || longValue < u9) {
                    PA.T(bq3.b() ^ z8);
                    C3041cR c3041cR = equals ? C3041cR.f29709d : c4.f35537h;
                    C3877s c3877s = equals ? this.f30043v : c4.i;
                    if (equals) {
                        SB sb = UB.f27942u;
                        list = C3675oC.f33115x;
                    } else {
                        list = c4.f35538j;
                    }
                    BQ bq4 = bq3;
                    C4280zO g10 = c4.b(bq4, longValue, longValue, longValue, 0L, c3041cR, c3877s, list).g(bq4);
                    g10.f35544p = longValue;
                    return g10;
                }
                if (longValue != u9) {
                    PA.T(bq3.b() ^ z8);
                    long max = Math.max(0L, c4.f35545q - (longValue - u9));
                    long j9 = c4.f35544p;
                    if (c4.f35539k.equals(bq2)) {
                        j9 = longValue + max;
                    }
                    C4280zO b9 = c4.b(bq3, longValue, longValue, longValue, max, c4.f35537h, c4.i, c4.f35538j);
                    b9.f35544p = j9;
                    return b9;
                }
                int e6 = abstractC3832r8.e(c4.f35539k.f24043a);
                if (e6 != -1) {
                    L7 l73 = this.f30017I;
                    if (abstractC3832r8.d(e6, l73, false).f26108c == abstractC3832r8.o(bq3.f24043a, l73).f26108c) {
                        return c4;
                    }
                }
                Object obj2 = bq3.f24043a;
                L7 l74 = this.f30017I;
                abstractC3832r8.o(obj2, l74);
                long b10 = bq3.b() ? l74.b(bq3.f24044b, bq3.f24045c) : l74.f26109d;
                BQ bq5 = bq3;
                C4280zO g11 = c4.b(bq5, c4.f35546r, c4.f35546r, c4.f35533d, b10 - c4.f35546r, c4.f35537h, c4.i, c4.f35538j).g(bq5);
                g11.f35544p = b10;
                return g11;
            }
        }
        z8 = true;
        if (equals) {
        }
        PA.T(bq3.b() ^ z8);
        C3041cR c3041cR2 = equals ? C3041cR.f29709d : c4.f35537h;
        C3877s c3877s2 = equals ? this.f30043v : c4.i;
        if (equals) {
        }
        BQ bq42 = bq3;
        C4280zO g102 = c4.b(bq42, longValue, longValue, longValue, 0L, c3041cR2, c3877s2, list).g(bq42);
        g102.f35544p = longValue;
        return g102;
    }

    public final Pair I1(AbstractC3832r8 abstractC3832r8, int i, long j9) {
        if (abstractC3832r8.g()) {
            this.f30016H0 = i;
            if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
                j9 = 0;
            }
            this.f30018I0 = j9;
            return null;
        }
        if (i == -1 || i >= abstractC3832r8.a()) {
            i = abstractC3832r8.k(false);
            abstractC3832r8.b(i, (Y7) this.f29483n, 0L).getClass();
            j9 = AbstractC3548lu.t(0L);
        }
        return abstractC3832r8.m((Y7) this.f29483n, this.f30017I, i, AbstractC3548lu.u(j9));
    }

    public final void J1(Surface surface) {
        Surface surface2 = this.f30042u0;
        boolean z8 = false;
        boolean z9 = true;
        if (surface2 != null && surface2 != surface) {
            z8 = true;
        }
        long j9 = z8 ? this.f30029T : -9223372036854775807L;
        C3365iO c3365iO = this.f30011F;
        if (!c3365iO.f31365n0 && c3365iO.f31334B.getThread().isAlive()) {
            C2865Xm c2865Xm = new C2865Xm();
            c3365iO.f31382z.b(30, new Pair(surface, c2865Xm)).a();
            if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
                z9 = c2865Xm.c(j9);
            }
        }
        if (z8) {
            Surface surface3 = this.f30042u0;
            Surface surface4 = this.f30044v0;
            if (surface3 == surface4) {
                surface4.release();
                this.f30044v0 = null;
            }
        }
        this.f30042u0 = surface;
        if (z9) {
            return;
        }
        A1(new RN(2, new B0.c("Detaching surface timed out."), 1003));
    }

    public final void L1(int i, int i4) {
        Xr xr = this.f30048x0;
        if (i == xr.f28711a && i4 == xr.f28712b) {
            return;
        }
        this.f30048x0 = new Xr(i, i4);
        C3307hK c3307hK = new C3307hK(i, i4);
        C3759pp c3759pp = this.f30013G;
        c3759pp.c(24, c3307hK);
        c3759pp.d();
        M1(2, 14, new Xr(i, i4));
    }

    public final void M1(int i, int i4, Object obj) {
        C3365iO c3365iO;
        AbstractC3149eQ[] abstractC3149eQArr = this.f30002A;
        int length = abstractC3149eQArr.length;
        int i9 = 0;
        while (true) {
            c3365iO = this.f30011F;
            if (i9 >= 2) {
                break;
            }
            AbstractC3149eQ abstractC3149eQ = abstractC3149eQArr[i9];
            if (i == -1 || abstractC3149eQ.f30422u == i) {
                B1(this.f30014G0);
                AbstractC3832r8 abstractC3832r8 = this.f30014G0.f35530a;
                CO co = new CO(c3365iO, abstractC3149eQ, c3365iO.f31334B);
                PA.T(!co.f24172f);
                co.f24169c = i4;
                PA.T(!co.f24172f);
                co.f24170d = obj;
                co.a();
            }
            i9++;
        }
        AbstractC3149eQ[] abstractC3149eQArr2 = this.f30004B;
        int length2 = abstractC3149eQArr2.length;
        for (int i10 = 0; i10 < 2; i10++) {
            AbstractC3149eQ abstractC3149eQ2 = abstractC3149eQArr2[i10];
            if (abstractC3149eQ2 != null && (i == -1 || abstractC3149eQ2.f30422u == i)) {
                B1(this.f30014G0);
                AbstractC3832r8 abstractC3832r82 = this.f30014G0.f35530a;
                CO co2 = new CO(c3365iO, abstractC3149eQ2, c3365iO.f31334B);
                PA.T(!co2.f24172f);
                co2.f24169c = i4;
                PA.T(!co2.f24172f);
                co2.f24170d = obj;
                co2.a();
            }
        }
    }

    public final void N1(boolean z8) {
        P0();
        C4280zO c4280zO = this.f30014G0;
        int i = c4280zO.f35542n;
        int i4 = 0;
        if (i == 1) {
            if (z8) {
                i = 1;
            } else {
                i = 1;
                i4 = 1;
            }
        }
        if (c4280zO.f35540l == z8 && i == i4 && c4280zO.f35541m == 1) {
            return;
        }
        this.f30034Z++;
        C4280zO h9 = c4280zO.h(1, i4, z8);
        C3709ot c3709ot = this.f30011F.f31382z;
        int i9 = (i4 << 4) | 1;
        c3709ot.getClass();
        C3333ht g9 = C3709ot.g();
        g9.f31278a = c3709ot.f33230a.obtainMessage(1, z8 ? 1 : 0, i9);
        g9.a();
        E1(h9, 0, false, 5, com.anythink.basead.exoplayer.b.f6539b, -1);
    }

    public final int O1() {
        P0();
        if (!this.f30014G0.f35530a.g()) {
            C4280zO c4280zO = this.f30014G0;
            return c4280zO.f35530a.e(c4280zO.f35531b.f24043a);
        }
        int i = this.f30016H0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final void P0() {
        this.f30047x.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f30022M;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = AbstractC3548lu.f32613a;
            Locale locale = Locale.US;
            String l9 = D.y.l("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f30005B0) {
                throw new IllegalStateException(l9);
            }
            AbstractC3217fl.O("ExoPlayerImpl", l9, this.C0 ? null : new IllegalStateException());
            this.C0 = true;
        }
    }

    public final long P1() {
        P0();
        if (!T1()) {
            AbstractC3832r8 r12 = r1();
            return r12.g() ? com.anythink.basead.exoplayer.b.f6539b : AbstractC3548lu.t(r12.b(t1(), (Y7) this.f29483n, 0L).f28802j);
        }
        C4280zO c4280zO = this.f30014G0;
        BQ bq = c4280zO.f35531b;
        Object obj = bq.f24043a;
        AbstractC3832r8 abstractC3832r8 = c4280zO.f35530a;
        L7 l72 = this.f30017I;
        abstractC3832r8.o(obj, l72);
        return AbstractC3548lu.t(l72.b(bq.f24044b, bq.f24045c));
    }

    public final long Q1() {
        P0();
        return AbstractC3548lu.t(D1(this.f30014G0));
    }

    public final long R1() {
        P0();
        if (T1()) {
            C4280zO c4280zO = this.f30014G0;
            return c4280zO.f35539k.equals(c4280zO.f35531b) ? AbstractC3548lu.t(this.f30014G0.f35544p) : P1();
        }
        P0();
        if (this.f30014G0.f35530a.g()) {
            return this.f30018I0;
        }
        C4280zO c4280zO2 = this.f30014G0;
        long j9 = 0;
        if (c4280zO2.f35539k.f24046d != c4280zO2.f35531b.f24046d) {
            return AbstractC3548lu.t(c4280zO2.f35530a.b(t1(), (Y7) this.f29483n, 0L).f28802j);
        }
        long j10 = c4280zO2.f35544p;
        if (this.f30014G0.f35539k.b()) {
            C4280zO c4280zO3 = this.f30014G0;
            c4280zO3.f35530a.o(c4280zO3.f35539k.f24043a, this.f30017I).f26111f.a(this.f30014G0.f35539k.f24044b).getClass();
        } else {
            j9 = j10;
        }
        C4280zO c4280zO4 = this.f30014G0;
        c4280zO4.f35530a.o(c4280zO4.f35539k.f24043a, this.f30017I);
        return AbstractC3548lu.t(j9);
    }

    public final long S1() {
        P0();
        return AbstractC3548lu.t(this.f30014G0.f35545q);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final void T(int i, long j9) {
        P0();
        if (i == -1) {
            return;
        }
        PA.n(i >= 0);
        AbstractC3832r8 abstractC3832r8 = this.f30014G0.f35530a;
        if (abstractC3832r8.g() || i < abstractC3832r8.a()) {
            OO oo = this.f30021L;
            if (!oo.i) {
                KO v6 = oo.v();
                oo.i = true;
                oo.s(v6, -1, new C3307hK((byte) 0, 28));
            }
            this.f30034Z++;
            if (T1()) {
                AbstractC3217fl.I("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C3990u4 c3990u4 = new C3990u4(this.f30014G0);
                c3990u4.f(1);
                C3093dO c3093dO = (C3093dO) this.f30009E.f26393u;
                c3093dO.getClass();
                c3093dO.f30007D.e(new RunnableC3329hp(22, c3093dO, c3990u4));
                return;
            }
            C4280zO c4280zO = this.f30014G0;
            int i4 = c4280zO.f35534e;
            if (i4 == 3 || (i4 == 4 && !abstractC3832r8.g())) {
                c4280zO = this.f30014G0.d(2);
            }
            int t12 = t1();
            C4280zO G12 = G1(c4280zO, abstractC3832r8, I1(abstractC3832r8, i, j9));
            long u7 = AbstractC3548lu.u(j9);
            C3365iO c3365iO = this.f30011F;
            c3365iO.getClass();
            c3365iO.f31382z.b(3, new C3311hO(abstractC3832r8, i, u7)).a();
            E1(G12, 0, true, 1, D1(G12), t12);
        }
    }

    public final boolean T1() {
        P0();
        return this.f30014G0.f35531b.b();
    }

    public final int U1() {
        P0();
        if (T1()) {
            return this.f30014G0.f35531b.f24045c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final void k() {
        P0();
    }

    public final int m() {
        P0();
        if (T1()) {
            return this.f30014G0.f35531b.f24044b;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final int m1() {
        P0();
        return this.f30014G0.f35534e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final int n1() {
        P0();
        return this.f30014G0.f35542n;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final boolean p1() {
        P0();
        return this.f30014G0.f35540l;
    }

    public final void q() {
        P0();
        A1(null);
        C3675oC c3675oC = C3675oC.f33115x;
        long j9 = this.f30014G0.f35546r;
        new C2794Tj(c3675oC);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final void q1() {
        P0();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final AbstractC3832r8 r1() {
        P0();
        return this.f30014G0.f35530a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final int t1() {
        P0();
        int B12 = B1(this.f30014G0);
        if (B12 == -1) {
            return 0;
        }
        return B12;
    }

    public final void v1(float f6) {
        P0();
        String str = AbstractC3548lu.f32613a;
        float max = Math.max(0.0f, Math.min(f6, 1.0f));
        if (this.f30052z0 == max) {
            return;
        }
        this.f30052z0 = max;
        this.f30011F.f31382z.b(32, Float.valueOf(max)).a();
        C3307hK c3307hK = new C3307hK(max);
        C3759pp c3759pp = this.f30013G;
        c3759pp.c(22, c3307hK);
        c3759pp.d();
    }

    public final void w1(LO lo) {
        this.f30021L.f26696f.a(lo);
    }

    public final void x1(C3267gh c3267gh) {
        P0();
        this.f30021L.f26696f.b(c3267gh);
    }

    public final void z1() {
        String str;
        boolean z8;
        Context context;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = AbstractC3548lu.f32613a;
        HashSet hashSet = A2.f23802a;
        synchronized (A2.class) {
            str = A2.f23803b;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 34 + String.valueOf(str2).length() + 3 + String.valueOf(str).length() + 1);
        AbstractC5051n.j(sb, "Release ", hexString, " [AndroidXMedia3/1.10.0] [", str2);
        sb.append("] [");
        sb.append(str);
        sb.append("]");
        AbstractC3217fl.y("ExoPlayerImpl", sb.toString());
        P0();
        this.f30027R.g(false);
        O2 o22 = this.f30028S;
        if (o22.f26640u) {
            o22.f26640u = false;
        }
        C4017ue c4017ue = this.f30032W;
        if (c4017ue != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) c4017ue.f34630u).get()) != null) {
            context.unregisterDeviceIdChangeListener((C3038cO) c4017ue.f34631v);
        }
        C4313b c4313b = this.f30031V;
        ((C3709ot) c4313b.f35815e).f33230a.removeCallbacksAndMessages(null);
        C3332hs c3332hs = (C3332hs) c4313b.f35812b;
        C3093dO c3093dO = (C3093dO) c4313b.f35811a;
        c3093dO.P0();
        c3332hs.getClass();
        c3093dO.f30013G.b(c3332hs);
        C3365iO c3365iO = this.f30011F;
        if (c3365iO.f31365n0 || !c3365iO.f31334B.getThread().isAlive()) {
            z8 = true;
        } else {
            c3365iO.f31365n0 = true;
            C2865Xm c2865Xm = new C2865Xm();
            c3365iO.f31382z.b(7, c2865Xm).a();
            z8 = c2865Xm.c(c3365iO.f31350L);
        }
        if (!z8) {
            C3759pp c3759pp = this.f30013G;
            c3759pp.c(10, C3307hK.f31228w);
            c3759pp.d();
        }
        this.f30013G.e();
        this.f30007D.f33230a.removeCallbacksAndMessages(null);
        InterfaceC4147x interfaceC4147x = this.f30023N;
        OO oo = this.f30021L;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((A) interfaceC4147x).f23786v.f32668u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C4093w c4093w = (C4093w) it.next();
            if (c4093w.f34911b == oo) {
                c4093w.f34912c = true;
                copyOnWriteArrayList.remove(c4093w);
            }
        }
        this.f30014G0.getClass();
        C4280zO H1 = H1(this.f30014G0, 1);
        this.f30014G0 = H1;
        C4280zO g9 = H1.g(H1.f35531b);
        this.f30014G0 = g9;
        g9.f35544p = g9.f35546r;
        this.f30014G0.f35545q = 0L;
        C3709ot c3709ot = oo.f26698h;
        c3709ot.getClass();
        c3709ot.e(new RunnableC3873rw(15, oo));
        Surface surface = this.f30044v0;
        if (surface != null) {
            surface.release();
            this.f30044v0 = null;
        }
        FB fb = C2794Tj.f27817a;
        this.f30010E0 = true;
        if (this.f30014G0.f35530a.g()) {
            return;
        }
        C4280zO c4280zO = this.f30014G0;
        boolean z9 = c4280zO.f35530a.e(c4280zO.f35531b.f24043a) != -1;
        Locale locale = Locale.US;
        C4280zO c4280zO2 = this.f30014G0;
        PA.U(String.format(locale, "periodUid %s not found in timeline %s with size %d", c4280zO2.f35531b.f24043a, c4280zO2.f35530a.getClass().getName(), Integer.valueOf(this.f30014G0.f35530a.a())), z9);
    }
}
