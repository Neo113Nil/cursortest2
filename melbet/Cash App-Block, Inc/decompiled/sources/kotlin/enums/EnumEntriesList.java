package kotlin.enums;

import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes.dex */
public final class EnumEntriesList extends AbstractList implements EnumEntries, RandomAccess, Serializable {
    public final Enum[] entries;

    public EnumEntriesList(Enum[] enumArr) {
        enumArr.getClass();
        this.entries = enumArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) ArraysKt___ArraysKt.getOrNull(r3.ordinal(), this.entries)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractList.Companion companion = AbstractList.Companion;
        Enum[] enumArr = this.entries;
        int length = enumArr.length;
        companion.getClass();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, length);
        return enumArr[i];
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.entries.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) ArraysKt___ArraysKt.getOrNull(ordinal, this.entries)) == r3) {
            return ordinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) ArraysKt___ArraysKt.getOrNull(ordinal, this.entries)) == r3) {
            return ordinal;
        }
        return -1;
    }
}
