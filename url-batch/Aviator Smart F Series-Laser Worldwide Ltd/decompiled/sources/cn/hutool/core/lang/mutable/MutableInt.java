package cn.hutool.core.lang.mutable;

import cn.hutool.core.util.d0;
import p.a;

/* loaded from: classes.dex */
public class MutableInt extends Number implements Comparable<MutableInt>, a {
    private static final long serialVersionUID = 1;
    private int value;

    public MutableInt() {
    }

    public MutableInt add(int i8) {
        this.value += i8;
        return this;
    }

    public MutableInt decrement() {
        this.value--;
        return this;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableInt) && this.value == ((MutableInt) obj).intValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public MutableInt increment() {
        this.value++;
        return this;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    public void set(int i8) {
        this.value = i8;
    }

    public MutableInt subtract(int i8) {
        this.value -= i8;
        return this;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public MutableInt(int i8) {
        this.value = i8;
    }

    public MutableInt add(Number number) {
        this.value += number.intValue();
        return this;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableInt mutableInt) {
        return d0.compare(this.value, mutableInt.value);
    }

    @Override // p.a
    public Integer get() {
        return Integer.valueOf(this.value);
    }

    public MutableInt subtract(Number number) {
        this.value -= number.intValue();
        return this;
    }

    public MutableInt(Number number) {
        this(number.intValue());
    }

    @Override // p.a
    public void set(Number number) {
        this.value = number.intValue();
    }

    public MutableInt(String str) {
        this.value = Integer.parseInt(str);
    }
}
