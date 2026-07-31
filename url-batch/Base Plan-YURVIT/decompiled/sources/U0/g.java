package U0;

import E0.m;
import P0.h;
import android.content.pm.ResolveInfo;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f863e;

    public g(m mVar) {
        this.f863e = ((List) ((m) mVar.f217b).f217b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f863e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ResolveInfo resolveInfo = (ResolveInfo) this.f863e.next();
        h.e(resolveInfo, "it");
        return resolveInfo.activityInfo.packageName;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
