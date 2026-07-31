package m4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class b0<K0, V0> {

    class a extends d<K0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f19107a;

        a(Comparator comparator) {
            this.f19107a = comparator;
        }

        @Override // m4.b0.d
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f19107a);
        }
    }

    private static final class b<V> implements l4.o<List<V>>, Serializable {

        /* renamed from: f, reason: collision with root package name */
        private final int f19108f;

        b(int i7) {
            this.f19108f = h.b(i7, "expectedValuesPerKey");
        }

        @Override // l4.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f19108f);
        }
    }

    public static abstract class c<K0, V0> extends b0<K0, V0> {
        c() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> v<K, V> c();
    }

    public static abstract class d<K0> {

        class a extends c<K0, Object> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f19109a;

            a(int i7) {
                this.f19109a = i7;
            }

            @Override // m4.b0.c
            public <K extends K0, V> v<K, V> c() {
                return c0.b(d.this.c(), new b(this.f19109a));
            }
        }

        d() {
        }

        public c<K0, Object> a() {
            return b(2);
        }

        public c<K0, Object> b(int i7) {
            h.b(i7, "expectedValuesPerKey");
            return new a(i7);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    private b0() {
    }

    /* synthetic */ b0(a0 a0Var) {
        this();
    }

    public static d<Comparable> a() {
        return b(h0.b());
    }

    public static <K0> d<K0> b(Comparator<K0> comparator) {
        l4.j.i(comparator);
        return new a(comparator);
    }
}
