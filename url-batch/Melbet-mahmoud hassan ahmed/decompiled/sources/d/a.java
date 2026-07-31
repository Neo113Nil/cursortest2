package d;

import d.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: j, reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f15433j = new HashMap<>();

    public boolean contains(K k7) {
        return this.f15433j.containsKey(k7);
    }

    @Override // d.b
    protected b.c<K, V> j(K k7) {
        return this.f15433j.get(k7);
    }

    @Override // d.b
    public V n(K k7, V v6) {
        b.c<K, V> j7 = j(k7);
        if (j7 != null) {
            return j7.f15439g;
        }
        this.f15433j.put(k7, m(k7, v6));
        return null;
    }

    @Override // d.b
    public V o(K k7) {
        V v6 = (V) super.o(k7);
        this.f15433j.remove(k7);
        return v6;
    }

    public Map.Entry<K, V> p(K k7) {
        if (contains(k7)) {
            return this.f15433j.get(k7).f15441i;
        }
        return null;
    }
}
