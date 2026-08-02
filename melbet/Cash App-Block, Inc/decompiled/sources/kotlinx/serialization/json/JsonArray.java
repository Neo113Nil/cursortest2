package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonArraySerializer.class)
/* loaded from: classes4.dex */
public final class JsonArray extends JsonElement implements List<JsonElement>, KMappedMarker {
    public static final Companion Companion = new Companion();
    public final List content;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlinx/serialization/json/JsonArray$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return JsonArraySerializer.INSTANCE;
        }
    }

    public JsonArray(List list) {
        list.getClass();
        this.content = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return this.content.contains((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.content.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return Intrinsics.areEqual(this.content, obj);
    }

    @Override // java.util.List
    public final JsonElement get(int i) {
        return (JsonElement) this.content.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return this.content.indexOf((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.content.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return this.content.lastIndexOf((JsonElement) obj);
    }

    @Override // java.util.List
    public final ListIterator<JsonElement> listIterator() {
        return this.content.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ JsonElement remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ JsonElement set(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.content.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<JsonElement> subList(int i, int i2) {
        return this.content.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ArrayIteratorKt.toArray(this, objArr);
    }

    public final String toString() {
        return CollectionsKt.joinToString$default(this.content, ",", "[", "]", 0, null, null, 56);
    }

    @Override // java.util.List
    public final ListIterator<JsonElement> listIterator(int i) {
        return this.content.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ArrayIteratorKt.toArray(this);
    }
}
