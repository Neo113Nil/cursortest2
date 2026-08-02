package d0;

import E1.C0025a;
import T.C0102u;
import T.C0103v;
import T.C0104w;
import T.C0107z;
import W.AbstractC0108a;
import W.J;
import Y.A;
import Y.z;
import a.AbstractC0124a;
import a0.C0144j;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import e0.C0391a;
import e0.C0393c;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q0.AbstractC1359a;
import q0.C1353B;
import q0.C1360b;
import q0.C1377t;
import q0.InterfaceC1383z;
import r0.C1398i;
import t0.C1427b;
import u0.q;
import v0.AbstractC1450b;

/* loaded from: classes.dex */
public final class h extends AbstractC1359a {

    /* renamed from: A, reason: collision with root package name */
    public u0.n f8131A;

    /* renamed from: B, reason: collision with root package name */
    public A f8132B;

    /* renamed from: C, reason: collision with root package name */
    public IOException f8133C;

    /* renamed from: D, reason: collision with root package name */
    public Handler f8134D;

    /* renamed from: E, reason: collision with root package name */
    public Uri f8135E;

    /* renamed from: F, reason: collision with root package name */
    public final Uri f8136F;

    /* renamed from: G, reason: collision with root package name */
    public C0393c f8137G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8138H;

    /* renamed from: I, reason: collision with root package name */
    public long f8139I;

    /* renamed from: J, reason: collision with root package name */
    public long f8140J;

    /* renamed from: K, reason: collision with root package name */
    public long f8141K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public long f8142M;

    /* renamed from: N, reason: collision with root package name */
    public int f8143N;

    /* renamed from: O, reason: collision with root package name */
    public C0107z f8144O;

    /* renamed from: P, reason: collision with root package name */
    public C0103v f8145P;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8146h;

    /* renamed from: i, reason: collision with root package name */
    public final Y.g f8147i;

    /* renamed from: j, reason: collision with root package name */
    public final L3.h f8148j;

    /* renamed from: k, reason: collision with root package name */
    public final C0144j f8149k;

    /* renamed from: l, reason: collision with root package name */
    public final f0.i f8150l;

    /* renamed from: m, reason: collision with root package name */
    public final C1427b f8151m;
    public final G1.c n;
    public final long o;

    /* renamed from: p, reason: collision with root package name */
    public final long f8152p;

    /* renamed from: q, reason: collision with root package name */
    public final f0.e f8153q;

    /* renamed from: r, reason: collision with root package name */
    public final u0.p f8154r;

    /* renamed from: s, reason: collision with root package name */
    public final C0377d f8155s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f8156t;

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f8157u;
    public final RunnableC0376c v;

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC0376c f8158w;

    /* renamed from: x, reason: collision with root package name */
    public final C0377d f8159x;

    /* renamed from: y, reason: collision with root package name */
    public final u0.o f8160y;
    public Y.h z;

