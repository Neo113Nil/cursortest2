package n0;

import android.os.Bundle;
import e2.InterfaceC0424c;
import java.util.List;
import t.C0971A;
import t.N;
import t0.q0;
import t0.r0;

/* renamed from: n0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714l extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f2.u f7300f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0714l(f2.u uVar, int i3) {
        super(1);
        this.f7299e = i3;
        this.f7300f = uVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f7299e) {
            case 0:
                C0715m c0715m = (C0715m) obj;
                f2.u uVar = this.f7300f;
                Object obj2 = uVar.f5832d;
                if (obj2 == null && c0715m.f7302r) {
                    uVar.f5832d = c0715m;
                } else if (obj2 != null && c0715m.f7301q && c0715m.f7302r) {
                    uVar.f5832d = c0715m;
                }
                return Boolean.TRUE;
            case 1:
                C0715m c0715m2 = (C0715m) obj;
                q0 q0Var = q0.f8779d;
                if (!c0715m2.f7302r) {
                    return q0Var;
                }
                this.f7300f.f5832d = c0715m2;
                return c0715m2.f7301q ? q0.f8780e : q0Var;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0715m c0715m3 = (C0715m) obj;
                if (c0715m3.f7301q && c0715m3.f7302r) {
                    this.f7300f.f5832d = c0715m3;
                }
                return Boolean.TRUE;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                r0 r0Var = (r0) obj;
                f2.j.d(r0Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                C0971A c0971a = ((N) r0Var).f8460q;
                f2.u uVar2 = this.f7300f;
                List list = (List) uVar2.f5832d;
                if (list != null) {
                    list.add(c0971a);
                } else {
                    list = S1.m.C0(c0971a);
                }
                uVar2.f5832d = list;
                return q0.f8780e;
            default:
                String str = (String) obj;
                f2.j.f(str, "key");
                Object obj3 = this.f7300f.f5832d;
                boolean z3 = true;
                if (obj3 != null && ((Bundle) obj3).containsKey(str)) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
        }
    }
}
