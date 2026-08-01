package U;

import K.C0014l;
import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends w1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f839e;

    public e(f fVar) {
        this.f839e = fVar;
    }

    @Override // w1.l
    public final void H(Throwable th) {
        this.f839e.f840a.d(th);
    }

    @Override // w1.l
    public final void K(u uVar) {
        f fVar = this.f839e;
        fVar.f842c = uVar;
        u uVar2 = fVar.f842c;
        j jVar = fVar.f840a;
        J0.e eVar = jVar.f853g;
        d dVar = jVar.i;
        Set<int[]> a2 = Build.VERSION.SDK_INT >= 34 ? o.a() : w1.d.B();
        C0014l c0014l = new C0014l();
        c0014l.f474a = eVar;
        c0014l.f475b = uVar2;
        c0014l.f476c = dVar;
        if (!a2.isEmpty()) {
            for (int[] iArr : a2) {
                String str = new String(iArr, 0, iArr.length);
                c0014l.j(str, 0, str.length(), 1, true, new C.g(14, str));
            }
        }
        fVar.f841b = c0014l;
        j jVar2 = fVar.f840a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f848a.writeLock().lock();
        try {
            jVar2.f850c = 1;
            arrayList.addAll(jVar2.f849b);
            jVar2.f849b.clear();
            jVar2.f848a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f850c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f848a.writeLock().unlock();
            throw th;
        }
    }
}
