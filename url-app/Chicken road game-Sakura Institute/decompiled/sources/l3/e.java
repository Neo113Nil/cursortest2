package l3;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends a8.m {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f5896g;

    public e(f fVar) {
        super(16);
        this.f5896g = fVar;
    }

    @Override // a8.m
    public final void F(Throwable th) {
        this.f5896g.f5897a.e(th);
    }

    @Override // a8.m
    public final void G(g3.k kVar) {
        f fVar = this.f5896g;
        fVar.f5899c = kVar;
        g3.k kVar2 = fVar.f5899c;
        k kVar3 = fVar.f5897a;
        fVar.f5898b = new b1.b(kVar2, kVar3.f5914g, kVar3.f5916i, Build.VERSION.SDK_INT >= 34 ? p.a() : j1.c.X());
        k kVar4 = fVar.f5897a;
        kVar4.getClass();
        ArrayList arrayList = new ArrayList();
        kVar4.f5908a.writeLock().lock();
        try {
            kVar4.f5910c = 1;
            arrayList.addAll(kVar4.f5909b);
            kVar4.f5909b.clear();
            kVar4.f5908a.writeLock().unlock();
            kVar4.f5911d.post(new i(arrayList, kVar4.f5910c, null));
        } catch (Throwable th) {
            kVar4.f5908a.writeLock().unlock();
            throw th;
        }
    }
}
