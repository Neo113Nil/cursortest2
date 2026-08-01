package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class a9 implements yo {
    public static final a9 b = new a9(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a9(int i) {
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
    @Override // defpackage.yo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i00 a(ly lyVar) {
        ym ymVar;
        IOException iOException;
        i00 a;
        xz xzVar;
        k00 k00Var;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                xz xzVar2 = lyVar.e;
                int i = 9;
                q4 q4Var = new q4(xzVar2, r4, i);
                z8 z8Var = xzVar2.e;
                if (z8Var == null) {
                    int i2 = z8.n;
                    z8Var = jw.Q(xzVar2.c);
                    xzVar2.e = z8Var;
                }
                if (z8Var.j) {
                    q4Var = new q4(r4, r4, i);
                }
                xz xzVar3 = (xz) q4Var.g;
                i00 i00Var = (i00) q4Var.h;
                if (xzVar3 == null && i00Var == null) {
                    return new i00(xzVar2, nx.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new ym((String[]) new ArrayList(20).toArray(new String[0])), r70.c, null, null, null, -1L, System.currentTimeMillis(), null);
                }
                if (xzVar3 == null) {
                    i00Var.getClass();
                    h00 n = i00Var.n();
                    i00 f = dh.f(i00Var);
                    h00.b(f, "cacheResponse");
                    n.i = f;
                    return n.a();
                }
                i00 b2 = lyVar.b(xzVar3);
                if (i00Var != null) {
                    if (b2.i == 304) {
                        h00 n2 = i00Var.n();
                        ym ymVar2 = i00Var.k;
                        ym ymVar3 = b2.k;
                        ArrayList arrayList = new ArrayList(20);
                        int size = ymVar2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            String b3 = ymVar2.b(i3);
                            Long l = r4;
                            String d = ymVar2.d(i3);
                            if ("Warning".equalsIgnoreCase(b3)) {
                                ymVar = ymVar2;
                                if (k40.m0(d, "1", false)) {
                                    i3++;
                                    r4 = l;
                                    ymVar2 = ymVar;
                                }
                            } else {
                                ymVar = ymVar2;
                            }
                            if ("Content-Length".equalsIgnoreCase(b3) || "Content-Encoding".equalsIgnoreCase(b3) || "Content-Type".equalsIgnoreCase(b3) || !dh.n(b3) || ymVar3.a(b3) == null) {
                                b3.getClass();
                                d.getClass();
                                arrayList.add(b3);
                                arrayList.add(c40.y0(d).toString());
                            }
                            i3++;
                            r4 = l;
                            ymVar2 = ymVar;
                        }
                        ?? r24 = r4;
                        int size2 = ymVar3.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            String b4 = ymVar3.b(i4);
                            if (!"Content-Length".equalsIgnoreCase(b4) && !"Content-Encoding".equalsIgnoreCase(b4) && !"Content-Type".equalsIgnoreCase(b4) && dh.n(b4)) {
                                String d2 = ymVar3.d(i4);
                                b4.getClass();
                                d2.getClass();
                                arrayList.add(b4);
                                arrayList.add(c40.y0(d2).toString());
                            }
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        k0 k0Var = new k0(25);
                        ArrayList arrayList2 = (ArrayList) k0Var.g;
                        arrayList2.getClass();
                        strArr.getClass();
                        List asList = Arrays.asList(strArr);
                        asList.getClass();
                        arrayList2.addAll(asList);
                        n2.f = k0Var;
                        n2.k = b2.p;
                        n2.l = b2.q;
                        i00 f2 = dh.f(i00Var);
                        h00.b(f2, "cacheResponse");
                        n2.i = f2;
                        i00 f3 = dh.f(b2);
                        h00.b(f3, "networkResponse");
                        n2.h = f3;
                        n2.a();
                        k00 k00Var2 = b2.l;
                        k00Var2.getClass();
                        k00Var2.close();
                        throw r24;
                    }
                    k00 k00Var3 = i00Var.l;
                    if (k00Var3 != null) {
                        r70.b(k00Var3);
                    }
                }
                h00 n3 = b2.n();
                i00 f4 = dh.f(i00Var);
                h00.b(f4, "cacheResponse");
                n3.i = f4;
                i00 f5 = dh.f(b2);
                h00.b(f5, "networkResponse");
                n3.h = f5;
                return n3.a();
            case 1:
                gy gyVar = lyVar.a;
                synchronized (gyVar) {
                    try {
                        if (!gyVar.q) {
                            throw new IllegalStateException("released");
                        }
                        if (gyVar.p) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (gyVar.o) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                pi piVar = gyVar.l;
                piVar.getClass();
                uv uvVar = gyVar.f;
                try {
                    ni niVar = new ni(gyVar, piVar, piVar.a(lyVar.f, lyVar.g, lyVar.h, uvVar.k, !zo.b(lyVar.e.b, "GET")).j(uvVar, lyVar));
                    gyVar.n = niVar;
                    gyVar.s = niVar;
                    synchronized (gyVar) {
                        gyVar.o = true;
                        gyVar.p = true;
                    }
                    if (!gyVar.r) {
                        return ly.a(lyVar, 0, niVar, null, 61).b(lyVar.e);
                    }
                    t8.y("Canceled");
                    return null;
                } catch (IOException e) {
                    piVar.b(e);
                    throw new s00(e);
                } catch (s00 e2) {
                    piVar.b(e2.g);
                    throw e2;
                }
            default:
                ni niVar2 = lyVar.d;
                niVar2.getClass();
                gy gyVar2 = niVar2.a;
                oi oiVar = niVar2.c;
                jy jyVar = niVar2.e;
                xz xzVar4 = lyVar.e;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        oiVar.a(xzVar4);
                        zo.G(xzVar4.b);
                        gyVar2.g(niVar2, true, false, null);
                        try {
                            oiVar.c();
                            iOException = null;
                        } catch (IOException e3) {
                            niVar2.b(e3);
                            throw e3;
                        }
                    } catch (IOException e4) {
                        niVar2.b(e4);
                        throw e4;
                    }
                } catch (IOException e5) {
                    if (e5 instanceof bc) {
                        throw e5;
                    }
                    if (!niVar2.d) {
                        throw e5;
                    }
                    iOException = e5;
                }
                try {
                    h00 a2 = niVar2.a(false);
                    a2.getClass();
                    a2.a = xzVar4;
                    a2.e = jyVar.e;
                    a2.k = currentTimeMillis;
                    a2.l = System.currentTimeMillis();
                    i00 a3 = a2.a();
                    int i5 = a3.i;
                    try {
                        if (i5 != 100) {
                            if (102 <= i5) {
                                break;
                            }
                            h00 n4 = a3.n();
                            String m = i00.m(a3, "Content-Type");
                            long e6 = oiVar.e(a3);
                            n4.g = new my(m, e6, new cy(new mi(niVar2, oiVar.b(a3), e6)));
                            a = n4.a();
                            xzVar = a.f;
                            xzVar.getClass();
                            if (!"close".equalsIgnoreCase(xzVar.c.a("Connection")) || "close".equalsIgnoreCase(i00.m(a, "Connection"))) {
                                oiVar.g().k();
                            }
                            if (i5 != 204 || i5 == 205) {
                                k00Var = a.l;
                                if ((k00Var == null ? k00Var.m() : -1L) > 0) {
                                    StringBuilder sb = new StringBuilder("HTTP ");
                                    sb.append(i5);
                                    sb.append(" had non-zero Content-Length: ");
                                    k00 k00Var4 = a.l;
                                    sb.append(k00Var4 != null ? Long.valueOf(k00Var4.m()) : null);
                                    throw new ProtocolException(sb.toString());
                                }
                            }
                            return a;
                        }
                        String m2 = i00.m(a3, "Content-Type");
                        long e62 = oiVar.e(a3);
                        n4.g = new my(m2, e62, new cy(new mi(niVar2, oiVar.b(a3), e62)));
                        a = n4.a();
                        xzVar = a.f;
                        xzVar.getClass();
                        if (!"close".equalsIgnoreCase(xzVar.c.a("Connection"))) {
                        }
                        oiVar.g().k();
                        if (i5 != 204) {
                        }
                        k00Var = a.l;
                        if ((k00Var == null ? k00Var.m() : -1L) > 0) {
                        }
                        return a;
                    } catch (IOException e7) {
                        niVar2.b(e7);
                        throw e7;
                    }
                    h00 a4 = niVar2.a(false);
                    a4.getClass();
                    a4.a = xzVar4;
                    a4.e = jyVar.e;
                    a4.k = currentTimeMillis;
                    a4.l = System.currentTimeMillis();
                    a3 = a4.a();
                    i5 = a3.i;
                    h00 n42 = a3.n();
                } catch (IOException e8) {
                    if (iOException == null) {
                        throw e8;
                    }
                    zo.a(iOException, e8);
                    throw iOException;
                }
        }
    }
}
