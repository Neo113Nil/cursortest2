package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cem {
    public final ccl a;
    public final byte[] b;

    public cem(ccl cclVar, byte[] bArr) {
        if (cclVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = cclVar;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cem)) {
            return false;
        }
        cem cemVar = (cem) obj;
        if (this.a.equals(cemVar.a)) {
            return Arrays.equals(this.b, cemVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return Arrays.hashCode(this.b) ^ (hashCode * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a.toString() + ", bytes=[...]}";
    }
}
