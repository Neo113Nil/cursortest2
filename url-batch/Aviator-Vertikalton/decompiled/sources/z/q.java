package z;

import g.AbstractActivityC0158k;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4633a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0158k f4634b;

    public q(AbstractActivityC0158k abstractActivityC0158k) {
        this.f4634b = abstractActivityC0158k;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f4633a.iterator();
    }
}
