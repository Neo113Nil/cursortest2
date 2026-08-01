package T;

import K.C0011l;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f766e;

    public e(f fVar) {
        this.f766e = fVar;
    }

    @Override // u1.l
    public final void K(Throwable th) {
        this.f766e.f767a.d(th);
    }

    @Override // u1.l
    public final void P(u uVar) {
        f fVar = this.f766e;
        fVar.f769c = uVar;
        u uVar2 = fVar.f769c;
        j jVar = fVar.f767a;
        fVar.f768b = new C0011l(uVar2, jVar.f780g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : u1.d.I());
        j jVar2 = fVar.f767a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f775a.writeLock().lock();
        try {
            jVar2.f777c = 1;
            arrayList.addAll(jVar2.f776b);
            jVar2.f776b.clear();
            jVar2.f775a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f777c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f775a.writeLock().unlock();
            throw th;
        }
    }
}
