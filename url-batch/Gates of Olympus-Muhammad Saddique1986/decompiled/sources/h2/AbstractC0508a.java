package h2;

import A.h;
import B.C0000a;
import B.C0003d;
import B.C0004e;
import B.C0005f;
import B.C0006g;
import B.C0009j;
import B.C0012m;
import B.C0022x;
import B.InterfaceC0013n;
import C0.J;
import D0.F;
import D0.H;
import F.A1;
import F.AbstractC0110n0;
import F.B1;
import F.O;
import F.d1;
import F.x1;
import F0.d;
import G2.f;
import G2.k;
import G2.x;
import H2.b;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import I.W;
import I.X0;
import O0.m;
import O0.n;
import O1.C0208b;
import O1.C0209c;
import O1.C0211e;
import O2.l;
import S1.u;
import T2.C0228c;
import T2.C0229d;
import T2.t;
import T2.z;
import U.p;
import U.q;
import V1.g;
import V1.i;
import a.AbstractC0235a;
import a0.C0238c;
import a0.C0239d;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.FillElement;
import androidx.lifecycle.P;
import b.C0304H;
import b0.C0334c;
import b0.C0338g;
import b0.C0352v;
import b0.M;
import b0.T;
import b0.r;
import d0.C0400a;
import d0.C0401b;
import d0.C0406g;
import d0.InterfaceC0403d;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0427f;
import f2.j;
import h0.AbstractC0454G;
import h0.C0462e;
import h0.C0463f;
import h0.C0469l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import l0.c;
import n.AbstractC0695v;
import n1.C0720b;
import n2.AbstractC0730j;
import q2.AbstractC0837y;
import r.AbstractC0856c;
import r.AbstractC0864k;
import r.AbstractC0868o;
import r.C0850L;
import r.C0855b;
import r.C0861h;
import r.InterfaceC0849K;
import r.Q;
import r0.AbstractC0898U;
import r0.InterfaceC0885G;
import r0.InterfaceC0919p;
import s.C0937f;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.E;
import t0.InterfaceC0997j;
import t0.o0;
import u0.AbstractC1101g0;
import u0.O0;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0508a {

    /* renamed from: a, reason: collision with root package name */
    public static C0463f f6219a;

    /* renamed from: b, reason: collision with root package name */
    public static C0463f f6220b;

    /* renamed from: c, reason: collision with root package name */
    public static C0463f f6221c;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static x A(String str) {
        j.f(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return x.f2316g;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return x.f2315f;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return x.f2314e;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return x.f2317h;
            }
        } else if (str.equals("SSLv3")) {
            return x.f2318i;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static G2.j B(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = u.f4320d;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        f c2 = f.f2156b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        x A3 = A(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = b.k(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = b.k(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new G2.j(A3, c2, list2, new h(5, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new G2.j(A3, c2, list2, new h(5, list));
    }

    public static g C(g gVar, V1.h hVar) {
        j.f(hVar, "key");
        if (j.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static final C0463f D() {
        C0463f c0463f = f6220b;
        if (c0463f != null) {
            return c0463f;
        }
        C0462e c0462e = new C0462e("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i3 = AbstractC0454G.f5881a;
        T t3 = new T(C0352v.f5434b);
        k kVar = new k(2);
        kVar.i(19.0f, 13.0f);
        kVar.f(-6.0f);
        kVar.l(6.0f);
        kVar.f(-2.0f);
        kVar.l(-6.0f);
        ArrayList arrayList = kVar.f2203d;
        arrayList.add(new C0469l(5.0f));
        kVar.l(-2.0f);
        kVar.f(6.0f);
        kVar.k(5.0f);
        kVar.f(2.0f);
        kVar.l(6.0f);
        kVar.f(6.0f);
        kVar.l(2.0f);
        kVar.c();
        C0462e.a(c0462e, arrayList, t3);
        C0463f b3 = c0462e.b();
        f6220b = b3;
        return b3;
    }

    public static final float E(Layout layout, int i3, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i3);
        F f3 = H.f839a;
        if (layout.getEllipsisCount(i3) <= 0 || layout.getParagraphDirection(i3) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i3) + layout.getLineStart(i3)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i3);
        if ((paragraphAlignment == null ? -1 : d.f1925a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float F(Layout layout, int i3, Paint paint) {
        float width;
        float width2;
        F f3 = H.f839a;
        if (layout.getEllipsisCount(i3) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i3) != -1 || layout.getWidth() >= layout.getLineRight(i3)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i3) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i3) + layout.getLineStart(i3)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i3);
        if ((paragraphAlignment != null ? d.f1925a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i3);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i3);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final o0 G(E e3) {
        p pVar = (p) e3.f8561y.f2915f;
        Object obj = null;
        if ((pVar.f4492g & 8) != 0) {
            loop0: while (true) {
                if (pVar == null) {
                    break;
                }
                if ((pVar.f4491f & 8) != 0) {
                    p pVar2 = pVar;
                    K.d dVar = null;
                    while (pVar2 != null) {
                        if (pVar2 instanceof o0) {
                            if (((o0) pVar2).R()) {
                                obj = pVar2;
                                break loop0;
                            }
                        } else if ((pVar2.f4491f & 8) != 0 && (pVar2 instanceof AbstractC1000m)) {
                            int i3 = 0;
                            for (p pVar3 = ((AbstractC1000m) pVar2).f8771r; pVar3 != null; pVar3 = pVar3.f4494i) {
                                if ((pVar3.f4491f & 8) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        pVar2 = pVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new K.d(new p[16]);
                                        }
                                        if (pVar2 != null) {
                                            dVar.b(pVar2);
                                            pVar2 = null;
                                        }
                                        dVar.b(pVar3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        pVar2 = AbstractC0993f.f(dVar);
                    }
                }
                if ((pVar.f4492g & 8) == 0) {
                    break;
                }
                pVar = pVar.f4494i;
            }
        }
        return (o0) obj;
    }

    public static int H(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 4) {
            return 2;
        }
        if (i3 == 8) {
            return 3;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 == 32) {
            return 5;
        }
        if (i3 == 64) {
            return 6;
        }
        if (i3 == 128) {
            return 7;
        }
        if (i3 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(A.k.h("type needs to be >= FIRST and <= LAST, type=", i3));
    }

    public static final int I(int i3, int i4) {
        return (i3 >> i4) & 31;
    }

    public static final boolean J(AssertionError assertionError) {
        Logger logger = t.f4443a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? AbstractC0730j.C(message, "getsockname failed") : false;
    }

    public static i K(g gVar, V1.h hVar) {
        j.f(hVar, "key");
        return j.a(gVar.getKey(), hVar) ? V1.j.f4558d : gVar;
    }

    public static i L(g gVar, i iVar) {
        j.f(iVar, "context");
        return iVar == V1.j.f4558d ? gVar : (i) iVar.e(gVar, V1.b.f4553g);
    }

    public static C0720b O(MappedByteBuffer mappedByteBuffer) {
        long j3;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i3 = duplicate.getShort() & 65535;
        if (i3 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                j3 = -1;
                break;
            }
            int i5 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j3 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i5) {
                break;
            }
            i4++;
        }
        if (j3 != -1) {
            duplicate.position(duplicate.position() + ((int) (j3 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j4 = duplicate.getInt() & 4294967295L;
            for (int i6 = 0; i6 < j4; i6++) {
                int i7 = duplicate.getInt();
                long j5 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i7 || 1701669481 == i7) {
                    duplicate.position((int) (j5 + j3));
                    C0720b c0720b = new C0720b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    c0720b.f4353g = duplicate;
                    c0720b.f4350d = position;
                    int i8 = position - duplicate.getInt(position);
                    c0720b.f4351e = i8;
                    c0720b.f4352f = ((ByteBuffer) c0720b.f4353g).getShort(i8);
                    return c0720b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final float P(long j3, float f3, O0.b bVar) {
        float c2;
        long b3 = m.b(j3);
        if (n.a(b3, 4294967296L)) {
            if (bVar.r() <= 1.05d) {
                return bVar.K(j3);
            }
            c2 = m.c(j3) / m.c(bVar.T(f3));
        } else {
            if (!n.a(b3, 8589934592L)) {
                return Float.NaN;
            }
            c2 = m.c(j3);
        }
        return c2 * f3;
    }

    public static int Q(float f3) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f3);
    }

    public static long R(double d3) {
        if (Double.isNaN(d3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d3);
    }

    public static final void S(Spannable spannable, long j3, int i3, int i4) {
        if (j3 != 16) {
            spannable.setSpan(new ForegroundColorSpan(M.D(j3)), i3, i4, 33);
        }
    }

    public static final void T(Spannable spannable, long j3, O0.b bVar, int i3, int i4) {
        long b3 = m.b(j3);
        if (n.a(b3, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(Q(bVar.K(j3)), false), i3, i4, 33);
        } else if (n.a(b3, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(m.c(j3)), i3, i4, 33);
        }
    }

    public static final C0228c V(Socket socket) {
        Logger logger = t.f4443a;
        T2.E e3 = new T2.E(socket);
        OutputStream outputStream = socket.getOutputStream();
        j.e(outputStream, "getOutputStream(...)");
        return new C0228c(e3, new C0228c(outputStream, e3));
    }

    public static final C0229d W(Socket socket) {
        Logger logger = t.f4443a;
        T2.E e3 = new T2.E(socket);
        InputStream inputStream = socket.getInputStream();
        j.e(inputStream, "getInputStream(...)");
        return new C0229d(e3, 0, new C0229d(inputStream, 1, e3));
    }

    public static final void X(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final String Y(float f3) {
        if (Float.isNaN(f3)) {
            return "NaN";
        }
        if (Float.isInfinite(f3)) {
            return f3 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f4 = f3 * pow;
        int i3 = (int) f4;
        if (f4 - i3 >= 0.5f) {
            i3++;
        }
        float f5 = i3 / pow;
        return max > 0 ? String.valueOf(f5) : String.valueOf((int) f5);
    }

    public static final long Z(long j3, long j4) {
        int c2;
        int e3 = J.e(j3);
        int d3 = J.d(j3);
        if (J.e(j4) >= J.d(j3) || J.e(j3) >= J.d(j4)) {
            if (d3 > J.e(j4)) {
                e3 -= J.c(j4);
                c2 = J.c(j4);
                d3 -= c2;
            }
        } else if (J.e(j4) > J.e(j3) || J.d(j3) > J.d(j4)) {
            if (J.e(j3) > J.e(j4) || J.d(j4) > J.d(j3)) {
                int e4 = J.e(j4);
                if (e3 >= J.d(j4) || e4 > e3) {
                    d3 = J.e(j4);
                } else {
                    e3 = J.e(j4);
                    c2 = J.c(j4);
                }
            } else {
                c2 = J.c(j4);
            }
            d3 -= c2;
        } else {
            e3 = J.e(j4);
            d3 = e3;
        }
        return l.J(e3, d3);
    }

    public static final void a(J1.b bVar, InterfaceC0422a interfaceC0422a, InterfaceC0422a interfaceC0422a2, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(1444502788);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(bVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(interfaceC0422a2) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            d1.c(null, null, d1.f(((F.M) c0167p.k(O.f1301a)).f1253p, c0167p), null, null, Q.f.b(-1797842094, new C0211e(bVar, interfaceC0422a, interfaceC0422a2, 0), c0167p), c0167p, 196608, 27);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new N1.b(bVar, interfaceC0422a, interfaceC0422a2, i3, 2);
        }
    }

    public static final C0239d a0(InterfaceC0919p interfaceC0919p) {
        C0239d e3 = AbstractC0898U.e(interfaceC0919p);
        long f3 = interfaceC0919p.f(c.e(e3.f4724a, e3.f4725b));
        long f4 = interfaceC0919p.f(c.e(e3.f4726c, e3.f4727d));
        return new C0239d(C0238c.d(f3), C0238c.e(f3), C0238c.d(f4), C0238c.e(f4));
    }

    public static final void b(J1.a aVar, InterfaceC0422a interfaceC0422a, InterfaceC0427f interfaceC0427f, C0167p c0167p, int i3) {
        int i4;
        String str;
        String str2;
        String str3;
        c0167p.S(-1799637376);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(interfaceC0427f) ? 256 : 128;
        }
        int i5 = i4;
        if ((i5 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            c0167p.Q(424927271);
            Object G3 = c0167p.G();
            W w2 = C0159l.f2829a;
            W w3 = W.f2783i;
            String str4 = "";
            if (G3 == w2) {
                if (aVar == null || (str3 = aVar.f3160b) == null) {
                    str3 = "";
                }
                G3 = C0143d.K(str3, w3);
                c0167p.a0(G3);
            }
            InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G3;
            c0167p.p(false);
            c0167p.Q(424929416);
            Object G4 = c0167p.G();
            if (G4 == w2) {
                if (aVar == null || (str2 = aVar.f3161c) == null) {
                    str2 = "";
                }
                G4 = C0143d.K(str2, w3);
                c0167p.a0(G4);
            }
            InterfaceC0142c0 interfaceC0142c02 = (InterfaceC0142c0) G4;
            c0167p.p(false);
            c0167p.Q(424931559);
            Object G5 = c0167p.G();
            if (G5 == w2) {
                if (aVar != null && (str = aVar.f3162d) != null) {
                    str4 = str;
                }
                G5 = C0143d.K(str4, w3);
                c0167p.a0(G5);
            }
            InterfaceC0142c0 interfaceC0142c03 = (InterfaceC0142c0) G5;
            c0167p.p(false);
            d1.a(interfaceC0422a, Q.f.b(1513671480, new F1.d(interfaceC0427f, interfaceC0142c0, interfaceC0142c02, interfaceC0142c03), c0167p), null, Q.f.b(1924281846, new O1.g(interfaceC0422a, 0), c0167p), null, Q.f.b(-1960075084, new O1.h(aVar, 0), c0167p), Q.f.b(392713747, new O1.j(interfaceC0142c0, interfaceC0142c02, interfaceC0142c03), c0167p), null, 0L, 0L, 0L, 0L, 0.0f, null, c0167p, ((i5 >> 3) & 14) | 1772592, 0);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new N1.b(aVar, interfaceC0422a, interfaceC0427f, i3, 1);
        }
    }

    public static final void c(final Q1.c cVar, C0167p c0167p, int i3) {
        int i4;
        InterfaceC0142c0 interfaceC0142c0;
        InterfaceC0142c0 interfaceC0142c02;
        Object obj;
        InterfaceC0142c0 interfaceC0142c03;
        boolean z3;
        Object obj2;
        final InterfaceC0142c0 interfaceC0142c04;
        boolean z4;
        Object obj3;
        c0167p.S(455115125);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(cVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            final InterfaceC0142c0 i5 = AbstractC0695v.i(cVar.f3970c, c0167p);
            c0167p.Q(1664127135);
            Object G3 = c0167p.G();
            Object obj4 = C0159l.f2829a;
            W w2 = W.f2783i;
            Object obj5 = G3;
            if (G3 == obj4) {
                Object K3 = C0143d.K(null, w2);
                c0167p.a0(K3);
                obj5 = K3;
            }
            final InterfaceC0142c0 interfaceC0142c05 = (InterfaceC0142c0) obj5;
            c0167p.p(false);
            c0167p.Q(1664129143);
            Object G4 = c0167p.G();
            Object obj6 = G4;
            if (G4 == obj4) {
                Object K4 = C0143d.K(Boolean.FALSE, w2);
                c0167p.a0(K4);
                obj6 = K4;
            }
            final InterfaceC0142c0 interfaceC0142c06 = (InterfaceC0142c0) obj6;
            c0167p.p(false);
            FillElement fillElement = androidx.compose.foundation.layout.c.f4829b;
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, false);
            int i6 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            q d3 = U.a.d(c0167p, fillElement);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, e3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !j.a(c0167p.G(), Integer.valueOf(i6))) {
                A.k.o(i6, c0167p, i6, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            androidx.compose.foundation.layout.a aVar = androidx.compose.foundation.layout.a.f4827a;
            if (((List) i5.getValue()).isEmpty()) {
                c0167p.Q(-314441319);
                d("No clients yet. Tap + to add your first client.", null, c0167p, 6);
                c0167p.p(false);
                interfaceC0142c0 = interfaceC0142c06;
                interfaceC0142c02 = interfaceC0142c05;
                obj = obj4;
            } else {
                c0167p.Q(-314335702);
                float f3 = 16;
                C0850L c0850l = new C0850L(f3, f3, f3, f3);
                C0855b c0855b = AbstractC0864k.f8051a;
                C0861h c0861h = new C0861h(10);
                c0167p.Q(1513888470);
                boolean f4 = c0167p.f(i5) | c0167p.h(cVar);
                Object G5 = c0167p.G();
                Object obj7 = G5;
                if (f4 || G5 == obj4) {
                    Object obj8 = new InterfaceC0424c() { // from class: O1.a
                        @Override // e2.InterfaceC0424c
                        public final Object n(Object obj9) {
                            C0937f c0937f = (C0937f) obj9;
                            f2.j.f(c0937f, "$this$LazyColumn");
                            List list = (List) InterfaceC0142c0.this.getValue();
                            A2.i iVar = new A2.i(4);
                            c0937f.f8229a.a(list.size(), new G1.m(new C0022x(iVar, 11, list), new l(0, list), new Q.a(-632812321, new m(list, cVar, interfaceC0142c05, interfaceC0142c06), true)));
                            return R1.y.f4171a;
                        }
                    };
                    c0167p.a0(obj8);
                    obj7 = obj8;
                }
                c0167p.p(false);
                interfaceC0142c0 = interfaceC0142c06;
                interfaceC0142c02 = interfaceC0142c05;
                obj = obj4;
                AbstractC0695v.a(fillElement, null, c0850l, false, c0861h, null, null, false, (InterfaceC0424c) obj7, c0167p, 24966);
                c0167p.p(false);
            }
            q f5 = androidx.compose.foundation.layout.b.f(aVar.a(), 16);
            Q.a aVar2 = O1.p.f3841a;
            Q.a aVar3 = O1.p.f3842b;
            c0167p.Q(1513900791);
            Object G6 = c0167p.G();
            Object obj9 = obj;
            if (G6 == obj9) {
                interfaceC0142c03 = interfaceC0142c02;
                z3 = false;
                Object c0208b = new C0208b(interfaceC0142c03, interfaceC0142c0, false ? 1 : 0);
                c0167p.a0(c0208b);
                obj2 = c0208b;
            } else {
                interfaceC0142c03 = interfaceC0142c02;
                z3 = false;
                obj2 = G6;
            }
            c0167p.p(z3);
            final InterfaceC0142c0 interfaceC0142c07 = interfaceC0142c03;
            InterfaceC0142c0 interfaceC0142c08 = interfaceC0142c0;
            AbstractC0110n0.a(aVar2, aVar3, (InterfaceC0422a) obj2, f5, false, null, 0L, 0L, null, null, c0167p, 438);
            c0167p.p(true);
            if (((Boolean) interfaceC0142c08.getValue()).booleanValue()) {
                J1.a aVar4 = (J1.a) interfaceC0142c07.getValue();
                c0167p.Q(1664166761);
                Object G7 = c0167p.G();
                if (G7 == obj9) {
                    interfaceC0142c04 = interfaceC0142c08;
                    z4 = false;
                    Object c0209c = new C0209c(interfaceC0142c04, false ? 1 : 0);
                    c0167p.a0(c0209c);
                    obj3 = c0209c;
                } else {
                    interfaceC0142c04 = interfaceC0142c08;
                    z4 = false;
                    obj3 = G7;
                }
                InterfaceC0422a interfaceC0422a = (InterfaceC0422a) obj3;
                c0167p.p(z4);
                c0167p.Q(1664168238);
                boolean h3 = c0167p.h(cVar);
                Object G8 = c0167p.G();
                Object obj10 = G8;
                if (h3 || G8 == obj9) {
                    Object obj11 = new InterfaceC0427f() { // from class: O1.d
                        @Override // e2.InterfaceC0427f
                        public final Object g(Object obj12, Object obj13, Object obj14) {
                            String str = (String) obj12;
                            String str2 = (String) obj13;
                            String str3 = (String) obj14;
                            f2.j.f(str, "name");
                            f2.j.f(str2, "phone");
                            f2.j.f(str3, "note");
                            J1.a aVar5 = (J1.a) interfaceC0142c07.getValue();
                            Q1.c cVar2 = Q1.c.this;
                            AbstractC0837y.r(P.j(cVar2), null, null, new Q1.b(aVar5, str, str2, str3, cVar2, null), 3);
                            interfaceC0142c04.setValue(Boolean.FALSE);
                            return R1.y.f4171a;
                        }
                    };
                    c0167p.a0(obj11);
                    obj10 = obj11;
                }
                c0167p.p(z4);
                b(aVar4, interfaceC0422a, (InterfaceC0427f) obj10, c0167p, 48);
            }
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new M1.c(i3, 2, cVar);
        }
    }

    public static final void d(String str, InterfaceC0849K interfaceC0849K, C0167p c0167p, int i3) {
        int i4;
        InterfaceC0849K interfaceC0849K2;
        c0167p.S(-1668920627);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i5 = i4 | 48;
        if ((i5 & 19) == 18 && c0167p.x()) {
            c0167p.L();
            interfaceC0849K2 = interfaceC0849K;
        } else {
            float f3 = 0;
            C0850L c0850l = new C0850L(f3, f3, f3, f3);
            q f4 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.c.f4829b, c0850l), 32);
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4465h, false);
            int i6 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            q d3 = U.a.d(c0167p, f4);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, e3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !j.a(c0167p.G(), Integer.valueOf(i6))) {
                A.k.o(i6, c0167p, i6, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            x1.b(str, null, ((F.M) c0167p.k(O.f1301a)).f1256s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p.k(B1.f1124a)).f1109j, c0167p, i5 & 14, 0, 65530);
            c0167p.p(true);
            interfaceC0849K2 = c0850l;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new N1.a(i3, 0, interfaceC0849K2, str);
        }
    }

    public static final void e(InterfaceC0013n interfaceC0013n, U.d dVar, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(476043083);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? c0167p.f(interfaceC0013n) : c0167p.h(interfaceC0013n) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(dVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            boolean z3 = false;
            boolean z4 = (i4 & 112) == 32;
            if ((i4 & 14) == 4 || ((i4 & 8) != 0 && c0167p.f(interfaceC0013n))) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            Object G3 = c0167p.G();
            if (z5 || G3 == C0159l.f2829a) {
                G3 = new C0012m(dVar, interfaceC0013n);
                c0167p.a0(G3);
            }
            R0.n.a((C0012m) G3, null, new R0.E(false, true, true, 1, true, false), aVar, c0167p, ((i4 << 3) & 7168) | 384, 2);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0000a(interfaceC0013n, dVar, aVar, i3, 0);
        }
    }

    public static final void f(String str, String str2, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-754860296);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(str2) ? 32 : 16;
        }
        int i5 = i4;
        if ((i5 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            q h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.c(U.n.f4488a, 1.0f), 0.0f, 2, 1);
            Q a3 = r.P.a(AbstractC0864k.f8056f, U.b.f4470m, c0167p, 6);
            int i6 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            q d3 = U.a.d(c0167p, h3);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, a3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !j.a(c0167p.G(), Integer.valueOf(i6))) {
                A.k.o(i6, c0167p, i6, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            X0 x02 = B1.f1124a;
            x1.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p.k(x02)).f1110k, c0167p, i5 & 14, 0, 65534);
            x1.b(str2, null, 0L, 0L, null, H0.k.f2598g, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p.k(x02)).f1110k, c0167p, ((i5 >> 3) & 14) | 196608, 0, 65502);
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new N1.a(i3, 1, str2, str);
        }
    }

    public static final void g(String str, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-1991201708);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            x1.b(str, androidx.compose.foundation.layout.b.h(U.n.f4488a, 0.0f, 4, 1), 0L, 0L, null, H0.k.f2599h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p.k(B1.f1124a)).f1107h, c0167p, (i4 & 14) | 196656, 0, 65500);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new M1.c(i3, 1, str);
        }
    }

    public static final void h(InterfaceC0013n interfaceC0013n, boolean z3, N0.h hVar, boolean z4, long j3, q qVar, C0167p c0167p, int i3) {
        int i4;
        int i5;
        long j4;
        boolean z5;
        long j5;
        c0167p.S(-843755800);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? c0167p.f(interfaceC0013n) : c0167p.h(interfaceC0013n) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.g(z3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(hVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.g(z4) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0167p.f(qVar) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0167p.x()) {
            c0167p.L();
            j5 = j3;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                i5 = i4 & (-57345);
                j4 = 9205357640488583168L;
            } else {
                c0167p.L();
                i5 = i4 & (-57345);
                j4 = j3;
            }
            c0167p.q();
            N0.h hVar2 = N0.h.f3545e;
            N0.h hVar3 = N0.h.f3544d;
            if (z3) {
                float f3 = B.F.f278a;
                z5 = (hVar == hVar3 && !z4) || (hVar == hVar2 && z4);
            } else {
                float f4 = B.F.f278a;
                z5 = !((hVar == hVar3 && !z4) || (hVar == hVar2 && z4));
            }
            U.f fVar = z5 ? U.a.f4457b : U.a.f4456a;
            int i6 = i5 & 14;
            boolean g3 = ((i5 & 112) == 32) | (i6 == 4 || ((i5 & 8) != 0 && c0167p.h(interfaceC0013n))) | c0167p.g(z5);
            Object G3 = c0167p.G();
            if (g3 || G3 == C0159l.f2829a) {
                G3 = new C0005f(interfaceC0013n, z3, z5);
                c0167p.a0(G3);
            }
            e(interfaceC0013n, fVar, Q.f.b(280174801, new C0003d((O0) c0167p.k(AbstractC1101g0.f9365q), j4, z5, A0.k.a(qVar, (InterfaceC0424c) G3), interfaceC0013n), c0167p), c0167p, i6 | 384);
            j5 = j4;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0004e(interfaceC0013n, z3, hVar, z4, j5, qVar, i3);
        }
    }

    public static final void i(q qVar, InterfaceC0422a interfaceC0422a, boolean z3, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(2111672474);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(qVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.g(z3) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            AbstractC0856c.a(c0167p, U.a.b(androidx.compose.foundation.layout.c.i(qVar, B.F.f278a, B.F.f279b), new C0009j(interfaceC0422a, z3)));
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0006g(qVar, interfaceC0422a, z3, i3);
        }
    }

    public static final A0.p j(E e3, boolean z3) {
        p pVar = (p) e3.f8561y.f2915f;
        Object obj = null;
        if ((pVar.f4492g & 8) != 0) {
            loop0: while (true) {
                if (pVar == null) {
                    break;
                }
                if ((pVar.f4491f & 8) != 0) {
                    p pVar2 = pVar;
                    K.d dVar = null;
                    while (pVar2 != null) {
                        if (pVar2 instanceof o0) {
                            obj = pVar2;
                            break loop0;
                        }
                        if ((pVar2.f4491f & 8) != 0 && (pVar2 instanceof AbstractC1000m)) {
                            int i3 = 0;
                            for (p pVar3 = ((AbstractC1000m) pVar2).f8771r; pVar3 != null; pVar3 = pVar3.f4494i) {
                                if ((pVar3.f4491f & 8) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        pVar2 = pVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new K.d(new p[16]);
                                        }
                                        if (pVar2 != null) {
                                            dVar.b(pVar2);
                                            pVar2 = null;
                                        }
                                        dVar.b(pVar3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        pVar2 = AbstractC0993f.f(dVar);
                    }
                }
                if ((pVar.f4492g & 8) == 0) {
                    break;
                }
                pVar = pVar.f4494i;
            }
        }
        j.c(obj);
        p pVar4 = ((p) ((o0) obj)).f4489d;
        A0.i o3 = e3.o();
        j.c(o3);
        return new A0.p(pVar4, z3, e3, o3);
    }

    public static final void k(String str, String str2, q qVar, C0167p c0167p, int i3) {
        int i4;
        j.f(str2, "value");
        c0167p.S(-1646350676);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(str2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(qVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            d1.c(qVar, null, d1.f(((F.M) c0167p.k(O.f1301a)).f1253p, c0167p), null, null, Q.f.b(-1586373090, new M1.f(str2, 2, str), c0167p), c0167p, ((i4 >> 6) & 14) | 196608, 26);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new N1.b(str, str2, qVar, i3, 0);
        }
    }

    public static final Object[] l(Object[] objArr, int i3, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        S1.k.o0(objArr, objArr2, 0, i3, 6);
        S1.k.m0(objArr, objArr2, i3 + 2, i3, objArr.length);
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] m(Object[] objArr, int i3) {
        Object[] objArr2 = new Object[objArr.length - 2];
        S1.k.o0(objArr, objArr2, 0, i3, 6);
        S1.k.m0(objArr, objArr2, i3, i3 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] n(Object[] objArr, int i3) {
        Object[] objArr2 = new Object[objArr.length - 1];
        S1.k.o0(objArr, objArr2, 0, i3, 6);
        S1.k.m0(objArr, objArr2, i3, i3 + 1, objArr.length);
        return objArr2;
    }

    public static final z p(T2.F f3) {
        j.f(f3, "<this>");
        return new z(f3);
    }

    public static T1.h q(T1.h hVar) {
        T1.f fVar = hVar.f4371d;
        fVar.b();
        return fVar.f4363l > 0 ? hVar : T1.h.f4370e;
    }

    public static final q u(q qVar, b0.Q q3) {
        return androidx.compose.ui.graphics.a.b(qVar, 0.0f, 0.0f, q3, true, 124927);
    }

    public static final q v(q qVar) {
        return androidx.compose.ui.graphics.a.b(qVar, 0.0f, 0.0f, null, true, 126975);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0338g w(Y.c cVar, float f3) {
        C0401b c0401b;
        int ceil = ((int) Math.ceil(f3)) * 2;
        C0338g c0338g = c.f6575a;
        C0334c c0334c = c.f6576b;
        C0401b c0401b2 = c.f6577c;
        if (c0338g != null && c0334c != null) {
            Bitmap bitmap = c0338g.f5413a;
            if (ceil <= bitmap.getWidth()) {
            }
        }
        c0338g = M.f(ceil, ceil, 1);
        c.f6575a = c0338g;
        c0334c = M.a(c0338g);
        c.f6576b = c0334c;
        C0338g c0338g2 = c0338g;
        C0334c c0334c2 = c0334c;
        if (c0401b2 == null) {
            c0401b = new C0401b();
            c.f6577c = c0401b;
        } else {
            c0401b = c0401b2;
        }
        O0.k layoutDirection = cVar.f4651d.getLayoutDirection();
        Bitmap bitmap2 = c0338g2.f5413a;
        long e3 = AbstractC0235a.e(bitmap2.getWidth(), bitmap2.getHeight());
        C0400a c0400a = c0401b.f5648d;
        O0.b bVar = c0400a.f5644a;
        O0.k kVar = c0400a.f5645b;
        r rVar = c0400a.f5646c;
        long j3 = c0400a.f5647d;
        c0400a.f5644a = cVar;
        c0400a.f5645b = layoutDirection;
        c0400a.f5646c = c0334c2;
        c0400a.f5647d = e3;
        c0334c2.f();
        C0401b c0401b3 = c0401b;
        c0401b3.F(C0352v.f5434b, 0L, (r17 & 4) != 0 ? InterfaceC0403d.j0(c0401b3.d(), 0L) : c0401b.d(), 1.0f, C0406g.f5653a, null, (r17 & 64) != 0 ? 3 : 0);
        c0401b3.F(M.d(4278190080L), 0L, (r17 & 4) != 0 ? InterfaceC0403d.j0(c0401b3.d(), 0L) : AbstractC0235a.e(f3, f3), 1.0f, C0406g.f5653a, null, (r17 & 64) != 0 ? 3 : 0);
        r0.M(M.d(4278190080L), f3, (r18 & 4) != 0 ? c0401b.y() : c.e(f3, f3), 1.0f, C0406g.f5653a, null, 3);
        c0334c2.a();
        c0400a.f5644a = bVar;
        c0400a.f5645b = kVar;
        c0400a.f5646c = rVar;
        c0400a.f5647d = j3;
        return c0338g2;
    }

    public static final boolean x(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean y(int i3, int i4) {
        return i3 == i4;
    }

    public static String z(List list, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public abstract void M(S0.f fVar, S0.f fVar2);

    public abstract void N(S0.f fVar, Thread thread);

    public abstract void U(C0304H c0304h, C0304H c0304h2, Window window, View view, boolean z3, boolean z4);

    public abstract boolean r(S0.g gVar, S0.c cVar);

    public abstract boolean s(S0.g gVar, Object obj, Object obj2);

    public abstract boolean t(S0.g gVar, S0.f fVar, S0.f fVar2);

    public void o(Window window) {
    }
}
