package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class ArrayMapImpl<T> extends ArrayMap<T> {
    public static final Companion Companion = new Companion(null);
    public Object[] data;
    public int size;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ArrayMapImpl() {
        super(null);
        this.data = new Object[20];
        this.size = 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i) {
        return (T) ArraysKt___ArraysKt.getOrNull(i, this.data);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator<T> iterator() {
        return new AbstractIterator() { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl$iterator$1
            public int index = -1;

            @Override // kotlin.collections.AbstractIterator
            public final void computeNext() {
                ArrayMapImpl arrayMapImpl;
                Object[] objArr;
                Object[] objArr2;
                Object[] objArr3;
                Object[] objArr4;
                do {
                    int i = this.index + 1;
                    this.index = i;
                    arrayMapImpl = ArrayMapImpl.this;
                    objArr = arrayMapImpl.data;
                    if (i >= objArr.length) {
                        break;
                    } else {
                        objArr4 = arrayMapImpl.data;
                    }
                } while (objArr4[this.index] == null);
                int i2 = this.index;
                objArr2 = arrayMapImpl.data;
                if (i2 >= objArr2.length) {
                    this.state = 2;
                    return;
                }
                objArr3 = arrayMapImpl.data;
                Object obj = objArr3[this.index];
                obj.getClass();
                this.nextValue = obj;
                this.state = 1;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i, T t) {
        t.getClass();
        Object[] objArr = this.data;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            this.data = Arrays.copyOf(this.data, length);
        }
        if (this.data[i] == null) {
            this.size = getSize() + 1;
        }
        this.data[i] = t;
    }
}
