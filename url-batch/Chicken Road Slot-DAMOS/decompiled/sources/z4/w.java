package z4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.z0;
import b0.d1;
import c2.i1;
import com.appsflyer.R;
import com.google.android.gms.tasks.Task;
import d2.m1;
import f8.r0;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.o0;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m.j1;
import n0.i0;
import n0.s1;
import s.p0;
import te.a1;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class w {
    public static final boolean A(i1.t tVar) {
        c2.g0 g0Var;
        i1 i1Var;
        c2.g0 g0Var2;
        i1 i1Var2 = tVar.f3312v;
        return (i1Var2 == null || (g0Var = i1Var2.B) == null || !g0Var.F() || (i1Var = tVar.f3312v) == null || (g0Var2 = i1Var.B) == null || !g0Var2.E()) ? false : true;
    }

    public static final d1.l B(d1.l lVar, n0.i0 i0Var) {
        if (lVar.a(d1.h.f3303d)) {
            return lVar;
        }
        i0Var.S(1219399079, 0, null, null);
        d1.l lVar2 = (d1.l) lVar.b(d1.i.f3304a, new b3.e(2, i0Var));
        i0Var.p(false);
        return lVar2;
    }

    public static final d1.l C(d1.l lVar, n0.i0 i0Var) {
        i0Var.W(439770924);
        d1.l B = B(lVar, i0Var);
        i0Var.p(false);
        return B;
    }

    public static a8.m D(a8.m mVar) {
        if (mVar instanceof a8.o) {
            return mVar;
        }
        if (mVar instanceof a8.n) {
            return mVar;
        }
        if (mVar instanceof Serializable) {
            return new a8.n(mVar);
        }
        a8.o oVar = new a8.o();
        mVar.getClass();
        oVar.f363d = mVar;
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void E(Context context) {
        LinkedHashMap linkedHashMap;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            t5.o.d().a(u5.k.f9644a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File file = new File(u5.a.f9611a.a(context), "androidx.work.workdb");
            String[] strArr = u5.k.f9645b;
            int a9 = o0.a(strArr.length);
            if (a9 < 16) {
                a9 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(a9);
            for (String str : strArr) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            Pair pair = new Pair(databasePath2, file);
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = o0.b(pair);
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        t5.o.d().g(u5.k.f9644a, "Over-writing contents of " + file3);
                    }
                    t5.o.d().a(u5.k.f9644a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List F(q0.k kVar, int i3, q0.k kVar2, boolean z10, boolean z11, boolean z12) {
        kotlin.collections.j0 j0Var;
        boolean z13;
        int i10;
        int i11;
        int u2 = kVar.u(i3);
        int i12 = i3 + u2;
        int f3 = kVar.f(i3);
        int f10 = kVar.f(i12);
        int i13 = f10 - f3;
        boolean z14 = i3 >= 0 && (kVar.f7761b[(kVar.r(i3) * 5) + 1] & 201326592) != 0;
        kVar2.w(u2);
        kVar2.x(i13, kVar2.f7777t);
        if (kVar.g < i12) {
            kVar.B(i12);
        }
        if (kVar.f7768k < f10) {
            kVar.C(f10, i12);
        }
        int[] iArr = kVar2.f7761b;
        int i14 = kVar2.f7777t;
        int i15 = i14 * 5;
        kotlin.collections.v.c(i15, i3 * 5, i12 * 5, kVar.f7761b, iArr);
        Object[] objArr = kVar2.f7762c;
        int i16 = kVar2.f7767i;
        System.arraycopy(kVar.f7762c, f3, objArr, i16, i13);
        int i17 = kVar2.f7779v;
        iArr[i15 + 2] = i17;
        int i18 = i14 - i3;
        int i19 = i14 + u2;
        int g = i16 - kVar2.g(iArr, i14);
        int i20 = kVar2.f7770m;
        int i21 = kVar2.f7769l;
        int length = objArr.length;
        boolean z15 = z14;
        int i22 = i20;
        int i23 = i14;
        while (i23 < i19) {
            if (i23 != i14) {
                int i24 = (i23 * 5) + 2;
                iArr[i24] = iArr[i24] + i18;
            }
            int[] iArr2 = iArr;
            int g2 = kVar2.g(iArr, i23) + g;
            if (i22 < i23) {
                i10 = i14;
                i11 = 0;
            } else {
                i10 = i14;
                i11 = kVar2.f7768k;
            }
            iArr2[(i23 * 5) + 4] = q0.k.i(g2, i11, i21, length);
            if (i23 == i22) {
                i22++;
            }
            i23++;
            i14 = i10;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        kVar2.f7770m = i22;
        int a9 = q0.j.a(kVar.f7763d, i3, kVar.p());
        int a10 = q0.j.a(kVar.f7763d, i12, kVar.p());
        if (a9 < a10) {
            ArrayList arrayList = kVar.f7763d;
            ArrayList arrayList2 = new ArrayList(a10 - a9);
            for (int i25 = a9; i25 < a10; i25++) {
                q0.b bVar = (q0.b) arrayList.get(i25);
                bVar.f7722a += i18;
                arrayList2.add(bVar);
            }
            kVar2.f7763d.addAll(q0.j.a(kVar2.f7763d, kVar2.f7777t, kVar2.p()), arrayList2);
            arrayList.subList(a9, a10).clear();
            j0Var = arrayList2;
        } else {
            j0Var = kotlin.collections.j0.f5574d;
        }
        if (!j0Var.isEmpty()) {
            HashMap hashMap = kVar.f7764e;
            HashMap hashMap2 = kVar2.f7764e;
            if (hashMap != null && hashMap2 != null) {
                int size = j0Var.size();
                for (int i26 = 0; i26 < size; i26++) {
                }
            }
        }
        int i27 = kVar2.f7779v;
        kVar2.O(i17);
        int E = kVar.E(kVar.f7761b, i3);
        if (!z12) {
            z13 = false;
        } else if (z10) {
            boolean z16 = E >= 0;
            if (z16) {
                kVar.P();
                kVar.a(E - kVar.f7777t);
                kVar.P();
            }
            kVar.a(i3 - kVar.f7777t);
            boolean H = kVar.H();
            if (z16) {
                kVar.M();
                kVar.j();
                kVar.M();
                kVar.j();
            }
            z13 = H;
        } else {
            boolean I = kVar.I(i3, u2);
            kVar.J(f3, i13, i3 - 1);
            z13 = I;
        }
        if (z13) {
            n0.m.a("Unexpectedly removed anchors");
        }
        int i28 = kVar2.f7772o;
        int i29 = iArr3[i15 + 1];
        kVar2.f7772o = i28 + ((1073741824 & i29) != 0 ? 1 : i29 & 67108863);
        if (z11) {
            kVar2.f7777t = i19;
            kVar2.f7767i = i16 + i13;
        }
        if (z15) {
            kVar2.T(i17);
        }
        return j0Var;
    }

    public static float G(EdgeEffect edgeEffect, float f3, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t3.b.c(edgeEffect, f3, f10);
        }
        edgeEffect.onPull(f3, f10);
        return f3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e2, code lost:
    
        r0 = kotlin.collections.u0.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e6, code lost:
    
        cf.c.m(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e5.k H(i5.a aVar, String str) {
        long j;
        Map b10;
        id.l lVar;
        aVar.getClass();
        i5.c K = aVar.K("PRAGMA table_info(`" + str + "`)");
        try {
            long j3 = 0;
            if (K.E()) {
                int H = i7.a.H(K, "name");
                int H2 = i7.a.H(K, com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY);
                int H3 = i7.a.H(K, "notnull");
                int H4 = i7.a.H(K, "pk");
                int H5 = i7.a.H(K, "dflt_value");
                id.h hVar = new id.h();
                while (true) {
                    String k10 = K.k(H);
                    j = j3;
                    hVar.put(k10, new e5.h(k10, K.k(H2), K.getLong(H3) != j3, (int) K.getLong(H4), K.isNull(H5) ? null : K.k(H5), 2));
                    if (!K.E()) {
                        break;
                    }
                    j3 = j;
                }
                b10 = hVar.b();
                cf.c.m(K, null);
            } else {
                b10 = kotlin.collections.k0.f5575d;
                b10.getClass();
                cf.c.m(K, null);
                j = 0;
            }
            K = aVar.K("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int H6 = i7.a.H(K, "id");
                int H7 = i7.a.H(K, "seq");
                int H8 = i7.a.H(K, "table");
                int H9 = i7.a.H(K, "on_delete");
                int H10 = i7.a.H(K, "on_update");
                List J = k7.e.J(K);
                K.reset();
                id.l lVar2 = new id.l();
                while (K.E()) {
                    if (K.getLong(H7) == j) {
                        int i3 = (int) K.getLong(H6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i10 = H6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : J) {
                            int i11 = H7;
                            List list = J;
                            if (((e5.f) obj).f3899d == i3) {
                                arrayList3.add(obj);
                            }
                            H7 = i11;
                            J = list;
                        }
                        int i12 = H7;
                        List list2 = J;
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList3.get(i13);
                            i13++;
                            e5.f fVar = (e5.f) obj2;
                            arrayList.add(fVar.f3901i);
                            arrayList2.add(fVar.f3902r);
                            arrayList3 = arrayList3;
                        }
                        lVar2.add(new e5.i(K.k(H8), K.k(H9), K.k(H10), arrayList, arrayList2));
                        H6 = i10;
                        H7 = i12;
                        J = list2;
                    }
                }
                id.l a9 = u0.a(lVar2);
                cf.c.m(K, null);
                K = aVar.K("PRAGMA index_list(`" + str + "`)");
                try {
                    int H11 = i7.a.H(K, "name");
                    int H12 = i7.a.H(K, "origin");
                    int H13 = i7.a.H(K, "unique");
                    if (H11 == -1 || H12 == -1 || H13 == -1) {
                        cf.c.m(K, null);
                        lVar = null;
                    } else {
                        id.l lVar3 = new id.l();
                        while (true) {
                            if (!K.E()) {
                                break;
                            }
                            if ("c".equals(K.k(H12))) {
                                e5.j K2 = k7.e.K(aVar, K.k(H11), K.getLong(H13) == 1);
                                if (K2 == null) {
                                    cf.c.m(K, null);
                                    lVar = null;
                                    break;
                                }
                                lVar3.add(K2);
                            }
                        }
                    }
                    return new e5.k(str, b10, a9, lVar);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static Executor I(Executor executor, f8.g0 g0Var) {
        executor.getClass();
        return executor == f8.d0.f4128d ? executor : new r0(executor, g0Var);
    }

    public static final boolean J(s.h0 h0Var, Object obj, Object obj2) {
        Object g = h0Var.g(obj);
        if (g == null) {
            return false;
        }
        if (!(g instanceof s.i0)) {
            if (!g.equals(obj2)) {
                return false;
            }
            h0Var.k(obj);
            return true;
        }
        s.i0 i0Var = (s.i0) g;
        boolean k10 = i0Var.k(obj2);
        if (k10 && i0Var.g()) {
            h0Var.k(obj);
        }
        return k10;
    }

    public static final void K(s.h0 h0Var, Object obj) {
        boolean z10;
        long[] jArr = h0Var.f8312a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i3 << 3) + i11;
                        Object obj2 = h0Var.f8313b[i12];
                        Object obj3 = h0Var.f8314c[i12];
                        if (obj3 instanceof s.i0) {
                            s.i0 i0Var = (s.i0) obj3;
                            i0Var.k(obj);
                            z10 = i0Var.g();
                        } else {
                            z10 = obj3 == obj;
                        }
                        if (z10) {
                            h0Var.l(i12);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public static final androidx.lifecycle.u0 L(wd.h hVar, z0 z0Var, k4.b bVar, lf.a aVar) {
        z0Var.getClass();
        bVar.getClass();
        aVar.getClass();
        c6.n nVar = new c6.n(z0Var, new pf.b(hVar, aVar), bVar);
        hVar.b();
        String b10 = hVar.b();
        if (b10 != null) {
            return nVar.b(hVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10));
        }
        a1.e("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final Object M(Function2 function2) {
        Thread.interrupted();
        return ge.a0.w(kotlin.coroutines.g.f5592d, new a4.l(function2, (ld.a) null));
    }

    public static final void N(r0.k0 k0Var, int i3, Object obj) {
        k0Var.f8117e[(k0Var.f8118f - k0Var.f8113a[k0Var.f8114b - 1].f8110b) + i3] = obj;
    }

    public static final void O(r0.k0 k0Var, int i3, Object obj, int i10, Object obj2) {
        int i11 = k0Var.f8118f - k0Var.f8113a[k0Var.f8114b - 1].f8110b;
        Object[] objArr = k0Var.f8117e;
        objArr[i3 + i11] = obj;
        objArr[i11 + i10] = obj2;
    }

    public static final String P(int i3, n0.i0 i0Var) {
        return ((Resources) i0Var.j(AndroidCompositionLocals_androidKt.f466c)).getString(i3);
    }

    public static Object Q(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.i()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static void R(int i3, Object[] objArr) {
        for (int i10 = 0; i10 < i3; i10++) {
            if (objArr[i10] == null) {
                a2.r.j(v4.a.n(new StringBuilder(String.valueOf(i10).length() + 9), "at index ", i10));
                return;
            }
        }
    }

    public static x2.d a() {
        return new x2.d(1.0f, 1.0f);
    }

    public static final void b(o4.o oVar, n0.i0 i0Var, int i3) {
        o4.o oVar2;
        i0Var.X(294589392);
        if ((((i0Var.h(oVar) ? 4 : 2) | i3) & 3) == 2 && i0Var.A()) {
            i0Var.R();
            oVar2 = oVar;
        } else {
            a1.j c10 = a1.s.c(i0Var);
            n0.z0 k10 = n0.h.k(oVar.b().f7081e, i0Var);
            List list = (List) k10.getValue();
            boolean booleanValue = ((Boolean) i0Var.j(m1.f3477a)).booleanValue();
            boolean f3 = i0Var.f(list);
            Object L = i0Var.L();
            Object obj = n0.k.f6729a;
            Object obj2 = L;
            if (f3 || L == obj) {
                b1.w wVar = new b1.w();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    n4.h hVar = (n4.h) obj3;
                    if (booleanValue || hVar.f7069v.j.f737c.compareTo(androidx.lifecycle.p.f710r) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                wVar.addAll(arrayList);
                i0Var.g0(wVar);
                obj2 = wVar;
            }
            b1.w wVar2 = (b1.w) obj2;
            c(wVar2, (List) k10.getValue(), i0Var, 0);
            n0.z0 k11 = n0.h.k(oVar.b().f7082f, i0Var);
            Object L2 = i0Var.L();
            if (L2 == obj) {
                L2 = new b1.w();
                i0Var.g0(L2);
            }
            b1.w wVar3 = (b1.w) L2;
            i0Var.W(-367418626);
            ListIterator listIterator = wVar2.listIterator();
            while (true) {
                b1.d0 d0Var = (b1.d0) listIterator;
                if (!d0Var.hasNext()) {
                    break;
                }
                n4.h hVar2 = (n4.h) d0Var.next();
                n4.s sVar = hVar2.f7063e;
                sVar.getClass();
                o4.n nVar = (o4.n) sVar;
                boolean h10 = i0Var.h(oVar) | i0Var.h(hVar2);
                Object L3 = i0Var.L();
                if (h10 || L3 == obj) {
                    L3 = new a4.a(10, oVar, hVar2);
                    i0Var.g0(L3);
                }
                b1.w wVar4 = wVar3;
                o4.o oVar3 = oVar;
                k7.e.b((Function0) L3, nVar.f7490t, x0.i.d(1129586364, new o4.m(hVar2, oVar3, c10, wVar4, nVar), i0Var), i0Var, 384);
                oVar = oVar3;
                wVar3 = wVar4;
            }
            oVar2 = oVar;
            b1.w wVar5 = wVar3;
            i0Var.p(false);
            Set set = (Set) k11.getValue();
            boolean f10 = i0Var.f(k11) | i0Var.h(oVar2);
            Object L4 = i0Var.L();
            if (f10 || L4 == obj) {
                L4 = new n8.b(k11, oVar2, wVar5, null);
                i0Var.g0(L4);
            }
            n0.h.e(set, wVar5, (Function2) L4, i0Var);
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new b1.y(i3, 8, oVar2);
        }
    }

    public static final void c(final List list, Collection collection, n0.i0 i0Var, int i3) {
        i0Var.X(1537894851);
        if ((((i0Var.h(list) ? 4 : 2) | i3 | (i0Var.h(collection) ? 32 : 16)) & 19) == 18 && i0Var.A()) {
            i0Var.R();
        } else {
            final boolean booleanValue = ((Boolean) i0Var.j(m1.f3477a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                final n4.h hVar = (n4.h) it.next();
                androidx.lifecycle.w wVar = hVar.f7069v.j;
                boolean g = i0Var.g(booleanValue) | i0Var.h(list) | i0Var.h(hVar);
                Object L = i0Var.L();
                if (g || L == n0.k.f6729a) {
                    L = new Function1() { // from class: o4.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            final List list2 = list;
                            final n4.h hVar2 = hVar;
                            final boolean z10 = booleanValue;
                            androidx.lifecycle.s sVar = new androidx.lifecycle.s() { // from class: o4.l
                                @Override // androidx.lifecycle.s
                                public final void d(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
                                    boolean z11 = z10;
                                    List list3 = list2;
                                    n4.h hVar3 = hVar2;
                                    if (z11 && !list3.contains(hVar3)) {
                                        list3.add(hVar3);
                                    }
                                    if (oVar == androidx.lifecycle.o.ON_START && !list3.contains(hVar3)) {
                                        list3.add(hVar3);
                                    }
                                    if (oVar == androidx.lifecycle.o.ON_STOP) {
                                        list3.remove(hVar3);
                                    }
                                }
                            };
                            hVar2.f7069v.j.a(sVar);
                            return new d1(4, hVar2, sVar);
                        }
                    };
                    i0Var.g0(L);
                }
                n0.h.d(wVar, (Function1) L, i0Var);
            }
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new b0.u(i3, 5, list, collection);
        }
    }

    public static final void d(final boolean z10, final Function2 function2, n0.i0 i0Var, final int i3) {
        int i10;
        i0Var.X(-642000585);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.g(z10) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.h(function2) ? 32 : 16;
        }
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            Object a9 = t4.a.a(i0Var);
            if (a9 == null) {
                i0Var.W(1512740606);
                a9 = e.i.a(i0Var);
            } else {
                i0Var.W(1512737723);
            }
            i0Var.p(false);
            if (a9 == null) {
                kotlin.collections.i0.l("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean f3 = i0Var.f(a9);
            Object L = i0Var.L();
            Object obj = n0.k.f6729a;
            if (f3 || L == obj) {
                s4.c cVar = a9 instanceof s4.c ? (s4.c) a9 : null;
                c6.i c10 = cVar != null ? cVar.c() : null;
                d.e0 e0Var = a9 instanceof d.e0 ? (d.e0) a9 : null;
                L = new f.b(c10, e0Var != null ? e0Var.a() : null);
                i0Var.g0(L);
            }
            Object obj2 = (f.b) L;
            Object L2 = i0Var.L();
            if (L2 == obj) {
                L2 = n0.h.m(kotlin.coroutines.g.f5592d, i0Var);
                i0Var.g0(L2);
            }
            ge.x xVar = (ge.x) L2;
            long j = i0Var.T;
            boolean f10 = i0Var.f(obj2) | i0Var.e(j);
            Object L3 = i0Var.L();
            if (f10 || L3 == obj) {
                L3 = new e.h(xVar, new e.j(j, a9));
                i0Var.g0(L3);
            }
            e.h hVar = (e.h) L3;
            i0Var.W(-348514256);
            boolean h10 = i0Var.h(hVar) | i0Var.h(function2);
            Object L4 = i0Var.L();
            if (h10 || L4 == obj) {
                L4 = new a4.a(3, hVar, function2);
                i0Var.g0(L4);
            }
            n0.h.g((Function0) L4, i0Var);
            int i11 = i10;
            Boolean valueOf = Boolean.valueOf(z10);
            int i12 = i11 & 14;
            boolean h11 = i0Var.h(hVar) | (i12 == 4);
            Object L5 = i0Var.L();
            if (h11 || L5 == obj) {
                L5 = new e.b(hVar, z10, 1);
                i0Var.g0(L5);
            }
            cf.c.f(valueOf, hVar, null, (Function1) L5, i0Var, i12);
            boolean h12 = i0Var.h(obj2) | i0Var.h(hVar);
            Object L6 = i0Var.L();
            if (h12 || L6 == obj) {
                L6 = new b0.l0(4, obj2, hVar);
                i0Var.g0(L6);
            }
            n0.h.c(obj2, hVar, (Function1) L6, i0Var);
            i0Var.p(false);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new Function2() { // from class: e.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int z11 = n0.h.z(i3 | 1);
                    w.d(z10, function2, (i0) obj3, z11);
                    return Unit.f5554a;
                }
            };
        }
    }

    public static final void e(s.h0 h0Var, Object obj, Object obj2) {
        int f3 = h0Var.f(obj);
        boolean z10 = f3 < 0;
        Object obj3 = z10 ? null : h0Var.f8314c[f3];
        if (obj3 != null) {
            if (obj3 instanceof s.i0) {
                ((s.i0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                s.i0 i0Var = new s.i0();
                i0Var.a(obj3);
                i0Var.a(obj2);
                obj2 = i0Var;
            }
            obj2 = obj3;
        }
        if (!z10) {
            h0Var.f8314c[f3] = obj2;
            return;
        }
        int i3 = ~f3;
        h0Var.f8313b[i3] = obj;
        h0Var.f8314c[i3] = obj2;
    }

    public static Object f(Task task) {
        c7.c0.f("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            kotlin.collections.i0.l("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        c7.c0.h(task, "Task must not be null");
        if (task.j()) {
            return Q(task);
        }
        w7.i iVar = new w7.i();
        Executor executor = w7.h.f10119b;
        task.e(executor, iVar);
        task.c(executor, iVar);
        task.a(executor, iVar);
        iVar.f10120d.await();
        return Q(task);
    }

    public static Object g(Task task, long j, TimeUnit timeUnit) {
        c7.c0.f("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            kotlin.collections.i0.l("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        c7.c0.h(task, "Task must not be null");
        c7.c0.h(timeUnit, "TimeUnit must not be null");
        if (task.j()) {
            return Q(task);
        }
        w7.i iVar = new w7.i();
        Executor executor = w7.h.f10119b;
        task.e(executor, iVar);
        task.c(executor, iVar);
        task.a(executor, iVar);
        if (iVar.f10120d.await(j, timeUnit)) {
            return Q(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static final Bundle h(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.f5552d;
            Object obj = pair.f5553e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        a2.r.k("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    a2.r.k("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static w7.n i(Executor executor, Callable callable) {
        c7.c0.h(executor, "Executor must not be null");
        w7.n nVar = new w7.n();
        executor.execute(new u5.n(9, nVar, callable, false));
        return nVar;
    }

    public static void j(int i3, Object[] objArr) {
        for (int i10 = 0; i10 < i3; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
    }

    public static s.h0 k() {
        long[] jArr = p0.f8356a;
        return new s.h0();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c4.t l(Context context) {
        ProviderInfo providerInfo;
        l3.c cVar;
        ApplicationInfo applicationInfo;
        u8.d dVar = Build.VERSION.SDK_INT >= 28 ? new c4.d(14) : new u8.d(14);
        PackageManager packageManager = context.getPackageManager();
        i7.a.A(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] c10 = dVar.c(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : c10) {
                    arrayList.add(signature.toByteArray());
                }
                cVar = new l3.c(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (cVar != null) {
                return null;
            }
            return new c4.t(new c4.s(context, cVar));
        }
        cVar = null;
        if (cVar != null) {
        }
    }

    public static androidx.lifecycle.u0 m(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (androidx.lifecycle.u0) newInstance;
            } catch (IllegalAccessException e2) {
                a2.r.l("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e9) {
                a2.r.l("Cannot create an instance of ", cls, e9);
                return null;
            }
        } catch (NoSuchMethodException e10) {
            a2.r.l("Cannot create an instance of ", cls, e10);
            return null;
        }
    }

    public static final i1.t n(i1.t tVar) {
        i1.t f3 = ((i1.k) c2.k.v(tVar).getFocusOwner()).f();
        if (f3 == null || !f3.B) {
            return null;
        }
        return f3;
    }

    public static final j1.c o(i1.t tVar) {
        i1 i1Var;
        if (tVar.B && (i1Var = tVar.f3312v) != null) {
            a2.n h10 = a2.q.h(i1Var);
            if (!h10.G()) {
                h10 = null;
            }
            if (h10 != null) {
                j1.c cVar = tVar.K().f4621l;
                return cVar != i1.l.f4608a ? cVar.e(h10.F(c2.k.t(tVar), 0L)) : h10.p(c2.k.t(tVar), false);
            }
        }
        return j1.c.f4915e;
    }

    public static w7.n p(Exception exc) {
        w7.n nVar = new w7.n();
        nVar.m(exc);
        return nVar;
    }

    public static w7.n q(Object obj) {
        w7.n nVar = new w7.n();
        nVar.l(obj);
        return nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final i1.t r(i1.t tVar) {
        boolean z10 = tVar.f3305d.B;
        if (z10) {
            if (!z10) {
                z1.a.b("visitChildren called on an unattached node");
            }
            o0.e eVar = new o0.e(new d1.k[16]);
            d1.k kVar = tVar.f3305d;
            d1.k kVar2 = kVar.f3310t;
            if (kVar2 == null) {
                c2.k.b(eVar, kVar);
            } else {
                eVar.b(kVar2);
            }
            while (true) {
                int i3 = eVar.f7319i;
                if (i3 == 0) {
                    break;
                }
                d1.k kVar3 = (d1.k) eVar.l(i3 - 1);
                if ((kVar3.f3308r & 1024) == 0) {
                    c2.k.b(eVar, kVar3);
                } else {
                    while (true) {
                        if (kVar3 == null) {
                            break;
                        }
                        if ((kVar3.f3307i & 1024) != 0) {
                            o0.e eVar2 = null;
                            while (kVar3 != null) {
                                if (kVar3 instanceof i1.t) {
                                    i1.t tVar2 = (i1.t) kVar3;
                                    if (tVar2.f3305d.B) {
                                        int ordinal = tVar2.M().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            return tVar2;
                                        }
                                        if (ordinal != 3) {
                                            a2.r.p();
                                            return null;
                                        }
                                    }
                                } else if ((kVar3.f3307i & 1024) != 0 && (kVar3 instanceof c2.j)) {
                                    int i10 = 0;
                                    for (d1.k kVar4 = ((c2.j) kVar3).D; kVar4 != null; kVar4 = kVar4.f3310t) {
                                        if ((kVar4.f3307i & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                kVar3 = kVar4;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new o0.e(new d1.k[16]);
                                                }
                                                if (kVar3 != null) {
                                                    eVar2.b(kVar3);
                                                    kVar3 = null;
                                                }
                                                eVar2.b(kVar4);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                kVar3 = c2.k.e(eVar2);
                            }
                        } else {
                            kVar3 = kVar3.f3310t;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static f2.a s(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new f2.a(e3.j.c(view));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f4254c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList t(Context context, int i3) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        g3.h hVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        g3.i iVar = new g3.i(resources, theme);
        synchronized (g3.k.f4261c) {
            try {
                SparseArray sparseArray = (SparseArray) g3.k.f4260b.get(iVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (hVar = (g3.h) sparseArray.get(i3)) != null) {
                    if (hVar.f4253b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (hVar.f4254c != 0) {
                            }
                            colorStateList2 = hVar.f4252a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i3);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = g3.k.f4259a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i3, typedValue, true);
        int i10 = typedValue.type;
        if (i10 < 28 || i10 > 31) {
            try {
                colorStateList = g3.c.a(resources, resources.getXml(i3), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i3, theme);
        }
        synchronized (g3.k.f4261c) {
            try {
                WeakHashMap weakHashMap = g3.k.f4260b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(iVar, sparseArray2);
                }
                sparseArray2.append(i3, new g3.h(colorStateList, iVar.f4255a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static float u(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t3.b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable v(Context context, int i3) {
        return j1.c().d(context, i3);
    }

    public static n4.l w(z0 z0Var) {
        k4.c cVar = n4.m.f7085a;
        k4.a aVar = k4.a.f5385b;
        cVar.getClass();
        aVar.getClass();
        c6.n nVar = new c6.n(z0Var, cVar, aVar);
        wd.h a9 = wd.c0.a(n4.l.class);
        String b10 = a9.b();
        if (b10 != null) {
            return (n4.l) nVar.b(a9, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10));
        }
        a1.e("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static Intent x(Context context, ComponentName componentName) {
        String y3 = y(context, componentName);
        if (y3 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), y3);
        return y(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String y(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final ViewParent z(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }
}
