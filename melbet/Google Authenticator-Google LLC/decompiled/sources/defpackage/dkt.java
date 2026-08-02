package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkt {
    public final Object a;
    public final iwq b;

    public dkt(iwq iwqVar, Object obj) {
        this.b = iwqVar;
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dkt) {
            dkt dktVar = (dkt) obj;
            if (this.b.equals(dktVar.b) && this.a.equals(dktVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
