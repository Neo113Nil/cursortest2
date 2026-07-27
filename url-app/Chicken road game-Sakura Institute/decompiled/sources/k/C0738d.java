package k;

import A.i0;
import A0.C0030a;
import G.C0205j0;
import G.C0208l;
import G.C0216p;
import Q.C0265a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.m0;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738d extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f7280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7281e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f7282i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0746l f7283j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q.v f7284k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O.a f7285l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0738d(m0 m0Var, Object obj, Function1 function1, C0746l c0746l, Q.v vVar, O.a aVar) {
        super(2);
        this.f7280d = m0Var;
        this.f7281e = obj;
        this.f7282i = function1;
        this.f7283j = c0746l;
        this.f7284k = vVar;
        this.f7285l = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            Object I3 = c0216p.I();
            Object obj3 = C0208l.f2826a;
            Function1 function1 = this.f7282i;
            C0746l c0746l = this.f7283j;
            if (I3 == obj3) {
                I3 = (v) function1.invoke(c0746l);
                c0216p.c0(I3);
            }
            v vVar = (v) I3;
            m0 m0Var = this.f7280d;
            Object c4 = m0Var.f().c();
            Object obj4 = this.f7281e;
            boolean g4 = c0216p.g(Intrinsics.a(c4, obj4));
            Object I4 = c0216p.I();
            if (g4 || I4 == obj3) {
                I4 = Intrinsics.a(m0Var.f().c(), obj4) ? C0731G.f7254b : ((v) function1.invoke(c0746l)).f7335b;
                c0216p.c0(I4);
            }
            C0731G c0731g = (C0731G) I4;
            Object I5 = c0216p.I();
            C0205j0 c0205j0 = m0Var.f7803d;
            if (I5 == obj3) {
                I5 = new C0743i(Intrinsics.a(obj4, c0205j0.getValue()));
                c0216p.c0(I5);
            }
            C0743i c0743i = (C0743i) I5;
            C0730F c0730f = vVar.f7334a;
            boolean h4 = c0216p.h(vVar);
            Object I6 = c0216p.I();
            if (h4 || I6 == obj3) {
                I6 = new i0(2, vVar);
                c0216p.c0(I6);
            }
            S.o b4 = androidx.compose.ui.layout.a.b((L2.c) I6);
            c0743i.f7293a.setValue(Boolean.valueOf(Intrinsics.a(obj4, c0205j0.getValue())));
            S.o h5 = b4.h(c0743i);
            boolean h6 = c0216p.h(obj4);
            Object I7 = c0216p.I();
            if (h6 || I7 == obj3) {
                I7 = new C0265a(1, obj4);
                c0216p.c0(I7);
            }
            Function1 function12 = (Function1) I7;
            boolean f4 = c0216p.f(c0731g);
            Object I8 = c0216p.I();
            if (f4 || I8 == obj3) {
                I8 = new C0030a(7, c0731g);
                c0216p.c0(I8);
            }
            androidx.compose.animation.a.a(this.f7280d, function12, h5, c0730f, c0731g, (Function2) I8, O.f.b(-616195562, new C0737c(this.f7284k, obj4, c0746l, this.f7285l, 0), c0216p), c0216p, 12582912);
        }
        return Unit.f7487a;
    }
}
