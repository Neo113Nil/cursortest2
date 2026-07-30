package y4;

import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final String f8577a;

    /* renamed from: b, reason: collision with root package name */
    public final M f8578b;

    public O(String str, M type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f8577a = str;
        this.f8578b = type;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(O.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        O o7 = (O) obj;
        return AbstractC1053a.n(this.f8577a, o7.f8577a) && AbstractC1053a.n(this.f8578b, o7.f8578b);
    }

    public final int hashCode() {
        return AbstractC1053a.o(this.f8578b) + ((AbstractC1053a.o(this.f8577a) + (O.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f8577a + ", type=" + this.f8578b + ")";
    }
}
