package T;

import K.C0011l;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends s1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f756a;

    public e(f fVar) {
        this.f756a = fVar;
    }

    @Override // s1.d
    public final void T(Throwable th) {
        this.f756a.f757a.d(th);
    }

    @Override // s1.d
    public final void U(u uVar) {
        f fVar = this.f756a;
        fVar.f759c = uVar;
        u uVar2 = fVar.f759c;
        j jVar = fVar.f757a;
        fVar.f758b = new C0011l(uVar2, jVar.f770g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : s1.l.A());
        j jVar2 = fVar.f757a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f765a.writeLock().lock();
        try {
            jVar2.f767c = 1;
            arrayList.addAll(jVar2.f766b);
            jVar2.f766b.clear();
            jVar2.f765a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f767c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f765a.writeLock().unlock();
            throw th;
        }
    }
}
