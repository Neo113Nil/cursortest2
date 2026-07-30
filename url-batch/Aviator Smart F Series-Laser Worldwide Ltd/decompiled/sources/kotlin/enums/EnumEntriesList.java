package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.b;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
final class EnumEntriesList<T extends Enum<T>> extends b implements a6.a, Serializable {
    private final T[] entries;

    public EnumEntriesList(T[] entries) {
        s.checkNotNullParameter(entries, "entries");
        this.entries = entries;
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.entries);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((EnumEntriesList<T>) obj);
        }
        return false;
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.entries.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((EnumEntriesList<T>) obj);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((EnumEntriesList<T>) obj);
        }
        return -1;
    }

    public boolean contains(T element) {
        s.checkNotNullParameter(element, "element");
        return ((Enum) ArraysKt___ArraysKt.getOrNull(this.entries, element.ordinal())) == element;
    }

    @Override // kotlin.collections.b, java.util.List
    public T get(int i8) {
        b.Companion.checkElementIndex$kotlin_stdlib(i8, this.entries.length);
        return this.entries[i8];
    }

    public int indexOf(T element) {
        s.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) ArraysKt___ArraysKt.getOrNull(this.entries, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    public int lastIndexOf(T element) {
        s.checkNotNullParameter(element, "element");
        return indexOf((Object) element);
    }
}
