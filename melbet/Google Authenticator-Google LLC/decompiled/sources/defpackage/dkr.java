package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkr {
    public final Object a;
    public final iwq b;

    public dkr(iwq iwqVar, Object obj) {
        boolean z = false;
        if (iwqVar.a() >= 100000000 && iwqVar.a() < 200000000) {
            z = true;
        }
        hoq.x(z);
        this.b = iwqVar;
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dkr) {
            dkr dkrVar = (dkr) obj;
            if (this.b.equals(dkrVar.b) && this.a.equals(dkrVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
