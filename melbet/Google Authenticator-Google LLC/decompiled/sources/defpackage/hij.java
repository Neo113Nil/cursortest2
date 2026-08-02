package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hij extends hin implements Serializable {
    private static final long serialVersionUID = 0;
    final hin a;

    public hij(hin hinVar) {
        this.a = hinVar;
    }

    @Override // defpackage.hin
    public final hin a() {
        return this.a.a();
    }

    @Override // defpackage.hin
    public final hin c() {
        return this.a.c().a();
    }

    @Override // defpackage.hin, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hij) {
            return this.a.equals(((hij) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-921210296);
    }

    public final String toString() {
        return this.a.toString().concat(".nullsLast()");
    }

    @Override // defpackage.hin
    public final hin b() {
        return this;
    }
}
