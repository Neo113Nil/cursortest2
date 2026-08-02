package r2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements Iterable, m2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s2.c f10279a;

    public i(s2.c cVar) {
        this.f10279a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s2.b(this.f10279a);
    }
}
