package p1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final q1.c f3885a;

    /* renamed from: b, reason: collision with root package name */
    public final X0.a f3886b;

    public j(q1.c cVar, X0.a aVar) {
        this.f3885a = cVar;
        this.f3886b = aVar;
    }

    @Override // p1.d
    public final Iterator iterator() {
        return new i(this);
    }
}
