package M1;

import B0.C0004a;
import F.A0;
import F.C0067u;
import F.C0073x;
import F.J;
import F.L;
import F.U0;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import I.C0130y;
import I.C0132z;
import I.InterfaceC0088c0;
import I2.l;
import L1.z;
import M1.B;
import N2.C0150f;
import N2.C0153i;
import Z1.i;
import a.AbstractC0157a;
import a0.AbstractC0158a;
import a0.f;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0236v;
import b.H;
import b0.AbstractC0259J;
import b0.C0265P;
import b0.C0278k;
import b0.C0288u;
import d0.C0325f;
import d0.C0326g;
import d0.InterfaceC0323d;
import e1.C0356e;
import e1.C0358g;
import e1.C0362k;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import h0.C0424e;
import h0.C0425f;
import h0.G;
import h1.C0438i;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import r.AbstractC0813j;
import r.C0797I;
import r.C0807d;
import r.C0810g;
import r.InterfaceC0796H;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static C0425f f2784a;

    /* renamed from: b, reason: collision with root package name */
    public static C0425f f2785b;

    public static final String A(long j3) {
        String str;
        if (j3 <= -999500000) {
            str = ((j3 - 500000000) / 1000000000) + " s ";
        } else if (j3 <= -999500) {
            str = ((j3 - 500000) / 1000000) + " ms";
        } else if (j3 <= 0) {
            str = ((j3 - 500) / 1000) + " µs";
        } else if (j3 < 999500) {
            str = ((j3 + 500) / 1000) + " µs";
        } else if (j3 < 999500000) {
            str = ((j3 + 500000) / 1000000) + " ms";
        } else {
            str = ((j3 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static A2.m B(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = u.f2803d;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        A2.f c3 = A2.f.f63b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        A2.B x3 = I2.d.x(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = B2.c.k(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = B2.c.k(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new A2.m(x3, c3, list2, new A2.l(0, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new A2.m(x3, c3, list2, new A2.l(0, list));
    }

    public static final C0425f C() {
        C0425f c0425f = f2784a;
        if (c0425f != null) {
            return c0425f;
        }
        C0424e c0424e = new C0424e("Filled.Bookmark", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i3 = G.f4893a;
        C0265P c0265p = new C0265P(C0288u.f4292b);
        A2.n nVar = new A2.n(2);
        nVar.j(17.0f, 3.0f);
        nVar.f(7.0f);
        nVar.e(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        nVar.h(5.0f, 21.0f);
        nVar.i(7.0f, -3.0f);
        nVar.i(7.0f, 3.0f);
        nVar.l(5.0f);
        nVar.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        nVar.c();
        C0424e.a(c0424e, nVar.f118a, c0265p);
        C0425f b2 = c0424e.b();
        f2784a = b2;
        return b2;
    }

    public static Object D(Object obj, Map map) {
        Z1.i.f(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int E(int i3) {
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
        throw new IllegalArgumentException(AbstractC0080b.h("type needs to be >= FIRST and <= LAST, type=", i3));
    }

    public static final int F(int i3, int i4) {
        return (i3 >> i4) & 31;
    }

    public static P1.d G(P1.d dVar) {
        P1.d intercepted;
        Z1.i.f(dVar, "<this>");
        R1.c cVar = dVar instanceof R1.c ? (R1.c) dVar : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? dVar : intercepted;
    }

    public static final boolean H(a0.e eVar) {
        float b2 = AbstractC0158a.b(eVar.f3499e);
        long j3 = eVar.f3499e;
        if (b2 == AbstractC0158a.c(j3)) {
            float b3 = AbstractC0158a.b(j3);
            long j4 = eVar.f3500f;
            if (b3 == AbstractC0158a.b(j4) && AbstractC0158a.b(j3) == AbstractC0158a.c(j4)) {
                float b4 = AbstractC0158a.b(j3);
                long j5 = eVar.f3501g;
                if (b4 == AbstractC0158a.b(j5) && AbstractC0158a.b(j3) == AbstractC0158a.c(j5)) {
                    float b5 = AbstractC0158a.b(j3);
                    long j6 = eVar.f3502h;
                    if (b5 == AbstractC0158a.b(j6) && AbstractC0158a.b(j3) == AbstractC0158a.c(j6)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int I(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((i3 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static MappedByteBuffer J(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static final void K(HashMap hashMap, L1.j[] jVarArr) {
        for (L1.j jVar : jVarArr) {
            hashMap.put(jVar.f2708d, jVar.f2709e);
        }
    }

    public static final void L(Object[] objArr, int i3, int i4) {
        Z1.i.f(objArr, "<this>");
        while (i3 < i4) {
            objArr[i3] = null;
            i3++;
        }
    }

    public static int M(float f3) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f3);
    }

    public static long N(double d3) {
        if (Double.isNaN(d3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d3);
    }

    public static final void O(String str) {
        throw new IllegalArgumentException(str);
    }

    public static Map P(ArrayList arrayList) {
        v vVar = v.f2804d;
        int size = arrayList.size();
        if (size == 0) {
            return vVar;
        }
        if (size == 1) {
            L1.j jVar = (L1.j) arrayList.get(0);
            Z1.i.f(jVar, "pair");
            Map singletonMap = Collections.singletonMap(jVar.f2708d, jVar.f2709e);
            Z1.i.e(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(I(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            L1.j jVar2 = (L1.j) it.next();
            linkedHashMap.put(jVar2.f2708d, jVar2.f2709e);
        }
        return linkedHashMap;
    }

    public static Map Q(Map map) {
        Z1.i.f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return v.f2804d;
        }
        if (size != 1) {
            return R(map);
        }
        Z1.i.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        Z1.i.e(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap R(Map map) {
        Z1.i.f(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static Object S(Y1.e eVar, Object obj, P1.d dVar) {
        Z1.i.f(eVar, "<this>");
        P1.i context = dVar.getContext();
        Object dVar2 = context == P1.j.f3073d ? new Q1.d(dVar) : new Q1.e(dVar, context);
        Z1.w.d(2, eVar);
        return eVar.g(obj, dVar2);
    }

    public static final long a(float f3, float f4) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        int i3 = AbstractC0158a.f3484b;
        return floatToRawIntBits;
    }

    public static final void b(final com.gates.olympus.miruv.data.b bVar, final boolean z3, final Y1.a aVar, final Y1.a aVar2, C0113p c0113p, final int i3) {
        int i4;
        U.l g3;
        c0113p.S(-2116622435);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(bVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.g(z3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(aVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0113p.h(aVar2) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0113p.x()) {
            c0113p.L();
        } else {
            C0067u f3 = A0.f(((J) c0113p.k(L.f1045a)).p, c0113p);
            C0073x g4 = A0.g(1, 62);
            g3 = androidx.compose.foundation.layout.a.g(U.i.f3302a, 1.0f);
            A0.c(aVar, g3, false, null, f3, g4, null, null, Q.f.b(1805584338, new H1.h(aVar2, bVar, z3), c0113p), c0113p, ((i4 >> 6) & 14) | 100663344, 204);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new Y1.e() { // from class: H1.n
                @Override // Y1.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    B.b(com.gates.olympus.miruv.data.b.this, z3, aVar, aVar2, (C0113p) obj, C0089d.T(i3 | 1));
                    return z.f2729a;
                }
            };
        }
    }

    public static final void c(final com.gates.olympus.miruv.data.f fVar, final U.l lVar, long j3, long j4, long j5, C0113p c0113p, final int i3) {
        int i4;
        final long j6;
        final long j7;
        final long j8;
        Z1.i.f(fVar, "shape");
        c0113p.S(-805622886);
        if ((i3 & 6) == 0) {
            i4 = i3 | (c0113p.f(fVar) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(lVar) ? 32 : 16;
        }
        int i5 = i4 | 28032;
        if ((i5 & 9363) == 9362 && c0113p.x()) {
            c0113p.L();
            j6 = j3;
            j7 = j4;
            j8 = j5;
        } else {
            final long j9 = K1.b.f2662a;
            final long j10 = K1.b.f2663b;
            final long j11 = K1.b.f2664c;
            c0113p.Q(572708128);
            boolean z3 = ((i5 & 14) == 4) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048) | ((57344 & i5) == 16384);
            Object G3 = c0113p.G();
            if (z3 || G3 == C0105l.f2272a) {
                Y1.c cVar = new Y1.c() { // from class: F1.a
                    @Override // Y1.c
                    public final Object j(Object obj) {
                        float f3;
                        long j12;
                        C0326g c0326g;
                        float f4;
                        float f5;
                        float f6;
                        float f7;
                        float f8;
                        InterfaceC0323d interfaceC0323d = (InterfaceC0323d) obj;
                        i.f(interfaceC0323d, "$this$Canvas");
                        float c3 = f.c(interfaceC0323d.c());
                        float f9 = 0.14f * c3;
                        float f10 = c3 - (2 * f9);
                        a0.d f11 = AbstractC0157a.f(l.f(f9, f9), I2.d.h(f10, f10));
                        float c4 = f11.c();
                        float b2 = f11.b();
                        float f12 = b2 * 0.03f;
                        C0326g c0326g2 = new C0326g(f12, 0.0f, 0, 0, 30);
                        int i6 = c.f1480a[com.gates.olympus.miruv.data.f.this.ordinal()];
                        long j13 = j9;
                        long j14 = j10;
                        long j15 = j11;
                        float f13 = f11.f3491a;
                        float f14 = f11.f3492b;
                        switch (i6) {
                            case 1:
                                f3 = f14;
                                j12 = j13;
                                c0326g = c0326g2;
                                f4 = f13;
                                f5 = b2;
                                float f15 = f5 / 2.0f;
                                float f16 = f3 + f15;
                                f6 = c4;
                                InterfaceC0323d.s(interfaceC0323d, j12, l.f(f4, f3), I2.d.h(f6, f15), null, 120);
                                C0278k g3 = AbstractC0259J.g();
                                g3.f((f6 * 0.3f) + f4, f16);
                                float f17 = f3 + f5;
                                g3.e((f6 * 0.42f) + f4, f17);
                                g3.e((f6 * 0.58f) + f4, f17);
                                g3.e((0.7f * f6) + f4, f16);
                                g3.c();
                                interfaceC0323d.M(g3, j14, 1.0f, C0325f.f4448b, null, 3);
                                InterfaceC0323d.s(interfaceC0323d, j15, l.f(f4, f16 - (f5 * 0.02f)), I2.d.h(f6, f5 * 0.04f), null, 120);
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                                f3 = f14;
                                j12 = j13;
                                f7 = c4;
                                c0326g = c0326g2;
                                f4 = f13;
                                f5 = b2;
                                long j16 = j14;
                                float f18 = f7 / 4;
                                int i7 = 0;
                                for (int i8 = 4; i7 < i8; i8 = 4) {
                                    int i9 = i7 % 2;
                                    long j17 = i9 == 0 ? j12 : j16;
                                    float f19 = (i7 * f18) + f4;
                                    float f20 = f5 / 2.0f;
                                    int i10 = i7;
                                    long j18 = j16;
                                    float f21 = f18;
                                    InterfaceC0323d.s(interfaceC0323d, j17, l.f(f19, f3), I2.d.h(f18, f20), null, 120);
                                    InterfaceC0323d.s(interfaceC0323d, i9 == 0 ? j18 : j12, l.f(f19, f3 + f20), I2.d.h(f21, f20), null, 120);
                                    i7 = i10 + 1;
                                    f18 = f21;
                                    j16 = j18;
                                }
                                f6 = f7;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                                f3 = f14;
                                j12 = j13;
                                f7 = c4;
                                c0326g = c0326g2;
                                f4 = f13;
                                f5 = b2;
                                float f22 = f7 * 0.5f;
                                InterfaceC0323d.s(interfaceC0323d, j12, l.f(f4, f3), I2.d.h(f22, f5), null, 120);
                                float f23 = f5 * 0.4f;
                                InterfaceC0323d.s(interfaceC0323d, j15, l.f((f7 * 0.16f) + f4, (f5 * 0.3f) + f3), I2.d.h(0.18f * f7, f23), null, 120);
                                InterfaceC0323d.s(interfaceC0323d, j14, l.f(f4 + f22, (f5 * 0.34f) + f3), I2.d.h(f22, f5 * 0.32f), null, 120);
                                InterfaceC0323d.s(interfaceC0323d, j14, l.f((f7 * 0.34f) + f4, f3 + f23), I2.d.h(f7 * 0.2f, f5 * 0.2f), null, 120);
                                f6 = f7;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                                f3 = f14;
                                j12 = j13;
                                f7 = c4;
                                c0326g = c0326g2;
                                f4 = f13;
                                f5 = b2;
                                C0278k g4 = AbstractC0259J.g();
                                g4.f(f4, f3);
                                float f24 = f4 + f7;
                                g4.e(f24, f3);
                                float f25 = (f7 * 0.5f) + f4;
                                float f26 = (f5 * 0.5f) + f3;
                                g4.e(f25, f26);
                                g4.c();
                                interfaceC0323d.M(g4, j12, 1.0f, C0325f.f4448b, null, 3);
                                C0278k g5 = AbstractC0259J.g();
                                float f27 = f3 + f5;
                                g5.f(f4, f27);
                                g5.e(f24, f27);
                                g5.e(f25, f26);
                                g5.c();
                                interfaceC0323d.M(g5, j14, 1.0f, C0325f.f4448b, null, 3);
                                interfaceC0323d.V(j15, l.f(f4, f3), l.f(f24, f27), f12, (r22 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
                                f6 = f7;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case 5:
                                f3 = f14;
                                j12 = j13;
                                f7 = c4;
                                c0326g = c0326g2;
                                f4 = f13;
                                f5 = b2;
                                float f28 = f7 * 0.62f;
                                float f29 = f5 * 0.35f;
                                InterfaceC0323d.s(interfaceC0323d, j12, l.f(f4, (f5 * 0.15f) + f3), I2.d.h(f28, f29), null, 120);
                                float f30 = (f7 * 0.38f) + f4;
                                InterfaceC0323d.s(interfaceC0323d, j14, l.f(f30, (f5 * 0.5f) + f3), I2.d.h(f28, f29), null, 120);
                                InterfaceC0323d.s(interfaceC0323d, j15, l.f(f30, (f5 * 0.47f) + f3), I2.d.h(f7 * 0.24f, f5 * 0.06f), null, 120);
                                f6 = f7;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case 6:
                                f3 = f14;
                                j12 = j13;
                                f7 = c4;
                                c0326g = c0326g2;
                                f4 = f13;
                                f5 = b2;
                                float f31 = f7 * 0.46f;
                                InterfaceC0323d.s(interfaceC0323d, j12, l.f(f4, f3), I2.d.h(f31, f5), null, 120);
                                InterfaceC0323d.s(interfaceC0323d, j14, l.f((f7 * 0.54f) + f4, f3), I2.d.h(f31, f5), null, 120);
                                float f32 = f5 * 0.07f;
                                float f33 = (f7 * 0.5f) + f4;
                                interfaceC0323d.h0(j15, f32, (r18 & 4) != 0 ? interfaceC0323d.w() : l.f(f33, (f5 * 0.32f) + f3), 1.0f, C0325f.f4448b, null, 3);
                                interfaceC0323d.h0(j15, f32, (r18 & 4) != 0 ? interfaceC0323d.w() : l.f(f33, (f5 * 0.68f) + f3), 1.0f, C0325f.f4448b, null, 3);
                                f6 = f7;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                                f3 = f14;
                                j12 = j13;
                                f7 = c4;
                                f5 = b2;
                                c0326g = c0326g2;
                                float f34 = (f5 * 0.25f) + f3;
                                f4 = f13;
                                float f35 = f7 * 0.5f;
                                float f36 = f5 * 0.5f;
                                InterfaceC0323d.s(interfaceC0323d, j12, l.f(f4, f34), I2.d.h(f35, f36), null, 120);
                                float f37 = f4 + f35;
                                InterfaceC0323d.s(interfaceC0323d, j14, l.f(f37, f34), I2.d.h(f35, f36), null, 120);
                                interfaceC0323d.V(j15, l.f(f37, (f5 * 0.2f) + f3), l.f(f37, (0.8f * f5) + f3), f12, (r22 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
                                f6 = f7;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case 8:
                                f3 = f14;
                                j12 = j13;
                                c0326g = c0326g2;
                                f5 = b2;
                                float f38 = (c4 * 0.2f) + f13;
                                float f39 = c4 * 0.24f;
                                InterfaceC0323d.s(interfaceC0323d, j12, l.f(f38, f3), I2.d.h(f39, f5), null, 120);
                                float f40 = (f5 * 0.4f) + f3;
                                float f41 = f5 * 0.2f;
                                InterfaceC0323d.s(interfaceC0323d, j14, l.f((0.44f * c4) + f13, f40), I2.d.h(0.56f * c4, f41), null, 120);
                                InterfaceC0323d.s(interfaceC0323d, j15, l.f(f38, f40), I2.d.h(f39, f41), null, 120);
                                f6 = c4;
                                f4 = f13;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case AbstractC0382a.f4777a /* 9 */:
                                f3 = f14;
                                j12 = j13;
                                c0326g = c0326g2;
                                f8 = f13;
                                f5 = b2;
                                C0278k g6 = AbstractC0259J.g();
                                g6.f(f8, f3);
                                float f42 = (0.6f * c4) + f8;
                                g6.e(f42, f3);
                                float f43 = f5 * 0.5f;
                                float f44 = f3 + f43;
                                g6.e(f42, f44);
                                float f45 = f8 + c4;
                                g6.e(f45, f44);
                                float f46 = f3 + f5;
                                g6.e(f45, f46);
                                g6.e(f8, f46);
                                g6.c();
                                interfaceC0323d.M(g6, j12, 1.0f, C0325f.f4448b, null, 3);
                                InterfaceC0323d.s(interfaceC0323d, j14, l.f(f42, f3), I2.d.h(c4 * 0.4f, f43), null, 120);
                                InterfaceC0323d.s(interfaceC0323d, j15, l.f(f42, f3), I2.d.h(0.03f * c4, f43), null, 120);
                                float f47 = f8;
                                f6 = c4;
                                f4 = f47;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case AbstractC0382a.f4779c /* 10 */:
                                f3 = f14;
                                j12 = j13;
                                c0326g = c0326g2;
                                f8 = f13;
                                float f48 = c4 * 0.42f;
                                f5 = b2;
                                InterfaceC0323d.s(interfaceC0323d, j12, l.f(f8, f3), I2.d.h(f48, f5), null, 120);
                                InterfaceC0323d.s(interfaceC0323d, j15, l.f(f8 + f48, (f5 * 0.42f) + f3), I2.d.h(c4 * 0.16f, f5 * 0.16f), null, 120);
                                float f49 = (0.58f * c4) + f8;
                                InterfaceC0323d.s(interfaceC0323d, j14, l.f(f49, f3), I2.d.h(f48, f5), null, 120);
                                InterfaceC0323d.s(interfaceC0323d, j12, l.f(f49, (f5 * 0.4f) + f3), I2.d.h(c4 * 0.1f, f5 * 0.2f), null, 120);
                                float f472 = f8;
                                f6 = c4;
                                f4 = f472;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case 11:
                                f3 = f14;
                                c0326g = c0326g2;
                                f8 = f13;
                                float f50 = c4 * 0.5f;
                                j12 = j13;
                                InterfaceC0323d.s(interfaceC0323d, j13, l.f(f8, f3), I2.d.h(f50, b2), null, 120);
                                float f51 = (0.36f * b2) + f3;
                                float f52 = b2 * 0.28f;
                                InterfaceC0323d.s(interfaceC0323d, j14, l.f(f8, f51), I2.d.h(f50, f52), null, 120);
                                InterfaceC0323d.s(interfaceC0323d, j14, l.f(f8 + f50, f51), I2.d.h(f50, f52), null, 120);
                                f5 = b2;
                                float f4722 = f8;
                                f6 = c4;
                                f4 = f4722;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case 12:
                                f3 = f14;
                                j12 = j13;
                                c0326g = c0326g2;
                                f8 = f13;
                                C0278k g7 = AbstractC0259J.g();
                                g7.f(f8, (0.2f * b2) + f3);
                                float f53 = f8 + c4;
                                float f54 = (0.5f * b2) + f3;
                                g7.e(f53, f54);
                                float f55 = (0.66f * b2) + f3;
                                g7.e(f53, f55);
                                g7.e(f8, (0.36f * b2) + f3);
                                g7.c();
                                interfaceC0323d.M(g7, j12, 1.0f, C0325f.f4448b, null, 3);
                                C0278k g8 = AbstractC0259J.g();
                                g8.f(f8, f54);
                                g8.e(f53, (0.3f * b2) + f3);
                                g8.e(f53, (0.46f * b2) + f3);
                                g8.e(f8, f55);
                                g8.c();
                                interfaceC0323d.M(g8, j14, 1.0f, C0325f.f4448b, null, 3);
                                f5 = b2;
                                float f47222 = f8;
                                f6 = c4;
                                f4 = f47222;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case 13:
                                f3 = f14;
                                j12 = j13;
                                c0326g = c0326g2;
                                f8 = f13;
                                float f56 = b2 * 0.55f;
                                InterfaceC0323d.s(interfaceC0323d, j12, l.f(f8, f3 + f56), I2.d.h(c4, 0.35f * b2), null, 120);
                                InterfaceC0323d.s(interfaceC0323d, j14, l.f((0.3f * c4) + f8, f3), I2.d.h(c4 * 0.4f, f56), null, 120);
                                interfaceC0323d.V(j15, l.f((0.42f * c4) + f8, (0.1f * b2) + f3), l.f((0.62f * c4) + f8, (0.78f * b2) + f3), b2 * 0.05f, (r22 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
                                f5 = b2;
                                float f472222 = f8;
                                f6 = c4;
                                f4 = f472222;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            case 14:
                                float f57 = c4 * 0.46f;
                                f3 = f14;
                                j12 = j13;
                                InterfaceC0323d.s(interfaceC0323d, j13, l.f(f13, f14), I2.d.h(f57, b2), null, 120);
                                InterfaceC0323d.s(interfaceC0323d, j14, l.f((0.54f * c4) + f13, f3), I2.d.h(f57, b2), null, 120);
                                c0326g = c0326g2;
                                f8 = f13;
                                interfaceC0323d.g(j15, l.f((0.4f * c4) + f13, (0.38f * b2) + f3), I2.d.h(c4 * 0.2f, b2 * 0.24f), 1.0f, C0325f.f4448b, null, 3);
                                f5 = b2;
                                float f4722222 = f8;
                                f6 = c4;
                                f4 = f4722222;
                                InterfaceC0323d.s(interfaceC0323d, C0288u.b(j12, 0.0f), l.f(f4, f3), I2.d.h(f6, f5), c0326g, 104);
                                return z.f2729a;
                            default:
                                throw new L1.f();
                        }
                    }
                };
                c0113p.a0(cVar);
                G3 = cVar;
            }
            c0113p.p(false);
            g2.i.B(lVar, (Y1.c) G3, c0113p, (i5 >> 3) & 14);
            j6 = j9;
            j7 = j10;
            j8 = j11;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new Y1.e() { // from class: F1.b
                @Override // Y1.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int T2 = C0089d.T(i3 | 1);
                    long j12 = j7;
                    long j13 = j8;
                    B.c(com.gates.olympus.miruv.data.f.this, lVar, j6, j12, j13, (C0113p) obj, T2);
                    return z.f2729a;
                }
            };
        }
    }

    public static final void d(H1.y yVar, Y1.c cVar, InterfaceC0796H interfaceC0796H, C0113p c0113p, int i3) {
        int i4;
        Z1.i.f(cVar, "onOpenJoint");
        Z1.i.f(interfaceC0796H, "contentPadding");
        c0113p.S(-2078021787);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(yVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(cVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.f(interfaceC0796H) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            InterfaceC0088c0 u3 = AbstractC0381e.u(yVar.f1920d, c0113p);
            float f3 = 16;
            C0797I c0797i = new C0797I(f3, interfaceC0796H.d() + 8, f3, interfaceC0796H.c() + f3);
            C0807d c0807d = AbstractC0813j.f7061a;
            C0810g c0810g = new C0810g(12);
            c0113p.Q(1866325284);
            boolean f4 = ((i4 & 112) == 32) | c0113p.f(u3) | c0113p.h(yVar);
            Object G3 = c0113p.G();
            if (f4 || G3 == C0105l.f2272a) {
                G3 = new H1.m(u3, yVar, cVar);
                c0113p.a0(G3);
            }
            c0113p.p(false);
            AbstractC0381e.c(null, null, c0797i, false, c0810g, null, null, false, (Y1.c) G3, c0113p, 24576);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new H1.d(yVar, cVar, interfaceC0796H, i3);
        }
    }

    public static C0004a e(String str, B0.C c3, long j3, M0.c cVar, F0.e eVar, int i3) {
        u uVar = u.f2803d;
        return new C0004a(new I0.d(str, c3, uVar, uVar, eVar, cVar), i3, false, j3);
    }

    public static final void f(boolean z3, Y1.e eVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-642000585);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.g(z3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(eVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            InterfaceC0088c0 M3 = C0089d.M(eVar, c0113p);
            c0113p.R(-723524056);
            c0113p.R(-3687241);
            Object G3 = c0113p.G();
            Object obj = C0105l.f2272a;
            if (G3 == obj) {
                Object c0130y = new C0130y(C0089d.z(c0113p));
                c0113p.a0(c0130y);
                G3 = c0130y;
            }
            c0113p.p(false);
            p2.c cVar = ((C0130y) G3).f2402d;
            c0113p.p(false);
            c0113p.R(-1071578902);
            Object G4 = c0113p.G();
            Object obj2 = G4;
            if (G4 == obj) {
                Y1.e eVar2 = (Y1.e) M3.getValue();
                c.f fVar = new c.f(z3);
                fVar.f4331d = cVar;
                fVar.f4332e = eVar2;
                c0113p.a0(fVar);
                obj2 = fVar;
            }
            c.f fVar2 = (c.f) obj2;
            c0113p.p(false);
            Object obj3 = (Y1.e) M3.getValue();
            c0113p.R(-1071578713);
            boolean f3 = c0113p.f(obj3) | c0113p.f(cVar);
            Object G5 = c0113p.G();
            if (f3 || G5 == obj) {
                fVar2.f4332e = (Y1.e) M3.getValue();
                fVar2.f4331d = cVar;
                c0113p.a0(L1.z.f2729a);
            }
            c0113p.p(false);
            Boolean valueOf = Boolean.valueOf(z3);
            c0113p.R(-1071578541);
            boolean f4 = c0113p.f(fVar2) | c0113p.g(z3);
            Object G6 = c0113p.G();
            Object obj4 = null;
            if (f4 || G6 == obj) {
                G6 = new c.g(fVar2, z3, null);
                c0113p.a0(G6);
            }
            c0113p.p(false);
            C0089d.e(c0113p, (Y1.e) G6, valueOf);
            C0132z c0132z = c.c.f4323a;
            c0113p.R(-2068013981);
            b.G g3 = (b.G) c0113p.k(c.c.f4323a);
            c0113p.R(1680121597);
            if (g3 == null) {
                View view = (View) c0113p.k(AndroidCompositionLocals_androidKt.f3742f);
                Z1.i.f(view, "<this>");
                g3 = (b.G) g2.h.b0(g2.h.d0(g2.h.c0(view, H.f4140g), H.f4141h));
            }
            c0113p.p(false);
            if (g3 == null) {
                Context context = (Context) c0113p.k(AndroidCompositionLocals_androidKt.f3738b);
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof b.G) {
                        obj4 = context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                g3 = (b.G) obj4;
            }
            c0113p.p(false);
            if (g3 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            Object b2 = g3.b();
            Object obj5 = (InterfaceC0236v) c0113p.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            c0113p.R(-1071578150);
            boolean f5 = c0113p.f(b2) | c0113p.f(obj5) | c0113p.f(fVar2);
            Object G7 = c0113p.G();
            if (f5 || G7 == obj) {
                G7 = new R.h(b2, obj5, fVar2, 3);
                c0113p.a0(G7);
            }
            c0113p.p(false);
            C0089d.d(obj5, b2, (Y1.c) G7, c0113p);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new c.h(z3, eVar, i3);
        }
    }

    public static final void g(com.gates.olympus.miruv.data.b bVar, Y1.a aVar, Y1.a aVar2, C0113p c0113p, int i3) {
        int i4;
        U.l g3;
        int i5;
        c0113p.S(1393864236);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(bVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(aVar2) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0113p.x()) {
            c0113p.L();
            i5 = i3;
        } else {
            C0067u f3 = A0.f(((J) c0113p.k(L.f1045a)).p, c0113p);
            g3 = androidx.compose.foundation.layout.a.g(U.i.f3302a, 1.0f);
            i5 = i3;
            A0.c(aVar, g3, false, null, f3, null, null, null, Q.f.b(897490199, new E1.d(aVar2, 1, bVar), c0113p), c0113p, ((i4 >> 3) & 14) | 100663344, 236);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new H1.d(bVar, aVar, aVar2, i5);
        }
    }

    public static final void h(J1.k kVar, Y1.c cVar, InterfaceC0796H interfaceC0796H, C0113p c0113p, int i3) {
        int i4;
        Z1.i.f(cVar, "onOpenJoint");
        Z1.i.f(interfaceC0796H, "contentPadding");
        c0113p.S(-1452872091);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(kVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(cVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.f(interfaceC0796H) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            InterfaceC0088c0 u3 = AbstractC0381e.u(kVar.f2615d, c0113p);
            float f3 = 16;
            C0797I c0797i = new C0797I(f3, interfaceC0796H.d() + 8, f3, interfaceC0796H.c() + f3);
            C0807d c0807d = AbstractC0813j.f7061a;
            C0810g c0810g = new C0810g(12);
            c0113p.Q(1027639821);
            boolean f4 = ((i4 & 112) == 32) | c0113p.f(u3) | c0113p.h(kVar);
            Object G3 = c0113p.G();
            if (f4 || G3 == C0105l.f2272a) {
                G3 = new H1.m(u3, cVar, kVar);
                c0113p.a0(G3);
            }
            c0113p.p(false);
            AbstractC0381e.c(null, null, c0797i, false, c0810g, null, null, false, (Y1.c) G3, c0113p, 24576);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new H1.d(kVar, cVar, interfaceC0796H, i3, 2);
        }
    }

    public static final void i(final String str, final String str2, final String str3, final U.l lVar, C0113p c0113p, final int i3) {
        int i4;
        c0113p.S(1918019435);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(str2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.f(str3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0113p.f(lVar) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0113p.x()) {
            c0113p.L();
        } else {
            U0.a(lVar, x.e.a(16), ((J) c0113p.k(L.f1045a)).f994c, 0L, 0.0f, 0.0f, null, Q.f.b(-1745738512, new B1.d(str, str2, str3, 2), c0113p), c0113p, ((i4 >> 9) & 14) | 12582912, 120);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new Y1.e() { // from class: J1.e
                @Override // Y1.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int T2 = C0089d.T(i3 | 1);
                    String str4 = str;
                    String str5 = str3;
                    U.l lVar2 = lVar;
                    B.i(str4, str2, str5, lVar2, (C0113p) obj, T2);
                    return z.f2729a;
                }
            };
        }
    }

    public static final long j(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final void k(D2.a aVar, D2.c cVar, String str) {
        D2.e.f601i.fine(cVar.f593b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f586a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(List list, C0362k c0362k, R1.c cVar) {
        C0356e c0356e;
        int i3;
        List list2;
        Z1.t tVar;
        Iterator it;
        Throwable th;
        if (cVar instanceof C0356e) {
            c0356e = (C0356e) cVar;
            int i4 = c0356e.f4692g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0356e.f4692g = i4 - Integer.MIN_VALUE;
                Object obj = c0356e.f4691f;
                Object obj2 = Q1.a.f3113d;
                i3 = c0356e.f4692g;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    ArrayList arrayList = new ArrayList();
                    C0358g c0358g = new C0358g(list, arrayList, null);
                    c0356e.f4689d = arrayList;
                    c0356e.f4692g = 1;
                    if (c0362k.a(c0358g, c0356e) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0356e.f4690e;
                        tVar = (Z1.t) c0356e.f4689d;
                        try {
                            I2.l.Q(obj);
                        } catch (Throwable th2) {
                            Object obj3 = tVar.f3480d;
                            if (obj3 == null) {
                                tVar.f3480d = th2;
                            } else {
                                o((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            Y1.c cVar2 = (Y1.c) it.next();
                            c0356e.f4689d = tVar;
                            c0356e.f4690e = it;
                            c0356e.f4692g = 2;
                            if (cVar2.j(c0356e) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) tVar.f3480d;
                        if (th == null) {
                            return L1.z.f2729a;
                        }
                        throw th;
                    }
                    list2 = (List) c0356e.f4689d;
                    I2.l.Q(obj);
                }
                tVar = new Z1.t();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) tVar.f3480d;
                if (th == null) {
                }
            }
        }
        c0356e = new C0356e(cVar);
        Object obj4 = c0356e.f4691f;
        Object obj22 = Q1.a.f3113d;
        i3 = c0356e.f4692g;
        if (i3 != 0) {
        }
        tVar = new Z1.t();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) tVar.f3480d;
        if (th == null) {
        }
    }

    public static final boolean m(Object[] objArr, int i3, int i4, List list) {
        if (i4 != list.size()) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!Z1.i.a(objArr[i3 + i5], list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    public static final String n(Object[] objArr, int i3, int i4, f fVar) {
        StringBuilder sb = new StringBuilder((i4 * 3) + 2);
        sb.append("[");
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i3 + i5];
            if (obj == fVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        Z1.i.e(sb2, "toString(...)");
        return sb2;
    }

    public static void o(Throwable th, Throwable th2) {
        Z1.i.f(th, "<this>");
        Z1.i.f(th2, "exception");
        if (th != th2) {
            Integer num = U1.a.f3340a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = T1.a.f3279a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void p(long j3, C0150f c0150f, int i3, ArrayList arrayList, int i4, int i5, ArrayList arrayList2) {
        int i6;
        int i7;
        int i8;
        int i9;
        C0150f c0150f2;
        int i10 = i3;
        if (i4 >= i5) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i11 = i4; i11 < i5; i11++) {
            if (((C0153i) arrayList.get(i11)).b() < i10) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0153i c0153i = (C0153i) arrayList.get(i4);
        C0153i c0153i2 = (C0153i) arrayList.get(i5 - 1);
        int i12 = -1;
        if (i10 == c0153i.b()) {
            int intValue = ((Number) arrayList2.get(i4)).intValue();
            int i13 = i4 + 1;
            C0153i c0153i3 = (C0153i) arrayList.get(i13);
            i6 = i13;
            i7 = intValue;
            c0153i = c0153i3;
        } else {
            i6 = i4;
            i7 = -1;
        }
        if (c0153i.g(i10) == c0153i2.g(i10)) {
            int min = Math.min(c0153i.b(), c0153i2.b());
            int i14 = 0;
            for (int i15 = i10; i15 < min && c0153i.g(i15) == c0153i2.g(i15); i15++) {
                i14++;
            }
            long j4 = 4;
            long j5 = (c0150f.f2929e / j4) + j3 + 2 + i14 + 1;
            c0150f.S(-i14);
            c0150f.S(i7);
            int i16 = i14 + i10;
            while (i10 < i16) {
                c0150f.S(c0153i.g(i10) & 255);
                i10++;
            }
            if (i6 + 1 == i5) {
                if (i16 != ((C0153i) arrayList.get(i6)).b()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0150f.S(((Number) arrayList2.get(i6)).intValue());
                return;
            } else {
                C0150f c0150f3 = new C0150f();
                c0150f.S(((int) ((c0150f3.f2929e / j4) + j5)) * (-1));
                p(j5, c0150f3, i16, arrayList, i6, i5, arrayList2);
                c0150f.P(c0150f3);
                return;
            }
        }
        int i17 = 1;
        for (int i18 = i6 + 1; i18 < i5; i18++) {
            if (((C0153i) arrayList.get(i18 - 1)).g(i10) != ((C0153i) arrayList.get(i18)).g(i10)) {
                i17++;
            }
        }
        long j6 = 4;
        long j7 = (c0150f.f2929e / j6) + j3 + 2 + (i17 * 2);
        c0150f.S(i17);
        c0150f.S(i7);
        for (int i19 = i6; i19 < i5; i19++) {
            int g3 = ((C0153i) arrayList.get(i19)).g(i10);
            if (i19 == i6 || g3 != ((C0153i) arrayList.get(i19 - 1)).g(i10)) {
                c0150f.S(g3 & 255);
            }
        }
        C0150f c0150f4 = new C0150f();
        int i20 = i6;
        while (i20 < i5) {
            byte g4 = ((C0153i) arrayList.get(i20)).g(i10);
            int i21 = i20 + 1;
            int i22 = i21;
            while (true) {
                if (i22 >= i5) {
                    i8 = i5;
                    break;
                } else {
                    if (g4 != ((C0153i) arrayList.get(i22)).g(i10)) {
                        i8 = i22;
                        break;
                    }
                    i22++;
                }
            }
            if (i21 == i8 && i10 + 1 == ((C0153i) arrayList.get(i20)).b()) {
                c0150f.S(((Number) arrayList2.get(i20)).intValue());
                i9 = i8;
                c0150f2 = c0150f4;
            } else {
                c0150f.S(((int) ((c0150f4.f2929e / j6) + j7)) * i12);
                i9 = i8;
                c0150f2 = c0150f4;
                p(j7, c0150f4, i10 + 1, arrayList, i20, i8, arrayList2);
            }
            c0150f4 = c0150f2;
            i20 = i9;
            i12 = -1;
        }
        c0150f.P(c0150f4);
    }

    public static final void q(int i3, int i4) {
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
        }
    }

    public static final void r(int i3, int i4) {
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
        }
    }

    public static final void s(int i3, int i4, int i5) {
        if (i3 >= 0 && i4 <= i5) {
            if (i3 > i4) {
                throw new IllegalArgumentException(AbstractC0080b.g(i3, i4, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
    }

    public static void t(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean u(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    t(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            t(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            t(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static Handler v(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return X0.c.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e5) {
            e = e5;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static P1.d w(P1.d dVar, P1.d dVar2, Y1.e eVar) {
        Z1.i.f(eVar, "<this>");
        if (eVar instanceof R1.a) {
            return ((R1.a) eVar).create(dVar, dVar2);
        }
        P1.i context = dVar2.getContext();
        return context == P1.j.f3073d ? new Q1.b(dVar2, dVar, eVar) : new Q1.c(dVar2, context, eVar, dVar);
    }

    public static final S1.b x(Enum[] enumArr) {
        Z1.i.f(enumArr, "entries");
        return new S1.b(enumArr);
    }

    public static final boolean y(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean z(int i3, int i4) {
        return i3 == i4;
    }
}
