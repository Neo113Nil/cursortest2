package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hyu {
    private final Class a;
    private final Class b;

    public hyu(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hyu)) {
            return false;
        }
        hyu hyuVar = (hyu) obj;
        return hyuVar.a.equals(this.a) && hyuVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Class cls = this.b;
        return this.a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
