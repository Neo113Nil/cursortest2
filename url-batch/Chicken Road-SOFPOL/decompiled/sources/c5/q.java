package c5;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.e f1724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1725b;

    public q(r rVar, o.e eVar) {
        this.f1725b = rVar;
        this.f1724a = eVar;
    }

    @Override // c5.m
    public final void d(o oVar) {
        ((ArrayList) this.f1724a.get(this.f1725b.f1727e)).remove(oVar);
        oVar.x(this);
    }
}
