package V;

import L.C0014l;
import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends A1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f889a;

    public e(f fVar) {
        this.f889a = fVar;
    }

    @Override // A1.m
    public final void N(Throwable th) {
        this.f889a.f890a.d(th);
    }

    @Override // A1.m
    public final void Q(S0.g gVar) {
        f fVar = this.f889a;
        fVar.f892c = gVar;
        S0.g gVar2 = fVar.f892c;
        j jVar = fVar.f890a;
        K0.e eVar = jVar.f903g;
        d dVar = jVar.i;
        Set<int[]> a2 = Build.VERSION.SDK_INT >= 34 ? o.a() : A1.d.H();
        C0014l c0014l = new C0014l();
        c0014l.f542a = eVar;
        c0014l.f543b = gVar2;
        c0014l.f544c = dVar;
        if (!a2.isEmpty()) {
            for (int[] iArr : a2) {
                String str = new String(iArr, 0, iArr.length);
                c0014l.j(str, 0, str.length(), 1, true, new D.g(14, str));
            }
        }
        fVar.f891b = c0014l;
        j jVar2 = fVar.f890a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f898a.writeLock().lock();
        try {
            jVar2.f900c = 1;
            arrayList.addAll(jVar2.f899b);
            jVar2.f899b.clear();
            jVar2.f898a.writeLock().unlock();
            jVar2.d.post(new I.a(arrayList, jVar2.f900c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f898a.writeLock().unlock();
            throw th;
        }
    }
}
