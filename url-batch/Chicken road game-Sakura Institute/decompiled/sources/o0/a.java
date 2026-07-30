package o0;

import g0.p;
import g0.p1;
import g0.v;
import java.util.ArrayList;
import q6.g;
import r6.k;
import r6.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements q6.e, q6.f, g, d6.e {

    /* renamed from: f, reason: collision with root package name */
    public final int f6810f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6811g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6812h;

    /* renamed from: i, reason: collision with root package name */
    public p1 f6813i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f6814j;

    public a(int i7, Object obj, boolean z8) {
        this.f6810f = i7;
        this.f6811g = z8;
        this.f6812h = obj;
    }

    @Override // q6.f
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3) {
        return g(obj, (p) obj2, ((Number) obj3).intValue());
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        p pVar = (p) obj;
        int intValue = ((Number) obj2).intValue();
        pVar.S(this.f6810f);
        i(pVar);
        int a3 = intValue | (pVar.f(this) ? f.a(2, 0) : f.a(1, 0));
        Object obj3 = this.f6812h;
        k.d(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        y.d(2, obj3);
        Object d8 = ((q6.e) obj3).d(pVar, Integer.valueOf(a3));
        p1 r8 = pVar.r();
        if (r8 != null) {
            y.d(2, this);
            r8.f3853d = this;
        }
        return d8;
    }

    public final Object g(Object obj, p pVar, int i7) {
        pVar.S(this.f6810f);
        i(pVar);
        int a3 = pVar.f(this) ? f.a(2, 1) : f.a(1, 1);
        Object obj2 = this.f6812h;
        k.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        y.d(3, obj2);
        Object c4 = ((q6.f) obj2).c(obj, pVar, Integer.valueOf(a3 | i7));
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new v(i7, 3, this, obj);
        }
        return c4;
    }

    public final Object h(Object obj, Object obj2, p pVar, int i7) {
        pVar.S(this.f6810f);
        i(pVar);
        int a3 = pVar.f(this) ? f.a(2, 2) : f.a(1, 2);
        Object obj3 = this.f6812h;
        k.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        y.d(4, obj3);
        Object j8 = ((g) obj3).j(obj, obj2, pVar, Integer.valueOf(a3 | i7));
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a0.a(this, obj, obj2, i7);
        }
        return j8;
    }

    public final void i(p pVar) {
        p1 v5;
        if (!this.f6811g || (v5 = pVar.v()) == null) {
            return;
        }
        pVar.getClass();
        v5.f3850a |= 1;
        if (f.c(this.f6813i, v5)) {
            this.f6813i = v5;
            return;
        }
        ArrayList arrayList = this.f6814j;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f6814j = arrayList2;
            arrayList2.add(v5);
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (f.c((p1) arrayList.get(i7), v5)) {
                arrayList.set(i7, v5);
                return;
            }
        }
        arrayList.add(v5);
    }

    @Override // q6.g
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return h(obj, obj2, (p) obj3, ((Number) obj4).intValue());
    }
}
