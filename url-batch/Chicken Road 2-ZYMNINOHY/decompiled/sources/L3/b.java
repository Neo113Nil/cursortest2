package L3;

import G3.q;
import G3.v;
import G3.w;
import G3.x;
import G3.y;
import G3.z;
import K3.k;
import N3.C0077a;
import T3.o;
import T3.p;
import i2.AbstractC0457a;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b implements q {
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0136 A[Catch: IOException -> 0x00c0, TryCatch #6 {IOException -> 0x00c0, blocks: (B:21:0x00b8, B:29:0x00c3, B:32:0x00e6, B:33:0x0101, B:36:0x0122, B:38:0x0136, B:45:0x014f, B:50:0x0160, B:53:0x017c, B:54:0x0186, B:55:0x0174, B:56:0x0156, B:57:0x0140, B:60:0x0189, B:61:0x018c, B:35:0x0105), top: B:20:0x00b8, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160 A[Catch: IOException -> 0x00c0, TryCatch #6 {IOException -> 0x00c0, blocks: (B:21:0x00b8, B:29:0x00c3, B:32:0x00e6, B:33:0x0101, B:36:0x0122, B:38:0x0136, B:45:0x014f, B:50:0x0160, B:53:0x017c, B:54:0x0186, B:55:0x0174, B:56:0x0156, B:57:0x0140, B:60:0x0189, B:61:0x018c, B:35:0x0105), top: B:20:0x00b8, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156 A[Catch: IOException -> 0x00c0, TryCatch #6 {IOException -> 0x00c0, blocks: (B:21:0x00b8, B:29:0x00c3, B:32:0x00e6, B:33:0x0101, B:36:0x0122, B:38:0x0136, B:45:0x014f, B:50:0x0160, B:53:0x017c, B:54:0x0186, B:55:0x0174, B:56:0x0156, B:57:0x0140, B:60:0x0189, B:61:0x018c, B:35:0x0105), top: B:20:0x00b8, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    @Override // G3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y a(g gVar) {
        x xVar;
        IOException iOException;
        int i4;
        y a3;
        z zVar;
        K3.e eVar = gVar.f1673d;
        i.b(eVar);
        K3.i iVar = eVar.f1545a;
        e eVar2 = eVar.f1547c;
        k kVar = eVar.f1549e;
        v vVar = gVar.f1674e;
        w wVar = vVar.f1015d;
        long currentTimeMillis = System.currentTimeMillis();
        Long l4 = null;
        try {
            try {
                eVar2.h(vVar);
                boolean z = true;
                try {
                    if (!AbstractC0457a.y(vVar.f1013b) || wVar == null) {
                        iVar.f(eVar, true, false, null);
                        xVar = null;
                    } else {
                        if ("100-continue".equalsIgnoreCase(vVar.f1014c.b("Expect"))) {
                            try {
                                eVar2.f();
                                xVar = eVar.b(true);
                            } catch (IOException e4) {
                                eVar.c(e4);
                                throw e4;
                            }
                        } else {
                            xVar = null;
                        }
                        if (xVar == null) {
                            i.b(wVar);
                            long j4 = wVar.f1018a;
                            o oVar = new o(new K3.c(eVar, eVar2.e(vVar, j4), j4));
                            byte[] source = wVar.f1019b;
                            int i5 = wVar.f1018a;
                            i.e(source, "source");
                            if (oVar.f2993c) {
                                throw new IllegalStateException("closed");
                            }
                            oVar.f2992b.u(i5, source);
                            oVar.a();
                            oVar.close();
                        } else {
                            iVar.f(eVar, true, false, null);
                            if (kVar.f1580g == null) {
                                z = false;
                            }
                            if (!z) {
                                eVar2.c().k();
                            }
                        }
                    }
                    try {
                        eVar2.a();
                        iOException = null;
                    } catch (IOException e5) {
                        eVar.c(e5);
                        throw e5;
                    }
                } catch (IOException e6) {
                    e = e6;
                    if (e instanceof C0077a) {
                        throw e;
                    }
                    if (!eVar.f1548d) {
                        throw e;
                    }
                    iOException = e;
                    if (xVar == null) {
                    }
                    xVar.f1020a = vVar;
                    xVar.f1024e = kVar.f1578e;
                    xVar.f1030k = currentTimeMillis;
                    xVar.f1031l = System.currentTimeMillis();
                    y a4 = xVar.a();
                    i4 = a4.f1036d;
                    if (i4 != 100) {
                    }
                    x b4 = eVar.b(false);
                    i.b(b4);
                    b4.f1020a = vVar;
                    b4.f1024e = kVar.f1578e;
                    b4.f1030k = currentTimeMillis;
                    b4.f1031l = System.currentTimeMillis();
                    a4 = b4.a();
                    i4 = a4.f1036d;
                    x b5 = a4.b();
                    y.a(a4, "Content-Type");
                    long g4 = eVar2.g(a4);
                    b5.f1026g = new z(g4, new p(new K3.d(eVar, eVar2.d(a4), g4)), 1);
                    a3 = b5.a();
                    if (!"close".equalsIgnoreCase(a3.f1033a.f1014c.b("Connection"))) {
                    }
                    eVar2.c().k();
                    if (i4 != 204) {
                    }
                    zVar = a3.f1039g;
                    if ((zVar == null ? -1L : zVar.a()) > 0) {
                    }
                    return a3;
                }
            } catch (IOException e7) {
                eVar.c(e7);
                throw e7;
            }
        } catch (IOException e8) {
            e = e8;
            xVar = null;
        }
        if (xVar == null) {
            try {
                xVar = eVar.b(false);
                i.b(xVar);
            } catch (IOException e9) {
                if (iOException == null) {
                    throw e9;
                }
                O3.d.c(iOException, e9);
                throw iOException;
            }
        }
        xVar.f1020a = vVar;
        xVar.f1024e = kVar.f1578e;
        xVar.f1030k = currentTimeMillis;
        xVar.f1031l = System.currentTimeMillis();
        y a42 = xVar.a();
        i4 = a42.f1036d;
        try {
            if (i4 != 100) {
                if (102 <= i4 && i4 < 200) {
                }
                x b52 = a42.b();
                y.a(a42, "Content-Type");
                long g42 = eVar2.g(a42);
                b52.f1026g = new z(g42, new p(new K3.d(eVar, eVar2.d(a42), g42)), 1);
                a3 = b52.a();
                if (!"close".equalsIgnoreCase(a3.f1033a.f1014c.b("Connection")) || "close".equalsIgnoreCase(y.a(a3, "Connection"))) {
                    eVar2.c().k();
                }
                if (i4 != 204 || i4 == 205) {
                    zVar = a3.f1039g;
                    if ((zVar == null ? -1L : zVar.a()) > 0) {
                        StringBuilder sb = new StringBuilder("HTTP ");
                        sb.append(i4);
                        sb.append(" had non-zero Content-Length: ");
                        z zVar2 = a3.f1039g;
                        if (zVar2 != null) {
                            l4 = Long.valueOf(zVar2.a());
                        }
                        sb.append(l4);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return a3;
            }
            y.a(a42, "Content-Type");
            long g422 = eVar2.g(a42);
            b52.f1026g = new z(g422, new p(new K3.d(eVar, eVar2.d(a42), g422)), 1);
            a3 = b52.a();
            if (!"close".equalsIgnoreCase(a3.f1033a.f1014c.b("Connection"))) {
            }
            eVar2.c().k();
            if (i4 != 204) {
            }
            zVar = a3.f1039g;
            if ((zVar == null ? -1L : zVar.a()) > 0) {
            }
            return a3;
        } catch (IOException e10) {
            eVar.c(e10);
            throw e10;
        }
        x b42 = eVar.b(false);
        i.b(b42);
        b42.f1020a = vVar;
        b42.f1024e = kVar.f1578e;
        b42.f1030k = currentTimeMillis;
        b42.f1031l = System.currentTimeMillis();
        a42 = b42.a();
        i4 = a42.f1036d;
        x b522 = a42.b();
    }
}
