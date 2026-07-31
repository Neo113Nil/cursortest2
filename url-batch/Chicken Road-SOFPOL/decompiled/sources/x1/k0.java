package x1;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.snovikpovik.vuevnxsj.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0.b0 f8487a = new m0.b0(h0.f8423f);

    /* renamed from: b, reason: collision with root package name */
    public static final u2 f8488b = new u2(h0.f8424g);

    /* renamed from: c, reason: collision with root package name */
    public static final u2 f8489c;

    /* renamed from: d, reason: collision with root package name */
    public static final u2 f8490d;

    /* renamed from: e, reason: collision with root package name */
    public static final u2 f8491e;

    static {
        a.a.r(new c.e(18));
        f8489c = new u2(h0.f8425h);
        f8490d = new u2(h0.i);
        f8491e = new u2(h0.f8426j);
    }

    public static final void a(t tVar, p6.e eVar, m0.s sVar, int i) {
        m0.z0 z0Var;
        boolean areAllPrimitivesSupported;
        LinkedHashMap linkedHashMap;
        boolean z3;
        sVar.W(-520299287);
        int i8 = 16;
        int i9 = (sVar.h(tVar) ? 4 : 2) | i | (sVar.h(eVar) ? 32 : 16);
        if (sVar.N(i9 & 1, (i9 & 19) != 18)) {
            Context context = tVar.getContext();
            Object K = sVar.K();
            Object obj = m0.n.f5019a;
            if (K == obj) {
                K = m0.b.q(new Configuration(context.getResources().getConfiguration()));
                sVar.f0(K);
            }
            m0.z0 z0Var2 = (m0.z0) K;
            Object K2 = sVar.K();
            if (K2 == obj) {
                K2 = new b1.e(i8, z0Var2);
                sVar.f0(K2);
            }
            tVar.setConfigurationChangeObserver((p6.c) K2);
            Object K3 = sVar.K();
            if (K3 == obj) {
                K3 = new o0();
                sVar.f0(K3);
            }
            o0 o0Var = (o0) K3;
            m viewTreeOwners = tVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            x4.f fVar = viewTreeOwners.f8497b;
            Object K4 = sVar.K();
            if (K4 == obj) {
                Object parent = tVar.getParent();
                q6.i.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = v0.e.class.getSimpleName() + ':' + str;
                x4.e b8 = fVar.b();
                Bundle a8 = b8.a(str2);
                if (a8 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a8.keySet()) {
                        ArrayList parcelableArrayList = a8.getParcelableArrayList(str3);
                        q6.i.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str3, parcelableArrayList);
                        z0Var2 = z0Var2;
                    }
                } else {
                    linkedHashMap = null;
                }
                z0Var = z0Var2;
                n nVar = n.i;
                u2 u2Var = v0.g.f7442a;
                v0.f fVar2 = new v0.f(linkedHashMap, nVar);
                try {
                    b8.f(str2, new b.g(2, fVar2));
                    z3 = true;
                } catch (IllegalArgumentException unused) {
                    z3 = false;
                }
                Object d1Var = new d1(fVar2, new e1(z3, b8, str2));
                sVar.f0(d1Var);
                K4 = d1Var;
            } else {
                z0Var = z0Var2;
            }
            Object obj2 = (d1) K4;
            boolean h8 = sVar.h(obj2);
            Object K5 = sVar.K();
            if (h8 || K5 == obj) {
                K5 = new b1.e(17, obj2);
                sVar.f0(K5);
            }
            m0.b.d(c6.m.f1757a, (p6.c) K5, sVar);
            Object K6 = sVar.K();
            if (K6 == obj) {
                if (Build.VERSION.SDK_INT >= 31) {
                    areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
                    if (areAllPrimitivesSupported) {
                        tVar.getView();
                        K6 = new c1();
                        sVar.f0(K6);
                    }
                }
                K6 = new c1();
                sVar.f0(K6);
            }
            m1.a aVar = (m1.a) K6;
            Configuration configuration = (Configuration) z0Var.getValue();
            Object K7 = sVar.K();
            if (K7 == obj) {
                K7 = new b2.a();
                sVar.f0(K7);
            }
            b2.a aVar2 = (b2.a) K7;
            Object K8 = sVar.K();
            Object obj3 = K8;
            if (K8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                sVar.f0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object K9 = sVar.K();
            if (K9 == obj) {
                K9 = new i0(configuration3, aVar2);
                sVar.f0(K9);
            }
            i0 i0Var = (i0) K9;
            boolean h9 = sVar.h(context);
            Object K10 = sVar.K();
            if (h9 || K10 == obj) {
                K10 = new f1.n(4, context, i0Var);
                sVar.f0(K10);
            }
            m0.b.d(aVar2, (p6.c) K10, sVar);
            Object K11 = sVar.K();
            if (K11 == obj) {
                K11 = new b2.b();
                sVar.f0(K11);
            }
            b2.b bVar = (b2.b) K11;
            Object K12 = sVar.K();
            if (K12 == obj) {
                K12 = new j0(bVar);
                sVar.f0(K12);
            }
            j0 j0Var = (j0) K12;
            boolean h10 = sVar.h(context);
            Object K13 = sVar.K();
            if (h10 || K13 == obj) {
                K13 = new f1.n(5, context, j0Var);
                sVar.f0(K13);
            }
            m0.b.d(bVar, (p6.c) K13, sVar);
            m0.r1 r1Var = b1.f8383v;
            m0.b.b(new l.q[]{f8487a.a((Configuration) z0Var.getValue()), f8488b.a(context), j4.e.f4019a.a(viewTreeOwners.f8496a), y4.a.f8975a.a(fVar), v0.g.f7442a.a(obj2), f8491e.a(tVar.getView()), f8489c.a(aVar2), f8490d.a(bVar), r1Var.a(Boolean.valueOf(((Boolean) sVar.j(r1Var)).booleanValue() | tVar.getScrollCaptureInProgress$ui_release())), b1.f8373l.a(aVar)}, u0.h.d(1059770793, new u2.c(tVar, o0Var, eVar), sVar), sVar, 56);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a1.g(tVar, eVar, i, 4);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
