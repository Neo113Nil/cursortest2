package o2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i<E> implements Iterable<E> {

    /* renamed from: f, reason: collision with root package name */
    private final Object f19727f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Map<E, Integer> f19728g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private Set<E> f19729h = Collections.emptySet();

    /* renamed from: i, reason: collision with root package name */
    private List<E> f19730i = Collections.emptyList();

    public Set<E> g() {
        Set<E> set;
        synchronized (this.f19727f) {
            set = this.f19729h;
        }
        return set;
    }

    public void i(E e7) {
        synchronized (this.f19727f) {
            ArrayList arrayList = new ArrayList(this.f19730i);
            arrayList.add(e7);
            this.f19730i = Collections.unmodifiableList(arrayList);
            Integer num = this.f19728g.get(e7);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f19729h);
                hashSet.add(e7);
                this.f19729h = Collections.unmodifiableSet(hashSet);
            }
            this.f19728g.put(e7, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f19727f) {
            it = this.f19730i.iterator();
        }
        return it;
    }

    public int j(E e7) {
        int intValue;
        synchronized (this.f19727f) {
            intValue = this.f19728g.containsKey(e7) ? this.f19728g.get(e7).intValue() : 0;
        }
        return intValue;
    }

    public void k(E e7) {
        synchronized (this.f19727f) {
            Integer num = this.f19728g.get(e7);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f19730i);
            arrayList.remove(e7);
            this.f19730i = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f19728g.remove(e7);
                HashSet hashSet = new HashSet(this.f19729h);
                hashSet.remove(e7);
                this.f19729h = Collections.unmodifiableSet(hashSet);
            } else {
                this.f19728g.put(e7, Integer.valueOf(num.intValue() - 1));
            }
        }
    }
}
