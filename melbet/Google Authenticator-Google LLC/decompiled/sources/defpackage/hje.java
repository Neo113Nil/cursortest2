package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hje extends hin implements Serializable {
    private static final long serialVersionUID = 0;
    final hin a;

    public hje(hin hinVar) {
        this.a = hinVar;
    }

    @Override // defpackage.hin
    public final hin c() {
        return this.a;
    }

    @Override // defpackage.hin, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hje) {
            return this.a.equals(((hje) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
