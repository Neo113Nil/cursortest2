package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dum {
    public final dtd a;
    public final ikm b;
    public final dja c;

    public dum(dja djaVar, dtd dtdVar, ikm ikmVar) {
        ikmVar.getClass();
        this.c = djaVar;
        this.a = dtdVar;
        this.b = ikmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dum)) {
            return false;
        }
        dum dumVar = (dum) obj;
        return ksp.b(this.c, dumVar.c) && ksp.b(this.a, dumVar.a) && ksp.b(this.b, dumVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PersistentObjects(topRightDiscContext=" + this.c + ", accountCapabilitiesRetriever=" + this.a + ", internalEventBus=" + this.b + ")";
    }
}
