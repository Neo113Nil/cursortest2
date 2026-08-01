package p8;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f7689a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f7690b;

    public c(String str, Map map) {
        this.f7689a = str;
        this.f7690b = map;
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
        return this.f7689a.equals(cVar.f7689a) && this.f7690b.equals(cVar.f7690b);
    }

    public final int hashCode() {
        return this.f7690b.hashCode() + (this.f7689a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f7689a + ", properties=" + this.f7690b.values() + "}";
    }
}
