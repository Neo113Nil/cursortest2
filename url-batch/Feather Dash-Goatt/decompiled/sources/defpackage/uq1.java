package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.net.Uri;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.l;
import com.feathherdashh.dashgame.MainActivity;
import com.feathherdashh.dashgame.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class uq1 {
    public static final a60 l;
    public static final j41 m;
    public static final long p = Long.MIN_VALUE;
    public static final /* synthetic */ int q = 0;
    public static Boolean r;
    public static Boolean s;
    public static Boolean t;
    public static Boolean u;
    public static final float[] a = new float[91];
    public static final fv b = new fv("RESUME_TOKEN", 1);
    public static final Object c = new Object();
    public static final or d = new or(1.0f, 1.0f);
    public static final oo1 e = new oo1(0.31006f, 0.31616f);
    public static final oo1 f = new oo1(0.34567f, 0.3585f);
    public static final oo1 g = new oo1(0.32168f, 0.33767f);
    public static final oo1 h = new oo1(0.31271f, 0.32902f);
    public static final float[] i = {0.964212f, 1.0f, 0.825188f};
    public static final Object j = new Object();
    public static final StackTraceElement[] k = new StackTraceElement[0];
    public static final j50 n = new j50(29);
    public static final long[] o = new long[0];

    static {
        int i2 = 28;
        l = new a60(i2);
        m = new j41(i2);
    }

    public static void A(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            mj mjVar = (mj) obj;
            go goVar = new go(mjVar);
            for (v01 v01Var : mjVar.b) {
                boolean z = mjVar.e == 0;
                ho hoVar = new ho(v01Var, !z);
                if (!hashMap.containsKey(hoVar)) {
                    hashMap.put(hoVar, new HashSet());
                }
                Set set = (Set) hashMap.get(hoVar);
                if (!set.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + v01Var + ".");
                }
                set.add(goVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (go goVar2 : (Set) it.next()) {
                for (qr qrVar : goVar2.a.c) {
                    if (qrVar.c == 0) {
                        Set<go> set2 = (Set) hashMap.get(new ho(qrVar.a, qrVar.b == 2));
                        if (set2 != null) {
                            for (go goVar3 : set2) {
                                goVar2.b.add(goVar3);
                                goVar3.c.add(goVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            go goVar4 = (go) it3.next();
            if (goVar4.c.isEmpty()) {
                hashSet2.add(goVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            go goVar5 = (go) hashSet2.iterator().next();
            hashSet2.remove(goVar5);
            i2++;
            Iterator it4 = goVar5.b.iterator();
            while (it4.hasNext()) {
                go goVar6 = (go) it4.next();
                goVar6.c.remove(goVar5);
                if (goVar6.c.isEmpty()) {
                    hashSet2.add(goVar6);
                }
            }
        }
        if (i2 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            go goVar7 = (go) it5.next();
            if (!goVar7.c.isEmpty() && !goVar7.b.isEmpty()) {
                arrayList2.add(goVar7.a);
            }
        }
        throw new rr("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void B(z4 z4Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        n81 n81Var;
        l81 l81Var;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            long keyAt = longSparseArray.keyAt(i2);
            ViewTranslationResponse l2 = o3.l(longSparseArray.get(keyAt));
            if (l2 != null && value != null && text != null && (n81Var = (n81) z4Var.h().b((int) keyAt)) != null && (l81Var = n81Var.a) != null) {
                Object g2 = l81Var.d.d.g(g81.l);
                if (g2 == null) {
                    g2 = null;
                }
                z0 z0Var = (z0) g2;
                if (z0Var != null && (function1 = (Function1) z0Var.b) != null) {
                }
            }
        }
    }

    public static final void C(hu huVar, l50 l50Var) {
        boolean z;
        Object obj;
        Object obj2;
        boolean z2;
        float f2;
        float f3;
        xf g2 = huVar.v().g();
        l50 l50Var2 = (l50) huVar.v().g;
        p50 p50Var = l50Var.a;
        p50 p50Var2 = l50Var.a;
        RenderNode renderNode = p50Var.c;
        if (l50Var.s) {
            return;
        }
        l50Var.a();
        if (!renderNode.hasDisplayList()) {
            try {
                l50Var.e();
            } catch (Throwable unused) {
            }
        }
        boolean z3 = p50Var2.l > 0.0f;
        if (z3) {
            g2.p();
        }
        Canvas a2 = k3.a(g2);
        boolean isHardwareAccelerated = a2.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            z = z3;
            obj = null;
        } else {
            long j2 = l50Var.t;
            float f4 = (int) (j2 >> 32);
            float f5 = (int) (j2 & 4294967295L);
            z = z3;
            long j3 = l50Var.u;
            float f6 = ((int) (j3 >> 32)) + f4;
            float f7 = f5 + ((int) (j3 & 4294967295L));
            float f8 = p50Var2.h;
            int i2 = p50Var.i;
            if (f8 < 1.0f || i2 != 3 || p50Var.s == 1) {
                xu1 xu1Var = l50Var.p;
                if (xu1Var == null) {
                    xu1Var = m90.d();
                    l50Var.p = xu1Var;
                }
                xu1Var.c(f8);
                xu1Var.d(i2);
                obj = null;
                xu1Var.f(null);
                f2 = f4;
                f3 = f5;
                a2.saveLayer(f2, f3, f6, f7, (Paint) xu1Var.b);
            } else {
                a2.save();
                f2 = f4;
                f3 = f5;
                obj = null;
            }
            a2.translate(f2, f3);
            Matrix matrix = p50Var.f;
            if (matrix == null) {
                matrix = new Matrix();
                p50Var.f = matrix;
            }
            renderNode.getMatrix(matrix);
            a2.concat(matrix);
        }
        boolean z4 = !isHardwareAccelerated && l50Var.w;
        if (z4) {
            g2.k();
            ka0 d2 = l50Var.d();
            if (d2 instanceof ht0) {
                s11 s11Var = ((ht0) d2).a;
                obj2 = obj;
                g2.g(s11Var.a, s11Var.b, s11Var.c, s11Var.d, 1);
            } else {
                obj2 = obj;
                if (d2 instanceof it0) {
                    c6 c6Var = l50Var.m;
                    if (c6Var != null) {
                        c6Var.a.rewind();
                    } else {
                        c6Var = e6.a();
                        l50Var.m = c6Var;
                    }
                    c6.b(c6Var, ((it0) d2).a);
                    g2.q(c6Var);
                } else {
                    if (!(d2 instanceof gt0)) {
                        l.a();
                        return;
                    }
                    g2.q(((gt0) d2).a);
                }
            }
        } else {
            obj2 = obj;
        }
        if (l50Var2 != null) {
            vg vgVar = l50Var2.r;
            if (!vgVar.a) {
                n80.a("Only add dependencies during a tracking");
            }
            wn0 wn0Var = (wn0) vgVar.d;
            if (wn0Var != null) {
                wn0Var.a(l50Var);
            } else if (((l50) vgVar.b) != null) {
                wn0 wn0Var2 = r61.a;
                wn0 wn0Var3 = new wn0();
                l50 l50Var3 = (l50) vgVar.b;
                l50Var3.getClass();
                wn0Var3.a(l50Var3);
                wn0Var3.a(l50Var);
                vgVar.d = wn0Var3;
                vgVar.b = obj2;
            } else {
                vgVar.b = l50Var;
            }
            wn0 wn0Var4 = (wn0) vgVar.e;
            if (wn0Var4 != null) {
                z2 = !wn0Var4.l(l50Var);
            } else if (((l50) vgVar.c) != l50Var) {
                z2 = true;
            } else {
                vgVar.c = obj2;
                z2 = false;
            }
            if (z2) {
                l50Var.q++;
            }
        }
        j3 j3Var = (j3) g2;
        if (j3Var.a.isHardwareAccelerated()) {
            j3Var.a.drawRenderNode(renderNode);
        } else {
            zf zfVar = l50Var.o;
            if (zfVar == null) {
                zfVar = new zf();
                l50Var.o = zfVar;
            }
            i8 i8Var = zfVar.e;
            nr nrVar = l50Var.b;
            vc0 vc0Var = l50Var.c;
            long x = ca0.x(l50Var.u);
            yf yfVar = ((zf) i8Var.h).d;
            nr nrVar2 = yfVar.a;
            vc0 vc0Var2 = yfVar.b;
            xf g3 = i8Var.g();
            long i3 = i8Var.i();
            l50 l50Var4 = (l50) i8Var.g;
            i8Var.t(nrVar);
            i8Var.u(vc0Var);
            i8Var.s(g2);
            i8Var.v(x);
            i8Var.g = l50Var;
            g2.k();
            try {
                l50Var.c(zfVar);
            } finally {
                g2.i();
                i8Var.t(nrVar2);
                i8Var.u(vc0Var2);
                i8Var.s(g3);
                i8Var.v(i3);
                i8Var.g = l50Var4;
            }
        }
        if (z4) {
            g2.i();
        }
        if (z) {
            g2.l();
        }
        if (isHardwareAccelerated) {
            return;
        }
        a2.restore();
    }

    public static final boolean D(long j2, long j3) {
        return j2 == j3;
    }

    public static final o10 E(o10 o10Var) {
        o10 f2 = ((e10) ((d4) op.J(o10Var)).getFocusOwner()).f();
        if (f2 == null || !f2.r) {
            return null;
        }
        return f2;
    }

    public static final Integer F(za1 za1Var, ml mlVar, int i2, int i3) {
        Integer F;
        int[] iArr = za1Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (za1Var.j(i2) && za1Var.i(i2) == 206 && Intrinsics.a(za1Var.p(iArr, i2), kl.e)) {
                Object h2 = za1Var.h(i2, 0);
                k21 k21Var = h2 instanceof k21 ? (k21) h2 : null;
                Object obj = k21Var != null ? k21Var.a : null;
                el elVar = obj instanceof el ? (el) obj : null;
                if (elVar != null && elVar.d == mlVar) {
                    return Integer.valueOf(i2);
                }
            }
            if (za1Var.d(i2) && (F = F(za1Var, mlVar, i2 + 1, i4)) != null) {
                return Integer.valueOf(F.intValue());
            }
            i2 = i4;
        }
    }

    public static final s11 G(o10 o10Var) {
        qp0 qp0Var;
        if (o10Var.r && (qp0Var = o10Var.l) != null) {
            uc0 n2 = t80.n(qp0Var);
            if (!n2.E()) {
                n2 = null;
            }
            if (n2 != null) {
                return o10Var.C0(n2);
            }
        }
        return s11.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final o10 H(o10 o10Var) {
        boolean z = o10Var.d.r;
        if (z) {
            if (!z) {
                o80.b("visitChildren called on an unattached node");
            }
            eo0 eo0Var = new eo0(new zl0[16]);
            zl0 zl0Var = o10Var.d;
            zl0 zl0Var2 = zl0Var.j;
            if (zl0Var2 == null) {
                op.l(eo0Var, zl0Var);
            } else {
                eo0Var.b(zl0Var2);
            }
            loop0: while (true) {
                int i2 = eo0Var.g;
                if (i2 == 0) {
                    break;
                }
                zl0 zl0Var3 = (zl0) eo0Var.k(i2 - 1);
                if ((zl0Var3.h & 1024) == 0) {
                    op.l(eo0Var, zl0Var3);
                } else {
                    while (true) {
                        if (zl0Var3 == null) {
                            break;
                        }
                        if ((zl0Var3.g & 1024) != 0) {
                            eo0 eo0Var2 = null;
                            while (zl0Var3 != null) {
                                if (zl0Var3 instanceof o10) {
                                    o10 o10Var2 = (o10) zl0Var3;
                                    if (o10Var2.d.r) {
                                        int ordinal = o10Var2.E0().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            l.a();
                                            return null;
                                        }
                                    }
                                } else if ((zl0Var3.g & 1024) != 0 && (zl0Var3 instanceof zq)) {
                                    int i3 = 0;
                                    for (zl0 zl0Var4 = ((zq) zl0Var3).t; zl0Var4 != null; zl0Var4 = zl0Var4.j) {
                                        if ((zl0Var4.g & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                zl0Var3 = zl0Var4;
                                            } else {
                                                if (eo0Var2 == null) {
                                                    eo0Var2 = new eo0(new zl0[16]);
                                                }
                                                if (zl0Var3 != null) {
                                                    eo0Var2.b(zl0Var3);
                                                    zl0Var3 = null;
                                                }
                                                eo0Var2.b(zl0Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                zl0Var3 = op.o(eo0Var2);
                            }
                        } else {
                            zl0Var3 = zl0Var3.j;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static Set I() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final a61 J(wj wjVar) {
        s40 c2 = me1.c(wjVar, new uq(1), 4);
        return (a61) ((o91) c2.e).k(a21.a(a61.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final boolean L(o10 o10Var) {
        jd0 jd0Var;
        qp0 qp0Var;
        jd0 jd0Var2;
        qp0 qp0Var2 = o10Var.l;
        return (qp0Var2 == null || (jd0Var = qp0Var2.s) == null || !jd0Var.G() || (qp0Var = o10Var.l) == null || (jd0Var2 = qp0Var.s) == null || !jd0Var2.F()) ? false : true;
    }

    public static boolean M(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (r == null) {
            r = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        r.booleanValue();
        if (s == null) {
            s = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return s.booleanValue();
    }

    public static rc1 N(sn snVar, CoroutineContext coroutineContext, Function2 function2, int i2) {
        vn vnVar = vn.h;
        if ((i2 & 1) != 0) {
            coroutineContext = g.d;
        }
        if ((i2 & 2) != 0) {
            vnVar = vn.d;
        }
        CoroutineContext b2 = jn.b(snVar, coroutineContext);
        rc1 bg0Var = vnVar == vn.e ? new bg0(b2, function2) : new rc1(b2, true);
        bg0Var.r0(vnVar, bg0Var, function2);
        return bg0Var;
    }

    public static final long P(u70 u70Var, et0 et0Var, t70 t70Var) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j2;
        if (et0Var == null) {
            return u70Var.c;
        }
        int i2 = t70Var.a;
        if (i2 == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (u70Var.c >> 32));
        } else {
            if (i2 != 2) {
                return u70Var.c;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (u70Var.c & 4294967295L));
        }
        if (et0Var == et0.e) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j2 = floatToRawIntBits3 << 32;
        }
        return j2 | (4294967295L & floatToRawIntBits);
    }

    public static final long Q(u70 u70Var, et0 et0Var, t70 t70Var) {
        float intBitsToFloat;
        long j2 = u70Var.g;
        if (et0Var == null) {
            return j2;
        }
        int i2 = t70Var.a;
        if (i2 == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        } else {
            if (i2 != 2) {
                return j2;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        if (et0Var == et0.e) {
            return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public static final Object R(CoroutineContext coroutineContext, Function2 function2) {
        ew ewVar;
        CoroutineContext a2;
        Thread currentThread = Thread.currentThread();
        f fVar = d.f;
        if (((d) coroutineContext.d(fVar)) == null) {
            ewVar = ci1.a();
            a2 = jn.a(g.d, coroutineContext.i(ewVar), true);
            nq nqVar = ls.a;
            if (a2 != nqVar && a2.d(fVar) == null) {
                a2 = a2.i(nqVar);
            }
        } else {
            ewVar = (ew) ci1.a.get();
            a2 = jn.a(g.d, coroutineContext, true);
            nq nqVar2 = ls.a;
            if (a2 != nqVar2 && a2.d(fVar) == null) {
                a2 = a2.i(nqVar2);
            }
        }
        od odVar = new od(a2, currentThread, ewVar);
        odVar.r0(vn.d, odVar, function2);
        ew ewVar2 = odVar.k;
        if (ewVar2 != null) {
            int i2 = ew.j;
            ewVar2.r(false);
        }
        while (!Thread.interrupted()) {
            try {
                long s2 = ewVar2 != null ? ewVar2.s() : Long.MAX_VALUE;
                if (odVar.W()) {
                    if (ewVar2 != null) {
                        int i3 = ew.j;
                        ewVar2.n(false);
                    }
                    Object f0 = yr1.f0(odVar.R());
                    hj hjVar = f0 instanceof hj ? (hj) f0 : null;
                    if (hjVar == null) {
                        return f0;
                    }
                    throw hjVar.a;
                }
                LockSupport.parkNanos(odVar, s2);
            } catch (Throwable th) {
                if (ewVar2 != null) {
                    int i4 = ew.j;
                    ewVar2.n(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        odVar.E(interruptedException);
        throw interruptedException;
    }

    public static final am0 S(am0 am0Var) {
        return am0Var.c(new fg1(new km1(1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [e11] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList T(za1 za1Var, int i2, Integer num) {
        ?? e11Var = new e11(za1Var);
        int q2 = za1Var.q(i2);
        d3 a2 = za1Var.a(i2);
        while (i2 >= 0) {
            e11Var.c(za1Var.i(i2), za1Var.k(i2) ? za1Var.p(za1Var.b, i2) : bl.a, za1Var.a.g(i2), num);
            if (q2 >= 0) {
                d3 d3Var = a2;
                a2 = za1Var.a(q2);
                i2 = q2;
                q2 = za1Var.q(q2);
                num = d3Var;
            } else {
                i2 = q2;
                num = a2;
            }
        }
        return e11Var.a;
    }

    public static final void U(List list, ArrayList arrayList) {
        if (arrayList == null) {
            if (list.size() >= 2) {
                return;
            }
            dd0.e("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == arrayList.size()) {
                return;
            }
            dd0.e("colors and colorStops arguments must have equal length.");
        }
    }

    public static final Object V(CoroutineContext coroutineContext, Function2 function2, dn dnVar) {
        Object f0;
        CoroutineContext g2 = dnVar.g();
        CoroutineContext i2 = !((Boolean) coroutineContext.p(Boolean.FALSE, new e9(8, (byte) 0))).booleanValue() ? g2.i(coroutineContext) : jn.a(g2, coroutineContext, false);
        t80.l(i2);
        if (i2 == g2) {
            y61 y61Var = new y61(dnVar, i2);
            f0 = y90.G(y61Var, y61Var, function2);
        } else {
            gn gnVar = d.f;
            if (Intrinsics.a(i2.d(gnVar), g2.d(gnVar))) {
                zk1 zk1Var = new zk1(dnVar, i2);
                CoroutineContext coroutineContext2 = zk1Var.i;
                Object c2 = bi1.c(coroutineContext2, null);
                try {
                    Object G = y90.G(zk1Var, zk1Var, function2);
                    bi1.a(coroutineContext2, c2);
                    f0 = G;
                } catch (Throwable th) {
                    bi1.a(coroutineContext2, c2);
                    throw th;
                }
            } else {
                is isVar = new is(dnVar, i2);
                m90.M(function2, isVar, isVar);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = is.k;
                while (true) {
                    int i3 = atomicIntegerFieldUpdater.get(isVar);
                    if (i3 != 0) {
                        if (i3 != 2) {
                            dd0.j("Already suspended");
                            return null;
                        }
                        f0 = yr1.f0(isVar.R());
                        if (f0 instanceof hj) {
                            throw ((hj) f0).a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(isVar, 0, 1)) {
                        f0 = tn.d;
                        break;
                    }
                }
            }
        }
        tn tnVar = tn.d;
        return f0;
    }

    public static final Object W(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, dn dnVar) {
        Object b2;
        Object c2 = bi1.c(coroutineContext, obj2);
        try {
            pc1 pc1Var = new pc1(dnVar, coroutineContext);
            if (function2 == null) {
                b2 = qa0.c(function2, obj, pc1Var);
            } else {
                tj1.b(2, function2);
                b2 = function2.b(obj, pc1Var);
            }
            bi1.a(coroutineContext, c2);
            if (b2 == tn.d) {
                dnVar.getClass();
            }
            return b2;
        } catch (Throwable th) {
            bi1.a(coroutineContext, c2);
            throw th;
        }
    }

    public static final void a(int i2, int i3, hl hlVar, Function0 function0, boolean z) {
        int i4;
        hlVar.Y(-361453782);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (hlVar.g(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= hlVar.f(function0) ? 32 : 16;
        }
        if ((i4 & 91) == 18 && hlVar.A()) {
            hlVar.R();
        } else {
            int i6 = 1;
            if (i5 != 0) {
                z = true;
            }
            ao0 H = gb0.H(function0, hlVar);
            hlVar.X(-3687241);
            Object L = hlVar.L();
            Object obj = bl.a;
            if (L == obj) {
                L = new qc(H, z);
                hlVar.h0(L);
            }
            hlVar.p(false);
            qc qcVar = (qc) L;
            Object valueOf = Boolean.valueOf(z);
            hlVar.X(-3686552);
            boolean f2 = hlVar.f(valueOf) | hlVar.f(qcVar);
            Object L2 = hlVar.L();
            if (f2 || L2 == obj) {
                L2 = new oc(qcVar, z);
                hlVar.h0(L2);
            }
            hlVar.p(false);
            p4.k((Function0) L2, hlVar);
            zl zlVar = hi0.a;
            hlVar.X(-2068013981);
            wj wjVar = (wj) hlVar.j(hi0.a);
            hlVar.X(1680121597);
            Object obj2 = null;
            if (wjVar == null) {
                View view = (View) hlVar.j(AndroidCompositionLocals_androidKt.f);
                view.getClass();
                xy xyVar = new xy(m91.c(new yy(new i6(10, view), h41.l, i6), h41.m));
                wjVar = (wj) (!xyVar.hasNext() ? null : xyVar.next());
            }
            hlVar.p(false);
            if (wjVar == null) {
                Object obj3 = (Context) hlVar.j(AndroidCompositionLocals_androidKt.b);
                while (true) {
                    if (!(obj3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (obj3 instanceof wj) {
                        obj2 = obj3;
                        break;
                    }
                    obj3 = ((ContextWrapper) obj3).getBaseContext();
                }
                wjVar = (wj) obj2;
            }
            hlVar.p(false);
            if (wjVar == null) {
                dd0.j("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            } else {
                kr0 e2 = wjVar.e();
                vg0 vg0Var = (vg0) hlVar.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                p4.a(vg0Var, e2, new z6(e2, vg0Var, qcVar, i6), hlVar);
            }
        }
        i11 r2 = hlVar.r();
        if (r2 == null) {
            return;
        }
        r2.d = new pc(i2, i3, function0, z);
    }

    public static final void b(w8 w8Var, z8 z8Var, hl hlVar, int i2) {
        int i3;
        i11 r2;
        g40 g40Var;
        w8Var.getClass();
        hlVar.Y(1899479072);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(w8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(z8Var) ? 32 : 16;
        }
        int i5 = 1;
        if (hlVar.O(i3 & 1, (i3 & 19) != 18)) {
            e40 e40Var = w8Var.i;
            if (e40Var == null) {
                r2 = hlVar.r();
                if (r2 != null) {
                    g40Var = new g40(w8Var, z8Var, i2, 3);
                    r2.d = g40Var;
                }
                return;
            }
            yr1.l(m90.J(869609025, new al0(e40Var, i5, z8Var), hlVar), hlVar, 6);
        } else {
            hlVar.R();
        }
        r2 = hlVar.r();
        if (r2 != null) {
            g40Var = new g40(w8Var, z8Var, i2, i4);
            r2.d = g40Var;
        }
    }

    public static final void c(w8 w8Var, z8 z8Var, hl hlVar, int i2) {
        int i3;
        z8 z8Var2;
        w8Var.getClass();
        hlVar.Y(-2084632878);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(w8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(z8Var) ? 32 : 16;
        }
        if (hlVar.O(i3 & 1, (i3 & 19) != 18)) {
            e40 e40Var = w8Var.i;
            int i5 = e40Var != null ? e40Var.d : 0;
            boolean z = w8Var.d >= 600;
            boolean h2 = hlVar.h(z8Var);
            Object L = hlVar.L();
            j41 j41Var = bl.a;
            if (h2 || L == j41Var) {
                v3 v3Var = new v3(0, z8Var, z8.class, "buyContinue", "buyContinue()V", 0, 13);
                hlVar.h0(v3Var);
                L = v3Var;
            }
            Function0 function0 = (Function0) ((b40) L);
            boolean h3 = hlVar.h(z8Var);
            Object L2 = hlVar.L();
            if (h3 || L2 == j41Var) {
                v3 v3Var2 = new v3(0, z8Var, z8.class, "quitGameplayToHome", "quitGameplayToHome()V", 0, 14);
                z8Var2 = z8Var;
                hlVar.h0(v3Var2);
                L2 = v3Var2;
            } else {
                z8Var2 = z8Var;
            }
            d(i5, z, function0, (Function0) ((b40) L2), hlVar, 0);
        } else {
            z8Var2 = z8Var;
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new g40(w8Var, z8Var2, i2, i4);
        }
    }

    public static final void d(final int i2, final boolean z, final Function0 function0, final Function0 function02, hl hlVar, int i3) {
        hlVar.Y(1619443023);
        int i4 = i3 | (hlVar.d(i2) ? 4 : 2) | (hlVar.g(z) ? 32 : 16) | (hlVar.h(function0) ? 256 : 128) | (hlVar.h(function02) ? 2048 : 1024);
        if (hlVar.O(i4 & 1, (i4 & 1171) != 1170)) {
            am0 R = yr1.R(mo.g(xa1.b, hi.b(0.48f, hi.b), m90.m), 22.0f);
            vk0 d2 = vd.d(j50.k, false);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, R);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            yr1.v(R.drawable.panel_large, xa1.b(xa1.a(xl0.a, 1.0f), 500.0f), 0.08f, m90.J(777945651, new s30() { // from class: yt0
                @Override // defpackage.s30
                public final Object a(Object obj, Object obj2, Object obj3) {
                    hl hlVar2 = (hl) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zd) obj).getClass();
                    if (hlVar2.O(intValue & 1, (intValue & 17) != 16)) {
                        am0 S = yr1.S(xa1.b, 24.0f, 28.0f);
                        yi a2 = wi.a(new h9(10.0f, false, new e9(0, (byte) 0)), j50.t, hlVar2, 54);
                        int hashCode2 = Long.hashCode(hlVar2.T);
                        kw0 l3 = hlVar2.l();
                        am0 N2 = p4.N(hlVar2, S);
                        yk.b.getClass();
                        xl xlVar2 = xk.b;
                        hlVar2.a0();
                        if (hlVar2.S) {
                            hlVar2.k(xlVar2);
                        } else {
                            hlVar2.k0();
                        }
                        ka0.C(hlVar2, a2, xk.e);
                        ka0.C(hlVar2, l3, xk.d);
                        ka0.u(hlVar2, Integer.valueOf(hashCode2), xk.f);
                        ka0.A(hlVar2, xk.g);
                        ka0.C(hlVar2, N2, xk.c);
                        xl0 xl0Var = xl0.a;
                        yr1.e(R.drawable.title_fail, xa1.b(xa1.a(xl0Var, 1.0f), 86.0f), null, hlVar2, 48, 4);
                        eh1.b("Jump earlier next time!", null, hi.c, t80.x(18), x20.l, null, 0L, new tg1(3), 0L, 0, false, 0, 0, null, hlVar2, 1597830, 0, 261034);
                        long d3 = la0.d(4294961562L);
                        x20 x20Var = x20.k;
                        eh1.b("Your run", null, d3, t80.x(15), x20Var, null, 0L, null, 0L, 0, false, 0, 0, null, hlVar2, 1597830, 0, 262058);
                        uq1.g(i2, null, hlVar2, 0);
                        eh1.b("Continue", null, la0.d(4294961562L), t80.x(15), x20Var, null, 0L, null, 0L, 0, false, 0, 0, null, hlVar2, 1597830, 0, 262058);
                        uq1.g(600, null, hlVar2, 6);
                        yr1.t(R.drawable.button_continue_600_feathers, function0, xa1.b(xa1.a(xl0Var, 1.0f), 66.0f), z, "Continue for 600 feathers", hlVar2, 24960, 0);
                        yr1.t(R.drawable.button_quit, function02, xa1.b(xa1.a(xl0Var, 0.72f), 66.0f), false, "Quit", hlVar2, 24960, 8);
                        hlVar2.p(true);
                    } else {
                        hlVar2.R();
                    }
                    return Unit.a;
                }
            }, hlVar), hlVar, 3504, 0);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new jx(i2, z, function0, function02, i3);
        }
    }

    public static final void e(z8 z8Var, hl hlVar, int i2) {
        int i3;
        hlVar.Y(-102389921);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(z8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 0;
        int i6 = 1;
        if (hlVar.O(i3 & 1, (i3 & 3) != 2)) {
            boolean h2 = hlVar.h(z8Var);
            Object L = hlVar.L();
            j41 j41Var = bl.a;
            if (h2 || L == j41Var) {
                L = new st0(z8Var, i5);
                hlVar.h0(L);
            }
            Function0 function0 = (Function0) L;
            boolean h3 = hlVar.h(z8Var);
            Object L2 = hlVar.L();
            if (h3 || L2 == j41Var) {
                L2 = new st0(z8Var, i6);
                hlVar.h0(L2);
            }
            Function0 function02 = (Function0) L2;
            boolean h4 = hlVar.h(z8Var);
            Object L3 = hlVar.L();
            if (h4 || L3 == j41Var) {
                L3 = new st0(z8Var, i4);
                hlVar.h0(L3);
            }
            Function0 function03 = (Function0) L3;
            boolean h5 = hlVar.h(z8Var);
            Object L4 = hlVar.L();
            if (h5 || L4 == j41Var) {
                v3 v3Var = new v3(0, z8Var, z8.class, "closeOverlay", "closeOverlay()V", 0, 15);
                hlVar.h0(v3Var);
                L4 = v3Var;
            }
            f(function0, function02, function03, (Function0) ((b40) L4), hlVar, 0);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new rt0(z8Var, i2, i6);
        }
    }

    public static final void f(Function0 function0, Function0 function02, Function0 function03, Function0 function04, hl hlVar, int i2) {
        hlVar.Y(1050100365);
        int i3 = i2 | (hlVar.h(function0) ? 4 : 2) | (hlVar.h(function02) ? 32 : 16) | (hlVar.h(function03) ? 256 : 128) | (hlVar.h(function04) ? 2048 : 1024);
        if (hlVar.O(i3 & 1, (i3 & 1171) != 1170)) {
            am0 S = yr1.S(S(xa1.b), 20.0f, 56.0f);
            vk0 d2 = vd.d(j50.k, false);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, S);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            yr1.v(R.drawable.panel_large, xa1.b(xa1.a(xl0.a, 1.0f), 330.0f), 0.04f, m90.J(-559628759, new re0(function04, function0, function02, function03, 1), hlVar), hlVar, 3504, 0);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new se0(function0, function02, function03, function04, i2, 1);
        }
    }

    public static final void g(final int i2, am0 am0Var, hl hlVar, final int i3) {
        int i4;
        final am0 am0Var2;
        hl hlVar2 = hlVar;
        hlVar2.Y(1417602570);
        if ((i3 & 6) == 0) {
            i4 = i3 | (hlVar2.d(i2) ? 4 : 2);
        } else {
            i4 = i3;
        }
        int i5 = i4 | 48;
        if (hlVar2.O(i5 & 1, (i5 & 19) != 18)) {
            r41 a2 = q41.a(yr1.d, j50.q, hlVar2, 54);
            int hashCode = Long.hashCode(hlVar2.T);
            kw0 l2 = hlVar2.l();
            xl0 xl0Var = xl0.a;
            am0 N = p4.N(hlVar2, xl0Var);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar2.a0();
            if (hlVar2.S) {
                hlVar2.k(xlVar);
            } else {
                hlVar2.k0();
            }
            ka0.C(hlVar2, a2, xk.e);
            ka0.C(hlVar2, l2, xk.d);
            ka0.u(hlVar2, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar2, xk.g);
            ka0.C(hlVar2, N, xk.c);
            yr1.e(R.drawable.golden_feather_currency_icon, xa1.c(xl0Var, 28.0f), null, hlVar2, 48, 4);
            ca0.b(hlVar2, xa1.e(xl0Var, 7.0f));
            eh1.b(String.valueOf(i2), null, la0.d(4294961562L), t80.x(22), x20.l, null, 0L, null, 0L, 0, false, 0, 0, null, hlVar, 1597824, 0, 262058);
            hlVar2 = hlVar;
            hlVar2.p(true);
            am0Var2 = xl0Var;
        } else {
            hlVar2.R();
            am0Var2 = am0Var;
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new Function2() { // from class: vt0
                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int P = gb0.P(i3 | 1);
                    uq1.g(i2, am0Var2, (hl) obj, P);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v38 */
    public static final void h(z8 z8Var, Function0 function0, boolean z, hl hlVar, int i2) {
        int i3;
        int i4;
        p8 p8Var;
        e7 e7Var;
        char c2;
        xl xlVar;
        int i5;
        e7 e7Var2;
        j41 j41Var;
        ?? r5;
        e7 e7Var3;
        hl hlVar2;
        e7 e7Var4;
        e7 e7Var5;
        y3 y3Var;
        e7 e7Var6;
        int i6;
        xl xlVar2;
        int i7;
        e7 e7Var7;
        boolean z2;
        boolean z3;
        z8 z8Var2 = z8Var;
        Function0 function02 = function0;
        hl hlVar3 = hlVar;
        function02.getClass();
        hlVar3.Y(10570827);
        if ((i2 & 6) == 0) {
            i3 = (hlVar3.h(z8Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar3.h(function02) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= hlVar3.g(z) ? 256 : 128;
        }
        if (hlVar3.O(i3 & 1, (i3 & 147) != 146)) {
            g11 g11Var = z8Var2.f;
            ao0 j2 = gb0.j(g11Var, g11Var.d.getValue(), g.d, hlVar3, 0);
            vg0 vg0Var = (vg0) hlVar3.j(gi0.a);
            q(((w8) j2.getValue()).a, hlVar3, 0);
            int i8 = i3 << 3;
            int i9 = i8 & 112;
            int i10 = i8 & 1008;
            i((w8) j2.getValue(), z8Var2, function02, hlVar3, i10);
            boolean h2 = hlVar3.h(z8Var2) | hlVar3.h(vg0Var);
            Object L = hlVar3.L();
            j41 j41Var2 = bl.a;
            if (h2 || L == j41Var2) {
                L = new c(vg0Var, 3, z8Var2);
                hlVar3.h0(L);
            }
            p4.b(vg0Var, (Function1) L, hlVar3);
            vy vyVar = xa1.b;
            am0 f2 = mo.f(vyVar, new mh0(zh.e(new hi(la0.d(4291487986L)), new hi(la0.d(4294437832L))), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L)));
            kd kdVar = j50.g;
            vk0 d2 = vd.d(kdVar, false);
            int hashCode = Long.hashCode(hlVar3.T);
            kw0 l2 = hlVar3.l();
            am0 N = p4.N(hlVar3, f2);
            yk.b.getClass();
            xl xlVar3 = xk.b;
            hlVar3.a0();
            if (hlVar3.S) {
                hlVar3.k(xlVar3);
            } else {
                hlVar3.k0();
            }
            e7 e7Var8 = xk.e;
            ka0.C(hlVar3, d2, e7Var8);
            e7 e7Var9 = xk.d;
            ka0.C(hlVar3, l2, e7Var9);
            Integer valueOf = Integer.valueOf(hashCode);
            e7 e7Var10 = xk.f;
            ka0.u(hlVar3, valueOf, e7Var10);
            y3 y3Var2 = xk.g;
            ka0.A(hlVar3, y3Var2);
            e7 e7Var11 = xk.c;
            ka0.C(hlVar3, N, e7Var11);
            u8 u8Var = ((w8) j2.getValue()).a;
            p8 p8Var2 = p8.a;
            if (Intrinsics.a(u8Var, p8Var2)) {
                i4 = i3;
                p8Var = p8Var2;
                e7Var = e7Var9;
                c2 = 51409;
                xlVar = xlVar3;
                i5 = i9;
                e7Var2 = e7Var8;
                j41Var = j41Var2;
                r5 = 0;
                hl hlVar4 = hlVar3;
                e7Var3 = e7Var10;
                hlVar4.W(1851050193);
                hlVar4.p(false);
                hlVar2 = hlVar4;
            } else {
                hlVar3.W(1853768707);
                e7Var2 = e7Var8;
                xlVar = xlVar3;
                i5 = i9;
                i4 = i3;
                p8Var = p8Var2;
                j41Var = j41Var2;
                hl hlVar5 = hlVar3;
                e7Var3 = e7Var10;
                e7Var = e7Var9;
                r5 = 0;
                mo.c(t80.F(R.drawable.home_background_countryside, hlVar3, 0), null, vyVar, null, xm.a, 0.0f, hlVar5, 25016);
                hlVar5.p(false);
                c2 = 51409;
                hlVar2 = hlVar5;
            }
            u8 u8Var2 = ((w8) j2.getValue()).a;
            if (Intrinsics.a(u8Var2, s8.a)) {
                hlVar2.W(613998752);
                j(r5, hlVar2);
                hlVar2.p(r5);
                hl hlVar6 = hlVar2;
                e7Var4 = e7Var3;
                hlVar3 = hlVar6;
                e7Var5 = e7Var;
                y3Var = y3Var2;
                e7Var7 = e7Var11;
                e7Var6 = e7Var2;
                i6 = i10;
                xlVar2 = xlVar;
                i7 = i5;
            } else {
                e7 e7Var12 = e7Var;
                r8 r8Var = r8.a;
                if (Intrinsics.a(u8Var2, r8Var)) {
                    hlVar2.W(614000266);
                    int i11 = i4 << 6;
                    int i12 = (i11 & 7168) | (i11 & 896) | 48;
                    hl hlVar7 = hlVar2;
                    e7Var4 = e7Var3;
                    hlVar3 = hlVar7;
                    z2 = r5;
                    e7Var5 = e7Var12;
                    y3Var = y3Var2;
                    e7Var6 = e7Var2;
                    i6 = i10;
                    xlVar2 = xlVar;
                    i7 = i5;
                    k((w8) j2.getValue(), r8Var, z8Var2, function02, hlVar3, i12);
                    hlVar3.p(z2);
                    z8Var2 = z8Var;
                    function02 = function0;
                } else {
                    hl hlVar8 = hlVar2;
                    e7Var4 = e7Var3;
                    hlVar3 = hlVar8;
                    boolean z4 = r5;
                    e7Var5 = e7Var12;
                    y3Var = y3Var2;
                    e7Var6 = e7Var2;
                    i6 = i10;
                    xlVar2 = xlVar;
                    i7 = i5;
                    q8 q8Var = q8.a;
                    if (Intrinsics.a(u8Var2, q8Var)) {
                        hlVar3.W(614003181);
                        int i13 = i4 << 6;
                        int i14 = (i13 & 896) | 48 | (i13 & 7168);
                        z8Var2 = z8Var;
                        function02 = function0;
                        z2 = z4;
                        k((w8) j2.getValue(), q8Var, z8Var2, function02, hlVar3, i14);
                        hlVar3.p(z2);
                    } else {
                        o8 o8Var = o8.a;
                        if (Intrinsics.a(u8Var2, o8Var)) {
                            hlVar3.W(614006354);
                            int i15 = i4 << 6;
                            int i16 = (i15 & 896) | 48 | (i15 & 7168);
                            z8Var2 = z8Var;
                            function02 = function0;
                            z2 = z4;
                            k((w8) j2.getValue(), o8Var, z8Var2, function02, hlVar3, i16);
                            hlVar3.p(z2);
                        } else {
                            z8Var2 = z8Var;
                            function02 = function0;
                            e7Var7 = e7Var11;
                            if (Intrinsics.a(u8Var2, p8Var)) {
                                hlVar3.W(614009521);
                                p4.g((w8) j2.getValue(), z8Var2, hlVar3, i7);
                                hlVar3.p(z4);
                            } else if (!Intrinsics.a(u8Var2, t8.a)) {
                                hlVar3.W(613997480);
                                hlVar3.p(z4);
                                l.a();
                                return;
                            } else {
                                hlVar3.W(614011823);
                                n(z8Var2, hlVar3, i4 & 14);
                                hlVar3.p(z4);
                            }
                        }
                    }
                }
                e7Var7 = e7Var11;
            }
            am0 c3 = zd.b().c(new sq1(20.0f));
            vk0 d3 = vd.d(kdVar, false);
            int i17 = i7;
            int hashCode2 = Long.hashCode(hlVar3.T);
            kw0 l3 = hlVar3.l();
            am0 N2 = p4.N(hlVar3, c3);
            hlVar3.a0();
            if (hlVar3.S) {
                hlVar3.k(xlVar2);
            } else {
                hlVar3.k0();
            }
            ka0.C(hlVar3, d3, e7Var6);
            ka0.C(hlVar3, l3, e7Var5);
            ka0.u(hlVar3, Integer.valueOf(hashCode2), e7Var4);
            ka0.A(hlVar3, y3Var);
            ka0.C(hlVar3, N2, e7Var7);
            qt0 qt0Var = ((w8) j2.getValue()).b;
            if (Intrinsics.a(qt0Var, mt0.a)) {
                hlVar3.W(-234640357);
                hlVar3.p(false);
            } else if (Intrinsics.a(qt0Var, pt0.a)) {
                hlVar3.W(-234638845);
                r((w8) j2.getValue(), z8Var2, function02, hlVar3, i6);
                hlVar3.p(false);
            } else if (Intrinsics.a(qt0Var, lt0.a)) {
                hlVar3.W(-234636045);
                e(z8Var2, hlVar3, i4 & 14);
                hlVar3.p(false);
            } else if (Intrinsics.a(qt0Var, nt0.a)) {
                hlVar3.W(-234633906);
                l(z8Var2, hlVar3, i4 & 14);
                hlVar3.p(false);
            } else if (Intrinsics.a(qt0Var, jt0.a)) {
                hlVar3.W(-234631750);
                b((w8) j2.getValue(), z8Var2, hlVar3, i17);
                hlVar3.p(false);
            } else if (Intrinsics.a(qt0Var, kt0.a)) {
                hlVar3.W(-234629255);
                c((w8) j2.getValue(), z8Var2, hlVar3, i17);
                hlVar3.p(false);
            } else if (!(qt0Var instanceof ot0)) {
                hlVar3.W(-234642170);
                hlVar3.p(false);
                l.a();
                return;
            } else {
                hlVar3.W(-234626777);
                o(((ot0) qt0Var).a, (w8) j2.getValue(), z8Var2, hlVar3, (i4 << 6) & 896);
                hlVar3.p(false);
            }
            hlVar3.p(true);
            if (z) {
                hlVar3.W(1855212253);
                am0 a2 = xa1.a(zd.a(j50.h), 1.0f);
                WeakHashMap weakHashMap = kp1.w;
                View view = (View) hlVar3.j(AndroidCompositionLocals_androidKt.f);
                kp1 f3 = sc1.f(view);
                boolean h3 = hlVar3.h(f3) | hlVar3.h(view);
                Object L2 = hlVar3.L();
                if (h3 || L2 == j41Var) {
                    L2 = new c(f3, 21, view);
                    hlVar3.h0(L2);
                }
                p4.b(f3, (Function1) L2, hlVar3);
                z3 = false;
                vd.a(mo.g(yr1.g0(a2, f3.f), hi.b, m90.m).c(new sq1(30.0f)), hlVar3, 0);
            } else {
                z3 = false;
                hlVar3.W(1851050193);
            }
            hlVar3.p(z3);
            hlVar3.p(true);
        } else {
            hlVar3.R();
        }
        i11 r2 = hlVar3.r();
        if (r2 != null) {
            r2.d = new jx(z8Var2, function02, z, i2);
        }
    }

    public static final void i(w8 w8Var, z8 z8Var, Function0 function0, hl hlVar, int i2) {
        int i3;
        hlVar.Y(-46560091);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(w8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(z8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= hlVar.h(function0) ? 256 : 128;
        }
        if (hlVar.O(i3 & 1, (i3 & 147) != 146)) {
            boolean h2 = ((i3 & 896) == 256) | hlVar.h(w8Var) | hlVar.h(z8Var);
            Object L = hlVar.L();
            if (h2 || L == bl.a) {
                L = new kc(w8Var, z8Var, function0, i4);
                hlVar.h0(L);
            }
            a(0, 1, hlVar, (Function0) L, false);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new ox(w8Var, z8Var, function0, i2, 0);
        }
    }

    public static final void j(int i2, hl hlVar) {
        hlVar.Y(1781766080);
        if (hlVar.O(i2 & 1, i2 != 0)) {
            la0.j(false, null, hlVar, 6, 2);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new e9(i2);
        }
    }

    public static final void k(w8 w8Var, u8 u8Var, z8 z8Var, Function0 function0, hl hlVar, int i2) {
        int i3;
        w8Var.getClass();
        function0.getClass();
        hlVar.Y(-1350306587);
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(w8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? hlVar.f(u8Var) : hlVar.h(u8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= hlVar.h(z8Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= hlVar.h(function0) ? 2048 : 1024;
        }
        if (hlVar.O(i3 & 1, (i3 & 1171) != 1170)) {
            am0 S = S(xa1.b);
            yi a2 = wi.a(yr1.c, j50.s, hlVar, 0);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, S);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            e7 e7Var = xk.e;
            ka0.C(hlVar, a2, e7Var);
            e7 e7Var2 = xk.d;
            ka0.C(hlVar, l2, e7Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            e7 e7Var3 = xk.f;
            ka0.u(hlVar, valueOf, e7Var3);
            y3 y3Var = xk.g;
            ka0.A(hlVar, y3Var);
            e7 e7Var4 = xk.c;
            ka0.C(hlVar, N, e7Var4);
            yd0 yd0Var = new yd0(1.0f, true);
            vk0 d2 = vd.d(j50.g, false);
            int i4 = i3;
            int hashCode2 = Long.hashCode(hlVar.T);
            kw0 l3 = hlVar.l();
            am0 N2 = p4.N(hlVar, yd0Var);
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d2, e7Var);
            ka0.C(hlVar, l3, e7Var2);
            ka0.u(hlVar, Integer.valueOf(hashCode2), e7Var3);
            ka0.A(hlVar, y3Var);
            ka0.C(hlVar, N2, e7Var4);
            if (u8Var.equals(r8.a)) {
                hlVar.W(-1899260016);
                int i5 = i4 >> 3;
                la0.m(w8Var, z8Var, function0, hlVar, (i4 & 14) | (i5 & 112) | (i5 & 896));
                hlVar.p(false);
            } else if (u8Var.equals(q8.a)) {
                hlVar.W(-1899257563);
                yr1.s(w8Var.g, hlVar, 0);
                hlVar.p(false);
            } else if (u8Var.equals(o8.a)) {
                hlVar.W(-1899255270);
                yr1.d(w8Var.h, z8Var, hlVar, (i4 >> 3) & 112);
                hlVar.p(false);
            } else {
                hlVar.W(-1899252947);
                hlVar.p(false);
            }
            hlVar.p(true);
            yr1.g(u8Var, z8Var, hlVar, (i4 >> 3) & 126);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new kx(w8Var, u8Var, z8Var, function0, i2, 0);
        }
    }

    public static final void l(z8 z8Var, hl hlVar, int i2) {
        int i3;
        z8 z8Var2;
        hlVar.Y(1902925822);
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(z8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 0;
        if (hlVar.O(i3 & 1, (i3 & 3) != 2)) {
            boolean h2 = hlVar.h(z8Var);
            Object L = hlVar.L();
            j41 j41Var = bl.a;
            if (h2 || L == j41Var) {
                v3 v3Var = new v3(0, z8Var, z8.class, "resumeGame", "resumeGame()V", 0, 16);
                z8Var2 = z8Var;
                hlVar.h0(v3Var);
                L = v3Var;
            } else {
                z8Var2 = z8Var;
            }
            Function0 function0 = (Function0) ((b40) L);
            boolean h3 = hlVar.h(z8Var2);
            Object L2 = hlVar.L();
            if (h3 || L2 == j41Var) {
                v3 v3Var2 = new v3(0, z8Var2, z8.class, "restartRun", "restartRun()V", 0, 17);
                hlVar.h0(v3Var2);
                L2 = v3Var2;
            }
            Function0 function02 = (Function0) ((b40) L2);
            boolean h4 = hlVar.h(z8Var2);
            Object L3 = hlVar.L();
            if (h4 || L3 == j41Var) {
                v3 v3Var3 = new v3(0, z8Var2, z8.class, "quitGameplayToHome", "quitGameplayToHome()V", 0, 18);
                hlVar.h0(v3Var3);
                L3 = v3Var3;
            }
            m(function0, function02, (Function0) ((b40) L3), hlVar, 0);
        } else {
            z8Var2 = z8Var;
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new rt0(z8Var2, i2, i4);
        }
    }

    public static final void m(final Function0 function0, final Function0 function02, final Function0 function03, hl hlVar, int i2) {
        hlVar.Y(-922571552);
        int i3 = (hlVar.h(function0) ? 4 : 2) | i2 | (hlVar.h(function02) ? 32 : 16) | (hlVar.h(function03) ? 256 : 128);
        if (hlVar.O(i3 & 1, (i3 & 147) != 146)) {
            yr1.l(m90.J(553860673, new s30() { // from class: xt0
                @Override // defpackage.s30
                public final Object a(Object obj, Object obj2, Object obj3) {
                    hl hlVar2 = (hl) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zi) obj).getClass();
                    if (hlVar2.O(intValue & 1, (intValue & 17) != 16)) {
                        xl0 xl0Var = xl0.a;
                        yr1.e(R.drawable.title_paused, xa1.b(xa1.a(xl0Var, 1.0f), 80.0f), null, hlVar2, 48, 4);
                        ca0.b(hlVar2, xa1.b(xl0Var, 18.0f));
                        am0 a2 = xa1.a(xl0Var, 1.0f);
                        r41 a3 = q41.a(yr1.e, j50.q, hlVar2, 54);
                        int hashCode = Long.hashCode(hlVar2.T);
                        kw0 l2 = hlVar2.l();
                        am0 N = p4.N(hlVar2, a2);
                        yk.b.getClass();
                        xl xlVar = xk.b;
                        hlVar2.a0();
                        if (hlVar2.S) {
                            hlVar2.k(xlVar);
                        } else {
                            hlVar2.k0();
                        }
                        ka0.C(hlVar2, a3, xk.e);
                        ka0.C(hlVar2, l2, xk.d);
                        ka0.u(hlVar2, Integer.valueOf(hashCode), xk.f);
                        ka0.A(hlVar2, xk.g);
                        ka0.C(hlVar2, N, xk.c);
                        yr1.u(R.drawable.icon_resume, function0, xa1.c(xl0Var, 92.0f), "Resume", hlVar2, 3456);
                        yr1.u(R.drawable.icon_restart, function02, xa1.c(xl0Var, 92.0f), "Restart", hlVar2, 3456);
                        hlVar2.p(true);
                        yr1.t(R.drawable.button_quit, Function0.this, xa1.b(xa1.a(xl0Var, 0.62f), 56.0f), false, "Quit", hlVar2, 24960, 8);
                    } else {
                        hlVar2.R();
                    }
                    return Unit.a;
                }
            }, hlVar), hlVar, 6);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new h40(function0, function02, function03, i2, 1);
        }
    }

    public static final void n(z8 z8Var, hl hlVar, int i2) {
        int i3;
        hlVar.Y(-1118547282);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(z8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (hlVar.O(i3 & 1, (i3 & 3) != 2)) {
            s6 s6Var = (s6) hlVar.j(yl.r);
            am0 R = yr1.R(S(xa1.b), 18.0f);
            yi a2 = wi.a(yr1.c, j50.t, hlVar, 48);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, R);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, a2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            xl0 xl0Var = xl0.a;
            yr1.e(R.drawable.title_privacy_policy, xa1.b(xa1.a(xl0Var, 1.0f), 96.0f), xm.b, hlVar, 432, 0);
            ca0.b(hlVar, xa1.b(xl0Var, 16.0f));
            nf1.a(n41.a(8.0f), hi.b(0.84f, hi.c), m90.J(-795303427, new jl(5, s6Var), hlVar), hlVar, 121);
            ca0.b(hlVar, new yd0(1.0f, true));
            boolean h2 = hlVar.h(z8Var);
            Object L = hlVar.L();
            if (h2 || L == bl.a) {
                L = new st0(z8Var, 3);
                hlVar.h0(L);
            }
            yr1.u(R.drawable.icon_back, (Function0) L, xa1.c(xl0Var, 100.0f), "Back", hlVar, 3456);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new rt0(z8Var, i2, i4);
        }
    }

    public static final void o(boolean z, w8 w8Var, z8 z8Var, hl hlVar, int i2) {
        int i3;
        w8Var.getClass();
        hlVar.Y(-926728121);
        if ((i2 & 6) == 0) {
            i3 = (hlVar.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(w8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= hlVar.h(z8Var) ? 256 : 128;
        }
        int i4 = i3;
        if (hlVar.O(i4 & 1, (i4 & 147) != 146)) {
            int i5 = w8Var.d;
            boolean h2 = hlVar.h(z8Var);
            Object L = hlVar.L();
            if (h2 || L == bl.a) {
                v3 v3Var = new v3(0, z8Var, z8.class, "dismissResultToHome", "dismissResultToHome()V", 0, 19);
                hlVar.h0(v3Var);
                L = v3Var;
            }
            p(i5, i4 & 14, hlVar, (Function0) ((b40) L), z);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new jx(z, w8Var, z8Var, i2);
        }
    }

    public static final void p(final int i2, int i3, hl hlVar, final Function0 function0, final boolean z) {
        int i4;
        hlVar.Y(790897930);
        if ((i3 & 6) == 0) {
            i4 = (hlVar.g(z) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= hlVar.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= hlVar.h(function0) ? 256 : 128;
        }
        if (hlVar.O(i4 & 1, (i4 & 147) != 146)) {
            yr1.l(m90.J(-2013270327, new s30() { // from class: wt0
                @Override // defpackage.s30
                public final Object a(Object obj, Object obj2, Object obj3) {
                    hl hlVar2 = (hl) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zi) obj).getClass();
                    if (hlVar2.O(intValue & 1, (intValue & 17) != 16)) {
                        int i5 = z ? R.drawable.title_victory : R.drawable.title_fail;
                        xl0 xl0Var = xl0.a;
                        yr1.e(i5, xa1.b(xa1.a(xl0Var, 1.0f), 82.0f), null, hlVar2, 48, 4);
                        ca0.b(hlVar2, xa1.b(xl0Var, 12.0f));
                        uq1.g(i2, null, hlVar2, 0);
                        ca0.b(hlVar2, xa1.b(xl0Var, 16.0f));
                        yr1.x(function0, xa1.b(xa1.a(xl0Var, 0.58f), 52.0f), hlVar2, 390);
                    } else {
                        hlVar2.R();
                    }
                    return Unit.a;
                }
            }, hlVar), hlVar, 6);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new ci0(i2, i3, function0, z);
        }
    }

    public static final void q(final u8 u8Var, hl hlVar, final int i2) {
        i11 r2;
        Function2 function2;
        Activity activity;
        int i3;
        hlVar.Y(1463361705);
        int i4 = (hlVar.f(u8Var) ? 4 : 2) | i2;
        final int i5 = 0;
        final int i6 = 1;
        if (hlVar.O(i4 & 1, (i4 & 3) != 2)) {
            Context context = (Context) hlVar.j(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        context.getClass();
                    }
                } else {
                    activity = (Activity) context;
                    break;
                }
            }
            if (activity == null) {
                r2 = hlVar.r();
                if (r2 != null) {
                    function2 = new Function2(u8Var, i2, i5) { // from class: lx
                        public final /* synthetic */ int d;
                        public final /* synthetic */ u8 e;

                        {
                            this.d = i5;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object b(Object obj, Object obj2) {
                            int i7 = this.d;
                            hl hlVar2 = (hl) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    uq1.q(this.e, hlVar2, gb0.P(1));
                                    break;
                                default:
                                    uq1.q(this.e, hlVar2, gb0.P(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r2.d = function2;
                }
                return;
            }
            if (Intrinsics.a(u8Var, s8.a) || Intrinsics.a(u8Var, t8.a)) {
                i3 = 10;
            } else {
                if (!Intrinsics.a(u8Var, r8.a) && !Intrinsics.a(u8Var, q8.a) && !Intrinsics.a(u8Var, o8.a) && !Intrinsics.a(u8Var, p8.a)) {
                    l.a();
                    return;
                }
                i3 = 1;
            }
            Integer valueOf = Integer.valueOf(i3);
            boolean h2 = hlVar.h(activity) | hlVar.d(i3);
            Object L = hlVar.L();
            if (h2 || L == bl.a) {
                L = new mx(activity, i3);
                hlVar.h0(L);
            }
            p4.a(activity, valueOf, (Function1) L, hlVar);
        } else {
            hlVar.R();
        }
        r2 = hlVar.r();
        if (r2 != null) {
            function2 = new Function2(u8Var, i2, i6) { // from class: lx
                public final /* synthetic */ int d;
                public final /* synthetic */ u8 e;

                {
                    this.d = i6;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    int i7 = this.d;
                    hl hlVar2 = (hl) obj;
                    ((Integer) obj2).getClass();
                    switch (i7) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            uq1.q(this.e, hlVar2, gb0.P(1));
                            break;
                        default:
                            uq1.q(this.e, hlVar2, gb0.P(1));
                            break;
                    }
                    return Unit.a;
                }
            };
            r2.d = function2;
        }
    }

    public static final void r(w8 w8Var, z8 z8Var, Function0 function0, hl hlVar, int i2) {
        int i3;
        boolean z;
        Object obj;
        w8Var.getClass();
        function0.getClass();
        hlVar.Y(43263921);
        if ((i2 & 6) == 0) {
            i3 = i2 | (hlVar.h(w8Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(z8Var) ? 32 : 16;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (hlVar.O(i3 & 1, (i3 & 19) != 18)) {
            vy vyVar = xa1.b;
            vk0 d2 = vd.d(j50.g, false);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, vyVar);
            yk.b.getClass();
            Function0 function02 = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(function02);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            final Context context = (Context) hlVar.j(AndroidCompositionLocals_androidKt.b);
            v8 v8Var = w8Var.c;
            boolean z2 = v8Var.a;
            boolean z3 = v8Var.b;
            boolean z4 = v8Var.c;
            boolean h2 = hlVar.h(z8Var);
            Object L = hlVar.L();
            Object obj2 = bl.a;
            if (h2 || L == obj2) {
                z = z4;
                obj = obj2;
                Object v3Var = new v3(0, z8Var, z8.class, "toggleMusic", "toggleMusic()V", 0, 20);
                hlVar.h0(v3Var);
                L = v3Var;
            } else {
                z = z4;
                obj = obj2;
            }
            Function0 function03 = (Function0) ((b40) L);
            boolean h3 = hlVar.h(z8Var);
            Object L2 = hlVar.L();
            if (h3 || L2 == obj) {
                Object v3Var2 = new v3(0, z8Var, z8.class, "toggleSound", "toggleSound()V", 0, 21);
                hlVar.h0(v3Var2);
                L2 = v3Var2;
            }
            Function0 function04 = (Function0) ((b40) L2);
            boolean h4 = hlVar.h(z8Var);
            Object L3 = hlVar.L();
            if (h4 || L3 == obj) {
                Object v3Var3 = new v3(0, z8Var, z8.class, "toggleVibration", "toggleVibration()V", 0, 22);
                hlVar.h0(v3Var3);
                L3 = v3Var3;
            }
            Function0 function05 = (Function0) ((b40) L3);
            boolean h5 = hlVar.h(context);
            Object L4 = hlVar.L();
            if (h5 || L4 == obj) {
                L4 = new Function0() { // from class: zt0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i4;
                        Context context2 = context;
                        switch (i6) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                context2.getClass();
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", "Try Feather Dash: jump over cars and collect golden feathers.");
                                context2.startActivity(Intent.createChooser(intent, "Share Feather Dash"));
                                break;
                            default:
                                context2.getClass();
                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.feathherdashh.dashgame"));
                                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.feathherdashh.dashgame"));
                                try {
                                    context2.startActivity(intent2);
                                } catch (ActivityNotFoundException unused) {
                                    context2.startActivity(intent3);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                hlVar.h0(L4);
            }
            Function0 function06 = (Function0) L4;
            boolean h6 = hlVar.h(context);
            Object L5 = hlVar.L();
            if (h6 || L5 == obj) {
                L5 = new Function0() { // from class: zt0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i5;
                        Context context2 = context;
                        switch (i6) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                context2.getClass();
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", "Try Feather Dash: jump over cars and collect golden feathers.");
                                context2.startActivity(Intent.createChooser(intent, "Share Feather Dash"));
                                break;
                            default:
                                context2.getClass();
                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.feathherdashh.dashgame"));
                                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.feathherdashh.dashgame"));
                                try {
                                    context2.startActivity(intent2);
                                } catch (ActivityNotFoundException unused) {
                                    context2.startActivity(intent3);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                hlVar.h0(L5);
            }
            Function0 function07 = (Function0) L5;
            boolean h7 = hlVar.h(z8Var);
            Object L6 = hlVar.L();
            if (h7 || L6 == obj) {
                L6 = new st0(z8Var, 4);
                hlVar.h0(L6);
            }
            Function0 function08 = (Function0) L6;
            boolean h8 = hlVar.h(z8Var);
            Object L7 = hlVar.L();
            if (h8 || L7 == obj) {
                Object v3Var4 = new v3(0, z8Var, z8.class, "closeOverlay", "closeOverlay()V", 0, 23);
                hlVar.h0(v3Var4);
                L7 = v3Var4;
            }
            s(z2, z3, z, function03, function04, function05, function06, function07, function08, (Function0) ((b40) L7), hlVar, 0);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new ox(w8Var, z8Var, function0, i2, 2);
        }
    }

    public static final void s(final boolean z, final boolean z2, final boolean z3, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final Function0 function06, final Function0 function07, hl hlVar, final int i2) {
        hlVar.Y(-1086984275);
        int i3 = i2 | (hlVar.g(z) ? 4 : 2) | (hlVar.g(z2) ? 32 : 16) | (hlVar.g(z3) ? 256 : 128) | (hlVar.h(function0) ? 2048 : 1024) | (hlVar.h(function02) ? 16384 : 8192) | (hlVar.h(function03) ? 131072 : 65536) | (hlVar.h(function04) ? 1048576 : 524288) | (hlVar.h(function05) ? 8388608 : 4194304) | (hlVar.h(function06) ? 67108864 : 33554432) | (hlVar.h(function07) ? 536870912 : 268435456);
        if (hlVar.O(i3 & 1, (306783379 & i3) != 306783378)) {
            am0 S = yr1.S(S(xa1.b), 20.0f, 44.0f);
            vk0 d2 = vd.d(j50.k, false);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, S);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            yr1.v(R.drawable.panel_large, xa1.b(xa1.a(xl0.a, 1.0f), 400.0f), 0.04f, m90.J(-1513089719, new s30() { // from class: tt0
                @Override // defpackage.s30
                public final Object a(Object obj, Object obj2, Object obj3) {
                    hl hlVar2 = (hl) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zd) obj).getClass();
                    if (hlVar2.O(intValue & 1, (intValue & 17) != 16)) {
                        am0 S2 = yr1.S(xa1.b, 24.0f, 18.0f);
                        vk0 d3 = vd.d(j50.g, false);
                        int hashCode2 = Long.hashCode(hlVar2.T);
                        kw0 l3 = hlVar2.l();
                        am0 N2 = p4.N(hlVar2, S2);
                        yk.b.getClass();
                        xl xlVar2 = xk.b;
                        hlVar2.a0();
                        if (hlVar2.S) {
                            hlVar2.k(xlVar2);
                        } else {
                            hlVar2.k0();
                        }
                        e7 e7Var = xk.e;
                        ka0.C(hlVar2, d3, e7Var);
                        e7 e7Var2 = xk.d;
                        ka0.C(hlVar2, l3, e7Var2);
                        Integer valueOf = Integer.valueOf(hashCode2);
                        e7 e7Var3 = xk.f;
                        ka0.u(hlVar2, valueOf, e7Var3);
                        y3 y3Var = xk.g;
                        ka0.A(hlVar2, y3Var);
                        e7 e7Var4 = xk.c;
                        ka0.C(hlVar2, N2, e7Var4);
                        yr1.e(R.drawable.title_settings, xa1.b(xa1.a(zd.a(j50.h), 0.82f), 88.0f), null, hlVar2, 0, 4);
                        yr1.u(R.drawable.icon_close, Function0.this, xa1.c(zd.a(j50.i), 58.0f), "Close", hlVar2, 3072);
                        am0 V = yr1.V(xa1.a(zd.a(j50.k), 1.0f), 0.0f, 0.0f, 13);
                        yi a2 = wi.a(new h9(0.0f, true, new e9(1, (byte) 0)), j50.t, hlVar2, 54);
                        int hashCode3 = Long.hashCode(hlVar2.T);
                        kw0 l4 = hlVar2.l();
                        am0 N3 = p4.N(hlVar2, V);
                        hlVar2.a0();
                        if (hlVar2.S) {
                            hlVar2.k(xlVar2);
                        } else {
                            hlVar2.k0();
                        }
                        ka0.C(hlVar2, a2, e7Var);
                        ka0.C(hlVar2, l4, e7Var2);
                        ka0.u(hlVar2, Integer.valueOf(hashCode3), e7Var3);
                        ka0.A(hlVar2, y3Var);
                        ka0.C(hlVar2, N3, e7Var4);
                        xl0 xl0Var = xl0.a;
                        am0 a3 = xa1.a(xl0Var, 1.0f);
                        r41 a4 = q41.a(yr1.e, j50.q, hlVar2, 54);
                        int hashCode4 = Long.hashCode(hlVar2.T);
                        kw0 l5 = hlVar2.l();
                        am0 N4 = p4.N(hlVar2, a3);
                        hlVar2.a0();
                        if (hlVar2.S) {
                            hlVar2.k(xlVar2);
                        } else {
                            hlVar2.k0();
                        }
                        ka0.C(hlVar2, a4, e7Var);
                        ka0.C(hlVar2, l5, e7Var2);
                        ka0.u(hlVar2, Integer.valueOf(hashCode4), e7Var3);
                        ka0.A(hlVar2, y3Var);
                        ka0.C(hlVar2, N4, e7Var4);
                        yr1.y(z, R.drawable.toggle_music_on, R.drawable.toggle_music_off, xa1.c(xl0Var, 88.0f), function0, hlVar2, 3072);
                        yr1.y(z2, R.drawable.toggle_sound_on, R.drawable.toggle_sound_off, xa1.c(xl0Var, 88.0f), function02, hlVar2, 3072);
                        yr1.y(z3, R.drawable.toggle_vibration_on, R.drawable.toggle_vibration_off, xa1.c(xl0Var, 88.0f), function03, hlVar2, 3072);
                        hlVar2.p(true);
                        am0 a5 = xa1.a(xl0Var, 1.0f);
                        r41 a6 = q41.a(new h9(0.0f, true, new e9(1, (byte) 0)), j50.p, hlVar2, 6);
                        int hashCode5 = Long.hashCode(hlVar2.T);
                        kw0 l6 = hlVar2.l();
                        am0 N5 = p4.N(hlVar2, a5);
                        hlVar2.a0();
                        if (hlVar2.S) {
                            hlVar2.k(xlVar2);
                        } else {
                            hlVar2.k0();
                        }
                        ka0.C(hlVar2, a6, e7Var);
                        ka0.C(hlVar2, l6, e7Var2);
                        ka0.u(hlVar2, Integer.valueOf(hashCode5), e7Var3);
                        ka0.A(hlVar2, y3Var);
                        ka0.C(hlVar2, N5, e7Var4);
                        yr1.t(R.drawable.button_share, function04, xa1.b(s41.a(), 62.0f), false, "Share", hlVar2, 24576, 8);
                        yr1.t(R.drawable.button_rate, function05, xa1.b(s41.a(), 62.0f), false, "Rate", hlVar2, 24576, 8);
                        hlVar2.p(true);
                        yr1.t(R.drawable.button_privacy_policy, function06, xa1.b(xa1.a(xl0Var, 0.82f), 62.0f), false, "Privacy policy", hlVar2, 24960, 8);
                        hlVar2.p(true);
                        hlVar2.p(true);
                    } else {
                        hlVar2.R();
                    }
                    return Unit.a;
                }
            }, hlVar), hlVar, 3504, 0);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new Function2(z, z2, z3, function0, function02, function03, function04, function05, function06, function07, i2) { // from class: ut0
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ Function0 l;
                public final /* synthetic */ Function0 m;
                public final /* synthetic */ Function0 n;

                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int P = gb0.P(1);
                    uq1.s(this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (hl) obj, P);
                    return Unit.a;
                }
            };
        }
    }

    public static final void t(nq0 nq0Var, u70 u70Var, et0 et0Var, t70 t70Var, c80 c80Var, long j2) {
        float intBitsToFloat;
        ArrayList arrayList = c80Var.b;
        long j3 = u70Var.c;
        boolean z = u70Var.d;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (u70Var.c & 4294967295L));
        boolean z2 = u70Var.h;
        if (!z2 && z) {
            c80Var.a = 0;
            arrayList.clear();
        }
        if (!u(u70Var) && (z2 || !z)) {
            if (arrayList.size() == 3) {
                int i2 = c80Var.a;
                c80Var.a = i2 + 1;
                arrayList.set(i2, u70Var);
            } else {
                arrayList.add(u70Var);
            }
            if (c80Var.a == 3) {
                c80Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((u70) arrayList.get(i3)).c >> 32))));
            }
            intBitsToFloat2 = (float) CollectionsKt.m(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((u70) arrayList.get(i4)).c & 4294967295L))));
            }
            intBitsToFloat3 = (float) CollectionsKt.m(arrayList3);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (et0Var != null) {
            int i5 = t70Var.a;
            if (i5 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i5 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = et0Var == et0.e ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L) : (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        ((tq) nq0Var.e).a(u70Var.b, wq0.e(floatToRawIntBits, j2));
    }

    public static final boolean u(u70 u70Var) {
        return u70Var.h && !u70Var.d;
    }

    public static final float v(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static wq w(sn snVar, Function2 function2) {
        g gVar = g.d;
        vn vnVar = vn.d;
        CoroutineContext b2 = jn.b(snVar, gVar);
        vn vnVar2 = vn.d;
        wq wqVar = new wq(b2, true);
        wqVar.r0(vnVar, wqVar, function2);
        return wqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [e11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [d3] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List x(db1 db1Var, Integer num, int i2, Integer num2) {
        int i3;
        int s2;
        mn0 mn0Var;
        if (db1Var.w || db1Var.p() == 0) {
            return nv.d;
        }
        ?? e11Var = new e11(db1Var);
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = db1Var.v;
            if (i3 < 0) {
                i3 = db1Var.E(db1Var.b, i2);
            }
        }
        if (num == 0) {
            int N = db1Var.i - db1Var.N(db1Var.b, db1Var.r(i2));
            en0 en0Var = db1Var.s;
            num = Integer.valueOf(N + ((en0Var == null || (mn0Var = (mn0) en0Var.b(i2)) == null) ? 0 : mn0Var.b));
        }
        int r2 = db1Var.r(i2) * 5;
        int[] iArr = db1Var.b;
        if (r2 < iArr.length) {
            s2 = db1Var.s(i2);
        } else {
            int E = i3 >= 0 ? db1Var.E(iArr, i3) : i3;
            s2 = db1Var.s(i3);
            int i4 = i3;
            i3 = E;
            i2 = i4;
        }
        while (i2 >= 0) {
            e11Var.c(s2, (db1Var.b[(db1Var.r(i2) * 5) + 1] & 536870912) != 0 ? db1Var.t(i2) : bl.a, db1Var.O(i2), num);
            num = db1Var.b(i2);
            if (i3 >= 0) {
                int E2 = db1Var.E(db1Var.b, i3);
                s2 = db1Var.s(i3);
                int i5 = i3;
                i3 = E2;
                i2 = i5;
            } else {
                i2 = i3;
            }
        }
        return e11Var.a;
    }

    public static final x51 z(bn0 bn0Var) {
        LinkedHashMap linkedHashMap = bn0Var.a;
        e61 e61Var = (e61) linkedHashMap.get(l);
        Bundle bundle = null;
        if (e61Var == null) {
            dd0.e("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        wj wjVar = (wj) linkedHashMap.get(m);
        if (wjVar == null) {
            dd0.e("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(n);
        String str = (String) linkedHashMap.get(s40.k);
        if (str == null) {
            dd0.e("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        c61 e2 = e61Var.a().e();
        z51 z51Var = e2 instanceof z51 ? (z51) e2 : null;
        if (z51Var == null) {
            dd0.j("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = J(wjVar).b;
        x51 x51Var = (x51) linkedHashMap2.get(str);
        if (x51Var != null) {
            return x51Var;
        }
        z51Var.b();
        Bundle bundle3 = z51Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                ov.d.getClass();
                bundle4 = yr1.D((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                z51Var.c = null;
            }
            bundle = bundle4;
        }
        x51 h2 = ca0.h(bundle, bundle2);
        linkedHashMap2.put(str, h2);
        return h2;
    }

    public j41 K(MainActivity mainActivity, Object obj) {
        return null;
    }

    public abstract Object O(int i2, Intent intent);

    public abstract Intent y(MainActivity mainActivity, Object obj);
}
