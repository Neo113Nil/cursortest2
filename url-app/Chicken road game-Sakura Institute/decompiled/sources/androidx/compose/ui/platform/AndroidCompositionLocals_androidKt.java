package androidx.compose.ui.platform;

import A.g0;
import D.x1;
import G.AbstractC0217p0;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0219q0;
import G.C0222s0;
import G.C0235z;
import G.InterfaceC0191c0;
import G.W;
import G.Y0;
import O.a;
import O.f;
import P.k;
import P.l;
import P.m;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.I;
import com.chicken.road.kedro.laqer.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C0895k0;
import o1.AbstractC0921b;
import q.n0;
import s0.AbstractC1144g0;
import s0.C1126L;
import s0.C1150j0;
import s0.C1152k0;
import s0.C1153l;
import s0.C1157n;
import s0.C1166s;
import s0.ComponentCallbacks2C1127M;
import s0.ComponentCallbacks2C1128N;
import s0.X;
import v1.C1248e;
import v1.InterfaceC1249f;
import w0.C1288c;
import w0.C1289d;

@Metadata
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final C0235z f5212a = new C0235z(W.f2779l, C1126L.f10078e);

    /* renamed from: b, reason: collision with root package name */
    public static final Y0 f5213b = new Y0(C1126L.f10079i);

    /* renamed from: c, reason: collision with root package name */
    public static final Y0 f5214c = new Y0(C1126L.f10080j);

    /* renamed from: d, reason: collision with root package name */
    public static final Y0 f5215d = new Y0(C1126L.f10081k);

    /* renamed from: e, reason: collision with root package name */
    public static final Y0 f5216e = new Y0(C1126L.f10082l);

    /* renamed from: f, reason: collision with root package name */
    public static final Y0 f5217f = new Y0(C1126L.f10083m);

    public static final void a(C1166s c1166s, a aVar, C0216p c0216p, int i2) {
        LinkedHashMap linkedHashMap;
        boolean z4;
        int i4 = 1;
        c0216p.U(1396852028);
        int i5 = (i2 & 6) == 0 ? (c0216p.h(c1166s) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= c0216p.h(aVar) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            Context context = c1166s.getContext();
            Object I3 = c0216p.I();
            Object obj = C0208l.f2826a;
            if (I3 == obj) {
                I3 = C0192d.K(new Configuration(context.getResources().getConfiguration()), W.f2779l);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
            Object I4 = c0216p.I();
            if (I4 == obj) {
                I4 = new C0895k0(i4, interfaceC0191c0);
                c0216p.c0(I4);
            }
            c1166s.setConfigurationChangeObserver((Function1) I4);
            Object I5 = c0216p.I();
            if (I5 == obj) {
                I5 = new X();
                c0216p.c0(I5);
            }
            X x2 = (X) I5;
            C1153l viewTreeOwners = c1166s.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object I6 = c0216p.I();
            InterfaceC1249f interfaceC1249f = viewTreeOwners.f10254b;
            if (I6 == obj) {
                Object parent = c1166s.getParent();
                Intrinsics.d(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = k.class.getSimpleName() + ':' + str;
                C1248e c4 = interfaceC1249f.c();
                Bundle a4 = c4.a(str2);
                if (a4 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a4.keySet()) {
                        ArrayList parcelableArrayList = a4.getParcelableArrayList(str3);
                        Intrinsics.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str3, parcelableArrayList);
                        a4 = a4;
                    }
                } else {
                    linkedHashMap = null;
                }
                C1157n c1157n = C1157n.f10271l;
                Y0 y02 = m.f3674a;
                l lVar = new l(linkedHashMap, c1157n);
                try {
                    c4.c(str2, new I(2, lVar));
                    z4 = true;
                } catch (IllegalArgumentException unused) {
                    z4 = false;
                }
                Object c1150j0 = new C1150j0(lVar, new C1152k0(z4, c4, str2));
                c0216p.c0(c1150j0);
                I6 = c1150j0;
            }
            Object obj2 = (C1150j0) I6;
            Unit unit = Unit.f7487a;
            boolean h4 = c0216p.h(obj2);
            Object I7 = c0216p.I();
            if (h4 || I7 == obj) {
                I7 = new g0(29, obj2);
                c0216p.c0(I7);
            }
            C0192d.d(unit, (Function1) I7, c0216p);
            Configuration configuration = (Configuration) interfaceC0191c0.getValue();
            Object I8 = c0216p.I();
            if (I8 == obj) {
                I8 = new C1288c();
                c0216p.c0(I8);
            }
            C1288c c1288c = (C1288c) I8;
            Object I9 = c0216p.I();
            Object obj3 = I9;
            if (I9 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0216p.c0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object I10 = c0216p.I();
            if (I10 == obj) {
                I10 = new ComponentCallbacks2C1127M(configuration3, c1288c);
                c0216p.c0(I10);
            }
            ComponentCallbacks2C1127M componentCallbacks2C1127M = (ComponentCallbacks2C1127M) I10;
            boolean h5 = c0216p.h(context);
            Object I11 = c0216p.I();
            if (h5 || I11 == obj) {
                I11 = new n0(context, 2, componentCallbacks2C1127M);
                c0216p.c0(I11);
            }
            C0192d.d(c1288c, (Function1) I11, c0216p);
            Object I12 = c0216p.I();
            if (I12 == obj) {
                I12 = new C1289d();
                c0216p.c0(I12);
            }
            C1289d c1289d = (C1289d) I12;
            Object I13 = c0216p.I();
            if (I13 == obj) {
                I13 = new ComponentCallbacks2C1128N(c1289d);
                c0216p.c0(I13);
            }
            ComponentCallbacks2C1128N componentCallbacks2C1128N = (ComponentCallbacks2C1128N) I13;
            boolean h6 = c0216p.h(context);
            Object I14 = c0216p.I();
            if (h6 || I14 == obj) {
                I14 = new n0(context, 3, componentCallbacks2C1128N);
                c0216p.c0(I14);
            }
            C0192d.d(c1289d, (Function1) I14, c0216p);
            AbstractC0217p0 abstractC0217p0 = AbstractC1144g0.f10232t;
            C0192d.b(new C0219q0[]{f5212a.a((Configuration) interfaceC0191c0.getValue()), f5213b.a(context), AbstractC0921b.f8914a.a(viewTreeOwners.f10253a), f5216e.a(interfaceC1249f), m.f3674a.a(obj2), f5217f.a(c1166s.getView()), f5214c.a(c1288c), f5215d.a(c1289d), abstractC0217p0.a(Boolean.valueOf(((Boolean) c0216p.k(abstractC0217p0)).booleanValue() | c1166s.getScrollCaptureInProgress$ui_release()))}, f.b(1471621628, new E.k(c1166s, x2, aVar, 3), c0216p), c0216p, 56);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new x1(c1166s, aVar, i2, 9);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC0217p0 getLocalLifecycleOwner() {
        return AbstractC0921b.f8914a;
    }
}
