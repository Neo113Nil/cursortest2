package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class her implements Map, Serializable, j$.util.Map {
    public static final Map.Entry[] a = new Map.Entry[0];
    private static final long serialVersionUID = 912559;
    private transient hfm b;
    private transient hfm c;
    private transient heb d;

    public static hen h(int i) {
        hnu.ap(i, "expectedSize");
        return new hen(i);
    }

    public static her i(Map map) {
        if ((map instanceof her) && !(map instanceof SortedMap)) {
            her herVar = (her) map;
            if (!herVar.e()) {
                return herVar;
            }
        }
        Set entrySet = map.entrySet();
        hen henVar = new hen(entrySet instanceof Collection ? entrySet.size() : 4);
        henVar.f(entrySet);
        return henVar.d(true);
    }

    public static her j(Object obj, Object obj2) {
        hnu.ao(obj, obj2);
        return hix.a(1, new Object[]{obj, obj2}, null);
    }

    public static her m(Object obj, Object obj2, Object obj3, Object obj4) {
        hnu.ao("fsi", obj);
        hnu.ao("ftz", obj2);
        hnu.ao("gbn", obj3);
        hnu.ao("ger", obj4);
        return hix.a(4, new Object[]{"fsi", obj, "ftz", obj2, "gbn", obj3, "ger", obj4}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract heb b();

    public hjr bL() {
        throw null;
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public heb values() {
        heb hebVar = this.d;
        if (hebVar != null) {
            return hebVar;
        }
        heb b = b();
        this.d = b;
        return b;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract boolean e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return hnu.B(this, obj);
    }

    public abstract hfm f();

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public abstract hfm g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return hnu.h(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final hfm entrySet() {
        hfm hfmVar = this.b;
        if (hfmVar != null) {
            return hfmVar;
        }
        hfm f = f();
        this.b = f;
        return f;
    }

    @Override // java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public hfm keySet() {
        hfm hfmVar = this.c;
        if (hfmVar != null) {
            return hfmVar;
        }
        hfm g = g();
        this.c = g;
        return g;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int size = size();
        hnu.ap(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public Object writeReplace() {
        return new heq(this);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }
}
