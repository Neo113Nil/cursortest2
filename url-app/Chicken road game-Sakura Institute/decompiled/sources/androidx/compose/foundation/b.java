package androidx.compose.foundation;

import G.C0208l;
import G.C0216p;
import M2.p;
import S.l;
import S.o;
import kotlin.jvm.functions.Function0;
import m.Q;
import p.C0935k;
import y0.f;

/* loaded from: classes.dex */
public final class b extends p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f5036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5037e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f5038i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f5039j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f5040k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Q q2, boolean z4, String str, f fVar, Function0 function0) {
        super(3);
        this.f5036d = q2;
        this.f5037e = z4;
        this.f5038i = str;
        this.f5039j = fVar;
        this.f5040k = function0;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0216p c0216p = (C0216p) obj2;
        ((Number) obj3).intValue();
        c0216p.S(-1525724089);
        Object I3 = c0216p.I();
        if (I3 == C0208l.f2826a) {
            I3 = new C0935k();
            c0216p.c0(I3);
        }
        C0935k c0935k = (C0935k) I3;
        o h4 = d.a(l.f3977a, c0935k, this.f5036d).h(new ClickableElement(c0935k, null, this.f5037e, this.f5038i, this.f5039j, this.f5040k));
        c0216p.q(false);
        return h4;
    }
}
