package z;

import g.AbstractActivityC0159k;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4637a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0159k f4638b;

    public q(AbstractActivityC0159k abstractActivityC0159k) {
        this.f4638b = abstractActivityC0159k;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f4637a.iterator();
    }
}
