package j1;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q.f f1957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1958b;

    public q(r rVar, q.f fVar) {
        this.f1958b = rVar;
        this.f1957a = fVar;
    }

    @Override // j1.m
    public final void c(o oVar) {
        ((ArrayList) this.f1957a.get(this.f1958b.f1960g)).remove(oVar);
        oVar.y(this);
    }
}
