package defpackage;

import com.facebook.appevents.AppEventsConstants;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jr implements d41 {
    public static final jr b = new jr(1);
    public final /* synthetic */ int a;

    public /* synthetic */ jr(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x007e, code lost:
    
        if (r13 < 200) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6 A[Catch: IOException -> 0x009c, TryCatch #8 {IOException -> 0x009c, blocks: (B:11:0x0058, B:14:0x0080, B:15:0x009f, B:18:0x00c0, B:20:0x00d9, B:28:0x00f2, B:30:0x00f6, B:33:0x0103, B:35:0x0116, B:36:0x011e, B:37:0x0128, B:39:0x00e3, B:42:0x012b, B:43:0x012e, B:17:0x00a3), top: B:10:0x0058, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103 A[Catch: IOException -> 0x009c, TryCatch #8 {IOException -> 0x009c, blocks: (B:11:0x0058, B:14:0x0080, B:15:0x009f, B:18:0x00c0, B:20:0x00d9, B:28:0x00f2, B:30:0x00f6, B:33:0x0103, B:35:0x0116, B:36:0x011e, B:37:0x0128, B:39:0x00e3, B:42:0x012b, B:43:0x012e, B:17:0x00a3), top: B:10:0x0058, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.Throwable] */
    @Override // defpackage.d41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w92 a(sa1 sa1Var) {
        mx0 mx0Var;
        IOException iOException;
        w92 a;
        fy fyVar;
        t01 t01Var;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                fy fyVar2 = (fy) sa1Var.i;
                fyVar2.getClass();
                int i = 7;
                t21 t21Var = new t21(i, fyVar2, r3);
                if (fyVar2.g().j) {
                    t21Var = new t21(i, r3, r3);
                }
                fy fyVar3 = (fy) t21Var.n;
                w92 w92Var = (w92) t21Var.o;
                if (fyVar3 == null && w92Var == null) {
                    return new w92(fyVar2, s52.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new mx0((String[]) new ArrayList(20).toArray(new String[0])), n33.c, null, null, null, -1L, System.currentTimeMillis(), null);
                }
                if (fyVar3 == null) {
                    w92Var.getClass();
                    v92 f = w92Var.f();
                    w92 d = nj.d(w92Var);
                    v92.b(d, "cacheResponse");
                    f.i = d;
                    return f.a();
                }
                w92 f2 = sa1Var.f(fyVar3);
                if (w92Var != null) {
                    if (f2.p == 304) {
                        v92 f3 = w92Var.f();
                        mx0 mx0Var2 = w92Var.r;
                        mx0 mx0Var3 = f2.r;
                        ArrayList arrayList = new ArrayList(20);
                        int size = mx0Var2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            String b2 = mx0Var2.b(i2);
                            Long l = r3;
                            String d2 = mx0Var2.d(i2);
                            if ("Warning".equalsIgnoreCase(b2)) {
                                mx0Var = mx0Var2;
                                if (tp2.o(d2, AppEventsConstants.EVENT_PARAM_VALUE_YES, false)) {
                                    i2++;
                                    r3 = l;
                                    mx0Var2 = mx0Var;
                                }
                            } else {
                                mx0Var = mx0Var2;
                            }
                            if ("Content-Length".equalsIgnoreCase(b2) || "Content-Encoding".equalsIgnoreCase(b2) || "Content-Type".equalsIgnoreCase(b2) || !nj.t(b2) || mx0Var3.a(b2) == null) {
                                b2.getClass();
                                d2.getClass();
                                arrayList.add(b2);
                                arrayList.add(up2.K(d2).toString());
                            }
                            i2++;
                            r3 = l;
                            mx0Var2 = mx0Var;
                        }
                        ?? r25 = r3;
                        int size2 = mx0Var3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            String b3 = mx0Var3.b(i3);
                            if (!"Content-Length".equalsIgnoreCase(b3) && !"Content-Encoding".equalsIgnoreCase(b3) && !"Content-Type".equalsIgnoreCase(b3) && nj.t(b3)) {
                                String d3 = mx0Var3.d(i3);
                                b3.getClass();
                                d3.getClass();
                                arrayList.add(b3);
                                arrayList.add(up2.K(d3).toString());
                            }
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        lx0 lx0Var = new lx0(0);
                        ArrayList arrayList2 = lx0Var.m;
                        arrayList2.getClass();
                        strArr.getClass();
                        List asList = Arrays.asList(strArr);
                        asList.getClass();
                        arrayList2.addAll(asList);
                        f3.f = lx0Var;
                        f3.k = f2.w;
                        f3.l = f2.x;
                        w92 d4 = nj.d(w92Var);
                        v92.b(d4, "cacheResponse");
                        f3.i = d4;
                        w92 d5 = nj.d(f2);
                        v92.b(d5, "networkResponse");
                        f3.h = d5;
                        f3.a();
                        t01 t01Var2 = f2.s;
                        t01Var2.getClass();
                        t01Var2.close();
                        throw r25;
                    }
                    t01 t01Var3 = w92Var.s;
                    if (t01Var3 != null) {
                        n33.b(t01Var3);
                    }
                }
                v92 f4 = f2.f();
                w92 d6 = nj.d(w92Var);
                v92.b(d6, "cacheResponse");
                f4.i = d6;
                w92 d7 = nj.d(f2);
                v92.b(d7, "networkResponse");
                f4.h = d7;
                return f4.a();
            case 1:
                t62 t62Var = (t62) sa1Var.g;
                synchronized (t62Var) {
                    if (!t62Var.x) {
                        throw new IllegalStateException("released");
                    }
                    if (t62Var.w) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (t62Var.v) {
                        throw new IllegalStateException("Check failed.");
                    }
                    Unit unit = Unit.a;
                }
                zi0 zi0Var = t62Var.s;
                zi0Var.getClass();
                fu1 fu1Var = t62Var.m;
                try {
                    yi0 j = zi0Var.a(sa1Var.c, sa1Var.d, sa1Var.e, fu1Var.r, !Intrinsics.b((String) ((fy) sa1Var.i).o, "GET")).j(fu1Var, sa1Var);
                    zi0Var.getClass();
                    du duVar = new du();
                    duVar.b = t62Var;
                    duVar.c = zi0Var;
                    duVar.d = j;
                    duVar.e = j.g();
                    t62Var.u = duVar;
                    t62Var.z = duVar;
                    synchronized (t62Var) {
                        t62Var.v = true;
                        t62Var.w = true;
                    }
                    if (!t62Var.y) {
                        return sa1.a(sa1Var, 0, duVar, null, 61).f((fy) sa1Var.i);
                    }
                    dm0.j("Canceled");
                    return null;
                } catch (bc2 e) {
                    zi0Var.b(e.n);
                    throw e;
                } catch (IOException e2) {
                    zi0Var.b(e2);
                    throw new bc2(e2);
                }
            default:
                du duVar2 = (du) sa1Var.h;
                duVar2.getClass();
                t62 t62Var2 = (t62) duVar2.b;
                yi0 yi0Var = (yi0) duVar2.d;
                v62 v62Var = (v62) duVar2.e;
                fy fyVar4 = (fy) sa1Var.i;
                fyVar4.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        yi0Var.e(fyVar4);
                        ll3.O((String) fyVar4.o);
                        t62Var2.g(duVar2, true, false, null);
                        try {
                            yi0Var.b();
                            iOException = null;
                        } catch (IOException e3) {
                            duVar2.g(e3);
                            throw e3;
                        }
                    } catch (IOException e4) {
                        duVar2.g(e4);
                        throw e4;
                    }
                } catch (IOException e5) {
                    if (e5 instanceof d10) {
                        throw e5;
                    }
                    if (!duVar2.a) {
                        throw e5;
                    }
                    iOException = e5;
                }
                try {
                    v92 f5 = duVar2.f(false);
                    f5.getClass();
                    f5.a = fyVar4;
                    f5.e = v62Var.e;
                    f5.k = currentTimeMillis;
                    f5.l = System.currentTimeMillis();
                    w92 a2 = f5.a();
                    int i4 = a2.p;
                    try {
                        if (i4 != 100) {
                            if (102 <= i4) {
                                break;
                            }
                            v92 f6 = a2.f();
                            String b4 = w92.b(a2, "Content-Type");
                            long d8 = yi0Var.d(a2);
                            f6.g = new g72(b4, d8, new p62(new xi0(duVar2, yi0Var.a(a2), d8)));
                            a = f6.a();
                            fyVar = a.m;
                            fyVar.getClass();
                            if (!"close".equalsIgnoreCase(((mx0) fyVar.p).a("Connection")) || "close".equalsIgnoreCase(w92.b(a, "Connection"))) {
                                yi0Var.g().k();
                            }
                            if (i4 != 204 || i4 == 205) {
                                t01Var = a.s;
                                if ((t01Var == null ? t01Var.b() : -1L) > 0) {
                                    StringBuilder sb = new StringBuilder("HTTP ");
                                    sb.append(i4);
                                    sb.append(" had non-zero Content-Length: ");
                                    t01 t01Var4 = a.s;
                                    sb.append(t01Var4 != null ? Long.valueOf(t01Var4.b()) : null);
                                    throw new ProtocolException(sb.toString());
                                }
                            }
                            return a;
                        }
                        String b42 = w92.b(a2, "Content-Type");
                        long d82 = yi0Var.d(a2);
                        f6.g = new g72(b42, d82, new p62(new xi0(duVar2, yi0Var.a(a2), d82)));
                        a = f6.a();
                        fyVar = a.m;
                        fyVar.getClass();
                        if (!"close".equalsIgnoreCase(((mx0) fyVar.p).a("Connection"))) {
                        }
                        yi0Var.g().k();
                        if (i4 != 204) {
                        }
                        t01Var = a.s;
                        if ((t01Var == null ? t01Var.b() : -1L) > 0) {
                        }
                        return a;
                    } catch (IOException e6) {
                        duVar2.g(e6);
                        throw e6;
                    }
                    v92 f7 = duVar2.f(false);
                    f7.getClass();
                    f7.a = fyVar4;
                    f7.e = v62Var.e;
                    f7.k = currentTimeMillis;
                    f7.l = System.currentTimeMillis();
                    a2 = f7.a();
                    i4 = a2.p;
                    v92 f62 = a2.f();
                } catch (IOException e7) {
                    if (iOException == null) {
                        throw e7;
                    }
                    wi0.a(iOException, e7);
                    throw iOException;
                }
        }
    }
}
