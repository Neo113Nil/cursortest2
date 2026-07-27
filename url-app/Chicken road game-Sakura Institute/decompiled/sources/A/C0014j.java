package A;

import G.C0208l;
import G.C0216p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: A.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014j extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0014j(Function0 function0, boolean z4) {
        super(3);
        this.f157d = function0;
        this.f158e = z4;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        S.o oVar = (S.o) obj;
        C0216p c0216p = (C0216p) obj2;
        ((Number) obj3).intValue();
        c0216p.S(-196777734);
        long j4 = ((k0) c0216p.k(l0.f166a)).f160a;
        boolean e4 = c0216p.e(j4);
        Function0 function0 = this.f157d;
        boolean f4 = e4 | c0216p.f(function0);
        boolean z4 = this.f158e;
        boolean g4 = f4 | c0216p.g(z4);
        Object I3 = c0216p.I();
        if (g4 || I3 == C0208l.f2826a) {
            I3 = new C0013i(j4, function0, z4);
            c0216p.c0(I3);
        }
        S.o b4 = androidx.compose.ui.draw.a.b(oVar, (Function1) I3);
        c0216p.q(false);
        return b4;
    }
}
