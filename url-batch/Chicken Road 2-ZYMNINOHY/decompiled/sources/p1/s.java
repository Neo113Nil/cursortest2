package p1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p.e f14791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f14792b;

    public s(t tVar, p.e eVar) {
        this.f14792b = tVar;
        this.f14791a = eVar;
    }

    @Override // p1.p
    public final void a(q qVar) {
        ((ArrayList) this.f14791a.get(this.f14792b.f14794b)).remove(qVar);
        qVar.w(this);
    }
}
