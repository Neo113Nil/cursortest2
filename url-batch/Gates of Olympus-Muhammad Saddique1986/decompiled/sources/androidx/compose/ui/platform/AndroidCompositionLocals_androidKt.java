package androidx.compose.ui.platform;

import F.C0131y0;
import F.v1;
import I.AbstractC0168p0;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0170q0;
import I.C0173s0;
import I.C0186z;
import I.InterfaceC0142c0;
import I.W;
import I.X0;
import Q.a;
import R.k;
import R.l;
import R.m;
import R1.y;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.L;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0424c;
import f2.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p.C0758d0;
import p.C0780o0;
import r0.C0929z;
import u0.AbstractC1101g0;
import u0.C1107j0;
import u0.C1109k0;
import u0.C1110l;
import u0.C1112m;
import u0.C1123s;
import u0.M;
import u0.N;
import u0.O;
import u0.X;
import y0.c;
import y0.d;
import y1.e;
import y1.f;

/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final C0186z f4937a = new C0186z(W.f2783i, M.f9213f);

    /* renamed from: b, reason: collision with root package name */
    public static final X0 f4938b = new X0(M.f9214g);

    /* renamed from: c, reason: collision with root package name */
    public static final X0 f4939c = new X0(M.f9215h);

    /* renamed from: d, reason: collision with root package name */
    public static final X0 f4940d = new X0(M.f9216i);

    /* renamed from: e, reason: collision with root package name */
    public static final X0 f4941e = new X0(M.f9217j);

    /* renamed from: f, reason: collision with root package name */
    public static final X0 f4942f = new X0(M.f9218k);

    public static final void a(C1123s c1123s, a aVar, C0167p c0167p, int i3) {
        LinkedHashMap linkedHashMap;
        boolean z3;
        int i4 = 1;
        c0167p.S(1396852028);
        int i5 = (i3 & 6) == 0 ? (c0167p.h(c1123s) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i5 |= c0167p.h(aVar) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            Context context = c1123s.getContext();
            Object G3 = c0167p.G();
            Object obj = C0159l.f2829a;
            if (G3 == obj) {
                G3 = C0143d.K(new Configuration(context.getResources().getConfiguration()), W.f2783i);
                c0167p.a0(G3);
            }
            InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G3;
            Object G4 = c0167p.G();
            if (G4 == obj) {
                G4 = new C0780o0(interfaceC0142c0, i4);
                c0167p.a0(G4);
            }
            c1123s.setConfigurationChangeObserver((InterfaceC0424c) G4);
            Object G5 = c0167p.G();
            if (G5 == obj) {
                G5 = new X();
                c0167p.a0(G5);
            }
            X x3 = (X) G5;
            C1110l viewTreeOwners = c1123s.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object G6 = c0167p.G();
            f fVar = viewTreeOwners.f9394b;
            if (G6 == obj) {
                Object parent = c1123s.getParent();
                j.d(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = k.class.getSimpleName() + ':' + str;
                e c2 = fVar.c();
                Bundle a3 = c2.a(str2);
                if (a3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a3.keySet()) {
                        ArrayList parcelableArrayList = a3.getParcelableArrayList(str3);
                        j.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str3, parcelableArrayList);
                        a3 = a3;
                    }
                } else {
                    linkedHashMap = null;
                }
                C1112m c1112m = C1112m.f9403j;
                X0 x02 = m.f4036a;
                l lVar = new l(linkedHashMap, c1112m);
                try {
                    c2.c(str2, new L(2, lVar));
                    z3 = true;
                } catch (IllegalArgumentException unused) {
                    z3 = false;
                }
                Object c1107j0 = new C1107j0(lVar, new C1109k0(z3, c2, str2));
                c0167p.a0(c1107j0);
                G6 = c1107j0;
            }
            Object obj2 = (C1107j0) G6;
            y yVar = y.f4171a;
            boolean h3 = c0167p.h(obj2);
            Object G7 = c0167p.G();
            if (h3 || G7 == obj) {
                G7 = new C0929z(7, obj2);
                c0167p.a0(G7);
            }
            C0143d.c(yVar, (InterfaceC0424c) G7, c0167p);
            Configuration configuration = (Configuration) interfaceC0142c0.getValue();
            Object G8 = c0167p.G();
            if (G8 == obj) {
                G8 = new c();
                c0167p.a0(G8);
            }
            c cVar = (c) G8;
            Object G9 = c0167p.G();
            Object obj3 = G9;
            if (G9 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0167p.a0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object G10 = c0167p.G();
            if (G10 == obj) {
                G10 = new N(configuration3, cVar);
                c0167p.a0(G10);
            }
            N n3 = (N) G10;
            boolean h4 = c0167p.h(context);
            Object G11 = c0167p.G();
            if (h4 || G11 == obj) {
                G11 = new C0758d0(context, 5, n3);
                c0167p.a0(G11);
            }
            C0143d.c(cVar, (InterfaceC0424c) G11, c0167p);
            Object G12 = c0167p.G();
            if (G12 == obj) {
                G12 = new d();
                c0167p.a0(G12);
            }
            d dVar = (d) G12;
            Object G13 = c0167p.G();
            if (G13 == obj) {
                G13 = new O(dVar);
                c0167p.a0(G13);
            }
            O o3 = (O) G13;
            boolean h5 = c0167p.h(context);
            Object G14 = c0167p.G();
            if (h5 || G14 == obj) {
                G14 = new C0758d0(context, 6, o3);
                c0167p.a0(G14);
            }
            C0143d.c(dVar, (InterfaceC0424c) G14, c0167p);
            AbstractC0168p0 abstractC0168p0 = AbstractC1101g0.f9368t;
            C0143d.b(new C0170q0[]{f4937a.a((Configuration) interfaceC0142c0.getValue()), f4938b.a(context), p1.e.f7832a.a(viewTreeOwners.f9393a), f4941e.a(fVar), m.f4036a.a(obj2), f4942f.a(c1123s.getView()), f4939c.a(cVar), f4940d.a(dVar), abstractC0168p0.a(Boolean.valueOf(((Boolean) c0167p.k(abstractC0168p0)).booleanValue() | c1123s.getScrollCaptureInProgress$ui_release()))}, Q.f.b(1471621628, new C0131y0(c1123s, x3, aVar, 5), c0167p), c0167p, 56);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new v1(i3, 8, c1123s, aVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC0168p0 getLocalLifecycleOwner() {
        return p1.e.f7832a;
    }
}
