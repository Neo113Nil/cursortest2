package p1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Iterable, k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.c f3882a;

    public h(q1.c cVar) {
        this.f3882a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new q1.b(this.f3882a);
    }
}
