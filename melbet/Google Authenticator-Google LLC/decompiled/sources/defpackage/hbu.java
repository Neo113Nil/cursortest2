package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hbu extends hin implements Serializable {
    private static final long serialVersionUID = 0;
    final gzf a;
    final hin b;

    public hbu(gzf gzfVar, hin hinVar) {
        this.a = gzfVar;
        this.b = hinVar;
    }

    @Override // defpackage.hin, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        gzf gzfVar = this.a;
        return this.b.compare(gzfVar.a(obj), gzfVar.a(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hbu) {
            hbu hbuVar = (hbu) obj;
            if (this.a.equals(hbuVar.a) && this.b.equals(hbuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        gzf gzfVar = this.a;
        return this.b.toString() + ".onResultOf(" + gzfVar.toString() + ")";
    }
}
