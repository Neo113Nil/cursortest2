package a8;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p implements m, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f366d;

    public p(Object obj) {
        this.f366d = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return g8.b.x(this.f366d, ((p) obj).f366d);
        }
        return false;
    }

    @Override // a8.m
    public final Object get() {
        return this.f366d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f366d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f366d);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
        sb2.append("Suppliers.ofInstance(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
