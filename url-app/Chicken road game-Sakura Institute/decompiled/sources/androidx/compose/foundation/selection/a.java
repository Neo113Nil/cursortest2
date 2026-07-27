package androidx.compose.foundation.selection;

import G.C0208l;
import G.C0216p;
import L2.c;
import M2.p;
import S.l;
import S.o;
import androidx.compose.foundation.d;
import kotlin.jvm.functions.Function0;
import m.Q;
import p.C0935k;
import y0.f;

/* loaded from: classes.dex */
public final class a extends p implements c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f5119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5120e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f5121i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f5122j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f5123k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Q q2, boolean z4, boolean z5, f fVar, Function0 function0) {
        super(3);
        this.f5119d = q2;
        this.f5120e = z4;
        this.f5121i = z5;
        this.f5122j = fVar;
        this.f5123k = function0;
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
        o h4 = d.a(l.f3977a, c0935k, this.f5119d).h(new SelectableElement(this.f5120e, c0935k, null, this.f5121i, this.f5122j, this.f5123k));
        c0216p.q(false);
        return h4;
    }
}
