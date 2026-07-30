package androidx.core.util;

import androidx.annotation.NonNull;
import cn.hutool.core.text.l;

/* loaded from: classes.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f8, S s7) {
        this.first = f8;
        this.second = s7;
    }

    @NonNull
    public static <A, B> Pair<A, B> create(A a8, B b8) {
        return new Pair<>(a8, b8);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ObjectsCompat.equals(pair.first, this.first) && ObjectsCompat.equals(pair.second, this.second);
    }

    public int hashCode() {
        F f8 = this.first;
        int hashCode = f8 == null ? 0 : f8.hashCode();
        S s7 = this.second;
        return hashCode ^ (s7 != null ? s7.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.first + l.SPACE + this.second + "}";
    }
}
