package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class haf implements Serializable, hac {
    private static final long serialVersionUID = 0;
    public final Object a;

    public haf(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.hac
    public final Object bB() {
        return this.a;
    }

    @Override // defpackage.hac
    public final boolean equals(Object obj) {
        if (obj instanceof haf) {
            return Objects.equals(this.a, ((haf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a.toString() + ")";
    }
}
