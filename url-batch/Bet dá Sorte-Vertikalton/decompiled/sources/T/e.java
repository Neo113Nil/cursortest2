package T;

import K.C0011l;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f781e;

    public e(f fVar) {
        this.f781e = fVar;
    }

    @Override // u1.l
    public final void U(Throwable th) {
        this.f781e.f782a.d(th);
    }

    @Override // u1.l
    public final void Z(u uVar) {
        f fVar = this.f781e;
        fVar.f784c = uVar;
        u uVar2 = fVar.f784c;
        j jVar = fVar.f782a;
        fVar.f783b = new C0011l(uVar2, jVar.f795g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : u1.d.F());
        j jVar2 = fVar.f782a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f790a.writeLock().lock();
        try {
            jVar2.f792c = 1;
            arrayList.addAll(jVar2.f791b);
            jVar2.f791b.clear();
            jVar2.f790a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f792c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f790a.writeLock().unlock();
            throw th;
        }
    }
}
