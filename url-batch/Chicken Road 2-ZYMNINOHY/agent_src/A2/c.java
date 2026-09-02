package A2;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f66a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f67b;

    public c(String str, Map map) {
        this.f66a = str;
        this.f67b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f66a.equals(cVar.f66a) && this.f67b.equals(cVar.f67b);
    }

    public final int hashCode() {
        return this.f67b.hashCode() + (this.f66a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f66a + ", properties=" + this.f67b.values() + "}";
    }
}
