package X1;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2855a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2856b;

    public c(String str, Map map) {
        this.f2855a = str;
        this.f2856b = map;
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
        return this.f2855a.equals(cVar.f2855a) && this.f2856b.equals(cVar.f2856b);
    }

    public final int hashCode() {
        return this.f2856b.hashCode() + (this.f2855a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f2855a + ", properties=" + this.f2856b.values() + "}";
    }
}
