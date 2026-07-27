package A1;

import A.AbstractC0017m;
import D.N1;
import D.W0;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1039r;
import q.C1041t;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import z1.C1377c;
import z1.C1391q;

/* renamed from: A1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f610e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f611i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f612j;

    public /* synthetic */ C0060i(Object obj, Object obj2, Object obj3, int i2) {
        this.f609d = i2;
        this.f610e = obj;
        this.f611i = obj2;
        this.f612j = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f609d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    S.l lVar = S.l.f3977a;
                    C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
                    int i2 = c0216p.f2861P;
                    InterfaceC0213n0 m4 = c0216p.m();
                    S.o d4 = S.a.d(c0216p, lVar);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i = C1069j.f9816b;
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(c1068i);
                    } else {
                        c0216p.f0();
                    }
                    C0192d.R(c0216p, a4, C1069j.f9820f);
                    C0192d.R(c0216p, m4, C1069j.f9819e);
                    C1067h c1067h = C1069j.f9821g;
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i2))) {
                        AbstractC0017m.r(i2, c0216p, i2, c1067h);
                    }
                    C0192d.R(c0216p, d4, C1069j.f9818d);
                    InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) this.f610e;
                    String str = (String) interfaceC0191c0.getValue();
                    c0216p.S(926035793);
                    Object I3 = c0216p.I();
                    G.W w4 = C0208l.f2826a;
                    if (I3 == w4) {
                        I3 = new C0058h(0, interfaceC0191c0);
                        c0216p.c0(I3);
                    }
                    c0216p.q(false);
                    AbstractC0864b.i(str, (Function1) I3, "Discipline (e.g. 100 m)", null, c0216p, 432, 8);
                    float f4 = 8;
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, f4));
                    InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) this.f611i;
                    String str2 = (String) interfaceC0191c02.getValue();
                    c0216p.S(926039884);
                    Object I4 = c0216p.I();
                    if (I4 == w4) {
                        I4 = new C0058h(1, interfaceC0191c02);
                        c0216p.c0(I4);
                    }
                    c0216p.q(false);
                    AbstractC0864b.i(str2, (Function1) I4, "Result (e.g. 12.84 s / 5.42 m)", null, c0216p, 432, 8);
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, f4));
                    InterfaceC0191c0 interfaceC0191c03 = (InterfaceC0191c0) this.f612j;
                    String str3 = (String) interfaceC0191c03.getValue();
                    c0216p.S(926044011);
                    Object I5 = c0216p.I();
                    if (I5 == w4) {
                        I5 = new C0058h(2, interfaceC0191c03);
                        c0216p.c0(I5);
                    }
                    c0216p.q(false);
                    AbstractC0864b.i(str3, (Function1) I5, "Date (yyyy-MM-dd)", null, c0216p, 432, 8);
                    c0216p.q(true);
                }
                break;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    c0216p2.S(-797860064);
                    C1377c c1377c = (C1377c) this.f611i;
                    boolean h4 = c0216p2.h(c1377c);
                    Function0 function0 = (Function0) this.f612j;
                    boolean f5 = h4 | c0216p2.f(function0);
                    Object I6 = c0216p2.I();
                    if (f5 || I6 == C0208l.f2826a) {
                        I6 = new r(c1377c, function0, (InterfaceC0191c0) this.f610e);
                        c0216p2.c0(I6);
                    }
                    c0216p2.q(false);
                    W0.h((Function0) I6, null, false, null, null, null, null, null, null, AbstractC0082v.f738e, c0216p2, 805306368);
                }
                break;
            default:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    ArrayList arrayList = (ArrayList) this.f610e;
                    if (arrayList.isEmpty()) {
                        c0216p3.S(1279531358);
                        N1.b("No athletes left to add. Create them in the Roster tab first.", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 6, 0, 131070);
                        c0216p3.q(false);
                    } else {
                        c0216p3.S(1279535194);
                        S.o d5 = androidx.compose.foundation.layout.c.d(S.l.f3977a, 0.0f, 360, 1);
                        c0216p3.S(1279536558);
                        boolean h5 = c0216p3.h(arrayList);
                        Object obj3 = (C1391q) this.f611i;
                        boolean h6 = h5 | c0216p3.h(obj3);
                        Function0 function02 = (Function0) this.f612j;
                        boolean f6 = h6 | c0216p3.f(function02);
                        Object I7 = c0216p3.I();
                        if (f6 || I7 == C0208l.f2826a) {
                            I7 = new I(arrayList, obj3, function02, 1);
                            c0216p3.c0(I7);
                        }
                        c0216p3.q(false);
                        m3.s.a(d5, null, null, false, null, null, null, false, (Function1) I7, c0216p3, 6, 254);
                        c0216p3.q(false);
                    }
                }
                break;
        }
        return Unit.f7487a;
    }

    public C0060i(C1377c c1377c, Function0 function0, InterfaceC0191c0 interfaceC0191c0) {
        this.f609d = 1;
        this.f611i = c1377c;
        this.f612j = function0;
        this.f610e = interfaceC0191c0;
    }
}
