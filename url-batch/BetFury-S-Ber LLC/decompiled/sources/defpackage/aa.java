package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class aa implements lv {
    public static final aa b = new aa(1);
    public final /* synthetic */ int a;

    public /* synthetic */ aa(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        if (r13 < 200) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8 A[Catch: IOException -> 0x008e, TryCatch #6 {IOException -> 0x008e, blocks: (B:11:0x004a, B:14:0x0072, B:15:0x0091, B:18:0x00b2, B:20:0x00cb, B:28:0x00e4, B:30:0x00e8, B:33:0x00f5, B:35:0x0108, B:36:0x0110, B:37:0x011a, B:39:0x00d5, B:42:0x011d, B:43:0x0120, B:17:0x0095), top: B:10:0x004a, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5 A[Catch: IOException -> 0x008e, TryCatch #6 {IOException -> 0x008e, blocks: (B:11:0x004a, B:14:0x0072, B:15:0x0091, B:18:0x00b2, B:20:0x00cb, B:28:0x00e4, B:30:0x00e8, B:33:0x00f5, B:35:0x0108, B:36:0x0110, B:37:0x011a, B:39:0x00d5, B:42:0x011d, B:43:0x0120, B:17:0x0095), top: B:10:0x004a, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Throwable] */
    @Override // defpackage.lv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v90 a(s70 s70Var) {
        bt btVar;
        IOException iOException;
        v90 a;
        j90 j90Var;
        x90 x90Var;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                j90 j90Var2 = s70Var.e;
                int i = 8;
                i5 i5Var = new i5(j90Var2, r4, i);
                z9 z9Var = (z9) j90Var2.f;
                if (z9Var == null) {
                    int i2 = z9.n;
                    z9Var = mv.G((bt) j90Var2.d);
                    j90Var2.f = z9Var;
                }
                if (z9Var.j) {
                    i5Var = new i5(r4, r4, i);
                }
                j90 j90Var3 = (j90) i5Var.g;
                v90 v90Var = (v90) i5Var.h;
                if (j90Var3 == null && v90Var == null) {
                    ArrayList arrayList = new ArrayList(20);
                    u60 u60Var = u60.HTTP_1_1;
                    u60Var.getClass();
                    return new v90(j90Var2, u60Var, "Unsatisfiable Request (only-if-cached)", 504, null, new bt((String[]) arrayList.toArray(new String[0])), zk0.c, null, null, null, -1L, System.currentTimeMillis(), null);
                }
                if (j90Var3 == null) {
                    v90Var.getClass();
                    u90 n = v90Var.n();
                    v90 e = sl.e(v90Var);
                    u90.b(e, "cacheResponse");
                    n.i = e;
                    return n.a();
                }
                v90 b2 = s70Var.b(j90Var3);
                if (v90Var != null) {
                    if (b2.i == 304) {
                        u90 n2 = v90Var.n();
                        bt btVar2 = v90Var.k;
                        bt btVar3 = b2.k;
                        ArrayList arrayList2 = new ArrayList(20);
                        int size = btVar2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            String b3 = btVar2.b(i3);
                            Long l = r4;
                            String d = btVar2.d(i3);
                            if ("Warning".equalsIgnoreCase(b3)) {
                                btVar = btVar2;
                                if (uf0.r(d, "1", false)) {
                                    i3++;
                                    r4 = l;
                                    btVar2 = btVar;
                                }
                            } else {
                                btVar = btVar2;
                            }
                            if ("Content-Length".equalsIgnoreCase(b3) || "Content-Encoding".equalsIgnoreCase(b3) || "Content-Type".equalsIgnoreCase(b3) || !sl.l(b3) || btVar3.a(b3) == null) {
                                b3.getClass();
                                d.getClass();
                                arrayList2.add(b3);
                                arrayList2.add(mf0.E(d).toString());
                            }
                            i3++;
                            r4 = l;
                            btVar2 = btVar;
                        }
                        ?? r24 = r4;
                        int size2 = btVar3.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            String b4 = btVar3.b(i4);
                            if (!"Content-Length".equalsIgnoreCase(b4) && !"Content-Encoding".equalsIgnoreCase(b4) && !"Content-Type".equalsIgnoreCase(b4) && sl.l(b4)) {
                                String d2 = btVar3.d(i4);
                                b4.getClass();
                                d2.getClass();
                                arrayList2.add(b4);
                                arrayList2.add(mf0.E(d2).toString());
                            }
                        }
                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                        o0 o0Var = new o0(27);
                        ArrayList arrayList3 = (ArrayList) o0Var.g;
                        arrayList3.getClass();
                        strArr.getClass();
                        List asList = Arrays.asList(strArr);
                        asList.getClass();
                        arrayList3.addAll(asList);
                        n2.f = o0Var;
                        n2.k = b2.p;
                        n2.l = b2.q;
                        v90 e2 = sl.e(v90Var);
                        u90.b(e2, "cacheResponse");
                        n2.i = e2;
                        v90 e3 = sl.e(b2);
                        u90.b(e3, "networkResponse");
                        n2.h = e3;
                        n2.a();
                        x90 x90Var2 = b2.l;
                        x90Var2.getClass();
                        x90Var2.close();
                        throw r24;
                    }
                    x90 x90Var3 = v90Var.l;
                    if (x90Var3 != null) {
                        zk0.b(x90Var3);
                    }
                }
                u90 n3 = b2.n();
                v90 e4 = sl.e(v90Var);
                u90.b(e4, "cacheResponse");
                n3.i = e4;
                v90 e5 = sl.e(b2);
                u90.b(e5, "networkResponse");
                n3.h = e5;
                return n3.a();
            case 1:
                n70 n70Var = s70Var.a;
                synchronized (n70Var) {
                    try {
                        if (!n70Var.q) {
                            throw new IllegalStateException("released");
                        }
                        if (n70Var.p) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (n70Var.o) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                tn tnVar = n70Var.l;
                tnVar.getClass();
                o40 o40Var = n70Var.f;
                try {
                    rn rnVar = new rn(n70Var, tnVar, tnVar.a(s70Var.f, s70Var.g, s70Var.h, o40Var.k, !mv.c((String) s70Var.e.c, "GET")).j(o40Var, s70Var));
                    n70Var.n = rnVar;
                    n70Var.s = rnVar;
                    synchronized (n70Var) {
                        n70Var.o = true;
                        n70Var.p = true;
                    }
                    if (!n70Var.r) {
                        return s70.a(s70Var, 0, rnVar, null, 61).b(s70Var.e);
                    }
                    s9.w("Canceled");
                    return null;
                } catch (IOException e6) {
                    tnVar.b(e6);
                    throw new za0(e6);
                } catch (za0 e7) {
                    tnVar.b(e7.g);
                    throw e7;
                }
            default:
                rn rnVar2 = s70Var.d;
                rnVar2.getClass();
                n70 n70Var2 = rnVar2.a;
                sn snVar = rnVar2.c;
                q70 q70Var = rnVar2.e;
                j90 j90Var4 = s70Var.e;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        snVar.a(j90Var4);
                        d50.G((String) j90Var4.c);
                        n70Var2.g(rnVar2, true, false, null);
                    } catch (IOException e8) {
                        if (e8 instanceof le) {
                            throw e8;
                        }
                        if (!rnVar2.d) {
                            throw e8;
                        }
                        iOException = e8;
                    }
                    try {
                        snVar.c();
                        iOException = null;
                        try {
                            u90 a2 = rnVar2.a(false);
                            a2.getClass();
                            a2.a = j90Var4;
                            a2.e = q70Var.e;
                            a2.k = currentTimeMillis;
                            a2.l = System.currentTimeMillis();
                            v90 a3 = a2.a();
                            int i5 = a3.i;
                            try {
                                if (i5 != 100) {
                                    if (102 <= i5) {
                                        break;
                                    }
                                    u90 n4 = a3.n();
                                    String i6 = v90.i(a3, "Content-Type");
                                    long e9 = snVar.e(a3);
                                    n4.g = new t70(i6, e9, new j70(new qn(rnVar2, snVar.b(a3), e9)));
                                    a = n4.a();
                                    j90Var = a.f;
                                    j90Var.getClass();
                                    if (!"close".equalsIgnoreCase(((bt) j90Var.d).a("Connection")) || "close".equalsIgnoreCase(v90.i(a, "Connection"))) {
                                        snVar.g().k();
                                    }
                                    if (i5 != 204 || i5 == 205) {
                                        x90Var = a.l;
                                        if ((x90Var == null ? x90Var.i() : -1L) > 0) {
                                            StringBuilder sb = new StringBuilder("HTTP ");
                                            sb.append(i5);
                                            sb.append(" had non-zero Content-Length: ");
                                            x90 x90Var4 = a.l;
                                            sb.append(x90Var4 != null ? Long.valueOf(x90Var4.i()) : null);
                                            throw new ProtocolException(sb.toString());
                                        }
                                    }
                                    return a;
                                }
                                String i62 = v90.i(a3, "Content-Type");
                                long e92 = snVar.e(a3);
                                n4.g = new t70(i62, e92, new j70(new qn(rnVar2, snVar.b(a3), e92)));
                                a = n4.a();
                                j90Var = a.f;
                                j90Var.getClass();
                                if (!"close".equalsIgnoreCase(((bt) j90Var.d).a("Connection"))) {
                                }
                                snVar.g().k();
                                if (i5 != 204) {
                                }
                                x90Var = a.l;
                                if ((x90Var == null ? x90Var.i() : -1L) > 0) {
                                }
                                return a;
                            } catch (IOException e10) {
                                rnVar2.b(e10);
                                throw e10;
                            }
                            u90 a4 = rnVar2.a(false);
                            a4.getClass();
                            a4.a = j90Var4;
                            a4.e = q70Var.e;
                            a4.k = currentTimeMillis;
                            a4.l = System.currentTimeMillis();
                            a3 = a4.a();
                            i5 = a3.i;
                            u90 n42 = a3.n();
                        } catch (IOException e11) {
                            if (iOException == null) {
                                throw e11;
                            }
                            bi.f(iOException, e11);
                            throw iOException;
                        }
                    } catch (IOException e12) {
                        rnVar2.b(e12);
                        throw e12;
                    }
                } catch (IOException e13) {
                    rnVar2.b(e13);
                    throw e13;
                }
        }
    }
}
