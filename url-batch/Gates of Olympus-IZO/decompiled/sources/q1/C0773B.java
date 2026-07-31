package q1;

import android.os.Bundle;
import java.util.List;
import t0.p0;
import t0.q0;
import u.C0925G;
import u.V;

/* renamed from: q1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773B extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z1.t f6825f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0773B(Z1.t tVar, int i3) {
        super(1);
        this.f6824e = i3;
        this.f6825f = tVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f6824e) {
            case 0:
                String str = (String) obj;
                Z1.i.f(str, "key");
                Object obj2 = this.f6825f.f3480d;
                boolean z3 = true;
                if (obj2 != null && ((Bundle) obj2).containsKey(str)) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                q0 q0Var = (q0) obj;
                Z1.i.d(q0Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                C0925G c0925g = ((V) q0Var).f8049q;
                Z1.t tVar = this.f6825f;
                List list = (List) tVar.f3480d;
                if (list != null) {
                    list.add(c0925g);
                } else {
                    list = M1.m.e0(c0925g);
                }
                tVar.f3480d = list;
                return p0.f7943e;
        }
    }
}
