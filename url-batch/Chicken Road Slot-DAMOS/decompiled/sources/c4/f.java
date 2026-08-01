package c4;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f1749a;

    public f(g gVar) {
        this.f1749a = gVar;
    }

    @Override // a.a
    public final void R(Throwable th) {
        this.f1749a.f1750a.e(th);
    }

    @Override // a.a
    public final void S(c6.n nVar) {
        g gVar = this.f1749a;
        gVar.f1752c = nVar;
        c6.n nVar2 = gVar.f1752c;
        k kVar = gVar.f1750a;
        gVar.f1751b = new a1.n(nVar2, kVar.g, kVar.f1764i, Build.VERSION.SDK_INT >= 34 ? p.a() : c6.f.G());
        k kVar2 = gVar.f1750a;
        ArrayList arrayList = new ArrayList();
        kVar2.f1757a.writeLock().lock();
        try {
            kVar2.f1759c = 1;
            arrayList.addAll(kVar2.f1758b);
            kVar2.f1758b.clear();
            kVar2.f1757a.writeLock().unlock();
            kVar2.f1760d.post(new b6.d(arrayList, kVar2.f1759c, (Throwable) null));
        } catch (Throwable th) {
            kVar2.f1757a.writeLock().unlock();
            throw th;
        }
    }
}
