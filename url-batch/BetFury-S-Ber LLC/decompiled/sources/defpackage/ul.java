package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ul extends bi {
    public final /* synthetic */ vl o;

    public ul(vl vlVar) {
        this.o = vlVar;
    }

    @Override // defpackage.bi
    public final void L(Throwable th) {
        this.o.a.d(th);
    }

    @Override // defpackage.bi
    public final void Q(wi wiVar) {
        vl vlVar = this.o;
        vlVar.c = wiVar;
        wi wiVar2 = vlVar.c;
        zl zlVar = vlVar.a;
        vlVar.b = new s6(wiVar2, zlVar.g, zlVar.i, Build.VERSION.SDK_INT >= 34 ? fm.a() : mv.t());
        zl zlVar2 = vlVar.a;
        ArrayList arrayList = new ArrayList();
        zlVar2.a.writeLock().lock();
        try {
            zlVar2.c = 1;
            arrayList.addAll(zlVar2.b);
            zlVar2.b.clear();
            zlVar2.a.writeLock().unlock();
            zlVar2.d.post(new fa(arrayList, zlVar2.c, (Throwable) null));
        } catch (Throwable th) {
            zlVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
