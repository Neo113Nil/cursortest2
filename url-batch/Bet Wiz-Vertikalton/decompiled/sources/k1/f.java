package k1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements Iterable, f1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1.c f2826a;

    public f(l1.c cVar) {
        this.f2826a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l1.b(this.f2826a);
    }
}
