package m4;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class c0 {

    private static class a<K, V> extends c<K, V> {

        /* renamed from: k, reason: collision with root package name */
        transient l4.o<? extends List<V>> f19111k;

        a(Map<K, Collection<V>> map, l4.o<? extends List<V>> oVar) {
            super(map);
            this.f19111k = (l4.o) l4.j.i(oVar);
        }

        @Override // m4.f
        Map<K, Collection<V>> c() {
            return q();
        }

        @Override // m4.f
        Set<K> d() {
            return r();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m4.d
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public List<V> o() {
            return this.f19111k.get();
        }
    }

    static boolean a(z<?, ?> zVar, Object obj) {
        if (obj == zVar) {
            return true;
        }
        if (obj instanceof z) {
            return zVar.a().equals(((z) obj).a());
        }
        return false;
    }

    public static <K, V> v<K, V> b(Map<K, Collection<V>> map, l4.o<? extends List<V>> oVar) {
        return new a(map, oVar);
    }
}
