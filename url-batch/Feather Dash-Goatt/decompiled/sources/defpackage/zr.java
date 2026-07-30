package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import android.view.ViewConfiguration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zr {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Serializable d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public zr(AssetManager assetManager, Executor executor, lz0 lz0Var, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = lz0Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        this.d = i >= 31 ? mo.i : i != 30 ? 0 : mo.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0136, code lost:
    
        if (kotlin.Unit.a != r10) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(zr zrVar, d81 d81Var, qm0 qm0Var, float f, float f2, fn fnVar) {
        rm0 rm0Var;
        int i;
        w11 w11Var;
        float f3;
        d81 d81Var2;
        long d;
        zrVar.getClass();
        if (fnVar instanceof rm0) {
            rm0Var = (rm0) fnVar;
            int i2 = rm0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rm0Var.m = i2 - Integer.MIN_VALUE;
                rm0 rm0Var2 = rm0Var;
                Object obj = rm0Var2.k;
                Object obj2 = tn.d;
                i = rm0Var2.m;
                if (i != 0) {
                    ca0.v(obj);
                    z11 z11Var = new z11();
                    z11Var.d = qm0Var;
                    zrVar.h(qm0Var);
                    qm0 g = g((we) zrVar.f);
                    if (g != null) {
                        zrVar.h(g);
                        z11Var.d = ((qm0) z11Var.d).a(g);
                    }
                    w11 w11Var2 = new w11();
                    float g2 = d81Var.g(d81Var.e(((qm0) z11Var.d).a));
                    w11Var2.d = g2;
                    if (y90.b(g2)) {
                        return Unit.a;
                    }
                    z11 z11Var2 = new z11();
                    z11Var2.d = mo.a(0.0f, 30);
                    tm0 tm0Var = new tm0(w11Var2, z11Var2, z11Var, f, zrVar, f2, d81Var, null);
                    rm0Var2.h = d81Var;
                    rm0Var2.i = w11Var2;
                    rm0Var2.j = f2;
                    rm0Var2.m = 1;
                    if (zrVar.i(d81Var, tm0Var, rm0Var2) != obj2) {
                        w11Var = w11Var2;
                        f3 = f2;
                        d81Var2 = d81Var;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        ca0.v(obj);
                        return Unit.a;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f3 = rm0Var2.j;
                w11Var = rm0Var2.i;
                d81Var2 = rm0Var2.h;
                ca0.v(obj);
                yw ywVar = (yw) zrVar.h;
                d = ca0.d(((zm1) ywVar.e).b(Float.MAX_VALUE), ((zm1) ywVar.g).b(Float.MAX_VALUE));
                if (d == 0) {
                    float d2 = d81Var2.d(Math.signum(w11Var.d)) * Math.min(Math.abs(w11Var.d) / 100.0f, f3) * 1000.0f;
                    if (d2 == 0.0f) {
                        d = 0;
                    } else {
                        d = d81Var2.d == et0.e ? ca0.d(d2, 0.0f) : ca0.d(0.0f, d2);
                    }
                }
                gk gkVar = (gk) zrVar.d;
                rm0Var2.h = null;
                rm0Var2.i = null;
                rm0Var2.m = 2;
                v71 v71Var = (v71) gkVar.d;
                uq1.N(v71Var.O.c(), null, new t71(v71Var, d, null, 1), 3);
            }
        }
        rm0Var = new rm0(zrVar, fnVar);
        rm0 rm0Var22 = rm0Var;
        Object obj3 = rm0Var22.k;
        Object obj22 = tn.d;
        i = rm0Var22.m;
        if (i != 0) {
        }
        yw ywVar2 = (yw) zrVar.h;
        d = ca0.d(((zm1) ywVar2.e).b(Float.MAX_VALUE), ((zm1) ywVar2.g).b(Float.MAX_VALUE));
        if (d == 0) {
        }
        gk gkVar2 = (gk) zrVar.d;
        rm0Var22.h = null;
        rm0Var22.i = null;
        rm0Var22.m = 2;
        v71 v71Var2 = (v71) gkVar2.d;
        uq1.N(v71Var2.O.c(), null, new t71(v71Var2, d, null, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(zr zrVar, z11 z11Var, w11 w11Var, d81 d81Var, z11 z11Var2, long j, fn fnVar) {
        um0 um0Var;
        int i;
        d81 d81Var2;
        z11 z11Var3;
        zr zrVar2;
        z11 z11Var4;
        w11 w11Var2;
        qm0 qm0Var;
        boolean z;
        if (fnVar instanceof um0) {
            um0Var = (um0) fnVar;
            int i2 = um0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                um0Var.n = i2 - Integer.MIN_VALUE;
                Object obj = um0Var.m;
                tn tnVar = tn.d;
                i = um0Var.n;
                dn dnVar = null;
                if (i != 0) {
                    ca0.v(obj);
                    if (j < 0) {
                        return Boolean.FALSE;
                    }
                    rp rpVar = new rp(zrVar, dnVar, 8);
                    um0Var.h = zrVar;
                    um0Var.i = z11Var;
                    um0Var.j = w11Var;
                    d81Var2 = d81Var;
                    um0Var.k = d81Var2;
                    z11Var3 = z11Var2;
                    um0Var.l = z11Var3;
                    um0Var.n = 1;
                    obj = y90.J(j, rpVar, um0Var);
                    if (obj == tnVar) {
                        return tnVar;
                    }
                    zrVar2 = zrVar;
                    z11Var4 = z11Var;
                    w11Var2 = w11Var;
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z11 z11Var5 = um0Var.l;
                    d81 d81Var3 = um0Var.k;
                    w11Var2 = um0Var.j;
                    z11Var4 = um0Var.i;
                    zr zrVar3 = um0Var.h;
                    ca0.v(obj);
                    z11Var3 = z11Var5;
                    d81Var2 = d81Var3;
                    zrVar2 = zrVar3;
                }
                qm0Var = (qm0) obj;
                if (qm0Var == null) {
                    boolean z2 = ((qm0) z11Var4.d).c;
                    long j2 = qm0Var.a;
                    z11Var4.d = new qm0(j2, qm0Var.b, z2);
                    w11Var2.d = d81Var2.i(d81Var2.e(j2));
                    z11Var3.d = mo.a(0.0f, 30);
                    zrVar2.h(qm0Var);
                    z = !y90.b(w11Var2.d);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        um0Var = new um0(fnVar);
        Object obj2 = um0Var.m;
        tn tnVar2 = tn.d;
        i = um0Var.n;
        dn dnVar2 = null;
        if (i != 0) {
        }
        qm0Var = (qm0) obj2;
        if (qm0Var == null) {
        }
        return Boolean.valueOf(z);
    }

    public static qm0 g(we weVar) {
        qm0 qm0Var = null;
        f91 a = h91.a(new b30(new i6(3, weVar), null));
        while (a.hasNext()) {
            qm0 qm0Var2 = (qm0) a.next();
            if (qm0Var != null) {
                qm0Var2 = qm0Var.a(qm0Var2);
            }
            qm0Var = qm0Var2;
        }
        return qm0Var;
    }

    public float c(b81 b81Var, float f) {
        d81 d81Var = (d81) this.b;
        long h = d81Var.h(d81Var.d(f));
        d81 d81Var2 = b81Var.a;
        return d81Var.g(d81Var.e(d81Var2.c(d81Var2.k, h, 1)));
    }

    public boolean d(mx0 mx0Var) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) ((s40) this.c).e;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = mx0Var.a;
        wq0 wq0Var = new wq0(0L);
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            j = wq0Var.a;
            if (i >= size) {
                break;
            }
            wq0Var = new wq0(wq0.e(j, ((qx0) list.get(i)).j));
            i++;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f) & 4294967295L);
        d81 d81Var = (d81) this.b;
        float i2 = d81Var.i(d81Var.e(floatToRawIntBits));
        if (i2 != 0.0f) {
            w71 w71Var = d81Var.a;
            z = i2 > 0.0f ? w71Var.d() : w71Var.a();
        }
        return z ? !(((we) this.f).s(new qm0(floatToRawIntBits, ((qx0) CollectionsKt.p(mx0Var.a)).b, false)) instanceof og) : this.a;
    }

    public FileInputStream e(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((lz0) this.c).j();
            return null;
        }
    }

    public void f(final int i, final Serializable serializable) {
        ((Executor) this.b).execute(new Runnable() { // from class: yr
            @Override // java.lang.Runnable
            public final void run() {
                ((lz0) zr.this.c).k(i, serializable);
            }
        });
    }

    public void h(qm0 qm0Var) {
        yw ywVar = (yw) this.h;
        long j = qm0Var.b;
        long j2 = qm0Var.a;
        ((zm1) ywVar.e).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((zm1) ywVar.g).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(d81 d81Var, tm0 tm0Var, fn fnVar) {
        vm0 vm0Var;
        int i;
        if (fnVar instanceof vm0) {
            vm0Var = (vm0) fnVar;
            int i2 = vm0Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vm0Var.j = i2 - Integer.MIN_VALUE;
                Object obj = vm0Var.h;
                tn tnVar = tn.d;
                i = vm0Var.j;
                dn dnVar = null;
                if (i != 0) {
                    ca0.v(obj);
                    this.a = true;
                    d dVar = new d(d81Var, tm0Var, dnVar, 16);
                    vm0Var.j = 1;
                    CoroutineContext coroutineContext = vm0Var.e;
                    coroutineContext.getClass();
                    jf1 jf1Var = new jf1(vm0Var, coroutineContext);
                    if (y90.G(jf1Var, jf1Var, dVar) == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                this.a = false;
                return Unit.a;
            }
        }
        vm0Var = new vm0(this, fnVar);
        Object obj2 = vm0Var.h;
        tn tnVar2 = tn.d;
        i = vm0Var.j;
        dn dnVar2 = null;
        if (i != 0) {
        }
        this.a = false;
        return Unit.a;
    }

    public zr(d81 d81Var, s40 s40Var, gk gkVar, nr nrVar) {
        this.b = d81Var;
        this.c = s40Var;
        this.d = gkVar;
        this.e = nrVar;
        this.f = yr1.i(Integer.MAX_VALUE, 6, null);
        this.h = new yw(19);
    }
}
