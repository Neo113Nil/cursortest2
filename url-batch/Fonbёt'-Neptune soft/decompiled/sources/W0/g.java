package W0;

import D0.P;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final X0.b f1118a;

    /* renamed from: b, reason: collision with root package name */
    public final P f1119b;

    public g(X0.b bVar, P p2) {
        this.f1118a = bVar;
        this.f1119b = p2;
    }

    @Override // W0.b
    public final Iterator iterator() {
        return new f(this);
    }
}
