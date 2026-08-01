package T;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends q1.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f781g;

    public e(f fVar) {
        this.f781g = fVar;
    }

    @Override // q1.l
    public final void P(Throwable th) {
        this.f781g.f782a.d(th);
    }

    @Override // q1.l
    public final void U(v vVar) {
        f fVar = this.f781g;
        fVar.f784c = vVar;
        v vVar2 = fVar.f784c;
        j jVar = fVar.f782a;
        fVar.f783b = new r(vVar2, jVar.f796g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : q1.d.B());
        j jVar2 = fVar.f782a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f790a.writeLock().lock();
        try {
            jVar2.f792c = 1;
            arrayList.addAll(jVar2.f791b);
            jVar2.f791b.clear();
            jVar2.f790a.writeLock().unlock();
            jVar2.f793d.post(new H.b(arrayList, jVar2.f792c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f790a.writeLock().unlock();
            throw th;
        }
    }
}
