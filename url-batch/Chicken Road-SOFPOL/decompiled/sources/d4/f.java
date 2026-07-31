package d4;

import a0.g1;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends a.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f2259k;

    public f(g gVar) {
        this.f2259k = gVar;
    }

    @Override // a.a
    public final void t(Throwable th) {
        this.f2259k.f2260a.e(th);
    }

    @Override // a.a
    public final void u(c5.x xVar) {
        g gVar = this.f2259k;
        gVar.f2262c = xVar;
        c5.x xVar2 = gVar.f2262c;
        l lVar = gVar.f2260a;
        gVar.f2261b = new g1(xVar2, lVar.f2274g, lVar.i, Build.VERSION.SDK_INT >= 34 ? r.a() : s6.a.r());
        l lVar2 = gVar.f2260a;
        lVar2.getClass();
        ArrayList arrayList = new ArrayList();
        lVar2.f2268a.writeLock().lock();
        try {
            lVar2.f2270c = 1;
            arrayList.addAll(lVar2.f2269b);
            lVar2.f2269b.clear();
            lVar2.f2268a.writeLock().unlock();
            lVar2.f2271d.post(new j(arrayList, lVar2.f2270c, null));
        } catch (Throwable th) {
            lVar2.f2268a.writeLock().unlock();
            throw th;
        }
    }
}
