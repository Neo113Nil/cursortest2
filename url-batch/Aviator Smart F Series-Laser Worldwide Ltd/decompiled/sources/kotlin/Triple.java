package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A a8, B b8, C c8) {
        this.first = a8;
        this.second = b8;
        this.third = c8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Triple copy$default(Triple triple, Object obj, Object obj2, Object obj3, int i8, Object obj4) {
        if ((i8 & 1) != 0) {
            obj = triple.first;
        }
        if ((i8 & 2) != 0) {
            obj2 = triple.second;
        }
        if ((i8 & 4) != 0) {
            obj3 = triple.third;
        }
        return triple.copy(obj, obj2, obj3);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    public final Triple<A, B, C> copy(A a8, B b8, C c8) {
        return new Triple<>(a8, b8, c8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return s.areEqual(this.first, triple.first) && s.areEqual(this.second, triple.second) && s.areEqual(this.third, triple.third);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public int hashCode() {
        A a8 = this.first;
        int hashCode = (a8 == null ? 0 : a8.hashCode()) * 31;
        B b8 = this.second;
        int hashCode2 = (hashCode + (b8 == null ? 0 : b8.hashCode())) * 31;
        C c8 = this.third;
        return hashCode2 + (c8 != null ? c8.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
