package t1;

import java.util.Collections;
import java.util.Map;

/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0656c {

    /* renamed from: a, reason: collision with root package name */
    public final String f5958a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f5959b;

    public C0656c(String str, Map map) {
        this.f5958a = str;
        this.f5959b = map;
    }

    public static C0656c a(String str) {
        return new C0656c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0656c)) {
            return false;
        }
        C0656c c0656c = (C0656c) obj;
        return this.f5958a.equals(c0656c.f5958a) && this.f5959b.equals(c0656c.f5959b);
    }

    public final int hashCode() {
        return this.f5959b.hashCode() + (this.f5958a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f5958a + ", properties=" + this.f5959b.values() + "}";
    }
}
