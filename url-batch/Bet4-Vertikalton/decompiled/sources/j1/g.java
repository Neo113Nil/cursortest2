package j1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements Iterable, e1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1.c f2607a;

    public g(k1.c cVar) {
        this.f2607a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new k1.b(this.f2607a);
    }
}
