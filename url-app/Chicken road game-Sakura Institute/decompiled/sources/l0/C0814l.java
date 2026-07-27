package l0;

import M2.E;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import r0.p0;
import r0.q0;
import s.C1096L;
import z2.C1441y;

/* renamed from: l0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814l extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f7915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0814l(E e4, int i2) {
        super(1);
        this.f7914d = i2;
        this.f7915e = e4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7914d) {
            case 0:
                C0815m c0815m = (C0815m) obj;
                E e4 = this.f7915e;
                Object obj2 = e4.f3580d;
                if (obj2 == null && c0815m.f7917u) {
                    e4.f3580d = c0815m;
                } else if (obj2 != null && c0815m.f7916t && c0815m.f7917u) {
                    e4.f3580d = c0815m;
                }
                return Boolean.TRUE;
            case 1:
                C0815m c0815m2 = (C0815m) obj;
                p0 p0Var = p0.f9828d;
                if (!c0815m2.f7917u) {
                    return p0Var;
                }
                this.f7915e.f3580d = c0815m2;
                return c0815m2.f7916t ? p0.f9829e : p0Var;
            case 2:
                C0815m c0815m3 = (C0815m) obj;
                if (c0815m3.f7916t && c0815m3.f7917u) {
                    this.f7915e.f3580d = c0815m3;
                }
                return Boolean.TRUE;
            case 3:
                this.f7915e.f3580d = (AbstractC0954O) obj;
                return Unit.f7487a;
            case 4:
                this.f7915e.f3580d = (AbstractC0954O) obj;
                return Unit.f7487a;
            default:
                q0 q0Var = (q0) obj;
                Intrinsics.d(q0Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                s.z zVar = ((C1096L) q0Var).f9913t;
                E e5 = this.f7915e;
                List list = (List) e5.f3580d;
                if (list != null) {
                    list.add(zVar);
                } else {
                    list = C1441y.f(zVar);
                }
                e5.f3580d = list;
                return p0.f9829e;
        }
    }
}
