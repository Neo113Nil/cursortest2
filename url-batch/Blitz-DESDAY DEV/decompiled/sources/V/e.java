package V;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends z1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f879e;

    public e(f fVar) {
        this.f879e = fVar;
    }

    @Override // z1.d
    public final void M(Throwable th) {
        this.f879e.f880a.d(th);
    }

    @Override // z1.d
    public final void N(T0.g gVar) {
        f fVar = this.f879e;
        fVar.f882c = gVar;
        T0.g gVar2 = fVar.f882c;
        j jVar = fVar.f880a;
        fVar.f881b = new A1.j(gVar2, jVar.f893g, jVar.i, Build.VERSION.SDK_INT >= 34 ? n.a() : z1.l.G());
        j jVar2 = fVar.f880a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f888a.writeLock().lock();
        try {
            jVar2.f890c = 1;
            arrayList.addAll(jVar2.f889b);
            jVar2.f889b.clear();
            jVar2.f888a.writeLock().unlock();
            jVar2.d.post(new J.a(arrayList, jVar2.f890c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f888a.writeLock().unlock();
            throw th;
        }
    }
}
