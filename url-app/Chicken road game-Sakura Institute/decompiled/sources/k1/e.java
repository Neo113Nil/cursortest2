package k1;

import B1.C0097d;
import a.AbstractC0345a;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends M1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f7375j;

    public e(f fVar) {
        this.f7375j = fVar;
    }

    @Override // M1.a
    public final void K(Throwable th) {
        this.f7375j.f7376a.e(th);
    }

    @Override // M1.a
    public final void L(Y0.b bVar) {
        f fVar = this.f7375j;
        fVar.f7378c = bVar;
        Y0.b bVar2 = fVar.f7378c;
        h hVar = fVar.f7376a;
        fVar.f7377b = new C0097d(bVar2, hVar.f7387g, hVar.f7389i, Build.VERSION.SDK_INT >= 34 ? k.a() : AbstractC0345a.v());
        h hVar2 = fVar.f7376a;
        hVar2.getClass();
        ArrayList arrayList = new ArrayList();
        hVar2.f7381a.writeLock().lock();
        try {
            hVar2.f7383c = 1;
            arrayList.addAll(hVar2.f7382b);
            hVar2.f7382b.clear();
            hVar2.f7381a.writeLock().unlock();
            hVar2.f7384d.post(new G1.k(arrayList, hVar2.f7383c, null));
        } catch (Throwable th) {
            hVar2.f7381a.writeLock().unlock();
            throw th;
        }
    }
}
