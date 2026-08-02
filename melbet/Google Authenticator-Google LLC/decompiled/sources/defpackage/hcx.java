package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hcx extends hin implements Serializable {
    private static final long serialVersionUID = 0;
    final her a;

    public hcx(her herVar) {
        this.a = herVar;
    }

    private final int e(Object obj) {
        Integer num = (Integer) this.a.get(obj);
        if (num != null) {
            return num.intValue();
        }
        throw new him(obj);
    }

    @Override // defpackage.hin, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return e(obj) - e(obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj instanceof hcx) {
            return hnu.B(this.a, ((hcx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ordering.explicit(" + this.a.keySet().toString() + ")";
    }
}
