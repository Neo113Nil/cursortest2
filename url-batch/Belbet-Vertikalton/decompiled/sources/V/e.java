package V;

import a.AbstractC0058a;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends AbstractC0058a {
    public final /* synthetic */ f e;

    public e(f fVar) {
        this.e = fVar;
    }

    @Override // a.AbstractC0058a
    public final void O(Throwable th) {
        this.e.f1268a.d(th);
    }

    @Override // a.AbstractC0058a
    public final void P(v vVar) {
        f fVar = this.e;
        fVar.f1270c = vVar;
        v vVar2 = fVar.f1270c;
        j jVar = fVar.f1268a;
        fVar.f1269b = new I0.h(vVar2, jVar.f1280g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : H1.d.H());
        j jVar2 = fVar.f1268a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f1275a.writeLock().lock();
        try {
            jVar2.f1277c = 1;
            arrayList.addAll(jVar2.f1276b);
            jVar2.f1276b.clear();
            jVar2.f1275a.writeLock().unlock();
            jVar2.f1278d.post(new J.a(arrayList, jVar2.f1277c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f1275a.writeLock().unlock();
            throw th;
        }
    }
}
