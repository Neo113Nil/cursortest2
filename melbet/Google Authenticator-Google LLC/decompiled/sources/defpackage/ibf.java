package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibf {
    public final String a;
    private final Map b;

    public ibf(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static ibf a(String str) {
        return new ibf(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibf)) {
            return false;
        }
        ibf ibfVar = (ibf) obj;
        return this.a.equals(ibfVar.a) && this.b.equals(ibfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + String.valueOf(this.b.values()) + "}";
    }
}
