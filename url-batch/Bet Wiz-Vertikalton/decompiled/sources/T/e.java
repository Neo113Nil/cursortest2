package T;

import K.C0011l;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends x1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f793e;

    public e(f fVar) {
        this.f793e = fVar;
    }

    @Override // x1.d
    public final void M(Throwable th) {
        this.f793e.f794a.d(th);
    }

    @Override // x1.d
    public final void R(u uVar) {
        f fVar = this.f793e;
        fVar.f796c = uVar;
        u uVar2 = fVar.f796c;
        j jVar = fVar.f794a;
        fVar.f795b = new C0011l(uVar2, jVar.f807g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : x1.l.B());
        j jVar2 = fVar.f794a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f802a.writeLock().lock();
        try {
            jVar2.f804c = 1;
            arrayList.addAll(jVar2.f803b);
            jVar2.f803b.clear();
            jVar2.f802a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f804c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f802a.writeLock().unlock();
            throw th;
        }
    }
}
