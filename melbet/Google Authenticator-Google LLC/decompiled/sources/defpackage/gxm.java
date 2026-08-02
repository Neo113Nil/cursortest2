package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gxm {
    public final lhg a;
    public final boolean b;
    private final eik c;

    public gxm(lhg lhgVar, eik eikVar, boolean z) {
        this.a = lhgVar;
        this.c = eikVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gxm) {
            gxm gxmVar = (gxm) obj;
            if (this.a.equals(gxmVar.a) && this.c.equals(gxmVar.c) && this.b == gxmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        eik eikVar = this.c;
        return "ConvertedTraceRecordWithMetadata{traceRecord=" + String.valueOf(this.a) + ", eventName=" + String.valueOf(eikVar) + ", isEmpty=" + this.b + "}";
    }

    public gxm() {
        throw null;
    }
}
