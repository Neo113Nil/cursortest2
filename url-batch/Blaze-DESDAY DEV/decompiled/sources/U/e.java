package U;

import K.C0014l;
import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends z1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f848e;

    public e(f fVar) {
        this.f848e = fVar;
    }

    @Override // z1.l
    public final void I(Throwable th) {
        this.f848e.f849a.d(th);
    }

    @Override // z1.l
    public final void J(u uVar) {
        f fVar = this.f848e;
        fVar.f851c = uVar;
        u uVar2 = fVar.f851c;
        j jVar = fVar.f849a;
        J0.e eVar = jVar.f862g;
        d dVar = jVar.i;
        Set<int[]> a2 = Build.VERSION.SDK_INT >= 34 ? o.a() : z1.d.E();
        C0014l c0014l = new C0014l();
        c0014l.f491a = eVar;
        c0014l.f492b = uVar2;
        c0014l.f493c = dVar;
        if (!a2.isEmpty()) {
            for (int[] iArr : a2) {
                String str = new String(iArr, 0, iArr.length);
                c0014l.j(str, 0, str.length(), 1, true, new C.g(13, str));
            }
        }
        fVar.f850b = c0014l;
        j jVar2 = fVar.f849a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f857a.writeLock().lock();
        try {
            jVar2.f859c = 1;
            arrayList.addAll(jVar2.f858b);
            jVar2.f858b.clear();
            jVar2.f857a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f859c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f857a.writeLock().unlock();
            throw th;
        }
    }
}
