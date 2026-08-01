package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends a.y {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f321n;

    public e(f fVar) {
        this.f321n = fVar;
    }

    @Override // a.y
    public final void L(Throwable th) {
        this.f321n.f322a.d(th);
    }

    @Override // a.y
    public final void O(a0.j jVar) {
        f fVar = this.f321n;
        fVar.f324c = jVar;
        a0.j jVar2 = fVar.f324c;
        l lVar = fVar.f322a;
        fVar.f323b = new t(jVar2, lVar.f338g, lVar.i, Build.VERSION.SDK_INT >= 34 ? p.a() : a.y.D());
        l lVar2 = fVar.f322a;
        lVar2.getClass();
        ArrayList arrayList = new ArrayList();
        lVar2.f333a.writeLock().lock();
        try {
            lVar2.f335c = 1;
            arrayList.addAll(lVar2.f334b);
            lVar2.f334b.clear();
            lVar2.f333a.writeLock().unlock();
            lVar2.d.post(new j(arrayList, lVar2.f335c, (Throwable) null));
        } catch (Throwable th) {
            lVar2.f333a.writeLock().unlock();
            throw th;
        }
    }
}
