package v2;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: v2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1470q extends Z implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final u2.d f15666a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f15667b;

    public C1470q(u2.d dVar, Z z) {
        this.f15666a = dVar;
        this.f15667b = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        u2.d dVar = this.f15666a;
        return this.f15667b.compare(dVar.apply(obj), dVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1470q) {
            C1470q c1470q = (C1470q) obj;
            if (this.f15666a.equals(c1470q.f15666a) && this.f15667b.equals(c1470q.f15667b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15666a, this.f15667b});
    }

    public final String toString() {
        return this.f15667b + ".onResultOf(" + this.f15666a + ")";
    }
}
