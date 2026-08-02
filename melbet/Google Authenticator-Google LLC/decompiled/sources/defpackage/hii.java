package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hii extends hin implements Serializable {
    private static final long serialVersionUID = 0;
    final hin a;

    public hii(hin hinVar) {
        this.a = hinVar;
    }

    @Override // defpackage.hin
    public final hin b() {
        return this.a.b();
    }

    @Override // defpackage.hin
    public final hin c() {
        return this.a.c().b();
    }

    @Override // defpackage.hin, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hii) {
            return this.a.equals(((hii) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 957692532;
    }

    public final String toString() {
        return this.a.toString().concat(".nullsFirst()");
    }

    @Override // defpackage.hin
    public final hin a() {
        return this;
    }
}
