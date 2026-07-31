package u0;

import a0.y;
import b6.i0;
import java.util.ArrayList;
import m0.s;
import m0.t1;
import q6.v;
import u.t0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: d, reason: collision with root package name */
    public final int f7138d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7139e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7140f;

    /* renamed from: g, reason: collision with root package name */
    public t1 f7141g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f7142h;

    public c(int i, boolean z3, Object obj) {
        this.f7138d = i;
        this.f7139e = z3;
        this.f7140f = obj;
    }

    public final Object a(Object obj, Object obj2, s sVar, int i) {
        sVar.W(this.f7138d);
        k(sVar);
        int a8 = sVar.f(this) ? h.a(2, 2) : h.a(1, 2);
        Object obj3 = this.f7140f;
        q6.i.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        v.c(4, obj3);
        Object j7 = ((p6.g) obj3).j(obj, obj2, sVar, Integer.valueOf(a8 | i));
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new y(this, obj, obj2, i, 5);
        }
        return j7;
    }

    @Override // p6.f
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return e(obj, (s) obj2, ((Number) obj3).intValue());
    }

    public final Object e(Object obj, s sVar, int i) {
        sVar.W(this.f7138d);
        k(sVar);
        int a8 = sVar.f(this) ? h.a(2, 1) : h.a(1, 1);
        Object obj2 = this.f7140f;
        q6.i.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        v.c(3, obj2);
        Object d8 = ((p6.f) obj2).d(obj, sVar, Integer.valueOf(a8 | i));
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new i0(i, 7, this, obj);
        }
        return d8;
    }

    public final Object f(s sVar, int i) {
        sVar.W(this.f7138d);
        k(sVar);
        int a8 = i | (sVar.f(this) ? h.a(2, 0) : h.a(1, 0));
        Object obj = this.f7140f;
        q6.i.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        v.c(2, obj);
        Object g3 = ((p6.e) obj).g(sVar, Integer.valueOf(a8));
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new t0(2, this, c.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 1);
        }
        return g3;
    }

    @Override // p6.e
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
        return f((s) obj, ((Number) obj2).intValue());
    }

    @Override // p6.g
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return a(obj, obj2, (s) obj3, ((Number) obj4).intValue());
    }

    public final void k(s sVar) {
        t1 w7;
        if (!this.f7139e || (w7 = sVar.w()) == null) {
            return;
        }
        w7.f5119b |= 1;
        if (h.e(this.f7141g, w7)) {
            this.f7141g = w7;
            return;
        }
        ArrayList arrayList = this.f7142h;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f7142h = arrayList2;
            arrayList2.add(w7);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (h.e((t1) arrayList.get(i), w7)) {
                arrayList.set(i, w7);
                return;
            }
        }
        arrayList.add(w7);
    }
}
