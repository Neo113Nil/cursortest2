package T;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends q1.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f780g;

    public e(f fVar) {
        this.f780g = fVar;
    }

    @Override // q1.l
    public final void P(Throwable th) {
        this.f780g.f781a.d(th);
    }

    @Override // q1.l
    public final void U(v vVar) {
        f fVar = this.f780g;
        fVar.f783c = vVar;
        v vVar2 = fVar.f783c;
        j jVar = fVar.f781a;
        fVar.f782b = new r(vVar2, jVar.f795g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : q1.d.B());
        j jVar2 = fVar.f781a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f789a.writeLock().lock();
        try {
            jVar2.f791c = 1;
            arrayList.addAll(jVar2.f790b);
            jVar2.f790b.clear();
            jVar2.f789a.writeLock().unlock();
            jVar2.f792d.post(new H.b(arrayList, jVar2.f791c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f789a.writeLock().unlock();
            throw th;
        }
    }
}
