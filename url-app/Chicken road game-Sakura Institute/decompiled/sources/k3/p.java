package k3;

import M2.J;
import e2.C0559a;
import j3.B;
import j3.x;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1326a;
import y2.AbstractC1327b;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1328c;
import z2.C1439w;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f7464a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7465b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7466c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7467d;

    public p(j3.j configuration, C0559a lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f7467d = lexer;
        this.f7465b = configuration.f7200c;
        this.f7466c = configuration.f7211n;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(p pVar, AbstractC1327b abstractC1327b, E2.a aVar) {
        o frame;
        int i2;
        byte g4;
        LinkedHashMap linkedHashMap;
        C0559a c0559a;
        LinkedHashMap linkedHashMap2;
        p pVar2;
        byte b4;
        pVar.getClass();
        if (aVar instanceof o) {
            frame = (o) aVar;
            int i4 = frame.f7463p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                frame.f7463p = i4 - Integer.MIN_VALUE;
                Object obj = frame.f7461n;
                D2.a aVar2 = D2.a.f2163d;
                i2 = frame.f7463p;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    C0559a c0559a2 = (C0559a) pVar.f7467d;
                    g4 = c0559a2.g((byte) 6);
                    if (c0559a2.y() == 4) {
                        C0559a.o(c0559a2, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = frame.f7460m;
                    linkedHashMap2 = frame.f7459l;
                    pVar2 = frame.f7458k;
                    AbstractC1327b abstractC1327b2 = frame.f7457j;
                    AbstractC1343r.b(obj);
                    linkedHashMap2.put(str, (j3.m) obj);
                    b4 = ((C0559a) pVar2.f7467d).f();
                    if (b4 != 4) {
                        if (b4 != 7) {
                            C0559a.o((C0559a) pVar2.f7467d, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                        C0559a c0559a3 = (C0559a) pVar2.f7467d;
                        if (b4 != 6) {
                            c0559a3.g((byte) 7);
                        } else if (b4 == 4) {
                            if (!pVar2.f7466c) {
                                h.l(c0559a3, "object");
                                throw null;
                            }
                            c0559a3.g((byte) 7);
                        }
                        return new x(linkedHashMap2);
                    }
                    linkedHashMap = linkedHashMap2;
                    abstractC1327b = abstractC1327b2;
                    g4 = b4;
                    pVar = pVar2;
                }
                c0559a = (C0559a) pVar.f7467d;
                if (c0559a.b()) {
                    linkedHashMap2 = linkedHashMap;
                    byte b5 = g4;
                    pVar2 = pVar;
                    b4 = b5;
                    C0559a c0559a32 = (C0559a) pVar2.f7467d;
                    if (b4 != 6) {
                    }
                    return new x(linkedHashMap2);
                }
                String k4 = pVar.f7465b ? c0559a.k() : c0559a.j();
                c0559a.g((byte) 5);
                Unit unit = Unit.f7487a;
                frame.f7457j = abstractC1327b;
                frame.f7458k = pVar;
                frame.f7459l = linkedHashMap;
                frame.f7460m = k4;
                frame.f7463p = 1;
                C1328c c1328c = (C1328c) abstractC1327b;
                c1328c.getClass();
                c1328c.f11663i = frame;
                c1328c.f11662e = unit;
                Intrinsics.checkNotNullParameter(frame, "frame");
                return aVar2;
            }
        }
        frame = new o(pVar, aVar);
        Object obj2 = frame.f7461n;
        D2.a aVar22 = D2.a.f2163d;
        i2 = frame.f7463p;
        if (i2 != 0) {
        }
        c0559a = (C0559a) pVar.f7467d;
        if (c0559a.b()) {
        }
    }

    public m3.h b(SSLSocket sslSocket) {
        m3.h connectionSpec;
        int i2;
        boolean z4;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i4 = this.f7464a;
        List list = (List) this.f7467d;
        int size = list.size();
        while (true) {
            if (i4 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = (m3.h) list.get(i4);
            if (connectionSpec.b(sslSocket)) {
                this.f7464a = i4 + 1;
                break;
            }
            i4++;
        }
        if (connectionSpec == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f7466c);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.c(enabledProtocols);
            String arrays = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i5 = this.f7464a;
        int size2 = list.size();
        while (true) {
            i2 = 0;
            if (i5 >= size2) {
                z4 = false;
                break;
            }
            if (((m3.h) list.get(i5)).b(sslSocket)) {
                z4 = true;
                break;
            }
            i5++;
        }
        this.f7465b = z4;
        boolean z5 = this.f7466c;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] strArr = connectionSpec.f8369c;
        if (strArr != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = n3.b.o(enabledCipherSuites, strArr, m3.f.f8342c);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = connectionSpec.f8370d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = n3.b.o(enabledProtocols2, strArr2, B2.b.b());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        m3.e comparator = m3.f.f8342c;
        byte[] bArr = n3.b.f8558a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (comparator.compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i2++;
        }
        if (z5 && i2 != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String value = supportedCipherSuites[i2];
            Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] copyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) copyOf;
            cipherSuitesIntersection[C1439w.u(cipherSuitesIntersection)] = value;
        }
        Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        m3.g gVar = new m3.g();
        gVar.f8361a = connectionSpec.f8367a;
        gVar.f8362b = strArr;
        gVar.f8363c = strArr2;
        gVar.f8364d = connectionSpec.f8368b;
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        gVar.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        gVar.d((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        m3.h a4 = gVar.a();
        if (a4.c() != null) {
            sslSocket.setEnabledProtocols(a4.f8370d);
        }
        if (a4.a() != null) {
            sslSocket.setEnabledCipherSuites(a4.f8369c);
        }
        return connectionSpec;
    }

    public j3.m c() {
        j3.m xVar;
        Object obj;
        Object g4;
        C0559a c0559a = (C0559a) this.f7467d;
        byte y4 = c0559a.y();
        if (y4 == 1) {
            return e(true);
        }
        if (y4 == 0) {
            return e(false);
        }
        if (y4 != 6) {
            if (y4 == 8) {
                return d();
            }
            C0559a.o(c0559a, "Cannot read Json element because of unexpected ".concat(h.q(y4)), 0, null, 6);
            throw null;
        }
        int i2 = this.f7464a + 1;
        this.f7464a = i2;
        if (i2 == 200) {
            n block = new n(this, null);
            E1.i iVar = new E1.i(block);
            Unit unit = Unit.f7487a;
            D2.a aVar = AbstractC1326a.f11660a;
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            C1328c c1328c = new C1328c(null);
            c1328c.f11661d = block;
            c1328c.f11662e = unit;
            c1328c.f11663i = c1328c;
            D2.a aVar2 = AbstractC1326a.f11660a;
            c1328c.f11664j = aVar2;
            while (true) {
                obj = c1328c.f11664j;
                C2.a completion = c1328c.f11663i;
                if (completion == null) {
                    break;
                }
                AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                if (Intrinsics.a(aVar2, obj)) {
                    try {
                        n nVar = c1328c.f11661d;
                        Unit unit2 = c1328c.f11662e;
                        if (nVar == null) {
                            Intrinsics.checkNotNullParameter(nVar, "<this>");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            CoroutineContext p4 = completion.p();
                            Object dVar = p4 == kotlin.coroutines.i.f7498d ? new D2.d(completion) : new D2.e(completion, p4);
                            J.d(3, nVar);
                            g4 = nVar.g(c1328c, unit2, dVar);
                        } else {
                            J.d(3, nVar);
                            g4 = nVar.g(c1328c, unit2, completion);
                        }
                        if (g4 != D2.a.f2163d) {
                            completion.u(g4);
                        }
                    } catch (Throwable th) {
                        AbstractC1341p.a aVar4 = AbstractC1341p.f11673d;
                        completion.u(AbstractC1343r.a(th));
                    }
                } else {
                    c1328c.f11664j = aVar2;
                    completion.u(obj);
                }
            }
            AbstractC1343r.b(obj);
            xVar = (j3.m) obj;
        } else {
            byte g5 = c0559a.g((byte) 6);
            if (c0559a.y() == 4) {
                C0559a.o(c0559a, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!c0559a.b()) {
                    break;
                }
                String k4 = this.f7465b ? c0559a.k() : c0559a.j();
                c0559a.g((byte) 5);
                linkedHashMap.put(k4, c());
                g5 = c0559a.f();
                if (g5 != 4) {
                    if (g5 != 7) {
                        C0559a.o(c0559a, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (g5 == 6) {
                c0559a.g((byte) 7);
            } else if (g5 == 4) {
                if (!this.f7466c) {
                    h.l(c0559a, "object");
                    throw null;
                }
                c0559a.g((byte) 7);
            }
            xVar = new x(linkedHashMap);
        }
        this.f7464a--;
        return xVar;
    }

    public j3.e d() {
        C0559a c0559a = (C0559a) this.f7467d;
        byte f4 = c0559a.f();
        if (c0559a.y() == 4) {
            C0559a.o(c0559a, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c0559a.b()) {
            arrayList.add(c());
            f4 = c0559a.f();
            if (f4 != 4) {
                boolean z4 = f4 == 9;
                int i2 = c0559a.f6165b;
                if (!z4) {
                    C0559a.o(c0559a, "Expected end of the array or comma", i2, null, 4);
                    throw null;
                }
            }
        }
        if (f4 == 8) {
            c0559a.g((byte) 9);
        } else if (f4 == 4) {
            if (!this.f7466c) {
                h.l(c0559a, "array");
                throw null;
            }
            c0559a.g((byte) 9);
        }
        return new j3.e(arrayList);
    }

    public B e(boolean z4) {
        C0559a c0559a = (C0559a) this.f7467d;
        String k4 = (this.f7465b || !z4) ? c0559a.k() : c0559a.j();
        return (z4 || !Intrinsics.a(k4, "null")) ? new j3.r(k4, z4) : j3.u.INSTANCE;
    }

    public p(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f7467d = connectionSpecs;
    }
}
