package c3;

import java.io.Serializable;

/* renamed from: c3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5724a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5725b;

    public C0292d(Object obj, Object obj2) {
        this.f5724a = obj;
        this.f5725b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0292d)) {
            return false;
        }
        C0292d c0292d = (C0292d) obj;
        return kotlin.jvm.internal.i.a(this.f5724a, c0292d.f5724a) && kotlin.jvm.internal.i.a(this.f5725b, c0292d.f5725b);
    }

    public final int hashCode() {
        Object obj = this.f5724a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f5725b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f5724a + ", " + this.f5725b + ')';
    }
}
