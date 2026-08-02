package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gzg implements Serializable, gzf {
    private static final long serialVersionUID = 0;
    public final Object a;

    public gzg(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        return this.a;
    }

    @Override // defpackage.gzf
    public final boolean equals(Object obj) {
        if (obj instanceof gzg) {
            return Objects.equals(this.a, ((gzg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Functions.constant(" + String.valueOf(this.a) + ")";
    }
}
