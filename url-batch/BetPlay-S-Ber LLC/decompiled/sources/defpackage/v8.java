package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class v8 implements np {
    public static final v8 b = new v8(1);
    public final /* synthetic */ int a;

    public /* synthetic */ v8(int i) {
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
    @Override // defpackage.np
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y00 a(az azVar) {
        nn nnVar;
        IOException iOException;
        y00 a;
        pp ppVar;
        a10 a10Var;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                pp ppVar2 = azVar.e;
                int i = 6;
                h5 h5Var = new h5(ppVar2, r4, i);
                u8 u8Var = (u8) ppVar2.f;
                if (u8Var == null) {
                    int i2 = u8.n;
                    u8Var = op.F((nn) ppVar2.d);
                    ppVar2.f = u8Var;
                }
                if (u8Var.j) {
                    h5Var = new h5(r4, r4, i);
                }
                pp ppVar3 = (pp) h5Var.g;
                y00 y00Var = (y00) h5Var.h;
                if (ppVar3 == null && y00Var == null) {
                    return new y00(ppVar2, dy.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new nn((String[]) new ArrayList(20).toArray(new String[0])), y70.c, null, null, null, -1L, System.currentTimeMillis(), null);
                }
                if (ppVar3 == null) {
                    y00Var.getClass();
                    x00 n = y00Var.n();
                    y00 f = vg.f(y00Var);
                    x00.b(f, "cacheResponse");
                    n.i = f;
                    return n.a();
                }
                y00 b2 = azVar.b(ppVar3);
                if (y00Var != null) {
                    if (b2.i == 304) {
                        x00 n2 = y00Var.n();
                        nn nnVar2 = y00Var.k;
                        nn nnVar3 = b2.k;
                        ArrayList arrayList = new ArrayList(20);
                        int size = nnVar2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            String b3 = nnVar2.b(i3);
                            Long l = r4;
                            String d = nnVar2.d(i3);
                            if ("Warning".equalsIgnoreCase(b3)) {
                                nnVar = nnVar2;
                                if (t40.e0(d, "1", false)) {
                                    i3++;
                                    r4 = l;
                                    nnVar2 = nnVar;
                                }
                            } else {
                                nnVar = nnVar2;
                            }
                            if ("Content-Length".equalsIgnoreCase(b3) || "Content-Encoding".equalsIgnoreCase(b3) || "Content-Type".equalsIgnoreCase(b3) || !vg.n(b3) || nnVar3.a(b3) == null) {
                                b3.getClass();
                                d.getClass();
                                arrayList.add(b3);
                                arrayList.add(l40.q0(d).toString());
                            }
                            i3++;
                            r4 = l;
                            nnVar2 = nnVar;
                        }
                        ?? r24 = r4;
                        int size2 = nnVar3.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            String b4 = nnVar3.b(i4);
                            if (!"Content-Length".equalsIgnoreCase(b4) && !"Content-Encoding".equalsIgnoreCase(b4) && !"Content-Type".equalsIgnoreCase(b4) && vg.n(b4)) {
                                String d2 = nnVar3.d(i4);
                                b4.getClass();
                                d2.getClass();
                                arrayList.add(b4);
                                arrayList.add(l40.q0(d2).toString());
                            }
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        j1 j1Var = new j1(21);
                        ArrayList arrayList2 = (ArrayList) j1Var.g;
                        arrayList2.getClass();
                        strArr.getClass();
                        List asList = Arrays.asList(strArr);
                        asList.getClass();
                        arrayList2.addAll(asList);
                        n2.f = j1Var;
                        n2.k = b2.p;
                        n2.l = b2.q;
                        y00 f2 = vg.f(y00Var);
                        x00.b(f2, "cacheResponse");
                        n2.i = f2;
                        y00 f3 = vg.f(b2);
                        x00.b(f3, "networkResponse");
                        n2.h = f3;
                        n2.a();
                        a10 a10Var2 = b2.l;
                        a10Var2.getClass();
                        a10Var2.close();
                        throw r24;
                    }
                    a10 a10Var3 = y00Var.l;
                    if (a10Var3 != null) {
                        y70.b(a10Var3);
                    }
                }
                x00 n3 = b2.n();
                y00 f4 = vg.f(y00Var);
                x00.b(f4, "cacheResponse");
                n3.i = f4;
                y00 f5 = vg.f(b2);
                x00.b(f5, "networkResponse");
                n3.h = f5;
                return n3.a();
            case 1:
                vy vyVar = azVar.a;
                synchronized (vyVar) {
                    try {
                        if (!vyVar.q) {
                            throw new IllegalStateException("released");
                        }
                        if (vyVar.p) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (vyVar.o) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ii iiVar = vyVar.l;
                iiVar.getClass();
                bw bwVar = vyVar.f;
                try {
                    gi giVar = new gi(vyVar, iiVar, iiVar.a(azVar.f, azVar.g, azVar.h, bwVar.k, !op.d((String) azVar.e.c, "GET")).j(bwVar, azVar));
                    vyVar.n = giVar;
                    vyVar.s = giVar;
                    synchronized (vyVar) {
                        vyVar.o = true;
                        vyVar.p = true;
                    }
                    if (!vyVar.r) {
                        return az.a(azVar, 0, giVar, null, 61).b(azVar.e);
                    }
                    o8.x("Canceled");
                    return null;
                } catch (i10 e) {
                    iiVar.b(e.g);
                    throw e;
                } catch (IOException e2) {
                    iiVar.b(e2);
                    throw new i10(e2);
                }
            default:
                gi giVar2 = azVar.d;
                giVar2.getClass();
                vy vyVar2 = giVar2.a;
                hi hiVar = giVar2.c;
                yy yyVar = giVar2.e;
                pp ppVar4 = azVar.e;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        hiVar.f(ppVar4);
                        l70.I((String) ppVar4.c);
                        vyVar2.g(giVar2, true, false, null);
                    } catch (IOException e3) {
                        if (e3 instanceof fc) {
                            throw e3;
                        }
                        if (!giVar2.d) {
                            throw e3;
                        }
                        iOException = e3;
                    }
                    try {
                        hiVar.b();
                        iOException = null;
                        try {
                            x00 a2 = giVar2.a(false);
                            a2.getClass();
                            a2.a = ppVar4;
                            a2.e = yyVar.e;
                            a2.k = currentTimeMillis;
                            a2.l = System.currentTimeMillis();
                            y00 a3 = a2.a();
                            int i5 = a3.i;
                            try {
                                if (i5 != 100) {
                                    if (102 <= i5) {
                                        break;
                                    }
                                    x00 n4 = a3.n();
                                    String m = y00.m(a3, "Content-Type");
                                    long d3 = hiVar.d(a3);
                                    n4.g = new bz(m, d3, new ry(new fi(giVar2, hiVar.a(a3), d3)));
                                    a = n4.a();
                                    ppVar = a.f;
                                    ppVar.getClass();
                                    if (!"close".equalsIgnoreCase(((nn) ppVar.d).a("Connection")) || "close".equalsIgnoreCase(y00.m(a, "Connection"))) {
                                        hiVar.g().k();
                                    }
                                    if (i5 != 204 || i5 == 205) {
                                        a10Var = a.l;
                                        if ((a10Var == null ? a10Var.m() : -1L) > 0) {
                                            StringBuilder sb = new StringBuilder("HTTP ");
                                            sb.append(i5);
                                            sb.append(" had non-zero Content-Length: ");
                                            a10 a10Var4 = a.l;
                                            sb.append(a10Var4 != null ? Long.valueOf(a10Var4.m()) : null);
                                            throw new ProtocolException(sb.toString());
                                        }
                                    }
                                    return a;
                                }
                                String m2 = y00.m(a3, "Content-Type");
                                long d32 = hiVar.d(a3);
                                n4.g = new bz(m2, d32, new ry(new fi(giVar2, hiVar.a(a3), d32)));
                                a = n4.a();
                                ppVar = a.f;
                                ppVar.getClass();
                                if (!"close".equalsIgnoreCase(((nn) ppVar.d).a("Connection"))) {
                                }
                                hiVar.g().k();
                                if (i5 != 204) {
                                }
                                a10Var = a.l;
                                if ((a10Var == null ? a10Var.m() : -1L) > 0) {
                                }
                                return a;
                            } catch (IOException e4) {
                                giVar2.b(e4);
                                throw e4;
                            }
                            x00 a4 = giVar2.a(false);
                            a4.getClass();
                            a4.a = ppVar4;
                            a4.e = yyVar.e;
                            a4.k = currentTimeMillis;
                            a4.l = System.currentTimeMillis();
                            a3 = a4.a();
                            i5 = a3.i;
                            x00 n42 = a3.n();
                        } catch (IOException e5) {
                            if (iOException == null) {
                                throw e5;
                            }
                            j8.b(iOException, e5);
                            throw iOException;
                        }
                    } catch (IOException e6) {
                        giVar2.b(e6);
                        throw e6;
                    }
                } catch (IOException e7) {
                    giVar2.b(e7);
                    throw e7;
                }
        }
    }
}
