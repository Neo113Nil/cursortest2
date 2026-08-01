package n1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements Iterable, i1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.c f3393a;

    public g(o1.c cVar) {
        this.f3393a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new o1.b(this.f3393a);
    }
}
