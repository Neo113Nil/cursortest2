package q5;

import java.util.Comparator;
import t5.l;
import t5.q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.room.c f7525a;

    public f(androidx.room.c cVar) {
        this.f7525a = cVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        o5.j.c((cVar.f7522d == null || cVar2.f7522d == null) ? false : true);
        return ((l) this.f7525a.f1070h).compare(new q(cVar.f7522d, cVar.f7520b.f8910f), new q(cVar2.f7522d, cVar2.f7520b.f8910f));
    }
}
