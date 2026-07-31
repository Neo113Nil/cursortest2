package E2;

import D2.A;
import D2.t;
import D2.w;
import R1.y;
import f2.x;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f1066a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1067b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1068c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1069d;

    public l(D2.i iVar, o oVar) {
        this.f1069d = oVar;
        this.f1067b = iVar.f881c;
        this.f1068c = iVar.f892n;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l lVar, R1.b bVar, X1.a aVar) {
        k kVar;
        int i3;
        byte f3;
        LinkedHashMap linkedHashMap;
        o oVar;
        LinkedHashMap linkedHashMap2;
        l lVar2;
        byte b3;
        lVar.getClass();
        if (aVar instanceof k) {
            kVar = (k) aVar;
            int i4 = kVar.f1065m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kVar.f1065m = i4 - Integer.MIN_VALUE;
                Object obj = kVar.f1063k;
                W1.a aVar2 = W1.a.f4608d;
                i3 = kVar.f1065m;
                if (i3 != 0) {
                    R1.a.e(obj);
                    o oVar2 = (o) lVar.f1069d;
                    f3 = oVar2.f((byte) 6);
                    if (oVar2.r() == 4) {
                        o.n(oVar2, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = kVar.f1062j;
                    linkedHashMap2 = kVar.f1061i;
                    lVar2 = kVar.f1060h;
                    R1.b bVar2 = kVar.f1059g;
                    R1.a.e(obj);
                    linkedHashMap2.put(str, (D2.k) obj);
                    b3 = ((o) lVar2.f1069d).e();
                    if (b3 != 4) {
                        if (b3 != 7) {
                            o.n((o) lVar2.f1069d, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                        o oVar3 = (o) lVar2.f1069d;
                        if (b3 != 6) {
                            oVar3.f((byte) 7);
                        } else if (b3 == 4) {
                            if (!lVar2.f1068c) {
                                h.h(oVar3, "object");
                                throw null;
                            }
                            oVar3.f((byte) 7);
                        }
                        return new w(linkedHashMap2);
                    }
                    linkedHashMap = linkedHashMap2;
                    bVar = bVar2;
                    f3 = b3;
                    lVar = lVar2;
                }
                oVar = (o) lVar.f1069d;
                if (oVar.b()) {
                    linkedHashMap2 = linkedHashMap;
                    byte b4 = f3;
                    lVar2 = lVar;
                    b3 = b4;
                    o oVar32 = (o) lVar2.f1069d;
                    if (b3 != 6) {
                    }
                    return new w(linkedHashMap2);
                }
                String j3 = lVar.f1067b ? oVar.j() : oVar.i();
                oVar.f((byte) 5);
                kVar.f1059g = bVar;
                kVar.f1060h = lVar;
                kVar.f1061i = linkedHashMap;
                kVar.f1062j = j3;
                kVar.f1065m = 1;
                bVar.getClass();
                bVar.f4143e = kVar;
                return aVar2;
            }
        }
        kVar = new k(lVar, aVar);
        Object obj2 = kVar.f1063k;
        W1.a aVar22 = W1.a.f4608d;
        i3 = kVar.f1065m;
        if (i3 != 0) {
        }
        oVar = (o) lVar.f1069d;
        if (oVar.b()) {
        }
    }

    public G2.h b(SSLSocket sSLSocket) {
        G2.h hVar;
        int i3;
        boolean z3;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i4 = this.f1066a;
        List list = (List) this.f1069d;
        int size = list.size();
        while (true) {
            if (i4 >= size) {
                hVar = null;
                break;
            }
            hVar = (G2.h) list.get(i4);
            if (hVar.b(sSLSocket)) {
                this.f1066a = i4 + 1;
                break;
            }
            i4++;
        }
        if (hVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f1068c);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            f2.j.c(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            f2.j.e(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i5 = this.f1066a;
        int size2 = list.size();
        while (true) {
            i3 = 0;
            if (i5 >= size2) {
                z3 = false;
                break;
            }
            if (((G2.h) list.get(i5)).b(sSLSocket)) {
                z3 = true;
                break;
            }
            i5++;
        }
        this.f1067b = z3;
        boolean z4 = this.f1068c;
        String[] strArr = hVar.f2184c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            f2.j.e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = H2.b.o(enabledCipherSuites2, strArr, G2.f.f2157c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = hVar.f2185d;
        if (strArr2 != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            f2.j.e(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = H2.b.o(enabledProtocols3, strArr2, U1.b.f4512b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        f2.j.e(supportedCipherSuites, "supportedCipherSuites");
        G2.e eVar = G2.f.f2157c;
        byte[] bArr = H2.b.f2632a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (eVar.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i3++;
        }
        if (z4 && i3 != -1) {
            f2.j.e(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i3];
            f2.j.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            f2.j.e(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        G2.g gVar = new G2.g();
        gVar.f2176a = hVar.f2182a;
        gVar.f2177b = strArr;
        gVar.f2178c = strArr2;
        gVar.f2179d = hVar.f2183b;
        f2.j.e(enabledCipherSuites, "cipherSuitesIntersection");
        gVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        f2.j.e(enabledProtocols, "tlsVersionsIntersection");
        gVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        G2.h a3 = gVar.a();
        if (a3.c() != null) {
            sSLSocket.setEnabledProtocols(a3.f2185d);
        }
        if (a3.a() != null) {
            sSLSocket.setEnabledCipherSuites(a3.f2184c);
        }
        return hVar;
    }

    public D2.k c() {
        D2.k wVar;
        Object obj;
        o oVar = (o) this.f1069d;
        byte r3 = oVar.r();
        if (r3 == 1) {
            return e(true);
        }
        if (r3 == 0) {
            return e(false);
        }
        if (r3 != 6) {
            if (r3 == 8) {
                return d();
            }
            o.n(oVar, "Cannot read Json element because of unexpected ".concat(h.k(r3)), 0, null, 6);
            throw null;
        }
        int i3 = this.f1066a + 1;
        this.f1066a = i3;
        if (i3 == 200) {
            j jVar = new j(this, null);
            R1.b bVar = new R1.b();
            bVar.f4142d = jVar;
            bVar.f4143e = bVar;
            W1.a aVar = R1.a.f4141a;
            bVar.f4144f = aVar;
            while (true) {
                obj = bVar.f4144f;
                V1.d dVar = bVar.f4143e;
                if (dVar == null) {
                    break;
                }
                if (f2.j.a(aVar, obj)) {
                    try {
                        j jVar2 = bVar.f4142d;
                        y yVar = y.f4171a;
                        x.d(3, jVar2);
                        Object g3 = jVar2.g(bVar, yVar, dVar);
                        if (g3 != W1.a.f4608d) {
                            dVar.u(g3);
                        }
                    } catch (Throwable th) {
                        dVar.u(R1.a.b(th));
                    }
                } else {
                    bVar.f4144f = aVar;
                    dVar.u(obj);
                }
            }
            R1.a.e(obj);
            wVar = (D2.k) obj;
        } else {
            byte f3 = oVar.f((byte) 6);
            if (oVar.r() == 4) {
                o.n(oVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!oVar.b()) {
                    break;
                }
                String j3 = this.f1067b ? oVar.j() : oVar.i();
                oVar.f((byte) 5);
                linkedHashMap.put(j3, c());
                f3 = oVar.e();
                if (f3 != 4) {
                    if (f3 != 7) {
                        o.n(oVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (f3 == 6) {
                oVar.f((byte) 7);
            } else if (f3 == 4) {
                if (!this.f1068c) {
                    h.h(oVar, "object");
                    throw null;
                }
                oVar.f((byte) 7);
            }
            wVar = new w(linkedHashMap);
        }
        this.f1066a--;
        return wVar;
    }

    public D2.e d() {
        o oVar = (o) this.f1069d;
        byte e3 = oVar.e();
        if (oVar.r() == 4) {
            o.n(oVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (oVar.b()) {
            arrayList.add(c());
            e3 = oVar.e();
            if (e3 != 4) {
                boolean z3 = e3 == 9;
                int i3 = oVar.f1078a;
                if (!z3) {
                    o.n(oVar, "Expected end of the array or comma", i3, null, 4);
                    throw null;
                }
            }
        }
        if (e3 == 8) {
            oVar.f((byte) 9);
        } else if (e3 == 4) {
            if (!this.f1068c) {
                h.h(oVar, "array");
                throw null;
            }
            oVar.f((byte) 9);
        }
        return new D2.e(arrayList);
    }

    public A e(boolean z3) {
        o oVar = (o) this.f1069d;
        String j3 = (this.f1067b || !z3) ? oVar.j() : oVar.i();
        return (z3 || !f2.j.a(j3, "null")) ? new D2.q(j3, z3) : t.INSTANCE;
    }

    public l(List list) {
        f2.j.f(list, "connectionSpecs");
        this.f1069d = list;
    }
}
