package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.primitives.ImmutableLongArray;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;
import okhttp3.HttpUrl;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLongArray longs;

    public AtomicDoubleArray(int i8) {
        this.longs = new AtomicLongArray(i8);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        ImmutableLongArray.Builder builder = ImmutableLongArray.builder();
        for (int i8 = 0; i8 < readInt; i8++) {
            builder.add(Double.doubleToRawLongBits(objectInputStream.readDouble()));
        }
        this.longs = new AtomicLongArray(builder.build().toArray());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        int length = length();
        objectOutputStream.writeInt(length);
        for (int i8 = 0; i8 < length; i8++) {
            objectOutputStream.writeDouble(get(i8));
        }
    }

    @CanIgnoreReturnValue
    public double addAndGet(int i8, double d8) {
        long j8;
        double longBitsToDouble;
        do {
            j8 = this.longs.get(i8);
            longBitsToDouble = Double.longBitsToDouble(j8) + d8;
        } while (!this.longs.compareAndSet(i8, j8, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public final boolean compareAndSet(int i8, double d8, double d9) {
        return this.longs.compareAndSet(i8, Double.doubleToRawLongBits(d8), Double.doubleToRawLongBits(d9));
    }

    public final double get(int i8) {
        return Double.longBitsToDouble(this.longs.get(i8));
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(int i8, double d8) {
        long j8;
        double longBitsToDouble;
        do {
            j8 = this.longs.get(i8);
            longBitsToDouble = Double.longBitsToDouble(j8);
        } while (!this.longs.compareAndSet(i8, j8, Double.doubleToRawLongBits(longBitsToDouble + d8)));
        return longBitsToDouble;
    }

    public final double getAndSet(int i8, double d8) {
        return Double.longBitsToDouble(this.longs.getAndSet(i8, Double.doubleToRawLongBits(d8)));
    }

    public final void lazySet(int i8, double d8) {
        this.longs.lazySet(i8, Double.doubleToRawLongBits(d8));
    }

    public final int length() {
        return this.longs.length();
    }

    public final void set(int i8, double d8) {
        this.longs.set(i8, Double.doubleToRawLongBits(d8));
    }

    public String toString() {
        int length = length();
        int i8 = length - 1;
        if (i8 == -1) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(length * 19);
        sb.append('[');
        int i9 = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.longs.get(i9)));
            if (i9 == i8) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
            i9++;
        }
    }

    public final boolean weakCompareAndSet(int i8, double d8, double d9) {
        return this.longs.weakCompareAndSet(i8, Double.doubleToRawLongBits(d8), Double.doubleToRawLongBits(d9));
    }

    public AtomicDoubleArray(double[] dArr) {
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i8 = 0; i8 < length; i8++) {
            jArr[i8] = Double.doubleToRawLongBits(dArr[i8]);
        }
        this.longs = new AtomicLongArray(jArr);
    }
}
