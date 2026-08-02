package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkq {
    public final Object a;
    public final iwq b;

    public dkq(iwq iwqVar, Object obj) {
        boolean z = false;
        if (iwqVar.a() >= 200000000 && iwqVar.a() < 300000000) {
            z = true;
        }
        hoq.x(z);
        this.b = iwqVar;
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dkq) {
            dkq dkqVar = (dkq) obj;
            if (this.b.equals(dkqVar.b) && this.a.equals(dkqVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
