package I2;

import A2.s;
import B0.C;
import F.A0;
import F.J;
import F.L;
import F.X0;
import F.a1;
import F.b1;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.C0119s0;
import I.InterfaceC0110n0;
import I.Y0;
import L1.z;
import M1.B;
import N2.AbstractC0145a;
import N2.C0149e;
import N2.C0153i;
import a1.AbstractC0179q;
import a1.C0178p;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import b.I;
import b0.C0265P;
import b0.C0288u;
import b0.InterfaceC0263N;
import com.gates.olympus.miruv.R;
import e2.AbstractC0381e;
import h0.C0424e;
import h0.C0425f;
import h0.G;
import h2.AbstractC0439a;
import h2.AbstractC0454p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import r.AbstractC0813j;
import r.AbstractC0818o;
import r.AbstractC0821s;
import r.C0807d;
import r.C0810g;
import r.C0823u;
import r0.InterfaceC0827A;
import t0.AbstractC0898f;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.C0911t;
import t0.InterfaceC0902j;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static C0425f f2512a = null;

    /* renamed from: b, reason: collision with root package name */
    public static C0425f f2513b = null;

    /* renamed from: c, reason: collision with root package name */
    public static C0425f f2514c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2515d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Method f2516e;

    public static P1.g A(P1.g gVar, P1.h hVar) {
        Z1.i.f(hVar, "key");
        if (Z1.i.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static final int B(F0.l lVar, int i3) {
        boolean z3 = Z1.i.g(lVar.f1458d, F0.l.f1453e.f1458d) >= 0;
        boolean a3 = F0.j.a(i3, 1);
        if (a3 && z3) {
            return 3;
        }
        if (z3) {
            return 1;
        }
        return a3 ? 2 : 0;
    }

    public static final C0425f C() {
        C0425f c0425f = f2514c;
        if (c0425f != null) {
            return c0425f;
        }
        C0424e c0424e = new C0424e("Outlined.BookmarkBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i3 = G.f4893a;
        C0265P c0265p = new C0265P(C0288u.f4292b);
        A2.n nVar = new A2.n(2);
        nVar.j(17.0f, 3.0f);
        nVar.h(7.0f, 3.0f);
        nVar.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        nVar.m(16.0f);
        nVar.i(7.0f, -3.0f);
        nVar.i(7.0f, 3.0f);
        nVar.h(19.0f, 5.0f);
        nVar.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        nVar.c();
        nVar.j(17.0f, 18.0f);
        nVar.i(-5.0f, -2.18f);
        nVar.h(7.0f, 18.0f);
        nVar.h(7.0f, 5.0f);
        nVar.g(10.0f);
        nVar.m(13.0f);
        nVar.c();
        C0424e.a(c0424e, nVar.f118a, c0265p);
        C0425f b2 = c0424e.b();
        f2514c = b2;
        return b2;
    }

    public static final int D(int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i3 >= i4) {
                return i4;
            }
            int i6 = i4 % i5;
            if (i6 < 0) {
                i6 += i5;
            }
            int i7 = i3 % i5;
            if (i7 < 0) {
                i7 += i5;
            }
            int i8 = (i6 - i7) % i5;
            if (i8 < 0) {
                i8 += i5;
            }
            return i4 - i8;
        }
        if (i5 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i3 <= i4) {
            return i4;
        }
        int i9 = -i5;
        int i10 = i3 % i9;
        if (i10 < 0) {
            i10 += i9;
        }
        int i11 = i4 % i9;
        if (i11 < 0) {
            i11 += i9;
        }
        int i12 = (i10 - i11) % i9;
        if (i12 < 0) {
            i12 += i9;
        }
        return i4 + i12;
    }

    public static final boolean E(long j3, long j4) {
        int j5 = M0.a.j(j3);
        int h3 = M0.a.h(j3);
        int i3 = (int) (j4 >> 32);
        if (j5 <= i3 && i3 <= h3) {
            int i4 = M0.a.i(j3);
            int g3 = M0.a.g(j3);
            int i5 = (int) (j4 & 4294967295L);
            if (i4 <= i5 && i5 <= g3) {
                return true;
            }
        }
        return false;
    }

    public static final boolean F(long j3) {
        return (j3 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static final float G(float f3, float f4, float f5) {
        return (f5 * f4) + ((1 - f5) * f3);
    }

    public static P1.i H(P1.g gVar, P1.h hVar) {
        Z1.i.f(hVar, "key");
        return Z1.i.a(gVar.getKey(), hVar) ? P1.j.f3073d : gVar;
    }

    public static final long I(long j3, float f3) {
        return (Float.isNaN(f3) || f3 >= 1.0f) ? j3 : C0288u.b(j3, C0288u.d(j3) * f3);
    }

    public static final long J(int i3, int i4, long j3) {
        int j4 = M0.a.j(j3) + i3;
        if (j4 < 0) {
            j4 = 0;
        }
        int h3 = M0.a.h(j3);
        if (h3 != Integer.MAX_VALUE && (h3 = h3 + i3) < 0) {
            h3 = 0;
        }
        int i5 = M0.a.i(j3) + i4;
        if (i5 < 0) {
            i5 = 0;
        }
        int g3 = M0.a.g(j3);
        if (g3 != Integer.MAX_VALUE) {
            int i6 = g3 + i4;
            g3 = i6 >= 0 ? i6 : 0;
        }
        return a(j4, h3, i5, g3);
    }

    public static final boolean K(String str) {
        Z1.i.f(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static String L(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        C0153i c0153i = C0153i.f2930g;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        Z1.i.e(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i3 = 0;
        d.q(encoded.length, 0, length);
        byte[] a02 = M1.k.a0(encoded, 0, length);
        C0153i c0153i2 = new C0153i(a02);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(a02, 0, c0153i2.b());
        byte[] digest = messageDigest.digest();
        Z1.i.c(digest);
        new C0153i(digest);
        byte[] bArr = AbstractC0145a.f2913a;
        Z1.i.f(bArr, "map");
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i4 = 0;
        while (i3 < length2) {
            byte b2 = digest[i3];
            int i5 = i3 + 2;
            byte b3 = digest[i3 + 1];
            i3 += 3;
            byte b4 = digest[i5];
            bArr2[i4] = bArr[(b2 & 255) >> 2];
            bArr2[i4 + 1] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i6 = i4 + 3;
            bArr2[i4 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i4 += 4;
            bArr2[i6] = bArr[b4 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b5 = digest[i3];
            bArr2[i4] = bArr[(b5 & 255) >> 2];
            bArr2[1 + i4] = bArr[(b5 & 3) << 4];
            bArr2[2 + i4] = 61;
            bArr2[i4 + 3] = 61;
        } else if (length3 == 2) {
            int i7 = i3 + 1;
            byte b6 = digest[i3];
            byte b7 = digest[i7];
            bArr2[i4] = bArr[(b6 & 255) >> 2];
            bArr2[1 + i4] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i4 + 2] = bArr[(b7 & 15) << 2];
            bArr2[i4 + 3] = 61;
        }
        sb.append(new String(bArr2, AbstractC0439a.f5056a));
        return sb.toString();
    }

    public static P1.i M(P1.g gVar, P1.i iVar) {
        Z1.i.f(iVar, "context");
        return iVar == P1.j.f3073d ? gVar : (P1.i) iVar.r(gVar, P1.b.f3068g);
    }

    public static final R.i N(C0113p c0113p) {
        c0113p.Q(-796080049);
        R.i iVar = (R.i) d.H(new Object[0], R.i.f3153d, R.j.f3157f, c0113p, 3072, 4);
        iVar.f3156c = (R.k) c0113p.k(R.m.f3163a);
        c0113p.p(false);
        return iVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 B0.C, still in use, count: 2, list:
          (r2v0 B0.C) from 0x00d0: MOVE (r24v0 B0.C) = (r2v0 B0.C) (LINE:209)
          (r2v0 B0.C) from 0x007f: MOVE (r24v2 B0.C) = (r2v0 B0.C) (LINE:128)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final B0.C O(B0.C r26, M0.j r27) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.l.O(B0.C, M0.j):B0.C");
    }

    public static final void Q(Object obj) {
        if (obj instanceof L1.l) {
            throw ((L1.l) obj).f2710d;
        }
    }

    public static final long R(long j3) {
        return d.h((int) (j3 >> 32), (int) (j3 & 4294967295L));
    }

    public static String S(int i3) {
        return w(i3, 1) ? "Hyphens.None" : w(i3, 2) ? "Hyphens.Auto" : w(i3, Integer.MIN_VALUE) ? "Hyphens.Unspecified" : "Invalid";
    }

    public static final long a(int i3, int i4, int i5, int i6) {
        boolean z3 = false;
        if (!(i4 >= i3)) {
            B.O("maxWidth(" + i4 + ") must be >= than minWidth(" + i3 + ')');
            throw null;
        }
        if (!(i6 >= i5)) {
            B.O("maxHeight(" + i6 + ") must be >= than minHeight(" + i5 + ')');
            throw null;
        }
        if (i3 >= 0 && i5 >= 0) {
            z3 = true;
        }
        if (z3) {
            return s(i3, i4, i5, i6);
        }
        B.O("minWidth(" + i3 + ") and minHeight(" + i5 + ") must be >= 0");
        throw null;
    }

    public static /* synthetic */ long b(int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(0, i3, 0, i4);
    }

    public static final void c(final int i3, final int i4, final int i5, final Y1.a aVar, C0113p c0113p, final int i6) {
        int i7;
        c0113p.S(-110141648);
        if ((i6 & 6) == 0) {
            i7 = (c0113p.d(i3) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0113p.d(i4) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0113p.d(i5) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0113p.h(aVar) ? 2048 : 1024;
        }
        int i8 = i7;
        if ((i8 & 1171) == 1170 && c0113p.x()) {
            c0113p.L();
        } else {
            U.i iVar = U.i.f3302a;
            InterfaceC0827A e3 = AbstractC0818o.e(U.a.f3284h, false);
            int i9 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c3 = U.m.c(c0113p, androidx.compose.foundation.layout.a.f3645b);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0900h c0900h = C0901i.f7923e;
            C0089d.Q(c0113p, c0900h, e3);
            C0900h c0900h2 = C0901i.f7922d;
            C0089d.Q(c0113p, c0900h2, m3);
            C0900h c0900h3 = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i9))) {
                AbstractC0080b.p(i9, c0113p, i9, c0900h3);
            }
            C0900h c0900h4 = C0901i.f7921c;
            C0089d.Q(c0113p, c0900h4, c3);
            U.b bVar = U.a.p;
            C0807d c0807d = AbstractC0813j.f7061a;
            C0823u a3 = AbstractC0821s.a(new C0810g(14), bVar, c0113p, 54);
            int i10 = c0113p.f2306P;
            InterfaceC0110n0 m4 = c0113p.m();
            U.l c4 = U.m.c(c0113p, iVar);
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, c0900h, a3);
            C0089d.Q(c0113p, c0900h2, m4);
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i10))) {
                AbstractC0080b.p(i10, c0113p, i10, c0900h3);
            }
            C0089d.Q(c0113p, c0900h4, c4);
            Y0 y02 = b1.f1200a;
            C c5 = ((a1) c0113p.k(y02)).f1185b;
            F0.l lVar = F0.l.f1457i;
            Y0 y03 = L.f1045a;
            X0.b(i3 + " / " + i4, null, ((J) c0113p.k(y03)).f992a, 0L, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, c5, c0113p, 196608, 0, 65498);
            X0.b(i3 == i4 ? "Master joiner!" : i3 >= (i4 * 2) / 3 ? "Solid work at the bench." : "Keep studying the grain.", null, ((J) c0113p.k(y03)).f1006o, 0L, null, null, null, 0L, null, new L0.f(3), 0L, 0, false, 0, 0, null, ((a1) c0113p.k(y02)).f1191h, c0113p, 0, 0, 65018);
            X0.b(AbstractC0080b.h("Best score: ", i5), null, ((J) c0113p.k(y03)).f1009s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p.k(y02)).f1194k, c0113p, 0, 0, 65530);
            A0.e(aVar, null, false, null, null, null, null, null, null, G1.b.f1540a, c0113p, ((i8 >> 9) & 14) | 805306368);
            c0113p.p(true);
            c0113p.p(true);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new Y1.e() { // from class: G1.j
                @Override // Y1.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    I2.l.c(i3, i4, i5, aVar, (C0113p) obj, C0089d.T(i6 | 1));
                    return z.f2729a;
                }
            };
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void d(G1.r r45, r.InterfaceC0796H r46, I.C0113p r47, int r48) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.l.d(G1.r, r.H, I.p, int):void");
    }

    public static final long e(int i3, int i4) {
        return (i4 & 4294967295L) | (i3 << 32);
    }

    public static final long f(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final boolean g(X.d dVar, long j3) {
        if (!dVar.f3303d.p) {
            return false;
        }
        C0911t c0911t = (C0911t) AbstractC0898f.t(dVar).f7735x.f2353c;
        if (!c0911t.f7955L.p) {
            return false;
        }
        long j4 = c0911t.f7116f;
        long K02 = c0911t.K0(0L);
        float d3 = a0.c.d(K02);
        float e3 = a0.c.e(K02);
        float f3 = ((int) (j4 >> 32)) + d3;
        float f4 = ((int) (j4 & 4294967295L)) + e3;
        float d4 = a0.c.d(j3);
        if (d3 > d4 || d4 > f3) {
            return false;
        }
        float e4 = a0.c.e(j3);
        return e3 <= e4 && e4 <= f4;
    }

    public static final int h(int i3) {
        if (i3 < 8191) {
            return 262142;
        }
        if (i3 < 32767) {
            return 65534;
        }
        if (i3 < 65535) {
            return 32766;
        }
        if (i3 < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException(AbstractC0080b.i("Can't represent a size of ", i3, " in Constraints"));
    }

    public static C0149e j() {
        C0149e c0149e = C0149e.f2924l;
        Z1.i.c(c0149e);
        C0149e c0149e2 = c0149e.f2926f;
        if (c0149e2 == null) {
            long nanoTime = System.nanoTime();
            C0149e.f2921i.await(C0149e.f2922j, TimeUnit.MILLISECONDS);
            C0149e c0149e3 = C0149e.f2924l;
            Z1.i.c(c0149e3);
            if (c0149e3.f2926f != null || System.nanoTime() - nanoTime < C0149e.f2923k) {
                return null;
            }
            return C0149e.f2924l;
        }
        long nanoTime2 = c0149e2.f2927g - System.nanoTime();
        if (nanoTime2 > 0) {
            C0149e.f2921i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C0149e c0149e4 = C0149e.f2924l;
        Z1.i.c(c0149e4);
        c0149e4.f2926f = c0149e2.f2926f;
        c0149e2.f2926f = null;
        return c0149e2;
    }

    public static final int k(int i3) {
        if (i3 < 8191) {
            return 13;
        }
        if (i3 < 32767) {
            return 15;
        }
        if (i3 < 65535) {
            return 16;
        }
        return i3 < 262143 ? 18 : 255;
    }

    public static final U.l m(U.l lVar, InterfaceC0263N interfaceC0263N) {
        return androidx.compose.ui.graphics.a.b(lVar, 0.0f, 0.0f, interfaceC0263N, true, 124927);
    }

    public static final U.l n(U.l lVar) {
        return androidx.compose.ui.graphics.a.b(lVar, 0.0f, 0.0f, null, true, 126975);
    }

    public static final long o(long j3, long j4) {
        return e(AbstractC0381e.r((int) (j4 >> 32), M0.a.j(j3), M0.a.h(j3)), AbstractC0381e.r((int) (j4 & 4294967295L), M0.a.i(j3), M0.a.g(j3)));
    }

    public static final int p(long j3, int i3) {
        return AbstractC0381e.r(i3, M0.a.i(j3), M0.a.g(j3));
    }

    public static final int q(long j3, int i3) {
        return AbstractC0381e.r(i3, M0.a.j(j3), M0.a.h(j3));
    }

    public static final void r(int i3, int i4) {
        if (i3 <= i4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i4 + ").");
    }

    public static final long s(int i3, int i4, int i5, int i6) {
        int i7 = i6 == Integer.MAX_VALUE ? i5 : i6;
        int k3 = k(i7);
        int i8 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int k4 = k(i8);
        if (k3 + k4 > 31) {
            throw new IllegalArgumentException("Can't represent a width of " + i8 + " and height of " + i7 + " in Constraints");
        }
        int i9 = i4 + 1;
        int i10 = i9 & (~(i9 >> 31));
        int i11 = i6 + 1;
        int i12 = i11 & (~(i11 >> 31));
        int i13 = 0;
        if (k4 != 13) {
            if (k4 == 18) {
                i13 = 3;
            } else if (k4 == 15) {
                i13 = 1;
            } else if (k4 == 16) {
                i13 = 2;
            }
        }
        int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
        return (i10 << 33) | i13 | (i3 << 2) | (i5 << (i14 + 15)) | (i12 << (i14 + 46));
    }

    public static final L1.l t(Throwable th) {
        Z1.i.f(th, "exception");
        return new L1.l(th);
    }

    public static boolean u(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        int i3 = AbstractC0179q.f3561a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0178p.f3557d;
        C0178p c0178p = (C0178p) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c0178p == null) {
            c0178p = new C0178p();
            c0178p.f3558a = null;
            c0178p.f3559b = null;
            c0178p.f3560c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0178p);
        }
        WeakReference weakReference2 = c0178p.f3560c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0178p.f3560c = new WeakReference(keyEvent);
        if (c0178p.f3559b == null) {
            c0178p.f3559b = new SparseArray();
        }
        SparseArray sparseArray = c0178p.f3559b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static final boolean v(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean w(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean x(int i3, int i4) {
        return i3 == i4;
    }

    public static final float y(float f3) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f3) & 8589934591L) / 3)) + 709952852);
        float f4 = intBitsToFloat - ((intBitsToFloat - (f3 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f4 - ((f4 - (f3 / (f4 * f4))) * 0.33333334f);
    }

    public static s z(String str) {
        Z1.i.f(str, "<this>");
        Matcher matcher = s.f138c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        Z1.i.e(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        Z1.i.e(locale, "US");
        Z1.i.e(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        Z1.i.e(group2, "typeSubtype.group(2)");
        Z1.i.e(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = s.f139d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                Z1.i.e(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (AbstractC0454p.i0(group4, "'") && AbstractC0454p.c0(group4, "'", false) && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    Z1.i.e(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new s(str, (String[]) arrayList.toArray(new String[0]));
    }

    public abstract void P(I i3, I i4, Window window, View view, boolean z3, boolean z4);

    public abstract List l(List list, String str);

    public void i(Window window) {
    }
}
