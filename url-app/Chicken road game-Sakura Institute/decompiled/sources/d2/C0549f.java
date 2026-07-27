package d2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: d2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549f implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0546c f6075d;

    public C0549f(List list, Comparator comparator) {
        Map emptyMap = Collections.emptyMap();
        this.f6075d = list.size() < 25 ? C0545b.F(list, emptyMap, comparator) : Y0.b.h(list, emptyMap, comparator);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0549f) {
            return this.f6075d.equals(((C0549f) obj).f6075d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6075d.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0548e(this.f6075d.iterator(), 0);
    }

    public C0549f(AbstractC0546c abstractC0546c) {
        this.f6075d = abstractC0546c;
    }
}
