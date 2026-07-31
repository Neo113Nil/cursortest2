package Q;

import F.V0;
import I.C0113p;
import I.C0119s0;
import Y1.g;
import Z1.i;
import Z1.w;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements Y1.e, Y1.f, g, L1.e {

    /* renamed from: d, reason: collision with root package name */
    public final int f3076d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3077e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3078f;

    /* renamed from: g, reason: collision with root package name */
    public C0119s0 f3079g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3080h;

    public a(int i3, Object obj, boolean z3) {
        this.f3076d = i3;
        this.f3077e = z3;
        this.f3078f = obj;
    }

    public final Object a(Object obj, C0113p c0113p, int i3) {
        c0113p.S(this.f3076d);
        i(c0113p);
        int a3 = c0113p.f(this) ? f.a(2, 1) : f.a(1, 1);
        Object obj2 = this.f3078f;
        i.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        w.d(3, obj2);
        Object f3 = ((Y1.f) obj2).f(obj, c0113p, Integer.valueOf(a3 | i3));
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new V0(this, obj, i3);
        }
        return f3;
    }

    public final Object c(Object obj, Object obj2, C0113p c0113p, int i3) {
        c0113p.S(this.f3076d);
        i(c0113p);
        int a3 = c0113p.f(this) ? f.a(2, 2) : f.a(1, 2);
        Object obj3 = this.f3078f;
        i.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        w.d(4, obj3);
        Object e3 = ((g) obj3).e(obj, obj2, c0113p, Integer.valueOf(a3 | i3));
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new P0.d(this, obj, obj2, i3);
        }
        return e3;
    }

    @Override // Y1.g
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (C0113p) obj3, ((Number) obj4).intValue());
    }

    @Override // Y1.f
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3) {
        return a(obj, (C0113p) obj2, ((Number) obj3).intValue());
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0113p c0113p = (C0113p) obj;
        int intValue = ((Number) obj2).intValue();
        c0113p.S(this.f3076d);
        i(c0113p);
        int a3 = intValue | (c0113p.f(this) ? f.a(2, 0) : f.a(1, 0));
        Object obj3 = this.f3078f;
        i.d(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        w.d(2, obj3);
        Object g3 = ((Y1.e) obj3).g(c0113p, Integer.valueOf(a3));
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            w.d(2, this);
            r3.f2347d = this;
        }
        return g3;
    }

    public final void i(C0113p c0113p) {
        C0119s0 v3;
        if (!this.f3077e || (v3 = c0113p.v()) == null) {
            return;
        }
        v3.f2344a |= 1;
        if (f.c(this.f3079g, v3)) {
            this.f3079g = v3;
            return;
        }
        ArrayList arrayList = this.f3080h;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f3080h = arrayList2;
            arrayList2.add(v3);
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (f.c((C0119s0) arrayList.get(i3), v3)) {
                arrayList.set(i3, v3);
                return;
            }
        }
        arrayList.add(v3);
    }
}
