package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cer {
    public final ces a;
    public final String b;
    public final ccm c;
    public final ccp d;
    public final ccl e;

    public cer(ces cesVar, ccm ccmVar, ccp ccpVar, ccl cclVar) {
        this.a = cesVar;
        this.b = "FIREBASE_ML_SDK";
        this.c = ccmVar;
        this.d = ccpVar;
        this.e = cclVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cer) {
            cer cerVar = (cer) obj;
            if (this.a.equals(cerVar.a) && this.b.equals(cerVar.b) && this.c.equals(cerVar.c) && this.d.equals(cerVar.d) && this.e.equals(cerVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        return this.e.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        ccl cclVar = this.e;
        ccp ccpVar = this.d;
        ccm ccmVar = this.c;
        return "SendRequest{transportContext=" + String.valueOf(this.a) + ", transportName=" + this.b + ", event=" + String.valueOf(ccmVar) + ", transformer=" + String.valueOf(ccpVar) + ", encoding=" + String.valueOf(cclVar) + "}";
    }

    public cer() {
        throw null;
    }
}
