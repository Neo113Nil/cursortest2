package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eiv {
    public final hvm a;
    public final int b;
    public final int c;
    public final boolean d;

    public eiv(hvm hvmVar, int i, int i2, boolean z) {
        this.a = hvmVar;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public static epj a() {
        epj epjVar = new epj(null);
        epjVar.a = 11;
        byte b = epjVar.c;
        epjVar.d = 2;
        epjVar.c = (byte) (b | 3);
        epjVar.c(true);
        return epjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiv) {
            eiv eivVar = (eiv) obj;
            hvm hvmVar = this.a;
            if (hvmVar != null ? hvmVar.equals(eivVar.a) : eivVar.a == null) {
                if (this.b == eivVar.b && this.c == eivVar.c && this.d == eivVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        hvm hvmVar = this.a;
        int hashCode = hvmVar == null ? 0 : hvmVar.hashCode();
        int i = this.b;
        return (true != this.d ? 1237 : 1231) ^ ((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "PrimesThreadsConfigurations{primesExecutorService=" + String.valueOf(this.a) + ", primesMetricExecutorPriority=" + this.b + ", primesMetricExecutorPoolSize=" + this.c + ", enableDeferredTasks=" + this.d + "}";
    }

    public eiv() {
        throw null;
    }
}
