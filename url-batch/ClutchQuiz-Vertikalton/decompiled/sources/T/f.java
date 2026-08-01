package T;

import K.C0012m;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f808a;

    public f(g gVar) {
        this.f808a = gVar;
    }

    @Override // T.d
    public final void B(Throwable th) {
        this.f808a.f809a.d(th);
    }

    @Override // T.d
    public final void E(w wVar) {
        g gVar = this.f808a;
        gVar.f811c = wVar;
        w wVar2 = gVar.f811c;
        k kVar = gVar.f809a;
        gVar.f810b = new C0012m(wVar2, kVar.f822g, kVar.i, Build.VERSION.SDK_INT >= 34 ? p.a() : d.u());
        k kVar2 = gVar.f809a;
        kVar2.getClass();
        ArrayList arrayList = new ArrayList();
        kVar2.f817a.writeLock().lock();
        try {
            kVar2.f819c = 1;
            arrayList.addAll(kVar2.f818b);
            kVar2.f818b.clear();
            kVar2.f817a.writeLock().unlock();
            kVar2.d.post(new H.b(arrayList, kVar2.f819c, (Throwable) null));
        } catch (Throwable th) {
            kVar2.f817a.writeLock().unlock();
            throw th;
        }
    }
}
