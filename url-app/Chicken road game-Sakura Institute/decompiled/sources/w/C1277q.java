package w;

import A0.C0036g;
import B1.C0097d;
import G.C0222s0;
import G.C0225u;
import G0.C0237a;
import G0.C0242f;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0980p;
import s0.C1146h0;
import s0.L0;
import z2.C1441y;

/* renamed from: w.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1277q extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f11319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1277q(P p4, int i2) {
        super(1);
        this.f11318d = i2;
        this.f11319e = p4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Unit unit;
        L0 l02;
        boolean z4 = false;
        Unit unit2 = null;
        P p4 = this.f11319e;
        switch (this.f11318d) {
            case 0:
                InterfaceC0980p interfaceC0980p = (InterfaceC0980p) obj;
                o0 d4 = p4.d();
                if (d4 != null) {
                    d4.f11292c = interfaceC0980p;
                }
                return Unit.f7487a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                p4.f11070q.setValue(bool);
                return Unit.f7487a;
            case 2:
                List list = (List) obj;
                if (p4.d() != null) {
                    o0 d5 = p4.d();
                    Intrinsics.c(d5);
                    list.add(d5.f11290a);
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 3:
                C0036g c0036g = (C0036g) obj;
                G0.E e4 = p4.f11058e;
                C1277q c1277q = p4.f11073t;
                if (e4 != null) {
                    G0.y i2 = p4.f11057d.i(C1441y.e(new C0242f(), new C0237a(c0036g, 1)));
                    e4.a(null, i2);
                    c1277q.invoke(i2);
                    unit2 = Unit.f7487a;
                }
                if (unit2 == null) {
                    String str = c0036g.f328a;
                    int length = str.length();
                    c1277q.invoke(new G0.y(4, M1.a.j(length, length), str));
                }
                return Boolean.TRUE;
            case 4:
                int i4 = ((G0.l) obj).f3066a;
                C0097d c0097d = p4.f11071r;
                c0097d.getClass();
                if (G0.l.a(i4, 7)) {
                    function1 = c0097d.p().f11041a;
                } else if (G0.l.a(i4, 2)) {
                    function1 = c0097d.p().f11042b;
                } else if (G0.l.a(i4, 6)) {
                    function1 = c0097d.p().f11043c;
                } else if (G0.l.a(i4, 5)) {
                    function1 = c0097d.p().f11044d;
                } else if (G0.l.a(i4, 3)) {
                    function1 = c0097d.p().f11045e;
                } else if (G0.l.a(i4, 4)) {
                    function1 = c0097d.p().f11046f;
                } else {
                    if (!(G0.l.a(i4, 1) ? true : G0.l.a(i4, 0))) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                    function1 = null;
                }
                if (function1 != null) {
                    function1.invoke(c0097d);
                    unit = Unit.f7487a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    if (G0.l.a(i4, 6)) {
                        X.h hVar = (X.h) c0097d.f989j;
                        if (hVar == null) {
                            Intrinsics.g("focusManager");
                            throw null;
                        }
                        ((androidx.compose.ui.focus.b) hVar).d(1);
                    } else if (G0.l.a(i4, 5)) {
                        X.h hVar2 = (X.h) c0097d.f989j;
                        if (hVar2 == null) {
                            Intrinsics.g("focusManager");
                            throw null;
                        }
                        ((androidx.compose.ui.focus.b) hVar2).d(2);
                    } else if (G0.l.a(i4, 7) && (l02 = (L0) c0097d.f987e) != null) {
                        ((C1146h0) l02).a();
                    }
                }
                return Unit.f7487a;
            default:
                G0.y yVar = (G0.y) obj;
                String str2 = yVar.f3093a.f328a;
                C0036g c0036g2 = p4.f11063j;
                if (!Intrinsics.a(str2, c0036g2 != null ? c0036g2.f328a : null)) {
                    p4.f11064k.setValue(EnumC1257F.f11023d);
                }
                long j4 = A0.K.f299b;
                p4.f(j4);
                p4.e(j4);
                p4.f11072s.invoke(yVar);
                C0222s0 c0222s0 = p4.f11055b;
                C0225u c0225u = c0222s0.f2901b;
                if (c0225u != null) {
                    c0225u.p(c0222s0, null);
                }
                return Unit.f7487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1277q(P p4, y0.i iVar) {
        super(1);
        this.f11318d = 3;
        this.f11319e = p4;
    }
}
