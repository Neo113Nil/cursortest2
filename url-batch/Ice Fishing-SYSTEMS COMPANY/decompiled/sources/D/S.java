package D;

import h.AbstractActivityC4553l;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class S implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f518n = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final AbstractActivityC4553l f519u;

    public S(AbstractActivityC4553l abstractActivityC4553l) {
        this.f519u = abstractActivityC4553l;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f518n.iterator();
    }
}
