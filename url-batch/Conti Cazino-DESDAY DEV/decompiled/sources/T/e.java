package T;

import K.C0012l;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f715e;

    public e(f fVar) {
        this.f715e = fVar;
    }

    @Override // q1.d
    public final void c0(Throwable th) {
        this.f715e.f716a.d(th);
    }

    @Override // q1.d
    public final void f0(t tVar) {
        f fVar = this.f715e;
        fVar.f718c = tVar;
        t tVar2 = fVar.f718c;
        j jVar = fVar.f716a;
        fVar.f717b = new C0012l(tVar2, jVar.f729g, jVar.i, Build.VERSION.SDK_INT >= 34 ? n.a() : q1.l.w());
        j jVar2 = fVar.f716a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f724a.writeLock().lock();
        try {
            jVar2.f726c = 1;
            arrayList.addAll(jVar2.f725b);
            jVar2.f725b.clear();
            jVar2.f724a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f726c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f724a.writeLock().unlock();
            throw th;
        }
    }
}