    static {
        T.A.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [d0.c] */
    public h(C0107z c0107z, Y.g gVar, u0.p pVar, L3.h hVar, C0144j c0144j, f0.i iVar, C1427b c1427b, long j4, long j5) {
        this.f8144O = c0107z;
        this.f8145P = c0107z.f2901c;
        C0104w c0104w = c0107z.f2900b;
        c0104w.getClass();
        Uri uri = c0104w.f2893a;
        this.f8135E = uri;
        this.f8136F = uri;
        this.f8137G = null;
        this.f8147i = gVar;
        this.f8154r = pVar;
        this.f8148j = hVar;
        this.f8150l = iVar;
        this.f8151m = c1427b;
        this.o = j4;
        this.f8152p = j5;
        this.f8149k = c0144j;
        this.n = new G1.c(10);
        this.f8146h = false;
        this.f8153q = a(null);
        this.f8156t = new Object();
        this.f8157u = new SparseArray();
        this.f8159x = new C0377d(this);
        this.f8142M = -9223372036854775807L;
        this.f8141K = -9223372036854775807L;
        this.f8155s = new C0377d(this);
        this.f8160y = new C0377d(this);
        final int i4 = 0;
        this.v = new Runnable(this) { // from class: d0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f8116b;

            {
                this.f8116b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f8116b.D();
                        break;
                    default:
                        h hVar2 = this.f8116b;
                        hVar2.getClass();
                        try {
                            hVar2.B(false);
                            break;
                        } catch (Exception e4) {
                            hVar2.f8133C = new IOException(e4);
                        }
                }
            }
        };
        final int i5 = 1;
        this.f8158w = new Runnable(this) { // from class: d0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f8116b;

            {
                this.f8116b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f8116b.D();
                        break;
                    default:
                        h hVar2 = this.f8116b;
                        hVar2.getClass();
                        try {
                            hVar2.B(false);
                            break;
                        } catch (Exception e4) {
                            hVar2.f8133C = new IOException(e4);
                        }
                }
            }
        };
    }

    public static boolean x(e0.h hVar) {
        List list = hVar.f8380c;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = ((C0391a) list.get(i4)).f8337b;
            if (i5 == 1 || i5 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(IOException iOException) {
        AbstractC0108a.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f8141K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        B(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0204 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(boolean z) {
        e0.h hVar;
        long j4;
        long j5;
        h hVar2;
        long j6;
        boolean z4;
        long j7;
        C0393c c0393c;
        boolean z5;
        long j8;
        long j9;
        e0.h hVar3;
        long j10;
        C0103v c0103v;
        int i4;
        long j11;
        C0103v c0103v2;
        float f4;
        long j12;
        float f5;
        C0103v c0103v3;
        boolean z6;
        i c4;
        long j13;
        SparseArray sparseArray;
        int i5;
        boolean z7;
        SparseArray sparseArray2;
        C1398i[] c1398iArr;
        RunnableC0376c runnableC0376c = this.f8158w;
        long j14 = this.f8152p;
        SparseArray sparseArray3 = this.f8157u;
        boolean z8 = false;
        int i6 = 0;
        while (i6 < sparseArray3.size()) {
            int keyAt = sparseArray3.keyAt(i6);
            if (keyAt >= this.f8143N) {
                C0375b c0375b = (C0375b) sparseArray3.valueAt(i6);
                C0393c c0393c2 = this.f8137G;
                int i7 = keyAt - this.f8143N;
                c0375b.f8111u = c0393c2;
                c0375b.v = i7;
                p pVar = c0375b.f8105m;
                pVar.f8204h = z8;
                pVar.f8202f = c0393c2;
                Iterator it = pVar.f8201e.entrySet().iterator();
                while (it.hasNext()) {
                    int i8 = i6;
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < pVar.f8202f.f8353h) {
                        it.remove();
                    }
                    i6 = i8;
                }
                i5 = i6;
                C1398i[] c1398iArr2 = c0375b.f8108r;
                if (c1398iArr2 != null) {
                    int length = c1398iArr2.length;
                    int i9 = 0;
                    while (i9 < length) {
                        l lVar = (l) c1398iArr2[i9].f15156e;
                        j[] jVarArr = lVar.f8177i;
                        try {
                            lVar.f8179k = c0393c2;
                            lVar.f8180l = i7;
                            long d4 = c0393c2.d(i7);
                            try {
                                ArrayList h2 = lVar.h();
                                sparseArray2 = sparseArray3;
                                c1398iArr = c1398iArr2;
                                int i10 = 0;
                                while (i10 < jVarArr.length) {
                                    try {
                                        j[] jVarArr2 = jVarArr;
                                        jVarArr2[i10] = jVarArr2[i10].a(d4, (e0.m) h2.get(lVar.f8178j.h(i10)));
                                        i10++;
                                        jVarArr = jVarArr2;
                                    } catch (C1360b e4) {
                                        e = e4;
                                        lVar.f8181m = e;
                                        i9++;
                                        sparseArray3 = sparseArray2;
                                        c1398iArr2 = c1398iArr;
                                    }
                                }
                            } catch (C1360b e5) {
                                e = e5;
                                sparseArray2 = sparseArray3;
                                c1398iArr = c1398iArr2;
                            }
                        } catch (C1360b e6) {
                            e = e6;
                            sparseArray2 = sparseArray3;
                            c1398iArr = c1398iArr2;
                        }
                        i9++;
                        sparseArray3 = sparseArray2;
                        c1398iArr2 = c1398iArr;
                    }
                    sparseArray = sparseArray3;
                    z7 = true;
                    c0375b.f8107q.s(c0375b);
                } else {
                    sparseArray = sparseArray3;
                    z7 = true;
                }
                c0375b.f8112w = c0393c2.b(i7).f8381d;
                for (m mVar : c0375b.f8109s) {
                    Iterator it2 = c0375b.f8112w.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            e0.g gVar = (e0.g) it2.next();
                            if (gVar.a().equals(mVar.f8186e.a())) {
                                mVar.b(gVar, (c0393c2.f8349d && i7 == c0393c2.f8358m.size() + (-1)) ? z7 : false);
                            }
                        }
                    }
                }
            } else {
                sparseArray = sparseArray3;
                i5 = i6;
            }
            i6 = i5 + 1;
            sparseArray3 = sparseArray;
            z8 = false;
        }
        int i11 = 1;
        e0.h b4 = this.f8137G.b(0);
        int size = this.f8137G.f8358m.size() - 1;
        e0.h b5 = this.f8137G.b(size);
        long d5 = this.f8137G.d(size);
        long M4 = J.M(J.A(this.f8141K));
        long d6 = this.f8137G.d(0);
        long j15 = b4.f8379b;
        List list = b4.f8380c;
        long M5 = J.M(j15);
        boolean x4 = x(b4);
        int i12 = 0;
        while (true) {
            hVar = b4;
            if (i12 >= list.size()) {
                j4 = 0;
                break;
            }
            C0391a c0391a = (C0391a) list.get(i12);
            j4 = 0;
            List list2 = c0391a.f8338c;
            int i13 = c0391a.f8337b;
            boolean z9 = (i13 == i11 || i13 == 2) ? false : true;
            if ((!x4 || !z9) && !list2.isEmpty()) {
                i c5 = ((e0.m) list2.get(0)).c();
                if (c5 != null && c5.D(d6, M4) != 0) {
                    M5 = Math.max(M5, c5.a(c5.g(d6, M4)) + M5);
                }
            }
            i12++;
            i11 = 1;
            b4 = hVar;
        }
        M5 = M5;
        long j16 = b5.f8379b;
        List list3 = b5.f8380c;
        long M6 = J.M(j16);
        boolean x5 = x(b5);
        long j17 = Long.MAX_VALUE;
        int i14 = 0;
        while (true) {
            if (i14 >= list3.size()) {
                j5 = M5;
                hVar2 = this;
                j6 = j17;
                break;
            }
            C0391a c0391a2 = (C0391a) list3.get(i14);
            long j18 = M6;
            List list4 = c0391a2.f8338c;
            int i15 = c0391a2.f8337b;
            if (i15 != 1 && i15 != 2) {
                z6 = true;
                if ((x5 || !z6) && !list4.isEmpty()) {
                    c4 = ((e0.m) list4.get(0)).c();
                    if (c4 != null) {
                        j6 = j18 + d5;
                        hVar2 = this;
                        j5 = M5;
                        break;
                    }
                    long D3 = c4.D(d5, M4);
                    if (D3 == j4) {
                        hVar2 = this;
                        j5 = M5;
                        j6 = j18;
                        break;
                    } else {
                        j13 = M5;
                        long g4 = (c4.g(d5, M4) + D3) - 1;
                        j17 = Math.min(j17, c4.f(g4, d5) + c4.a(g4) + j18);
                    }
                } else {
                    j13 = M5;
                }
                i14++;
                M6 = j18;
                M5 = j13;
            }
            z6 = false;
            if (x5) {
            }
            c4 = ((e0.m) list4.get(0)).c();
            if (c4 != null) {
            }
        }
        if (hVar2.f8137G.f8349d) {
            for (int i16 = 0; i16 < list3.size(); i16++) {
                i c6 = ((e0.m) ((C0391a) list3.get(i16)).f8338c.get(0)).c();
                if (c6 != null && !c6.w()) {
                }
            }
            z4 = true;
            if (z4) {
                long j19 = hVar2.f8137G.f8351f;
                if (j19 != -9223372036854775807L) {
                    j7 = Math.max(j5, j6 - J.M(j19));
                    long j20 = j6 - j7;
                    c0393c = hVar2.f8137G;
                    if (c0393c.f8349d) {
                        AbstractC0124a.t(c0393c.f8346a != -9223372036854775807L);
                        long M7 = (M4 - J.M(hVar2.f8137G.f8346a)) - j7;
                        C0103v c0103v4 = hVar2.i().f2901c;
                        long Z3 = J.Z(M7);
                        j8 = -9223372036854775807L;
                        long j21 = c0103v4.f2890c;
                        if (j21 != -9223372036854775807L) {
                            j11 = Math.min(Z3, j21);
                        } else {
                            C0102u c0102u = hVar2.f8137G.f8355j;
                            if (c0102u != null) {
                                long j22 = c0102u.f2885c;
                                if (j22 != -9223372036854775807L) {
                                    j11 = Math.min(Z3, j22);
                                }
                            }
                            j11 = Z3;
                        }
                        long Z4 = J.Z(M7 - j20);
                        if (Z4 < j4 && j11 > j4) {
                            Z4 = j4;
                        }
                        boolean z10 = z4;
                        long j23 = hVar2.f8137G.f8348c;
                        if (j23 != -9223372036854775807L) {
                            Z4 = Math.min(Z4 + j23, Z3);
                        }
                        long j24 = Z4;
                        long j25 = c0103v4.f2889b;
                        if (j25 != -9223372036854775807L) {
                            j24 = J.k(j25, j24, Z3);
                        } else {
                            C0102u c0102u2 = hVar2.f8137G.f8355j;
                            if (c0102u2 != null) {
                                long j26 = c0102u2.f2884b;
                                if (j26 != -9223372036854775807L) {
                                    j24 = J.k(j26, j24, Z3);
                                }
                            }
                        }
                        long j27 = j24;
                        long j28 = j27 > j11 ? j27 : j11;
                        synchronized (this) {
                            c0103v2 = hVar2.f8145P;
                        }
                        long j29 = c0103v2.f2888a;
                        if (j29 == -9223372036854775807L) {
                            C0393c c0393c3 = hVar2.f8137G;
                            C0102u c0102u3 = c0393c3.f8355j;
                            if (c0102u3 != null) {
                                long j30 = c0102u3.f2883a;
                                if (j30 != -9223372036854775807L) {
                                    j29 = j30;
                                }
                            }
                            j29 = c0393c3.f8352g;
                            if (j29 == -9223372036854775807L) {
                                j29 = hVar2.o;
                            }
                        }
                        if (j29 < j27) {
                            j29 = j27;
                        }
                        if (j29 > j28) {
                            j29 = J.k(J.Z(M7 - Math.min(j14, j20 / 2)), j27, j28);
                        }
                        long j31 = j28;
                        float f6 = c0103v4.f2891d;
                        if (f6 == -3.4028235E38f) {
                            C0102u c0102u4 = hVar2.f8137G.f8355j;
                            f6 = c0102u4 != null ? c0102u4.f2886d : -3.4028235E38f;
                        }
                        float f7 = c0103v4.f2892e;
                        if (f7 == -3.4028235E38f) {
                            C0102u c0102u5 = hVar2.f8137G.f8355j;
                            f7 = c0102u5 != null ? c0102u5.f2887e : -3.4028235E38f;
                        }
                        if (f6 == -3.4028235E38f && f7 == -3.4028235E38f) {
                            f4 = f7;
                            C0102u c0102u6 = hVar2.f8137G.f8355j;
                            j12 = M7;
                            z5 = z10;
                            if (c0102u6 == null || c0102u6.f2883a == -9223372036854775807L) {
                                f6 = 1.0f;
                                f5 = 1.0f;
                                C0102u c0102u7 = new C0102u();
                                c0102u7.f2883a = j29;
                                c0102u7.f2884b = j27;
                                c0102u7.f2885c = j31;
                                c0102u7.f2886d = f6;
                                c0102u7.f2887e = f5;
                                C0103v c0103v5 = new C0103v(c0102u7);
                                synchronized (this) {
                                    hVar2.f8145P = c0103v5;
                                }
                                long Z5 = J.Z(j7) + hVar2.f8137G.f8346a;
                                synchronized (this) {
                                    c0103v3 = hVar2.f8145P;
                                }
                                long M8 = j12 - J.M(c0103v3.f2888a);
                                long min = Math.min(j14, j20 / 2);
                                j10 = M8 < min ? min : M8;
                                j9 = Z5;
                                hVar3 = hVar;
                            }
                        } else {
                            f4 = f7;
                            j12 = M7;
                            z5 = z10;
                        }
                        f5 = f4;
                        C0102u c0102u72 = new C0102u();
                        c0102u72.f2883a = j29;
                        c0102u72.f2884b = j27;
                        c0102u72.f2885c = j31;
                        c0102u72.f2886d = f6;
                        c0102u72.f2887e = f5;
                        C0103v c0103v52 = new C0103v(c0102u72);
                        synchronized (this) {
                        }
                        hVar2.q(new C0378e(r1, j9, r3, r6, r33, j20, j10, r0, r40, c0103v));
                        if (hVar2.f8146h) {
                            hVar2.f8134D.removeCallbacks(runnableC0376c);
                            if (z5) {
                                Handler handler = hVar2.f8134D;
                                C0393c c0393c4 = hVar2.f8137G;
                                long A4 = J.A(hVar2.f8141K);
                                int size2 = c0393c4.f8358m.size() - 1;
                                e0.h b6 = c0393c4.b(size2);
                                long j32 = b6.f8379b;
                                List list5 = b6.f8380c;
                                long M9 = J.M(j32);
                                long d7 = c0393c4.d(size2);
                                long M10 = J.M(A4);
                                long M11 = J.M(c0393c4.f8346a);
                                long M12 = J.M(c0393c4.f8350e);
                                if (M12 == j8 || M12 >= 5000000) {
                                    M12 = 5000000;
                                }
                                int i17 = 0;
                                while (i17 < list5.size()) {
                                    List list6 = ((C0391a) list5.get(i17)).f8338c;
                                    if (list6.isEmpty()) {
                                        i4 = i17;
                                    } else {
                                        i4 = i17;
                                        i c7 = ((e0.m) list6.get(0)).c();
                                        if (c7 != null) {
                                            long h4 = (c7.h(d7, M10) + (M11 + M9)) - M10;
                                            if (h4 > j4 && (h4 < M12 - 100000 || (h4 > M12 && h4 < M12 + 100000))) {
                                                M12 = h4;
                                            }
                                        }
                                    }
                                    i17 = i4 + 1;
                                }
                                handler.postDelayed(runnableC0376c, AbstractC0347t0.h(M12, 1000L, RoundingMode.CEILING));
                            }
                            if (hVar2.f8138H) {
                                hVar2.D();
                                return;
                            }
                            if (z) {
                                C0393c c0393c5 = hVar2.f8137G;
                                if (c0393c5.f8349d) {
                                    long j33 = c0393c5.f8350e;
                                    if (j33 != j8) {
                                        if (j33 == j4) {
                                            j33 = 5000;
                                        }
                                        hVar2.f8134D.postDelayed(hVar2.v, Math.max(j4, (hVar2.f8139I + j33) - SystemClock.elapsedRealtime()));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    z5 = z4;
                    j8 = -9223372036854775807L;
                    j9 = -9223372036854775807L;
                    hVar3 = hVar;
                    j10 = j4;
                    long M13 = j7 - J.M(hVar3.f8379b);
                    C0393c c0393c6 = hVar2.f8137G;
                    long j34 = c0393c6.f8346a;
                    long j35 = hVar2.f8141K;
                    int i18 = hVar2.f8143N;
                    C0107z i19 = hVar2.i();
                    if (hVar2.f8137G.f8349d) {
                        synchronized (this) {
                            c0103v = hVar2.f8145P;
                        }
                    } else {
                        c0103v = null;
                    }
                    hVar2.q(new C0378e(j34, j9, j35, i18, M13, j20, j10, c0393c6, i19, c0103v));
                    if (hVar2.f8146h) {
                    }
                }
            }
            j7 = j5;
            long j202 = j6 - j7;
            c0393c = hVar2.f8137G;
            if (c0393c.f8349d) {
            }
            long M132 = j7 - J.M(hVar3.f8379b);
            C0393c c0393c62 = hVar2.f8137G;
            long j342 = c0393c62.f8346a;
            long j352 = hVar2.f8141K;
            int i182 = hVar2.f8143N;
            C0107z i192 = hVar2.i();
            if (hVar2.f8137G.f8349d) {
            }
            hVar2.q(new C0378e(j342, j9, j352, i182, M132, j202, j10, c0393c62, i192, c0103v));
            if (hVar2.f8146h) {
            }
        }
        z4 = false;
        if (z4) {
        }
        j7 = j5;
        long j2022 = j6 - j7;
        c0393c = hVar2.f8137G;
        if (c0393c.f8349d) {
        }
        long M1322 = j7 - J.M(hVar3.f8379b);
        C0393c c0393c622 = hVar2.f8137G;
        long j3422 = c0393c622.f8346a;
        long j3522 = hVar2.f8141K;
        int i1822 = hVar2.f8143N;
        C0107z i1922 = hVar2.i();
        if (hVar2.f8137G.f8349d) {
        }
        hVar2.q(new C0378e(j3422, j9, j3522, i1822, M1322, j2022, j10, c0393c622, i1922, c0103v));
        if (hVar2.f8146h) {
        }
    }

    public final void C(C0025a c0025a, u0.p pVar) {
        Y.h hVar = this.z;
        Uri parse = Uri.parse(c0025a.f564c);
        Map map = Collections.EMPTY_MAP;
        AbstractC0124a.o(parse, "The uri must be set.");
        this.f8131A.f(new q(hVar, new Y.k(parse, 1, null, map, 0L, -1L, null, 1), 5, pVar), new g(0, this), 1);
    }

    public final void D() {
        Uri uri;
        this.f8134D.removeCallbacks(this.v);
        if (this.f8131A.c()) {
            return;
        }
        if (this.f8131A.d()) {
            this.f8138H = true;
            return;
        }
        synchronized (this.f8156t) {
            uri = this.f8135E;
        }
        this.f8138H = false;
        Map map = Collections.EMPTY_MAP;
        AbstractC0124a.o(uri, "The uri must be set.");
        q qVar = new q(this.z, new Y.k(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f8154r);
        C0377d c0377d = this.f8155s;
        this.f8151m.getClass();
        this.f8131A.f(qVar, c0377d, 3);
    }

    @Override // q0.AbstractC1359a
    public final InterfaceC1383z b(C1353B c1353b, B1.j jVar, long j4) {
        int intValue = ((Integer) c1353b.f14812a).intValue() - this.f8143N;
        f0.e a3 = a(c1353b);
        f0.e eVar = new f0.e(this.f14948d.f8493c, 0, c1353b);
        int i4 = this.f8143N + intValue;
        C0393c c0393c = this.f8137G;
        A a4 = this.f8132B;
        long j5 = this.f8141K;
        b0.i iVar = this.f14951g;
        iVar.getClass();
        C0375b c0375b = new C0375b(i4, c0393c, this.n, intValue, this.f8148j, a4, this.f8150l, eVar, this.f8151m, a3, j5, this.f8160y, jVar, this.f8149k, this.f8159x, iVar);
        this.f8157u.put(i4, c0375b);
        return c0375b;
    }

    @Override // q0.AbstractC1359a
    public final synchronized C0107z i() {
        return this.f8144O;
    }

    @Override // q0.AbstractC1359a
    public final void k() {
        this.f8160y.a();
    }

    @Override // q0.AbstractC1359a
    public final void n(A a3) {
        this.f8132B = a3;
        Looper myLooper = Looper.myLooper();
        b0.i iVar = this.f14951g;
        iVar.getClass();
        f0.i iVar2 = this.f8150l;
        iVar2.c(myLooper, iVar);
        iVar2.a();
        if (this.f8146h) {
            B(false);
            return;
        }
        this.z = this.f8147i.f();
        this.f8131A = new u0.n("DashMediaSource");
        this.f8134D = J.o(null);
        D();
    }

    @Override // q0.AbstractC1359a
    public final void r(InterfaceC1383z interfaceC1383z) {
        C0375b c0375b = (C0375b) interfaceC1383z;
        p pVar = c0375b.f8105m;
        pVar.f8205i = true;
        pVar.f8200d.removeCallbacksAndMessages(null);
        for (C1398i c1398i : c0375b.f8108r) {
            c1398i.B(c0375b);
        }
        c0375b.f8107q = null;
        this.f8157u.remove(c0375b.f8093a);
    }

    @Override // q0.AbstractC1359a
    public final void t() {
        this.f8138H = false;
        this.z = null;
        u0.n nVar = this.f8131A;
        if (nVar != null) {
            nVar.e(null);
            this.f8131A = null;
        }
        C0103v c0103v = i().f2901c;
        synchronized (this) {
            this.f8145P = c0103v;
        }
        this.f8139I = 0L;
        this.f8140J = 0L;
        this.f8135E = this.f8136F;
        this.f8133C = null;
        Handler handler = this.f8134D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f8134D = null;
        }
        this.f8141K = -9223372036854775807L;
        this.L = 0;
        this.f8142M = -9223372036854775807L;
        this.f8157u.clear();
        G1.c cVar = this.n;
        ((HashMap) cVar.f835b).clear();
        ((HashMap) cVar.f836c).clear();
        ((HashMap) cVar.f837d).clear();
        this.f8150l.release();
    }

    @Override // q0.AbstractC1359a
    public final synchronized void w(C0107z c0107z) {
        this.f8144O = c0107z;
        this.f8145P = c0107z.f2901c;
    }

    public final void y() {
        boolean z;
        u0.n nVar = this.f8131A;
        C0377d c0377d = new C0377d(this);
        synchronized (AbstractC1450b.f15532b) {
            z = AbstractC1450b.f15533c;
        }
        if (z) {
            c0377d.b();
            return;
        }
        if (nVar == null) {
            nVar = new u0.n("SntpClient");
        }
        nVar.f(new C1427b(3), new g(2, c0377d), 1);
    }

    public final void z(q qVar, long j4, long j5) {
        long j6 = qVar.f15487a;
        Y.k kVar = qVar.f15488b;
        z zVar = qVar.f15490d;
        C1377t c1377t = new C1377t(kVar, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        this.f8151m.getClass();
        this.f8153q.c(c1377t, qVar.f15489c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
