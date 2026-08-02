package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzs {
    public final List a;
    public final int b;

    public bzs(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzs)) {
            return false;
        }
        bzs bzsVar = (bzs) obj;
        return ksp.b(this.a, bzsVar.a) && this.b == bzsVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CxfParsingResult(parsedOtps=" + this.a + ", failedOtpCount=" + this.b + ")";
    }
}
