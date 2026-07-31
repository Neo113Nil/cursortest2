package Q;

import B.C0000a;
import F.C0105l;
import F.v1;
import I.C0167p;
import I.C0173s0;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import e2.InterfaceC0428g;
import e2.InterfaceC0429h;
import f2.j;
import f2.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements InterfaceC0426e, InterfaceC0427f, InterfaceC0428g, InterfaceC0429h, R1.e {

    /* renamed from: d, reason: collision with root package name */
    public final int f3942d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3943e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3944f;

    /* renamed from: g, reason: collision with root package name */
    public C0173s0 f3945g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3946h;

    public a(int i3, Object obj, boolean z3) {
        this.f3942d = i3;
        this.f3943e = z3;
        this.f3944f = obj;
    }

    public final Object a(J1.a aVar, String str, String str2, C0167p c0167p, int i3) {
        c0167p.S(this.f3942d);
        j(c0167p);
        int a3 = c0167p.f(this) ? f.a(2, 3) : f.a(1, 3);
        Object obj = this.f3944f;
        j.d(obj, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        x.d(5, obj);
        Object i4 = ((InterfaceC0429h) obj).i(aVar, str, str2, c0167p, Integer.valueOf(a3 | i3));
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0105l(this, aVar, str, str2, i3);
        }
        return i4;
    }

    public final Object c(Object obj, C0167p c0167p, int i3) {
        c0167p.S(this.f3942d);
        j(c0167p);
        int a3 = c0167p.f(this) ? f.a(2, 1) : f.a(1, 1);
        Object obj2 = this.f3944f;
        j.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        x.d(3, obj2);
        Object g3 = ((InterfaceC0427f) obj2).g(obj, c0167p, Integer.valueOf(a3 | i3));
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new v1(this, obj, i3);
        }
        return g3;
    }

    public final Object e(Object obj, Object obj2, C0167p c0167p, int i3) {
        c0167p.S(this.f3942d);
        j(c0167p);
        int a3 = c0167p.f(this) ? f.a(2, 2) : f.a(1, 2);
        Object obj3 = this.f3944f;
        j.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        x.d(4, obj3);
        Object f3 = ((InterfaceC0428g) obj3).f(obj, obj2, c0167p, Integer.valueOf(a3 | i3));
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0000a(this, obj, obj2, i3);
        }
        return f3;
    }

    @Override // e2.InterfaceC0428g
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return e(obj, obj2, (C0167p) obj3, ((Number) obj4).intValue());
    }

    @Override // e2.InterfaceC0427f
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3) {
        return c(obj, (C0167p) obj2, ((Number) obj3).intValue());
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        int intValue = ((Number) obj2).intValue();
        c0167p.S(this.f3942d);
        j(c0167p);
        int a3 = intValue | (c0167p.f(this) ? f.a(2, 0) : f.a(1, 0));
        Object obj3 = this.f3944f;
        j.d(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        x.d(2, obj3);
        Object h3 = ((InterfaceC0426e) obj3).h(c0167p, Integer.valueOf(a3));
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            x.d(2, this);
            r3.f2906d = this;
        }
        return h3;
    }

    @Override // e2.InterfaceC0429h
    public final /* bridge */ /* synthetic */ Object i(J1.a aVar, String str, String str2, Object obj, Object obj2) {
        return a(aVar, str, str2, (C0167p) obj, ((Number) obj2).intValue());
    }

    public final void j(C0167p c0167p) {
        C0173s0 v3;
        if (!this.f3943e || (v3 = c0167p.v()) == null) {
            return;
        }
        c0167p.getClass();
        v3.f2903a |= 1;
        if (f.c(this.f3945g, v3)) {
            this.f3945g = v3;
            return;
        }
        ArrayList arrayList = this.f3946h;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f3946h = arrayList2;
            arrayList2.add(v3);
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (f.c((C0173s0) arrayList.get(i3), v3)) {
                arrayList.set(i3, v3);
                return;
            }
        }
        arrayList.add(v3);
    }
}
