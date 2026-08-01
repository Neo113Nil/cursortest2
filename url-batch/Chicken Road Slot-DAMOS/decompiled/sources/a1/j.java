package a1;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n0.i0;
import n0.n2;
import n0.q1;
import n0.s1;
import s.h0;
import s.p0;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final c6.c f32e;

    /* renamed from: a, reason: collision with root package name */
    public final Map f33a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f34b;

    /* renamed from: c, reason: collision with root package name */
    public m f35c;

    /* renamed from: d, reason: collision with root package name */
    public final d f36d;

    static {
        byte b10 = 0;
        f32e = new c6.c(1, new e(0, b10), new f(b10));
    }

    public j(Map map) {
        this.f33a = map;
        long[] jArr = p0.f8356a;
        this.f34b = new h0();
        this.f36d = new d(0, this);
    }

    public final void a(Object obj, x0.d dVar, i0 i0Var, int i3) {
        i0Var.X(533563200);
        int i10 = (i0Var.h(obj) ? 4 : 2) | i3 | (i0Var.h(dVar) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i10 |= i0Var.h(this) ? 256 : 128;
        }
        int i11 = 0;
        if (i0Var.O(i10 & 1, (i10 & 147) != 146)) {
            i0Var.Y(obj);
            Object L = i0Var.L();
            n0.e eVar = n0.k.f6729a;
            if (L == eVar) {
                d dVar2 = this.f36d;
                if (!((Boolean) dVar2.invoke(obj)).booleanValue()) {
                    a1.c(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.f33a.get(obj);
                n2 n2Var = p.f46a;
                q qVar = new q(new o(map, dVar2));
                i0Var.g0(qVar);
                L = qVar;
            }
            q qVar2 = (q) L;
            n0.h.b(new q1[]{p.f46a.a(qVar2), g5.a.f4273a.a(qVar2)}, dVar, i0Var, (i10 & 112) | 8);
            Unit unit = Unit.f5554a;
            boolean h10 = i0Var.h(this) | i0Var.h(obj) | i0Var.h(qVar2);
            Object L2 = i0Var.L();
            if (h10 || L2 == eVar) {
                L2 = new g(this, obj, qVar2, i11);
                i0Var.g0(L2);
            }
            n0.h.d(unit, (Function1) L2, i0Var);
            if (i0Var.f6720y && i0Var.G.f7741i == i0Var.f6721z) {
                i0Var.f6721z = -1;
                i0Var.f6720y = false;
            }
            i0Var.p(false);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new h(this, obj, dVar, i3, 0);
        }
    }
}
