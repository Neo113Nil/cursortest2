package e1;

import java.util.Collections;
import java.util.Map;

/* renamed from: e1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4967a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4968b;

    public C0312c(String str, Map map) {
        this.f4967a = str;
        this.f4968b = map;
    }

    public static C0312c a(String str) {
        return new C0312c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0312c)) {
            return false;
        }
        C0312c c0312c = (C0312c) obj;
        return this.f4967a.equals(c0312c.f4967a) && this.f4968b.equals(c0312c.f4968b);
    }

    public final int hashCode() {
        return this.f4968b.hashCode() + (this.f4967a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f4967a + ", properties=" + this.f4968b.values() + "}";
    }
}
