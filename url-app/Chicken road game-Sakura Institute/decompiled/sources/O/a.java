package O;

import A.C0005a;
import D.x1;
import G.C0216p;
import G.C0222s0;
import M2.J;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC1332g;

/* loaded from: classes.dex */
public final class a implements Function2, L2.c, L2.d, InterfaceC1332g {

    /* renamed from: d, reason: collision with root package name */
    public final int f3619d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3620e;

    /* renamed from: i, reason: collision with root package name */
    public Object f3621i;

    /* renamed from: j, reason: collision with root package name */
    public C0222s0 f3622j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3623k;

    public a(int i2, boolean z4, Object obj) {
        this.f3619d = i2;
        this.f3620e = z4;
        this.f3621i = obj;
    }

    public final Object a(Object obj, C0216p c0216p, int i2) {
        c0216p.U(this.f3619d);
        c(c0216p);
        int a4 = c0216p.f(this) ? f.a(2, 1) : f.a(1, 1);
        Object obj2 = this.f3621i;
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        J.d(3, obj2);
        Object g4 = ((L2.c) obj2).g(obj, c0216p, Integer.valueOf(a4 | i2));
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new x1(i2, 4, this, obj);
        }
        return g4;
    }

    public final Object b(Object obj, Object obj2, C0216p c0216p, int i2) {
        c0216p.U(this.f3619d);
        c(c0216p);
        int a4 = c0216p.f(this) ? f.a(2, 2) : f.a(1, 2);
        Object obj3 = this.f3621i;
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        J.d(4, obj3);
        Object f4 = ((L2.d) obj3).f(obj, obj2, c0216p, Integer.valueOf(a4 | i2));
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0005a(this, obj, obj2, i2);
        }
        return f4;
    }

    public final void c(C0216p c0216p) {
        C0222s0 x2;
        if (!this.f3620e || (x2 = c0216p.x()) == null) {
            return;
        }
        c0216p.getClass();
        x2.f2900a |= 1;
        if (f.c(this.f3622j, x2)) {
            this.f3622j = x2;
            return;
        }
        ArrayList arrayList = this.f3623k;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f3623k = arrayList2;
            arrayList2.add(x2);
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (f.c((C0222s0) arrayList.get(i2), x2)) {
                arrayList.set(i2, x2);
                return;
            }
        }
        arrayList.add(x2);
    }

    @Override // L2.d
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return b(obj, obj2, (C0216p) obj3, ((Number) obj4).intValue());
    }

    @Override // L2.c
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3) {
        return a(obj, (C0216p) obj2, ((Number) obj3).intValue());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        int intValue = ((Number) obj2).intValue();
        c0216p.U(this.f3619d);
        c(c0216p);
        int a4 = intValue | (c0216p.f(this) ? f.a(2, 0) : f.a(1, 0));
        Object obj3 = this.f3621i;
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        J.d(2, obj3);
        Object h4 = ((Function2) obj3).h(c0216p, Integer.valueOf(a4));
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            J.d(2, this);
            s4.f2903d = this;
        }
        return h4;
    }
}
