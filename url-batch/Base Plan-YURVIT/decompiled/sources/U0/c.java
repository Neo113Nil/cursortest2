package U0;

import O0.l;
import P0.i;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f861a;

    /* renamed from: b, reason: collision with root package name */
    public final i f862b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(d dVar, l lVar) {
        this.f861a = dVar;
        this.f862b = (i) lVar;
    }

    @Override // U0.d
    public final Iterator iterator() {
        return new b(this);
    }
}
