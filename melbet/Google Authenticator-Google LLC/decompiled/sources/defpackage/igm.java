package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igm {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public igm(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static igl a() {
        igl iglVar = new igl();
        iglVar.b(false);
        iglVar.c(false);
        iglVar.d(false);
        return iglVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof igm) {
            igm igmVar = (igm) obj;
            if (this.a == igmVar.a && this.b == igmVar.b && this.c == igmVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "EncoderOptions{enableCelLogsiteMetadata=" + this.a + ", enableSafeFormatArgs=" + this.b + ", includeSuppressedExceptions=" + this.c + "}";
    }

    public igm() {
        throw null;
    }
}
