package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwc {
    public final jfm a;
    public final int b;

    public dwc(jfm jfmVar, int i) {
        this.a = jfmVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwc)) {
            return false;
        }
        dwc dwcVar = (dwc) obj;
        return ksp.b(this.a, dwcVar.a) && this.b == dwcVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "PrioritizedDiscDecorations(discDecorations=" + this.a + ", badgePriority=" + ((Object) dja.o(this.b)) + ")";
    }
}
