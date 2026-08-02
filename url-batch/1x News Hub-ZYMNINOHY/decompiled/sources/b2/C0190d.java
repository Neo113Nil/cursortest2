package b2;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* renamed from: b2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2547a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2548b;

    public C0190d(Object obj, Object obj2) {
        this.f2547a = obj;
        this.f2548b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0190d)) {
            return false;
        }
        C0190d c0190d = (C0190d) obj;
        return j.a(this.f2547a, c0190d.f2547a) && j.a(this.f2548b, c0190d.f2548b);
    }

    public final int hashCode() {
        Object obj = this.f2547a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2548b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2547a + ", " + this.f2548b + ')';
    }
}
