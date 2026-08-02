package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wp {
    public final Object a;
    public final Object b;

    public wp(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wp)) {
            return false;
        }
        wp wpVar = (wp) obj;
        return Objects.equals(wpVar.a, this.a) && Objects.equals(wpVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
