package h1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements Iterable, c1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1.c f2455a;

    public f(i1.c cVar) {
        this.f2455a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i1.b(this.f2455a);
    }
}
