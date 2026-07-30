package androidx.collection;

import androidx.annotation.IntRange;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = mutableIntList._size;
        }
        mutableIntList.trim(i8);
    }

    public final boolean add(int i8) {
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i9 = this._size;
        iArr[i9] = i8;
        this._size = i9 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i8, int[] elements) {
        int i9;
        s.checkNotNullParameter(elements, "elements");
        if (i8 < 0 || i8 > (i9 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(i9 + elements.length);
        int[] iArr = this.content;
        int i10 = this._size;
        if (i8 != i10) {
            k.copyInto(iArr, iArr, elements.length + i8, i8, i10);
        }
        k.copyInto$default(elements, iArr, i8, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i8) {
        int[] iArr = this.content;
        if (iArr.length < i8) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i8, (iArr.length * 3) / 2));
            s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(int i8) {
        remove(i8);
    }

    public final void plusAssign(IntList elements) {
        s.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(int i8) {
        int indexOf = indexOf(i8);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(int[] elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        for (int i9 : elements) {
            remove(i9);
        }
        return i8 != this._size;
    }

    public final int removeAt(@IntRange(from = 0) int i8) {
        int i9;
        if (i8 < 0 || i8 >= (i9 = this._size)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index ");
            sb.append(i8);
            sb.append(" must be in 0..");
            sb.append(this._size - 1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int[] iArr = this.content;
        int i10 = iArr[i8];
        if (i8 != i9 - 1) {
            k.copyInto(iArr, iArr, i8, i8 + 1, i9);
        }
        this._size--;
        return i10;
    }

    public final void removeRange(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9) {
        int i10;
        if (i8 < 0 || i8 > (i10 = this._size) || i9 < 0 || i9 > i10) {
            throw new IndexOutOfBoundsException("Start (" + i8 + ") and end (" + i9 + ") must be in 0.." + this._size);
        }
        if (i9 >= i8) {
            if (i9 != i8) {
                if (i9 < i10) {
                    int[] iArr = this.content;
                    k.copyInto(iArr, iArr, i8, i9, i10);
                }
                this._size -= i9 - i8;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Start (" + i8 + ") is more than end (" + i9 + ')');
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        removeAt(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(int[] elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        int[] iArr = this.content;
        int i9 = i8 - 1;
        while (true) {
            int i10 = 0;
            if (-1 >= i9) {
                break;
            }
            int i11 = iArr[i9];
            int length = elements.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (elements[i10] != i11) {
                    i10++;
                } else if (i10 >= 0) {
                }
            }
            i9--;
        }
        return i8 != this._size;
    }

    public final int set(@IntRange(from = 0) int i8, int i9) {
        if (i8 >= 0 && i8 < this._size) {
            int[] iArr = this.content;
            int i10 = iArr[i8];
            iArr[i8] = i9;
            return i10;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i8);
        sb.append(" must be between 0 .. ");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void sort() {
        k.sort(this.content, 0, this._size);
    }

    public final void sortDescending() {
        ArraysKt___ArraysKt.sortDescending(this.content, 0, this._size);
    }

    public final void trim(int i8) {
        int max = Math.max(i8, this._size);
        int[] iArr = this.content;
        if (iArr.length > max) {
            int[] copyOf = Arrays.copyOf(iArr, max);
            s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public /* synthetic */ MutableIntList(int i8, int i9, o oVar) {
        this((i9 & 1) != 0 ? 16 : i8);
    }

    public final void minusAssign(int[] elements) {
        s.checkNotNullParameter(elements, "elements");
        for (int i8 : elements) {
            remove(i8);
        }
    }

    public final void plusAssign(int[] elements) {
        s.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableIntList(int i8) {
        super(i8, null);
    }

    public final void add(@IntRange(from = 0) int i8, int i9) {
        int i10;
        if (i8 >= 0 && i8 <= (i10 = this._size)) {
            ensureCapacity(i10 + 1);
            int[] iArr = this.content;
            int i11 = this._size;
            if (i8 != i11) {
                k.copyInto(iArr, iArr, i8 + 1, i8, i11);
            }
            iArr[i8] = i9;
            this._size++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final void plusAssign(int i8) {
        add(i8);
    }

    public final boolean removeAll(IntList elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        int i9 = elements._size - 1;
        if (i9 >= 0) {
            int i10 = 0;
            while (true) {
                remove(elements.get(i10));
                if (i10 == i9) {
                    break;
                }
                i10++;
            }
        }
        return i8 != this._size;
    }

    public final void minusAssign(IntList elements) {
        s.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.content;
        int i8 = elements._size;
        for (int i9 = 0; i9 < i8; i9++) {
            remove(iArr[i9]);
        }
    }

    public final boolean retainAll(IntList elements) {
        s.checkNotNullParameter(elements, "elements");
        int i8 = this._size;
        int[] iArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            if (!elements.contains(iArr[i9])) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i8, IntList elements) {
        s.checkNotNullParameter(elements, "elements");
        if (i8 >= 0 && i8 <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            int[] iArr = this.content;
            int i9 = this._size;
            if (i8 != i9) {
                k.copyInto(iArr, iArr, elements._size + i8, i8, i9);
            }
            k.copyInto(elements.content, iArr, i8, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final boolean addAll(IntList elements) {
        s.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(int[] elements) {
        s.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }
}
