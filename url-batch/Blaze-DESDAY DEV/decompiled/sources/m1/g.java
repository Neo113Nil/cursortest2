package m1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements Iterable, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1.c f3221a;

    public g(n1.c cVar) {
        this.f3221a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new n1.b(this.f3221a);
    }
}
