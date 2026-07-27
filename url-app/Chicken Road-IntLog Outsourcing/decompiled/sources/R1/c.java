package R1;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2617a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2618b;

    public c(String str, Map map) {
        this.f2617a = str;
        this.f2618b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2617a.equals(cVar.f2617a) && this.f2618b.equals(cVar.f2618b);
    }

    public final int hashCode() {
        return this.f2618b.hashCode() + (this.f2617a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f2617a + ", properties=" + this.f2618b.values() + "}";
    }
}
