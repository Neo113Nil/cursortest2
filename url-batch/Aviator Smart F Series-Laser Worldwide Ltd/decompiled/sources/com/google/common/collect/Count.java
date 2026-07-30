package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class Count implements Serializable {
    private int value;

    Count(int i8) {
        this.value = i8;
    }

    public void add(int i8) {
        this.value += i8;
    }

    public int addAndGet(int i8) {
        int i9 = this.value + i8;
        this.value = i9;
        return i9;
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof Count) && ((Count) obj).value == this.value;
    }

    public int get() {
        return this.value;
    }

    public int getAndSet(int i8) {
        int i9 = this.value;
        this.value = i8;
        return i9;
    }

    public int hashCode() {
        return this.value;
    }

    public void set(int i8) {
        this.value = i8;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
