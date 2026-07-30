package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLong value;

    public AtomicDouble(double d8) {
        this.value = new AtomicLong(Double.doubleToRawLongBits(d8));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.value = new AtomicLong();
        set(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(get());
    }

    @CanIgnoreReturnValue
    public final double addAndGet(double d8) {
        long j8;
        double longBitsToDouble;
        do {
            j8 = this.value.get();
            longBitsToDouble = Double.longBitsToDouble(j8) + d8;
        } while (!this.value.compareAndSet(j8, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public final boolean compareAndSet(double d8, double d9) {
        return this.value.compareAndSet(Double.doubleToRawLongBits(d8), Double.doubleToRawLongBits(d9));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return get();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) get();
    }

    public final double get() {
        return Double.longBitsToDouble(this.value.get());
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(double d8) {
        long j8;
        double longBitsToDouble;
        do {
            j8 = this.value.get();
            longBitsToDouble = Double.longBitsToDouble(j8);
        } while (!this.value.compareAndSet(j8, Double.doubleToRawLongBits(longBitsToDouble + d8)));
        return longBitsToDouble;
    }

    public final double getAndSet(double d8) {
        return Double.longBitsToDouble(this.value.getAndSet(Double.doubleToRawLongBits(d8)));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) get();
    }

    public final void lazySet(double d8) {
        this.value.lazySet(Double.doubleToRawLongBits(d8));
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) get();
    }

    public final void set(double d8) {
        this.value.set(Double.doubleToRawLongBits(d8));
    }

    public String toString() {
        return Double.toString(get());
    }

    public final boolean weakCompareAndSet(double d8, double d9) {
        return this.value.weakCompareAndSet(Double.doubleToRawLongBits(d8), Double.doubleToRawLongBits(d9));
    }

    public AtomicDouble() {
        this(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
    }
}
