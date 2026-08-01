package T;

import K.C0012l;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f709e;

    public e(f fVar) {
        this.f709e = fVar;
    }

    @Override // q1.d
    public final void b0(Throwable th) {
        this.f709e.f710a.d(th);
    }

    @Override // q1.d
    public final void e0(t tVar) {
        f fVar = this.f709e;
        fVar.f712c = tVar;
        t tVar2 = fVar.f712c;
        j jVar = fVar.f710a;
        fVar.f711b = new C0012l(tVar2, jVar.f723g, jVar.i, Build.VERSION.SDK_INT >= 34 ? n.a() : q1.l.w());
        j jVar2 = fVar.f710a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f718a.writeLock().lock();
        try {
            jVar2.f720c = 1;
            arrayList.addAll(jVar2.f719b);
            jVar2.f719b.clear();
            jVar2.f718a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f720c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f718a.writeLock().unlock();
            throw th;
        }
    }
}
