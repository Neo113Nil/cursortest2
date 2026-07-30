package androidx.collection;

import androidx.annotation.IntRange;
import f6.l;
import f6.p;
import f6.q;
import j6.m;
import j6.v;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    public /* synthetic */ ObjectList(int i8, o oVar) {
        this(i8);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, l lVar, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        int i10 = (i9 & 8) != 0 ? -1 : i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return objectList.joinToString(charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public abstract List<E> asList();

    public final boolean contains(E e8) {
        return indexOf(e8) >= 0;
    }

    public final boolean containsAll(E[] elements) {
        s.checkNotNullParameter(elements, "elements");
        for (E e8 : elements) {
            if (!contains(e8)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final E elementAt(@IntRange(from = 0) int i8) {
        if (i8 >= 0 && i8 < this._size) {
            return (E) this.content[i8];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i8);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final E elementAtOrElse(@IntRange(from = 0) int i8, l defaultValue) {
        s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 >= this._size) ? (E) defaultValue.invoke(Integer.valueOf(i8)) : (E) this.content[i8];
    }

    public boolean equals(Object obj) {
        m until;
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i8 = objectList._size;
            int i9 = this._size;
            if (i8 == i9) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                until = v.until(0, i9);
                int first = until.getFirst();
                int last = until.getLast();
                if (first > last) {
                    return true;
                }
                while (s.areEqual(objArr[first], objArr2[first])) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R r8, p operation) {
        s.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            r8 = (R) operation.invoke(r8, objArr[i9]);
        }
        return r8;
    }

    public final <R> R foldIndexed(R r8, q operation) {
        s.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, objArr[i9]);
        }
        return r8;
    }

    public final <R> R foldRight(R r8, p operation) {
        s.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return r8;
            }
            r8 = (R) operation.invoke(objArr[i8], r8);
        }
    }

    public final <R> R foldRightIndexed(R r8, q operation) {
        s.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return r8;
            }
            r8 = (R) operation.invoke(Integer.valueOf(i8), objArr[i8], r8);
        }
    }

    public final void forEach(l block) {
        s.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            block.invoke(objArr[i9]);
        }
    }

    public final void forEachIndexed(p block) {
        s.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            block.invoke(Integer.valueOf(i9), objArr[i9]);
        }
    }

    public final void forEachReversed(l block) {
        s.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return;
            } else {
                block.invoke(objArr[i8]);
            }
        }
    }

    public final void forEachReversedIndexed(p block) {
        s.checkNotNullParameter(block, "block");
        Object[] objArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return;
            } else {
                block.invoke(Integer.valueOf(i8), objArr[i8]);
            }
        }
    }

    public final E get(@IntRange(from = 0) int i8) {
        if (i8 >= 0 && i8 < this._size) {
            return (E) this.content[i8];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i8);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final m getIndices() {
        m until;
        until = v.until(0, this._size);
        return until;
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            i9 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i9;
    }

    public final int indexOf(E e8) {
        int i8 = 0;
        if (e8 == null) {
            Object[] objArr = this.content;
            int i9 = this._size;
            while (i8 < i9) {
                if (objArr[i8] == null) {
                    return i8;
                }
                i8++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i10 = this._size;
        while (i8 < i10) {
            if (e8.equals(objArr2[i8])) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public final int indexOfFirst(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (((Boolean) predicate.invoke(objArr[i9])).booleanValue()) {
                return i9;
            }
        }
        return -1;
    }

    public final int indexOfLast(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 >= i8) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(objArr[i8])).booleanValue());
        return i8;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final int lastIndexOf(E e8) {
        if (e8 == null) {
            Object[] objArr = this.content;
            for (int i8 = this._size - 1; -1 < i8; i8--) {
                if (objArr[i8] == null) {
                    return i8;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i9 = this._size - 1; -1 < i9; i9--) {
                if (e8.equals(objArr2[i9])) {
                    return i9;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i8 = this._size - 1; -1 < i8; i8--) {
            if (((Boolean) predicate.invoke(objArr[i8])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new l(this) { // from class: androidx.collection.ObjectList$toString$1
            final /* synthetic */ ObjectList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ObjectList$toString$1) obj);
            }

            @Override // f6.l
            public final CharSequence invoke(E e8) {
                return e8 == this.this$0 ? "(this)" : String.valueOf(e8);
            }
        }, 25, null);
    }

    private ObjectList(int i8) {
        this.content = i8 == 0 ? ObjectListKt.EmptyArray : new Object[i8];
    }

    public final boolean any(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (((Boolean) predicate.invoke(objArr[i9])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if (((Boolean) predicate.invoke(objArr[i10])).booleanValue()) {
                i9++;
            }
        }
        return i9;
    }

    public final E firstOrNull(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            E e8 = (E) objArr[i9];
            if (((Boolean) predicate.invoke(e8)).booleanValue()) {
                return e8;
            }
        }
        return null;
    }

    public final String joinToString(CharSequence separator) {
        s.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(List<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!contains(elements.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final E lastOrNull(l predicate) {
        E e8;
        s.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 >= i8) {
                return null;
            }
            e8 = (E) objArr[i8];
        } while (!((Boolean) predicate.invoke(e8)).booleanValue());
        return e8;
    }

    public final E first(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            E e8 = (E) objArr[i9];
            if (((Boolean) predicate.invoke(e8)).booleanValue()) {
                return e8;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        s.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final E last(l predicate) {
        E e8;
        s.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 < i8) {
                e8 = (E) objArr[i8];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(e8)).booleanValue());
        return e8;
    }

    public final boolean containsAll(Iterable<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        s.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i8, null, null, 48, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        s.checkNotNullParameter(postfix, "postfix");
        s.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i8, truncated, null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> elements) {
        s.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.content;
        int i8 = elements._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (!contains(objArr[i9])) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, l lVar) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        s.checkNotNullParameter(postfix, "postfix");
        s.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                Object obj = objArr[i10];
                if (i10 == i8) {
                    sb.append(truncated);
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                if (lVar == null) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) lVar.invoke(obj));
                }
                i10++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
