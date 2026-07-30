package U;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends V6.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2662b;

    public e(f fVar) {
        super(10);
        this.f2662b = fVar;
    }

    @Override // V6.b
    public final void G(Throwable th) {
        this.f2662b.f2663a.d(th);
    }

    @Override // V6.b
    public final void H(P0.i iVar) {
        f fVar = this.f2662b;
        fVar.f2665c = iVar;
        fVar.f2664b = new P0.c(fVar.f2665c, new q1.h(8), fVar.f2663a.f2674h);
        j jVar = fVar.f2663a;
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        jVar.f2667a.writeLock().lock();
        try {
            jVar.f2669c = 1;
            arrayList.addAll(jVar.f2668b);
            jVar.f2668b.clear();
            jVar.f2667a.writeLock().unlock();
            jVar.f2670d.post(new O0.d(arrayList, jVar.f2669c, (Throwable) null));
        } catch (Throwable th) {
            jVar.f2667a.writeLock().unlock();
            throw th;
        }
    }
}
