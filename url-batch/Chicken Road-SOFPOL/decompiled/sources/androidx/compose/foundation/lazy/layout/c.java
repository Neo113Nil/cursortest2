package androidx.compose.foundation.lazy.layout;

import a0.a0;
import a0.c0;
import a0.d0;
import a0.e0;
import a0.h1;
import a0.j1;
import a0.n0;
import a0.o0;
import a0.x;
import android.view.View;
import com.snovikpovik.vuevnxsj.R;
import java.util.Arrays;
import m0.f0;
import m0.n;
import m0.s;
import m0.z0;
import p6.e;
import p6.f;
import u1.s0;
import u1.w0;
import x1.k0;
import y0.m;
import z.j;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z0 f524g;

    public c(n0 n0Var, m mVar, j jVar, z0 z0Var) {
        this.f521d = n0Var;
        this.f522e = mVar;
        this.f523f = jVar;
        this.f524g = z0Var;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        m d8;
        v0.c cVar = (v0.c) obj;
        s sVar = (s) obj2;
        ((Number) obj3).intValue();
        Object K = sVar.K();
        Object obj4 = n.f5019a;
        if (K == obj4) {
            K = new x(cVar, new c0(this.f524g, 0));
            sVar.f0(K);
        }
        x xVar = (x) K;
        Object K2 = sVar.K();
        if (K2 == obj4) {
            K2 = new w0(new a0(xVar));
            sVar.f0(K2);
        }
        w0 w0Var = (w0) K2;
        n0 n0Var = this.f521d;
        if (n0Var != null) {
            sVar.V(1743490539);
            sVar.V(887527095);
            Object obj5 = j1.f106a;
            if (obj5 != null) {
                sVar.V(1345648624);
                sVar.p(false);
            } else {
                sVar.V(1345697697);
                View view = (View) sVar.j(k0.f8491e);
                boolean f6 = sVar.f(view);
                Object K3 = sVar.K();
                if (f6 || K3 == obj4) {
                    Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                    K3 = tag instanceof h1 ? (h1) tag : null;
                    if (K3 == null) {
                        K3 = new a0.c(view);
                        view.setTag(R.id.compose_prefetch_scheduler, K3);
                    }
                    sVar.f0(K3);
                }
                obj5 = (h1) K3;
                sVar.p(false);
            }
            Object obj6 = obj5;
            sVar.p(false);
            Object[] objArr = {n0Var, xVar, w0Var, obj6};
            boolean f8 = sVar.f(n0Var) | sVar.h(xVar) | sVar.h(w0Var) | sVar.h(obj6);
            Object K4 = sVar.K();
            if (f8 || K4 == obj4) {
                K4 = new d0(n0Var, xVar, w0Var, obj6, 0);
                sVar.f0(K4);
            }
            p6.c cVar2 = (p6.c) K4;
            boolean z3 = false;
            for (Object obj7 : Arrays.copyOf(objArr, 4)) {
                z3 |= sVar.f(obj7);
            }
            Object K5 = sVar.K();
            if (z3 || K5 == obj4) {
                sVar.f0(new f0(cVar2));
            }
            sVar.p(false);
        } else {
            sVar.V(1744076749);
            sVar.p(false);
        }
        int i = o0.f126a;
        m mVar = this.f522e;
        if (n0Var != null && (d8 = mVar.d(new TraversablePrefetchStateModifierElement(n0Var))) != null) {
            mVar = d8;
        }
        boolean f9 = sVar.f(xVar);
        Object obj8 = this.f523f;
        boolean f10 = f9 | sVar.f(obj8);
        Object K6 = sVar.K();
        if (f10 || K6 == obj4) {
            K6 = new e0(0, xVar, obj8);
            sVar.f0(K6);
        }
        s0.a(w0Var, mVar, (e) K6, sVar, 8);
        return c6.m.f1757a;
    }
}
