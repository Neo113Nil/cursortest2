package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class n9 implements jr {
    public static final n9 b = new n9(1);
    public final /* synthetic */ int a;

    public /* synthetic */ n9(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:
    
        if (r13 < 200) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4 A[Catch: IOException -> 0x008c, TryCatch #8 {IOException -> 0x008c, blocks: (B:11:0x0048, B:14:0x0070, B:15:0x008f, B:18:0x00b0, B:20:0x00c7, B:28:0x00e0, B:30:0x00e4, B:33:0x00f1, B:35:0x0104, B:36:0x010c, B:37:0x0116, B:39:0x00d1, B:42:0x0119, B:43:0x011c, B:17:0x0093), top: B:10:0x0048, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1 A[Catch: IOException -> 0x008c, TryCatch #8 {IOException -> 0x008c, blocks: (B:11:0x0048, B:14:0x0070, B:15:0x008f, B:18:0x00b0, B:20:0x00c7, B:28:0x00e0, B:30:0x00e4, B:33:0x00f1, B:35:0x0104, B:36:0x010c, B:37:0x0116, B:39:0x00d1, B:42:0x0119, B:43:0x011c, B:17:0x0093), top: B:10:0x0048, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Throwable] */
    @Override // defpackage.jr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n30 a(n10 n10Var) {
        kp kpVar;
        IOException iOException;
        n30 a;
        b30 b30Var;
        p30 p30Var;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                b30 b30Var2 = n10Var.e;
                int i = 8;
                a5 a5Var = new a5(b30Var2, r4, i);
                m9 m9Var = b30Var2.e;
                if (m9Var == null) {
                    int i2 = m9.n;
                    m9Var = la0.R(b30Var2.c);
                    b30Var2.e = m9Var;
                }
                if (m9Var.j) {
                    a5Var = new a5(r4, r4, i);
                }
                b30 b30Var3 = (b30) a5Var.g;
                n30 n30Var = (n30) a5Var.h;
                if (b30Var3 == null && n30Var == null) {
                    return new n30(b30Var2, q00.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new kp((String[]) new ArrayList(20).toArray(new String[0])), cb0.c, null, null, null, -1L, System.currentTimeMillis(), null);
                }
                if (b30Var3 == null) {
                    n30Var.getClass();
                    m30 g = n30Var.g();
                    n30 e = ej.e(n30Var);
                    m30.b(e, "cacheResponse");
                    g.i = e;
                    return g.a();
                }
                n30 b2 = n10Var.b(b30Var3);
                if (n30Var != null) {
                    if (b2.i == 304) {
                        m30 g2 = n30Var.g();
                        kp kpVar2 = n30Var.k;
                        kp kpVar3 = b2.k;
                        ArrayList arrayList = new ArrayList(20);
                        int size = kpVar2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            String b3 = kpVar2.b(i3);
                            Long l = r4;
                            String d = kpVar2.d(i3);
                            if ("Warning".equalsIgnoreCase(b3)) {
                                kpVar = kpVar2;
                                if (n70.U(d, "1", false)) {
                                    i3++;
                                    r4 = l;
                                    kpVar2 = kpVar;
                                }
                            } else {
                                kpVar = kpVar2;
                            }
                            if ("Content-Length".equalsIgnoreCase(b3) || "Content-Encoding".equalsIgnoreCase(b3) || "Content-Type".equalsIgnoreCase(b3) || !ej.l(b3) || kpVar3.a(b3) == null) {
                                b3.getClass();
                                d.getClass();
                                arrayList.add(b3);
                                arrayList.add(f70.g0(d).toString());
                            }
                            i3++;
                            r4 = l;
                            kpVar2 = kpVar;
                        }
                        ?? r24 = r4;
                        int size2 = kpVar3.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            String b4 = kpVar3.b(i4);
                            if (!"Content-Length".equalsIgnoreCase(b4) && !"Content-Encoding".equalsIgnoreCase(b4) && !"Content-Type".equalsIgnoreCase(b4) && ej.l(b4)) {
                                String d2 = kpVar3.d(i4);
                                b4.getClass();
                                d2.getClass();
                                arrayList.add(b4);
                                arrayList.add(f70.g0(d2).toString());
                            }
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        rc0 rc0Var = new rc0(25);
                        ArrayList arrayList2 = (ArrayList) rc0Var.g;
                        arrayList2.getClass();
                        strArr.getClass();
                        List asList = Arrays.asList(strArr);
                        asList.getClass();
                        arrayList2.addAll(asList);
                        g2.f = rc0Var;
                        g2.k = b2.p;
                        g2.l = b2.q;
                        n30 e2 = ej.e(n30Var);
                        m30.b(e2, "cacheResponse");
                        g2.i = e2;
                        n30 e3 = ej.e(b2);
                        m30.b(e3, "networkResponse");
                        g2.h = e3;
                        g2.a();
                        p30 p30Var2 = b2.l;
                        p30Var2.getClass();
                        p30Var2.close();
                        throw r24;
                    }
                    p30 p30Var3 = n30Var.l;
                    if (p30Var3 != null) {
                        cb0.b(p30Var3);
                    }
                }
                m30 g3 = b2.g();
                n30 e4 = ej.e(n30Var);
                m30.b(e4, "cacheResponse");
                g3.i = e4;
                n30 e5 = ej.e(b2);
                m30.b(e5, "networkResponse");
                g3.h = e5;
                return g3.a();
            case 1:
                i10 i10Var = n10Var.a;
                synchronized (i10Var) {
                    try {
                        if (!i10Var.q) {
                            throw new IllegalStateException("released");
                        }
                        if (i10Var.p) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (i10Var.o) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                wk wkVar = i10Var.l;
                wkVar.getClass();
                xy xyVar = i10Var.f;
                try {
                    uk ukVar = new uk(i10Var, wkVar, wkVar.a(n10Var.f, n10Var.g, n10Var.h, xyVar.k, !kr.b(n10Var.e.b, "GET")).j(xyVar, n10Var));
                    i10Var.n = ukVar;
                    i10Var.s = ukVar;
                    synchronized (i10Var) {
                        i10Var.o = true;
                        i10Var.p = true;
                    }
                    if (!i10Var.r) {
                        return n10.a(n10Var, 0, ukVar, null, 61).b(n10Var.e);
                    }
                    g9.w("Canceled");
                    return null;
                } catch (IOException e6) {
                    wkVar.b(e6);
                    throw new x30(e6);
                } catch (x30 e7) {
                    wkVar.b(e7.g);
                    throw e7;
                }
            default:
                uk ukVar2 = n10Var.d;
                ukVar2.getClass();
                i10 i10Var2 = ukVar2.a;
                vk vkVar = ukVar2.c;
                l10 l10Var = ukVar2.e;
                b30 b30Var4 = n10Var.e;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        vkVar.a(b30Var4);
                        xf.C(b30Var4.b);
                        i10Var2.g(ukVar2, true, false, null);
                        try {
                            vkVar.c();
                            iOException = null;
                        } catch (IOException e8) {
                            ukVar2.b(e8);
                            throw e8;
                        }
                    } catch (IOException e9) {
                        ukVar2.b(e9);
                        throw e9;
                    }
                } catch (IOException e10) {
                    if (e10 instanceof bd) {
                        throw e10;
                    }
                    if (!ukVar2.d) {
                        throw e10;
                    }
                    iOException = e10;
                }
                try {
                    m30 a2 = ukVar2.a(false);
                    a2.getClass();
                    a2.a = b30Var4;
                    a2.e = l10Var.e;
                    a2.k = currentTimeMillis;
                    a2.l = System.currentTimeMillis();
                    n30 a3 = a2.a();
                    int i5 = a3.i;
                    try {
                        if (i5 != 100) {
                            if (102 <= i5) {
                                break;
                            }
                            m30 g4 = a3.g();
                            String f = n30.f(a3, "Content-Type");
                            long e11 = vkVar.e(a3);
                            g4.g = new o10(f, e11, new e10(new tk(ukVar2, vkVar.b(a3), e11)));
                            a = g4.a();
                            b30Var = a.f;
                            b30Var.getClass();
                            if (!"close".equalsIgnoreCase(b30Var.c.a("Connection")) || "close".equalsIgnoreCase(n30.f(a, "Connection"))) {
                                vkVar.g().k();
                            }
                            if (i5 != 204 || i5 == 205) {
                                p30Var = a.l;
                                if ((p30Var == null ? p30Var.f() : -1L) > 0) {
                                    StringBuilder sb = new StringBuilder("HTTP ");
                                    sb.append(i5);
                                    sb.append(" had non-zero Content-Length: ");
                                    p30 p30Var4 = a.l;
                                    sb.append(p30Var4 != null ? Long.valueOf(p30Var4.f()) : null);
                                    throw new ProtocolException(sb.toString());
                                }
                            }
                            return a;
                        }
                        String f2 = n30.f(a3, "Content-Type");
                        long e112 = vkVar.e(a3);
                        g4.g = new o10(f2, e112, new e10(new tk(ukVar2, vkVar.b(a3), e112)));
                        a = g4.a();
                        b30Var = a.f;
                        b30Var.getClass();
                        if (!"close".equalsIgnoreCase(b30Var.c.a("Connection"))) {
                        }
                        vkVar.g().k();
                        if (i5 != 204) {
                        }
                        p30Var = a.l;
                        if ((p30Var == null ? p30Var.f() : -1L) > 0) {
                        }
                        return a;
                    } catch (IOException e12) {
                        ukVar2.b(e12);
                        throw e12;
                    }
                    m30 a4 = ukVar2.a(false);
                    a4.getClass();
                    a4.a = b30Var4;
                    a4.e = l10Var.e;
                    a4.k = currentTimeMillis;
                    a4.l = System.currentTimeMillis();
                    a3 = a4.a();
                    i5 = a3.i;
                    m30 g42 = a3.g();
                } catch (IOException e13) {
                    if (iOException == null) {
                        throw e13;
                    }
                    la0.f(iOException, e13);
                    throw iOException;
                }
        }
    }
}
