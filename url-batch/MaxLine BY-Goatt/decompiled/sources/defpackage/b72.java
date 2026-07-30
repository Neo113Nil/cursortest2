package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.coroutines.f;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b72 {
    public final Context a;
    public final r80 b;
    public final y91 c;
    public final p01 d;
    public final tt1 e;
    public final gy f;
    public final ArrayList g;

    public b72(Context context, r80 r80Var, y91 y91Var, y91 y91Var2, y91 y91Var3, gy gyVar, p01 p01Var) {
        this.a = context;
        this.b = r80Var;
        this.c = y91Var;
        this.d = p01Var;
        oq2 a = gk2.a();
        t80 t80Var = vb0.a;
        j8.b(f.c(a, qh1.a.r).p(new np0(this)));
        fs2 fs2Var = new fs2(this);
        tt1 tt1Var = new tt1(this, fs2Var);
        this.e = tt1Var;
        fy fyVar = new fy(gyVar);
        fyVar.d(new xq(2), kz0.class);
        int i = 5;
        fyVar.d(new xq(i), String.class);
        fyVar.d(new xq(1), Uri.class);
        int i2 = 4;
        fyVar.d(new xq(i2), Uri.class);
        int i3 = 3;
        fyVar.d(new xq(i3), Integer.class);
        int i4 = 0;
        fyVar.d(new xq(i4), byte[].class);
        g33 g33Var = new g33();
        ArrayList arrayList = (ArrayList) fyVar.p;
        arrayList.add(new Pair(g33Var, Uri.class));
        arrayList.add(new Pair(new xk0(p01Var.a), File.class));
        fyVar.e(new fz0(y91Var3, y91Var2, p01Var.c), Uri.class);
        fyVar.e(new ri(i), File.class);
        fyVar.e(new ri(i4), Uri.class);
        fyVar.e(new ri(i3), Uri.class);
        fyVar.e(new ri(6), Uri.class);
        fyVar.e(new ri(i2), Drawable.class);
        fyVar.e(new ri(1), Bitmap.class);
        fyVar.e(new ri(2), ByteBuffer.class);
        go goVar = new go(p01Var.d, p01Var.e);
        ArrayList arrayList2 = (ArrayList) fyVar.r;
        arrayList2.add(goVar);
        List Z = ll3.Z((ArrayList) fyVar.n);
        this.f = new gy(Z, ll3.Z((ArrayList) fyVar.o), ll3.Z(arrayList), ll3.Z((ArrayList) fyVar.q), ll3.Z(arrayList2));
        this.g = zv.F(Z, new sh0(this, fs2Var, tt1Var));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|(5:(1:(1:(9:11|12|13|14|15|16|(3:18|(1:20)(1:25)|21)(2:26|(1:28)(2:29|30))|22|23)(2:48|49))(12:50|51|52|53|54|55|56|57|58|59|(6:62|15|16|(0)(0)|22|23)|61))(4:73|74|75|76)|72|35|36|(3:38|22|23)(2:39|40))(4:93|94|95|(3:97|(1:99)|101)(2:102|103))|77|78|(1:80)|81|(1:83)|84|(8:86|54|55|56|57|58|59|(0))|61))|106|6|(0)(0)|77|78|(0)|81|(0)|84|(0)|61|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00ba, code lost:
    
        if (defpackage.j8.k(r0, r2) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00d2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00d3, code lost:
    
        r3 = r4;
        r4 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0132 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:16:0x012c, B:18:0x0132, B:21:0x0146, B:25:0x0141, B:26:0x0152, B:28:0x0156, B:29:0x0167, B:30:0x016c), top: B:15:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0152 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:16:0x012c, B:18:0x0132, B:21:0x0146, B:25:0x0141, B:26:0x0152, B:28:0x0156, B:29:0x0167, B:30:0x016c), top: B:15:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0181 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:36:0x017d, B:38:0x0181, B:39:0x0192, B:40:0x019b), top: B:35:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0192 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:36:0x017d, B:38:0x0181, B:39:0x0192, B:40:0x019b), top: B:35:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ce A[Catch: all -> 0x00d2, TryCatch #3 {all -> 0x00d2, blocks: (B:78:0x00c4, B:80:0x00ce, B:81:0x00d7, B:83:0x00e2, B:84:0x00e5), top: B:77:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e2 A[Catch: all -> 0x00d2, TryCatch #3 {all -> 0x00d2, blocks: (B:78:0x00c4, B:80:0x00ce, B:81:0x00d7, B:83:0x00e2, B:84:0x00e5), top: B:77:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b72 b72Var, r01 r01Var, int i, r30 r30Var) {
        a72 a72Var;
        Object obj;
        b50 b50Var;
        int i2;
        r01 a;
        oi0 oi0Var;
        r01 r01Var2;
        mn mnVar;
        mn mnVar2;
        at2 at2Var;
        b72 b72Var2;
        r01 r01Var3;
        Bitmap bitmap;
        oi0 oi0Var2;
        oi0 oi0Var3;
        Object obj2;
        Object obj3;
        b72 b72Var3;
        b72 b72Var4 = b72Var;
        if (r30Var instanceof a72) {
            a72Var = (a72) r30Var;
            int i3 = a72Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a72Var.t = i3 - Integer.MIN_VALUE;
                obj = a72Var.r;
                b50Var = b50.m;
                i2 = a72Var.t;
                if (i2 == 0) {
                    try {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    lh.g("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                oi0Var3 = a72Var.p;
                                r01Var2 = a72Var.o;
                                mnVar = a72Var.n;
                                b72 b72Var5 = a72Var.m;
                                try {
                                    ca2.b(obj);
                                    b72Var2 = b72Var5;
                                    try {
                                        obj3 = (s01) obj;
                                        if (!(obj3 instanceof mq2)) {
                                            at2 at2Var2 = r01Var2.c;
                                            b72Var2.getClass();
                                            r01 r01Var4 = ((mq2) obj3).b;
                                            if (at2Var2 instanceof lj) {
                                                r01Var4.g.getClass();
                                            }
                                            oi0Var3.getClass();
                                            r01Var4.getClass();
                                            obj2 = obj3;
                                        } else {
                                            if (!(obj3 instanceof ni0)) {
                                                throw new bs1();
                                            }
                                            at2 at2Var3 = r01Var2.c;
                                            b72Var2.getClass();
                                            b((ni0) obj3, at2Var3, oi0Var3);
                                            obj2 = obj3;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        oi0Var = oi0Var3;
                                        b72Var4 = b72Var2;
                                        if (th instanceof CancellationException) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    oi0Var = oi0Var3;
                                    b72Var4 = b72Var5;
                                }
                                return obj2;
                            }
                            Bitmap bitmap2 = a72Var.q;
                            oi0 oi0Var4 = a72Var.p;
                            r01 r01Var5 = a72Var.o;
                            mnVar2 = a72Var.n;
                            b72Var3 = a72Var.m;
                            try {
                                ca2.b(obj);
                                bitmap = bitmap2;
                                oi0Var2 = oi0Var4;
                                r01Var3 = r01Var5;
                                b72Var2 = b72Var3;
                                mnVar = mnVar2;
                                try {
                                    pl2 pl2Var = (pl2) obj;
                                    oi0Var2.getClass();
                                    t40 t40Var = r01Var3.q;
                                    da daVar = new da(r01Var3, b72Var2, pl2Var, oi0Var2, bitmap, null, 5);
                                    oi0Var3 = oi0Var2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    oi0Var3 = oi0Var2;
                                }
                                try {
                                    a72Var.m = b72Var2;
                                    a72Var.n = mnVar;
                                    a72Var.o = r01Var3;
                                    a72Var.p = oi0Var3;
                                    a72Var.q = null;
                                    a72Var.t = 3;
                                    obj = z71.V(t40Var, daVar, a72Var);
                                } catch (Throwable th4) {
                                    th = th4;
                                    oi0Var = oi0Var3;
                                    r01Var2 = r01Var3;
                                    b72Var4 = b72Var2;
                                    if (th instanceof CancellationException) {
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                oi0Var = oi0Var4;
                                r01Var2 = r01Var5;
                            }
                            if (obj != b50Var) {
                                r01Var2 = r01Var3;
                                obj3 = (s01) obj;
                                if (!(obj3 instanceof mq2)) {
                                }
                                return obj2;
                            }
                            return b50Var;
                        }
                        oi0 oi0Var5 = a72Var.p;
                        a = a72Var.o;
                        mnVar2 = a72Var.n;
                        b72Var3 = a72Var.m;
                        try {
                            ca2.b(obj);
                            oi0Var = oi0Var5;
                            b72Var4 = b72Var3;
                        } catch (Throwable th6) {
                            th = th6;
                            oi0Var = oi0Var5;
                            r01Var2 = a;
                        }
                        if (th instanceof CancellationException) {
                            b72Var4.getClass();
                            oi0Var.getClass();
                            r01Var2.getClass();
                            throw th;
                        }
                        b72Var4.e.getClass();
                        ni0 n = tt1.n(r01Var2, th);
                        b(n, r01Var2.c, oi0Var);
                        obj2 = n;
                        return obj2;
                    } finally {
                        mnVar.m.c(mnVar);
                    }
                    mnVar = mnVar2;
                    b72Var4 = b72Var3;
                } else {
                    ca2.b(obj);
                    tt1 tt1Var = b72Var4.e;
                    g61 E = l41.E(a72Var.getContext());
                    tt1Var.getClass();
                    ad1 ad1Var = r01Var.u;
                    mn mnVar3 = new mn(ad1Var, E);
                    q01 a2 = r01.a(r01Var);
                    a2.b = b72Var4.b;
                    a2.p = null;
                    a = a2.a();
                    oi0Var = oi0.a;
                    try {
                        if (a.b == qb2.d0) {
                            throw new it1("The request's data is null.");
                        }
                        ad1Var.a(mnVar3);
                        if (i == 0) {
                            ad1 ad1Var2 = a.u;
                            a72Var.m = b72Var4;
                            a72Var.n = mnVar3;
                            a72Var.o = a;
                            a72Var.p = oi0Var;
                            a72Var.t = 1;
                        }
                        mnVar2 = mnVar3;
                    } catch (Throwable th7) {
                        th = th7;
                        r01Var2 = a;
                        mnVar = mnVar3;
                    }
                }
                if (((e72) b72Var4.c.getValue()) != null) {
                    a.getClass();
                }
                a.z.getClass();
                r80 r80Var = k.a;
                at2Var = a.c;
                if (at2Var != null) {
                    at2Var.a(null);
                }
                oi0Var.getClass();
                sl2 sl2Var = a.v;
                a72Var.m = b72Var4;
                a72Var.n = mnVar2;
                a72Var.o = a;
                a72Var.p = oi0Var;
                a72Var.q = null;
                a72Var.t = 2;
                obj = sl2Var.i(a72Var);
                if (obj != b50Var) {
                    b72Var2 = b72Var4;
                    r01Var3 = a;
                    bitmap = null;
                    oi0Var2 = oi0Var;
                    mnVar = mnVar2;
                    pl2 pl2Var2 = (pl2) obj;
                    oi0Var2.getClass();
                    t40 t40Var2 = r01Var3.q;
                    da daVar2 = new da(r01Var3, b72Var2, pl2Var2, oi0Var2, bitmap, null, 5);
                    oi0Var3 = oi0Var2;
                    a72Var.m = b72Var2;
                    a72Var.n = mnVar;
                    a72Var.o = r01Var3;
                    a72Var.p = oi0Var3;
                    a72Var.q = null;
                    a72Var.t = 3;
                    obj = z71.V(t40Var2, daVar2, a72Var);
                    if (obj != b50Var) {
                    }
                }
                return b50Var;
            }
        }
        a72Var = new a72(b72Var4, r30Var);
        obj = a72Var.r;
        b50Var = b50.m;
        i2 = a72Var.t;
        if (i2 == 0) {
        }
        if (((e72) b72Var4.c.getValue()) != null) {
        }
        a.z.getClass();
        r80 r80Var2 = k.a;
        at2Var = a.c;
        if (at2Var != null) {
        }
        oi0Var.getClass();
        sl2 sl2Var2 = a.v;
        a72Var.m = b72Var4;
        a72Var.n = mnVar2;
        a72Var.o = a;
        a72Var.p = oi0Var;
        a72Var.q = null;
        a72Var.t = 2;
        obj = sl2Var2.i(a72Var);
        if (obj != b50Var) {
        }
        return b50Var;
    }

    public static void b(ni0 ni0Var, at2 at2Var, oi0 oi0Var) {
        r01 r01Var = ni0Var.b;
        if (at2Var instanceof lj) {
            r01Var.g.getClass();
        }
        oi0Var.getClass();
        r01Var.getClass();
    }
}
