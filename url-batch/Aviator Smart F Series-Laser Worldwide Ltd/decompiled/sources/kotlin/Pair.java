package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    public Pair(A a8, B b8) {
        this.first = a8;
        this.second = b8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair copy$default(Pair pair, Object obj, Object obj2, int i8, Object obj3) {
        if ((i8 & 1) != 0) {
            obj = pair.first;
        }
        if ((i8 & 2) != 0) {
            obj2 = pair.second;
        }
        return pair.copy(obj, obj2);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final Pair<A, B> copy(A a8, B b8) {
        return new Pair<>(a8, b8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return s.areEqual(this.first, pair.first) && s.areEqual(this.second, pair.second);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public int hashCode() {
        A a8 = this.first;
        int hashCode = (a8 == null ? 0 : a8.hashCode()) * 31;
        B b8 = this.second;
        return hashCode + (b8 != null ? b8.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
