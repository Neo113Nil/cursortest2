package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfr {
    public final Map a;

    public jfr(Map map) {
        this.a = map;
    }

    public final jho a(jit jitVar) {
        jho jhoVar;
        jfq jfqVar = (jfq) this.a.get(jitVar.c);
        return (jfqVar == null || (jhoVar = jfqVar.e) == null) ? jfq.a.e : jhoVar;
    }

    public final boolean b(jit jitVar) {
        jfq jfqVar = (jfq) this.a.get(jitVar.c);
        return jfqVar != null ? jfqVar.b : jfq.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfr) && ksp.b(this.a, ((jfr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccountCapabilitiesMap(capabilities=" + this.a + ")";
    }

    public jfr() {
        this((byte[]) null);
    }

    public /* synthetic */ jfr(byte[] bArr) {
        this(kpl.a);
    }
}
