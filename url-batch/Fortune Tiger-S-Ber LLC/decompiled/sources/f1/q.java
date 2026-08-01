package f1;

import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n.f f1716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1717b;

    public q(r rVar, n.f fVar) {
        this.f1717b = rVar;
        this.f1716a = fVar;
    }

    @Override // f1.m
    public final void e(o oVar) {
        ((ArrayList) this.f1716a.get(this.f1717b.g)).remove(oVar);
        oVar.x(this);
    }
}
