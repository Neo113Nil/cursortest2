package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class iz0 implements qk0 {
    public static final gr f = new gr(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
    public static final gr g = new gr(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
    public final String a;
    public final uw1 b;
    public final y91 c;
    public final y91 d;
    public final boolean e;

    public iz0(String str, uw1 uw1Var, y91 y91Var, y91 y91Var2, boolean z) {
        this.a = str;
        this.b = uw1Var;
        this.c = y91Var;
        this.d = y91Var2;
        this.e = z;
    }

    public static String d(String str, zj1 zj1Var) {
        String b;
        String str2 = zj1Var != null ? zj1Var.a : null;
        if ((str2 == null || tp2.o(str2, "text/plain", false)) && (b = l.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b;
        }
        if (str2 == null) {
            return null;
        }
        int v = up2.v(str2, ';', 0, 6);
        return v == -1 ? str2 : str2.substring(0, v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0126 A[Catch: Exception -> 0x0052, TryCatch #4 {Exception -> 0x0052, blocks: (B:43:0x0049, B:45:0x0148, B:47:0x021b, B:48:0x0220, B:89:0x0092, B:91:0x009c, B:94:0x00ca, B:96:0x00ce, B:99:0x00e7, B:101:0x0133, B:104:0x00ff, B:106:0x010b, B:107:0x0114, B:109:0x00b0, B:111:0x00ba, B:113:0x011e, B:114:0x0125, B:115:0x0126), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01da A[Catch: Exception -> 0x0205, TryCatch #3 {Exception -> 0x0205, blocks: (B:17:0x01d4, B:19:0x01da, B:21:0x01fc, B:22:0x0201, B:25:0x01ff, B:26:0x020a, B:27:0x020f), top: B:16:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x020a A[Catch: Exception -> 0x0205, TryCatch #3 {Exception -> 0x0205, blocks: (B:17:0x01d4, B:19:0x01da, B:21:0x01fc, B:22:0x0201, B:25:0x01ff, B:26:0x020a, B:27:0x020f), top: B:16:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021b A[Catch: Exception -> 0x0052, TRY_ENTER, TryCatch #4 {Exception -> 0x0052, blocks: (B:43:0x0049, B:45:0x0148, B:47:0x021b, B:48:0x0220, B:89:0x0092, B:91:0x009c, B:94:0x00ca, B:96:0x00ce, B:99:0x00e7, B:101:0x0133, B:104:0x00ff, B:106:0x010b, B:107:0x0114, B:109:0x00b0, B:111:0x00ba, B:113:0x011e, B:114:0x0125, B:115:0x0126), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0092 A[Catch: Exception -> 0x0052, TRY_ENTER, TryCatch #4 {Exception -> 0x0052, blocks: (B:43:0x0049, B:45:0x0148, B:47:0x021b, B:48:0x0220, B:89:0x0092, B:91:0x009c, B:94:0x00ca, B:96:0x00ce, B:99:0x00e7, B:101:0x0133, B:104:0x00ff, B:106:0x010b, B:107:0x0114, B:109:0x00b0, B:111:0x00ba, B:113:0x011e, B:114:0x0125, B:115:0x0126), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    @Override // defpackage.qk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o30 o30Var) {
        hz0 hz0Var;
        ?? r2;
        x62 x62Var;
        or a;
        Object b;
        y62 y62Var;
        t01 t01Var;
        x62 x62Var2;
        w92 w92Var;
        x62 h;
        String str;
        iz0 iz0Var;
        w92 w92Var2;
        t01 t01Var2;
        try {
            if (o30Var instanceof hz0) {
                hz0Var = (hz0) o30Var;
                int i = hz0Var.r;
                if ((i & Integer.MIN_VALUE) != 0) {
                    hz0Var.r = i - Integer.MIN_VALUE;
                    Object obj = hz0Var.p;
                    b50 b50Var = b50.m;
                    r2 = hz0Var.r;
                    if (r2 != 0) {
                        ca2.b(obj);
                        uw1 uw1Var = this.b;
                        boolean z = uw1Var.n.m;
                        String str2 = this.a;
                        if (z && (y62Var = (y62) this.d.getValue()) != null) {
                            String str3 = uw1Var.i;
                            if (str3 == null) {
                                str3 = str2;
                            }
                            ob0 ob0Var = y62Var.b;
                            dr drVar = dr.p;
                            mb0 m = ob0Var.m(nj.j(str3).b("SHA-256").d());
                            if (m != null) {
                                x62Var = new x62(m);
                                if (x62Var == null) {
                                    gl0 c = c();
                                    mb0 mb0Var = x62Var.m;
                                    if (mb0Var.n) {
                                        throw new IllegalStateException("snapshot is closed");
                                    }
                                    Long l = c.h((qz1) mb0Var.m.c.get(0)).d;
                                    if (l != null && l.longValue() == 0) {
                                        return new tn2(g(x62Var), d(str2, null), m60.o);
                                    }
                                    if (!this.e) {
                                        wk0 g2 = g(x62Var);
                                        mr f2 = f(x62Var);
                                        return new tn2(g2, d(str2, f2 != null ? (zj1) f2.b.getValue() : null), m60.o);
                                    }
                                    a = new nr(e(), f(x62Var)).a();
                                    mr mrVar = a.b;
                                    if (a.a == null && mrVar != null) {
                                        return new tn2(g(x62Var), d(str2, (zj1) mrVar.b.getValue()), m60.o);
                                    }
                                } else {
                                    a = new nr(e(), null).a();
                                }
                                fy fyVar = a.a;
                                fyVar.getClass();
                                hz0Var.m = this;
                                hz0Var.n = x62Var;
                                hz0Var.o = a;
                                hz0Var.r = 1;
                                b = b(fyVar, hz0Var);
                                if (b == b50Var) {
                                    return b50Var;
                                }
                            }
                        }
                        x62Var = null;
                        if (x62Var == null) {
                        }
                        fy fyVar2 = a.a;
                        fyVar2.getClass();
                        hz0Var.m = this;
                        hz0Var.n = x62Var;
                        hz0Var.o = a;
                        hz0Var.r = 1;
                        b = b(fyVar2, hz0Var);
                        if (b == b50Var) {
                        }
                    } else {
                        if (r2 != 1) {
                            if (r2 != 2) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            w92Var = (w92) hz0Var.o;
                            x62Var2 = hz0Var.n;
                            iz0Var = hz0Var.m;
                            try {
                                ca2.b(obj);
                                w92Var2 = (w92) obj;
                            } catch (Exception e) {
                                e = e;
                                try {
                                    l.a(w92Var);
                                    throw e;
                                } catch (Exception e2) {
                                    e = e2;
                                    r2 = x62Var2;
                                    if (r2 != 0) {
                                        l.a(r2);
                                    }
                                    throw e;
                                }
                            }
                            try {
                                Bitmap.Config[] configArr = l.a;
                                t01Var2 = w92Var2.s;
                                if (t01Var2 == null) {
                                    return new tn2(new qn2(t01Var2.n(), new u01(iz0Var.b.a, 1), null), d(iz0Var.a, t01Var2.f()), w92Var2.t != null ? m60.p : m60.o);
                                }
                                throw new IllegalStateException("response body == null");
                            } catch (Exception e3) {
                                e = e3;
                                w92Var = w92Var2;
                                l.a(w92Var);
                                throw e;
                            }
                        }
                        or orVar = (or) hz0Var.o;
                        x62Var = hz0Var.n;
                        iz0 iz0Var2 = hz0Var.m;
                        ca2.b(obj);
                        a = orVar;
                        this = iz0Var2;
                        b = obj;
                    }
                    w92 w92Var3 = (w92) b;
                    Bitmap.Config[] configArr2 = l.a;
                    t01Var = w92Var3.s;
                    if (t01Var != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    try {
                        h = this.h(x62Var, a.a, w92Var3, a.b);
                        str = this.a;
                    } catch (Exception e4) {
                        e = e4;
                        x62Var2 = x62Var;
                    }
                    try {
                        if (h != null) {
                            wk0 g3 = this.g(h);
                            mr f3 = this.f(h);
                            return new tn2(g3, d(str, f3 != null ? (zj1) f3.b.getValue() : null), m60.p);
                        }
                        if (t01Var.n().request(1L)) {
                            return new tn2(new qn2(t01Var.n(), new u01(this.b.a, 1), null), d(str, t01Var.f()), w92Var3.t != null ? m60.p : m60.o);
                        }
                        l.a(w92Var3);
                        fy e5 = this.e();
                        hz0Var.m = this;
                        hz0Var.n = h;
                        hz0Var.o = w92Var3;
                        hz0Var.r = 2;
                        Object b2 = this.b(e5, hz0Var);
                        if (b2 != b50Var) {
                            x62Var2 = h;
                            obj = b2;
                            iz0Var = this;
                            w92Var = w92Var3;
                            w92Var2 = (w92) obj;
                            Bitmap.Config[] configArr3 = l.a;
                            t01Var2 = w92Var2.s;
                            if (t01Var2 == null) {
                            }
                        }
                        return b50Var;
                    } catch (Exception e6) {
                        x62Var2 = h;
                        e = e6;
                        w92Var = w92Var3;
                        l.a(w92Var);
                        throw e;
                    }
                }
            }
            if (r2 != 0) {
            }
            w92 w92Var32 = (w92) b;
            Bitmap.Config[] configArr22 = l.a;
            t01Var = w92Var32.s;
            if (t01Var != null) {
            }
        } catch (Exception e7) {
            e = e7;
        }
        hz0Var = new hz0(this, (r30) o30Var);
        Object obj2 = hz0Var.p;
        b50 b50Var2 = b50.m;
        r2 = hz0Var.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0126, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(fy fyVar, r30 r30Var) {
        gz0 gz0Var;
        int i;
        q62 q62Var;
        w92 f2;
        int i2;
        t01 t01Var;
        if (r30Var instanceof gz0) {
            gz0Var = (gz0) r30Var;
            int i3 = gz0Var.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gz0Var.o = i3 - Integer.MIN_VALUE;
                Object obj = gz0Var.m;
                b50 b50Var = b50.m;
                i = gz0Var.o;
                q62 q62Var2 = null;
                if (i != 0) {
                    ca2.b(obj);
                    Bitmap.Config[] configArr = l.a;
                    int i4 = 0;
                    if (Intrinsics.b(Looper.myLooper(), Looper.getMainLooper())) {
                        if (this.b.o.m) {
                            throw new NetworkOnMainThreadException();
                        }
                        fu1 fu1Var = (fu1) this.c.getValue();
                        fu1Var.getClass();
                        fyVar.getClass();
                        t62 t62Var = new t62(fu1Var, fyVar);
                        if (!t62Var.q.compareAndSet(false, true)) {
                            lh.g("Already Executed");
                            return null;
                        }
                        t62Var.p.h();
                        r12 r12Var = r12.a;
                        t62Var.r = r12.a.g();
                        try {
                            js0 js0Var = fu1Var.m;
                            synchronized (js0Var) {
                                ((ArrayDeque) js0Var.p).add(t62Var);
                            }
                            f2 = t62Var.f();
                            js0 js0Var2 = fu1Var.m;
                            js0Var2.getClass();
                            js0Var2.p((ArrayDeque) js0Var2.p, t62Var);
                            i2 = f2.p;
                            if ((200 > i2 && i2 < 300) || i2 == 304) {
                                return f2;
                            }
                            t01Var = f2.s;
                            if (t01Var != null) {
                                l.a(t01Var);
                            }
                            throw new hx("HTTP " + f2.p + ": " + f2.o);
                        } catch (Throwable th) {
                            js0 js0Var3 = t62Var.m.m;
                            js0Var3.getClass();
                            js0Var3.p((ArrayDeque) js0Var3.p, t62Var);
                            throw th;
                        }
                    }
                    fu1 fu1Var2 = (fu1) this.c.getValue();
                    fu1Var2.getClass();
                    fyVar.getClass();
                    t62 t62Var2 = new t62(fu1Var2, fyVar);
                    gz0Var.o = 1;
                    fs fsVar = new fs(1, q41.b(gz0Var));
                    fsVar.u();
                    q30 q30Var = new q30(i4, t62Var2, fsVar);
                    if (!t62Var2.q.compareAndSet(false, true)) {
                        lh.g("Already Executed");
                        return null;
                    }
                    r12 r12Var2 = r12.a;
                    t62Var2.r = r12.a.g();
                    js0 js0Var4 = fu1Var2.m;
                    q62 q62Var3 = new q62(t62Var2, q30Var);
                    js0Var4.getClass();
                    synchronized (js0Var4) {
                        ((ArrayDeque) js0Var4.n).add(q62Var3);
                        String str = ((kz0) fyVar.n).d;
                        Iterator it = ((ArrayDeque) js0Var4.o).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                q62Var = (q62) it.next();
                                if (Intrinsics.b(((kz0) q62Var.o.n.n).d, str)) {
                                    break;
                                }
                            } else {
                                Iterator it2 = ((ArrayDeque) js0Var4.n).iterator();
                                while (it2.hasNext()) {
                                    q62Var = (q62) it2.next();
                                    if (Intrinsics.b(((kz0) q62Var.o.n.n).d, str)) {
                                    }
                                }
                            }
                        }
                        if (q62Var2 != null) {
                            q62Var3.n = q62Var2.n;
                        }
                        Unit unit = Unit.a;
                    }
                    js0Var4.E();
                    fsVar.w(q30Var);
                    obj = fsVar.s();
                    b50 b50Var2 = b50.m;
                    if (obj == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                f2 = (w92) obj;
                i2 = f2.p;
                if (200 > i2) {
                }
                t01Var = f2.s;
                if (t01Var != null) {
                }
                throw new hx("HTTP " + f2.p + ": " + f2.o);
            }
        }
        gz0Var = new gz0(this, r30Var);
        Object obj2 = gz0Var.m;
        b50 b50Var3 = b50.m;
        i = gz0Var.o;
        q62 q62Var22 = null;
        if (i != 0) {
        }
        f2 = (w92) obj2;
        i2 = f2.p;
        if (200 > i2) {
        }
        t01Var = f2.s;
        if (t01Var != null) {
        }
        throw new hx("HTTP " + f2.p + ": " + f2.o);
    }

    public final gl0 c() {
        Object value = this.d.getValue();
        value.getClass();
        return ((y62) value).a;
    }

    public final fy e() {
        js0 js0Var = new js0(8);
        String str = this.a;
        str.getClass();
        if (tp2.o(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (tp2.o(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        jz0 jz0Var = new jz0();
        jz0Var.c(null, str);
        js0Var.m = jz0Var.a();
        uw1 uw1Var = this.b;
        mx0 mx0Var = uw1Var.j;
        mx0Var.getClass();
        js0Var.o = mx0Var.c();
        for (Map.Entry entry : uw1Var.k.a.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Class cls = (Class) key;
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = (LinkedHashMap) js0Var.p;
            if (value == null) {
                linkedHashMap.remove(cls);
            } else {
                if (linkedHashMap.isEmpty()) {
                    js0Var.p = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) js0Var.p;
                Object cast = cls.cast(value);
                cast.getClass();
                linkedHashMap2.put(cls, cast);
            }
        }
        kr krVar = uw1Var.n;
        boolean z = krVar.m;
        boolean z2 = uw1Var.o.m;
        if (!z2 && z) {
            js0Var.d(gr.o);
        } else if (!z2 || z) {
            if (!z2 && !z) {
                js0Var.d(g);
            }
        } else if (krVar.n) {
            js0Var.d(gr.n);
        } else {
            js0Var.d(f);
        }
        return js0Var.c();
    }

    public final mr f(x62 x62Var) {
        Throwable th;
        mr mrVar;
        try {
            gl0 c = c();
            mb0 mb0Var = x62Var.m;
            if (mb0Var.n) {
                throw new IllegalStateException("snapshot is closed");
            }
            pn2 l = c.l((qz1) mb0Var.m.c.get(0));
            l.getClass();
            p62 p62Var = new p62(l);
            try {
                mrVar = new mr(p62Var);
                try {
                    p62Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    p62Var.close();
                } catch (Throwable th4) {
                    wi0.a(th3, th4);
                }
                th = th3;
                mrVar = null;
            }
            if (th == null) {
                return mrVar;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public final wk0 g(x62 x62Var) {
        mb0 mb0Var = x62Var.m;
        if (mb0Var.n) {
            lh.g("snapshot is closed");
            return null;
        }
        qz1 qz1Var = (qz1) mb0Var.m.c.get(1);
        gl0 c = c();
        String str = this.b.i;
        if (str == null) {
            str = this.a;
        }
        return new wk0(qz1Var, c, str, x62Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.b(r6.r.a("Vary"), "*") == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x62 h(x62 x62Var, fy fyVar, w92 w92Var, mr mrVar) {
        at0 at0Var;
        w50 f2;
        Throwable th = null;
        if (this.b.n.n) {
            if (this.e) {
                if (!fyVar.g().b) {
                    gr grVar = w92Var.z;
                    if (grVar == null) {
                        gr grVar2 = gr.n;
                        grVar = tk3.W(w92Var.r);
                        w92Var.z = grVar;
                    }
                    if (!grVar.b) {
                    }
                }
            }
            if (x62Var == null) {
                y62 y62Var = (y62) this.d.getValue();
                if (y62Var != null) {
                    String str = this.b.i;
                    if (str == null) {
                        str = this.a;
                    }
                    ob0 ob0Var = y62Var.b;
                    dr drVar = dr.p;
                    w50 f3 = ob0Var.f(nj.j(str).b("SHA-256").d());
                    if (f3 != null) {
                        at0Var = new at0(f3);
                        if (at0Var != null) {
                        }
                        return null;
                    }
                }
                at0Var = null;
                if (at0Var != null) {
                }
                return null;
            }
            mb0 mb0Var = x62Var.m;
            ob0 ob0Var2 = mb0Var.o;
            synchronized (ob0Var2) {
                mb0Var.close();
                f2 = ob0Var2.f(mb0Var.m.a);
            }
            if (f2 != null) {
                at0Var = new at0(f2);
                if (at0Var != null) {
                    try {
                        try {
                            if (w92Var.p != 304 || mrVar == null) {
                                ol2 k = c().k(((w50) at0Var.m).c(0));
                                k.getClass();
                                n62 n62Var = new n62(k);
                                try {
                                    new mr(w92Var).a(n62Var);
                                    Unit unit = Unit.a;
                                    try {
                                        n62Var.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        n62Var.close();
                                    } catch (Throwable th4) {
                                        wi0.a(th, th4);
                                    }
                                }
                                if (th != null) {
                                    throw th;
                                }
                                ol2 k2 = c().k(((w50) at0Var.m).c(1));
                                k2.getClass();
                                n62 n62Var2 = new n62(k2);
                                try {
                                    t01 t01Var = w92Var.s;
                                    t01Var.getClass();
                                    t01Var.n().x(n62Var2);
                                    try {
                                        n62Var2.close();
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    try {
                                        n62Var2.close();
                                    } catch (Throwable th7) {
                                        wi0.a(th, th7);
                                    }
                                }
                                if (th != null) {
                                    throw th;
                                }
                            } else {
                                v92 f4 = w92Var.f();
                                f4.f = yk3.y(mrVar.f, w92Var.r).c();
                                w92 a = f4.a();
                                ol2 k3 = c().k(((w50) at0Var.m).c(0));
                                k3.getClass();
                                n62 n62Var3 = new n62(k3);
                                try {
                                    new mr(a).a(n62Var3);
                                    Unit unit2 = Unit.a;
                                    try {
                                        n62Var3.close();
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    try {
                                        n62Var3.close();
                                    } catch (Throwable th10) {
                                        wi0.a(th, th10);
                                    }
                                }
                                if (th != null) {
                                    throw th;
                                }
                            }
                            x62 g2 = at0Var.g();
                            l.a(w92Var);
                            return g2;
                        } catch (Throwable th11) {
                            l.a(w92Var);
                            throw th11;
                        }
                    } catch (Exception e) {
                        Bitmap.Config[] configArr = l.a;
                        try {
                            ((w50) at0Var.m).b(false);
                        } catch (Exception unused) {
                        }
                        throw e;
                    }
                }
                return null;
            }
            at0Var = null;
            if (at0Var != null) {
            }
            return null;
        }
        if (x62Var != null) {
            l.a(x62Var);
        }
        return null;
    }
}
