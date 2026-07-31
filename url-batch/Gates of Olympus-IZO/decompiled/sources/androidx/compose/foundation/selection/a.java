package androidx.compose.foundation.selection;

import I.C0105l;
import I.C0113p;
import U.i;
import U.l;
import Y1.f;
import Z1.j;
import androidx.compose.foundation.c;
import n.Q;

/* loaded from: classes.dex */
public final class a extends j implements f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f3673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f3674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f3675g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0.f f3676h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y1.a f3677i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Q q2, boolean z3, boolean z4, z0.f fVar, Y1.a aVar) {
        super(3);
        this.f3673e = q2;
        this.f3674f = z3;
        this.f3675g = z4;
        this.f3676h = fVar;
        this.f3677i = aVar;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        C0113p c0113p = (C0113p) obj2;
        ((Number) obj3).intValue();
        c0113p.Q(-1525724089);
        Object G3 = c0113p.G();
        if (G3 == C0105l.f2272a) {
            G3 = new q.j();
            c0113p.a0(G3);
        }
        q.j jVar = (q.j) G3;
        l e3 = c.a(i.f3302a, jVar, this.f3673e).e(new SelectableElement(this.f3674f, jVar, null, this.f3675g, this.f3676h, this.f3677i));
        c0113p.p(false);
        return e3;
    }
}
