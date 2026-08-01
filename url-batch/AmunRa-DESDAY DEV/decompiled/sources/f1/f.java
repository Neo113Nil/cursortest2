package f1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements Iterable, a1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.c f2259a;

    public f(g1.c cVar) {
        this.f2259a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g1.b(this.f2259a);
    }
}
