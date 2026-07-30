package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m0;
import com.android.installreferrer.R;
import d0.b0;
import d0.x1;
import g0.d;
import g0.l;
import g0.m1;
import g0.n1;
import g0.n2;
import g0.p;
import g0.p1;
import g0.t0;
import g0.z;
import g0.z0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p0.i;
import p0.j;
import p3.b;
import q6.c;
import q6.e;
import r6.k;
import s1.f1;
import s1.i1;
import s1.j1;
import s1.k0;
import s1.l0;
import s1.m;
import s1.n0;
import s1.r;
import s1.u0;
import x3.f;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final z f738a = new z(k0.f8252h);

    /* renamed from: b, reason: collision with root package name */
    public static final n2 f739b = new n2(k0.f8253i);

    /* renamed from: c, reason: collision with root package name */
    public static final n2 f740c = new n2(k0.f8254j);

    /* renamed from: d, reason: collision with root package name */
    public static final n2 f741d = new n2(k0.f8255k);

    /* renamed from: e, reason: collision with root package name */
    public static final n2 f742e = new n2(k0.f8256l);

    /* renamed from: f, reason: collision with root package name */
    public static final n2 f743f = new n2(k0.f8257m);

    public static final void a(r rVar, e eVar, p pVar, int i7) {
        z0 z0Var;
        LinkedHashMap linkedHashMap;
        boolean z8;
        pVar.S(1396852028);
        if ((((pVar.h(rVar) ? 4 : 2) | i7 | (pVar.h(eVar) ? 32 : 16)) & 19) == 18 && pVar.x()) {
            pVar.L();
        } else {
            Context context = rVar.getContext();
            Object G = pVar.G();
            Object obj = l.f3784a;
            if (G == obj) {
                G = d.J(new Configuration(context.getResources().getConfiguration()), t0.f3903k);
                pVar.a0(G);
            }
            z0 z0Var2 = (z0) G;
            Object G2 = pVar.G();
            if (G2 == obj) {
                G2 = new o.z0(z0Var2, 1);
                pVar.a0(G2);
            }
            rVar.setConfigurationChangeObserver((c) G2);
            Object G3 = pVar.G();
            if (G3 == obj) {
                G3 = new u0();
                pVar.a0(G3);
            }
            u0 u0Var = (u0) G3;
            s1.l viewTreeOwners = rVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            f fVar = viewTreeOwners.f8276b;
            Object G4 = pVar.G();
            if (G4 == obj) {
                Object parent = rVar.getParent();
                k.d(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = i.class.getSimpleName() + ':' + str;
                x3.e b9 = fVar.b();
                Bundle a3 = b9.a(str2);
                if (a3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a3.keySet()) {
                        ArrayList parcelableArrayList = a3.getParcelableArrayList(str3);
                        k.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str3, parcelableArrayList);
                        z0Var2 = z0Var2;
                    }
                } else {
                    linkedHashMap = null;
                }
                z0Var = z0Var2;
                m mVar = m.f8283k;
                n2 n2Var = p0.k.f7012a;
                j jVar = new j(linkedHashMap, mVar);
                try {
                    b9.c(str2, new m0(2, jVar));
                    z8 = true;
                } catch (IllegalArgumentException unused) {
                    z8 = false;
                }
                Object i1Var = new i1(jVar, new j1(z8, b9, str2));
                pVar.a0(i1Var);
                G4 = i1Var;
            } else {
                z0Var = z0Var2;
            }
            Object obj2 = (i1) G4;
            boolean h3 = pVar.h(obj2);
            Object G5 = pVar.G();
            if (h3 || G5 == obj) {
                G5 = new l0(0, obj2);
                pVar.a0(G5);
            }
            d.d(d6.z.f2639a, (c) G5, pVar);
            Configuration configuration = (Configuration) z0Var.getValue();
            Object G6 = pVar.G();
            if (G6 == obj) {
                G6 = new w1.c();
                pVar.a0(G6);
            }
            w1.c cVar = (w1.c) G6;
            Object G7 = pVar.G();
            Object obj3 = G7;
            if (G7 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                pVar.a0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object G8 = pVar.G();
            if (G8 == obj) {
                G8 = new s1.m0(configuration3, cVar);
                pVar.a0(G8);
            }
            s1.m0 m0Var = (s1.m0) G8;
            boolean h8 = pVar.h(context);
            Object G9 = pVar.G();
            if (h8 || G9 == obj) {
                G9 = new q.t0(context, 2, m0Var);
                pVar.a0(G9);
            }
            d.d(cVar, (c) G9, pVar);
            Object G10 = pVar.G();
            if (G10 == obj) {
                G10 = new w1.d();
                pVar.a0(G10);
            }
            w1.d dVar = (w1.d) G10;
            Object G11 = pVar.G();
            if (G11 == obj) {
                G11 = new n0(dVar);
                pVar.a0(G11);
            }
            n0 n0Var = (n0) G11;
            boolean h9 = pVar.h(context);
            Object G12 = pVar.G();
            int i8 = 3;
            if (h9 || G12 == obj) {
                G12 = new q.t0(context, i8, n0Var);
                pVar.a0(G12);
            }
            d.d(dVar, (c) G12, pVar);
            m1 m1Var = f1.f8231t;
            d.b(new n1[]{f738a.a((Configuration) z0Var.getValue()), f739b.a(context), b.f7197a.a(viewTreeOwners.f8275a), f742e.a(fVar), p0.k.f7012a.a(obj2), f743f.a(rVar.getView()), f740c.a(cVar), f741d.a(dVar), m1Var.a(Boolean.valueOf(((Boolean) pVar.k(m1Var)).booleanValue() | rVar.getScrollCaptureInProgress$ui_release()))}, o0.f.b(1471621628, new x1(rVar, u0Var, eVar, i8), pVar), pVar, 56);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new b0(i7, 16, rVar, eVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final m1 getLocalLifecycleOwner() {
        return b.f7197a;
    }
}
