package E2;

import L1.AbstractC0139a;
import L1.z;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLSocket;
import t.u;
import x2.A;
import x2.q;
import x2.t;
import x2.w;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f774a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f775b;

    /* renamed from: c, reason: collision with root package name */
    public int f776c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f777d;

    public b(x2.i iVar, u uVar) {
        this.f777d = uVar;
        this.f774a = iVar.f8742c;
        this.f775b = iVar.f8753n;
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
    public static final Object a(b bVar, L1.b bVar2, R1.a aVar) {
        y2.h hVar;
        int i3;
        byte f3;
        LinkedHashMap linkedHashMap;
        u uVar;
        LinkedHashMap linkedHashMap2;
        b bVar3;
        byte b2;
        bVar.getClass();
        if (aVar instanceof y2.h) {
            hVar = (y2.h) aVar;
            int i4 = hVar.f8848j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hVar.f8848j = i4 - Integer.MIN_VALUE;
                Object obj = hVar.f8846h;
                Q1.a aVar2 = Q1.a.f3113d;
                i3 = hVar.f8848j;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    u uVar2 = (u) bVar.f777d;
                    f3 = uVar2.f((byte) 6);
                    if (uVar2.u() == 4) {
                        u.n(uVar2, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = hVar.f8845g;
                    linkedHashMap2 = hVar.f8844f;
                    bVar3 = hVar.f8843e;
                    L1.b bVar4 = hVar.f8842d;
                    I2.l.Q(obj);
                    linkedHashMap2.put(str, (x2.k) obj);
                    b2 = ((u) bVar3.f777d).e();
                    if (b2 != 4) {
                        if (b2 != 7) {
                            u.n((u) bVar3.f777d, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                        u uVar3 = (u) bVar3.f777d;
                        if (b2 != 6) {
                            uVar3.f((byte) 7);
                        } else if (b2 == 4) {
                            if (!bVar3.f775b) {
                                y2.e.h(uVar3, "object");
                                throw null;
                            }
                            uVar3.f((byte) 7);
                        }
                        return new w(linkedHashMap2);
                    }
                    linkedHashMap = linkedHashMap2;
                    bVar2 = bVar4;
                    f3 = b2;
                    bVar = bVar3;
                }
                uVar = (u) bVar.f777d;
                if (uVar.b()) {
                    linkedHashMap2 = linkedHashMap;
                    byte b3 = f3;
                    bVar3 = bVar;
                    b2 = b3;
                    u uVar32 = (u) bVar3.f777d;
                    if (b2 != 6) {
                    }
                    return new w(linkedHashMap2);
                }
                String j3 = bVar.f774a ? uVar.j() : uVar.i();
                uVar.f((byte) 5);
                hVar.f8842d = bVar2;
                hVar.f8843e = bVar;
                hVar.f8844f = linkedHashMap;
                hVar.f8845g = j3;
                hVar.f8848j = 1;
                bVar2.getClass();
                bVar2.f2701e = hVar;
                return aVar2;
            }
        }
        hVar = new y2.h(bVar, aVar);
        Object obj2 = hVar.f8846h;
        Q1.a aVar22 = Q1.a.f3113d;
        i3 = hVar.f8848j;
        if (i3 != 0) {
        }
        uVar = (u) bVar.f777d;
        if (uVar.b()) {
        }
    }

    public A2.i b(SSLSocket sSLSocket) {
        A2.i iVar;
        int i3;
        boolean z3;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i4 = this.f776c;
        List list = (List) this.f777d;
        int size = list.size();
        while (true) {
            if (i4 >= size) {
                iVar = null;
                break;
            }
            iVar = (A2.i) list.get(i4);
            if (iVar.b(sSLSocket)) {
                this.f776c = i4 + 1;
                break;
            }
            i4++;
        }
        if (iVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f775b);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            Z1.i.c(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            Z1.i.e(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i5 = this.f776c;
        int size2 = list.size();
        while (true) {
            i3 = 0;
            if (i5 >= size2) {
                z3 = false;
                break;
            }
            if (((A2.i) list.get(i5)).b(sSLSocket)) {
                z3 = true;
                break;
            }
            i5++;
        }
        this.f774a = z3;
        boolean z4 = this.f775b;
        String[] strArr = iVar.f92c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            Z1.i.e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = B2.c.o(enabledCipherSuites2, strArr, A2.f.f64c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = iVar.f93d;
        if (strArr2 != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            Z1.i.e(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = B2.c.o(enabledProtocols3, strArr2, O1.b.f2987b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Z1.i.e(supportedCipherSuites, "supportedCipherSuites");
        A2.e eVar = A2.f.f64c;
        byte[] bArr = B2.c.f415a;
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
            Z1.i.e(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i3];
            Z1.i.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        A2.h hVar = new A2.h();
        hVar.f84a = iVar.f90a;
        hVar.f85b = strArr;
        hVar.f86c = strArr2;
        hVar.f87d = iVar.f91b;
        Z1.i.e(enabledCipherSuites, "cipherSuitesIntersection");
        hVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        Z1.i.e(enabledProtocols, "tlsVersionsIntersection");
        hVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        A2.i a3 = hVar.a();
        if (a3.c() != null) {
            sSLSocket.setEnabledProtocols(a3.f93d);
        }
        if (a3.a() != null) {
            sSLSocket.setEnabledCipherSuites(a3.f92c);
        }
        return iVar;
    }

    public x2.k c() {
        x2.k wVar;
        Object obj;
        u uVar = (u) this.f777d;
        byte u3 = uVar.u();
        if (u3 == 1) {
            return e(true);
        }
        if (u3 == 0) {
            return e(false);
        }
        if (u3 != 6) {
            if (u3 == 8) {
                return d();
            }
            u.n(uVar, "Cannot read Json element because of unexpected ".concat(y2.e.k(u3)), 0, null, 6);
            throw null;
        }
        int i3 = this.f776c + 1;
        this.f776c = i3;
        if (i3 == 200) {
            y2.g gVar = new y2.g(this, null);
            Q1.a aVar = AbstractC0139a.f2699a;
            L1.b bVar = new L1.b();
            bVar.f2700d = gVar;
            bVar.f2701e = bVar;
            Q1.a aVar2 = AbstractC0139a.f2699a;
            bVar.f2702f = aVar2;
            while (true) {
                obj = bVar.f2702f;
                P1.d dVar = bVar.f2701e;
                if (dVar == null) {
                    break;
                }
                if (Z1.i.a(aVar2, obj)) {
                    try {
                        y2.g gVar2 = bVar.f2700d;
                        z zVar = z.f2729a;
                        Z1.w.d(3, gVar2);
                        Object f3 = gVar2.f(bVar, zVar, dVar);
                        if (f3 != Q1.a.f3113d) {
                            dVar.resumeWith(f3);
                        }
                    } catch (Throwable th) {
                        dVar.resumeWith(I2.l.t(th));
                    }
                } else {
                    bVar.f2702f = aVar2;
                    dVar.resumeWith(obj);
                }
            }
            I2.l.Q(obj);
            wVar = (x2.k) obj;
        } else {
            byte f4 = uVar.f((byte) 6);
            if (uVar.u() == 4) {
                u.n(uVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!uVar.b()) {
                    break;
                }
                String j3 = this.f774a ? uVar.j() : uVar.i();
                uVar.f((byte) 5);
                linkedHashMap.put(j3, c());
                f4 = uVar.e();
                if (f4 != 4) {
                    if (f4 != 7) {
                        u.n(uVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (f4 == 6) {
                uVar.f((byte) 7);
            } else if (f4 == 4) {
                if (!this.f775b) {
                    y2.e.h(uVar, "object");
                    throw null;
                }
                uVar.f((byte) 7);
            }
            wVar = new w(linkedHashMap);
        }
        this.f776c--;
        return wVar;
    }

    public x2.e d() {
        u uVar = (u) this.f777d;
        byte e3 = uVar.e();
        if (uVar.u() == 4) {
            u.n(uVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (uVar.b()) {
            arrayList.add(c());
            e3 = uVar.e();
            if (e3 != 4) {
                boolean z3 = e3 == 9;
                int i3 = uVar.f7671b;
                if (!z3) {
                    u.n(uVar, "Expected end of the array or comma", i3, null, 4);
                    throw null;
                }
            }
        }
        if (e3 == 8) {
            uVar.f((byte) 9);
        } else if (e3 == 4) {
            if (!this.f775b) {
                y2.e.h(uVar, "array");
                throw null;
            }
            uVar.f((byte) 9);
        }
        return new x2.e(arrayList);
    }

    public A e(boolean z3) {
        u uVar = (u) this.f777d;
        String j3 = (this.f774a || !z3) ? uVar.j() : uVar.i();
        return (z3 || !Z1.i.a(j3, "null")) ? new q(j3, z3) : t.INSTANCE;
    }

    public b(List list) {
        Z1.i.f(list, "connectionSpecs");
        this.f777d = list;
    }
}
