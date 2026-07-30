package y;

import i.AbstractActivityC0525l;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8523d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final AbstractActivityC0525l f8524e;

    public x(AbstractActivityC0525l abstractActivityC0525l) {
        this.f8524e = abstractActivityC0525l;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f8523d.iterator();
    }
}
