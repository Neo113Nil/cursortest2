package m;

import G.C0208l;
import G.C0216p;
import kotlin.jvm.functions.Function0;
import p.C0935k;

/* renamed from: m.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848v extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8203e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y0.f f8204i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f8205j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0848v(boolean z4, String str, y0.f fVar, Function0 function0) {
        super(3);
        this.f8202d = z4;
        this.f8203e = str;
        this.f8204i = fVar;
        this.f8205j = function0;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0935k c0935k;
        C0216p c0216p = (C0216p) obj2;
        ((Number) obj3).intValue();
        c0216p.S(-756081143);
        Q q2 = (Q) c0216p.k(androidx.compose.foundation.d.f5041a);
        if (q2 instanceof W) {
            c0216p.S(617140216);
            c0216p.q(false);
            c0935k = null;
        } else {
            c0216p.S(617248189);
            Object I3 = c0216p.I();
            if (I3 == C0208l.f2826a) {
                I3 = new C0935k();
                c0216p.c0(I3);
            }
            c0935k = (C0935k) I3;
            c0216p.q(false);
        }
        C0935k c0935k2 = c0935k;
        S.o c4 = androidx.compose.foundation.a.c(S.l.f3977a, c0935k2, q2, this.f8202d, this.f8203e, this.f8204i, this.f8205j);
        c0216p.q(false);
        return c4;
    }
}
