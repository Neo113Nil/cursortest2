package W1;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final Object f9619b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f9620c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f9621d;

    public q(Object obj, Object obj2, Object obj3) {
        this.f9619b = obj;
        this.f9620c = obj2;
        this.f9621d = obj3;
    }

    public final Object c() {
        return this.f9619b;
    }

    public final Object d() {
        return this.f9620c;
    }

    public final Object e() {
        return this.f9621d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f9619b, qVar.f9619b) && Intrinsics.areEqual(this.f9620c, qVar.f9620c) && Intrinsics.areEqual(this.f9621d, qVar.f9621d);
    }

    public final Object f() {
        return this.f9619b;
    }

    public final Object g() {
        return this.f9620c;
    }

    public final Object h() {
        return this.f9621d;
    }

    public int hashCode() {
        Object obj = this.f9619b;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f9620c;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f9621d;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f9619b + ", " + this.f9620c + ", " + this.f9621d + ')';
    }
}
