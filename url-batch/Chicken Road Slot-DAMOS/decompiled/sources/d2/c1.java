package d2;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.appsflyer.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final View f3353a;

    /* renamed from: b, reason: collision with root package name */
    public final n0.o f3354b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.u f3355c;

    /* renamed from: d, reason: collision with root package name */
    public final f5.e f3356d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.a1 f3357e;

    /* renamed from: f, reason: collision with root package name */
    public final h2.c f3358f;
    public final h2.d g;

    /* renamed from: h, reason: collision with root package name */
    public final Configuration f3359h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.z0 f3360i;
    public final h j;

    /* renamed from: k, reason: collision with root package name */
    public final k1 f3361k;

    /* renamed from: l, reason: collision with root package name */
    public final j f3362l;

    /* renamed from: m, reason: collision with root package name */
    public final i f3363m;

    /* renamed from: n, reason: collision with root package name */
    public final p2.g f3364n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.z0 f3365o;

    /* renamed from: p, reason: collision with root package name */
    public final s1.a f3366p;

    /* renamed from: q, reason: collision with root package name */
    public final o0 f3367q;

    /* renamed from: r, reason: collision with root package name */
    public final c2.i0 f3368r;

    /* renamed from: s, reason: collision with root package name */
    public final n1 f3369s;

    /* renamed from: t, reason: collision with root package name */
    public final k1.o f3370t;

    /* renamed from: u, reason: collision with root package name */
    public int f3371u;

    /* renamed from: v, reason: collision with root package name */
    public final b1 f3372v;

    public c1(c1 c1Var, View view, n0.o oVar, androidx.lifecycle.u uVar, f5.e eVar, androidx.lifecycle.a1 a1Var) {
        h2.c cVar;
        Configuration configuration;
        n0.z0 r9;
        h hVar;
        k1 k1Var;
        j jVar;
        i iVar;
        p2.g k1Var2;
        n0.z0 j1Var;
        o0 o0Var;
        k1.o oVar2;
        c2.i0 i0Var;
        h2.d dVar;
        View view2;
        boolean a9 = Intrinsics.a((c1Var == null || (view2 = c1Var.f3353a) == null) ? null : view2.getContext(), view.getContext());
        this.f3353a = view;
        this.f3354b = oVar;
        this.f3355c = uVar;
        this.f3356d = eVar;
        this.f3357e = a1Var;
        if (a9) {
            c1Var.getClass();
            cVar = c1Var.f3358f;
        } else {
            cVar = new h2.c();
        }
        this.f3358f = cVar;
        this.g = (c1Var == null || (dVar = c1Var.g) == null) ? new h2.d() : dVar;
        if (a9) {
            c1Var.getClass();
            configuration = c1Var.f3359h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.f3359h = configuration;
        if (a9) {
            c1Var.getClass();
            r9 = c1Var.f3360i;
        } else {
            r9 = n0.h.r(new Configuration(configuration));
        }
        this.f3360i = r9;
        if (a9) {
            c1Var.getClass();
            hVar = c1Var.j;
        } else {
            Context context = view.getContext();
            hVar = new h();
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.j = hVar;
        if (a9) {
            c1Var.getClass();
            k1Var = c1Var.f3361k;
        } else {
            view.getContext();
            k1Var = new k1();
        }
        this.f3361k = k1Var;
        if (a9) {
            c1Var.getClass();
            jVar = c1Var.f3362l;
        } else {
            jVar = new j(view.getContext());
        }
        this.f3362l = jVar;
        if (a9) {
            c1Var.getClass();
            iVar = c1Var.f3363m;
        } else {
            iVar = new i();
        }
        this.f3363m = iVar;
        if (a9) {
            c1Var.getClass();
            k1Var2 = c1Var.f3364n;
        } else {
            view.getContext();
            k1Var2 = new k1();
        }
        this.f3364n = k1Var2;
        if (a9) {
            c1Var.getClass();
            j1Var = c1Var.f3365o;
        } else {
            j1Var = new n0.j1(g8.b.s(view.getContext()), n0.e.f6661s);
        }
        this.f3365o = j1Var;
        this.f3366p = view == (c1Var != null ? c1Var.f3353a : null) ? c1Var.f3366p : new k5.c(16);
        if (a9) {
            c1Var.getClass();
            o0Var = c1Var.f3367q;
        } else {
            o0Var = new o0(ViewConfiguration.get(view.getContext()));
        }
        this.f3367q = o0Var;
        this.f3368r = (c1Var == null || (i0Var = c1Var.f3368r) == null) ? new c2.i0() : i0Var;
        this.f3369s = new n1(0);
        this.f3370t = (c1Var == null || (oVar2 = c1Var.f3370t) == null) ? new k1.o() : oVar2;
        new a2.a0(5, this);
        this.f3372v = new b1(this);
    }

    public final void a(v vVar, Function2 function2, n0.i0 i0Var, int i3) {
        boolean z10;
        i0Var.X(123858079);
        int i10 = (i0Var.h(vVar) ? 4 : 2) | i3 | (i0Var.h(function2) ? 32 : 16) | (i0Var.h(this) ? 256 : 128);
        int i11 = 1;
        if (i0Var.O(i10 & 1, (i10 & 147) != 146)) {
            Object tag = vVar.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof xd.a) && !(tag instanceof xd.f))) ? null : (Set) tag;
            if (set == null) {
                Object parent = vVar.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof xd.a) && !(tag2 instanceof xd.f))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(i0Var.w());
                i0Var.f6712q = true;
                i0Var.C = true;
                i0Var.f6700c.c();
                i0Var.H.c();
                q0.k kVar = i0Var.I;
                q0.h hVar = kVar.f7760a;
                kVar.f7764e = hVar.f7755x;
                kVar.f7765f = hVar.f7756y;
            }
            Object L = i0Var.L();
            f5.e eVar = this.f3356d;
            n0.e eVar2 = n0.k.f6729a;
            if (L == eVar2) {
                Object parent2 = vVar.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag3 instanceof String ? (String) tag3 : null;
                if (str == null) {
                    str = String.valueOf(view2.getId());
                }
                String k10 = v4.a.k("SaveableStateRegistry:", str);
                c6.l b10 = eVar.b();
                Bundle b11 = b10.b(k10);
                if (b11 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : b11.keySet()) {
                        ArrayList parcelableArrayList = b11.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                r rVar = r.f3518s;
                n0.n2 n2Var = a1.p.f46a;
                a1.o oVar = new a1.o(linkedHashMap, rVar);
                if (b10.e(k10) == null) {
                    try {
                        b10.i(k10, new d.f(i11, oVar));
                        z10 = true;
                    } catch (IllegalArgumentException unused) {
                    }
                    f1 f1Var = new f1(oVar, new g1(z10, b10, k10));
                    i0Var.g0(f1Var);
                    L = f1Var;
                }
                z10 = false;
                f1 f1Var2 = new f1(oVar, new g1(z10, b10, k10));
                i0Var.g0(f1Var2);
                L = f1Var2;
            }
            f1 f1Var3 = (f1) L;
            Unit unit = Unit.f5554a;
            boolean h10 = i0Var.h(f1Var3);
            Object L2 = i0Var.L();
            if (h10 || L2 == eVar2) {
                L2 = new a3.e(8, f1Var3);
                i0Var.g0(L2);
            }
            n0.h.d(unit, (Function1) L2, i0Var);
            n0.v vVar2 = d1.f3398w;
            boolean booleanValue = ((Boolean) i0Var.j(vVar2)).booleanValue() | vVar.getScrollCaptureInProgress$ui();
            boolean f3 = i0Var.f(vVar.getView());
            Object L3 = i0Var.L();
            if (f3 || L3 == eVar2) {
                vVar.getView();
                L3 = new e2();
                i0Var.g0(L3);
            }
            n0.h.b(new n0.q1[]{i4.e.f4646a.a(this.f3355c), g5.a.f4273a.a(eVar), AndroidCompositionLocals_androidKt.f467d.a(this.f3358f), AndroidCompositionLocals_androidKt.f468e.a(this.g), AndroidCompositionLocals_androidKt.f465b.a(vVar.getContext()), c1.i.f1485a.a(set), AndroidCompositionLocals_androidKt.f464a.a(vVar.getConfiguration()), a1.p.f46a.a(f1Var3), AndroidCompositionLocals_androidKt.f469f.a(vVar.getView()), vVar2.a(Boolean.valueOf(booleanValue)), d1.f3395t.a(vVar.getViewConfiguration()), n0.m0.f6756a.a((e2) L3)}, x0.i.d(1317454175, new a1(vVar, this, function2), i0Var), i0Var, 56);
        } else {
            i0Var.R();
        }
        n0.s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new a1(this, vVar, function2, i3);
        }
    }

    public final void b() {
        int i3 = this.f3371u - 1;
        this.f3371u = i3;
        if (i3 < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.f3371u = 0;
        }
        if (this.f3371u == 0) {
            View view = this.f3353a;
            Context context = view.getContext();
            b1 b1Var = this.f3372v;
            context.unregisterComponentCallbacks(b1Var);
            this.f3369s.getClass();
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(b1Var);
        }
    }

    public final void c() {
        int i3 = this.f3371u + 1;
        this.f3371u = i3;
        if (i3 == 1) {
            View view = this.f3353a;
            Context context = view.getContext();
            b1 b1Var = this.f3372v;
            context.registerComponentCallbacks(b1Var);
            d(view.getResources().getConfiguration());
            this.f3369s.f3487a.setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(b1Var);
        }
    }

    public final void d(Configuration configuration) {
        int updateFrom = this.f3359h.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.f3358f.f4439a.entrySet().iterator();
            while (it.hasNext()) {
                h2.a aVar = (h2.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (aVar == null || Configuration.needNewResources(updateFrom, aVar.f4436b)) {
                    it.remove();
                }
            }
            this.f3360i.setValue(new Configuration(configuration));
            h2.d dVar = this.g;
            synchronized (dVar) {
                dVar.f4440a.c();
            }
            if ((268435456 & updateFrom) != 0) {
                this.f3365o.setValue(g8.b.s(this.f3353a.getContext()));
            }
            if (((-1342235264) & updateFrom) != 0) {
                this.f3369s.getClass();
            }
        }
    }
}
