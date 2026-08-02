package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ggc {
    public final jjq a;
    public final gga b;
    public final boolean c;

    public ggc(jjq jjqVar, gga ggaVar, boolean z) {
        this.a = jjqVar;
        this.b = ggaVar;
        this.c = z;
    }

    public static ggb a() {
        ggb ggbVar = new ggb();
        ggbVar.c(jjq.d);
        return ggbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ggc) {
            ggc ggcVar = (ggc) obj;
            if (this.a.equals(ggcVar.a) && this.b.equals(ggcVar.b) && this.c == ggcVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((true != this.c ? 1237 : 1231) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        gga ggaVar = this.b;
        return "DebugData{data=" + String.valueOf(this.a) + ", type=" + String.valueOf(ggaVar) + ", containsPii=" + this.c + ", proto=null}";
    }

    public ggc() {
        throw null;
    }
}
