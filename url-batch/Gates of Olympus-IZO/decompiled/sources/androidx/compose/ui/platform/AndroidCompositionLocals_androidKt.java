package androidx.compose.ui.platform;

import F.V0;
import I.AbstractC0114p0;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0116q0;
import I.C0119s0;
import I.C0132z;
import I.InterfaceC0088c0;
import I.X;
import I.Y0;
import L1.z;
import Q.a;
import R.k;
import R.l;
import R.m;
import Y1.c;
import Z1.i;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.L;
import com.gates.olympus.miruv.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m1.AbstractC0625e;
import o.U;
import t.o;
import t.x;
import u0.AbstractC0963b0;
import u0.C0967d0;
import u0.C0969e0;
import u0.C0982l;
import u0.C0984m;
import u0.C0997t;
import u0.M;
import u0.N;
import u0.O;
import u0.T;
import u1.e;
import u1.f;
import x0.C1053c;
import x0.C1054d;

/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final C0132z f3737a = new C0132z(X.f2228i, M.f8192f);

    /* renamed from: b, reason: collision with root package name */
    public static final Y0 f3738b = new Y0(M.f8193g);

    /* renamed from: c, reason: collision with root package name */
    public static final Y0 f3739c = new Y0(M.f8194h);

    /* renamed from: d, reason: collision with root package name */
    public static final Y0 f3740d = new Y0(M.f8195i);

    /* renamed from: e, reason: collision with root package name */
    public static final Y0 f3741e = new Y0(M.f8196j);

    /* renamed from: f, reason: collision with root package name */
    public static final Y0 f3742f = new Y0(M.f8197k);

    public static final void a(C0997t c0997t, a aVar, C0113p c0113p, int i3) {
        boolean z3;
        c0113p.S(1396852028);
        int i4 = (i3 & 6) == 0 ? (c0113p.h(c0997t) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            Context context = c0997t.getContext();
            Object G3 = c0113p.G();
            Object obj = C0105l.f2272a;
            if (G3 == obj) {
                G3 = C0089d.J(new Configuration(context.getResources().getConfiguration()), X.f2228i);
                c0113p.a0(G3);
            }
            InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) G3;
            Object G4 = c0113p.G();
            if (G4 == obj) {
                G4 = new x(5, interfaceC0088c0);
                c0113p.a0(G4);
            }
            c0997t.setConfigurationChangeObserver((c) G4);
            Object G5 = c0113p.G();
            if (G5 == obj) {
                G5 = new T();
                c0113p.a0(G5);
            }
            T t3 = (T) G5;
            C0982l viewTreeOwners = c0997t.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object G6 = c0113p.G();
            f fVar = viewTreeOwners.f8361b;
            if (G6 == obj) {
                Object parent = c0997t.getParent();
                i.d(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = k.class.getSimpleName() + ':' + str;
                e c3 = fVar.c();
                Bundle a3 = c3.a(str2);
                if (a3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a3.keySet()) {
                        ArrayList parcelableArrayList = a3.getParcelableArrayList(str3);
                        i.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str3, parcelableArrayList);
                        a3 = a3;
                    }
                }
                C0984m c0984m = C0984m.f8367j;
                Y0 y02 = m.f3163a;
                l lVar = new l(linkedHashMap, c0984m);
                try {
                    c3.c(str2, new L(2, lVar));
                    z3 = true;
                } catch (IllegalArgumentException unused) {
                    z3 = false;
                }
                Object c0967d0 = new C0967d0(lVar, new C0969e0(z3, c3, str2));
                c0113p.a0(c0967d0);
                G6 = c0967d0;
            }
            Object obj2 = (C0967d0) G6;
            z zVar = z.f2729a;
            boolean h3 = c0113p.h(obj2);
            Object G7 = c0113p.G();
            if (h3 || G7 == obj) {
                G7 = new x(6, obj2);
                c0113p.a0(G7);
            }
            C0089d.c(zVar, (c) G7, c0113p);
            Configuration configuration = (Configuration) interfaceC0088c0.getValue();
            Object G8 = c0113p.G();
            if (G8 == obj) {
                G8 = new C1053c();
                c0113p.a0(G8);
            }
            C1053c c1053c = (C1053c) G8;
            Object G9 = c0113p.G();
            Object obj3 = G9;
            if (G9 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0113p.a0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object G10 = c0113p.G();
            if (G10 == obj) {
                G10 = new N(configuration3, c1053c);
                c0113p.a0(G10);
            }
            N n3 = (N) G10;
            boolean h4 = c0113p.h(context);
            Object G11 = c0113p.G();
            if (h4 || G11 == obj) {
                G11 = new o(context, 2, n3);
                c0113p.a0(G11);
            }
            C0089d.c(c1053c, (c) G11, c0113p);
            Object G12 = c0113p.G();
            if (G12 == obj) {
                G12 = new C1054d();
                c0113p.a0(G12);
            }
            C1054d c1054d = (C1054d) G12;
            Object G13 = c0113p.G();
            if (G13 == obj) {
                G13 = new O(c1054d);
                c0113p.a0(G13);
            }
            O o3 = (O) G13;
            boolean h5 = c0113p.h(context);
            Object G14 = c0113p.G();
            if (h5 || G14 == obj) {
                G14 = new o(context, 3, o3);
                c0113p.a0(G14);
            }
            C0089d.c(c1054d, (c) G14, c0113p);
            AbstractC0114p0 abstractC0114p0 = AbstractC0963b0.f8309t;
            C0089d.b(new C0116q0[]{f3737a.a((Configuration) interfaceC0088c0.getValue()), f3738b.a(context), AbstractC0625e.f5928a.a(viewTreeOwners.f8360a), f3741e.a(fVar), m.f3163a.a(obj2), f3742f.a(c0997t.getView()), f3739c.a(c1053c), f3740d.a(c1054d), abstractC0114p0.a(Boolean.valueOf(((Boolean) c0113p.k(abstractC0114p0)).booleanValue() | c0997t.getScrollCaptureInProgress$ui_release()))}, Q.f.b(1471621628, new U(c0997t, t3, aVar, 2), c0113p), c0113p, 56);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new V0(i3, 11, c0997t, aVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC0114p0 getLocalLifecycleOwner() {
        return AbstractC0625e.f5928a;
    }
}
