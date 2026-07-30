package androidx.collection;

import androidx.annotation.IntRange;
import f6.l;
import f6.p;
import f6.q;
import j6.m;
import j6.v;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class LongList {
    public int _size;
    public long[] content;

    public /* synthetic */ LongList(int i8, o oVar) {
        this(i8);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, int i9, Object obj) {
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
        return longList.joinToString(charSequence, charSequence5, charSequence6, i10, charSequence4);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(long j8) {
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (jArr[i9] == j8) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(LongList elements) {
        m until;
        s.checkNotNullParameter(elements, "elements");
        until = v.until(0, elements._size);
        int first = until.getFirst();
        int last = until.getLast();
        if (first > last) {
            return true;
        }
        while (contains(elements.get(first))) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final int count() {
        return this._size;
    }

    public final long elementAt(@IntRange(from = 0) int i8) {
        if (i8 >= 0 && i8 < this._size) {
            return this.content[i8];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i8);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final long elementAtOrElse(@IntRange(from = 0) int i8, l defaultValue) {
        s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 >= this._size) ? ((Number) defaultValue.invoke(Integer.valueOf(i8))).longValue() : this.content[i8];
    }

    public boolean equals(Object obj) {
        m until;
        if (obj instanceof LongList) {
            LongList longList = (LongList) obj;
            int i8 = longList._size;
            int i9 = this._size;
            if (i8 == i9) {
                long[] jArr = this.content;
                long[] jArr2 = longList.content;
                until = v.until(0, i9);
                int first = until.getFirst();
                int last = until.getLast();
                if (first > last) {
                    return true;
                }
                while (jArr[first] == jArr2[first]) {
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

    public final long first() {
        if (isEmpty()) {
            throw new NoSuchElementException("LongList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R r8, p operation) {
        s.checkNotNullParameter(operation, "operation");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            r8 = (R) operation.invoke(r8, Long.valueOf(jArr[i9]));
        }
        return r8;
    }

    public final <R> R foldIndexed(R r8, q operation) {
        s.checkNotNullParameter(operation, "operation");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, Long.valueOf(jArr[i9]));
        }
        return r8;
    }

    public final <R> R foldRight(R r8, p operation) {
        s.checkNotNullParameter(operation, "operation");
        long[] jArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return r8;
            }
            r8 = (R) operation.invoke(Long.valueOf(jArr[i8]), r8);
        }
    }

    public final <R> R foldRightIndexed(R r8, q operation) {
        s.checkNotNullParameter(operation, "operation");
        long[] jArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return r8;
            }
            r8 = (R) operation.invoke(Integer.valueOf(i8), Long.valueOf(jArr[i8]), r8);
        }
    }

    public final void forEach(l block) {
        s.checkNotNullParameter(block, "block");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            block.invoke(Long.valueOf(jArr[i9]));
        }
    }

    public final void forEachIndexed(p block) {
        s.checkNotNullParameter(block, "block");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            block.invoke(Integer.valueOf(i9), Long.valueOf(jArr[i9]));
        }
    }

    public final void forEachReversed(l block) {
        s.checkNotNullParameter(block, "block");
        long[] jArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return;
            } else {
                block.invoke(Long.valueOf(jArr[i8]));
            }
        }
    }

    public final void forEachReversedIndexed(p block) {
        s.checkNotNullParameter(block, "block");
        long[] jArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return;
            } else {
                block.invoke(Integer.valueOf(i8), Long.valueOf(jArr[i8]));
            }
        }
    }

    public final long get(@IntRange(from = 0) int i8) {
        if (i8 >= 0 && i8 < this._size) {
            return this.content[i8];
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
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += a.a(jArr[i10]) * 31;
        }
        return i9;
    }

    public final int indexOf(long j8) {
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (j8 == jArr[i9]) {
                return i9;
            }
        }
        return -1;
    }

    public final int indexOfFirst(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i9]))).booleanValue()) {
                return i9;
            }
        }
        return -1;
    }

    public final int indexOfLast(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 >= i8) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Long.valueOf(jArr[i8]))).booleanValue());
        return i8;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final long last() {
        if (isEmpty()) {
            throw new NoSuchElementException("LongList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(long j8) {
        long[] jArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 >= i8) {
                return -1;
            }
        } while (jArr[i8] != j8);
        return i8;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.content;
        for (int i8 = this._size - 1; -1 < i8; i8--) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i8]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private LongList(int i8) {
        this.content = i8 == 0 ? LongSetKt.getEmptyLongArray() : new long[i8];
    }

    public static /* synthetic */ String joinToString$default(LongList longList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, l transform, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i9 & 1) != 0) {
            separator = ", ";
        }
        if ((i9 & 2) != 0) {
            prefix = "";
        }
        if ((i9 & 4) != 0) {
            postfix = "";
        }
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        if ((i9 & 16) != 0) {
            truncated = "...";
        }
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        s.checkNotNullParameter(postfix, "postfix");
        s.checkNotNullParameter(truncated, "truncated");
        s.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = longList.content;
        int i10 = longList._size;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb.append(postfix);
                break;
            }
            long j8 = jArr[i11];
            if (i11 == i8) {
                sb.append(truncated);
                break;
            }
            if (i11 != 0) {
                sb.append(separator);
            }
            sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
            i11++;
        }
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final boolean any(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i9]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i10]))).booleanValue()) {
                i9++;
            }
        }
        return i9;
    }

    public final String joinToString(CharSequence separator) {
        s.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final long first(l predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            long j8 = jArr[i9];
            if (((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue()) {
                return j8;
            }
        }
        throw new NoSuchElementException("LongList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        s.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public final long last(l predicate) {
        long j8;
        s.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 < i8) {
                j8 = jArr[i8];
            } else {
                throw new NoSuchElementException("LongList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Long.valueOf(j8))).booleanValue());
        return j8;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        s.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i8, null, 16, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        s.checkNotNullParameter(postfix, "postfix");
        s.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                long j8 = jArr[i10];
                if (i10 == i8) {
                    sb.append(truncated);
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append(j8);
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, l transform) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        s.checkNotNullParameter(postfix, "postfix");
        s.checkNotNullParameter(truncated, "truncated");
        s.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                long j8 = jArr[i10];
                if (i10 == i8) {
                    sb.append(truncated);
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, l transform) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        s.checkNotNullParameter(postfix, "postfix");
        s.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                long j8 = jArr[i10];
                if (i10 == i8) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, l transform) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        s.checkNotNullParameter(postfix, "postfix");
        s.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                long j8 = jArr[i9];
                if (i9 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
                i9++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, l transform) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(prefix, "prefix");
        s.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                long j8 = jArr[i9];
                if (i9 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
                i9++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, l transform) {
        s.checkNotNullParameter(separator, "separator");
        s.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                long j8 = jArr[i9];
                if (i9 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
                i9++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(l transform) {
        s.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                long j8 = jArr[i9];
                if (i9 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) transform.invoke(Long.valueOf(j8)));
                i9++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
